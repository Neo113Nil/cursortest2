package ru.ozon.app.android.cart.domain.di.module;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.cart.domain.VersionCartState;
import ru.ozon.app.android.cart.domain.local.LocalCartDataStorage;

/* loaded from: classes6.dex */
public final class CartDomainModule_Companion_ProvideLocalCartDataStorageFactory implements e<LocalCartDataStorage> {
    public static LocalCartDataStorage provideLocalCartDataStorage(VersionCartState versionCartState) {
        LocalCartDataStorage provideLocalCartDataStorage = CartDomainModule.INSTANCE.provideLocalCartDataStorage(versionCartState);
        j.d(provideLocalCartDataStorage);
        return provideLocalCartDataStorage;
    }
}
