package com.ironsource;

import com.huawei.hms.framework.common.BundleUtil;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;
import xsna.drm0;

/* loaded from: classes13.dex */
public final class I0 implements InterfaceC4517qf<JSONObject>, InterfaceC4481of<G0> {
    private final Map<String, C4567tc> a = new LinkedHashMap();

    @Override // com.ironsource.InterfaceC4294e7
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject a(EnumC4499pf enumC4499pf) {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, C4567tc> entry : this.a.entrySet()) {
            String key = entry.getKey();
            JSONObject a = entry.getValue().a(enumC4499pf);
            if (a.length() > 0) {
                jSONObject.put(drm0.j0(key, BundleUtil.UNDERLINE_TAG, key), a);
            }
        }
        return jSONObject;
    }

    @Override // com.ironsource.InterfaceC4481of
    public void a(G0 g0) {
        String d = g0.d();
        Map<String, C4567tc> map = this.a;
        C4567tc c4567tc = map.get(d);
        if (c4567tc == null) {
            c4567tc = new C4567tc();
            map.put(d, c4567tc);
        }
        c4567tc.a(g0.a(new H0()));
    }
}
