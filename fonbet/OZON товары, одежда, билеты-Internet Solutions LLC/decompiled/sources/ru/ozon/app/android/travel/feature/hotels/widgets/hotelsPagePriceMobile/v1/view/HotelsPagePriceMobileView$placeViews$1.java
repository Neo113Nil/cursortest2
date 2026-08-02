package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsPagePriceMobile.v1.view;

import androidx.constraintlayout.widget.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.molecules.view.starsBadge.v1.StarsBadgeView;
import ru.ozon.app.android.travel.utils.extensions.ConstraintLayoutExtensionsKt;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.price.ui.PriceAtomView;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/constraintlayout/widget/d;", "", "invoke", "(Landroidx/constraintlayout/widget/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
final class HotelsPagePriceMobileView$placeViews$1 extends AbstractC7737t implements Function1<d, Unit> {
    final /* synthetic */ HotelsPagePriceMobileView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HotelsPagePriceMobileView$placeViews$1(HotelsPagePriceMobileView hotelsPagePriceMobileView) {
        super(1);
        this.this$0 = hotelsPagePriceMobileView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(d dVar) {
        invoke2(dVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(d updateConstraints) {
        PriceAtomView priceView;
        int i11;
        PriceAtomView priceView2;
        StarsBadgeView starsBadgeView;
        PriceAtomView priceView3;
        BadgeView bankBadgeView;
        BadgeView bankBadgeView2;
        PriceAtomView priceView4;
        BadgeView bankBadgeView3;
        BadgeView nightsCountBadgeView;
        BadgeView bankBadgeView4;
        BadgeView nightsCountBadgeView2;
        BadgeView starsDetailInfoBadgeView;
        BadgeView nightsCountBadgeView3;
        BadgeView bankBadgeView5;
        BadgeView nightsCountBadgeView4;
        BadgeView bankBadgeView6;
        StarsBadgeView starsBadgeView2;
        int i12;
        StarsBadgeView starsBadgeView3;
        PriceAtomView priceView5;
        StarsBadgeView starsBadgeView4;
        PriceAtomView priceView6;
        BadgeView starsDetailInfoBadgeView2;
        BadgeView starsDetailInfoBadgeView3;
        StarsBadgeView starsBadgeView5;
        int i13;
        Intrinsics.checkNotNullParameter(updateConstraints, "$this$updateConstraints");
        priceView = this.this$0.getPriceView();
        i11 = this.this$0.dp6;
        ConstraintLayoutExtensionsKt.startToParent(updateConstraints, priceView, i11);
        priceView2 = this.this$0.getPriceView();
        starsBadgeView = this.this$0.starsBadgeView;
        ConstraintLayoutExtensionsKt.endToStart(updateConstraints, priceView2, starsBadgeView);
        priceView3 = this.this$0.getPriceView();
        ConstraintLayoutExtensionsKt.topToParent(updateConstraints, priceView3);
        bankBadgeView = this.this$0.getBankBadgeView();
        ConstraintLayoutExtensionsKt.startToParent(updateConstraints, bankBadgeView);
        bankBadgeView2 = this.this$0.getBankBadgeView();
        priceView4 = this.this$0.getPriceView();
        ConstraintLayoutExtensionsKt.topToBottom(updateConstraints, bankBadgeView2, priceView4);
        bankBadgeView3 = this.this$0.getBankBadgeView();
        ConstraintLayoutExtensionsKt.bottomToParent(updateConstraints, bankBadgeView3);
        nightsCountBadgeView = this.this$0.getNightsCountBadgeView();
        bankBadgeView4 = this.this$0.getBankBadgeView();
        ConstraintLayoutExtensionsKt.startToEnd(updateConstraints, nightsCountBadgeView, bankBadgeView4);
        nightsCountBadgeView2 = this.this$0.getNightsCountBadgeView();
        starsDetailInfoBadgeView = this.this$0.getStarsDetailInfoBadgeView();
        ConstraintLayoutExtensionsKt.endToStart(updateConstraints, nightsCountBadgeView2, starsDetailInfoBadgeView);
        nightsCountBadgeView3 = this.this$0.getNightsCountBadgeView();
        bankBadgeView5 = this.this$0.getBankBadgeView();
        ConstraintLayoutExtensionsKt.topToTop(updateConstraints, nightsCountBadgeView3, bankBadgeView5);
        nightsCountBadgeView4 = this.this$0.getNightsCountBadgeView();
        bankBadgeView6 = this.this$0.getBankBadgeView();
        ConstraintLayoutExtensionsKt.bottomToBottom(updateConstraints, nightsCountBadgeView4, bankBadgeView6);
        starsBadgeView2 = this.this$0.starsBadgeView;
        i12 = this.this$0.dp6;
        ConstraintLayoutExtensionsKt.endToParent(updateConstraints, starsBadgeView2, i12);
        starsBadgeView3 = this.this$0.starsBadgeView;
        priceView5 = this.this$0.getPriceView();
        ConstraintLayoutExtensionsKt.topToTop(updateConstraints, starsBadgeView3, priceView5);
        starsBadgeView4 = this.this$0.starsBadgeView;
        priceView6 = this.this$0.getPriceView();
        ConstraintLayoutExtensionsKt.bottomToBottom(updateConstraints, starsBadgeView4, priceView6);
        starsDetailInfoBadgeView2 = this.this$0.getStarsDetailInfoBadgeView();
        ConstraintLayoutExtensionsKt.endToParent(updateConstraints, starsDetailInfoBadgeView2);
        starsDetailInfoBadgeView3 = this.this$0.getStarsDetailInfoBadgeView();
        starsBadgeView5 = this.this$0.starsBadgeView;
        i13 = this.this$0.dp2;
        ConstraintLayoutExtensionsKt.topToBottom(updateConstraints, starsDetailInfoBadgeView3, starsBadgeView5, i13);
    }
}
