package ru.ozon.tracker.sendEvent;

import Jb.d;
import Jb.e;
import Pc.a;
import bk0.g;
import fi0.v;
import fi0.x;
import mi0.InterfaceC8336f;
import ru.ozon.tracker.sendEvent.repository.EventRepository;
import ru.ozon.tracker.sendEvent.runner.EventDelayedTaskLauncher;
import xe.I;
import xe.J;
import xe.M;

/* loaded from: classes7.dex */
public final class EventManagerImpl_Factory implements e<EventManagerImpl> {
    private final a<v> backgroundModeConfigProvider;
    private final a<CurrentPageInternalProvider> currentPageProvider;
    private final a<I> dispatcherProvider;
    private final a<EventDelayedTaskLauncher> eventDelayedTaskLauncherLazyProvider;
    private final a<EventMapper> eventMapperProvider;
    private final a<EventRepository> eventRepositoryLazyProvider;
    private final a<EventUpdateHandler> eventUpdateHandlerProvider;
    private final a<InterfaceC8336f> eventsLoggerProvider;
    private final a<J> globalExceptionHandlerProvider;
    private final a<ru.ozon.tracker.process.lifecycle.a> lifecycleActionExecutorProvider;
    private final a<g> pageContainerProvider;
    private final a<SendEventThrowableHandler> sendEventThrowableHandlerLazyProvider;
    private final a<x> settingsProvider;
    private final a<M> trackerScopeProvider;

    public EventManagerImpl_Factory(a<EventMapper> aVar, a<x> aVar2, a<g> aVar3, a<InterfaceC8336f> aVar4, a<CurrentPageInternalProvider> aVar5, a<ru.ozon.tracker.process.lifecycle.a> aVar6, a<M> aVar7, a<I> aVar8, a<EventDelayedTaskLauncher> aVar9, a<EventRepository> aVar10, a<EventUpdateHandler> aVar11, a<v> aVar12, a<J> aVar13, a<SendEventThrowableHandler> aVar14) {
        this.eventMapperProvider = aVar;
        this.settingsProvider = aVar2;
        this.pageContainerProvider = aVar3;
        this.eventsLoggerProvider = aVar4;
        this.currentPageProvider = aVar5;
        this.lifecycleActionExecutorProvider = aVar6;
        this.trackerScopeProvider = aVar7;
        this.dispatcherProvider = aVar8;
        this.eventDelayedTaskLauncherLazyProvider = aVar9;
        this.eventRepositoryLazyProvider = aVar10;
        this.eventUpdateHandlerProvider = aVar11;
        this.backgroundModeConfigProvider = aVar12;
        this.globalExceptionHandlerProvider = aVar13;
        this.sendEventThrowableHandlerLazyProvider = aVar14;
    }

    public static EventManagerImpl_Factory create(a<EventMapper> aVar, a<x> aVar2, a<g> aVar3, a<InterfaceC8336f> aVar4, a<CurrentPageInternalProvider> aVar5, a<ru.ozon.tracker.process.lifecycle.a> aVar6, a<M> aVar7, a<I> aVar8, a<EventDelayedTaskLauncher> aVar9, a<EventRepository> aVar10, a<EventUpdateHandler> aVar11, a<v> aVar12, a<J> aVar13, a<SendEventThrowableHandler> aVar14) {
        return new EventManagerImpl_Factory(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11, aVar12, aVar13, aVar14);
    }

    public static EventManagerImpl newInstance(EventMapper eventMapper, x xVar, g gVar, InterfaceC8336f interfaceC8336f, CurrentPageInternalProvider currentPageInternalProvider, ru.ozon.tracker.process.lifecycle.a aVar, M m11, I i11, Ib.a<EventDelayedTaskLauncher> aVar2, Ib.a<EventRepository> aVar3, EventUpdateHandler eventUpdateHandler, v vVar, J j11, Ib.a<SendEventThrowableHandler> aVar4) {
        return new EventManagerImpl(eventMapper, xVar, gVar, interfaceC8336f, currentPageInternalProvider, aVar, m11, i11, aVar2, aVar3, eventUpdateHandler, vVar, j11, aVar4);
    }

    @Override // Pc.a
    public EventManagerImpl get() {
        return newInstance(this.eventMapperProvider.get(), this.settingsProvider.get(), this.pageContainerProvider.get(), this.eventsLoggerProvider.get(), this.currentPageProvider.get(), this.lifecycleActionExecutorProvider.get(), this.trackerScopeProvider.get(), this.dispatcherProvider.get(), d.a(this.eventDelayedTaskLauncherLazyProvider), d.a(this.eventRepositoryLazyProvider), this.eventUpdateHandlerProvider.get(), this.backgroundModeConfigProvider.get(), this.globalExceptionHandlerProvider.get(), d.a(this.sendEventThrowableHandlerLazyProvider));
    }
}
