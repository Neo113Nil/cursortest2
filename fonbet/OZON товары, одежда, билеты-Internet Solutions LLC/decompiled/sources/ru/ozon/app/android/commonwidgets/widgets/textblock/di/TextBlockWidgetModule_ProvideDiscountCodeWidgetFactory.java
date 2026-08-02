package ru.ozon.app.android.commonwidgets.widgets.textblock.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.commonwidgets.widgets.textblock.TextBlockConfig;
import ru.ozon.app.android.commonwidgets.widgets.textblock.presentation.main.TextBlockViewMapper;
import ru.ozon.app.android.commonwidgets.widgets.textblock.presentation.sticky.TextBlockNoUiViewMapper;
import ru.ozon.app.android.composer.di.Widget;

/* loaded from: classes6.dex */
public final class TextBlockWidgetModule_ProvideDiscountCodeWidgetFactory implements e<Widget> {
    public static Widget provideDiscountCodeWidget(TextBlockConfig textBlockConfig, TextBlockViewMapper textBlockViewMapper, TextBlockNoUiViewMapper textBlockNoUiViewMapper) {
        Widget provideDiscountCodeWidget = TextBlockWidgetModule.provideDiscountCodeWidget(textBlockConfig, textBlockViewMapper, textBlockNoUiViewMapper);
        j.d(provideDiscountCodeWidget);
        return provideDiscountCodeWidget;
    }
}
