package ru.ozon.app.android.travel.feature.general.order.widgets.travelModalPriceDetailInformation.v4.view;

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
final class PriceDetailInformationPriceView$setupConstraints$1 extends AbstractC7737t implements Function1<d, Unit> {
    final /* synthetic */ PriceDetailInformationPriceView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PriceDetailInformationPriceView$setupConstraints$1(PriceDetailInformationPriceView priceDetailInformationPriceView) {
        super(1);
        this.this$0 = priceDetailInformationPriceView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(d dVar) {
        invoke2(dVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(d applyConstraint) {
        TextAtomV2View text;
        TextAtomV2View text2;
        TextAtomV2View text3;
        TextAtomV2View text4;
        BadgeView badge;
        BadgeView badge2;
        TextAtomV2View text5;
        int i11;
        BadgeView badge3;
        TextAtomV2View text6;
        BadgeView badge4;
        TextAtomV2View text7;
        BadgeView badge5;
        PriceAtomView price;
        int i12;
        PriceAtomView price2;
        PriceAtomView price3;
        PriceAtomView price4;
        Intrinsics.checkNotNullParameter(applyConstraint, "$this$applyConstraint");
        text = this.this$0.getText();
        ConstraintLayoutExtensionsKt.startToParent(applyConstraint, text);
        text2 = this.this$0.getText();
        ConstraintLayoutExtensionsKt.topToParent(applyConstraint, text2);
        text3 = this.this$0.getText();
        ConstraintLayoutExtensionsKt.bottomToParent(applyConstraint, text3);
        text4 = this.this$0.getText();
        badge = this.this$0.getBadge();
        ConstraintLayoutExtensionsKt.endToStart(applyConstraint, text4, badge);
        badge2 = this.this$0.getBadge();
        text5 = this.this$0.getText();
        i11 = this.this$0.dp8;
        ConstraintLayoutExtensionsKt.startToEnd(applyConstraint, badge2, text5, i11);
        badge3 = this.this$0.getBadge();
        text6 = this.this$0.getText();
        ConstraintLayoutExtensionsKt.topToTop(applyConstraint, badge3, text6);
        badge4 = this.this$0.getBadge();
        text7 = this.this$0.getText();
        ConstraintLayoutExtensionsKt.bottomToBottom(applyConstraint, badge4, text7);
        badge5 = this.this$0.getBadge();
        price = this.this$0.getPrice();
        i12 = this.this$0.dp8;
        ConstraintLayoutExtensionsKt.endToStart(applyConstraint, badge5, price, i12);
        price2 = this.this$0.getPrice();
        ConstraintLayoutExtensionsKt.endToParent(applyConstraint, price2);
        price3 = this.this$0.getPrice();
        ConstraintLayoutExtensionsKt.topToParent(applyConstraint, price3);
        price4 = this.this$0.getPrice();
        ConstraintLayoutExtensionsKt.bottomToParent(applyConstraint, price4);
    }
}
