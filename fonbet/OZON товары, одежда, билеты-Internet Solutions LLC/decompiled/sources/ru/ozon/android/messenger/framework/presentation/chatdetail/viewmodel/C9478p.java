package ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.ChatViewModelImpl$handleCancelReplyChatMessage$1", f = "ChatViewModel.kt", l = {813}, m = "invokeSuspend")
/* renamed from: ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.p, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C9478p extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f90317d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C9467e f90318e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9478p(kotlin.coroutines.d dVar, C9467e c9467e) {
        super(2, dVar);
        this.f90318e = c9467e;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new C9478p(dVar, this.f90318e);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C9478p) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ru.ozon.android.messenger.framework.presentation.chatdetail.inputmode.k kVar;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f90317d;
        if (i11 == 0) {
            Sc.s.b(obj);
            kVar = this.f90318e.f90238z;
            this.f90317d = 1;
            if (kVar.b(true, true, this) == aVar) {
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
