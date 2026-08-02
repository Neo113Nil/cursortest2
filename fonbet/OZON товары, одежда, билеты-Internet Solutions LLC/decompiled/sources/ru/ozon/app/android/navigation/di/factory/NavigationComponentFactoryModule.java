package ru.ozon.app.android.navigation.di.factory;

import OA.a;
import gi.C6740b;
import hi.InterfaceC6958a;
import ii.InterfaceC7081a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.navigation.di.DaggerNavigationComponent;
import ru.ozon.app.android.navigation.di.NavigationComponent;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.navigation.di.NavigationComponentDependencies;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\n\u001a\u001e\u0012\n\b\u0001\u0012\u00060\u0005j\u0002`\u00060\u0004j\u000e\u0012\n\b\u0001\u0012\u00060\u0005j\u0002`\u0006`\u0007H\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/navigation/di/factory/NavigationComponentFactoryModule;", "", "<init>", "()V", "Lii/a;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/di/provider/factory/ComponentFactory;", "bindNavigationComponentFactory$navigation_prodGoogleAllVendorsRelease", "()Lii/a;", "bindNavigationComponentFactory", "navigation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class NavigationComponentFactoryModule {
    /* JADX INFO: Access modifiers changed from: private */
    public static final NavigationComponentApi bindNavigationComponentFactory$lambda$0(C6740b componentStorage) {
        Intrinsics.checkNotNullParameter(componentStorage, "componentStorage");
        NavigationComponent.Factory factory = DaggerNavigationComponent.factory();
        if (NavigationComponentDependencies.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NavigationComponentDependencies is not DiComponent");
        }
        return factory.create((NavigationComponentDependencies) componentStorage.b(NavigationComponentDependencies.class));
    }

    @NotNull
    public final InterfaceC7081a<? extends InterfaceC6958a> bindNavigationComponentFactory$navigation_prodGoogleAllVendorsRelease() {
        return new a(0);
    }
}
