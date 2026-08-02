package ru.ozon.app.android.pdp.widgets.deliveryV6.presentation.async;

import android.content.Context;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.pdp.R$id;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.pdp.widgets.sellerV4.presentation.SellerV4DisclosureViewFactory;
import ru.ozon.app.android.uikit.view.skeleton.SkeletonPlaceholderView;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/uikit/view/skeleton/SkeletonPlaceholderView;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class DeliveryV6AsyncPlaceholderView$skeletonPlaceholderViewBottom$2 extends AbstractC7737t implements Function0<SkeletonPlaceholderView> {
    final /* synthetic */ Context $context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DeliveryV6AsyncPlaceholderView$skeletonPlaceholderViewBottom$2(Context context) {
        super(0);
        this.$context = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final SkeletonPlaceholderView invoke() {
        SkeletonPlaceholderView skeletonPlaceholderView = new SkeletonPlaceholderView(this.$context, null, 0, 0, 14, null);
        skeletonPlaceholderView.setId(R$id.subtitleSpv);
        skeletonPlaceholderView.setCornerRadius(Dimens.INSTANCE.getDPF_8());
        SellerV4DisclosureViewFactory sellerV4DisclosureViewFactory = SellerV4DisclosureViewFactory.INSTANCE;
        ConstraintLayout.b bVar = new ConstraintLayout.b(0, sellerV4DisclosureViewFactory.getDp12());
        ((ViewGroup.MarginLayoutParams) bVar).leftMargin = sellerV4DisclosureViewFactory.getDp16();
        ((ViewGroup.MarginLayoutParams) bVar).topMargin = sellerV4DisclosureViewFactory.getDp12();
        ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = sellerV4DisclosureViewFactory.getDp16();
        bVar.f41611R = 0.6f;
        bVar.f41598E = 0.0f;
        skeletonPlaceholderView.setLayoutParams(bVar);
        return skeletonPlaceholderView;
    }
}
