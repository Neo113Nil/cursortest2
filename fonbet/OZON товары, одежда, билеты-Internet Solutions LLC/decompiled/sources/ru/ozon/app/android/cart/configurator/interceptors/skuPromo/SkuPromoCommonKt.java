package ru.ozon.app.android.cart.configurator.interceptors.skuPromo;

import android.net.Uri;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroid/net/Uri;", "", "removeSkuPromoQueryParams", "(Landroid/net/Uri;)Ljava/lang/String;", "cart_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SkuPromoCommonKt {
    @NotNull
    public static final String removeSkuPromoQueryParams(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "<this>");
        String query = uri.getQuery();
        if (query == null || query.length() == 0) {
            String uri2 = uri.toString();
            Intrinsics.checkNotNullExpressionValue(uri2, "toString(...)");
            return uri2;
        }
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        Intrinsics.checkNotNullExpressionValue(queryParameterNames, "getQueryParameterNames(...)");
        Set<String> d11 = e0.d(queryParameterNames, e0.h("skuPromo"));
        Uri.Builder clearQuery = uri.buildUpon().clearQuery();
        for (String str : d11) {
            List<String> queryParameters = uri.getQueryParameters(str);
            Intrinsics.checkNotNullExpressionValue(queryParameters, "getQueryParameters(...)");
            Iterator<T> it = queryParameters.iterator();
            while (it.hasNext()) {
                clearQuery.appendQueryParameter(str, (String) it.next());
            }
        }
        String uri3 = clearQuery.build().toString();
        Intrinsics.checkNotNullExpressionValue(uri3, "toString(...)");
        return uri3;
    }
}
