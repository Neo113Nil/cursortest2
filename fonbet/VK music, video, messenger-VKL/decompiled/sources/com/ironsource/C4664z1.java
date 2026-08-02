package com.ironsource;

import com.unity3d.mediation.LevelPlay;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;
import xsna.on00;

/* renamed from: com.ironsource.z1, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4664z1 {
    private final Map<LevelPlay.AdFormat, C4501q> a;

    public C4664z1(JSONObject jSONObject) {
        LevelPlay.AdFormat[] values = LevelPlay.AdFormat.values();
        int e = on00.e(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(e < 16 ? 16 : e);
        for (LevelPlay.AdFormat adFormat : values) {
            JSONObject optJSONObject = jSONObject.optJSONObject(If.a(adFormat));
            if (optJSONObject == null) {
                optJSONObject = new JSONObject();
            }
            linkedHashMap.put(adFormat, new C4501q(optJSONObject));
        }
        this.a = linkedHashMap;
    }

    public final Map<LevelPlay.AdFormat, C4501q> a() {
        return this.a;
    }
}
