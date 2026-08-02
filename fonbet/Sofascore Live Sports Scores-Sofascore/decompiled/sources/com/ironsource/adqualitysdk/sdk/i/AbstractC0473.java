package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.StringFog;
import defpackage.ceo;
import defpackage.fc6;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.د, reason: contains not printable characters */
/* loaded from: classes4.dex */
public abstract class AbstractC0473 {

    /* renamed from: ﻐ, reason: contains not printable characters */
    public boolean f1531 = true;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final String f1532;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final String f1533;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final String f1534;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final String f1535;

    /* renamed from: ﻏ, reason: contains not printable characters */
    public static final String f1530 = StringFog.decrypt("2PXUrw==\n", "vZuigCcv1c0=\n");

    /* renamed from: ﺙ, reason: contains not printable characters */
    public static final String f1529 = StringFog.decrypt("cXmm\n", "EBfCSRivjks=\n");

    public AbstractC0473(String str, String str2, String str3, String str4) {
        this.f1535 = str;
        this.f1534 = str2;
        this.f1533 = str3;
        this.f1532 = str4;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final String m290() {
        JSONObject jSONObject;
        String decrypt = StringFog.decrypt("9rhs/6r2ps6r\n", "hN0BkN6Twqw=\n");
        C0346 c0346 = (C0346) AbstractC0274.m142();
        synchronized (c0346) {
            jSONObject = c0346.f3206;
        }
        String optString = jSONObject.optString(c0346.f881);
        if (!this.f1531 || TextUtils.isEmpty(optString)) {
            return decrypt;
        }
        StringBuilder q = fc6.q(decrypt);
        q.append(f1530);
        q.append(optString);
        return AbstractC1133.m662("EQ==\n", "PohIHDQyCbc=\n", q);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final String m292(String str) {
        StringBuilder q = fc6.q(m290());
        ceo.g(this.f1535, "AA==\n", q, "LzgXnyfemn8=\n");
        String str2 = f1529;
        q.append(str2);
        StringBuilder m642 = AbstractC1072.m642("AQ==\n", "Lmanwv38gAI=\n", q, str);
        m642.append(StringFog.decrypt("zw==\n", "4KwFXv0oX6A=\n"));
        m642.append(this.f1534);
        StringBuilder m6422 = AbstractC1072.m642("7g==\n", "wGMXWcf7ZsA=\n", m642, str2);
        m6422.append(StringFog.decrypt("lg==\n", "uHc2rSSrH1c=\n"));
        ceo.g(this.f1533, "9Q==\n", m6422, "22rP5Eg2upY=\n");
        m6422.append(this.f1532);
        return m6422.toString();
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public String mo291() {
        StringBuilder q = fc6.q(m290());
        ceo.g(this.f1535, "VA==\n", q, "e1IqMCE+r/c=\n");
        ceo.g(this.f1534, "OA==\n", q, "Fimod+r100w=\n");
        ceo.g(f1529, "hg==\n", q, "qIxRBO8heCY=\n");
        ceo.g(this.f1533, "nQ==\n", q, "s7jLx8SWQqo=\n");
        q.append(this.f1532);
        return q.toString();
    }
}
