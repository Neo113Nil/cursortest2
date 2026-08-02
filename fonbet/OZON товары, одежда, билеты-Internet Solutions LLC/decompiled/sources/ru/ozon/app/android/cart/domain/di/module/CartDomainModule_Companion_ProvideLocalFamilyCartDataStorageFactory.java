package ru.ozon.app.android.cart.domain.di.module;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.cart.domain.VersionCartState;
import ru.ozon.app.android.cart.domain.local.LocalCartDataStorage;

/* loaded from: classes6.dex */
public final class CartDomainModule_Companion_ProvideLocalFamilyCartDataStorageFactory implements e<LocalCartDataStorage> {
    public static LocalCartDataStorage provideLocalFamilyCartDataStorage(VersionCartState versionCartState) {
        LocalCartDataStorage provideLocalFamilyCartDataStorage = CartDomainModule.INSTANCE.provideLocalFamilyCartDataStorage(versionCartState);
        j.d(provideLocalFamilyCartDataStorage);
        return provideLocalFamilyCartDataStorage;
    }
}
