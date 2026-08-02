package io.appmetrica.analytics.location.impl;

import io.appmetrica.analytics.locationapi.internal.CacheArguments;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class j implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f15028a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f15029b;

    public j(k kVar, i iVar) {
        this.f15029b = kVar;
        this.f15028a = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p pVar = this.f15029b.f15032c;
        i iVar = this.f15028a;
        pVar.f15048a = iVar;
        CacheArguments cacheArguments = iVar.f15027b;
        pVar.f15049b.updateCacheControl(cacheArguments.getRefreshPeriod(), cacheArguments.getOutdatedTimeInterval());
    }
}
