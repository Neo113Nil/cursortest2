package ru.ozon.app.android.storage.hosts;

import Fb0.e;
import Ib.a;
import U7.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storage.environment.EnvironmentService;
import ru.ozon.app.android.utils.AppType;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0010\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\fR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\rR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0016\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u001a\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001c\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0019R\u0011\u0010\u001e\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0019R\u0011\u0010 \u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0019R\u0011\u0010\"\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b!\u0010\u0019R\u0011\u0010$\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b#\u0010\u0019R\u0011\u0010&\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b%\u0010\u0019¨\u0006'"}, d2 = {"Lru/ozon/app/android/storage/hosts/CoreHosts;", "", "LIb/a;", "Lru/ozon/app/android/storage/environment/EnvironmentService;", "environmentServiceLazy", "Lru/ozon/app/android/utils/AppType;", "appType", "<init>", "(LIb/a;Lru/ozon/app/android/utils/AppType;)V", "", "isProd", "()Z", "LIb/a;", "Lru/ozon/app/android/utils/AppType;", "Lru/ozon/app/android/storage/hosts/FintechUrls;", "fintechUrls", "Lru/ozon/app/android/storage/hosts/FintechUrls;", "getFintechUrls", "()Lru/ozon/app/android/storage/hosts/FintechUrls;", "LFb0/e;", "getAppDomain", "()LFb0/e;", "appDomain", "", "getBaseUrl", "()Ljava/lang/String;", "baseUrl", "getBaseUrlSuffix", "baseUrlSuffix", "getVideoUploadingBaseHttpUrl", "videoUploadingBaseHttpUrl", "getVideoUploadingMetricsBaseHttpUrl", "videoUploadingMetricsBaseHttpUrl", "getVideoUploadingBaseWebSocketUrl", "videoUploadingBaseWebSocketUrl", "getWebSocketBaseUrl", "webSocketBaseUrl", "getMetricsDomainName", "metricsDomainName", "storage_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CoreHosts {

    @NotNull
    private final AppType appType;

    @NotNull
    private final a<EnvironmentService> environmentServiceLazy;

    @NotNull
    private final FintechUrls fintechUrls;

    public CoreHosts(@NotNull a<EnvironmentService> environmentServiceLazy, @NotNull AppType appType) {
        Intrinsics.checkNotNullParameter(environmentServiceLazy, "environmentServiceLazy");
        Intrinsics.checkNotNullParameter(appType, "appType");
        this.environmentServiceLazy = environmentServiceLazy;
        this.appType = appType;
        boolean isProd = isProd();
        this.fintechUrls = new FintechUrls(isProd ? "https://finance.ozon.ru" : "https://finance.ozonru.me", isProd ? "https://checkout.ozon.ru" : "https://checkout.ozonru.me", isProd ? "https://api.finance.ozon.ru" : "https://api.finance.ozonru.me", isProd ? "https://pins.finance.ozon.ru" : "https://pins.finance.ozonru.me", isProd ? "https://select.ozon.ru" : "https://select.ozonru.me");
    }

    private final boolean isProd() {
        return true;
    }

    @NotNull
    public final e getAppDomain() {
        return isProd() ? e.OZON_RU : e.OZONRU_ME;
    }

    @NotNull
    public final String getBaseUrl() {
        return d.e(getAppDomain().e(), "/");
    }

    @NotNull
    public final String getBaseUrlSuffix() {
        return getAppDomain().j();
    }

    @NotNull
    public final FintechUrls getFintechUrls() {
        return this.fintechUrls;
    }

    @NotNull
    public final String getMetricsDomainName() {
        return this.appType == AppType.SELECT ? "select.ozon.ru" : "ozon.ru";
    }

    @NotNull
    public final String getVideoUploadingBaseHttpUrl() {
        return isProd() ? "https://video-upload.ozone.ru" : "http://video-upload-api.stg.s.o3.ru";
    }

    @NotNull
    public final String getVideoUploadingBaseWebSocketUrl() {
        return isProd() ? "wss://video-upload.ozone.ru" : "ws://video-upload-api.stg.s.o3.ru";
    }

    @NotNull
    public final String getVideoUploadingMetricsBaseHttpUrl() {
        return isProd() ? "https://xapi.ozon.ru/perf-metrics-collector/" : "http://perf-metrics-collector.stg.a.o3.ru";
    }

    @NotNull
    public final String getWebSocketBaseUrl() {
        return isProd() ? "wss://ws.ozon.ru" : "wss://api-stg.ozonru.me";
    }
}
