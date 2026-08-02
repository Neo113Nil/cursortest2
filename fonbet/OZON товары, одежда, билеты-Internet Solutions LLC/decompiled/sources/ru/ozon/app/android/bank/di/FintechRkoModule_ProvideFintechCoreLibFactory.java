package ru.ozon.app.android.bank.di;

import Jb.e;
import Jb.j;
import Ld0.c;
import Pc.a;
import T80.b;
import android.app.Application;
import b40.InterfaceC5539a;
import i30.C7004a;
import ru.ozon.app.android.account.user.UserManager;
import ru.ozon.app.android.bank.externals.OzonTrackerPluginInterctorExternal;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.storage.environment.EnvironmentService;
import ru.ozon.fintech.auth.domain.external.ExternalFintechAuth;
import ru.ozon.fintech.lib.FintechCoreLib;
import ru.ozon.fintech.network.domain.ExternalNetworkSettings;
import ru.ozon.fintech.settings.domain.ExternalFintechSettings;
import v30.C10219a;

/* loaded from: classes6.dex */
public final class FintechRkoModule_ProvideFintechCoreLibFactory implements e<FintechCoreLib> {
    private final a<C10219a> antiFraudConfigProvider;
    private final a<Application> applicationProvider;
    private final a<EnvironmentService> environmentServiceProvider;
    private final a<InterfaceC5539a> esiaApiProvider;
    private final a<ExternalFintechAuth> externalFintechAuthProvider;
    private final a<b> externalFintechNavigationProvider;
    private final a<ExternalFintechSettings> externalFintechSettingsProvider;
    private final a<ExternalNetworkSettings> externalNetworkSettingsProvider;
    private final a<FeatureChecker> featureCheckerProvider;
    private final a<O30.b> fintechLibTypeProvider;
    private final a<C7004a> graylogConfigProvider;
    private final FintechRkoModule module;
    private final a<c> ozonLimbDiStoreProvider;
    private final a<OzonTrackerPluginInterctorExternal> ozonTrackerProvider;
    private final a<UserManager> userManagerProvider;

    public FintechRkoModule_ProvideFintechCoreLibFactory(FintechRkoModule fintechRkoModule, a<Application> aVar, a<b> aVar2, a<ExternalFintechAuth> aVar3, a<ExternalFintechSettings> aVar4, a<ExternalNetworkSettings> aVar5, a<C7004a> aVar6, a<OzonTrackerPluginInterctorExternal> aVar7, a<C10219a> aVar8, a<EnvironmentService> aVar9, a<O30.b> aVar10, a<UserManager> aVar11, a<InterfaceC5539a> aVar12, a<FeatureChecker> aVar13, a<c> aVar14) {
        this.module = fintechRkoModule;
        this.applicationProvider = aVar;
        this.externalFintechNavigationProvider = aVar2;
        this.externalFintechAuthProvider = aVar3;
        this.externalFintechSettingsProvider = aVar4;
        this.externalNetworkSettingsProvider = aVar5;
        this.graylogConfigProvider = aVar6;
        this.ozonTrackerProvider = aVar7;
        this.antiFraudConfigProvider = aVar8;
        this.environmentServiceProvider = aVar9;
        this.fintechLibTypeProvider = aVar10;
        this.userManagerProvider = aVar11;
        this.esiaApiProvider = aVar12;
        this.featureCheckerProvider = aVar13;
        this.ozonLimbDiStoreProvider = aVar14;
    }

    public static FintechRkoModule_ProvideFintechCoreLibFactory create(FintechRkoModule fintechRkoModule, a<Application> aVar, a<b> aVar2, a<ExternalFintechAuth> aVar3, a<ExternalFintechSettings> aVar4, a<ExternalNetworkSettings> aVar5, a<C7004a> aVar6, a<OzonTrackerPluginInterctorExternal> aVar7, a<C10219a> aVar8, a<EnvironmentService> aVar9, a<O30.b> aVar10, a<UserManager> aVar11, a<InterfaceC5539a> aVar12, a<FeatureChecker> aVar13, a<c> aVar14) {
        return new FintechRkoModule_ProvideFintechCoreLibFactory(fintechRkoModule, aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11, aVar12, aVar13, aVar14);
    }

    public static FintechCoreLib provideFintechCoreLib(FintechRkoModule fintechRkoModule, Application application, b bVar, ExternalFintechAuth externalFintechAuth, ExternalFintechSettings externalFintechSettings, ExternalNetworkSettings externalNetworkSettings, C7004a c7004a, OzonTrackerPluginInterctorExternal ozonTrackerPluginInterctorExternal, C10219a c10219a, EnvironmentService environmentService, O30.b bVar2, UserManager userManager, InterfaceC5539a interfaceC5539a, FeatureChecker featureChecker, c cVar) {
        FintechCoreLib provideFintechCoreLib = fintechRkoModule.provideFintechCoreLib(application, bVar, externalFintechAuth, externalFintechSettings, externalNetworkSettings, c7004a, ozonTrackerPluginInterctorExternal, c10219a, environmentService, bVar2, userManager, interfaceC5539a, featureChecker, cVar);
        j.d(provideFintechCoreLib);
        return provideFintechCoreLib;
    }

    @Override // Pc.a
    public FintechCoreLib get() {
        return provideFintechCoreLib(this.module, this.applicationProvider.get(), this.externalFintechNavigationProvider.get(), this.externalFintechAuthProvider.get(), this.externalFintechSettingsProvider.get(), this.externalNetworkSettingsProvider.get(), this.graylogConfigProvider.get(), this.ozonTrackerProvider.get(), this.antiFraudConfigProvider.get(), this.environmentServiceProvider.get(), this.fintechLibTypeProvider.get(), this.userManagerProvider.get(), this.esiaApiProvider.get(), this.featureCheckerProvider.get(), this.ozonLimbDiStoreProvider.get());
    }
}
