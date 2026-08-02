package com.braze.storage;

import kotlin.jvm.functions.Function1;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class n implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ JSONArray f732a;

    public n(JSONArray jSONArray) {
        this.f732a = jSONArray;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return Boolean.valueOf(this.f732a.opt(((Number) obj).intValue()) instanceof JSONObject);
    }
}
