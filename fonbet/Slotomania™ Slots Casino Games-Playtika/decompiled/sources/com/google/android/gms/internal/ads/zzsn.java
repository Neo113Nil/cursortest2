package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
final class zzsn extends AudioTrack.StreamEventCallback {
    final /* synthetic */ zzsp zza;

    zzsn(zzsp zzspVar) {
        Objects.requireNonNull(zzspVar);
        this.zza = zzspVar;
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onDataRequest(AudioTrack audioTrack, int i) {
        zzee zzu = this.zza.zza.zzu();
        zzu.zze(-1, zzsm.zza);
        zzu.zzf();
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onPresentationEnded(AudioTrack audioTrack) {
        zzee zzu = this.zza.zza.zzu();
        zzu.zze(-1, zzsk.zza);
        zzu.zzf();
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onTearDown(AudioTrack audioTrack) {
        zzee zzu = this.zza.zza.zzu();
        zzu.zze(-1, zzsl.zza);
        zzu.zzf();
    }
}
