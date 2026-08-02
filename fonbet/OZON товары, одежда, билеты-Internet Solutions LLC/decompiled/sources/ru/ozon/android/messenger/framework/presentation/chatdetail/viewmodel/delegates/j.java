package ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.delegates;

import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.domain.usecases.C9391h;
import ru.ozon.android.messenger.framework.domain.usecases.e0;
import ru.ozon.android.messenger.framework.presentation.models.responses.m;

/* loaded from: classes10.dex */
public final class j extends ru.ozon.android.messenger.framework.presentation.common.startup.f {

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.blocks.emptystate.e f90150e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.domain.repository.b f90151f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.data.local.a f90152g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.presentation.chatdetail.a f90153h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(@NotNull e0 startOrGetChatUseCase, @NotNull C9391h chatEnterUseCase, @NotNull ru.ozon.android.messenger.blocks.emptystate.e emptyScreenBlockFactory, @NotNull ru.ozon.android.messenger.framework.domain.repository.b repository, @NotNull ru.ozon.android.messenger.framework.data.local.a widgetStorageDelegate, @NotNull ru.ozon.android.messenger.framework.presentation.chatdetail.a chatArgs) {
        super(startOrGetChatUseCase, chatEnterUseCase, chatArgs.getDeeplink(), chatArgs.a());
        Intrinsics.checkNotNullParameter(startOrGetChatUseCase, "startOrGetChatUseCase");
        Intrinsics.checkNotNullParameter(chatEnterUseCase, "chatEnterUseCase");
        Intrinsics.checkNotNullParameter(emptyScreenBlockFactory, "emptyScreenBlockFactory");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(widgetStorageDelegate, "widgetStorageDelegate");
        Intrinsics.checkNotNullParameter(chatArgs, "chatArgs");
        this.f90150e = emptyScreenBlockFactory;
        this.f90151f = repository;
        this.f90152g = widgetStorageDelegate;
        this.f90153h = chatArgs;
    }

    @Override // ru.ozon.android.messenger.framework.presentation.common.startup.f
    public final Object k(m.b bVar, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        Object p11;
        ru.ozon.android.messenger.framework.presentation.models.q a11 = bVar != null ? bVar.a() : null;
        ru.ozon.android.messenger.blocks.emptystate.e eVar = this.f90150e;
        p11 = r0.p(a11 != null ? C7714v.b0(bVar.a(), eVar.b(ru.ozon.android.messenger.blocks.emptystate.j.CHAT_DETAILS)) : eVar.e(this.f90151f.E().getValue(), ru.ozon.android.messenger.blocks.emptystate.j.CHAT_DETAILS, null), this.f90152g.u().getValue().c(), cVar);
        return p11 == Wc.a.COROUTINE_SUSPENDED ? p11 : Unit.f71690a;
    }
}
