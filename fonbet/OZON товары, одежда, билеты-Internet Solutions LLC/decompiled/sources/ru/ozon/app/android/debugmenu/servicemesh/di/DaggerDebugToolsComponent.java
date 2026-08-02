package ru.ozon.app.android.debugmenu.servicemesh.di;

import GZ.g;
import Jb.j;
import ru.ozon.app.android.debugmenu.data.AbVariantService;
import ru.ozon.app.android.debugmenu.servicemesh.DebugToolsActivity;
import ru.ozon.app.android.debugmenu.servicemesh.DebugToolsActivity_MembersInjector;
import ru.ozon.app.android.debugmenu.servicemesh.di.DebugToolsComponent;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.storage.appversion.AppVersionStorage;
import ru.ozon.app.android.storage.debug.DebugToolsService;
import ru.ozon.app.android.storage.di.StorageComponentApi;

/* loaded from: classes11.dex */
public final class DaggerDebugToolsComponent {

    private static final class DebugToolsComponentImpl implements DebugToolsComponent {
        private final DebugToolsComponentImpl debugToolsComponentImpl;
        private final NavigationComponentApi navigationComponentApi;
        private final StorageComponentApi storageComponentApi;

        /* synthetic */ DebugToolsComponentImpl(StorageComponentApi storageComponentApi, NavigationComponentApi navigationComponentApi, int i11) {
            this(storageComponentApi, navigationComponentApi);
        }

        private AbVariantService abVariantService() {
            DebugToolsService debugToolService = this.storageComponentApi.getDebugToolService();
            j.c(debugToolService);
            return new AbVariantService(debugToolService);
        }

        private DebugToolsActivity injectDebugToolsActivity(DebugToolsActivity debugToolsActivity) {
            DebugToolsService debugToolService = this.storageComponentApi.getDebugToolService();
            j.c(debugToolService);
            DebugToolsActivity_MembersInjector.injectService(debugToolsActivity, debugToolService);
            DebugToolsActivity_MembersInjector.injectAbVariantService(debugToolsActivity, abVariantService());
            AppVersionStorage appVersionStorage = this.storageComponentApi.getAppVersionStorage();
            j.c(appVersionStorage);
            DebugToolsActivity_MembersInjector.injectVersionStorage(debugToolsActivity, appVersionStorage);
            g ozonRouter = this.navigationComponentApi.getOzonRouter();
            j.c(ozonRouter);
            DebugToolsActivity_MembersInjector.injectRouter(debugToolsActivity, ozonRouter);
            return debugToolsActivity;
        }

        @Override // ru.ozon.app.android.debugmenu.servicemesh.di.DebugToolsComponent
        public void inject(DebugToolsActivity debugToolsActivity) {
            injectDebugToolsActivity(debugToolsActivity);
        }

        private DebugToolsComponentImpl(StorageComponentApi storageComponentApi, NavigationComponentApi navigationComponentApi) {
            this.debugToolsComponentImpl = this;
            this.storageComponentApi = storageComponentApi;
            this.navigationComponentApi = navigationComponentApi;
        }
    }

    private static final class Factory implements DebugToolsComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.debugmenu.servicemesh.di.DebugToolsComponent.Factory
        public DebugToolsComponent create(StorageComponentApi storageComponentApi, NavigationComponentApi navigationComponentApi) {
            storageComponentApi.getClass();
            navigationComponentApi.getClass();
            return new DebugToolsComponentImpl(storageComponentApi, navigationComponentApi, 0);
        }

        private Factory() {
        }
    }

    public static DebugToolsComponent.Factory factory() {
        return new Factory(0);
    }
}
