package ru.ozon.app.android.travel.feature.general.common.deeplink;

import C.J;
import CZ.g;
import GZ.j;
import IZ.a;
import OZ.e;
import android.content.Context;
import android.net.Uri;
import i10.h;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pZ.f;
import ru.ozon.app.android.composer.navigations.destinations.ComposerFragmentDestination;
import ru.ozon.app.android.composer.network.longPolling.LongPollingPageComposerInterceptor;
import ru.ozon.app.android.composer.universalscreen.view.BackgroundColorAttr;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.tabbar.R$id;
import ru.ozon.app.android.travel.pageconfigurator.anchorRefresh.TravelAnchorRefreshConfigurator;
import ru.ozon.app.android.travel.pageconfigurator.preCreation.configurator.TravelMainPreCreateConfigurator;
import ru.ozon.app.android.travel.pageconfigurator.searchForm.SearchFormRefreshPageConfigurator;
import ru.ozon.uni.R$attr;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\t\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000e\u001a\u00020\r2\n\u0010\f\u001a\u00060\nj\u0002`\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00102\n\u0010\f\u001a\u00060\nj\u0002`\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/deeplink/TravelMainDeeplinkHandler;", "LIZ/a;", "<init>", "()V", "", "segment", "Lru/ozon/app/android/composer/universalscreen/view/BackgroundColorAttr;", "getPageBackgroundColor-CG0atzM", "(Ljava/lang/String;)I", "getPageBackgroundColor", "LGZ/j;", "Lru/ozon/app/android/navigation/Route;", "route", "", "canHandle", "(LGZ/j;)Z", "Landroid/content/Context;", "context", "LpZ/f;", "getDestination", "(Landroid/content/Context;LGZ/j;)LpZ/f;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TravelMainDeeplinkHandler implements a {
    /* renamed from: getPageBackgroundColor-CG0atzM, reason: not valid java name */
    private final int m1180getPageBackgroundColorCG0atzM(String segment) {
        return BackgroundColorAttr.m673constructorimpl((Intrinsics.d(segment, "mainGeneral") || Intrinsics.d(segment, "mainFlight")) ? R$attr.layerFloor1 : R$attr.layerFloor0);
    }

    @Override // IZ.a
    public boolean canHandle(@NotNull j route) {
        Intrinsics.checkNotNullParameter(route, "route");
        Uri b11 = route.b();
        List<String> pathSegments = b11.getPathSegments();
        String[] elements = {"main", "mainRailway", "mainTour", "mainGeneral", "mainFlight"};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return Intrinsics.d(b11.getAuthority(), "travel") && pathSegments.size() == 1 && C7705l.j0(elements).contains(pathSegments.get(0));
    }

    @Override // IZ.a
    @NotNull
    public f getDestination(@NotNull Context context, @NotNull j route) {
        String a11 = J.a(context, "context", route, "route", "toString(...)");
        int i11 = R$id.menu_travel;
        h.c.a aVar = new h.c.a(a11, (String) null, (String) null, 14);
        List<String> pathSegments = route.b().getPathSegments();
        Intrinsics.checkNotNullExpressionValue(pathSegments, "getPathSegments(...)");
        int m1180getPageBackgroundColorCG0atzM = m1180getPageBackgroundColorCG0atzM((String) C7714v.M(pathSegments));
        ComposerScreenConfig.ToolbarConfig toolbarConfig = new ComposerScreenConfig.ToolbarConfig(new ComposerScreenConfig.ToolbarConfig.DefaultState(0, false, null, null, null, null, 61, null), 0, 2, null);
        Class[] elements = {TravelAnchorRefreshConfigurator.class, SearchFormRefreshPageConfigurator.class, TravelMainPreCreateConfigurator.class};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new g("travel", new e(i11, new ComposerFragmentDestination(new ComposerScreenConfig(aVar, toolbarConfig, false, null, false, false, false, false, null, false, false, false, C7705l.j0(elements), e0.h(LongPollingPageComposerInterceptor.class), null, BackgroundColorAttr.m672boximpl(m1180getPageBackgroundColorCG0atzM), false, null, null, null, true, false, null, null, 15683548, null), a11, null, true, false, null, true, false, null, 436, null)));
    }
}
