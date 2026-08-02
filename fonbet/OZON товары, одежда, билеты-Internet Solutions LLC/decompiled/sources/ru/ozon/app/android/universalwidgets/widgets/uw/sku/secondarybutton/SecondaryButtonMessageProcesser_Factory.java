package ru.ozon.app.android.universalwidgets.widgets.uw.sku.secondarybutton;

import GZ.g;
import Jb.e;
import Pc.a;

/* loaded from: classes2.dex */
public final class SecondaryButtonMessageProcesser_Factory implements e<SecondaryButtonMessageProcesser> {
    private final a<g> screenRouterProvider;

    public SecondaryButtonMessageProcesser_Factory(a<g> aVar) {
        this.screenRouterProvider = aVar;
    }

    public static SecondaryButtonMessageProcesser_Factory create(a<g> aVar) {
        return new SecondaryButtonMessageProcesser_Factory(aVar);
    }

    public static SecondaryButtonMessageProcesser newInstance(g gVar) {
        return new SecondaryButtonMessageProcesser(gVar);
    }

    @Override // Pc.a
    public SecondaryButtonMessageProcesser get() {
        return newInstance(this.screenRouterProvider.get());
    }
}
