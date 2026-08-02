package ru.ozon.fintech.features.webbank.presentation.fintechwebview.base;

import Sc.s;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.webbank.presentation.fintechwebview.base.FintechWebViewViewModelBase$pageLoaded$1", f = "FintechWebViewViewModelBase.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class h extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ a f96587d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h(a aVar, kotlin.coroutines.d<? super h> dVar) {
        super(2, dVar);
        this.f96587d = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new h(this.f96587d, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((h) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        s.b(obj);
        a aVar2 = this.f96587d;
        aVar2.j1();
        aVar2.f1();
        return Unit.f71690a;
    }
}
