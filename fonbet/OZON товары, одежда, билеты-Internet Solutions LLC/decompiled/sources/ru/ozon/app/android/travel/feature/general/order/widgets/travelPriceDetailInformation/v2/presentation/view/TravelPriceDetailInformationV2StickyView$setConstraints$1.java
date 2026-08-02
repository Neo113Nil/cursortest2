package ru.ozon.app.android.travel.feature.general.order.widgets.travelPriceDetailInformation.v2.presentation.view;

import androidx.constraintlayout.widget.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.utils.extensions.ConstraintLayoutExtensionsKt;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.v3.containers.SingleAtom;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/constraintlayout/widget/d;", "", "invoke", "(Landroidx/constraintlayout/widget/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
final class TravelPriceDetailInformationV2StickyView$setConstraints$1 extends AbstractC7737t implements Function1<d, Unit> {
    final /* synthetic */ TravelPriceDetailInformationV2StickyView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TravelPriceDetailInformationV2StickyView$setConstraints$1(TravelPriceDetailInformationV2StickyView travelPriceDetailInformationV2StickyView) {
        super(1);
        this.this$0 = travelPriceDetailInformationV2StickyView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(d dVar) {
        invoke2(dVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(d applyConstraint) {
        TextAtomView title;
        SingleAtom button;
        TextAtomView title2;
        TextAtomView title3;
        TextAtomView price;
        TextAtomView title4;
        SingleAtom button2;
        TextAtomView price2;
        SingleAtom button3;
        TextAtomView price3;
        TextAtomView price4;
        TextAtomView title5;
        TextAtomView price5;
        SingleAtom button4;
        SingleAtom button5;
        SingleAtom button6;
        SingleAtom button7;
        Intrinsics.checkNotNullParameter(applyConstraint, "$this$applyConstraint");
        title = this.this$0.getTitle();
        button = this.this$0.getButton();
        ConstraintLayoutExtensionsKt.endToStart(applyConstraint, title, button);
        title2 = this.this$0.getTitle();
        ConstraintLayoutExtensionsKt.startToParent(applyConstraint, title2);
        title3 = this.this$0.getTitle();
        price = this.this$0.getPrice();
        ConstraintLayoutExtensionsKt.bottomToTop(applyConstraint, title3, price);
        title4 = this.this$0.getTitle();
        button2 = this.this$0.getButton();
        ConstraintLayoutExtensionsKt.topToTop(applyConstraint, title4, button2);
        price2 = this.this$0.getPrice();
        button3 = this.this$0.getButton();
        ConstraintLayoutExtensionsKt.endToStart(applyConstraint, price2, button3);
        price3 = this.this$0.getPrice();
        ConstraintLayoutExtensionsKt.startToParent(applyConstraint, price3);
        price4 = this.this$0.getPrice();
        title5 = this.this$0.getTitle();
        ConstraintLayoutExtensionsKt.topToBottom(applyConstraint, price4, title5);
        price5 = this.this$0.getPrice();
        button4 = this.this$0.getButton();
        ConstraintLayoutExtensionsKt.bottomToBottom(applyConstraint, price5, button4);
        button5 = this.this$0.getButton();
        ConstraintLayoutExtensionsKt.topToParent(applyConstraint, button5);
        button6 = this.this$0.getButton();
        ConstraintLayoutExtensionsKt.bottomToParent(applyConstraint, button6);
        button7 = this.this$0.getButton();
        ConstraintLayoutExtensionsKt.endToParent(applyConstraint, button7);
    }
}
