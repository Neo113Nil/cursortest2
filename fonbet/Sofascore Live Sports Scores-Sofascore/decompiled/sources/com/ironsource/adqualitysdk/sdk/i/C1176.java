package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import defpackage.fc6;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﾅ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C1176 {

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final List f3671;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final boolean f3672;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final boolean f3673;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final boolean f3674;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final boolean f3675;

    public C1176(boolean z, boolean z2, boolean z3, boolean z4, ArrayList arrayList) {
        this.f3675 = z;
        this.f3674 = z2;
        this.f3673 = z3;
        this.f3672 = z4;
        this.f3671 = Collections.unmodifiableList(new ArrayList(arrayList));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1176.class != obj.getClass()) {
            return false;
        }
        C1176 c1176 = (C1176) obj;
        if (this.f3675 == c1176.f3675 && this.f3674 == c1176.f3674 && this.f3673 == c1176.f3673 && this.f3672 == c1176.f3672) {
            return this.f3671.equals(c1176.f3671);
        }
        return false;
    }

    public final int hashCode() {
        return this.f3671.hashCode() + ((((((((this.f3675 ? 1 : 0) * 31) + (this.f3674 ? 1 : 0)) * 31) + (this.f3673 ? 1 : 0)) * 31) + (this.f3672 ? 1 : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StringFog.decrypt("4hqG8i1afOzFAJTyNkB/284HgOorVHj67Qac4j5rdP3OF4HjOxI=\n", "q3T1hl8vEYk=\n"));
        sb.append(this.f3675);
        sb.append(StringFog.decrypt("VB5K/adICmAdWmfri10GZx1aHg==\n", "eD4jjv84ZRM=\n"));
        sb.append(this.f3674);
        sb.append(StringFog.decrypt("9uv1xvRqzEG9rPnH8XvaVbmj+dGN\n", "2suctbAPrjQ=\n"));
        sb.append(this.f3673);
        sb.append(StringFog.decrypt("b91EUVsJVAYwlmlHYg1QGyaZEA==\n", "Q/0tIhZoM28=\n"));
        sb.append(this.f3672);
        sb.append(StringFog.decrypt("6gOe3xlO9De1Hg==\n", "xiPttn4glVs=\n"));
        return fc6.p(sb, this.f3671, '}');
    }
}
