package ru.ozon.android.messenger.framework.data.repository;

import ru.ozon.android.messenger.framework.data.remote.websocket.C9331b;

/* loaded from: classes10.dex */
public final class Q implements Jb.e<I> {

    /* renamed from: a, reason: collision with root package name */
    private final Pc.a<ru.ozon.android.messenger.framework.data.remote.mapper.g> f88381a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a<ru.ozon.android.messenger.framework.data.remote.mapper.c> f88382b;

    /* renamed from: c, reason: collision with root package name */
    private final Pc.a<C9331b> f88383c;

    /* renamed from: d, reason: collision with root package name */
    private final Pc.a<ru.ozon.android.messenger.framework.data.cache.b> f88384d;

    /* renamed from: e, reason: collision with root package name */
    private final Pc.a<ru.ozon.android.messenger.framework.data.cache.f> f88385e;

    /* renamed from: f, reason: collision with root package name */
    private final i0 f88386f;

    /* renamed from: g, reason: collision with root package name */
    private final Pc.a<X> f88387g;

    /* renamed from: h, reason: collision with root package name */
    private final Pc.a<ru.ozon.android.messenger.framework.data.local.mapper.c> f88388h;

    /* renamed from: i, reason: collision with root package name */
    private final Pc.a<ru.ozon.android.messenger.framework.data.local.s> f88389i;

    /* renamed from: j, reason: collision with root package name */
    private final ru.ozon.android.messenger.framework.data.local.q f88390j;

    /* renamed from: k, reason: collision with root package name */
    private final Pc.a<H> f88391k;

    /* renamed from: l, reason: collision with root package name */
    private final ru.ozon.android.messenger.blocks.input.attachments.data.k f88392l;

    /* renamed from: m, reason: collision with root package name */
    private final Pc.a<S> f88393m;

    public Q(Pc.a aVar, Pc.a aVar2, Pc.a aVar3, Pc.a aVar4, Pc.a aVar5, i0 i0Var, Pc.a aVar6, Pc.a aVar7, Pc.a aVar8, ru.ozon.android.messenger.framework.di.y yVar, ru.ozon.android.messenger.framework.di.z zVar, ru.ozon.android.messenger.framework.data.local.q qVar, Pc.a aVar9, ru.ozon.android.messenger.blocks.input.attachments.data.k kVar, Pc.a aVar10) {
        this.f88381a = aVar;
        this.f88382b = aVar2;
        this.f88383c = aVar3;
        this.f88384d = aVar4;
        this.f88385e = aVar5;
        this.f88386f = i0Var;
        this.f88387g = aVar6;
        this.f88388h = aVar7;
        this.f88389i = aVar8;
        this.f88390j = qVar;
        this.f88391k = aVar9;
        this.f88392l = kVar;
        this.f88393m = aVar10;
    }

    @Override // Pc.a
    public final Object get() {
        return new I(this.f88381a.get(), this.f88382b.get(), this.f88383c.get(), this.f88384d.get(), this.f88385e.get(), (c0) this.f88386f.get(), this.f88387g.get(), this.f88388h.get(), this.f88389i.get(), ru.ozon.android.messenger.framework.di.y.b(), ru.ozon.android.messenger.framework.di.z.b(), (ru.ozon.android.messenger.framework.domain.repository.c) this.f88390j.get(), this.f88391k.get(), (ru.ozon.android.messenger.blocks.input.attachments.data.g) this.f88392l.get(), this.f88393m.get());
    }
}
