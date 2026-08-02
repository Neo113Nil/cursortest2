package m1;

import android.os.HandlerThread;
import android.os.Looper;
import e1.AbstractC4134a;

/* loaded from: classes.dex */
public final class i1 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f56251a;

    /* renamed from: b, reason: collision with root package name */
    public Looper f56252b;

    /* renamed from: c, reason: collision with root package name */
    public HandlerThread f56253c;

    /* renamed from: d, reason: collision with root package name */
    public int f56254d;

    public i1() {
        this(null);
    }

    public Looper a() {
        Looper looper;
        synchronized (this.f56251a) {
            try {
                if (this.f56252b == null) {
                    AbstractC4134a.g(this.f56254d == 0 && this.f56253c == null);
                    HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
                    this.f56253c = handlerThread;
                    handlerThread.start();
                    this.f56252b = this.f56253c.getLooper();
                }
                this.f56254d++;
                looper = this.f56252b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return looper;
    }

    public void b() {
        HandlerThread handlerThread;
        synchronized (this.f56251a) {
            try {
                AbstractC4134a.g(this.f56254d > 0);
                int i10 = this.f56254d - 1;
                this.f56254d = i10;
                if (i10 == 0 && (handlerThread = this.f56253c) != null) {
                    handlerThread.quit();
                    this.f56253c = null;
                    this.f56252b = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public i1(Looper looper) {
        this.f56251a = new Object();
        this.f56252b = looper;
        this.f56253c = null;
        this.f56254d = 0;
    }
}
