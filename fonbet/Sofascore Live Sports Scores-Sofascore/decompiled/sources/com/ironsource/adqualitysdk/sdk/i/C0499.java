package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import defpackage.ceo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ڐ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0499 {

    /* renamed from: ﻏ, reason: contains not printable characters */
    public int f1609 = -1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final C0499 f1610;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final C0981 f1611;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final String[] f1612;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final C1183 f1613;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final String f1614;

    static {
        StringFog.decrypt("fceQng==\n", "HLX37RLTgcE=\n");
        StringFog.decrypt("GZhEQQ==\n", "e/cgODAX7No=\n");
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    public C0499(C1183 c1183, String str, JSONObject jSONObject, C0499 c0499) {
        ArrayList arrayList;
        this.f1613 = c1183;
        this.f1614 = AbstractC1088.m645(str);
        this.f1610 = c0499;
        JSONArray optJSONArray = jSONObject.optJSONArray(StringFog.decrypt("whdaCw==\n", "o2U9eKn9YCc=\n"));
        if (optJSONArray != null) {
            arrayList = new ArrayList();
            for (int i = 0; i < optJSONArray.length(); i++) {
                String m645 = AbstractC1088.m645(optJSONArray.optString(i));
                if (m645 != null) {
                    arrayList.add(m645);
                }
            }
        } else {
            arrayList = null;
        }
        String[] strArr = new String[arrayList.size()];
        this.f1612 = strArr;
        arrayList.toArray(strArr);
        String str2 = c1183.f3758;
        String str3 = c1183.f3759;
        try {
            this.f1611 = AbstractC1013.m616(str2, str, jSONObject.optString(StringFog.decrypt("RISEqA==\n", "Juvg0QQcqxY=\n")));
        } catch (C0995 e) {
            new C0466(str2, str3, str, m324(), StringFog.decrypt("MGZeBbiWwlAHZ0UErZbfVAF8Qw7qkQ==\n", "dRQsasq2sjE=\n") + this.f1614 + StringFog.decrypt("6GvrJcKsXtGqaw==\n", "z0uKUeLAN78=\n") + (m324() + e.f3233) + StringFog.decrypt("K5g=\n", "EbhllERBSZw=\n") + e.getMessage(), e).m277(str2);
        } catch (Throwable th) {
            String str4 = StringFog.decrypt("fDHtY/qN9OVLMPZi743p4U0r8Gioig==\n", "OUOfDIithIQ=\n") + this.f1614 + StringFog.decrypt("CCgT\n", "LxIzCHF0haA=\n") + th.getMessage();
            AbstractC0962.m595(str2, str4, th, new C0466(str2, str3, str, m324(), str4));
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StringFog.decrypt("nFXN1PcAD7Pa\n", "+iCjt4NpYN0=\n"));
        ceo.g(this.f1614, "DA==\n", sb, "JPy+6gbv87M=\n");
        ceo.g(String.join(StringFog.decrypt("++o=\n", "18rUewwNjUs=\n"), this.f1612), "GiA=\n", sb, "MwDFQS4Riaw=\n");
        C0981 c0981 = this.f1611;
        sb.append(c0981 != null ? c0981.toString() : StringFog.decrypt("q9Tn\n", "0PSaKzMD9Qc=\n"));
        return sb.toString();
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final C1068 m325(C0950 c0950, C0950 c09502, C1102 c1102, List list) {
        HashMap hashMap;
        List asList = Arrays.asList(this.f1612);
        if (list.size() != asList.size()) {
            AbstractC0962.m595(c1102.m651(), this.f1614 + StringFog.decrypt("kuomv/KyRrXX/zOu+alH8ZI=\n", "sodDy5rdIpU=\n") + asList.size() + StringFog.decrypt("Dwjtkws3qgZbGr+WCy7vGkoK+p0IP6tI\n", "L2mf9H5az2g=\n") + list.size(), null, null);
            hashMap = null;
        } else {
            HashMap hashMap2 = new HashMap();
            for (int i = 0; i < list.size(); i++) {
                hashMap2.put((String) asList.get(i), list.get(i));
            }
            hashMap = hashMap2;
        }
        C0950 c09503 = new C0950(hashMap, c09502, this, c0950, c09502 == null);
        C0981 c0981 = this.f1611;
        if (c0981 != null) {
            return c0981.m141(c09503, c1102);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(StringFog.decrypt("JPtWUtLBFFoX5k9UzoZdWQT9TFLEwVo=\n", "YYkkPaDhfTQ=\n"));
        sb.append(this.f1614);
        new C0240(c1102, c09503, AbstractC1133.m662("Uv/2X6T5lQ4R5b5Tsq2TFBmp9lCu6YQ=\n", "dcXWMsGN/WE=\n", sb), null).m277(c1102.m651());
        return null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final int m324() {
        int i = this.f1609;
        if (i != -1) {
            return i;
        }
        C0499 c0499 = this.f1610;
        if (c0499 == null) {
            this.f1609 = 1;
            return 1;
        }
        int m324 = c0499.m324();
        C0981 c0981 = this.f1610.f1611;
        int mo72 = m324 + (c0981 != null ? c0981.mo72() : 1) + 1;
        this.f1609 = mo72;
        return mo72;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final C1068 m326(C0950 c0950, C1102 c1102, List list) {
        return m325(c0950, c0950.f3165, c1102, list);
    }
}
