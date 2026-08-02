package ru.ozon.app.android.fresh.unsorted.liveActivity.click;

import Jb.e;
import Pc.a;
import android.app.Application;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;

/* loaded from: classes6.dex */
public final class ClickLiveActivityNotificationProvider_Factory implements e<ClickLiveActivityNotificationProvider> {
    private final a<Application> applicationProvider;
    private final a<JsonParser> jsonDeserializerProvider;

    public ClickLiveActivityNotificationProvider_Factory(a<Application> aVar, a<JsonParser> aVar2) {
        this.applicationProvider = aVar;
        this.jsonDeserializerProvider = aVar2;
    }

    public static ClickLiveActivityNotificationProvider_Factory create(a<Application> aVar, a<JsonParser> aVar2) {
        return new ClickLiveActivityNotificationProvider_Factory(aVar, aVar2);
    }

    public static ClickLiveActivityNotificationProvider newInstance(Application application, JsonParser jsonParser) {
        return new ClickLiveActivityNotificationProvider(application, jsonParser);
    }

    @Override // Pc.a
    public ClickLiveActivityNotificationProvider get() {
        return newInstance(this.applicationProvider.get(), this.jsonDeserializerProvider.get());
    }
}
