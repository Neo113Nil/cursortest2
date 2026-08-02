package com.google.firebase.perf;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.perf.metrics.AppStartTrace;
import com.google.firebase.perf.session.SessionManager;
import defpackage.a58;
import defpackage.ac3;
import defpackage.b0a;
import defpackage.b58;
import defpackage.b8;
import defpackage.b8f;
import defpackage.c58;
import defpackage.dv0;
import defpackage.fyj;
import defpackage.hg6;
import defpackage.jb3;
import defpackage.kb3;
import defpackage.l48;
import defpackage.lxf;
import defpackage.mp4;
import defpackage.oe0;
import defpackage.oi3;
import defpackage.oif;
import defpackage.qx4;
import defpackage.r38;
import defpackage.s9k;
import defpackage.u48;
import defpackage.ujg;
import defpackage.wba;
import defpackage.wxf;
import defpackage.wxj;
import defpackage.y48;
import defpackage.y65;
import defpackage.z48;
import defpackage.zid;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
/* loaded from: classes3.dex */
public class FirebasePerfRegistrar implements ComponentRegistrar {
    private static final String EARLY_LIBRARY_NAME = "fire-perf-early";
    private static final String LIBRARY_NAME = "fire-perf";

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ee A[Catch: all -> 0x011e, TRY_LEAVE, TryCatch #3 {, blocks: (B:19:0x00ad, B:26:0x00b6, B:28:0x00c5, B:30:0x00cf, B:34:0x00dc, B:36:0x00ee, B:37:0x0115, B:45:0x0109, B:47:0x0110), top: B:18:0x00ad }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static u48 lambda$getComponents$0(oif oifVar, ac3 ac3Var) {
        AppStartTrace appStartTrace;
        boolean z;
        int i;
        zid zidVar;
        r38 r38Var = (r38) ac3Var.e(r38.class);
        dv0 dv0Var = (dv0) ac3Var.j(dv0.class).get();
        Executor executor = (Executor) ac3Var.h(oifVar);
        u48 u48Var = new u48();
        r38Var.a();
        Context context = r38Var.a;
        oi3 e = oi3.e();
        e.getClass();
        oi3.d.a = b0a.K(context);
        e.c.c(context);
        oe0 a = oe0.a();
        synchronized (a) {
            if (!a.o) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext instanceof Application) {
                    ((Application) applicationContext).registerActivityLifecycleCallbacks(a);
                    a.o = true;
                }
            }
        }
        z48 z48Var = new z48();
        synchronized (a.g) {
            a.g.add(z48Var);
        }
        if (dv0Var != null) {
            if (AppStartTrace.z != null) {
                appStartTrace = AppStartTrace.z;
            } else {
                fyj fyjVar = fyj.s;
                wxf wxfVar = new wxf(18);
                if (AppStartTrace.z == null) {
                    synchronized (AppStartTrace.class) {
                        try {
                            if (AppStartTrace.z == null) {
                                AppStartTrace.z = new AppStartTrace(fyjVar, wxfVar, oi3.e(), new ThreadPoolExecutor(0, 1, 10 + AppStartTrace.y, TimeUnit.SECONDS, new LinkedBlockingQueue()));
                            }
                        } finally {
                        }
                    }
                }
                appStartTrace = AppStartTrace.z;
            }
            synchronized (appStartTrace) {
                if (!appStartTrace.a) {
                    b8f.i.f.a(appStartTrace);
                    Context applicationContext2 = context.getApplicationContext();
                    if (applicationContext2 instanceof Application) {
                        ((Application) applicationContext2).registerActivityLifecycleCallbacks(appStartTrace);
                        if (!appStartTrace.v && !AppStartTrace.c((Application) applicationContext2)) {
                            z = false;
                            appStartTrace.v = z;
                            int i2 = Build.VERSION.SDK_INT;
                            int i3 = 2;
                            if (((ActivityManager) ((Application) applicationContext2).getSystemService("activity")) != null) {
                                zidVar = new zid(i3, i3);
                            } else {
                                try {
                                    ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                                    ActivityManager.getMyMemoryState(runningAppProcessInfo);
                                    i = runningAppProcessInfo.importance;
                                } catch (Throwable unused) {
                                    i = -1;
                                }
                                if (i2 >= 34) {
                                    zidVar = new zid(i == 100 ? 1 : 2, i3);
                                } else {
                                    zidVar = new zid(i3, i3);
                                }
                            }
                            appStartTrace.w = zidVar;
                            appStartTrace.a = true;
                            appStartTrace.e = (Application) applicationContext2;
                        }
                        z = true;
                        appStartTrace.v = z;
                        int i22 = Build.VERSION.SDK_INT;
                        int i32 = 2;
                        if (((ActivityManager) ((Application) applicationContext2).getSystemService("activity")) != null) {
                        }
                        appStartTrace.w = zidVar;
                        appStartTrace.a = true;
                        appStartTrace.e = (Application) applicationContext2;
                    }
                }
            }
            if (Build.VERSION.SDK_INT < 34) {
                executor.execute(new b8(appStartTrace, 3));
            }
        }
        SessionManager.getInstance().initializeGaugeCollection();
        return u48Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static y48 providesFirebasePerformance(ac3 ac3Var) {
        ac3Var.e(u48.class);
        ujg ujgVar = new ujg(10, (r38) ac3Var.e(r38.class), (l48) ac3Var.e(l48.class), ac3Var.j(lxf.class), ac3Var.j(wxj.class), false);
        int i = 0;
        int i2 = 2;
        int i3 = 1;
        return (y48) ((y65) y65.b(new c58(new b58(ujgVar, i), new b58(ujgVar, i2), new b58(ujgVar, i3), new b58(ujgVar, 3), new a58(ujgVar, i3), new a58(ujgVar, i), new a58(ujgVar, i2)))).get();
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<kb3> getComponents() {
        oif oifVar = new oif(s9k.class, Executor.class);
        jb3 b = kb3.b(y48.class);
        b.a = LIBRARY_NAME;
        b.a(qx4.c(r38.class));
        b.a(new qx4(1, 1, lxf.class));
        b.a(qx4.c(l48.class));
        b.a(new qx4(1, 1, wxj.class));
        b.a(qx4.c(u48.class));
        b.f = new hg6(15);
        kb3 b2 = b.b();
        jb3 b3 = kb3.b(u48.class);
        b3.a = EARLY_LIBRARY_NAME;
        b3.a(qx4.c(r38.class));
        b3.a(qx4.a(dv0.class));
        b3.a(new qx4(oifVar, 1, 0));
        b3.c(2);
        b3.f = new mp4(oifVar, 2);
        return Arrays.asList(b2, b3.b(), wba.q(LIBRARY_NAME, "22.0.6"));
    }
}
