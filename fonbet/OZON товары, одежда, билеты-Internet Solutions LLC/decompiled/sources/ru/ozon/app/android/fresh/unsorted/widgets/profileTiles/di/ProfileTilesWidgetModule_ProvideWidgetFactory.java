package ru.ozon.app.android.fresh.unsorted.widgets.profileTiles.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.fresh.unsorted.widgets.profileTiles.data.ProfileTilesConfig;
import ru.ozon.app.android.fresh.unsorted.widgets.profileTiles.presentation.ProfileTilesViewMapper;

/* loaded from: classes6.dex */
public final class ProfileTilesWidgetModule_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(ProfileTilesConfig profileTilesConfig, ProfileTilesViewMapper profileTilesViewMapper) {
        Widget2 provideWidget = ProfileTilesWidgetModule.INSTANCE.provideWidget(profileTilesConfig, profileTilesViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
