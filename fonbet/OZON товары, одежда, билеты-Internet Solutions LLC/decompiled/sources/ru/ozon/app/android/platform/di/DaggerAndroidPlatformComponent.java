package ru.ozon.app.android.platform.di;

import Jb.d;
import Jb.j;
import Pc.a;
import android.content.Context;
import android.content.SharedPreferences;
import ei0.InterfaceC6369b;
import ru.ozon.app.android.analytics.di.AnalyticsComponentApi;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.network.di.NetworkOzonIdComponentApi;
import ru.ozon.app.android.platform.bundle.state.ManualSaveRestoreDelegateImpl;
import ru.ozon.app.android.platform.bundle.state.ManualSaveRestoreStateDelegate;
import ru.ozon.app.android.platform.bundle.state.ManualStateBundleActivityCallback;
import ru.ozon.app.android.platform.di.AndroidPlatformComponent;
import ru.ozon.app.android.platform.di.module.AndroidPlatformModule_Companion_BindDarkThemeManagerFactory;
import ru.ozon.app.android.platform.di.module.AndroidPlatformModule_Companion_ProvideManualStateBundleActivityCallbackFactory;
import ru.ozon.app.android.platform.image.ImageResizer;
import ru.ozon.app.android.platform.image.ImageResizerImpl;
import ru.ozon.app.android.platform.lifecycle.activity.ActivityLifeCycleHolder;
import ru.ozon.app.android.platform.notifications.EnableNotificationsSuggestingHandler;
import ru.ozon.app.android.platform.notifications.EnableNotificationsSuggestingHandlerImpl;
import ru.ozon.app.android.platform.orientation.ScreenOrientationDelegate;
import ru.ozon.app.android.platform.orientation.ScreenOrientationDelegateImpl;
import ru.ozon.app.android.platform.theme.DarkThemeManager;
import ru.ozon.app.android.platform.viewutils.RecycledViewPoolViewNullifier;
import ru.ozon.app.android.platform.viewutils.RecycledViewPoolViewNullifierImpl;
import ru.ozon.app.android.storage.di.StorageComponentApi;
import ru.ozon.app.android.storage.entity.bundle.BundleStateDao;
import ru.ozon.app.android.utils.AppType;

/* loaded from: classes7.dex */
public final class DaggerAndroidPlatformComponent {

    private static final class AndroidPlatformComponentImpl implements AndroidPlatformComponent {
        private a<ActivityLifeCycleHolder> activityLifeCycleHolderProvider;
        private final AnalyticsComponentApi analyticsComponentApi;
        private final AndroidPlatformComponentDependencies androidPlatformComponentDependencies;
        private final AndroidPlatformComponentImpl androidPlatformComponentImpl;
        private a<DarkThemeManager> bindDarkThemeManagerProvider;
        private a<EnableNotificationsSuggestingHandler> bindEnableNotificationsSuggestingHandlerProvider;
        private a<ImageResizer> bindImageResizerProvider;
        private a<ManualSaveRestoreStateDelegate> bindManualSavedStateDelegateProvider;
        private a<ScreenOrientationDelegate> bindScreenOrientationDelegateProvider;
        private final ContextComponentDependencies contextComponentDependencies;
        private a<EnableNotificationsSuggestingHandlerImpl> enableNotificationsSuggestingHandlerImplProvider;
        private a<ImageResizerImpl> imageResizerImplProvider;
        private a<ManualSaveRestoreDelegateImpl> manualSaveRestoreDelegateImplProvider;
        private final NetworkComponentApi networkComponentApi;
        private a<ScreenOrientationDelegateImpl> screenOrientationDelegateImplProvider;
        private final StorageComponentApi storageComponentApi;

        private static final class SwitchingProvider<T> implements a<T> {
            private final AndroidPlatformComponentImpl androidPlatformComponentImpl;

            /* renamed from: id, reason: collision with root package name */
            private final int f93212id;

            SwitchingProvider(AndroidPlatformComponentImpl androidPlatformComponentImpl, int i11) {
                this.androidPlatformComponentImpl = androidPlatformComponentImpl;
                this.f93212id = i11;
            }

