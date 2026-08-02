package ru.ozon.android.messenger.framework.composer.screen;

import m20.InterfaceC8046a;
import n20.C8425e;

/* loaded from: classes10.dex */
public final class h implements Jb.e<g> {

    /* renamed from: a, reason: collision with root package name */
    private final Pc.a<K00.a> f86812a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a<C8425e<InterfaceC8046a<?, ? extends l20.c>>> f86813b;

    /* renamed from: c, reason: collision with root package name */
    private final ru.ozon.android.messenger.framework.composer.issue.b f86814c;

    /* renamed from: d, reason: collision with root package name */
    private final Pc.a<RZ.a> f86815d;

    public h(Pc.a aVar, Pc.a aVar2, ru.ozon.android.messenger.framework.composer.issue.b bVar, Pc.a aVar3) {
        this.f86812a = aVar;
        this.f86813b = aVar2;
        this.f86814c = bVar;
        this.f86815d = aVar3;
    }

    @Override // Pc.a
    public final Object get() {
        return new g(this.f86812a.get(), this.f86813b.get(), (ru.ozon.android.messenger.framework.composer.issue.a) this.f86814c.get(), this.f86815d.get());
    }
}
