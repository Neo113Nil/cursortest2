package ru.ozon.android.messenger.framework.domain.usecases;

/* renamed from: ru.ozon.android.messenger.framework.domain.usecases.l, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C9395l implements Jb.e<C9394k> {

    /* renamed from: a, reason: collision with root package name */
    private final Pc.a<ru.ozon.android.messenger.framework.domain.repository.b> f89098a;

    /* renamed from: b, reason: collision with root package name */
    private final ru.ozon.android.messenger.framework.composer.di.module.b f89099b;

    /* renamed from: c, reason: collision with root package name */
    private final C f89100c;

    public C9395l(Pc.a aVar, ru.ozon.android.messenger.framework.composer.di.module.b bVar, C c11) {
        this.f89098a = aVar;
        this.f89099b = bVar;
        this.f89100c = c11;
    }

    @Override // Pc.a
    public final Object get() {
        return new C9394k(this.f89098a.get(), (W) this.f89099b.get(), (B) this.f89100c.get());
    }
}
