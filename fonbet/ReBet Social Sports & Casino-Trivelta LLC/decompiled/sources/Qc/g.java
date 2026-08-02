package Qc;

import android.content.Context;
import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final Context f9628a;

    /* renamed from: b, reason: collision with root package name */
    public final String f9629b;

    public g(Context context, String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f9628a = context;
        this.f9629b = str;
    }

    public final Uri a(String str, Context context) {
        return i.f9631a.b(context, str);
    }

    public final Uri b(Context context) {
        String str = this.f9629b;
        if (str == null) {
            return null;
        }
        try {
            Uri parse = Uri.parse(str);
            return parse.getScheme() == null ? a(str, context) : parse;
        } catch (Exception unused) {
            return a(str, context);
        }
    }

    public final Uri c(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Uri b10 = b(context);
        if (!d(b10)) {
            return b10;
        }
        Intrinsics.checkNotNull(b10);
        String uri = b10.toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        return Uri.parse(StringsKt.replace$default(uri, "res:/", "android.resource://" + context.getPackageName() + "/", false, 4, (Object) null));
    }

    public final boolean d(Uri uri) {
        String scheme;
        if (uri == null || (scheme = uri.getScheme()) == null) {
            return false;
        }
        return StringsKt.startsWith$default(scheme, "res", false, 2, (Object) null);
    }
}
