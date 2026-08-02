package ru.ozon.app.android.cart.common.utils.link;

import android.net.Uri;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000b\u0010\bJ\u0017\u0010\f\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\f\u0010\bJ\u0017\u0010\r\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\r\u0010\b¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/cart/common/utils/link/CartDeeplinkValidationRules;", "", "<init>", "()V", "Landroid/net/Uri;", "deeplinkUri", "", "hasExcludedPathSegment", "(Landroid/net/Uri;)Z", "isFamilyCartTab", "isMiniApp", "isReserveCartTab", "isDefaultCartTab", "isCartTab", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CartDeeplinkValidationRules {

    @NotNull
    public static final CartDeeplinkValidationRules INSTANCE = new CartDeeplinkValidationRules();

    private CartDeeplinkValidationRules() {
    }

    public final boolean hasExcludedPathSegment(@NotNull Uri deeplinkUri) {
        Intrinsics.checkNotNullParameter(deeplinkUri, "deeplinkUri");
        List<String> pathSegments = deeplinkUri.getPathSegments();
        Intrinsics.checkNotNullExpressionValue(pathSegments, "getPathSegments(...)");
        String str = (String) C7714v.M(pathSegments);
        return (Intrinsics.d(str, "accuracy_delivery_address") || Intrinsics.d(str, "availability_prescription") || Intrinsics.d(str, "delivery_options") || Intrinsics.d(str, "sellerSuggestions")) ? false : true;
    }

    public final boolean isCartTab(Uri deeplinkUri) {
        return h.t(String.valueOf(deeplinkUri), "ozon://cart", false);
    }

    public final boolean isDefaultCartTab(Uri deeplinkUri) {
        if (Intrinsics.d(deeplinkUri != null ? deeplinkUri.getQueryParameter("tab") : null, "0")) {
            return true;
        }
        String queryParameter = deeplinkUri != null ? deeplinkUri.getQueryParameter("tab") : null;
        return queryParameter == null || h.K(queryParameter);
    }

    public final boolean isFamilyCartTab(@NotNull Uri deeplinkUri) {
        Intrinsics.checkNotNullParameter(deeplinkUri, "deeplinkUri");
        return Intrinsics.d(deeplinkUri.getQueryParameter("tab"), "9");
    }

    public final boolean isMiniApp(Uri deeplinkUri) {
        return (deeplinkUri != null ? deeplinkUri.getQueryParameter("miniapp") : null) != null;
    }

    public final boolean isReserveCartTab(Uri deeplinkUri) {
        return Intrinsics.d(deeplinkUri != null ? deeplinkUri.getQueryParameter("tab") : null, "7");
    }
}
