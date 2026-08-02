package ru.ozon.app.android.pdp.widgets.deliveryV6.presentation.sections.adapter.view;

import android.content.Context;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.pdp.R$id;
import ru.ozon.app.android.pdp.widgets.sellerV4.presentation.SellerV4DisclosureViewFactory;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class DeliveryV6SectionHeaderView$deliveryVariantTitle$2 extends AbstractC7737t implements Function0<TextAtomV2View> {
    final /* synthetic */ Context $context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DeliveryV6SectionHeaderView$deliveryVariantTitle$2(Context context) {
        super(0);
        this.$context = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final TextAtomV2View invoke() {
        TextAtomV2View textAtomV2View = new TextAtomV2View(this.$context, null, 0, 6, null);
        textAtomV2View.setId(R$id.deliveryV6SectionHeaderTitle);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2, 1.0f);
        SellerV4DisclosureViewFactory sellerV4DisclosureViewFactory = SellerV4DisclosureViewFactory.INSTANCE;
        layoutParams.leftMargin = sellerV4DisclosureViewFactory.getDp12();
        layoutParams.topMargin = sellerV4DisclosureViewFactory.getDp12();
        layoutParams.rightMargin = sellerV4DisclosureViewFactory.getDp16();
        textAtomV2View.setLayoutParams(layoutParams);
        return textAtomV2View;
    }
}
