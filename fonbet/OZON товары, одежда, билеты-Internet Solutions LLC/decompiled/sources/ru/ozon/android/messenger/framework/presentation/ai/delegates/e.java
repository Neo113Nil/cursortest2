package ru.ozon.android.messenger.framework.presentation.ai.delegates;

import kotlin.Unit;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.blocks.emptystate.g;
import ru.ozon.android.messenger.blocks.emptystate.j;
import ru.ozon.android.messenger.framework.domain.usecases.C9391h;
import ru.ozon.android.messenger.framework.domain.usecases.e0;
import ru.ozon.android.messenger.framework.presentation.common.startup.f;
import ru.ozon.android.messenger.framework.presentation.models.responses.m;

/* loaded from: classes10.dex */
public final class e extends f {

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.blocks.emptystate.a f89594e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.domain.repository.b f89595f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.domain.repository.d f89596g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.presentation.chatdetail.a f89597h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(@NotNull e0 startOrGetChatUseCase, @NotNull C9391h chatEnterUseCase, @NotNull ru.ozon.android.messenger.blocks.emptystate.a emptyScreenBlockFactory, @NotNull ru.ozon.android.messenger.framework.domain.repository.b repository, @NotNull ru.ozon.android.messenger.framework.domain.repository.d messagesRepository, @NotNull ru.ozon.android.messenger.framework.presentation.chatdetail.a chatArgs) {
        super(startOrGetChatUseCase, chatEnterUseCase, chatArgs.getDeeplink(), chatArgs.a());
        Intrinsics.checkNotNullParameter(startOrGetChatUseCase, "startOrGetChatUseCase");
        Intrinsics.checkNotNullParameter(chatEnterUseCase, "chatEnterUseCase");
        Intrinsics.checkNotNullParameter(emptyScreenBlockFactory, "emptyScreenBlockFactory");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(messagesRepository, "messagesRepository");
        Intrinsics.checkNotNullParameter(chatArgs, "chatArgs");
        this.f89594e = emptyScreenBlockFactory;
        this.f89595f = repository;
        this.f89596g = messagesRepository;
        this.f89597h = chatArgs;
    }

    @Override // ru.ozon.android.messenger.framework.presentation.common.startup.f
    public final Object k(m.b bVar, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        Object k11 = this.f89596g.k(this.f89594e.e(this.f89595f.E().getValue(), j.CHAT_DETAILS, new g.a(this.f89597h.a())), K.f71697a, cVar);
        return k11 == Wc.a.COROUTINE_SUSPENDED ? k11 : Unit.f71690a;
    }
}
