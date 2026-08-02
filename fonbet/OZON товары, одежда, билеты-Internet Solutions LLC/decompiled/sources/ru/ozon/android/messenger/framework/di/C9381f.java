package ru.ozon.android.messenger.framework.di;

import De.C2862e;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.framework.data.repository.i0;
import ru.ozon.android.messenger.framework.domain.service.InterfaceC9383a;
import ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.x0;

/* renamed from: ru.ozon.android.messenger.framework.di.f, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C9381f implements Jb.e<ru.ozon.android.messenger.framework.domain.service.c> {

    /* renamed from: a, reason: collision with root package name */
    private final Pc.a<ru.ozon.android.messenger.framework.domain.repository.b> f88715a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a<x0> f88716b;

    /* renamed from: c, reason: collision with root package name */
    private final i0 f88717c;

    /* renamed from: d, reason: collision with root package name */
    private final Pc.a<ru.ozon.android.messenger.framework.domain.repository.d> f88718d;

    /* renamed from: e, reason: collision with root package name */
    private final Pc.a<ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.delegates.a> f88719e;

    /* renamed from: f, reason: collision with root package name */
    private final Pc.a<InterfaceC9383a> f88720f;

    /* renamed from: g, reason: collision with root package name */
    private final Pc.a<ru.ozon.android.messenger.framework.presentation.chatdetail.inputmode.c> f88721g;

    public C9381f(C9377b c9377b, Pc.a aVar, Pc.a aVar2, i0 i0Var, y yVar, Pc.a aVar3, Pc.a aVar4, Pc.a aVar5, Pc.a aVar6) {
        this.f88715a = aVar;
        this.f88716b = aVar2;
        this.f88717c = i0Var;
        this.f88718d = aVar3;
        this.f88719e = aVar4;
        this.f88720f = aVar5;
        this.f88721g = aVar6;
    }

    @Override // Pc.a
    public final Object get() {
        ru.ozon.android.messenger.framework.domain.repository.b repository = this.f88715a.get();
        x0 issueMessagesHandler = this.f88716b.get();
        ru.ozon.android.messenger.framework.domain.usecases.E oldSendMessageUseCase = (ru.ozon.android.messenger.framework.domain.usecases.E) this.f88717c.get();
        C2862e sendMessageScope = y.b();
        ru.ozon.android.messenger.framework.domain.repository.d messagesRepository = this.f88718d.get();
        ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.delegates.a chatLoadingDelegate = this.f88719e.get();
        InterfaceC9383a logger = this.f88720f.get();
        ru.ozon.android.messenger.framework.presentation.chatdetail.inputmode.c inputModeStore = this.f88721g.get();
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(issueMessagesHandler, "issueMessagesHandler");
        Intrinsics.checkNotNullParameter(oldSendMessageUseCase, "oldSendMessageUseCase");
        Intrinsics.checkNotNullParameter(sendMessageScope, "sendMessageScope");
        Intrinsics.checkNotNullParameter(messagesRepository, "messagesRepository");
        Intrinsics.checkNotNullParameter(chatLoadingDelegate, "chatLoadingDelegate");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(inputModeStore, "inputModeStore");
        return new ru.ozon.android.messenger.framework.domain.service.g(repository, issueMessagesHandler, oldSendMessageUseCase, sendMessageScope, messagesRepository, chatLoadingDelegate, logger, inputModeStore);
    }
}
