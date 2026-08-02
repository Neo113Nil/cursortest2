package ru.ozon.app.android.payment.feature.webpage;

import android.webkit.WebView;
import com.google.android.gms.common.internal.ImagesContract;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.network.common.NetworkHeadersProvider;
import ru.ozon.app.android.network.whitelist.domain.DomainsInteractor;
import ru.ozon.app.android.web.webview.client.WebViewUrlInterceptor;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/payment/feature/webpage/PaymentWebViewUrlInterceptor;", "Lru/ozon/app/android/web/webview/client/WebViewUrlInterceptor;", "domainsInteractor", "Lru/ozon/app/android/network/whitelist/domain/DomainsInteractor;", "networkHeadersProvider", "Lru/ozon/app/android/network/common/NetworkHeadersProvider;", "<init>", "(Lru/ozon/app/android/network/whitelist/domain/DomainsInteractor;Lru/ozon/app/android/network/common/NetworkHeadersProvider;)V", "interceptUrl", "", "view", "Landroid/webkit/WebView;", ImagesContract.URL, "", "payment_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PaymentWebViewUrlInterceptor implements WebViewUrlInterceptor {

    @NotNull
    private final DomainsInteractor domainsInteractor;

    @NotNull
    private final NetworkHeadersProvider networkHeadersProvider;

    public PaymentWebViewUrlInterceptor(@NotNull DomainsInteractor domainsInteractor, @NotNull NetworkHeadersProvider networkHeadersProvider) {
        Intrinsics.checkNotNullParameter(domainsInteractor, "domainsInteractor");
        Intrinsics.checkNotNullParameter(networkHeadersProvider, "networkHeadersProvider");
        this.domainsInteractor = domainsInteractor;
        this.networkHeadersProvider = networkHeadersProvider;
    }

    @Override // ru.ozon.app.android.web.webview.client.WebViewUrlInterceptor
    public boolean interceptRedirectUrl(@NotNull WebView webView, @NotNull String str) {
        return WebViewUrlInterceptor.DefaultImpls.interceptRedirectUrl(this, webView, str);
    }

    @Override // ru.ozon.app.android.web.webview.client.WebViewUrlInterceptor
    public boolean interceptUrl(@NotNull WebView view, @NotNull String url) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(url, "url");
        if (!this.domainsInteractor.isUrlSubdomainOfNetworkRequestDomains(url)) {
            return false;
        }
        view.loadUrl(url, this.networkHeadersProvider.getWebViewHeaders());
        return true;
    }
}
