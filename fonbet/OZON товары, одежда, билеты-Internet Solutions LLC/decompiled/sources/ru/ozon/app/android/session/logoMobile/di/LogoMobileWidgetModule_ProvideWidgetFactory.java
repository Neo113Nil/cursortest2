package ru.ozon.app.android.session.logoMobile.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.session.logoMobile.data.LogoMobileConfig;
import ru.ozon.app.android.session.logoMobile.mapper.LogoMobileViewMapper;

/* loaded from: classes7.dex */
public final class LogoMobileWidgetModule_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(LogoMobileConfig logoMobileConfig, LogoMobileViewMapper logoMobileViewMapper) {
        Widget2 provideWidget = LogoMobileWidgetModule.INSTANCE.provideWidget(logoMobileConfig, logoMobileViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
