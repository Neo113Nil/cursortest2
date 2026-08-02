package com.braze.models.inappmessage;

import kotlin.jvm.functions.Function1;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class h implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ JSONArray f636a;

    public h(JSONArray jSONArray) {
        this.f636a = jSONArray;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object obj2 = this.f636a.get(((Number) obj).intValue());
        if (obj2 != null) {
            return (JSONObject) obj2;
        }
        throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
    }
}
