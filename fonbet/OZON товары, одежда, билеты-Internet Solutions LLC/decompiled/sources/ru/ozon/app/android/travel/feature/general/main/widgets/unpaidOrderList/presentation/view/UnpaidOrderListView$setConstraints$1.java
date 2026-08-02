package ru.ozon.app.android.travel.feature.general.main.widgets.unpaidOrderList.presentation.view;

import android.view.View;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.atoms.af.layout.HorizontalAtomsLayout;
import ru.ozon.app.android.travel.utils.extensions.ConstraintLayoutExtensionsKt;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.price.ui.PriceAtomView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/constraintlayout/widget/d;", "", "invoke", "(Landroidx/constraintlayout/widget/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
final class UnpaidOrderListView$setConstraints$1 extends AbstractC7737t implements Function1<d, Unit> {
    final /* synthetic */ UnpaidOrderListView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UnpaidOrderListView$setConstraints$1(UnpaidOrderListView unpaidOrderListView) {
        super(1);
        this.this$0 = unpaidOrderListView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(d dVar) {
        invoke2(dVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(d applyConstraint) {
        BadgeView badgeView;
        BadgeView badgeView2;
        BadgeView badgeView3;
        TextAtomV2View textAtomV2View;
        TextAtomV2View textAtomV2View2;
        BadgeView badgeView4;
        int i11;
        TextAtomV2View textAtomV2View3;
        Barrier barrier;
        int i12;
        TextAtomV2View textAtomV2View4;
        TextAtomV2View textAtomV2View5;
        TextAtomV2View textAtomV2View6;
        int i13;
        TextAtomV2View textAtomV2View7;
        Barrier barrier2;
        int i14;
        BadgeView badgeView5;
        BadgeView badgeView6;
        TextAtomV2View textAtomV2View8;
        BadgeView badgeView7;
        TextAtomV2View textAtomV2View9;
        PriceAtomView priceAtomView;
        PriceAtomView priceAtomView2;
        TextAtomV2View textAtomV2View10;
        PriceAtomView priceAtomView3;
        PriceAtomView priceAtomView4;
        PriceAtomView priceAtomView5;
        PriceAtomView priceAtomView6;
        PriceAtomView priceAtomView7;
        PriceAtomView priceAtomView8;
        PriceAtomView priceAtomView9;
        TextAtomV2View textAtomV2View11;
        View view;
        View view2;
        View view3;
        TextAtomV2View textAtomV2View12;
        int i15;
        TextAtomV2View textAtomV2View13;
        TextAtomV2View textAtomV2View14;
        HorizontalAtomsLayout horizontalAtomsLayout;
        int i16;
        TextAtomV2View textAtomV2View15;
        HorizontalAtomsLayout horizontalAtomsLayout2;
        TextAtomV2View textAtomV2View16;
        HorizontalAtomsLayout horizontalAtomsLayout3;
        HorizontalAtomsLayout horizontalAtomsLayout4;
        HorizontalAtomsLayout horizontalAtomsLayout5;
        View view4;
        int i17;
        Intrinsics.checkNotNullParameter(applyConstraint, "$this$applyConstraint");
        badgeView = this.this$0.badgeBV;
        ConstraintLayoutExtensionsKt.startToParent(applyConstraint, badgeView);
        badgeView2 = this.this$0.badgeBV;
        ConstraintLayoutExtensionsKt.topToParent(applyConstraint, badgeView2);
        badgeView3 = this.this$0.badgeBV;
        ConstraintLayoutExtensionsKt.endToParent(applyConstraint, badgeView3);
        textAtomV2View = this.this$0.titleTAV;
        ConstraintLayoutExtensionsKt.startToParent(applyConstraint, textAtomV2View);
        textAtomV2View2 = this.this$0.titleTAV;
        badgeView4 = this.this$0.badgeBV;
        i11 = this.this$0.dp10;
        ConstraintLayoutExtensionsKt.topToBottom(applyConstraint, textAtomV2View2, badgeView4, i11);
        textAtomV2View3 = this.this$0.titleTAV;
        barrier = this.this$0.barrierBV;
        i12 = this.this$0.dp8;
        ConstraintLayoutExtensionsKt.endToStart(applyConstraint, textAtomV2View3, barrier, i12);
        textAtomV2View4 = this.this$0.datesTAV;
        ConstraintLayoutExtensionsKt.startToParent(applyConstraint, textAtomV2View4);
        textAtomV2View5 = this.this$0.datesTAV;
        textAtomV2View6 = this.this$0.titleTAV;
        i13 = this.this$0.dp2;
        ConstraintLayoutExtensionsKt.topToBottom(applyConstraint, textAtomV2View5, textAtomV2View6, i13);
        textAtomV2View7 = this.this$0.datesTAV;
        barrier2 = this.this$0.barrierBV;
        i14 = this.this$0.dp8;
        ConstraintLayoutExtensionsKt.endToStart(applyConstraint, textAtomV2View7, barrier2, i14);
        badgeView5 = this.this$0.priceBadgeBV;
        ConstraintLayoutExtensionsKt.endToParent(applyConstraint, badgeView5);
        badgeView6 = this.this$0.priceBadgeBV;
        textAtomV2View8 = this.this$0.titleTAV;
        ConstraintLayoutExtensionsKt.topToTop(applyConstraint, badgeView6, textAtomV2View8);
        badgeView7 = this.this$0.priceBadgeBV;
        textAtomV2View9 = this.this$0.datesTAV;
        ConstraintLayoutExtensionsKt.bottomToBottom(applyConstraint, badgeView7, textAtomV2View9);
        priceAtomView = this.this$0.firstPriceV;
        ConstraintLayoutExtensionsKt.endToParent(applyConstraint, priceAtomView);
        priceAtomView2 = this.this$0.firstPriceV;
        textAtomV2View10 = this.this$0.titleTAV;
        ConstraintLayoutExtensionsKt.topToTop(applyConstraint, priceAtomView2, textAtomV2View10);
        priceAtomView3 = this.this$0.firstPriceV;
        priceAtomView4 = this.this$0.secondPriceV;
        ConstraintLayoutExtensionsKt.bottomToTop(applyConstraint, priceAtomView3, priceAtomView4);
        priceAtomView5 = this.this$0.firstPriceV;
        applyConstraint.g0(priceAtomView5.getId(), 2);
        priceAtomView6 = this.this$0.secondPriceV;
        ConstraintLayoutExtensionsKt.endToParent(applyConstraint, priceAtomView6);
        priceAtomView7 = this.this$0.secondPriceV;
        priceAtomView8 = this.this$0.firstPriceV;
        ConstraintLayoutExtensionsKt.topToBottom(applyConstraint, priceAtomView7, priceAtomView8);
        priceAtomView9 = this.this$0.secondPriceV;
        textAtomV2View11 = this.this$0.datesTAV;
        ConstraintLayoutExtensionsKt.bottomToBottom(applyConstraint, priceAtomView9, textAtomV2View11);
        view = this.this$0.separatorV;
        ConstraintLayoutExtensionsKt.startToParent(applyConstraint, view);
        view2 = this.this$0.separatorV;
        ConstraintLayoutExtensionsKt.endToParent(applyConstraint, view2);
        view3 = this.this$0.separatorV;
        textAtomV2View12 = this.this$0.datesTAV;
        i15 = this.this$0.dp8;
        ConstraintLayoutExtensionsKt.topToBottom(applyConstraint, view3, textAtomV2View12, i15);
        textAtomV2View13 = this.this$0.detailTAV;
        ConstraintLayoutExtensionsKt.startToParent(applyConstraint, textAtomV2View13);
        textAtomV2View14 = this.this$0.detailTAV;
        horizontalAtomsLayout = this.this$0.iconsHAL;
        i16 = this.this$0.dp10;
        ConstraintLayoutExtensionsKt.endToStart(applyConstraint, textAtomV2View14, horizontalAtomsLayout, i16);
        textAtomV2View15 = this.this$0.detailTAV;
        horizontalAtomsLayout2 = this.this$0.iconsHAL;
        ConstraintLayoutExtensionsKt.topToTop(applyConstraint, textAtomV2View15, horizontalAtomsLayout2);
        textAtomV2View16 = this.this$0.detailTAV;
        horizontalAtomsLayout3 = this.this$0.iconsHAL;
        ConstraintLayoutExtensionsKt.bottomToBottom(applyConstraint, textAtomV2View16, horizontalAtomsLayout3);
        horizontalAtomsLayout4 = this.this$0.iconsHAL;
        ConstraintLayoutExtensionsKt.endToParent(applyConstraint, horizontalAtomsLayout4);
        horizontalAtomsLayout5 = this.this$0.iconsHAL;
        view4 = this.this$0.separatorV;
        i17 = this.this$0.dp8;
        ConstraintLayoutExtensionsKt.topToBottom(applyConstraint, horizontalAtomsLayout5, view4, i17);
    }
}
