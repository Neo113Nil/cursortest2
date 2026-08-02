package com.ironsource;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class H0 implements InterfaceC4240of<JSONObject>, InterfaceC4204mf<F0> {

    @NotNull
    private final Map<String, C4308sc> a = new LinkedHashMap();

    @Override // com.ironsource.InterfaceC4204mf
    public void a(@NotNull F0 f0) {
        f0.getClass();
        String d = f0.d();
        Map<String, C4308sc> map = this.a;
        C4308sc c4308sc = map.get(d);
        if (c4308sc == null) {
            c4308sc = new C4308sc();
            map.put(d, c4308sc);
        }
        c4308sc.a(f0.a(new G0()));
    }

    @Override // com.ironsource.InterfaceC3956a7
    @NotNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject a(@NotNull EnumC4222nf enumC4222nf) {
        enumC4222nf.getClass();
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, C4308sc> entry : this.a.entrySet()) {
            String key = entry.getKey();
            JSONObject a = entry.getValue().a(enumC4222nf);
            if (a.length() > 0) {
                jSONObject.put(StringsKt.f0(key, "_"), a);
            }
        }
        return jSONObject;
    }
}
