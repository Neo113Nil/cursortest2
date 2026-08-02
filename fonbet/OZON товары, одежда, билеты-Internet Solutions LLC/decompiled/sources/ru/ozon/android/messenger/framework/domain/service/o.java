package ru.ozon.android.messenger.framework.domain.service;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.x0;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.domain.service.ChatSendMessageDelegateImpl", f = "ChatSendMessageDelegate.kt", l = {374}, m = "updateFailedMessagesState")
/* loaded from: classes10.dex */
final class o extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    x0 f88926d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f88927e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ g f88928f;

    /* renamed from: g, reason: collision with root package name */
    int f88929g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    o(g gVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f88928f = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object t2;
        this.f88927e = obj;
        this.f88929g |= LinearLayoutManager.INVALID_OFFSET;
        t2 = this.f88928f.t(this);
        return t2;
    }
}
