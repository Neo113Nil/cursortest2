package ru.ozon.android.messenger.blocks.rateoperator.bottomsheet;

import ru.ozon.android.messenger.framework.data.repository.G;

/* loaded from: classes10.dex */
public final class i implements Jb.e<h> {

    /* renamed from: a, reason: collision with root package name */
    private final G f86215a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a<ru.ozon.android.messenger.framework.navigation.controller.a> f86216b;

    /* renamed from: c, reason: collision with root package name */
    private final Pc.a<ru.ozon.android.messenger.framework.domain.repository.b> f86217c;

    public i(G g10, Pc.a aVar, Pc.a aVar2) {
        this.f86215a = g10;
        this.f86216b = aVar;
        this.f86217c = aVar2;
    }

    @Override // Pc.a
    public final Object get() {
        return new h((ru.ozon.android.messenger.framework.domain.repository.a) this.f86215a.get(), this.f86216b.get(), this.f86217c.get());
    }
}
