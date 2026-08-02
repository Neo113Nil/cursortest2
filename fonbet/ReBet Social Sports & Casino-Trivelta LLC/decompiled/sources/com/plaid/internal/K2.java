package com.plaid.internal;

import android.net.Uri;
import com.plaid.internal.D6;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class K2 extends androidx.lifecycle.Q {
    public static D6 a(Uri uri) {
        if (uri == null) {
            return new D6.d(new IllegalStateException("Redirect with no oauth state provided"));
        }
        if (Intrinsics.areEqual(uri.getHost(), "complete")) {
            String uri2 = uri.toString();
            Intrinsics.checkNotNullExpressionValue(uri2, "toString(...)");
            return new D6.b(uri2);
        }
        if (Intrinsics.areEqual(uri.getHost(), "redirect")) {
            String uri3 = uri.toString();
            Intrinsics.checkNotNullExpressionValue(uri3, "toString(...)");
            return new D6.a(uri3);
        }
        if (Intrinsics.areEqual(uri.getHost(), "resume")) {
            return new D6.e();
        }
        return new D6.d(new IllegalStateException("Invalid redirect uri: " + uri));
    }
}
