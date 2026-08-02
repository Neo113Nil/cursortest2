package ru.ozon.app.android.delivery.customActionsHandlers.di;

import Jb.j;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.delivery.customActionsHandlers.di.DeliveryCustomActionHandlersComponent;
import ru.ozon.app.android.delivery.customActionsHandlers.fetchcancelreasons.data.CancelReasonsRepository;
import ru.ozon.app.android.delivery.customActionsHandlers.fetchcancelreasons.data.CancelReasonsRepositoryImpl;

/* loaded from: classes11.dex */
public final class DaggerDeliveryCustomActionHandlersComponent {

    private static final class DeliveryCustomActionHandlersComponentImpl implements DeliveryCustomActionHandlersComponent {
        private final ActionComponentApi actionComponentApi;
        private final DeliveryCustomActionHandlersComponentImpl deliveryCustomActionHandlersComponentImpl;

        /* synthetic */ DeliveryCustomActionHandlersComponentImpl(ActionComponentApi actionComponentApi, int i11) {
            this(actionComponentApi);
        }

        private CancelReasonsRepositoryImpl cancelReasonsRepositoryImpl() {
            ActionV2Repository actionRepository = this.actionComponentApi.getActionRepository();
            j.c(actionRepository);
            return new CancelReasonsRepositoryImpl(actionRepository);
        }

        @Override // ru.ozon.app.android.delivery.customActionsHandlers.di.DeliveryCustomActionHandlersApi
        public CancelReasonsRepository getCancelReasonsRepository() {
            return cancelReasonsRepositoryImpl();
        }

        private DeliveryCustomActionHandlersComponentImpl(ActionComponentApi actionComponentApi) {
            this.deliveryCustomActionHandlersComponentImpl = this;
            this.actionComponentApi = actionComponentApi;
        }
    }

    private static final class Factory implements DeliveryCustomActionHandlersComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.delivery.customActionsHandlers.di.DeliveryCustomActionHandlersComponent.Factory
        public DeliveryCustomActionHandlersComponent create(ActionComponentApi actionComponentApi) {
            actionComponentApi.getClass();
            return new DeliveryCustomActionHandlersComponentImpl(actionComponentApi, 0);
        }

        private Factory() {
        }
    }

    public static DeliveryCustomActionHandlersComponent.Factory factory() {
        return new Factory(0);
    }
}
