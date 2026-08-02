package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.InputEvent;
import android.view.MotionEvent;
import android.view.View;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
final class zzgfu implements zzgfe {
    private final ExecutorService zza;
    private final zzimc zzb;
    private final zzimc zzc;
    private final zzgop zzd;
    private final zzimc zze;
    private final zzimx zzf;
    private final zzgco zzg;

    zzgfu(ExecutorService executorService, zzimc zzimcVar, zzimc zzimcVar2, zzgop zzgopVar, zzimc zzimcVar3, zzimx zzimxVar, zzgco zzgcoVar) {
        this.zza = executorService;
        this.zzb = zzimcVar;
        this.zzc = zzimcVar2;
        this.zzd = zzgopVar;
        this.zze = zzimcVar3;
        this.zzf = zzimxVar;
        this.zzg = zzgcoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgfe
    public final String zza() {
        return "1.869425873";
    }

    @Override // com.google.android.gms.internal.ads.zzgfe
    public final ListenableFuture zzb() {
        return zzhbi.zzd(new Callable() { // from class: com.google.android.gms.internal.ads.zzgft
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                zzgfu.this.zzh();
                return null;
            }
        }, this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzgfe
    public final ListenableFuture zzc(Context context) {
        zzggk zzh = ((zzggk) this.zzf.zzb()).zzh(context);
        zzh.zzd(this.zzd.zzb());
        zzh.zzc(zzayf.zzj());
        zzh.zzb(zzgdl.QUERY);
        return zzh.zza().zza().zza();
    }

    @Override // com.google.android.gms.internal.ads.zzgfe
    public final ListenableFuture zzd(Context context, String str, View view, Activity activity) {
        zzggk zzh = ((zzggk) this.zzf.zzb()).zzh(context);
        zzh.zzg(view);
        zzh.zzf(activity);
        zzh.zze(true != this.zzg.zzh() ? "" : null);
        zzh.zzd(this.zzd.zzc(context, view));
        zzh.zzc(zzayf.zzj());
        zzh.zzb(zzgdl.VIEW);
        return zzh.zza().zza().zza();
    }

    @Override // com.google.android.gms.internal.ads.zzgfe
    public final ListenableFuture zze(Context context, String str, View view, Activity activity) {
        zzimc zzimcVar = this.zze;
        Map zzd = this.zzd.zzd();
        ((zzggc) zzimcVar.zzb()).zzb(zzd);
        zzggk zzh = ((zzggk) this.zzf.zzb()).zzh(context);
        zzh.zzg(view);
        zzh.zzf(null);
        zzh.zze(str);
        zzh.zzd(zzd);
        zzh.zzb(zzgdl.CLICK);
        zzh.zzc(zzayf.zzj());
        return zzh.zza().zza().zza();
    }

    @Override // com.google.android.gms.internal.ads.zzgfe
    public final void zzf(InputEvent inputEvent) {
        if (inputEvent instanceof MotionEvent) {
            ((zzggc) this.zze.zzb()).zza((MotionEvent) inputEvent);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgfe
    public final int zzg() {
        return 2;
    }

    final /* synthetic */ Void zzh() {
        ((zzggn) this.zzc.zzb()).zza();
        ((zzghg) this.zzb.zzb()).zza();
        return null;
    }
}
