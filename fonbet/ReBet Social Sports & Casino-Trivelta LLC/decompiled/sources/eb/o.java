package eb;

import android.os.SystemClock;

/* loaded from: classes3.dex */
public abstract class o {
    public static o a(long j10, long j11, long j12) {
        return new C4191a(j10, j11, j12);
    }

    public static o e() {
        return a(System.currentTimeMillis(), SystemClock.elapsedRealtime(), SystemClock.uptimeMillis());
    }

    public abstract long b();

    public abstract long c();

    public abstract long d();
}
