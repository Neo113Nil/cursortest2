package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.InputEvent;
import android.view.MotionEvent;
import android.view.View;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.File;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
final class zzgkz implements zzgko {
    private final zzfyj zza;
    private final zzgmj zzb;
    private final zzgok zzc;
    private final zzgpu zzd;
    private final ExecutorService zze;
    private final AtomicReference zzf = new AtomicReference("2.869425873.-1");

    zzgkz(zzfyj zzfyjVar, zzgmj zzgmjVar, zzgok zzgokVar, zzgpu zzgpuVar, ExecutorService executorService) {
        this.zza = zzfyjVar;
        this.zzb = zzgmjVar;
        this.zzc = zzgokVar;
        this.zzd = zzgpuVar;
        this.zze = executorService;
    }

    @Override // com.google.android.gms.internal.ads.zzgko
    public final String zza() {
        return (String) this.zzf.get();
    }

    @Override // com.google.android.gms.internal.ads.zzgko
    public final ListenableFuture zzb() {
        return (zzhba) zzhbi.zzk((zzhba) zzhbi.zzk((zzhba) zzhbi.zzj((zzhba) zzhbi.zzk((zzhba) zzhbi.zzg(zzhba.zzw(this.zzb.zzb()), Throwable.class, zzgky.zza, zzhbz.zza()), new zzgsn() { // from class: com.google.android.gms.internal.ads.zzgkq
            @Override // com.google.android.gms.internal.ads.zzgsn
            public final /* synthetic */ Object apply(Object obj) {
                zzgkz.this.zzh((zzgfd) obj);
                return new Boolean(true);
            }
        }, zzhbz.zza()), new zzhaq() { // from class: com.google.android.gms.internal.ads.zzgkr
            @Override // com.google.android.gms.internal.ads.zzhaq
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return zzgkz.this.zzi((Boolean) obj);
            }
        }, zzhbz.zza()), new zzgsn() { // from class: com.google.android.gms.internal.ads.zzgks
            @Override // com.google.android.gms.internal.ads.zzgsn
            public final /* synthetic */ Object apply(Object obj) {
                zzgkz.this.zzj((zzfxz) obj);
                return new Boolean(true);
            }
        }, zzhbz.zza()), zzgkt.zza, zzhbz.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgko
    public final ListenableFuture zzc(final Context context) {
        return zzhbi.zzd(new Callable() { // from class: com.google.android.gms.internal.ads.zzgku
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return zzgkz.this.zzk(context);
            }
        }, this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzgko
    public final ListenableFuture zzd(final Context context, String str, final View view, final Activity activity) {
        final String str2 = null;
        return zzhbi.zzd(new Callable(context, str2, view, activity) { // from class: com.google.android.gms.internal.ads.zzgkv
            private final /* synthetic */ Context zzb;
            private final /* synthetic */ View zzc;
            private final /* synthetic */ Activity zzd;

            {
                this.zzc = view;
                this.zzd = activity;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return zzgkz.this.zzl(this.zzb, null, this.zzc, this.zzd);
            }
        }, this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzgko
    public final ListenableFuture zze(final Context context, final String str, final View view, Activity activity) {
        final Activity activity2 = null;
        return zzhbi.zzd(new Callable(context, str, view, activity2) { // from class: com.google.android.gms.internal.ads.zzgkw
            private final /* synthetic */ Context zzb;
            private final /* synthetic */ String zzc;
            private final /* synthetic */ View zzd;

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return zzgkz.this.zzm(this.zzb, this.zzc, this.zzd, null);
            }
        }, this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzgko
    public final void zzf(InputEvent inputEvent) {
        zzfwt zzb = this.zza.zzb();
        if (zzb == null) {
            this.zzd.zzb(15004);
        } else if (inputEvent instanceof MotionEvent) {
            try {
                zzb.zzd(null, (MotionEvent) inputEvent);
            } catch (zzfyi e) {
                this.zzd.zzd(15005, e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgko
    public final int zzg() {
        return 3;
    }

    final /* synthetic */ boolean zzh(zzgfd zzgfdVar) {
        if (this.zzc.zzb(zzgfdVar) && zzgfdVar != null) {
            return true;
        }
        this.zzd.zzb(15003);
        throw new zzgkp(1);
    }

    final /* synthetic */ ListenableFuture zzi(Boolean bool) {
        return this.zzb.zze();
    }

    final /* synthetic */ boolean zzj(final zzfxz zzfxzVar) {
        if (zzfxzVar == null) {
            throw new zzgkp(3);
        }
        File zzb = zzfxzVar.zzb();
        if (Build.VERSION.SDK_INT >= 34) {
            zzb.setReadOnly();
        }
        this.zzd.zzf(15002, new Runnable() { // from class: com.google.android.gms.internal.ads.zzgkx
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzgkz.this.zzn(zzfxzVar);
            }
        });
        return true;
    }

    final /* synthetic */ String zzk(Context context) {
        zzfwt zzb = this.zza.zzb();
        if (zzb == null) {
            this.zzd.zzb(15004);
            return "";
        }
        String zza = zzb.zza(context, null);
        if (zza != null) {
            return zza;
        }
        this.zzd.zzb(15006);
        return "";
    }

    final /* synthetic */ String zzl(Context context, String str, View view, Activity activity) {
        zzfwt zzb = this.zza.zzb();
        if (zzb == null) {
            this.zzd.zzb(15004);
            return "";
        }
        String zzb2 = zzb.zzb(context, null, view, activity);
        if (zzb2 != null) {
            return zzb2;
        }
        this.zzd.zzb(15007);
        return "";
    }

    final /* synthetic */ String zzm(Context context, String str, View view, Activity activity) {
        zzfwt zzb = this.zza.zzb();
        if (zzb == null) {
            this.zzd.zzb(15004);
            return "";
        }
        String zzc = zzb.zzc(context, null, str, view, null);
        if (zzc != null) {
            return zzc;
        }
        this.zzd.zzb(15008);
        return "";
    }

    final /* synthetic */ void zzn(zzfxz zzfxzVar) {
        if (!this.zza.zza(zzfxzVar)) {
            throw new zzgkp(2);
        }
        AtomicReference atomicReference = this.zzf;
        String zza = zzfxzVar.zza().zza();
        String.valueOf(zza);
        atomicReference.set("2.869425873.".concat(String.valueOf(zza)));
    }
}
