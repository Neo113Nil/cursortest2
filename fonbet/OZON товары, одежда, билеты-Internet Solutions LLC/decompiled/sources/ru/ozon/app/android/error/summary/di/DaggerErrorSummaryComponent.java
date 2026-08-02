package ru.ozon.app.android.error.summary.di;

import GZ.g;
import Jb.d;
import Jb.j;
import Pc.a;
import ru.ozon.app.android.account.di.AccountComponentApi;
import ru.ozon.app.android.account.user.UserManager;
import ru.ozon.app.android.error.summary.di.ErrorSummaryComponent;
import ru.ozon.app.android.error.summary.domain.ErrorSummaryInteractor;
import ru.ozon.app.android.error.summary.presentation.ErrorSummaryFragment;
import ru.ozon.app.android.error.summary.presentation.ErrorSummaryFragment_MembersInjector;
import ru.ozon.app.android.error.summary.presentation.ErrorSummaryStateToViewStateMapper;
import ru.ozon.app.android.error.summary.presentation.ErrorSummaryViewModel;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.network.logrequests.LogRequestsService;
import ru.ozon.app.android.network.serialize.JsonSerializer;
import ru.ozon.app.android.storage.appversion.AppVersionStorage;
import ru.ozon.app.android.storage.debug.DebugToolsService;
import ru.ozon.app.android.storage.di.StorageComponentApi;
import ru.ozon.app.android.uikit.screenstate.ScreenState;

/* loaded from: classes12.dex */
public final class DaggerErrorSummaryComponent {

    private static final class ErrorSummaryComponentImpl implements ErrorSummaryComponent {
        private final AccountComponentApi accountComponentApi;
        private final ErrorSummaryComponentImpl errorSummaryComponentImpl;
        private a<ErrorSummaryInteractor> errorSummaryInteractorProvider;
        private a<ErrorSummaryStateToViewStateMapper> errorSummaryStateToViewStateMapperProvider;
        private a<ErrorSummaryViewModel> errorSummaryViewModelProvider;
        private final NavigationComponentApi navigationComponentApi;
        private final NetworkComponentApi networkComponentApi;
        private final ScreenState.ServerIssue serverIssue;
        private final StorageComponentApi storageComponentApi;

        private static final class SwitchingProvider<T> implements a<T> {
            private final ErrorSummaryComponentImpl errorSummaryComponentImpl;

            /* renamed from: id, reason: collision with root package name */
            private final int f92524id;

            SwitchingProvider(ErrorSummaryComponentImpl errorSummaryComponentImpl, int i11) {
                this.errorSummaryComponentImpl = errorSummaryComponentImpl;
                this.f92524id = i11;
            }

