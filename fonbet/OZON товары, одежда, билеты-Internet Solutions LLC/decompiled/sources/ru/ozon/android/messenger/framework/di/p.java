package ru.ozon.android.messenger.framework.di;

import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.framework.domain.usecases.C9385b;
import ru.ozon.android.messenger.framework.domain.usecases.K;

/* loaded from: classes10.dex */
public final class p implements Jb.e<ru.ozon.android.messenger.framework.data.local.a> {

    /* renamed from: a, reason: collision with root package name */
    private final Pc.a<K> f88742a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a<C9385b> f88743b;

    /* renamed from: c, reason: collision with root package name */
    private final Jb.f f88744c;

    public p(m mVar, Pc.a aVar, Pc.a aVar2, Jb.f fVar) {
        this.f88742a = aVar;
        this.f88743b = aVar2;
        this.f88744c = fVar;
    }

    @Override // Pc.a
    public final Object get() {
        K resolveMessageInfoUseCase = this.f88742a.get();
        C9385b appendDateBlocksUseCase = this.f88743b.get();
        ru.ozon.android.messenger.framework.presentation.chatdetail.a chatArgs = (ru.ozon.android.messenger.framework.presentation.chatdetail.a) this.f88744c.get();
        Intrinsics.checkNotNullParameter(resolveMessageInfoUseCase, "resolveMessageInfoUseCase");
        Intrinsics.checkNotNullParameter(appendDateBlocksUseCase, "appendDateBlocksUseCase");
        Intrinsics.checkNotNullParameter(chatArgs, "chatArgs");
        return new ru.ozon.android.messenger.framework.data.local.c(resolveMessageInfoUseCase, appendDateBlocksUseCase, chatArgs);
    }
}
