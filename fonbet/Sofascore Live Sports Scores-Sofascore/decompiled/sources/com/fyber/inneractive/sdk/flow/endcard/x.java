package com.fyber.inneractive.sdk.flow.endcard;

import com.fyber.inneractive.sdk.flow.y0;
import org.json.JSONArray;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class x extends c {
    public x(y0 y0Var, com.fyber.inneractive.sdk.model.vast.c cVar, int i) {
        super(y0Var, cVar, i);
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.b
    public final void a(JSONArray jSONArray) {
        this.b = jSONArray;
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.b
    public final n c() {
        return new u(this);
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.b
    public final boolean k() {
        JSONArray jSONArray = this.b;
        return jSONArray != null && jSONArray.length() > 0;
    }
}
