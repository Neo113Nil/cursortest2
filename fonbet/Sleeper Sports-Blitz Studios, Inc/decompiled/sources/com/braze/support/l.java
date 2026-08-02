package com.braze.support;

import kotlin.jvm.functions.Function1;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class l implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ JSONArray f784a;

    public l(JSONArray jSONArray) {
        this.f784a = jSONArray;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return Boolean.valueOf(this.f784a.opt(((Number) obj).intValue()) instanceof JSONObject);
    }
}
