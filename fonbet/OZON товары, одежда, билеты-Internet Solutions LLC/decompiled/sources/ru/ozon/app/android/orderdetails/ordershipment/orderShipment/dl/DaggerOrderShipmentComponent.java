package ru.ozon.app.android.orderdetails.ordershipment.orderShipment.dl;

import Jb.d;
import Pc.a;
import ru.ozon.app.android.orderdetails.ordershipment.orderShipment.data.repository.OrderDetailsScrollToShipmentRepository;
import ru.ozon.app.android.orderdetails.ordershipment.orderShipment.data.repository.OrderDetailsScrollToShipmentRepositoryImpl;
import ru.ozon.app.android.orderdetails.ordershipment.orderShipment.dl.OrderShipmentComponent;

/* loaded from: classes6.dex */
public final class DaggerOrderShipmentComponent {

    private static final class Factory implements OrderShipmentComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.orderdetails.ordershipment.orderShipment.dl.OrderShipmentComponent.Factory
        public OrderShipmentComponent create() {
            return new OrderShipmentComponentImpl(0);
        }

        private Factory() {
        }
    }

    private static final class OrderShipmentComponentImpl implements OrderShipmentComponent {
        private a<OrderDetailsScrollToShipmentRepository> bindCheckoutScrollToWidgetKeyRepositoryProvider;
        private a<OrderDetailsScrollToShipmentRepositoryImpl> orderDetailsScrollToShipmentRepositoryImplProvider;
        private final OrderShipmentComponentImpl orderShipmentComponentImpl;

        private static final class SwitchingProvider<T> implements a<T> {

            /* renamed from: id, reason: collision with root package name */
            private final int f92974id;
            private final OrderShipmentComponentImpl orderShipmentComponentImpl;

            SwitchingProvider(OrderShipmentComponentImpl orderShipmentComponentImpl, int i11) {
                this.orderShipmentComponentImpl = orderShipmentComponentImpl;
                this.f92974id = i11;
            }

            @Override // Pc.a
            public T get() {
                if (this.f92974id == 0) {
                    return (T) new OrderDetailsScrollToShipmentRepositoryImpl();
                }
                throw new AssertionError(this.f92974id);
            }
        }

        /* synthetic */ OrderShipmentComponentImpl(int i11) {
            this();
        }

        private void initialize() {
            SwitchingProvider switchingProvider = new SwitchingProvider(this.orderShipmentComponentImpl, 0);
            this.orderDetailsScrollToShipmentRepositoryImplProvider = switchingProvider;
            this.bindCheckoutScrollToWidgetKeyRepositoryProvider = d.b(switchingProvider);
        }

        @Override // ru.ozon.app.android.orderdetails.ordershipment.orderShipment.dl.OrderShipmentComponentApi
        public OrderDetailsScrollToShipmentRepository getOrderDetailsScrollToShipmentKeyRepository() {
            return this.bindCheckoutScrollToWidgetKeyRepositoryProvider.get();
        }

        private OrderShipmentComponentImpl() {
            this.orderShipmentComponentImpl = this;
            initialize();
        }
    }

    public static OrderShipmentComponent.Factory factory() {
        return new Factory(0);
    }
}
