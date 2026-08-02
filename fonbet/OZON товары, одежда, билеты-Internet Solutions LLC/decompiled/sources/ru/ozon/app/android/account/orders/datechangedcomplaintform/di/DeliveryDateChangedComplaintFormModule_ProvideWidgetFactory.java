package ru.ozon.app.android.account.orders.datechangedcomplaintform.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.account.orders.datechangedcomplaintform.core.DeliveryDateChangedComplaintFormConfig;
import ru.ozon.app.android.account.orders.datechangedcomplaintform.core.input.DeliveryDateChangedComplaintFormInputViewMapper;
import ru.ozon.app.android.account.orders.datechangedcomplaintform.core.reason.DeliveryDateChangedComplaintFormReasonViewMapper;
import ru.ozon.app.android.account.orders.datechangedcomplaintform.core.title.DeliveryDateChangedComplaintFormTitleViewMapper;
import ru.ozon.app.android.composer.widgets.v2.Widget2;

/* loaded from: classes6.dex */
public final class DeliveryDateChangedComplaintFormModule_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(DeliveryDateChangedComplaintFormModule deliveryDateChangedComplaintFormModule, DeliveryDateChangedComplaintFormConfig deliveryDateChangedComplaintFormConfig, DeliveryDateChangedComplaintFormTitleViewMapper deliveryDateChangedComplaintFormTitleViewMapper, DeliveryDateChangedComplaintFormReasonViewMapper deliveryDateChangedComplaintFormReasonViewMapper, DeliveryDateChangedComplaintFormInputViewMapper deliveryDateChangedComplaintFormInputViewMapper) {
        Widget2 provideWidget = deliveryDateChangedComplaintFormModule.provideWidget(deliveryDateChangedComplaintFormConfig, deliveryDateChangedComplaintFormTitleViewMapper, deliveryDateChangedComplaintFormReasonViewMapper, deliveryDateChangedComplaintFormInputViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
