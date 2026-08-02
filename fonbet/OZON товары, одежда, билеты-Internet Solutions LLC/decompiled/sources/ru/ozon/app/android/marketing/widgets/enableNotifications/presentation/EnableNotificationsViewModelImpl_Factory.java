package ru.ozon.app.android.marketing.widgets.enableNotifications.presentation;

import Jb.e;
import Pc.a;
import ru.ozon.app.android.marketing.widgets.enableNotifications.data.EnableNotificationsRepository;

/* loaded from: classes12.dex */
public final class EnableNotificationsViewModelImpl_Factory implements e<EnableNotificationsViewModelImpl> {
    private final a<EnableNotificationsRepository> repositoryProvider;

    public EnableNotificationsViewModelImpl_Factory(a<EnableNotificationsRepository> aVar) {
        this.repositoryProvider = aVar;
    }

    public static EnableNotificationsViewModelImpl_Factory create(a<EnableNotificationsRepository> aVar) {
        return new EnableNotificationsViewModelImpl_Factory(aVar);
    }

    public static EnableNotificationsViewModelImpl newInstance(EnableNotificationsRepository enableNotificationsRepository) {
        return new EnableNotificationsViewModelImpl(enableNotificationsRepository);
    }

    @Override // Pc.a
    public EnableNotificationsViewModelImpl get() {
        return newInstance(this.repositoryProvider.get());
    }
}
