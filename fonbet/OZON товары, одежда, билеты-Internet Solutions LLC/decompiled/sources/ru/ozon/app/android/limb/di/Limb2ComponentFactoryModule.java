package ru.ozon.app.android.limb.di;

import Xy.C4893a;
import gi.C6740b;
import hi.InterfaceC6958a;
import ii.InterfaceC7081a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.limb.DaggerLimb2Component;
import ru.ozon.app.android.limb.Limb2Component;
import ru.ozon.app.android.limb.Limb2ComponentApi;
import ru.ozon.app.android.limb.Limb2ComponentDependencies;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\n\u001a\u001e\u0012\n\b\u0001\u0012\u00060\u0005j\u0002`\u00060\u0004j\u000e\u0012\n\b\u0001\u0012\u00060\u0005j\u0002`\u0006`\u0007H\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/limb/di/Limb2ComponentFactoryModule;", "", "<init>", "()V", "Lii/a;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/di/provider/factory/ComponentFactory;", "provideLimb2ComponentFactory$limb_prodGoogleAllVendorsRelease", "()Lii/a;", "provideLimb2ComponentFactory", "limb_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Limb2ComponentFactoryModule {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Limb2ComponentApi provideLimb2ComponentFactory$lambda$0(C6740b componentStorage) {
        Intrinsics.checkNotNullParameter(componentStorage, "componentStorage");
        Limb2Component.Factory factory = DaggerLimb2Component.factory();
        if (ContextComponentDependencies.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component ContextComponentDependencies is not DiComponent");
        }
        ContextComponentDependencies contextComponentDependencies = (ContextComponentDependencies) componentStorage.b(ContextComponentDependencies.class);
        if (Limb2ComponentDependencies.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component Limb2ComponentDependencies is not DiComponent");
        }
        return factory.create(contextComponentDependencies, (Limb2ComponentDependencies) componentStorage.b(Limb2ComponentDependencies.class));
    }

    @NotNull
    public final InterfaceC7081a<? extends InterfaceC6958a> provideLimb2ComponentFactory$limb_prodGoogleAllVendorsRelease() {
        return new C4893a();
    }
}
