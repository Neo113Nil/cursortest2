package ru.ozon.app.android.app.launch.handlers.interceptors;

import android.content.Intent;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storage.startupArgs.StartupArgsService;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lru/ozon/app/android/app/launch/handlers/interceptors/StaticTimersArgumentResolver;", "Lru/ozon/app/android/app/launch/handlers/interceptors/AppLaunchArgumentResolver;", "startupArgsService", "Lru/ozon/app/android/storage/startupArgs/StartupArgsService;", "<init>", "(Lru/ozon/app/android/storage/startupArgs/StartupArgsService;)V", "resolveIntent", "", "intent", "Landroid/content/Intent;", "canResolve", "", "Companion", "app-launch-handlers_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class StaticTimersArgumentResolver implements AppLaunchArgumentResolver {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final StartupArgsService startupArgsService;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/app/launch/handlers/interceptors/StaticTimersArgumentResolver$Companion;", "", "<init>", "()V", "VALUE", "", "app-launch-handlers_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public StaticTimersArgumentResolver(@NotNull StartupArgsService startupArgsService) {
        Intrinsics.checkNotNullParameter(startupArgsService, "startupArgsService");
        this.startupArgsService = startupArgsService;
    }

    @Override // ru.ozon.app.android.app.launch.handlers.interceptors.AppLaunchArgumentResolver
    public boolean canResolve(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        return intent.hasExtra("STATIC_TIMERS");
    }

    @Override // ru.ozon.app.android.app.launch.handlers.interceptors.AppLaunchArgumentResolver
    public void resolveIntent(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        this.startupArgsService.setArgValue("STATIC_TIMERS", Intrinsics.d(intent.getStringExtra("STATIC_TIMERS"), "ENABLED"));
    }
}
