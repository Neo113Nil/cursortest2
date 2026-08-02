package ru.ozon.app.android.session.logoutonall.di;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import retrofit2.Retrofit;
import ru.ozon.app.android.composer.di.Widget;
import ru.ozon.app.android.session.logoutonall.data.LogoutOnAllDevicesApi;
import ru.ozon.app.android.session.logoutonall.data.LogoutOnAllDevicesConfig;
import ru.ozon.app.android.session.logoutonall.presentation.LogoutOnAllDevicesViewMapper;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007J\u001d\u0010\n\u001a\n \f*\u0004\u0018\u00010\u000b0\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0007¢\u0006\u0002\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/session/logoutonall/di/LogoutOnAllDevicesWidgetModule;", "", "<init>", "()V", "provideLogoutOnAllDevicesWidget", "Lru/ozon/app/android/composer/di/Widget;", "config", "Lru/ozon/app/android/session/logoutonall/data/LogoutOnAllDevicesConfig;", "viewMapper", "Lru/ozon/app/android/session/logoutonall/presentation/LogoutOnAllDevicesViewMapper;", "provideApi", "Lru/ozon/app/android/session/logoutonall/data/LogoutOnAllDevicesApi;", "kotlin.jvm.PlatformType", "retrofit", "Lretrofit2/Retrofit;", "(Lretrofit2/Retrofit;)Lru/ozon/app/android/session/logoutonall/data/LogoutOnAllDevicesApi;", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class LogoutOnAllDevicesWidgetModule {
    public final LogoutOnAllDevicesApi provideApi(@NotNull Retrofit retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        return (LogoutOnAllDevicesApi) retrofit.create(LogoutOnAllDevicesApi.class);
    }

    @NotNull
    public final Widget provideLogoutOnAllDevicesWidget(@NotNull LogoutOnAllDevicesConfig config, @NotNull LogoutOnAllDevicesViewMapper viewMapper) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(viewMapper, "viewMapper");
        return new Widget("csma", "logoutOnAllMobile", config, new LogoutOnAllDevicesViewMapper[]{viewMapper});
    }
}
