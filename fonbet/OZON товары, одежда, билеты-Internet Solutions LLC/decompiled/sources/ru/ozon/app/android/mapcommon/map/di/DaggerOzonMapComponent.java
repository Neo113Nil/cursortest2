package ru.ozon.app.android.mapcommon.map.di;

import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.mapcommon.map.di.OzonMapComponent;
import ru.ozon.app.android.mapcommon.map.provider.map.OzonMapProvider;
import ru.ozon.app.android.mapcommon.map.provider.map.OzonMapProviderImpl;
import ru.ozon.app.android.mapcommon.map.provider.suggestions.OzonSuggestionsProvider;
import ru.ozon.app.android.mapcommon.map.provider.suggestions.OzonSuggestionsProviderImpl;
import ru.ozon.app.android.network.di.NetworkComponentApi;

/* loaded from: classes6.dex */
public final class DaggerOzonMapComponent {

    private static final class Factory implements OzonMapComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.mapcommon.map.di.OzonMapComponent.Factory
        public OzonMapComponent create(ContextComponentDependencies contextComponentDependencies, NetworkComponentApi networkComponentApi) {
            contextComponentDependencies.getClass();
            networkComponentApi.getClass();
            return new OzonMapComponentImpl(0, contextComponentDependencies, networkComponentApi);
        }

        private Factory() {
        }
    }

    private static final class OzonMapComponentImpl implements OzonMapComponent {
        private final OzonMapComponentImpl ozonMapComponentImpl;

        /* synthetic */ OzonMapComponentImpl(int i11, ContextComponentDependencies contextComponentDependencies, NetworkComponentApi networkComponentApi) {
            this(contextComponentDependencies, networkComponentApi);
        }

        @Override // ru.ozon.app.android.mapcommon.map.di.OzonMapComponentApi
        public OzonMapProvider getOzonMapProvider() {
            return new OzonMapProviderImpl();
        }

        @Override // ru.ozon.app.android.mapcommon.map.di.OzonMapComponentApi
        public OzonSuggestionsProvider getOzonSuggestionsProvider() {
            return new OzonSuggestionsProviderImpl();
        }

        private OzonMapComponentImpl(ContextComponentDependencies contextComponentDependencies, NetworkComponentApi networkComponentApi) {
            this.ozonMapComponentImpl = this;
        }
    }

    public static OzonMapComponent.Factory factory() {
        return new Factory(0);
    }
}
