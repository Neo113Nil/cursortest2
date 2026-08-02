package ru.ozon.app.android.storefront.widgets.appOnboarding.presentation;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import m0.C8004n;
import m0.T0;
import y0.b0;

@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.storefront.widgets.appOnboarding.presentation.AppOnboardingWidgetKt$Widget$2$2$1", f = "AppOnboardingWidget.kt", l = {106}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class AppOnboardingWidgetKt$Widget$2$2$1 extends j implements Function1<d<? super Unit>, Object> {
    final /* synthetic */ b0 $pagerState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AppOnboardingWidgetKt$Widget$2$2$1(b0 b0Var, d<? super AppOnboardingWidgetKt$Widget$2$2$1> dVar) {
        super(1, dVar);
        this.$pagerState = b0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(d<?> dVar) {
        return new AppOnboardingWidgetKt$Widget$2$2$1(this.$pagerState, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            b0 b0Var = this.$pagerState;
            int r11 = b0Var.r() + 1;
            T0 d11 = C8004n.d(571, 0, null, 6);
            this.label = 1;
            if (b0.m(b0Var, r11, d11, this, 2) == aVar) {
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

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(d<? super Unit> dVar) {
        return ((AppOnboardingWidgetKt$Widget$2$2$1) create(dVar)).invokeSuspend(Unit.f71690a);
    }
}
