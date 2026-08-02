package ru.ozon.app.android.pdp.widgets.priceBlock.priceActions.presentation.recycler;

import Cm.e;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.pdp.databinding.PdpItemPriceActionsCellBinding;
import ru.ozon.app.android.pdp.view.animationsaleblock.ViewExtKt;
import ru.ozon.uni.android.uikit.extensions.ConstraintSetExtKt;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/view/View;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class PriceActionItemViewHolder$viewGradient$2 extends AbstractC7737t implements Function0<View> {
    final /* synthetic */ PriceActionItemViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PriceActionItemViewHolder$viewGradient$2(PriceActionItemViewHolder priceActionItemViewHolder) {
        super(0);
        this.this$0 = priceActionItemViewHolder;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final View invoke() {
        PdpItemPriceActionsCellBinding pdpItemPriceActionsCellBinding;
        PdpItemPriceActionsCellBinding pdpItemPriceActionsCellBinding2;
        pdpItemPriceActionsCellBinding = this.this$0.binding;
        ConstraintLayout constraintLayout = pdpItemPriceActionsCellBinding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        View createViewGradient = ViewExtKt.createViewGradient(constraintLayout);
        pdpItemPriceActionsCellBinding2 = this.this$0.binding;
        ConstraintLayout constraintLayout2 = pdpItemPriceActionsCellBinding2.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout2, "getRoot(...)");
        d b11 = e.b(constraintLayout2);
        ConstraintSetExtKt.topToTop$default(b11, createViewGradient.getId(), 0, 0, 4, null);
        ConstraintSetExtKt.endToStart$default(b11, createViewGradient.getId(), 0, 0, 4, null);
        ConstraintSetExtKt.bottomToBottom$default(b11, createViewGradient.getId(), 0, 0, 4, null);
        b11.f(constraintLayout2);
        return createViewGradient;
    }
}
