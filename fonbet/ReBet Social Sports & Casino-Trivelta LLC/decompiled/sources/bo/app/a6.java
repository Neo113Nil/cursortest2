package bo.app;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public abstract class a6 {
    public static String a(String host, String mite, String auth, String str, int i10) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(mite, "mite");
        Intrinsics.checkNotNullParameter(auth, "auth");
        if (!StringsKt.startsWith$default(host, "http://", false, 2, (Object) null) && !StringsKt.startsWith$default(host, "https://", false, 2, (Object) null)) {
            host = "https://" + host;
        }
        Uri.Builder buildUpon = Uri.parse(host).buildUpon();
        buildUpon.appendPath("sse");
        buildUpon.appendQueryParameter("mite", mite);
        buildUpon.appendQueryParameter("auth", auth);
        buildUpon.appendQueryParameter("attempts", String.valueOf(i10));
        if (str != null) {
            buildUpon.appendQueryParameter("rcs", str);
        }
        String uri = buildUpon.build().toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        return uri;
    }
}
