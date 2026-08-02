package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.exoplayer2.offline.DownloadService;
import com.google.android.gms.ads.MobileAds;
import com.ironsource.M6;
import io.sentry.SentryEvent;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
public final class zzdye implements zzdhh, com.google.android.gms.ads.internal.client.zza, zzdcz, zzdcj, zzdfa {
    private final Context zzc;
    private final zzflf zzd;
    private final zzdyz zze;
    private final zzfke zzf;
    private final zzfjt zzg;
    private final zzeju zzh;
    private final String zzi;
    private Boolean zzk;
    private long zzj = -1;
    final AtomicBoolean zza = new AtomicBoolean(false);
    final AtomicBoolean zzb = new AtomicBoolean(false);
    private final boolean zzl = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzhM)).booleanValue();

    public zzdye(Context context, zzflf zzflfVar, zzdyz zzdyzVar, zzfke zzfkeVar, zzfjt zzfjtVar, zzeju zzejuVar, String str) {
        this.zzc = context;
        this.zzd = zzflfVar;
        this.zze = zzdyzVar;
        this.zzf = zzfkeVar;
        this.zzg = zzfjtVar;
        this.zzh = zzejuVar;
        this.zzi = str;
    }

    private final boolean zzf() {
        String str;
        if (this.zzk == null) {
            synchronized (this) {
                if (this.zzk == null) {
                    String str2 = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzce);
                    com.google.android.gms.ads.internal.zzt.zzc();
                    try {
                        str = com.google.android.gms.ads.internal.util.zzs.zzr(this.zzc);
                    } catch (RemoteException unused) {
                        str = null;
                    }
                    boolean z = false;
                    if (str2 != null && str != null) {
                        try {
                            z = Pattern.matches(str2, str);
                        } catch (RuntimeException e) {
                            com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "CsiActionsListener.isPatternMatched");
                        }
                    }
                    this.zzk = Boolean.valueOf(z);
                }
            }
        }
        return this.zzk.booleanValue();
    }

    private final zzdyy zzg(String str) {
        zzfke zzfkeVar = this.zzf;
        zzfkd zzfkdVar = zzfkeVar.zzb;
        zzdyy zza = this.zze.zza();
        zza.zza(zzfkdVar.zzb);
        zzfjt zzfjtVar = this.zzg;
        zza.zzb(zzfjtVar);
        zza.zzc("action", str);
        zza.zzc("ad_format", this.zzi.toUpperCase(Locale.ROOT));
        List list = zzfjtVar.zzt;
        if (!list.isEmpty()) {
            zza.zzc("ancn", (String) list.get(0));
        }
        if (zzfjtVar.zzb()) {
            zza.zzc("device_connectivity", true != com.google.android.gms.ads.internal.zzt.zzh().zzs(this.zzc) ? "offline" : "online");
            zza.zzc("event_timestamp", String.valueOf(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis()));
            zza.zzc("offline_ad", "1");
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzhT)).booleanValue()) {
            boolean zza2 = com.google.android.gms.ads.nonagon.signalgeneration.zzv.zza(zzfkeVar);
            zza.zzc("scar", String.valueOf(zza2));
            if (zza2) {
                com.google.android.gms.ads.internal.client.zzm zzmVar = zzfkeVar.zza.zza.zzd;
                zza.zzc("ragent", zzmVar.zzp);
                zza.zzc("rtype", com.google.android.gms.ads.nonagon.signalgeneration.zzv.zzb(com.google.android.gms.ads.nonagon.signalgeneration.zzv.zzc(zzmVar)));
            }
        }
        return zza;
    }

    private final void zzi(zzdyy zzdyyVar) {
        if (!this.zzg.zzb()) {
            zzdyyVar.zzd();
            return;
        }
        this.zzh.zze(new zzejw(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis(), this.zzf.zzb.zzb.zzb, zzdyyVar.zzg(), 2));
    }

    private final boolean zzj() {
        int i = this.zzg.zzb;
        return i == 2 || i == 5 || i == 6 || i == 7;
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        if (this.zzg.zzb()) {
            zzi(zzg("click"));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdcj
    public final void zzc(com.google.android.gms.ads.internal.client.zze zzeVar) {
        com.google.android.gms.ads.internal.client.zze zzeVar2;
        if (this.zzl) {
            zzdyy zzg = zzg("ifts");
            zzg.zzc("reason", M6.I1);
            int i = zzeVar.zza;
            String str = zzeVar.zzb;
            if (zzeVar.zzc.equals(MobileAds.ERROR_DOMAIN) && (zzeVar2 = zzeVar.zzd) != null && !zzeVar2.zzc.equals(MobileAds.ERROR_DOMAIN)) {
                com.google.android.gms.ads.internal.client.zze zzeVar3 = zzeVar.zzd;
                i = zzeVar3.zza;
                str = zzeVar3.zzb;
            }
            if (i >= 0) {
                zzg.zzc("arec", String.valueOf(i));
            }
            String zza = this.zzd.zza(str);
            if (zza != null) {
                zzg.zzc("areec", zza);
            }
            zzg.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdcj
    public final void zzd(zzdnb zzdnbVar) {
        if (this.zzl) {
            zzdyy zzg = zzg("ifts");
            zzg.zzc("reason", SentryEvent.JsonKeys.EXCEPTION);
            if (!TextUtils.isEmpty(zzdnbVar.getMessage())) {
                zzg.zzc("msg", zzdnbVar.getMessage());
            }
            zzg.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdhh
    public final void zzdH() {
        if (zzf()) {
            zzdyy zzg = zzg("adapter_impression");
            zzg.zzc("imp_type", String.valueOf(this.zzg.zze));
            if (this.zzb.get()) {
                zzg.zzc("po", "1");
                zzg.zzc("pil", String.valueOf(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() - this.zzj));
            } else {
                zzg.zzc("po", "0");
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzoY)).booleanValue() && zzj()) {
                com.google.android.gms.ads.internal.zzt.zzc();
                zzg.zzc(DownloadService.KEY_FOREGROUND, true != com.google.android.gms.ads.internal.util.zzs.zzJ(this.zzc) ? "1" : "0");
                zzg.zzc("fg_show", true != this.zza.get() ? "0" : "1");
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzoZ)).booleanValue() && zzj()) {
                zzg.zzc("fg_al", true != com.google.android.gms.ads.internal.zzt.zzg().zzf() ? "0" : "1");
            }
            zzg.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdhh
    public final void zzdI() {
        if (zzf()) {
            zzg("adapter_shown").zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final void zzdr() {
        if (zzf() || this.zzg.zzb()) {
            zzdyy zzg = zzg("impression");
            zzg.zzc("imp_type", String.valueOf(this.zzg.zze));
            if (this.zzj > 0) {
                zzg.zzc("p_imp_l", String.valueOf(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() - this.zzj));
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzoY)).booleanValue() && zzj()) {
                com.google.android.gms.ads.internal.zzt.zzc();
                zzg.zzc(DownloadService.KEY_FOREGROUND, true != com.google.android.gms.ads.internal.util.zzs.zzJ(this.zzc) ? "1" : "0");
                zzg.zzc("fg_show", true != this.zza.get() ? "0" : "1");
            }
            zzi(zzg);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdcj
    public final void zze() {
        if (this.zzl) {
            zzdyy zzg = zzg("ifts");
            zzg.zzc("reason", "blocked");
            zzg.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdfa
    public final void zzk() {
        if (zzf()) {
            this.zzb.set(true);
            this.zzj = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
            zzdyy zzg = zzg("presentation");
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzoY)).booleanValue() && zzj()) {
                AtomicBoolean atomicBoolean = this.zza;
                com.google.android.gms.ads.internal.zzt.zzc();
                atomicBoolean.set(!com.google.android.gms.ads.internal.util.zzs.zzJ(this.zzc));
                zzg.zzc(DownloadService.KEY_FOREGROUND, true != atomicBoolean.get() ? "0" : "1");
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzoZ)).booleanValue() && zzj()) {
                zzg.zzc("fg_al", true == com.google.android.gms.ads.internal.zzt.zzg().zzf() ? "1" : "0");
            }
            zzg.zzd();
        }
    }
}
