package ru.ozon.app.android.fresh.checkout.widgets.checkoutProducts.presentation.recyclerview;

import androidx.constraintlayout.widget.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.fresh.checkout.widgets.checkoutProducts.presentation.recyclerview.CheckoutProductItemView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.ConstraintSetExtKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/constraintlayout/widget/d;", "", "invoke", "(Landroidx/constraintlayout/widget/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes12.dex */
final class CheckoutProductItemView$setupImages$1 extends AbstractC7737t implements Function1<d, Unit> {
    final /* synthetic */ int $imageConstraint;
    final /* synthetic */ CheckoutProductItemView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CheckoutProductItemView$setupImages$1(CheckoutProductItemView checkoutProductItemView, int i11) {
        super(1);
        this.this$0 = checkoutProductItemView;
        this.$imageConstraint = i11;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(d dVar) {
        invoke2(dVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(d updateConstraints) {
        TextAtomV2View textAtomV2View;
        CheckoutProductItemView.Companion companion;
        TextAtomV2View textAtomV2View2;
        CheckoutProductItemView.Companion companion2;
        Intrinsics.checkNotNullParameter(updateConstraints, "$this$updateConstraints");
        textAtomV2View = this.this$0.titleView;
        int id2 = textAtomV2View.getId();
        int i11 = this.$imageConstraint;
        companion = CheckoutProductItemView.Companion;
        ConstraintSetExtKt.endToStart(updateConstraints, id2, i11, companion.getEND_TEXT_MARGIN());
        textAtomV2View2 = this.this$0.subtitleView;
        int id3 = textAtomV2View2.getId();
        int i12 = this.$imageConstraint;
        companion2 = CheckoutProductItemView.Companion;
        ConstraintSetExtKt.endToStart(updateConstraints, id3, i12, companion2.getEND_TEXT_MARGIN());
    }
}
