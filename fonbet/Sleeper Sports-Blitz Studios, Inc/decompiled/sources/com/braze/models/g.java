package com.braze.models;

import kotlin.jvm.functions.Function1;
import org.json.JSONArray;

/* loaded from: classes6.dex */
public final class g implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ JSONArray f629a;

    public g(JSONArray jSONArray) {
        this.f629a = jSONArray;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object obj2 = this.f629a.get(((Number) obj).intValue());
        if (obj2 != null) {
            return obj2;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
    }
}
