package ru.ozon.app.android.orderdetails.orderdeliverydetail.presentation.actions;

import Jb.j;
import Vg.d;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.orderdetails.orderdeliverydetail.presentation.actions.OrderDeliveryDetailActionsWidgetComponent;

/* loaded from: classes13.dex */
public final class DaggerOrderDeliveryDetailActionsWidgetComponent {

    private static final class Factory implements OrderDeliveryDetailActionsWidgetComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.orderdetails.orderdeliverydetail.presentation.actions.OrderDeliveryDetailActionsWidgetComponent.Factory
        public OrderDeliveryDetailActionsWidgetComponent create(CustomActionHandlersComponentApi customActionHandlersComponentApi) {
            customActionHandlersComponentApi.getClass();
            return new OrderDeliveryDetailActionsWidgetComponentImpl(customActionHandlersComponentApi, 0);
        }

        private Factory() {
        }
    }

    private static final class OrderDeliveryDetailActionsWidgetComponentImpl implements OrderDeliveryDetailActionsWidgetComponent {
        private final CustomActionHandlersComponentApi customActionHandlersComponentApi;
        private final OrderDeliveryDetailActionsWidgetComponentImpl orderDeliveryDetailActionsWidgetComponentImpl;

        /* synthetic */ OrderDeliveryDetailActionsWidgetComponentImpl(CustomActionHandlersComponentApi customActionHandlersComponentApi, int i11) {
            this(customActionHandlersComponentApi);
        }

        @Override // ru.ozon.app.android.orderdetails.orderdeliverydetail.presentation.actions.OrderDeliveryDetailActionsWidgetComponent
        public d getCustomActionHandlersStoreFactory() {
            d customActionHandlersStoreFactory = this.customActionHandlersComponentApi.getCustomActionHandlersStoreFactory();
            j.c(customActionHandlersStoreFactory);
            return customActionHandlersStoreFactory;
        }

        private OrderDeliveryDetailActionsWidgetComponentImpl(CustomActionHandlersComponentApi customActionHandlersComponentApi) {
            this.orderDeliveryDetailActionsWidgetComponentImpl = this;
            this.customActionHandlersComponentApi = customActionHandlersComponentApi;
        }
    }

    public static OrderDeliveryDetailActionsWidgetComponent.Factory factory() {
        return new Factory(0);
    }
}
