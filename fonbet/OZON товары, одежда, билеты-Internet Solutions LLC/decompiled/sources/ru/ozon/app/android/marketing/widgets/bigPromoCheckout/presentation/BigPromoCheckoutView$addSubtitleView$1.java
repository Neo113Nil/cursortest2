package ru.ozon.app.android.marketing.widgets.bigPromoCheckout.presentation;

import androidx.constraintlayout.widget.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.marketing.widgets.bigPromoCheckout.presentation.BigPromoCheckoutView;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.ConstraintSetExtKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/constraintlayout/widget/d;", "", "invoke", "(Landroidx/constraintlayout/widget/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes12.dex */
final class BigPromoCheckoutView$addSubtitleView$1 extends AbstractC7737t implements Function1<d, Unit> {
    final /* synthetic */ BigPromoCheckoutView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BigPromoCheckoutView$addSubtitleView$1(BigPromoCheckoutView bigPromoCheckoutView) {
        super(1);
        this.this$0 = bigPromoCheckoutView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(d dVar) {
        invoke2(dVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(d updateConstraints) {
        TextAtomV2View textAtomV2View;
        IconView iconView;
        BigPromoCheckoutView.Companion companion;
        TextAtomV2View textAtomV2View2;
        TextAtomV2View textAtomV2View3;
        BigPromoCheckoutView.Companion companion2;
        TextAtomV2View textAtomV2View4;
        BigPromoCheckoutView.Companion companion3;
        TextAtomV2View textAtomV2View5;
        Intrinsics.checkNotNullParameter(updateConstraints, "$this$updateConstraints");
        textAtomV2View = this.this$0.subtitleView;
        int id2 = textAtomV2View.getId();
        iconView = this.this$0.iconView;
        int id3 = iconView.getId();
        companion = BigPromoCheckoutView.Companion;
        ConstraintSetExtKt.startToEnd(updateConstraints, id2, id3, companion.getDP_8());
        textAtomV2View2 = this.this$0.subtitleView;
        int id4 = textAtomV2View2.getId();
        textAtomV2View3 = this.this$0.titleView;
        int id5 = textAtomV2View3.getId();
        companion2 = BigPromoCheckoutView.Companion;
        ConstraintSetExtKt.topToBottom(updateConstraints, id4, id5, companion2.getDP_2());
        textAtomV2View4 = this.this$0.subtitleView;
        int id6 = textAtomV2View4.getId();
        int id7 = this.this$0.getTimerView().getId();
        companion3 = BigPromoCheckoutView.Companion;
        ConstraintSetExtKt.endToStart(updateConstraints, id6, id7, companion3.getDP_8());
        textAtomV2View5 = this.this$0.subtitleView;
        updateConstraints.C(textAtomV2View5.getId(), true);
    }
}
