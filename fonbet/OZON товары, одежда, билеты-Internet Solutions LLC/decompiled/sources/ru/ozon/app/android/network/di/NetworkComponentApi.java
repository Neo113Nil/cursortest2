package ru.ozon.app.android.network.di;

import We.B;
import We.C4871m;
import We.C4876s;
import We.E;
import We.InterfaceC4875q;
import android.webkit.CookieManager;
import com.squareup.moshi.Moshi;
import hi.InterfaceC6958a;
import java.util.List;
import kotlin.Metadata;
import nf.C8590c;
import org.jetbrains.annotations.NotNull;
import qj.C9067a;
import retrofit2.Retrofit;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.network.abtool.FeatureUpdater;
import ru.ozon.app.android.network.auth.AuthNetworkService;
import ru.ozon.app.android.network.common.NetworkHeadersProvider;
import ru.ozon.app.android.network.cronet.CronetOkHttpClientProvider;
import ru.ozon.app.android.network.debug.DebugHeaderService;
import ru.ozon.app.android.network.gnc.GncOkHttpClientBuilder;
import ru.ozon.app.android.network.homeprefetch.HomePrefetchInterceptor;
import ru.ozon.app.android.network.homeprefetch.PrefetchHomePageFacade;
import ru.ozon.app.android.network.interceptors.DynamicUrlInterceptor;
import ru.ozon.app.android.network.logrequests.LogRequestsService;
import ru.ozon.app.android.network.logs.WebViewErrorLogger;
import ru.ozon.app.android.network.networkhandler.ConnectionHandler;
import ru.ozon.app.android.network.serialize.JsonSerializer;
import ru.ozon.app.android.network.version.AppVersionService;
import ru.ozon.app.android.network.websockets.AppVisibility;
import ru.ozon.app.android.network.websockets.OzonWebSocketFactory;

