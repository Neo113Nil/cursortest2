package ru.ozon.android.messenger.framework.domain.usecases;

/* renamed from: ru.ozon.android.messenger.framework.domain.usecases.i, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C9392i implements Jb.e<C9391h> {

    /* renamed from: a, reason: collision with root package name */
    private final Pc.a<ru.ozon.android.messenger.framework.domain.repository.b> f89087a;

    /* renamed from: b, reason: collision with root package name */
    private final Jb.f f89088b;

    /* renamed from: c, reason: collision with root package name */
    private final ru.ozon.android.messenger.framework.composer.di.module.b f89089c;

    public C9392i(Pc.a aVar, Jb.f fVar, ru.ozon.android.messenger.framework.composer.di.module.b bVar) {
        this.f89087a = aVar;
        this.f89088b = fVar;
        this.f89089c = bVar;
    }

    @Override // Pc.a
    public final Object get() {
        return new C9391h(this.f89087a.get(), (ru.ozon.android.messenger.framework.analytics.i) this.f89088b.get(), (W) this.f89089c.get());
    }
}
