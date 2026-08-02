package com.google.android.gms.internal.ads;

import android.view.View;
import com.braze.Constants;
import com.safedk.android.analytics.brandsafety.m;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes6.dex */
final class zzbbf implements zzfyk {
    private final zzfws zza;
    private final zzfxg zzb;
    private final zzbbs zzc;
    private final zzbbe zzd;
    private final zzbao zze;
    private final zzbbu zzf;
    private final zzbbm zzg;
    private final zzbbd zzh;

    zzbbf(zzfws zzfwsVar, zzfxg zzfxgVar, zzbbs zzbbsVar, zzbbe zzbbeVar, zzbao zzbaoVar, zzbbu zzbbuVar, zzbbm zzbbmVar, zzbbd zzbbdVar) {
        this.zza = zzfwsVar;
        this.zzb = zzfxgVar;
        this.zzc = zzbbsVar;
        this.zzd = zzbbeVar;
        this.zze = zzbaoVar;
        this.zzf = zzbbuVar;
        this.zzg = zzbbmVar;
        this.zzh = zzbbdVar;
    }

    private final Map zzf() {
        HashMap hashMap = new HashMap();
        zzfws zzfwsVar = this.zza;
        zzayf zzb = this.zzb.zzb();
        hashMap.put("v", zzfwsVar.zza());
        hashMap.put("gms", Boolean.valueOf(zzfwsVar.zzc()));
        hashMap.put("gv", Long.valueOf(zzb.zzd()));
        hashMap.put(m.w, zzb.zzb());
        hashMap.put("attts", Long.valueOf(zzb.zzh().zzb()));
        hashMap.put("att", zzb.zzh().zzd());
        hashMap.put("attkid", zzb.zzh().zzc());
        hashMap.put("up", Boolean.valueOf(this.zzd.zza()));
        hashMap.put(Constants.BRAZE_PUSH_TITLE_KEY, new Throwable());
        zzbbm zzbbmVar = this.zzg;
        hashMap.put("tcq", Long.valueOf(zzbbmVar.zze()));
        hashMap.put("tpq", Long.valueOf(zzbbmVar.zzd()));
        hashMap.put("tcv", Long.valueOf(zzbbmVar.zzf()));
        hashMap.put("tpv", Long.valueOf(zzbbmVar.zzg()));
        hashMap.put("tchv", Long.valueOf(zzbbmVar.zzi()));
        hashMap.put("tphv", Long.valueOf(zzbbmVar.zzh()));
        hashMap.put("tcc", Long.valueOf(zzbbmVar.zzj()));
        hashMap.put("tpc", Long.valueOf(zzbbmVar.zzk()));
        zzbao zzbaoVar = this.zze;
        if (zzbaoVar != null) {
            hashMap.put("nt", Long.valueOf(zzbaoVar.zzc()));
        }
        zzbbu zzbbuVar = this.zzf;
        hashMap.put("vs", Long.valueOf(zzbbuVar.zzc()));
        hashMap.put("vf", Long.valueOf(zzbbuVar.zzd()));
        return hashMap;
    }

    final void zza(View view) {
        this.zzc.zza(view);
    }

    @Override // com.google.android.gms.internal.ads.zzfyk
    public final Map zzb() {
        return zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzfyk
    public final Map zzc() {
        Map zzf = zzf();
        zzf.put(m.B, this.zzh.zzb());
        return zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzfyk
    public final Map zzd() {
        zzbbs zzbbsVar = this.zzc;
        Map zzf = zzf();
        zzf.put("lts", Long.valueOf(zzbbsVar.zzc()));
        return zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzfyk
    public final Map zze() {
        HashMap hashMap = new HashMap();
        hashMap.put(Constants.BRAZE_PUSH_TITLE_KEY, new Throwable());
        return hashMap;
    }
}
