package ru.ozon.app.android.session.logout.di;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.di.Widget;
import ru.ozon.app.android.session.logout.core.LogoutConfig;
import ru.ozon.app.android.session.logout.presentation.LogoutViewMapper;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007¨\u0006\n"}, d2 = {"Lru/ozon/app/android/session/logout/di/LogoutModule;", "", "<init>", "()V", "provideWidget", "Lru/ozon/app/android/composer/di/Widget;", "logoutConfig", "Lru/ozon/app/android/session/logout/core/LogoutConfig;", "logoutViewMapper", "Lru/ozon/app/android/session/logout/presentation/LogoutViewMapper;", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class LogoutModule {

    @NotNull
    public static final LogoutModule INSTANCE = new LogoutModule();

    private LogoutModule() {
    }

    @NotNull
    public final Widget provideWidget(@NotNull LogoutConfig logoutConfig, @NotNull LogoutViewMapper logoutViewMapper) {
        Intrinsics.checkNotNullParameter(logoutConfig, "logoutConfig");
        Intrinsics.checkNotNullParameter(logoutViewMapper, "logoutViewMapper");
        return new Widget("csma", "logout", logoutConfig, new LogoutViewMapper[]{logoutViewMapper});
    }
}
