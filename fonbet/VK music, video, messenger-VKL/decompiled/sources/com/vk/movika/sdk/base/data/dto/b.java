package com.vk.movika.sdk.base.data.dto;

import kotlinx.serialization.json.JsonElement;
import xsna.c9y;
import xsna.e9y;
import xsna.j8y;
import xsna.oqm0;
import xsna.zay;

/* loaded from: classes3.dex */
public final class b extends zay<String> {
    public b() {
        super(oqm0.a);
    }

    @Override // xsna.zay
    public final JsonElement transformDeserialize(JsonElement jsonElement) {
        j8y.a aVar = j8y.d;
        aVar.getClass();
        return c9y.b(aVar.b(JsonElement.Companion.serializer(), jsonElement));
    }

    @Override // xsna.zay
    public final JsonElement transformSerialize(JsonElement jsonElement) {
        String c = c9y.e(jsonElement).c();
        j8y.a aVar = j8y.d;
        aVar.getClass();
        return (JsonElement) aVar.a(e9y.a, c);
    }
}
