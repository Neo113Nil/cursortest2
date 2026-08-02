package ru.ozon.app.android.travel.feature.general.common.deeplink;

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
import ru.ozon.app.android.composer.navigations.destinations.ComposerFragmentDestination;
import ru.ozon.app.android.composer.network.longPolling.LongPollingPageComposerInterceptor;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.travel.pageconfigurator.searchForm.SearchFormRefreshPageConfigurator;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\f\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u001b\u0010\u0010\u001a\u00020\t2\n\u0010\u000f\u001a\u00060\rj\u0002`\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00122\n\u0010\u000f\u001a\u00060\rj\u0002`\u000eH\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/deeplink/TravelPromoNativeDeeplinkHandler;", "LIZ/a;", "LHZ/a;", "deeplinkHandlersCache", "<init>", "(LHZ/a;)V", "", "", "segments", "", "isPromoNativePage", "(Ljava/util/List;)Z", "isPromoS7Page", "LGZ/j;", "Lru/ozon/app/android/navigation/Route;", "route", "canHandle", "(LGZ/j;)Z", "Landroid/content/Context;", "context", "LpZ/f;", "getDestination", "(Landroid/content/Context;LGZ/j;)LpZ/f;", "LHZ/a;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TravelPromoNativeDeeplinkHandler implements a {

    @NotNull
    private final HZ.a deeplinkHandlersCache;

    public TravelPromoNativeDeeplinkHandler(@NotNull HZ.a deeplinkHandlersCache) {
        Intrinsics.checkNotNullParameter(deeplinkHandlersCache, "deeplinkHandlersCache");
        this.deeplinkHandlersCache = deeplinkHandlersCache;
    }

    private final boolean isPromoNativePage(List<String> segments) {
        return segments.size() > 2 && Intrinsics.d(segments.get(0), "promo") && Intrinsics.d(segments.get(1), "native");
    }

    private final boolean isPromoS7Page(List<String> segments) {
        return segments.size() == 2 && Intrinsics.d(segments.get(0), "promo") && Intrinsics.d(segments.get(1), "sale-s7");
    }

    @Override // IZ.a
    public boolean canHandle(@NotNull j route) {
        Intrinsics.checkNotNullParameter(route, "route");
        Uri b11 = route.b();
        List<String> pathSegments = b11.getPathSegments();
        if (!Intrinsics.d(b11.getAuthority(), "travel")) {
            return false;
        }
        Intrinsics.f(pathSegments);
        if (isPromoNativePage(pathSegments) || isPromoS7Page(pathSegments)) {
            return !this.deeplinkHandlersCache.c(route, this);
        }
        return false;
    }

    @Override // IZ.a
    @NotNull
    public f getDestination(@NotNull Context context, @NotNull j route) {
        String a11 = J.a(context, "context", route, "route", "toString(...)");
        return new ComposerFragmentDestination(new ComposerScreenConfig(new h.c.a(a11, (String) null, (String) null, 14), null, false, null, false, false, false, false, null, false, false, false, e0.h(SearchFormRefreshPageConfigurator.class), e0.h(LongPollingPageComposerInterceptor.class), null, null, false, null, null, null, false, false, null, null, 16764894, null), a11, null, false, false, null, false, false, null, 508, null);
    }
}
