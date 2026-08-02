package ru.ozon.app.android.di;

import Cs.C2784a;
import Cs.b;
import Cs.c;
import Sc.InterfaceC4008j;
import Sc.k;
import gi.C6740b;
import hi.InterfaceC6958a;
import ii.InterfaceC7081a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.advertising.di.AdvertisingServiceComponentApi;
import ru.ozon.app.android.analytics.di.AnalyticsDependencyComponent;
import ru.ozon.app.android.analytics.di.DaggerAnalyticsDependencyComponent;
import ru.ozon.app.android.analytics.screen.storage.di.AnalyticsScreenStorageComponentApi;
import ru.ozon.app.android.di.component.ApplicationComponent;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.limb.Limb2ComponentApi;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.storage.di.StorageComponentApi;
import ru.ozon.app.android.tabbar.di.TabsUiControllerComponentApi;
import ru.ozon.app.android.tabbar.feature.di.DaggerTabUiControllerComponent;
import ru.ozon.app.android.tabbar.feature.di.TabUiControllerComponent;
import ru.ozon.app.android.utils.dispatcherprovider.CoroutineDispatcherProvider;
import ru.ozon.app.android.utils.dispatcherprovider.CoroutineDispatcherProviderImpl;
import ru.ozon.app.android.utils.dispatcherprovider.di.CoroutineDispatchersComponentApi;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b!\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lru/ozon/app/android/di/FactoryModule;", "", "Companion", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class FactoryModule {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JS\u0010\u000e\u001a\u00060\fj\u0002`\r2>\u0010\u000b\u001a:\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u00060\u0006j\u0002`\u00070\u0005\u0012 \u0012\u001e\u0012\n\b\u0001\u0012\u00060\u0006j\u0002`\u00070\bj\u000e\u0012\n\b\u0001\u0012\u00060\u0006j\u0002`\u0007`\t0\u0004j\u0002`\nH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0011\u001a\u0012\u0012\n\b\u0001\u0012\u00060\u0006j\u0002`\u00070\bj\u0002`\u0010H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0013\u001a\u0012\u0012\n\b\u0001\u0012\u00060\u0006j\u0002`\u00070\bj\u0002`\u0010H\u0007¢\u0006\u0004\b\u0013\u0010\u0012J\u001f\u0010\u0014\u001a\u0012\u0012\n\b\u0001\u0012\u00060\u0006j\u0002`\u00070\bj\u0002`\u0010H\u0007¢\u0006\u0004\b\u0014\u0010\u0012¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/di/FactoryModule$Companion;", "", "<init>", "()V", "", "Ljava/lang/Class;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lii/a;", "Lru/ozon/app/android/di/provider/factory/ComponentFactory;", "Lru/ozon/app/android/di/FactoryCache;", "factories", "Lgi/b;", "Lru/ozon/app/android/di/provider/factory/ComponentStorage;", "provideComponentStorage", "(Ljava/util/Map;)Lgi/b;", "Lru/ozon/app/android/di/Factory;", "provideCoroutineDispatchersComponentApi", "()Lii/a;", "provideTabsUiControllerComponentApi", "bindAnalyticsDependencyComponentFactory", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final AnalyticsDependencyComponent bindAnalyticsDependencyComponentFactory$lambda$2(C6740b componentStorage) {
            Intrinsics.checkNotNullParameter(componentStorage, "componentStorage");
            AnalyticsDependencyComponent.Factory factory = DaggerAnalyticsDependencyComponent.factory();
            if (ApplicationComponent.class.isAssignableFrom(InterfaceC6958a.class)) {
                throw new IllegalStateException("Requested component ApplicationComponent is not DiComponent");
            }
            ApplicationComponent applicationComponent = (ApplicationComponent) componentStorage.b(ApplicationComponent.class);
            if (NetworkComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
                throw new IllegalStateException("Requested component NetworkComponentApi is not DiComponent");
            }
            NetworkComponentApi networkComponentApi = (NetworkComponentApi) componentStorage.b(NetworkComponentApi.class);
            if (StorageComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
                throw new IllegalStateException("Requested component StorageComponentApi is not DiComponent");
            }
            StorageComponentApi storageComponentApi = (StorageComponentApi) componentStorage.b(StorageComponentApi.class);
            if (AdvertisingServiceComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
                throw new IllegalStateException("Requested component AdvertisingServiceComponentApi is not DiComponent");
            }
            AdvertisingServiceComponentApi advertisingServiceComponentApi = (AdvertisingServiceComponentApi) componentStorage.b(AdvertisingServiceComponentApi.class);
            if (AnalyticsScreenStorageComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
                throw new IllegalStateException("Requested component AnalyticsScreenStorageComponentApi is not DiComponent");
            }
            AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi = (AnalyticsScreenStorageComponentApi) componentStorage.b(AnalyticsScreenStorageComponentApi.class);
            if (Limb2ComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
                throw new IllegalStateException("Requested component Limb2ComponentApi is not DiComponent");
            }
            return factory.create(applicationComponent, networkComponentApi, storageComponentApi, advertisingServiceComponentApi, analyticsScreenStorageComponentApi, (Limb2ComponentApi) componentStorage.b(Limb2ComponentApi.class));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CoroutineDispatchersComponentApi provideCoroutineDispatchersComponentApi$lambda$0(C6740b it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new CoroutineDispatchersComponentApi() { // from class: ru.ozon.app.android.di.FactoryModule$Companion$provideCoroutineDispatchersComponentApi$1$1

                /* renamed from: provider$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j provider = k.b(FactoryModule$Companion$provideCoroutineDispatchersComponentApi$1$1$provider$2.INSTANCE);

                @Override // ru.ozon.app.android.utils.dispatcherprovider.di.CoroutineDispatchersComponentApi
                public CoroutineDispatcherProvider getDispatcherProvider() {
                    return getProvider();
                }

                public final CoroutineDispatcherProviderImpl getProvider() {
                    return (CoroutineDispatcherProviderImpl) this.provider.getValue();
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final TabsUiControllerComponentApi provideTabsUiControllerComponentApi$lambda$1(C6740b it) {
            Intrinsics.checkNotNullParameter(it, "it");
            TabUiControllerComponent.Factory factory = DaggerTabUiControllerComponent.factory();
            if (ContextComponentDependencies.class.isAssignableFrom(InterfaceC6958a.class)) {
                throw new IllegalStateException("Requested component ContextComponentDependencies is not DiComponent");
            }
            return factory.create((ContextComponentDependencies) it.b(ContextComponentDependencies.class));
        }

        @NotNull
        public final InterfaceC7081a<? extends InterfaceC6958a> bindAnalyticsDependencyComponentFactory() {
            return new C2784a();
        }

        @NotNull
        public final C6740b provideComponentStorage(@NotNull Map<Class<? extends InterfaceC6958a>, InterfaceC7081a<? extends InterfaceC6958a>> factories) {
            Intrinsics.checkNotNullParameter(factories, "factories");
            return new C6740b(factories);
        }

        @NotNull
        public final InterfaceC7081a<? extends InterfaceC6958a> provideCoroutineDispatchersComponentApi() {
            return new b();
        }

        @NotNull
        public final InterfaceC7081a<? extends InterfaceC6958a> provideTabsUiControllerComponentApi() {
            return new c();
        }

        private Companion() {
        }
    }
}
