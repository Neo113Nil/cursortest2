package ru.ozon.app.android.fresh.checkout.widgets.checkoutTotal.presentation;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.fresh.checkout.widgets.checkoutTotal.presentation.CheckoutTotalView;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/fresh/checkout/widgets/checkoutTotal/presentation/ItemSpaceDecoration;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class CheckoutTotalView$pricesDecorator$2 extends AbstractC7737t implements Function0<ItemSpaceDecoration> {
    public static final CheckoutTotalView$pricesDecorator$2 INSTANCE = new CheckoutTotalView$pricesDecorator$2();

    CheckoutTotalView$pricesDecorator$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final ItemSpaceDecoration invoke() {
        CheckoutTotalView.Companion companion;
        companion = CheckoutTotalView.Companion;
        return new ItemSpaceDecoration(companion.getDefaultPricesSpace());
    }
}
