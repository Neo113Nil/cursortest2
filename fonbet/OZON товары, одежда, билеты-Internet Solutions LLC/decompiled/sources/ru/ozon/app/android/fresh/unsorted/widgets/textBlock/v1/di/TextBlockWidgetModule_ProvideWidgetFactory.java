package ru.ozon.app.android.fresh.unsorted.widgets.textBlock.v1.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.fresh.unsorted.widgets.textBlock.v1.data.TextBlockConfig;
import ru.ozon.app.android.fresh.unsorted.widgets.textBlock.v1.presentation.TextBlockViewMapper;

/* loaded from: classes6.dex */
public final class TextBlockWidgetModule_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(TextBlockConfig textBlockConfig, TextBlockViewMapper textBlockViewMapper) {
        Widget2 provideWidget = TextBlockWidgetModule.INSTANCE.provideWidget(textBlockConfig, textBlockViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
