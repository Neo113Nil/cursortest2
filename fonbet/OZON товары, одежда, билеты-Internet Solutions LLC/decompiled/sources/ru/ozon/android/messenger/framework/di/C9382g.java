package ru.ozon.android.messenger.framework.di;

import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.framework.domain.usecases.C9391h;
import ru.ozon.android.messenger.framework.domain.usecases.C9392i;
import ru.ozon.android.messenger.framework.domain.usecases.e0;
import ru.ozon.android.messenger.framework.domain.usecases.f0;

/* renamed from: ru.ozon.android.messenger.framework.di.g, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C9382g implements Jb.e<ru.ozon.android.messenger.framework.presentation.common.startup.a> {

    /* renamed from: a, reason: collision with root package name */
    private final f0 f88722a;

    /* renamed from: b, reason: collision with root package name */
    private final C9392i f88723b;

    /* renamed from: c, reason: collision with root package name */
    private final ru.ozon.android.messenger.blocks.emptystate.b f88724c;

    /* renamed from: d, reason: collision with root package name */
    private final Pc.a<ru.ozon.android.messenger.framework.domain.repository.b> f88725d;

    /* renamed from: e, reason: collision with root package name */
    private final Pc.a<ru.ozon.android.messenger.framework.domain.repository.d> f88726e;

    /* renamed from: f, reason: collision with root package name */
    private final Jb.f f88727f;

    public C9382g(C9377b c9377b, f0 f0Var, C9392i c9392i, ru.ozon.android.messenger.blocks.emptystate.b bVar, Pc.a aVar, Pc.a aVar2, Jb.f fVar) {
        this.f88722a = f0Var;
        this.f88723b = c9392i;
        this.f88724c = bVar;
        this.f88725d = aVar;
        this.f88726e = aVar2;
        this.f88727f = fVar;
    }

    @Override // Pc.a
    public final Object get() {
        e0 startOrGetChatUseCase = (e0) this.f88722a.get();
        C9391h chatEnterUseCase = (C9391h) this.f88723b.get();
        ru.ozon.android.messenger.blocks.emptystate.a emptyScreenBlockFactory = (ru.ozon.android.messenger.blocks.emptystate.a) this.f88724c.get();
        ru.ozon.android.messenger.framework.domain.repository.b repository = this.f88725d.get();
        ru.ozon.android.messenger.framework.domain.repository.d messagesRepository = this.f88726e.get();
        ru.ozon.android.messenger.framework.presentation.chatdetail.a chatArgs = (ru.ozon.android.messenger.framework.presentation.chatdetail.a) this.f88727f.get();
        Intrinsics.checkNotNullParameter(startOrGetChatUseCase, "startOrGetChatUseCase");
        Intrinsics.checkNotNullParameter(chatEnterUseCase, "chatEnterUseCase");
        Intrinsics.checkNotNullParameter(emptyScreenBlockFactory, "emptyScreenBlockFactory");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(messagesRepository, "messagesRepository");
        Intrinsics.checkNotNullParameter(chatArgs, "chatArgs");
        return new ru.ozon.android.messenger.framework.presentation.ai.delegates.e(startOrGetChatUseCase, chatEnterUseCase, emptyScreenBlockFactory, repository, messagesRepository, chatArgs);
    }
}
