package ru.ozon.android.messenger.framework.presentation.messenger;

import ru.ozon.android.messenger.framework.core.initialization.d;
import ru.ozon.android.messenger.framework.data.repository.n0;
import ru.ozon.android.messenger.framework.di.z;
import ru.ozon.android.messenger.framework.domain.usecases.C9407y;
import ru.ozon.android.messenger.framework.domain.usecases.C9408z;
import xe.I;

/* loaded from: classes10.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    private final C9408z f91404a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a<ru.ozon.android.messenger.framework.domain.repository.b> f91405b;

    /* renamed from: c, reason: collision with root package name */
    private final Pc.a<ru.ozon.android.messenger.framework.domain.usecases.r> f91406c;

    /* renamed from: d, reason: collision with root package name */
    private final Pc.a<n0> f91407d;

    /* renamed from: e, reason: collision with root package name */
    private final Jb.f f91408e;

    /* renamed from: f, reason: collision with root package name */
    private final Jb.f f91409f;

    /* renamed from: g, reason: collision with root package name */
    private final Pc.a<ru.ozon.android.messenger.framework.navigation.controller.b> f91410g;

    /* renamed from: h, reason: collision with root package name */
    private final Jb.f f91411h;

    /* renamed from: i, reason: collision with root package name */
    private final z f91412i;

    public u(C9408z c9408z, Pc.a aVar, Pc.a aVar2, Pc.a aVar3, Jb.f fVar, Jb.f fVar2, Pc.a aVar4, Jb.f fVar3, z zVar) {
        this.f91404a = c9408z;
        this.f91405b = aVar;
        this.f91406c = aVar2;
        this.f91407d = aVar3;
        this.f91408e = fVar;
        this.f91409f = fVar2;
        this.f91410g = aVar4;
        this.f91411h = fVar3;
        this.f91412i = zVar;
    }

    public final l a(f fVar) {
        return new l((C9407y) this.f91404a.get(), this.f91405b.get(), this.f91406c.get(), this.f91407d.get(), (d.g) this.f91408e.get(), (ru.ozon.android.messenger.framework.analytics.i) this.f91409f.get(), this.f91410g.get(), (ru.ozon.android.messenger.framework.navigation.action.f) this.f91411h.get(), (I) this.f91412i.get(), fVar);
    }
}
