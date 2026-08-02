package f3;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Build;
import android.os.Trace;
import androidx.work.impl.WorkDatabase;
import com.google.android.gms.internal.measurement.h4;
import com.sports.insider.MyApp;
import hg.u0;
import java.util.List;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class v extends e3.k0 {

    /* renamed from: k, reason: collision with root package name */
    public static v f9423k;

    /* renamed from: l, reason: collision with root package name */
    public static v f9424l;

    /* renamed from: m, reason: collision with root package name */
    public static final Object f9425m;

    /* renamed from: a, reason: collision with root package name */
    public final Context f9426a;

    /* renamed from: b, reason: collision with root package name */
    public final e3.c f9427b;

    /* renamed from: c, reason: collision with root package name */
    public final WorkDatabase f9428c;

    /* renamed from: d, reason: collision with root package name */
    public final com.google.firebase.messaging.x f9429d;

    /* renamed from: e, reason: collision with root package name */
    public final List f9430e;

    /* renamed from: f, reason: collision with root package name */
    public final f f9431f;

    /* renamed from: g, reason: collision with root package name */
    public final n3.f f9432g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f9433h = false;

    /* renamed from: i, reason: collision with root package name */
    public BroadcastReceiver.PendingResult f9434i;
    public final c4.d j;

    static {
        e3.x.g("WorkManagerImpl");
        f9423k = null;
        f9424l = null;
        f9425m = new Object();
    }

    public v(Context context, final e3.c configuration, com.google.firebase.messaging.x taskExecutor, final WorkDatabase db2, final List list, f fVar, c4.d dVar) {
        int i5 = 0;
        Context appContext = context.getApplicationContext();
        if (Build.VERSION.SDK_INT >= 24 && h4.j(appContext)) {
            throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
        }
        e3.x xVar = new e3.x(configuration.f8484k);
        synchronized (e3.x.f8569b) {
            try {
                if (e3.x.f8570c == null) {
                    e3.x.f8570c = xVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f9426a = appContext;
        this.f9429d = taskExecutor;
        this.f9428c = db2;
        this.f9431f = fVar;
        this.j = dVar;
        this.f9427b = configuration;
        this.f9430e = list;
        Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
        eg.w wVar = (eg.w) taskExecutor.f6183b;
        Intrinsics.checkNotNullExpressionValue(wVar, "getTaskCoroutineDispatcher(...)");
        jg.d b10 = eg.c0.b(wVar);
        this.f9432g = new n3.f(db2, 1);
        final k2.a0 a0Var = (k2.a0) taskExecutor.f6182a;
        String str = j.f9376a;
        fVar.a(new c() { // from class: f3.i
            @Override // f3.c
            public final void a(m3.j jVar, boolean z5) {
                a0Var.execute(new com.appsflyer.internal.o(2, list, jVar, configuration, db2));
            }
        });
        ((k2.a0) taskExecutor.f6182a).execute(new n3.d(appContext, this));
        String str2 = o.f9403a;
        Intrinsics.checkNotNullParameter(b10, "<this>");
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(db2, "db");
        if (n3.l.a(appContext, configuration)) {
            u0.p(new hg.u(u0.i(u0.e(new bd.g(io.sentry.config.a.e(db2.y().f20360a, new String[]{"workspec"}, new k2.d0(9)), new m(4, null), 2), -1, gg.a.f10048a)), new n(appContext, null, i5), 2), b10);
        }
    }

    public static v d() {
        synchronized (f9425m) {
            try {
                v vVar = f9423k;
                if (vVar != null) {
                    return vVar;
                }
                return f9424l;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static v e(Context context) {
        v d10;
        synchronized (f9425m) {
            try {
                d10 = d();
                if (d10 == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (!(applicationContext instanceof e3.b)) {
                        throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
                    }
                    f(applicationContext, ((MyApp) ((e3.b) applicationContext)).b());
                    d10 = e(applicationContext);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return d10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0018, code lost:
    
        r3 = r3.getApplicationContext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x001e, code lost:
    
        if (f3.v.f9424l != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0020, code lost:
    
        f3.v.f9424l = f3.x.X(r3, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0026, code lost:
    
        f3.v.f9423k = f3.v.f9424l;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void f(Context context, e3.c cVar) {
        synchronized (f9425m) {
            try {
                v vVar = f9423k;
                if (vVar != null && f9424l != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
            } finally {
            }
        }
    }

    @Override // e3.k0
    public final e3.l a(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(this, "workManagerImpl");
        e3.l lVar = this.f9427b.f8489p;
        String concat = "CancelWorkByTag_".concat(tag);
        k2.a0 a0Var = (k2.a0) this.f9429d.f6182a;
        Intrinsics.checkNotNullExpressionValue(a0Var, "getSerialTaskExecutor(...)");
        return a.a.t(lVar, concat, a0Var, new a2.l(9, this, tag));
    }

    @Override // e3.k0
    public final e3.l b(String name, e3.h0 workRequest) {
        e3.n[] nVarArr = e3.n.f8548a;
        Intrinsics.checkNotNullParameter(this, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(workRequest, "workRequest");
        e3.l lVar = this.f9427b.f8489p;
        String concat = "enqueueUniquePeriodic_".concat(name);
        k2.a0 a0Var = (k2.a0) this.f9429d.f6182a;
        Intrinsics.checkNotNullExpressionValue(a0Var, "getSerialTaskExecutor(...)");
        return a.a.t(lVar, concat, a0Var, new z(this, name, workRequest, 0));
    }

    public final void g() {
        synchronized (f9425m) {
            try {
                this.f9433h = true;
                BroadcastReceiver.PendingResult pendingResult = this.f9434i;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.f9434i = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void h() {
        e3.l lVar = this.f9427b.f8489p;
        a2.q block = new a2.q(13, this);
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        Intrinsics.checkNotNullParameter("ReschedulingWork", "label");
        Intrinsics.checkNotNullParameter(block, "block");
        lVar.getClass();
        boolean r5 = m4.g.r();
        if (r5) {
            try {
                Intrinsics.checkNotNullParameter("ReschedulingWork", "label");
                Trace.beginSection(m4.g.B("ReschedulingWork"));
            } finally {
                InlineMarker.finallyStart(1);
                if (r5) {
                    Trace.endSection();
                }
                InlineMarker.finallyEnd(1);
            }
        }
        block.invoke();
    }
}
