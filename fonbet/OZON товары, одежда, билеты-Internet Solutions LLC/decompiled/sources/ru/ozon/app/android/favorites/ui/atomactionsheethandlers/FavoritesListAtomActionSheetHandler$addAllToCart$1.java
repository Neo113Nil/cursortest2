package ru.ozon.app.android.favorites.ui.atomactionsheethandlers;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.cart.common.data.CartAddItemDTO;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u000f \u0003*\u0004\u0018\u00010\u00010\u0001¢\u0006\u0002\b\u00022\u000b\u0010\u0004\u001a\u00070\u0001¢\u0006\u0002\b\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/cart/common/data/CartAddItemDTO;", "Lkotlin/jvm/internal/EnhancedNullability;", "kotlin.jvm.PlatformType", "it", "invoke", "(Lru/ozon/app/android/cart/common/data/CartAddItemDTO;)Lru/ozon/app/android/cart/common/data/CartAddItemDTO;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class FavoritesListAtomActionSheetHandler$addAllToCart$1 extends AbstractC7737t implements Function1<CartAddItemDTO, CartAddItemDTO> {
    public static final FavoritesListAtomActionSheetHandler$addAllToCart$1 INSTANCE = new FavoritesListAtomActionSheetHandler$addAllToCart$1();

    FavoritesListAtomActionSheetHandler$addAllToCart$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final CartAddItemDTO invoke(CartAddItemDTO it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.getSuccess()) {
            return it;
        }
        throw new IllegalStateException("error add to cart from favorites");
    }
}
