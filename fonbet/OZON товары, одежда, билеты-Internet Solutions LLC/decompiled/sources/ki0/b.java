package ki0;

import B1.C2548q;
import Ij.C3261b;
import J4.A;
import J4.l;
import J4.s;
import J4.u;
import J4.w;
import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import org.joda.time.DateTime;
import ru.ozon.tracker.db.TrackerDataBase_Impl;
import ru.ozon.tracker.db.entities.PerfEventEntity;

/* loaded from: classes7.dex */
public final class b implements InterfaceC7684a {

    /* renamed from: a, reason: collision with root package name */
    private final TrackerDataBase_Impl f71636a;

    /* renamed from: b, reason: collision with root package name */
    private final l<PerfEventEntity> f71637b;

    /* renamed from: c, reason: collision with root package name */
    private final C2548q f71638c = new C2548q();

    /* renamed from: d, reason: collision with root package name */
    private final A f71639d;

    /* renamed from: e, reason: collision with root package name */
    private final A f71640e;

    /* renamed from: f, reason: collision with root package name */
    private final A f71641f;

    /* loaded from: classes3.dex */
    final class a implements Callable<List<PerfEventEntity>> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ w f71642a;

        a(w wVar) {
            this.f71642a = wVar;
        }

        @Override // java.util.concurrent.Callable
        @NonNull
        public final List<PerfEventEntity> call() throws Exception {
            w wVar;
            int i11;
            int i12;
            DateTime dateTime;
            b bVar = b.this;
            s sVar = bVar.f71636a;
            w wVar2 = this.f71642a;
            Cursor b11 = L4.b.b(sVar, wVar2, false);
            try {
                int b12 = L4.a.b(b11, "id");
                int b13 = L4.a.b(b11, "uuid");
                int b14 = L4.a.b(b11, "requestId");
                int b15 = L4.a.b(b11, "timestamp");
                int b16 = L4.a.b(b11, "testingToolName");
                int b17 = L4.a.b(b11, "attributes");
                int b18 = L4.a.b(b11, "user");
                int b19 = L4.a.b(b11, "page");
                int b21 = L4.a.b(b11, "obj");
                int b22 = L4.a.b(b11, "props");
                int b23 = L4.a.b(b11, "widget");
                int b24 = L4.a.b(b11, "metrics");
                int b25 = L4.a.b(b11, "map");
                int b26 = L4.a.b(b11, "customMetrics");
                wVar = wVar2;
                try {
                    int b27 = L4.a.b(b11, "videoMetrics");
                    int b28 = L4.a.b(b11, "serverTimings");
                    int b29 = L4.a.b(b11, "pclpage");
                    int i13 = b26;
                    ArrayList arrayList = new ArrayList(b11.getCount());
                    while (b11.moveToNext()) {
                        long j11 = b11.getLong(b12);
                        String string = b11.isNull(b13) ? null : b11.getString(b13);
                        String string2 = b11.isNull(b14) ? null : b11.getString(b14);
                        Long valueOf = b11.isNull(b15) ? null : Long.valueOf(b11.getLong(b15));
                        bVar.f71638c.getClass();
                        if (valueOf != null) {
                            i11 = b12;
                            i12 = b13;
                            dateTime = new DateTime(valueOf.longValue());
                        } else {
                            i11 = b12;
                            i12 = b13;
                            dateTime = null;
                        }
                        if (dateTime == null) {
                            throw new IllegalStateException("Expected NON-NULL 'org.joda.time.DateTime', but it was NULL.");
                        }
                        String string3 = b11.isNull(b16) ? null : b11.getString(b16);
                        String string4 = b11.isNull(b17) ? null : b11.getString(b17);
                        String string5 = b11.isNull(b18) ? null : b11.getString(b18);
                        String string6 = b11.isNull(b19) ? null : b11.getString(b19);
                        String string7 = b11.isNull(b21) ? null : b11.getString(b21);
                        String string8 = b11.isNull(b22) ? null : b11.getString(b22);
                        String string9 = b11.isNull(b23) ? null : b11.getString(b23);
                        String string10 = b11.isNull(b24) ? null : b11.getString(b24);
                        String string11 = b11.isNull(b25) ? null : b11.getString(b25);
                        int i14 = i13;
                        int i15 = b27;
                        int i16 = b28;
                        int i17 = b25;
                        int i18 = b29;
                        b29 = i18;
                        arrayList.add(new PerfEventEntity(j11, string, string2, dateTime, string3, string4, string5, string6, string7, string8, string9, string10, string11, b11.isNull(i14) ? null : b11.getString(i14), b11.isNull(i15) ? null : b11.getString(i15), b11.isNull(i16) ? null : b11.getString(i16), b11.isNull(i18) ? null : b11.getString(i18)));
                        i13 = i14;
                        b28 = i16;
                        b25 = i17;
                        b13 = i12;
                        b27 = i15;
                        b12 = i11;
                    }
                    b11.close();
                    wVar.release();
                    return arrayList;
                } catch (Throwable th2) {
                    th = th2;
                    b11.close();
                    wVar.release();
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                wVar = wVar2;
            }
        }
    }

