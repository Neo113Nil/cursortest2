package com.braze.coroutine;

import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class d implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Throwable f491a;

    public d(Throwable th) {
        this.f491a = th;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final String invoke() {
        return "Child job of SerialCoroutineScope got exception: " + this.f491a;
    }
}
