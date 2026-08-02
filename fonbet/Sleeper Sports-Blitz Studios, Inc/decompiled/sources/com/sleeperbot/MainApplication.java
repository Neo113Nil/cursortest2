package com.sleeperbot;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebView;
import com.braze.BrazeActivityLifecycleCallbackListener;
import com.braze.ui.inappmessage.BrazeInAppMessageManager;
import com.facebook.react.PackageList;
import com.facebook.react.ReactApplication;
import com.facebook.react.ReactHost;
import com.facebook.react.ReactNativeApplicationEntryPoint;
import com.facebook.react.ReactNativeHost;
import com.facebook.react.ReactPackage;
import com.facebook.react.common.ReleaseLevel;
import com.facebook.react.defaults.DefaultNewArchitectureEntryPoint;
import com.facebook.react.defaults.DefaultReactHost;
import com.facebook.react.defaults.DefaultReactNativeHost;
import com.facebook.react.internal.featureflags.ReactNativeFeatureFlags;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.intercom.reactnative.IntercomModule;
import com.learnium.RNDeviceInfo.resolver.DeviceTypeResolver;
import com.microsoft.codepush.react.CodePush;
import com.sleeperbot.modules.AndroidHelpersPackage;
import com.sleeperbot.modules.BundleManagerPackage;
import com.sleeperbot.modules.EnvironmentResolver;
import com.sleeperbot.modules.EnvironmentResolverPackage;
import com.sleeperbot.modules.KeyManagerPackage;
import com.sleeperbot.modules.NotificationManagerPackage;
import com.sleeperbot.modules.PrefsManagerPackage;
import com.sleeperbot.modules.SharedLoginPackage;
import com.sleeperbot.modules.TouchBlockerManagerPackage;
import io.radar.sdk.Radar;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MainApplication.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u000f\u001a\u00020\u0010H\u0016R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\t\u001a\u00020\n8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/sleeperbot/MainApplication;", "Landroid/app/Application;", "Lcom/facebook/react/ReactApplication;", "<init>", "()V", "reactNativeHost", "Lcom/facebook/react/ReactNativeHost;", "getReactNativeHost", "()Lcom/facebook/react/ReactNativeHost;", "reactHost", "Lcom/facebook/react/ReactHost;", "getReactHost", "()Lcom/facebook/react/ReactHost;", "reactHost$delegate", "Lkotlin/Lazy;", "onCreate", "", "app_fullRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class MainApplication extends Application implements ReactApplication {
    private final ReactNativeHost reactNativeHost = new DefaultReactNativeHost(this) { // from class: com.sleeperbot.MainApplication$reactNativeHost$1
        @Override // com.facebook.react.ReactNativeHost
        public boolean getUseDeveloperSupport() {
            return false;
        }

        {
            super(this);
        }

        @Override // com.facebook.react.ReactNativeHost
        protected List<ReactPackage> getPackages() {
            ArrayList<ReactPackage> packages = new PackageList(this).getPackages();
            packages.add(new AndroidHelpersPackage());
            packages.add(new BundleManagerPackage());
            packages.add(new TouchBlockerManagerPackage());
            packages.add(new KeyManagerPackage());
            packages.add(new SharedLoginPackage());
            packages.add(new PrefsManagerPackage());
            packages.add(new EnvironmentResolverPackage());
            packages.add(new QuickActionsPackage());
            packages.add(new NotificationManagerPackage());
            Intrinsics.checkNotNullExpressionValue(packages, "apply(...)");
            return packages;
        }

        @Override // com.facebook.react.ReactNativeHost
        protected String getJSMainModuleName() {
            return "index";
        }

        @Override // com.facebook.react.ReactNativeHost
        protected String getJSBundleFile() {
            String jSBundleFile = CodePush.getJSBundleFile();
            Intrinsics.checkNotNullExpressionValue(jSBundleFile, "getJSBundleFile(...)");
            return jSBundleFile;
        }
    };

    /* renamed from: reactHost$delegate, reason: from kotlin metadata */
    private final Lazy reactHost = LazyKt.lazy(new Function0() { // from class: com.sleeperbot.MainApplication$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            ReactHost reactHost_delegate$lambda$0;
            reactHost_delegate$lambda$0 = MainApplication.reactHost_delegate$lambda$0(MainApplication.this);
            return reactHost_delegate$lambda$0;
        }
    });

    @Override // com.facebook.react.ReactApplication
    public ReactNativeHost getReactNativeHost() {
        return this.reactNativeHost;
    }

    @Override // com.facebook.react.ReactApplication
    public ReactHost getReactHost() {
        return (ReactHost) this.reactHost.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ReactHost reactHost_delegate$lambda$0(MainApplication mainApplication) {
        Context applicationContext = mainApplication.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        return DefaultReactHost.getDefaultReactHost$default(applicationContext, mainApplication.getReactNativeHost(), null, 4, null);
    }

    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        MainApplication mainApplication = this;
        BrazeInAppMessageManager.INSTANCE.getInstance().ensureSubscribedToInAppMessageEvents(mainApplication);
        registerActivityLifecycleCallbacks(new BrazeActivityLifecycleCallbackListener(false, false, null, null, 15, null));
        IntercomModule.initialize(this, "android_sdk-ea15d4ee8460b6aaa0ec98a0a64bf4fd96b517cc", "xstxtwfr");
        Radar.initialize$default(mainApplication, BuildConfig.RADAR_KEY, null, 4, null);
        String resolve = EnvironmentResolver.resolve(mainApplication);
        try {
            FirebaseOptions loadFromAssets = FirebaseConfigLoader.INSTANCE.loadFromAssets(this, (resolve == null || resolve.length() <= 0 || Intrinsics.areEqual(resolve, "sleeper.app") || Intrinsics.areEqual(resolve, "sleeper.com")) ? "google-services-prod.json" : "google-services-dev.json", Intrinsics.areEqual(getPackageName(), "com.sleeperbot.storybook") ? BuildConfig.APPLICATION_ID : null);
            if (FirebaseApp.getApps(mainApplication).isEmpty()) {
                FirebaseApp.initializeApp(mainApplication, loadFromAssets);
            }
            WebView.setWebContentsDebuggingEnabled(true);
            final DeviceTypeResolver deviceTypeResolver = new DeviceTypeResolver(getApplicationContext());
            registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() { // from class: com.sleeperbot.MainApplication$onCreate$1
                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityDestroyed(Activity activity) {
                    Intrinsics.checkNotNullParameter(activity, "activity");
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityPaused(Activity activity) {
                    Intrinsics.checkNotNullParameter(activity, "activity");
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityResumed(Activity activity) {
                    Intrinsics.checkNotNullParameter(activity, "activity");
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
                    Intrinsics.checkNotNullParameter(activity, "activity");
                    Intrinsics.checkNotNullParameter(outState, "outState");
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityStopped(Activity activity) {
                    Intrinsics.checkNotNullParameter(activity, "activity");
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityStarted(Activity activity) {
                    Intrinsics.checkNotNullParameter(activity, "activity");
                    if (DeviceTypeResolver.this.isTablet()) {
                        return;
                    }
                    activity.setRequestedOrientation(1);
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
                    Intrinsics.checkNotNullParameter(activity, "activity");
                    if (DeviceTypeResolver.this.isTablet()) {
                        return;
                    }
                    activity.setRequestedOrientation(1);
                }
            });
            DefaultNewArchitectureEntryPoint.INSTANCE.setReleaseLevel(ReleaseLevel.STABLE);
            ReactNativeApplicationEntryPoint.loadReactNative(mainApplication);
            Log.i("SleeperFeatureFlags", "Installing custom feature flags override...");
            String dangerouslyForceOverride = ReactNativeFeatureFlags.dangerouslyForceOverride(new SleeperFeatureFlags());
            String str = dangerouslyForceOverride;
            if (str != null && str.length() != 0) {
                Log.w("SleeperFeatureFlags", "WARNING: feature flags accessed before override: " + dangerouslyForceOverride);
            }
            Log.i("SleeperFeatureFlags", "Active flags after override: useSharedAnimatedBackend=" + ReactNativeFeatureFlags.useSharedAnimatedBackend() + ", cxxNativeAnimatedEnabled=" + ReactNativeFeatureFlags.cxxNativeAnimatedEnabled() + ", preventShadowTreeCommitExhaustion=" + ReactNativeFeatureFlags.preventShadowTreeCommitExhaustion());
        } catch (Exception e) {
            throw new RuntimeException("Failed to load google-services.json", e);
        }
    }
}
