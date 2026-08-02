package ru.ozon.app.android.orderdetails.replytocourierinfo.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.orderdetails.replytocourierinfo.data.ReplyToCourierInfoWidgetConfig;
import ru.ozon.app.android.orderdetails.replytocourierinfo.presentation.ReplyToCourierInfoWidgetViewMapper;

/* loaded from: classes6.dex */
public final class ReplyToCourierInfoWidgetModule_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(ReplyToCourierInfoWidgetModule replyToCourierInfoWidgetModule, ReplyToCourierInfoWidgetConfig replyToCourierInfoWidgetConfig, ReplyToCourierInfoWidgetViewMapper replyToCourierInfoWidgetViewMapper) {
        Widget2 provideWidget = replyToCourierInfoWidgetModule.provideWidget(replyToCourierInfoWidgetConfig, replyToCourierInfoWidgetViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
