package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsScrollPriceCalendar.v2.view;

import androidx.constraintlayout.widget.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.molecules.view.shimmer.RoundedShimmerView;
import ru.ozon.app.android.travel.utils.extensions.ConstraintLayoutExtensionsKt;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.ConstraintSetExtKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/constraintlayout/widget/d;", "", "invoke", "(Landroidx/constraintlayout/widget/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
final class HotelsScrollPriceCalendarV2ItemView$setupConstraints$1 extends AbstractC7737t implements Function1<d, Unit> {
    final /* synthetic */ HotelsScrollPriceCalendarV2ItemView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HotelsScrollPriceCalendarV2ItemView$setupConstraints$1(HotelsScrollPriceCalendarV2ItemView hotelsScrollPriceCalendarV2ItemView) {
        super(1);
        this.this$0 = hotelsScrollPriceCalendarV2ItemView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(d dVar) {
        invoke2(dVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(d updateConstraints) {
        BadgeView badgeView;
        BadgeView badgeView2;
        BadgeView badgeView3;
        BadgeView badgeView4;
        BadgeView badgeView5;
        TextAtomV2View weekdaysIntervalTav;
        TextAtomV2View weekdaysIntervalTav2;
        TextAtomV2View weekdaysIntervalTav3;
        TextAtomV2View weekdaysIntervalTav4;
        TextAtomV2View dateIntervalTav;
        TextAtomV2View dateIntervalTav2;
        TextAtomV2View dateIntervalTav3;
        TextAtomV2View weekdaysIntervalTav5;
        TextAtomV2View dateIntervalTav4;
        TextAtomV2View priceTav;
        TextAtomV2View priceTav2;
        TextAtomV2View priceTav3;
        TextAtomV2View dateIntervalTav5;
        TextAtomV2View priceTav4;
        RoundedShimmerView roundedShimmerView;
        RoundedShimmerView roundedShimmerView2;
        RoundedShimmerView roundedShimmerView3;
        TextAtomV2View dateIntervalTav6;
        RoundedShimmerView roundedShimmerView4;
        RoundedShimmerView roundedShimmerView5;
        Intrinsics.checkNotNullParameter(updateConstraints, "$this$updateConstraints");
        badgeView = this.this$0.getBadgeView();
        ConstraintLayoutExtensionsKt.startToParent(updateConstraints, badgeView);
        badgeView2 = this.this$0.getBadgeView();
        ConstraintLayoutExtensionsKt.endToParent(updateConstraints, badgeView2);
        badgeView3 = this.this$0.getBadgeView();
        ConstraintLayoutExtensionsKt.topToParent(updateConstraints, badgeView3);
        badgeView4 = this.this$0.getBadgeView();
        ConstraintSetExtKt.bottomToTop$default(updateConstraints, badgeView4.getId(), 0, 0, 4, null);
        badgeView5 = this.this$0.getBadgeView();
        updateConstraints.c0(0.0f, badgeView5.getId());
        weekdaysIntervalTav = this.this$0.getWeekdaysIntervalTav();
        ConstraintLayoutExtensionsKt.topToParent(updateConstraints, weekdaysIntervalTav);
        weekdaysIntervalTav2 = this.this$0.getWeekdaysIntervalTav();
        ConstraintLayoutExtensionsKt.startToParent(updateConstraints, weekdaysIntervalTav2);
        weekdaysIntervalTav3 = this.this$0.getWeekdaysIntervalTav();
        ConstraintLayoutExtensionsKt.endToParent(updateConstraints, weekdaysIntervalTav3);
        weekdaysIntervalTav4 = this.this$0.getWeekdaysIntervalTav();
        updateConstraints.c0(0.0f, weekdaysIntervalTav4.getId());
        dateIntervalTav = this.this$0.getDateIntervalTav();
        ConstraintLayoutExtensionsKt.startToParent(updateConstraints, dateIntervalTav);
        dateIntervalTav2 = this.this$0.getDateIntervalTav();
        ConstraintLayoutExtensionsKt.endToParent(updateConstraints, dateIntervalTav2);
        dateIntervalTav3 = this.this$0.getDateIntervalTav();
        weekdaysIntervalTav5 = this.this$0.getWeekdaysIntervalTav();
        ConstraintLayoutExtensionsKt.topToBottom(updateConstraints, dateIntervalTav3, weekdaysIntervalTav5);
        dateIntervalTav4 = this.this$0.getDateIntervalTav();
        updateConstraints.c0(0.0f, dateIntervalTav4.getId());
        priceTav = this.this$0.getPriceTav();
        ConstraintLayoutExtensionsKt.startToParent(updateConstraints, priceTav);
        priceTav2 = this.this$0.getPriceTav();
        ConstraintLayoutExtensionsKt.endToParent(updateConstraints, priceTav2);
        priceTav3 = this.this$0.getPriceTav();
        dateIntervalTav5 = this.this$0.getDateIntervalTav();
        ConstraintLayoutExtensionsKt.topToBottom(updateConstraints, priceTav3, dateIntervalTav5);
        priceTav4 = this.this$0.getPriceTav();
        updateConstraints.c0(0.0f, priceTav4.getId());
        roundedShimmerView = this.this$0.priceShimmer;
        ConstraintLayoutExtensionsKt.startToParent(updateConstraints, roundedShimmerView);
        roundedShimmerView2 = this.this$0.priceShimmer;
        ConstraintLayoutExtensionsKt.endToParent(updateConstraints, roundedShimmerView2);
        roundedShimmerView3 = this.this$0.priceShimmer;
        dateIntervalTav6 = this.this$0.getDateIntervalTav();
        ConstraintLayoutExtensionsKt.topToBottom(updateConstraints, roundedShimmerView3, dateIntervalTav6);
        roundedShimmerView4 = this.this$0.priceShimmer;
        ConstraintLayoutExtensionsKt.bottomToParent(updateConstraints, roundedShimmerView4);
        roundedShimmerView5 = this.this$0.priceShimmer;
        updateConstraints.c0(0.0f, roundedShimmerView5.getId());
    }
}
