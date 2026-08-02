package ru.ozon.app.android.pdp.widgets.priceBlock.priceCell.presentation;

import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import androidx.core.content.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.pdp.R$drawable;
import ru.ozon.app.android.pdp.R$id;
import ru.ozon.app.android.pdp.databinding.PdpWidgetPriceCellBinding;
import ru.ozon.uni.android.uikit.extensions.ConstraintSetExtKt;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/widget/FrameLayout;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class PriceCellViewHolder$containerGradient$2 extends AbstractC7737t implements Function0<FrameLayout> {
    final /* synthetic */ PriceCellViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PriceCellViewHolder$containerGradient$2(PriceCellViewHolder priceCellViewHolder) {
        super(0);
        this.this$0 = priceCellViewHolder;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final FrameLayout invoke() {
        PdpWidgetPriceCellBinding pdpWidgetPriceCellBinding;
        PdpWidgetPriceCellBinding pdpWidgetPriceCellBinding2;
        FrameLayout frameLayout = new FrameLayout(this.this$0.getContext());
        PriceCellViewHolder priceCellViewHolder = this.this$0;
        frameLayout.setId(R$id.container_price_cell);
        frameLayout.setLayoutParams(new ConstraintLayout.b(0, 0));
        frameLayout.setBackground(a.getDrawable(frameLayout.getContext(), R$drawable.bg_rounded_sale_block_price_cell));
        frameLayout.setClipToOutline(true);
        pdpWidgetPriceCellBinding = priceCellViewHolder.binding;
        pdpWidgetPriceCellBinding.rootContainerCl.addView(frameLayout);
        pdpWidgetPriceCellBinding2 = priceCellViewHolder.binding;
        ConstraintLayout constraintLayout = pdpWidgetPriceCellBinding2.rootContainerCl;
        d d11 = Tl.a.d(constraintLayout, "rootContainerCl", constraintLayout);
        ConstraintSetExtKt.topToTop$default(d11, frameLayout.getId(), 0, 0, 4, null);
        ConstraintSetExtKt.startToStart$default(d11, frameLayout.getId(), 0, 0, 4, null);
        ConstraintSetExtKt.bottomToBottom$default(d11, frameLayout.getId(), 0, 0, 4, null);
        ConstraintSetExtKt.endToEnd$default(d11, frameLayout.getId(), 0, 0, 4, null);
        d11.f(constraintLayout);
        return frameLayout;
    }
}
