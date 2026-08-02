package ru.ozon.app.android.cart.totalV3.di;

import Jb.d;
import Jb.j;
import Pc.a;
import ru.ozon.app.android.account.di.AccountComponentApi;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.cart.common.di.CartServiceApi;
import ru.ozon.app.android.cart.common.domain.CartService;
import ru.ozon.app.android.cart.totalV3.data.TotalMapper;
import ru.ozon.app.android.cart.totalV3.di.TotalV3Component;
import ru.ozon.app.android.cart.totalV3.presentation.TotalViewModel;
import ru.ozon.app.android.composer.di.ComposerComponentApi;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.composer.network.referrer.ReferrerValueController;
import ru.ozon.app.android.composer.widgets.async.data.ComposerAsyncWidgetRepository;
import ru.ozon.app.android.composer.widgets.async.di.ComposerWidgetAsyncComponentApi;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.utils.dispatcherprovider.CoroutineDispatcherProvider;
import ru.ozon.app.android.utils.dispatcherprovider.di.CoroutineDispatchersComponentApi;
import ru.ozon.composer.ui.widget.f;

/* loaded from: classes11.dex */
public final class DaggerTotalV3Component {

    private static final class Factory implements TotalV3Component.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.cart.totalV3.di.TotalV3Component.Factory
        public TotalV3Component create(AccountComponentApi accountComponentApi, ComposerComponentApi composerComponentApi, NetworkComponentApi networkComponentApi, ComposerWidgetAsyncComponentApi composerWidgetAsyncComponentApi, CartServiceApi cartServiceApi, CoroutineDispatchersComponentApi coroutineDispatchersComponentApi, RetainComposerComponentApi retainComposerComponentApi, CustomActionHandlersComponentApi customActionHandlersComponentApi) {
            accountComponentApi.getClass();
            composerComponentApi.getClass();
            networkComponentApi.getClass();
            composerWidgetAsyncComponentApi.getClass();
            cartServiceApi.getClass();
            coroutineDispatchersComponentApi.getClass();
            retainComposerComponentApi.getClass();
            customActionHandlersComponentApi.getClass();
            return new TotalV3ComponentImpl(accountComponentApi, composerComponentApi, networkComponentApi, composerWidgetAsyncComponentApi, cartServiceApi, coroutineDispatchersComponentApi, retainComposerComponentApi, customActionHandlersComponentApi, 0);
        }

