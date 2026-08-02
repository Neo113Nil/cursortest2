package ru.ozon.app.android.debugmenu.deeplink;

import GZ.j;
import IZ.c;
import android.content.Context;
import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pZ.C8882c;
import pZ.f;
import ru.ozon.app.android.navigation.interceptors.AtMostQaUserDestinationInterceptor;
import ru.ozon.app.android.storage.debug.DebugToolsService;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\f\u001a\u00020\u000b2\n\u0010\n\u001a\u00060\bj\u0002`\tH\u0016¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e2\n\u0010\n\u001a\u00060\bj\u0002`\tH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/debugmenu/deeplink/ResolveOverrideDeeplinkHandler;", "LIZ/c;", "Lru/ozon/app/android/storage/debug/DebugToolsService;", "debugToolsService", "Lru/ozon/app/android/navigation/interceptors/AtMostQaUserDestinationInterceptor;", "atMostQaUserDestinationInterceptor", "<init>", "(Lru/ozon/app/android/storage/debug/DebugToolsService;Lru/ozon/app/android/navigation/interceptors/AtMostQaUserDestinationInterceptor;)V", "LGZ/j;", "Lru/ozon/app/android/navigation/Route;", "route", "", "canHandle", "(LGZ/j;)Z", "Landroid/content/Context;", "context", "LpZ/f;", "getDestination", "(Landroid/content/Context;LGZ/j;)LpZ/f;", "Lru/ozon/app/android/storage/debug/DebugToolsService;", "Companion", "debugmenu_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ResolveOverrideDeeplinkHandler extends c {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final DebugToolsService debugToolsService;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/ozon/app/android/debugmenu/deeplink/ResolveOverrideDeeplinkHandler$Companion;", "", "<init>", "()V", "AUTHORITY", "", "PARAM_CITY_IP", "HEADER_TEMPLATE", "debugmenu_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResolveOverrideDeeplinkHandler(@NotNull DebugToolsService debugToolsService, @NotNull AtMostQaUserDestinationInterceptor atMostQaUserDestinationInterceptor) {
        super(atMostQaUserDestinationInterceptor, null, 2, null);
        Intrinsics.checkNotNullParameter(debugToolsService, "debugToolsService");
        Intrinsics.checkNotNullParameter(atMostQaUserDestinationInterceptor, "atMostQaUserDestinationInterceptor");
        this.debugToolsService = debugToolsService;
    }

    @Override // IZ.a
    public boolean canHandle(@NotNull j route) {
        Intrinsics.checkNotNullParameter(route, "route");
        Uri b11 = route.b();
        return Intrinsics.d(b11.getScheme(), "ozontech") && Intrinsics.d(b11.getAuthority(), "setAddress");
    }

    @Override // IZ.a
    @NotNull
    public f getDestination(@NotNull Context context, @NotNull j route) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(route, "route");
        return new C8882c(new ResolveOverrideDeeplinkHandler$getDestination$1(route, this, null));
    }
}
