package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes5.dex */
final /* synthetic */ class zzbpa implements zzbpe {
    static final /* synthetic */ zzbpa zza = new zzbpa();

    private /* synthetic */ zzbpa() {
    }

    @Override // com.google.android.gms.internal.ads.zzbpe
    public final /* synthetic */ void zza(Object obj, Map map) {
        zzcmb zzcmbVar = (zzcmb) obj;
        zzbpe zzbpeVar = zzbpd.zza;
        String str = (String) map.get("tx");
        String str2 = (String) map.get("ty");
        String str3 = (String) map.get("td");
        try {
            int parseInt = Integer.parseInt(str);
            int parseInt2 = Integer.parseInt(str2);
            int parseInt3 = Integer.parseInt(str3);
            zzbai zzS = zzcmbVar.zzS();
            if (zzS != null) {
                zzS.zzb().zze(parseInt, parseInt2, parseInt3);
            }
        } catch (NumberFormatException unused) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not parse touch parameters from gmsg.");
        }
    }
}
