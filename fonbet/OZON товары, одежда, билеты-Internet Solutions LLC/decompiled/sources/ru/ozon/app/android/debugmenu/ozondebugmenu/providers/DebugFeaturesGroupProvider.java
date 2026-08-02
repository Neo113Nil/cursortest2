package ru.ozon.app.android.debugmenu.ozondebugmenu.providers;

import GZ.g;
import U20.a;
import U20.b;
import android.content.SharedPreferences;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import r20.AbstractC9166c;
import ru.ozon.app.android.debugmenu.debugscreen.abtool.AbToggleRouter;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.network.flags.ApplicationCrashReporterSampleRateFlag;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentConfig;
import ru.ozon.app.android.platform.flavor.FlavorType;
import ru.ozon.app.android.storage.appversion.AppVersionStorage;
import ru.ozon.app.android.storage.debug.DebugToolsService;
import ru.ozon.app.android.update.InAppUpdateIntervalStorage;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fBI\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0019R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001aR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001cR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001dR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001e¨\u0006 "}, d2 = {"Lru/ozon/app/android/debugmenu/ozondebugmenu/providers/DebugFeaturesGroupProvider;", "Lr20/c;", "Lru/ozon/app/android/storage/appversion/AppVersionStorage;", "appVersionStorage", "Lru/ozon/app/android/platform/di/AndroidPlatformComponentConfig;", "config", "Lru/ozon/app/android/storage/debug/DebugToolsService;", "debugToolsService", "Lru/ozon/app/android/network/abtool/FeatureService;", "featureService", "Lru/ozon/app/android/update/InAppUpdateIntervalStorage;", "inAppUpdateIntervalStorage", "LGZ/g;", "ozonRouter", "Landroid/content/SharedPreferences;", "sharedPreferences", "Lru/ozon/app/android/debugmenu/debugscreen/abtool/AbToggleRouter;", "abToggleRouter", "<init>", "(Lru/ozon/app/android/storage/appversion/AppVersionStorage;Lru/ozon/app/android/platform/di/AndroidPlatformComponentConfig;Lru/ozon/app/android/storage/debug/DebugToolsService;Lru/ozon/app/android/network/abtool/FeatureService;Lru/ozon/app/android/update/InAppUpdateIntervalStorage;LGZ/g;Landroid/content/SharedPreferences;Lru/ozon/app/android/debugmenu/debugscreen/abtool/AbToggleRouter;)V", "LU20/a;", "provide", "()LU20/a;", "Lru/ozon/app/android/storage/appversion/AppVersionStorage;", "Lru/ozon/app/android/platform/di/AndroidPlatformComponentConfig;", "Lru/ozon/app/android/storage/debug/DebugToolsService;", "Lru/ozon/app/android/network/abtool/FeatureService;", "Lru/ozon/app/android/update/InAppUpdateIntervalStorage;", "LGZ/g;", "Landroid/content/SharedPreferences;", "Lru/ozon/app/android/debugmenu/debugscreen/abtool/AbToggleRouter;", "Companion", "debugmenu_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DebugFeaturesGroupProvider extends AbstractC9166c {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final AbToggleRouter abToggleRouter;

    @NotNull
    private final AppVersionStorage appVersionStorage;

    @NotNull
    private final AndroidPlatformComponentConfig config;

    @NotNull
    private final DebugToolsService debugToolsService;

    @NotNull
    private final FeatureService featureService;

    @NotNull
    private final InAppUpdateIntervalStorage inAppUpdateIntervalStorage;

    @NotNull
    private final g ozonRouter;

    @NotNull
    private final SharedPreferences sharedPreferences;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/debugmenu/ozondebugmenu/providers/DebugFeaturesGroupProvider$Companion;", "", "<init>", "()V", "DEBUG_FEATURES", "", "GROUP", "LEAK_CANARY", "COMMIT_HASH", "RESET_COMMIT_HASH", "ATOM_BOUNDS", "PAGE_INFO_BUTTON", "SAMPLE_RATE", "CHANGE_APP_VERSION", "FF_INTERVAL", "REFRESH_IN_APP_UPDATE", "INSTALL_DEBUG_FONT_ENABLER_APP", "COPY_COMMAND_TO_ENABLE_DEBUG_FONT_ENABLER_APP", "EXTERNAL_CRASH", "NON_FATAL_SENTRY", "NON_FATAL", "debugmenu_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public DebugFeaturesGroupProvider(@NotNull AppVersionStorage appVersionStorage, @NotNull AndroidPlatformComponentConfig config, @NotNull DebugToolsService debugToolsService, @NotNull FeatureService featureService, @NotNull InAppUpdateIntervalStorage inAppUpdateIntervalStorage, @NotNull g ozonRouter, @NotNull SharedPreferences sharedPreferences, @NotNull AbToggleRouter abToggleRouter) {
        Intrinsics.checkNotNullParameter(appVersionStorage, "appVersionStorage");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(debugToolsService, "debugToolsService");
        Intrinsics.checkNotNullParameter(featureService, "featureService");
        Intrinsics.checkNotNullParameter(inAppUpdateIntervalStorage, "inAppUpdateIntervalStorage");
        Intrinsics.checkNotNullParameter(ozonRouter, "ozonRouter");
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        Intrinsics.checkNotNullParameter(abToggleRouter, "abToggleRouter");
        this.appVersionStorage = appVersionStorage;
        this.config = config;
        this.debugToolsService = debugToolsService;
        this.featureService = featureService;
        this.inAppUpdateIntervalStorage = inAppUpdateIntervalStorage;
        this.ozonRouter = ozonRouter;
        this.sharedPreferences = sharedPreferences;
        this.abToggleRouter = abToggleRouter;
    }

    @Override // r20.AbstractC9166c
    @NotNull
    public a provide() {
        b.i iVar = this.config.getFlavorType() == FlavorType.f93213QA ? new b.i("debugFeaturesLeakCanary", "Включить LeakCanary", this.sharedPreferences.getBoolean("PREF_LEAK_CANARY_ENABLED", true), new DebugFeaturesGroupProvider$provide$1(this), null, 48) : null;
        String commitHash = this.debugToolsService.getCommitHash();
        if (commitHash == null) {
            commitHash = "";
        }
        b.g gVar = new b.g("debugFeaturesCommitHash", commitHash, "Commit hash", new DebugFeaturesGroupProvider$provide$2(this));
        b.C0551b c0551b = new b.C0551b("debugFeaturesResetCommitHash", "Reset Commit Hash", new DebugFeaturesGroupProvider$provide$3(this));
        b.i iVar2 = new b.i("debugFeaturesAtomBounds", "Показывать границы атомов", this.sharedPreferences.getBoolean("PREF_DEBUG_SHOW_ATOM_BOUNDS", false), new DebugFeaturesGroupProvider$provide$4(this), null, 48);
        b.c cVar = new b.c("debugFeaturesSampleRate", "Sample Rate", String.valueOf(this.featureService.getFloatKey(ApplicationCrashReporterSampleRateFlag.INSTANCE)), new DebugFeaturesGroupProvider$provide$5(this.abToggleRouter));
        b.c cVar2 = new b.c("debugFeaturesChangeAppVersion", "Изменение версии приложения", G.g.c(this.appVersionStorage.getVersionName(), "-", this.appVersionStorage.getVersionCode()), new DebugFeaturesGroupProvider$provide$6(this));
        Long ffRefreshIntervalMinutes = this.debugToolsService.getFfRefreshIntervalMinutes();
        String l11 = ffRefreshIntervalMinutes != null ? ffRefreshIntervalMinutes.toString() : null;
        b[] elements = {iVar, gVar, c0551b, iVar2, cVar, cVar2, new b.g("debugFeaturesFFInterval", l11 != null ? l11 : "", "Интервал обновления ФФ (минут)", new DebugFeaturesGroupProvider$provide$7(this)), new b.c("debugFeaturesInstallDebugFontEnablerApp", "Установить приложение для показа невидимых символов", "Для переключения, выполните команду \"adb shell cmd overlay enable (или disable) ru.ozon.app.android.debugfontenablerapp\"", DebugFeaturesGroupProvider$provide$8.INSTANCE), new b.c("debugFeaturesCopyCommandToEnableDebugFontEnablerApp", "Скопировать команду для показа невидимых символов в буффер обмена", null, DebugFeaturesGroupProvider$provide$9.INSTANCE), new b.C0551b("debugFeaturesRefreshInAppUpdate", "Очистка таймера In App Update", new DebugFeaturesGroupProvider$provide$10(this)), new b.C0551b("debugFeaturesExternalCrash", "External Crash", DebugFeaturesGroupProvider$provide$11.INSTANCE), new b.C0551b("debugFeaturesNonFatalSentry", "Non-fatal to Sentry", DebugFeaturesGroupProvider$provide$12.INSTANCE), new b.C0551b("debugFeaturesNonFatal", "Send non-fatal error", DebugFeaturesGroupProvider$provide$13.INSTANCE)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new a("debugFeaturesGroup", "Debug features", C7705l.B(elements));
    }
}
