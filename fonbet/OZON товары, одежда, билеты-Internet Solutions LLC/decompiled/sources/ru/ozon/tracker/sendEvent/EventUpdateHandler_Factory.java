package ru.ozon.tracker.sendEvent;

import Jb.e;
import Pc.a;
import fi0.q;
import kotlin.time.b;
import ru.ozon.tracker.sendEvent.repository.EventRepository;
import xe.I;

/* loaded from: classes7.dex */
public final class EventUpdateHandler_Factory implements e<EventUpdateHandler> {
    private final a<EventRepository> eventRepositoryProvider;
    private final a<I> ioDispatcherProvider;
    private final a<q<b>> productSendingPeriodProvider;

    public EventUpdateHandler_Factory(a<EventRepository> aVar, a<I> aVar2, a<q<b>> aVar3) {
        this.eventRepositoryProvider = aVar;
        this.ioDispatcherProvider = aVar2;
        this.productSendingPeriodProvider = aVar3;
    }

    public static EventUpdateHandler_Factory create(a<EventRepository> aVar, a<I> aVar2, a<q<b>> aVar3) {
        return new EventUpdateHandler_Factory(aVar, aVar2, aVar3);
    }

    public static EventUpdateHandler newInstance(EventRepository eventRepository, I i11, q<b> qVar) {
        return new EventUpdateHandler(eventRepository, i11, qVar);
    }

    @Override // Pc.a
    public EventUpdateHandler get() {
        return newInstance(this.eventRepositoryProvider.get(), this.ioDispatcherProvider.get(), this.productSendingPeriodProvider.get());
    }
}
