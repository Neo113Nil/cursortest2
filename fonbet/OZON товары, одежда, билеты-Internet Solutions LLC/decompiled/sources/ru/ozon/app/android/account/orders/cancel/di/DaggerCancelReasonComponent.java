package ru.ozon.app.android.account.orders.cancel.di;

import Jb.j;
import Jb.m;
import Pc.a;
import W10.c;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.account.di.AccountComponentApi;
import ru.ozon.app.android.account.orders.OrderChangePreferences;
import ru.ozon.app.android.account.orders.cancel.data.CancelOrderRepositoryImpl;
import ru.ozon.app.android.account.orders.cancel.data.CancelReasonMapper;
import ru.ozon.app.android.account.orders.cancel.di.CancelReasonComponent;
import ru.ozon.app.android.account.orders.cancel.presentation.CancelReasonFragment;
import ru.ozon.app.android.account.orders.cancel.presentation.CancelReasonFragment_MembersInjector;
import ru.ozon.app.android.account.orders.cancel.presentation.CancelReasonViewModelImpl;
import ru.ozon.app.android.account.orders.onorderchangenew.OrderChangeManager;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.analytic.ActionAnalyticDelegate;
import ru.ozon.app.android.cart.common.data.prefetch.CartPrefetchController;
import ru.ozon.app.android.cart.common.di.CartComponentApi;
import ru.ozon.app.android.cart.common.di.CartServiceApi;
import ru.ozon.app.android.cart.common.domain.CartService;
import ru.ozon.app.android.cart.common.presentation.refresh.CartEventsController;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.composer.di.ComposerComponentApi;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.delivery.customActionsHandlers.fetchcancelreasons.data.CancelReasonsWithPayloads;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.network.di.NetworkComponentApi;

/* loaded from: classes11.dex */
public final class DaggerCancelReasonComponent {

    private static final class CancelReasonComponentImpl implements CancelReasonComponent {
        private final AccountComponentApi accountComponentApi;
        private final ActionComponentApi actionComponentApi;
        private final CancelReasonComponentImpl cancelReasonComponentImpl;
        private a<CancelReasonViewModelImpl> cancelReasonViewModelImplProvider;
        private final CancelReasonsWithPayloads cancelReasonsWithPayloads;
        private final CartComponentApi cartComponentApi;
        private final CartServiceApi cartServiceApi;
        private final ComposerComponentApi composerComponentApi;
        private a<HandlersInhibitor> handlersInhibitorProvider;
        private final NetworkComponentApi networkComponentApi;
        private final c trackingData;

        private static final class SwitchingProvider<T> implements a<T> {
            private final CancelReasonComponentImpl cancelReasonComponentImpl;

            /* renamed from: id, reason: collision with root package name */
            private final int f92092id;

            SwitchingProvider(CancelReasonComponentImpl cancelReasonComponentImpl, int i11) {
                this.cancelReasonComponentImpl = cancelReasonComponentImpl;
                this.f92092id = i11;
            }

            @Override // Pc.a
            public T get() {
                int i11 = this.f92092id;
                if (i11 != 0) {
                    if (i11 == 1) {
                        return (T) new HandlersInhibitor();
                    }
                    throw new AssertionError(this.f92092id);
                }
                CancelReasonMapper cancelReasonMapper = new CancelReasonMapper();
                CancelReasonsWithPayloads cancelReasonsWithPayloads = this.cancelReasonComponentImpl.cancelReasonsWithPayloads;
                c cVar = this.cancelReasonComponentImpl.trackingData;
                OrderChangePreferences orderChangePreferences = this.cancelReasonComponentImpl.accountComponentApi.getOrderChangePreferences();
                j.c(orderChangePreferences);
                OrderChangeManager orderChangeManager = this.cancelReasonComponentImpl.accountComponentApi.getOrderChangeManager();
                j.c(orderChangeManager);
                CancelOrderRepositoryImpl cancelOrderRepositoryImpl = this.cancelReasonComponentImpl.cancelOrderRepositoryImpl();
                ActionAnalyticDelegate actionAnalyticDelegate = this.cancelReasonComponentImpl.actionComponentApi.getActionAnalyticDelegate();
                j.c(actionAnalyticDelegate);
                CartPrefetchController cartPrefetchController = this.cancelReasonComponentImpl.cartServiceApi.getCartPrefetchController();
                j.c(cartPrefetchController);
                CartService cartService = this.cancelReasonComponentImpl.cartServiceApi.getCartService();
                j.c(cartService);
                CartEventsController cartEventsController = this.cancelReasonComponentImpl.cartComponentApi.getCartEventsController();
                j.c(cartEventsController);
                ComposerNavigator composerNavigator = this.cancelReasonComponentImpl.composerComponentApi.getComposerNavigator();
                j.c(composerNavigator);
                return (T) new CancelReasonViewModelImpl(cancelReasonMapper, cancelReasonsWithPayloads, cVar, orderChangePreferences, orderChangeManager, cancelOrderRepositoryImpl, actionAnalyticDelegate, cartPrefetchController, cartService, cartEventsController, composerNavigator);
            }
        }

