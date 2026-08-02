package ru.ozon.android.messenger.framework.data.local.database.draft;

import Ae.InterfaceC2395h;
import Ij.C3261b;
import J4.A;
import J4.u;
import J4.w;
import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.annotation.NonNull;
import androidx.collection.C5132a;
import ja.C7330j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ru.ozon.android.messenger.blocks.input.CustomBlockDTO;
import ru.ozon.android.messenger.framework.data.local.database.MessengerDB_Impl;
import ru.ozon.android.messenger.framework.data.local.database.draft.b;

/* loaded from: classes6.dex */
public final class i implements ru.ozon.android.messenger.framework.data.local.database.draft.b {

    /* renamed from: a, reason: collision with root package name */
    private final MessengerDB_Impl f87520a;

    /* renamed from: b, reason: collision with root package name */
    private final J4.l<ru.ozon.android.messenger.framework.data.local.database.draft.entity.c> f87521b;

    /* renamed from: c, reason: collision with root package name */
    private final J4.l<ru.ozon.android.messenger.framework.data.local.database.draft.entity.d> f87522c;

    /* renamed from: d, reason: collision with root package name */
    private final J4.l<ru.ozon.android.messenger.framework.data.local.database.draft.entity.a> f87523d;

    /* renamed from: f, reason: collision with root package name */
    private final J4.l<ru.ozon.android.messenger.framework.data.local.database.draft.entity.b> f87525f;

    /* renamed from: h, reason: collision with root package name */
    private final A f87527h;

    /* renamed from: i, reason: collision with root package name */
    private final A f87528i;

    /* renamed from: j, reason: collision with root package name */
    private final A f87529j;

    /* renamed from: e, reason: collision with root package name */
    private final ru.ozon.android.messenger.framework.data.local.database.draft.converter.a f87524e = new ru.ozon.android.messenger.framework.data.local.database.draft.converter.a();

    /* renamed from: g, reason: collision with root package name */
    private final ru.ozon.android.messenger.framework.data.local.database.draft.converter.b f87526g = new ru.ozon.android.messenger.framework.data.local.database.draft.converter.b();

    /* loaded from: classes10.dex */
    final class a implements Callable<Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ru.ozon.android.messenger.framework.data.local.database.draft.entity.d f87530a;

        a(ru.ozon.android.messenger.framework.data.local.database.draft.entity.d dVar) {
            this.f87530a = dVar;
        }

