package ru.ozon.android.messenger.framework.data.remote.mapper;

/* loaded from: classes10.dex */
public final class h implements Jb.e<g> {

    /* renamed from: a, reason: collision with root package name */
    private final Jb.c f87808a;

    /* renamed from: b, reason: collision with root package name */
    private final ru.ozon.android.messenger.blocks.cell.b f87809b;

    public h(Jb.c cVar, ru.ozon.android.messenger.blocks.cell.b bVar) {
        this.f87808a = cVar;
        this.f87809b = bVar;
    }

    @Override // Pc.a
    public final Object get() {
        return new g((a) this.f87808a.get(), (ru.ozon.android.messenger.blocks.cell.a) this.f87809b.get());
    }
}
