package com.braze.managers;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.mp4parser.boxes.threegpp.ts26244.AuthorBox;

/* loaded from: classes6.dex */
public abstract class a0 {
    public static String a(String host, String mite, String auth, String str, int i) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(mite, "mite");
        Intrinsics.checkNotNullParameter(auth, "auth");
        if (!StringsKt.startsWith$default(host, "http://", false, 2, (Object) null) && !StringsKt.startsWith$default(host, "https://", false, 2, (Object) null)) {
            host = "https://" + host;
        }
        Uri.Builder buildUpon = Uri.parse(host).buildUpon();
        buildUpon.appendPath("sse");
        buildUpon.appendQueryParameter("mite", mite);
        buildUpon.appendQueryParameter(AuthorBox.TYPE, auth);
        buildUpon.appendQueryParameter("attempts", String.valueOf(i));
        if (str != null) {
            buildUpon.appendQueryParameter("rcs", str);
        }
        String uri = buildUpon.build().toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        return uri;
    }
}
