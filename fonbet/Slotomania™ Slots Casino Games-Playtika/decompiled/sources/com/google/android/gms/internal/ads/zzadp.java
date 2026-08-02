package com.google.android.gms.internal.ads;

import android.hardware.display.DisplayManager;
import android.view.Choreographer;
import com.google.android.exoplayer2.C;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes.dex */
abstract class zzadp implements DisplayManager.DisplayListener {
    public static final /* synthetic */ int zze = 0;
    final Choreographer zza;
    final DisplayManager zzb;
    volatile long zzc = C.TIME_UNSET;
    volatile long zzd = C.TIME_UNSET;

    /* synthetic */ zzadp(Choreographer choreographer, DisplayManager displayManager, byte[] bArr) {
        this.zza = choreographer;
        this.zzb = displayManager;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i) {
    }

    void zza() {
        this.zzb.registerDisplayListener(this, zzfk.zzd(null));
    }

    void zzb() {
        throw null;
    }
}
