package ru.ozon.app.android.storage.di.module;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.storage.OzonDatabase;
import ru.ozon.app.android.storage.entity.sellerfavorites.SellerFavoriteDao;

/* loaded from: classes7.dex */
public final class StorageModule_ProvideSellerFavoriteDaoFactory implements e<SellerFavoriteDao> {
    public static SellerFavoriteDao provideSellerFavoriteDao(StorageModule storageModule, OzonDatabase ozonDatabase) {
        SellerFavoriteDao provideSellerFavoriteDao = storageModule.provideSellerFavoriteDao(ozonDatabase);
        j.d(provideSellerFavoriteDao);
        return provideSellerFavoriteDao;
    }
}
