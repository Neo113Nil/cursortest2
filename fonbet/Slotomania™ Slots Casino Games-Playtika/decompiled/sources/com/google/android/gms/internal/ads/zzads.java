package com.google.android.gms.internal.ads;

import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.view.Choreographer;
import com.google.android.exoplayer2.C;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes.dex */
final class zzads extends zzadp implements Choreographer.VsyncCallback {
    private final Handler zzf;

    /* synthetic */ zzads(Choreographer choreographer, DisplayManager displayManager, byte[] bArr) {
        super(choreographer, displayManager, null);
        this.zzf = zzfk.zzd(null);
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        if (i == 0) {
            this.zza.postVsyncCallback(this);
        }
    }

    @Override // android.view.Choreographer.VsyncCallback
    public final void onVsync(Choreographer.FrameData frameData) {
        this.zzc = frameData.getFrameTimeNanos();
        Choreographer.FrameTimeline[] frameTimelines = frameData.getFrameTimelines();
        int length = frameTimelines.length;
        long j = C.TIME_UNSET;
        if (length >= 2) {
            long expectedPresentationTimeNanos = frameTimelines[1].getExpectedPresentationTimeNanos() - frameTimelines[0].getExpectedPresentationTimeNanos();
            if (expectedPresentationTimeNanos != 0) {
                j = expectedPresentationTimeNanos;
            }
            this.zzd = j;
        } else {
            this.zzd = C.TIME_UNSET;
        }
        this.zzf.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzadr
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzads zzadsVar = zzads.this;
                zzadsVar.zza.postVsyncCallback(zzadsVar);
            }
        }, 500L);
    }

    @Override // com.google.android.gms.internal.ads.zzadp
    final void zza() {
        super.zza();
        this.zza.postVsyncCallback(this);
    }

    @Override // com.google.android.gms.internal.ads.zzadp
    final void zzb() {
        this.zzb.unregisterDisplayListener(this);
        this.zzf.removeCallbacksAndMessages(null);
        this.zza.removeVsyncCallback(this);
        this.zzc = C.TIME_UNSET;
        this.zzd = C.TIME_UNSET;
    }
}
