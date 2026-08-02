package ru.ozon.android.messenger.framework.presentation.common.notification;

/* loaded from: classes10.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final Pc.a<ru.ozon.android.messenger.framework.domain.repository.b> f90787a;

    /* renamed from: b, reason: collision with root package name */
    private final ru.ozon.android.messenger.blocks.emptystate.f f90788b;

    public e(Pc.a aVar, ru.ozon.android.messenger.blocks.emptystate.f fVar) {
        this.f90787a = aVar;
        this.f90788b = fVar;
    }

    public final d a(ru.ozon.android.messenger.blocks.emptystate.j jVar) {
        return new d(this.f90787a.get(), (ru.ozon.android.messenger.blocks.emptystate.e) this.f90788b.get(), jVar);
    }
}
