package ru.ozon.app.android.travel.feature.hotels.map.deeplink;

import Ak.b;
import GZ.j;
import IZ.a;
import android.content.Context;
import android.net.Uri;
import i10.h;
import i10.l;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import pZ.f;
import ru.ozon.app.android.composer.navigations.destinations.ComposerTabRequiredFragmentDestination;
import ru.ozon.app.android.composer.network.longPolling.LongPollingPageComposerInterceptor;
import ru.ozon.app.android.composer.universalscreen.view.BackgroundColorAttr;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v2.configurator.HotelsMapInfoConfigurator;
import ru.ozon.app.android.travel.pageconfigurator.fullScreen.FullScreenInsetsConfigurator;
import ru.ozon.app.android.travel.pageconfigurator.route.MapInfoDeeplinkRouteConfigurator;
import ru.ozon.uni.R$attr;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0012\u001a\u00020\u00062\n\u0010\u0011\u001a\u00060\u000fj\u0002`\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u00142\n\u0010\u0011\u001a\u00060\u000fj\u0002`\u0010H\u0016¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/deeplink/HotelsMapInfoDeeplinkHandler;", "LIZ/a;", "<init>", "()V", "Landroid/net/Uri;", "deeplink", "", "isHotelMapInfo", "(Landroid/net/Uri;)Z", "isTourMapInfo", "isOrderMap", "", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig;", "provideConfig", "(Ljava/lang/String;)Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig;", "LGZ/j;", "Lru/ozon/app/android/navigation/Route;", "route", "canHandle", "(LGZ/j;)Z", "Landroid/content/Context;", "context", "LpZ/f;", "getDestination", "(Landroid/content/Context;LGZ/j;)LpZ/f;", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class HotelsMapInfoDeeplinkHandler implements a {
    private final boolean isHotelMapInfo(Uri deeplink) {
        List<String> pathSegments = deeplink.getPathSegments();
        return Intrinsics.d(deeplink.getAuthority(), "travel") && pathSegments.size() == 2 && Intrinsics.d(pathSegments.get(0), "hotels") && Intrinsics.d(pathSegments.get(1), "map");
    }

    private final boolean isOrderMap(Uri deeplink) {
        List<String> pathSegments = deeplink.getPathSegments();
        return Intrinsics.d(deeplink.getAuthority(), "travel") && pathSegments.size() == 1 && Intrinsics.d(pathSegments.get(0), "hotelOrderMap");
    }

    private final boolean isTourMapInfo(Uri deeplink) {
        List<String> pathSegments = deeplink.getPathSegments();
        return Intrinsics.d(deeplink.getAuthority(), "travel") && pathSegments.size() == 3 && Intrinsics.d(pathSegments.get(0), "tours") && Intrinsics.d(pathSegments.get(1), "hotel") && Intrinsics.d(pathSegments.get(2), "map");
    }

    private final ComposerScreenConfig provideConfig(String deeplink) {
        int i11 = 14;
        String str = null;
        if (!h.t(deeplink, "serp=v3", false)) {
            Set h11 = e0.h(HotelsMapInfoConfigurator.class);
            h.c.a aVar = new h.c.a(deeplink, str, str, i11);
            int m673constructorimpl = BackgroundColorAttr.m673constructorimpl(R$attr.layerFloor1);
            Set h12 = e0.h("travel.hotelsMapInfo");
            return new ComposerScreenConfig(aVar, null, false, null, false, false, false, false, null, false, false, true, h11, e0.h(LongPollingPageComposerInterceptor.class), null, BackgroundColorAttr.m672boximpl(m673constructorimpl), false, new ComposerScreenConfig.AppearanceConfig(new l.a.b(0L, null, 3)), h12, null, true, false, null, null, 15288316, null);
        }
        h.c.a aVar2 = new h.c.a(deeplink, str, str, i11);
        int m673constructorimpl2 = BackgroundColorAttr.m673constructorimpl(R$attr.layerFloor1);
        ComposerScreenConfig.AppearanceConfig appearanceConfig = new ComposerScreenConfig.AppearanceConfig(new l.a.b(0L, null, 3));
        Set h13 = e0.h(LongPollingPageComposerInterceptor.class);
        Class[] elements = {MapInfoDeeplinkRouteConfigurator.class, FullScreenInsetsConfigurator.class};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new ComposerScreenConfig(aVar2, null, false, null, false, false, false, false, null, false, false, true, C7705l.j0(elements), h13, null, BackgroundColorAttr.m672boximpl(m673constructorimpl2), false, appearanceConfig, null, null, true, false, null, null, 15550460, null);
    }

    @Override // IZ.a
    public boolean canHandle(@NotNull j route) {
        Intrinsics.checkNotNullParameter(route, "route");
        return isHotelMapInfo(route.b()) || isTourMapInfo(route.b()) || isOrderMap(route.b());
    }

    @Override // IZ.a
    @NotNull
    public f getDestination(@NotNull Context context, @NotNull j route) {
        String d11 = b.d(context, "context", route, "route");
        return new ComposerTabRequiredFragmentDestination(provideConfig(d11), d11, 9001, false, null, false, 56, null);
    }
}
