package ru.ozon.app.android.widgets.commonTextWidget.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.common.header.core.HeaderViewMapper2;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.widgets.commonTextWidget.cellList.core.CellListV2ViewMapper;
import ru.ozon.app.android.widgets.commonTextWidget.data.CommonTextWidgetConfig;
import ru.ozon.app.android.widgets.commonTextWidget.separator.core.SeparatorViewMapper;
import ru.ozon.app.android.widgets.plainText.core.PlainTextViewMapper2;

/* loaded from: classes7.dex */
public final class CommonTextWidgetModule_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(CommonTextWidgetModule commonTextWidgetModule, CommonTextWidgetConfig commonTextWidgetConfig, HeaderViewMapper2 headerViewMapper2, PlainTextViewMapper2 plainTextViewMapper2, CellListV2ViewMapper cellListV2ViewMapper, SeparatorViewMapper separatorViewMapper) {
        Widget2 provideWidget = commonTextWidgetModule.provideWidget(commonTextWidgetConfig, headerViewMapper2, plainTextViewMapper2, cellListV2ViewMapper, separatorViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
