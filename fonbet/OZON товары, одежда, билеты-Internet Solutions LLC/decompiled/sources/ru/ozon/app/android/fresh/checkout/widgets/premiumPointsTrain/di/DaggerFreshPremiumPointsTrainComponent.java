package ru.ozon.app.android.fresh.checkout.widgets.premiumPointsTrain.di;

import ru.ozon.app.android.fresh.checkout.widgets.premiumPointsTrain.di.FreshPremiumPointsTrainComponent;
import ru.ozon.app.android.network.di.NetworkComponentApi;

/* loaded from: classes12.dex */
public final class DaggerFreshPremiumPointsTrainComponent {

    private static final class Factory implements FreshPremiumPointsTrainComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.fresh.checkout.widgets.premiumPointsTrain.di.FreshPremiumPointsTrainComponent.Factory
        public FreshPremiumPointsTrainComponent create(NetworkComponentApi networkComponentApi) {
            networkComponentApi.getClass();
            return new FreshPremiumPointsTrainComponentImpl(networkComponentApi, 0);
        }

        private Factory() {
        }
    }

    private static final class FreshPremiumPointsTrainComponentImpl implements FreshPremiumPointsTrainComponent {
        private final FreshPremiumPointsTrainComponentImpl freshPremiumPointsTrainComponentImpl;
        private final NetworkComponentApi networkComponentApi;

        /* synthetic */ FreshPremiumPointsTrainComponentImpl(NetworkComponentApi networkComponentApi, int i11) {
            this(networkComponentApi);
        }

        private FreshPremiumPointsTrainComponentImpl(NetworkComponentApi networkComponentApi) {
            this.freshPremiumPointsTrainComponentImpl = this;
            this.networkComponentApi = networkComponentApi;
        }
    }

    public static FreshPremiumPointsTrainComponent.Factory factory() {
        return new Factory(0);
    }
}
