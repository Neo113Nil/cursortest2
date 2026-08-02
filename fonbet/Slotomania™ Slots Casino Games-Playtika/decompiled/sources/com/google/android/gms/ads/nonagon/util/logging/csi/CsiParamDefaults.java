package com.google.android.gms.ads.nonagon.util.logging.csi;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.text.TextUtils;
import androidx.exifinterface.media.ExifInterface;
import com.braze.Constants;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.ads.nonagon.devicetier.DeviceTierManager;
import com.google.android.gms.internal.ads.zzbhv;
import com.google.android.gms.internal.ads.zzbie;
import com.google.android.gms.internal.ads.zzgtn;
import com.ironsource.M6;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes5.dex */
public class CsiParamDefaults {
    private final Context zza;
    private final String zzb;
    private final String zzc;
    private final PackageInfo zzd;
    private final String zze;
    private final DeviceTierManager zzf;

    public CsiParamDefaults(Context context, VersionInfoParcel versionInfoParcel, PackageInfo packageInfo, String str, DeviceTierManager deviceTierManager) {
        this.zza = context;
        this.zzb = context.getPackageName();
        this.zzc = versionInfoParcel.afmaVersion;
        this.zzd = packageInfo;
        this.zze = str;
        this.zzf = deviceTierManager;
    }

    public void set(Map<String, String> map) {
        PackageInfo packageInfo;
        map.put(Constants.BRAZE_PUSH_SUMMARY_TEXT_KEY, "gmob_sdk");
        map.put("v", ExifInterface.GPS_MEASUREMENT_3D);
        map.put("os", Build.VERSION.RELEASE);
        map.put("api_v", Build.VERSION.SDK);
        zzt.zzc();
        map.put("device", zzs.zzt());
        map.put("app", this.zzb);
        zzt.zzc();
        Context context = this.zza;
        map.put("is_lite_sdk", true != zzs.zzH(context) ? "0" : "1");
        zzbhv zzbhvVar = zzbie.zza;
        List zzf = zzba.zzb().zzf();
        if (((Boolean) zzba.zzc().zzd(zzbie.zzhP)).booleanValue()) {
            zzf.addAll(zzt.zzh().zzo().zzi().zzh());
        }
        map.put("e", TextUtils.join(",", zzf));
        map.put("sdkVersion", this.zzc);
        if (((Boolean) zzba.zzc().zzd(zzbie.zzmJ)).booleanValue()) {
            zzt.zzc();
            map.put("is_bstar", true == zzs.zzE(context) ? "1" : "0");
        }
        if (((Boolean) zzba.zzc().zzd(zzbie.zzkN)).booleanValue()) {
            if (((Boolean) zzba.zzc().zzd(zzbie.zzdg)).booleanValue()) {
                map.put(M6.L, zzgtn.zza(zzt.zzh().zzu()));
            }
        }
        if (((Boolean) zzba.zzc().zzd(zzbie.zzmR)).booleanValue()) {
            map.put("uev", zzgtn.zza(this.zze));
        }
        if (((Boolean) zzba.zzc().zzd(zzbie.zzcZ)).booleanValue()) {
            map.put("mem_tier", this.zzf.getAdvertisedMemoryTier().name());
        }
        if (((Boolean) zzba.zzc().zzd(zzbie.zzda)).booleanValue()) {
            map.put("proc_tier", this.zzf.getAvailableProcessorTier().name());
        }
        if (!((Boolean) zzba.zzc().zzd(zzbie.zzdb)).booleanValue() || (packageInfo = this.zzd) == null) {
            return;
        }
        map.put("vc", String.valueOf(packageInfo.versionCode));
        map.put("vn", String.valueOf(packageInfo.versionName));
    }
}
