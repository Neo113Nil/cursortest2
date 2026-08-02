package ru.ozon.app.android.travel.feature.b2b.deeplink;

import C.J;
import GZ.j;
import IZ.a;
import android.content.Context;
import android.net.Uri;
import i10.h;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pZ.f;
import ru.ozon.app.android.composer.navigations.destinations.ComposerTabFragmentDestination;
import ru.ozon.app.android.composer.network.longPolling.LongPollingPageComposerInterceptor;
import ru.ozon.app.android.composer.universalscreen.view.BackgroundColorAttr;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.tabbar.R$id;
import ru.ozon.app.android.travel.utils.destinationBehavior.behavior.FullScreenDestinationBehavior;
import ru.ozon.uni.R$attr;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u0010\u001a\u00020\n2\n\u0010\u000f\u001a\u00060\rj\u0002`\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00122\n\u0010\u000f\u001a\u00060\rj\u0002`\u000eH\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/travel/feature/b2b/deeplink/TravelCommonB2BDeeplinkHandler;", "LIZ/a;", "Lru/ozon/app/android/travel/utils/destinationBehavior/behavior/FullScreenDestinationBehavior;", "fullScreenBehavior", "LHZ/a;", "deeplinkHandlersCache", "<init>", "(Lru/ozon/app/android/travel/utils/destinationBehavior/behavior/FullScreenDestinationBehavior;LHZ/a;)V", "Landroid/net/Uri;", "deeplink", "", "isNotMain", "(Landroid/net/Uri;)Z", "LGZ/j;", "Lru/ozon/app/android/navigation/Route;", "route", "canHandle", "(LGZ/j;)Z", "Landroid/content/Context;", "context", "LpZ/f;", "getDestination", "(Landroid/content/Context;LGZ/j;)LpZ/f;", "Lru/ozon/app/android/travel/utils/destinationBehavior/behavior/FullScreenDestinationBehavior;", "LHZ/a;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TravelCommonB2BDeeplinkHandler implements a {

    @NotNull
    private final HZ.a deeplinkHandlersCache;

    @NotNull
    private final FullScreenDestinationBehavior fullScreenBehavior;

    public TravelCommonB2BDeeplinkHandler(@NotNull FullScreenDestinationBehavior fullScreenBehavior, @NotNull HZ.a deeplinkHandlersCache) {
        Intrinsics.checkNotNullParameter(fullScreenBehavior, "fullScreenBehavior");
        Intrinsics.checkNotNullParameter(deeplinkHandlersCache, "deeplinkHandlersCache");
        this.fullScreenBehavior = fullScreenBehavior;
        this.deeplinkHandlersCache = deeplinkHandlersCache;
    }

    private final boolean isNotMain(Uri deeplink) {
        List<String> pathSegments = deeplink.getPathSegments();
        return (pathSegments.size() == 2 && Intrinsics.d(pathSegments.get(1), "main")) ? false : true;
    }

    @Override // IZ.a
    public boolean canHandle(@NotNull j route) {
        Intrinsics.checkNotNullParameter(route, "route");
        Uri b11 = route.b();
        List<String> pathSegments = b11.getPathSegments();
        if (Intrinsics.d(b11.getAuthority(), "travel")) {
            Intrinsics.f(pathSegments);
            if (!pathSegments.isEmpty() && Intrinsics.d(pathSegments.get(0), "b2b")) {
                return !this.deeplinkHandlersCache.c(route, this);
            }
        }
        return false;
    }

    @Override // IZ.a
    @NotNull
    public f getDestination(@NotNull Context context, @NotNull j route) {
        String a11 = J.a(context, "context", route, "route", "toString(...)");
        boolean isFullScreen = this.fullScreenBehavior.getIsFullScreen(route);
        return new ComposerTabFragmentDestination(new ComposerScreenConfig(new h.c.a(a11, (String) null, (String) null, 14), new ComposerScreenConfig.ToolbarConfig(new ComposerScreenConfig.ToolbarConfig.DefaultState(0, isNotMain(route.b()), null, null, null, null, 61, null), 0, 2, null), false, null, false, false, false, false, null, false, false, isFullScreen, null, e0.h(LongPollingPageComposerInterceptor.class), null, BackgroundColorAttr.m672boximpl(BackgroundColorAttr.m673constructorimpl(R$attr.layerFloor0)), false, null, null, null, true, false, null, null, 15685628, null), a11, R$id.menu_travel, null, false, false, null, 120, null);
    }
}
