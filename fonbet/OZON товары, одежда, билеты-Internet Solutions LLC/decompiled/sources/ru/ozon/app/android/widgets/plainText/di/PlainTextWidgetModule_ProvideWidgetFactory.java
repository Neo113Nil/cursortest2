package ru.ozon.app.android.widgets.plainText.di;

import Jb.e;
import Jb.j;
import ru.ozon.android.composerCommonViewKit.plainText.core.PlainTextConfig;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.widgets.plainText.core.PlainTextViewMapper2;

/* loaded from: classes7.dex */
public final class PlainTextWidgetModule_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(PlainTextConfig plainTextConfig, PlainTextViewMapper2 plainTextViewMapper2) {
        Widget2 provideWidget = PlainTextWidgetModule.INSTANCE.provideWidget(plainTextConfig, plainTextViewMapper2);
        j.d(provideWidget);
        return provideWidget;
    }
}
