package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
final class zzcpj implements zzehd {
    private final zzcol zza;
    private final zzcpi zzb;
    private zzefk zzc;

    /* synthetic */ zzcpj(zzcol zzcolVar, zzcpi zzcpiVar, byte[] bArr) {
        this.zza = zzcolVar;
        this.zzb = zzcpiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzehd
    public final zzehe zza() {
        zzimq.zzc(this.zzc, zzefk.class);
        return new zzcpk(this.zza, this.zzb, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzehd
    public final /* bridge */ /* synthetic */ zzehd zzb(zzefk zzefkVar) {
        this.zzc = zzefkVar;
        return this;
    }
}
