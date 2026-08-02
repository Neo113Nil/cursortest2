package ru.ozon.android.messenger.framework.presentation.search;

import androidx.lifecycle.C5418g0;
import ru.ozon.android.messenger.framework.presentation.common.notification.d;

/* loaded from: classes10.dex */
public final class I {

    /* renamed from: a, reason: collision with root package name */
    private final Pc.a<ru.ozon.android.messenger.framework.navigation.controller.b> f91587a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a<ru.ozon.android.messenger.framework.domain.repository.b> f91588b;

    /* renamed from: c, reason: collision with root package name */
    private final ru.ozon.android.messenger.framework.domain.usecases.C f91589c;

    /* renamed from: d, reason: collision with root package name */
    private final ru.ozon.android.messenger.blocks.emptystate.d f91590d;

    /* renamed from: e, reason: collision with root package name */
    private final ru.ozon.android.messenger.framework.presentation.common.notification.h f91591e;

    /* renamed from: f, reason: collision with root package name */
    private final Jb.f f91592f;

    /* renamed from: g, reason: collision with root package name */
    private final Jb.f f91593g;

    public I(Pc.a aVar, Pc.a aVar2, ru.ozon.android.messenger.framework.domain.usecases.C c11, ru.ozon.android.messenger.blocks.emptystate.d dVar, ru.ozon.android.messenger.framework.presentation.common.notification.h hVar, Jb.f fVar, Jb.f fVar2, M m11) {
        this.f91587a = aVar;
        this.f91588b = aVar2;
        this.f91589c = c11;
        this.f91590d = dVar;
        this.f91591e = hVar;
        this.f91592f = fVar;
        this.f91593g = fVar2;
    }

    public final C9527g a(C5418g0 c5418g0) {
        return new C9527g(this.f91587a.get(), c5418g0, this.f91588b.get(), (ru.ozon.android.messenger.framework.domain.usecases.B) this.f91589c.get(), (ru.ozon.android.messenger.blocks.emptystate.c) this.f91590d.get(), (ru.ozon.android.messenger.framework.presentation.common.notification.g) this.f91591e.get(), (d.a) this.f91592f.get(), (ru.ozon.android.messenger.framework.analytics.i) this.f91593g.get(), new Ti.c());
    }
}
