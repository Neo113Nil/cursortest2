package ru.ozon.app.android.network.utils;

import android.net.Uri;
import android.util.Base64;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0001\u001a\u0012\u0010\u0002\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001\u001a#\u0010\u0002\u001a\u00020\u0003*\u00020\u00032\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0006\"\u00020\u0001¢\u0006\u0002\u0010\u0007\u001a\u0012\u0010\b\u001a\u00020\t*\u00020\t2\u0006\u0010\n\u001a\u00020\u0001\u001a\u001a\u0010\u000b\u001a\u00020\t*\u00020\u00032\u0006\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u0001\u001a\n\u0010\u000e\u001a\u00020\u0003*\u00020\u0003¨\u0006\u000f"}, d2 = {"base64Decode", "", "removeQueryParameter", "Landroid/net/Uri;", "nameToRemove", "namesToRemove", "", "(Landroid/net/Uri;[Ljava/lang/String;)Landroid/net/Uri;", "appendEndPoint", "Landroid/net/Uri$Builder;", "endPoint", "replaceQueryParameter", "key", "newValue", "mapToHttps", "network_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UriExtKt {
    @NotNull
    public static final Uri.Builder appendEndPoint(@NotNull Uri.Builder builder, @NotNull String endPoint) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        Intrinsics.checkNotNullParameter(endPoint, "endPoint");
        Uri parse = Uri.parse(endPoint);
        List<String> pathSegments = parse.getPathSegments();
        Intrinsics.checkNotNullExpressionValue(pathSegments, "getPathSegments(...)");
        Iterator<T> it = pathSegments.iterator();
        while (it.hasNext()) {
            builder.appendPath((String) it.next());
        }
        Set<String> queryParameterNames = parse.getQueryParameterNames();
        Intrinsics.checkNotNullExpressionValue(queryParameterNames, "getQueryParameterNames(...)");
        for (String str : queryParameterNames) {
            List<String> queryParameters = parse.getQueryParameters(str);
            Intrinsics.checkNotNullExpressionValue(queryParameters, "getQueryParameters(...)");
            Iterator<T> it2 = queryParameters.iterator();
            while (it2.hasNext()) {
                builder.appendQueryParameter(str, (String) it2.next());
            }
        }
        String fragment = parse.getFragment();
        if (fragment != null) {
            builder.fragment(fragment);
        }
        return builder;
    }

    @NotNull
    public static final String base64Decode(@NotNull String str) throws IllegalArgumentException {
        Intrinsics.checkNotNullParameter(str, "<this>");
        byte[] decode = Base64.decode(str, 0);
        Intrinsics.checkNotNullExpressionValue(decode, "decode(...)");
        return new String(decode, Charsets.UTF_8);
    }

    @NotNull
    public static final Uri mapToHttps(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "<this>");
        if (!Intrinsics.d(uri.getScheme(), "http")) {
            return uri;
        }
        Uri build = uri.buildUpon().scheme("https").build();
        Intrinsics.f(build);
        return build;
    }

    @NotNull
    public static final Uri removeQueryParameter(@NotNull Uri uri, @NotNull String nameToRemove) {
        Intrinsics.checkNotNullParameter(uri, "<this>");
        Intrinsics.checkNotNullParameter(nameToRemove, "nameToRemove");
        Uri.Builder clearQuery = uri.buildUpon().clearQuery();
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        Intrinsics.checkNotNullExpressionValue(queryParameterNames, "getQueryParameterNames(...)");
        for (String str : queryParameterNames) {
            if (!h.D(str, nameToRemove, true)) {
                clearQuery.appendQueryParameter(str, uri.getQueryParameter(str));
            }
        }
        Uri build = clearQuery.build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }

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
                clearQuery.appendQueryParameter(str, uri.getQueryParameter(str));
            }
        }
        if (!z11) {
            clearQuery.appendQueryParameter(key, newValue);
        }
        Intrinsics.f(clearQuery);
        return clearQuery;
    }

    @NotNull
    public static final Uri removeQueryParameter(@NotNull Uri uri, @NotNull String... namesToRemove) {
        Intrinsics.checkNotNullParameter(uri, "<this>");
        Intrinsics.checkNotNullParameter(namesToRemove, "namesToRemove");
        Uri.Builder clearQuery = uri.buildUpon().clearQuery();
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        Intrinsics.checkNotNullExpressionValue(queryParameterNames, "getQueryParameterNames(...)");
        for (String str : queryParameterNames) {
            int length = namesToRemove.length;
            boolean z11 = false;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    break;
                }
                if (h.D(namesToRemove[i11], str, true)) {
                    z11 = true;
                    break;
                }
                i11++;
            }
            if (!z11) {
                clearQuery.appendQueryParameter(str, uri.getQueryParameter(str));
            }
        }
        Uri build = clearQuery.build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }
}
