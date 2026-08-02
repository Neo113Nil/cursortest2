package defpackage;

import android.media.MediaCodec;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class jl0 {
    public static final ArrayDeque g = new ArrayDeque();
    public static final Object h = new Object();
    public final MediaCodec a;
    public final HandlerThread b;
    public gl0 c;
    public final AtomicReference d;
    public final r0a e;
    public boolean f;

    public jl0(MediaCodec mediaCodec, HandlerThread handlerThread) {
        r0a r0aVar = new r0a(1);
        this.a = mediaCodec;
        this.b = handlerThread;
        this.e = r0aVar;
        this.d = new AtomicReference();
    }

    public static hl0 b() {
        ArrayDeque arrayDeque = g;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new hl0();
                }
                return (hl0) arrayDeque.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a() {
        if (this.f) {
            try {
                gl0 gl0Var = this.c;
                gl0Var.getClass();
                gl0Var.removeCallbacksAndMessages(null);
                r0a r0aVar = this.e;
                r0aVar.i();
                gl0 gl0Var2 = this.c;
                gl0Var2.getClass();
                gl0Var2.obtainMessage(2).sendToTarget();
                synchronized (r0aVar) {
                    while (!r0aVar.b) {
                        r0aVar.wait();
                    }
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                yhk.q(e);
            }
        }
    }
}
