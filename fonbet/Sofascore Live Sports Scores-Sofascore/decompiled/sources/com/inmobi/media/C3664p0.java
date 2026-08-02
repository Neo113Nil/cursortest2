package com.inmobi.media;

import android.content.Context;
import com.google.android.gms.appset.AppSetIdInfo;
import com.inmobi.media.core.config.models.AdConfig;
import com.inmobi.media.core.config.models.SignalsConfig;
import com.ironsource.U3;
import com.mbridge.msdk.foundation.download.Command;
import defpackage.a70;
import defpackage.joa;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.p0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3664p0 extends H9 {
    public final Zk b;
    public final C3612n0 c;
    public final Ok d;
    public final C3730rf e;
    public final C3906y9 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3664p0(String str, Zk zk, C3612n0 c3612n0, Ok ok, C3730rf c3730rf, C3906y9 c3906y9, boolean z) {
        super(str == null ? AdConfig.DEFAULT_AD_SERVER_URL : str);
        c3612n0.getClass();
        ok.getClass();
        this.b = zk;
        this.c = c3612n0;
        this.d = ok;
        this.e = c3730rf;
        this.f = c3906y9;
    }

    public final Ze a() {
        String str;
        Map map;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str2 = AbstractC3424fj.c;
        if (str2 == null) {
            a70.p("Account Id cannot be null");
            return null;
        }
        linkedHashMap.put("account_id", str2);
        linkedHashMap.putAll(R5.c());
        String str3 = E1.b;
        if (str3 != null) {
        }
        linkedHashMap.put("client-request-id", this.c.a);
        linkedHashMap.put("sdk-flavor", "row");
        this.c.getClass();
        linkedHashMap.put("format", "unifiedSdkJson");
        String str4 = this.c.e;
        if (str4 != null) {
        }
        C3659ol a = AbstractC3633nl.a();
        String str5 = a.a;
        if (str5 != null) {
        }
        linkedHashMap.put("is-unifid-service-used", String.valueOf(a.b));
        long j = this.c.c;
        if (j != Long.MIN_VALUE) {
            linkedHashMap.put("im-plid", String.valueOf(j));
        }
        H9.d(linkedHashMap);
        linkedHashMap.putAll(T2.a());
        linkedHashMap.putAll(T2.b());
        linkedHashMap.putAll(T2.c());
        C3730rf c3730rf = this.e;
        if (c3730rf != null && (map = c3730rf.a) != null) {
            linkedHashMap.putAll(map);
        }
        HashMap hashMap = new HashMap();
        hashMap.putAll(AbstractC3409f4.a);
        linkedHashMap.putAll(hashMap);
        String str6 = this.c.g;
        if (str6 != null) {
        }
        Map map2 = this.c.f;
        if (map2 != null) {
            linkedHashMap.putAll(map2);
        }
        this.c.getClass();
        linkedHashMap.put("int-origin", "im");
        H9.c(linkedHashMap);
        H9.e(linkedHashMap);
        joa joaVar = F0.c;
        if (!((CopyOnWriteArrayList) joaVar.getValue()).isEmpty()) {
            String jSONArray = new JSONArray((Collection) joaVar.getValue()).toString();
            jSONArray.getClass();
            linkedHashMap.put("u-r-crid", jSONArray);
        }
        linkedHashMap.put("m10n_context", "others".equals(this.c.d) ? "M10N_CONTEXT_OTHER" : "M10N_CONTEXT_ACTIVITY");
        F5.a.getClass();
        if (F5.s()) {
            if (R5.e) {
                str = null;
            } else {
                str = R5.c;
                if (str == null) {
                    Context context = AbstractC3424fj.a;
                    if (context == null) {
                        str = null;
                    } else {
                        ConcurrentHashMap concurrentHashMap = Qa.b;
                        str = Pa.a(context, "display_info_store").a.getString("gesture_margin", null);
                    }
                    R5.c = str;
                }
            }
            if (str != null) {
                linkedHashMap.put("d-device-gesture-margins", str);
            }
        }
        JSONObject ext = ((SignalsConfig) AbstractC3435g4.a.a(SignalsConfig.class)).getExt();
        if (ext != null && ext.length() > 0) {
            String jSONObject = ext.toString();
            jSONObject.getClass();
            linkedHashMap.put("im-ext", jSONObject);
        }
        Map map3 = this.c.b;
        if (map3 != null) {
            for (Map.Entry entry : map3.entrySet()) {
                String str7 = (String) entry.getKey();
                String str8 = (String) entry.getValue();
                if (!linkedHashMap.containsKey(str7)) {
                    linkedHashMap.put(str7, str8);
                }
            }
        }
        H9.a(linkedHashMap);
        C3612n0 c3612n0 = this.c;
        c3612n0.getClass();
        String str9 = c3612n0.e;
        if (str9 != null && H9.a(str9).length() > 0) {
            String jSONObject2 = H9.a(str9).toString();
            jSONObject2.getClass();
            linkedHashMap.put("audioObject", jSONObject2);
        }
        String str10 = AbstractC3603mh.a;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        String str11 = AbstractC3603mh.a;
        if (str11 != null) {
            linkedHashMap2.put("u-nip", str11);
        } else {
            linkedHashMap2 = null;
        }
        if (linkedHashMap2 != null) {
            linkedHashMap.putAll(linkedHashMap2);
        }
        linkedHashMap.putAll(AbstractC3551kh.a());
        AppSetIdInfo appSetIdInfo = F1.a;
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        F1.a(linkedHashMap3);
        linkedHashMap.putAll(linkedHashMap3);
        if (S4.e() && N3.a(S4.d())) {
            linkedHashMap.put("ik", S4.f);
            linkedHashMap.put("c_data", S4.d());
            Context context2 = AbstractC3424fj.a;
            int i = 1;
            if (context2 != null) {
                ConcurrentHashMap concurrentHashMap2 = Qa.b;
                i = Pa.a(context2, "c_data_store").a.getInt("akv", 1);
            }
            linkedHashMap.put("aKV", String.valueOf(i));
        }
        linkedHashMap.put("u-appsecure", String.valueOf((int) E1.f));
        Zk zk = this.b;
        HashMap a2 = zk != null ? zk.a() : null;
        if (a2 != null) {
            for (Map.Entry entry2 : a2.entrySet()) {
                linkedHashMap.put((String) entry2.getKey(), (String) entry2.getValue());
            }
        }
        if (((SignalsConfig) AbstractC3435g4.a.a(SignalsConfig.class)).getPublisher().getEnableMCO()) {
            JSONObject e = C3422fh.a.e();
            if (e.length() > 0) {
                String jSONObject3 = e.toString();
                jSONObject3.getClass();
                linkedHashMap.put(U3.i.l0, jSONObject3);
            }
        }
        H9.b(linkedHashMap);
        boolean z = this.c.h;
        linkedHashMap.putAll(E1.e);
        linkedHashMap.putAll(F5.a.a(z));
        linkedHashMap.putAll(H8.a());
        JSONObject b = AbstractC3386e7.b();
        if (b != null) {
            String jSONObject4 = b.toString();
            jSONObject4.getClass();
            linkedHashMap.put("consentObject", jSONObject4);
        }
        this.c.getClass();
        C3906y9 c3906y9 = this.f;
        if (c3906y9 != null) {
            c3906y9.c("AdNetworkRequest", linkedHashMap.toString());
        }
        String str12 = this.a;
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        linkedHashMap4.put(Command.HTTP_HEADER_USER_AGENT, AbstractC3424fj.c());
        return new Ze(str12, linkedHashMap4, this.d, new C3438g7(linkedHashMap), null, 48);
    }
}
