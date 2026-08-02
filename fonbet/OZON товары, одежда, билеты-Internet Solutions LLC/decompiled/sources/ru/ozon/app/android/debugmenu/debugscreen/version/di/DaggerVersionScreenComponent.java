package ru.ozon.app.android.debugmenu.debugscreen.version.di;

import Jb.j;
import ru.ozon.app.android.debugmenu.debugscreen.version.VersionActivity;
import ru.ozon.app.android.debugmenu.debugscreen.version.VersionActivity_MembersInjector;
import ru.ozon.app.android.debugmenu.debugscreen.version.di.VersionScreenComponent;
import ru.ozon.app.android.storage.appversion.AppVersionStorage;
import ru.ozon.app.android.storage.di.StorageComponentApi;

/* loaded from: classes11.dex */
public final class DaggerVersionScreenComponent {

    private static final class Factory implements VersionScreenComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.debugmenu.debugscreen.version.di.VersionScreenComponent.Factory
        public VersionScreenComponent create(StorageComponentApi storageComponentApi) {
            storageComponentApi.getClass();
            return new VersionScreenComponentImpl(storageComponentApi, 0);
        }

        private Factory() {
        }
    }

    private static final class VersionScreenComponentImpl implements VersionScreenComponent {
        private final StorageComponentApi storageComponentApi;
        private final VersionScreenComponentImpl versionScreenComponentImpl;

        /* synthetic */ VersionScreenComponentImpl(StorageComponentApi storageComponentApi, int i11) {
            this(storageComponentApi);
        }

        private VersionActivity injectVersionActivity(VersionActivity versionActivity) {
            AppVersionStorage appVersionStorage = this.storageComponentApi.getAppVersionStorage();
            j.c(appVersionStorage);
            VersionActivity_MembersInjector.injectAppVersionStorage(versionActivity, appVersionStorage);
            return versionActivity;
        }

        @Override // ru.ozon.app.android.debugmenu.debugscreen.version.di.VersionScreenComponent
        public void inject(VersionActivity versionActivity) {
            injectVersionActivity(versionActivity);
        }

        private VersionScreenComponentImpl(StorageComponentApi storageComponentApi) {
            this.versionScreenComponentImpl = this;
            this.storageComponentApi = storageComponentApi;
        }
    }

    public static VersionScreenComponent.Factory factory() {
        return new Factory(0);
    }
}
