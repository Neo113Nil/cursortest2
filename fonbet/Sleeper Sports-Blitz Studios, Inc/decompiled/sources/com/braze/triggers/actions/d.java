package com.braze.triggers.actions;

import kotlin.jvm.functions.Function1;
import org.json.JSONArray;

/* loaded from: classes6.dex */
public final class d implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ JSONArray f799a;

    public d(JSONArray jSONArray) {
        this.f799a = jSONArray;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return Boolean.valueOf(this.f799a.opt(((Number) obj).intValue()) instanceof String);
    }
}
