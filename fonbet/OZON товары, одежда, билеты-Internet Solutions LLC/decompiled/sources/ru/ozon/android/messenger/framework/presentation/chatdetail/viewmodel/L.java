package ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.ChatViewModelImpl$handleSendUpdateChatMessage$2", f = "ChatViewModel.kt", l = {707}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class L extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f90007d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C9467e f90008e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    L(kotlin.coroutines.d dVar, C9467e c9467e) {
        super(2, dVar);
        this.f90008e = c9467e;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new L(dVar, this.f90008e);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((L) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ru.ozon.android.messenger.framework.presentation.chatdetail.inputmode.k kVar;
        Object b11;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f90007d;
        if (i11 == 0) {
            Sc.s.b(obj);
            kVar = this.f90008e.f90238z;
            this.f90007d = 1;
            b11 = kVar.b((r4 & 1) != 0, false, this);
            if (b11 == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
        }
        return Unit.f71690a;
    }
}
