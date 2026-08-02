package ru.ozon.app.android.initializers;

import Jb.e;
import Jb.j;
import Pc.a;
import ru.ozon.app.android.initializers.nativePayment.NativePaymentInitializer;
import ru.ozon.app.android.startup.initializers.NamedActionInitializerProvider;

/* loaded from: classes6.dex */
public final class ActionInitializeModule_ProvideNativePaymentInitializerFactory implements e<NamedActionInitializerProvider> {
    public static NamedActionInitializerProvider provideNativePaymentInitializer(ActionInitializeModule actionInitializeModule, a<NativePaymentInitializer> aVar) {
        NamedActionInitializerProvider provideNativePaymentInitializer = actionInitializeModule.provideNativePaymentInitializer(aVar);
        j.d(provideNativePaymentInitializer);
        return provideNativePaymentInitializer;
    }
}
