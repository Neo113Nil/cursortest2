package ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.ChatViewModelImpl$2", f = "ChatViewModel.kt", l = {}, m = "invokeSuspend")
/* renamed from: ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.d, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C9466d extends kotlin.coroutines.jvm.internal.j implements Function2<ru.ozon.android.messenger.blocks.pinneditem.g, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C9467e f90062d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9466d(kotlin.coroutines.d dVar, C9467e c9467e) {
        super(2, dVar);
        this.f90062d = c9467e;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new C9466d(dVar, this.f90062d);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ru.ozon.android.messenger.blocks.pinneditem.g gVar, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C9466d) create(gVar, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        Sc.s.b(obj);
        this.f90062d.l1();
        return Unit.f71690a;
    }
}
