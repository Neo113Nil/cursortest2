package m3;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* renamed from: m3.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8053F implements InterfaceC8064f {
    @Override // m3.InterfaceC8064f
    public final InterfaceC8073o a(Looper looper, Handler.Callback callback) {
        return new C8054G(new Handler(looper, callback));
    }

    @Override // m3.InterfaceC8064f
    public final long currentTimeMillis() {
        return System.currentTimeMillis();
    }

    @Override // m3.InterfaceC8064f
    public final long elapsedRealtime() {
        return SystemClock.elapsedRealtime();
    }

    @Override // m3.InterfaceC8064f
    public final long nanoTime() {
        return System.nanoTime();
    }
}
