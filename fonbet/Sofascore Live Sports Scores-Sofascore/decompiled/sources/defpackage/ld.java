package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import com.facebook.appevents.i;
import com.facebook.b;
import com.facebook.c0;
import com.facebook.internal.a0;
import com.facebook.internal.k0;
import com.facebook.internal.u;
import com.facebook.internal.x;
import com.facebook.w;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.Timer;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class ld implements Application.ActivityLifecycleCallbacks {
    public final /* synthetic */ int a;

    public /* synthetic */ ld(int i) {
        this.a = i;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        int i = this.a;
        activity.getClass();
        switch (i) {
            case 0:
                b bVar = a0.a;
                ScheduledExecutorService scheduledExecutorService = md.a;
                synchronized (w.b) {
                }
                md.a.execute(new x(2));
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        int i = this.a;
        activity.getClass();
        switch (i) {
            case 0:
                b bVar = a0.a;
                ScheduledExecutorService scheduledExecutorService = md.a;
                synchronized (w.b) {
                }
                m03 m03Var = m03.a;
                Set set = cw3.a;
                if (!set.contains(m03.class)) {
                    try {
                        p03 r = p03.g.r();
                        if (!set.contains(r)) {
                            try {
                                ((HashMap) r.f).remove(Integer.valueOf(activity.hashCode()));
                            } catch (Throwable th) {
                                cw3.a(r, th);
                            }
                        }
                        break;
                    } catch (Throwable th2) {
                        cw3.a(m03.class, th2);
                        return;
                    }
                }
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        int i = this.a;
        activity.getClass();
        switch (i) {
            case 0:
                b bVar = a0.a;
                ScheduledExecutorService scheduledExecutorService = md.a;
                synchronized (w.b) {
                }
                AtomicInteger atomicInteger = md.e;
                int i2 = 0;
                if (atomicInteger.decrementAndGet() < 0) {
                    atomicInteger.set(0);
                }
                md.a();
                long currentTimeMillis = System.currentTimeMillis();
                String k = k0.k(activity);
                m03 m03Var = m03.a;
                Set set = cw3.a;
                if (!set.contains(m03.class)) {
                    try {
                        if (m03.f.get()) {
                            p03.g.r().w(activity);
                            atk atkVar = m03.d;
                            if (atkVar != null && !set.contains(atkVar)) {
                                try {
                                    if (((Activity) atkVar.b.get()) != null) {
                                        try {
                                            Timer timer = atkVar.c;
                                            if (timer != null) {
                                                timer.cancel();
                                            }
                                            atkVar.c = null;
                                        } catch (Exception unused) {
                                        }
                                    }
                                } catch (Throwable th) {
                                    cw3.a(atkVar, th);
                                }
                            }
                            SensorManager sensorManager = m03.c;
                            if (sensorManager != null) {
                                sensorManager.unregisterListener(m03.b);
                            }
                        }
                    } catch (Throwable th2) {
                        cw3.a(m03.class, th2);
                    }
                }
                md.a.execute(new kd(i2, currentTimeMillis, k));
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        int i = this.a;
        activity.getClass();
        switch (i) {
            case 0:
                b bVar = a0.a;
                ScheduledExecutorService scheduledExecutorService = md.a;
                synchronized (w.b) {
                }
                md.k = new WeakReference(activity);
                md.e.incrementAndGet();
                md.a();
                long currentTimeMillis = System.currentTimeMillis();
                md.i = currentTimeMillis;
                String k = k0.k(activity);
                btk btkVar = m03.b;
                m03 m03Var = m03.a;
                Set set = cw3.a;
                if (!set.contains(m03.class)) {
                    try {
                        if (m03.f.get()) {
                            p03.g.r().e(activity);
                            Context applicationContext = activity.getApplicationContext();
                            String b = w.b();
                            u b2 = x.b(b);
                            if (b2 == null || !b2.g) {
                                set.contains(m03Var);
                            } else {
                                SensorManager sensorManager = (SensorManager) applicationContext.getSystemService("sensor");
                                if (sensorManager != null) {
                                    m03.c = sensorManager;
                                    Sensor defaultSensor = sensorManager.getDefaultSensor(1);
                                    atk atkVar = new atk(activity);
                                    m03.d = atkVar;
                                    o3 o3Var = new o3(3, b2, b);
                                    if (!set.contains(btkVar)) {
                                        try {
                                            btkVar.a = o3Var;
                                        } catch (Throwable th) {
                                            cw3.a(btkVar, th);
                                        }
                                    }
                                    sensorManager.registerListener(btkVar, defaultSensor, 2);
                                    if (b2.g) {
                                        atkVar.c();
                                    }
                                }
                            }
                            cw3.a.contains(m03Var);
                        }
                    } catch (Throwable th2) {
                        cw3.a(m03.class, th2);
                    }
                }
                uic uicVar = uic.b;
                if (!cw3.a.contains(uic.class)) {
                    try {
                        if (uic.c) {
                            CopyOnWriteArraySet copyOnWriteArraySet = cjc.d;
                            if (!new HashSet(cjc.a()).isEmpty()) {
                                HashMap hashMap = hjc.e;
                                cga.S(activity);
                            }
                        }
                    } catch (Exception unused) {
                    } catch (Throwable th3) {
                        cw3.a(uic.class, th3);
                    }
                }
                hmi.d(activity);
                String str = md.l;
                if (str != null) {
                    int i2 = 1;
                    if (StringsKt.J(str, "ProxyBillingActivity", false) && !k.equals("ProxyBillingActivity")) {
                        md.b.execute(new x(i2));
                    }
                }
                md.a.execute(new jd(activity.getApplicationContext(), k, currentTimeMillis));
                md.l = k;
                break;
            case 1:
                de0 n = de0.c.n();
                if (n != null) {
                    n.x(activity);
                    break;
                }
                break;
            default:
                try {
                    w.c().execute(new x(16));
                    break;
                } catch (Exception unused2) {
                    return;
                }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        int i = this.a;
        activity.getClass();
        bundle.getClass();
        switch (i) {
            case 0:
                b bVar = a0.a;
                ScheduledExecutorService scheduledExecutorService = md.a;
                synchronized (w.b) {
                    break;
                }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        int i = this.a;
        activity.getClass();
        switch (i) {
            case 0:
                md.j++;
                b bVar = a0.a;
                ScheduledExecutorService scheduledExecutorService = md.a;
                synchronized (w.b) {
                    break;
                }
            case 1:
                de0 n = de0.c.n();
                if (n != null) {
                    n.x(activity);
                    break;
                }
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        int i = this.a;
        activity.getClass();
        switch (i) {
            case 0:
                b bVar = a0.a;
                ScheduledExecutorService scheduledExecutorService = md.a;
                synchronized (w.b) {
                }
                c0 c0Var = i.a;
                if (!cw3.a.contains(i.class)) {
                    try {
                        i.b.execute(new com.appsflyer.internal.w(4));
                    } catch (Throwable th) {
                        cw3.a(i.class, th);
                    }
                }
                md.j--;
                break;
            case 1:
                break;
            default:
                try {
                    if (Intrinsics.c(zw9.c, Boolean.TRUE) && Intrinsics.c(activity.getLocalClassName(), "com.android.billingclient.api.ProxyBillingActivity")) {
                        w.c().execute(new x(15));
                        break;
                    }
                } catch (Exception unused) {
                    return;
                }
                break;
        }
    }
}
