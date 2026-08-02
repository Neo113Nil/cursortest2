package defpackage;

import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.view.Choreographer;
import android.view.Choreographer$VsyncCallback;
import com.google.android.gms.internal.ads.zzfm;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class sbn extends vpk implements Choreographer$VsyncCallback {
    public final Handler f;

    public /* synthetic */ sbn(Choreographer choreographer, DisplayManager displayManager) {
        super(choreographer, displayManager, 1);
        this.f = zzfm.p();
    }

    @Override // defpackage.vpk
    public final void g() {
        this.c.registerDisplayListener(this, zzfm.p());
        this.b.postVsyncCallback(this);
    }

    @Override // defpackage.vpk
    public final void h() {
        this.c.unregisterDisplayListener(this);
        this.f.removeCallbacksAndMessages(null);
        this.b.removeVsyncCallback(this);
        this.d = C.TIME_UNSET;
        this.e = C.TIME_UNSET;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        if (i == 0) {
            this.b.postVsyncCallback(this);
        }
    }

    public final void onVsync(Choreographer.FrameData frameData) {
        this.d = frameData.getFrameTimeNanos();
        Choreographer.FrameTimeline[] frameTimelines = frameData.getFrameTimelines();
        int length = frameTimelines.length;
        long j = C.TIME_UNSET;
        if (length >= 2) {
            long expectedPresentationTimeNanos = frameTimelines[1].getExpectedPresentationTimeNanos() - frameTimelines[0].getExpectedPresentationTimeNanos();
            if (expectedPresentationTimeNanos != 0) {
                j = expectedPresentationTimeNanos;
            }
            this.e = j;
        } else {
            this.e = C.TIME_UNSET;
        }
        this.f.postDelayed(new Runnable() { // from class: qbn
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                sbn sbnVar = sbn.this;
                sbnVar.b.postVsyncCallback(sbnVar);
            }
        }, 500L);
    }
}
