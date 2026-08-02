package ru.ozon.app.android.pikazon.extensions.internal;

import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a\u0011\u0010\u0001\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0013\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0002\u001a\u0013\u0010\u0004\u001a\u00020\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0002¨\u0006\u0005"}, d2 = {"", "ignoreResize", "(Ljava/lang/String;)Ljava/lang/String;", "setInscribedInHeight", "setInscribedInWidth", "lib_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class StringExtKt {
    @NotNull
    public static final String ignoreResize(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        String uri = Uri.parse(str).buildUpon().appendQueryParameter("ignore_resize", "true").build().toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        return uri;
    }

    @NotNull
    public static final String setInscribedInHeight(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        String uri = Uri.parse(str).buildUpon().appendQueryParameter("set_only_height", "true").build().toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        return uri;
    }

    @NotNull
    public static final String setInscribedInWidth(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        String uri = Uri.parse(str).buildUpon().appendQueryParameter("set_only_width", "true").build().toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        return uri;
    }
}
