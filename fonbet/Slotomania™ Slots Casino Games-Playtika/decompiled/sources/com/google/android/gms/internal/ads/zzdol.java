package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.UUID;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
public final class zzdol implements zzimi {
    private final zzimr zza;

    private zzdol(zzimr zzimrVar, zzimr zzimrVar2) {
        this.zza = zzimrVar;
    }

    public static zzdol zza(zzimr zzimrVar, zzimr zzimrVar2) {
        return new zzdol(zzimrVar, zzimrVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    public final /* synthetic */ Object zzb() {
        VersionInfoParcel zza = ((zzcnw) this.zza).zza();
        com.google.android.gms.ads.internal.zzt.zzc();
        return new zzbeb(UUID.randomUUID().toString(), zza, "native", new JSONObject(), false, true);
    }
}