        private Factory() {
        }
    }

    private static final class TotalV3ComponentImpl implements TotalV3Component {
        private final CartServiceApi cartServiceApi;
        private final ComposerComponentApi composerComponentApi;
        private final ComposerWidgetAsyncComponentApi composerWidgetAsyncComponentApi;
        private final CoroutineDispatchersComponentApi coroutineDispatchersComponentApi;
        private final CustomActionHandlersComponentApi customActionHandlersComponentApi;
        private final RetainComposerComponentApi retainComposerComponentApi;
        private a<TotalMapper> totalMapperProvider;
        private final TotalV3ComponentImpl totalV3ComponentImpl;

        private static final class SwitchingProvider<T> implements a<T> {

            /* renamed from: id, reason: collision with root package name */
            private final int f92276id;
            private final TotalV3ComponentImpl totalV3ComponentImpl;

            SwitchingProvider(TotalV3ComponentImpl totalV3ComponentImpl, int i11) {
                this.totalV3ComponentImpl = totalV3ComponentImpl;
                this.f92276id = i11;
            }

            @Override // Pc.a
            public T get() {
                if (this.f92276id == 0) {
                    return (T) new TotalMapper();
                }
                throw new AssertionError(this.f92276id);
            }
        }

        /* synthetic */ TotalV3ComponentImpl(AccountComponentApi accountComponentApi, ComposerComponentApi composerComponentApi, NetworkComponentApi networkComponentApi, ComposerWidgetAsyncComponentApi composerWidgetAsyncComponentApi, CartServiceApi cartServiceApi, CoroutineDispatchersComponentApi coroutineDispatchersComponentApi, RetainComposerComponentApi retainComposerComponentApi, CustomActionHandlersComponentApi customActionHandlersComponentApi, int i11) {
            this(accountComponentApi, composerComponentApi, networkComponentApi, composerWidgetAsyncComponentApi, cartServiceApi, coroutineDispatchersComponentApi, retainComposerComponentApi, customActionHandlersComponentApi);
        }

        private void initialize(AccountComponentApi accountComponentApi, ComposerComponentApi composerComponentApi, NetworkComponentApi networkComponentApi, ComposerWidgetAsyncComponentApi composerWidgetAsyncComponentApi, CartServiceApi cartServiceApi, CoroutineDispatchersComponentApi coroutineDispatchersComponentApi, RetainComposerComponentApi retainComposerComponentApi, CustomActionHandlersComponentApi customActionHandlersComponentApi) {
            this.totalMapperProvider = d.b(new SwitchingProvider(this.totalV3ComponentImpl, 0));
        }

        @Override // ru.ozon.app.android.cart.totalV3.di.TotalV3Component
        public Vg.d getCustomActionHandlersStoreFactory() {
            Vg.d customActionHandlersStoreFactory = this.customActionHandlersComponentApi.getCustomActionHandlersStoreFactory();
            j.c(customActionHandlersStoreFactory);
            return customActionHandlersStoreFactory;
        }

        @Override // ru.ozon.app.android.cart.totalV3.di.TotalV3Component
        public TotalMapper getMapper() {
            return this.totalMapperProvider.get();
        }

        @Override // ru.ozon.app.android.cart.totalV3.di.TotalV3Component
        public ReferrerValueController getRefererValueController() {
            ReferrerValueController referrerValueController = this.composerComponentApi.getReferrerValueController();
            j.c(referrerValueController);
            return referrerValueController;
        }

        @Override // ru.ozon.app.android.cart.totalV3.di.TotalV3Component
        public TotalViewModel getViewModel() {
            CartService cartService = this.cartServiceApi.getCartService();
            j.c(cartService);
            ComposerAsyncWidgetRepository composerAsyncWidgetRepository = this.composerWidgetAsyncComponentApi.getComposerAsyncWidgetRepository();
            j.c(composerAsyncWidgetRepository);
            CoroutineDispatcherProvider dispatcherProvider = this.coroutineDispatchersComponentApi.getDispatcherProvider();
            j.c(dispatcherProvider);
            return new TotalViewModel(cartService, composerAsyncWidgetRepository, dispatcherProvider);
        }

        @Override // ru.ozon.app.android.cart.totalV3.di.TotalV3Component
        public f getViewedPond() {
            f viewedPond = this.retainComposerComponentApi.getViewedPond();
            j.c(viewedPond);
            return viewedPond;
        }

        private TotalV3ComponentImpl(AccountComponentApi accountComponentApi, ComposerComponentApi composerComponentApi, NetworkComponentApi networkComponentApi, ComposerWidgetAsyncComponentApi composerWidgetAsyncComponentApi, CartServiceApi cartServiceApi, CoroutineDispatchersComponentApi coroutineDispatchersComponentApi, RetainComposerComponentApi retainComposerComponentApi, CustomActionHandlersComponentApi customActionHandlersComponentApi) {
            this.totalV3ComponentImpl = this;
            this.cartServiceApi = cartServiceApi;
            this.composerWidgetAsyncComponentApi = composerWidgetAsyncComponentApi;
            this.coroutineDispatchersComponentApi = coroutineDispatchersComponentApi;
            this.composerComponentApi = composerComponentApi;
            this.retainComposerComponentApi = retainComposerComponentApi;
            this.customActionHandlersComponentApi = customActionHandlersComponentApi;
            initialize(accountComponentApi, composerComponentApi, networkComponentApi, composerWidgetAsyncComponentApi, cartServiceApi, coroutineDispatchersComponentApi, retainComposerComponentApi, customActionHandlersComponentApi);
        }
    }

    public static TotalV3Component.Factory factory() {
        return new Factory(0);
    }
}
