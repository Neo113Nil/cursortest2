package com.braze.support;

import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class e implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f777a;

    public e(String str) {
        this.f777a = str;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final String invoke() {
        return "Failed to parse JSON list: '" + this.f777a + "'";
    }
}
