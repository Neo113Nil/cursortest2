package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᵙ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0855 extends AbstractC0857 {
    public C0855(AbstractC0287 abstractC0287, AbstractC0287 abstractC02872) {
        super(abstractC0287, abstractC02872);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0287
    /* renamed from: ﾒ */
    public final C1068 mo133(C0950 c0950, C1102 c1102) {
        C1068 m171 = this.f2874.m171(c0950, c1102);
        Object obj = this.f2875.m171(c0950, c1102).f3367;
        if (obj instanceof JSONObject) {
            return new C1068(((JSONObject) obj).opt((String) m171.f3367));
        }
        if (obj instanceof JSONArray) {
            return new C1068(((JSONArray) obj).opt(m171.m639().intValue()));
        }
        if (obj instanceof Map) {
            return new C1068(((Map) obj).get(m171.f3367));
        }
        if (obj instanceof List) {
            return new C1068(((List) obj).get(m171.m639().intValue()));
        }
        if (obj.getClass().isArray()) {
            return new C1068(((Object[]) obj)[m171.m639().intValue()]);
        }
        throw new C0240(c1102, c0950, StringFog.decrypt("zAgWL/+xYRHoFhEh+fhqAKkJESL+8nYO+Q5EJ+jlJALxChYl/uJtCOdaQw==\n", "iXpkQI2RBGc=\n") + this + StringFog.decrypt("CbmSPmSK88xJo8YlNobpxw7Y72p5nbrDQKPHJGWG6tJB8cYvctP1wETm0T42\n", "LoOyShbzmqI=\n") + obj, null);
    }
}