    /* renamed from: ki0.b$b, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    final class CallableC1181b implements Callable<Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f71644a;

        CallableC1181b(List list) {
            this.f71644a = list;
        }

        @Override // java.util.concurrent.Callable
        @NonNull
        public final Unit call() throws Exception {
            StringBuilder e11 = C3261b.e("DELETE FROM performance_event WHERE `id` IN (");
            List list = this.f71644a;
            L4.d.a(list.size(), e11);
            e11.append(")");
            String sb2 = e11.toString();
            b bVar = b.this;
            O4.f compileStatement = bVar.f71636a.compileStatement(sb2);
            Iterator it = list.iterator();
            int i11 = 1;
            while (it.hasNext()) {
                compileStatement.m0(i11, ((Long) it.next()).longValue());
                i11++;
            }
            bVar.f71636a.beginTransaction();
            try {
                compileStatement.C();
                bVar.f71636a.setTransactionSuccessful();
                return Unit.f71690a;
            } finally {
                bVar.f71636a.endTransaction();
            }
        }
    }

    /* loaded from: classes3.dex */
    final class c implements Callable<Unit> {
        c() {
        }

        @Override // java.util.concurrent.Callable
        @NonNull
        public final Unit call() throws Exception {
            b bVar = b.this;
            O4.f acquire = bVar.f71639d.acquire();
            try {
                bVar.f71636a.beginTransaction();
                try {
                    acquire.C();
                    bVar.f71636a.setTransactionSuccessful();
                    return Unit.f71690a;
                } finally {
                    bVar.f71636a.endTransaction();
                }
            } finally {
                bVar.f71639d.release(acquire);
            }
        }
    }

    /* loaded from: classes3.dex */
    final class d implements Callable<Unit> {
        d() {
        }

        @Override // java.util.concurrent.Callable
        @NonNull
        public final Unit call() throws Exception {
            b bVar = b.this;
            O4.f acquire = bVar.f71640e.acquire();
            try {
                bVar.f71636a.beginTransaction();
                try {
                    acquire.C();
                    bVar.f71636a.setTransactionSuccessful();
                    return Unit.f71690a;
                } finally {
                    bVar.f71636a.endTransaction();
                }
            } finally {
                bVar.f71640e.release(acquire);
            }
        }
    }

    final class e implements Callable<List<PerfEventEntity>> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ w f71648a;

        e(w wVar) {
            this.f71648a = wVar;
        }

