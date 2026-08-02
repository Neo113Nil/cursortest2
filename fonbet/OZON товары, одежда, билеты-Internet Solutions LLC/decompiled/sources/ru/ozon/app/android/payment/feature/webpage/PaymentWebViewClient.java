package ru.ozon.app.android.payment.feature.webpage;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.performance.PerformanceTrackerDelegate;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.logs.WebViewErrorLogger;
import ru.ozon.app.android.web.webview.cache.service.ResourcesCacheInterceptor;
import ru.ozon.app.android.web.webview.client.OzonWebViewClient;
import ru.ozon.app.android.web.webview.client.WebViewRendererProcessCrashHandler;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B9\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/payment/feature/webpage/PaymentWebViewClient;", "Lru/ozon/app/android/web/webview/client/OzonWebViewClient;", "resourcesCacheInterceptor", "Lru/ozon/app/android/web/webview/cache/service/ResourcesCacheInterceptor;", "performanceTrackerDelegate", "Lru/ozon/app/android/analytics/performance/PerformanceTrackerDelegate;", "webViewRendererProcessCrashHandler", "Lru/ozon/app/android/web/webview/client/WebViewRendererProcessCrashHandler;", "paymentWebViewUrlInterceptor", "Lru/ozon/app/android/payment/feature/webpage/PaymentWebViewUrlInterceptor;", "featureChecker", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "webViewErrorLogger", "Lru/ozon/app/android/network/logs/WebViewErrorLogger;", "<init>", "(Lru/ozon/app/android/web/webview/cache/service/ResourcesCacheInterceptor;Lru/ozon/app/android/analytics/performance/PerformanceTrackerDelegate;Lru/ozon/app/android/web/webview/client/WebViewRendererProcessCrashHandler;Lru/ozon/app/android/payment/feature/webpage/PaymentWebViewUrlInterceptor;Lru/ozon/app/android/network/abtool/FeatureChecker;Lru/ozon/app/android/network/logs/WebViewErrorLogger;)V", "payment_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PaymentWebViewClient extends OzonWebViewClient {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentWebViewClient(@NotNull ResourcesCacheInterceptor resourcesCacheInterceptor, @NotNull PerformanceTrackerDelegate performanceTrackerDelegate, @NotNull WebViewRendererProcessCrashHandler webViewRendererProcessCrashHandler, @NotNull PaymentWebViewUrlInterceptor paymentWebViewUrlInterceptor, @NotNull FeatureChecker featureChecker, @NotNull WebViewErrorLogger webViewErrorLogger) {
        super(resourcesCacheInterceptor, performanceTrackerDelegate, webViewRendererProcessCrashHandler, featureChecker, paymentWebViewUrlInterceptor, webViewErrorLogger);
        Intrinsics.checkNotNullParameter(resourcesCacheInterceptor, "resourcesCacheInterceptor");
        Intrinsics.checkNotNullParameter(performanceTrackerDelegate, "performanceTrackerDelegate");
        Intrinsics.checkNotNullParameter(webViewRendererProcessCrashHandler, "webViewRendererProcessCrashHandler");
        Intrinsics.checkNotNullParameter(paymentWebViewUrlInterceptor, "paymentWebViewUrlInterceptor");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        Intrinsics.checkNotNullParameter(webViewErrorLogger, "webViewErrorLogger");
    }
}
