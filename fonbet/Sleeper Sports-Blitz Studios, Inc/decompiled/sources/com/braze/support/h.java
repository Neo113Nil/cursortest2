package com.braze.support;

import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class h implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f780a;

    public h(String str) {
        this.f780a = str;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final String invoke() {
        return "Failed to parse string to map: '" + this.f780a + "'";
    }
}
