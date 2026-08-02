package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes6.dex */
final class zzfhg {
    private final zzfmb zza;
    private final zzdbn zzb;
    private final Executor zzc;
    private zzfhe zzd;

    public zzfhg(zzfmb zzfmbVar, zzdbn zzdbnVar, Executor executor) {
        this.zza = zzfmbVar;
        this.zzb = zzdbnVar;
        this.zzc = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Deprecated
    /* renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final zzfml zzb() {
        zzfkm zzb = this.zzb.zzb();
        return this.zza.zzd(zzb.zzd, zzb.zzg, zzb.zzk);
    }

    public final ListenableFuture zza() {
        ListenableFuture listenableFuture;
        zzfhe zzfheVar = this.zzd;
        if (zzfheVar != null) {
            return zzhbi.zza(zzfheVar);
        }
        if (((Boolean) zzbkl.zza.zze()).booleanValue()) {
            zzhba zzw = zzhba.zzw(this.zzb.zza().zze(this.zza.zze()));
            zzfhd zzfhdVar = new zzfhd(this);
            Executor executor = this.zzc;
            listenableFuture = (zzhba) zzhbi.zzg((zzhba) zzhbi.zzk(zzw, zzfhdVar, executor), zzegf.class, new zzfhc(this), executor);
        } else {
            zzfhe zzfheVar2 = new zzfhe(null, zzb(), null);
            this.zzd = zzfheVar2;
            listenableFuture = zzhbi.zza(zzfheVar2);
        }
        return zzhbi.zzk(listenableFuture, zzfhf.zza, this.zzc);
    }

    final /* synthetic */ zzfhe zzc() {
        return this.zzd;
    }

    final /* synthetic */ void zzd(zzfhe zzfheVar) {
        this.zzd = zzfheVar;
    }
}
