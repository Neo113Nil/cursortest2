package K9;

import android.os.SystemClock;

/* loaded from: classes2.dex */
public class h implements e {

    /* renamed from: a, reason: collision with root package name */
    public static final h f6408a = new h();

    public static e c() {
        return f6408a;
    }

    @Override // K9.e
    public final long a() {
        return System.currentTimeMillis();
    }

    @Override // K9.e
    public final long b() {
        return SystemClock.elapsedRealtime();
    }

    @Override // K9.e
    public final long nanoTime() {
        return System.nanoTime();
    }
}
