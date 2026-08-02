package ru.ozon.app.android.travel.feature.railway.widgets.segmentedTrainRoute.views.skeleton;

import androidx.constraintlayout.widget.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.molecules.view.shimmer.RoundedShimmerView;
import ru.ozon.app.android.travel.utils.extensions.ConstraintLayoutExtensionsKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/constraintlayout/widget/d;", "", "invoke", "(Landroidx/constraintlayout/widget/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
final class SegmentedTrainRouteHeaderSkeletonView$setConstraints$1 extends AbstractC7737t implements Function1<d, Unit> {
    final /* synthetic */ SegmentedTrainRouteHeaderSkeletonView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SegmentedTrainRouteHeaderSkeletonView$setConstraints$1(SegmentedTrainRouteHeaderSkeletonView segmentedTrainRouteHeaderSkeletonView) {
        super(1);
        this.this$0 = segmentedTrainRouteHeaderSkeletonView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(d dVar) {
        invoke2(dVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(d applyConstraint) {
        RoundedShimmerView roundedShimmerView;
        RoundedShimmerView roundedShimmerView2;
        RoundedShimmerView roundedShimmerView3;
        RoundedShimmerView roundedShimmerView4;
        RoundedShimmerView roundedShimmerView5;
        RoundedShimmerView roundedShimmerView6;
        RoundedShimmerView roundedShimmerView7;
        RoundedShimmerView roundedShimmerView8;
        int i11;
        RoundedShimmerView roundedShimmerView9;
        RoundedShimmerView roundedShimmerView10;
        int i12;
        RoundedShimmerView roundedShimmerView11;
        RoundedShimmerView roundedShimmerView12;
        RoundedShimmerView roundedShimmerView13;
        RoundedShimmerView roundedShimmerView14;
        RoundedShimmerView roundedShimmerView15;
        int i13;
        RoundedShimmerView roundedShimmerView16;
        RoundedShimmerView roundedShimmerView17;
        int i14;
        RoundedShimmerView roundedShimmerView18;
        RoundedShimmerView roundedShimmerView19;
        Intrinsics.checkNotNullParameter(applyConstraint, "$this$applyConstraint");
        roundedShimmerView = this.this$0.skeleton;
        ConstraintLayoutExtensionsKt.startToParent(applyConstraint, roundedShimmerView);
        roundedShimmerView2 = this.this$0.skeleton;
        roundedShimmerView3 = this.this$0.skeleton2;
        ConstraintLayoutExtensionsKt.topToTop(applyConstraint, roundedShimmerView2, roundedShimmerView3);
        roundedShimmerView4 = this.this$0.skeleton;
        roundedShimmerView5 = this.this$0.skeleton3;
        ConstraintLayoutExtensionsKt.bottomToBottom(applyConstraint, roundedShimmerView4, roundedShimmerView5);
        roundedShimmerView6 = this.this$0.skeleton2;
        ConstraintLayoutExtensionsKt.topToParent(applyConstraint, roundedShimmerView6);
        roundedShimmerView7 = this.this$0.skeleton2;
        roundedShimmerView8 = this.this$0.skeleton;
        i11 = this.this$0.dp8;
        ConstraintLayoutExtensionsKt.startToEnd(applyConstraint, roundedShimmerView7, roundedShimmerView8, i11);
        roundedShimmerView9 = this.this$0.skeleton3;
        roundedShimmerView10 = this.this$0.skeleton2;
        i12 = this.this$0.dp2;
        ConstraintLayoutExtensionsKt.topToBottom(applyConstraint, roundedShimmerView9, roundedShimmerView10, i12);
        roundedShimmerView11 = this.this$0.skeleton3;
        roundedShimmerView12 = this.this$0.skeleton2;
        ConstraintLayoutExtensionsKt.startToStart(applyConstraint, roundedShimmerView11, roundedShimmerView12);
        roundedShimmerView13 = this.this$0.skeleton4;
        ConstraintLayoutExtensionsKt.startToParent(applyConstraint, roundedShimmerView13);
        roundedShimmerView14 = this.this$0.skeleton4;
        roundedShimmerView15 = this.this$0.skeleton3;
        i13 = this.this$0.dp10;
        ConstraintLayoutExtensionsKt.topToBottom(applyConstraint, roundedShimmerView14, roundedShimmerView15, i13);
        roundedShimmerView16 = this.this$0.skeleton5;
        roundedShimmerView17 = this.this$0.skeleton4;
        i14 = this.this$0.dp10;
        ConstraintLayoutExtensionsKt.startToEnd(applyConstraint, roundedShimmerView16, roundedShimmerView17, i14);
        roundedShimmerView18 = this.this$0.skeleton5;
        roundedShimmerView19 = this.this$0.skeleton4;
        ConstraintLayoutExtensionsKt.topToTop(applyConstraint, roundedShimmerView18, roundedShimmerView19);
    }
}
