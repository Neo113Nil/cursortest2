package ru.ozon.app.android.domain.tiles.flags;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.network.abtool.flag.FeatureFlagRegistrationModel;

/* loaded from: classes6.dex */
public final class TilesDomainFlagsModule_ProvideFavoritesDomainFlagsFactory implements e<FeatureFlagRegistrationModel> {
    public static FeatureFlagRegistrationModel provideFavoritesDomainFlags(TilesDomainFlagsModule tilesDomainFlagsModule) {
        FeatureFlagRegistrationModel provideFavoritesDomainFlags = tilesDomainFlagsModule.provideFavoritesDomainFlags();
        j.d(provideFavoritesDomainFlags);
        return provideFavoritesDomainFlags;
    }
}
