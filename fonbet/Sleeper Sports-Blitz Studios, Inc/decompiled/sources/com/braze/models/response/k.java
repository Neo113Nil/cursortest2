package com.braze.models.response;

import kotlin.jvm.functions.Function1;
import org.json.JSONArray;

/* loaded from: classes6.dex */
public final class k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ JSONArray f657a;

    public k(JSONArray jSONArray) {
        this.f657a = jSONArray;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return Boolean.valueOf(this.f657a.opt(((Number) obj).intValue()) instanceof String);
    }
}
