package ru.ozon.app.android.commonwidgets.widgets.curtainContent.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.commonwidgets.widgets.curtainContent.data.CurtainContentConfig;
import ru.ozon.app.android.commonwidgets.widgets.curtainContent.presentation.CurtainContentViewMapper;
import ru.ozon.app.android.composer.widgets.v2.Widget2;

/* loaded from: classes6.dex */
public final class CurtainContentWidgetModule_ProvideAnnotationWidgetFactory implements e<Widget2> {
    public static Widget2 provideAnnotationWidget(CurtainContentConfig curtainContentConfig, CurtainContentViewMapper curtainContentViewMapper) {
        Widget2 provideAnnotationWidget = CurtainContentWidgetModule.provideAnnotationWidget(curtainContentConfig, curtainContentViewMapper);
        j.d(provideAnnotationWidget);
        return provideAnnotationWidget;
    }
}
