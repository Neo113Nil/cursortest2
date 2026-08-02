package ru.ozon.app.android.travel.feature.general.main.widgets.hotTickets.view;

import androidx.constraintlayout.widget.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.atoms.af.layout.HorizontalAtomsLayout;
import ru.ozon.app.android.travel.utils.extensions.ConstraintLayoutExtensionsKt;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.price.ui.PriceAtomView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/constraintlayout/widget/d;", "", "invoke", "(Landroidx/constraintlayout/widget/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
final class HotTicketsItemView$setConstraints$1 extends AbstractC7737t implements Function1<d, Unit> {
    final /* synthetic */ HotTicketsItemView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HotTicketsItemView$setConstraints$1(HotTicketsItemView hotTicketsItemView) {
        super(1);
        this.this$0 = hotTicketsItemView;
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
        PriceAtomView priceAtomView;
        BadgeView badgeView3;
        int i11;
        PriceAtomView priceAtomView2;
        PriceAtomView priceAtomView3;
        HorizontalAtomsLayout horizontalAtomsLayout;
        HorizontalAtomsLayout horizontalAtomsLayout2;
        PriceAtomView priceAtomView4;
        HorizontalAtomsLayout horizontalAtomsLayout3;
        PriceAtomView priceAtomView5;
        HorizontalAtomsLayout horizontalAtomsLayout4;
        TextAtomV2View textAtomV2View;
        PriceAtomView priceAtomView6;
        int i12;
        TextAtomV2View textAtomV2View2;
        TextAtomV2View textAtomV2View3;
        TextAtomV2View textAtomV2View4;
        int i13;
        TextAtomV2View textAtomV2View5;
        TextAtomV2View textAtomV2View6;
        TextAtomV2View textAtomV2View7;
        TextAtomV2View textAtomV2View8;
        TextAtomV2View textAtomV2View9;
        int i14;
        TextAtomV2View textAtomV2View10;
        TextAtomV2View textAtomV2View11;
        TextAtomV2View textAtomV2View12;
        TextAtomV2View textAtomV2View13;
        TextAtomV2View textAtomV2View14;
        int i15;
        TextAtomV2View textAtomV2View15;
        TextAtomV2View textAtomV2View16;
        TextAtomV2View textAtomV2View17;
        IconView iconView;
        int i16;
        IconView iconView2;
        TextAtomV2View textAtomV2View18;
        IconView iconView3;
        TextAtomV2View textAtomV2View19;
        IconView iconView4;
        Intrinsics.checkNotNullParameter(applyConstraint, "$this$applyConstraint");
        badgeView = this.this$0.badgeBV;
        ConstraintLayoutExtensionsKt.startToParent(applyConstraint, badgeView);
        badgeView2 = this.this$0.badgeBV;
        ConstraintLayoutExtensionsKt.topToParent(applyConstraint, badgeView2);
        priceAtomView = this.this$0.pricePAV;
        badgeView3 = this.this$0.badgeBV;
        i11 = this.this$0.dp8;
        ConstraintLayoutExtensionsKt.topToBottom(applyConstraint, priceAtomView, badgeView3, i11);
        priceAtomView2 = this.this$0.pricePAV;
        ConstraintLayoutExtensionsKt.startToParent(applyConstraint, priceAtomView2);
        priceAtomView3 = this.this$0.pricePAV;
        horizontalAtomsLayout = this.this$0.airlineIconsHAL;
        ConstraintLayoutExtensionsKt.endToStart(applyConstraint, priceAtomView3, horizontalAtomsLayout);
        horizontalAtomsLayout2 = this.this$0.airlineIconsHAL;
        priceAtomView4 = this.this$0.pricePAV;
        ConstraintLayoutExtensionsKt.topToTop(applyConstraint, horizontalAtomsLayout2, priceAtomView4);
        horizontalAtomsLayout3 = this.this$0.airlineIconsHAL;
        priceAtomView5 = this.this$0.pricePAV;
        ConstraintLayoutExtensionsKt.bottomToBottom(applyConstraint, horizontalAtomsLayout3, priceAtomView5);
        horizontalAtomsLayout4 = this.this$0.airlineIconsHAL;
        ConstraintLayoutExtensionsKt.endToParent(applyConstraint, horizontalAtomsLayout4);
        textAtomV2View = this.this$0.destinationTAV;
        priceAtomView6 = this.this$0.pricePAV;
        i12 = this.this$0.dp8;
        ConstraintLayoutExtensionsKt.topToBottom(applyConstraint, textAtomV2View, priceAtomView6, i12);
        textAtomV2View2 = this.this$0.destinationTAV;
        ConstraintLayoutExtensionsKt.startToParent(applyConstraint, textAtomV2View2);
        textAtomV2View3 = this.this$0.destinationTAV;
        textAtomV2View4 = this.this$0.tripDurationTAV;
        i13 = this.this$0.dp8;
        ConstraintLayoutExtensionsKt.endToStart(applyConstraint, textAtomV2View3, textAtomV2View4, i13);
        textAtomV2View5 = this.this$0.tripDurationTAV;
        textAtomV2View6 = this.this$0.destinationTAV;
        ConstraintLayoutExtensionsKt.bottomToBottom(applyConstraint, textAtomV2View5, textAtomV2View6);
        textAtomV2View7 = this.this$0.tripDurationTAV;
        ConstraintLayoutExtensionsKt.endToParent(applyConstraint, textAtomV2View7);
        textAtomV2View8 = this.this$0.tripTimeTAV;
        textAtomV2View9 = this.this$0.destinationTAV;
        i14 = this.this$0.dp2;
        ConstraintLayoutExtensionsKt.topToBottom(applyConstraint, textAtomV2View8, textAtomV2View9, i14);
        textAtomV2View10 = this.this$0.tripTimeTAV;
        ConstraintLayoutExtensionsKt.startToParent(applyConstraint, textAtomV2View10);
        textAtomV2View11 = this.this$0.tripTimeTAV;
        textAtomV2View12 = this.this$0.transferTextTAV;
        ConstraintLayoutExtensionsKt.endToStart(applyConstraint, textAtomV2View11, textAtomV2View12);
        textAtomV2View13 = this.this$0.transferTextTAV;
        textAtomV2View14 = this.this$0.tripDurationTAV;
        i15 = this.this$0.dp2;
        ConstraintLayoutExtensionsKt.topToBottom(applyConstraint, textAtomV2View13, textAtomV2View14, i15);
        textAtomV2View15 = this.this$0.transferTextTAV;
        textAtomV2View16 = this.this$0.tripTimeTAV;
        ConstraintLayoutExtensionsKt.baselineToBaseline(applyConstraint, textAtomV2View15, textAtomV2View16);
        textAtomV2View17 = this.this$0.transferTextTAV;
        iconView = this.this$0.transferIconIV;
        i16 = this.this$0.dp4;
        ConstraintLayoutExtensionsKt.endToStart(applyConstraint, textAtomV2View17, iconView, i16);
        iconView2 = this.this$0.transferIconIV;
        textAtomV2View18 = this.this$0.transferTextTAV;
        ConstraintLayoutExtensionsKt.topToTop(applyConstraint, iconView2, textAtomV2View18);
        iconView3 = this.this$0.transferIconIV;
        textAtomV2View19 = this.this$0.transferTextTAV;
        ConstraintLayoutExtensionsKt.bottomToBottom(applyConstraint, iconView3, textAtomV2View19);
        iconView4 = this.this$0.transferIconIV;
        ConstraintLayoutExtensionsKt.endToParent(applyConstraint, iconView4);
    }
}
