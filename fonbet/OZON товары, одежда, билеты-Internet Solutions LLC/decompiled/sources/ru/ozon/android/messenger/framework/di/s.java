package ru.ozon.android.messenger.framework.di;

import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.framework.domain.usecases.C9391h;
import ru.ozon.android.messenger.framework.domain.usecases.C9392i;
import ru.ozon.android.messenger.framework.domain.usecases.e0;
import ru.ozon.android.messenger.framework.domain.usecases.f0;

/* loaded from: classes10.dex */
public final class s implements Jb.e<ru.ozon.android.messenger.framework.presentation.common.startup.a> {

    /* renamed from: a, reason: collision with root package name */
    private final f0 f88763a;

    /* renamed from: b, reason: collision with root package name */
    private final C9392i f88764b;

    /* renamed from: c, reason: collision with root package name */
    private final ru.ozon.android.messenger.blocks.emptystate.f f88765c;

    /* renamed from: d, reason: collision with root package name */
    private final Pc.a<ru.ozon.android.messenger.framework.domain.repository.b> f88766d;

    /* renamed from: e, reason: collision with root package name */
    private final Pc.a<ru.ozon.android.messenger.framework.data.local.a> f88767e;

    /* renamed from: f, reason: collision with root package name */
    private final Jb.f f88768f;

    public s(m mVar, f0 f0Var, C9392i c9392i, ru.ozon.android.messenger.blocks.emptystate.f fVar, Pc.a aVar, Pc.a aVar2, Jb.f fVar2) {
        this.f88763a = f0Var;
        this.f88764b = c9392i;
        this.f88765c = fVar;
        this.f88766d = aVar;
        this.f88767e = aVar2;
        this.f88768f = fVar2;
    }

    @Override // Pc.a
    public final Object get() {
        e0 startOrGetChatUseCase = (e0) this.f88763a.get();
        C9391h chatEnterUseCase = (C9391h) this.f88764b.get();
        ru.ozon.android.messenger.blocks.emptystate.e emptyScreenBlockFactory = (ru.ozon.android.messenger.blocks.emptystate.e) this.f88765c.get();
        ru.ozon.android.messenger.framework.domain.repository.b repository = this.f88766d.get();
        ru.ozon.android.messenger.framework.data.local.a widgetStorageDelegate = this.f88767e.get();
        ru.ozon.android.messenger.framework.presentation.chatdetail.a chatArgs = (ru.ozon.android.messenger.framework.presentation.chatdetail.a) this.f88768f.get();
        Intrinsics.checkNotNullParameter(startOrGetChatUseCase, "startOrGetChatUseCase");
        Intrinsics.checkNotNullParameter(chatEnterUseCase, "chatEnterUseCase");
        Intrinsics.checkNotNullParameter(emptyScreenBlockFactory, "emptyScreenBlockFactory");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(widgetStorageDelegate, "widgetStorageDelegate");
        Intrinsics.checkNotNullParameter(chatArgs, "chatArgs");
        return new ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.delegates.j(startOrGetChatUseCase, chatEnterUseCase, emptyScreenBlockFactory, repository, widgetStorageDelegate, chatArgs);
    }
}
