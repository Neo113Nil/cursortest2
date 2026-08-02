package ru.ozon.app.android.fresh.unsorted.widgets.productsInBot.v2.presentation.item;

import androidx.constraintlayout.widget.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.fresh.unsorted.databinding.ReturnItemViewBinding;
import ru.ozon.uni.android.uikit.extensions.ConstraintSetExtKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/constraintlayout/widget/d;", "", "invoke", "(Landroidx/constraintlayout/widget/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes12.dex */
final class ProductsInBotV2ItemView$setupConstraints$2 extends AbstractC7737t implements Function1<d, Unit> {
    final /* synthetic */ ProductsInBotV2ItemView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProductsInBotV2ItemView$setupConstraints$2(ProductsInBotV2ItemView productsInBotV2ItemView) {
        super(1);
        this.this$0 = productsInBotV2ItemView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(d dVar) {
        invoke2(dVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(d updateConstraints) {
        ReturnItemViewBinding returnItemViewBinding;
        ReturnItemViewBinding returnItemViewBinding2;
        ReturnItemViewBinding returnItemViewBinding3;
        ReturnItemViewBinding returnItemViewBinding4;
        Intrinsics.checkNotNullParameter(updateConstraints, "$this$updateConstraints");
        returnItemViewBinding = this.this$0.binding;
        int id2 = returnItemViewBinding.nameTv.getId();
        returnItemViewBinding2 = this.this$0.binding;
        ConstraintSetExtKt.bottomToBottom$default(updateConstraints, id2, returnItemViewBinding2.productIconView.getId(), 0, 4, null);
        returnItemViewBinding3 = this.this$0.binding;
        int id3 = returnItemViewBinding3.priceView.getId();
        returnItemViewBinding4 = this.this$0.binding;
        ConstraintSetExtKt.bottomToTop$default(updateConstraints, id3, returnItemViewBinding4.nameTv.getId(), 0, 4, null);
    }
}
