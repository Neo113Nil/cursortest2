package ru.ozon.app.android.product.molecules.countbutton.presentation;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.cart.common.domain.CartState;
import ru.ozon.app.android.cart.common.models.CartItemInfo;

@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\"\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003 \u0004*\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00010\u00012\u000b\u0010\u0005\u001a\u00070\u0006¢\u0006\u0002\b\u0007H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"<anonymous>", "", "", "Lru/ozon/app/android/cart/common/models/CartItemInfo;", "kotlin.jvm.PlatformType", "it", "Lru/ozon/app/android/cart/common/domain/CartState;", "Lkotlin/jvm/internal/EnhancedNullability;", "invoke", "(Lru/ozon/app/android/cart/common/domain/CartState;)Ljava/util/Map;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class CountButtonViewModelImpl$attach$1 extends AbstractC7737t implements Function1<CartState, Map<Long, ? extends CartItemInfo>> {
    public static final CountButtonViewModelImpl$attach$1 INSTANCE = new CountButtonViewModelImpl$attach$1();

    CountButtonViewModelImpl$attach$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Map<Long, CartItemInfo> invoke(CartState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getItems();
    }
}
