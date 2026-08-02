package ru.ozon.fintech.features.pinpad.presentation.pinpad;

import A30.m;
import P70.h;
import Sc.s;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import xe.M;

@e(c = "ru.ozon.fintech.features.pinpad.presentation.pinpad.PinPadViewModel$keyLogoutClicked$1", f = "PinPadViewModel.kt", l = {254}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class a extends j implements Function2<M, d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f96128d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ h f96129e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    a(h hVar, d<? super a> dVar) {
        super(2, dVar);
        this.f96129e = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new a(this.f96129e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        m mVar;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f96128d;
        if (i11 == 0) {
            s.b(obj);
            mVar = this.f96129e.f21954b;
            this.f96128d = 1;
            if (mVar.w(true, this) == aVar) {
                return aVar;
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
