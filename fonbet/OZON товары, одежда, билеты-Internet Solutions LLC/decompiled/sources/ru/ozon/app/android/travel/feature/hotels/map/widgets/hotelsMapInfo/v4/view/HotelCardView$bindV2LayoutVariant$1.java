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
final class HotelCardView$bindV2LayoutVariant$1 extends AbstractC7737t implements Function1<d, Unit> {
    final /* synthetic */ boolean $hasPrice;
    final /* synthetic */ HotelCardView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HotelCardView$bindV2LayoutVariant$1(HotelCardView hotelCardView, boolean z11) {
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
        TextAtomV2View textAtomV2View;
        PriceAtomView priceAtomView2;
        BadgeView badgeView;
        BadgeView badgeView2;
        BadgeView badgeView3;
        TextAtomV2View textAtomV2View2;
        BadgeView badgeView4;
        int i11;
        BadgeView badgeView5;
        int i12;
        TextAtomV2View textAtomV2View3;
        TextAtomV2View textAtomV2View4;
        TextAtomV2View textAtomV2View5;
        TextAtomV2View textAtomV2View6;
        int i13;
        TextAtomV2View textAtomV2View7;
        int i14;
        TextAtomV2View textAtomV2View8;
        TextAtomV2View textAtomV2View9;
        BadgeView badgeView6;
        PriceAtomView priceAtomView3;
        int i15;
        BadgeView badgeView7;
        PriceAtomView priceAtomView4;
        BadgeView badgeView8;
        PriceAtomView priceAtomView5;
        Intrinsics.checkNotNullParameter(updateConstraints, "$this$updateConstraints");
        priceAtomView = this.this$0.hotelsMapInfoV4CardPricePav;
        textAtomV2View = this.this$0.hotelsMapInfoV4CardPriceTav;
        ConstraintLayoutExtensionsKt.bottomToTop(updateConstraints, priceAtomView, textAtomV2View);
        priceAtomView2 = this.this$0.hotelsMapInfoV4CardPricePav;
        badgeView = this.this$0.hotelsMapInfoV4CardMilesBv;
        ConstraintLayoutExtensionsKt.endToStart(updateConstraints, priceAtomView2, badgeView);
        badgeView2 = this.this$0.hotelsMapInfoV4CardMilesBv;
        ConstraintLayoutExtensionsKt.clear(updateConstraints, badgeView2);
        if (this.$hasPrice) {
            badgeView6 = this.this$0.hotelsMapInfoV4CardMilesBv;
            priceAtomView3 = this.this$0.hotelsMapInfoV4CardPricePav;
            i15 = this.this$0.dp10;
            ConstraintLayoutExtensionsKt.startToEnd(updateConstraints, badgeView6, priceAtomView3, i15);
            badgeView7 = this.this$0.hotelsMapInfoV4CardMilesBv;
            priceAtomView4 = this.this$0.hotelsMapInfoV4CardPricePav;
            ConstraintLayoutExtensionsKt.topToTop(updateConstraints, badgeView7, priceAtomView4);
            badgeView8 = this.this$0.hotelsMapInfoV4CardMilesBv;
            priceAtomView5 = this.this$0.hotelsMapInfoV4CardPricePav;
            ConstraintLayoutExtensionsKt.bottomToBottom(updateConstraints, badgeView8, priceAtomView5);
        } else {
            badgeView3 = this.this$0.hotelsMapInfoV4CardMilesBv;
            textAtomV2View2 = this.this$0.hotelsMapInfoV4CardTitleTav;
            ConstraintLayoutExtensionsKt.startToStart(updateConstraints, badgeView3, textAtomV2View2);
            badgeView4 = this.this$0.hotelsMapInfoV4CardMilesBv;
            i11 = this.this$0.dp6;
            ConstraintLayoutExtensionsKt.bottomToParent(updateConstraints, badgeView4, i11);
        }
        badgeView5 = this.this$0.hotelsMapInfoV4CardMilesBv;
        i12 = this.this$0.dp6;
        ConstraintLayoutExtensionsKt.endToParent(updateConstraints, badgeView5, i12);
        textAtomV2View3 = this.this$0.hotelsMapInfoV4CardPriceTav;
        ConstraintLayoutExtensionsKt.clear(updateConstraints, textAtomV2View3);
        textAtomV2View4 = this.this$0.hotelsMapInfoV4CardPriceTav;
        textAtomV2View5 = this.this$0.hotelsMapInfoV4CardTitleTav;
        ConstraintLayoutExtensionsKt.startToStart(updateConstraints, textAtomV2View4, textAtomV2View5);
        textAtomV2View6 = this.this$0.hotelsMapInfoV4CardPriceTav;
        i13 = this.this$0.dp6;
        ConstraintLayoutExtensionsKt.endToParent(updateConstraints, textAtomV2View6, i13);
        textAtomV2View7 = this.this$0.hotelsMapInfoV4CardPriceTav;
        i14 = this.this$0.dp6;
        ConstraintLayoutExtensionsKt.bottomToParent(updateConstraints, textAtomV2View7, i14);
        textAtomV2View8 = this.this$0.hotelsMapInfoV4CardPriceTav;
        updateConstraints.C(textAtomV2View8.getId(), true);
        textAtomV2View9 = this.this$0.hotelsMapInfoV4CardPriceTav;
        updateConstraints.c0(0.0f, textAtomV2View9.getId());
    }
}
