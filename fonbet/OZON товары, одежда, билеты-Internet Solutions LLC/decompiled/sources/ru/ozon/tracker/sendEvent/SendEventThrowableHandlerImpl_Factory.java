package ru.ozon.tracker.sendEvent;

import Jb.d;
import Jb.e;
import Pc.a;
import ru.ozon.tracker.sendEvent.repository.EventRepository;

/* loaded from: classes7.dex */
public final class SendEventThrowableHandlerImpl_Factory implements e<SendEventThrowableHandlerImpl> {
    private final a<Lj0.e> androidTrackerBusinessLoggerLazyProvider;
    private final a<EventRepository> eventRepositoryLazyProvider;

    public SendEventThrowableHandlerImpl_Factory(a<EventRepository> aVar, a<Lj0.e> aVar2) {
        this.eventRepositoryLazyProvider = aVar;
        this.androidTrackerBusinessLoggerLazyProvider = aVar2;
    }

    public static SendEventThrowableHandlerImpl_Factory create(a<EventRepository> aVar, a<Lj0.e> aVar2) {
        return new SendEventThrowableHandlerImpl_Factory(aVar, aVar2);
    }

    public static SendEventThrowableHandlerImpl newInstance(Ib.a<EventRepository> aVar, Ib.a<Lj0.e> aVar2) {
        return new SendEventThrowableHandlerImpl(aVar, aVar2);
    }

    @Override // Pc.a
    public SendEventThrowableHandlerImpl get() {
        return newInstance(d.a(this.eventRepositoryLazyProvider), d.a(this.androidTrackerBusinessLoggerLazyProvider));
    }
}
