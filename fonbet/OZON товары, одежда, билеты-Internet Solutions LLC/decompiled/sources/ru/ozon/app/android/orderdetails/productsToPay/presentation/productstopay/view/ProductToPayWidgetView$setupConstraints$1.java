package ru.ozon.app.android.orderdetails.productsToPay.presentation.productstopay.view;

import androidx.constraintlayout.widget.Guideline;
import androidx.constraintlayout.widget.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/constraintlayout/widget/d;", "", "invoke", "(Landroidx/constraintlayout/widget/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes13.dex */
final class ProductToPayWidgetView$setupConstraints$1 extends AbstractC7737t implements Function1<d, Unit> {
    final /* synthetic */ ProductToPayWidgetView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProductToPayWidgetView$setupConstraints$1(ProductToPayWidgetView productToPayWidgetView) {
        super(1);
        this.this$0 = productToPayWidgetView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(d dVar) {
        invoke2(dVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(d updateConstraints) {
        Guideline guideline;
        int i11;
        int i12;
        int i13;
        Guideline guideline2;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        Guideline guideline3;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        Intrinsics.checkNotNullParameter(updateConstraints, "$this$updateConstraints");
        int id2 = this.this$0.getImageView().getId();
        guideline = this.this$0.guidelineTop;
        updateConstraints.s(id2, 3, guideline.getId(), 3);
        int id3 = this.this$0.getImageView().getId();
        i11 = ProductToPayWidgetView.MARGIN_16;
        updateConstraints.t(id3, 6, 0, 6, i11);
        int id4 = this.this$0.getCounterBadgeView().getId();
        int id5 = this.this$0.getImageView().getId();
        i12 = ProductToPayWidgetView.MARGIN_4;
        updateConstraints.t(id4, 6, id5, 6, i12);
        int id6 = this.this$0.getCounterBadgeView().getId();
        int id7 = this.this$0.getImageView().getId();
        i13 = ProductToPayWidgetView.MARGIN_4;
        updateConstraints.t(id6, 4, id7, 4, i13);
        int id8 = this.this$0.getProductImageView().getId();
        guideline2 = this.this$0.guidelineTop;
        updateConstraints.s(id8, 3, guideline2.getId(), 3);
        int id9 = this.this$0.getProductImageView().getId();
        i14 = ProductToPayWidgetView.MARGIN_16;
        updateConstraints.t(id9, 6, 0, 6, i14);
        int id10 = this.this$0.getCheckBoxCutOutView().getId();
        i15 = ProductToPayWidgetView.MARGIN_12;
        updateConstraints.t(id10, 3, 0, 3, i15);
        int id11 = this.this$0.getCheckBoxCutOutView().getId();
        i16 = ProductToPayWidgetView.MARGIN_16;
        updateConstraints.t(id11, 6, 0, 6, i16);
        int id12 = this.this$0.getCheckBox().getId();
        i17 = ProductToPayWidgetView.MARGIN_12;
        updateConstraints.t(id12, 3, 0, 3, i17);
        int id13 = this.this$0.getCheckBox().getId();
        i18 = ProductToPayWidgetView.MARGIN_16;
        updateConstraints.t(id13, 6, 0, 6, i18);
        updateConstraints.s(this.this$0.getTitleLayout().getId(), 6, this.this$0.getImageBarrier().getId(), 7);
        int id14 = this.this$0.getTitleLayout().getId();
        i19 = ProductToPayWidgetView.MARGIN_16;
        updateConstraints.t(id14, 7, 0, 7, i19);
        int id15 = this.this$0.getTitleLayout().getId();
        guideline3 = this.this$0.guidelineTop;
        updateConstraints.s(id15, 3, guideline3.getId(), 3);
        updateConstraints.s(this.this$0.getTitleLayout().getId(), 4, this.this$0.getSubtitleView().getId(), 3);
        updateConstraints.s(this.this$0.getSubtitleView().getId(), 6, this.this$0.getImageBarrier().getId(), 7);
        int id16 = this.this$0.getSubtitleView().getId();
        i21 = ProductToPayWidgetView.MARGIN_16;
        updateConstraints.t(id16, 7, 0, 7, i21);
        int id17 = this.this$0.getSubtitleView().getId();
        int id18 = this.this$0.getTitleLayout().getId();
        i22 = ProductToPayWidgetView.MARGIN_2;
        updateConstraints.t(id17, 3, id18, 4, i22);
        updateConstraints.s(this.this$0.getSubtitleView().getId(), 4, this.this$0.getCaptionView().getId(), 3);
        updateConstraints.s(this.this$0.getCaptionView().getId(), 6, this.this$0.getImageBarrier().getId(), 7);
        int id19 = this.this$0.getCaptionView().getId();
        i23 = ProductToPayWidgetView.MARGIN_16;
        updateConstraints.t(id19, 7, 0, 7, i23);
        int id20 = this.this$0.getCaptionView().getId();
        int id21 = this.this$0.getSubtitleView().getId();
        i24 = ProductToPayWidgetView.MARGIN_2;
        updateConstraints.t(id20, 3, id21, 4, i24);
        updateConstraints.s(this.this$0.getCaptionView().getId(), 4, this.this$0.getMinusIconButton().getId(), 3);
        updateConstraints.s(this.this$0.getMinusIconButton().getId(), 6, this.this$0.getImageBarrier().getId(), 7);
        int id22 = this.this$0.getMinusIconButton().getId();
        int id23 = this.this$0.getCaptionView().getId();
        i25 = ProductToPayWidgetView.MARGIN_8;
        updateConstraints.t(id22, 3, id23, 4, i25);
        updateConstraints.s(this.this$0.getMinusIconButton().getId(), 4, this.this$0.getBadgeView().getId(), 3);
        int id24 = this.this$0.getCountValueTextAtom().getId();
        int id25 = this.this$0.getMinusIconButton().getId();
        i26 = ProductToPayWidgetView.MARGIN_4;
        updateConstraints.t(id24, 6, id25, 7, i26);
        updateConstraints.s(this.this$0.getCountValueTextAtom().getId(), 3, this.this$0.getMinusIconButton().getId(), 3);
        updateConstraints.s(this.this$0.getCountValueTextAtom().getId(), 4, this.this$0.getMinusIconButton().getId(), 4);
        int id26 = this.this$0.getPlusIconButton().getId();
        int id27 = this.this$0.getCountValueTextAtom().getId();
        i27 = ProductToPayWidgetView.MARGIN_4;
        updateConstraints.t(id26, 6, id27, 7, i27);
        updateConstraints.s(this.this$0.getPlusIconButton().getId(), 3, this.this$0.getMinusIconButton().getId(), 3);
        updateConstraints.s(this.this$0.getBadgeView().getId(), 6, this.this$0.getImageBarrier().getId(), 6);
        int id28 = this.this$0.getBadgeView().getId();
        int id29 = this.this$0.getMinusIconButton().getId();
        i28 = ProductToPayWidgetView.MARGIN_8;
        updateConstraints.t(id28, 3, id29, 4, i28);
        updateConstraints.s(this.this$0.getBadgeView().getId(), 4, 0, 4);
    }
}
