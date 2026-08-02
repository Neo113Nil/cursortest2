package li0;

import Ae.InterfaceC2395h;
import B1.C2548q;
import J4.A;
import J4.s;
import J4.u;
import J4.w;
import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.annotation.NonNull;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import li0.InterfaceC7963a;
import org.joda.time.DateTime;
import ru.ozon.tracker.db.TrackerDataBase_Impl;
import ru.ozon.tracker.db.entities.DbEvent;

/* loaded from: classes7.dex */
public final class e implements InterfaceC7963a {

    /* renamed from: a, reason: collision with root package name */
    private final TrackerDataBase_Impl f73342a;

    /* renamed from: b, reason: collision with root package name */
    private final J4.l<DbEvent> f73343b;

    /* renamed from: c, reason: collision with root package name */
    private final C2548q f73344c = new C2548q();

    /* renamed from: d, reason: collision with root package name */
    private final J4.k<DbEvent> f73345d;

    /* renamed from: e, reason: collision with root package name */
    private final A f73346e;

    /* renamed from: f, reason: collision with root package name */
    private final A f73347f;

    /* renamed from: g, reason: collision with root package name */
    private final A f73348g;

    /* loaded from: classes3.dex */
    final class a implements Callable<Unit> {
        a() {
        }

        @Override // java.util.concurrent.Callable
        @NonNull
        public final Unit call() throws Exception {
            e eVar = e.this;
            O4.f acquire = eVar.f73347f.acquire();
            try {
                eVar.f73342a.beginTransaction();
                try {
                    acquire.C();
                    eVar.f73342a.setTransactionSuccessful();
                    return Unit.f71690a;
                } finally {
                    eVar.f73342a.endTransaction();
                }
            } finally {
                eVar.f73347f.release(acquire);
            }
        }
    }

    final class b implements Callable<Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ DateTime f73350a;

        b(DateTime dateTime) {
            this.f73350a = dateTime;
        }

