package ru.ozon.app.android.geoprovider.di;

import gi.C6740b;
import hi.InterfaceC6958a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\ba\u0018\u0000 \u00022\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/geoprovider/di/GeoProviderComponent;", "Lru/ozon/app/android/geoprovider/di/GeoProviderComponentApi;", "Companion", "Factory", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface GeoProviderComponent extends GeoProviderComponentApi {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\b\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/geoprovider/di/GeoProviderComponent$Companion;", "", "<init>", "()V", "Lgi/b;", "Lru/ozon/app/android/di/provider/factory/ComponentStorage;", "componentStorage", "Lru/ozon/app/android/geoprovider/di/GeoProviderComponent;", "create", "(Lgi/b;)Lru/ozon/app/android/geoprovider/di/GeoProviderComponent;", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @NotNull
        public final GeoProviderComponent create(@NotNull C6740b componentStorage) {
            Intrinsics.checkNotNullParameter(componentStorage, "componentStorage");
            Factory factory = DaggerGeoProviderComponent.factory();
            if (ContextComponentDependencies.class.isAssignableFrom(InterfaceC6958a.class)) {
                throw new IllegalStateException("Requested component ContextComponentDependencies is not DiComponent");
            }
            return factory.create((ContextComponentDependencies) componentStorage.b(ContextComponentDependencies.class));
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/geoprovider/di/GeoProviderComponent$Factory;", "", "create", "Lru/ozon/app/android/geoprovider/di/GeoProviderComponent;", "contextComponentDependencies", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Factory {
        @NotNull
        GeoProviderComponent create(@NotNull ContextComponentDependencies contextComponentDependencies);
    }
}
