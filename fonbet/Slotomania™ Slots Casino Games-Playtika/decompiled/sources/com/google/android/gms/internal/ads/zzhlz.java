package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
final /* synthetic */ class zzhlz implements zzhlf {
    static final /* synthetic */ zzhlz zza = new zzhlz();

    private /* synthetic */ zzhlz() {
    }

    @Override // com.google.android.gms.internal.ads.zzhlf
    public final /* synthetic */ zzhdc zza(zzhdt zzhdtVar, Integer num) {
        int i = zzhma.zza;
        zzhsi zzc = ((zzhls) zzhdtVar).zzb().zzc();
        zzhdd zzd = zzhlg.zza().zzd(zzc.zza());
        if (!zzhlg.zza().zze(zzc.zza())) {
            throw new GeneralSecurityException("Creating new keys is not allowed.");
        }
        zzhsf zzd2 = zzd.zzd(zzc.zzb());
        return new zzhlr(zzhne.zza(zzd2.zza(), zzd2.zzb(), zzd2.zzc(), zzc.zzc(), num), zzhda.zza());
    }
}
