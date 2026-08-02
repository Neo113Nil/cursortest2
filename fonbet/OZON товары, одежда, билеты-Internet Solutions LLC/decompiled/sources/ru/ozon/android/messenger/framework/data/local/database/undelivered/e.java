package ru.ozon.android.messenger.framework.data.local.database.undelivered;

import J4.A;
import J4.l;
import J4.s;
import J4.w;
import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.Unit;
import ru.ozon.android.messenger.framework.data.local.database.MessengerDB_Impl;
import ru.ozon.android.messenger.framework.data.local.database.undelivered.entity.UndeliveredMessageEntity;

/* loaded from: classes6.dex */
public final class e implements ru.ozon.android.messenger.framework.data.local.database.undelivered.a {

    /* renamed from: a, reason: collision with root package name */
    private final MessengerDB_Impl f87557a;

    /* renamed from: b, reason: collision with root package name */
    private final l<UndeliveredMessageEntity> f87558b;

    /* renamed from: c, reason: collision with root package name */
    private final ru.ozon.android.messenger.framework.data.local.database.undelivered.converter.a f87559c = new ru.ozon.android.messenger.framework.data.local.database.undelivered.converter.a();

    /* renamed from: d, reason: collision with root package name */
    private final A f87560d;

    /* renamed from: e, reason: collision with root package name */
    private final A f87561e;

    /* loaded from: classes10.dex */
    final class a implements Callable<Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ UndeliveredMessageEntity f87562a;

        a(UndeliveredMessageEntity undeliveredMessageEntity) {
            this.f87562a = undeliveredMessageEntity;
        }

