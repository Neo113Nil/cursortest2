package ru.ozon.app.android.marketing.widgets.enableNotifications.core;

import Jb.e;
import Pc.a;
import android.content.Context;

/* loaded from: classes12.dex */
public final class EnableNotificationsMapper_Factory implements e<EnableNotificationsMapper> {
    private final a<Context> contextProvider;

    public EnableNotificationsMapper_Factory(a<Context> aVar) {
        this.contextProvider = aVar;
    }

    public static EnableNotificationsMapper_Factory create(a<Context> aVar) {
        return new EnableNotificationsMapper_Factory(aVar);
    }

    public static EnableNotificationsMapper newInstance(Context context) {
        return new EnableNotificationsMapper(context);
    }

    @Override // Pc.a
    public EnableNotificationsMapper get() {
        return newInstance(this.contextProvider.get());
    }
}
