package com.plaid.internal;

import javax.inject.Provider;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.plaid.internal.f3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3626f3 implements Gg.b {

    /* renamed from: a, reason: collision with root package name */
    public final C3733r3 f40596a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<C3787x3> f40597b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<L4> f40598c;

    /* renamed from: d, reason: collision with root package name */
    public final G3 f40599d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<n8> f40600e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<y8> f40601f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<H6> f40602g;

    public C3626f3(C3608d3 c3608d3, C3733r3 c3733r3, Provider provider, Provider provider2, G3 g32, Provider provider3, Provider provider4, Provider provider5) {
        this.f40596a = c3733r3;
        this.f40597b = provider;
        this.f40598c = provider2;
        this.f40599d = g32;
        this.f40600e = provider3;
        this.f40601f = provider4;
        this.f40602g = provider5;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        i8 api = (i8) this.f40596a.get();
        C3787x3 linkWorkflowAnalytics = this.f40597b.get();
        L4 paneStore = this.f40598c.get();
        F3 localErrorFactory = (F3) this.f40599d.get();
        n8 requestFactory = this.f40600e.get();
        y8 writeOAuthRedirectUri = this.f40601f.get();
        H6 remoteLogController = this.f40602g.get();
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(linkWorkflowAnalytics, "linkWorkflowAnalytics");
        Intrinsics.checkNotNullParameter(paneStore, "paneStore");
        Intrinsics.checkNotNullParameter(localErrorFactory, "localErrorFactory");
        Intrinsics.checkNotNullParameter(requestFactory, "requestFactory");
        Intrinsics.checkNotNullParameter(writeOAuthRedirectUri, "writeOAuthRedirectUri");
        Intrinsics.checkNotNullParameter(remoteLogController, "remoteLogController");
        return (Y2) Gg.d.d(new Y2(api, paneStore, linkWorkflowAnalytics, localErrorFactory, requestFactory, writeOAuthRedirectUri, remoteLogController));
    }
}
