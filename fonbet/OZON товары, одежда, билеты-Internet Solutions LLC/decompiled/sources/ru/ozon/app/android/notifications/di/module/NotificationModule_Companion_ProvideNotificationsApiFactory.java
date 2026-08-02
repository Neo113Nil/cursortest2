package ru.ozon.app.android.notifications.di.module;

import Jb.e;
import Jb.j;
import retrofit2.Retrofit;
import ru.ozon.app.android.notifications.NotificationsApi;

/* loaded from: classes12.dex */
public final class NotificationModule_Companion_ProvideNotificationsApiFactory implements e<NotificationsApi> {
    public static NotificationsApi provideNotificationsApi(Retrofit retrofit) {
        NotificationsApi provideNotificationsApi = NotificationModule.INSTANCE.provideNotificationsApi(retrofit);
        j.d(provideNotificationsApi);
        return provideNotificationsApi;
    }
}
