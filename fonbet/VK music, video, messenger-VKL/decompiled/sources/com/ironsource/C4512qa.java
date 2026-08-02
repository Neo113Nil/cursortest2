package com.ironsource;

import org.json.JSONObject;

/* renamed from: com.ironsource.qa, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4512qa implements Te<JSONObject> {
    private final Te<String> a;

    public C4512qa(Te<String> te) {
        this.a = te;
    }

    @Override // com.ironsource.Te
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject a() {
        return new JSONObject(this.a.a());
    }
}
