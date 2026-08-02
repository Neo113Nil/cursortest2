package ru.ozon.app.android.cart.premiumPointsTrainV2.di;

import ru.ozon.app.android.cart.premiumPointsTrainV2.di.PremiumPointsTrainV2Component;
import ru.ozon.app.android.network.di.NetworkComponentApi;

/* loaded from: classes11.dex */
public final class DaggerPremiumPointsTrainV2Component {

    private static final class Factory implements PremiumPointsTrainV2Component.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.cart.premiumPointsTrainV2.di.PremiumPointsTrainV2Component.Factory
        public PremiumPointsTrainV2Component create(NetworkComponentApi networkComponentApi) {
            networkComponentApi.getClass();
            return new PremiumPointsTrainV2ComponentImpl(networkComponentApi, 0);
        }

        private Factory() {
        }
    }

    private static final class PremiumPointsTrainV2ComponentImpl implements PremiumPointsTrainV2Component {
        private final NetworkComponentApi networkComponentApi;
        private final PremiumPointsTrainV2ComponentImpl premiumPointsTrainV2ComponentImpl;

        /* synthetic */ PremiumPointsTrainV2ComponentImpl(NetworkComponentApi networkComponentApi, int i11) {
            this(networkComponentApi);
        }

        private PremiumPointsTrainV2ComponentImpl(NetworkComponentApi networkComponentApi) {
            this.premiumPointsTrainV2ComponentImpl = this;
            this.networkComponentApi = networkComponentApi;
        }
    }

    public static PremiumPointsTrainV2Component.Factory factory() {
        return new Factory(0);
    }
}
