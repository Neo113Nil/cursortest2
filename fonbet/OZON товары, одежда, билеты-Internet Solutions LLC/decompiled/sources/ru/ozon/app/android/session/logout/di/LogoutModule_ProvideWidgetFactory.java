package ru.ozon.app.android.session.logout.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.di.Widget;
import ru.ozon.app.android.session.logout.core.LogoutConfig;
import ru.ozon.app.android.session.logout.presentation.LogoutViewMapper;

/* loaded from: classes7.dex */
public final class LogoutModule_ProvideWidgetFactory implements e<Widget> {
    public static Widget provideWidget(LogoutConfig logoutConfig, LogoutViewMapper logoutViewMapper) {
        Widget provideWidget = LogoutModule.INSTANCE.provideWidget(logoutConfig, logoutViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
