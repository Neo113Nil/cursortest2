package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
public final class zzcqf extends com.google.android.gms.ads.internal.client.zzcx {
    private final Context zza;
    private final VersionInfoParcel zzb;
    private final zzdwq zzc;
    private final zzeli zzd;
    private final zzerk zze;
    private final zzebk zzf;
    private final zzcdn zzg;
    private final zzdwv zzh;
    private final zzecf zzi;
    private final zzbky zzj;
    private final zzfpv zzk;
    private final zzfli zzl;
    private final zzczs zzm;
    private final zzdyz zzn;
    private final zzedm zzo;
    private boolean zzp = false;
    private final Long zzq = Long.valueOf(com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime());

    zzcqf(Context context, VersionInfoParcel versionInfoParcel, zzdwq zzdwqVar, zzeli zzeliVar, zzerk zzerkVar, zzebk zzebkVar, zzcdn zzcdnVar, zzdwv zzdwvVar, zzecf zzecfVar, zzbky zzbkyVar, zzfpv zzfpvVar, zzfli zzfliVar, zzczs zzczsVar, zzdyz zzdyzVar, zzedm zzedmVar) {
        this.zza = context;
        this.zzb = versionInfoParcel;
        this.zzc = zzdwqVar;
        this.zzd = zzeliVar;
        this.zze = zzerkVar;
        this.zzf = zzebkVar;
        this.zzg = zzcdnVar;
        this.zzh = zzdwvVar;
        this.zzi = zzecfVar;
        this.zzj = zzbkyVar;
        this.zzk = zzfpvVar;
        this.zzl = zzfliVar;
        this.zzm = zzczsVar;
        this.zzn = zzdyzVar;
        this.zzo = zzedmVar;
    }

    final void zzb() {
        if (com.google.android.gms.ads.internal.zzt.zzh().zzo().zzJ()) {
            String zzL = com.google.android.gms.ads.internal.zzt.zzh().zzo().zzL();
            if (com.google.android.gms.ads.internal.zzt.zzo().zze(this.zza, zzL, this.zzb.afmaVersion)) {
                return;
            }
            com.google.android.gms.ads.internal.zzt.zzh().zzo().zzK(false);
            com.google.android.gms.ads.internal.zzt.zzh().zzo().zzM("");
        }
    }

    final /* synthetic */ void zzc() {
        zzflr.zza(this.zza, true);
    }

