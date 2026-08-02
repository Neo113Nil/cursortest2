package ru.ozon.app.android.push.di.factory;

import NF.a;
import gi.C6740b;
import hi.InterfaceC6958a;
import ii.InterfaceC7081a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.limb.Limb2ComponentApi;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.push.di.DaggerPushComponent;
import ru.ozon.app.android.push.di.PushComponent;
import ru.ozon.app.android.push.di.PushComponentApi;
import ru.ozon.app.android.push.di.PushComponentDependencies;
import ru.ozon.app.android.storage.di.StorageComponentApi;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\n\u001a\u001e\u0012\n\b\u0001\u0012\u00060\u0005j\u0002`\u00060\u0004j\u000e\u0012\n\b\u0001\u0012\u00060\u0005j\u0002`\u0006`\u0007H\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/push/di/factory/PushComponentFactoryModule;", "", "<init>", "()V", "Lii/a;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/di/provider/factory/ComponentFactory;", "providePushComponentFactory$push_prodGoogleAllVendorsRelease", "()Lii/a;", "providePushComponentFactory", "push_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PushComponentFactoryModule {
    /* JADX INFO: Access modifiers changed from: private */
    public static final PushComponentApi providePushComponentFactory$lambda$0(C6740b componentStorage) {
        Intrinsics.checkNotNullParameter(componentStorage, "componentStorage");
        PushComponent.Factory factory = DaggerPushComponent.factory();
        if (PushComponentDependencies.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component PushComponentDependencies is not DiComponent");
        }
        PushComponentDependencies pushComponentDependencies = (PushComponentDependencies) componentStorage.b(PushComponentDependencies.class);
        if (ContextComponentDependencies.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component ContextComponentDependencies is not DiComponent");
        }
        ContextComponentDependencies contextComponentDependencies = (ContextComponentDependencies) componentStorage.b(ContextComponentDependencies.class);
        if (NetworkComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NetworkComponentApi is not DiComponent");
        }
        NetworkComponentApi networkComponentApi = (NetworkComponentApi) componentStorage.b(NetworkComponentApi.class);
        if (StorageComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component StorageComponentApi is not DiComponent");
        }
        StorageComponentApi storageComponentApi = (StorageComponentApi) componentStorage.b(StorageComponentApi.class);
        if (Limb2ComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component Limb2ComponentApi is not DiComponent");
        }
        return factory.create(pushComponentDependencies, contextComponentDependencies, networkComponentApi, storageComponentApi, (Limb2ComponentApi) componentStorage.b(Limb2ComponentApi.class));
    }

    @NotNull
    public final InterfaceC7081a<? extends InterfaceC6958a> providePushComponentFactory$push_prodGoogleAllVendorsRelease() {
        return new a();
    }
}
