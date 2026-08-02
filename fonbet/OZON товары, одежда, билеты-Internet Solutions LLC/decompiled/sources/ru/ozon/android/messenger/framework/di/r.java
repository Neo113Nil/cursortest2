package ru.ozon.android.messenger.framework.di;

import De.C2862e;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.framework.data.repository.i0;
import ru.ozon.android.messenger.framework.domain.service.InterfaceC9383a;
import ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.x0;

/* loaded from: classes10.dex */
public final class r implements Jb.e<ru.ozon.android.messenger.framework.domain.service.c> {

    /* renamed from: a, reason: collision with root package name */
    private final Pc.a<ru.ozon.android.messenger.framework.domain.repository.b> f88756a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a<x0> f88757b;

    /* renamed from: c, reason: collision with root package name */
    private final i0 f88758c;

    /* renamed from: d, reason: collision with root package name */
    private final Pc.a<ru.ozon.android.messenger.framework.domain.repository.d> f88759d;

    /* renamed from: e, reason: collision with root package name */
    private final Pc.a<ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.delegates.a> f88760e;

    /* renamed from: f, reason: collision with root package name */
    private final Pc.a<InterfaceC9383a> f88761f;

    /* renamed from: g, reason: collision with root package name */
    private final Pc.a<ru.ozon.android.messenger.framework.presentation.chatdetail.inputmode.c> f88762g;

    public r(m mVar, Pc.a aVar, Pc.a aVar2, i0 i0Var, y yVar, Pc.a aVar3, Pc.a aVar4, Pc.a aVar5, Pc.a aVar6) {
        this.f88756a = aVar;
        this.f88757b = aVar2;
        this.f88758c = i0Var;
        this.f88759d = aVar3;
        this.f88760e = aVar4;
        this.f88761f = aVar5;
        this.f88762g = aVar6;
    }

    @Override // Pc.a
    public final Object get() {
        ru.ozon.android.messenger.framework.domain.repository.b repository = this.f88756a.get();
        x0 issueMessagesHandler = this.f88757b.get();
        ru.ozon.android.messenger.framework.domain.usecases.E oldSendMessageUseCase = (ru.ozon.android.messenger.framework.domain.usecases.E) this.f88758c.get();
        C2862e sendMessageScope = y.b();
        ru.ozon.android.messenger.framework.domain.repository.d messagesRepository = this.f88759d.get();
        ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.delegates.a chatLoadingDelegate = this.f88760e.get();
        InterfaceC9383a logger = this.f88761f.get();
        ru.ozon.android.messenger.framework.presentation.chatdetail.inputmode.c inputModeStore = this.f88762g.get();
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
