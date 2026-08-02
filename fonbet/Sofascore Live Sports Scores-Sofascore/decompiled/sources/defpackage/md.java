package defpackage;

import android.app.Application;
import com.facebook.internal.o;
import com.facebook.internal.q;
import java.lang.ref.WeakReference;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class md {
    public static volatile ScheduledFuture c;
    public static volatile jy0 f;
    public static String h;
    public static long i;
    public static int j;
    public static WeakReference k;
    public static String l;
    public static final ScheduledExecutorService a = Executors.newSingleThreadScheduledExecutor();
    public static final ScheduledExecutorService b = Executors.newSingleThreadScheduledExecutor();
    public static final Object d = new Object();
    public static final AtomicInteger e = new AtomicInteger(0);
    public static final AtomicBoolean g = new AtomicBoolean(false);

    public static void a() {
        ScheduledFuture scheduledFuture;
        synchronized (d) {
            try {
                if (c != null && (scheduledFuture = c) != null) {
                    scheduledFuture.cancel(false);
                }
                c = null;
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final UUID b() {
        jy0 jy0Var;
        if (f == null || (jy0Var = f) == null) {
            return null;
        }
        return (UUID) jy0Var.d;
    }

    public static final void c(Application application, String str) {
        int i2 = 0;
        if (g.compareAndSet(false, true)) {
            q.a(new hc5(22), o.CodelessEvents);
            h = str;
            application.registerActivityLifecycleCallbacks(new ld(i2));
        }
    }
}
