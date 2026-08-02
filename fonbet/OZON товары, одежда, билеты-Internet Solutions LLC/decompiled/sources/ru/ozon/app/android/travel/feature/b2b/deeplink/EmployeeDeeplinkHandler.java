package ru.ozon.app.android.travel.feature.b2b.deeplink;

import GZ.j;
import IZ.c;
import android.content.Context;
import android.net.Uri;
import i10.h;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pZ.f;
import ru.ozon.app.android.composer.navigations.destinations.ComposerFragmentDestination;
import ru.ozon.app.android.composer.network.longPolling.LongPollingPageComposerInterceptor;
import ru.ozon.app.android.composer.universalscreen.view.BackgroundColorAttr;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.navigation.interceptors.AuthDestinationInterceptor;
import ru.ozon.app.android.travel.utils.destinationBehavior.behavior.FullScreenDestinationBehavior;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\fJ\u001b\u0010\u0014\u001a\u00020\u00132\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u001a\u001a\u00060\u0018j\u0002`\u00192\u0006\u0010\u0017\u001a\u00020\u00162\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u0011H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001c¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/travel/feature/b2b/deeplink/EmployeeDeeplinkHandler;", "LIZ/c;", "Lru/ozon/app/android/navigation/interceptors/AuthDestinationInterceptor;", "authDestinationInterceptor", "Lru/ozon/app/android/travel/utils/destinationBehavior/behavior/FullScreenDestinationBehavior;", "fullScreenDestinationBehavior", "<init>", "(Lru/ozon/app/android/navigation/interceptors/AuthDestinationInterceptor;Lru/ozon/app/android/travel/utils/destinationBehavior/behavior/FullScreenDestinationBehavior;)V", "Landroid/net/Uri;", "deeplink", "Lru/ozon/app/android/composer/universalscreen/view/BackgroundColorAttr;", "getBackgroundColor-CG0atzM", "(Landroid/net/Uri;)I", "getBackgroundColor", "", "getSoftInput", "LGZ/j;", "Lru/ozon/app/android/navigation/Route;", "route", "", "canHandle", "(LGZ/j;)Z", "Landroid/content/Context;", "context", "LpZ/f;", "Lru/ozon/app/android/navigation/newrouter/destinations/Destination;", "getDestination", "(Landroid/content/Context;LGZ/j;)LpZ/f;", "Lru/ozon/app/android/travel/utils/destinationBehavior/behavior/FullScreenDestinationBehavior;", "Companion", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class EmployeeDeeplinkHandler extends c {

    @NotNull
    private final FullScreenDestinationBehavior fullScreenDestinationBehavior;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/travel/feature/b2b/deeplink/EmployeeDeeplinkHandler$Companion;", "", "<init>", "()V", "KEY_BACKGROUND_COLOR", "", "KEY_IS_SOFT_INPUT_ENABLED", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmployeeDeeplinkHandler(@NotNull AuthDestinationInterceptor authDestinationInterceptor, @NotNull FullScreenDestinationBehavior fullScreenDestinationBehavior) {
        super(authDestinationInterceptor, null, 2, null);
        Intrinsics.checkNotNullParameter(authDestinationInterceptor, "authDestinationInterceptor");
        Intrinsics.checkNotNullParameter(fullScreenDestinationBehavior, "fullScreenDestinationBehavior");
        this.fullScreenDestinationBehavior = fullScreenDestinationBehavior;
    }

    /* renamed from: getBackgroundColor-CG0atzM, reason: not valid java name */
    private final int m1086getBackgroundColorCG0atzM(Uri deeplink) {
        return BackgroundColorAttr.m673constructorimpl(Intrinsics.d(deeplink.getQueryParameter("backgroundColor"), UniColors.LAYER_FLOOR_1.getToken()) ? R$attr.layerFloor1 : R$attr.layerFloor0);
    }

    private final int getSoftInput(Uri deeplink) {
        return Boolean.parseBoolean(deeplink.getQueryParameter("isSoftInputEnabled")) ? 16 : 0;
    }

    @Override // IZ.a
    public boolean canHandle(@NotNull j route) {
        Intrinsics.checkNotNullParameter(route, "route");
        Uri b11 = route.b();
        List<String> pathSegments = b11.getPathSegments();
        return pathSegments.size() == 2 && Intrinsics.d(b11.getAuthority(), "travel") && Intrinsics.d(pathSegments.get(0), "b2b") && (Intrinsics.d(pathSegments.get(1), "employees") || Intrinsics.d(pathSegments.get(1), "employee"));
    }

    @Override // IZ.a
    @NotNull
    public f getDestination(@NotNull Context context, @NotNull j route) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(route, "route");
        boolean d11 = Intrinsics.d(route.b().getPathSegments().get(1), "employees");
        String uri = route.b().toString();
        Intrinsics.f(uri);
        h.c.a aVar = new h.c.a(uri, (String) null, (String) null, 14);
        Set h11 = e0.h(LongPollingPageComposerInterceptor.class);
        return new ComposerFragmentDestination(new ComposerScreenConfig(aVar, null, false, null, false, false, d11, false, null, false, false, this.fullScreenDestinationBehavior.getIsFullScreen(route), null, h11, null, BackgroundColorAttr.m672boximpl(m1086getBackgroundColorCG0atzM(route.b())), false, null, null, Integer.valueOf(getSoftInput(route.b())), true, false, null, null, 15161246, null), uri, null, false, false, null, false, false, null, 508, null);
    }
}
