package ru.ozon.app.android.checkoutcomposer.totalV3.progressBar;

import androidx.constraintlayout.widget.Guideline;
import androidx.constraintlayout.widget.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.checkoutcomposer.totalV3.progressBar.ProgressBarView;
import ru.ozon.uni.android.uikit.extensions.ConstraintSetExtKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/constraintlayout/widget/d;", "", "invoke", "(Landroidx/constraintlayout/widget/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes11.dex */
final class ProgressBarView$addTitleView$1 extends AbstractC7737t implements Function1<d, Unit> {
    final /* synthetic */ ProgressBarView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProgressBarView$addTitleView$1(ProgressBarView progressBarView) {
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
        ProgressBarView.Companion companion;
        Guideline guideline;
        ProgressBarView.Companion companion2;
        ProgressBarView.Companion companion3;
        Intrinsics.checkNotNullParameter(updateConstraints, "$this$updateConstraints");
        int id2 = this.this$0.getTitleView().getId();
        companion = ProgressBarView.Companion;
        ConstraintSetExtKt.startToStart(updateConstraints, id2, 0, companion.getDP_32());
        int id3 = this.this$0.getTitleView().getId();
        guideline = this.this$0.guideline;
        ConstraintSetExtKt.topToTop$default(updateConstraints, id3, guideline.getId(), 0, 4, null);
        int id4 = this.this$0.getTitleView().getId();
        companion2 = ProgressBarView.Companion;
        ConstraintSetExtKt.endToEnd(updateConstraints, id4, 0, companion2.getDP_32());
        int id5 = this.this$0.getTitleView().getId();
        companion3 = ProgressBarView.Companion;
        ConstraintSetExtKt.bottomToBottom(updateConstraints, id5, 0, companion3.getDP_24());
    }
}
