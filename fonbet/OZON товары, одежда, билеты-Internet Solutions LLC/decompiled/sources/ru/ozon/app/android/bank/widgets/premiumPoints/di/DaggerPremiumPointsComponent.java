package ru.ozon.app.android.bank.widgets.premiumPoints.di;

import ru.ozon.app.android.bank.widgets.premiumPoints.di.PremiumPointsComponent;
import ru.ozon.app.android.network.di.NetworkComponentApi;

/* loaded from: classes11.dex */
public final class DaggerPremiumPointsComponent {

    private static final class Factory implements PremiumPointsComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.bank.widgets.premiumPoints.di.PremiumPointsComponent.Factory
        public PremiumPointsComponent create(NetworkComponentApi networkComponentApi) {
            networkComponentApi.getClass();
            return new PremiumPointsComponentImpl(networkComponentApi, 0);
        }

        private Factory() {
        }
    }

    private static final class PremiumPointsComponentImpl implements PremiumPointsComponent {
        private final NetworkComponentApi networkComponentApi;
        private final PremiumPointsComponentImpl premiumPointsComponentImpl;

        /* synthetic */ PremiumPointsComponentImpl(NetworkComponentApi networkComponentApi, int i11) {
            this(networkComponentApi);
        }

        private PremiumPointsComponentImpl(NetworkComponentApi networkComponentApi) {
            this.premiumPointsComponentImpl = this;
            this.networkComponentApi = networkComponentApi;
        }
    }

    public static PremiumPointsComponent.Factory factory() {
        return new Factory(0);
    }
}
