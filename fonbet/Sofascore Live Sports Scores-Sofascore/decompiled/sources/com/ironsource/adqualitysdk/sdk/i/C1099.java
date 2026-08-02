package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import defpackage.ceo;
import defpackage.fc6;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﺗ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C1099 {

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final String f3434;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final int f3435;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final String f3436;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final String f3437;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final String f3438;

    public C1099(String str, String str2, String str3, int i, String str4) {
        this.f3438 = str;
        this.f3437 = str2;
        this.f3436 = str3;
        this.f3435 = i;
        this.f3434 = str4;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        ceo.g(this.f3438, "WQ==\n", sb, "d8jlYJRP5+U=\n");
        ceo.g(this.f3437, "6Q==\n", sb, "wXhaoi5laPY=\n");
        ceo.g(this.f3436, "1A==\n", sb, "7gdW9NL+Wuo=\n");
        sb.append(this.f3435);
        String m662 = AbstractC1133.m662("2A==\n", "8UnJhcrvMKE=\n", sb);
        if (this.f3434 == null) {
            return m662;
        }
        StringBuilder q = fc6.q(m662);
        q.append(StringFog.decrypt("VyM=\n", "dx/LEn7xtTw=\n"));
        q.append(this.f3434);
        return AbstractC1133.m662("Iw==\n", "HRRAVxLtbvA=\n", q);
    }
}
