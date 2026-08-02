package ru.ozon.app.android.web.di;

import hi.InterfaceC6958a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.web.webview.WebViewRouter;
import ru.ozon.app.android.web.webview.ai.CheckAiConversation;
import ru.ozon.app.android.web.webview.cache.WebViewResourcesManager;
import ru.ozon.app.android.web.webview.cache.service.ResourcesCacheInterceptor;
import ru.ozon.app.android.web.webview.client.AddBarsOffsetQueryInterceptor;
import ru.ozon.app.android.web.webview.client.OzonWebViewClient;
import ru.ozon.app.android.web.webview.client.WebViewRendererProcessCrashHandler;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00060\u0001j\u0002`\u0002J\u000f\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H&¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H&¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/web/di/WebComponentApi;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/web/webview/cache/WebViewResourcesManager;", "getWebViewResourcesManager", "()Lru/ozon/app/android/web/webview/cache/WebViewResourcesManager;", "Lru/ozon/app/android/web/webview/cache/service/ResourcesCacheInterceptor;", "getResourcesCacheInterceptor", "()Lru/ozon/app/android/web/webview/cache/service/ResourcesCacheInterceptor;", "Lru/ozon/app/android/web/webview/WebViewRouter;", "getWebViewRouter", "()Lru/ozon/app/android/web/webview/WebViewRouter;", "Lru/ozon/app/android/web/webview/client/WebViewRendererProcessCrashHandler;", "getWebViewRendererProcessCrashHandler", "()Lru/ozon/app/android/web/webview/client/WebViewRendererProcessCrashHandler;", "Lru/ozon/app/android/web/webview/client/OzonWebViewClient;", "getOzonWebViewClient", "()Lru/ozon/app/android/web/webview/client/OzonWebViewClient;", "Lru/ozon/app/android/web/webview/client/AddBarsOffsetQueryInterceptor;", "getAddBarsOffsetQueryInterceptor", "()Lru/ozon/app/android/web/webview/client/AddBarsOffsetQueryInterceptor;", "Lru/ozon/app/android/web/webview/ai/CheckAiConversation;", "getCheckAiConversation", "()Lru/ozon/app/android/web/webview/ai/CheckAiConversation;", "web_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface WebComponentApi extends InterfaceC6958a {
    @NotNull
    AddBarsOffsetQueryInterceptor getAddBarsOffsetQueryInterceptor();

    @NotNull
    CheckAiConversation getCheckAiConversation();

    @NotNull
    OzonWebViewClient getOzonWebViewClient();

    @NotNull
    ResourcesCacheInterceptor getResourcesCacheInterceptor();

    @NotNull
    WebViewRendererProcessCrashHandler getWebViewRendererProcessCrashHandler();

    @NotNull
    WebViewResourcesManager getWebViewResourcesManager();

    @NotNull
    WebViewRouter getWebViewRouter();
}
