package ru.ozon.app.android.pdp.widgets.installmentPurchase.presentation.purchase;

import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.core.content.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.pdp.R$drawable;
import ru.ozon.app.android.pdp.R$id;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/widget/FrameLayout;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class InstallmentPurchaseWidgetViewHolder$containerGradient$2 extends AbstractC7737t implements Function0<FrameLayout> {
    final /* synthetic */ InstallmentPurchaseWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InstallmentPurchaseWidgetViewHolder$containerGradient$2(InstallmentPurchaseWidgetViewHolder installmentPurchaseWidgetViewHolder) {
        super(0);
        this.this$0 = installmentPurchaseWidgetViewHolder;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final FrameLayout invoke() {
        InstallmentPurchaseView installmentPurchaseView;
        InstallmentPurchaseView installmentPurchaseView2;
        FrameLayout frameLayout = new FrameLayout(this.this$0.getContext());
        InstallmentPurchaseWidgetViewHolder installmentPurchaseWidgetViewHolder = this.this$0;
        frameLayout.setId(R$id.container_price_v2);
        installmentPurchaseView = installmentPurchaseWidgetViewHolder.view;
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, installmentPurchaseView.getHeight()));
        frameLayout.setBackground(a.getDrawable(frameLayout.getContext(), R$drawable.bg_rounded_sale_block_price));
        frameLayout.setClipToOutline(true);
        installmentPurchaseView2 = installmentPurchaseWidgetViewHolder.view;
        installmentPurchaseView2.addView(frameLayout);
        return frameLayout;
    }
}
