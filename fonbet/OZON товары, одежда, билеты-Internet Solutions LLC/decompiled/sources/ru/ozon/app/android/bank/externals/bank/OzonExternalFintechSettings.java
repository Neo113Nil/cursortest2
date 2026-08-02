package ru.ozon.app.android.bank.externals.bank;

import L30.o;
import S90.b;
import android.content.Context;
import android.content.SharedPreferences;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.bank.R$drawable;
import ru.ozon.app.android.bank.R$string;
import ru.ozon.app.android.bank.externals.ExternalFintechSettingsUtilsKt;
import ru.ozon.app.android.location.AreaLocalStore;
import ru.ozon.app.android.network.version.AppVersionService;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentConfig;
import ru.ozon.app.android.platform.flavor.FlavorType;
import ru.ozon.app.android.storage.appversion.AppVersionStorage;
import ru.ozon.app.android.storage.environment.EnvironmentService;
import ru.ozon.app.android.storage.hosts.FintechUrls;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.fintech.settings.domain.ExternalFintechSettings;
import ru.ozon.fintech.settings.models.a;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0000\u0018\u0000 ^2\u00020\u0001:\u0001^B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0011\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0016\u0010\u0014J\u000f\u0010\u0017\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0017\u0010\u0014J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001c\u0010\u001aJ\u000f\u0010\u001d\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001d\u0010\u001aJ\u000f\u0010\u001e\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010!R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\"R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010#R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010$R\u001a\u0010&\u001a\u00020%8\u0016X\u0096D¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001a\u0010*\u001a\u00020\u00128\u0016X\u0096D¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010\u0014R\u001a\u0010-\u001a\u00020\u00128\u0016X\u0096D¢\u0006\f\n\u0004\b-\u0010+\u001a\u0004\b.\u0010\u0014R\u001a\u0010/\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u0010+\u001a\u0004\b0\u0010\u0014R\u001a\u00101\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u0010+\u001a\u0004\b2\u0010\u0014R\u001a\u00103\u001a\u00020\u00188\u0016X\u0096D¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u0010\u001aR\u001a\u00106\u001a\u00020\u00188\u0016X\u0096D¢\u0006\f\n\u0004\b6\u00104\u001a\u0004\b7\u0010\u001aR\u001a\u00108\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b8\u0010+\u001a\u0004\b9\u0010\u0014R\u001a\u0010:\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b:\u0010+\u001a\u0004\b;\u0010\u0014R\u001a\u0010<\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b<\u0010+\u001a\u0004\b=\u0010\u0014R\u001a\u0010>\u001a\u00020\u00188\u0016X\u0096D¢\u0006\f\n\u0004\b>\u00104\u001a\u0004\b>\u0010\u001fR\u001a\u0010?\u001a\u00020%8\u0016X\u0096D¢\u0006\f\n\u0004\b?\u0010'\u001a\u0004\b@\u0010)R\u001a\u0010B\u001a\u00020A8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u001a\u0010F\u001a\u00020%8\u0016X\u0096D¢\u0006\f\n\u0004\bF\u0010'\u001a\u0004\bG\u0010)R\u001c\u0010H\u001a\u0004\u0018\u00010\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\bH\u0010+\u001a\u0004\bI\u0010\u0014R\u001a\u0010J\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\bJ\u0010+\u001a\u0004\bK\u0010\u0014R\u001a\u0010L\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\bL\u0010+\u001a\u0004\bM\u0010\u0014R\u001a\u0010N\u001a\u00020%8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bN\u0010'\u001a\u0004\bO\u0010PR\u001c\u0010Q\u001a\u0004\u0018\u00010%8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010PR\u001c\u0010T\u001a\u0004\u0018\u00010%8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bT\u0010R\u001a\u0004\bU\u0010PR\u001c\u0010V\u001a\u0004\u0018\u00010%8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bV\u0010R\u001a\u0004\bW\u0010PR\"\u0010X\u001a\u00020\u00188\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bX\u00104\u001a\u0004\bY\u0010\u001a\"\u0004\bZ\u0010[R\u0014\u0010]\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\\\u0010\u0014¨\u0006_"}, d2 = {"Lru/ozon/app/android/bank/externals/bank/OzonExternalFintechSettings;", "Lru/ozon/fintech/settings/domain/ExternalFintechSettings;", "Lru/ozon/app/android/platform/di/AndroidPlatformComponentConfig;", "androidPlatformComponentConfig", "Lru/ozon/app/android/storage/appversion/AppVersionStorage;", "appVersionStorage", "Landroid/content/Context;", "context", "Lru/ozon/app/android/storage/environment/EnvironmentService;", "environmentService", "Lru/ozon/app/android/location/AreaLocalStore;", "areaLocalStore", "Lru/ozon/app/android/storage/hosts/FintechUrls;", "urls", "Lru/ozon/app/android/network/version/AppVersionService;", "appVersionService", "<init>", "(Lru/ozon/app/android/platform/di/AndroidPlatformComponentConfig;Lru/ozon/app/android/storage/appversion/AppVersionStorage;Landroid/content/Context;Lru/ozon/app/android/storage/environment/EnvironmentService;Lru/ozon/app/android/location/AreaLocalStore;Lru/ozon/app/android/storage/hosts/FintechUrls;Lru/ozon/app/android/network/version/AppVersionService;)V", "", "getLocationUid", "()Ljava/lang/String;", "getPackageName", "getVersionCode", "getVersionName", "", "isForceStage", "()Z", "isUnderAutotest", "isStandAloneIntegration", "isQa", "isOzonStage", "()Ljava/lang/Boolean;", "Lru/ozon/app/android/platform/di/AndroidPlatformComponentConfig;", "Lru/ozon/app/android/storage/appversion/AppVersionStorage;", "Landroid/content/Context;", "Lru/ozon/app/android/storage/environment/EnvironmentService;", "Lru/ozon/app/android/location/AreaLocalStore;", "", "commsAppId", "I", "getCommsAppId", "()I", "commsBodyAppName", "Ljava/lang/String;", "getCommsBodyAppName", "commsHeaderAppName", "getCommsHeaderAppName", "apiUrlRelease", "getApiUrlRelease", "apiUrlStage", "getApiUrlStage", "needOzonId", "Z", "getNeedOzonId", "needOffline", "getNeedOffline", "appO3Name", "getAppO3Name", "bankUrlRelease", "getBankUrlRelease", "bankUrlStage", "getBankUrlStage", "isRooted", "defaultWalletIdRequestCode", "getDefaultWalletIdRequestCode", "LS90/b;", "featureFlagsConfig", "LS90/b;", "getFeatureFlagsConfig", "()LS90/b;", "tokenizationRequestCode", "getTokenizationRequestCode", "ozonSessionId", "getOzonSessionId", "pinsUrlRelease", "getPinsUrlRelease", "pinsUrlStage", "getPinsUrlStage", "pushIcon", "getPushIcon", "()Ljava/lang/Integer;", "splashBackColorRes", "Ljava/lang/Integer;", "getSplashBackColorRes", "splashTheme", "getSplashTheme", "splashUltraTheme", "getSplashUltraTheme", "globalFlagSecured", "getGlobalFlagSecured", "setGlobalFlagSecured", "(Z)V", "getAppName", "appName", "Companion", "ozonbank_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OzonExternalFintechSettings implements ExternalFintechSettings {

    @NotNull
    private final AndroidPlatformComponentConfig androidPlatformComponentConfig;

    @NotNull
    private final String apiUrlRelease;

    @NotNull
    private final String apiUrlStage;

    @NotNull
    private final String appO3Name;

    @NotNull
    private final AppVersionStorage appVersionStorage;

    @NotNull
    private final AreaLocalStore areaLocalStore;

    @NotNull
    private final String bankUrlRelease;

    @NotNull
    private final String bankUrlStage;
    private final int commsAppId;

    @NotNull
    private final String commsBodyAppName;

    @NotNull
    private final String commsHeaderAppName;

    @NotNull
    private final Context context;
    private final int defaultWalletIdRequestCode;

    @NotNull
    private final EnvironmentService environmentService;

    @NotNull
    private final b featureFlagsConfig;
    private boolean globalFlagSecured;
    private final boolean isRooted;
    private final boolean needOffline;
    private final boolean needOzonId;
    private final String ozonSessionId;

    @NotNull
    private final String pinsUrlRelease;

    @NotNull
    private final String pinsUrlStage;
    private final int pushIcon;
    private final Integer splashBackColorRes;
    private final Integer splashTheme;
    private final Integer splashUltraTheme;
    private final int tokenizationRequestCode;

    public OzonExternalFintechSettings(@NotNull AndroidPlatformComponentConfig androidPlatformComponentConfig, @NotNull AppVersionStorage appVersionStorage, @NotNull Context context, @NotNull EnvironmentService environmentService, @NotNull AreaLocalStore areaLocalStore, @NotNull FintechUrls urls, @NotNull AppVersionService appVersionService) {
        long j11;
        Intrinsics.checkNotNullParameter(androidPlatformComponentConfig, "androidPlatformComponentConfig");
        Intrinsics.checkNotNullParameter(appVersionStorage, "appVersionStorage");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(environmentService, "environmentService");
        Intrinsics.checkNotNullParameter(areaLocalStore, "areaLocalStore");
        Intrinsics.checkNotNullParameter(urls, "urls");
        Intrinsics.checkNotNullParameter(appVersionService, "appVersionService");
        this.androidPlatformComponentConfig = androidPlatformComponentConfig;
        this.appVersionStorage = appVersionStorage;
        this.context = context;
        this.environmentService = environmentService;
        this.areaLocalStore = areaLocalStore;
        this.commsBodyAppName = "";
        this.commsHeaderAppName = "";
        this.apiUrlRelease = urls.getApiBankUrl();
        this.apiUrlStage = urls.getApiBankUrl();
        this.needOzonId = true;
        AppVersionService.Companion companion = AppVersionService.INSTANCE;
        this.appO3Name = companion.isTravel(appVersionService) ? "ozonbanktravel_android" : companion.isSelect(appVersionService) ? "ozonbankselect_android" : companion.isFresh(appVersionService) ? "ozonbankfresh_android" : "ozonapp_android";
        this.bankUrlRelease = urls.getBankUrl();
        this.bankUrlStage = urls.getBankUrl();
        this.defaultWalletIdRequestCode = 8317;
        Set h11 = e0.h(a.a());
        String str = companion.isTravel(appVersionService) ? "TRAVEL_OZON" : companion.isSelect(appVersionService) ? "SELECT_OZON" : "OZON";
        try {
            j11 = ExternalFintechSettingsUtilsKt.getAppVersion(appVersionStorage.getVersionName());
        } catch (Throwable unused) {
            j11 = 0;
        }
        this.featureFlagsConfig = new b(h11, "mobile/obank/features", str, j11);
        this.tokenizationRequestCode = 8316;
        this.pinsUrlRelease = urls.getPinsBankUrl();
        this.pinsUrlStage = urls.getPinsBankUrl();
        this.pushIcon = R$drawable.ic_fin_push;
    }

    @Override // ru.ozon.fintech.settings.domain.ExternalFintechSettings
    @NotNull
    public String getApiUrlRelease() {
        return this.apiUrlRelease;
    }

    @Override // ru.ozon.fintech.settings.domain.ExternalFintechSettings
    @NotNull
    public String getApiUrlStage() {
        return this.apiUrlStage;
    }

    @Override // ru.ozon.fintech.settings.domain.ExternalFintechSettings
    @NotNull
    public String getAppName() {
        return StringProvider.getString(R$string.fintech_app_name_finance);
    }

    @Override // ru.ozon.fintech.settings.domain.ExternalFintechSettings
    @NotNull
    public String getAppO3Name() {
        return this.appO3Name;
    }

    @Override // ru.ozon.fintech.settings.domain.ExternalFintechSettings
    @NotNull
    public String getAppVersionCombined() {
        return ExternalFintechSettings.b.a(this);
    }

    @Override // ru.ozon.fintech.settings.domain.ExternalFintechSettings
    @NotNull
    public String getBankApiUrl(@NotNull SharedPreferences sharedPreferences) {
        return ExternalFintechSettings.b.b(this, sharedPreferences);
    }

    @Override // ru.ozon.fintech.settings.domain.ExternalFintechSettings
    @NotNull
    public String getBankUrl(@NotNull SharedPreferences sharedPreferences) {
        return ExternalFintechSettings.b.d(this, sharedPreferences);
    }

    @Override // ru.ozon.fintech.settings.domain.ExternalFintechSettings
    @NotNull
    public String getBankUrlRelease() {
        return this.bankUrlRelease;
    }

    @Override // ru.ozon.fintech.settings.domain.ExternalFintechSettings
    @NotNull
    public String getBankUrlStage() {
        return this.bankUrlStage;
    }

    @Override // ru.ozon.fintech.settings.domain.ExternalFintechSettings
    @NotNull
    public String getBasePath() {
        return "/";
    }

    @Override // ru.ozon.fintech.settings.domain.ExternalFintechSettings
    public int getCommsAppId() {
        return this.commsAppId;
    }

    @Override // ru.ozon.fintech.settings.domain.ExternalFintechSettings
    @NotNull
    public String getCommsBodyAppName() {
        return this.commsBodyAppName;
    }

    @Override // ru.ozon.fintech.settings.domain.ExternalFintechSettings
    @NotNull
    public String getCommsHeaderAppName() {
        return this.commsHeaderAppName;
    }

    @Override // ru.ozon.fintech.settings.domain.ExternalFintechSettings
    public int getDefaultWalletIdRequestCode() {
        return this.defaultWalletIdRequestCode;
    }

    @Override // ru.ozon.fintech.settings.domain.ExternalFintechSettings
    @NotNull
    public b getFeatureFlagsConfig() {
        return this.featureFlagsConfig;
    }

    @Override // ru.ozon.fintech.settings.domain.ExternalFintechSettings
    @NotNull
    public String getFintechSdkVersionName() {
        return "19.27.0";
    }

    @Override // ru.ozon.fintech.settings.domain.ExternalFintechSettings
    public boolean getGlobalFlagSecured() {
        return this.globalFlagSecured;
    }

    @Override // ru.ozon.fintech.settings.domain.ExternalFintechSettings
    public String getLocationUid() {
        return this.areaLocalStore.getLocationUid();
    }

    @Override // ru.ozon.fintech.settings.domain.ExternalFintechSettings
    public int getMinSupportedVersionWebView() {
        return 73;
    }

    @Override // ru.ozon.fintech.settings.domain.ExternalFintechSettings
    public boolean getNeedOffline() {
        return this.needOffline;
    }

    @Override // ru.ozon.fintech.settings.domain.ExternalFintechSettings
    public boolean getNeedOzonId() {
        return this.needOzonId;
    }

    @Override // ru.ozon.fintech.settings.domain.ExternalFintechSettings
    @NotNull
    public String getO3AppVersionCombined() {
        return ExternalFintechSettings.b.e(this);
    }

    @Override // ru.ozon.fintech.settings.domain.ExternalFintechSettings
    public String getOzonSessionId() {
        return this.ozonSessionId;
    }

    @Override // ru.ozon.fintech.settings.domain.ExternalFintechSettings
    @NotNull
    public String getPackageName() {
        String packageName = this.context.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
        return packageName;
    }

    @Override // ru.ozon.fintech.settings.domain.ExternalFintechSettings
    @NotNull
    public String getPinsUrl(@NotNull SharedPreferences sharedPreferences) {
        return ExternalFintechSettings.b.f(this, sharedPreferences);
    }

    @Override // ru.ozon.fintech.settings.domain.ExternalFintechSettings
    @NotNull
    public String getPinsUrlRelease() {
        return this.pinsUrlRelease;
    }

    @Override // ru.ozon.fintech.settings.domain.ExternalFintechSettings
    @NotNull
    public String getPinsUrlStage() {
        return this.pinsUrlStage;
    }

    @Override // ru.ozon.fintech.settings.domain.ExternalFintechSettings
    @NotNull
    public Integer getPushIcon() {
        return Integer.valueOf(this.pushIcon);
    }

    @Override // ru.ozon.fintech.settings.domain.ExternalFintechSettings
    public Integer getSplashBackColorRes() {
        return this.splashBackColorRes;
    }

    @Override // ru.ozon.fintech.settings.domain.ExternalFintechSettings
    public Integer getSplashTheme() {
        return this.splashTheme;
    }

    @Override // ru.ozon.fintech.settings.domain.ExternalFintechSettings
    public Integer getSplashUltraTheme() {
        return this.splashUltraTheme;
    }

    @Override // ru.ozon.fintech.settings.domain.ExternalFintechSettings
    public int getTokenizationRequestCode() {
        return this.tokenizationRequestCode;
    }

    @Override // ru.ozon.fintech.settings.domain.ExternalFintechSettings
    @NotNull
    public String getVersionCode() {
        return o.a(this.appVersionStorage.getVersionName());
    }

    @Override // ru.ozon.fintech.settings.domain.ExternalFintechSettings
    @NotNull
    public String getVersionName() {
        return this.appVersionStorage.getVersionNameWithoutSuffix();
    }

    @Override // ru.ozon.fintech.settings.domain.ExternalFintechSettings
    public boolean isForceStage() {
        return isOzonStage().booleanValue();
    }

    @Override // ru.ozon.fintech.settings.domain.ExternalFintechSettings
    @NotNull
    public Boolean isOzonStage() {
        return Boolean.valueOf(this.environmentService.isStage());
    }

    @Override // ru.ozon.fintech.settings.domain.ExternalFintechSettings
    public boolean isQa() {
        return this.androidPlatformComponentConfig.getFlavorType() == FlavorType.f93213QA;
    }

    @Override // ru.ozon.fintech.settings.domain.ExternalFintechSettings
    @NotNull
    public Boolean isRooted() {
        return Boolean.valueOf(this.isRooted);
    }

    @Override // ru.ozon.fintech.settings.domain.ExternalFintechSettings
    public boolean isStandAloneIntegration() {
        return false;
    }

    @Override // ru.ozon.fintech.settings.domain.ExternalFintechSettings
    public boolean isUnderAutotest() {
        return false;
    }

    @Override // ru.ozon.fintech.settings.domain.ExternalFintechSettings
    public boolean needShowNotificationRequest() {
        return false;
    }

    @Override // ru.ozon.fintech.settings.domain.ExternalFintechSettings
    public void setGlobalFlagSecured(boolean z11) {
        this.globalFlagSecured = z11;
    }
}
