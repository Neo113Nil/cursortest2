package ru.ozon.app.android.travel.feature.general.services.widgets.additionalReturnServiceCell.v2.view;

import androidx.constraintlayout.widget.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.molecules.view.shimmer.RoundedShimmerView;
import ru.ozon.app.android.travel.utils.extensions.ConstraintLayoutExtensionsKt;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.atoms.af.layout.VerticalAtomsLayout;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/constraintlayout/widget/d;", "", "invoke", "(Landroidx/constraintlayout/widget/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
final class AdditionalReturnServiceCellV2View$setupConstraints$1 extends AbstractC7737t implements Function1<d, Unit> {
    final /* synthetic */ AdditionalReturnServiceCellV2View this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdditionalReturnServiceCellV2View$setupConstraints$1(AdditionalReturnServiceCellV2View additionalReturnServiceCellV2View) {
        super(1);
        this.this$0 = additionalReturnServiceCellV2View;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(d dVar) {
        invoke2(dVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(d applyConstraint) {
        AdditionalReturnServiceCellV2ShimmerView additionalReturnServiceCellV2ShimmerView;
        AdditionalReturnServiceCellV2ShimmerView additionalReturnServiceCellV2ShimmerView2;
        AdditionalReturnServiceCellV2ShimmerView additionalReturnServiceCellV2ShimmerView3;
        AdditionalReturnServiceCellV2ShimmerView additionalReturnServiceCellV2ShimmerView4;
        VerticalAtomsLayout verticalAtomsLayout;
        int i11;
        VerticalAtomsLayout verticalAtomsLayout2;
        int i12;
        VerticalAtomsLayout verticalAtomsLayout3;
        int i13;
        RoundedShimmerView roundedShimmerView;
        VerticalAtomsLayout verticalAtomsLayout4;
        int i14;
        RoundedShimmerView roundedShimmerView2;
        int i15;
        RoundedShimmerView roundedShimmerView3;
        RoundedShimmerView roundedShimmerView4;
        RoundedShimmerView roundedShimmerView5;
        RoundedShimmerView roundedShimmerView6;
        int i16;
        RoundedShimmerView roundedShimmerView7;
        int i17;
        RoundedShimmerView roundedShimmerView8;
        BadgeView badgeView;
        RoundedShimmerView roundedShimmerView9;
        VerticalAtomsLayout verticalAtomsLayout5;
        int i18;
        RoundedShimmerView roundedShimmerView10;
        int i19;
        RoundedShimmerView roundedShimmerView11;
        RoundedShimmerView roundedShimmerView12;
        RoundedShimmerView roundedShimmerView13;
        RoundedShimmerView roundedShimmerView14;
        int i21;
        RoundedShimmerView roundedShimmerView15;
        int i22;
        RoundedShimmerView roundedShimmerView16;
        BadgeView badgeView2;
        BadgeView badgeView3;
        RoundedShimmerView roundedShimmerView17;
        int i23;
        BadgeView badgeView4;
        int i24;
        BadgeView badgeView5;
        Intrinsics.checkNotNullParameter(applyConstraint, "$this$applyConstraint");
        additionalReturnServiceCellV2ShimmerView = this.this$0.shimmerView;
        ConstraintLayoutExtensionsKt.topToParent(applyConstraint, additionalReturnServiceCellV2ShimmerView);
        additionalReturnServiceCellV2ShimmerView2 = this.this$0.shimmerView;
        ConstraintLayoutExtensionsKt.startToParent(applyConstraint, additionalReturnServiceCellV2ShimmerView2);
        additionalReturnServiceCellV2ShimmerView3 = this.this$0.shimmerView;
        ConstraintLayoutExtensionsKt.endToParent(applyConstraint, additionalReturnServiceCellV2ShimmerView3);
        additionalReturnServiceCellV2ShimmerView4 = this.this$0.shimmerView;
        ConstraintLayoutExtensionsKt.bottomToParent(applyConstraint, additionalReturnServiceCellV2ShimmerView4);
        verticalAtomsLayout = this.this$0.cellListVAL;
        i11 = this.this$0.dp8;
        ConstraintLayoutExtensionsKt.topToParent(applyConstraint, verticalAtomsLayout, i11);
        verticalAtomsLayout2 = this.this$0.cellListVAL;
        i12 = this.this$0.dp16;
        ConstraintLayoutExtensionsKt.startToParent(applyConstraint, verticalAtomsLayout2, i12);
        verticalAtomsLayout3 = this.this$0.cellListVAL;
        i13 = this.this$0.dp16;
        ConstraintLayoutExtensionsKt.endToParent(applyConstraint, verticalAtomsLayout3, i13);
        roundedShimmerView = this.this$0.leftTop;
        verticalAtomsLayout4 = this.this$0.cellListVAL;
        i14 = this.this$0.dp2;
        ConstraintLayoutExtensionsKt.topToBottom(applyConstraint, roundedShimmerView, verticalAtomsLayout4, i14);
        roundedShimmerView2 = this.this$0.leftTop;
        i15 = this.this$0.dp16;
        ConstraintLayoutExtensionsKt.startToParent(applyConstraint, roundedShimmerView2, i15);
        roundedShimmerView3 = this.this$0.leftTop;
        roundedShimmerView4 = this.this$0.leftBottom;
        ConstraintLayoutExtensionsKt.bottomToTop(applyConstraint, roundedShimmerView3, roundedShimmerView4);
        roundedShimmerView5 = this.this$0.leftBottom;
        roundedShimmerView6 = this.this$0.leftTop;
        i16 = this.this$0.dp8;
        ConstraintLayoutExtensionsKt.topToBottom(applyConstraint, roundedShimmerView5, roundedShimmerView6, i16);
        roundedShimmerView7 = this.this$0.leftBottom;
        i17 = this.this$0.dp16;
        ConstraintLayoutExtensionsKt.startToParent(applyConstraint, roundedShimmerView7, i17);
        roundedShimmerView8 = this.this$0.leftBottom;
        badgeView = this.this$0.getBadgeView();
        ConstraintLayoutExtensionsKt.bottomToTop(applyConstraint, roundedShimmerView8, badgeView);
        roundedShimmerView9 = this.this$0.rightTop;
        verticalAtomsLayout5 = this.this$0.cellListVAL;
        i18 = this.this$0.dp2;
        ConstraintLayoutExtensionsKt.topToBottom(applyConstraint, roundedShimmerView9, verticalAtomsLayout5, i18);
        roundedShimmerView10 = this.this$0.rightTop;
        i19 = this.this$0.dp16;
        ConstraintLayoutExtensionsKt.endToParent(applyConstraint, roundedShimmerView10, i19);
        roundedShimmerView11 = this.this$0.rightTop;
        roundedShimmerView12 = this.this$0.rightBottom;
        ConstraintLayoutExtensionsKt.bottomToTop(applyConstraint, roundedShimmerView11, roundedShimmerView12);
        roundedShimmerView13 = this.this$0.rightBottom;
        roundedShimmerView14 = this.this$0.rightTop;
        i21 = this.this$0.dp8;
        ConstraintLayoutExtensionsKt.topToBottom(applyConstraint, roundedShimmerView13, roundedShimmerView14, i21);
        roundedShimmerView15 = this.this$0.rightBottom;
        i22 = this.this$0.dp16;
        ConstraintLayoutExtensionsKt.endToParent(applyConstraint, roundedShimmerView15, i22);
        roundedShimmerView16 = this.this$0.rightBottom;
        badgeView2 = this.this$0.getBadgeView();
        ConstraintLayoutExtensionsKt.bottomToTop(applyConstraint, roundedShimmerView16, badgeView2);
        badgeView3 = this.this$0.getBadgeView();
        roundedShimmerView17 = this.this$0.leftBottom;
        i23 = this.this$0.dp8;
        ConstraintLayoutExtensionsKt.topToBottom(applyConstraint, badgeView3, roundedShimmerView17, i23);
        badgeView4 = this.this$0.getBadgeView();
        i24 = this.this$0.dp16;
        ConstraintLayoutExtensionsKt.startToParent(applyConstraint, badgeView4, i24);
        badgeView5 = this.this$0.getBadgeView();
        ConstraintLayoutExtensionsKt.bottomToParent(applyConstraint, badgeView5);
    }
}
