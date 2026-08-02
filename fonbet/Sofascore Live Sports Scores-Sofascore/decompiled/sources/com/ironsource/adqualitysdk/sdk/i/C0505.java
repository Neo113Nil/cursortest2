package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ږ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0505 extends AbstractC0287 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final HashMap f1695 = new HashMap();

    public C0505(HashMap hashMap) {
        for (String str : hashMap.keySet()) {
            this.f1695.put(AbstractC1088.m645(str), (AbstractC0287) hashMap.get(str));
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0287
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj)) {
            return false;
        }
        C0505 c0505 = (C0505) obj;
        HashMap hashMap = this.f1695;
        return hashMap != null ? hashMap.equals(c0505.f1695) : c0505.f1695 == null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0287
    public final int hashCode() {
        HashMap hashMap = this.f1695;
        if (hashMap != null) {
            return hashMap.hashCode();
        }
        return 0;
    }

    public final String toString() {
        if (this.f1695.isEmpty()) {
            return StringFog.decrypt("oqc=\n", "2dqdLE68ung=\n");
        }
        StringBuilder sb = new StringBuilder();
        sb.append(StringFog.decrypt("GWI=\n", "YkLfx2qbaLM=\n"));
        boolean z = true;
        for (String str : this.f1695.keySet()) {
            if (!z) {
                sb.append(StringFog.decrypt("uqY=\n", "loY88ZeWkx0=\n"));
            }
            sb.append(StringFog.decrypt("5g==\n", "xHJRTmGYoNI=\n"));
            sb.append(str);
            sb.append(StringFog.decrypt("MG/o\n", "ElXIqORQWUQ=\n"));
            sb.append(this.f1695.get(str));
            z = false;
        }
        sb.append(StringFog.decrypt("Fz8=\n", "N0LeuZhF+LE=\n"));
        return sb.toString();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0287
    /* renamed from: ﾒ */
    public final C1068 mo133(C0950 c0950, C1102 c1102) {
        JSONObject jSONObject = new JSONObject();
        for (String str : this.f1695.keySet()) {
            C1068 m171 = ((AbstractC0287) this.f1695.get(str)).m171(c0950, c1102);
            try {
                jSONObject.put(str, m171.f3367);
            } catch (JSONException e) {
                StringBuilder sb = new StringBuilder();
                sb.append(StringFog.decrypt("egxUcTZxKWVLCk9wI3Ewc1AQBmglPS9lHw==\n", "P34mHkRRWgA=\n"));
                sb.append(m171.f3367);
                throw new C0240(c1102, c0950, AbstractC0424.m255("7AHGh8yPXb/s\n", "zGep9ezkOMY=\n", sb, str), e);
            }
        }
        return new C1068(jSONObject);
    }
}
