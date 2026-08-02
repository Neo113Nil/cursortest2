package ru.ozon.app.android.sentry.di.module;

import gi.C6740b;
import hi.InterfaceC6958a;
import ii.InterfaceC7081a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mJ.C8113a;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.limb.Limb2ComponentApi;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.sentry.di.DaggerSentryApiComponentImpl;
import ru.ozon.app.android.sentry.di.SentryApiComponent;
import ru.ozon.app.android.sentry.di.SentryApiComponentImpl;
import ru.ozon.app.android.storage.di.StorageComponentApi;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\n\u001a\u001e\u0012\n\b\u0001\u0012\u00060\u0005j\u0002`\u00060\u0004j\u000e\u0012\n\b\u0001\u0012\u00060\u0005j\u0002`\u0006`\u0007H\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/sentry/di/module/SentryComponentFactoryModule;", "", "<init>", "()V", "Lii/a;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/di/provider/factory/ComponentFactory;", "provideLimb2ComponentFactory$sentry_prodGoogleAllVendorsRelease", "()Lii/a;", "provideLimb2ComponentFactory", "sentry_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SentryComponentFactoryModule {
    /* JADX INFO: Access modifiers changed from: private */
    public static final SentryApiComponent provideLimb2ComponentFactory$lambda$0(C6740b componentStorage) {
        Intrinsics.checkNotNullParameter(componentStorage, "componentStorage");
        SentryApiComponentImpl.Factory factory = DaggerSentryApiComponentImpl.factory();
        if (Limb2ComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component Limb2ComponentApi is not DiComponent");
        }
        Limb2ComponentApi limb2ComponentApi = (Limb2ComponentApi) componentStorage.b(Limb2ComponentApi.class);
        if (NetworkComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NetworkComponentApi is not DiComponent");
        }
        NetworkComponentApi networkComponentApi = (NetworkComponentApi) componentStorage.b(NetworkComponentApi.class);
        if (StorageComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component StorageComponentApi is not DiComponent");
        }
        return factory.create(limb2ComponentApi, networkComponentApi, (StorageComponentApi) componentStorage.b(StorageComponentApi.class));
    }

    @NotNull
    public final InterfaceC7081a<? extends InterfaceC6958a> provideLimb2ComponentFactory$sentry_prodGoogleAllVendorsRelease() {
        return new C8113a();
    }
}
