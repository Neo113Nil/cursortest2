package ru.ozon.app.android.travel.feature.hotels.deeplink;

import Ak.C2436a;
import GZ.j;
import IZ.a;
import android.content.Context;
import android.net.Uri;
import i10.h;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pZ.f;
import ru.ozon.app.android.composer.navigations.destinations.ComposerFragmentDestination;
import ru.ozon.app.android.composer.navigations.destinations.ComposerTabFragmentDestination;
import ru.ozon.app.android.composer.network.longPolling.LongPollingPageComposerInterceptor;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.navigation.LinkGenerator;
import ru.ozon.app.android.navigation.miniapp.MiniAppExtKt;
import ru.ozon.app.android.tabbar.R$id;
import ru.ozon.app.android.tabbar.data.TabConfigDTO;
import ru.ozon.app.android.tabbar.data.TabConfigResponse;
import ru.ozon.app.android.tabbar.data.local.TabConfigCache;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\f\u001a\u00020\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u000e\u001a\u00020\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u001b\u0010\u0012\u001a\u00020\u00062\n\u0010\u0011\u001a\u00060\u000fj\u0002`\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u00142\n\u0010\u0011\u001a\u00060\u000fj\u0002`\u0010H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/deeplink/TravelFavoritesDeeplinkHandler;", "LIZ/a;", "Lru/ozon/app/android/tabbar/data/local/TabConfigCache;", "tabConfigCache", "<init>", "(Lru/ozon/app/android/tabbar/data/local/TabConfigCache;)V", "", "checkTabFavoritePresence", "()Z", "", "", "segments", "isFavoritesLink", "(Ljava/util/List;)Z", "isFavoritesAviaLink", "LGZ/j;", "Lru/ozon/app/android/navigation/Route;", "route", "canHandle", "(LGZ/j;)Z", "Landroid/content/Context;", "context", "LpZ/f;", "getDestination", "(Landroid/content/Context;LGZ/j;)LpZ/f;", "Lru/ozon/app/android/tabbar/data/local/TabConfigCache;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TravelFavoritesDeeplinkHandler implements a {

    @NotNull
    private final TabConfigCache tabConfigCache;

    public TravelFavoritesDeeplinkHandler(@NotNull TabConfigCache tabConfigCache) {
        Intrinsics.checkNotNullParameter(tabConfigCache, "tabConfigCache");
        this.tabConfigCache = tabConfigCache;
    }

    private final boolean checkTabFavoritePresence() {
        List<TabConfigDTO> tabs;
        String builder = MiniAppExtKt.appendTravel(LinkGenerator.INSTANCE.travelFavorites()).toString();
        Intrinsics.checkNotNullExpressionValue(builder, "toString(...)");
        TabConfigResponse config = this.tabConfigCache.getConfig("travel");
        Object obj = null;
        if (config != null && (tabs = config.getTabs()) != null) {
            Iterator<T> it = tabs.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (Intrinsics.d(((TabConfigDTO) next).getUrl(), builder)) {
                    obj = next;
                    break;
                }
            }
            obj = (TabConfigDTO) obj;
        }
        return obj != null;
    }

    private final boolean isFavoritesAviaLink(List<String> segments) {
        return segments.size() == 2 && Intrinsics.d(segments.get(0), "favorites") && Intrinsics.d(segments.get(1), "avia");
    }

    private final boolean isFavoritesLink(List<String> segments) {
        return segments.size() == 1 && Intrinsics.d(C7714v.K(segments), "favorites");
    }

    @Override // IZ.a
    public boolean canHandle(@NotNull j route) {
        Intrinsics.checkNotNullParameter(route, "route");
        Uri b11 = route.b();
        if (!Intrinsics.d(b11.getAuthority(), "travel")) {
            return false;
        }
        List<String> pathSegments = b11.getPathSegments();
        Intrinsics.checkNotNullExpressionValue(pathSegments, "getPathSegments(...)");
        if (isFavoritesLink(pathSegments)) {
            return true;
        }
        List<String> pathSegments2 = b11.getPathSegments();
        Intrinsics.checkNotNullExpressionValue(pathSegments2, "getPathSegments(...)");
        return isFavoritesAviaLink(pathSegments2);
    }

    @Override // IZ.a
    @NotNull
    public f getDestination(@NotNull Context context, @NotNull j route) {
        String a11 = C2436a.a(context, "context", route, "route");
        Object obj = route.e().get("closeButton");
        String str = obj instanceof String ? (String) obj : null;
        boolean z11 = str != null && Boolean.parseBoolean(str);
        if (checkTabFavoritePresence()) {
            Intrinsics.f(a11);
            return new ComposerTabFragmentDestination(new ComposerScreenConfig(new h.c.a(a11, (String) null, (String) null, 14), new ComposerScreenConfig.ToolbarConfig(new ComposerScreenConfig.ToolbarConfig.DefaultState(0, z11, null, null, null, null, 61, null), 0, 2, null), false, null, false, false, false, false, null, false, false, false, null, e0.h(LongPollingPageComposerInterceptor.class), null, null, false, null, null, null, false, false, null, null, 16769020, null), a11, R$id.menu_favorites, null, false, !z11, null, 88, null);
        }
        Intrinsics.f(a11);
        return new ComposerFragmentDestination(new ComposerScreenConfig(new h.c.a(a11, (String) null, (String) null, 14), null, false, null, false, false, false, false, null, false, false, false, null, e0.h(LongPollingPageComposerInterceptor.class), null, null, false, null, null, null, false, false, null, null, 16769022, null), a11, null, false, false, null, false, false, null, 508, null);
    }
}
