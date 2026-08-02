package ru.ozon.app.android.travel.feature.general.common.deeplink;

import C.J;
import GZ.j;
import IZ.a;
import android.content.Context;
import android.net.Uri;
import i10.h;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pZ.f;
import ru.ozon.app.android.composer.navigations.destinations.BottomSheetComposerFragmentDestination;
import ru.ozon.app.android.composer.network.longPolling.LongPollingPageComposerInterceptor;
import ru.ozon.app.android.composer.universalscreen.view.BackgroundColorAttr;
import ru.ozon.app.android.composer.universalscreen.view.ComposerFragment;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.navigation.FlowTag;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.component.sheet.SheetSoftInputMode;
import uZ.C9992d;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\n\u001a\u00020\t2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\f\u001a\u00020\t2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u001b\u0010\u0010\u001a\u00020\t2\n\u0010\u000f\u001a\u00060\rj\u0002`\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00122\n\u0010\u000f\u001a\u00060\rj\u0002`\u000eH\u0016¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/deeplink/TravelSearchPointsDeeplinkHandler;", "LIZ/a;", "<init>", "()V", "", "", "segments", "", "expectedSegments", "", "isCommonSearchPointsDeeplink", "(Ljava/util/List;Ljava/util/Set;)Z", "isModalSearchPointsDeeplink", "LGZ/j;", "Lru/ozon/app/android/navigation/Route;", "route", "canHandle", "(LGZ/j;)Z", "Landroid/content/Context;", "context", "LpZ/f;", "getDestination", "(Landroid/content/Context;LGZ/j;)LpZ/f;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TravelSearchPointsDeeplinkHandler implements a {
    private final boolean isCommonSearchPointsDeeplink(List<String> segments, Set<String> expectedSegments) {
        return segments.size() == 1 && expectedSegments.contains(segments.get(0));
    }

    private final boolean isModalSearchPointsDeeplink(List<String> segments, Set<String> expectedSegments) {
        return segments.size() == 2 && Intrinsics.d(segments.get(0), "modal") && expectedSegments.contains(segments.get(1));
    }

    @Override // IZ.a
    public boolean canHandle(@NotNull j route) {
        Intrinsics.checkNotNullParameter(route, "route");
        Uri b11 = route.b();
        List<String> pathSegments = b11.getPathSegments();
        String[] elements = {"searchPoints", "tourSearchPoints", "hotelSearchPoints", "hotelsSearchPoints", "railwaySearchPoints", "hotelsSearchPointsOnSerp", "aviaSearchPoints"};
        Intrinsics.checkNotNullParameter(elements, "elements");
        Set<String> j02 = C7705l.j0(elements);
        if (!Intrinsics.d(b11.getAuthority(), "travel")) {
            return false;
        }
        Intrinsics.f(pathSegments);
        return isCommonSearchPointsDeeplink(pathSegments, j02) || isModalSearchPointsDeeplink(pathSegments, j02);
    }

    @Override // IZ.a
    @NotNull
    public f getDestination(@NotNull Context context, @NotNull j route) {
        String a11 = J.a(context, "context", route, "route", "toString(...)");
        return new BottomSheetComposerFragmentDestination(a11, new ComposerScreenConfig(new h.c.a(a11, (String) null, (String) null, 14), null, false, new ComposerScreenConfig.BottomSheetConfig(ComposerFragment.DisplayMode.BOTTOM_SHEET_FULL, true, false, SheetSoftInputMode.ADJUST_RESIZE, 0, false, false, false, false, false, false, 2036, null), false, false, false, false, null, false, false, false, null, e0.h(LongPollingPageComposerInterceptor.class), null, BackgroundColorAttr.m672boximpl(BackgroundColorAttr.m673constructorimpl(R$attr.layerFloor1)), false, null, null, null, true, false, null, null, 15687670, null), new C9992d.b.C2202b(FlowTag.TRAVEL_SEARCH_FORM), null, 9001, null, 40, null);
    }
}