            @Override // Pc.a
            public T get() {
                int i11 = this.f93212id;
                if (i11 == 0) {
                    Context context = this.androidPlatformComponentImpl.contextComponentDependencies.getContext();
                    j.c(context);
                    SharedPreferences sharedPreferences = this.androidPlatformComponentImpl.storageComponentApi.getSharedPreferences();
                    j.c(sharedPreferences);
                    InterfaceC6369b ozonTracker = this.androidPlatformComponentImpl.analyticsComponentApi.getOzonTracker();
                    j.c(ozonTracker);
                    return (T) AndroidPlatformModule_Companion_BindDarkThemeManagerFactory.bindDarkThemeManager(context, sharedPreferences, ozonTracker);
                }
                if (i11 == 1) {
                    AndroidPlatformComponentConfig androidPlatformComponentConfig = this.androidPlatformComponentImpl.androidPlatformComponentDependencies.getAndroidPlatformComponentConfig();
                    j.c(androidPlatformComponentConfig);
                    FeatureChecker featureChecker = this.androidPlatformComponentImpl.networkComponentApi.getFeatureChecker();
                    j.c(featureChecker);
                    return (T) new ScreenOrientationDelegateImpl(androidPlatformComponentConfig, featureChecker);
                }
                if (i11 == 2) {
                    Context context2 = this.androidPlatformComponentImpl.contextComponentDependencies.getContext();
                    j.c(context2);
                    return (T) new ImageResizerImpl(context2);
                }
                if (i11 == 3) {
                    return (T) new ActivityLifeCycleHolder();
                }
                if (i11 == 4) {
                    Context context3 = this.androidPlatformComponentImpl.contextComponentDependencies.getContext();
                    j.c(context3);
                    return (T) new EnableNotificationsSuggestingHandlerImpl(context3);
                }
                if (i11 != 5) {
                    throw new AssertionError(this.f93212id);
                }
                BundleStateDao bundleStateDao = this.androidPlatformComponentImpl.storageComponentApi.getBundleStateDao();
                j.c(bundleStateDao);
                return (T) new ManualSaveRestoreDelegateImpl(bundleStateDao);
            }
        }

        /* synthetic */ AndroidPlatformComponentImpl(ContextComponentDependencies contextComponentDependencies, AndroidPlatformComponentDependencies androidPlatformComponentDependencies, StorageComponentApi storageComponentApi, NetworkComponentApi networkComponentApi, NetworkOzonIdComponentApi networkOzonIdComponentApi, AnalyticsComponentApi analyticsComponentApi, int i11) {
            this(contextComponentDependencies, androidPlatformComponentDependencies, storageComponentApi, networkComponentApi, networkOzonIdComponentApi, analyticsComponentApi);
        }

        private void initialize(ContextComponentDependencies contextComponentDependencies, AndroidPlatformComponentDependencies androidPlatformComponentDependencies, StorageComponentApi storageComponentApi, NetworkComponentApi networkComponentApi, NetworkOzonIdComponentApi networkOzonIdComponentApi, AnalyticsComponentApi analyticsComponentApi) {
            this.bindDarkThemeManagerProvider = d.b(new SwitchingProvider(this.androidPlatformComponentImpl, 0));
            SwitchingProvider switchingProvider = new SwitchingProvider(this.androidPlatformComponentImpl, 1);
            this.screenOrientationDelegateImplProvider = switchingProvider;
            this.bindScreenOrientationDelegateProvider = d.b(switchingProvider);
            SwitchingProvider switchingProvider2 = new SwitchingProvider(this.androidPlatformComponentImpl, 2);
            this.imageResizerImplProvider = switchingProvider2;
            this.bindImageResizerProvider = d.b(switchingProvider2);
            this.activityLifeCycleHolderProvider = d.b(new SwitchingProvider(this.androidPlatformComponentImpl, 3));
            SwitchingProvider switchingProvider3 = new SwitchingProvider(this.androidPlatformComponentImpl, 4);
            this.enableNotificationsSuggestingHandlerImplProvider = switchingProvider3;
            this.bindEnableNotificationsSuggestingHandlerProvider = d.b(switchingProvider3);
            SwitchingProvider switchingProvider4 = new SwitchingProvider(this.androidPlatformComponentImpl, 5);
            this.manualSaveRestoreDelegateImplProvider = switchingProvider4;
            this.bindManualSavedStateDelegateProvider = d.b(switchingProvider4);
        }

        @Override // ru.ozon.app.android.platform.di.AndroidPlatformComponentApi
        public ActivityLifeCycleHolder getActivityLifeCycleHolder() {
            return this.activityLifeCycleHolderProvider.get();
        }

