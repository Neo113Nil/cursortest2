package ru.ozon.app.android.travel.feature.general.order.widgets.travelModalPriceDetailInformation.v4.view;

import androidx.constraintlayout.widget.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.android.atom.price.ui.PriceAtomView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikitsdk.ext.ConstraintSetExtKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/constraintlayout/widget/d;", "", "invoke", "(Landroidx/constraintlayout/widget/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
final class PriceDetailInformationSectionView$setupConstraints$1 extends AbstractC7737t implements Function1<d, Unit> {
    final /* synthetic */ PriceDetailInformationSectionView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PriceDetailInformationSectionView$setupConstraints$1(PriceDetailInformationSectionView priceDetailInformationSectionView) {
        super(1);
        this.this$0 = priceDetailInformationSectionView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(d dVar) {
        invoke2(dVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(d updateConstraints) {
        TextAtomV2View title;
        PriceAtomView totalPrice;
        TextAtomV2View title2;
        TextAtomV2View title3;
        TextAtomV2View subtitle;
        TextAtomV2View subtitle2;
        TextAtomV2View subtitle3;
        TextAtomV2View title4;
        PriceAtomView totalPrice2;
        PriceAtomView totalPrice3;
        Intrinsics.checkNotNullParameter(updateConstraints, "$this$updateConstraints");
        title = this.this$0.getTitle();
        totalPrice = this.this$0.getTotalPrice();
        ConstraintSetExtKt.layoutConstraintEndToStartOf(updateConstraints, title, totalPrice);
        title2 = this.this$0.getTitle();
        ConstraintSetExtKt.layoutConstraintStartToStartOfParent(updateConstraints, title2);
        title3 = this.this$0.getTitle();
        ConstraintSetExtKt.layoutConstraintTopToTopOfParent(updateConstraints, title3);
        subtitle = this.this$0.getSubtitle();
        ConstraintSetExtKt.layoutConstraintEndToEndOfParent(updateConstraints, subtitle);
        subtitle2 = this.this$0.getSubtitle();
        ConstraintSetExtKt.layoutConstraintStartToStartOfParent(updateConstraints, subtitle2);
        subtitle3 = this.this$0.getSubtitle();
        title4 = this.this$0.getTitle();
        ConstraintSetExtKt.layoutConstraintTopToBottomOf(updateConstraints, subtitle3, title4);
        totalPrice2 = this.this$0.getTotalPrice();
        ConstraintSetExtKt.layoutConstraintEndToEndOfParent(updateConstraints, totalPrice2);
        totalPrice3 = this.this$0.getTotalPrice();
        ConstraintSetExtKt.layoutConstraintTopToTopOfParent(updateConstraints, totalPrice3);
    }
}
