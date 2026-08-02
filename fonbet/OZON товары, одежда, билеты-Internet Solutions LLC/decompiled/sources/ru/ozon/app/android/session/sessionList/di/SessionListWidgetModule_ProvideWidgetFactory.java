package ru.ozon.app.android.session.sessionList.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.session.sessionList.data.SessionListConfig;
import ru.ozon.app.android.session.sessionList.mapper.CurrentSessionTitleViewMapper;
import ru.ozon.app.android.session.sessionList.mapper.CurrentSessionViewMapper;
import ru.ozon.app.android.session.sessionList.mapper.SessionListAnnotationViewMapper;
import ru.ozon.app.android.session.sessionList.mapper.SessionListHeaderViewMapper;
import ru.ozon.app.android.session.sessionList.mapper.SessionListLogoutButtonViewMapper;
import ru.ozon.app.android.session.sessionList.mapper.SessionListTitleViewMapper;
import ru.ozon.app.android.session.sessionList.mapper.SessionListViewMapper;

/* loaded from: classes7.dex */
public final class SessionListWidgetModule_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(SessionListConfig sessionListConfig, CurrentSessionTitleViewMapper currentSessionTitleViewMapper, SessionListLogoutButtonViewMapper sessionListLogoutButtonViewMapper, SessionListAnnotationViewMapper sessionListAnnotationViewMapper, CurrentSessionViewMapper currentSessionViewMapper, SessionListTitleViewMapper sessionListTitleViewMapper, SessionListHeaderViewMapper sessionListHeaderViewMapper, SessionListViewMapper sessionListViewMapper) {
        Widget2 provideWidget = SessionListWidgetModule.INSTANCE.provideWidget(sessionListConfig, currentSessionTitleViewMapper, sessionListLogoutButtonViewMapper, sessionListAnnotationViewMapper, currentSessionViewMapper, sessionListTitleViewMapper, sessionListHeaderViewMapper, sessionListViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
