package com.google.android.gms.internal.ads;

import com.google.ads.mediation.moloco.MolocoMediationAdapter;
import defpackage.hsn;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzdyf {
    public JSONObject b;
    public final hsn c;
    public boolean d;
    public JSONObject e;
    public final ConcurrentHashMap a = new ConcurrentHashMap();
    public final AtomicBoolean f = new AtomicBoolean(false);

    public zzdyf(hsn hsnVar) {
        this.c = hsnVar;
    }

    public final synchronized void a() {
        JSONObject jSONObject;
        Map map;
        try {
            this.d = true;
            zzcfq zzi = com.google.android.gms.ads.internal.zzt.zzh().g().zzi();
            if (zzi != null && (jSONObject = zzi.g) != null) {
                this.b = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.f5)).booleanValue() ? jSONObject.optJSONObject("common_settings") : null;
                this.e = jSONObject.optJSONObject("ad_unit_patterns");
                JSONArray optJSONArray = jSONObject.optJSONArray("ad_unit_id_settings");
                if (optJSONArray != null) {
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                        if (optJSONObject != null) {
                            String optString = optJSONObject.optString(MolocoMediationAdapter.KEY_AD_UNIT_ID);
                            String optString2 = optJSONObject.optString("format");
                            JSONObject optJSONObject2 = optJSONObject.optJSONObject("request_signals");
                            if (optString != null && optJSONObject2 != null && optString2 != null) {
                                ConcurrentHashMap concurrentHashMap = this.a;
                                if (concurrentHashMap.containsKey(optString2)) {
                                    map = (Map) concurrentHashMap.get(optString2);
                                } else {
                                    ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
                                    concurrentHashMap.put(optString2, concurrentHashMap2);
                                    map = concurrentHashMap2;
                                }
                                map.put(optString, optJSONObject2);
                            }
                        }
                    }
                }
            }
        } finally {
        }
    }
}
