package ru.ozon.app.android.limb2.di;

import Jb.d;
import Jb.j;
import Ld0.e;
import Nd0.c;
import Pc.a;
import android.app.Application;
import com.google.common.collect.A;
import java.util.Set;
import ru.ozon.app.android.account.orders.emptyscreen.antibot.OpenBarcodeButtonConfig;
import ru.ozon.app.android.debugmenu.di.DebugMenuLimbProvidersModule;
import ru.ozon.app.android.debugmenu.di.DebugMenuLimbProvidersModule_ProvideComposerDebugMenuLimbPluginFactory;
import ru.ozon.app.android.debugmenu.di.DebugMenuLimbProvidersModule_ProvideDebugMenuLimbPluginFactory;
import ru.ozon.app.android.di.component.ApplicationComponent;
import ru.ozon.app.android.limb2.di.Limb2DependencyComponent;
import ru.ozon.app.android.limb2.di.modules.Limb2DependencyModule_Companion_ProvideOzonLimbAppNameFactory;
import ru.ozon.app.android.limb2.di.modules.Limb2PluginProvidersModule;
import ru.ozon.app.android.limb2.di.modules.Limb2PluginProvidersModule_ProvideAbToolPluginProviderFactory;
import ru.ozon.app.android.limb2.di.modules.Limb2PluginProvidersModule_ProvideCdnChooserLimbPluginFactory;
import ru.ozon.app.android.limb2.di.modules.Limb2PluginProvidersModule_ProvideCompassLimbPluginFactory;
import ru.ozon.app.android.limb2.di.modules.Limb2PluginProvidersModule_ProvideHostConfigPluginProviderFactory;
import ru.ozon.app.android.limb2.di.modules.Limb2PluginProvidersModule_ProvideInAppUpdatePluginProviderFactory;
import ru.ozon.app.android.limb2.di.modules.Limb2PluginProvidersModule_ProvideLimb2GlobalConfigFactory;
import ru.ozon.app.android.limb2.di.modules.Limb2PluginProvidersModule_ProvideOzonIdPluginProviderFactory;
import ru.ozon.app.android.limb2.di.modules.Limb2PluginProvidersModule_ProvideTrackerPluginProviderFactory;
import ru.ozon.app.android.limb2.di.modules.Limb2PluginProvidersModule_ProvidesDebugFeaturesAccessLevelPluginProviderFactory;
import ru.ozon.app.android.limb2.di.modules.Limb2PluginProvidersModule_ProvidesOzonNetworkPluginProviderFactory;
import ru.ozon.app.android.logging.di.LoggerPluginProvidersModule;
import ru.ozon.app.android.logging.di.LoggerPluginProvidersModule_ProvideLoggerLimbPluginProviderFactory;
import ru.ozon.app.android.network.abtool.AbNamespaceProvider;
import ru.ozon.app.android.sentry.di.module.SentryPluginProvidersModule;
import ru.ozon.app.android.sentry.di.module.SentryPluginProvidersModule_ProvideSentryHelperPluginProviderFactory;
import ru.ozon.app.android.utils.AppType;

/* loaded from: classes6.dex */
public final class DaggerLimb2DependencyComponent {

    private static final class Factory implements Limb2DependencyComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.limb2.di.Limb2DependencyComponent.Factory
        public Limb2DependencyComponent create(ApplicationComponent applicationComponent) {
            applicationComponent.getClass();
            return new Limb2DependencyComponentImpl(new Limb2PluginProvidersModule(), new DebugMenuLimbProvidersModule(), new SentryPluginProvidersModule(), new LoggerPluginProvidersModule(), applicationComponent, 0);
        }