        @Override // ru.ozon.app.android.platform.di.AndroidPlatformComponentApi
        public AndroidPlatformComponentConfig getAndroidPlatformComponentConfig() {
            AndroidPlatformComponentConfig androidPlatformComponentConfig = this.androidPlatformComponentDependencies.getAndroidPlatformComponentConfig();
            j.c(androidPlatformComponentConfig);
            return androidPlatformComponentConfig;
        }

        @Override // ru.ozon.app.android.platform.di.AndroidPlatformComponentApi
        public AppType getAppType() {
            AppType appType = this.androidPlatformComponentDependencies.getAppType();
            j.c(appType);
            return appType;
        }

        @Override // ru.ozon.app.android.platform.di.AndroidPlatformComponentApi
        public DarkThemeManager getDarkThemeManager() {
            return this.bindDarkThemeManagerProvider.get();
        }

        @Override // ru.ozon.app.android.platform.di.AndroidPlatformComponentApi
        public EnableNotificationsSuggestingHandler getEnableNotificationsSuggestingHandler() {
            return this.bindEnableNotificationsSuggestingHandlerProvider.get();
        }

        @Override // ru.ozon.app.android.platform.di.AndroidPlatformComponentApi
        public ImageResizer getImageResizer() {
            return this.bindImageResizerProvider.get();
        }

        @Override // ru.ozon.app.android.platform.di.AndroidPlatformComponentApi
        public ManualSaveRestoreStateDelegate getManualSavedStateDelegate() {
            return this.bindManualSavedStateDelegateProvider.get();
        }

        @Override // ru.ozon.app.android.platform.di.AndroidPlatformComponentApi
        public ManualStateBundleActivityCallback getManualStateBundleActivityCallback() {
            FeatureChecker featureChecker = this.networkComponentApi.getFeatureChecker();
            j.c(featureChecker);
            return AndroidPlatformModule_Companion_ProvideManualStateBundleActivityCallbackFactory.provideManualStateBundleActivityCallback(featureChecker, this.bindManualSavedStateDelegateProvider.get());
        }

        @Override // ru.ozon.app.android.platform.di.AndroidPlatformComponentApi
        public ScreenOrientationDelegate getScreenOrientationDelegate() {
            return this.bindScreenOrientationDelegateProvider.get();
        }

        @Override // ru.ozon.app.android.platform.di.AndroidPlatformComponentApi
        public RecycledViewPoolViewNullifier recyclerViewPoolNullifier() {
            return new RecycledViewPoolViewNullifierImpl();
        }

        private AndroidPlatformComponentImpl(ContextComponentDependencies contextComponentDependencies, AndroidPlatformComponentDependencies androidPlatformComponentDependencies, StorageComponentApi storageComponentApi, NetworkComponentApi networkComponentApi, NetworkOzonIdComponentApi networkOzonIdComponentApi, AnalyticsComponentApi analyticsComponentApi) {
            this.androidPlatformComponentImpl = this;
            this.contextComponentDependencies = contextComponentDependencies;
            this.storageComponentApi = storageComponentApi;
            this.analyticsComponentApi = analyticsComponentApi;
            this.androidPlatformComponentDependencies = androidPlatformComponentDependencies;
            this.networkComponentApi = networkComponentApi;
            initialize(contextComponentDependencies, androidPlatformComponentDependencies, storageComponentApi, networkComponentApi, networkOzonIdComponentApi, analyticsComponentApi);
        }
    }

    private static final class Factory implements AndroidPlatformComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.platform.di.AndroidPlatformComponent.Factory
        public AndroidPlatformComponent create(ContextComponentDependencies contextComponentDependencies, AndroidPlatformComponentDependencies androidPlatformComponentDependencies, StorageComponentApi storageComponentApi, NetworkComponentApi networkComponentApi, NetworkOzonIdComponentApi networkOzonIdComponentApi, AnalyticsComponentApi analyticsComponentApi) {
            contextComponentDependencies.getClass();
            androidPlatformComponentDependencies.getClass();
            storageComponentApi.getClass();
            networkComponentApi.getClass();
            networkOzonIdComponentApi.getClass();
            analyticsComponentApi.getClass();
            return new AndroidPlatformComponentImpl(contextComponentDependencies, androidPlatformComponentDependencies, storageComponentApi, networkComponentApi, networkOzonIdComponentApi, analyticsComponentApi, 0);
        }

        private Factory() {
        }
    }

    public static AndroidPlatformComponent.Factory factory() {
        return new Factory(0);
    }
}
