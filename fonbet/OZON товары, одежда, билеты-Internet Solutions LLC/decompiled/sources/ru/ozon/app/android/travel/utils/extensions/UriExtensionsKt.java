package ru.ozon.app.android.travel.utils.extensions;

import android.net.Uri;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\u0006"}, d2 = {"replaceQueryParameter", "Landroid/net/Uri$Builder;", "Landroid/net/Uri;", "key", "", "newValue", "utils_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UriExtensionsKt {
    @NotNull
    public static final Uri.Builder replaceQueryParameter(@NotNull Uri uri, @NotNull String key, @NotNull String newValue) {
        Intrinsics.checkNotNullParameter(uri, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        Uri.Builder clearQuery = uri.buildUpon().clearQuery();
        boolean z11 = false;
        for (String str : queryParameterNames) {
            if (Intrinsics.d(str, key)) {
                clearQuery.appendQueryParameter(str, newValue);
                z11 = true;
            } else {
                List<String> queryParameters = uri.getQueryParameters(str);
                Intrinsics.f(queryParameters);
                Iterator<T> it = queryParameters.iterator();
                while (it.hasNext()) {
                    clearQuery.appendQueryParameter(str, (String) it.next());
                }
            }
        }
        if (!z11) {
            clearQuery.appendQueryParameter(key, newValue);
        }
        Intrinsics.f(clearQuery);
        return clearQuery;
    }
}
