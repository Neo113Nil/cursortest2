package ru.ozon.app.android.bank.di;

import Jb.e;
import Jb.j;
import Pc.a;
import ei0.InterfaceC6369b;
import qj.C9067a;
import ru.ozon.app.android.bank.externals.OzonTrackerPluginInterctorExternal;

/* loaded from: classes6.dex */
public final class FintechFinanceModule_ProvideOzonTrackerPluginInterctorExternalFactory implements e<OzonTrackerPluginInterctorExternal> {
    private final a<Sg.a> analyticsScreenStorageProvider;
    private final FintechFinanceModule module;
    private final a<C9067a> networkInfoProvider;
    private final a<InterfaceC6369b> trackerProvider;

    public FintechFinanceModule_ProvideOzonTrackerPluginInterctorExternalFactory(FintechFinanceModule fintechFinanceModule, a<InterfaceC6369b> aVar, a<C9067a> aVar2, a<Sg.a> aVar3) {
        this.module = fintechFinanceModule;
        this.trackerProvider = aVar;
        this.networkInfoProvider = aVar2;
        this.analyticsScreenStorageProvider = aVar3;
    }

    public static FintechFinanceModule_ProvideOzonTrackerPluginInterctorExternalFactory create(FintechFinanceModule fintechFinanceModule, a<InterfaceC6369b> aVar, a<C9067a> aVar2, a<Sg.a> aVar3) {
        return new FintechFinanceModule_ProvideOzonTrackerPluginInterctorExternalFactory(fintechFinanceModule, aVar, aVar2, aVar3);
    }

    public static OzonTrackerPluginInterctorExternal provideOzonTrackerPluginInterctorExternal(FintechFinanceModule fintechFinanceModule, InterfaceC6369b interfaceC6369b, C9067a c9067a, Sg.a aVar) {
        OzonTrackerPluginInterctorExternal provideOzonTrackerPluginInterctorExternal = fintechFinanceModule.provideOzonTrackerPluginInterctorExternal(interfaceC6369b, c9067a, aVar);
        j.d(provideOzonTrackerPluginInterctorExternal);
        return provideOzonTrackerPluginInterctorExternal;
    }

    @Override // Pc.a
    public OzonTrackerPluginInterctorExternal get() {
        return provideOzonTrackerPluginInterctorExternal(this.module, this.trackerProvider.get(), this.networkInfoProvider.get(), this.analyticsScreenStorageProvider.get());
    }
}
