package ru.ozon.app.android.orderdetails.cheques.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.orderdetails.cheques.data.ChequesConfig;
import ru.ozon.app.android.orderdetails.cheques.presentation.cheque.ChequeViewMapper;
import ru.ozon.app.android.orderdetails.cheques.presentation.title.ChequesTitleViewMapper;

/* loaded from: classes6.dex */
public final class ChequesWidgetModule_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(ChequesWidgetModule chequesWidgetModule, ChequesConfig chequesConfig, ChequesTitleViewMapper chequesTitleViewMapper, ChequeViewMapper chequeViewMapper) {
        Widget2 provideWidget = chequesWidgetModule.provideWidget(chequesConfig, chequesTitleViewMapper, chequeViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