        @Override // java.util.concurrent.Callable
        @NonNull
        public final Unit call() throws Exception {
            e eVar = e.this;
            O4.f acquire = eVar.f73348g.acquire();
            eVar.f73344c.getClass();
            DateTime dateTime = this.f73350a;
            Long valueOf = dateTime != null ? Long.valueOf(dateTime.getMillis()) : null;
            if (valueOf == null) {
                acquire.C0(1);
            } else {
                acquire.m0(1, valueOf.longValue());
            }
            try {
                eVar.f73342a.beginTransaction();
                try {
                    acquire.C();
                    eVar.f73342a.setTransactionSuccessful();
                    return Unit.f71690a;
                } finally {
                    eVar.f73342a.endTransaction();
                }
            } finally {
                eVar.f73348g.release(acquire);
            }
        }
    }

    final class c implements Callable<String> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ w f73352a;

        c(w wVar) {
            this.f73352a = wVar;
        }

        @Override // java.util.concurrent.Callable
        @NonNull
        public final String call() throws Exception {
            Cursor b11 = L4.b.b(e.this.f73342a, this.f73352a, false);
            try {
                return b11.moveToFirst() ? b11.getString(0) : null;
            } finally {
                b11.close();
            }
        }

        protected final void finalize() {
            this.f73352a.release();
        }
    }

    final class d implements Callable<Long> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ w f73354a;

        d(w wVar) {
            this.f73354a = wVar;
        }

        @Override // java.util.concurrent.Callable
        @NonNull
        public final Long call() throws Exception {
            s sVar = e.this.f73342a;
            w wVar = this.f73354a;
            Cursor b11 = L4.b.b(sVar, wVar, false);
            try {
                long valueOf = b11.moveToFirst() ? Long.valueOf(b11.getLong(0)) : 0L;
                b11.close();
                wVar.release();
                return valueOf;
            } catch (Throwable th2) {
                b11.close();
                wVar.release();
                throw th2;
            }
        }
    }

    /* renamed from: li0.e$e, reason: collision with other inner class name */
    final class CallableC1243e implements Callable<Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ DbEvent f73356a;

        CallableC1243e(DbEvent dbEvent) {
            this.f73356a = dbEvent;
        }

        @Override // java.util.concurrent.Callable
        @NonNull
        public final Unit call() throws Exception {
            e eVar = e.this;
            eVar.f73342a.beginTransaction();
            try {
                eVar.f73343b.insert((J4.l) this.f73356a);
                eVar.f73342a.setTransactionSuccessful();
                return Unit.f71690a;
            } finally {
                eVar.f73342a.endTransaction();
            }
        }
    }

    final class f implements Callable<Integer> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f73358a;

        f(List list) {
            this.f73358a = list;
        }

        @Override // java.util.concurrent.Callable
        @NonNull
        public final Integer call() throws Exception {
            e eVar = e.this;
            eVar.f73342a.beginTransaction();
            try {
                int handleMultiple = eVar.f73345d.handleMultiple(this.f73358a);
                eVar.f73342a.setTransactionSuccessful();
                return Integer.valueOf(handleMultiple);
            } finally {
                eVar.f73342a.endTransaction();
            }
        }
    }

    final class g implements Callable<Unit> {
        g() {
        }

        @Override // java.util.concurrent.Callable
        @NonNull
        public final Unit call() throws Exception {
            e eVar = e.this;
            O4.f acquire = eVar.f73346e.acquire();
            try {
                eVar.f73342a.beginTransaction();
                try {
                    acquire.C();
                    eVar.f73342a.setTransactionSuccessful();
                    return Unit.f71690a;
                } finally {
                    eVar.f73342a.endTransaction();
                }
            } finally {
                eVar.f73346e.release(acquire);
            }
        }
    }

    public e(@NonNull TrackerDataBase_Impl trackerDataBase_Impl) {
        this.f73342a = trackerDataBase_Impl;
        this.f73343b = new li0.g(this, trackerDataBase_Impl);
        this.f73345d = new h(trackerDataBase_Impl);
        this.f73346e = new i(trackerDataBase_Impl);
        this.f73347f = new j(trackerDataBase_Impl);
        this.f73348g = new k(trackerDataBase_Impl);
    }

    @Override // li0.InterfaceC7963a
    public final Object a(int i11, kotlin.coroutines.jvm.internal.c cVar) {
        w j11 = w.j(1, "SELECT * FROM event \n            WHERE \n                markEventToSend IS NOT 1\n            ORDER BY timestamp DESC LIMIT ?");
        j11.m0(1, i11);
        return J4.f.b(this.f73342a, new CancellationSignal(), new li0.f(this, j11), cVar);
    }

    @Override // li0.InterfaceC7963a
    public final Object b(kotlin.coroutines.d<? super List<DbEvent>> dVar) {
        return u.a(this.f73342a, new Function1() { // from class: li0.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                e eVar = e.this;
                eVar.getClass();
                return InterfaceC7963a.C1241a.b(eVar, (kotlin.coroutines.d) obj);
            }
        }, dVar);
    }

    @Override // li0.InterfaceC7963a
    public final Object c(List list, kotlin.coroutines.jvm.internal.c cVar) {
        return J4.f.c(this.f73342a, new l(this, list), cVar);
    }

    @Override // li0.InterfaceC7963a
    public final Object clear(kotlin.coroutines.d<? super Unit> dVar) {
        return J4.f.c(this.f73342a, new a(), dVar);
    }

    @Override // li0.InterfaceC7963a
    public final Object clearUnderDate(DateTime dateTime, kotlin.coroutines.d<? super Unit> dVar) {
        return J4.f.c(this.f73342a, new b(dateTime), dVar);
    }

    @Override // li0.InterfaceC7963a
    public final Object deleteEvents(List<DbEvent> list, kotlin.coroutines.d<? super Integer> dVar) {
        return J4.f.c(this.f73342a, new f(list), dVar);
    }

    @Override // li0.InterfaceC7963a
    public final Object getBatch(final int i11, kotlin.coroutines.d<? super List<DbEvent>> dVar) {
        return u.a(this.f73342a, new Function1() { // from class: li0.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                e eVar = e.this;
                eVar.getClass();
                return InterfaceC7963a.C1241a.c(eVar, i11, (kotlin.coroutines.d) obj);
            }
        }, dVar);
    }

    @Override // li0.InterfaceC7963a
    public final Object getCountNotPendingEvents(kotlin.coroutines.d<? super Long> dVar) {
        w j11 = w.j(0, "SELECT COUNT(*) FROM event \n            WHERE \n                markEventToSend != 1");
        return J4.f.b(this.f73342a, new CancellationSignal(), new d(j11), dVar);
    }

    @Override // li0.InterfaceC7963a
    public final InterfaceC2395h<String> onChangedEvents() {
        c cVar = new c(w.j(0, "SELECT uuid FROM event ORDER BY timestamp DESC LIMIT 1"));
        return J4.f.a(this.f73342a, new String[]{"event"}, cVar);
    }

    @Override // li0.InterfaceC7963a
    public final Object resetPendingStatus(kotlin.coroutines.d<? super Unit> dVar) {
        return J4.f.c(this.f73342a, new g(), dVar);
    }

    @Override // li0.InterfaceC7963a
    public final Object saveEvent(DbEvent dbEvent, kotlin.coroutines.d<? super Unit> dVar) {
        return J4.f.c(this.f73342a, new CallableC1243e(dbEvent), dVar);
    }
}
