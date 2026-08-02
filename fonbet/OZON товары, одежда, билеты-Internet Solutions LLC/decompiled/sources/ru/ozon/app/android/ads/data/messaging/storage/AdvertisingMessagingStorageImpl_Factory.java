package ru.ozon.app.android.ads.data.messaging.storage;

import Jb.e;
import Pc.a;
import android.content.SharedPreferences;

/* loaded from: classes6.dex */
public final class AdvertisingMessagingStorageImpl_Factory implements e<AdvertisingMessagingStorageImpl> {
    private final a<SharedPreferences> preferencesProvider;

    public AdvertisingMessagingStorageImpl_Factory(a<SharedPreferences> aVar) {
        this.preferencesProvider = aVar;
    }

    public static AdvertisingMessagingStorageImpl_Factory create(a<SharedPreferences> aVar) {
        return new AdvertisingMessagingStorageImpl_Factory(aVar);
    }

    public static AdvertisingMessagingStorageImpl newInstance(SharedPreferences sharedPreferences) {
        return new AdvertisingMessagingStorageImpl(sharedPreferences);
    }

    @Override // Pc.a
    public AdvertisingMessagingStorageImpl get() {
        return newInstance(this.preferencesProvider.get());
    }
}
