package ru.ozon.app.android.storage.di;

import android.content.SharedPreferences;
import hi.InterfaceC6958a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storage.adult.AdultState;
import ru.ozon.app.android.storage.adult.AdultStateStore;
import ru.ozon.app.android.storage.analytics.WidgetLayoutTimeMetricsStorage;
import ru.ozon.app.android.storage.appversion.AppVersionStorage;
import ru.ozon.app.android.storage.auth.AuthStateStorage;
import ru.ozon.app.android.storage.auth.AuthTokenDataSource;
import ru.ozon.app.android.storage.auth.OzonIdCookieEvents;
import ru.ozon.app.android.storage.bugReport.BugReportCookieState;
import ru.ozon.app.android.storage.cookiePreference.ExtraCookieStorage;
import ru.ozon.app.android.storage.cookiePreference.RefreshByGenderCookieEvents;
import ru.ozon.app.android.storage.debug.DebugToolsService;
import ru.ozon.app.android.storage.debug.DebugToolsStorage;
import ru.ozon.app.android.storage.device.ApplicationInfoDataSource;
import ru.ozon.app.android.storage.entity.bundle.BundleStateDao;
import ru.ozon.app.android.storage.entity.network.NetworkHistoryDao;
import ru.ozon.app.android.storage.entity.sellerfavorites.SellerFavoriteDao;
import ru.ozon.app.android.storage.environment.EnvironmentService;
import ru.ozon.app.android.storage.extraHeaders.ExtraHeadersDataSource;
import ru.ozon.app.android.storage.failedExternalLink.FailedExternalLinkStorage;
import ru.ozon.app.android.storage.firstLaunch.FirstLaunchStateStorage;
import ru.ozon.app.android.storage.logging.HttpLoggingLevelStorage;
import ru.ozon.app.android.storage.railwaymock.RailwayMockStorage;
import ru.ozon.app.android.storage.startupArgs.StartupArgsService;
import ru.ozon.app.android.storage.subscribeAuthor.SubscribeAuthorsIdStorage;
import ru.ozon.app.android.storage.teensMode.TeensModeStorage;
import ru.ozon.app.android.storage.user.UserStatusStorage;

