package com.braze.support;

import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class j implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f782a;

    public j(String str) {
        this.f782a = str;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final String invoke() {
        return "Failed to create valid enum from string: " + this.f782a;
    }
}
