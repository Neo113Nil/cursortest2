package ru.ozon.android.messenger.framework.domain.usecases;

/* renamed from: ru.ozon.android.messenger.framework.domain.usecases.z, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C9408z implements Jb.e<C9407y> {

    /* renamed from: a, reason: collision with root package name */
    private final Pc.a<ru.ozon.android.messenger.framework.domain.repository.b> f89153a;

    /* renamed from: b, reason: collision with root package name */
    private final Jb.f f89154b;

    public C9408z(Jb.f fVar, Pc.a aVar) {
        this.f89153a = aVar;
        this.f89154b = fVar;
    }

    @Override // Pc.a
    public final Object get() {
        return new C9407y(this.f89153a.get(), (ru.ozon.android.messenger.framework.analytics.i) this.f89154b.get());
    }
}
