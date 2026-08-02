package ru.ozon.app.android.session.auth.di;

import Jb.e;
import Jb.j;
import java.util.Set;
import ru.ozon.app.android.composer.di.Widget;
import ru.ozon.app.android.session.auth.core.AuthConfig;
import ru.ozon.app.android.session.auth.presentation.viewMapper.AuthViewMapper;

/* loaded from: classes7.dex */
public final class AuthWidgetModule_Companion_ProvideWidgetFactory implements e<Set<Widget>> {
    public static Set<Widget> provideWidget(AuthConfig authConfig, AuthViewMapper authViewMapper) {
        Set<Widget> provideWidget = AuthWidgetModule.INSTANCE.provideWidget(authConfig, authViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