@Metadata(d1 = {"\u0000ä\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00060\u0001j\u0002`\u0002J\u000f\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0003H'¢\u0006\u0004\b\u0006\u0010\u0005J\u000f\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H&¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H&¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH&¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH&¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H&¢\u0006\u0004\b#\u0010$J\u000f\u0010&\u001a\u00020%H&¢\u0006\u0004\b&\u0010'J\u000f\u0010)\u001a\u00020(H&¢\u0006\u0004\b)\u0010*J\u000f\u0010,\u001a\u00020+H&¢\u0006\u0004\b,\u0010-J\u000f\u0010/\u001a\u00020.H&¢\u0006\u0004\b/\u00100J\u000f\u00102\u001a\u000201H&¢\u0006\u0004\b2\u00103J\u000f\u00105\u001a\u000204H&¢\u0006\u0004\b5\u00106J\u000f\u00108\u001a\u000207H&¢\u0006\u0004\b8\u00109J\u000f\u0010;\u001a\u00020:H&¢\u0006\u0004\b;\u0010<J\u000f\u0010>\u001a\u00020=H&¢\u0006\u0004\b>\u0010?J\u000f\u0010A\u001a\u00020@H&¢\u0006\u0004\bA\u0010BJ\u000f\u0010D\u001a\u00020CH&¢\u0006\u0004\bD\u0010EJ\u000f\u0010G\u001a\u00020FH&¢\u0006\u0004\bG\u0010HJ\u000f\u0010J\u001a\u00020IH&¢\u0006\u0004\bJ\u0010KJ\u000f\u0010M\u001a\u00020LH&¢\u0006\u0004\bM\u0010NJ\u000f\u0010P\u001a\u00020OH&¢\u0006\u0004\bP\u0010QJ\u000f\u0010S\u001a\u00020RH&¢\u0006\u0004\bS\u0010T¨\u0006U"}, d2 = {"Lru/ozon/app/android/storage/di/StorageComponentApi;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Landroid/content/SharedPreferences;", "getSharedPreferences", "()Landroid/content/SharedPreferences;", "getEncryptedSharedPreferences", "Lru/ozon/app/android/storage/appversion/AppVersionStorage;", "getAppVersionStorage", "()Lru/ozon/app/android/storage/appversion/AppVersionStorage;", "Lru/ozon/app/android/storage/debug/DebugToolsService;", "getDebugToolService", "()Lru/ozon/app/android/storage/debug/DebugToolsService;", "Lru/ozon/app/android/storage/user/UserStatusStorage;", "getUserStatusStorage", "()Lru/ozon/app/android/storage/user/UserStatusStorage;", "Lru/ozon/app/android/storage/auth/AuthStateStorage;", "getAuthStateStorage", "()Lru/ozon/app/android/storage/auth/AuthStateStorage;", "Lru/ozon/app/android/storage/auth/AuthTokenDataSource;", "getAuthTokenDataSource", "()Lru/ozon/app/android/storage/auth/AuthTokenDataSource;", "Lru/ozon/app/android/storage/auth/OzonIdCookieEvents;", "getOzonIdCookieEvents", "()Lru/ozon/app/android/storage/auth/OzonIdCookieEvents;", "Lru/ozon/app/android/storage/firstLaunch/FirstLaunchStateStorage;", "getFirstLaunchStateStorage", "()Lru/ozon/app/android/storage/firstLaunch/FirstLaunchStateStorage;", "Lru/ozon/app/android/storage/device/ApplicationInfoDataSource;", "getApplicationInfoStorage", "()Lru/ozon/app/android/storage/device/ApplicationInfoDataSource;", "Lru/ozon/app/android/storage/adult/AdultState;", "getAdultState", "()Lru/ozon/app/android/storage/adult/AdultState;", "Lru/ozon/app/android/storage/adult/AdultStateStore;", "getAdultStore", "()Lru/ozon/app/android/storage/adult/AdultStateStore;", "Lru/ozon/app/android/storage/teensMode/TeensModeStorage;", "getTeensModeStorage", "()Lru/ozon/app/android/storage/teensMode/TeensModeStorage;", "Lru/ozon/app/android/storage/cookiePreference/ExtraCookieStorage;", "getExtraCookieStorage", "()Lru/ozon/app/android/storage/cookiePreference/ExtraCookieStorage;", "Lru/ozon/app/android/storage/debug/DebugToolsStorage;", "getDebugToolsStorage", "()Lru/ozon/app/android/storage/debug/DebugToolsStorage;", "Lru/ozon/app/android/storage/extraHeaders/ExtraHeadersDataSource;", "getExtraHeadersDataSource", "()Lru/ozon/app/android/storage/extraHeaders/ExtraHeadersDataSource;", "Lru/ozon/app/android/storage/entity/network/NetworkHistoryDao;", "getNetworkHistoryDao", "()Lru/ozon/app/android/storage/entity/network/NetworkHistoryDao;", "Lru/ozon/app/android/storage/entity/sellerfavorites/SellerFavoriteDao;", "getSellerFavoriteDao", "()Lru/ozon/app/android/storage/entity/sellerfavorites/SellerFavoriteDao;", "Lru/ozon/app/android/storage/entity/bundle/BundleStateDao;", "getBundleStateDao", "()Lru/ozon/app/android/storage/entity/bundle/BundleStateDao;", "Lru/ozon/app/android/storage/logging/HttpLoggingLevelStorage;", "getHttpLoggingLevelStorage", "()Lru/ozon/app/android/storage/logging/HttpLoggingLevelStorage;", "Lru/ozon/app/android/storage/environment/EnvironmentService;", "getEnvironmentService", "()Lru/ozon/app/android/storage/environment/EnvironmentService;", "Lru/ozon/app/android/storage/railwaymock/RailwayMockStorage;", "getRailwayMockStorage", "()Lru/ozon/app/android/storage/railwaymock/RailwayMockStorage;", "Lru/ozon/app/android/storage/cookiePreference/RefreshByGenderCookieEvents;", "getRefreshByGenderCookieEvents", "()Lru/ozon/app/android/storage/cookiePreference/RefreshByGenderCookieEvents;", "Lru/ozon/app/android/storage/subscribeAuthor/SubscribeAuthorsIdStorage;", "getSubscribeAuthorsIdStorage", "()Lru/ozon/app/android/storage/subscribeAuthor/SubscribeAuthorsIdStorage;", "Lru/ozon/app/android/storage/startupArgs/StartupArgsService;", "getStartupArgsService", "()Lru/ozon/app/android/storage/startupArgs/StartupArgsService;", "Lru/ozon/app/android/storage/analytics/WidgetLayoutTimeMetricsStorage;", "getWidgetLayoutMetricsStorage", "()Lru/ozon/app/android/storage/analytics/WidgetLayoutTimeMetricsStorage;", "Lru/ozon/app/android/storage/bugReport/BugReportCookieState;", "getBugReportCookieState", "()Lru/ozon/app/android/storage/bugReport/BugReportCookieState;", "Lru/ozon/app/android/storage/failedExternalLink/FailedExternalLinkStorage;", "getFailedExternalPageStorage", "()Lru/ozon/app/android/storage/failedExternalLink/FailedExternalLinkStorage;", "storage_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface StorageComponentApi extends InterfaceC6958a {
    @NotNull
    AdultState getAdultState();

    @NotNull
    AdultStateStore getAdultStore();

    @NotNull
    AppVersionStorage getAppVersionStorage();

    @NotNull
    ApplicationInfoDataSource getApplicationInfoStorage();

    @NotNull
    AuthStateStorage getAuthStateStorage();

    @NotNull
    AuthTokenDataSource getAuthTokenDataSource();

    @NotNull
    BugReportCookieState getBugReportCookieState();

    @NotNull
    BundleStateDao getBundleStateDao();

    @NotNull
    DebugToolsService getDebugToolService();

    @NotNull
    DebugToolsStorage getDebugToolsStorage();

    @NotNull
    SharedPreferences getEncryptedSharedPreferences();

    @NotNull
    EnvironmentService getEnvironmentService();

    @NotNull
    ExtraCookieStorage getExtraCookieStorage();

    @NotNull
    ExtraHeadersDataSource getExtraHeadersDataSource();

    @NotNull
    FailedExternalLinkStorage getFailedExternalPageStorage();

    @NotNull
    FirstLaunchStateStorage getFirstLaunchStateStorage();

    @NotNull
    HttpLoggingLevelStorage getHttpLoggingLevelStorage();

    @NotNull
    NetworkHistoryDao getNetworkHistoryDao();

    @NotNull
    OzonIdCookieEvents getOzonIdCookieEvents();

    @NotNull
    RailwayMockStorage getRailwayMockStorage();

    @NotNull
    RefreshByGenderCookieEvents getRefreshByGenderCookieEvents();

    @NotNull
    SellerFavoriteDao getSellerFavoriteDao();

    @NotNull
    SharedPreferences getSharedPreferences();

    @NotNull
    StartupArgsService getStartupArgsService();

    @NotNull
    SubscribeAuthorsIdStorage getSubscribeAuthorsIdStorage();

    @NotNull
    TeensModeStorage getTeensModeStorage();

    @NotNull
    UserStatusStorage getUserStatusStorage();

    @NotNull
    WidgetLayoutTimeMetricsStorage getWidgetLayoutMetricsStorage();
}
