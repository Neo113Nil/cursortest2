package ru.ozon.app.android.ads.data.messaging;

import Jb.e;
import Pc.a;
import ru.ozon.app.android.ads.data.messaging.storage.AdvertisingMessagingStorage;

/* loaded from: classes6.dex */
public final class AdvertisingMessagingInteractorImpl_Factory implements e<AdvertisingMessagingInteractorImpl> {
    private final a<AdvertisingMessagingService> serviceProvider;
    private final a<AdvertisingMessagingStorage> storageProvider;

    public AdvertisingMessagingInteractorImpl_Factory(a<AdvertisingMessagingService> aVar, a<AdvertisingMessagingStorage> aVar2) {
        this.serviceProvider = aVar;
        this.storageProvider = aVar2;
    }

    public static AdvertisingMessagingInteractorImpl_Factory create(a<AdvertisingMessagingService> aVar, a<AdvertisingMessagingStorage> aVar2) {
        return new AdvertisingMessagingInteractorImpl_Factory(aVar, aVar2);
    }

    public static AdvertisingMessagingInteractorImpl newInstance(AdvertisingMessagingService advertisingMessagingService, AdvertisingMessagingStorage advertisingMessagingStorage) {
        return new AdvertisingMessagingInteractorImpl(advertisingMessagingService, advertisingMessagingStorage);
    }

    @Override // Pc.a
    public AdvertisingMessagingInteractorImpl get() {
        return newInstance(this.serviceProvider.get(), this.storageProvider.get());
    }
}
