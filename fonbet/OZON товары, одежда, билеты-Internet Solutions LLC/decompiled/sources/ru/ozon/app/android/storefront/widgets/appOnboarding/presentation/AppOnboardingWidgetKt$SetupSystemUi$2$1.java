package ru.ozon.app.android.storefront.widgets.appOnboarding.presentation;

import O6.b;
import O6.c;
import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import l1.C7807Z;
import l1.C7811b0;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.storefront.widgets.appOnboarding.presentation.AppOnboardingWidgetKt$SetupSystemUi$2$1", f = "AppOnboardingWidget.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class AppOnboardingWidgetKt$SetupSystemUi$2$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ long $systemUiColor;
    final /* synthetic */ b $systemUiController;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AppOnboardingWidgetKt$SetupSystemUi$2$1(b bVar, long j11, d<? super AppOnboardingWidgetKt$SetupSystemUi$2$1> dVar) {
        super(2, dVar);
        this.$systemUiController = bVar;
        this.$systemUiColor = j11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new AppOnboardingWidgetKt$SetupSystemUi$2$1(this.$systemUiController, this.$systemUiColor, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Function1<? super C7807Z, C7807Z> function1;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        b bVar = this.$systemUiController;
        long j11 = this.$systemUiColor;
        boolean z11 = C7811b0.h(j11) > 0.5f;
        function1 = c.f19996b;
        bVar.c(j11, z11, function1);
        b.a(this.$systemUiController, this.$systemUiColor);
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((AppOnboardingWidgetKt$SetupSystemUi$2$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
