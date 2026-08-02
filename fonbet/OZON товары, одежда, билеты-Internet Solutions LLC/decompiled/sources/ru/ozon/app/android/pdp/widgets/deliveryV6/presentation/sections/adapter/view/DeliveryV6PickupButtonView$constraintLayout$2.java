package ru.ozon.app.android.pdp.widgets.deliveryV6.presentation.sections.adapter.view;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.pdp.R$id;
import ru.ozon.app.android.pdp.widgets.sellerV4.presentation.SellerV4DisclosureViewFactory;
import ru.ozon.app.android.uikit.view.discount.ProgressiveDiscountViewKt;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikitsdk.ext.ConstraintLayoutExtKt;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/constraintlayout/widget/ConstraintLayout;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class DeliveryV6PickupButtonView$constraintLayout$2 extends AbstractC7737t implements Function0<ConstraintLayout> {
    final /* synthetic */ Context $context;
    final /* synthetic */ DeliveryV6PickupButtonView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DeliveryV6PickupButtonView$constraintLayout$2(Context context, DeliveryV6PickupButtonView deliveryV6PickupButtonView) {
        super(0);
        this.$context = context;
        this.this$0 = deliveryV6PickupButtonView;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final ConstraintLayout invoke() {
        TextAtomV2View pickupButtonTitle;
        TextAtomV2View pickupButtonSubtitle;
        TextAtomV2View pickupButtonBadge;
        ImageView pickupButtonIcon;
        ConstraintLayout constraintLayout = new ConstraintLayout(this.$context);
        DeliveryV6PickupButtonView deliveryV6PickupButtonView = this.this$0;
        constraintLayout.setId(R$id.deliveryV6SectionPickupCL);
        constraintLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        SellerV4DisclosureViewFactory sellerV4DisclosureViewFactory = SellerV4DisclosureViewFactory.INSTANCE;
        constraintLayout.setPadding(sellerV4DisclosureViewFactory.getDp16(), ProgressiveDiscountViewKt.getDp8(), sellerV4DisclosureViewFactory.getDp16(), ProgressiveDiscountViewKt.getDp8());
        pickupButtonTitle = deliveryV6PickupButtonView.getPickupButtonTitle();
        constraintLayout.addView(pickupButtonTitle);
        pickupButtonSubtitle = deliveryV6PickupButtonView.getPickupButtonSubtitle();
        constraintLayout.addView(pickupButtonSubtitle);
        pickupButtonBadge = deliveryV6PickupButtonView.getPickupButtonBadge();
        constraintLayout.addView(pickupButtonBadge);
        pickupButtonIcon = deliveryV6PickupButtonView.getPickupButtonIcon();
        constraintLayout.addView(pickupButtonIcon);
        ConstraintLayoutExtKt.updateConstraints(constraintLayout, new DeliveryV6PickupButtonView$constraintLayout$2$1$1(deliveryV6PickupButtonView));
        return constraintLayout;
    }
}
