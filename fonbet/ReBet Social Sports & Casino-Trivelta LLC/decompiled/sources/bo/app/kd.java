package bo.app;

import android.net.Uri;
import java.net.URL;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class kd {

    /* renamed from: a, reason: collision with root package name */
    public final String f25667a;

    /* renamed from: b, reason: collision with root package name */
    public final Uri f25668b;

    /* renamed from: c, reason: collision with root package name */
    public final URL f25669c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f25670d;

    public kd(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        this.f25668b = uri;
        String uri2 = uri.toString();
        Intrinsics.checkNotNullExpressionValue(uri2, "toString(...)");
        this.f25667a = uri2;
        this.f25669c = new URL(uri2);
        this.f25670d = false;
    }

    public final String toString() {
        return this.f25667a;
    }

    public kd(String urlString, boolean z10) {
        Intrinsics.checkNotNullParameter(urlString, "urlString");
        this.f25668b = Uri.parse(urlString);
        this.f25667a = urlString;
        this.f25669c = new URL(urlString);
        this.f25670d = z10;
    }
}
