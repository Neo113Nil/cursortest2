package ru.ozon.app.android.session.session.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.session.session.data.SessionConfig;
import ru.ozon.app.android.session.session.mapper.SessionViewMapper;

/* loaded from: classes7.dex */
public final class SessionWidgetModule_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(SessionConfig sessionConfig, SessionViewMapper sessionViewMapper) {
        Widget2 provideWidget = SessionWidgetModule.INSTANCE.provideWidget(sessionConfig, sessionViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
