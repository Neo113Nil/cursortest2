package e1;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* loaded from: classes.dex */
public class N implements InterfaceC4143j {
    @Override // e1.InterfaceC4143j
    public long a() {
        return System.currentTimeMillis();
    }

    @Override // e1.InterfaceC4143j
    public long b() {
        return SystemClock.elapsedRealtime();
    }

    @Override // e1.InterfaceC4143j
    public long c() {
        return SystemClock.uptimeMillis();
    }

    @Override // e1.InterfaceC4143j
    public InterfaceC4152t d(Looper looper, Handler.Callback callback) {
        return new O(new Handler(looper, callback));
    }

    @Override // e1.InterfaceC4143j
    public long nanoTime() {
        return System.nanoTime();
    }

    @Override // e1.InterfaceC4143j
    public void e() {
    }
}
