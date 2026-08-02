package ru.ozon.app.android.session.userAdultModalMobile.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.di.Widget;
import ru.ozon.app.android.session.userAdultModalMobile.data.UserAdultModalConfig;
import ru.ozon.app.android.session.userAdultModalMobile.presentation.UserAdultModalNoUiViewMapper;

/* loaded from: classes7.dex */
public final class UserAdultConfirmationModule_Companion_ProvideWidgetFactory implements e<Widget> {
    public static Widget provideWidget(UserAdultModalNoUiViewMapper userAdultModalNoUiViewMapper, UserAdultModalConfig userAdultModalConfig) {
        Widget provideWidget = UserAdultConfirmationModule.INSTANCE.provideWidget(userAdultModalNoUiViewMapper, userAdultModalConfig);
        j.d(provideWidget);
        return provideWidget;
    }
}