    final /* synthetic */ void zzd() {
        com.google.android.gms.ads.internal.zzt.zzn().zza(this.zza, this.zzn);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final synchronized void zze() {
        if (this.zzp) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Mobile ads is initialized already.");
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzdi)).booleanValue()) {
            com.google.android.gms.ads.internal.client.zzay.zzc();
        }
        Context context = this.zza;
        zzbie.zza(context);
        com.google.android.gms.ads.internal.zzt.zzh().zze(context, this.zzb, this.zzn);
        this.zzm.zzc();
        com.google.android.gms.ads.internal.zzt.zzj().zza(context);
        this.zzp = true;
        this.zzf.zzc();
        this.zze.zza();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzeV)).booleanValue()) {
            this.zzh.zza();
        }
        this.zzi.zza();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzkB)).booleanValue()) {
            zzcff.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcqe
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzcqf.this.zzb();
                }
            });
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzmp)).booleanValue()) {
            zzcff.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcqb
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzcqf.this.zzx();
                }
            });
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzdT)).booleanValue()) {
            zzcff.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcpz
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzcqf.this.zzc();
                }
            });
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzfA)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzfB)).booleanValue()) {
                zzcff.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcqa
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzcqf.this.zzd();
                    }
                });
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzfO)).booleanValue()) {
            final zzedm zzedmVar = this.zzo;
            zzhbs zzhbsVar = zzcff.zzf;
            Objects.requireNonNull(zzedmVar);
            zzhbsVar.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcpy
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzedm.this.zza();
                }
            });
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final synchronized void zzf(float f) {
        com.google.android.gms.ads.internal.zzt.zzi().zza(f);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final synchronized void zzg(String str) {
        Context context = this.zza;
        zzbie.zza(context);
        if (!TextUtils.isEmpty(str)) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzeT)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzl().zza(context, this.zzb, str, null, this.zzk, null, null, this.zzi.zzs());
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final synchronized void zzh(boolean z) {
        com.google.android.gms.ads.internal.zzt.zzi().zzc(z);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzi(IObjectWrapper iObjectWrapper, String str) {
        if (iObjectWrapper == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Wrapped context is null. Failed to open debug menu.");
            return;
        }
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        if (context == null) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Context is null. Failed to open debug menu.");
        } else {
            com.google.android.gms.ads.internal.util.zzat zzatVar = new com.google.android.gms.ads.internal.util.zzat(context);
            zzatVar.zzc(str);
            zzatVar.zzd(this.zzb.afmaVersion);
            zzatVar.zzb();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003e  */
    @Override // com.google.android.gms.ads.internal.client.zzcy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzj(String str, IObjectWrapper iObjectWrapper) {
        String zzr;
        String str2;
        Runnable runnable;
        Context context = this.zza;
        zzbie.zza(context);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzfa)).booleanValue()) {
            try {
                com.google.android.gms.ads.internal.zzt.zzc();
                zzr = com.google.android.gms.ads.internal.util.zzs.zzr(context);
            } catch (RemoteException | RuntimeException e) {
                com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "NonagonMobileAdsSettingManager_AppId");
            }
            boolean z = true;
            str2 = true != TextUtils.isEmpty(zzr) ? str : zzr;
            if (TextUtils.isEmpty(str2)) {
                boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzeT)).booleanValue();
                zzbhv zzbhvVar = zzbie.zzbD;
                boolean booleanValue2 = booleanValue | ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbhvVar)).booleanValue();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbhvVar)).booleanValue()) {
                    final Runnable runnable2 = (Runnable) ObjectWrapper.unwrap(iObjectWrapper);
                    runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzcqc
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            zzhbs zzhbsVar = zzcff.zzf;
                            final zzcqf zzcqfVar = zzcqf.this;
                            final Runnable runnable3 = runnable2;
                            zzhbsVar.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcqd
                                @Override // java.lang.Runnable
                                public final /* synthetic */ void run() {
                                    zzcqf.this.zzy(runnable3);
                                }
                            });
                        }
                    };
                } else {
                    runnable = null;
                    z = booleanValue2;
                }
                Runnable runnable3 = runnable;
                if (z) {
                    com.google.android.gms.ads.internal.zzt.zzl().zza(this.zza, this.zzb, str2, runnable3, this.zzk, this.zzn, this.zzq, this.zzi.zzs());
                    return;
                }
                return;
            }
            return;
        }
        zzr = "";
        boolean z2 = true;
        if (true != TextUtils.isEmpty(zzr)) {
        }
        if (TextUtils.isEmpty(str2)) {
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final synchronized float zzk() {
        return com.google.android.gms.ads.internal.zzt.zzi().zzb();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final synchronized boolean zzl() {
        return com.google.android.gms.ads.internal.zzt.zzi().zzd();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final String zzm() {
        return this.zzb.afmaVersion;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzn(String str) {
        this.zze.zze(str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzo(zzbuq zzbuqVar) throws RemoteException {
        this.zzl.zzc(zzbuqVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzp(zzbrk zzbrkVar) throws RemoteException {
        this.zzf.zzb(zzbrkVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final List zzq() throws RemoteException {
        return this.zzf.zzd();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzr(com.google.android.gms.ads.internal.client.zzfr zzfrVar) throws RemoteException {
        this.zzg.zzb(this.zza, zzfrVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzs() {
        this.zzf.zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzt(com.google.android.gms.ads.internal.client.zzdk zzdkVar) throws RemoteException {
        this.zzi.zzo(zzdkVar, zzece.API);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzv(String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzkN)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzh().zzt(str);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final synchronized void zzw() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzdh)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzr().zzc();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzdi)).booleanValue()) {
                com.google.android.gms.ads.internal.client.zzay.zzd();
            }
        }
    }

    final /* synthetic */ void zzx() {
        this.zzj.zza(new zzbzq());
    }

    final /* synthetic */ void zzy(Runnable runnable) {
        Preconditions.checkMainThread("Adapters must be initialized on the main thread.");
        Map zzf = com.google.android.gms.ads.internal.zzt.zzh().zzo().zzi().zzf();
        if (zzf.isEmpty()) {
            return;
        }
        if (runnable != null) {
            try {
                runnable.run();
            } catch (Throwable th) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not initialize rewarded ads.", th);
                return;
            }
        }
        if (this.zzc.zzc()) {
            HashMap hashMap = new HashMap();
            Iterator it = zzf.values().iterator();
            while (it.hasNext()) {
                for (zzbuj zzbujVar : ((zzbuk) it.next()).zza) {
                    String str = zzbujVar.zzb;
                    for (String str2 : zzbujVar.zza) {
                        if (!hashMap.containsKey(str2)) {
                            hashMap.put(str2, new ArrayList());
                        }
                        if (str != null) {
                            ((List) hashMap.get(str2)).add(str);
                        }
                    }
                }
            }
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : hashMap.entrySet()) {
                String str3 = (String) entry.getKey();
                try {
                    zzelj zza = this.zzd.zza(str3, jSONObject);
                    if (zza != null) {
                        zzflk zzflkVar = (zzflk) zza.zzb;
                        if (!zzflkVar.zzn() && zzflkVar.zzq()) {
                            zzflkVar.zzr(this.zza, (zzemw) zza.zzc, (List) entry.getValue());
                            StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 45);
                            sb.append("Initialized rewarded video mediation adapter ");
                            sb.append(str3);
                            String sb2 = sb.toString();
                            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                            com.google.android.gms.ads.internal.util.client.zzo.zzd(sb2);
                        }
                    }
                } catch (zzfkt e) {
                    StringBuilder sb3 = new StringBuilder(String.valueOf(str3).length() + 56);
                    sb3.append("Failed to initialize rewarded video mediation adapter \"");
                    sb3.append(str3);
                    sb3.append("\"");
                    String sb4 = sb3.toString();
                    int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzj(sb4, e);
                }
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzu(boolean z) throws RemoteException {
        try {
            zzgbr.zza(this.zza).zzb(z);
        } catch (IOException e) {
            throw new RemoteException(e.getMessage());
        }
    }
}
