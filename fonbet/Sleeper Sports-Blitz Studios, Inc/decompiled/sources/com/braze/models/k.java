package com.braze.models;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface k extends IPutIntoJson {
    default String a() {
        String jSONObject = ((com.braze.models.outgoing.event.b) this).getJsonObject().toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "toString(...)");
        return jSONObject;
    }
}
