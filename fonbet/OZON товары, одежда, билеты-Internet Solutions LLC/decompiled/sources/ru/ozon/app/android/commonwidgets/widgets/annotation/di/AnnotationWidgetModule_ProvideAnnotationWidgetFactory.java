package ru.ozon.app.android.commonwidgets.widgets.annotation.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.commonwidgets.widgets.annotation.data.AnnotationConfig;
import ru.ozon.app.android.commonwidgets.widgets.annotation.presentation.AnnotationNoUiViewMapper;
import ru.ozon.app.android.commonwidgets.widgets.annotation.presentation.AnnotationViewMapper;
import ru.ozon.app.android.composer.di.Widget;

/* loaded from: classes6.dex */
public final class AnnotationWidgetModule_ProvideAnnotationWidgetFactory implements e<Widget> {
    public static Widget provideAnnotationWidget(AnnotationConfig annotationConfig, AnnotationViewMapper annotationViewMapper, AnnotationNoUiViewMapper annotationNoUiViewMapper) {
        Widget provideAnnotationWidget = AnnotationWidgetModule.provideAnnotationWidget(annotationConfig, annotationViewMapper, annotationNoUiViewMapper);
        j.d(provideAnnotationWidget);
        return provideAnnotationWidget;
    }
}
