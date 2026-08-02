package ru.ozon.app.android.app.launch.handlers.di.module;

import GZ.g;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.app.launch.handlers.interceptors.AppLaunchArgumentResolver;
import ru.ozon.app.android.app.launch.handlers.interceptors.AppLaunchArgumentsInterceptor;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b!\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lru/ozon/app/android/app/launch/handlers/di/module/AppLaunchHandlersModule;", "", "Companion", "app-launch-handlers_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class AppLaunchHandlersModule {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/app/launch/handlers/di/module/AppLaunchHandlersModule$Companion;", "", "<init>", "()V", "LGZ/g;", "router", "", "Lru/ozon/app/android/app/launch/handlers/interceptors/AppLaunchArgumentResolver;", "appLaunchArguments", "Lru/ozon/app/android/app/launch/handlers/interceptors/AppLaunchArgumentsInterceptor;", "provideAppLaunchArgumentsInterceptor", "(LGZ/g;Ljava/util/Set;)Lru/ozon/app/android/app/launch/handlers/interceptors/AppLaunchArgumentsInterceptor;", "app-launch-handlers_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final AppLaunchArgumentsInterceptor provideAppLaunchArgumentsInterceptor(@NotNull g router, @NotNull Set<AppLaunchArgumentResolver> appLaunchArguments) {
            Intrinsics.checkNotNullParameter(router, "router");
            Intrinsics.checkNotNullParameter(appLaunchArguments, "appLaunchArguments");
            return new AppLaunchArgumentsInterceptor(router, appLaunchArguments);
        }

        private Companion() {
        }
    }
}
