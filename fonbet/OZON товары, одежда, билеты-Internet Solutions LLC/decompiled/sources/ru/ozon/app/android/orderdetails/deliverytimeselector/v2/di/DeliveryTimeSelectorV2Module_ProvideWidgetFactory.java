package ru.ozon.app.android.orderdetails.deliverytimeselector.v2.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.common.cellList.v2.core.CellListV2ViewMapper;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.orderdetails.deliverytimeselector.v2.core.DeliveryTimeSelectorV2Config;
import ru.ozon.app.android.orderdetails.deliverytimeselector.v2.presentation.button.viewMapper.ConfirmDateButtonViewMapper;
import ru.ozon.app.android.orderdetails.deliverytimeselector.v2.presentation.datePicker.viewMapper.DeliveryTimeSelectorV2ViewMapper;

/* loaded from: classes6.dex */
public final class DeliveryTimeSelectorV2Module_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(DeliveryTimeSelectorV2Config deliveryTimeSelectorV2Config, DeliveryTimeSelectorV2ViewMapper deliveryTimeSelectorV2ViewMapper, CellListV2ViewMapper cellListV2ViewMapper, ConfirmDateButtonViewMapper confirmDateButtonViewMapper) {
        Widget2 provideWidget = DeliveryTimeSelectorV2Module.INSTANCE.provideWidget(deliveryTimeSelectorV2Config, deliveryTimeSelectorV2ViewMapper, cellListV2ViewMapper, confirmDateButtonViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
