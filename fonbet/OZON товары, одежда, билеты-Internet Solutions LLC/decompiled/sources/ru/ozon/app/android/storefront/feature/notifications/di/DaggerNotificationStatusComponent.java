package ru.ozon.app.android.storefront.feature.notifications.di;

import Jb.d;
import Jb.j;
import Pc.a;
import We.B;
import android.app.Application;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentDependencies;
import ru.ozon.app.android.storefront.core.notifications.domain.NotificationStatusManager;
import ru.ozon.app.android.storefront.core.notifications.domain.NotificationStatusObserver;
import ru.ozon.app.android.storefront.core.notifications.domain.NotificationStatusProvider;
import ru.ozon.app.android.storefront.feature.notifications.di.NotificationStatusComponent;
import ru.ozon.app.android.storefront.feature.notifications.di.NotificationStatusModule;
import ru.ozon.app.android.utils.AppType;

/* loaded from: classes7.dex */
public final class DaggerNotificationStatusComponent {

    private static final class Factory implements NotificationStatusComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.storefront.feature.notifications.di.NotificationStatusComponent.Factory
        public NotificationStatusComponent create(ContextComponentDependencies contextComponentDependencies, AndroidPlatformComponentDependencies androidPlatformComponentDependencies) {
            contextComponentDependencies.getClass();
            androidPlatformComponentDependencies.getClass();
            return new NotificationStatusComponentImpl(contextComponentDependencies, androidPlatformComponentDependencies, 0);
        }

        private Factory() {
        }
    }

    private static final class NotificationStatusComponentImpl implements NotificationStatusComponent {
        private final AndroidPlatformComponentDependencies androidPlatformComponentDependencies;
        private final ContextComponentDependencies contextComponentDependencies;
        private a<NotificationStatusManager> getNotificationStatusManagerProvider;
        private final NotificationStatusComponentImpl notificationStatusComponentImpl;

        private static final class SwitchingProvider<T> implements a<T> {

            /* renamed from: id, reason: collision with root package name */
            private final int f93517id;
            private final NotificationStatusComponentImpl notificationStatusComponentImpl;

            SwitchingProvider(NotificationStatusComponentImpl notificationStatusComponentImpl, int i11) {
                this.notificationStatusComponentImpl = notificationStatusComponentImpl;
                this.f93517id = i11;
            }

            @Override // Pc.a
            public T get() {
                if (this.f93517id != 0) {
                    throw new AssertionError(this.f93517id);
                }
                Application application = this.notificationStatusComponentImpl.contextComponentDependencies.getApplication();
                j.c(application);
                AppType appType = this.notificationStatusComponentImpl.androidPlatformComponentDependencies.getAppType();
                j.c(appType);
                return (T) NotificationStatusModule_Companion_GetNotificationStatusManagerFactory.getNotificationStatusManager(application, appType);
            }
        }

        /* synthetic */ NotificationStatusComponentImpl(ContextComponentDependencies contextComponentDependencies, AndroidPlatformComponentDependencies androidPlatformComponentDependencies, int i11) {
            this(contextComponentDependencies, androidPlatformComponentDependencies);
        }

        private void initialize(ContextComponentDependencies contextComponentDependencies, AndroidPlatformComponentDependencies androidPlatformComponentDependencies) {
            this.getNotificationStatusManagerProvider = d.b(new SwitchingProvider(this.notificationStatusComponentImpl, 0));
        }

        @Override // ru.ozon.app.android.storefront.core.notifications.di.NotificationStatusComponentApi
        public B getNotificationStatusInterceptor() {
            NotificationStatusModule.Companion companion = NotificationStatusModule.INSTANCE;
            AppType appType = this.androidPlatformComponentDependencies.getAppType();
            j.c(appType);
            return companion.getNotificationStatusInterceptor(appType, this.getNotificationStatusManagerProvider.get());
        }

        @Override // ru.ozon.app.android.storefront.core.notifications.di.NotificationStatusComponentApi
        public NotificationStatusObserver getNotificationStatusObserver() {
            return this.getNotificationStatusManagerProvider.get();
        }

        @Override // ru.ozon.app.android.storefront.core.notifications.di.NotificationStatusComponentApi
        public NotificationStatusProvider getNotificationStatusProvider() {
            return this.getNotificationStatusManagerProvider.get();
        }

        private NotificationStatusComponentImpl(ContextComponentDependencies contextComponentDependencies, AndroidPlatformComponentDependencies androidPlatformComponentDependencies) {
            this.notificationStatusComponentImpl = this;
            this.contextComponentDependencies = contextComponentDependencies;
            this.androidPlatformComponentDependencies = androidPlatformComponentDependencies;
            initialize(contextComponentDependencies, androidPlatformComponentDependencies);
        }
    }

    public static NotificationStatusComponent.Factory factory() {
        return new Factory(0);
    }
}
