package A5;

import android.webkit.WebView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class I extends E {

    /* renamed from: z, reason: collision with root package name */
    public final WebView f94z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(WebView webView) {
        super(webView);
        Intrinsics.checkNotNullParameter(webView, "webView");
        this.f94z = webView;
    }

    @Override // A5.E, A5.H
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof I) && Intrinsics.areEqual(this.f94z, ((I) obj).f94z);
    }

    @Override // A5.E, A5.H
    public int hashCode() {
        return this.f94z.hashCode();
    }

    @Override // A5.E, A5.H
    public String toString() {
        return "WebViewMetadata(webView=" + this.f94z + ")";
    }
}
