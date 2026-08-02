package com.google.android.gms.internal.ads;

import android.hardware.display.DisplayManager;
import android.view.Choreographer;
import com.google.android.exoplayer2.C;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes.dex */
final class zzadq extends zzadp implements Choreographer.FrameCallback {
    /* synthetic */ zzadq(Choreographer choreographer, DisplayManager displayManager, byte[] bArr) {
        super(choreographer, displayManager, null);
    }

    private static long zzc(DisplayManager displayManager) {
        if (displayManager.getDisplay(0) != null) {
            return (long) (1.0E9d / r4.getRefreshRate());
        }
        zzef.zzc("VideoFrameReleaseHelper", "Unable to query display refresh rate");
        return C.TIME_UNSET;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.zzc = j;
        this.zza.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        if (i == 0) {
            this.zza.postFrameCallback(this);
            this.zzd = zzc(this.zzb);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzadp
    final void zza() {
        super.zza();
        this.zza.postFrameCallback(this);
        this.zzd = zzc(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzadp
    final void zzb() {
        this.zzb.unregisterDisplayListener(this);
        this.zza.removeFrameCallback(this);
        this.zzc = C.TIME_UNSET;
        this.zzd = C.TIME_UNSET;
    }
}
