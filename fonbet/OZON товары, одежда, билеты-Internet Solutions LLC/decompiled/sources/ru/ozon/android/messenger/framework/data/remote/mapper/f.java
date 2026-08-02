package ru.ozon.android.messenger.framework.data.remote.mapper;

/* loaded from: classes10.dex */
public final class f implements Jb.e<e> {

    /* renamed from: a, reason: collision with root package name */
    private final Pc.a<ru.ozon.android.messenger.framework.data.b> f87801a;

    /* renamed from: b, reason: collision with root package name */
    private final ru.ozon.android.messenger.blocks.emptystate.f f87802b;

    public f(Pc.a aVar, ru.ozon.android.messenger.blocks.emptystate.f fVar) {
        this.f87801a = aVar;
        this.f87802b = fVar;
    }

    @Override // Pc.a
    public final Object get() {
        return new e(this.f87801a.get(), (ru.ozon.android.messenger.blocks.emptystate.e) this.f87802b.get());
    }
}
