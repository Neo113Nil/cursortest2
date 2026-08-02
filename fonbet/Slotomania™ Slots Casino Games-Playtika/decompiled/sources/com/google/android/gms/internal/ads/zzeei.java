package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes4.dex */
public final class zzeei implements zzimi {
    private final zzimr zza;
    private final zzimr zzb;
    private final zzimr zzc;
    private final zzimr zzd;

    private zzeei(zzimr zzimrVar, zzimr zzimrVar2, zzimr zzimrVar3, zzimr zzimrVar4, zzimr zzimrVar5) {
        this.zza = zzimrVar;
        this.zzb = zzimrVar2;
        this.zzc = zzimrVar3;
        this.zzd = zzimrVar4;
    }

    public static zzeei zza(zzimr zzimrVar, zzimr zzimrVar2, zzimr zzimrVar3, zzimr zzimrVar4, zzimr zzimrVar5) {
        return new zzeei(zzimrVar, zzimrVar2, zzimrVar3, zzimrVar4, zzimrVar5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0056, code lost:
    
        if (java.lang.Integer.toString(r6).equals(com.google.android.gms.ads.nonagon.signalgeneration.zzv.zzb(com.google.android.gms.ads.nonagon.signalgeneration.zzv.zzc(r2.zzd))) != false) goto L6;
     */
    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ Object zzb() {
        ListenableFuture submit;
        final zzbai zzbaiVar = (zzbai) this.zza.zzb();
        final Context zza = ((zzcng) this.zzb).zza();
        zzfkm zza2 = ((zzdbw) this.zzc).zza();
        long longValue = ((Long) this.zzd.zzb()).longValue();
        zzhbs zzc = zzfno.zzc();
        int intValue = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzdA)).intValue();
        if (intValue != -1) {
        }
        if (com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() - longValue < ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzdC)).intValue()) {
            submit = zzc.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzeed
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    return zzbai.this.zzb().zzk(zza);
                }
            });
            zzimq.zzb(submit);
            return submit;
        }
        submit = zzc.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzeec
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return zzbai.this.zzb().zzl(zza);
            }
        });
        zzimq.zzb(submit);
        return submit;
    }
}
