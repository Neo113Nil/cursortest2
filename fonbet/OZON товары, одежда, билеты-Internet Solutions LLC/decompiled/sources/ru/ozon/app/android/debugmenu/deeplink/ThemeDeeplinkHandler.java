package ru.ozon.app.android.debugmenu.deeplink;

import GZ.j;
import Hg0.a;
import IZ.c;
import android.content.Context;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pZ.f;
import ru.ozon.app.android.navigation.interceptors.AtMostQaUserDestinationInterceptor;
import ru.ozon.app.android.platform.theme.DarkThemeManager;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u0004\u0018\u00010\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u0010\u001a\u00020\u000f2\n\u0010\u000e\u001a\u00060\fj\u0002`\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0013\u001a\u00020\u00122\n\u0010\u000e\u001a\u00060\fj\u0002`\rH\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/debugmenu/deeplink/ThemeDeeplinkHandler;", "LIZ/c;", "Lru/ozon/app/android/navigation/interceptors/AtMostQaUserDestinationInterceptor;", "atMostQaUserDestinationInterceptor", "Lru/ozon/app/android/platform/theme/DarkThemeManager;", "darkThemeManager", "<init>", "(Lru/ozon/app/android/navigation/interceptors/AtMostQaUserDestinationInterceptor;Lru/ozon/app/android/platform/theme/DarkThemeManager;)V", "", "Lru/ozon/app/android/platform/theme/DarkThemeManager$Status;", "asThemeStatus", "(Ljava/lang/String;)Lru/ozon/app/android/platform/theme/DarkThemeManager$Status;", "LGZ/j;", "Lru/ozon/app/android/navigation/Route;", "route", "", "canHandle", "(LGZ/j;)Z", "Landroid/content/Context;", "context", "LpZ/f;", "getDestination", "(Landroid/content/Context;LGZ/j;)LpZ/f;", "Lru/ozon/app/android/platform/theme/DarkThemeManager;", "Companion", "debugmenu_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ThemeDeeplinkHandler extends c {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final DarkThemeManager darkThemeManager;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/ozon/app/android/debugmenu/deeplink/ThemeDeeplinkHandler$Companion;", "", "<init>", "()V", "LIGHT_VALUE", "", "DARK_VALUE", "SYSTEM_VALUE", "debugmenu_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThemeDeeplinkHandler(@NotNull AtMostQaUserDestinationInterceptor atMostQaUserDestinationInterceptor, @NotNull DarkThemeManager darkThemeManager) {
        super(atMostQaUserDestinationInterceptor, null, 2, null);
        Intrinsics.checkNotNullParameter(atMostQaUserDestinationInterceptor, "atMostQaUserDestinationInterceptor");
        Intrinsics.checkNotNullParameter(darkThemeManager, "darkThemeManager");
        this.darkThemeManager = darkThemeManager;
        String c11 = a.c("debug.ozon.theme", "");
        DarkThemeManager.Status asThemeStatus = c11 != null ? asThemeStatus(c11) : null;
        if (asThemeStatus != null) {
            darkThemeManager.setStatus(asThemeStatus);
        }
    }

    private final DarkThemeManager.Status asThemeStatus(String str) {
        int hashCode = str.hashCode();
        if (hashCode == -887328209) {
            if (str.equals("system")) {
                return DarkThemeManager.Status.BY_SYSTEM;
            }
            return null;
        }
        if (hashCode == 3075958) {
            if (str.equals("dark")) {
                return DarkThemeManager.Status.NIGHT_THEME;
            }
            return null;
        }
        if (hashCode == 102970646 && str.equals("light")) {
            return DarkThemeManager.Status.DAY_THEME;
        }
        return null;
    }

    @Override // IZ.a
    public boolean canHandle(@NotNull j route) {
        Intrinsics.checkNotNullParameter(route, "route");
        String queryParameter = route.b().getQueryParameter(AppMeasurementSdk.ConditionalUserProperty.VALUE);
        if (Intrinsics.d(route.b().getScheme(), "ozontech") && Lh.a.f(route, "theme")) {
            return Intrinsics.d(queryParameter, "light") || Intrinsics.d(queryParameter, "dark") || Intrinsics.d(queryParameter, "system");
        }
        return false;
    }

    @Override // IZ.a
    public f getDestination(@NotNull Context context, @NotNull j route) {
        DarkThemeManager.Status asThemeStatus;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(route, "route");
        String queryParameter = route.b().getQueryParameter(AppMeasurementSdk.ConditionalUserProperty.VALUE);
        if (queryParameter != null && (asThemeStatus = asThemeStatus(queryParameter)) != null) {
            this.darkThemeManager.setStatus(asThemeStatus);
        }
        return null;
    }
}