            @Override // Pc.a
            public T get() {
                int i11 = this.f92524id;
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            return (T) new ErrorSummaryStateToViewStateMapper();
                        }
                        throw new AssertionError(this.f92524id);
                    }
                    AppVersionStorage appVersionStorage = this.errorSummaryComponentImpl.storageComponentApi.getAppVersionStorage();
                    j.c(appVersionStorage);
                    DebugToolsService debugToolService = this.errorSummaryComponentImpl.storageComponentApi.getDebugToolService();
                    j.c(debugToolService);
                    UserManager userManager = this.errorSummaryComponentImpl.accountComponentApi.getUserManager();
                    j.c(userManager);
                    return (T) new ErrorSummaryInteractor(appVersionStorage, debugToolService, userManager, this.errorSummaryComponentImpl.serverIssue);
                }
                ErrorSummaryInteractor errorSummaryInteractor = (ErrorSummaryInteractor) this.errorSummaryComponentImpl.errorSummaryInteractorProvider.get();
                ErrorSummaryStateToViewStateMapper errorSummaryStateToViewStateMapper = (ErrorSummaryStateToViewStateMapper) this.errorSummaryComponentImpl.errorSummaryStateToViewStateMapperProvider.get();
                g ozonRouter = this.errorSummaryComponentImpl.navigationComponentApi.getOzonRouter();
                j.c(ozonRouter);
                JsonSerializer jsonSerializer = this.errorSummaryComponentImpl.networkComponentApi.getJsonSerializer();
                j.c(jsonSerializer);
                FeatureService featureService = this.errorSummaryComponentImpl.networkComponentApi.getFeatureService();
                j.c(featureService);
                LogRequestsService logRequestsService = this.errorSummaryComponentImpl.networkComponentApi.getLogRequestsService();
                j.c(logRequestsService);
                return (T) new ErrorSummaryViewModel(errorSummaryInteractor, errorSummaryStateToViewStateMapper, ozonRouter, jsonSerializer, featureService, logRequestsService);
            }
        }

        /* synthetic */ ErrorSummaryComponentImpl(StorageComponentApi storageComponentApi, AccountComponentApi accountComponentApi, NavigationComponentApi navigationComponentApi, NetworkComponentApi networkComponentApi, ScreenState.ServerIssue serverIssue, int i11) {
            this(storageComponentApi, accountComponentApi, navigationComponentApi, networkComponentApi, serverIssue);
        }

        private void initialize(StorageComponentApi storageComponentApi, AccountComponentApi accountComponentApi, NavigationComponentApi navigationComponentApi, NetworkComponentApi networkComponentApi, ScreenState.ServerIssue serverIssue) {
            this.errorSummaryInteractorProvider = d.b(new SwitchingProvider(this.errorSummaryComponentImpl, 1));
            this.errorSummaryStateToViewStateMapperProvider = d.b(new SwitchingProvider(this.errorSummaryComponentImpl, 2));
            this.errorSummaryViewModelProvider = new SwitchingProvider(this.errorSummaryComponentImpl, 0);
        }

        private ErrorSummaryFragment injectErrorSummaryFragment(ErrorSummaryFragment errorSummaryFragment) {
            ErrorSummaryFragment_MembersInjector.injectViewModelProvider(errorSummaryFragment, this.errorSummaryViewModelProvider);
            return errorSummaryFragment;
        }

        @Override // ru.ozon.app.android.error.summary.di.ErrorSummaryComponent
        public void inject(ErrorSummaryFragment errorSummaryFragment) {
            injectErrorSummaryFragment(errorSummaryFragment);
        }

        private ErrorSummaryComponentImpl(StorageComponentApi storageComponentApi, AccountComponentApi accountComponentApi, NavigationComponentApi navigationComponentApi, NetworkComponentApi networkComponentApi, ScreenState.ServerIssue serverIssue) {
            this.errorSummaryComponentImpl = this;
            this.storageComponentApi = storageComponentApi;
            this.accountComponentApi = accountComponentApi;
            this.serverIssue = serverIssue;
            this.navigationComponentApi = navigationComponentApi;
            this.networkComponentApi = networkComponentApi;
            initialize(storageComponentApi, accountComponentApi, navigationComponentApi, networkComponentApi, serverIssue);
        }
    }

    private static final class Factory implements ErrorSummaryComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.error.summary.di.ErrorSummaryComponent.Factory
        public ErrorSummaryComponent create(ScreenState.ServerIssue serverIssue, StorageComponentApi storageComponentApi, AccountComponentApi accountComponentApi, NavigationComponentApi navigationComponentApi, NetworkComponentApi networkComponentApi) {
            storageComponentApi.getClass();
            accountComponentApi.getClass();
            navigationComponentApi.getClass();
            networkComponentApi.getClass();
            return new ErrorSummaryComponentImpl(storageComponentApi, accountComponentApi, navigationComponentApi, networkComponentApi, serverIssue, 0);
        }

        private Factory() {
        }
    }

    public static ErrorSummaryComponent.Factory factory() {
        return new Factory(0);
    }
}
