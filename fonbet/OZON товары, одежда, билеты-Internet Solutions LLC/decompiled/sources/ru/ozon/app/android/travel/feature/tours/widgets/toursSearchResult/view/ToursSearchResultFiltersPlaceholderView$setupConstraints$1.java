package ru.ozon.app.android.travel.feature.tours.widgets.toursSearchResult.view;

import androidx.constraintlayout.widget.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.molecules.view.shimmer.RoundedShimmerView;
import ru.ozon.app.android.travel.utils.extensions.ConstraintLayoutExtensionsKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/constraintlayout/widget/d;", "", "invoke", "(Landroidx/constraintlayout/widget/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
final class ToursSearchResultFiltersPlaceholderView$setupConstraints$1 extends AbstractC7737t implements Function1<d, Unit> {
    final /* synthetic */ ToursSearchResultFiltersPlaceholderView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ToursSearchResultFiltersPlaceholderView$setupConstraints$1(ToursSearchResultFiltersPlaceholderView toursSearchResultFiltersPlaceholderView) {
        super(1);
        this.this$0 = toursSearchResultFiltersPlaceholderView;
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
        int i11;
        RoundedShimmerView roundedShimmerView3;
        RoundedShimmerView roundedShimmerView4;
        RoundedShimmerView roundedShimmerView5;
        int i12;
        RoundedShimmerView roundedShimmerView6;
        RoundedShimmerView roundedShimmerView7;
        RoundedShimmerView roundedShimmerView8;
        int i13;
        RoundedShimmerView roundedShimmerView9;
        RoundedShimmerView roundedShimmerView10;
        int i14;
        RoundedShimmerView roundedShimmerView11;
        int i15;
        RoundedShimmerView roundedShimmerView12;
        RoundedShimmerView roundedShimmerView13;
        RoundedShimmerView roundedShimmerView14;
        int i16;
        Intrinsics.checkNotNullParameter(applyConstraint, "$this$applyConstraint");
        roundedShimmerView = this.this$0.filterShimmer1;
        ConstraintLayoutExtensionsKt.topToParent(applyConstraint, roundedShimmerView);
        roundedShimmerView2 = this.this$0.filterShimmer1;
        i11 = this.this$0.dp16;
        ConstraintLayoutExtensionsKt.startToParent(applyConstraint, roundedShimmerView2, i11);
        roundedShimmerView3 = this.this$0.filterShimmer2;
        ConstraintLayoutExtensionsKt.topToParent(applyConstraint, roundedShimmerView3);
        roundedShimmerView4 = this.this$0.filterShimmer2;
        roundedShimmerView5 = this.this$0.filterShimmer1;
        i12 = this.this$0.dp8;
        ConstraintLayoutExtensionsKt.startToEnd(applyConstraint, roundedShimmerView4, roundedShimmerView5, i12);
        roundedShimmerView6 = this.this$0.filterShimmer3;
        ConstraintLayoutExtensionsKt.topToParent(applyConstraint, roundedShimmerView6);
        roundedShimmerView7 = this.this$0.filterShimmer3;
        roundedShimmerView8 = this.this$0.filterShimmer2;
        i13 = this.this$0.dp8;
        ConstraintLayoutExtensionsKt.startToEnd(applyConstraint, roundedShimmerView7, roundedShimmerView8, i13);
        roundedShimmerView9 = this.this$0.textShimmer1;
        roundedShimmerView10 = this.this$0.filterShimmer1;
        i14 = this.this$0.dp16;
        ConstraintLayoutExtensionsKt.topToBottom(applyConstraint, roundedShimmerView9, roundedShimmerView10, i14);
        roundedShimmerView11 = this.this$0.textShimmer1;
        i15 = this.this$0.dp16;
        ConstraintLayoutExtensionsKt.startToParent(applyConstraint, roundedShimmerView11, i15);
        roundedShimmerView12 = this.this$0.textShimmer2;
        roundedShimmerView13 = this.this$0.textShimmer1;
        ConstraintLayoutExtensionsKt.bottomToBottom(applyConstraint, roundedShimmerView12, roundedShimmerView13);
        roundedShimmerView14 = this.this$0.textShimmer2;
        i16 = this.this$0.dp16;
        ConstraintLayoutExtensionsKt.endToParent(applyConstraint, roundedShimmerView14, i16);
    }
}
