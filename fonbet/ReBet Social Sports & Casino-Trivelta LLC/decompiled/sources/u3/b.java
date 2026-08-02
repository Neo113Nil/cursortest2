package u3;

import android.os.Handler;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.RNAppleAuthentication.SignInWithAppleService;
import com.twilio.voice.VoiceURLConnection;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class b extends WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    public final SignInWithAppleService.AuthenticationAttempt f65964a;

    /* renamed from: b, reason: collision with root package name */
    public final String f65965b;

    /* renamed from: c, reason: collision with root package name */
    public Handler f65966c;

    public b(SignInWithAppleService.AuthenticationAttempt attempt, String javascriptToInject) {
        Intrinsics.checkNotNullParameter(attempt, "attempt");
        Intrinsics.checkNotNullParameter(javascriptToInject, "javascriptToInject");
        this.f65964a = attempt;
        this.f65965b = javascriptToInject;
        this.f65966c = new Handler();
    }

    public static final void b(WebView webView, b bVar) {
        if (webView != null) {
            webView.stopLoading();
        }
        if (webView != null) {
            webView.loadUrl("javascript:" + bVar.f65965b);
        }
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(final WebView webView, WebResourceRequest webResourceRequest) {
        if (Intrinsics.areEqual(webResourceRequest != null ? webResourceRequest.getMethod() : null, VoiceURLConnection.METHOD_TYPE_POST)) {
            String uri = webResourceRequest.getUrl().toString();
            Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
            if (StringsKt.contains$default((CharSequence) uri, (CharSequence) this.f65964a.getRedirectUri(), false, 2, (Object) null)) {
                try {
                    Thread.currentThread().interrupt();
                } catch (Exception unused) {
                }
                this.f65966c.post(new Runnable() { // from class: u3.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        b.b(webView, this);
                    }
                });
            }
        }
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }
}
