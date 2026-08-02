package ru.ozon.android.messenger.framework.di;

import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.x0;

/* loaded from: classes10.dex */
public final class h implements Jb.e<ru.ozon.android.messenger.framework.domain.service.x> {

    /* renamed from: a, reason: collision with root package name */
    private final C9377b f88728a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a<x0> f88729b;

    /* renamed from: c, reason: collision with root package name */
    private final Pc.a<ru.ozon.android.messenger.framework.domain.service.c> f88730c;

    public h(C9377b c9377b, Pc.a<x0> aVar, Pc.a<ru.ozon.android.messenger.framework.domain.service.c> aVar2) {
        this.f88728a = c9377b;
        this.f88729b = aVar;
        this.f88730c = aVar2;
    }

    @Override // Pc.a
    public final Object get() {
        x0 issueMessagesHandler = this.f88729b.get();
        ru.ozon.android.messenger.framework.domain.service.c chatSendMessageDelegate = this.f88730c.get();
        this.f88728a.getClass();
        Intrinsics.checkNotNullParameter(issueMessagesHandler, "issueMessagesHandler");
        Intrinsics.checkNotNullParameter(chatSendMessageDelegate, "chatSendMessageDelegate");
        return new ru.ozon.android.messenger.framework.domain.service.y(issueMessagesHandler, chatSendMessageDelegate);
    }
}
