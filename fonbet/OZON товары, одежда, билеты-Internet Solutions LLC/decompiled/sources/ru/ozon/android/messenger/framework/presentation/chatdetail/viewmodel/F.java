package ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.ChatViewModelImpl$handleOnMsgCounterClickedAction$1", f = "ChatViewModel.kt", l = {1075}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class F extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f89982d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C9467e f89983e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    F(kotlin.coroutines.d dVar, C9467e c9467e) {
        super(2, dVar);
        this.f89983e = c9467e;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new F(dVar, this.f89983e);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((F) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.delegates.a aVar;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f89982d;
        if (i11 == 0) {
            Sc.s.b(obj);
            aVar = this.f89983e.f90220p;
            this.f89982d = 1;
            if (aVar.F(this) == aVar2) {
                return aVar2;
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
