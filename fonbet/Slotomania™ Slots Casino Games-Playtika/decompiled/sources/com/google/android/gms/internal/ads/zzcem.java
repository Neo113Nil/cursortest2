package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
public final class zzcem {
    private String zzd;
    private String zze;
    private long zzf;
    private JSONObject zzg;
    private boolean zzh;
    private boolean zzj;
    private final List zza = new ArrayList();
    private final List zzb = new ArrayList();
    private final Map zzc = new HashMap();
    private final List zzi = new ArrayList();

    public zzcem(String str, long j) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        JSONArray optJSONArray;
        JSONObject optJSONObject3;
        this.zzd = "";
        this.zzh = false;
        this.zzj = false;
        this.zze = str;
        this.zzf = j;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            this.zzg = new JSONObject(str);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zznc)).booleanValue() && zzj()) {
                return;
            }
            if (this.zzg.optInt("status", -1) != 1) {
                this.zzh = false;
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("App settings could not be fetched successfully.");
                return;
            }
            this.zzh = true;
            this.zzd = this.zzg.optString("app_id");
            JSONArray optJSONArray2 = this.zzg.optJSONArray("ad_unit_id_settings");
            if (optJSONArray2 != null) {
                for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                    JSONObject jSONObject = optJSONArray2.getJSONObject(i2);
                    String optString = jSONObject.optString("format");
                    String optString2 = jSONObject.optString("ad_unit_id");
                    if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2)) {
                        if ("interstitial".equalsIgnoreCase(optString)) {
                            this.zzb.add(optString2);
                        } else if (("rewarded".equalsIgnoreCase(optString) || "rewarded_interstitial".equals(optString)) && (optJSONObject3 = jSONObject.optJSONObject("mediation_config")) != null) {
                            this.zzc.put(optString2, new zzbuk(optJSONObject3));
                        }
                    }
                }
            }
            JSONArray optJSONArray3 = this.zzg.optJSONArray("persistable_banner_ad_unit_ids");
            if (optJSONArray3 != null) {
                for (int i3 = 0; i3 < optJSONArray3.length(); i3++) {
                    this.zza.add(optJSONArray3.optString(i3));
                }
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzhP)).booleanValue() && (optJSONObject2 = this.zzg.optJSONObject("common_settings")) != null && (optJSONArray = optJSONObject2.optJSONArray("loeid")) != null) {
                for (int i4 = 0; i4 < optJSONArray.length(); i4++) {
                    this.zzi.add(optJSONArray.get(i4).toString());
                }
            }
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzhk)).booleanValue() || (optJSONObject = this.zzg.optJSONObject("common_settings")) == null) {
                return;
            }
            this.zzj = optJSONObject.optBoolean("is_prefetching_enabled", false);
        } catch (JSONException e) {
            int i5 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Exception occurred while processing app setting json", e);
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "AppSettings.parseAppSettingsJson");
        }
    }

    private final boolean zzl() {
        if (!TextUtils.isEmpty(this.zze) && this.zzg != null) {
            long zzm = zzm();
            long currentTimeMillis = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
            if (zzm >= 0 && (this.zzf > currentTimeMillis || TimeUnit.MILLISECONDS.toSeconds(currentTimeMillis - this.zzf) > zzm)) {
                return false;
            }
        }
        return true;
    }

    private final long zzm() {
        zzbhv zzbhvVar = zzbie.zznf;
        return (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzne)).booleanValue() || TextUtils.isEmpty(this.zze)) ? ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbhvVar)).longValue() : this.zzg.optLong("cache_ttl_sec", ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbhvVar)).longValue());
    }

    public final void zza(long j) {
        this.zzf = j;
    }

    public final long zzb() {
        return this.zzf;
    }

    public final boolean zzc() {
        return this.zzh;
    }

    public final String zzd() {
        return this.zze;
    }

    public final String zze() {
        return this.zzd;
    }

    public final Map zzf() {
        return this.zzc;
    }

    public final JSONObject zzg() {
        return this.zzg;
    }

    public final List zzh() {
        return this.zzi;
    }

    public final boolean zzi() {
        return this.zzj;
    }

    public final boolean zzj() {
        zzdyz zzv;
        if (zzl()) {
            return false;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzfc)).booleanValue() && (zzv = com.google.android.gms.ads.internal.zzt.zzh().zzv()) != null) {
            zzdyy zza = zzv.zza();
            zza.zzc("action", "cld_reset");
            zza.zzc("cld_lut_ms", String.valueOf(this.zzf));
            zza.zzc("event_timestamp", String.valueOf(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis()));
            zza.zzc("cld_ttl_sec", String.valueOf(zzm()));
            zza.zzd();
        }
        this.zza.clear();
        this.zzb.clear();
        this.zzc.clear();
        this.zzd = "";
        this.zze = "";
        this.zzg = null;
        this.zzh = false;
        this.zzi.clear();
        this.zzj = false;
        return true;
    }

    public final int zzk() {
        if (TextUtils.isEmpty(this.zze) || this.zzg == null) {
            return 3;
        }
        return zzl() ? 1 : 2;
    }
}
