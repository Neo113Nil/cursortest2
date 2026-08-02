package com.inmobi.media;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.location.Location;
import com.inmobi.media.core.config.models.AdConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public abstract class H9 {
    public final String a;

    public H9(String str) {
        str.getClass();
        str.getClass();
        this.a = str;
    }

    public static JSONObject a(String str) {
        if (Intrinsics.c(str, "banner")) {
            return C3440g9.c.a();
        }
        if (!"audio".equals(str)) {
            return new JSONObject();
        }
        C3363d9 c3363d9 = C3363d9.c;
        JSONObject jSONObject = new JSONObject();
        long j = c3363d9.a / 1000;
        if (j != 0) {
            jSONObject.put("a-lastAudioPlayedTs", String.valueOf(j));
        }
        int i = c3363d9.b;
        if (i > 0) {
            jSONObject.put("a-audioFreq", String.valueOf(i));
        }
        Context context = AbstractC3424fj.a;
        if (context != null) {
            ConcurrentHashMap concurrentHashMap = Qa.b;
            int i2 = Pa.a(context, "audio_pref_file").a.getInt("user_mute_count", -1);
            if (i2 > 0) {
                jSONObject.put("a-umc", String.valueOf(i2));
            }
        }
        return jSONObject;
    }

    public static void b(LinkedHashMap linkedHashMap) {
        Pair pair;
        linkedHashMap.getClass();
        F5.a.getClass();
        Pair k = F5.k();
        linkedHashMap.getClass();
        if (k != null) {
            linkedHashMap.put(k.a, k.b);
        }
        Pair m = F5.m();
        linkedHashMap.getClass();
        if (m != null) {
            linkedHashMap.put(m.a, m.b);
        }
        Pair pair2 = F5.j;
        linkedHashMap.getClass();
        if (pair2 != null) {
            linkedHashMap.put(pair2.a, pair2.b);
        }
        Context context = AbstractC3424fj.a;
        Pair pair3 = null;
        if (context == null) {
            pair = null;
        } else {
            Intent a = N3.a(context, (BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            pair = new Pair("d-bat-chrg", (a != null ? a.getIntExtra("status", -1) : -1) == 2 ? "1" : "0");
        }
        linkedHashMap.getClass();
        if (pair != null) {
            linkedHashMap.put(pair.a, pair.b);
        }
        Pair q = F5.q();
        linkedHashMap.getClass();
        if (q != null) {
            linkedHashMap.put(q.a, q.b);
        }
        Pair h = F5.h();
        linkedHashMap.getClass();
        if (h != null) {
            linkedHashMap.put(h.a, h.b);
        }
        Context context2 = AbstractC3424fj.a;
        if (context2 != null) {
            Intent a2 = N3.a(context2, (BroadcastReceiver) null, new IntentFilter("android.intent.action.HEADSET_PLUG"));
            pair3 = (a2 == null || a2.getIntExtra("state", 0) != 1) ? new Pair("d-w-h", "0") : new Pair("d-w-h", "1");
        }
        linkedHashMap.getClass();
        if (pair3 != null) {
            linkedHashMap.put(pair3.a, pair3.b);
        }
        Pair i = F5.i();
        linkedHashMap.getClass();
        if (i != null) {
            linkedHashMap.put(i.a, i.b);
        }
        Pair j = F5.j();
        linkedHashMap.getClass();
        if (j != null) {
            linkedHashMap.put(j.a, j.b);
        }
        Pair f = F5.f();
        linkedHashMap.getClass();
        if (f != null) {
            linkedHashMap.put(f.a, f.b);
        }
        Pair l = F5.l();
        linkedHashMap.getClass();
        if (l != null) {
            linkedHashMap.put(l.a, l.b);
        }
    }

    public static void c(LinkedHashMap linkedHashMap) {
        SharedPreferences a;
        linkedHashMap.getClass();
        String str = "";
        if (AbstractC3424fj.a != null && (a = AbstractC3709qj.a()) != null && a.contains("IABGPP_HDR_GppString")) {
            str = String.valueOf(a.getString("IABGPP_HDR_GppString", ""));
        }
        if (N3.a(str)) {
            linkedHashMap.put("gpp", str);
        }
    }

    public static void d(LinkedHashMap linkedHashMap) {
        linkedHashMap.getClass();
        C3934zb c3934zb = C3934zb.a;
        HashMap hashMap = new HashMap();
        Hh hh = AbstractC3890xj.a;
        Location a = (AbstractC3424fj.b() == null || AbstractC3890xj.a().getLocationEnabled()) ? C3934zb.a() : null;
        HashMap a2 = a != null ? C3934zb.a(a, true, AbstractC3292ag.a(AbstractC3424fj.a, "android.permission.ACCESS_FINE_LOCATION") ? C3934zb.a(1, 3) : null) : C3934zb.a(AbstractC3551kh.b(), false, null);
        for (Map.Entry entry : a2.entrySet()) {
            hashMap.put((String) entry.getKey(), entry.getValue().toString());
        }
        linkedHashMap.putAll(hashMap);
        C3934zb c3934zb2 = C3934zb.a;
        HashMap hashMap2 = new HashMap();
        String str = "DENIED";
        if (C3934zb.d() && C3934zb.e()) {
            str = "AUTHORISED";
        }
        Locale locale = Locale.ENGLISH;
        locale.getClass();
        String lowerCase = str.toLowerCase(locale);
        lowerCase.getClass();
        hashMap2.put("loc-consent-status", lowerCase);
        linkedHashMap.putAll(hashMap2);
    }

    public static void e(LinkedHashMap linkedHashMap) {
        JSONObject jSONObject;
        linkedHashMap.getClass();
        C3605mj c3605mj = C3605mj.a;
        c3605mj.getClass();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        if (C3605mj.a(0)) {
            linkedHashMap2.put("st", Long.valueOf(C3605mj.f));
        }
        if (C3605mj.a(5)) {
            M1 m1 = C3605mj.j;
            KProperty[] kPropertyArr = C3605mj.b;
            if (((Number) m1.getValue(c3605mj, kPropertyArr[0])).intValue() != -1) {
                linkedHashMap2.put("cnt", Integer.valueOf(((Number) m1.getValue(c3605mj, kPropertyArr[0])).intValue()));
            }
        }
        if (C3605mj.a(6)) {
            M1 m12 = C3605mj.k;
            KProperty[] kPropertyArr2 = C3605mj.b;
            if (((Number) m12.getValue(c3605mj, kPropertyArr2[1])).intValue() != -1) {
                linkedHashMap2.put("u-ret", Integer.valueOf(((Number) m12.getValue(c3605mj, kPropertyArr2[1])).intValue()));
            }
        }
        ArrayList U0 = CollectionsKt.U0(C3605mj.g);
        if (!C3605mj.a(1)) {
            U0.set(0, -1);
        }
        if (!C3605mj.a(2)) {
            U0.set(1, -1);
        }
        if (!C3605mj.a(3)) {
            U0.set(2, -1);
        }
        if (!C3605mj.a(4)) {
            U0.set(3, -1);
        }
        if (!U0.isEmpty()) {
            Iterator it = U0.iterator();
            while (it.hasNext()) {
                if (((Number) it.next()).intValue() != -1) {
                    linkedHashMap2.put("dep", U0);
                    break;
                }
            }
        }
        try {
            jSONObject = new JSONObject(linkedHashMap2);
        } catch (Exception unused) {
            jSONObject = new JSONObject();
        }
        if (jSONObject.length() > 0) {
            String jSONObject2 = jSONObject.toString();
            jSONObject2.getClass();
            linkedHashMap.put("sData", jSONObject2);
        }
    }

    public static void a(LinkedHashMap linkedHashMap) {
        linkedHashMap.getClass();
        linkedHashMap.put("cct-enabled", String.valueOf(AbstractC3643o5.a(AbstractC3424fj.a) != null && ((AdConfig) AbstractC3435g4.a.a(AdConfig.class)).getCctEnabled()));
    }
}