        @Override // java.util.concurrent.Callable
        @NonNull
        public final Unit call() throws Exception {
            i iVar = i.this;
            iVar.f87520a.beginTransaction();
            try {
                iVar.f87522c.insert((J4.l) this.f87530a);
                iVar.f87520a.setTransactionSuccessful();
                return Unit.f71690a;
            } finally {
                iVar.f87520a.endTransaction();
            }
        }
    }

    /* loaded from: classes10.dex */
    final class b implements Callable<Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f87532a;

        b(List list) {
            this.f87532a = list;
        }

        @Override // java.util.concurrent.Callable
        @NonNull
        public final Unit call() throws Exception {
            i iVar = i.this;
            iVar.f87520a.beginTransaction();
            try {
                iVar.f87523d.insert((Iterable) this.f87532a);
                iVar.f87520a.setTransactionSuccessful();
                return Unit.f71690a;
            } finally {
                iVar.f87520a.endTransaction();
            }
        }
    }

    /* loaded from: classes10.dex */
    final class c implements Callable<Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f87534a;

        c(List list) {
            this.f87534a = list;
        }

        @Override // java.util.concurrent.Callable
        @NonNull
        public final Unit call() throws Exception {
            i iVar = i.this;
            iVar.f87520a.beginTransaction();
            try {
                iVar.f87525f.insert((Iterable) this.f87534a);
                iVar.f87520a.setTransactionSuccessful();
                return Unit.f71690a;
            } finally {
                iVar.f87520a.endTransaction();
            }
        }
    }

    /* loaded from: classes10.dex */
    final class d implements Callable<Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f87536a;

        d(String str) {
            this.f87536a = str;
        }

        @Override // java.util.concurrent.Callable
        @NonNull
        public final Unit call() throws Exception {
            i iVar = i.this;
            O4.f acquire = iVar.f87527h.acquire();
            acquire.e0(1, this.f87536a);
            try {
                iVar.f87520a.beginTransaction();
                try {
                    acquire.C();
                    iVar.f87520a.setTransactionSuccessful();
                    return Unit.f71690a;
                } finally {
                    iVar.f87520a.endTransaction();
                }
            } finally {
                iVar.f87527h.release(acquire);
            }
        }
    }

    /* loaded from: classes10.dex */
    final class e implements Callable<Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f87538a;

        e(String str) {
            this.f87538a = str;
        }

        @Override // java.util.concurrent.Callable
        @NonNull
        public final Unit call() throws Exception {
            i iVar = i.this;
            O4.f acquire = iVar.f87528i.acquire();
            acquire.e0(1, this.f87538a);
            try {
                iVar.f87520a.beginTransaction();
                try {
                    acquire.C();
                    iVar.f87520a.setTransactionSuccessful();
                    return Unit.f71690a;
                } finally {
                    iVar.f87520a.endTransaction();
                }
            } finally {
                iVar.f87528i.release(acquire);
            }
        }
    }

    /* loaded from: classes10.dex */
    final class f implements Callable<Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f87540a;

        f(String str) {
            this.f87540a = str;
        }

        @Override // java.util.concurrent.Callable
        @NonNull
        public final Unit call() throws Exception {
            i iVar = i.this;
            O4.f acquire = iVar.f87529j.acquire();
            acquire.e0(1, this.f87540a);
            try {
                iVar.f87520a.beginTransaction();
                try {
                    acquire.C();
                    iVar.f87520a.setTransactionSuccessful();
                    return Unit.f71690a;
                } finally {
                    iVar.f87520a.endTransaction();
                }
            } finally {
                iVar.f87529j.release(acquire);
            }
        }
    }

    /* loaded from: classes10.dex */
    final class g implements Callable<ru.ozon.android.messenger.framework.data.local.database.draft.model.a> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ w f87542a;

        g(w wVar) {
            this.f87542a = wVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.concurrent.Callable
        public final ru.ozon.android.messenger.framework.data.local.database.draft.model.a call() throws Exception {
            i iVar = i.this;
            Cursor b11 = L4.b.b(iVar.f87520a, this.f87542a, true);
            try {
                int b12 = L4.a.b(b11, "chat_id");
                int b13 = L4.a.b(b11, "updated_at");
                C5132a c5132a = new C5132a();
                C5132a c5132a2 = new C5132a();
                C5132a c5132a3 = new C5132a();
                while (true) {
                    if (!b11.moveToNext()) {
                        break;
                    }
                    c5132a.put(b11.getString(b12), null);
                    String string = b11.getString(b12);
                    if (!c5132a2.containsKey(string)) {
                        c5132a2.put(string, new ArrayList());
                    }
                    String string2 = b11.getString(b12);
                    if (!c5132a3.containsKey(string2)) {
                        c5132a3.put(string2, new ArrayList());
                    }
                }
                b11.moveToPosition(-1);
                iVar.E(c5132a);
                iVar.C(c5132a2);
                iVar.D(c5132a3);
                ru.ozon.android.messenger.framework.data.local.database.draft.model.a aVar = b11.moveToFirst() ? new ru.ozon.android.messenger.framework.data.local.database.draft.model.a(new ru.ozon.android.messenger.framework.data.local.database.draft.entity.c(b11.getString(b12), b11.getLong(b13)), (ru.ozon.android.messenger.framework.data.local.database.draft.entity.d) c5132a.get(b11.getString(b12)), (ArrayList) c5132a2.get(b11.getString(b12)), (ArrayList) c5132a3.get(b11.getString(b12))) : null;
                b11.close();
                return aVar;
            } catch (Throwable th2) {
                b11.close();
                throw th2;
            }
        }

        protected final void finalize() {
            this.f87542a.release();
        }
    }

    /* loaded from: classes10.dex */
    final class h implements Callable<Map<String, ru.ozon.android.messenger.framework.data.local.database.draft.model.a>> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ w f87544a;

        h(w wVar) {
            this.f87544a = wVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.concurrent.Callable
        @NonNull
        public final Map<String, ru.ozon.android.messenger.framework.data.local.database.draft.model.a> call() throws Exception {
            boolean z11;
            i iVar = i.this;
            J4.s sVar = iVar.f87520a;
            w wVar = this.f87544a;
            Cursor b11 = L4.b.b(sVar, wVar, true);
            try {
                int b12 = L4.a.b(b11, "chat_id");
                int b13 = L4.a.b(b11, "chat_id");
                int b14 = L4.a.b(b11, "updated_at");
                C5132a c5132a = new C5132a();
                C5132a c5132a2 = new C5132a();
                C5132a c5132a3 = new C5132a();
                while (true) {
                    z11 = false;
                    if (!b11.moveToNext()) {
                        break;
                    }
                    c5132a.put(b11.getString(b13), null);
                    String string = b11.getString(b13);
                    if (!c5132a2.containsKey(string)) {
                        c5132a2.put(string, new ArrayList());
                    }
                    String string2 = b11.getString(b13);
                    if (!c5132a3.containsKey(string2)) {
                        c5132a3.put(string2, new ArrayList());
                    }
                }
                b11.moveToPosition(-1);
                iVar.E(c5132a);
                iVar.C(c5132a2);
                iVar.D(c5132a3);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                while (b11.moveToNext()) {
                    String string3 = b11.getString(b12);
                    if (b11.isNull(b13) && b11.isNull(b14)) {
                        linkedHashMap.put(string3, z11);
                    } else {
                        ru.ozon.android.messenger.framework.data.local.database.draft.model.a aVar = new ru.ozon.android.messenger.framework.data.local.database.draft.model.a(new ru.ozon.android.messenger.framework.data.local.database.draft.entity.c(b11.getString(b13), b11.getLong(b14)), (ru.ozon.android.messenger.framework.data.local.database.draft.entity.d) c5132a.get(b11.getString(b13)), (ArrayList) c5132a2.get(b11.getString(b13)), (ArrayList) c5132a3.get(b11.getString(b13)));
                        if (!linkedHashMap.containsKey(string3)) {
                            linkedHashMap.put(string3, aVar);
                        }
                        z11 = false;
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

    public i(@NonNull MessengerDB_Impl messengerDB_Impl) {
        this.f87520a = messengerDB_Impl;
        this.f87521b = new j(messengerDB_Impl);
        this.f87522c = new k(messengerDB_Impl);
        this.f87523d = new l(this, messengerDB_Impl);
        this.f87525f = new m(this, messengerDB_Impl);
        this.f87527h = new n(messengerDB_Impl);
        new o(messengerDB_Impl);
        this.f87528i = new p(messengerDB_Impl);
        this.f87529j = new q(messengerDB_Impl);
        new r(messengerDB_Impl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C(@NonNull C5132a<String, ArrayList<ru.ozon.android.messenger.framework.data.local.database.draft.entity.a>> c5132a) {
        Set<String> keySet = c5132a.keySet();
        if (keySet.isEmpty()) {
            return;
        }
        if (c5132a.size() > 999) {
            L4.c.a(c5132a, true, new Function1() { // from class: ru.ozon.android.messenger.framework.data.local.database.draft.g
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return i.m(i.this, (C5132a) obj);
                }
            });
            return;
        }
        StringBuilder e11 = C3261b.e("SELECT `id`,`chat_id`,`type`,`local_url`,`remote_url`,`media_type`,`image_width`,`image_height`,`file_name`,`file_size` FROM `draft_attachments` WHERE `chat_id` IN (");
        int size = keySet.size();
        L4.d.a(size, e11);
        e11.append(")");
        w j11 = w.j(size, e11.toString());
        Iterator<String> it = keySet.iterator();
        int i11 = 1;
        while (it.hasNext()) {
            j11.e0(i11, it.next());
            i11++;
        }
        int i12 = 0;
        Cursor b11 = L4.b.b(this.f87520a, j11, false);
        try {
            int a11 = L4.a.a(b11, "chat_id");
            if (a11 == -1) {
                return;
            }
            while (b11.moveToNext()) {
                ArrayList<ru.ozon.android.messenger.framework.data.local.database.draft.entity.a> arrayList = c5132a.get(b11.getString(a11));
                if (arrayList != null) {
                    arrayList.add(new ru.ozon.android.messenger.framework.data.local.database.draft.entity.a(b11.getString(i12), b11.getString(1), ru.ozon.android.messenger.framework.data.local.database.draft.converter.a.a(b11.getInt(2)), b11.getString(3), b11.isNull(4) ? null : b11.getString(4), b11.isNull(5) ? null : b11.getString(5), b11.isNull(6) ? null : Integer.valueOf(b11.getInt(6)), b11.isNull(7) ? null : Integer.valueOf(b11.getInt(7)), b11.isNull(8) ? null : b11.getString(8), b11.isNull(9) ? null : b11.getString(9)));
                }
                i12 = 0;
            }
        } finally {
            b11.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D(@NonNull C5132a<String, ArrayList<ru.ozon.android.messenger.framework.data.local.database.draft.entity.b>> c5132a) {
        Set<String> keySet = c5132a.keySet();
        if (keySet.isEmpty()) {
            return;
        }
        if (c5132a.size() > 999) {
            L4.c.a(c5132a, true, new K80.c(this, 1));
            return;
        }
        StringBuilder e11 = C3261b.e("SELECT `id`,`chat_id`,`custom_block` FROM `draft_custom_blocks` WHERE `chat_id` IN (");
        int size = keySet.size();
        L4.d.a(size, e11);
        e11.append(")");
        w j11 = w.j(size, e11.toString());
        Iterator<String> it = keySet.iterator();
        int i11 = 1;
        while (it.hasNext()) {
            j11.e0(i11, it.next());
            i11++;
        }
        Cursor b11 = L4.b.b(this.f87520a, j11, false);
        try {
            int a11 = L4.a.a(b11, "chat_id");
            if (a11 == -1) {
                b11.close();
                return;
            }
            while (b11.moveToNext()) {
                ArrayList<ru.ozon.android.messenger.framework.data.local.database.draft.entity.b> arrayList = c5132a.get(b11.getString(a11));
                if (arrayList != null) {
                    int i12 = b11.getInt(0);
                    String string = b11.getString(1);
                    CustomBlockDTO b12 = this.f87526g.b(b11.getString(2));
                    if (b12 == null) {
                        throw new IllegalStateException("Expected NON-NULL 'ru.ozon.android.messenger.blocks.input.CustomBlockDTO', but it was NULL.");
                    }
                    arrayList.add(new ru.ozon.android.messenger.framework.data.local.database.draft.entity.b(i12, string, b12));
                }
            }
            b11.close();
        } catch (Throwable th2) {
            b11.close();
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E(@NonNull C5132a<String, ru.ozon.android.messenger.framework.data.local.database.draft.entity.d> c5132a) {
        Set<String> keySet = c5132a.keySet();
        if (keySet.isEmpty()) {
            return;
        }
        if (c5132a.size() > 999) {
            L4.c.a(c5132a, false, new C7330j(this, 2));
            return;
        }
        StringBuilder e11 = C3261b.e("SELECT `chat_id`,`text` FROM `draft_texts` WHERE `chat_id` IN (");
        int size = keySet.size();
        L4.d.a(size, e11);
        e11.append(")");
        w j11 = w.j(size, e11.toString());
        Iterator<String> it = keySet.iterator();
        int i11 = 1;
        while (it.hasNext()) {
            j11.e0(i11, it.next());
            i11++;
        }
        Cursor b11 = L4.b.b(this.f87520a, j11, false);
        try {
            int a11 = L4.a.a(b11, "chat_id");
            if (a11 == -1) {
                return;
            }
            while (b11.moveToNext()) {
                String string = b11.getString(a11);
                if (c5132a.containsKey(string)) {
                    c5132a.put(string, new ru.ozon.android.messenger.framework.data.local.database.draft.entity.d(b11.getString(0), b11.getString(1)));
                }
            }
        } finally {
            b11.close();
        }
    }

    public static /* synthetic */ Unit m(i iVar, C5132a c5132a) {
        iVar.C(c5132a);
        return Unit.f71690a;
    }

    public static /* synthetic */ Unit n(i iVar, C5132a c5132a) {
        iVar.D(c5132a);
        return Unit.f71690a;
    }

    public static /* synthetic */ Unit o(i iVar, C5132a c5132a) {
        iVar.E(c5132a);
        return Unit.f71690a;
    }

    @Override // ru.ozon.android.messenger.framework.data.local.database.draft.b
    public final Object a(final String str, final String str2, final long j11, kotlin.coroutines.d<? super Unit> dVar) {
        return u.a(this.f87520a, new Function1() { // from class: ru.ozon.android.messenger.framework.data.local.database.draft.f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                i iVar = i.this;
                iVar.getClass();
                return b.a.c(iVar, str, str2, j11, (kotlin.coroutines.d) obj);
            }
        }, dVar);
    }

    @Override // ru.ozon.android.messenger.framework.data.local.database.draft.b
    public final Object b(final String str, final ArrayList arrayList, final long j11, kotlin.coroutines.d dVar) {
        return u.a(this.f87520a, new Function1() { // from class: ru.ozon.android.messenger.framework.data.local.database.draft.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                i iVar = i.this;
                iVar.getClass();
                return b.a.a(iVar, str, arrayList, j11, (kotlin.coroutines.d) obj);
            }
        }, dVar);
    }

    @Override // ru.ozon.android.messenger.framework.data.local.database.draft.b
    public final Object c(final String str, final ru.ozon.android.messenger.framework.data.local.database.draft.entity.b bVar, final long j11, kotlin.coroutines.d<? super Unit> dVar) {
        return u.a(this.f87520a, new Function1() { // from class: ru.ozon.android.messenger.framework.data.local.database.draft.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                i iVar = i.this;
                iVar.getClass();
                return b.a.b(iVar, str, bVar, j11, (kotlin.coroutines.d) obj);
            }
        }, dVar);
    }

    @Override // ru.ozon.android.messenger.framework.data.local.database.draft.b
    public final Object d(String str, kotlin.coroutines.d<? super Unit> dVar) {
        return J4.f.c(this.f87520a, new f(str), dVar);
    }

    @Override // ru.ozon.android.messenger.framework.data.local.database.draft.b
    public final Object e(List<ru.ozon.android.messenger.framework.data.local.database.draft.entity.a> list, kotlin.coroutines.d<? super Unit> dVar) {
        return J4.f.c(this.f87520a, new b(list), dVar);
    }

    @Override // ru.ozon.android.messenger.framework.data.local.database.draft.b
    public final Object f(String str, kotlin.coroutines.d<? super Unit> dVar) {
        return J4.f.c(this.f87520a, new e(str), dVar);
    }

    @Override // ru.ozon.android.messenger.framework.data.local.database.draft.b
    public final Object g(ru.ozon.android.messenger.framework.data.local.database.draft.entity.c cVar, kotlin.coroutines.jvm.internal.c cVar2) {
        return J4.f.c(this.f87520a, new ru.ozon.android.messenger.framework.data.local.database.draft.h(this, cVar), cVar2);
    }

    @Override // ru.ozon.android.messenger.framework.data.local.database.draft.b
    public final InterfaceC2395h<ru.ozon.android.messenger.framework.data.local.database.draft.model.a> h(String str) {
        w j11 = w.j(1, "SELECT * FROM chats WHERE chat_id = ? LIMIT 1");
        j11.e0(1, str);
        g gVar = new g(j11);
        return J4.f.a(this.f87520a, new String[]{"draft_texts", "draft_attachments", "draft_custom_blocks", "chats"}, gVar);
    }

    @Override // ru.ozon.android.messenger.framework.data.local.database.draft.b
    public final Object i(List<ru.ozon.android.messenger.framework.data.local.database.draft.entity.b> list, kotlin.coroutines.d<? super Unit> dVar) {
        return J4.f.c(this.f87520a, new c(list), dVar);
    }

    @Override // ru.ozon.android.messenger.framework.data.local.database.draft.b
    public final Object j(kotlin.coroutines.d<? super Map<String, ru.ozon.android.messenger.framework.data.local.database.draft.model.a>> dVar) {
        w j11 = w.j(0, "SELECT * FROM chats");
        return J4.f.b(this.f87520a, new CancellationSignal(), new h(j11), dVar);
    }

    @Override // ru.ozon.android.messenger.framework.data.local.database.draft.b
    public final Object k(ru.ozon.android.messenger.framework.data.local.database.draft.entity.d dVar, kotlin.coroutines.d<? super Unit> dVar2) {
        return J4.f.c(this.f87520a, new a(dVar), dVar2);
    }

    @Override // ru.ozon.android.messenger.framework.data.local.database.draft.b
    public final Object l(String str, kotlin.coroutines.d<? super Unit> dVar) {
        return J4.f.c(this.f87520a, new d(str), dVar);
    }
}
