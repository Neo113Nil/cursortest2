package ru.ozon.app.android.session.userSocialsMobile.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.di.Widget;
import ru.ozon.app.android.session.userSocialsMobile.core.UserSocialsMobileConfig;
import ru.ozon.app.android.session.userSocialsMobile.presentation.header.UserSocialsMobileHeaderViewMapper;
import ru.ozon.app.android.session.userSocialsMobile.presentation.item.UserSocialsMobileItemViewMapper;

/* loaded from: classes7.dex */
public final class UserSocialsMobileModule_Companion_ProvideWidgetFactory implements e<Widget> {
    public static Widget provideWidget(UserSocialsMobileConfig userSocialsMobileConfig, UserSocialsMobileHeaderViewMapper userSocialsMobileHeaderViewMapper, UserSocialsMobileItemViewMapper userSocialsMobileItemViewMapper) {
        Widget provideWidget = UserSocialsMobileModule.INSTANCE.provideWidget(userSocialsMobileConfig, userSocialsMobileHeaderViewMapper, userSocialsMobileItemViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
