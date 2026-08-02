package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes5.dex */
public final class zzeoy implements zzhaq {
    private final zzfoy zza;
    private final zzdch zzb;
    private final zzfrk zzc;
    private final zzfro zzd;
    private final Executor zze;
    private final ScheduledExecutorService zzf;
    private final zzcxk zzg;
    private final zzeor zzh;
    private final zzell zzi;
    private final Context zzj;
    private final zzfps zzk;
    private final zzeob zzl;
    private final zzdyu zzm;

    zzeoy(Context context, zzfoy zzfoyVar, zzeor zzeorVar, zzdch zzdchVar, zzfrk zzfrkVar, zzfro zzfroVar, zzcxk zzcxkVar, Executor executor, ScheduledExecutorService scheduledExecutorService, zzell zzellVar, zzfps zzfpsVar, zzeob zzeobVar, zzdyu zzdyuVar) {
        this.zzj = context;
        this.zza = zzfoyVar;
        this.zzh = zzeorVar;
        this.zzb = zzdchVar;
        this.zzc = zzfrkVar;
        this.zzd = zzfroVar;
        this.zzg = zzcxkVar;
        this.zze = executor;
        this.zzf = scheduledExecutorService;
        this.zzi = zzellVar;
        this.zzk = zzfpsVar;
        this.zzl = zzeobVar;
        this.zzm = zzdyuVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0039, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbie.zzgA)).booleanValue() == false) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006b A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static String zzb(zzfke zzfkeVar) {
        String str = "No fill.";
        String str2 = true != ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzgB)).booleanValue() ? "No ad config." : "No fill.";
        zzfjw zzfjwVar = zzfkeVar.zzb.zzb;
        int i = zzfjwVar.zzf;
        if (i != 0) {
            if (i < 200 || i >= 300) {
                if (i < 300 || i >= 400) {
                    StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 35);
                    sb.append("Received error HTTP response code: ");
                    sb.append(i);
                    str = sb.toString();
                } else {
                    str = "No location header to follow redirect or too many redirects.";
                }
            }
            zzfjv zzfjvVar = zzfjwVar.zzj;
            return zzfjvVar == null ? zzfjvVar.zza() : str;
        }
        str = str2;
        zzfjv zzfjvVar2 = zzfjwVar.zzj;
        if (zzfjvVar2 == null) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhaq
    public final /* synthetic */ ListenableFuture zza(Object obj) throws Exception {
        int i;
        Bundle bundle;
        final zzfke zzfkeVar = (zzfke) obj;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzcN)).booleanValue() && (bundle = zzfkeVar.zzb.zzd) != null) {
            this.zzm.zzg(bundle);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzcO)).booleanValue()) {
            this.zzm.zzf(zzdyi.RENDERING_START.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        String zzb = zzb(zzfkeVar);
        zzell zzellVar = this.zzi;
        zzfkd zzfkdVar = zzfkeVar.zzb;
        zzfjw zzfjwVar = zzfkdVar.zzb;
        zzellVar.zza(zzfjwVar);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzjA)).booleanValue() && (i = zzfjwVar.zzf) != 0 && (i < 200 || i >= 300)) {
            return zzhbi.zzc(new zzeov(3, zzb));
        }
        String str = zzfjwVar.zzq;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzew)).booleanValue() || TextUtils.isEmpty(str)) {
            for (zzfjt zzfjtVar : zzfkdVar.zza) {
                zzellVar.zzb(zzfjtVar);
                Iterator it = zzfjtVar.zza.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        zzellVar.zze(zzfjtVar, 0L, zzflo.zzd(1, null, null));
                        break;
                    }
                    zzelg zza = this.zzg.zza(zzfjtVar.zzb, (String) it.next());
                    if (zza == null || !zza.zza(zzfkeVar, zzfjtVar)) {
                    }
                }
            }
        } else {
            zzellVar.zzc(str, zzfkdVar.zza);
        }
        zzdch zzdchVar = this.zzb;
        zzctb zzctbVar = new zzctb(zzfkeVar, this.zzd, this.zzc);
        Executor executor = this.zze;
        zzdchVar.zzq(zzctbVar, executor);
        if (zzfjwVar.zzr > 1) {
            return this.zzl.zza(zzfkeVar);
        }
        String zzb2 = zzb(zzfkeVar);
        zzfoy zzfoyVar = this.zza;
        zzfos zzfosVar = zzfos.RENDER_CONFIG_INIT;
        Objects.requireNonNull(zzfoyVar);
        zzfof zzi = zzfoj.zza(zzhbi.zzc(new zzeov(3, zzb2)), zzfosVar, zzfoyVar).zzi();
        final zzeor zzeorVar = this.zzh;
        zzeorVar.zza();
        int i2 = 0;
        for (final zzfjt zzfjtVar2 : zzfkdVar.zza) {
            Iterator it2 = zzfjtVar2.zza.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                String str2 = (String) it2.next();
                final zzelg zza2 = this.zzg.zza(zzfjtVar2.zzb, str2);
                if (zza2 != null && zza2.zza(zzfkeVar, zzfjtVar2)) {
                    zzfop zza3 = zzfoyVar.zza(zzfos.RENDER_CONFIG_WATERFALL, zzi);
                    StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 15 + String.valueOf(str2).length());
                    sb.append("render-config-");
                    sb.append(i2);
                    sb.append("-");
                    sb.append(str2);
                    zzi = zza3.zza(sb.toString()).zzg(Throwable.class, new zzhaq() { // from class: com.google.android.gms.internal.ads.zzeox
                        @Override // com.google.android.gms.internal.ads.zzhaq
                        public final /* synthetic */ ListenableFuture zza(Object obj2) {
                            return zzeoy.this.zzc(zzfjtVar2, zzfkeVar, zza2, (Throwable) obj2);
                        }
                    }).zzi();
                    break;
                }
            }
            i2++;
        }
        Objects.requireNonNull(zzeorVar);
        zzi.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeow
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzeor.this.zzb();
            }
        }, executor);
        return zzi;
    }

    final /* synthetic */ ListenableFuture zzc(zzfjt zzfjtVar, zzfke zzfkeVar, zzelg zzelgVar, Throwable th) {
        zzfpi zzn = zzfpi.zzn(this.zzj, 12);
        zzn.zzi(zzfjtVar.zzE);
        zzn.zza();
        ListenableFuture zzi = zzhbi.zzi(zzelgVar.zzb(zzfkeVar, zzfjtVar), zzfjtVar.zzR, TimeUnit.MILLISECONDS, this.zzf);
        this.zzh.zze(zzfkeVar, zzfjtVar, zzi, this.zzc);
        zzfpr.zzd(zzi, this.zzk, zzn);
        return zzi;
    }
}
