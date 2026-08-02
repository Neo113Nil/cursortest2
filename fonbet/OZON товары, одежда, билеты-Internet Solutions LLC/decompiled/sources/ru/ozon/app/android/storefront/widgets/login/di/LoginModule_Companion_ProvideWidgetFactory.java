package ru.ozon.app.android.storefront.widgets.login.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.di.Widget;
import ru.ozon.app.android.storefront.widgets.login.core.LoginConfig;
import ru.ozon.app.android.storefront.widgets.login.presentation.LoginViewMapper;

/* loaded from: classes7.dex */
public final class LoginModule_Companion_ProvideWidgetFactory implements e<Widget> {
    public static Widget provideWidget(LoginConfig loginConfig, LoginViewMapper loginViewMapper) {
        Widget provideWidget = LoginModule.INSTANCE.provideWidget(loginConfig, loginViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
