package ru.ozon.app.android.limb2.di.modules;

import Ld0.d;
import Ld0.e;
import Sc.InterfaceC4008j;
import Sc.k;
import Tb0.h;
import Ub0.b;
import Ub0.d;
import android.app.Application;
import ej.C6375d;
import ej.C6377f;
import gi.C6739a;
import gi.C6740b;
import hi.InterfaceC6958a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kb0.EnumC7626a;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import lb0.C7914a;
import lb0.c;
import org.jetbrains.annotations.NotNull;
import p20.C8838c;
import pf0.n;
import ru.ozon.app.android.abtool.AbToolPluginProvider;
import ru.ozon.app.android.abtool.FeatureServiceConfig;
import ru.ozon.app.android.abtool.data.model.FeatureDTO;
import ru.ozon.app.android.account.locale.app.data.AppLocaleRepository;
import ru.ozon.app.android.account.orders.emptyscreen.antibot.OpenBarcodeButtonConfig;
import ru.ozon.app.android.network.abtool.AbNamespaceProvider;
import ru.ozon.app.android.network.abtool.flag.FeatureFlagRegistrationModel;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.network.di.NetworkComponentDependencies;
import ru.ozon.app.android.network.di.NetworkPluginProvidersComponentApi;
import ru.ozon.app.android.network.version.AppVersionService;
import ru.ozon.app.android.storage.di.StorageComponentApi;
import ru.ozon.app.android.storage.environment.EnvironmentService;
import ru.ozon.app.android.utils.ContextUtilsKt;
import ru.ozon.app.android.utils.buildUtils.BuildUtils;
import ru.ozon.host.config.external.AppId;
import zZ.C11009b;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 ,2\u00020\u0001:\u0001,B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f*\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J%\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u001f\u001a\u00020\u0014H\u0007¢\u0006\u0004\b \u0010!J\u001d\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u001f\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\"\u0010!J-\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010$\u001a\u00020#H\u0007¢\u0006\u0004\b%\u0010&J\u0015\u0010'\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0007¢\u0006\u0004\b'\u0010\u001eJ\u0015\u0010(\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0007¢\u0006\u0004\b(\u0010\u001eJ\u001d\u0010)\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b)\u0010*J\u0015\u0010+\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0007¢\u0006\u0004\b+\u0010\u001e¨\u0006-"}, d2 = {"Lru/ozon/app/android/limb2/di/modules/Limb2PluginProvidersModule;", "", "<init>", "()V", "LSc/j;", "Lru/ozon/app/android/account/locale/app/data/AppLocaleRepository;", "appLocaleRepository", "LUb0/b;", "getLocaleProvider", "(LSc/j;)LUb0/b;", "", "Lru/ozon/app/android/network/abtool/flag/FeatureFlagRegistrationModel;", "", "Lru/ozon/app/android/abtool/data/model/FeatureDTO;", "asFeatureDto", "(Ljava/util/Set;)Ljava/util/List;", "Landroid/app/Application;", "application", "LNd0/c;", "hostName", "LLd0/d;", "provideLimb2GlobalConfig", "(Landroid/app/Application;LNd0/c;)LLd0/d;", "Lru/ozon/app/android/network/abtool/AbNamespaceProvider;", "abNamespaceProvider", "LOd0/d;", "LLd0/e;", "provideAbToolPluginProvider", "(Landroid/app/Application;Lru/ozon/app/android/network/abtool/AbNamespaceProvider;)LOd0/d;", "provideTrackerPluginProvider", "()LOd0/d;", "globalConfig", "providesOzonNetworkPluginProvider", "(LLd0/d;)LOd0/d;", "providesDebugFeaturesAccessLevelPluginProvider", "Lru/ozon/app/android/account/orders/emptyscreen/antibot/OpenBarcodeButtonConfig;", "openBarcodeButtonConfig", "provideOzonIdPluginProvider", "(LLd0/d;Landroid/app/Application;Lru/ozon/app/android/account/orders/emptyscreen/antibot/OpenBarcodeButtonConfig;)LOd0/d;", "provideInAppUpdatePluginProvider", "provideCdnChooserLimbPlugin", "provideHostConfigPluginProvider", "(Landroid/app/Application;)LOd0/d;", "provideCompassLimbPlugin", "Companion", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Limb2PluginProvidersModule {
    private final List<FeatureDTO> asFeatureDto(Set<FeatureFlagRegistrationModel> set) {
        Set<FeatureFlagRegistrationModel> set2 = set;
        ArrayList arrayList = new ArrayList(C7714v.z(set2, 10));
        for (FeatureFlagRegistrationModel featureFlagRegistrationModel : set2) {
            String serviceName = featureFlagRegistrationModel.getFlag().getServiceName();
            String featureName = featureFlagRegistrationModel.getFlag().getFeatureName();
            arrayList.add(new FeatureDTO(featureFlagRegistrationModel.getDisplayedName(), serviceName, featureName, featureFlagRegistrationModel.getValueType(), featureFlagRegistrationModel.getDefaultValue(), null, featureFlagRegistrationModel.getUpdateStrategy(), 32, null));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final b getLocaleProvider(InterfaceC4008j<? extends AppLocaleRepository> appLocaleRepository) {
        return new BY.b(appLocaleRepository);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d getLocaleProvider$lambda$1(InterfaceC4008j interfaceC4008j) {
        Object obj;
        String language = ((AppLocaleRepository) interfaceC4008j.getValue()).getDisplayedLocale().getLanguage();
        Iterator<E> it = d.a().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.d(((d) obj).d().getLanguage(), language)) {
                break;
            }
        }
        d dVar = (d) obj;
        if (dVar != null) {
            return dVar;
        }
        d.Companion.getClass();
        return d.Russian;
    }

    @NotNull
    public final Od0.d<e> provideAbToolPluginProvider(@NotNull Application application, @NotNull AbNamespaceProvider abNamespaceProvider) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(abNamespaceProvider, "abNamespaceProvider");
        if (NetworkComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NetworkComponentApi is not DiComponent");
        }
        C6740b dependencyStorage = C6739a.a(application, NetworkComponentApi.class).getDependencyStorage();
        if (NetworkComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NetworkComponentApi is not DiComponent");
        }
        NetworkComponentApi networkComponentApi = (NetworkComponentApi) dependencyStorage.b(NetworkComponentApi.class);
        if (NetworkPluginProvidersComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NetworkPluginProvidersComponentApi is not DiComponent");
        }
        C6740b dependencyStorage2 = C6739a.a(application, NetworkPluginProvidersComponentApi.class).getDependencyStorage();
        if (NetworkPluginProvidersComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NetworkPluginProvidersComponentApi is not DiComponent");
        }
        NetworkPluginProvidersComponentApi networkPluginProvidersComponentApi = (NetworkPluginProvidersComponentApi) dependencyStorage2.b(NetworkPluginProvidersComponentApi.class);
        if (NetworkComponentDependencies.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NetworkComponentDependencies is not DiComponent");
        }
        C6740b dependencyStorage3 = C6739a.a(application, NetworkComponentDependencies.class).getDependencyStorage();
        if (NetworkComponentDependencies.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NetworkComponentDependencies is not DiComponent");
        }
        NetworkComponentDependencies networkComponentDependencies = (NetworkComponentDependencies) dependencyStorage3.b(NetworkComponentDependencies.class);
        ArrayList p02 = C7714v.p0(networkPluginProvidersComponentApi.getTrailingHostInterceptors(), networkPluginProvidersComponentApi.getLeadingHostInterceptors());
        Fb0.e appDomain = networkComponentApi.getNetworkComponentConfig().getAppDomain();
        String provide = abNamespaceProvider.provide();
        List<FeatureDTO> asFeatureDto = asFeatureDto(networkComponentDependencies.getFeatureFlags());
        boolean isDebugOrQaUser = networkPluginProvidersComponentApi.getNetworkAtMostQaUserPredicate().isDebugOrQaUser();
        Long featureServiceRefreshInterval = networkComponentDependencies.getFeatureServiceRefreshInterval();
        return new AbToolPluginProvider(new FeatureServiceConfig(appDomain, provide, asFeatureDto, p02, null, isDebugOrQaUser, null, Long.valueOf(featureServiceRefreshInterval != null ? featureServiceRefreshInterval.longValue() : TimeUnit.HOURS.toMillis(24L)), null, C7714v.a0("mobile_config"), false, false, false, 6480, null));
    }

    @NotNull
    public final Od0.d<e> provideCdnChooserLimbPlugin() {
        return new XY.b();
    }

    @NotNull
    public final Od0.d<e> provideCompassLimbPlugin() {
        return new C11009b();
    }

    @NotNull
    public final Od0.d<e> provideHostConfigPluginProvider(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        if (StorageComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component StorageComponentApi is not DiComponent");
        }
        C6740b dependencyStorage = C6739a.a(application, StorageComponentApi.class).getDependencyStorage();
        if (StorageComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component StorageComponentApi is not DiComponent");
        }
        return new c(new C7914a.C1230a(ContextUtilsKt.isOzonTravelApplication(application) ? AppId.Travel.INSTANCE : ContextUtilsKt.isOzonFreshApplication(application) ? AppId.Fresh.INSTANCE : ContextUtilsKt.isOzonSelectApplication(application) ? AppId.Select.INSTANCE : AppId.BX.INSTANCE, ((StorageComponentApi) dependencyStorage.b(StorageComponentApi.class)).getEnvironmentService().isStage() ? EnumC7626a.Stg : EnumC7626a.Prod).a());
    }

    @NotNull
    public final Od0.d<e> provideInAppUpdatePluginProvider() {
        C6375d.a aVar = new C6375d.a();
        BuildUtils buildUtils = BuildUtils.INSTANCE;
        aVar.b(buildUtils.isDebug() || buildUtils.isQaFlavor());
        return new C6377f(aVar.a());
    }

    @NotNull
    public final Ld0.d provideLimb2GlobalConfig(@NotNull Application application, @NotNull Nd0.c hostName) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(hostName, "hostName");
        BuildUtils buildUtils = BuildUtils.INSTANCE;
        return new d.a(application, (buildUtils.isQaFlavor() || buildUtils.isDebug()) ? Nd0.b.DEBUG : Nd0.b.RELEASE, hostName).a();
    }

    @NotNull
    public final Od0.d<e> provideOzonIdPluginProvider(@NotNull Ld0.d globalConfig, @NotNull Application application, @NotNull OpenBarcodeButtonConfig openBarcodeButtonConfig) {
        Intrinsics.checkNotNullParameter(globalConfig, "globalConfig");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(openBarcodeButtonConfig, "openBarcodeButtonConfig");
        if (NetworkComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NetworkComponentApi is not DiComponent");
        }
        C6740b dependencyStorage = C6739a.a(application, NetworkComponentApi.class).getDependencyStorage();
        if (NetworkComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NetworkComponentApi is not DiComponent");
        }
        NetworkComponentApi networkComponentApi = (NetworkComponentApi) dependencyStorage.b(NetworkComponentApi.class);
        if (StorageComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component StorageComponentApi is not DiComponent");
        }
        C6740b dependencyStorage2 = C6739a.a(application, StorageComponentApi.class).getDependencyStorage();
        if (StorageComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component StorageComponentApi is not DiComponent");
        }
        StorageComponentApi storageComponentApi = (StorageComponentApi) dependencyStorage2.b(StorageComponentApi.class);
        if (NetworkComponentDependencies.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NetworkComponentDependencies is not DiComponent");
        }
        C6740b dependencyStorage3 = C6739a.a(application, NetworkComponentDependencies.class).getDependencyStorage();
        if (NetworkComponentDependencies.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NetworkComponentDependencies is not DiComponent");
        }
        NetworkComponentDependencies networkComponentDependencies = (NetworkComponentDependencies) dependencyStorage3.b(NetworkComponentDependencies.class);
        AppVersionService appVersionService = networkComponentApi.getAppVersionService();
        InterfaceC4008j b11 = k.b(new Limb2PluginProvidersModule$provideOzonIdPluginProvider$debugHeaderService$1(networkComponentApi));
        InterfaceC4008j b12 = k.b(new Limb2PluginProvidersModule$provideOzonIdPluginProvider$appLocaleRepository$1(application));
        EnvironmentService environmentService = storageComponentApi.getEnvironmentService();
        InterfaceC4008j b13 = k.b(new Limb2PluginProvidersModule$provideOzonIdPluginProvider$userStorage$1(storageComponentApi));
        InterfaceC4008j b14 = k.b(new Limb2PluginProvidersModule$provideOzonIdPluginProvider$featureChecker$1(networkComponentApi));
        return new h(globalConfig, new Limb2PluginProvidersModule$provideOzonIdPluginProvider$1(environmentService, appVersionService, application, openBarcodeButtonConfig, networkComponentDependencies, this, b12, b11, k.b(new Limb2PluginProvidersModule$provideOzonIdPluginProvider$cookieEventsLazy$1(storageComponentApi)), k.b(new Limb2PluginProvidersModule$provideOzonIdPluginProvider$antibotPerfAnalyticService$1(networkComponentDependencies)), b14, b13));
    }

    @NotNull
    public final Od0.d<e> provideTrackerPluginProvider() {
        return new Ij0.b();
    }

    @NotNull
    public final Od0.d<e> providesDebugFeaturesAccessLevelPluginProvider(@NotNull Ld0.d globalConfig) {
        Intrinsics.checkNotNullParameter(globalConfig, "globalConfig");
        return new C8838c(globalConfig);
    }

    @NotNull
    public final Od0.d<e> providesOzonNetworkPluginProvider(@NotNull Ld0.d globalConfig) {
        Intrinsics.checkNotNullParameter(globalConfig, "globalConfig");
        return new n(globalConfig, K.f71697a);
    }
}
