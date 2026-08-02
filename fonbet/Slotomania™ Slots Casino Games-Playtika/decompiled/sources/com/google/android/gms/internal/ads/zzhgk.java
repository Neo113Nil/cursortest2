package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
final /* synthetic */ class zzhgk implements zzhmw {
    static final /* synthetic */ zzhgk zza = new zzhgk();

    private /* synthetic */ zzhgk() {
    }

    @Override // com.google.android.gms.internal.ads.zzhmw
    public final /* synthetic */ Object zza(zzhdc zzhdcVar) {
        zzhgv zzhgvVar = (zzhgv) zzhdcVar;
        int i = zzhgm.zza;
        String zzb = zzhgvVar.zze().zzb();
        zzhel zzd = zzhgvVar.zze().zzd();
        zzhcu zzb2 = zzhdr.zza(zzb).zzb();
        int i2 = zzhgj.zza;
        try {
            return zzhjn.zzc(new zzhgj(zzhsi.zzd(zzhdz.zza(zzd), zzidb.zza()), zzb2), zzhgvVar.zzc());
        } catch (zzieg e) {
            throw new GeneralSecurityException(e);
        }
    }
}
