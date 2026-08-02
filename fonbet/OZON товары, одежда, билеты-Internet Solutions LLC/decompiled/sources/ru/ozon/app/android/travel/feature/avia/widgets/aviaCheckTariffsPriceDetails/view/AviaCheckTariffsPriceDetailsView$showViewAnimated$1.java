package ru.ozon.app.android.travel.feature.avia.widgets.aviaCheckTariffsPriceDetails.view;

import Sc.s;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.molecules.extensions.ViewExtensionsKt;
import xe.M;
import xe.N;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.feature.avia.widgets.aviaCheckTariffsPriceDetails.view.AviaCheckTariffsPriceDetailsView$showViewAnimated$1", f = "AviaCheckTariffsPriceDetailsView.kt", l = {94}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class AviaCheckTariffsPriceDetailsView$showViewAnimated$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ View $view;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AviaCheckTariffsPriceDetailsView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AviaCheckTariffsPriceDetailsView$showViewAnimated$1(View view, AviaCheckTariffsPriceDetailsView aviaCheckTariffsPriceDetailsView, d<? super AviaCheckTariffsPriceDetailsView$showViewAnimated$1> dVar) {
        super(2, dVar);
        this.$view = view;
        this.this$0 = aviaCheckTariffsPriceDetailsView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$1$lambda$0(View view, ValueAnimator valueAnimator) {
        Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.g(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        view.setTranslationY(((Float) animatedValue).floatValue());
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        AviaCheckTariffsPriceDetailsView$showViewAnimated$1 aviaCheckTariffsPriceDetailsView$showViewAnimated$1 = new AviaCheckTariffsPriceDetailsView$showViewAnimated$1(this.$view, this.this$0, dVar);
        aviaCheckTariffsPriceDetailsView$showViewAnimated$1.L$0 = obj;
        return aviaCheckTariffsPriceDetailsView$showViewAnimated$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        M m11;
        AccelerateDecelerateInterpolator accelerateDecelerateInterpolator;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            M m12 = (M) this.L$0;
            View view = this.$view;
            this.L$0 = m12;
            this.label = 1;
            if (ViewExtensionsKt.awaitNextLayout(view, this) == aVar) {
                return aVar;
            }
            m11 = m12;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            m11 = (M) this.L$0;
            s.b(obj);
        }
        if (N.f(m11)) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.$view.getHeight(), 0.0f);
            AviaCheckTariffsPriceDetailsView aviaCheckTariffsPriceDetailsView = this.this$0;
            final View view2 = this.$view;
            accelerateDecelerateInterpolator = aviaCheckTariffsPriceDetailsView.cellInterpolator;
            ofFloat.setInterpolator(accelerateDecelerateInterpolator);
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ru.ozon.app.android.travel.feature.avia.widgets.aviaCheckTariffsPriceDetails.view.a
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    AviaCheckTariffsPriceDetailsView$showViewAnimated$1.invokeSuspend$lambda$1$lambda$0(view2, valueAnimator);
                }
            });
            ofFloat.start();
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((AviaCheckTariffsPriceDetailsView$showViewAnimated$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
