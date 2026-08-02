package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ܕ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public abstract class AbstractC0523 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static final String f1759 = StringFog.decrypt("Ye5iBMvTjSZY\n", "K70tSp6n5Eo=\n");

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static HashMap m343(JSONObject jSONObject, C0937 c0937) {
        AbstractC0287 abstractC0287;
        if (jSONObject == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            c0937.getClass();
            try {
                String optString = jSONObject.optString(next);
                if (jSONObject.opt(next) instanceof String) {
                    optString = StringFog.decrypt("cw==\n", "UT0CUdskW04=\n") + optString + StringFog.decrypt("5Q==\n", "x9P9YIZdp5Q=\n");
                }
                abstractC0287 = new C0495().m312(AbstractC0283.m169(c0937.f3146.f3076, optString, optString));
            } catch (Throwable th) {
                String str = c0937.f3146.f3076;
                StringBuilder m642 = AbstractC1072.m642("hYNQwOd9yL+ygkvB8n0=\n", "wPEir5VduN4=\n", new StringBuilder(), next);
                m642.append(StringFog.decrypt("RurrD3SkXJE=\n", "ZomEYQfQZrE=\n"));
                m642.append(jSONObject.optString(next));
                AbstractC0962.m595(str, m642.toString(), th, null);
                abstractC0287 = null;
            }
            hashMap.put(next, abstractC0287);
        }
        return hashMap;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m348(JSONObject jSONObject, JSONObject jSONObject2, boolean z) {
        if (jSONObject == null || jSONObject2 == null) {
            return;
        }
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                jSONObject.put(next, jSONObject2.opt(next));
            } catch (JSONException unused) {
            }
        }
        if (z) {
            jSONObject.remove(AbstractC0615.f2034);
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static List m344(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            Object opt = jSONArray.opt(i);
            if (opt != null) {
                arrayList.add(opt);
            }
        }
        return arrayList;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m347(JSONObject jSONObject, int i, List list) {
        String m342;
        try {
            JSONArray names = jSONObject.names();
            if (names != null) {
                for (int i2 = 0; i2 < names.length(); i2++) {
                    String optString = names.optString(i2);
                    if ((list == null || !list.contains(optString)) && (m342 = m342(jSONObject.opt(optString), i)) != null) {
                        if (m342.equals("")) {
                            m342 = null;
                        }
                        jSONObject.put(optString, m342);
                    }
                }
            }
        } catch (JSONException e) {
            String str = f1759;
            AbstractC0420.m252(str, str, StringFog.decrypt("d+y4jI6kihFe966CiO2SFxL0uYyS\n", "Mp7K4/yE/HA=\n"), e, null, false);
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static String m342(Object obj, int i) {
        if (obj instanceof JSONObject) {
            m347((JSONObject) obj, i, (List) null);
        } else {
            if (obj instanceof JSONArray) {
                JSONArray jSONArray = (JSONArray) obj;
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    String m342 = m342(jSONArray.opt(i2), i);
                    if (m342 != null) {
                        jSONArray.put(i2, m342);
                    }
                }
            } else if (obj instanceof String) {
                String str = (String) obj;
                if (str.length() <= i) {
                    return str;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(str.substring(0, i));
                return AbstractC1133.m662("nrJRHwa51y/T/QtSFuI=\n", "sJx/N3LLokE=\n", sb);
            }
        }
        return null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static JSONObject m346(JSONObject jSONObject, boolean z) {
        if (jSONObject != null) {
            try {
                JSONObject jSONObject2 = new JSONObject(jSONObject.toString());
                if (z) {
                    jSONObject2.remove(AbstractC0615.f2034);
                }
                return jSONObject2;
            } catch (JSONException unused) {
            }
        }
        return new JSONObject();
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static JSONObject m345(int i, int i2, long j, long j2) {
        JSONObject jSONObject = new JSONObject();
        try {
            if (j > -1) {
                jSONObject.put(StringFog.decrypt("bQ==\n", "FXLWNNJIEq0=\n"), i);
                jSONObject.put(StringFog.decrypt("Xw==\n", "JtZVaYJCVcI=\n"), i2);
                jSONObject.put(StringFog.decrypt("7w==\n", "m/esFFnTG/0=\n"), j);
                jSONObject.put(StringFog.decrypt("/A==\n", "iQSuMWlt5vM=\n"), j2);
                return jSONObject;
            }
            jSONObject.put(StringFog.decrypt("sA==\n", "yBUfVv3Guf8=\n"), -1);
            jSONObject.put(StringFog.decrypt("pw==\n", "3lUFMnSPM8k=\n"), -1);
            jSONObject.put(StringFog.decrypt("zg==\n", "uiU4jGSXk+U=\n"), -1);
            jSONObject.put(StringFog.decrypt("yA==\n", "vXA7RBbcYzY=\n"), -1);
            return jSONObject;
        } catch (JSONException e) {
            String str = f1759;
            AbstractC0420.m252(str, str, StringFog.decrypt("HSzUbysVr6M9P9JpN1LsvTkt0lQ2QK+5eDTVbzc=\n", "WF6mAFk1zNE=\n"), e, null, false);
            return jSONObject;
        }
    }
}
