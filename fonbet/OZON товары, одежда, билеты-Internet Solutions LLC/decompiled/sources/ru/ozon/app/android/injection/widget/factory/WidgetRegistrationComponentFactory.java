package ru.ozon.app.android.injection.widget.factory;

import gi.C6740b;
import hi.InterfaceC6958a;
import ii.InterfaceC7081a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.di.WidgetRegistrationComponentApi;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.injection.widget.DaggerWidgetRegistrationComponent;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentDependencies;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\t\u001a\u00020\u00022\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/injection/widget/factory/WidgetRegistrationComponentFactory;", "Lii/a;", "Lru/ozon/app/android/composer/di/WidgetRegistrationComponentApi;", "Lru/ozon/app/android/di/provider/factory/ComponentFactory;", "<init>", "()V", "Lgi/b;", "Lru/ozon/app/android/di/provider/factory/ComponentStorage;", "componentStorage", "create", "(Lgi/b;)Lru/ozon/app/android/composer/di/WidgetRegistrationComponentApi;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class WidgetRegistrationComponentFactory implements InterfaceC7081a<WidgetRegistrationComponentApi> {
    @Override // ii.InterfaceC7081a
    @NotNull
    public WidgetRegistrationComponentApi create(@NotNull C6740b componentStorage) {
        Intrinsics.checkNotNullParameter(componentStorage, "componentStorage");
        if (ContextComponentDependencies.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component ContextComponentDependencies is not DiComponent");
        }
        ContextComponentDependencies contextComponentDependencies = (ContextComponentDependencies) componentStorage.b(ContextComponentDependencies.class);
        if (NetworkComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NetworkComponentApi is not DiComponent");
        }
        NetworkComponentApi networkComponentApi = (NetworkComponentApi) componentStorage.b(NetworkComponentApi.class);
        if (AndroidPlatformComponentDependencies.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AndroidPlatformComponentDependencies is not DiComponent");
        }
        return DaggerWidgetRegistrationComponent.factory().create(contextComponentDependencies.getContext(), contextComponentDependencies.getApplication(), networkComponentApi.getJsonDeserializer(), networkComponentApi.getJsonSerializer(), networkComponentApi.getMoshi(), networkComponentApi.getFeatureChecker(), ((AndroidPlatformComponentDependencies) componentStorage.b(AndroidPlatformComponentDependencies.class)).getAppType());
    }
}
