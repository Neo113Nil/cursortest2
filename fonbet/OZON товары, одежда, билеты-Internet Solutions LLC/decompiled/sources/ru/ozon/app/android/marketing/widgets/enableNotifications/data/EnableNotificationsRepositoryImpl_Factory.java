package ru.ozon.app.android.marketing.widgets.enableNotifications.data;

import Jb.e;
import Pc.a;
import ru.ozon.app.android.marketing.widgets.enableNotifications.api.EnableNotificationsApi;
import ru.ozon.app.android.network.di.NetworkComponentConfig;

/* loaded from: classes12.dex */
public final class EnableNotificationsRepositoryImpl_Factory implements e<EnableNotificationsRepositoryImpl> {
    private final a<EnableNotificationsApi> apiProvider;
    private final a<NetworkComponentConfig> configProvider;

    public EnableNotificationsRepositoryImpl_Factory(a<EnableNotificationsApi> aVar, a<NetworkComponentConfig> aVar2) {
        this.apiProvider = aVar;
        this.configProvider = aVar2;
    }

    public static EnableNotificationsRepositoryImpl_Factory create(a<EnableNotificationsApi> aVar, a<NetworkComponentConfig> aVar2) {
        return new EnableNotificationsRepositoryImpl_Factory(aVar, aVar2);
    }

    public static EnableNotificationsRepositoryImpl newInstance(EnableNotificationsApi enableNotificationsApi, NetworkComponentConfig networkComponentConfig) {
        return new EnableNotificationsRepositoryImpl(enableNotificationsApi, networkComponentConfig);
    }

    @Override // Pc.a
    public EnableNotificationsRepositoryImpl get() {
        return newInstance(this.apiProvider.get(), this.configProvider.get());
    }
}
