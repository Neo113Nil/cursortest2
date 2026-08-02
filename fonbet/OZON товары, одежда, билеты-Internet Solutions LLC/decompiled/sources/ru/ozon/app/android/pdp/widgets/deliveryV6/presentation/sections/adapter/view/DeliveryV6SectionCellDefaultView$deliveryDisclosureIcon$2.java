package ru.ozon.app.android.pdp.widgets.deliveryV6.presentation.sections.adapter.view;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.pdp.R$id;
import ru.ozon.app.android.pdp.widgets.sellerV4.presentation.SellerV4DisclosureViewFactory;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/widget/ImageView;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class DeliveryV6SectionCellDefaultView$deliveryDisclosureIcon$2 extends AbstractC7737t implements Function0<ImageView> {
    final /* synthetic */ Context $context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DeliveryV6SectionCellDefaultView$deliveryDisclosureIcon$2(Context context) {
        super(0);
        this.$context = context;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final ImageView invoke() {
        ImageView imageView = new ImageView(this.$context);
        imageView.setId(R$id.deliveryV6SectionCellDefaultIcon);
        SellerV4DisclosureViewFactory sellerV4DisclosureViewFactory = SellerV4DisclosureViewFactory.INSTANCE;
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(sellerV4DisclosureViewFactory.getDp16(), sellerV4DisclosureViewFactory.getDp16());
        marginLayoutParams.setMarginEnd(sellerV4DisclosureViewFactory.getDp16());
        imageView.setLayoutParams(marginLayoutParams);
        return imageView;
    }
}
