package ru.ozon.fintech.settings.domain;

import V.e;
import android.content.SharedPreferences;
import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0018\u0002\n\u0002\b\u0016\bg\u0018\u0000 S2\u00020\u0001:\u0001TJ\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0004J\u0011\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH&¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\nH&¢\u0006\u0004\b\u000e\u0010\fJ\u000f\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\fJ\u000f\u0010\u0010\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\fJ\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0014\u0010\fJ\u000f\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0004J\u0011\u0010\u0016\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0016\u0010\fJ\u0017\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001b\u0010\fJ\u0017\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001c\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001d\u0010\u001aJ\u0017\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b \u0010\u001aR\u0016\u0010#\u001a\u0004\u0018\u00010\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0014\u0010%\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\u0004R\u0014\u0010'\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b&\u0010\u0004R\u0016\u0010(\u001a\u0004\u0018\u00010\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b(\u0010\tR\u0014\u0010*\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b)\u0010\fR\u0014\u0010,\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b+\u0010\fR\u0014\u0010.\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b-\u0010\fR\u0014\u00100\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b/\u0010\fR\u0014\u00102\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b1\u0010\fR\u0014\u00104\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b3\u0010\fR\u0014\u00106\u001a\u00020\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b5\u0010\u0013R\u0014\u00108\u001a\u00020\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b7\u0010\u0013R\u0014\u0010:\u001a\u00020\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b9\u0010\u0013R\u0014\u0010<\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b;\u0010\fR\u0014\u0010>\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b=\u0010\fR\u0014\u0010B\u001a\u00020?8&X¦\u0004¢\u0006\u0006\u001a\u0004\b@\u0010AR\u0016\u0010D\u001a\u0004\u0018\u00010\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\bC\u0010\fR\u0016\u0010F\u001a\u0004\u0018\u00010\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\bE\u0010\fR\u0016\u0010H\u001a\u0004\u0018\u00010\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\bG\u0010\fR\u0016\u0010J\u001a\u0004\u0018\u00010\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\bI\u0010\"R\u0016\u0010L\u001a\u0004\u0018\u00010\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\bK\u0010\"R\u0016\u0010N\u001a\u0004\u0018\u00010\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\bM\u0010\"R\u001c\u0010R\u001a\u00020\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\bO\u0010\u0004\"\u0004\bP\u0010Q¨\u0006U"}, d2 = {"Lru/ozon/fintech/settings/domain/ExternalFintechSettings;", "", "", "isStandAloneIntegration", "()Z", "isForceStage", "isUnderAutotest", "isQa", "isOzonStage", "()Ljava/lang/Boolean;", "", "getVersionCode", "()Ljava/lang/String;", "getVersionName", "getPackageName", "getAppVersionCombined", "getO3AppVersionCombined", "", "getMinSupportedVersionWebView", "()I", "getFintechSdkVersionName", "needShowNotificationRequest", "getLocationUid", "Landroid/content/SharedPreferences;", "sharedPreferences", "getPinsUrl", "(Landroid/content/SharedPreferences;)Ljava/lang/String;", "getBasePath", "getBankApiUrl", "getBankUrl", "isForceWebBankServerFromSp", "(Landroid/content/SharedPreferences;)Z", "getBankServerUrlFromSP", "getSplashBackColorRes", "()Ljava/lang/Integer;", "splashBackColorRes", "getNeedOzonId", "needOzonId", "getNeedOffline", "needOffline", "isRooted", "getBankUrlRelease", "bankUrlRelease", "getBankUrlStage", "bankUrlStage", "getApiUrlRelease", "apiUrlRelease", "getApiUrlStage", "apiUrlStage", "getPinsUrlStage", "pinsUrlStage", "getPinsUrlRelease", "pinsUrlRelease", "getTokenizationRequestCode", "tokenizationRequestCode", "getDefaultWalletIdRequestCode", "defaultWalletIdRequestCode", "getCommsAppId", "commsAppId", "getCommsHeaderAppName", "commsHeaderAppName", "getCommsBodyAppName", "commsBodyAppName", "LS90/b;", "getFeatureFlagsConfig", "()LS90/b;", "featureFlagsConfig", "getAppO3Name", "appO3Name", "getOzonSessionId", "ozonSessionId", "getAppName", "appName", "getPushIcon", "pushIcon", "getSplashTheme", "splashTheme", "getSplashUltraTheme", "splashUltraTheme", "getGlobalFlagSecured", "setGlobalFlagSecured", "(Z)V", "globalFlagSecured", "Companion", "a", "fintech-settings_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface ExternalFintechSettings {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f97020a;

    @NotNull
    public static final String FORCE_WEB_BANK_SERVER_FROM_SP = "force_web_bank_server_from_sp";

    @NotNull
    public static final String OZON_SP_SERVER_KEY = "fintech_web_bank_server";

    @NotNull
    public static final String OZON_SP_SERVER_LOCALHOST = "fintech_web_bank_server_localhost";

    @NotNull
    public static final String OZON_SP_SERVER_MANUAL = "fintech_web_bank_server_manual";

    @NotNull
    public static final String OZON_SP_SERVER_VALUE_HANDS = "Hands";

    @NotNull
    public static final String OZON_SP_SERVER_VALUE_LOCALHOST = "Localhost";

    @NotNull
    public static final String OZON_SP_SERVER_VALUE_PROD = "Production";

    @NotNull
    public static final String OZON_SP_SERVER_VALUE_STAGE = "Stage";

    /* renamed from: ru.ozon.fintech.settings.domain.ExternalFintechSettings$a, reason: from kotlin metadata */
    /* loaded from: classes3.dex */
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f97020a = new Companion();
    }

    /* loaded from: classes3.dex */
    public static final class b {
        @NotNull
        public static String a(@NotNull ExternalFintechSettings externalFintechSettings) {
            return e.b(new Object[]{externalFintechSettings.getFintechSdkVersionName(), externalFintechSettings.getPackageName(), externalFintechSettings.getVersionName()}, 3, "app/android/%s/%s/%s", "format(...)");
        }

        @NotNull
        public static String b(@NotNull ExternalFintechSettings externalFintechSettings, @NotNull SharedPreferences sharedPreferences) {
            Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
            if (externalFintechSettings.isQa()) {
                boolean isForceStage = externalFintechSettings.isForceStage();
                Boolean isOzonStage = externalFintechSettings.isOzonStage();
                Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
                String string = sharedPreferences.getString(ExternalFintechSettings.OZON_SP_SERVER_KEY, ExternalFintechSettings.OZON_SP_SERVER_VALUE_PROD);
                if (isForceStage || ((isOzonStage != null && isOzonStage.booleanValue()) || ((isOzonStage == null || isOzonStage.booleanValue()) && !Intrinsics.d(string, ExternalFintechSettings.OZON_SP_SERVER_VALUE_PROD)))) {
                    return externalFintechSettings.getApiUrlStage();
                }
            }
            return externalFintechSettings.getApiUrlRelease();
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        private static String c(ExternalFintechSettings externalFintechSettings, SharedPreferences sharedPreferences) {
            String string;
            String string2;
            String bankUrlRelease = externalFintechSettings.getBankUrlRelease();
            String bankUrlStage = externalFintechSettings.getBankUrlStage();
            String string3 = sharedPreferences.getString(ExternalFintechSettings.OZON_SP_SERVER_KEY, ExternalFintechSettings.OZON_SP_SERVER_VALUE_PROD);
            if (string3 != null) {
                switch (string3.hashCode()) {
                    case -548483879:
                        string3.equals(ExternalFintechSettings.OZON_SP_SERVER_VALUE_PROD);
                        break;
                    case 69492164:
                        if (string3.equals(ExternalFintechSettings.OZON_SP_SERVER_VALUE_HANDS) && (string = sharedPreferences.getString(ExternalFintechSettings.OZON_SP_SERVER_MANUAL, bankUrlRelease)) != null) {
                            return string;
                        }
                        break;
                    case 80204510:
                        if (string3.equals(ExternalFintechSettings.OZON_SP_SERVER_VALUE_STAGE)) {
                            return bankUrlStage;
                        }
                        break;
                    case 799360883:
                        if (string3.equals(ExternalFintechSettings.OZON_SP_SERVER_VALUE_LOCALHOST) && (string2 = sharedPreferences.getString(ExternalFintechSettings.OZON_SP_SERVER_LOCALHOST, bankUrlRelease)) != null) {
                            return string2;
                        }
                        break;
                }
            }
            return bankUrlRelease;
        }

        @NotNull
        public static String d(@NotNull ExternalFintechSettings externalFintechSettings, @NotNull SharedPreferences sharedPreferences) {
            Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
            boolean z11 = sharedPreferences.getBoolean(ExternalFintechSettings.FORCE_WEB_BANK_SERVER_FROM_SP, false);
            boolean isForceStage = externalFintechSettings.isForceStage();
            Boolean isOzonStage = externalFintechSettings.isOzonStage();
            String bankUrlRelease = externalFintechSettings.getBankUrlRelease();
            String bankUrlStage = externalFintechSettings.getBankUrlStage();
            if (externalFintechSettings.isQa() && z11) {
                bankUrlRelease = c(externalFintechSettings, sharedPreferences);
            } else {
                if (!externalFintechSettings.isQa() || !isForceStage) {
                    if (externalFintechSettings.isQa() && externalFintechSettings.isStandAloneIntegration()) {
                        bankUrlRelease = c(externalFintechSettings, sharedPreferences);
                    } else if (!externalFintechSettings.isQa() || externalFintechSettings.isStandAloneIntegration() || isOzonStage == null || !isOzonStage.booleanValue()) {
                        if (externalFintechSettings.isQa() && !externalFintechSettings.isStandAloneIntegration() && isOzonStage != null) {
                            isOzonStage.booleanValue();
                        }
                    }
                }
                bankUrlRelease = bankUrlStage;
            }
            return h.D0(bankUrlRelease, '/');
        }

        @NotNull
        public static String e(@NotNull ExternalFintechSettings externalFintechSettings) {
            return e.b(new Object[]{externalFintechSettings.getVersionName(), externalFintechSettings.getVersionCode()}, 2, "%s(%s)", "format(...)");
        }

        @NotNull
        public static String f(@NotNull ExternalFintechSettings externalFintechSettings, @NotNull SharedPreferences sharedPreferences) {
            Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
            if (externalFintechSettings.isQa()) {
                boolean isForceStage = externalFintechSettings.isForceStage();
                Boolean isOzonStage = externalFintechSettings.isOzonStage();
                Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
                String string = sharedPreferences.getString(ExternalFintechSettings.OZON_SP_SERVER_KEY, ExternalFintechSettings.OZON_SP_SERVER_VALUE_PROD);
                if (isForceStage || ((isOzonStage != null && isOzonStage.booleanValue()) || ((isOzonStage == null || isOzonStage.booleanValue()) && !Intrinsics.d(string, ExternalFintechSettings.OZON_SP_SERVER_VALUE_PROD)))) {
                    return externalFintechSettings.getPinsUrlStage();
                }
            }
            return externalFintechSettings.getPinsUrlRelease();
        }
    }

    @NotNull
    String getApiUrlRelease();

    @NotNull
    String getApiUrlStage();

    String getAppName();

    String getAppO3Name();

    @NotNull
    String getAppVersionCombined();

    @NotNull
    String getBankApiUrl(@NotNull SharedPreferences sharedPreferences);

    @NotNull
    String getBankUrl(@NotNull SharedPreferences sharedPreferences);

    @NotNull
    String getBankUrlRelease();

    @NotNull
    String getBankUrlStage();

    @NotNull
    String getBasePath();

    int getCommsAppId();

    @NotNull
    String getCommsBodyAppName();

    @NotNull
    String getCommsHeaderAppName();

    int getDefaultWalletIdRequestCode();

    @NotNull
    S90.b getFeatureFlagsConfig();

    @NotNull
    String getFintechSdkVersionName();

    boolean getGlobalFlagSecured();

    String getLocationUid();

    int getMinSupportedVersionWebView();

    boolean getNeedOffline();

    boolean getNeedOzonId();

    @NotNull
    String getO3AppVersionCombined();

    String getOzonSessionId();

    @NotNull
    String getPackageName();

    @NotNull
    String getPinsUrl(@NotNull SharedPreferences sharedPreferences);

    @NotNull
    String getPinsUrlRelease();

    @NotNull
    String getPinsUrlStage();

    Integer getPushIcon();

    Integer getSplashBackColorRes();

    Integer getSplashTheme();

    Integer getSplashUltraTheme();

    int getTokenizationRequestCode();

    @NotNull
    String getVersionCode();

    @NotNull
    String getVersionName();

    boolean isForceStage();

    Boolean isOzonStage();

    boolean isQa();

    Boolean isRooted();

    boolean isStandAloneIntegration();

    boolean isUnderAutotest();

    boolean needShowNotificationRequest();

    void setGlobalFlagSecured(boolean z11);
}
