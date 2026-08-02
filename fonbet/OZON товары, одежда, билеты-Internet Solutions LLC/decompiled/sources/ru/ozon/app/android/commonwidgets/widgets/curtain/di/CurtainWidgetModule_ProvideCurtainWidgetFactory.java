package ru.ozon.app.android.commonwidgets.widgets.curtain.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.commonwidgets.widgets.curtain.data.CurtainConfig;
import ru.ozon.app.android.commonwidgets.widgets.curtain.presentation.custom.CurtainCustomViewMapper;
import ru.ozon.app.android.commonwidgets.widgets.curtain.presentation.ui.CurtainViewMapper;
import ru.ozon.app.android.composer.di.Widget;

/* loaded from: classes6.dex */
public final class CurtainWidgetModule_ProvideCurtainWidgetFactory implements e<Widget> {
    public static Widget provideCurtainWidget(CurtainConfig curtainConfig, CurtainViewMapper curtainViewMapper, CurtainCustomViewMapper curtainCustomViewMapper) {
        Widget provideCurtainWidget = CurtainWidgetModule.provideCurtainWidget(curtainConfig, curtainViewMapper, curtainCustomViewMapper);
        j.d(provideCurtainWidget);
        return provideCurtainWidget;
    }
}
