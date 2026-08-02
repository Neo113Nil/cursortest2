package ru.ozon.app.android.bank.push.di;

import Jb.d;
import Jb.j;
import Pc.a;
import android.content.Context;
import com.squareup.moshi.Moshi;
import ru.ozon.app.android.account.di.AccountComponentApi;
import ru.ozon.app.android.bank.domain.FintechLibApi;
import ru.ozon.app.android.bank.push.di.FintechNotificationServiceComponent;
import ru.ozon.app.android.bank.push.domain.NotificationServiceInteractor;
import ru.ozon.app.android.bank.push.domain.NotificationServiceInteractorImpl;
import ru.ozon.app.android.bank.push.domain.NotificationServiceInteractorImpl_Factory;
import ru.ozon.app.android.bank.push.domain.NotificationToPushModelMapper;
import ru.ozon.app.android.bank.push.domain.NotificationToPushModelMapper_Factory;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.storage.di.StorageComponentApi;
import ru.ozon.fintech.lib.FintechCoreLib;

/* loaded from: classes11.dex */
public final class DaggerFintechNotificationServiceComponent {

    private static final class Factory implements FintechNotificationServiceComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.bank.push.di.FintechNotificationServiceComponent.Factory
        public FintechNotificationServiceComponent create(AccountComponentApi accountComponentApi, ContextComponentDependencies contextComponentDependencies, NetworkComponentApi networkComponentApi, StorageComponentApi storageComponentApi, FintechLibApi fintechLibApi) {
            accountComponentApi.getClass();
            contextComponentDependencies.getClass();
            networkComponentApi.getClass();
            storageComponentApi.getClass();
            fintechLibApi.getClass();
            return new FintechNotificationServiceComponentImpl(accountComponentApi, contextComponentDependencies, networkComponentApi, storageComponentApi, fintechLibApi, 0);
        }

        private Factory() {
        }
    }

    private static final class FintechNotificationServiceComponentImpl implements FintechNotificationServiceComponent {
        private a<NotificationServiceInteractor> bindsNotificationServiceInteractorProvider;
        private final FintechLibApi fintechLibApi;
        private final FintechNotificationServiceComponentImpl fintechNotificationServiceComponentImpl;
        private a<Context> getContextProvider;
        private a<FintechCoreLib> getFintechCoreLibBankProvider;
        private a<Moshi> getMoshiProvider;
        private a<NotificationServiceInteractorImpl> notificationServiceInteractorImplProvider;
        private a<NotificationToPushModelMapper> notificationToPushModelMapperProvider;

        private static final class GetContextProvider implements a<Context> {
            private final ContextComponentDependencies contextComponentDependencies;

            GetContextProvider(ContextComponentDependencies contextComponentDependencies) {
                this.contextComponentDependencies = contextComponentDependencies;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // Pc.a
            public Context get() {
                Context context = this.contextComponentDependencies.getContext();
                j.c(context);
                return context;
            }
        }

        private static final class GetFintechCoreLibBankProvider implements a<FintechCoreLib> {
            private final FintechLibApi fintechLibApi;

            GetFintechCoreLibBankProvider(FintechLibApi fintechLibApi) {
                this.fintechLibApi = fintechLibApi;
            }

            @Override // Pc.a
            public FintechCoreLib get() {
                FintechCoreLib fintechCoreLibBank = this.fintechLibApi.getFintechCoreLibBank();
                j.c(fintechCoreLibBank);
                return fintechCoreLibBank;
            }
        }

        private static final class GetMoshiProvider implements a<Moshi> {
            private final NetworkComponentApi networkComponentApi;

            GetMoshiProvider(NetworkComponentApi networkComponentApi) {
                this.networkComponentApi = networkComponentApi;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // Pc.a
            public Moshi get() {
                Moshi moshi = this.networkComponentApi.getMoshi();
                j.c(moshi);
                return moshi;
            }
        }

        /* synthetic */ FintechNotificationServiceComponentImpl(AccountComponentApi accountComponentApi, ContextComponentDependencies contextComponentDependencies, NetworkComponentApi networkComponentApi, StorageComponentApi storageComponentApi, FintechLibApi fintechLibApi, int i11) {
            this(accountComponentApi, contextComponentDependencies, networkComponentApi, storageComponentApi, fintechLibApi);
        }

        private void initialize(AccountComponentApi accountComponentApi, ContextComponentDependencies contextComponentDependencies, NetworkComponentApi networkComponentApi, StorageComponentApi storageComponentApi, FintechLibApi fintechLibApi) {
            GetContextProvider getContextProvider = new GetContextProvider(contextComponentDependencies);
            this.getContextProvider = getContextProvider;
            this.notificationToPushModelMapperProvider = NotificationToPushModelMapper_Factory.create(getContextProvider);
            this.getFintechCoreLibBankProvider = new GetFintechCoreLibBankProvider(fintechLibApi);
            GetMoshiProvider getMoshiProvider = new GetMoshiProvider(networkComponentApi);
            this.getMoshiProvider = getMoshiProvider;
            NotificationServiceInteractorImpl_Factory create = NotificationServiceInteractorImpl_Factory.create(this.notificationToPushModelMapperProvider, this.getFintechCoreLibBankProvider, getMoshiProvider);
            this.notificationServiceInteractorImplProvider = create;
            this.bindsNotificationServiceInteractorProvider = d.b(create);
        }

        @Override // ru.ozon.app.android.bank.push.di.FintechNotificationServiceApi
        public NotificationServiceInteractor provideNotificationServiceInteractor() {
            return this.bindsNotificationServiceInteractorProvider.get();
        }

        private FintechNotificationServiceComponentImpl(AccountComponentApi accountComponentApi, ContextComponentDependencies contextComponentDependencies, NetworkComponentApi networkComponentApi, StorageComponentApi storageComponentApi, FintechLibApi fintechLibApi) {
            this.fintechNotificationServiceComponentImpl = this;
            this.fintechLibApi = fintechLibApi;
            initialize(accountComponentApi, contextComponentDependencies, networkComponentApi, storageComponentApi, fintechLibApi);
        }
    }

    public static FintechNotificationServiceComponent.Factory factory() {
        return new Factory(0);
    }
}
