package t3;

import android.os.HandlerThread;
import android.os.Looper;

/* renamed from: t3.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9732D {

    /* renamed from: a, reason: collision with root package name */
    private final Object f98981a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private Looper f98982b = null;

    /* renamed from: c, reason: collision with root package name */
    private HandlerThread f98983c = null;

    /* renamed from: d, reason: collision with root package name */
    private int f98984d = 0;

    public final Looper a() {
        Looper looper;
        synchronized (this.f98981a) {
            try {
                if (this.f98982b == null) {
                    G10.a.h(this.f98984d == 0 && this.f98983c == null);
                    HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
                    this.f98983c = handlerThread;
                    handlerThread.start();
                    this.f98982b = this.f98983c.getLooper();
                }
                this.f98984d++;
                looper = this.f98982b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return looper;
    }

    public final void b() {
        HandlerThread handlerThread;
        synchronized (this.f98981a) {
            try {
                G10.a.h(this.f98984d > 0);
                int i11 = this.f98984d - 1;
                this.f98984d = i11;
                if (i11 == 0 && (handlerThread = this.f98983c) != null) {
                    handlerThread.quit();
                    this.f98983c = null;
                    this.f98982b = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
