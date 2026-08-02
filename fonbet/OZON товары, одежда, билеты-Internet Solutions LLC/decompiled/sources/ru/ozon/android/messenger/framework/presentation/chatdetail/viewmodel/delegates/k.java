package ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.delegates;

import ru.ozon.android.messenger.framework.domain.usecases.C9391h;
import ru.ozon.android.messenger.framework.domain.usecases.C9392i;
import ru.ozon.android.messenger.framework.domain.usecases.e0;
import ru.ozon.android.messenger.framework.domain.usecases.f0;

/* loaded from: classes10.dex */
public final class k implements Jb.e<j> {

    /* renamed from: a, reason: collision with root package name */
    private final f0 f90154a;

    /* renamed from: b, reason: collision with root package name */
    private final C9392i f90155b;

    /* renamed from: c, reason: collision with root package name */
    private final ru.ozon.android.messenger.blocks.emptystate.f f90156c;

    /* renamed from: d, reason: collision with root package name */
    private final Pc.a<ru.ozon.android.messenger.framework.domain.repository.b> f90157d;

    /* renamed from: e, reason: collision with root package name */
    private final Pc.a<ru.ozon.android.messenger.framework.data.local.a> f90158e;

    /* renamed from: f, reason: collision with root package name */
    private final Jb.f f90159f;

    public k(f0 f0Var, C9392i c9392i, ru.ozon.android.messenger.blocks.emptystate.f fVar, Pc.a aVar, Pc.a aVar2, Jb.f fVar2) {
        this.f90154a = f0Var;
        this.f90155b = c9392i;
        this.f90156c = fVar;
        this.f90157d = aVar;
        this.f90158e = aVar2;
        this.f90159f = fVar2;
    }

    @Override // Pc.a
    public final Object get() {
        return new j((e0) this.f90154a.get(), (C9391h) this.f90155b.get(), (ru.ozon.android.messenger.blocks.emptystate.e) this.f90156c.get(), this.f90157d.get(), this.f90158e.get(), (ru.ozon.android.messenger.framework.presentation.chatdetail.a) this.f90159f.get());
    }
}
