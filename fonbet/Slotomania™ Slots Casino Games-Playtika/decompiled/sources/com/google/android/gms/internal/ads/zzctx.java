package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
public final class zzctx implements zzimi {
    private final zzimr zza;
    private final zzimr zzb;

    private zzctx(zzimr zzimrVar, zzimr zzimrVar2, zzimr zzimrVar3) {
        this.zza = zzimrVar;
        this.zzb = zzimrVar3;
    }

    public static zzctx zza(zzimr zzimrVar, zzimr zzimrVar2, zzimr zzimrVar3) {
        return new zzctx(zzimrVar, zzimrVar2, zzimrVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set emptySet = ((JSONObject) this.zzb.zzb()) == null ? Collections.emptySet() : Collections.singleton(new zzdke((zzctu) this.zza.zzb(), zzfno.zzc()));
        zzimq.zzb(emptySet);
        return emptySet;
    }
}
