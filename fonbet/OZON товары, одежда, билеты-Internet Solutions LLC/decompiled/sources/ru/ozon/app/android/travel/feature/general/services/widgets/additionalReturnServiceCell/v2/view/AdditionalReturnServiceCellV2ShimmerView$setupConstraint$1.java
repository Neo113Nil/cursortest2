package ru.ozon.app.android.travel.feature.general.services.widgets.additionalReturnServiceCell.v2.view;

import androidx.constraintlayout.widget.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.molecules.view.shimmer.RoundedShimmerView;
import ru.ozon.app.android.travel.utils.extensions.ConstraintLayoutExtensionsKt;
import ru.ozon.uni.android.atom.icon.IconView;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/constraintlayout/widget/d;", "", "invoke", "(Landroidx/constraintlayout/widget/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
final class AdditionalReturnServiceCellV2ShimmerView$setupConstraint$1 extends AbstractC7737t implements Function1<d, Unit> {
    final /* synthetic */ AdditionalReturnServiceCellV2ShimmerView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdditionalReturnServiceCellV2ShimmerView$setupConstraint$1(AdditionalReturnServiceCellV2ShimmerView additionalReturnServiceCellV2ShimmerView) {
        super(1);
        this.this$0 = additionalReturnServiceCellV2ShimmerView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(d dVar) {
        invoke2(dVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(d updateConstraints) {
        RoundedShimmerView roundedShimmerView;
        RoundedShimmerView roundedShimmerView2;
        RoundedShimmerView roundedShimmerView3;
        RoundedShimmerView roundedShimmerView4;
        RoundedShimmerView roundedShimmerView5;
        int i11;
        RoundedShimmerView roundedShimmerView6;
        RoundedShimmerView roundedShimmerView7;
        int i12;
        RoundedShimmerView roundedShimmerView8;
        RoundedShimmerView roundedShimmerView9;
        int i13;
        RoundedShimmerView roundedShimmerView10;
        RoundedShimmerView roundedShimmerView11;
        RoundedShimmerView roundedShimmerView12;
        RoundedShimmerView roundedShimmerView13;
        RoundedShimmerView roundedShimmerView14;
        RoundedShimmerView roundedShimmerView15;
        int i14;
        IconView iconView;
        RoundedShimmerView roundedShimmerView16;
        IconView iconView2;
        RoundedShimmerView roundedShimmerView17;
        IconView iconView3;
        RoundedShimmerView roundedShimmerView18;
        RoundedShimmerView roundedShimmerView19;
        RoundedShimmerView roundedShimmerView20;
        RoundedShimmerView roundedShimmerView21;
        int i15;
        Intrinsics.checkNotNullParameter(updateConstraints, "$this$updateConstraints");
        roundedShimmerView = this.this$0.icon;
        ConstraintLayoutExtensionsKt.topToParent(updateConstraints, roundedShimmerView);
        roundedShimmerView2 = this.this$0.icon;
        ConstraintLayoutExtensionsKt.startToParent(updateConstraints, roundedShimmerView2);
        roundedShimmerView3 = this.this$0.title;
        ConstraintLayoutExtensionsKt.topToParent(updateConstraints, roundedShimmerView3);
        roundedShimmerView4 = this.this$0.title;
        roundedShimmerView5 = this.this$0.icon;
        i11 = this.this$0.dp12;
        ConstraintLayoutExtensionsKt.startToEnd(updateConstraints, roundedShimmerView4, roundedShimmerView5, i11);
        roundedShimmerView6 = this.this$0.subtitle;
        roundedShimmerView7 = this.this$0.title;
        i12 = this.this$0.dp2;
        ConstraintLayoutExtensionsKt.topToBottom(updateConstraints, roundedShimmerView6, roundedShimmerView7, i12);
        roundedShimmerView8 = this.this$0.subtitle;
        roundedShimmerView9 = this.this$0.icon;
        i13 = this.this$0.dp12;
        ConstraintLayoutExtensionsKt.startToEnd(updateConstraints, roundedShimmerView8, roundedShimmerView9, i13);
        roundedShimmerView10 = this.this$0.badge;
        roundedShimmerView11 = this.this$0.title;
        ConstraintLayoutExtensionsKt.topToTop(updateConstraints, roundedShimmerView10, roundedShimmerView11);
        roundedShimmerView12 = this.this$0.badge;
        roundedShimmerView13 = this.this$0.title;
        ConstraintLayoutExtensionsKt.bottomToBottom(updateConstraints, roundedShimmerView12, roundedShimmerView13);
        roundedShimmerView14 = this.this$0.badge;
        roundedShimmerView15 = this.this$0.title;
        i14 = this.this$0.dp4;
        ConstraintLayoutExtensionsKt.startToEnd(updateConstraints, roundedShimmerView14, roundedShimmerView15, i14);
        iconView = this.this$0.rightBlockIcon;
        roundedShimmerView16 = this.this$0.icon;
        ConstraintLayoutExtensionsKt.topToTop(updateConstraints, iconView, roundedShimmerView16);
        iconView2 = this.this$0.rightBlockIcon;
        roundedShimmerView17 = this.this$0.icon;
        ConstraintLayoutExtensionsKt.bottomToBottom(updateConstraints, iconView2, roundedShimmerView17);
        iconView3 = this.this$0.rightBlockIcon;
        ConstraintLayoutExtensionsKt.endToParent(updateConstraints, iconView3);
        roundedShimmerView18 = this.this$0.content;
        ConstraintLayoutExtensionsKt.startToParent(updateConstraints, roundedShimmerView18);
        roundedShimmerView19 = this.this$0.content;
        ConstraintLayoutExtensionsKt.endToParent(updateConstraints, roundedShimmerView19);
        roundedShimmerView20 = this.this$0.content;
        roundedShimmerView21 = this.this$0.icon;
        i15 = this.this$0.dp16;
        ConstraintLayoutExtensionsKt.topToBottom(updateConstraints, roundedShimmerView20, roundedShimmerView21, i15);
    }
}
