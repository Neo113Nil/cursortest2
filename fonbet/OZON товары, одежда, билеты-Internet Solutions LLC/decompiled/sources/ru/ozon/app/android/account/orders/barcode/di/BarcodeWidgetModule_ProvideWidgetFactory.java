package ru.ozon.app.android.account.orders.barcode.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.account.orders.barcode.BarcodeConfig;
import ru.ozon.app.android.account.orders.barcode.presentation.BarcodeViewMapper;
import ru.ozon.app.android.composer.widgets.v2.Widget2;

/* loaded from: classes6.dex */
public final class BarcodeWidgetModule_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(BarcodeWidgetModule barcodeWidgetModule, BarcodeConfig barcodeConfig, BarcodeViewMapper barcodeViewMapper) {
        Widget2 provideWidget = barcodeWidgetModule.provideWidget(barcodeConfig, barcodeViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
