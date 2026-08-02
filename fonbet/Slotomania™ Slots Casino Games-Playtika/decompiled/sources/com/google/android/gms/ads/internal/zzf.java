package com.google.android.gms.ads.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.ads.zzbhv;
import com.google.android.gms.internal.ads.zzbie;
import com.google.android.gms.internal.ads.zzbtm;
import com.google.android.gms.internal.ads.zzbtq;
import com.google.android.gms.internal.ads.zzbtt;
import com.google.android.gms.internal.ads.zzbtw;
import com.google.android.gms.internal.ads.zzcem;
import com.google.android.gms.internal.ads.zzcff;
import com.google.android.gms.internal.ads.zzcfi;
import com.google.android.gms.internal.ads.zzdyy;
import com.google.android.gms.internal.ads.zzdyz;
import com.google.android.gms.internal.ads.zzfpi;
import com.google.android.gms.internal.ads.zzfpv;
import com.google.android.gms.internal.ads.zzhaq;
import com.google.android.gms.internal.ads.zzhbi;
import com.google.android.gms.internal.ads.zzhbs;
import com.google.common.util.concurrent.ListenableFuture;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes7.dex */
public final class zzf {
    private Context zza;
    private long zzb = 0;

    static final /* synthetic */ ListenableFuture zzd(Long l, zzdyz zzdyzVar, zzfpi zzfpiVar, zzfpv zzfpvVar, JSONObject jSONObject) {
        boolean optBoolean = jSONObject.optBoolean("isSuccessful", false);
        if (optBoolean) {
            zzt.zzh().zzo().zzh(jSONObject.getString("appSettingsJson"));
            if (l != null) {
                zzf(zzdyzVar, "cld_s", zzt.zzk().elapsedRealtime() - l.longValue());
            }
        }
        String optString = jSONObject.optString("errorReason", "");
        if (!TextUtils.isEmpty(optString)) {
            zzfpiVar.zzk(optString);
        }
        zzfpiVar.zzd(optBoolean);
        zzfpvVar.zzb(zzfpiVar.zzm());
        return zzhbi.zza(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void zzf(zzdyz zzdyzVar, String str, long j) {
        if (zzdyzVar != null) {
            if (((Boolean) zzba.zzc().zzd(zzbie.zzod)).booleanValue()) {
                zzdyy zza = zzdyzVar.zza();
                zza.zzc("action", "lat_init");
                zza.zzc(str, Long.toString(j));
                zza.zzd();
            }
        }
    }

    public final void zza(Context context, VersionInfoParcel versionInfoParcel, String str, Runnable runnable, zzfpv zzfpvVar, zzdyz zzdyzVar, Long l, boolean z) {
        zzc(context, versionInfoParcel, true, null, str, null, runnable, zzfpvVar, zzdyzVar, l, z);
    }

    public final void zzb(Context context, VersionInfoParcel versionInfoParcel, String str, zzcem zzcemVar, zzfpv zzfpvVar, boolean z) {
        zzc(context, versionInfoParcel, false, zzcemVar, zzcemVar != null ? zzcemVar.zze() : null, str, null, zzfpvVar, null, null, z);
    }

    final void zzc(Context context, VersionInfoParcel versionInfoParcel, boolean z, zzcem zzcemVar, String str, String str2, Runnable runnable, final zzfpv zzfpvVar, final zzdyz zzdyzVar, final Long l, boolean z2) {
        zzfpi zzfpiVar;
        Exception exc;
        ListenableFuture zzb;
        zzhaq zzhaqVar;
        PackageInfo packageInfo;
        if (zzt.zzk().elapsedRealtime() - this.zzb < 5000) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Not retrying to fetch app settings");
            return;
        }
        this.zzb = zzt.zzk().elapsedRealtime();
        if (zzcemVar != null && !TextUtils.isEmpty(zzcemVar.zzd())) {
            if (zzt.zzk().currentTimeMillis() - zzcemVar.zzb() <= ((Long) zzba.zzc().zzd(zzbie.zzfb)).longValue() && zzcemVar.zzc()) {
                return;
            }
        }
        if (context == null) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Context not provided to fetch application settings");
            return;
        }
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("App settings could not be fetched. Required parameters missing");
            return;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context;
        }
        this.zza = applicationContext;
        final zzfpi zzn = zzfpi.zzn(context, 4);
        zzn.zza();
        zzbtw zzb2 = zzt.zzr().zzb(this.zza, versionInfoParcel, zzfpvVar);
        zzbtq zzbtqVar = zzbtt.zza;
        zzbtm zza = zzb2.zza("google.afma.config.fetchAppSettings", zzbtqVar, zzbtqVar);
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                if (!TextUtils.isEmpty(str)) {
                    jSONObject.put("app_id", str);
                } else if (!TextUtils.isEmpty(str2)) {
                    jSONObject.put("ad_unit_id", str2);
                }
                jSONObject.put("is_init", z);
                jSONObject.put("pn", context.getPackageName());
                zzbhv zzbhvVar = zzbie.zza;
                jSONObject.put("experiment_ids", TextUtils.join(",", zzba.zzb().zze()));
                jSONObject.put("js", versionInfoParcel.afmaVersion);
                if (((Boolean) zzba.zzc().zzd(zzbie.zzkS)).booleanValue()) {
                    jSONObject.put("inspector_enabled", z2);
                }
                try {
                    ApplicationInfo applicationInfo = this.zza.getApplicationInfo();
                    if (applicationInfo != null && (packageInfo = Wrappers.packageManager(context).getPackageInfo(applicationInfo.packageName, 0)) != null) {
                        jSONObject.put("version", packageInfo.versionCode);
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    com.google.android.gms.ads.internal.util.zze.zza("Error fetching PackageInfo.");
                }
                zzb = zza.zzb(jSONObject);
                try {
                    zzhaqVar = new zzhaq(this) { // from class: com.google.android.gms.ads.internal.zzd
                        @Override // com.google.android.gms.internal.ads.zzhaq
                        public final /* synthetic */ ListenableFuture zza(Object obj) {
                            return zzf.zzd(l, zzdyzVar, zzn, zzfpvVar, (JSONObject) obj);
                        }
                    };
                    zzfpiVar = zzn;
                } catch (Exception e) {
                    e = e;
                    zzfpiVar = zzn;
                }
            } catch (Exception e2) {
                exc = e2;
                zzfpiVar = zzn;
                int i4 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Error requesting application settings", exc);
                zzfpiVar.zzj(exc);
                zzfpiVar.zzd(false);
                zzfpvVar.zzb(zzfpiVar.zzm());
            }
        } catch (Exception e3) {
            e = e3;
            zzfpiVar = zzn;
        }
        try {
            zzhbs zzhbsVar = zzcff.zzh;
            ListenableFuture zzj = zzhbi.zzj(zzb, zzhaqVar, zzhbsVar);
            if (runnable != null) {
                zzb.addListener(runnable, zzhbsVar);
            }
            if (l != null) {
                zzb.addListener(new Runnable(this) { // from class: com.google.android.gms.ads.internal.zze
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzf.zzf(zzdyzVar, "cld_r", zzt.zzk().elapsedRealtime() - l.longValue());
                    }
                }, zzhbsVar);
            }
            if (((Boolean) zzba.zzc().zzd(zzbie.zziG)).booleanValue()) {
                zzcfi.zzb(zzj, "ConfigLoader.maybeFetchNewAppSettings");
            } else {
                zzcfi.zza(zzj, "ConfigLoader.maybeFetchNewAppSettings", zzhbsVar);
            }
        } catch (Exception e4) {
            e = e4;
            exc = e;
            int i42 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error requesting application settings", exc);
            zzfpiVar.zzj(exc);
            zzfpiVar.zzd(false);
            zzfpvVar.zzb(zzfpiVar.zzm());
        }
    }
}
