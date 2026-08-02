package com.braze.coroutine;

import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class a implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Throwable f489a;

    public a(Throwable th) {
        this.f489a = th;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final String invoke() {
        return "Child job of BrazeCoroutineScope got exception: " + this.f489a;
    }
}
