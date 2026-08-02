package Uh;

import Sh.H;
import Sh.J;
import java.util.concurrent.TimeUnit;
import kotlin.ranges.RangesKt;

/* loaded from: classes5.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final String f12290a = H.e("kotlinx.coroutines.scheduler.default.name", "DefaultDispatcher");

    /* renamed from: b, reason: collision with root package name */
    public static final long f12291b;

    /* renamed from: c, reason: collision with root package name */
    public static final int f12292c;

    /* renamed from: d, reason: collision with root package name */
    public static final int f12293d;

    /* renamed from: e, reason: collision with root package name */
    public static final long f12294e;

    /* renamed from: f, reason: collision with root package name */
    public static g f12295f;

    static {
        long f10;
        int e10;
        int e11;
        long f11;
        f10 = J.f("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 0L, 0L, 12, null);
        f12291b = f10;
        e10 = J.e("kotlinx.coroutines.scheduler.core.pool.size", RangesKt.coerceAtLeast(H.a(), 2), 1, 0, 8, null);
        f12292c = e10;
        e11 = J.e("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4, null);
        f12293d = e11;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f11 = J.f("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 0L, 0L, 12, null);
        f12294e = timeUnit.toNanos(f11);
        f12295f = e.f12281a;
    }

    public static final h b(Runnable runnable, long j10, boolean z10) {
        return new i(runnable, j10, z10);
    }

    public static final String c(boolean z10) {
        return z10 ? "Blocking" : "Non-blocking";
    }
}
