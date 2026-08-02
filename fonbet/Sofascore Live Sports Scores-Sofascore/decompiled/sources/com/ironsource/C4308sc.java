package com.ironsource;

import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.sc, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4308sc implements InterfaceC4240of<JSONObject>, InterfaceC4204mf<C4273qc> {

    @NotNull
    private final Map<String, C4101h1> a = new LinkedHashMap();

    @Override // com.ironsource.InterfaceC4204mf
    public void a(@NotNull C4273qc c4273qc) {
        c4273qc.getClass();
        String c = c4273qc.c();
        Map<String, C4101h1> map = this.a;
        C4101h1 c4101h1 = map.get(c);
        if (c4101h1 == null) {
            c4101h1 = new C4101h1();
            map.put(c, c4101h1);
        }
        c4101h1.a(c4273qc.a(new C4290rc()));
    }

    @Override // com.ironsource.InterfaceC3956a7
    @NotNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject a(@NotNull EnumC4222nf enumC4222nf) {
        enumC4222nf.getClass();
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, C4101h1> entry : this.a.entrySet()) {
            String key = entry.getKey();
            JSONArray a = entry.getValue().a(enumC4222nf);
            if (a.length() > 0) {
                jSONObject.put(key, a);
            }
        }
        return jSONObject;
    }
}
