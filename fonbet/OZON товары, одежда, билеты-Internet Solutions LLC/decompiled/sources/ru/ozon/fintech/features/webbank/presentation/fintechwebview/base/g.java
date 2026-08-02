package ru.ozon.fintech.features.webbank.presentation.fintechwebview.base;

import Sc.s;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import xe.M;
import xe.Y;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.webbank.presentation.fintechwebview.base.FintechWebViewViewModelBase$onCreateSpecificActuallyLoad$1", f = "FintechWebViewViewModelBase.kt", l = {906}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class g extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f96584d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ a f96585e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ String f96586f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g(a aVar, String str, kotlin.coroutines.d<? super g> dVar) {
        super(2, dVar);
        this.f96585e = aVar;
        this.f96586f = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new g(this.f96585e, this.f96586f, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((g) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f96584d;
        a aVar2 = this.f96585e;
        if (i11 == 0) {
            s.b(obj);
            long e11 = aVar2.S0().e() == 0 ? 0L : (aVar2.S0().e() * 200) + 900;
            this.f96584d = 1;
            if (Y.b(e11, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        aVar2.D1(this.f96586f);
        return Unit.f71690a;
    }
}
