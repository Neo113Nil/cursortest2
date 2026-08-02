package ru.ozon.app.android.deliveryreview.deliveryReviewForm.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.data.DeliveryReviewFormConfig;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.footer.DeliveryReviewFormFooterViewMapper;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.header.DeliveryReviewFormHeaderViewMapper;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.item.DeliveryReviewFormItemViewMapper;

/* loaded from: classes6.dex */
public final class DeliveryReviewFormWidget2Module_ProvideDeliveryReviewFormWidgetFactory implements e<Widget2> {
    public static Widget2 provideDeliveryReviewFormWidget(DeliveryReviewFormWidget2Module deliveryReviewFormWidget2Module, DeliveryReviewFormConfig deliveryReviewFormConfig, DeliveryReviewFormHeaderViewMapper deliveryReviewFormHeaderViewMapper, DeliveryReviewFormItemViewMapper deliveryReviewFormItemViewMapper, DeliveryReviewFormFooterViewMapper deliveryReviewFormFooterViewMapper) {
        Widget2 provideDeliveryReviewFormWidget = deliveryReviewFormWidget2Module.provideDeliveryReviewFormWidget(deliveryReviewFormConfig, deliveryReviewFormHeaderViewMapper, deliveryReviewFormItemViewMapper, deliveryReviewFormFooterViewMapper);
        j.d(provideDeliveryReviewFormWidget);
        return provideDeliveryReviewFormWidget;
    }
}
