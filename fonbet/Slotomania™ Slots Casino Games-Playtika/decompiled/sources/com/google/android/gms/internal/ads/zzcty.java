package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.UUID;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
public final class zzcty implements zzimi {
    private final zzimr zza;
    private final zzimr zzb;
    private final zzimr zzc;

    private zzcty(zzimr zzimrVar, zzimr zzimrVar2, zzimr zzimrVar3) {
        this.zza = zzimrVar;
        this.zzb = zzimrVar2;
        this.zzc = zzimrVar3;
    }

    public static zzcty zza(zzimr zzimrVar, zzimr zzimrVar2, zzimr zzimrVar3) {
        return new zzcty(zzimrVar, zzimrVar2, zzimrVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    public final /* bridge */ /* synthetic */ Object zzb() {
        VersionInfoParcel zza = ((zzcnw) this.zza).zza();
        JSONObject jSONObject = (JSONObject) this.zzb.zzb();
        String str = (String) this.zzc.zzb();
        boolean equals = "native".equals(str);
        com.google.android.gms.ads.internal.zzt.zzc();
        return new zzbeb(UUID.randomUUID().toString(), zza, str, jSONObject, false, equals);
    }
}
