package ru.ozon.android.messenger.framework.domain.usecases;

/* loaded from: classes10.dex */
public final class f0 implements Jb.e<e0> {

    /* renamed from: a, reason: collision with root package name */
    private final Pc.a<ru.ozon.android.messenger.framework.domain.repository.b> f89077a;

    /* renamed from: b, reason: collision with root package name */
    private final Jb.f f89078b;

    /* renamed from: c, reason: collision with root package name */
    private final ru.ozon.android.messenger.framework.composer.di.module.b f89079c;

    public f0(Pc.a aVar, Jb.f fVar, ru.ozon.android.messenger.framework.composer.di.module.b bVar) {
        this.f89077a = aVar;
        this.f89078b = fVar;
        this.f89079c = bVar;
    }

    @Override // Pc.a
    public final Object get() {
        return new e0(this.f89077a.get(), (ru.ozon.android.messenger.framework.analytics.i) this.f89078b.get(), (W) this.f89079c.get());
    }
}
