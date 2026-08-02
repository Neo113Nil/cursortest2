package ru.ozon.android.messenger.framework.di;

import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.x0;

/* loaded from: classes10.dex */
public final class t implements Jb.e<ru.ozon.android.messenger.framework.domain.service.x> {

    /* renamed from: a, reason: collision with root package name */
    private final m f88769a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a<x0> f88770b;

    /* renamed from: c, reason: collision with root package name */
    private final Pc.a<ru.ozon.android.messenger.framework.domain.service.c> f88771c;

    public t(m mVar, Pc.a<x0> aVar, Pc.a<ru.ozon.android.messenger.framework.domain.service.c> aVar2) {
        this.f88769a = mVar;
        this.f88770b = aVar;
        this.f88771c = aVar2;
    }

    @Override // Pc.a
    public final Object get() {
        x0 issueMessagesHandler = this.f88770b.get();
        ru.ozon.android.messenger.framework.domain.service.c chatSendMessageDelegate = this.f88771c.get();
        this.f88769a.getClass();
        Intrinsics.checkNotNullParameter(issueMessagesHandler, "issueMessagesHandler");
        Intrinsics.checkNotNullParameter(chatSendMessageDelegate, "chatSendMessageDelegate");
        return new ru.ozon.android.messenger.framework.domain.service.y(issueMessagesHandler, chatSendMessageDelegate);
    }
}
