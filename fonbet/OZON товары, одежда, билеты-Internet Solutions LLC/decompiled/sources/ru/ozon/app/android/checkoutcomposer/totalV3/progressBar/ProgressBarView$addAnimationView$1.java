package ru.ozon.app.android.checkoutcomposer.totalV3.progressBar;

import androidx.constraintlayout.widget.Guideline;
import androidx.constraintlayout.widget.d;
import com.airbnb.lottie.LottieAnimationView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.checkoutcomposer.totalV3.progressBar.ProgressBarView;
import ru.ozon.uni.android.uikit.extensions.ConstraintSetExtKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/constraintlayout/widget/d;", "", "invoke", "(Landroidx/constraintlayout/widget/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes11.dex */
final class ProgressBarView$addAnimationView$1 extends AbstractC7737t implements Function1<d, Unit> {
    final /* synthetic */ ProgressBarView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProgressBarView$addAnimationView$1(ProgressBarView progressBarView) {
        super(1);
        this.this$0 = progressBarView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(d dVar) {
        invoke2(dVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(d updateConstraints) {
        LottieAnimationView lottieAnimationView;
        LottieAnimationView lottieAnimationView2;
        LottieAnimationView lottieAnimationView3;
        LottieAnimationView lottieAnimationView4;
        Guideline guideline;
        ProgressBarView.Companion companion;
        Intrinsics.checkNotNullParameter(updateConstraints, "$this$updateConstraints");
        lottieAnimationView = this.this$0.animationView;
        ConstraintSetExtKt.startToStart$default(updateConstraints, lottieAnimationView.getId(), 0, 0, 4, null);
        lottieAnimationView2 = this.this$0.animationView;
        ConstraintSetExtKt.topToTop$default(updateConstraints, lottieAnimationView2.getId(), 0, 0, 4, null);
        lottieAnimationView3 = this.this$0.animationView;
        ConstraintSetExtKt.endToEnd$default(updateConstraints, lottieAnimationView3.getId(), 0, 0, 4, null);
        lottieAnimationView4 = this.this$0.animationView;
        int id2 = lottieAnimationView4.getId();
        guideline = this.this$0.guideline;
        int id3 = guideline.getId();
        companion = ProgressBarView.Companion;
        ConstraintSetExtKt.bottomToTop(updateConstraints, id2, id3, companion.getDP_12());
    }
}
