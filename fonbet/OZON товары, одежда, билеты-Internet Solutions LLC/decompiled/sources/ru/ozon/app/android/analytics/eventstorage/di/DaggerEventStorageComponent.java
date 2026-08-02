package ru.ozon.app.android.analytics.eventstorage.di;

import Jb.d;
import Pc.a;
import ru.ozon.app.android.analytics.eventstorage.ViewEventStorage;
import ru.ozon.app.android.analytics.eventstorage.ViewEventStorageImpl;
import ru.ozon.app.android.analytics.eventstorage.di.EventStorageComponent;

/* loaded from: classes6.dex */
public final class DaggerEventStorageComponent {

    private static final class EventStorageComponentImpl implements EventStorageComponent {
        private a<ViewEventStorage> bindViewEventStorageProvider;
        private final EventStorageComponentImpl eventStorageComponentImpl;
        private a<ViewEventStorageImpl> viewEventStorageImplProvider;

        private static final class SwitchingProvider<T> implements a<T> {
            private final EventStorageComponentImpl eventStorageComponentImpl;

            /* renamed from: id, reason: collision with root package name */
            private final int f92159id;

            SwitchingProvider(EventStorageComponentImpl eventStorageComponentImpl, int i11) {
                this.eventStorageComponentImpl = eventStorageComponentImpl;
                this.f92159id = i11;
            }

            @Override // Pc.a
            public T get() {
                if (this.f92159id == 0) {
                    return (T) new ViewEventStorageImpl();
                }
                throw new AssertionError(this.f92159id);
            }
        }

        /* synthetic */ EventStorageComponentImpl(int i11) {
            this();
        }

        private void initialize() {
            SwitchingProvider switchingProvider = new SwitchingProvider(this.eventStorageComponentImpl, 0);
            this.viewEventStorageImplProvider = switchingProvider;
            this.bindViewEventStorageProvider = d.b(switchingProvider);
        }

        @Override // ru.ozon.app.android.analytics.eventstorage.di.EventStorageComponentApi
        public ViewEventStorage getViewEventStorage() {
            return this.bindViewEventStorageProvider.get();
        }

        private EventStorageComponentImpl() {
            this.eventStorageComponentImpl = this;
            initialize();
        }
    }

    private static final class Factory implements EventStorageComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.analytics.eventstorage.di.EventStorageComponent.Factory
        public EventStorageComponent create() {
            return new EventStorageComponentImpl(0);
        }

        private Factory() {
        }
    }

    public static EventStorageComponent.Factory factory() {
        return new Factory(0);
    }
}
