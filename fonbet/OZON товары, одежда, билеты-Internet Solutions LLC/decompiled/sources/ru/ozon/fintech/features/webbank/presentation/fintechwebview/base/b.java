package ru.ozon.fintech.features.webbank.presentation.fintechwebview.base;

import Sc.s;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.fintech.features.webbank.presentation.fintechwebview.base.a;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.webbank.presentation.fintechwebview.base.FintechWebViewViewModelBase$attemptNativeNavigation$handledResult$1", f = "FintechWebViewViewModelBase.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class b extends j implements Function2<M, kotlin.coroutines.d<? super a.r>, Object> {

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ a f96565d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ String f96566e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(a aVar, String str, kotlin.coroutines.d<? super b> dVar) {
        super(2, dVar);
        this.f96565d = aVar;
        this.f96566e = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new b(this.f96565d, this.f96566e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super a.r> dVar) {
        return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        s.b(obj);
        return this.f96565d.J0(this.f96566e);
    }
}
