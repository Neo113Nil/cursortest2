package ru.ozon.android.messenger.framework.domain.service;

import ru.ozon.android.messenger.framework.domain.service.InterfaceC9383a;

/* loaded from: classes10.dex */
public final class b implements Jb.e<InterfaceC9383a.C1636a> {

    /* renamed from: a, reason: collision with root package name */
    private final Pc.a<ru.ozon.android.messenger.framework.data.m> f88862a;

    /* renamed from: b, reason: collision with root package name */
    private final Jb.f f88863b;

    public b(Jb.f fVar, Pc.a aVar) {
        this.f88862a = aVar;
        this.f88863b = fVar;
    }

    @Override // Pc.a
    public final Object get() {
        return new InterfaceC9383a.C1636a(this.f88862a.get(), (ru.ozon.android.messenger.framework.core.initialization.d) this.f88863b.get());
    }
}
