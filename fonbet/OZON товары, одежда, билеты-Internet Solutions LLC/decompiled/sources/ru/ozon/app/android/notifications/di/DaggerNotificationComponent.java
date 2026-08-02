package ru.ozon.app.android.notifications.di;

import Jb.d;
import Jb.j;
import Pc.a;
import retrofit2.Retrofit;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.network.di.NetworkComponentConfig;
import ru.ozon.app.android.notifications.NotificationsApi;
import ru.ozon.app.android.notifications.NotificationsManager;
import ru.ozon.app.android.notifications.NotificationsManagerImpl;
import ru.ozon.app.android.notifications.di.NotificationComponent;
import ru.ozon.app.android.notifications.di.module.NotificationModule_Companion_ProvideNotificationsApiFactory;

/* loaded from: classes6.dex */
public final class DaggerNotificationComponent {

    private static final class Factory implements NotificationComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.notifications.di.NotificationComponent.Factory
        public NotificationComponent create(NetworkComponentApi networkComponentApi) {
            networkComponentApi.getClass();
            return new NotificationComponentImpl(networkComponentApi, 0);
        }

        private Factory() {
        }
    }

    private static final class NotificationComponentImpl implements NotificationComponent {
        private a<NotificationsManager> bindNotificationManagerProvider;
        private final NetworkComponentApi networkComponentApi;
        private final NotificationComponentImpl notificationComponentImpl;
        private a<NotificationsManagerImpl> notificationsManagerImplProvider;
        private a<NotificationsApi> provideNotificationsApiProvider;

        private static final class SwitchingProvider<T> implements a<T> {

            /* renamed from: id, reason: collision with root package name */
            private final int f92941id;
            private final NotificationComponentImpl notificationComponentImpl;

            SwitchingProvider(NotificationComponentImpl notificationComponentImpl, int i11) {
                this.notificationComponentImpl = notificationComponentImpl;
                this.f92941id = i11;
            }

            @Override // Pc.a
            public T get() {
                int i11 = this.f92941id;
                if (i11 == 0) {
                    Retrofit retrofit = this.notificationComponentImpl.networkComponentApi.getRetrofit();
                    j.c(retrofit);
                    return (T) NotificationModule_Companion_ProvideNotificationsApiFactory.provideNotificationsApi(retrofit);
                }
                if (i11 != 1) {
                    throw new AssertionError(this.f92941id);
                }
                NotificationsApi notificationsApi = (NotificationsApi) this.notificationComponentImpl.provideNotificationsApiProvider.get();
                NetworkComponentConfig networkComponentConfig = this.notificationComponentImpl.networkComponentApi.getNetworkComponentConfig();
                j.c(networkComponentConfig);
                return (T) new NotificationsManagerImpl(notificationsApi, networkComponentConfig);
            }
        }

        /* synthetic */ NotificationComponentImpl(NetworkComponentApi networkComponentApi, int i11) {
            this(networkComponentApi);
        }

        private void initialize(NetworkComponentApi networkComponentApi) {
            this.provideNotificationsApiProvider = d.b(new SwitchingProvider(this.notificationComponentImpl, 0));
            SwitchingProvider switchingProvider = new SwitchingProvider(this.notificationComponentImpl, 1);
            this.notificationsManagerImplProvider = switchingProvider;
            this.bindNotificationManagerProvider = d.b(switchingProvider);
        }

        @Override // ru.ozon.app.android.notifications.di.NotificationComponentApi
        public NotificationsManager getNotificationsManager() {
            return this.bindNotificationManagerProvider.get();
        }

        private NotificationComponentImpl(NetworkComponentApi networkComponentApi) {
            this.notificationComponentImpl = this;
            this.networkComponentApi = networkComponentApi;
            initialize(networkComponentApi);
        }
    }

    public static NotificationComponent.Factory factory() {
        return new Factory(0);
    }
}
