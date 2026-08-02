package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes5.dex */
final class zzbol implements zzbpe {
    zzbol() {
    }

    @Override // com.google.android.gms.internal.ads.zzbpe
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcki zzckiVar = (zzcki) obj;
        if (zzckiVar.zzaz() != null) {
            zzckiVar.zzaz().zza();
        }
        com.google.android.gms.ads.internal.overlay.zzm zzL = zzckiVar.zzL();
        if (zzL != null) {
            zzL.zzb();
            return;
        }
        com.google.android.gms.ads.internal.overlay.zzm zzM = zzckiVar.zzM();
        if (zzM != null) {
            zzM.zzb();
        } else {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("A GMSG tried to close something that wasn't an overlay.");
        }
    }
}
