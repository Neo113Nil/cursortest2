package ru.ozon.app.android.storage.di.module;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.storage.OzonDatabase;
import ru.ozon.app.android.storage.entity.network.NetworkHistoryDao;

/* loaded from: classes7.dex */
public final class StorageModule_ProvideNetworkHistoryDaoFactory implements e<NetworkHistoryDao> {
    public static NetworkHistoryDao provideNetworkHistoryDao(StorageModule storageModule, OzonDatabase ozonDatabase) {
        NetworkHistoryDao provideNetworkHistoryDao = storageModule.provideNetworkHistoryDao(ozonDatabase);
        j.d(provideNetworkHistoryDao);
        return provideNetworkHistoryDao;
    }
}
