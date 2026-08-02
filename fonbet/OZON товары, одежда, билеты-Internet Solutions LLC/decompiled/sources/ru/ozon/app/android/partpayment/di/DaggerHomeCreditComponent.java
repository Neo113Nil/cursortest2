package ru.ozon.app.android.partpayment.di;

import EZ.h;
import GZ.g;
import Jb.j;
import Jb.k;
import java.util.Set;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.partpayment.di.HomeCreditComponent;
import ru.ozon.app.android.partpayment.presentation.HomeCreditActivity;
import ru.ozon.app.android.partpayment.presentation.HomeCreditActivity_MembersInjector;
import ru.ozon.app.android.partpayment.routing.CompoundDestinationFactoryImpl;
import ru.ozon.app.android.partpayment.routing.DestinationFactory;
import ru.ozon.app.android.partpayment.routing.factories.PartPaymentContractFactory;
import ru.ozon.app.android.partpayment.routing.factories.PartPaymentFactory;
import ru.ozon.app.android.partpayment.routing.factories.PartPaymentLandingFactory;
import ru.ozon.app.android.partpayment.routing.factories.PartPaymentNewLandingFactory;
import ru.ozon.app.android.partpayment.routing.factories.PartPaymentScoringFactory;
import ru.ozon.app.android.partpayment.routing.factories.PartPaymentUserInfoFactory;
import ru.ozon.app.android.partpayment.routing.factories.SmsSignFactory;

/* loaded from: classes13.dex */
public final class DaggerHomeCreditComponent {

    private static final class Factory implements HomeCreditComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.partpayment.di.HomeCreditComponent.Factory
        public HomeCreditComponent create(NavigationComponentApi navigationComponentApi) {
            navigationComponentApi.getClass();
            return new HomeCreditComponentImpl(navigationComponentApi, 0);
        }

        private Factory() {
        }
    }

    private static final class HomeCreditComponentImpl implements HomeCreditComponent {
        private final HomeCreditComponentImpl homeCreditComponentImpl;
        private final NavigationComponentApi navigationComponentApi;

        /* synthetic */ HomeCreditComponentImpl(NavigationComponentApi navigationComponentApi, int i11) {
            this(navigationComponentApi);
        }

        private CompoundDestinationFactoryImpl compoundDestinationFactoryImpl() {
            return new CompoundDestinationFactoryImpl(setOfDestinationFactory());
        }

        private HomeCreditActivity injectHomeCreditActivity(HomeCreditActivity homeCreditActivity) {
            h navigatorHolder = this.navigationComponentApi.getNavigatorHolder();
            j.c(navigatorHolder);
            HomeCreditActivity_MembersInjector.injectNavigatorHolder(homeCreditActivity, navigatorHolder);
            g ozonRouter = this.navigationComponentApi.getOzonRouter();
            j.c(ozonRouter);
            HomeCreditActivity_MembersInjector.injectRouter(homeCreditActivity, ozonRouter);
            HomeCreditActivity_MembersInjector.injectCompoundDestinationFactory(homeCreditActivity, compoundDestinationFactoryImpl());
            return homeCreditActivity;
        }

        private Set<DestinationFactory> setOfDestinationFactory() {
            k d11 = k.d(7);
            d11.a(new PartPaymentLandingFactory());
            d11.a(new PartPaymentNewLandingFactory());
            d11.a(new PartPaymentFactory());
            d11.a(new PartPaymentContractFactory());
            d11.a(new PartPaymentScoringFactory());
            d11.a(new PartPaymentUserInfoFactory());
            d11.a(new SmsSignFactory());
            return d11.c();
        }

        @Override // ru.ozon.app.android.partpayment.di.HomeCreditComponent
        public void inject(HomeCreditActivity homeCreditActivity) {
            injectHomeCreditActivity(homeCreditActivity);
        }

        private HomeCreditComponentImpl(NavigationComponentApi navigationComponentApi) {
            this.homeCreditComponentImpl = this;
            this.navigationComponentApi = navigationComponentApi;
        }
    }

    public static HomeCreditComponent.Factory factory() {
        return new Factory(0);
    }
}
