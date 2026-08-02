package ru.ozon.android.messenger.framework.presentation.chatlist.viewmodel;

import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.android.messenger.framework.presentation.common.notification.d;

/* loaded from: classes10.dex */
public final class T {

    /* renamed from: a, reason: collision with root package name */
    private final Pc.a<ru.ozon.android.messenger.framework.navigation.controller.b> f90597a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a<ru.ozon.android.messenger.framework.domain.repository.b> f90598b;

    /* renamed from: c, reason: collision with root package name */
    private final Pa0.l f90599c;

    /* renamed from: d, reason: collision with root package name */
    private final Pc.a<ru.ozon.android.messenger.framework.domain.usecases.r> f90600d;

    /* renamed from: e, reason: collision with root package name */
    private final ru.ozon.android.messenger.framework.domain.usecases.C f90601e;

    /* renamed from: f, reason: collision with root package name */
    private final ru.ozon.android.messenger.framework.domain.mappers.b f90602f;

    /* renamed from: g, reason: collision with root package name */
    private final Jb.f f90603g;

    /* renamed from: h, reason: collision with root package name */
    private final Pc.a<ru.ozon.android.messenger.blocks.alert.a> f90604h;

    /* renamed from: i, reason: collision with root package name */
    private final ru.ozon.android.messenger.framework.data.repository.G f90605i;

    /* renamed from: j, reason: collision with root package name */
    private final Jb.f f90606j;

    /* renamed from: k, reason: collision with root package name */
    private final ru.ozon.android.messenger.framework.presentation.common.notification.h f90607k;

    /* renamed from: l, reason: collision with root package name */
    private final Jb.f f90608l;

    /* renamed from: m, reason: collision with root package name */
    private final Jb.c f90609m;

    /* renamed from: n, reason: collision with root package name */
    private final ru.ozon.android.messenger.framework.data.remote.serialize.d f90610n;

    /* renamed from: o, reason: collision with root package name */
    private final C9498j f90611o;

    /* renamed from: p, reason: collision with root package name */
    private final r f90612p;

    public T(Pc.a aVar, Pc.a aVar2, Pa0.l lVar, Pc.a aVar3, ru.ozon.android.messenger.framework.domain.usecases.C c11, ru.ozon.android.messenger.framework.presentation.chatlist.e eVar, ru.ozon.android.messenger.framework.domain.mappers.b bVar, Jb.f fVar, Pc.a aVar4, ru.ozon.android.messenger.framework.data.repository.G g10, Jb.f fVar2, ru.ozon.android.messenger.framework.presentation.common.notification.h hVar, Jb.f fVar3, Jb.c cVar, ru.ozon.android.messenger.framework.data.remote.serialize.d dVar, C9498j c9498j, r rVar) {
        this.f90597a = aVar;
        this.f90598b = aVar2;
        this.f90599c = lVar;
        this.f90600d = aVar3;
        this.f90601e = c11;
        this.f90602f = bVar;
        this.f90603g = fVar;
        this.f90604h = aVar4;
        this.f90605i = g10;
        this.f90606j = fVar2;
        this.f90607k = hVar;
        this.f90608l = fVar3;
        this.f90609m = cVar;
        this.f90610n = dVar;
        this.f90611o = c9498j;
        this.f90612p = rVar;
    }

    public final C9509v a() {
        return new C9509v(this.f90597a.get(), this.f90598b.get(), (ru.ozon.android.messenger.blocks.input.viewmodel.e) this.f90599c.get(), this.f90600d.get(), (ru.ozon.android.messenger.framework.domain.usecases.B) this.f90601e.get(), new ru.ozon.android.messenger.framework.presentation.chatlist.d(), (ru.ozon.android.messenger.framework.domain.mappers.a) this.f90602f.get(), (ru.ozon.android.messenger.framework.analytics.i) this.f90603g.get(), this.f90604h.get(), (ru.ozon.android.messenger.framework.domain.repository.a) this.f90605i.get(), (d.a) this.f90606j.get(), (ru.ozon.android.messenger.framework.presentation.common.notification.g) this.f90607k.get(), (ru.ozon.android.messenger.framework.core.c) this.f90608l.get(), this.f90609m, (JsonParser) this.f90610n.get(), (C9490b) this.f90611o.get(), (C9500l) this.f90612p.get());
    }
}
