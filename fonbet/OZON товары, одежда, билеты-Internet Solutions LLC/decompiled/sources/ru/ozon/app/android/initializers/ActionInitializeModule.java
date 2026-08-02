package ru.ozon.app.android.initializers;

import Pc.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.AnalyticsInitializer;
import ru.ozon.app.android.environment.EnvironmentInitializer;
import ru.ozon.app.android.initializers.abtool.AbToolActionInitializer;
import ru.ozon.app.android.initializers.appsflyer.AppsFlyerActionInitializer;
import ru.ozon.app.android.initializers.atoms.AtomActionInitializer;
import ru.ozon.app.android.initializers.auth.AuthActionInitializer;
import ru.ozon.app.android.initializers.bundle.CleanCustomBundleStateActionInitializer;
import ru.ozon.app.android.initializers.cache.ComposerCacheInvalidatorInitializer;
import ru.ozon.app.android.initializers.configurators.ComposerActionInitializer;
import ru.ozon.app.android.initializers.configurators.ConfiguratorsActionInitializer;
import ru.ozon.app.android.initializers.debug.OzonDebugMenuSdkInitializer;
import ru.ozon.app.android.initializers.fintech.FintechLibActionInitializer;
import ru.ozon.app.android.initializers.gallery.OzonGalleryInitializer;
import ru.ozon.app.android.initializers.inappupdate.OzonInAppUpdateInitializer;
import ru.ozon.app.android.initializers.lastlocation.LastLocationInitializer;
import ru.ozon.app.android.initializers.lifecycle.ApplicationLifecycleInitializer;
import ru.ozon.app.android.initializers.limb.LimbActionInitializer;
import ru.ozon.app.android.initializers.localization.SetLocaleActionInitializer;
import ru.ozon.app.android.initializers.logger.ComposerLoggingActionsInitializer;
import ru.ozon.app.android.initializers.logger.HttpLoggingActionIntializer;
import ru.ozon.app.android.initializers.logger.LoggerInitializer;
import ru.ozon.app.android.initializers.messenger.MessengerFeatureActionInitializer;
import ru.ozon.app.android.initializers.nativePayment.NativePaymentInitializer;
import ru.ozon.app.android.initializers.sentry.SentrySessionIdInitializer;
import ru.ozon.app.android.initializers.shortcuts.DynamicShortcutsInitializer;
import ru.ozon.app.android.initializers.startup.time.StartupTimeTrackerInitializer;
import ru.ozon.app.android.initializers.tracker.TrackerActionInitializer;
import ru.ozon.app.android.initializers.tracker.TrackerDebugMenuInitializer;
import ru.ozon.app.android.initializers.updatecart.UpdateCartInitializer;
import ru.ozon.app.android.initializers.user.OzonIdAccountInitializer;
import ru.ozon.app.android.initializers.user.UserStateActionInitializer;
import ru.ozon.app.android.initializers.whitelisting.WhitelistingInitializer;
import ru.ozon.app.android.leakcanary.LeakCanaryInitializer;
import ru.ozon.app.android.pikazon.PikazonActionInitializer;
import ru.ozon.app.android.startup.initializers.NamedActionInitializerProvider;

