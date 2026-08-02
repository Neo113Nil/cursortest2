package ru.ozon.tracker.sendEvent.repository;

import Jb.d;
import Jb.e;
import Mj0.h;
import Pc.a;
import li0.InterfaceC7963a;
import xe.I;

/* loaded from: classes7.dex */
public final class EventRepositoryImpl_Factory implements e<EventRepositoryImpl> {
    private final a<InterfaceC7963a> eventDaoLazyProvider;
    private final a<I> ioDispatcherProvider;
    private final a<h> trackerApiLazyProvider;

    public EventRepositoryImpl_Factory(a<InterfaceC7963a> aVar, a<h> aVar2, a<I> aVar3) {
        this.eventDaoLazyProvider = aVar;
        this.trackerApiLazyProvider = aVar2;
        this.ioDispatcherProvider = aVar3;
    }

    public static EventRepositoryImpl_Factory create(a<InterfaceC7963a> aVar, a<h> aVar2, a<I> aVar3) {
        return new EventRepositoryImpl_Factory(aVar, aVar2, aVar3);
    }

    public static EventRepositoryImpl newInstance(Ib.a<InterfaceC7963a> aVar, Ib.a<h> aVar2, I i11) {
        return new EventRepositoryImpl(aVar, aVar2, i11);
    }

    @Override // Pc.a
    public EventRepositoryImpl get() {
        return newInstance(d.a(this.eventDaoLazyProvider), d.a(this.trackerApiLazyProvider), this.ioDispatcherProvider.get());
    }
}
