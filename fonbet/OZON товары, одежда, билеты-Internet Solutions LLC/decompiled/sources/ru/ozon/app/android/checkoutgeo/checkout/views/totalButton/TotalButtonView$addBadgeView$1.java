package ru.ozon.app.android.checkoutgeo.checkout.views.totalButton;

import androidx.constraintlayout.widget.Guideline;
import androidx.constraintlayout.widget.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.android.uikit.extensions.ConstraintSetExtKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/constraintlayout/widget/d;", "", "invoke", "(Landroidx/constraintlayout/widget/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes11.dex */
final class TotalButtonView$addBadgeView$1 extends AbstractC7737t implements Function1<d, Unit> {
    final /* synthetic */ TotalButtonView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TotalButtonView$addBadgeView$1(TotalButtonView totalButtonView) {
        super(1);
        this.this$0 = totalButtonView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(d dVar) {
        invoke2(dVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(d updateConstraints) {
        TotalBadgeView totalBadgeView;
        Guideline guideline;
        TotalBadgeView totalBadgeView2;
        TotalBadgeView totalBadgeView3;
        TotalBadgeView totalBadgeView4;
        TotalTitleSubtextView totalTitleSubtextView;
        TotalBadgeView totalBadgeView5;
        Intrinsics.checkNotNullParameter(updateConstraints, "$this$updateConstraints");
        totalBadgeView = this.this$0.badgeView;
        int id2 = totalBadgeView.getId();
        guideline = this.this$0.endGuideline;
        ConstraintSetExtKt.endToEnd$default(updateConstraints, id2, guideline.getId(), 0, 4, null);
        totalBadgeView2 = this.this$0.badgeView;
        ConstraintSetExtKt.topToTop$default(updateConstraints, totalBadgeView2.getId(), 0, 0, 4, null);
        totalBadgeView3 = this.this$0.badgeView;
        ConstraintSetExtKt.bottomToBottom$default(updateConstraints, totalBadgeView3.getId(), 0, 0, 4, null);
        totalBadgeView4 = this.this$0.badgeView;
        int id3 = totalBadgeView4.getId();
        totalTitleSubtextView = this.this$0.titleSubtextView;
        ConstraintSetExtKt.startToEnd$default(updateConstraints, id3, totalTitleSubtextView.getId(), 0, 4, null);
        totalBadgeView5 = this.this$0.badgeView;
        updateConstraints.C(totalBadgeView5.getId(), true);
    }
}
