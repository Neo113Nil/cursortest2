package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.ads.mediation.moloco.MolocoMediationAdapter;
import com.ironsource.L6;
import defpackage.hsn;
import defpackage.njo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzesu {
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final HashMap d = new HashMap();
    public final HashMap e = new HashMap();
    public final hsn f;
    public JSONObject g;

    public zzesu(hsn hsnVar) {
        this.f = hsnVar;
    }

    public static final Bundle j(JSONObject jSONObject) {
        Bundle bundle = new Bundle();
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                bundle.putString(next, jSONObject.optString(next, ""));
            }
        }
        return bundle;
    }

    public final synchronized zzgxp a(String str, String str2) {
        Map map;
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(com.google.android.gms.ads.internal.zzt.zzh().g().zzi().e) && (map = (Map) this.c.get(str)) != null) {
                List<zzesw> list = (List) map.get(str2);
                if (list == null) {
                    String a = zzdyh.a(this.g, str2, str);
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Ac)).booleanValue()) {
                        a = a.toLowerCase(Locale.ROOT);
                    }
                    list = (List) map.get(a);
                }
                if (list != null) {
                    HashMap hashMap = new HashMap();
                    for (zzesw zzeswVar : list) {
                        String str3 = zzeswVar.a;
                        if (!hashMap.containsKey(str3)) {
                            hashMap.put(str3, new ArrayList());
                        }
                        ((List) hashMap.get(str3)).add(zzeswVar.b);
                    }
                    return zzgxp.a(hashMap);
                }
            }
            return njo.g;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b(String str) {
        if (!TextUtils.isEmpty(str)) {
            HashMap hashMap = this.a;
            if (!hashMap.containsKey(str)) {
                hashMap.put(str, new zzesw(new Bundle(), str));
            }
        }
    }

    public final synchronized void c() {
        this.b.clear();
        this.a.clear();
        this.e.clear();
        this.d.clear();
        f();
        d();
        e();
    }

    public final synchronized void d() {
        JSONObject jSONObject;
        if (!((Boolean) zzbln.g.c()).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.B2)).booleanValue() && (jSONObject = com.google.android.gms.ads.internal.zzt.zzh().g().zzi().g) != null) {
                try {
                    JSONArray jSONArray = jSONObject.getJSONArray("signal_adapters");
                    for (int i = 0; i < jSONArray.length(); i++) {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                        Bundle j = j(jSONObject2.optJSONObject("data"));
                        String optString = jSONObject2.optString("adapter_class_name");
                        boolean optBoolean = jSONObject2.optBoolean("render", false);
                        boolean optBoolean2 = jSONObject2.optBoolean("collect_signals", false);
                        if (!TextUtils.isEmpty(optString)) {
                            this.b.put(optString, new zzesy(optString, optBoolean2, optBoolean, true, j));
                        }
                    }
                } catch (JSONException e) {
                    com.google.android.gms.ads.internal.util.zze.zzb("Malformed config loading JSON.", e);
                }
            }
        }
    }

    public final synchronized void e() {
        JSONObject jSONObject;
        try {
            if (!((Boolean) zzbln.b.c()).booleanValue()) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.C2)).booleanValue() && (jSONObject = com.google.android.gms.ads.internal.zzt.zzh().g().zzi().g) != null) {
                    JSONArray jSONArray = jSONObject.getJSONArray("adapter_settings");
                    for (int i = 0; i < jSONArray.length(); i++) {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                        String optString = jSONObject2.optString("adapter_class_name");
                        JSONArray optJSONArray = jSONObject2.optJSONArray("permission_set");
                        if (!TextUtils.isEmpty(optString) && optJSONArray != null) {
                            for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                                JSONObject jSONObject3 = optJSONArray.getJSONObject(i2);
                                boolean optBoolean = jSONObject3.optBoolean("enable_rendering", false);
                                boolean optBoolean2 = jSONObject3.optBoolean("collect_secure_signals", false);
                                boolean optBoolean3 = jSONObject3.optBoolean("collect_secure_signals_on_full_app", false);
                                String optString2 = jSONObject3.optString(L6.H);
                                zzesy zzesyVar = new zzesy(optString, optBoolean2, optBoolean, optBoolean3, new Bundle());
                                if (optString2.equals("ADMOB")) {
                                    this.d.put(optString, zzesyVar);
                                } else if (optString2.equals("AD_MANAGER")) {
                                    this.e.put(optString, zzesyVar);
                                }
                            }
                        }
                    }
                }
            }
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Malformed config loading JSON.", e);
        } finally {
        }
    }

    public final synchronized void f() {
        JSONArray optJSONArray;
        try {
            JSONObject jSONObject = com.google.android.gms.ads.internal.zzt.zzh().g().zzi().g;
            if (jSONObject != null) {
                try {
                    JSONArray optJSONArray2 = jSONObject.optJSONArray("ad_unit_id_settings");
                    this.g = jSONObject.optJSONObject("ad_unit_patterns");
                    if (optJSONArray2 != null) {
                        for (int i = 0; i < optJSONArray2.length(); i++) {
                            JSONObject jSONObject2 = optJSONArray2.getJSONObject(i);
                            String lowerCase = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Ac)).booleanValue() ? jSONObject2.optString(MolocoMediationAdapter.KEY_AD_UNIT_ID, "").toLowerCase(Locale.ROOT) : jSONObject2.optString(MolocoMediationAdapter.KEY_AD_UNIT_ID, "");
                            String optString = jSONObject2.optString("format", "");
                            ArrayList arrayList = new ArrayList();
                            JSONObject optJSONObject = jSONObject2.optJSONObject("mediation_config");
                            if (optJSONObject != null && (optJSONArray = optJSONObject.optJSONArray("ad_networks")) != null) {
                                for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                                    arrayList.addAll(g(optJSONArray.getJSONObject(i2)));
                                }
                            }
                            h(arrayList, optString, lowerCase);
                        }
                    }
                } catch (JSONException e) {
                    com.google.android.gms.ads.internal.util.zze.zzb("Malformed config loading JSON.", e);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized ArrayList g(JSONObject jSONObject) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            if (jSONObject != null) {
                Bundle j = j(jSONObject.optJSONObject("data"));
                JSONArray optJSONArray = jSONObject.optJSONArray("rtb_adapters");
                if (optJSONArray != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        String optString = optJSONArray.optString(i, "");
                        if (!TextUtils.isEmpty(optString)) {
                            arrayList2.add(optString);
                        }
                    }
                    int size = arrayList2.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        String str = (String) arrayList2.get(i2);
                        b(str);
                        if (((zzesw) this.a.get(str)) != null) {
                            arrayList.add(new zzesw(j, str));
                        }
                    }
                }
            }
        } finally {
        }
        return arrayList;
    }

    public final synchronized void h(ArrayList arrayList, String str, String str2) {
        try {
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                return;
            }
            HashMap hashMap = this.c;
            Map map = (Map) hashMap.get(str);
            if (map == null) {
                map = new HashMap();
            }
            hashMap.put(str, map);
            List list = (List) map.get(str2);
            if (list == null) {
                list = new ArrayList();
            }
            list.addAll(arrayList);
            map.put(str2, list);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized zzgxp i(String str) {
        HashMap hashMap;
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(com.google.android.gms.ads.internal.zzt.zzh().g().zzi().e)) {
                boolean matches = Pattern.matches((String) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.m4), str);
                boolean matches2 = Pattern.matches((String) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.n4), str);
                if (matches) {
                    hashMap = new HashMap(this.e);
                } else if (matches2) {
                    hashMap = new HashMap(this.d);
                }
                return zzgxp.a(hashMap);
            }
            return njo.g;
        } catch (Throwable th) {
            throw th;
        }
    }
}
