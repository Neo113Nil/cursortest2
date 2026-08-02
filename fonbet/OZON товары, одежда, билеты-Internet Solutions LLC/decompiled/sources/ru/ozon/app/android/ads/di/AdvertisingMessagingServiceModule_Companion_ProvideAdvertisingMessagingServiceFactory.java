package ru.ozon.app.android.ads.di;

import Jb.e;
import Pc.a;
import android.content.Context;
import ru.ozon.app.android.ads.FirebaseAdvertisingMessagingService;

/* loaded from: classes6.dex */
public final class AdvertisingMessagingServiceModule_Companion_ProvideAdvertisingMessagingServiceFactory implements e<FirebaseAdvertisingMessagingService> {
    private final a<Context> contextProvider;

    public AdvertisingMessagingServiceModule_Companion_ProvideAdvertisingMessagingServiceFactory(a<Context> aVar) {
        this.contextProvider = aVar;
    }

    public static AdvertisingMessagingServiceModule_Companion_ProvideAdvertisingMessagingServiceFactory create(a<Context> aVar) {
        return new AdvertisingMessagingServiceModule_Companion_ProvideAdvertisingMessagingServiceFactory(aVar);
    }

    public static FirebaseAdvertisingMessagingService provideAdvertisingMessagingService(Context context) {
        return AdvertisingMessagingServiceModule.INSTANCE.provideAdvertisingMessagingService(context);
    }

    @Override // Pc.a
    public FirebaseAdvertisingMessagingService get() {
        return provideAdvertisingMessagingService(this.contextProvider.get());
    }
}
