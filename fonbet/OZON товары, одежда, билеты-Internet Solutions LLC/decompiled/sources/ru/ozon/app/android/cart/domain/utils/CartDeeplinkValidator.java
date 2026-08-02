package ru.ozon.app.android.cart.domain.utils;

import Kk.C3532b;
import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.utils.link.CartDeeplinkValidationRules;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/cart/domain/utils/CartDeeplinkValidator;", "", "<init>", "()V", "validateScreen", "", "deeplinkUri", "Landroid/net/Uri;", "validateAuthority", "validateModalAuthority", "validateCash", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CartDeeplinkValidator {

    @NotNull
    public static final CartDeeplinkValidator INSTANCE = new CartDeeplinkValidator();

    private CartDeeplinkValidator() {
    }

    public final boolean validateAuthority(@NotNull Uri deeplinkUri) {
        Intrinsics.checkNotNullParameter(deeplinkUri, "deeplinkUri");
        return Intrinsics.d(deeplinkUri.getAuthority(), "cart") || validateModalAuthority(deeplinkUri);
    }

    public final boolean validateCash(@NotNull Uri deeplinkUri) {
        Intrinsics.checkNotNullParameter(deeplinkUri, "deeplinkUri");
        return validateScreen(deeplinkUri) && !deeplinkUri.getQueryParameterNames().contains("layout_page_index");
    }

    public final boolean validateModalAuthority(@NotNull Uri deeplinkUri) {
        Intrinsics.checkNotNullParameter(deeplinkUri, "deeplinkUri");
        return Intrinsics.d(deeplinkUri.getAuthority(), "modal") && C3532b.g(deeplinkUri, "getPathSegments(...)", "freshCartExtraOrder");
    }

    public final boolean validateScreen(@NotNull Uri deeplinkUri) {
        Intrinsics.checkNotNullParameter(deeplinkUri, "deeplinkUri");
        if (!validateAuthority(deeplinkUri)) {
            return false;
        }
        CartDeeplinkValidationRules cartDeeplinkValidationRules = CartDeeplinkValidationRules.INSTANCE;
        return cartDeeplinkValidationRules.hasExcludedPathSegment(deeplinkUri) && !cartDeeplinkValidationRules.isFamilyCartTab(deeplinkUri);
    }
}