@Metadata(d1 = {"\u0000\u0084\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00060\u0001j\u0002`\u0002J\u000f\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0011\u001a\u00060\u000fj\u0002`\u0010H&¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H&¢\u0006\u0004\b\u0017\u0010\u0018J\u0011\u0010\u001a\u001a\u0004\u0018\u00010\u0019H&¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH&¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH&¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H&¢\u0006\u0004\b#\u0010$J\u000f\u0010&\u001a\u00020%H&¢\u0006\u0004\b&\u0010'J\u000f\u0010)\u001a\u00020(H&¢\u0006\u0004\b)\u0010*J\u000f\u0010,\u001a\u00020+H&¢\u0006\u0004\b,\u0010-J\u000f\u0010/\u001a\u00020.H&¢\u0006\u0004\b/\u00100J\u000f\u00102\u001a\u000201H&¢\u0006\u0004\b2\u00103J\u0015\u00106\u001a\b\u0012\u0004\u0012\u00020504H'¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u000205H'¢\u0006\u0004\b8\u00109J\u000f\u0010;\u001a\u00020:H&¢\u0006\u0004\b;\u0010<J\u000f\u0010>\u001a\u00020=H&¢\u0006\u0004\b>\u0010?J\u000f\u0010A\u001a\u00020@H&¢\u0006\u0004\bA\u0010BJ\u000f\u0010D\u001a\u00020CH&¢\u0006\u0004\bD\u0010EJ\u000f\u0010G\u001a\u00020FH&¢\u0006\u0004\bG\u0010HJ\u000f\u0010I\u001a\u000205H'¢\u0006\u0004\bI\u00109J\u000f\u0010J\u001a\u000205H'¢\u0006\u0004\bJ\u00109J\u000f\u0010L\u001a\u00020KH&¢\u0006\u0004\bL\u0010MJ\u000f\u0010O\u001a\u00020NH&¢\u0006\u0004\bO\u0010PJ\u000f\u0010R\u001a\u00020QH&¢\u0006\u0004\bR\u0010SJ\u000f\u0010U\u001a\u00020TH&¢\u0006\u0004\bU\u0010VJ\u000f\u0010X\u001a\u00020WH&¢\u0006\u0004\bX\u0010YJ\u000f\u0010[\u001a\u00020ZH&¢\u0006\u0004\b[\u0010\\J\u000f\u0010^\u001a\u00020]H&¢\u0006\u0004\b^\u0010_J\u000f\u0010a\u001a\u00020`H&¢\u0006\u0004\ba\u0010b¨\u0006c"}, d2 = {"Lru/ozon/app/android/network/di/NetworkComponentApi;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lcom/squareup/moshi/Moshi;", "getMoshi", "()Lcom/squareup/moshi/Moshi;", "Lretrofit2/Retrofit;", "getRetrofit", "()Lretrofit2/Retrofit;", "LWe/E;", "getOkHttpClient", "()LWe/E;", "Lru/ozon/app/android/network/serialize/JsonSerializer;", "getJsonSerializer", "()Lru/ozon/app/android/network/serialize/JsonSerializer;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "getJsonDeserializer", "()Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/interceptors/DynamicUrlInterceptor;", "getDynamicUrlInterceptor", "()Lru/ozon/app/android/network/interceptors/DynamicUrlInterceptor;", "LWe/q;", "getCookieJar", "()LWe/q;", "Landroid/webkit/CookieManager;", "getWebViewCookieManager", "()Landroid/webkit/CookieManager;", "Lru/ozon/app/android/network/abtool/FeatureService;", "getFeatureService", "()Lru/ozon/app/android/network/abtool/FeatureService;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "getFeatureChecker", "()Lru/ozon/app/android/network/abtool/FeatureChecker;", "Lru/ozon/app/android/network/abtool/FeatureUpdater;", "getFeatureUpdater", "()Lru/ozon/app/android/network/abtool/FeatureUpdater;", "Lru/ozon/app/android/network/auth/AuthNetworkService;", "getAuthNetworkService", "()Lru/ozon/app/android/network/auth/AuthNetworkService;", "Lru/ozon/app/android/network/di/NetworkComponentConfig;", "getNetworkComponentConfig", "()Lru/ozon/app/android/network/di/NetworkComponentConfig;", "Lru/ozon/app/android/network/websockets/OzonWebSocketFactory;", "getOzonWebSocketFactory", "()Lru/ozon/app/android/network/websockets/OzonWebSocketFactory;", "Lru/ozon/app/android/network/websockets/AppVisibility;", "getAppVisibility", "()Lru/ozon/app/android/network/websockets/AppVisibility;", "Lru/ozon/app/android/network/networkhandler/ConnectionHandler;", "getInternetConnectionUtils", "()Lru/ozon/app/android/network/networkhandler/ConnectionHandler;", "", "LWe/B;", "getInterceptors", "()Ljava/util/List;", "getAcceptEncodingInterceptor", "()LWe/B;", "Lru/ozon/app/android/network/version/AppVersionService;", "getAppVersionService", "()Lru/ozon/app/android/network/version/AppVersionService;", "Lru/ozon/app/android/network/logrequests/LogRequestsService;", "getLogRequestsService", "()Lru/ozon/app/android/network/logrequests/LogRequestsService;", "LWe/m;", "getConnectionPool", "()LWe/m;", "LWe/s;", "getDispatcher", "()LWe/s;", "Lru/ozon/app/android/network/debug/DebugHeaderService;", "getDebugHeaderService", "()Lru/ozon/app/android/network/debug/DebugHeaderService;", "getLogRequestsInterceptor", "getGeoRequestsLogInterceptor", "Lru/ozon/app/android/network/common/NetworkHeadersProvider;", "getNetworkHeadersProvider", "()Lru/ozon/app/android/network/common/NetworkHeadersProvider;", "Lnf/c;", "getHttpLoggingInterceptorWithLimits", "()Lnf/c;", "Lru/ozon/app/android/network/homeprefetch/HomePrefetchInterceptor;", "homePrefetchInterceptor", "()Lru/ozon/app/android/network/homeprefetch/HomePrefetchInterceptor;", "Lru/ozon/app/android/network/homeprefetch/PrefetchHomePageFacade;", "homePrefetchFacade", "()Lru/ozon/app/android/network/homeprefetch/PrefetchHomePageFacade;", "Lru/ozon/app/android/network/logs/WebViewErrorLogger;", "getWebViewErrorLogger", "()Lru/ozon/app/android/network/logs/WebViewErrorLogger;", "Lru/ozon/app/android/network/cronet/CronetOkHttpClientProvider;", "getCronetOkHttpClientProvider", "()Lru/ozon/app/android/network/cronet/CronetOkHttpClientProvider;", "Lqj/a;", "getNetworkInfoProvider", "()Lqj/a;", "Lru/ozon/app/android/network/gnc/GncOkHttpClientBuilder;", "getGncOkHttpClientBuilder", "()Lru/ozon/app/android/network/gnc/GncOkHttpClientBuilder;", "network_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface NetworkComponentApi extends InterfaceC6958a {
    @NotNull
    B getAcceptEncodingInterceptor();

    @NotNull
    AppVersionService getAppVersionService();

    @NotNull
    AppVisibility getAppVisibility();

    @NotNull
    AuthNetworkService getAuthNetworkService();

    @NotNull
    C4871m getConnectionPool();

    @NotNull
    InterfaceC4875q getCookieJar();

    @NotNull
    CronetOkHttpClientProvider getCronetOkHttpClientProvider();

    @NotNull
    DebugHeaderService getDebugHeaderService();

    @NotNull
    C4876s getDispatcher();

    @NotNull
    DynamicUrlInterceptor getDynamicUrlInterceptor();

    @NotNull
    FeatureChecker getFeatureChecker();

    @NotNull
    FeatureService getFeatureService();

    @NotNull
    FeatureUpdater getFeatureUpdater();

    @NotNull
    B getGeoRequestsLogInterceptor();

    @NotNull
    GncOkHttpClientBuilder getGncOkHttpClientBuilder();

    @NotNull
    C8590c getHttpLoggingInterceptorWithLimits();

    @NotNull
    List<B> getInterceptors();

    @NotNull
    ConnectionHandler getInternetConnectionUtils();

    @NotNull
    JsonParser getJsonDeserializer();

    @NotNull
    JsonSerializer getJsonSerializer();

    @NotNull
    B getLogRequestsInterceptor();

    @NotNull
    LogRequestsService getLogRequestsService();

    @NotNull
    Moshi getMoshi();

    @NotNull
    NetworkComponentConfig getNetworkComponentConfig();

    @NotNull
    NetworkHeadersProvider getNetworkHeadersProvider();

    @NotNull
    C9067a getNetworkInfoProvider();

    @NotNull
    E getOkHttpClient();

    @NotNull
    OzonWebSocketFactory getOzonWebSocketFactory();

    @NotNull
    Retrofit getRetrofit();

    CookieManager getWebViewCookieManager();

    @NotNull
    WebViewErrorLogger getWebViewErrorLogger();

    @NotNull
    PrefetchHomePageFacade homePrefetchFacade();

    @NotNull
    HomePrefetchInterceptor homePrefetchInterceptor();
}
