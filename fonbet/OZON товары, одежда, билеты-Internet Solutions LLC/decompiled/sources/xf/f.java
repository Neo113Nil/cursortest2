package xf;

import android.os.SystemClock;

/* loaded from: classes10.dex */
public final class f {

    /* renamed from: b, reason: collision with root package name */
    private int f105552b;

    /* renamed from: a, reason: collision with root package name */
    private final Object f105551a = new Object();

    /* renamed from: c, reason: collision with root package name */
    private long f105553c = Long.MIN_VALUE;

    public final boolean a() {
        synchronized (this.f105551a) {
            try {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (this.f105553c + 1000 <= elapsedRealtime) {
                    this.f105552b = 1;
                    this.f105553c = elapsedRealtime;
                    return true;
                }
                int i11 = this.f105552b;
                if (i11 >= 1) {
                    return false;
                }
                this.f105552b = i11 + 1;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
