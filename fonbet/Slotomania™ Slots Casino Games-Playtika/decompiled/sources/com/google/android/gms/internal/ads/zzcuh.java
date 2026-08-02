package com.google.android.gms.internal.ads;

import com.braze.Constants;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
public final class zzcuh {
    private final zzdyz zza;
    private final zzfke zzb;

    zzcuh(zzdyz zzdyzVar, zzfke zzfkeVar) {
        this.zza = zzdyzVar;
        this.zzb = zzfkeVar;
    }

    public final void zza(long j, int i) {
        zzdyy zza = this.zza.zza();
        zza.zza(this.zzb.zzb.zzb);
        zza.zzc("action", "ad_closed");
        zza.zzc("show_time", String.valueOf(j));
        zza.zzc("ad_format", "app_open_ad");
        int i2 = i - 1;
        zza.zzc("acr", i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? "u" : Constants.BRAZE_PUSH_ACCENT_KEY : "cb" : "cc" : "bb" : "h");
        zza.zzd();
    }
}
