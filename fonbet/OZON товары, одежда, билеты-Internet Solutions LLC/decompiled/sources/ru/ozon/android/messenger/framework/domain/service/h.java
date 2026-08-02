package ru.ozon.android.messenger.framework.domain.service;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.domain.service.ChatSendMessageDelegateImpl", f = "ChatSendMessageDelegate.kt", l = {293}, m = "resendUpdateAfterConfirmation")
/* loaded from: classes10.dex */
final class h extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    g f88888d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f88889e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ g f88890f;

    /* renamed from: g, reason: collision with root package name */
    int f88891g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h(g gVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f88890f = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f88889e = obj;
        this.f88891g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f88890f.c(null, this);
    }
}
