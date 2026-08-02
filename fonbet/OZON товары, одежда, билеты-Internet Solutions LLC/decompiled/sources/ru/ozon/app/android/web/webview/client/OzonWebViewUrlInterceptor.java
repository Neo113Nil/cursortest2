package ru.ozon.app.android.web.webview.client;

import android.content.Intent;
import android.net.Uri;
import android.webkit.WebView;
import com.google.android.gms.common.internal.ImagesContract;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.network.common.NetworkHeadersProvider;
import ru.ozon.app.android.network.whitelist.domain.DomainsInteractor;
import ru.ozon.app.android.uikit.R$string;
import ru.ozon.app.android.uikit.text.StringProvider;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0018\u0010\u0013\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/web/webview/client/OzonWebViewUrlInterceptor;", "Lru/ozon/app/android/web/webview/client/WebViewUrlInterceptor;", "domainsInteractor", "Lru/ozon/app/android/network/whitelist/domain/DomainsInteractor;", "networkHeadersProvider", "Lru/ozon/app/android/network/common/NetworkHeadersProvider;", "addBarsOffsetQueryInterceptor", "Lru/ozon/app/android/web/webview/client/AddBarsOffsetQueryInterceptor;", "<init>", "(Lru/ozon/app/android/network/whitelist/domain/DomainsInteractor;Lru/ozon/app/android/network/common/NetworkHeadersProvider;Lru/ozon/app/android/web/webview/client/AddBarsOffsetQueryInterceptor;)V", "interceptUrl", "", "view", "Landroid/webkit/WebView;", ImagesContract.URL, "", "interceptRedirectUrl", "openUrlInWebView", "", "openUrlInExternalBrowser", "web_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class OzonWebViewUrlInterceptor implements WebViewUrlInterceptor {

    @NotNull
    private final AddBarsOffsetQueryInterceptor addBarsOffsetQueryInterceptor;

    @NotNull
    private final DomainsInteractor domainsInteractor;

    @NotNull
    private final NetworkHeadersProvider networkHeadersProvider;

    public OzonWebViewUrlInterceptor(@NotNull DomainsInteractor domainsInteractor, @NotNull NetworkHeadersProvider networkHeadersProvider, @NotNull AddBarsOffsetQueryInterceptor addBarsOffsetQueryInterceptor) {
        Intrinsics.checkNotNullParameter(domainsInteractor, "domainsInteractor");
        Intrinsics.checkNotNullParameter(networkHeadersProvider, "networkHeadersProvider");
        Intrinsics.checkNotNullParameter(addBarsOffsetQueryInterceptor, "addBarsOffsetQueryInterceptor");
        this.domainsInteractor = domainsInteractor;
        this.networkHeadersProvider = networkHeadersProvider;
        this.addBarsOffsetQueryInterceptor = addBarsOffsetQueryInterceptor;
    }

    private final void openUrlInExternalBrowser(WebView view, String url) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(url));
        if (intent.resolveActivity(view.getContext().getPackageManager()) == null) {
            return;
        }
        view.getContext().startActivity(Intent.createChooser(intent, StringProvider.getString(R$string.browser_choser_title_implict_chooser)));
    }

    private final void openUrlInWebView(WebView view, String url) {
        if (this.domainsInteractor.isUrlSubdomainOfNetworkRequestDomains(url)) {
            view.loadUrl(url, this.networkHeadersProvider.getWebViewHeaders());
        } else {
            view.loadUrl(url);
        }
    }

    @Override // ru.ozon.app.android.web.webview.client.WebViewUrlInterceptor
    public boolean interceptRedirectUrl(@NotNull WebView view, @NotNull String url) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(url, "url");
        if (this.domainsInteractor.isUrlSubdomainOfWebDomains(url)) {
            return false;
        }
        openUrlInExternalBrowser(view, url);
        return true;
    }

    @Override // ru.ozon.app.android.web.webview.client.WebViewUrlInterceptor
    public boolean interceptUrl(@NotNull WebView view, @NotNull String url) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(url, "url");
        String intercept = this.addBarsOffsetQueryInterceptor.intercept(view, url);
        if (this.domainsInteractor.isUrlSubdomainOfWebDomains(intercept)) {
            openUrlInWebView(view, intercept);
            return true;
        }
        openUrlInExternalBrowser(view, intercept);
        return true;
    }
}
