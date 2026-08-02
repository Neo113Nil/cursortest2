package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes6.dex */
public final class zzfgg implements zzetg {
    private final Context zza;
    private final Executor zzb;
    private final zzcmx zzc;
    private final zzesq zzd;
    private final zzesu zze;
    private final ViewGroup zzf;
    private zzbiz zzg;
    private final zzdfg zzh;
    private final zzfpv zzi;
    private final zzdhl zzj;
    private final zzfkl zzk;
    private ListenableFuture zzl;
    private boolean zzm;
    private com.google.android.gms.ads.internal.client.zze zzn;
    private zzetf zzo;

    public zzfgg(Context context, Executor executor, com.google.android.gms.ads.internal.client.zzr zzrVar, zzcmx zzcmxVar, zzesq zzesqVar, zzesu zzesuVar, zzfkl zzfklVar, zzdhl zzdhlVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzcmxVar;
        this.zzd = zzesqVar;
        this.zze = zzesuVar;
        this.zzk = zzfklVar;
        this.zzh = zzcmxVar.zzd();
        this.zzi = zzcmxVar.zzx();
        this.zzf = new FrameLayout(context);
        this.zzj = zzdhlVar;
        zzfklVar.zzc(zzrVar);
        this.zzm = true;
        this.zzn = null;
        this.zzo = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzt, reason: merged with bridge method [inline-methods] */
    public final void zzn() {
        this.zzl = null;
        final com.google.android.gms.ads.internal.client.zze zzeVar = this.zzn;
        this.zzn = null;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzjs)).booleanValue() && zzeVar != null) {
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfgd
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzfgg.this.zzm(zzeVar);
                }
            });
        }
        zzetf zzetfVar = this.zzo;
        if (zzetfVar != null) {
            zzetfVar.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzetg
    public final boolean zza(com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzete zzeteVar, zzetf zzetfVar) throws RemoteException {
        zzcwe zzh;
        if (str == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Ad unit ID should not be null for banner ad.");
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfge
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzfgg.this.zzl();
                }
            });
            return false;
        }
        if (!zzb()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzdi)).booleanValue()) {
                com.google.android.gms.ads.internal.client.zzay.zzc();
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzkm)).booleanValue() && zzmVar.zzf) {
                this.zzc.zzw().zzc(true);
            }
            Bundle zza = zzdyk.zza(new Pair(zzdyi.PUBLIC_API_CALL.zza(), Long.valueOf(zzmVar.zzz)), new Pair(zzdyi.DYNAMITE_ENTER.zza(), Long.valueOf(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis())));
            zzfkl zzfklVar = this.zzk;
            zzfklVar.zzg(str);
            zzfklVar.zza(zzmVar);
            zzfklVar.zzv(zza);
            Context context = this.zza;
            zzfkm zzA = zzfklVar.zzA();
            zzfpi zzo = zzfpi.zzo(context, zzfpr.zzg(zzA), 3, zzmVar);
            zzfps zzfpsVar = null;
            if (!((Boolean) zzbkk.zze.zze()).booleanValue() || !zzfklVar.zzf().zzk) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzjs)).booleanValue()) {
                    zzcwd zzi = this.zzc.zzi();
                    zzdbo zzdboVar = new zzdbo();
                    zzdboVar.zza(context);
                    zzdboVar.zzb(zzA);
                    zzi.zzl(zzdboVar.zze());
                    zzdie zzdieVar = new zzdie();
                    zzesq zzesqVar = this.zzd;
                    Executor executor = this.zzb;
                    zzdieVar.zzm(zzesqVar, executor);
                    zzdieVar.zze(zzesqVar, executor);
                    zzi.zzm(zzdieVar.zzn());
                    zzi.zzk(new zzeqw(this.zzg));
                    zzi.zzd(new zzdnl(zzdpr.zza, null));
                    zzi.zzg(new zzcwz(this.zzh, this.zzj));
                    zzi.zze(new zzcuw(this.zzf));
                    zzh = zzi.zzh();
                } else {
                    zzcwd zzi2 = this.zzc.zzi();
                    zzdbo zzdboVar2 = new zzdbo();
                    zzdboVar2.zza(context);
                    zzdboVar2.zzb(zzA);
                    zzi2.zzl(zzdboVar2.zze());
                    zzdie zzdieVar2 = new zzdie();
                    zzesq zzesqVar2 = this.zzd;
                    Executor executor2 = this.zzb;
                    zzdieVar2.zzm(zzesqVar2, executor2);
                    zzdieVar2.zzf(zzesqVar2, executor2);
                    zzdieVar2.zzf(this.zze, executor2);
                    zzdieVar2.zzg(zzesqVar2, executor2);
                    zzdieVar2.zzh(zzesqVar2, executor2);
                    zzdieVar2.zza(zzesqVar2, executor2);
                    zzdieVar2.zzb(zzesqVar2, executor2);
                    zzdieVar2.zzc(zzesqVar2, executor2);
                    zzdieVar2.zze(zzesqVar2, executor2);
                    zzdieVar2.zzk(zzesqVar2, executor2);
                    zzi2.zzm(zzdieVar2.zzn());
                    zzi2.zzk(new zzeqw(this.zzg));
                    zzi2.zzd(new zzdnl(zzdpr.zza, null));
                    zzi2.zzg(new zzcwz(this.zzh, this.zzj));
                    zzi2.zze(new zzcuw(this.zzf));
                    zzh = zzi2.zzh();
                }
                if (((Boolean) zzbjx.zzc.zze()).booleanValue()) {
                    zzfpsVar = zzh.zze();
                    zzfpsVar.zzi(3);
                    zzfpsVar.zzc(zzmVar.zzp);
                    zzfpsVar.zzd(zzmVar.zzm);
                }
                this.zzo = zzetfVar;
                zzcyl zzc = zzh.zzc();
                ListenableFuture zzc2 = zzc.zzc(zzc.zzb());
                this.zzl = zzc2;
                zzhbi.zzr(zzc2, new zzfgc(this, zzfpsVar, zzo, zzh), this.zzb);
                return true;
            }
            zzesq zzesqVar3 = this.zzd;
            if (zzesqVar3 != null) {
                zzesqVar3.zzdJ(zzflo.zzd(7, null, null));
            }
        } else if (!this.zzk.zzB()) {
            this.zzm = true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzetg
    public final boolean zzb() {
        ListenableFuture listenableFuture = this.zzl;
        return (listenableFuture == null || listenableFuture.isDone()) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzc() {
        synchronized (this) {
            ListenableFuture listenableFuture = this.zzl;
            if (listenableFuture != null && listenableFuture.isDone()) {
                try {
                    zzcuz zzcuzVar = (zzcuz) this.zzl.get();
                    this.zzl = null;
                    ViewGroup viewGroup = this.zzf;
                    viewGroup.removeAllViews();
                    zzcuzVar.zza();
                    ViewParent parent = zzcuzVar.zza().getParent();
                    if (parent instanceof ViewGroup) {
                        String zze = zzcuzVar.zzn() != null ? zzcuzVar.zzn().zze() : "";
                        StringBuilder sb = new StringBuilder(String.valueOf(zze).length() + 78);
                        sb.append("Banner view provided from ");
                        sb.append(zze);
                        sb.append(" already has a parent view. Removing its old parent.");
                        String sb2 = sb.toString();
                        int i = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzi(sb2);
                        ((ViewGroup) parent).removeView(zzcuzVar.zza());
                    }
                    zzbhv zzbhvVar = zzbie.zzjs;
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbhvVar)).booleanValue()) {
                        zzdfv zzq = zzcuzVar.zzq();
                        zzq.zza(this.zzd);
                        zzq.zzb(this.zze);
                    }
                    viewGroup.addView(zzcuzVar.zza());
                    zzetf zzetfVar = this.zzo;
                    if (zzetfVar != null) {
                        zzetfVar.zzb(zzcuzVar);
                    }
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbhvVar)).booleanValue()) {
                        Executor executor = this.zzb;
                        final zzesq zzesqVar = this.zzd;
                        Objects.requireNonNull(zzesqVar);
                        executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfgf
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                zzesq.this.zzg();
                            }
                        });
                    }
                    if (zzcuzVar.zzh() >= 0) {
                        this.zzm = false;
                        zzdfg zzdfgVar = this.zzh;
                        zzdfgVar.zzd(zzcuzVar.zzh());
                        zzdfgVar.zze(zzcuzVar.zzg());
                    } else {
                        this.zzm = true;
                        this.zzh.zzd(zzcuzVar.zzg());
                    }
                } catch (InterruptedException | ExecutionException e) {
                    zzn();
                    com.google.android.gms.ads.internal.util.zze.zzb("Error occurred while refreshing the ad. Making a new ad request.", e);
                    this.zzm = true;
                    this.zzh.zzc();
                }
            } else if (this.zzl != null) {
                com.google.android.gms.ads.internal.util.zze.zza("Show timer went off but there is an ongoing ad request.");
                this.zzm = true;
            } else {
                com.google.android.gms.ads.internal.util.zze.zza("No ad request was in progress or an ad was cached when show timer went off. Hence requesting a new ad.");
                this.zzm = true;
                this.zzh.zzc();
            }
        }
    }

    public final ViewGroup zzd() {
        return this.zzf;
    }

    public final void zze(zzbiz zzbizVar) {
        this.zzg = zzbizVar;
    }

    public final void zzf(com.google.android.gms.ads.internal.client.zzbe zzbeVar) {
        this.zze.zza(zzbeVar);
    }

    public final zzfkl zzg() {
        return this.zzk;
    }

    public final boolean zzh() {
        Object parent = this.zzf.getParent();
        if (!(parent instanceof View)) {
            return false;
        }
        View view = (View) parent;
        com.google.android.gms.ads.internal.zzt.zzc();
        return com.google.android.gms.ads.internal.util.zzs.zzab(view, view.getContext());
    }

    public final void zzi(zzdfb zzdfbVar) {
        this.zzh.zzq(zzdfbVar, this.zzb);
    }

    public final void zzj() {
        this.zzh.zzd(this.zzj.zzc());
    }

    public final void zzk() {
        this.zzh.zze(this.zzj.zzd());
    }

    final /* synthetic */ void zzl() {
        this.zzd.zzdJ(zzflo.zzd(6, null, null));
    }

    final /* synthetic */ void zzm(com.google.android.gms.ads.internal.client.zze zzeVar) {
        this.zzd.zzdJ(zzeVar);
    }

    final /* synthetic */ zzdfg zzo() {
        return this.zzh;
    }

    final /* synthetic */ zzfpv zzp() {
        return this.zzi;
    }

    final /* synthetic */ zzdhl zzq() {
        return this.zzj;
    }

    final /* synthetic */ boolean zzr() {
        return this.zzm;
    }

    final /* synthetic */ void zzs(com.google.android.gms.ads.internal.client.zze zzeVar) {
        this.zzn = zzeVar;
    }
}
