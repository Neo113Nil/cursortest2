package ru.ozon.app.android.ugc.core.widgets.topAuthorCounter.presentation.ui.view.animation;

import F5.m;
import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.ugc.core.widgets.topAuthorCounter.presentation.ui.view.animation.ConfettiLottieKt$LottieConfetti$1$1", f = "ConfettiLottie.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class ConfettiLottieKt$LottieConfetti$1$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ Function0<Unit> $onFinished;
    final /* synthetic */ boolean $playConfetti;
    final /* synthetic */ m $progress$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ConfettiLottieKt$LottieConfetti$1$1(boolean z11, Function0<Unit> function0, m mVar, d<? super ConfettiLottieKt$LottieConfetti$1$1> dVar) {
        super(2, dVar);
        this.$playConfetti = z11;
        this.$onFinished = function0;
        this.$progress$delegate = mVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new ConfettiLottieKt$LottieConfetti$1$1(this.$playConfetti, this.$onFinished, this.$progress$delegate, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        float LottieConfetti$lambda$1;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        if (this.$playConfetti) {
            LottieConfetti$lambda$1 = ConfettiLottieKt.LottieConfetti$lambda$1(this.$progress$delegate);
            if (LottieConfetti$lambda$1 == 1.0f) {
                this.$onFinished.invoke();
            }
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((ConfettiLottieKt$LottieConfetti$1$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
