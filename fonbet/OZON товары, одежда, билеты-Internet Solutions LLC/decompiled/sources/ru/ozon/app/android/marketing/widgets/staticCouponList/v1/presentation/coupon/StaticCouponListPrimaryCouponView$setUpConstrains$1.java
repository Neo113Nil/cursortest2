package ru.ozon.app.android.marketing.widgets.staticCouponList.v1.presentation.coupon;

import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikitsdk.ext.ConstraintSetExtKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/constraintlayout/widget/d;", "", "invoke", "(Landroidx/constraintlayout/widget/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes12.dex */
final class StaticCouponListPrimaryCouponView$setUpConstrains$1 extends AbstractC7737t implements Function1<d, Unit> {
    final /* synthetic */ StaticCouponListPrimaryCouponView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StaticCouponListPrimaryCouponView$setUpConstrains$1(StaticCouponListPrimaryCouponView staticCouponListPrimaryCouponView) {
        super(1);
        this.this$0 = staticCouponListPrimaryCouponView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(d dVar) {
        invoke2(dVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(d updateConstraints) {
        IconView iconView;
        IconView iconView2;
        IconView iconView3;
        IconView iconView4;
        Barrier barrier;
        TextAtomV2View titleView;
        TextAtomV2View titleView2;
        Barrier barrier2;
        TextAtomV2View titleView3;
        TextAtomV2View subtitleView;
        TextAtomV2View titleView4;
        IconView chevronView;
        TextAtomV2View subtitleView2;
        TextAtomV2View titleView5;
        TextAtomV2View subtitleView3;
        Barrier barrier3;
        TextAtomV2View subtitleView4;
        TextAtomV2View subtitleView5;
        IconView chevronView2;
        TextAtomV2View titleView6;
        IconView chevronView3;
        IconView chevronView4;
        TextAtomV2View subtitleView6;
        IconView chevronView5;
        TextAtomV2View titleView7;
        Intrinsics.checkNotNullParameter(updateConstraints, "$this$updateConstraints");
        iconView = this.this$0.getIconView();
        ConstraintSetExtKt.layoutConstraintTopToTopOfParent(updateConstraints, iconView);
        iconView2 = this.this$0.getIconView();
        ConstraintSetExtKt.layoutConstraintStartToStartOfParent(updateConstraints, iconView2);
        iconView3 = this.this$0.getIconView();
        ConstraintSetExtKt.layoutConstraintBottomToBottomOfParent(updateConstraints, iconView3);
        iconView4 = this.this$0.getIconView();
        barrier = this.this$0.barrier;
        ConstraintSetExtKt.layoutConstraintEndToStartOf(updateConstraints, iconView4, barrier);
        titleView = this.this$0.getTitleView();
        ConstraintSetExtKt.layoutConstraintTopToTopOfParent(updateConstraints, titleView);
        titleView2 = this.this$0.getTitleView();
        barrier2 = this.this$0.barrier;
        ConstraintSetExtKt.layoutConstraintStartToEndOf(updateConstraints, titleView2, barrier2);
        titleView3 = this.this$0.getTitleView();
        subtitleView = this.this$0.getSubtitleView();
        ConstraintSetExtKt.layoutConstraintBottomToTopOf(updateConstraints, titleView3, subtitleView);
        titleView4 = this.this$0.getTitleView();
        chevronView = this.this$0.getChevronView();
        ConstraintSetExtKt.layoutConstraintEndToStartOf(updateConstraints, titleView4, chevronView);
        subtitleView2 = this.this$0.getSubtitleView();
        titleView5 = this.this$0.getTitleView();
        ConstraintSetExtKt.layoutConstraintTopToBottomOf(updateConstraints, subtitleView2, titleView5);
        subtitleView3 = this.this$0.getSubtitleView();
        barrier3 = this.this$0.barrier;
        ConstraintSetExtKt.layoutConstraintStartToEndOf(updateConstraints, subtitleView3, barrier3);
        subtitleView4 = this.this$0.getSubtitleView();
        ConstraintSetExtKt.layoutConstraintBottomToBottomOfParent(updateConstraints, subtitleView4);
        subtitleView5 = this.this$0.getSubtitleView();
        ConstraintSetExtKt.layoutConstraintEndToEndOfParent(updateConstraints, subtitleView5);
        chevronView2 = this.this$0.getChevronView();
        titleView6 = this.this$0.getTitleView();
        ConstraintSetExtKt.layoutConstraintStartToEndOf(updateConstraints, chevronView2, titleView6);
        chevronView3 = this.this$0.getChevronView();
        ConstraintSetExtKt.layoutConstraintEndToEndOfParent(updateConstraints, chevronView3);
        chevronView4 = this.this$0.getChevronView();
        subtitleView6 = this.this$0.getSubtitleView();
        ConstraintSetExtKt.layoutConstraintBottomToTopOf(updateConstraints, chevronView4, subtitleView6);
        chevronView5 = this.this$0.getChevronView();
        titleView7 = this.this$0.getTitleView();
        ConstraintSetExtKt.layoutConstraintTopToTopOf(updateConstraints, chevronView5, titleView7);
    }
}
