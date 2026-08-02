package ru.ozon.app.android.travel.feature.general.booking.widgets.passengersLuggageButton.view;

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
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/constraintlayout/widget/d;", "", "invoke", "(Landroidx/constraintlayout/widget/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes3.dex */
final class PassengersLuggageButtonView$setConstraints$1 extends AbstractC7737t implements Function1<d, Unit> {
    final /* synthetic */ PassengersLuggageButtonView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PassengersLuggageButtonView$setConstraints$1(PassengersLuggageButtonView passengersLuggageButtonView) {
        super(1);
        this.this$0 = passengersLuggageButtonView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(d dVar) {
        invoke2(dVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(d applyConstraint) {
        TextAtomV2View textAtomV2View;
        TextAtomV2View textAtomV2View2;
        IconButtonV3View iconButtonV3View;
        TextAtomV2View textAtomV2View3;
        int i11;
        IconButtonV3View iconButtonV3View2;
        TextAtomV2View textAtomV2View4;
        IconButtonV3View iconButtonV3View3;
        TextAtomV2View textAtomV2View5;
        BadgeView badgeView;
        IconButtonV3View iconButtonV3View4;
        int i12;
        BadgeView badgeView2;
        TextAtomV2View textAtomV2View6;
        BadgeView badgeView3;
        TextAtomV2View textAtomV2View7;
        PriceAtomView priceAtomView;
        PriceAtomView priceAtomView2;
        PriceAtomView priceAtomView3;
        BadgeView badgeView4;
        int i13;
        ButtonV3View buttonV3View;
        ButtonV3View buttonV3View2;
        ButtonV3View buttonV3View3;
        TextAtomV2View textAtomV2View8;
        int i14;
        TextAtomV2View textAtomV2View9;
        TextAtomV2View textAtomV2View10;
        TextAtomV2View textAtomV2View11;
        TextAtomV2View textAtomV2View12;
        ButtonV3View buttonV3View4;
        int i15;
        Intrinsics.checkNotNullParameter(applyConstraint, "$this$applyConstraint");
        textAtomV2View = this.this$0.titleTV;
        ConstraintLayoutExtensionsKt.startToParent(applyConstraint, textAtomV2View);
        textAtomV2View2 = this.this$0.titleTV;
        ConstraintLayoutExtensionsKt.topToParent(applyConstraint, textAtomV2View2);
        iconButtonV3View = this.this$0.iconIV;
        textAtomV2View3 = this.this$0.titleTV;
        i11 = this.this$0.dp8;
        ConstraintLayoutExtensionsKt.startToEnd(applyConstraint, iconButtonV3View, textAtomV2View3, i11);
        iconButtonV3View2 = this.this$0.iconIV;
        textAtomV2View4 = this.this$0.titleTV;
        ConstraintLayoutExtensionsKt.topToTop(applyConstraint, iconButtonV3View2, textAtomV2View4);
        iconButtonV3View3 = this.this$0.iconIV;
        textAtomV2View5 = this.this$0.titleTV;
        ConstraintLayoutExtensionsKt.bottomToBottom(applyConstraint, iconButtonV3View3, textAtomV2View5);
        badgeView = this.this$0.badgeBV;
        iconButtonV3View4 = this.this$0.iconIV;
        i12 = this.this$0.dp8;
        ConstraintLayoutExtensionsKt.startToEnd(applyConstraint, badgeView, iconButtonV3View4, i12);
        badgeView2 = this.this$0.badgeBV;
        textAtomV2View6 = this.this$0.titleTV;
        ConstraintLayoutExtensionsKt.topToTop(applyConstraint, badgeView2, textAtomV2View6);
        badgeView3 = this.this$0.badgeBV;
        textAtomV2View7 = this.this$0.titleTV;
        ConstraintLayoutExtensionsKt.bottomToBottom(applyConstraint, badgeView3, textAtomV2View7);
        priceAtomView = this.this$0.pricePV;
        ConstraintLayoutExtensionsKt.endToParent(applyConstraint, priceAtomView);
        priceAtomView2 = this.this$0.pricePV;
        ConstraintLayoutExtensionsKt.topToParent(applyConstraint, priceAtomView2);
        priceAtomView3 = this.this$0.pricePV;
        badgeView4 = this.this$0.badgeBV;
        i13 = this.this$0.dp8;
        ConstraintLayoutExtensionsKt.startToEnd(applyConstraint, priceAtomView3, badgeView4, i13);
        buttonV3View = this.this$0.buttonBV;
        ConstraintLayoutExtensionsKt.startToParent(applyConstraint, buttonV3View);
        buttonV3View2 = this.this$0.buttonBV;
        ConstraintLayoutExtensionsKt.endToParent(applyConstraint, buttonV3View2);
        buttonV3View3 = this.this$0.buttonBV;
        textAtomV2View8 = this.this$0.titleTV;
        i14 = this.this$0.dp16;
        ConstraintLayoutExtensionsKt.topToBottom(applyConstraint, buttonV3View3, textAtomV2View8, i14);
        textAtomV2View9 = this.this$0.termsTitleTV;
        ConstraintLayoutExtensionsKt.startToParent(applyConstraint, textAtomV2View9);
        textAtomV2View10 = this.this$0.termsTitleTV;
        ConstraintLayoutExtensionsKt.endToParent(applyConstraint, textAtomV2View10);
        textAtomV2View11 = this.this$0.termsTitleTV;
        ConstraintLayoutExtensionsKt.bottomToParent(applyConstraint, textAtomV2View11);
        textAtomV2View12 = this.this$0.termsTitleTV;
        buttonV3View4 = this.this$0.buttonBV;
        i15 = this.this$0.dp12;
        ConstraintLayoutExtensionsKt.topToBottom(applyConstraint, textAtomV2View12, buttonV3View4, i15);
    }
}
