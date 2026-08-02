package ru.ozon.app.android.cart.domain.utils.link;

import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007J\u0006\u0010\b\u001a\u00020\u0005¨\u0006\t"}, d2 = {"Lru/ozon/app/android/cart/domain/utils/link/CartLinkGenerator;", "", "<init>", "()V", "cart", "Landroid/net/Uri;", "isAnchor", "", "familyCart", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CartLinkGenerator {

    @NotNull
    public static final CartLinkGenerator INSTANCE = new CartLinkGenerator();

    private CartLinkGenerator() {
    }

    public static /* synthetic */ Uri cart$default(CartLinkGenerator cartLinkGenerator, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        return cartLinkGenerator.cart(z11);
    }

    @NotNull
    public final Uri cart(boolean isAnchor) {
        Uri.Builder authority = new Uri.Builder().scheme("ozon").authority("cart");
        if (isAnchor) {
            authority.appendQueryParameter("anchor", "true");
        }
        Uri build = authority.build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }

    @NotNull
    public final Uri familyCart() {
        Uri build = new Uri.Builder().scheme("ozon").authority("cart").appendQueryParameter("tab", "9").build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }
}
