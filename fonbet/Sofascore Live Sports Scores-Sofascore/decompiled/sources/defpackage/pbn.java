package defpackage;

import android.view.Choreographer;
import com.google.android.gms.internal.ads.zzeh;
import com.google.android.gms.internal.ads.zzfm;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class pbn extends vpk implements Choreographer.FrameCallback {
    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.d = j;
        this.b.postFrameCallbackDelayed(this, 500L);
    }

    @Override // defpackage.vpk
    public final void g() {
        long j;
        this.c.registerDisplayListener(this, zzfm.p());
        this.b.postFrameCallback(this);
        if (this.c.getDisplay(0) != null) {
            j = (long) (1.0E9d / r0.getRefreshRate());
        } else {
            zzeh.c("Unable to query display refresh rate");
            j = C.TIME_UNSET;
        }
        this.e = j;
    }

    @Override // defpackage.vpk
    public final void h() {
        this.c.unregisterDisplayListener(this);
        this.b.removeFrameCallback(this);
        this.d = C.TIME_UNSET;
        this.e = C.TIME_UNSET;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        long j;
        if (i == 0) {
            this.b.postFrameCallback(this);
            if (this.c.getDisplay(0) != null) {
                j = (long) (1.0E9d / r5.getRefreshRate());
            } else {
                zzeh.c("Unable to query display refresh rate");
                j = C.TIME_UNSET;
            }
            this.e = j;
        }
    }
}
