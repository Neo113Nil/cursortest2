package com.braze.models;

import kotlin.jvm.functions.Function1;
import org.json.JSONArray;

/* loaded from: classes6.dex */
public final class f implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ JSONArray f628a;

    public f(JSONArray jSONArray) {
        this.f628a = jSONArray;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return Boolean.valueOf(this.f628a.opt(((Number) obj).intValue()) instanceof Object);
    }
}
