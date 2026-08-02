package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.gamingservices.cloudgaming.internal.SDKAnalyticsEvents;
import com.google.android.gms.ads.nonagon.devicetier.DeviceTierManager;
import com.safedk.android.analytics.brandsafety.m;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
public final class zzdyu {
    private final ConcurrentHashMap zza;
    private final zzcew zzb;
    private final zzfkm zzc;
    private final String zzd;
    private final String zze;
    private final zzbai zzf;
    private final DeviceTierManager zzg;
    private final Bundle zzh = new Bundle();
    private final Context zzi;

    public zzdyu(Context context, zzdze zzdzeVar, zzcew zzcewVar, zzfkm zzfkmVar, String str, String str2, zzbai zzbaiVar, DeviceTierManager deviceTierManager) {
        ActivityManager.MemoryInfo zze;
        ConcurrentHashMap zzd = zzdzeVar.zzd();
        this.zza = zzd;
        this.zzb = zzcewVar;
        this.zzc = zzfkmVar;
        this.zzd = str;
        this.zze = str2;
        this.zzf = zzbaiVar;
        this.zzg = deviceTierManager;
        this.zzi = context;
        zzd.put("ad_format", str2.toUpperCase(Locale.ROOT));
        zzi();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzcN)).booleanValue()) {
            Runtime runtime = Runtime.getRuntime();
            zzd("rt_f", String.valueOf(runtime.freeMemory()));
            zzd("rt_m", String.valueOf(runtime.maxMemory()));
            zzd("rt_t", String.valueOf(runtime.totalMemory()));
            zzd("wv_c", String.valueOf(com.google.android.gms.ads.internal.zzt.zzh().zzl()));
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzcW)).booleanValue() && (zze = com.google.android.gms.ads.internal.util.client.zzf.zze(context)) != null) {
                zzd("mem_avl", String.valueOf(zze.availMem));
                zzd("mem_tt", String.valueOf(zze.totalMem));
                zzd("low_m", true != zze.lowMemory ? "0" : "1");
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzdd)).booleanValue()) {
            zzd("ad_unit_id", zzfkmVar.zzg);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzcX)).booleanValue()) {
            zzd("mem_tier", deviceTierManager.getAdvertisedMemoryTier().name());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzcY)).booleanValue()) {
            zzd("proc_tier", deviceTierManager.getAvailableProcessorTier().name());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzhT)).booleanValue()) {
            int zzg = com.google.android.gms.ads.nonagon.signalgeneration.zzv.zzg(zzfkmVar) - 1;
            if (zzg == 0) {
                zzd.put(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, str);
                zzd.put("scar", "false");
                return;
            }
            if (zzg == 1) {
                zzd.put(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, str);
                zzd.put("se", "query_g");
            } else if (zzg == 2) {
                zzd.put("se", "r_adinfo");
            } else if (zzg != 3) {
                zzd.put("se", "r_both");
            } else {
                zzd.put("se", "r_adstring");
            }
            zzd.put("scar", "true");
            zzd("ragent", zzfkmVar.zzd.zzp);
            zzd("rtype", com.google.android.gms.ads.nonagon.signalgeneration.zzv.zzb(com.google.android.gms.ads.nonagon.signalgeneration.zzv.zzc(zzfkmVar.zzd)));
        }
    }

    public final void zza(zzfke zzfkeVar) {
        zzfkd zzfkdVar = zzfkeVar.zzb;
        List list = zzfkdVar.zza;
        if (!list.isEmpty()) {
            int i = ((zzfjt) list.get(0)).zzb;
            zzd("ad_format", zzfjt.zza(i));
            if (i == 6) {
                this.zza.put("as", true != this.zzb.zzl() ? "0" : "1");
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzcP)).booleanValue()) {
            zzd(m.d, Integer.toString(list.size()));
        }
        zzd("gqi", zzfkdVar.zzb.zzb);
    }

    public final void zzb(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        if (bundle.containsKey(m.R)) {
            zzd("network_coarse", Integer.toString(bundle.getInt(m.R)));
        }
        if (bundle.containsKey("gnt")) {
            zzd("network_fine", Integer.toString(bundle.getInt("gnt")));
        }
    }

    public final Map zzc() {
        return this.zza;
    }

    public final void zzd(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        this.zza.put(str, str2);
    }

    public final synchronized Bundle zze() {
        return this.zzh;
    }

    public final synchronized void zzf(String str, long j) {
        this.zzh.putLong(str, j);
    }

    public final synchronized void zzg(Bundle bundle) {
        this.zzh.putAll(bundle);
    }

    public final void zzh() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzoK)).booleanValue()) {
            zzd("brr", true != this.zzc.zzq ? "0" : "1");
        }
    }

    public final void zzi() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzkT)).booleanValue()) {
            zzbad zzb = this.zzf.zzb();
            if (zzb instanceof com.google.android.gms.ads.internal.zzk) {
                this.zza.put("asv", ((com.google.android.gms.ads.internal.zzk) zzb).zzc());
            } else if (zzb instanceof zzcmw) {
                this.zza.put("asv", ((zzcmw) zzb).zza());
            } else {
                this.zza.put("asv", "NA");
            }
        }
    }
}
