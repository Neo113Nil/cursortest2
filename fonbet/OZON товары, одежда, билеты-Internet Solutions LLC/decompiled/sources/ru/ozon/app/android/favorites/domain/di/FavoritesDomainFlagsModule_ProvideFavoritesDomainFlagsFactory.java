package ru.ozon.app.android.favorites.domain.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.network.abtool.flag.FeatureFlagRegistrationModel;

/* loaded from: classes6.dex */
public final class FavoritesDomainFlagsModule_ProvideFavoritesDomainFlagsFactory implements e<FeatureFlagRegistrationModel> {
    public static FeatureFlagRegistrationModel provideFavoritesDomainFlags(FavoritesDomainFlagsModule favoritesDomainFlagsModule) {
        FeatureFlagRegistrationModel provideFavoritesDomainFlags = favoritesDomainFlagsModule.provideFavoritesDomainFlags();
        j.d(provideFavoritesDomainFlags);
        return provideFavoritesDomainFlags;
    }
}
