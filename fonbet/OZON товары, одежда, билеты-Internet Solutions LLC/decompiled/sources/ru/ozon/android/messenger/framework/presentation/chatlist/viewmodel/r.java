package ru.ozon.android.messenger.framework.presentation.chatlist.viewmodel;

import ru.ozon.android.messenger.framework.domain.usecases.C9394k;
import ru.ozon.android.messenger.framework.domain.usecases.C9395l;
import ru.ozon.android.messenger.framework.domain.usecases.C9396m;

/* loaded from: classes10.dex */
public final class r implements Jb.e<C9500l> {

    /* renamed from: a, reason: collision with root package name */
    private final C9395l f90680a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a<C9396m> f90681b;

    /* renamed from: c, reason: collision with root package name */
    private final ru.ozon.android.messenger.blocks.emptystate.f f90682c;

    /* renamed from: d, reason: collision with root package name */
    private final Pc.a<ru.ozon.android.messenger.blocks.alert.a> f90683d;

    /* renamed from: e, reason: collision with root package name */
    private final Pc.a<ru.ozon.android.messenger.framework.domain.repository.b> f90684e;

    /* renamed from: f, reason: collision with root package name */
    private final Jb.f f90685f;

    public r(C9395l c9395l, Pc.a aVar, ru.ozon.android.messenger.blocks.emptystate.f fVar, Pc.a aVar2, Pc.a aVar3, Jb.f fVar2) {
        this.f90680a = c9395l;
        this.f90681b = aVar;
        this.f90682c = fVar;
        this.f90683d = aVar2;
        this.f90684e = aVar3;
        this.f90685f = fVar2;
    }

    @Override // Pc.a
    public final Object get() {
        return new C9500l((C9394k) this.f90680a.get(), this.f90681b.get(), (ru.ozon.android.messenger.blocks.emptystate.e) this.f90682c.get(), this.f90683d.get(), this.f90684e.get(), (ru.ozon.android.messenger.framework.analytics.i) this.f90685f.get());
    }
}
