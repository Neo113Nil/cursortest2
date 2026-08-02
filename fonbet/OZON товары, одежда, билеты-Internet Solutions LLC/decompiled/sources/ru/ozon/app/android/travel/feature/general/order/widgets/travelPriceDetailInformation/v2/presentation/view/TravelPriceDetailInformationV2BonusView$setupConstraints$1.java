package ru.ozon.app.android.travel.feature.general.order.widgets.travelPriceDetailInformation.v2.presentation.view;

import android.view.View;
import androidx.constraintlayout.widget.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.utils.extensions.ConstraintLayoutExtensionsKt;
import ru.ozon.uni.android.uikit.view.atoms.buttons.icons.SmallIconButtonView;
import ru.ozon.uni.android.uikit.view.atoms.price.PriceView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.android.uikitsdk.ext.ConstraintSetExtKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/constraintlayout/widget/d;", "", "invoke", "(Landroidx/constraintlayout/widget/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
final class TravelPriceDetailInformationV2BonusView$setupConstraints$1 extends AbstractC7737t implements Function1<d, Unit> {
    final /* synthetic */ TravelPriceDetailInformationV2BonusView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TravelPriceDetailInformationV2BonusView$setupConstraints$1(TravelPriceDetailInformationV2BonusView travelPriceDetailInformationV2BonusView) {
        super(1);
        this.this$0 = travelPriceDetailInformationV2BonusView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(d dVar) {
        invoke2(dVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(d updateConstraints) {
        TextAtomView title;
        TextAtomView title2;
        TextAtomView title3;
        TextAtomView bonusPrice;
        View view;
        TextAtomView bonusPrice2;
        TextAtomView bonusPrice3;
        TextAtomView title4;
        TextAtomView bonusDetailsTitle;
        SmallIconButtonView bonusDetailsIconButton;
        TextAtomView bonusDetailsTitle2;
        TextAtomView bonusDetailsTitle3;
        TextAtomView priceDetailsTitle;
        SmallIconButtonView bonusDetailsIconButton2;
        TextAtomView bonusDetailsTitle4;
        SmallIconButtonView bonusDetailsIconButton3;
        View view2;
        SmallIconButtonView bonusDetailsIconButton4;
        TextAtomView bonusDetailsTitle5;
        SmallIconButtonView bonusDetailsIconButton5;
        TextAtomView bonusDetailsTitle6;
        View view3;
        View view4;
        View view5;
        View view6;
        TextAtomView title5;
        PriceView price;
        PriceView price2;
        View view7;
        PriceView price3;
        TextAtomView title6;
        TextAtomView priceDetailsTitle2;
        SmallIconButtonView priceDetailsIconButton;
        TextAtomView priceDetailsTitle3;
        PriceView price4;
        TextAtomView priceDetailsTitle4;
        PriceView price5;
        SmallIconButtonView priceDetailsIconButton2;
        TextAtomView priceDetailsTitle5;
        SmallIconButtonView priceDetailsIconButton3;
        SmallIconButtonView priceDetailsIconButton4;
        TextAtomView priceDetailsTitle6;
        SmallIconButtonView priceDetailsIconButton5;
        TextAtomView priceDetailsTitle7;
        Intrinsics.checkNotNullParameter(updateConstraints, "$this$updateConstraints");
        title = this.this$0.getTitle();
        ConstraintSetExtKt.layoutConstraintEndToEndOfParent(updateConstraints, title);
        title2 = this.this$0.getTitle();
        ConstraintSetExtKt.layoutConstraintStartToStartOfParent(updateConstraints, title2);
        title3 = this.this$0.getTitle();
        ConstraintSetExtKt.layoutConstraintTopToTopOfParent(updateConstraints, title3);
        bonusPrice = this.this$0.getBonusPrice();
        view = this.this$0.separator;
        ConstraintSetExtKt.layoutConstraintEndToStartOf(updateConstraints, bonusPrice, view);
        bonusPrice2 = this.this$0.getBonusPrice();
        ConstraintSetExtKt.layoutConstraintStartToStartOfParent(updateConstraints, bonusPrice2);
        bonusPrice3 = this.this$0.getBonusPrice();
        title4 = this.this$0.getTitle();
        ConstraintSetExtKt.layoutConstraintTopToBottomOf(updateConstraints, bonusPrice3, title4);
        bonusDetailsTitle = this.this$0.getBonusDetailsTitle();
        bonusDetailsIconButton = this.this$0.getBonusDetailsIconButton();
        ConstraintSetExtKt.layoutConstraintEndToStartOf(updateConstraints, bonusDetailsTitle, bonusDetailsIconButton);
        bonusDetailsTitle2 = this.this$0.getBonusDetailsTitle();
        ConstraintSetExtKt.layoutConstraintStartToStartOfParent(updateConstraints, bonusDetailsTitle2);
        bonusDetailsTitle3 = this.this$0.getBonusDetailsTitle();
        priceDetailsTitle = this.this$0.getPriceDetailsTitle();
        ConstraintLayoutExtensionsKt.baselineToBaseline(updateConstraints, bonusDetailsTitle3, priceDetailsTitle);
        bonusDetailsIconButton2 = this.this$0.getBonusDetailsIconButton();
        bonusDetailsTitle4 = this.this$0.getBonusDetailsTitle();
        ConstraintSetExtKt.layoutConstraintBottomToBottomOf(updateConstraints, bonusDetailsIconButton2, bonusDetailsTitle4);
        bonusDetailsIconButton3 = this.this$0.getBonusDetailsIconButton();
        view2 = this.this$0.separator;
        ConstraintSetExtKt.layoutConstraintEndToStartOf(updateConstraints, bonusDetailsIconButton3, view2);
        bonusDetailsIconButton4 = this.this$0.getBonusDetailsIconButton();
        bonusDetailsTitle5 = this.this$0.getBonusDetailsTitle();
        ConstraintSetExtKt.layoutConstraintStartToEndOf(updateConstraints, bonusDetailsIconButton4, bonusDetailsTitle5);
        bonusDetailsIconButton5 = this.this$0.getBonusDetailsIconButton();
        bonusDetailsTitle6 = this.this$0.getBonusDetailsTitle();
        ConstraintSetExtKt.layoutConstraintTopToTopOf(updateConstraints, bonusDetailsIconButton5, bonusDetailsTitle6);
        view3 = this.this$0.separator;
        ConstraintSetExtKt.layoutConstraintBottomToBottomOfParent(updateConstraints, view3);
        view4 = this.this$0.separator;
        ConstraintSetExtKt.layoutConstraintEndToEndOfParent(updateConstraints, view4);
        view5 = this.this$0.separator;
        ConstraintSetExtKt.layoutConstraintStartToStartOfParent(updateConstraints, view5);
        view6 = this.this$0.separator;
        title5 = this.this$0.getTitle();
        ConstraintSetExtKt.layoutConstraintTopToBottomOf(updateConstraints, view6, title5);
        price = this.this$0.getPrice();
        ConstraintSetExtKt.layoutConstraintEndToEndOfParent(updateConstraints, price);
        price2 = this.this$0.getPrice();
        view7 = this.this$0.separator;
        ConstraintSetExtKt.layoutConstraintStartToEndOf(updateConstraints, price2, view7);
        price3 = this.this$0.getPrice();
        title6 = this.this$0.getTitle();
        ConstraintSetExtKt.layoutConstraintTopToBottomOf(updateConstraints, price3, title6);
        priceDetailsTitle2 = this.this$0.getPriceDetailsTitle();
        priceDetailsIconButton = this.this$0.getPriceDetailsIconButton();
        ConstraintSetExtKt.layoutConstraintEndToStartOf(updateConstraints, priceDetailsTitle2, priceDetailsIconButton);
        priceDetailsTitle3 = this.this$0.getPriceDetailsTitle();
        price4 = this.this$0.getPrice();
        ConstraintSetExtKt.layoutConstraintStartToStartOf(updateConstraints, priceDetailsTitle3, price4);
        priceDetailsTitle4 = this.this$0.getPriceDetailsTitle();
        price5 = this.this$0.getPrice();
        ConstraintSetExtKt.layoutConstraintTopToBottomOf(updateConstraints, priceDetailsTitle4, price5);
        priceDetailsIconButton2 = this.this$0.getPriceDetailsIconButton();
        priceDetailsTitle5 = this.this$0.getPriceDetailsTitle();
        ConstraintSetExtKt.layoutConstraintBottomToBottomOf(updateConstraints, priceDetailsIconButton2, priceDetailsTitle5);
        priceDetailsIconButton3 = this.this$0.getPriceDetailsIconButton();
        ConstraintSetExtKt.layoutConstraintEndToEndOfParent(updateConstraints, priceDetailsIconButton3);
        priceDetailsIconButton4 = this.this$0.getPriceDetailsIconButton();
        priceDetailsTitle6 = this.this$0.getPriceDetailsTitle();
        ConstraintSetExtKt.layoutConstraintStartToEndOf(updateConstraints, priceDetailsIconButton4, priceDetailsTitle6);
        priceDetailsIconButton5 = this.this$0.getPriceDetailsIconButton();
        priceDetailsTitle7 = this.this$0.getPriceDetailsTitle();
        ConstraintSetExtKt.layoutConstraintTopToTopOf(updateConstraints, priceDetailsIconButton5, priceDetailsTitle7);
    }
}
