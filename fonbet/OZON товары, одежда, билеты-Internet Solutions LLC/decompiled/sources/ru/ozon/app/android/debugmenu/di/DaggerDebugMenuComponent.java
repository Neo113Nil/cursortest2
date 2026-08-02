package ru.ozon.app.android.debugmenu.di;

import Jb.j;
import retrofit2.Retrofit;
import ru.ozon.app.android.debugmenu.di.DebugMenuComponent;
import ru.ozon.app.android.debugmenu.userqa.api.UserQASegmentApi;
import ru.ozon.app.android.debugmenu.userqa.di.UserQASegmentModule;
import ru.ozon.app.android.debugmenu.userqa.di.UserQASegmentModule_ProvideApiFactory;
import ru.ozon.app.android.debugmenu.userqa.domain.UserQASegmentInteractor;
import ru.ozon.app.android.network.di.NetworkComponentApi;

/* loaded from: classes6.dex */
public final class DaggerDebugMenuComponent {

    private static final class DebugMenuComponentImpl implements DebugMenuComponent {
        private final DebugMenuComponentImpl debugMenuComponentImpl;
        private final NetworkComponentApi networkComponentApi;
        private final UserQASegmentModule userQASegmentModule;

        /* synthetic */ DebugMenuComponentImpl(UserQASegmentModule userQASegmentModule, NetworkComponentApi networkComponentApi, int i11) {
            this(userQASegmentModule, networkComponentApi);
        }

        private UserQASegmentApi userQASegmentApi() {
            UserQASegmentModule userQASegmentModule = this.userQASegmentModule;
            Retrofit retrofit = this.networkComponentApi.getRetrofit();
            j.c(retrofit);
            return UserQASegmentModule_ProvideApiFactory.provideApi(userQASegmentModule, retrofit);
        }

        @Override // ru.ozon.app.android.debugmenu.di.DebugMenuComponentApi
        public UserQASegmentInteractor getUserQASegmentInteractor() {
            return new UserQASegmentInteractor(userQASegmentApi());
        }

        private DebugMenuComponentImpl(UserQASegmentModule userQASegmentModule, NetworkComponentApi networkComponentApi) {
            this.debugMenuComponentImpl = this;
            this.userQASegmentModule = userQASegmentModule;
            this.networkComponentApi = networkComponentApi;
        }
    }

    private static final class Factory implements DebugMenuComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.debugmenu.di.DebugMenuComponent.Factory
        public DebugMenuComponent create(NetworkComponentApi networkComponentApi) {
            networkComponentApi.getClass();
            return new DebugMenuComponentImpl(new UserQASegmentModule(), networkComponentApi, 0);
        }

        private Factory() {
        }
    }

    public static DebugMenuComponent.Factory factory() {
        return new Factory(0);
    }
}
