package ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.v4.view.directFlightsShimmer;

import androidx.constraintlayout.widget.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.molecules.view.shimmer.RoundedShimmerView;
import ru.ozon.app.android.travel.utils.extensions.ConstraintLayoutExtensionsKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/constraintlayout/widget/d;", "", "invoke", "(Landroidx/constraintlayout/widget/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes10.dex */
final class AviaSearchResultV4DirectFlightsCellItemShimmerView$setupConstraints$1 extends AbstractC7737t implements Function1<d, Unit> {
    final /* synthetic */ AviaSearchResultV4DirectFlightsCellItemShimmerView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AviaSearchResultV4DirectFlightsCellItemShimmerView$setupConstraints$1(AviaSearchResultV4DirectFlightsCellItemShimmerView aviaSearchResultV4DirectFlightsCellItemShimmerView) {
        super(1);
        this.this$0 = aviaSearchResultV4DirectFlightsCellItemShimmerView;
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
        int i11;
        RoundedShimmerView roundedShimmerView7;
        RoundedShimmerView roundedShimmerView8;
        int i12;
        RoundedShimmerView roundedShimmerView9;
        RoundedShimmerView roundedShimmerView10;
        RoundedShimmerView roundedShimmerView11;
        RoundedShimmerView roundedShimmerView12;
        RoundedShimmerView roundedShimmerView13;
        RoundedShimmerView roundedShimmerView14;
        int i13;
        RoundedShimmerView roundedShimmerView15;
        RoundedShimmerView roundedShimmerView16;
        RoundedShimmerView roundedShimmerView17;
        RoundedShimmerView roundedShimmerView18;
        int i14;
        RoundedShimmerView roundedShimmerView19;
        RoundedShimmerView roundedShimmerView20;
        RoundedShimmerView roundedShimmerView21;
        RoundedShimmerView roundedShimmerView22;
        RoundedShimmerView roundedShimmerView23;
        Intrinsics.checkNotNullParameter(applyConstraint, "$this$applyConstraint");
        roundedShimmerView = this.this$0.icon;
        ConstraintLayoutExtensionsKt.topToParent(applyConstraint, roundedShimmerView);
        roundedShimmerView2 = this.this$0.icon;
        ConstraintLayoutExtensionsKt.startToParent(applyConstraint, roundedShimmerView2);
        roundedShimmerView3 = this.this$0.title;
        roundedShimmerView4 = this.this$0.icon;
        ConstraintLayoutExtensionsKt.topToTop(applyConstraint, roundedShimmerView3, roundedShimmerView4);
        roundedShimmerView5 = this.this$0.title;
        roundedShimmerView6 = this.this$0.icon;
        i11 = this.this$0.dp8;
        ConstraintLayoutExtensionsKt.startToEnd(applyConstraint, roundedShimmerView5, roundedShimmerView6, i11);
        roundedShimmerView7 = this.this$0.subTitleItem1;
        roundedShimmerView8 = this.this$0.title;
        i12 = this.this$0.dp4;
        ConstraintLayoutExtensionsKt.topToBottom(applyConstraint, roundedShimmerView7, roundedShimmerView8, i12);
        roundedShimmerView9 = this.this$0.subTitleItem1;
        roundedShimmerView10 = this.this$0.title;
        ConstraintLayoutExtensionsKt.startToStart(applyConstraint, roundedShimmerView9, roundedShimmerView10);
        roundedShimmerView11 = this.this$0.subTitleItem2;
        roundedShimmerView12 = this.this$0.subTitleItem1;
        ConstraintLayoutExtensionsKt.topToTop(applyConstraint, roundedShimmerView11, roundedShimmerView12);
        roundedShimmerView13 = this.this$0.subTitleItem2;
        roundedShimmerView14 = this.this$0.subTitleItem1;
        i13 = this.this$0.dp8;
        ConstraintLayoutExtensionsKt.startToEnd(applyConstraint, roundedShimmerView13, roundedShimmerView14, i13);
        roundedShimmerView15 = this.this$0.subTitleItem3;
        roundedShimmerView16 = this.this$0.subTitleItem2;
        ConstraintLayoutExtensionsKt.topToTop(applyConstraint, roundedShimmerView15, roundedShimmerView16);
        roundedShimmerView17 = this.this$0.subTitleItem3;
        roundedShimmerView18 = this.this$0.subTitleItem2;
        i14 = this.this$0.dp8;
        ConstraintLayoutExtensionsKt.startToEnd(applyConstraint, roundedShimmerView17, roundedShimmerView18, i14);
        roundedShimmerView19 = this.this$0.price;
        roundedShimmerView20 = this.this$0.icon;
        ConstraintLayoutExtensionsKt.topToTop(applyConstraint, roundedShimmerView19, roundedShimmerView20);
        roundedShimmerView21 = this.this$0.price;
        roundedShimmerView22 = this.this$0.icon;
        ConstraintLayoutExtensionsKt.bottomToBottom(applyConstraint, roundedShimmerView21, roundedShimmerView22);
        roundedShimmerView23 = this.this$0.price;
        ConstraintLayoutExtensionsKt.endToParent(applyConstraint, roundedShimmerView23);
    }
}
