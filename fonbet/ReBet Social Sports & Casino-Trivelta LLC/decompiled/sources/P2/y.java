package P2;

import android.webkit.WebView;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
import wi.AbstractC6757a;

/* loaded from: classes.dex */
public class y implements x {

    /* renamed from: a, reason: collision with root package name */
    public final WebViewProviderFactoryBoundaryInterface f8800a;

    public y(WebViewProviderFactoryBoundaryInterface webViewProviderFactoryBoundaryInterface) {
        this.f8800a = webViewProviderFactoryBoundaryInterface;
    }

    @Override // P2.x
    public String[] a() {
        return this.f8800a.getSupportedFeatures();
    }

    @Override // P2.x
    public WebViewProviderBoundaryInterface createWebView(WebView webView) {
        return (WebViewProviderBoundaryInterface) AbstractC6757a.a(WebViewProviderBoundaryInterface.class, this.f8800a.createWebView(webView));
    }

    @Override // P2.x
    public StaticsBoundaryInterface getStatics() {
        return (StaticsBoundaryInterface) AbstractC6757a.a(StaticsBoundaryInterface.class, this.f8800a.getStatics());
    }

    @Override // P2.x
    public WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
        return (WebkitToCompatConverterBoundaryInterface) AbstractC6757a.a(WebkitToCompatConverterBoundaryInterface.class, this.f8800a.getWebkitToCompatConverter());
    }
}
