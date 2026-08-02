package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Trace;
import androidx.work.impl.WorkDatabase;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class xbl extends wbl {
    public static xbl k;
    public static xbl l;
    public static final Object m;
    public final Context a;
    public final ti3 b;
    public final WorkDatabase c;
    public final zti d;
    public final List e;
    public final g8f f;
    public final by9 g;
    public boolean h = false;
    public BroadcastReceiver.PendingResult i;
    public final nuj j;

    static {
        rik.x("WorkManagerImpl");
        k = null;
        l = null;
        m = new Object();
    }

    public xbl(Context context, final ti3 ti3Var, zti ztiVar, final WorkDatabase workDatabase, final List list, g8f g8fVar, nuj nujVar) {
        Context applicationContext = context.getApplicationContext();
        rq3 rq3Var = null;
        if (applicationContext.isDeviceProtectedStorage()) {
            a70.r("Cannot initialize WorkManager in direct boot mode");
            throw null;
        }
        rik rikVar = new rik(4);
        synchronized (rik.e) {
            try {
                if (rik.f == null) {
                    rik.f = rikVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.a = applicationContext;
        this.d = ztiVar;
        this.c = workDatabase;
        this.f = g8fVar;
        this.j = nujVar;
        this.b = ti3Var;
        this.e = list;
        zbl zblVar = (zbl) ztiVar;
        au3 au3Var = zblVar.b;
        au3Var.getClass();
        ad2 c = s9a.c(au3Var);
        this.g = new by9(workDatabase);
        final n5h n5hVar = zblVar.a;
        int i = ssg.a;
        g8fVar.a(new qe6() { // from class: ksg
            @Override // defpackage.qe6
            public final void a(qbl qblVar, boolean z) {
                n5hVar.execute(new kx0(list, qblVar, ti3Var, workDatabase, 11));
            }
        });
        zblVar.a.execute(new em8(applicationContext, this));
        int i2 = cak.b;
        if (f8f.a(applicationContext, ti3Var)) {
            fcp.m0(new v98(hkg.H(k53.W(new o63(5, zm2.s(workDatabase.g().a, false, new String[]{"workspec"}, new pcl(1)), new bak(4, null)), -1)), new mp1(applicationContext, rq3Var, 8), 3), c);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x003d, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0053, code lost:
    
        throw r4;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static xbl d(Context context) {
        xbl xblVar;
        Object obj = m;
        synchronized (obj) {
            try {
                synchronized (obj) {
                    xblVar = k;
                    if (xblVar == null) {
                        xblVar = l;
                    }
                }
                return xblVar;
            } finally {
            }
        }
        if (xblVar == null) {
            Context applicationContext = context.getApplicationContext();
            if (!(applicationContext instanceof si3)) {
                throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
            }
            ia0 ia0Var = (ia0) ((si3) applicationContext);
            ia0Var.getClass();
            yz1 yz1Var = new yz1(1);
            ab9 ab9Var = ia0Var.d;
            if (ab9Var == null) {
                Intrinsics.i("workerFactory");
                throw null;
            }
            yz1Var.c = ab9Var;
            yz1Var.b = 6;
            e(applicationContext, new ti3(yz1Var));
            xblVar = d(applicationContext);
        }
        return xblVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0018, code lost:
    
        r3 = r3.getApplicationContext();
        r1 = defpackage.xbl.l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x001e, code lost:
    
        if (r1 != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0020, code lost:
    
        r1 = defpackage.tgj.w(r3, r4);
        defpackage.xbl.l = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0026, code lost:
    
        defpackage.xbl.k = r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void e(Context context, ti3 ti3Var) {
        synchronized (m) {
            try {
                xbl xblVar = k;
                if (xblVar != null && l != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
            } finally {
            }
        }
    }

    public final sz8 c() {
        dti dtiVar = this.b.g;
        String concat = "CancelWorkByName_".concat("widget_periodic_refresh");
        n5h n5hVar = ((zbl) this.d).a;
        n5hVar.getClass();
        return nq8.G(dtiVar, concat, n5hVar, new hj2(this, 1));
    }

    public final void f() {
        synchronized (m) {
            try {
                this.h = true;
                BroadcastReceiver.PendingResult pendingResult = this.i;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.i = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g() {
        dti dtiVar = this.b.g;
        hj2 hj2Var = new hj2(this, 2);
        boolean M = h5a.M();
        if (M) {
            try {
                Trace.beginSection(h5a.U("ReschedulingWork"));
            } finally {
                if (M) {
                    Trace.endSection();
                }
            }
        }
        hj2Var.invoke();
    }
}
