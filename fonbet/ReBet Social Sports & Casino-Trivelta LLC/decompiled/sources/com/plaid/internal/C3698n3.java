package com.plaid.internal;

import javax.inject.Provider;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.plaid.internal.n3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3698n3 implements Gg.b {

    /* renamed from: a, reason: collision with root package name */
    public final C3733r3 f40845a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<String> f40846b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<I> f40847c;

    public C3698n3(C3608d3 c3608d3, C3733r3 c3733r3, Provider provider, Provider provider2) {
        this.f40845a = c3733r3;
        this.f40846b = provider;
        this.f40847c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        i8 workflowApi = (i8) this.f40845a.get();
        String persistentLinkId = this.f40846b.get();
        I clientTypeProvider = this.f40847c.get();
        Intrinsics.checkNotNullParameter(workflowApi, "workflowApi");
        Intrinsics.checkNotNullParameter(persistentLinkId, "persistentLinkId");
        Intrinsics.checkNotNullParameter(clientTypeProvider, "clientTypeProvider");
        return (N6) Gg.d.d(new N6(workflowApi, persistentLinkId, clientTypeProvider));
    }
}
