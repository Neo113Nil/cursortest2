package ru.ozon.app.android.fresh.unsorted.widgets.profileAvatar.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.fresh.unsorted.widgets.profileAvatar.data.ProfileAvatarConfig;
import ru.ozon.app.android.fresh.unsorted.widgets.profileAvatar.presentation.ProfileAvatarViewMapper;

/* loaded from: classes6.dex */
public final class ProfileAvatarWidgetModule_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(ProfileAvatarConfig profileAvatarConfig, ProfileAvatarViewMapper profileAvatarViewMapper) {
        Widget2 provideWidget = ProfileAvatarWidgetModule.INSTANCE.provideWidget(profileAvatarConfig, profileAvatarViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
