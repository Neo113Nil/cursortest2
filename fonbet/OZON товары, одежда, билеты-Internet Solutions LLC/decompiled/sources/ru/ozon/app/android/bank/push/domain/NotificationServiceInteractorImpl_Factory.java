package ru.ozon.app.android.bank.push.domain;

import Jb.d;
import Jb.e;
import Pc.a;
import com.squareup.moshi.Moshi;
import ru.ozon.fintech.lib.FintechCoreLib;

/* loaded from: classes11.dex */
public final class NotificationServiceInteractorImpl_Factory implements e<NotificationServiceInteractorImpl> {
    private final a<FintechCoreLib> fintechCoreLibProvider;
    private final a<Moshi> moshiProvider;
    private final a<NotificationToPushModelMapper> notificationMapperProvider;

    public NotificationServiceInteractorImpl_Factory(a<NotificationToPushModelMapper> aVar, a<FintechCoreLib> aVar2, a<Moshi> aVar3) {
        this.notificationMapperProvider = aVar;
        this.fintechCoreLibProvider = aVar2;
        this.moshiProvider = aVar3;
    }

    public static NotificationServiceInteractorImpl_Factory create(a<NotificationToPushModelMapper> aVar, a<FintechCoreLib> aVar2, a<Moshi> aVar3) {
        return new NotificationServiceInteractorImpl_Factory(aVar, aVar2, aVar3);
    }

    public static NotificationServiceInteractorImpl newInstance(NotificationToPushModelMapper notificationToPushModelMapper, Ib.a<FintechCoreLib> aVar, Moshi moshi) {
        return new NotificationServiceInteractorImpl(notificationToPushModelMapper, aVar, moshi);
    }

    @Override // Pc.a
    public NotificationServiceInteractorImpl get() {
        return newInstance(this.notificationMapperProvider.get(), d.a(this.fintechCoreLibProvider), this.moshiProvider.get());
    }
}
