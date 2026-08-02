package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
final class zzcdj extends zzcdo {
    final zzimr zza;
    final zzimr zzb;
    final zzimr zzc;
    final zzimr zzd;
    final zzimr zze;
    final zzimr zzf;
    final zzimr zzg;
    final zzimr zzh;
    private final Clock zzj;

    zzcdj(Context context, Clock clock, com.google.android.gms.ads.internal.util.zzg zzgVar, zzcdn zzcdnVar) {
        this.zzj = clock;
        zzimi zza = zzimj.zza(context);
        this.zza = zza;
        zzimi zza2 = zzimj.zza(zzgVar);
        this.zzb = zza2;
        this.zzc = zzimh.zza(zzcdd.zza(zza, zza2));
        zzimi zza3 = zzimj.zza(clock);
        this.zzd = zza3;
        zzimi zza4 = zzimj.zza(zzcdnVar);
        this.zze = zza4;
        zzimr zza5 = zzimh.zza(zzcdf.zza(zza3, zza2, zza4));
        this.zzf = zza5;
        zzcdh zzc = zzcdh.zzc(zza3, zza5);
        this.zzg = zzc;
        this.zzh = zzimh.zza(zzcdu.zza(zza, zzc));
    }

    @Override // com.google.android.gms.internal.ads.zzcdo
    final zzcdg zza() {
        return new zzcdg(this.zzj, (zzcde) this.zzf.zzb());
    }
}
