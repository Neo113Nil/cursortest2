package ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.ChatViewModelImpl$handleCancelEditChatMessage$1", f = "ChatViewModel.kt", l = {808}, m = "invokeSuspend")
/* renamed from: ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.o, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C9477o extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f90310d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C9467e f90311e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9477o(kotlin.coroutines.d dVar, C9467e c9467e) {
        super(2, dVar);
        this.f90311e = c9467e;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new C9477o(dVar, this.f90311e);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C9477o) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ru.ozon.android.messenger.framework.presentation.chatdetail.inputmode.k kVar;
        Object b11;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f90310d;
        if (i11 == 0) {
            Sc.s.b(obj);
            kVar = this.f90311e.f90238z;
            this.f90310d = 1;
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
