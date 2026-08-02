package p6;

import android.os.SystemClock;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private static final double f80268a = 1.0d / Math.pow(10.0d, 6.0d);

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f80269b = 0;

    public static double a(long j11) {
        return (SystemClock.elapsedRealtimeNanos() - j11) * f80268a;
    }
}
