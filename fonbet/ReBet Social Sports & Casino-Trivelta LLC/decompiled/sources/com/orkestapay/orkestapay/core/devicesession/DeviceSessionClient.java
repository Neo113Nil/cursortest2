package com.orkestapay.orkestapay.core.devicesession;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.orkestapay.orkestapay.core.networking.CoreConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J \u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/orkestapay/orkestapay/core/devicesession/DeviceSessionClient;", "", "coreConfig", "Lcom/orkestapay/orkestapay/core/networking/CoreConfig;", "(Lcom/orkestapay/orkestapay/core/networking/CoreConfig;)V", "getDeviceSessionId", "", "context", "Landroid/content/Context;", "parent", "Landroid/view/ViewGroup;", "callback", "Lcom/orkestapay/orkestapay/core/devicesession/DeviceSessionListener;", "Orkestapay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DeviceSessionClient {

    @NotNull
    private final CoreConfig coreConfig;

    public DeviceSessionClient(@NotNull CoreConfig coreConfig) {
        Intrinsics.checkNotNullParameter(coreConfig, "coreConfig");
        this.coreConfig = coreConfig;
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public final void getDeviceSessionId(@NotNull Context context, @NotNull ViewGroup parent, @NotNull DeviceSessionListener callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(callback, "callback");
        String checkoutUrl = this.coreConfig.getEnvironment().getCheckoutUrl();
        WebView webView = new WebView(context);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.addJavascriptInterface(new JsInterface(callback, webView), "androidListener");
        webView.clearCache(true);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl(checkoutUrl + "/script/device-session?merchant_id=" + this.coreConfig.getMerchantId() + "&public_key=" + this.coreConfig.getPublicKey());
        parent.addView(webView);
    }
}