        private Factory() {
        }
    }

    private static final class Limb2DependencyComponentImpl implements Limb2DependencyComponent {
        private final ApplicationComponent applicationComponent;
        private final DebugMenuLimbProvidersModule debugMenuLimbProvidersModule;
        private final Limb2DependencyComponentImpl limb2DependencyComponentImpl;
        private final Limb2PluginProvidersModule limb2PluginProvidersModule;
        private final LoggerPluginProvidersModule loggerPluginProvidersModule;
        private a<c> provideOzonLimbAppNameProvider;
        private final SentryPluginProvidersModule sentryPluginProvidersModule;

        private static final class SwitchingProvider<T> implements a<T> {

            /* renamed from: id, reason: collision with root package name */
            private final int f92817id;
            private final Limb2DependencyComponentImpl limb2DependencyComponentImpl;

            SwitchingProvider(Limb2DependencyComponentImpl limb2DependencyComponentImpl, int i11) {
                this.limb2DependencyComponentImpl = limb2DependencyComponentImpl;
                this.f92817id = i11;
            }

            @Override // Pc.a
            public T get() {
                if (this.f92817id != 0) {
                    throw new AssertionError(this.f92817id);
                }
                AppType appType = this.limb2DependencyComponentImpl.applicationComponent.getAppType();
                j.c(appType);
                return (T) Limb2DependencyModule_Companion_ProvideOzonLimbAppNameFactory.provideOzonLimbAppName(appType);
            }
        }

        /* synthetic */ Limb2DependencyComponentImpl(Limb2PluginProvidersModule limb2PluginProvidersModule, DebugMenuLimbProvidersModule debugMenuLimbProvidersModule, SentryPluginProvidersModule sentryPluginProvidersModule, LoggerPluginProvidersModule loggerPluginProvidersModule, ApplicationComponent applicationComponent, int i11) {
            this(limb2PluginProvidersModule, debugMenuLimbProvidersModule, sentryPluginProvidersModule, loggerPluginProvidersModule, applicationComponent);
        }

        private AbNamespaceProvider abNamespaceProvider() {
            AppType appType = this.applicationComponent.getAppType();
            j.c(appType);
            return new AbNamespaceProvider(appType);
        }

        private void initialize(Limb2PluginProvidersModule limb2PluginProvidersModule, DebugMenuLimbProvidersModule debugMenuLimbProvidersModule, SentryPluginProvidersModule sentryPluginProvidersModule, LoggerPluginProvidersModule loggerPluginProvidersModule, ApplicationComponent applicationComponent) {
            this.provideOzonLimbAppNameProvider = d.b(new SwitchingProvider(this.limb2DependencyComponentImpl, 0));
        }

        private Od0.d<e> provideAbToolPluginProvider() {
            Limb2PluginProvidersModule limb2PluginProvidersModule = this.limb2PluginProvidersModule;
            Application application = this.applicationComponent.getApplication();
            j.c(application);
            return Limb2PluginProvidersModule_ProvideAbToolPluginProviderFactory.provideAbToolPluginProvider(limb2PluginProvidersModule, application, abNamespaceProvider());
        }

        private Od0.d<e> provideHostConfigPluginProvider() {
            Limb2PluginProvidersModule limb2PluginProvidersModule = this.limb2PluginProvidersModule;
            Application application = this.applicationComponent.getApplication();
            j.c(application);
            return Limb2PluginProvidersModule_ProvideHostConfigPluginProviderFactory.provideHostConfigPluginProvider(limb2PluginProvidersModule, application);
        }

        private Od0.d<e> provideOzonIdPluginProvider() {
            Limb2PluginProvidersModule limb2PluginProvidersModule = this.limb2PluginProvidersModule;
            Ld0.d ozonLimbLibsGlobalConfig = getOzonLimbLibsGlobalConfig();
            Application application = this.applicationComponent.getApplication();
            j.c(application);
            return Limb2PluginProvidersModule_ProvideOzonIdPluginProviderFactory.provideOzonIdPluginProvider(limb2PluginProvidersModule, ozonLimbLibsGlobalConfig, application, new OpenBarcodeButtonConfig());
        }

        private Od0.d<e> providesDebugFeaturesAccessLevelPluginProvider() {
            return Limb2PluginProvidersModule_ProvidesDebugFeaturesAccessLevelPluginProviderFactory.providesDebugFeaturesAccessLevelPluginProvider(this.limb2PluginProvidersModule, getOzonLimbLibsGlobalConfig());
        }

        private Od0.d<e> providesOzonNetworkPluginProvider() {
            return Limb2PluginProvidersModule_ProvidesOzonNetworkPluginProviderFactory.providesOzonNetworkPluginProvider(this.limb2PluginProvidersModule, getOzonLimbLibsGlobalConfig());
        }

        @Override // ru.ozon.app.android.limb.Limb2ComponentDependencies
        public Ld0.d getOzonLimbLibsGlobalConfig() {
            Limb2PluginProvidersModule limb2PluginProvidersModule = this.limb2PluginProvidersModule;
            Application application = this.applicationComponent.getApplication();
            j.c(application);
            return Limb2PluginProvidersModule_ProvideLimb2GlobalConfigFactory.provideLimb2GlobalConfig(limb2PluginProvidersModule, application, this.provideOzonLimbAppNameProvider.get());
        }

        @Override // ru.ozon.app.android.limb.Limb2ComponentDependencies
        public Set<Od0.d<e>> getPluginProviders() {
            return A.F(provideAbToolPluginProvider(), Limb2PluginProvidersModule_ProvideTrackerPluginProviderFactory.provideTrackerPluginProvider(this.limb2PluginProvidersModule), providesOzonNetworkPluginProvider(), providesDebugFeaturesAccessLevelPluginProvider(), provideOzonIdPluginProvider(), Limb2PluginProvidersModule_ProvideInAppUpdatePluginProviderFactory.provideInAppUpdatePluginProvider(this.limb2PluginProvidersModule), Limb2PluginProvidersModule_ProvideCdnChooserLimbPluginFactory.provideCdnChooserLimbPlugin(this.limb2PluginProvidersModule), provideHostConfigPluginProvider(), Limb2PluginProvidersModule_ProvideCompassLimbPluginFactory.provideCompassLimbPlugin(this.limb2PluginProvidersModule), DebugMenuLimbProvidersModule_ProvideComposerDebugMenuLimbPluginFactory.provideComposerDebugMenuLimbPlugin(this.debugMenuLimbProvidersModule), DebugMenuLimbProvidersModule_ProvideDebugMenuLimbPluginFactory.provideDebugMenuLimbPlugin(this.debugMenuLimbProvidersModule), SentryPluginProvidersModule_ProvideSentryHelperPluginProviderFactory.provideSentryHelperPluginProvider(this.sentryPluginProvidersModule), LoggerPluginProvidersModule_ProvideLoggerLimbPluginProviderFactory.provideLoggerLimbPluginProvider(this.loggerPluginProvidersModule));
        }

        private Limb2DependencyComponentImpl(Limb2PluginProvidersModule limb2PluginProvidersModule, DebugMenuLimbProvidersModule debugMenuLimbProvidersModule, SentryPluginProvidersModule sentryPluginProvidersModule, LoggerPluginProvidersModule loggerPluginProvidersModule, ApplicationComponent applicationComponent) {
            this.limb2DependencyComponentImpl = this;
            this.limb2PluginProvidersModule = limb2PluginProvidersModule;
            this.applicationComponent = applicationComponent;
            this.debugMenuLimbProvidersModule = debugMenuLimbProvidersModule;
            this.sentryPluginProvidersModule = sentryPluginProvidersModule;
            this.loggerPluginProvidersModule = loggerPluginProvidersModule;
            initialize(limb2PluginProvidersModule, debugMenuLimbProvidersModule, sentryPluginProvidersModule, loggerPluginProvidersModule, applicationComponent);
        }
    }

    public static Limb2DependencyComponent.Factory factory() {
        return new Factory(0);
    }
}
