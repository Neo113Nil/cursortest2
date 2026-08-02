package bo.app;

import android.net.Uri;
import com.braze.Constants;
import java.net.URL;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\u0013B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0014J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lbo/app/a5;", "", "", "toString", "urlString", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "Landroid/net/Uri;", "uri", "Landroid/net/Uri;", Constants.BRAZE_PUSH_CONTENT_KEY, "()Landroid/net/Uri;", "Ljava/net/URL;", "url", "Ljava/net/URL;", "b", "()Ljava/net/URL;", "<init>", "(Landroid/net/Uri;)V", "(Ljava/lang/String;)V", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes6.dex */
public final class a5 {
    private final String a;
    private final Uri b;
    private final URL c;

    public a5(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        this.b = uri;
        String uri2 = uri.toString();
        Intrinsics.checkNotNullExpressionValue(uri2, "uri.toString()");
        this.a = uri2;
        this.c = new URL(uri2);
    }

    /* renamed from: a, reason: from getter */
    public final Uri getB() {
        return this.b;
    }

    /* renamed from: b, reason: from getter */
    public final URL getC() {
        return this.c;
    }

    /* renamed from: c, reason: from getter */
    public final String getA() {
        return this.a;
    }

    public String toString() {
        return this.a;
    }

    public a5(String urlString) {
        Intrinsics.checkNotNullParameter(urlString, "urlString");
        Uri parse = Uri.parse(urlString);
        Intrinsics.checkNotNullExpressionValue(parse, "parse(urlString)");
        this.b = parse;
        this.a = urlString;
        this.c = new URL(urlString);
    }
}
