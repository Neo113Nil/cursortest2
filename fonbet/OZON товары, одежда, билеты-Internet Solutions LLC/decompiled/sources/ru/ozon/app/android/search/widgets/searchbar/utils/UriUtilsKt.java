package ru.ozon.app.android.search.widgets.searchbar.utils;

import K1.G;
import android.content.ContentResolver;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.network.utils.UriExtKt;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u001a\u001f\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001b\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0005\u0010\u0004\u001a'\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u001d\u0010\f\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u0001*\u00020\u0001H\u0000¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroid/net/Uri;", "", "text", "formatQuery", "(Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;", "replaceSTextQuery", "Landroid/content/ContentResolver;", "contentResolver", "Lkotlin/Pair;", "", "extractImageDimension", "(Landroid/net/Uri;Landroid/content/ContentResolver;)Lkotlin/Pair;", "extractMimeType", "(Landroid/net/Uri;Landroid/content/ContentResolver;)Ljava/lang/String;", "extractFullSearchText", "(Ljava/lang/String;)Ljava/lang/String;", "search_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class UriUtilsKt {
    public static final String extractFullSearchText(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Uri parse = Uri.parse(str);
        Set<String> queryParameterNames = parse.getQueryParameterNames();
        Intrinsics.checkNotNullExpressionValue(queryParameterNames, "getQueryParameterNames(...)");
        for (String str2 : queryParameterNames) {
            if (Intrinsics.d(str2, "full_search_text")) {
                return parse.getQueryParameter(str2);
            }
        }
        return null;
    }

    @NotNull
    public static final Pair<Integer, Integer> extractImageDimension(@NotNull Uri uri, @NotNull ContentResolver contentResolver) {
        Intrinsics.checkNotNullParameter(uri, "<this>");
        Intrinsics.checkNotNullParameter(contentResolver, "contentResolver");
        InputStream openInputStream = contentResolver.openInputStream(uri);
        if (openInputStream == null) {
            throw new IOException(G.b(uri, "Can't open "));
        }
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeStream(openInputStream, null, options);
            Pair<Integer, Integer> pair = new Pair<>(Integer.valueOf(options.outWidth), Integer.valueOf(options.outHeight));
            openInputStream.close();
            return pair;
        } finally {
        }
    }

    public static final String extractMimeType(@NotNull Uri uri, @NotNull ContentResolver contentResolver) {
        Intrinsics.checkNotNullParameter(uri, "<this>");
        Intrinsics.checkNotNullParameter(contentResolver, "contentResolver");
        String type = contentResolver.getType(uri);
        return type == null ? MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(uri.toString())) : type;
    }

    @NotNull
    public static final Uri formatQuery(@NotNull Uri uri, String str) {
        Intrinsics.checkNotNullParameter(uri, "<this>");
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        Intrinsics.checkNotNullExpressionValue(queryParameterNames, "getQueryParameterNames(...)");
        List<String> H02 = C7714v.H0(queryParameterNames);
        String[] strArr = (String[]) H02.toArray(new String[0]);
        Uri.Builder buildUpon = UriExtKt.removeQueryParameter(uri, (String[]) Arrays.copyOf(strArr, strArr.length)).buildUpon();
        for (String str2 : H02) {
            if (!Intrinsics.d(str2, "text") || str == null || h.K(str)) {
                buildUpon.appendQueryParameter(str2, uri.getQueryParameter(str2));
            } else {
                Intrinsics.f(str);
                buildUpon.appendQueryParameter(str2, h.z0(str).toString());
            }
        }
        Uri build = buildUpon.build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }

    public static /* synthetic */ Uri formatQuery$default(Uri uri, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = null;
        }
        return formatQuery(uri, str);
    }

    @NotNull
    public static final Uri replaceSTextQuery(@NotNull Uri uri, @NotNull String text) {
        Intrinsics.checkNotNullParameter(uri, "<this>");
        Intrinsics.checkNotNullParameter(text, "text");
        if (!uri.getQueryParameterNames().contains("s_text")) {
            return uri;
        }
        Uri build = UriExtKt.replaceQueryParameter(uri, "s_text", text).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }
}
