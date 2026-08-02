package com.plaid.internal;

import javax.inject.Provider;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.plaid.internal.m3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3689m3 implements Gg.b {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<N6> f40795a;

    public C3689m3(C3608d3 c3608d3, Provider<N6> provider) {
        this.f40795a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        N6 eventSender = this.f40795a.get();
        Intrinsics.checkNotNullParameter(eventSender, "eventSender");
        return (H6) Gg.d.d(new H6(eventSender));
    }
}
