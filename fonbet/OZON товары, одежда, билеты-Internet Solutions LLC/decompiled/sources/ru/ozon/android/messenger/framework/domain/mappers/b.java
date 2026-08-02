package ru.ozon.android.messenger.framework.domain.mappers;

import Jb.e;

/* loaded from: classes10.dex */
public final class b implements e<a> {

    /* renamed from: a, reason: collision with root package name */
    private final Pc.a<ru.ozon.android.messenger.framework.data.b> f88797a;

    public b(Pc.a<ru.ozon.android.messenger.framework.data.b> aVar) {
        this.f88797a = aVar;
    }

    @Override // Pc.a
    public final Object get() {
        return new a(this.f88797a.get());
    }
}
