package ru.ozon.android.messenger.framework.domain.service;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.domain.service.ChatSendMessageDelegateImpl$sendMessageInternal$2$1$1", f = "ChatSendMessageDelegate.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class m extends kotlin.coroutines.jvm.internal.j implements Function1<kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ g f88919d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.data.remote.models.c f88920e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    m(g gVar, ru.ozon.android.messenger.framework.data.remote.models.c cVar, kotlin.coroutines.d<? super m> dVar) {
        super(1, dVar);
        this.f88919d = gVar;
        this.f88920e = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
        return new m(this.f88919d, this.f88920e, dVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(kotlin.coroutines.d<? super Unit> dVar) {
        return ((m) create(dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC9383a interfaceC9383a;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        Sc.s.b(obj);
        g gVar = this.f88919d;
        interfaceC9383a = gVar.f88878g;
        interfaceC9383a.a(g.k(gVar, this.f88920e));
        return Unit.f71690a;
    }
}
