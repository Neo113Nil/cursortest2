package ru.ozon.app.android.storefront.widgets.profile.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.storefront.widgets.profile.core.ProfileCellConfig;
import ru.ozon.app.android.storefront.widgets.profile.core.ProfileCellViewMapper;

/* loaded from: classes7.dex */
public final class ProfileCellWidgetModule_ProvideProfileCellWidgetFactory implements e<Widget2> {
    public static Widget2 provideProfileCellWidget(ProfileCellConfig profileCellConfig, ProfileCellViewMapper profileCellViewMapper) {
        Widget2 provideProfileCellWidget = ProfileCellWidgetModule.INSTANCE.provideProfileCellWidget(profileCellConfig, profileCellViewMapper);
        j.d(provideProfileCellWidget);
        return provideProfileCellWidget;
    }
}