        @Override // java.util.concurrent.Callable
        @NonNull
        public final Unit call() throws Exception {
            e eVar = e.this;
            eVar.f87557a.beginTransaction();
            try {
                eVar.f87558b.insert((l) this.f87562a);
                eVar.f87557a.setTransactionSuccessful();
                return Unit.f71690a;
            } finally {
                eVar.f87557a.endTransaction();
            }
        }
    }

    /* loaded from: classes10.dex */
    final class b implements Callable<Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f87564a;

        b(String str) {
            this.f87564a = str;
        }

        @Override // java.util.concurrent.Callable
        @NonNull
        public final Unit call() throws Exception {
            e eVar = e.this;
            O4.f acquire = eVar.f87560d.acquire();
            acquire.e0(1, this.f87564a);
            try {
                eVar.f87557a.beginTransaction();
                try {
                    acquire.C();
                    eVar.f87557a.setTransactionSuccessful();
                    return Unit.f71690a;
                } finally {
                    eVar.f87557a.endTransaction();
                }
            } finally {
                eVar.f87560d.release(acquire);
            }
        }
    }

    /* loaded from: classes10.dex */
    final class c implements Callable<Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f87566a;

        c(String str) {
            this.f87566a = str;
        }

        @Override // java.util.concurrent.Callable
        @NonNull
        public final Unit call() throws Exception {
            e eVar = e.this;
            O4.f acquire = eVar.f87561e.acquire();
            acquire.e0(1, this.f87566a);
            try {
                eVar.f87557a.beginTransaction();
                try {
                    acquire.C();
                    eVar.f87557a.setTransactionSuccessful();
                    return Unit.f71690a;
                } finally {
                    eVar.f87557a.endTransaction();
                }
            } finally {
                eVar.f87561e.release(acquire);
            }
        }
    }

    /* loaded from: classes10.dex */
    final class d implements Callable<Map<String, UndeliveredMessageEntity>> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ w f87568a;

        d(w wVar) {
            this.f87568a = wVar;
        }

        @Override // java.util.concurrent.Callable
        @NonNull
        public final Map<String, UndeliveredMessageEntity> call() throws Exception {
            e eVar = e.this;
            s sVar = eVar.f87557a;
            w wVar = this.f87568a;
            Cursor b11 = L4.b.b(sVar, wVar, false);
            try {
                int b12 = L4.a.b(b11, "chat_id");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                while (b11.moveToNext()) {
                    String string = b11.getString(b12);
                    if (b11.isNull(0) && b11.isNull(1) && b11.isNull(2) && b11.isNull(3)) {
                        linkedHashMap.put(string, null);
                    } else {
                        String string2 = b11.getString(0);
                        String string3 = b11.getString(1);
                        long j11 = b11.getLong(2);
                        UndeliveredMessageEntity.UndeliveredMessage a11 = eVar.f87559c.a(b11.getString(3));
                        if (a11 == null) {
                            throw new IllegalStateException("Expected NON-NULL 'ru.ozon.android.messenger.framework.data.local.database.undelivered.entity.UndeliveredMessageEntity.UndeliveredMessage', but it was NULL.");
                        }
                        UndeliveredMessageEntity undeliveredMessageEntity = new UndeliveredMessageEntity(string2, string3, j11, a11);
                        if (!linkedHashMap.containsKey(string)) {
                            linkedHashMap.put(string, undeliveredMessageEntity);
                        }
                    }
                }
                b11.close();
                wVar.release();
                return linkedHashMap;
            } catch (Throwable th2) {
                b11.close();
                wVar.release();
                throw th2;
            }
        }
    }

    /* renamed from: ru.ozon.android.messenger.framework.data.local.database.undelivered.e$e, reason: collision with other inner class name */
    /* loaded from: classes10.dex */
    final class CallableC1575e implements Callable<List<UndeliveredMessageEntity>> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ w f87570a;

        CallableC1575e(w wVar) {
            this.f87570a = wVar;
        }

        @Override // java.util.concurrent.Callable
        @NonNull
        public final List<UndeliveredMessageEntity> call() throws Exception {
            e eVar = e.this;
            s sVar = eVar.f87557a;
            w wVar = this.f87570a;
            Cursor b11 = L4.b.b(sVar, wVar, false);
            try {
                int b12 = L4.a.b(b11, "local_id");
                int b13 = L4.a.b(b11, "chat_id");
                int b14 = L4.a.b(b11, "updated_at");
                int b15 = L4.a.b(b11, "undelivered_message");
                ArrayList arrayList = new ArrayList(b11.getCount());
                while (b11.moveToNext()) {
                    String string = b11.getString(b12);
                    String string2 = b11.getString(b13);
                    long j11 = b11.getLong(b14);
                    UndeliveredMessageEntity.UndeliveredMessage a11 = eVar.f87559c.a(b11.getString(b15));
                    if (a11 == null) {
                        throw new IllegalStateException("Expected NON-NULL 'ru.ozon.android.messenger.framework.data.local.database.undelivered.entity.UndeliveredMessageEntity.UndeliveredMessage', but it was NULL.");
                    }
                    arrayList.add(new UndeliveredMessageEntity(string, string2, j11, a11));
                }
                b11.close();
                wVar.release();
                return arrayList;
            } catch (Throwable th2) {
                b11.close();
                wVar.release();
                throw th2;
            }
        }
    }

    /* loaded from: classes10.dex */
    final class f implements Callable<UndeliveredMessageEntity> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ w f87572a;

        f(w wVar) {
            this.f87572a = wVar;
        }

        @Override // java.util.concurrent.Callable
        public final UndeliveredMessageEntity call() throws Exception {
            UndeliveredMessageEntity undeliveredMessageEntity;
            e eVar = e.this;
            s sVar = eVar.f87557a;
            w wVar = this.f87572a;
            Cursor b11 = L4.b.b(sVar, wVar, false);
            try {
                int b12 = L4.a.b(b11, "local_id");
                int b13 = L4.a.b(b11, "chat_id");
                int b14 = L4.a.b(b11, "updated_at");
                int b15 = L4.a.b(b11, "undelivered_message");
                if (b11.moveToFirst()) {
                    String string = b11.getString(b12);
                    String string2 = b11.getString(b13);
                    long j11 = b11.getLong(b14);
                    UndeliveredMessageEntity.UndeliveredMessage a11 = eVar.f87559c.a(b11.getString(b15));
                    if (a11 == null) {
                        throw new IllegalStateException("Expected NON-NULL 'ru.ozon.android.messenger.framework.data.local.database.undelivered.entity.UndeliveredMessageEntity.UndeliveredMessage', but it was NULL.");
                    }
                    undeliveredMessageEntity = new UndeliveredMessageEntity(string, string2, j11, a11);
                } else {
                    undeliveredMessageEntity = null;
                }
                b11.close();
                wVar.release();
                return undeliveredMessageEntity;
            } catch (Throwable th2) {
                b11.close();
                wVar.release();
                throw th2;
            }
        }
    }

    public e(@NonNull MessengerDB_Impl messengerDB_Impl) {
        this.f87557a = messengerDB_Impl;
        this.f87558b = new ru.ozon.android.messenger.framework.data.local.database.undelivered.b(this, messengerDB_Impl);
        this.f87560d = new ru.ozon.android.messenger.framework.data.local.database.undelivered.c(messengerDB_Impl);
        this.f87561e = new ru.ozon.android.messenger.framework.data.local.database.undelivered.d(messengerDB_Impl);
    }

    @Override // ru.ozon.android.messenger.framework.data.local.database.undelivered.a
    public final Object a(String str, kotlin.coroutines.d<? super Unit> dVar) {
        return J4.f.c(this.f87557a, new c(str), dVar);
    }

    @Override // ru.ozon.android.messenger.framework.data.local.database.undelivered.a
    public final Object b(String str, kotlin.coroutines.d<? super UndeliveredMessageEntity> dVar) {
        w j11 = w.j(1, "SELECT * FROM undelivered_messages WHERE local_id = ?");
        j11.e0(1, str);
        return J4.f.b(this.f87557a, new CancellationSignal(), new f(j11), dVar);
    }

    @Override // ru.ozon.android.messenger.framework.data.local.database.undelivered.a
    public final Object c(String str, kotlin.coroutines.d<? super List<UndeliveredMessageEntity>> dVar) {
        w j11 = w.j(1, "SELECT * FROM undelivered_messages WHERE chat_id = ?");
        j11.e0(1, str);
        return J4.f.b(this.f87557a, new CancellationSignal(), new CallableC1575e(j11), dVar);
    }

    @Override // ru.ozon.android.messenger.framework.data.local.database.undelivered.a
    public final Object d(kotlin.coroutines.d<? super Map<String, UndeliveredMessageEntity>> dVar) {
        w j11 = w.j(0, "SELECT local_id, chat_id, updated_at, undelivered_message FROM (SELECT *, MAX(undelivered_messages.updated_at) as createdAt FROM undelivered_messages GROUP BY chat_id)");
        return J4.f.b(this.f87557a, new CancellationSignal(), new d(j11), dVar);
    }

    @Override // ru.ozon.android.messenger.framework.data.local.database.undelivered.a
    public final Object e(UndeliveredMessageEntity undeliveredMessageEntity, kotlin.coroutines.d<? super Unit> dVar) {
        return J4.f.c(this.f87557a, new a(undeliveredMessageEntity), dVar);
    }

    @Override // ru.ozon.android.messenger.framework.data.local.database.undelivered.a
    public final Object f(String str, kotlin.coroutines.d<? super Unit> dVar) {
        return J4.f.c(this.f87557a, new b(str), dVar);
    }
}
