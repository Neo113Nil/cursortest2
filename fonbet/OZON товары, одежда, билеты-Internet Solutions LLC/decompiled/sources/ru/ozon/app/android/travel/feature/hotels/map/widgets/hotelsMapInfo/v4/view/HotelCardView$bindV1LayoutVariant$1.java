package ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.view;

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
final class HotelCardView$bindV1LayoutVariant$1 extends AbstractC7737t implements Function1<d, Unit> {
    final /* synthetic */ boolean $hasPrice;
    final /* synthetic */ HotelCardView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HotelCardView$bindV1LayoutVariant$1(HotelCardView hotelCardView, boolean z11) {
        super(1);
        this.this$0 = hotelCardView;
        this.$hasPrice = z11;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(d dVar) {
        invoke2(dVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(d updateConstraints) {
        PriceAtomView priceAtomView;
        BadgeView badgeView;
        PriceAtomView priceAtomView2;
        TextAtomV2View textAtomV2View;
        TextAtomV2View textAtomV2View2;
        TextAtomV2View textAtomV2View3;
        TextAtomV2View textAtomV2View4;
        TextAtomV2View textAtomV2View5;
        int i11;
        TextAtomV2View textAtomV2View6;
        TextAtomV2View textAtomV2View7;
        int i12;
        TextAtomV2View textAtomV2View8;
        BadgeView badgeView2;
        BadgeView badgeView3;
        TextAtomV2View textAtomV2View9;
        BadgeView badgeView4;
        int i13;
        TextAtomV2View textAtomV2View10;
        PriceAtomView priceAtomView3;
        int i14;
        TextAtomV2View textAtomV2View11;
        PriceAtomView priceAtomView4;
        TextAtomV2View textAtomV2View12;
        PriceAtomView priceAtomView5;
        Intrinsics.checkNotNullParameter(updateConstraints, "$this$updateConstraints");
        priceAtomView = this.this$0.hotelsMapInfoV4CardPricePav;
        badgeView = this.this$0.hotelsMapInfoV4CardMilesBv;
        ConstraintLayoutExtensionsKt.bottomToTop(updateConstraints, priceAtomView, badgeView);
        priceAtomView2 = this.this$0.hotelsMapInfoV4CardPricePav;
        textAtomV2View = this.this$0.hotelsMapInfoV4CardPriceTav;
        ConstraintLayoutExtensionsKt.endToStart(updateConstraints, priceAtomView2, textAtomV2View);
        textAtomV2View2 = this.this$0.hotelsMapInfoV4CardPriceTav;
        ConstraintLayoutExtensionsKt.clear(updateConstraints, textAtomV2View2);
        if (this.$hasPrice) {
            textAtomV2View10 = this.this$0.hotelsMapInfoV4CardPriceTav;
            priceAtomView3 = this.this$0.hotelsMapInfoV4CardPricePav;
            i14 = this.this$0.dp8;
            ConstraintLayoutExtensionsKt.startToEnd(updateConstraints, textAtomV2View10, priceAtomView3, i14);
            textAtomV2View11 = this.this$0.hotelsMapInfoV4CardPriceTav;
            priceAtomView4 = this.this$0.hotelsMapInfoV4CardPricePav;
            ConstraintLayoutExtensionsKt.topToTop(updateConstraints, textAtomV2View11, priceAtomView4);
            textAtomV2View12 = this.this$0.hotelsMapInfoV4CardPriceTav;
            priceAtomView5 = this.this$0.hotelsMapInfoV4CardPricePav;
            ConstraintLayoutExtensionsKt.bottomToBottom(updateConstraints, textAtomV2View12, priceAtomView5);
        } else {
            textAtomV2View3 = this.this$0.hotelsMapInfoV4CardPriceTav;
            textAtomV2View4 = this.this$0.hotelsMapInfoV4CardTitleTav;
            ConstraintLayoutExtensionsKt.startToStart(updateConstraints, textAtomV2View3, textAtomV2View4);
            textAtomV2View5 = this.this$0.hotelsMapInfoV4CardPriceTav;
            i11 = this.this$0.dp6;
            ConstraintLayoutExtensionsKt.bottomToParent(updateConstraints, textAtomV2View5, i11);
            textAtomV2View6 = this.this$0.hotelsMapInfoV4CardPriceTav;
            updateConstraints.C(textAtomV2View6.getId(), true);
        }
        textAtomV2View7 = this.this$0.hotelsMapInfoV4CardPriceTav;
        i12 = this.this$0.dp6;
        ConstraintLayoutExtensionsKt.endToParent(updateConstraints, textAtomV2View7, i12);
        textAtomV2View8 = this.this$0.hotelsMapInfoV4CardPriceTav;
        updateConstraints.c0(0.0f, textAtomV2View8.getId());
        badgeView2 = this.this$0.hotelsMapInfoV4CardMilesBv;
        ConstraintLayoutExtensionsKt.clear(updateConstraints, badgeView2);
        badgeView3 = this.this$0.hotelsMapInfoV4CardMilesBv;
        textAtomV2View9 = this.this$0.hotelsMapInfoV4CardTitleTav;
        ConstraintLayoutExtensionsKt.startToStart(updateConstraints, badgeView3, textAtomV2View9);
        badgeView4 = this.this$0.hotelsMapInfoV4CardMilesBv;
        i13 = this.this$0.dp6;
        ConstraintLayoutExtensionsKt.bottomToParent(updateConstraints, badgeView4, i13);
    }
}
