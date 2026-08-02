package R2;

import Q2.AbstractC1508t;
import Q2.EnumC1497h;
import Y2.AbstractC1813d;
import android.content.BroadcastReceiver;
import android.content.Context;
import androidx.lifecycle.LiveData;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.ForceStopRunnable;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import u.InterfaceC6482a;

/* loaded from: classes.dex */
public class Y extends Q2.L {

    /* renamed from: m, reason: collision with root package name */
    public static final String f9963m = AbstractC1508t.i("WorkManagerImpl");

    /* renamed from: n, reason: collision with root package name */
    public static Y f9964n = null;

    /* renamed from: o, reason: collision with root package name */
    public static Y f9965o = null;

    /* renamed from: p, reason: collision with root package name */
    public static final Object f9966p = new Object();

    /* renamed from: b, reason: collision with root package name */
    public Context f9967b;

    /* renamed from: c, reason: collision with root package name */
    public androidx.work.a f9968c;

    /* renamed from: d, reason: collision with root package name */
    public WorkDatabase f9969d;

    /* renamed from: e, reason: collision with root package name */
    public Z2.b f9970e;

    /* renamed from: f, reason: collision with root package name */
    public List f9971f;

    /* renamed from: g, reason: collision with root package name */
    public C1543t f9972g;

    /* renamed from: h, reason: collision with root package name */
    public Y2.B f9973h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f9974i = false;

    /* renamed from: j, reason: collision with root package name */
    public BroadcastReceiver.PendingResult f9975j;

    /* renamed from: k, reason: collision with root package name */
    public final V2.n f9976k;

    /* renamed from: l, reason: collision with root package name */
    public final Ph.P f9977l;

    public class a implements InterfaceC6482a {
        public a() {
        }

        @Override // u.InterfaceC6482a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Q2.K apply(List list) {
            if (list == null || list.size() <= 0) {
                return null;
            }
            return ((WorkSpec.c) list.get(0)).e();
        }
    }

    public static class b {
        public static boolean a(Context context) {
            return context.isDeviceProtectedStorage();
        }
    }

    public Y(Context context, androidx.work.a aVar, Z2.b bVar, WorkDatabase workDatabase, List list, C1543t c1543t, V2.n nVar) {
        Context applicationContext = context.getApplicationContext();
        if (b.a(applicationContext)) {
            throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
        }
        AbstractC1508t.h(new AbstractC1508t.a(aVar.j()));
        this.f9967b = applicationContext;
        this.f9970e = bVar;
        this.f9969d = workDatabase;
        this.f9972g = c1543t;
        this.f9976k = nVar;
        this.f9968c = aVar;
        this.f9971f = list;
        Ph.P f10 = androidx.work.impl.a.f(bVar);
        this.f9977l = f10;
        this.f9973h = new Y2.B(this.f9969d);
        AbstractC1548y.e(list, this.f9972g, bVar.c(), this.f9969d, aVar);
        this.f9970e.d(new ForceStopRunnable(applicationContext, this));
        E.c(f10, this.f9967b, aVar, workDatabase);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0018, code lost:
    
        r3 = r3.getApplicationContext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x001e, code lost:
    
        if (R2.Y.f9965o != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0020, code lost:
    
        R2.Y.f9965o = androidx.work.impl.a.c(r3, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0026, code lost:
    
        R2.Y.f9964n = R2.Y.f9965o;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void j(Context context, androidx.work.a aVar) {
        synchronized (f9966p) {
            try {
                Y y10 = f9964n;
                if (y10 != null && f9965o != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
            } finally {
            }
        }
    }

    public static /* synthetic */ Unit k(Y y10) {
        androidx.work.impl.background.systemjob.m.c(y10.l());
        y10.s().l().m();
        AbstractC1548y.f(y10.f(), y10.s(), y10.q());
        return Unit.INSTANCE;
    }

    public static Y m() {
        synchronized (f9966p) {
            try {
                Y y10 = f9964n;
                if (y10 != null) {
                    return y10;
                }
                return f9965o;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static Y n(Context context) {
        Y m10;
        synchronized (f9966p) {
            try {
                m10 = m();
                if (m10 == null) {
                    context.getApplicationContext();
                    throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return m10;
    }

    @Override // Q2.L
    public Q2.x a(UUID uuid) {
        return AbstractC1813d.e(uuid, this);
    }

    @Override // Q2.L
    public Q2.x c(List list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
        }
        return new G(this, list).b();
    }

    @Override // Q2.L
    public Q2.x e(String str, EnumC1497h enumC1497h, List list) {
        return new G(this, str, enumC1497h, list).b();
    }

    @Override // Q2.L
    public androidx.work.a f() {
        return this.f9968c;
    }

    @Override // Q2.L
    public LiveData i(UUID uuid) {
        return Y2.o.a(this.f9969d.l().x(Collections.singletonList(uuid.toString())), new a(), this.f9970e);
    }

    public Context l() {
        return this.f9967b;
    }

    public Y2.B o() {
        return this.f9973h;
    }

    public C1543t p() {
        return this.f9972g;
    }

    public List q() {
        return this.f9971f;
    }

    public V2.n r() {
        return this.f9976k;
    }

    public WorkDatabase s() {
        return this.f9969d;
    }

    public Z2.b t() {
        return this.f9970e;
    }

    public void u() {
        synchronized (f9966p) {
            try {
                this.f9974i = true;
                BroadcastReceiver.PendingResult pendingResult = this.f9975j;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.f9975j = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void v() {
        Q2.I.a(f().n(), "ReschedulingWork", new Function0() { // from class: R2.X
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Y.k(Y.this);
            }
        });
    }

    public void w(BroadcastReceiver.PendingResult pendingResult) {
        synchronized (f9966p) {
            try {
                BroadcastReceiver.PendingResult pendingResult2 = this.f9975j;
                if (pendingResult2 != null) {
                    pendingResult2.finish();
                }
                this.f9975j = pendingResult;
                if (this.f9974i) {
                    pendingResult.finish();
                    this.f9975j = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void x(X2.h hVar, int i10) {
        this.f9970e.d(new Y2.E(this.f9972g, new C1549z(hVar), true, i10));
    }
}
