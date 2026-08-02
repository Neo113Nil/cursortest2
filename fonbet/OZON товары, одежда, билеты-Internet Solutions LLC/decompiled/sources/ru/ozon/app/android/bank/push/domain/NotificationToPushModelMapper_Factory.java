package ru.ozon.app.android.bank.push.domain;

import Jb.e;
import Pc.a;
import android.content.Context;

/* loaded from: classes11.dex */
public final class NotificationToPushModelMapper_Factory implements e<NotificationToPushModelMapper> {
    private final a<Context> appContextProvider;

    public NotificationToPushModelMapper_Factory(a<Context> aVar) {
        this.appContextProvider = aVar;
    }

    public static NotificationToPushModelMapper_Factory create(a<Context> aVar) {
        return new NotificationToPushModelMapper_Factory(aVar);
    }

    public static NotificationToPushModelMapper newInstance(Context context) {
        return new NotificationToPushModelMapper(context);
    }

    @Override // Pc.a
    public NotificationToPushModelMapper get() {
        return newInstance(this.appContextProvider.get());
    }
}