        /* synthetic */ CancelReasonComponentImpl(CartServiceApi cartServiceApi, CartComponentApi cartComponentApi, AccountComponentApi accountComponentApi, NetworkComponentApi networkComponentApi, NavigationComponentApi navigationComponentApi, ComposerComponentApi composerComponentApi, ActionComponentApi actionComponentApi, ContextComponentDependencies contextComponentDependencies, CancelReasonsWithPayloads cancelReasonsWithPayloads, c cVar, int i11) {
            this(cartServiceApi, cartComponentApi, accountComponentApi, networkComponentApi, navigationComponentApi, composerComponentApi, actionComponentApi, contextComponentDependencies, cancelReasonsWithPayloads, cVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public CancelOrderRepositoryImpl cancelOrderRepositoryImpl() {
            ActionV2Repository actionRepository = this.actionComponentApi.getActionRepository();
            j.c(actionRepository);
            JsonParser jsonDeserializer = this.networkComponentApi.getJsonDeserializer();
            j.c(jsonDeserializer);
            return new CancelOrderRepositoryImpl(actionRepository, jsonDeserializer);
        }

        private void initialize(CartServiceApi cartServiceApi, CartComponentApi cartComponentApi, AccountComponentApi accountComponentApi, NetworkComponentApi networkComponentApi, NavigationComponentApi navigationComponentApi, ComposerComponentApi composerComponentApi, ActionComponentApi actionComponentApi, ContextComponentDependencies contextComponentDependencies, CancelReasonsWithPayloads cancelReasonsWithPayloads, c cVar) {
            this.cancelReasonViewModelImplProvider = new SwitchingProvider(this.cancelReasonComponentImpl, 0);
            this.handlersInhibitorProvider = m.a(new SwitchingProvider(this.cancelReasonComponentImpl, 1));
        }

        private CancelReasonFragment injectCancelReasonFragment(CancelReasonFragment cancelReasonFragment) {
            CancelReasonFragment_MembersInjector.injectPViewModel(cancelReasonFragment, this.cancelReasonViewModelImplProvider);
            CancelReasonFragment_MembersInjector.injectHandlersInhibitor(cancelReasonFragment, this.handlersInhibitorProvider.get());
            return cancelReasonFragment;
        }

        @Override // ru.ozon.app.android.account.orders.cancel.di.CancelReasonComponent
        public void inject(CancelReasonFragment cancelReasonFragment) {
            injectCancelReasonFragment(cancelReasonFragment);
        }

        private CancelReasonComponentImpl(CartServiceApi cartServiceApi, CartComponentApi cartComponentApi, AccountComponentApi accountComponentApi, NetworkComponentApi networkComponentApi, NavigationComponentApi navigationComponentApi, ComposerComponentApi composerComponentApi, ActionComponentApi actionComponentApi, ContextComponentDependencies contextComponentDependencies, CancelReasonsWithPayloads cancelReasonsWithPayloads, c cVar) {
            this.cancelReasonComponentImpl = this;
            this.cancelReasonsWithPayloads = cancelReasonsWithPayloads;
            this.trackingData = cVar;
            this.accountComponentApi = accountComponentApi;
            this.actionComponentApi = actionComponentApi;
            this.networkComponentApi = networkComponentApi;
            this.cartServiceApi = cartServiceApi;
            this.cartComponentApi = cartComponentApi;
            this.composerComponentApi = composerComponentApi;
            initialize(cartServiceApi, cartComponentApi, accountComponentApi, networkComponentApi, navigationComponentApi, composerComponentApi, actionComponentApi, contextComponentDependencies, cancelReasonsWithPayloads, cVar);
        }
    }

    private static final class Factory implements CancelReasonComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.account.orders.cancel.di.CancelReasonComponent.Factory
        public CancelReasonComponent create(CartServiceApi cartServiceApi, CartComponentApi cartComponentApi, AccountComponentApi accountComponentApi, NetworkComponentApi networkComponentApi, NavigationComponentApi navigationComponentApi, ComposerComponentApi composerComponentApi, ActionComponentApi actionComponentApi, ContextComponentDependencies contextComponentDependencies, CancelReasonsWithPayloads cancelReasonsWithPayloads, c cVar) {
            cartServiceApi.getClass();
            cartComponentApi.getClass();
            accountComponentApi.getClass();
            networkComponentApi.getClass();
            navigationComponentApi.getClass();
            composerComponentApi.getClass();
            actionComponentApi.getClass();
            contextComponentDependencies.getClass();
            cancelReasonsWithPayloads.getClass();
            cVar.getClass();
            return new CancelReasonComponentImpl(cartServiceApi, cartComponentApi, accountComponentApi, networkComponentApi, navigationComponentApi, composerComponentApi, actionComponentApi, contextComponentDependencies, cancelReasonsWithPayloads, cVar, 0);
        }

        private Factory() {
        }
    }

    public static CancelReasonComponent.Factory factory() {
        return new Factory(0);
    }
}
