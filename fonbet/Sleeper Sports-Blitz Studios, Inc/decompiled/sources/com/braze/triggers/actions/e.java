package com.braze.triggers.actions;

import kotlin.jvm.functions.Function1;
import org.json.JSONArray;

/* loaded from: classes6.dex */
public final class e implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ JSONArray f800a;

    public e(JSONArray jSONArray) {
        this.f800a = jSONArray;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object obj2 = this.f800a.get(((Number) obj).intValue());
        if (obj2 != null) {
            return (String) obj2;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
    }
}
