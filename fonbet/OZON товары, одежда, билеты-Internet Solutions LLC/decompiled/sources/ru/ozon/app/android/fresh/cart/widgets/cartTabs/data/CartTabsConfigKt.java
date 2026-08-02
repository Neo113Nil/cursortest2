package ru.ozon.app.android.fresh.cart.widgets.cartTabs.data;

import d00.C6018d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a%\u0010\u0006\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00010\u00002\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ld00/d;", "Lru/ozon/app/android/fresh/cart/widgets/cartTabs/data/CartTabsDTO;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "jsonDeserializer", "", "cartTabsConfig", "(Ld00/d;Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;)V", "widgets-cart_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CartTabsConfigKt {
    public static final void cartTabsConfig(@NotNull C6018d<CartTabsDTO> c6018d, @NotNull JsonParser jsonDeserializer) {
        Intrinsics.checkNotNullParameter(c6018d, "<this>");
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        c6018d.a(new CartTabsConfigKt$cartTabsConfig$1(jsonDeserializer));
    }
}
