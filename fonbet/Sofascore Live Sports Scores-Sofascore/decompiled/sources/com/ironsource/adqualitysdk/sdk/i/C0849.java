package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import defpackage.ceo;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᵓ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0849 extends AbstractC0857 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public final AbstractC0287 f2859;

    public C0849(AbstractC0287 abstractC0287, AbstractC0287 abstractC02872, AbstractC0287 abstractC02873) {
        super(abstractC0287, abstractC02872);
        this.f2859 = abstractC02873;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0857, com.ironsource.adqualitysdk.sdk.i.AbstractC0287
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj)) {
            return false;
        }
        C0849 c0849 = (C0849) obj;
        AbstractC0287 abstractC0287 = this.f2859;
        return abstractC0287 != null ? abstractC0287.equals(c0849.f2859) : c0849.f2859 == null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0857, com.ironsource.adqualitysdk.sdk.i.AbstractC0287
    public final int hashCode() {
        int hashCode = super.hashCode() * 31;
        AbstractC0287 abstractC0287 = this.f2859;
        return hashCode + (abstractC0287 != null ? abstractC0287.hashCode() : 0);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0857
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        ceo.g(super.toString(), "ggtp\n", sb, "ojZJ8MJIPFo=\n");
        sb.append(this.f2859.toString());
        return sb.toString();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0287
    /* renamed from: ﾒ */
    public final C1068 mo133(C0950 c0950, C1102 c1102) {
        C1068 m171 = this.f2874.m171(c0950, c1102);
        C1068 m1712 = this.f2859.m171(c0950, c1102);
        try {
            Object obj = this.f2875.m171(c0950, c1102).f3367;
            if (obj instanceof JSONObject) {
                ((JSONObject) obj).put((String) m171.f3367, m1712.f3367);
                return m1712;
            }
            if (obj instanceof JSONArray) {
                ((JSONArray) obj).put(m171.m639().intValue(), m1712.f3367);
                return m1712;
            }
            if (obj instanceof Map) {
                ((Map) obj).put(m171.f3367, m1712.f3367);
                return m1712;
            }
            if (obj instanceof List) {
                ((List) obj).set(m171.m639().intValue(), m1712.f3367);
                return m1712;
            }
            if (obj.getClass().isArray()) {
                ((Object[]) obj)[m171.m639().intValue()] = m1712.f3367;
                return m1712;
            }
            throw new C0240(c1102, c0950, StringFog.decrypt("7UCcRVw51wPJXptLWnDcEohBm0hdesAc2EbOWlttkhDQQpxPXWrbGsYSyQ==\n", "qDLuKi4ZsnU=\n") + this + StringFog.decrypt("8AjMF5PUpjCwEpgMwdi8O/dpsUOOw+8/uRKZDZLYvy64QJgGhY2gPL1XjxfB\n", "1zLsY+Gtz14=\n") + obj, null);
        } catch (JSONException e) {
            StringBuilder sb = new StringBuilder();
            sb.append(StringFog.decrypt("uHR/DbOozHecangDteHHZt11eACy69tojXItErT8iWSFdn8HsvvAbpMmKg==\n", "/QYNYsGIqQE=\n"));
            sb.append(this);
            throw new C0240(c1102, c0950, AbstractC1133.m662("Ow==\n", "HFbjecfGb0M=\n", sb), e);
        }
    }
}
