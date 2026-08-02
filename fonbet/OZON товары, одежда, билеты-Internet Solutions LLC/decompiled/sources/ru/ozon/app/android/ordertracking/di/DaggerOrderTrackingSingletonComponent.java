package ru.ozon.app.android.ordertracking.di;

import ru.ozon.app.android.csma.orderTracking.utils.ProcessLifecyclePublisher;
import ru.ozon.app.android.ordertracking.di.OrderTrackingSingletonComponent;
import ru.ozon.app.android.ordertracking.utils.ProcessLifecyclePublisherImpl;

/* loaded from: classes13.dex */
public final class DaggerOrderTrackingSingletonComponent {

    private static final class Factory implements OrderTrackingSingletonComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.ordertracking.di.OrderTrackingSingletonComponent.Factory
        public OrderTrackingSingletonComponent create() {
            return new OrderTrackingSingletonComponentImpl(0);
        }

        private Factory() {
        }
    }

    private static final class OrderTrackingSingletonComponentImpl implements OrderTrackingSingletonComponent {
        private final OrderTrackingSingletonComponentImpl orderTrackingSingletonComponentImpl;

        /* synthetic */ OrderTrackingSingletonComponentImpl(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.ordertracking.di.OrderTrackingSingletonComponentApi
        public ProcessLifecyclePublisher getProcessLifecycleObserver() {
            return new ProcessLifecyclePublisherImpl();
        }

        private OrderTrackingSingletonComponentImpl() {
            this.orderTrackingSingletonComponentImpl = this;
        }
    }

    public static OrderTrackingSingletonComponent.Factory factory() {
        return new Factory(0);
    }
}
