package ru.ozon.app.android.travel.feature.avia.widgets.servicePackageSelection.view;

import androidx.constraintlayout.widget.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.price.ui.PriceAtomView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikitsdk.ext.ConstraintSetExtKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/constraintlayout/widget/d;", "", "invoke", "(Landroidx/constraintlayout/widget/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes12.dex */
final class ServicePackageView$setupConstraints$1 extends AbstractC7737t implements Function1<d, Unit> {
    final /* synthetic */ ServicePackageView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ServicePackageView$setupConstraints$1(ServicePackageView servicePackageView) {
        super(1);
        this.this$0 = servicePackageView;
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
        IconView iconView;
        IconView iconView2;
        IconView iconView3;
        TextAtomV2View textAtomV2View;
        IconView iconView4;
        TextAtomV2View textAtomV2View2;
        TextAtomV2View textAtomV2View3;
        TextAtomV2View textAtomV2View4;
        PriceAtomView priceAtomView;
        PriceAtomView priceAtomView2;
        PriceAtomView priceAtomView3;
        PriceAtomView priceAtomView4;
        Intrinsics.checkNotNullParameter(updateConstraints, "$this$updateConstraints");
        badgeView = this.this$0.discountBadgeView;
        ConstraintSetExtKt.layoutConstraintStartToStartOfParent(updateConstraints, badgeView);
        badgeView2 = this.this$0.discountBadgeView;
        ConstraintSetExtKt.layoutConstraintEndToEndOfParent(updateConstraints, badgeView2);
        badgeView3 = this.this$0.discountBadgeView;
        ConstraintSetExtKt.layoutConstraintTopToTopOfParent(updateConstraints, badgeView3);
        badgeView4 = this.this$0.discountBadgeView;
        ConstraintSetExtKt.layoutConstraintBottomToTopOf(updateConstraints, badgeView4.getId(), 0);
        iconView = this.this$0.iconView;
        ConstraintSetExtKt.layoutConstraintTopToTopOfParent(updateConstraints, iconView);
        iconView2 = this.this$0.iconView;
        ConstraintSetExtKt.layoutConstraintStartToStartOfParent(updateConstraints, iconView2);
        iconView3 = this.this$0.iconView;
        ConstraintSetExtKt.layoutConstraintEndToEndOfParent(updateConstraints, iconView3);
        textAtomV2View = this.this$0.titleView;
        iconView4 = this.this$0.iconView;
        ConstraintSetExtKt.layoutConstraintTopToBottomOf(updateConstraints, textAtomV2View, iconView4);
        textAtomV2View2 = this.this$0.titleView;
        ConstraintSetExtKt.layoutConstraintStartToStartOfParent(updateConstraints, textAtomV2View2);
        textAtomV2View3 = this.this$0.titleView;
        ConstraintSetExtKt.layoutConstraintEndToEndOfParent(updateConstraints, textAtomV2View3);
        textAtomV2View4 = this.this$0.titleView;
        priceAtomView = this.this$0.priceView;
        ConstraintSetExtKt.layoutConstraintBottomToTopOf(updateConstraints, textAtomV2View4, priceAtomView);
        priceAtomView2 = this.this$0.priceView;
        ConstraintSetExtKt.layoutConstraintStartToStartOfParent(updateConstraints, priceAtomView2);
        priceAtomView3 = this.this$0.priceView;
        ConstraintSetExtKt.layoutConstraintEndToEndOfParent(updateConstraints, priceAtomView3);
        priceAtomView4 = this.this$0.priceView;
        ConstraintSetExtKt.layoutConstraintBottomToBottomOfParent(updateConstraints, priceAtomView4);
    }
}
