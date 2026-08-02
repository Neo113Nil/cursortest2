package ru.ozon.android.messenger.framework.data.remote.mapper;

import ru.ozon.android.messenger.framework.data.m;

/* loaded from: classes10.dex */
public final class b implements Jb.e<a> {

    /* renamed from: a, reason: collision with root package name */
    private final Pc.a<ru.ozon.android.messenger.framework.data.b> f87792a;

    /* renamed from: b, reason: collision with root package name */
    private final f f87793b;

    /* renamed from: c, reason: collision with root package name */
    private final Jb.f f87794c;

    /* renamed from: d, reason: collision with root package name */
    private final Pc.a<m> f87795d;

    public b(Pc.a aVar, f fVar, Jb.f fVar2, Pc.a aVar2) {
        this.f87792a = aVar;
        this.f87793b = fVar;
        this.f87794c = fVar2;
        this.f87795d = aVar2;
    }

    @Override // Pc.a
    public final Object get() {
        return new a(this.f87792a.get(), (e) this.f87793b.get(), (ru.ozon.android.messenger.framework.logger.b) this.f87794c.get(), this.f87795d.get());
    }
}
