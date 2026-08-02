package ru.ozon.app.android.search.widgets.utils;

import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.search.widgets.searchbar.utils.UriUtilsKt;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0013\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"", "formatSuggestionDeeplink", "(Ljava/lang/String;)Ljava/lang/String;", "search_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SuggestionsUtilsKt {
    @NotNull
    public static final String formatSuggestionDeeplink(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Uri parse = Uri.parse(h.X(str, "+", "%20", false));
        Intrinsics.checkNotNullExpressionValue(parse, "parse(...)");
        String uri = UriUtilsKt.formatQuery$default(parse, null, 1, null).toString();
        Intrinsics.checkNotNullExpressionValue(uri, "let(...)");
        return uri;
    }
}
