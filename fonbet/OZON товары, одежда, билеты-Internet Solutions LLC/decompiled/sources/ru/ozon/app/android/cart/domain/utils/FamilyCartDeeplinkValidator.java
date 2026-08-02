package ru.ozon.app.android.cart.domain.utils;

import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.utils.link.CartDeeplinkValidationRules;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\t"}, d2 = {"Lru/ozon/app/android/cart/domain/utils/FamilyCartDeeplinkValidator;", "", "<init>", "()V", "validateScreen", "", "deeplinkUri", "Landroid/net/Uri;", "validateAuthority", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FamilyCartDeeplinkValidator {

    @NotNull
    public static final FamilyCartDeeplinkValidator INSTANCE = new FamilyCartDeeplinkValidator();

    private FamilyCartDeeplinkValidator() {
    }

    public final boolean validateAuthority(@NotNull Uri deeplinkUri) {
        Intrinsics.checkNotNullParameter(deeplinkUri, "deeplinkUri");
        return Intrinsics.d(deeplinkUri.getAuthority(), "cart");
    }

    public final boolean validateScreen(@NotNull Uri deeplinkUri) {
        Intrinsics.checkNotNullParameter(deeplinkUri, "deeplinkUri");
        if (!validateAuthority(deeplinkUri)) {
            return false;
        }
        CartDeeplinkValidationRules cartDeeplinkValidationRules = CartDeeplinkValidationRules.INSTANCE;
        return cartDeeplinkValidationRules.hasExcludedPathSegment(deeplinkUri) && cartDeeplinkValidationRules.isFamilyCartTab(deeplinkUri);
    }
}