        @Override // java.util.concurrent.Callable
        @NonNull
        public final List<PerfEventEntity> call() throws Exception {
            b bVar = b.this;
            s sVar = bVar.f71636a;
            w wVar = this.f71648a;
            Cursor b11 = L4.b.b(sVar, wVar, false);
            try {
                ArrayList arrayList = new ArrayList(b11.getCount());
                while (b11.moveToNext()) {
                    long j11 = b11.getLong(0);
                    String string = b11.isNull(1) ? null : b11.getString(1);
                    String string2 = b11.isNull(2) ? null : b11.getString(2);
                    Long valueOf = b11.isNull(3) ? null : Long.valueOf(b11.getLong(3));
                    bVar.f71638c.getClass();
                    DateTime dateTime = valueOf != null ? new DateTime(valueOf.longValue()) : null;
                    if (dateTime == null) {
                        throw new IllegalStateException("Expected NON-NULL 'org.joda.time.DateTime', but it was NULL.");
                    }
                    arrayList.add(new PerfEventEntity(j11, string, string2, dateTime, b11.isNull(4) ? null : b11.getString(4), b11.isNull(5) ? null : b11.getString(5), b11.isNull(6) ? null : b11.getString(6), b11.isNull(7) ? null : b11.getString(7), b11.isNull(8) ? null : b11.getString(8), b11.isNull(9) ? null : b11.getString(9), b11.isNull(10) ? null : b11.getString(10), b11.isNull(11) ? null : b11.getString(11), b11.isNull(12) ? null : b11.getString(12), b11.isNull(13) ? null : b11.getString(13), b11.isNull(14) ? null : b11.getString(14), b11.isNull(15) ? null : b11.getString(15), b11.isNull(16) ? null : b11.getString(16)));
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

    public b(@NonNull TrackerDataBase_Impl trackerDataBase_Impl) {
        this.f71636a = trackerDataBase_Impl;
        this.f71637b = new ki0.c(this, trackerDataBase_Impl);
        this.f71639d = new ki0.d(trackerDataBase_Impl);
        this.f71640e = new ki0.e(trackerDataBase_Impl);
        this.f71641f = new f(trackerDataBase_Impl);
    }

    @Override // ki0.InterfaceC7684a
    public final Object a(List<Long> list, kotlin.coroutines.d<? super Unit> dVar) {
        return J4.f.c(this.f71636a, new CallableC1181b(list), dVar);
    }

    @Override // ki0.InterfaceC7684a
    public final Object b(List<Long> list, kotlin.coroutines.d<? super List<PerfEventEntity>> dVar) {
        StringBuilder e11 = C3261b.e("SELECT * FROM performance_event WHERE `id` IN (");
        int size = list.size();
        L4.d.a(size, e11);
        e11.append(")");
        w j11 = w.j(size, e11.toString());
        Iterator<Long> it = list.iterator();
        int i11 = 1;
        while (it.hasNext()) {
            j11.m0(i11, it.next().longValue());
            i11++;
        }
        return J4.f.b(this.f71636a, new CancellationSignal(), new a(j11), dVar);
    }

    @Override // ki0.InterfaceC7684a
    public final Object c(ArrayList arrayList, j jVar) {
        return J4.f.c(this.f71636a, new g(this, arrayList), jVar);
    }

    @Override // ki0.InterfaceC7684a
    public final Object clear(kotlin.coroutines.d<? super Unit> dVar) {
        return J4.f.c(this.f71636a, new c(), dVar);
    }

    @Override // ki0.InterfaceC7684a
    public final Object d(kotlin.coroutines.d<? super Unit> dVar) {
        return J4.f.c(this.f71636a, new d(), dVar);
    }

    @Override // ki0.InterfaceC7684a
    public final Object e(kotlin.coroutines.jvm.internal.c cVar) {
        return u.a(this.f71636a, new Ca.f(this, 1), cVar);
    }

    @Override // ki0.InterfaceC7684a
    public final Object f(DateTime dateTime, kotlin.coroutines.jvm.internal.c cVar) {
        return J4.f.c(this.f71636a, new h(this, dateTime), cVar);
    }

    @Override // ki0.InterfaceC7684a
    public final Object getAllEvents(kotlin.coroutines.d<? super List<PerfEventEntity>> dVar) {
        w j11 = w.j(0, "SELECT `performance_event`.`id` AS `id`, `performance_event`.`uuid` AS `uuid`, `performance_event`.`requestId` AS `requestId`, `performance_event`.`timestamp` AS `timestamp`, `performance_event`.`testingToolName` AS `testingToolName`, `performance_event`.`attributes` AS `attributes`, `performance_event`.`user` AS `user`, `performance_event`.`page` AS `page`, `performance_event`.`obj` AS `obj`, `performance_event`.`props` AS `props`, `performance_event`.`widget` AS `widget`, `performance_event`.`metrics` AS `metrics`, `performance_event`.`map` AS `map`, `performance_event`.`customMetrics` AS `customMetrics`, `performance_event`.`videoMetrics` AS `videoMetrics`, `performance_event`.`serverTimings` AS `serverTimings`, `performance_event`.`pclpage` AS `pclpage` FROM performance_event");
        return J4.f.b(this.f71636a, new CancellationSignal(), new e(j11), dVar);
    }
}
