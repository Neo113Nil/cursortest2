package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Choreographer;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class upk implements Choreographer.FrameCallback, Handler.Callback {
    public static final upk e = new upk();
    public volatile long a = C.TIME_UNSET;
    public final Handler b;
    public Choreographer c;
    public int d;

    public upk() {
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        int i = lik.a;
        Handler handler = new Handler(looper, this);
        this.b = handler;
        handler.sendEmptyMessage(0);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.a = j;
        Choreographer choreographer = this.c;
        choreographer.getClass();
        choreographer.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            try {
                this.c = Choreographer.getInstance();
                return true;
            } catch (RuntimeException e2) {
                m6k.g0("Vsync sampling disabled due to platform error", e2);
                return true;
            }
        }
        if (i == 1) {
            Choreographer choreographer = this.c;
            if (choreographer != null) {
                int i2 = this.d + 1;
                this.d = i2;
                if (i2 == 1) {
                    choreographer.postFrameCallback(this);
                }
            }
        } else {
            if (i != 2) {
                return false;
            }
            Choreographer choreographer2 = this.c;
            if (choreographer2 != null) {
                int i3 = this.d - 1;
                this.d = i3;
                if (i3 == 0) {
                    choreographer2.removeFrameCallback(this);
                    this.a = C.TIME_UNSET;
                    return true;
                }
            }
        }
        return true;
    }
}
