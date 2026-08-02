package W7;

import V7.c;
import V7.k;
import android.app.ActivityManager;
import android.os.Looper;
import android.os.Process;
import g6.C4331C;
import io.agora.rtc2.video.FaceShapeAreaOptions;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f13072a = new b();

    /* renamed from: b, reason: collision with root package name */
    public static final int f13073b = Process.myUid();

    /* renamed from: c, reason: collision with root package name */
    public static final ScheduledExecutorService f13074c = Executors.newSingleThreadScheduledExecutor();

    /* renamed from: d, reason: collision with root package name */
    public static String f13075d = "";

    /* renamed from: e, reason: collision with root package name */
    public static final Runnable f13076e = new Runnable() { // from class: W7.a
        @Override // java.lang.Runnable
        public final void run() {
            b.b();
        }
    };

    public static final void b() {
        if (Y7.a.d(b.class)) {
            return;
        }
        try {
            Object systemService = C4331C.l().getSystemService("activity");
            if (systemService == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.app.ActivityManager");
            }
            c((ActivityManager) systemService);
        } catch (Exception unused) {
        } catch (Throwable th2) {
            Y7.a.b(th2, b.class);
        }
    }

    public static final void c(ActivityManager activityManager) {
        if (Y7.a.d(b.class) || activityManager == null) {
            return;
        }
        try {
            List<ActivityManager.ProcessErrorStateInfo> processesInErrorState = activityManager.getProcessesInErrorState();
            if (processesInErrorState == null) {
                return;
            }
            for (ActivityManager.ProcessErrorStateInfo processErrorStateInfo : processesInErrorState) {
                if (processErrorStateInfo.condition == 2 && processErrorStateInfo.uid == f13073b) {
                    Thread thread = Looper.getMainLooper().getThread();
                    Intrinsics.checkNotNullExpressionValue(thread, "getMainLooper().thread");
                    String g10 = k.g(thread);
                    if (!Intrinsics.areEqual(g10, f13075d) && k.k(thread)) {
                        f13075d = g10;
                        c.a aVar = c.a.f12570a;
                        c.a.a(processErrorStateInfo.shortMsg, g10).f();
                    }
                }
            }
        } catch (Throwable th2) {
            Y7.a.b(th2, b.class);
        }
    }

    public static final void d() {
        if (Y7.a.d(b.class)) {
            return;
        }
        try {
            f13074c.scheduleWithFixedDelay(f13076e, 0L, FaceShapeAreaOptions.FACE_SHAPE_AREA_EYEBROWPOSITION, TimeUnit.MILLISECONDS);
        } catch (Throwable th2) {
            Y7.a.b(th2, b.class);
        }
    }
}
