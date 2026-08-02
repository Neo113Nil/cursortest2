package ru.ozon.app.android.storage.di.module;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.storage.OzonDatabase;
import ru.ozon.app.android.storage.entity.bundle.BundleStateDao;

/* loaded from: classes7.dex */
public final class StorageModule_ProvideBundleStateDaoFactory implements e<BundleStateDao> {
    public static BundleStateDao provideBundleStateDao(StorageModule storageModule, OzonDatabase ozonDatabase) {
        BundleStateDao provideBundleStateDao = storageModule.provideBundleStateDao(ozonDatabase);
        j.d(provideBundleStateDao);
        return provideBundleStateDao;
    }
}