@Metadata(d1 = {"\u0000À\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\n0\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\tJ\u001d\u0010\r\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\f0\u0004H\u0007¢\u0006\u0004\b\r\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0004H\u0007¢\u0006\u0004\b\u000f\u0010\tJ\u001d\u0010\u0011\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00100\u0004H\u0007¢\u0006\u0004\b\u0011\u0010\tJ\u001d\u0010\u0013\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00120\u0004H\u0007¢\u0006\u0004\b\u0013\u0010\tJ\u001d\u0010\u0015\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00140\u0004H\u0007¢\u0006\u0004\b\u0015\u0010\tJ\u001d\u0010\u0017\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00160\u0004H\u0007¢\u0006\u0004\b\u0017\u0010\tJ\u001d\u0010\u0019\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00180\u0004H\u0007¢\u0006\u0004\b\u0019\u0010\tJ\u001d\u0010\u001b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0004H\u0007¢\u0006\u0004\b\u001b\u0010\tJ\u001d\u0010\u001d\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0004H\u0007¢\u0006\u0004\b\u001d\u0010\tJ\u001d\u0010\u001f\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0004H\u0007¢\u0006\u0004\b\u001f\u0010\tJ\u001d\u0010!\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020 0\u0004H\u0007¢\u0006\u0004\b!\u0010\tJ\u001d\u0010#\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\"0\u0004H\u0007¢\u0006\u0004\b#\u0010\tJ\u001d\u0010%\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020$0\u0004H\u0007¢\u0006\u0004\b%\u0010\tJ\u001d\u0010'\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020&0\u0004H\u0007¢\u0006\u0004\b'\u0010\tJ\u001d\u0010)\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020(0\u0004H\u0007¢\u0006\u0004\b)\u0010\tJ\u001d\u0010+\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020*0\u0004H\u0007¢\u0006\u0004\b+\u0010\tJ\u001d\u0010-\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020,0\u0004H\u0007¢\u0006\u0004\b-\u0010\tJ\u001d\u0010/\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020.0\u0004H\u0007¢\u0006\u0004\b/\u0010\tJ\u001d\u00101\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002000\u0004H\u0007¢\u0006\u0004\b1\u0010\tJ\u001d\u00103\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002020\u0004H\u0007¢\u0006\u0004\b3\u0010\tJ\u001d\u00105\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002040\u0004H\u0007¢\u0006\u0004\b5\u0010\tJ\u001d\u00107\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002060\u0004H\u0007¢\u0006\u0004\b7\u0010\tJ\u001d\u00109\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002080\u0004H\u0007¢\u0006\u0004\b9\u0010\tJ\u001d\u0010;\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020:0\u0004H\u0007¢\u0006\u0004\b;\u0010\tJ\u001d\u0010=\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020<0\u0004H\u0007¢\u0006\u0004\b=\u0010\tJ\u001d\u0010?\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020>0\u0004H\u0007¢\u0006\u0004\b?\u0010\tJ\u001d\u0010A\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020@0\u0004H\u0007¢\u0006\u0004\bA\u0010\tJ\u001d\u0010C\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020B0\u0004H\u0007¢\u0006\u0004\bC\u0010\tJ\u001d\u0010E\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020D0\u0004H\u0007¢\u0006\u0004\bE\u0010\tJ\u001d\u0010G\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020F0\u0004H\u0007¢\u0006\u0004\bG\u0010\tJ\u001d\u0010I\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020H0\u0004H\u0007¢\u0006\u0004\bI\u0010\tJ\u001d\u0010K\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020J0\u0004H\u0007¢\u0006\u0004\bK\u0010\tJ\u001d\u0010M\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020L0\u0004H\u0007¢\u0006\u0004\bM\u0010\tJ\u001d\u0010O\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020N0\u0004H\u0007¢\u0006\u0004\bO\u0010\tJ\u001d\u0010Q\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020P0\u0004H\u0007¢\u0006\u0004\bQ\u0010\tJ\u001d\u0010S\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020R0\u0004H\u0007¢\u0006\u0004\bS\u0010\tJ\u001d\u0010U\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020T0\u0004H\u0007¢\u0006\u0004\bU\u0010\tJ\u001d\u0010W\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020V0\u0004H\u0007¢\u0006\u0004\bW\u0010\tJ\u001d\u0010Y\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020X0\u0004H\u0007¢\u0006\u0004\bY\u0010\tJ\u001d\u0010[\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020Z0\u0004H\u0007¢\u0006\u0004\b[\u0010\tJ\u001d\u0010]\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\\0\u0004H\u0007¢\u0006\u0004\b]\u0010\tJ\u001d\u0010_\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020^0\u0004H\u0007¢\u0006\u0004\b_\u0010\tJ\u001d\u0010a\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020`0\u0004H\u0007¢\u0006\u0004\ba\u0010\tJ\u001d\u0010c\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020b0\u0004H\u0007¢\u0006\u0004\bc\u0010\tJ\u001d\u0010e\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020d0\u0004H\u0007¢\u0006\u0004\be\u0010\tJ\u001d\u0010g\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020f0\u0004H\u0007¢\u0006\u0004\bg\u0010\tJ\u001d\u0010i\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020h0\u0004H\u0007¢\u0006\u0004\bi\u0010\t¨\u0006j"}, d2 = {"Lru/ozon/app/android/initializers/ActionInitializeModule;", "", "<init>", "()V", "LPc/a;", "Lru/ozon/app/android/initializers/tracker/TrackerDebugMenuInitializer;", "provider", "Lru/ozon/app/android/startup/initializers/NamedActionInitializerProvider;", "provideTrackerDebugMenuInitializer", "(LPc/a;)Lru/ozon/app/android/startup/initializers/NamedActionInitializerProvider;", "Lru/ozon/app/android/initializers/logger/LoggerInitializer;", "provideLoggerInitializer", "Lru/ozon/app/android/environment/EnvironmentInitializer;", "provideEnvironmentInitializer", "Lru/ozon/app/android/leakcanary/LeakCanaryInitializer;", "provideLeakCanaryInitializer", "Lru/ozon/app/android/initializers/RxErrorPluginInitializer;", "provideRxErrorPluginInitializer", "Lru/ozon/app/android/initializers/whitelisting/WhitelistingInitializer;", "provideWhitelistingInitializer", "Lru/ozon/app/android/initializers/ScreenRouterActionInitializer;", "provideScreenRouterActionInitializer", "Lru/ozon/app/android/initializers/user/OzonIdAccountInitializer;", "provideOzonIdAccountInitializer", "Lru/ozon/app/android/initializers/debug/OzonDebugMenuSdkInitializer;", "provideOzonDebugMenuSdkInitializer", "Lru/ozon/app/android/initializers/limb/LimbActionInitializer;", "provideLimbActionInitializer", "Lru/ozon/app/android/initializers/sentry/SentrySessionIdInitializer;", "provideSentrySessionIdInitializer", "Lru/ozon/app/android/initializers/abtool/AbToolActionInitializer;", "provideAbToolActionInitializer", "Lru/ozon/app/android/initializers/tracker/TrackerActionInitializer;", "provideTrackerActionInitializer", "Lru/ozon/app/android/analytics/AnalyticsInitializer;", "provideAnalyticsInitializer", "Lru/ozon/app/android/initializers/JodaActionInitializer;", "provideJodaActionInitializer", "Lru/ozon/app/android/pikazon/PikazonActionInitializer;", "providePikazonActionInitializer", "Lru/ozon/app/android/initializers/logger/HttpLoggingActionIntializer;", "provideHttpLoggingActionIntializer", "Lru/ozon/app/android/initializers/MapsActionInitializer;", "provideMapsActionInitializer", "Lru/ozon/app/android/initializers/lifecycle/ApplicationLifecycleInitializer;", "provideApplicationLifecycleInitializer", "Lru/ozon/app/android/initializers/auth/AuthActionInitializer;", "provideAuthActionInitializer", "Lru/ozon/app/android/initializers/PushInitializer;", "providePushInitializer", "Lru/ozon/app/android/initializers/atoms/AtomActionInitializer;", "provideAtomActionInitializer", "Lru/ozon/app/android/initializers/DarkThemeInitializer;", "provideDarkThemeInitializer", "Lru/ozon/app/android/initializers/TabConfigInitializer;", "provideTabConfigInitializer", "Lru/ozon/app/android/initializers/appsflyer/AppsFlyerActionInitializer;", "provideAppsFlyerActionInitializer", "Lru/ozon/app/android/initializers/user/UserStateActionInitializer;", "provideUserStateActionInitializer", "Lru/ozon/app/android/initializers/configurators/ConfiguratorsActionInitializer;", "provideConfiguratorsActionInitializer", "Lru/ozon/app/android/initializers/configurators/ComposerActionInitializer;", "provideComposerActionInitializer", "Lru/ozon/app/android/initializers/WebViewInitializer;", "provideWebViewInitializer", "Lru/ozon/app/android/initializers/StringsProviderInitializer;", "provideStringsProviderInitializer", "Lru/ozon/app/android/initializers/localization/SetLocaleActionInitializer;", "provideSetLocaleActionInitializer", "Lru/ozon/app/android/initializers/PrefetchManagerActionInitializer;", "providePrefetchManagerActionInitializer", "Lru/ozon/app/android/initializers/AdvertisingMessagingInitializer;", "provideAdvertisingMessagingInitializer", "Lru/ozon/app/android/initializers/cache/ComposerCacheInvalidatorInitializer;", "provideComposerCacheInvalidatorInitializer", "Lru/ozon/app/android/initializers/gallery/OzonGalleryInitializer;", "provideOzonGalleryInitializer", "Lru/ozon/app/android/initializers/updatecart/UpdateCartInitializer;", "provideUpdateCartInitializer", "Lru/ozon/app/android/initializers/FreshLiveActivityInitializer;", "provideFreshLiveActivityInitializer", "Lru/ozon/app/android/initializers/HapticsInitializer;", "provideHapticsInitializer", "Lru/ozon/app/android/initializers/logger/ComposerLoggingActionsInitializer;", "provideComposerLoggingActionsInitializer", "Lru/ozon/app/android/initializers/startup/time/StartupTimeTrackerInitializer;", "provideStartupTimeTrackerInitializer", "Lru/ozon/app/android/initializers/fintech/FintechLibActionInitializer;", "bindFintechLibActionInitializer", "Lru/ozon/app/android/initializers/lastlocation/LastLocationInitializer;", "provideLastLocationInitializer", "Lru/ozon/app/android/initializers/SberPayInitializer;", "provideSberPayInitializer", "Lru/ozon/app/android/initializers/nativePayment/NativePaymentInitializer;", "provideNativePaymentInitializer", "Lru/ozon/app/android/initializers/bundle/CleanCustomBundleStateActionInitializer;", "provideCleanCustomBundleStateActionInitializer", "Lru/ozon/app/android/initializers/JetpackComposeInitializer;", "provideJetpackComposeInitializer", "Lru/ozon/app/android/initializers/shortcuts/DynamicShortcutsInitializer;", "provideShortcutsInitializer", "Lru/ozon/app/android/initializers/inappupdate/OzonInAppUpdateInitializer;", "provideOzonInAppUpdateInitializer", "Lru/ozon/app/android/initializers/messenger/MessengerFeatureActionInitializer;", "provideMessengerFeatureActionInitializer", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ActionInitializeModule {
    @NotNull
    public final NamedActionInitializerProvider bindFintechLibActionInitializer(@NotNull final a<FintechLibActionInitializer> provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        return new NamedActionInitializerProvider(provider) { // from class: ru.ozon.app.android.initializers.ActionInitializeModule$bindFintechLibActionInitializer$$inlined$toNamedProvider$1
            private final a<FintechLibActionInitializer> provider;
            private final String tag;

            {
                Intrinsics.checkNotNullExpressionValue("FintechLibActionInitializer", "getSimpleName(...)");
                this.tag = "FintechLibActionInitializer";
                this.provider = provider;
            }

            @Override // ru.ozon.app.android.startup.initializers.NamedActionInitializerProvider
            public a<FintechLibActionInitializer> getProvider() {
                return this.provider;
            }

            @Override // ru.ozon.app.android.startup.initializers.NamedActionInitializerProvider
            public String getTag() {
                return this.tag;
            }
        };
    }

    @NotNull
    public final NamedActionInitializerProvider provideAbToolActionInitializer(@NotNull final a<AbToolActionInitializer> provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        return new NamedActionInitializerProvider(provider) { // from class: ru.ozon.app.android.initializers.ActionInitializeModule$provideAbToolActionInitializer$$inlined$toNamedProvider$1
            private final a<AbToolActionInitializer> provider;
            private final String tag;

            {
                Intrinsics.checkNotNullExpressionValue("AbToolActionInitializer", "getSimpleName(...)");
                this.tag = "AbToolActionInitializer";
                this.provider = provider;
            }

            @Override // ru.ozon.app.android.startup.initializers.NamedActionInitializerProvider
            public a<AbToolActionInitializer> getProvider() {
                return this.provider;
            }

            @Override // ru.ozon.app.android.startup.initializers.NamedActionInitializerProvider
            public String getTag() {
                return this.tag;
            }
        };
    }

    @NotNull
    public final NamedActionInitializerProvider provideAdvertisingMessagingInitializer(@NotNull final a<AdvertisingMessagingInitializer> provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        return new NamedActionInitializerProvider(provider) { // from class: ru.ozon.app.android.initializers.ActionInitializeModule$provideAdvertisingMessagingInitializer$$inlined$toNamedProvider$1
            private final a<AdvertisingMessagingInitializer> provider;
            private final String tag;

            {
                Intrinsics.checkNotNullExpressionValue("AdvertisingMessagingInitializer", "getSimpleName(...)");
                this.tag = "AdvertisingMessagingInitializer";
                this.provider = provider;
            }

            @Override // ru.ozon.app.android.startup.initializers.NamedActionInitializerProvider
            public a<AdvertisingMessagingInitializer> getProvider() {
                return this.provider;
            }

            @Override // ru.ozon.app.android.startup.initializers.NamedActionInitializerProvider
            public String getTag() {
                return this.tag;
            }
        };
    }

    @NotNull
    public final NamedActionInitializerProvider provideAnalyticsInitializer(@NotNull final a<AnalyticsInitializer> provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        return new NamedActionInitializerProvider(provider) { // from class: ru.ozon.app.android.initializers.ActionInitializeModule$provideAnalyticsInitializer$$inlined$toNamedProvider$1
            private final a<AnalyticsInitializer> provider;
            private final String tag;

            {
                Intrinsics.checkNotNullExpressionValue("AnalyticsInitializer", "getSimpleName(...)");
                this.tag = "AnalyticsInitializer";
                this.provider = provider;
            }

            @Override // ru.ozon.app.android.startup.initializers.NamedActionInitializerProvider
            public a<AnalyticsInitializer> getProvider() {
                return this.provider;
            }

            @Override // ru.ozon.app.android.startup.initializers.NamedActionInitializerProvider
            public String getTag() {
                return this.tag;
            }
        };
    }

    @NotNull
    public final NamedActionInitializerProvider provideApplicationLifecycleInitializer(@NotNull final a<ApplicationLifecycleInitializer> provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        return new NamedActionInitializerProvider(provider) { // from class: ru.ozon.app.android.initializers.ActionInitializeModule$provideApplicationLifecycleInitializer$$inlined$toNamedProvider$1
            private final a<ApplicationLifecycleInitializer> provider;
            private final String tag;

            {
                Intrinsics.checkNotNullExpressionValue("ApplicationLifecycleInitializer", "getSimpleName(...)");
                this.tag = "ApplicationLifecycleInitializer";
                this.provider = provider;
            }

            @Override // ru.ozon.app.android.startup.initializers.NamedActionInitializerProvider
            public a<ApplicationLifecycleInitializer> getProvider() {
                return this.provider;
            }

            @Override // ru.ozon.app.android.startup.initializers.NamedActionInitializerProvider
            public String getTag() {
                return this.tag;
            }
        };
    }

    @NotNull
    public final NamedActionInitializerProvider provideAppsFlyerActionInitializer(@NotNull final a<AppsFlyerActionInitializer> provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        return new NamedActionInitializerProvider(provider) { // from class: ru.ozon.app.android.initializers.ActionInitializeModule$provideAppsFlyerActionInitializer$$inlined$toNamedProvider$1
            private final a<AppsFlyerActionInitializer> provider;
            private final String tag;

            {
                Intrinsics.checkNotNullExpressionValue("AppsFlyerActionInitializer", "getSimpleName(...)");
                this.tag = "AppsFlyerActionInitializer";
                this.provider = provider;
            }

            @Override // ru.ozon.app.android.startup.initializers.NamedActionInitializerProvider
            public a<AppsFlyerActionInitializer> getProvider() {
                return this.provider;
            }

            @Override // ru.ozon.app.android.startup.initializers.NamedActionInitializerProvider
            public String getTag() {
                return this.tag;
            }
        };
    }

    @NotNull
    public final NamedActionInitializerProvider provideAtomActionInitializer(@NotNull final a<AtomActionInitializer> provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        return new NamedActionInitializerProvider(provider) { // from class: ru.ozon.app.android.initializers.ActionInitializeModule$provideAtomActionInitializer$$inlined$toNamedProvider$1
            private final a<AtomActionInitializer> provider;
            private final String tag;

            {
                Intrinsics.checkNotNullExpressionValue("AtomActionInitializer", "getSimpleName(...)");
                this.tag = "AtomActionInitializer";
                this.provider = provider;
            }

            @Override // ru.ozon.app.android.startup.initializers.NamedActionInitializerProvider
            public a<AtomActionInitializer> getProvider() {
                return this.provider;
            }

            @Override // ru.ozon.app.android.startup.initializers.NamedActionInitializerProvider
            public String getTag() {
                return this.tag;
            }
        };
    }

    @NotNull
    public final NamedActionInitializerProvider provideAuthActionInitializer(@NotNull final a<AuthActionInitializer> provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        return new NamedActionInitializerProvider(provider) { // from class: ru.ozon.app.android.initializers.ActionInitializeModule$provideAuthActionInitializer$$inlined$toNamedProvider$1
            private final a<AuthActionInitializer> provider;
            private final String tag;

            {
                Intrinsics.checkNotNullExpressionValue("AuthActionInitializer", "getSimpleName(...)");
                this.tag = "AuthActionInitializer";
                this.provider = provider;
            }

            @Override // ru.ozon.app.android.startup.initializers.NamedActionInitializerProvider
            public a<AuthActionInitializer> getProvider() {
                return this.provider;
            }

            @Override // ru.ozon.app.android.startup.initializers.NamedActionInitializerProvider
            public String getTag() {
                return this.tag;
            }
        };
    }

    @NotNull
    public final NamedActionInitializerProvider provideCleanCustomBundleStateActionInitializer(@NotNull final a<CleanCustomBundleStateActionInitializer> provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        return new NamedActionInitializerProvider(provider) { // from class: ru.ozon.app.android.initializers.ActionInitializeModule$provideCleanCustomBundleStateActionInitializer$$inlined$toNamedProvider$1
            private final a<CleanCustomBundleStateActionInitializer> provider;
            private final String tag;

            {
                Intrinsics.checkNotNullExpressionValue("CleanCustomBundleStateActionInitializer", "getSimpleName(...)");
                this.tag = "CleanCustomBundleStateActionInitializer";
                this.provider = provider;
            }

            @Override // ru.ozon.app.android.startup.initializers.NamedActionInitializerProvider
            public a<CleanCustomBundleStateActionInitializer> getProvider() {
                return this.provider;
            }

            @Override // ru.ozon.app.android.startup.initializers.NamedActionInitializerProvider
            public String getTag() {
                return this.tag;
            }
        };
    }

    @NotNull
    public final NamedActionInitializerProvider provideComposerActionInitializer(@NotNull final a<ComposerActionInitializer> provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        return new NamedActionInitializerProvider(provider) { // from class: ru.ozon.app.android.initializers.ActionInitializeModule$provideComposerActionInitializer$$inlined$toNamedProvider$1
            private final a<ComposerActionInitializer> provider;
            private final String tag;

            {
                Intrinsics.checkNotNullExpressionValue("ComposerActionInitializer", "getSimpleName(...)");
                this.tag = "ComposerActionInitializer";
                this.provider = provider;
            }

            @Override // ru.ozon.app.android.startup.initializers.NamedActionInitializerProvider
            public a<ComposerActionInitializer> getProvider() {
                return this.provider;
            }

            @Override // ru.ozon.app.android.startup.initializers.NamedActionInitializerProvider
            public String getTag() {
                return this.tag;
            }
        };
    }

    @NotNull
    public final NamedActionInitializerProvider provideComposerCacheInvalidatorInitializer(@NotNull final a<ComposerCacheInvalidatorInitializer> provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        return new NamedActionInitializerProvider(provider) { // from class: ru.ozon.app.android.initializers.ActionInitializeModule$provideComposerCacheInvalidatorInitializer$$inlined$toNamedProvider$1
            private final a<ComposerCacheInvalidatorInitializer> provider;
            private final String tag;

            {
                Intrinsics.checkNotNullExpressionValue("ComposerCacheInvalidatorInitializer", "getSimpleName(...)");
                this.tag = "ComposerCacheInvalidatorInitializer";
                this.provider = provider;
            }

            @Override // ru.ozon.app.android.startup.initializers.NamedActionInitializerProvider
            public a<ComposerCacheInvalidatorInitializer> getProvider() {
                return this.provider;
            }

            @Override // ru.ozon.app.android.startup.initializers.NamedActionInitializerProvider
            public String getTag() {
                return this.tag;
            }
        };
    }

    @NotNull
    public final NamedActionInitializerProvider provideComposerLoggingActionsInitializer(@NotNull final a<ComposerLoggingActionsInitializer> provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        return new NamedActionInitializerProvider(provider) { // from class: ru.ozon.app.android.initializers.ActionInitializeModule$provideComposerLoggingActionsInitializer$$inlined$toNamedProvider$1
            private final a<ComposerLoggingActionsInitializer> provider;
            private final String tag;

            {
                Intrinsics.checkNotNullExpressionValue("ComposerLoggingActionsInitializer", "getSimpleName(...)");
                this.tag = "ComposerLoggingActionsInitializer";
                this.provider = provider;
            }

            @Override // ru.ozon.app.android.startup.initializers.NamedActionInitializerProvider
            public a<ComposerLoggingActionsInitializer> getProvider() {
                return this.provider;
            }

            @Override // ru.ozon.app.android.startup.initializers.NamedActionInitializerProvider
            public String getTag() {
                return this.tag;
            }
        };
    }

    @NotNull
    public final NamedActionInitializerProvider provideConfiguratorsActionInitializer(@NotNull final a<ConfiguratorsActionInitializer> provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        return new NamedActionInitializerProvider(provider) { // from class: ru.ozon.app.android.initializers.ActionInitializeModule$provideConfiguratorsActionInitializer$$inlined$toNamedProvider$1
            private final a<ConfiguratorsActionInitializer> provider;
            private final String tag;

            {
                Intrinsics.checkNotNullExpressionValue("ConfiguratorsActionInitializer", "getSimpleName(...)");
                this.tag = "ConfiguratorsActionInitializer";
                this.provider = provider;
            }

            @Override // ru.ozon.app.android.startup.initializers.NamedActionInitializerProvider
            public a<ConfiguratorsActionInitializer> getProvider() {
                return this.provider;
            }

            @Override // ru.ozon.app.android.startup.initializers.NamedActionInitializerProvider
            public String getTag() {
                return this.tag;
            }
        };
    }

    @NotNull
    public final NamedActionInitializerProvider provideDarkThemeInitializer(@NotNull final a<DarkThemeInitializer> provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        return new NamedActionInitializerProvider(provider) { // from class: ru.ozon.app.android.initializers.ActionInitializeModule$provideDarkThemeInitializer$$inlined$toNamedProvider$1
            private final a<DarkThemeInitializer> provider;
            private final String tag;

            {
                Intrinsics.checkNotNullExpressionValue("DarkThemeInitializer", "getSimpleName(...)");
                this.tag = "DarkThemeInitializer";
                this.provider = provider;
            }

            @Override // ru.ozon.app.android.startup.initializers.NamedActionInitializerProvider
            public a<DarkThemeInitializer> getProvider() {
                return this.provider;
            }

            @Override // ru.ozon.app.android.startup.initializers.NamedActionInitializerProvider
            public String getTag() {
                return this.tag;
            }
        };
    }

    @NotNull
    public final NamedActionInitializerProvider provideEnvironmentInitializer(@NotNull final a<EnvironmentInitializer> provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        return new NamedActionInitializerProvider(provider) { // from class: ru.ozon.app.android.initializers.ActionInitializeModule$provideEnvironmentInitializer$$inlined$toNamedProvider$1
            private final a<EnvironmentInitializer> provider;
            private final String tag;

            {
                Intrinsics.checkNotNullExpressionValue("EnvironmentInitializer", "getSimpleName(...)");
                this.tag = "EnvironmentInitializer";
                this.provider = provider;
            }

            @Override // ru.ozon.app.android.startup.initializers.NamedActionInitializerProvider
            public a<EnvironmentInitializer> getProvider() {
                return this.provider;
            }

            @Override // ru.ozon.app.android.startup.initializers.NamedActionInitializerProvider
            public String getTag() {
                return this.tag;
            }
        };
    }

    @NotNull
    public final NamedActionInitializerProvider provideFreshLiveActivityInitializer(@NotNull final a<FreshLiveActivityInitializer> provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        return new NamedActionInitializerProvider(provider) { // from class: ru.ozon.app.android.initializers.ActionInitializeModule$provideFreshLiveActivityInitializer$$inlined$toNamedProvider$1
            private final a<FreshLiveActivityInitializer> provider;
            private final String tag;

            {
                Intrinsics.checkNotNullExpressionValue("FreshLiveActivityInitializer", "getSimpleName(...)");
                this.tag = "FreshLiveActivityInitializer";
                this.provider = provider;
            }

            @Override // ru.ozon.app.android.startup.initializers.NamedActionInitializerProvider
            public a<FreshLiveActivityInitializer> getProvider() {
                return this.provider;
            }

            @Override // ru.ozon.app.android.startup.initializers.NamedActionInitializerProvider
            public String getTag() {
                return this.tag;
            }
        };
    }

    @NotNull
    public final NamedActionInitializerProvider provideHapticsInitializer(@NotNull final a<HapticsInitializer> provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        return new NamedActionInitializerProvider(provider) { // from class: ru.ozon.app.android.initializers.ActionInitializeModule$provideHapticsInitializer$$inlined$toNamedProvider$1
            private final a<HapticsInitializer> provider;
            private final String tag;

            {
                Intrinsics.checkNotNullExpressionValue("HapticsInitializer", "getSimpleName(...)");
                this.tag = "HapticsInitializer";
                this.provider = provider;
            }

            @Override // ru.ozon.app.android.startup.initializers.NamedActionInitializerProvider
            public a<HapticsInitializer> getProvider() {
                return this.provider;
            }

            @Override // ru.ozon.app.android.startup.initializers.NamedActionInitializerProvider
            public String getTag() {
                return this.tag;
            }
        };
    }

    @NotNull
    public final NamedActionInitializerProvider provideHttpLoggingActionIntializer(@NotNull final a<HttpLoggingActionIntializer> provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        return new NamedActionInitializerProvider(provider) { // from class: ru.ozon.app.android.initializers.ActionInitializeModule$provideHttpLoggingActionIntializer$$inlined$toNamedProvider$1
            private final a<HttpLoggingActionIntializer> provider;
            private final String tag;

            {
                Intrinsics.checkNotNullExpressionValue("HttpLoggingActionIntializer", "getSimpleName(...)");
                this.tag = "HttpLoggingActionIntializer";
                this.provider = provider;
            }

            @Override // ru.ozon.app.android.startup.initializers.NamedActionInitializerProvider
            public a<HttpLoggingActionIntializer> getProvider() {
                return this.provider;
            }

            @Override // ru.ozon.app.android.startup.initializers.NamedActionInitializerProvider
            public String getTag() {
                return this.tag;
            }
        };
    }

    @NotNull
    public final NamedActionInitializerProvider provideJetpackComposeInitializer(@NotNull final a<JetpackComposeInitializer> provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        return new NamedActionInitializerProvider(provider) { // from class: ru.ozon.app.android.initializers.ActionInitializeModule$provideJetpackComposeInitializer$$inlined$toNamedProvider$1
            private final a<JetpackComposeInitializer> provider;
            private final String tag;

            {
                Intrinsics.checkNotNullExpressionValue("JetpackComposeInitializer", "getSimpleName(...)");
                this.tag = "JetpackComposeInitializer";
                this.provider = provider;
            }

            @Override // ru.ozon.app.android.startup.initializers.NamedActionInitializerProvider
            public a<JetpackComposeInitializer> getProvider() {
                return this.provider;
            }

            @Override // ru.ozon.app.android.startup.initializers.NamedActionInitializerProvider
            public String getTag() {
                return this.tag;
            }
        };
    }

    @NotNull
    public final NamedActionInitializerProvider provideJodaActionInitializer(@NotNull final a<JodaActionInitializer> provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        return new NamedActionInitializerProvider(provider) { // from class: ru.ozon.app.android.initializers.ActionInitializeModule$provideJodaActionInitializer$$inlined$toNamedProvider$1
            private final a<JodaActionInitializer> provider;
            private final String tag;

            {
                Intrinsics.checkNotNullExpressionValue("JodaActionInitializer", "getSimpleName(...)");
                this.tag = "JodaActionInitializer";
                this.provider = provider;
            }

            @Override // ru.ozon.app.android.startup.initializers.NamedActionInitializerProvider
            public a<JodaActionInitializer> getProvider() {
                return this.provider;
            }

            @Override // ru.ozon.app.android.startup.initializers.NamedActionInitializerProvider
            public String getTag() {
                return this.tag;
            }
        };
    }

    @NotNull
    public final NamedActionInitializerProvider provideLastLocationInitializer(@NotNull final a<LastLocationInitializer> provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        return new NamedActionInitializerProvider(provider) { // from class: ru.ozon.app.android.initializers.ActionInitializeModule$provideLastLocationInitializer$$inlined$toNamedProvider$1
            private final a<LastLocationInitializer> provider;
            private final String tag;

            {
                Intrinsics.checkNotNullExpressionValue("LastLocationInitializer", "getSimpleName(...)");
                this.tag = "LastLocationInitializer";
                this.provider = provider;
            }

            @Override // ru.ozon.app.android.startup.initializers.NamedActionInitializerProvider
            public a<LastLocationInitializer> getProvider() {
                return this.provider;
            }

            @Override // ru.ozon.app.android.startup.initializers.NamedActionInitializerProvider
            public String getTag() {
                return this.tag;
            }
        };
    }

    @NotNull
    public final NamedActionInitializerProvider provideLeakCanaryInitializer(@NotNull final a<LeakCanaryInitializer> provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        return new NamedActionInitializerProvider(provider) { // from class: ru.ozon.app.android.initializers.ActionInitializeModule$provideLeakCanaryInitializer$$inlined$toNamedProvider$1
            private final a<LeakCanaryInitializer> provider;
            private final String tag;

            {
                Intrinsics.checkNotNullExpressionValue("LeakCanaryInitializer", "getSimpleName(...)");
                this.tag = "LeakCanaryInitializer";
                this.provider = provider;
            }

            @Override // ru.ozon.app.android.startup.initializers.NamedActionInitializerProvider
            public a<LeakCanaryInitializer> getProvider() {
                return this.provider;
            }

            @Override // ru.ozon.app.android.startup.initializers.NamedActionInitializerProvider
            public String getTag() {
                return this.tag;
            }
        };
    }

    @NotNull
    public final NamedActionInitializerProvider provideLimbActionInitializer(@NotNull final a<LimbActionInitializer> provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        return new NamedActionInitializerProvider(provider) { // from class: ru.ozon.app.android.initializers.ActionInitializeModule$provideLimbActionInitializer$$inlined$toNamedProvider$1
            private final a<LimbActionInitializer> provider;
            private final String tag;

            {
                Intrinsics.checkNotNullExpressionValue("LimbActionInitializer", "getSimpleName(...)");
                this.tag = "LimbActionInitializer";
                this.provider = provider;
            }

            @Override // ru.ozon.app.android.startup.initializers.NamedActionInitializerProvider
            public a<LimbActionInitializer> getProvider() {
                return this.provider;
            }

            @Override // ru.ozon.app.android.startup.initializers.NamedActionInitializerProvider
            public String getTag() {
                return this.tag;
            }
        };
    }

    @NotNull
    public final NamedActionInitializerProvider provideLoggerInitializer(@NotNull final a<LoggerInitializer> provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        return new NamedActionInitializerProvider(provider) { // from class: ru.ozon.app.android.initializers.ActionInitializeModule$provideLoggerInitializer$$inlined$toNamedProvider$1
            private final a<LoggerInitializer> provider;
            private final String tag;

            {
                Intrinsics.checkNotNullExpressionValue("LoggerInitializer", "getSimpleName(...)");
                this.tag = "LoggerInitializer";
                this.provider = provider;
            }

            @Override // ru.ozon.app.android.startup.initializers.NamedActionInitializerProvider
            public a<LoggerInitializer> getProvider() {
                return this.provider;
            }

            @Override // ru.ozon.app.android.startup.initializers.NamedActionInitializerProvider
            public String getTag() {
                return this.tag;
            }
        };
    }

    @NotNull
    public final NamedActionInitializerProvider provideMapsActionInitializer(@NotNull final a<MapsActionInitializer> provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        return new NamedActionInitializerProvider(provider) { // from class: ru.ozon.app.android.initializers.ActionInitializeModule$provideMapsActionInitializer$$inlined$toNamedProvider$1
            private final a<MapsActionInitializer> provider;
            private final String tag;

            {
                Intrinsics.checkNotNullExpressionValue("MapsActionInitializer", "getSimpleName(...)");
                this.tag = "MapsActionInitializer";
                this.provider = provider;
            }

            @Override // ru.ozon.app.android.startup.initializers.NamedActionInitializerProvider
            public a<MapsActionInitializer> getProvider() {
                return this.provider;
            }

            @Override // ru.ozon.app.android.startup.initializers.NamedActionInitializerProvider
            public String getTag() {
                return this.tag;
            }
        };
    }

    @NotNull
    public final NamedActionInitializerProvider provideMessengerFeatureActionInitializer(@NotNull final a<MessengerFeatureActionInitializer> provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        return new NamedActionInitializerProvider(provider) { // from class: ru.ozon.app.android.initializers.ActionInitializeModule$provideMessengerFeatureActionInitializer$$inlined$toNamedProvider$1
            private final a<MessengerFeatureActionInitializer> provider;
            private final String tag;

            {
                Intrinsics.checkNotNullExpressionValue("MessengerFeatureActionInitializer", "getSimpleName(...)");
                this.tag = "MessengerFeatureActionInitializer";
                this.provider = provider;
            }

            @Override // ru.ozon.app.android.startup.initializers.NamedActionInitializerProvider
            public a<MessengerFeatureActionInitializer> getProvider() {
                return this.provider;
            }

            @Override // ru.ozon.app.android.startup.initializers.NamedActionInitializerProvider
            public String getTag() {
                return this.tag;
            }
        };
    }

    @NotNull
    public final NamedActionInitializerProvider provideNativePaymentInitializer(@NotNull final a<NativePaymentInitializer> provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        return new NamedActionInitializerProvider(provider) { // from class: ru.ozon.app.android.initializers.ActionInitializeModule$provideNativePaymentInitializer$$inlined$toNamedProvider$1
            private final a<NativePaymentInitializer> provider;
            private final String tag;

            {
                Intrinsics.checkNotNullExpressionValue("NativePaymentInitializer", "getSimpleName(...)");
                this.tag = "NativePaymentInitializer";
                this.provider = provider;
            }

            @Override // ru.ozon.app.android.startup.initializers.NamedActionInitializerProvider
            public a<NativePaymentInitializer> getProvider() {
                return this.provider;
            }

            @Override // ru.ozon.app.android.startup.initializers.NamedActionInitializerProvider
            public String getTag() {
                return this.tag;
            }
        };
    }

    @NotNull
    public final NamedActionInitializerProvider provideOzonDebugMenuSdkInitializer(@NotNull final a<OzonDebugMenuSdkInitializer> provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        return new NamedActionInitializerProvider(provider) { // from class: ru.ozon.app.android.initializers.ActionInitializeModule$provideOzonDebugMenuSdkInitializer$$inlined$toNamedProvider$1
            private final a<OzonDebugMenuSdkInitializer> provider;
            private final String tag;

            {
                Intrinsics.checkNotNullExpressionValue("OzonDebugMenuSdkInitializer", "getSimpleName(...)");
                this.tag = "OzonDebugMenuSdkInitializer";
                this.provider = provider;
            }

            @Override // ru.ozon.app.android.startup.initializers.NamedActionInitializerProvider
            public a<OzonDebugMenuSdkInitializer> getProvider() {
                return this.provider;
            }

            @Override // ru.ozon.app.android.startup.initializers.NamedActionInitializerProvider
            public String getTag() {
                return this.tag;
            }
        };
    }

    @NotNull
    public final NamedActionInitializerProvider provideOzonGalleryInitializer(@NotNull final a<OzonGalleryInitializer> provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        return new NamedActionInitializerProvider(provider) { // from class: ru.ozon.app.android.initializers.ActionInitializeModule$provideOzonGalleryInitializer$$inlined$toNamedProvider$1
            private final a<OzonGalleryInitializer> provider;
            private final String tag;

            {
                Intrinsics.checkNotNullExpressionValue("OzonGalleryInitializer", "getSimpleName(...)");
                this.tag = "OzonGalleryInitializer";
                this.provider = provider;
            }

            @Override // ru.ozon.app.android.startup.initializers.NamedActionInitializerProvider
            public a<OzonGalleryInitializer> getProvider() {
                return this.provider;
            }

            @Override // ru.ozon.app.android.startup.initializers.NamedActionInitializerProvider
            public String getTag() {
                return this.tag;
            }
        };
    }

    @NotNull
    public final NamedActionInitializerProvider provideOzonIdAccountInitializer(@NotNull final a<OzonIdAccountInitializer> provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        return new NamedActionInitializerProvider(provider) { // from class: ru.ozon.app.android.initializers.ActionInitializeModule$provideOzonIdAccountInitializer$$inlined$toNamedProvider$1
            private final a<OzonIdAccountInitializer> provider;
            private final String tag;

            {
                Intrinsics.checkNotNullExpressionValue("OzonIdAccountInitializer", "getSimpleName(...)");
                this.tag = "OzonIdAccountInitializer";
                this.provider = provider;
            }

            @Override // ru.ozon.app.android.startup.initializers.NamedActionInitializerProvider
            public a<OzonIdAccountInitializer> getProvider() {
                return this.provider;
            }

            @Override // ru.ozon.app.android.startup.initializers.NamedActionInitializerProvider
            public String getTag() {
                return this.tag;
            }
        };
    }

    @NotNull
    public final NamedActionInitializerProvider provideOzonInAppUpdateInitializer(@NotNull final a<OzonInAppUpdateInitializer> provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        return new NamedActionInitializerProvider(provider) { // from class: ru.ozon.app.android.initializers.ActionInitializeModule$provideOzonInAppUpdateInitializer$$inlined$toNamedProvider$1
            private final a<OzonInAppUpdateInitializer> provider;
            private final String tag;

            {
                Intrinsics.checkNotNullExpressionValue("OzonInAppUpdateInitializer", "getSimpleName(...)");
                this.tag = "OzonInAppUpdateInitializer";
                this.provider = provider;
            }

            @Override // ru.ozon.app.android.startup.initializers.NamedActionInitializerProvider
            public a<OzonInAppUpdateInitializer> getProvider() {
                return this.provider;
            }

            @Override // ru.ozon.app.android.startup.initializers.NamedActionInitializerProvider
            public String getTag() {
                return this.tag;
            }
        };
    }

    @NotNull
    public final NamedActionInitializerProvider providePikazonActionInitializer(@NotNull final a<PikazonActionInitializer> provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        return new NamedActionInitializerProvider(provider) { // from class: ru.ozon.app.android.initializers.ActionInitializeModule$providePikazonActionInitializer$$inlined$toNamedProvider$1
            private final a<PikazonActionInitializer> provider;
            private final String tag;

            {
                Intrinsics.checkNotNullExpressionValue("PikazonActionInitializer", "getSimpleName(...)");
                this.tag = "PikazonActionInitializer";
                this.provider = provider;
            }

            @Override // ru.ozon.app.android.startup.initializers.NamedActionInitializerProvider
            public a<PikazonActionInitializer> getProvider() {
                return this.provider;
            }

            @Override // ru.ozon.app.android.startup.initializers.NamedActionInitializerProvider
            public String getTag() {
                return this.tag;
            }
        };
    }

    @NotNull
    public final NamedActionInitializerProvider providePrefetchManagerActionInitializer(@NotNull final a<PrefetchManagerActionInitializer> provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        return new NamedActionInitializerProvider(provider) { // from class: ru.ozon.app.android.initializers.ActionInitializeModule$providePrefetchManagerActionInitializer$$inlined$toNamedProvider$1
            private final a<PrefetchManagerActionInitializer> provider;
            private final String tag;

            {
                Intrinsics.checkNotNullExpressionValue("PrefetchManagerActionInitializer", "getSimpleName(...)");
                this.tag = "PrefetchManagerActionInitializer";
                this.provider = provider;
            }

            @Override // ru.ozon.app.android.startup.initializers.NamedActionInitializerProvider
            public a<PrefetchManagerActionInitializer> getProvider() {
                return this.provider;
            }

            @Override // ru.ozon.app.android.startup.initializers.NamedActionInitializerProvider
            public String getTag() {
                return this.tag;
            }
        };
    }

    @NotNull
    public final NamedActionInitializerProvider providePushInitializer(@NotNull final a<PushInitializer> provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        return new NamedActionInitializerProvider(provider) { // from class: ru.ozon.app.android.initializers.ActionInitializeModule$providePushInitializer$$inlined$toNamedProvider$1
            private final a<PushInitializer> provider;
            private final String tag;

            {
                Intrinsics.checkNotNullExpressionValue("PushInitializer", "getSimpleName(...)");
                this.tag = "PushInitializer";
                this.provider = provider;
            }

            @Override // ru.ozon.app.android.startup.initializers.NamedActionInitializerProvider
            public a<PushInitializer> getProvider() {
                return this.provider;
            }

            @Override // ru.ozon.app.android.startup.initializers.NamedActionInitializerProvider
            public String getTag() {
                return this.tag;
            }
        };
    }

    @NotNull
    public final NamedActionInitializerProvider provideRxErrorPluginInitializer(@NotNull final a<RxErrorPluginInitializer> provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        return new NamedActionInitializerProvider(provider) { // from class: ru.ozon.app.android.initializers.ActionInitializeModule$provideRxErrorPluginInitializer$$inlined$toNamedProvider$1
            private final a<RxErrorPluginInitializer> provider;
            private final String tag;

            {
                Intrinsics.checkNotNullExpressionValue("RxErrorPluginInitializer", "getSimpleName(...)");
                this.tag = "RxErrorPluginInitializer";
                this.provider = provider;
            }

            @Override // ru.ozon.app.android.startup.initializers.NamedActionInitializerProvider
            public a<RxErrorPluginInitializer> getProvider() {
                return this.provider;
            }

            @Override // ru.ozon.app.android.startup.initializers.NamedActionInitializerProvider
            public String getTag() {
                return this.tag;
            }
        };
    }

    @NotNull
    public final NamedActionInitializerProvider provideSberPayInitializer(@NotNull final a<SberPayInitializer> provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        return new NamedActionInitializerProvider(provider) { // from class: ru.ozon.app.android.initializers.ActionInitializeModule$provideSberPayInitializer$$inlined$toNamedProvider$1
            private final a<SberPayInitializer> provider;
            private final String tag;

            {
                Intrinsics.checkNotNullExpressionValue("SberPayInitializer", "getSimpleName(...)");
                this.tag = "SberPayInitializer";
                this.provider = provider;
            }

            @Override // ru.ozon.app.android.startup.initializers.NamedActionInitializerProvider
            public a<SberPayInitializer> getProvider() {
                return this.provider;
            }

            @Override // ru.ozon.app.android.startup.initializers.NamedActionInitializerProvider
            public String getTag() {
                return this.tag;
            }
        };
    }

    @NotNull
    public final NamedActionInitializerProvider provideScreenRouterActionInitializer(@NotNull final a<ScreenRouterActionInitializer> provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        return new NamedActionInitializerProvider(provider) { // from class: ru.ozon.app.android.initializers.ActionInitializeModule$provideScreenRouterActionInitializer$$inlined$toNamedProvider$1
            private final a<ScreenRouterActionInitializer> provider;
            private final String tag;

            {
                Intrinsics.checkNotNullExpressionValue("ScreenRouterActionInitializer", "getSimpleName(...)");
                this.tag = "ScreenRouterActionInitializer";
                this.provider = provider;
            }

            @Override // ru.ozon.app.android.startup.initializers.NamedActionInitializerProvider
            public a<ScreenRouterActionInitializer> getProvider() {
                return this.provider;
            }

            @Override // ru.ozon.app.android.startup.initializers.NamedActionInitializerProvider
            public String getTag() {
                return this.tag;
            }
        };
    }

    @NotNull
    public final NamedActionInitializerProvider provideSentrySessionIdInitializer(@NotNull final a<SentrySessionIdInitializer> provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        return new NamedActionInitializerProvider(provider) { // from class: ru.ozon.app.android.initializers.ActionInitializeModule$provideSentrySessionIdInitializer$$inlined$toNamedProvider$1
            private final a<SentrySessionIdInitializer> provider;
            private final String tag;

            {
                Intrinsics.checkNotNullExpressionValue("SentrySessionIdInitializer", "getSimpleName(...)");
                this.tag = "SentrySessionIdInitializer";
                this.provider = provider;
            }

            @Override // ru.ozon.app.android.startup.initializers.NamedActionInitializerProvider
            public a<SentrySessionIdInitializer> getProvider() {
                return this.provider;
            }

            @Override // ru.ozon.app.android.startup.initializers.NamedActionInitializerProvider
            public String getTag() {
                return this.tag;
            }
        };
    }

    @NotNull
    public final NamedActionInitializerProvider provideSetLocaleActionInitializer(@NotNull final a<SetLocaleActionInitializer> provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        return new NamedActionInitializerProvider(provider) { // from class: ru.ozon.app.android.initializers.ActionInitializeModule$provideSetLocaleActionInitializer$$inlined$toNamedProvider$1
            private final a<SetLocaleActionInitializer> provider;
            private final String tag;

            {
                Intrinsics.checkNotNullExpressionValue("SetLocaleActionInitializer", "getSimpleName(...)");
                this.tag = "SetLocaleActionInitializer";
                this.provider = provider;
            }

            @Override // ru.ozon.app.android.startup.initializers.NamedActionInitializerProvider
            public a<SetLocaleActionInitializer> getProvider() {
                return this.provider;
            }

            @Override // ru.ozon.app.android.startup.initializers.NamedActionInitializerProvider
            public String getTag() {
                return this.tag;
            }
        };
    }

    @NotNull
    public final NamedActionInitializerProvider provideShortcutsInitializer(@NotNull final a<DynamicShortcutsInitializer> provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        return new NamedActionInitializerProvider(provider) { // from class: ru.ozon.app.android.initializers.ActionInitializeModule$provideShortcutsInitializer$$inlined$toNamedProvider$1
            private final a<DynamicShortcutsInitializer> provider;
            private final String tag;

            {
                Intrinsics.checkNotNullExpressionValue("DynamicShortcutsInitializer", "getSimpleName(...)");
                this.tag = "DynamicShortcutsInitializer";
                this.provider = provider;
            }

            @Override // ru.ozon.app.android.startup.initializers.NamedActionInitializerProvider
            public a<DynamicShortcutsInitializer> getProvider() {
                return this.provider;
            }

            @Override // ru.ozon.app.android.startup.initializers.NamedActionInitializerProvider
            public String getTag() {
                return this.tag;
            }
        };
    }

    @NotNull
    public final NamedActionInitializerProvider provideStartupTimeTrackerInitializer(@NotNull final a<StartupTimeTrackerInitializer> provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        return new NamedActionInitializerProvider(provider) { // from class: ru.ozon.app.android.initializers.ActionInitializeModule$provideStartupTimeTrackerInitializer$$inlined$toNamedProvider$1
            private final a<StartupTimeTrackerInitializer> provider;
            private final String tag;

            {
                Intrinsics.checkNotNullExpressionValue("StartupTimeTrackerInitializer", "getSimpleName(...)");
                this.tag = "StartupTimeTrackerInitializer";
                this.provider = provider;
            }

            @Override // ru.ozon.app.android.startup.initializers.NamedActionInitializerProvider
            public a<StartupTimeTrackerInitializer> getProvider() {
                return this.provider;
            }

            @Override // ru.ozon.app.android.startup.initializers.NamedActionInitializerProvider
            public String getTag() {
                return this.tag;
            }
        };
    }

    @NotNull
    public final NamedActionInitializerProvider provideStringsProviderInitializer(@NotNull final a<StringsProviderInitializer> provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        return new NamedActionInitializerProvider(provider) { // from class: ru.ozon.app.android.initializers.ActionInitializeModule$provideStringsProviderInitializer$$inlined$toNamedProvider$1
            private final a<StringsProviderInitializer> provider;
            private final String tag;

            {
                Intrinsics.checkNotNullExpressionValue("StringsProviderInitializer", "getSimpleName(...)");
                this.tag = "StringsProviderInitializer";
                this.provider = provider;
            }

            @Override // ru.ozon.app.android.startup.initializers.NamedActionInitializerProvider
            public a<StringsProviderInitializer> getProvider() {
                return this.provider;
            }

            @Override // ru.ozon.app.android.startup.initializers.NamedActionInitializerProvider
            public String getTag() {
                return this.tag;
            }
        };
    }

    @NotNull
    public final NamedActionInitializerProvider provideTabConfigInitializer(@NotNull final a<TabConfigInitializer> provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        return new NamedActionInitializerProvider(provider) { // from class: ru.ozon.app.android.initializers.ActionInitializeModule$provideTabConfigInitializer$$inlined$toNamedProvider$1
            private final a<TabConfigInitializer> provider;
            private final String tag;

            {
                Intrinsics.checkNotNullExpressionValue("TabConfigInitializer", "getSimpleName(...)");
                this.tag = "TabConfigInitializer";
                this.provider = provider;
            }

            @Override // ru.ozon.app.android.startup.initializers.NamedActionInitializerProvider
            public a<TabConfigInitializer> getProvider() {
                return this.provider;
            }

            @Override // ru.ozon.app.android.startup.initializers.NamedActionInitializerProvider
            public String getTag() {
                return this.tag;
            }
        };
    }

    @NotNull
    public final NamedActionInitializerProvider provideTrackerActionInitializer(@NotNull final a<TrackerActionInitializer> provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        return new NamedActionInitializerProvider(provider) { // from class: ru.ozon.app.android.initializers.ActionInitializeModule$provideTrackerActionInitializer$$inlined$toNamedProvider$1
            private final a<TrackerActionInitializer> provider;
            private final String tag;

            {
                Intrinsics.checkNotNullExpressionValue("TrackerActionInitializer", "getSimpleName(...)");
                this.tag = "TrackerActionInitializer";
                this.provider = provider;
            }

            @Override // ru.ozon.app.android.startup.initializers.NamedActionInitializerProvider
            public a<TrackerActionInitializer> getProvider() {
                return this.provider;
            }

            @Override // ru.ozon.app.android.startup.initializers.NamedActionInitializerProvider
            public String getTag() {
                return this.tag;
            }
        };
    }

    @NotNull
    public final NamedActionInitializerProvider provideTrackerDebugMenuInitializer(@NotNull final a<TrackerDebugMenuInitializer> provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        return new NamedActionInitializerProvider(provider) { // from class: ru.ozon.app.android.initializers.ActionInitializeModule$provideTrackerDebugMenuInitializer$$inlined$toNamedProvider$1
            private final a<TrackerDebugMenuInitializer> provider;
            private final String tag;

            {
                Intrinsics.checkNotNullExpressionValue("TrackerDebugMenuInitializer", "getSimpleName(...)");
                this.tag = "TrackerDebugMenuInitializer";
                this.provider = provider;
            }

            @Override // ru.ozon.app.android.startup.initializers.NamedActionInitializerProvider
            public a<TrackerDebugMenuInitializer> getProvider() {
                return this.provider;
            }

            @Override // ru.ozon.app.android.startup.initializers.NamedActionInitializerProvider
            public String getTag() {
                return this.tag;
            }
        };
    }

    @NotNull
    public final NamedActionInitializerProvider provideUpdateCartInitializer(@NotNull final a<UpdateCartInitializer> provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        return new NamedActionInitializerProvider(provider) { // from class: ru.ozon.app.android.initializers.ActionInitializeModule$provideUpdateCartInitializer$$inlined$toNamedProvider$1
            private final a<UpdateCartInitializer> provider;
            private final String tag;

            {
                Intrinsics.checkNotNullExpressionValue("UpdateCartInitializer", "getSimpleName(...)");
                this.tag = "UpdateCartInitializer";
                this.provider = provider;
            }

            @Override // ru.ozon.app.android.startup.initializers.NamedActionInitializerProvider
            public a<UpdateCartInitializer> getProvider() {
                return this.provider;
            }

            @Override // ru.ozon.app.android.startup.initializers.NamedActionInitializerProvider
            public String getTag() {
                return this.tag;
            }
        };
    }

    @NotNull
    public final NamedActionInitializerProvider provideUserStateActionInitializer(@NotNull final a<UserStateActionInitializer> provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        return new NamedActionInitializerProvider(provider) { // from class: ru.ozon.app.android.initializers.ActionInitializeModule$provideUserStateActionInitializer$$inlined$toNamedProvider$1
            private final a<UserStateActionInitializer> provider;
            private final String tag;

            {
                Intrinsics.checkNotNullExpressionValue("UserStateActionInitializer", "getSimpleName(...)");
                this.tag = "UserStateActionInitializer";
                this.provider = provider;
            }

            @Override // ru.ozon.app.android.startup.initializers.NamedActionInitializerProvider
            public a<UserStateActionInitializer> getProvider() {
                return this.provider;
            }

            @Override // ru.ozon.app.android.startup.initializers.NamedActionInitializerProvider
            public String getTag() {
                return this.tag;
            }
        };
    }

    @NotNull
    public final NamedActionInitializerProvider provideWebViewInitializer(@NotNull final a<WebViewInitializer> provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        return new NamedActionInitializerProvider(provider) { // from class: ru.ozon.app.android.initializers.ActionInitializeModule$provideWebViewInitializer$$inlined$toNamedProvider$1
            private final a<WebViewInitializer> provider;
            private final String tag;

            {
                Intrinsics.checkNotNullExpressionValue("WebViewInitializer", "getSimpleName(...)");
                this.tag = "WebViewInitializer";
                this.provider = provider;
            }

            @Override // ru.ozon.app.android.startup.initializers.NamedActionInitializerProvider
            public a<WebViewInitializer> getProvider() {
                return this.provider;
            }

            @Override // ru.ozon.app.android.startup.initializers.NamedActionInitializerProvider
            public String getTag() {
                return this.tag;
            }
        };
    }

    @NotNull
    public final NamedActionInitializerProvider provideWhitelistingInitializer(@NotNull final a<WhitelistingInitializer> provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        return new NamedActionInitializerProvider(provider) { // from class: ru.ozon.app.android.initializers.ActionInitializeModule$provideWhitelistingInitializer$$inlined$toNamedProvider$1
            private final a<WhitelistingInitializer> provider;
            private final String tag;

            {
                Intrinsics.checkNotNullExpressionValue("WhitelistingInitializer", "getSimpleName(...)");
                this.tag = "WhitelistingInitializer";
                this.provider = provider;
            }

            @Override // ru.ozon.app.android.startup.initializers.NamedActionInitializerProvider
            public a<WhitelistingInitializer> getProvider() {
                return this.provider;
            }

            @Override // ru.ozon.app.android.startup.initializers.NamedActionInitializerProvider
            public String getTag() {
                return this.tag;
            }
        };
    }
}
