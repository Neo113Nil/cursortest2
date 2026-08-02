package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.ads.mediation.moloco.MolocoMediationAdapter;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.mbridge.msdk.MBridgeConstans;
import defpackage.inn;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzcfq {
    public String d;
    public String e;
    public long f;
    public JSONObject g;
    public boolean h;
    public boolean j;
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();
    public final HashMap c = new HashMap();
    public final ArrayList i = new ArrayList();

    public zzcfq(String str, long j) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        JSONArray optJSONArray;
        JSONObject optJSONObject3;
        this.d = "";
        this.h = false;
        this.j = false;
        this.e = str;
        this.f = j;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            this.g = new JSONObject(str);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.pd)).booleanValue() && a()) {
                return;
            }
            if (this.g.optInt("status", -1) != 1) {
                this.h = false;
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzi("App settings could not be fetched successfully.");
                return;
            }
            this.h = true;
            this.d = this.g.optString(MBridgeConstans.APP_ID);
            JSONArray optJSONArray2 = this.g.optJSONArray("ad_unit_id_settings");
            if (optJSONArray2 != null) {
                for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                    JSONObject jSONObject = optJSONArray2.getJSONObject(i2);
                    String optString = jSONObject.optString("format");
                    String optString2 = jSONObject.optString(MolocoMediationAdapter.KEY_AD_UNIT_ID);
                    if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2)) {
                        if ("interstitial".equalsIgnoreCase(optString)) {
                            this.b.add(optString2);
                        } else if (("rewarded".equalsIgnoreCase(optString) || "rewarded_interstitial".equals(optString)) && (optJSONObject3 = jSONObject.optJSONObject("mediation_config")) != null) {
                            this.c.put(optString2, new zzbvo(optJSONObject3));
                        }
                    }
                }
            }
            JSONArray optJSONArray3 = this.g.optJSONArray("persistable_banner_ad_unit_ids");
            if (optJSONArray3 != null) {
                for (int i3 = 0; i3 < optJSONArray3.length(); i3++) {
                    this.a.add(optJSONArray3.optString(i3));
                }
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.V7)).booleanValue() && (optJSONObject2 = this.g.optJSONObject("common_settings")) != null && (optJSONArray = optJSONObject2.optJSONArray("loeid")) != null) {
                for (int i4 = 0; i4 < optJSONArray.length(); i4++) {
                    this.i.add(optJSONArray.get(i4).toString());
                }
            }
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.q7)).booleanValue() || (optJSONObject = this.g.optJSONObject("common_settings")) == null) {
                return;
            }
            this.j = optJSONObject.optBoolean("is_prefetching_enabled", false);
        } catch (JSONException e) {
            int i5 = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzj("Exception occurred while processing app setting json", e);
            com.google.android.gms.ads.internal.zzt.zzh().d("AppSettings.parseAppSettingsJson", e);
        }
    }

    public final boolean a() {
        zzeaj zzeajVar;
        if (b()) {
            return false;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.k5)).booleanValue() && (zzeajVar = com.google.android.gms.ads.internal.zzt.zzh().i) != null) {
            zzeai a = zzeajVar.a();
            a.b("action", "cld_reset");
            a.b("cld_lut_ms", String.valueOf(this.f));
            a.b("event_timestamp", String.valueOf(com.google.android.gms.ads.internal.zzt.zzk().a()));
            a.b("cld_ttl_sec", String.valueOf(c()));
            a.c();
        }
        this.a.clear();
        this.b.clear();
        this.c.clear();
        this.d = "";
        this.e = "";
        this.g = null;
        this.h = false;
        this.i.clear();
        this.j = false;
        return true;
    }

    public final boolean b() {
        if (!TextUtils.isEmpty(this.e) && this.g != null) {
            long c = c();
            long a = com.google.android.gms.ads.internal.zzt.zzk().a();
            if (c >= 0) {
                long j = this.f;
                if (j > a || (a - j) / 1000 > c) {
                    return false;
                }
            }
        }
        return true;
    }

    public final long c() {
        inn innVar = zzbjg.sd;
        return (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.rd)).booleanValue() || TextUtils.isEmpty(this.e)) ? ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().a(innVar)).longValue() : this.g.optLong("cache_ttl_sec", ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().a(innVar)).longValue());
    }
}
