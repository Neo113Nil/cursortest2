package ru.ozon.app.android.courieronmap.di;

import IZ.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.courieronmap.deeplink.CourierOnMapDeeplinkHandler;
import ru.ozon.app.android.navigation.interceptors.AuthDestinationInterceptor;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/courieronmap/di/CourierOnMapNavigationModule;", "", "<init>", "()V", "Lru/ozon/app/android/navigation/interceptors/AuthDestinationInterceptor;", "authDestinationInterceptor", "LIZ/a;", "provideDeeplinkHandlersSet", "(Lru/ozon/app/android/navigation/interceptors/AuthDestinationInterceptor;)LIZ/a;", "courieronmap_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CourierOnMapNavigationModule {

    @NotNull
    public static final CourierOnMapNavigationModule INSTANCE = new CourierOnMapNavigationModule();

    private CourierOnMapNavigationModule() {
    }

    @NotNull
    public static final a provideDeeplinkHandlersSet(@NotNull AuthDestinationInterceptor authDestinationInterceptor) {
        Intrinsics.checkNotNullParameter(authDestinationInterceptor, "authDestinationInterceptor");
        return new CourierOnMapDeeplinkHandler(authDestinationInterceptor);
    }
}
