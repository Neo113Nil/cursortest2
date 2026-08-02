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
final class ToursSearchResultPlaceholderView$setupConstraints$1 extends AbstractC7737t implements Function1<d, Unit> {
    final /* synthetic */ ToursSearchResultPlaceholderView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ToursSearchResultPlaceholderView$setupConstraints$1(ToursSearchResultPlaceholderView toursSearchResultPlaceholderView) {
        super(1);
        this.this$0 = toursSearchResultPlaceholderView;
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
        int i11;
        RoundedShimmerView roundedShimmerView6;
        RoundedShimmerView roundedShimmerView7;
        RoundedShimmerView roundedShimmerView8;
        int i12;
        RoundedShimmerView roundedShimmerView9;
        RoundedShimmerView roundedShimmerView10;
        RoundedShimmerView roundedShimmerView11;
        int i13;
        RoundedShimmerView roundedShimmerView12;
        RoundedShimmerView roundedShimmerView13;
        RoundedShimmerView roundedShimmerView14;
        RoundedShimmerView roundedShimmerView15;
        int i14;
        RoundedShimmerView roundedShimmerView16;
        RoundedShimmerView roundedShimmerView17;
        RoundedShimmerView roundedShimmerView18;
        RoundedShimmerView roundedShimmerView19;
        RoundedShimmerView roundedShimmerView20;
        int i15;
        RoundedShimmerView roundedShimmerView21;
        RoundedShimmerView roundedShimmerView22;
        RoundedShimmerView roundedShimmerView23;
        RoundedShimmerView roundedShimmerView24;
        int i16;
        RoundedShimmerView roundedShimmerView25;
        RoundedShimmerView roundedShimmerView26;
        int i17;
        RoundedShimmerView roundedShimmerView27;
        RoundedShimmerView roundedShimmerView28;
        RoundedShimmerView roundedShimmerView29;
        RoundedShimmerView roundedShimmerView30;
        RoundedShimmerView roundedShimmerView31;
        int i18;
        RoundedShimmerView roundedShimmerView32;
        RoundedShimmerView roundedShimmerView33;
        int i19;
        RoundedShimmerView roundedShimmerView34;
        Intrinsics.checkNotNullParameter(applyConstraint, "$this$applyConstraint");
        roundedShimmerView = this.this$0.galleryShimmer;
        ConstraintLayoutExtensionsKt.topToParent(applyConstraint, roundedShimmerView);
        roundedShimmerView2 = this.this$0.galleryShimmer;
        ConstraintLayoutExtensionsKt.startToParent(applyConstraint, roundedShimmerView2);
        roundedShimmerView3 = this.this$0.galleryShimmer;
        ConstraintLayoutExtensionsKt.endToParent(applyConstraint, roundedShimmerView3);
        roundedShimmerView4 = this.this$0.titleShimmer1;
        roundedShimmerView5 = this.this$0.galleryShimmer;
        i11 = this.this$0.dp8;
        ConstraintLayoutExtensionsKt.topToBottom(applyConstraint, roundedShimmerView4, roundedShimmerView5, i11);
        roundedShimmerView6 = this.this$0.titleShimmer1;
        ConstraintLayoutExtensionsKt.startToParent(applyConstraint, roundedShimmerView6);
        roundedShimmerView7 = this.this$0.titleShimmer2;
        roundedShimmerView8 = this.this$0.titleShimmer1;
        i12 = this.this$0.dp8;
        ConstraintLayoutExtensionsKt.topToBottom(applyConstraint, roundedShimmerView7, roundedShimmerView8, i12);
        roundedShimmerView9 = this.this$0.titleShimmer2;
        ConstraintLayoutExtensionsKt.startToParent(applyConstraint, roundedShimmerView9);
        roundedShimmerView10 = this.this$0.descriptionShimmer;
        roundedShimmerView11 = this.this$0.titleShimmer2;
        i13 = this.this$0.dp8;
        ConstraintLayoutExtensionsKt.topToBottom(applyConstraint, roundedShimmerView10, roundedShimmerView11, i13);
        roundedShimmerView12 = this.this$0.descriptionShimmer;
        ConstraintLayoutExtensionsKt.startToParent(applyConstraint, roundedShimmerView12);
        roundedShimmerView13 = this.this$0.descriptionShimmer;
        ConstraintLayoutExtensionsKt.endToParent(applyConstraint, roundedShimmerView13);
        roundedShimmerView14 = this.this$0.badgeShimmer1;
        roundedShimmerView15 = this.this$0.descriptionShimmer;
        i14 = this.this$0.dp8;
        ConstraintLayoutExtensionsKt.topToBottom(applyConstraint, roundedShimmerView14, roundedShimmerView15, i14);
        roundedShimmerView16 = this.this$0.badgeShimmer1;
        ConstraintLayoutExtensionsKt.startToParent(applyConstraint, roundedShimmerView16);
        roundedShimmerView17 = this.this$0.badgeShimmer2;
        roundedShimmerView18 = this.this$0.badgeShimmer1;
        ConstraintLayoutExtensionsKt.bottomToBottom(applyConstraint, roundedShimmerView17, roundedShimmerView18);
        roundedShimmerView19 = this.this$0.badgeShimmer2;
        roundedShimmerView20 = this.this$0.badgeShimmer1;
        i15 = this.this$0.dp8;
        ConstraintLayoutExtensionsKt.startToEnd(applyConstraint, roundedShimmerView19, roundedShimmerView20, i15);
        roundedShimmerView21 = this.this$0.badgeShimmer3;
        roundedShimmerView22 = this.this$0.badgeShimmer1;
        ConstraintLayoutExtensionsKt.bottomToBottom(applyConstraint, roundedShimmerView21, roundedShimmerView22);
        roundedShimmerView23 = this.this$0.badgeShimmer3;
        roundedShimmerView24 = this.this$0.badgeShimmer2;
        i16 = this.this$0.dp8;
        ConstraintLayoutExtensionsKt.startToEnd(applyConstraint, roundedShimmerView23, roundedShimmerView24, i16);
        roundedShimmerView25 = this.this$0.optionShimmer1;
        roundedShimmerView26 = this.this$0.badgeShimmer1;
        i17 = this.this$0.dp8;
        ConstraintLayoutExtensionsKt.topToBottom(applyConstraint, roundedShimmerView25, roundedShimmerView26, i17);
        roundedShimmerView27 = this.this$0.optionShimmer1;
        ConstraintLayoutExtensionsKt.startToParent(applyConstraint, roundedShimmerView27);
        roundedShimmerView28 = this.this$0.optionShimmer2;
        roundedShimmerView29 = this.this$0.optionShimmer1;
        ConstraintLayoutExtensionsKt.bottomToBottom(applyConstraint, roundedShimmerView28, roundedShimmerView29);
        roundedShimmerView30 = this.this$0.optionShimmer2;
        roundedShimmerView31 = this.this$0.optionShimmer1;
        i18 = this.this$0.dp8;
        ConstraintLayoutExtensionsKt.startToEnd(applyConstraint, roundedShimmerView30, roundedShimmerView31, i18);
        roundedShimmerView32 = this.this$0.priceShimmer;
        roundedShimmerView33 = this.this$0.optionShimmer1;
        i19 = this.this$0.dp8;
        ConstraintLayoutExtensionsKt.topToBottom(applyConstraint, roundedShimmerView32, roundedShimmerView33, i19);
        roundedShimmerView34 = this.this$0.priceShimmer;
        ConstraintLayoutExtensionsKt.startToParent(applyConstraint, roundedShimmerView34);
    }
}
