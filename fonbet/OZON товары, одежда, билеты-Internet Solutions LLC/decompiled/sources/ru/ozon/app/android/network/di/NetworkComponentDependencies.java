package ru.ozon.app.android.network.di;

import Ld0.c;
import android.webkit.CookieManager;
import hi.InterfaceC6958a;
import java.util.Set;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.network.abtool.flag.FeatureFlagRegistrationModel;
import ru.ozon.app.android.network.auth.AuthNetworkService;
import ru.ozon.app.android.network.common.NetworkHeadersDependencies;
import ru.ozon.app.android.network.cookie.CookieListener;
import ru.ozon.app.android.network.debug.DebugHeaderService;
import ru.ozon.app.android.network.debug.ExtraHeadersService;
import ru.ozon.app.android.network.history.NetworkHistoryService;
import ru.ozon.app.android.network.interceptors.dependencies.AutoTestTraceIdInterceptorDependencies;
import ru.ozon.app.android.network.logrequests.LogRequestsService;
import ru.ozon.app.android.network.security.antibot.AntibotPerfAnalyticService;
import ru.ozon.app.android.network.version.AppVersionService;
import zb0.g;

@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00060\u0001j\u0002`\u0002J\u000f\u0010\u0004\u001a\u00020\u0003H'¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0006H'¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H&¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H&¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H&¢\u0006\u0004\b\u0019\u0010\u001aJ\u0011\u0010\u001c\u001a\u0004\u0018\u00010\u001bH&¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH'¢\u0006\u0004\b \u0010!J\u0015\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u001eH'¢\u0006\u0004\b#\u0010!J\u0015\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u001eH'¢\u0006\u0004\b%\u0010!J\u000f\u0010'\u001a\u00020&H&¢\u0006\u0004\b'\u0010(J\u000f\u0010*\u001a\u00020)H&¢\u0006\u0004\b*\u0010+J\u0015\u0010-\u001a\b\u0012\u0004\u0012\u00020,0\u001eH&¢\u0006\u0004\b-\u0010!J\u000f\u0010/\u001a\u00020.H&¢\u0006\u0004\b/\u00100J\u000f\u00102\u001a\u000201H&¢\u0006\u0004\b2\u00103R\u0014\u00107\u001a\u0002048&X¦\u0004¢\u0006\u0006\u001a\u0004\b5\u00106¨\u00068"}, d2 = {"Lru/ozon/app/android/network/di/NetworkComponentDependencies;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "", "apiUrl", "()Ljava/lang/String;", "", "getFeatureServiceRefreshInterval", "()Ljava/lang/Long;", "Lru/ozon/app/android/network/version/AppVersionService;", "getAppVersionService", "()Lru/ozon/app/android/network/version/AppVersionService;", "Lru/ozon/app/android/network/auth/AuthNetworkService;", "getAuthNetworkService", "()Lru/ozon/app/android/network/auth/AuthNetworkService;", "Lru/ozon/app/android/network/debug/DebugHeaderService;", "getDebugHeaderService", "()Lru/ozon/app/android/network/debug/DebugHeaderService;", "Lru/ozon/app/android/network/history/NetworkHistoryService;", "getNetworkHistoryService", "()Lru/ozon/app/android/network/history/NetworkHistoryService;", "Lru/ozon/app/android/network/logrequests/LogRequestsService;", "getLogRequestsService", "()Lru/ozon/app/android/network/logrequests/LogRequestsService;", "Lru/ozon/app/android/network/security/antibot/AntibotPerfAnalyticService;", "getAntibotPerfAnalyticService", "()Lru/ozon/app/android/network/security/antibot/AntibotPerfAnalyticService;", "Landroid/webkit/CookieManager;", "getWebViewCookieManager", "()Landroid/webkit/CookieManager;", "", "", "getMoshiAdapters", "()Ljava/util/Set;", "Lru/ozon/app/android/network/cookie/CookieListener;", "getCookieListeners", "Lzb0/g;", "getOzonIdCookieHandlers", "Lru/ozon/app/android/network/di/NetworkComponentConfig;", "getNetworkComponentConfig", "()Lru/ozon/app/android/network/di/NetworkComponentConfig;", "Lru/ozon/app/android/network/interceptors/dependencies/AutoTestTraceIdInterceptorDependencies;", "getAutoTestTraceIdInterceptorDependencies", "()Lru/ozon/app/android/network/interceptors/dependencies/AutoTestTraceIdInterceptorDependencies;", "Lru/ozon/app/android/network/abtool/flag/FeatureFlagRegistrationModel;", "getFeatureFlags", "Lru/ozon/app/android/network/common/NetworkHeadersDependencies;", "getNetworkHeadersDependencies", "()Lru/ozon/app/android/network/common/NetworkHeadersDependencies;", "LLd0/c;", "getOzonLimbDiStore", "()LLd0/c;", "Lru/ozon/app/android/network/debug/ExtraHeadersService;", "getExtraHeadersService", "()Lru/ozon/app/android/network/debug/ExtraHeadersService;", "extraHeadersService", "network_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface NetworkComponentDependencies extends InterfaceC6958a {
    @NotNull
    String apiUrl();

    @NotNull
    AntibotPerfAnalyticService getAntibotPerfAnalyticService();

    @NotNull
    AppVersionService getAppVersionService();

    @NotNull
    AuthNetworkService getAuthNetworkService();

    @NotNull
    AutoTestTraceIdInterceptorDependencies getAutoTestTraceIdInterceptorDependencies();

    @NotNull
    Set<CookieListener> getCookieListeners();

    @NotNull
    DebugHeaderService getDebugHeaderService();

    @NotNull
    ExtraHeadersService getExtraHeadersService();

    @NotNull
    Set<FeatureFlagRegistrationModel> getFeatureFlags();

    Long getFeatureServiceRefreshInterval();

    @NotNull
    LogRequestsService getLogRequestsService();

    @NotNull
    Set<Object> getMoshiAdapters();

    @NotNull
    NetworkComponentConfig getNetworkComponentConfig();

    @NotNull
    NetworkHeadersDependencies getNetworkHeadersDependencies();

    @NotNull
    NetworkHistoryService getNetworkHistoryService();

    @NotNull
    Set<g> getOzonIdCookieHandlers();

    @NotNull
    c getOzonLimbDiStore();

    CookieManager getWebViewCookieManager();
}
