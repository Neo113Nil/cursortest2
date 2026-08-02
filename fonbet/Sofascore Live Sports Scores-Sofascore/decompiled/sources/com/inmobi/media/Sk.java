package com.inmobi.media;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.appsflyer.sdk_base.referrer.Payload;
import com.google.android.gms.appset.AppSetIdInfo;
import com.inmobi.media.Sk;
import com.inmobi.media.core.config.models.AdConfig;
import com.inmobi.media.core.config.models.RootConfig;
import com.inmobi.media.core.config.models.SignalsConfig;
import com.ironsource.U3;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.foundation.download.Command;
import defpackage.joa;
import defpackage.lkh;
import defpackage.tub;
import defpackage.x52;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.text.Charsets;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public abstract class Sk {
    public static String a(Map map, String str) {
        Map map2;
        String str2;
        C3906y9 a = AbstractC3294ai.a("getToken", "AB");
        long currentTimeMillis = System.currentTimeMillis();
        Map map3 = AbstractC3846w1.a("AB", map).a;
        if (map3 != null) {
            String str3 = (String) map3.get("tp");
            if (!TextUtils.isEmpty(str3)) {
                AbstractC3450gj.b = str3;
            }
            String str4 = (String) map3.get("tp-v");
            if (!TextUtils.isEmpty(str4)) {
                AbstractC3450gj.a = str4;
            }
        }
        a();
        if (!AbstractC3424fj.d()) {
            if (a != null) {
                a.b("com.inmobi.media.Sk", "InMobi SDK is not initialised. Cannot fetch a token.");
            }
            a(90, currentTimeMillis, a);
            return null;
        }
        Context context = AbstractC3424fj.a;
        C3782tf c3782tf = context != null ? new C3782tf(context, a) : null;
        C3694q4 c3694q4 = AbstractC3435g4.a;
        if (((RootConfig) c3694q4.a(RootConfig.class)).getMonetizationDisabled()) {
            a(2012, currentTimeMillis, a);
            if (a != null) {
                a.b("com.inmobi.media.Sk", "Monetization disabled. cannot provide token");
            }
            return null;
        }
        Zk zk = new Zk(((AdConfig) c3694q4.a(AdConfig.class)).getIncludeIds());
        Tk tk = new Tk(str, map3);
        C3730rf a2 = c3782tf != null ? c3782tf.a() : null;
        SignalsConfig signalsConfig = (SignalsConfig) c3694q4.a(SignalsConfig.class);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String a3 = F8.a();
        if (a3 != null) {
        }
        C3659ol a4 = AbstractC3633nl.a();
        String str5 = a4.a;
        if (str5 != null) {
        }
        linkedHashMap.put("is-unifid-service-used", String.valueOf(a4.b));
        H9.d(linkedHashMap);
        linkedHashMap.put("d-media-volume", String.valueOf(F5.a.a(AbstractC3424fj.a, false)));
        linkedHashMap.putAll(zk.a());
        String str6 = tk.a;
        if (str6 != null) {
        }
        HashMap hashMap = new HashMap();
        hashMap.putAll(AbstractC3409f4.a);
        linkedHashMap.putAll(hashMap);
        Map map4 = tk.b;
        if (map4 != null) {
            for (Map.Entry entry : map4.entrySet()) {
                String str7 = (String) entry.getKey();
                String str8 = (String) entry.getValue();
                if (!linkedHashMap.containsKey(str7)) {
                    linkedHashMap.put(str7, str8);
                }
            }
        }
        JSONObject ext = ((SignalsConfig) AbstractC3435g4.a.a(SignalsConfig.class)).getExt();
        if (ext != null && ext.length() > 0) {
            String jSONObject = ext.toString();
            jSONObject.getClass();
            linkedHashMap.put("im-ext", jSONObject);
        }
        F5 f5 = F5.a;
        f5.getClass();
        if (F5.s()) {
            if (R5.e) {
                str2 = null;
            } else {
                str2 = R5.c;
                if (str2 == null) {
                    Context context2 = AbstractC3424fj.a;
                    if (context2 == null) {
                        str2 = null;
                    } else {
                        ConcurrentHashMap concurrentHashMap = Qa.b;
                        str2 = Pa.a(context2, "display_info_store").a.getString("gesture_margin", null);
                    }
                    R5.c = str2;
                }
            }
            if (str2 != null) {
                linkedHashMap.put("d-device-gesture-margins", str2);
            }
        }
        H9.c(linkedHashMap);
        H9.e(linkedHashMap);
        H9.a(linkedHashMap);
        H9.b(linkedHashMap);
        linkedHashMap.put("h-user-agent", AbstractC3424fj.c());
        String str9 = AbstractC3603mh.a;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        String str10 = AbstractC3603mh.a;
        if (str10 != null) {
            linkedHashMap2.put("u-nip", str10);
        } else {
            linkedHashMap2 = null;
        }
        if (linkedHashMap2 != null) {
            linkedHashMap.putAll(linkedHashMap2);
        }
        linkedHashMap.putAll(AbstractC3551kh.a());
        linkedHashMap.putAll(R5.c());
        linkedHashMap.putAll(T2.a());
        if (a2 != null && (map2 = a2.a) != null) {
            linkedHashMap.putAll(map2);
        }
        joa joaVar = F0.c;
        if (!((CopyOnWriteArrayList) joaVar.getValue()).isEmpty()) {
            String jSONArray = new JSONArray((Collection) joaVar.getValue()).toString();
            jSONArray.getClass();
            linkedHashMap.put("u-r-crid", jSONArray);
        }
        JSONObject a5 = C3440g9.c.a();
        if (a5.length() > 0) {
            String jSONObject2 = a5.toString();
            jSONObject2.getClass();
            linkedHashMap.put("audioObject", jSONObject2);
        }
        AppSetIdInfo appSetIdInfo = F1.a;
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        F1.a(linkedHashMap3);
        linkedHashMap.putAll(linkedHashMap3);
        if (signalsConfig.getPublisher().getEnableAB()) {
            JSONObject e = C3422fh.a.e();
            if (e.length() > 0) {
                String jSONObject3 = e.toString();
                jSONObject3.getClass();
                linkedHashMap.put(U3.i.l0, jSONObject3);
            }
        }
        linkedHashMap.put("u-appsecure", String.valueOf((int) E1.f));
        if (S4.e() && N3.a(S4.d())) {
            linkedHashMap.put("ik", S4.f);
            linkedHashMap.put("c_data", S4.d());
            Context context3 = AbstractC3424fj.a;
            int i = 1;
            if (context3 != null) {
                ConcurrentHashMap concurrentHashMap2 = Qa.b;
                i = Pa.a(context3, "c_data_store").a.getInt("akv", 1);
            }
            linkedHashMap.put("aKV", String.valueOf(i));
        }
        JSONObject b = AbstractC3386e7.b();
        if (b != null) {
            String jSONObject4 = b.toString();
            jSONObject4.getClass();
            linkedHashMap.put("consentObject", jSONObject4);
        }
        linkedHashMap.putAll(E1.e);
        linkedHashMap.putAll(f5.a(false));
        linkedHashMap.putAll(H8.a());
        linkedHashMap.put(Command.HTTP_HEADER_USER_AGENT, AbstractC3424fj.c());
        if (!AbstractC3386e7.a()) {
            if (a != null) {
                a.b("com.inmobi.media.Sk", "get Signals failed - GDPR Compliance");
            }
            a(2141, currentTimeMillis, a);
            return null;
        }
        a(currentTimeMillis, a);
        if (a != null) {
            a.a("com.inmobi.media.Sk", "get signals success");
        }
        x52 x52Var = new x52();
        x52Var.g1(N3.a(linkedHashMap));
        byte[] encode = Base64.encode(x52Var.j0(x52Var.b), 8);
        encode.getClass();
        return new String(encode, Charsets.UTF_8);
    }

    public static final void b() {
        HashMap f = tub.f(new Pair("networkType", F5.o()), new Pair("plType", "AB"));
        C3839vk c3839vk = C3839vk.a;
        C3839vk.b("AdGetSignalsCalled", f, EnumC3943zk.SDK);
    }

    public static void a(final int i, final long j, C3906y9 c3906y9) {
        if (c3906y9 != null) {
            c3906y9.c("com.inmobi.media.Sk", "submitAdGetSignalsFailed - errorCode - " + i + ", startTime - " + j);
        }
        AbstractC3424fj.g.submit(new Runnable() { // from class: mkh
            @Override // java.lang.Runnable
            public final void run() {
                Sk.a(j, i);
            }
        });
        if (c3906y9 != null) {
            c3906y9.a();
        }
    }

    public static final void a(long j, int i) {
        HashMap f = tub.f(new Pair(Payload.LATENCY, Long.valueOf(System.currentTimeMillis() - j)), new Pair("networkType", F5.o()), new Pair(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i)), new Pair("plType", "AB"));
        C3839vk c3839vk = C3839vk.a;
        C3839vk.b("AdGetSignalsFailed", f, EnumC3943zk.SDK);
    }

    public static void a(long j, C3906y9 c3906y9) {
        if (c3906y9 != null) {
            c3906y9.c("com.inmobi.media.Sk", "submitAdGetSignalsSucceeded - startTime - " + j);
        }
        AbstractC3424fj.g.submit(new lkh(j, 0));
        if (c3906y9 != null) {
            c3906y9.a();
        }
    }

    public static final void a(long j) {
        HashMap f = tub.f(new Pair(Payload.LATENCY, Long.valueOf(System.currentTimeMillis() - j)), new Pair("networkType", F5.o()), new Pair("plType", "AB"));
        C3839vk c3839vk = C3839vk.a;
        C3839vk.b("AdGetSignalsSucceeded", f, EnumC3943zk.SDK);
    }

    public static void a() {
        AbstractC3424fj.g.submit(new defpackage.x(23));
    }
}
