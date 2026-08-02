package ru.ozon.app.android.marketing.di.notifications;

import Jb.e;
import Jb.j;
import Pc.a;
import retrofit2.Retrofit;
import ru.ozon.app.android.marketing.widgets.enableNotifications.api.EnableNotificationsApi;

/* loaded from: classes12.dex */
public final class NotificationCenterModule_Companion_ProvideAllowPushApisFactory implements e<EnableNotificationsApi> {
    private final a<Retrofit> retrofitProvider;

    public NotificationCenterModule_Companion_ProvideAllowPushApisFactory(a<Retrofit> aVar) {
        this.retrofitProvider = aVar;
    }

    public static NotificationCenterModule_Companion_ProvideAllowPushApisFactory create(a<Retrofit> aVar) {
        return new NotificationCenterModule_Companion_ProvideAllowPushApisFactory(aVar);
    }

    public static EnableNotificationsApi provideAllowPushApis(Retrofit retrofit) {
        EnableNotificationsApi provideAllowPushApis = NotificationCenterModule.INSTANCE.provideAllowPushApis(retrofit);
        j.d(provideAllowPushApis);
        return provideAllowPushApis;
    }

    @Override // Pc.a
    public EnableNotificationsApi get() {
        return provideAllowPushApis(this.retrofitProvider.get());
    }
}
