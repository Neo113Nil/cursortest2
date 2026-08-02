package ru.ozon.android.messenger.framework.domain.service;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.domain.service.ChatSendMessageDelegateImpl", f = "ChatSendMessageDelegate.kt", l = {310, 311, 314, 315, 318, 326, 330, 331, 332, 336, 340}, m = "sendMessageInternal")
/* loaded from: classes10.dex */
final class l extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    Object f88910d;

    /* renamed from: e, reason: collision with root package name */
    Object f88911e;

    /* renamed from: f, reason: collision with root package name */
    Object f88912f;

    /* renamed from: g, reason: collision with root package name */
    Object f88913g;

    /* renamed from: h, reason: collision with root package name */
    Object f88914h;

    /* renamed from: i, reason: collision with root package name */
    boolean f88915i;

    /* renamed from: j, reason: collision with root package name */
    /* synthetic */ Object f88916j;

    /* renamed from: k, reason: collision with root package name */
    final /* synthetic */ g f88917k;

    /* renamed from: l, reason: collision with root package name */
    int f88918l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    l(g gVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f88917k = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f88916j = obj;
        this.f88918l |= LinearLayoutManager.INVALID_OFFSET;
        return this.f88917k.q(null, null, false, null, this);
    }
}
