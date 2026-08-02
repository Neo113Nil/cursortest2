package ru.ozon.android.messenger.framework.di;

import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.framework.domain.usecases.C9388e;
import ru.ozon.android.messenger.framework.domain.usecases.C9396m;
import ru.ozon.android.messenger.framework.domain.usecases.C9397n;

/* loaded from: classes10.dex */
public final class q implements Jb.e<ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.delegates.a> {

    /* renamed from: a, reason: collision with root package name */
    private final Ua0.b f88745a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a<C9396m> f88746b;

    /* renamed from: c, reason: collision with root package name */
    private final f30.k f88747c;

    /* renamed from: d, reason: collision with root package name */
    private final ru.ozon.android.messenger.blocks.emptystate.f f88748d;

    /* renamed from: e, reason: collision with root package name */
    private final Pc.a<ru.ozon.android.messenger.framework.domain.repository.b> f88749e;

    /* renamed from: f, reason: collision with root package name */
    private final Jb.f f88750f;

    /* renamed from: g, reason: collision with root package name */
    private final Pc.a<ru.ozon.android.messenger.framework.data.local.a> f88751g;

    /* renamed from: h, reason: collision with root package name */
    private final Jb.f f88752h;

    /* renamed from: i, reason: collision with root package name */
    private final Pc.a<ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.delegates.o> f88753i;

    /* renamed from: j, reason: collision with root package name */
    private final Pc.a<ru.ozon.android.messenger.framework.presentation.common.startup.a> f88754j;

    /* renamed from: k, reason: collision with root package name */
    private final Pc.a<ru.ozon.android.messenger.framework.presentation.chatdetail.inputmode.a> f88755k;

    public q(m mVar, Ua0.b bVar, ru.ozon.android.messenger.framework.domain.usecases.A a11, Pc.a aVar, f30.k kVar, ru.ozon.android.messenger.blocks.emptystate.f fVar, Pc.a aVar2, Jb.f fVar2, Pc.a aVar3, Jb.f fVar3, Pc.a aVar4, Pc.a aVar5, Pc.a aVar6) {
        this.f88745a = bVar;
        this.f88746b = aVar;
        this.f88747c = kVar;
        this.f88748d = fVar;
        this.f88749e = aVar2;
        this.f88750f = fVar2;
        this.f88751g = aVar3;
        this.f88752h = fVar3;
        this.f88753i = aVar4;
        this.f88754j = aVar5;
        this.f88755k = aVar6;
    }

    @Override // Pc.a
    public final Object get() {
        C9388e appendUnreadWidgetUseCase = (C9388e) this.f88745a.get();
        P20.f insertAbsoluteItemsUseCase = new P20.f();
        C9396m getInternalWidgetUseCase = this.f88746b.get();
        C9397n getRemoteMessagesUseCase = (C9397n) this.f88747c.get();
        ru.ozon.android.messenger.blocks.emptystate.e emptyStateBlockFactory = (ru.ozon.android.messenger.blocks.emptystate.e) this.f88748d.get();
        ru.ozon.android.messenger.framework.domain.repository.b repository = this.f88749e.get();
        ru.ozon.android.messenger.framework.analytics.i iVar = (ru.ozon.android.messenger.framework.analytics.i) this.f88750f.get();
        ru.ozon.android.messenger.framework.data.local.a itemStorageDelegate = this.f88751g.get();
        ru.ozon.android.messenger.framework.presentation.chatdetail.a args = (ru.ozon.android.messenger.framework.presentation.chatdetail.a) this.f88752h.get();
        ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.delegates.o unreadMessagesController = this.f88753i.get();
        ru.ozon.android.messenger.framework.presentation.common.startup.a chatStartupDelegate = this.f88754j.get();
        ru.ozon.android.messenger.framework.presentation.chatdetail.inputmode.a footerUpdateGuard = this.f88755k.get();
        Intrinsics.checkNotNullParameter(appendUnreadWidgetUseCase, "appendUnreadWidgetUseCase");
        Intrinsics.checkNotNullParameter(insertAbsoluteItemsUseCase, "insertAbsoluteItemsUseCase");
        Intrinsics.checkNotNullParameter(getInternalWidgetUseCase, "getInternalWidgetUseCase");
        Intrinsics.checkNotNullParameter(getRemoteMessagesUseCase, "getRemoteMessagesUseCase");
        Intrinsics.checkNotNullParameter(emptyStateBlockFactory, "emptyStateBlockFactory");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(itemStorageDelegate, "itemStorageDelegate");
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(unreadMessagesController, "unreadMessagesController");
        Intrinsics.checkNotNullParameter(chatStartupDelegate, "chatStartupDelegate");
        Intrinsics.checkNotNullParameter(footerUpdateGuard, "footerUpdateGuard");
        return new ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.delegates.d(appendUnreadWidgetUseCase, insertAbsoluteItemsUseCase, getInternalWidgetUseCase, getRemoteMessagesUseCase, emptyStateBlockFactory, repository, iVar, itemStorageDelegate, args, unreadMessagesController, chatStartupDelegate, footerUpdateGuard);
    }
}
