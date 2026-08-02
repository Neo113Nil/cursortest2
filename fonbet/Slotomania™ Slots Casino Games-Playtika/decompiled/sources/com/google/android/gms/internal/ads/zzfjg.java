package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Pair;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes6.dex */
public final class zzfjg implements zzetg {
    private final Context zza;
    private final Executor zzb;
    private final zzcmx zzc;
    private final zzfix zzd;
    private final zzfhk zze;
    private final zzfkf zzf;
    private final zzfpv zzg;
    private final zzfkl zzh;
    private ListenableFuture zzi;

    public zzfjg(Context context, Executor executor, zzcmx zzcmxVar, zzfhk zzfhkVar, zzfix zzfixVar, zzfkl zzfklVar, zzfkf zzfkfVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzcmxVar;
        this.zze = zzfhkVar;
        this.zzd = zzfixVar;
        this.zzh = zzfklVar;
        this.zzf = zzfkfVar;
        this.zzg = zzcmxVar.zzx();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzk, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final zzdve zze(zzfhi zzfhiVar) {
        zzdve zzp = this.zzc.zzp();
        zzdbo zzdboVar = new zzdbo();
        zzdboVar.zza(this.zza);
        zzdboVar.zzb(((zzfjf) zzfhiVar).zza);
        zzdboVar.zzf(this.zzf);
        zzp.zzd(zzdboVar.zze());
        zzp.zze(new zzdie().zzn());
        return zzp;
    }

    @Override // com.google.android.gms.internal.ads.zzetg
    public final boolean zza(com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzete zzeteVar, zzetf zzetfVar) throws RemoteException {
        zzfps zzfpsVar;
        zzcbk zzcbkVar = new zzcbk(zzmVar, str);
        String str2 = zzcbkVar.zzb;
        if (str2 == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Ad unit ID should not be null for rewarded video ad.");
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfje
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzfjg.this.zzc();
                }
            });
            return false;
        }
        ListenableFuture listenableFuture = this.zzi;
        if (listenableFuture != null && !listenableFuture.isDone()) {
            return false;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzdi)).booleanValue()) {
            com.google.android.gms.ads.internal.client.zzay.zzc();
        }
        if (((Boolean) zzbjx.zzc.zze()).booleanValue()) {
            zzfhk zzfhkVar = this.zze;
            if (zzfhkVar.zzd() != null) {
                zzfps zzd = ((zzdvf) zzfhkVar.zzd()).zzd();
                zzd.zzi(5);
                com.google.android.gms.ads.internal.client.zzm zzmVar2 = zzcbkVar.zza;
                zzd.zzc(zzmVar2.zzp);
                zzd.zzd(zzmVar2.zzm);
                zzfpsVar = zzd;
                Context context = this.zza;
                com.google.android.gms.ads.internal.client.zzm zzmVar3 = zzcbkVar.zza;
                boolean z = zzmVar3.zzf;
                zzflj.zzb(context, z);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzkm)).booleanValue() && z) {
                    this.zzc.zzw().zzc(true);
                }
                Bundle zza = zzdyk.zza(new Pair(zzdyi.PUBLIC_API_CALL.zza(), Long.valueOf(zzmVar3.zzz)), new Pair(zzdyi.DYNAMITE_ENTER.zza(), Long.valueOf(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis())));
                zzfkl zzfklVar = this.zzh;
                zzfklVar.zzg(str2);
                zzfklVar.zzc(com.google.android.gms.ads.internal.client.zzr.zzc());
                zzfklVar.zza(zzmVar3);
                zzfklVar.zzv(zza);
                zzfkm zzA = zzfklVar.zzA();
                zzfpi zzo = zzfpi.zzo(context, zzfpr.zzg(zzA), 5, zzmVar3);
                zzfjf zzfjfVar = new zzfjf(null);
                zzfjfVar.zza = zzA;
                ListenableFuture zzc = this.zze.zzc(new zzfhl(zzfjfVar, null), new zzfhj() { // from class: com.google.android.gms.internal.ads.zzfjd
                    @Override // com.google.android.gms.internal.ads.zzfhj
                    public final /* synthetic */ zzdbm zza(zzfhi zzfhiVar) {
                        return zzfjg.this.zzd(zzfhiVar);
                    }
                }, null);
                this.zzi = zzc;
                zzhbi.zzr(zzc, new zzfjc(this, zzetfVar, zzfpsVar, zzo, zzfjfVar), this.zzb);
                return true;
            }
        }
        zzfpsVar = null;
        Context context2 = this.zza;
        com.google.android.gms.ads.internal.client.zzm zzmVar32 = zzcbkVar.zza;
        boolean z2 = zzmVar32.zzf;
        zzflj.zzb(context2, z2);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzkm)).booleanValue()) {
            this.zzc.zzw().zzc(true);
        }
        Bundle zza2 = zzdyk.zza(new Pair(zzdyi.PUBLIC_API_CALL.zza(), Long.valueOf(zzmVar32.zzz)), new Pair(zzdyi.DYNAMITE_ENTER.zza(), Long.valueOf(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis())));
        zzfkl zzfklVar2 = this.zzh;
        zzfklVar2.zzg(str2);
        zzfklVar2.zzc(com.google.android.gms.ads.internal.client.zzr.zzc());
        zzfklVar2.zza(zzmVar32);
        zzfklVar2.zzv(zza2);
        zzfkm zzA2 = zzfklVar2.zzA();
        zzfpi zzo2 = zzfpi.zzo(context2, zzfpr.zzg(zzA2), 5, zzmVar32);
        zzfjf zzfjfVar2 = new zzfjf(null);
        zzfjfVar2.zza = zzA2;
        ListenableFuture zzc2 = this.zze.zzc(new zzfhl(zzfjfVar2, null), new zzfhj() { // from class: com.google.android.gms.internal.ads.zzfjd
            @Override // com.google.android.gms.internal.ads.zzfhj
            public final /* synthetic */ zzdbm zza(zzfhi zzfhiVar) {
                return zzfjg.this.zzd(zzfhiVar);
            }
        }, null);
        this.zzi = zzc2;
        zzhbi.zzr(zzc2, new zzfjc(this, zzetfVar, zzfpsVar, zzo2, zzfjfVar2), this.zzb);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzetg
    public final boolean zzb() {
        throw null;
    }

    final /* synthetic */ void zzc() {
        this.zzd.zzdJ(zzflo.zzd(6, null, null));
    }

    final /* synthetic */ Executor zzf() {
        return this.zzb;
    }

    final /* synthetic */ zzfix zzg() {
        return this.zzd;
    }

    final /* synthetic */ zzfhk zzh() {
        return this.zze;
    }

    final /* synthetic */ zzfpv zzi() {
        return this.zzg;
    }

    final void zzj(int i) {
        this.zzh.zzj().zza(i);
    }
}
