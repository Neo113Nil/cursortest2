package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import defpackage.fc6;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﭠ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C1042 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public final List f3324;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final boolean f3325;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final boolean f3326;

    public C1042(boolean z, boolean z2, ArrayList arrayList) {
        this.f3326 = z;
        this.f3325 = z2;
        this.f3324 = Collections.unmodifiableList(new ArrayList(arrayList));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1042.class != obj.getClass()) {
            return false;
        }
        C1042 c1042 = (C1042) obj;
        if (this.f3326 == c1042.f3326 && this.f3325 == c1042.f3325) {
            return this.f3324.equals(c1042.f3324);
        }
        return false;
    }

    public final int hashCode() {
        return this.f3324.hashCode() + ((((this.f3326 ? 1 : 0) * 31) + (this.f3325 ? 1 : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StringFog.decrypt("/qzvVE7v3pHPt+lPZNjPh9mv9Ftj+fibw7flRDc=\n", "rMOAIAqKqvQ=\n"));
        sb.append(this.f3326);
        sb.append(StringFog.decrypt("xk8UAMoTNtOLGxIBsg==\n", "6m99c49+Q78=\n"));
        sb.append(this.f3325);
        sb.append(StringFog.decrypt("jT6CjrNbSm/SIw==\n", "oR7x59Q1KwM=\n"));
        return fc6.p(sb, this.f3324, '}');
    }
}
