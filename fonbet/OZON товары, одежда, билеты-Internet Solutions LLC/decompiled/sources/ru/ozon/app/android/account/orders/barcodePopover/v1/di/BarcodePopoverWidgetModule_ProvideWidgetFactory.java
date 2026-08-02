package ru.ozon.app.android.account.orders.barcodePopover.v1.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.account.orders.barcodePopover.v1.core.BarcodePopoverConfig;
import ru.ozon.app.android.account.orders.barcodePopover.v1.presentation.BarcodePopoverViewMapper;
import ru.ozon.app.android.composer.widgets.v2.Widget2;

/* loaded from: classes6.dex */
public final class BarcodePopoverWidgetModule_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(BarcodePopoverWidgetModule barcodePopoverWidgetModule, BarcodePopoverConfig barcodePopoverConfig, BarcodePopoverViewMapper barcodePopoverViewMapper) {
        Widget2 provideWidget = barcodePopoverWidgetModule.provideWidget(barcodePopoverConfig, barcodePopoverViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
