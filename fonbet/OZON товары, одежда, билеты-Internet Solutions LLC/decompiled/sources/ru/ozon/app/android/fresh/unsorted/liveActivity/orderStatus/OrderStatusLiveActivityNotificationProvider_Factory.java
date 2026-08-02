package ru.ozon.app.android.fresh.unsorted.liveActivity.orderStatus;

import Jb.e;
import Pc.a;
import android.app.Application;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;

/* loaded from: classes6.dex */
public final class OrderStatusLiveActivityNotificationProvider_Factory implements e<OrderStatusLiveActivityNotificationProvider> {
    private final a<Application> applicationProvider;
    private final a<JsonParser> jsonDeserializerProvider;

    public OrderStatusLiveActivityNotificationProvider_Factory(a<Application> aVar, a<JsonParser> aVar2) {
        this.applicationProvider = aVar;
        this.jsonDeserializerProvider = aVar2;
    }

    public static OrderStatusLiveActivityNotificationProvider_Factory create(a<Application> aVar, a<JsonParser> aVar2) {
        return new OrderStatusLiveActivityNotificationProvider_Factory(aVar, aVar2);
    }

    public static OrderStatusLiveActivityNotificationProvider newInstance(Application application, JsonParser jsonParser) {
        return new OrderStatusLiveActivityNotificationProvider(application, jsonParser);
    }

    @Override // Pc.a
    public OrderStatusLiveActivityNotificationProvider get() {
        return newInstance(this.applicationProvider.get(), this.jsonDeserializerProvider.get());
    }
}
