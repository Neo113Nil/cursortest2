package ru.ozon.tracker.sendEvent;

import Jb.e;
import Pc.a;
import bk0.g;
import fi0.x;

/* loaded from: classes7.dex */
public final class CurrentPageInternalProvider_Factory implements e<CurrentPageInternalProvider> {
    private final a<g> pageContainerProvider;
    private final a<x> trackerSettingsProvider;

    public CurrentPageInternalProvider_Factory(a<x> aVar, a<g> aVar2) {
        this.trackerSettingsProvider = aVar;
        this.pageContainerProvider = aVar2;
    }

    public static CurrentPageInternalProvider_Factory create(a<x> aVar, a<g> aVar2) {
        return new CurrentPageInternalProvider_Factory(aVar, aVar2);
    }

    public static CurrentPageInternalProvider newInstance(x xVar, g gVar) {
        return new CurrentPageInternalProvider(xVar, gVar);
    }

    @Override // Pc.a
    public CurrentPageInternalProvider get() {
        return newInstance(this.trackerSettingsProvider.get(), this.pageContainerProvider.get());
    }
}
