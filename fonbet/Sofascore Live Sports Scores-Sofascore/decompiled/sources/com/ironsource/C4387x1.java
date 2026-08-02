package com.ironsource;

import com.unity3d.mediation.LevelPlay;
import defpackage.sub;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.x1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4387x1 {

    @NotNull
    private final Map<LevelPlay.AdFormat, C4260q> a;

    public C4387x1(@NotNull JSONObject jSONObject) {
        jSONObject.getClass();
        LevelPlay.AdFormat[] values = LevelPlay.AdFormat.values();
        int c = sub.c(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(c < 16 ? 16 : c);
        for (LevelPlay.AdFormat adFormat : values) {
            JSONObject optJSONObject = jSONObject.optJSONObject(Gf.a(adFormat));
            if (optJSONObject == null) {
                optJSONObject = new JSONObject();
            }
            linkedHashMap.put(adFormat, new C4260q(optJSONObject));
        }
        this.a = linkedHashMap;
    }

    @NotNull
    public final Map<LevelPlay.AdFormat, C4260q> a() {
        return this.a;
    }
}
