package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.util.MimeTypes;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes3.dex */
final class zzalu {
    public final zzamb zza;
    public final zzame zzb;
    public final zzahb zzc;
    public final zzahc zzd;
    public int zze;
    public zzv zzf;

    public zzalu(zzamb zzambVar, zzame zzameVar, zzahb zzahbVar) {
        this.zza = zzambVar;
        this.zzb = zzameVar;
        this.zzc = zzahbVar;
        this.zzd = MimeTypes.AUDIO_TRUEHD.equals(zzambVar.zzg.zzp) ? new zzahc() : null;
    }
}
