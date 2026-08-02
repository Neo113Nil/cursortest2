package ru.ozon.android.messenger.framework.di;

import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.framework.domain.usecases.C9388e;
import ru.ozon.android.messenger.framework.domain.usecases.C9396m;
import ru.ozon.android.messenger.framework.domain.usecases.C9397n;

/* renamed from: ru.ozon.android.messenger.framework.di.c, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C9378c implements Jb.e<ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.delegates.a> {

    /* renamed from: a, reason: collision with root package name */
    private final Ua0.b f88700a;

    /* renamed from: b, reason: collision with root package name */
    private final f30.k f88701b;

    /* renamed from: c, reason: collision with root package name */
    private final Pc.a<C9396m> f88702c;

    /* renamed from: d, reason: collision with root package name */
    private final ru.ozon.android.messenger.framework.domain.usecases.ai.d f88703d;

    /* renamed from: e, reason: collision with root package name */
    private final ru.ozon.android.messenger.blocks.emptystate.b f88704e;

    /* renamed from: f, reason: collision with root package name */
    private final Pc.a<ru.ozon.android.messenger.framework.domain.repository.b> f88705f;

    /* renamed from: g, reason: collision with root package name */
    private final Pc.a<ru.ozon.android.messenger.framework.navigation.controller.a> f88706g;

    /* renamed from: h, reason: collision with root package name */
    private final Jb.f f88707h;

    /* renamed from: i, reason: collision with root package name */
    private final Pa0.g f88708i;

    /* renamed from: j, reason: collision with root package name */
    private final Pc.a<ru.ozon.android.messenger.framework.data.local.a> f88709j;

    /* renamed from: k, reason: collision with root package name */
    private final Jb.f f88710k;

    /* renamed from: l, reason: collision with root package name */
    private final Pc.a<ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.delegates.o> f88711l;

    /* renamed from: m, reason: collision with root package name */
    private final Pc.a<ru.ozon.android.messenger.framework.presentation.common.startup.a> f88712m;

    /* renamed from: n, reason: collision with root package name */
    private final Pc.a<ru.ozon.android.messenger.framework.presentation.chatdetail.inputmode.a> f88713n;

    public C9378c(C9377b c9377b, Ua0.b bVar, ru.ozon.android.messenger.framework.domain.usecases.A a11, f30.k kVar, Pc.a aVar, ru.ozon.android.messenger.framework.domain.usecases.ai.d dVar, ru.ozon.android.messenger.blocks.emptystate.b bVar2, Pc.a aVar2, Pc.a aVar3, Jb.f fVar, Pa0.g gVar, Pc.a aVar4, Jb.f fVar2, Pc.a aVar5, Pc.a aVar6, Pc.a aVar7) {
        this.f88700a = bVar;
        this.f88701b = kVar;
        this.f88702c = aVar;
        this.f88703d = dVar;
        this.f88704e = bVar2;
        this.f88705f = aVar2;
        this.f88706g = aVar3;
        this.f88707h = fVar;
        this.f88708i = gVar;
        this.f88709j = aVar4;
        this.f88710k = fVar2;
        this.f88711l = aVar5;
        this.f88712m = aVar6;
        this.f88713n = aVar7;
    }

    @Override // Pc.a
    public final Object get() {
        C9388e appendUnreadWidgetUseCase = (C9388e) this.f88700a.get();
        P20.f insertAbsoluteItemsUseCase = new P20.f();
        C9397n getRemoteMessagesUseCase = (C9397n) this.f88701b.get();
        C9396m getInternalWidgetUseCase = this.f88702c.get();
        ru.ozon.android.messenger.framework.domain.usecases.ai.b getAiMessagesUseCase = (ru.ozon.android.messenger.framework.domain.usecases.ai.b) this.f88703d.get();
        ru.ozon.android.messenger.blocks.emptystate.a emptyStateBlockFactory = (ru.ozon.android.messenger.blocks.emptystate.a) this.f88704e.get();
        ru.ozon.android.messenger.framework.domain.repository.b repository = this.f88705f.get();
        ru.ozon.android.messenger.framework.navigation.controller.a messengerController = this.f88706g.get();
        ru.ozon.android.messenger.framework.analytics.i iVar = (ru.ozon.android.messenger.framework.analytics.i) this.f88707h.get();
        ru.ozon.android.messenger.framework.domain.usecases.ai.a setStateUseCase = (ru.ozon.android.messenger.framework.domain.usecases.ai.a) this.f88708i.get();
        ru.ozon.android.messenger.framework.data.local.a itemStorageDelegate = this.f88709j.get();
        ru.ozon.android.messenger.framework.presentation.chatdetail.a args = (ru.ozon.android.messenger.framework.presentation.chatdetail.a) this.f88710k.get();
        ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.delegates.o unreadMessagesController = this.f88711l.get();
        ru.ozon.android.messenger.framework.presentation.common.startup.a chatStartupDelegate = this.f88712m.get();
        ru.ozon.android.messenger.framework.presentation.chatdetail.inputmode.a footerUpdateGuard = this.f88713n.get();
        Intrinsics.checkNotNullParameter(appendUnreadWidgetUseCase, "appendUnreadWidgetUseCase");
        Intrinsics.checkNotNullParameter(insertAbsoluteItemsUseCase, "insertAbsoluteItemsUseCase");
        Intrinsics.checkNotNullParameter(getRemoteMessagesUseCase, "getRemoteMessagesUseCase");
        Intrinsics.checkNotNullParameter(getInternalWidgetUseCase, "getInternalWidgetUseCase");
        Intrinsics.checkNotNullParameter(getAiMessagesUseCase, "getAiMessagesUseCase");
        Intrinsics.checkNotNullParameter(emptyStateBlockFactory, "emptyStateBlockFactory");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(messengerController, "messengerController");
        Intrinsics.checkNotNullParameter(setStateUseCase, "setStateUseCase");
        Intrinsics.checkNotNullParameter(itemStorageDelegate, "itemStorageDelegate");
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(unreadMessagesController, "unreadMessagesController");
        Intrinsics.checkNotNullParameter(chatStartupDelegate, "chatStartupDelegate");
        Intrinsics.checkNotNullParameter(footerUpdateGuard, "footerUpdateGuard");
        return new ru.ozon.android.messenger.framework.presentation.ai.delegates.c(appendUnreadWidgetUseCase, insertAbsoluteItemsUseCase, getRemoteMessagesUseCase, getInternalWidgetUseCase, getAiMessagesUseCase, emptyStateBlockFactory, repository, messengerController, iVar, setStateUseCase, itemStorageDelegate, args, unreadMessagesController, chatStartupDelegate, footerUpdateGuard);
    }
}
