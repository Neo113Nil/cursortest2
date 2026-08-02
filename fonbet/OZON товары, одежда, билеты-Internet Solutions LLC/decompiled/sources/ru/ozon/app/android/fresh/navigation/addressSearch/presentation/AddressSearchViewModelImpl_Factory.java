package ru.ozon.app.android.fresh.navigation.addressSearch.presentation;

import GZ.g;
import Jb.e;
import Pc.a;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.fresh.navigation.addressSearch.domain.AddressValidationRepository;
import ru.ozon.app.android.mapcommon.mapcommon.di.provider.SdkSuggestionsControllerWrapperProvider;

/* loaded from: classes12.dex */
public final class AddressSearchViewModelImpl_Factory implements e<AddressSearchViewModelImpl> {
    private final a<AddressValidationRepository> addressValidationRepostioryProvider;
    private final a<HandlersInhibitor> inhibitorProvider;
    private final a<g> ozonRouterProvider;
    private final a<SdkSuggestionsControllerWrapperProvider> ozonSuggestionsProvider;

    public AddressSearchViewModelImpl_Factory(a<g> aVar, a<HandlersInhibitor> aVar2, a<AddressValidationRepository> aVar3, a<SdkSuggestionsControllerWrapperProvider> aVar4) {
        this.ozonRouterProvider = aVar;
        this.inhibitorProvider = aVar2;
        this.addressValidationRepostioryProvider = aVar3;
        this.ozonSuggestionsProvider = aVar4;
    }

    public static AddressSearchViewModelImpl_Factory create(a<g> aVar, a<HandlersInhibitor> aVar2, a<AddressValidationRepository> aVar3, a<SdkSuggestionsControllerWrapperProvider> aVar4) {
        return new AddressSearchViewModelImpl_Factory(aVar, aVar2, aVar3, aVar4);
    }

    public static AddressSearchViewModelImpl newInstance(g gVar, HandlersInhibitor handlersInhibitor, AddressValidationRepository addressValidationRepository, SdkSuggestionsControllerWrapperProvider sdkSuggestionsControllerWrapperProvider) {
        return new AddressSearchViewModelImpl(gVar, handlersInhibitor, addressValidationRepository, sdkSuggestionsControllerWrapperProvider);
    }

    @Override // Pc.a
    public AddressSearchViewModelImpl get() {
        return newInstance(this.ozonRouterProvider.get(), this.inhibitorProvider.get(), this.addressValidationRepostioryProvider.get(), this.ozonSuggestionsProvider.get());
    }
}
