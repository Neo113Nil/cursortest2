package ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.view.alternativePriceBlock;

import androidx.constraintlayout.widget.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.utils.extensions.ConstraintLayoutExtensionsKt;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.price.ui.PriceAtomView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/constraintlayout/widget/d;", "", "invoke", "(Landroidx/constraintlayout/widget/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
final class AlternativePriceBlockView$setConstraints$1 extends AbstractC7737t implements Function1<d, Unit> {
    final /* synthetic */ AlternativePriceBlockView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AlternativePriceBlockView$setConstraints$1(AlternativePriceBlockView alternativePriceBlockView) {
        super(1);
        this.this$0 = alternativePriceBlockView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(d dVar) {
        invoke2(dVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(d applyConstraint) {
        TextAtomV2View textAtomV2View;
        int i11;
        TextAtomV2View textAtomV2View2;
        BadgeView badgeView;
        TextAtomV2View textAtomV2View3;
        int i12;
        BadgeView badgeView2;
        TextAtomV2View textAtomV2View4;
        BadgeView badgeView3;
        TextAtomV2View textAtomV2View5;
        BadgeView badgeView4;
        BadgeView badgeView5;
        TextAtomV2View textAtomV2View6;
        int i13;
        BadgeView badgeView6;
        BadgeView badgeView7;
        PriceAtomView priceAtomView;
        PriceAtomView priceAtomView2;
        PriceAtomView priceAtomView3;
        BadgeView badgeView8;
        int i14;
        Intrinsics.checkNotNullParameter(applyConstraint, "$this$applyConstraint");
        textAtomV2View = this.this$0.titleTV;
        i11 = this.this$0.dp6;
        ConstraintLayoutExtensionsKt.startToParent(applyConstraint, textAtomV2View, i11);
        textAtomV2View2 = this.this$0.titleTV;
        ConstraintLayoutExtensionsKt.topToParent(applyConstraint, textAtomV2View2);
        badgeView = this.this$0.milesBadgeBV;
        textAtomV2View3 = this.this$0.titleTV;
        i12 = this.this$0.dp8;
        ConstraintLayoutExtensionsKt.startToEnd(applyConstraint, badgeView, textAtomV2View3, i12);
        badgeView2 = this.this$0.milesBadgeBV;
        textAtomV2View4 = this.this$0.titleTV;
        ConstraintLayoutExtensionsKt.topToTop(applyConstraint, badgeView2, textAtomV2View4);
        badgeView3 = this.this$0.milesBadgeBV;
        textAtomV2View5 = this.this$0.titleTV;
        ConstraintLayoutExtensionsKt.bottomToBottom(applyConstraint, badgeView3, textAtomV2View5);
        badgeView4 = this.this$0.priceBadgeBV;
        ConstraintLayoutExtensionsKt.startToParent(applyConstraint, badgeView4);
        badgeView5 = this.this$0.priceBadgeBV;
        textAtomV2View6 = this.this$0.titleTV;
        i13 = this.this$0.dp4;
        ConstraintLayoutExtensionsKt.topToBottom(applyConstraint, badgeView5, textAtomV2View6, i13);
        badgeView6 = this.this$0.priceBadgeBV;
        ConstraintLayoutExtensionsKt.bottomToParent(applyConstraint, badgeView6);
        badgeView7 = this.this$0.priceBadgeBV;
        ConstraintLayoutExtensionsKt.endToParent(applyConstraint, badgeView7);
        priceAtomView = this.this$0.pricePV;
        ConstraintLayoutExtensionsKt.endToParent(applyConstraint, priceAtomView);
        priceAtomView2 = this.this$0.pricePV;
        ConstraintLayoutExtensionsKt.topToParent(applyConstraint, priceAtomView2);
        priceAtomView3 = this.this$0.pricePV;
        badgeView8 = this.this$0.milesBadgeBV;
        i14 = this.this$0.dp8;
        ConstraintLayoutExtensionsKt.startToEnd(applyConstraint, priceAtomView3, badgeView8, i14);
    }
}
