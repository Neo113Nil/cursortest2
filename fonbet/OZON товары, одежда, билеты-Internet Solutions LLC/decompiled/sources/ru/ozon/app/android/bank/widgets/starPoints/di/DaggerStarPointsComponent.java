package ru.ozon.app.android.bank.widgets.starPoints.di;

import ru.ozon.app.android.bank.widgets.starPoints.di.StarPointsComponent;
import ru.ozon.app.android.network.di.NetworkComponentApi;

/* loaded from: classes11.dex */
public final class DaggerStarPointsComponent {

    private static final class Factory implements StarPointsComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.bank.widgets.starPoints.di.StarPointsComponent.Factory
        public StarPointsComponent create(NetworkComponentApi networkComponentApi) {
            networkComponentApi.getClass();
            return new StarPointsComponentImpl(networkComponentApi, 0);
        }

        private Factory() {
        }
    }

    private static final class StarPointsComponentImpl implements StarPointsComponent {
        private final NetworkComponentApi networkComponentApi;
        private final StarPointsComponentImpl starPointsComponentImpl;

        /* synthetic */ StarPointsComponentImpl(NetworkComponentApi networkComponentApi, int i11) {
            this(networkComponentApi);
        }

        private StarPointsComponentImpl(NetworkComponentApi networkComponentApi) {
            this.starPointsComponentImpl = this;
            this.networkComponentApi = networkComponentApi;
        }
    }

    public static StarPointsComponent.Factory factory() {
        return new Factory(0);
    }
}
