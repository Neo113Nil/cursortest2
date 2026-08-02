package ru.ozon.android.messenger.blocks.input.viewmodel;

import Sc.s;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.blocks.input.viewmodel.InputBlockViewModel$updateStateAfterSendMessages$1", f = "InputBlockViewModel.kt", l = {348}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class m extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f85661d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ h f85662e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    m(h hVar, kotlin.coroutines.d<? super m> dVar) {
        super(2, dVar);
        this.f85662e = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new m(this.f85662e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((m) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f85661d;
        if (i11 == 0) {
            s.b(obj);
            h hVar = this.f85662e;
            String h02 = h.h0(hVar);
            if (h02 != null) {
                f fVar = hVar.f85630g;
                this.f85661d = 1;
                if (fVar.f(h02, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        return Unit.f71690a;
    }
}
