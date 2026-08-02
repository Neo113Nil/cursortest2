package ru.ozon.app.android.payment.feature.webpage;

import GZ.g;
import Ib.b;
import Pc.a;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.web.webview.cache.WebViewResourcesManager;

/* loaded from: classes13.dex */
public final class PaymentActivity_MembersInjector implements b<PaymentActivity> {
    public static void injectFeatureChecker(PaymentActivity paymentActivity, FeatureChecker featureChecker) {
        paymentActivity.featureChecker = featureChecker;
    }

    public static void injectFeatureService(PaymentActivity paymentActivity, FeatureService featureService) {
        paymentActivity.featureService = featureService;
    }

    public static void injectOzonRouter(PaymentActivity paymentActivity, g gVar) {
        paymentActivity.ozonRouter = gVar;
    }

    public static void injectPViewModel(PaymentActivity paymentActivity, a<PaymentViewModelImpl> aVar) {
        paymentActivity.pViewModel = aVar;
    }

    public static void injectPaymentWebViewClient(PaymentActivity paymentActivity, PaymentWebViewClient paymentWebViewClient) {
        paymentActivity.paymentWebViewClient = paymentWebViewClient;
    }

    public static void injectWebViewCacheManager(PaymentActivity paymentActivity, WebViewResourcesManager webViewResourcesManager) {
        paymentActivity.webViewCacheManager = webViewResourcesManager;
    }
}
