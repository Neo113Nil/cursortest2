package ru.ozon.app.android.travel.feature.general.common.deeplink;

import C.J;
import CZ.g;
import GZ.j;
import IZ.c;
import OZ.e;
import android.content.Context;
import android.net.Uri;
import i10.h;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import pZ.f;
import ru.ozon.app.android.checkoutui.configurators.FirstRequestSetupConfigurator;
import ru.ozon.app.android.composer.navigations.destinations.ComposerFragmentDestination;
import ru.ozon.app.android.composer.network.longPolling.LongPollingPageComposerInterceptor;
import ru.ozon.app.android.composer.universalscreen.view.BackgroundColorAttr;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.navigation.interceptors.AuthDestinationInterceptor;
import ru.ozon.app.android.payment.ui.createorder.CreateAndPayConfigurator;
import ru.ozon.app.android.tabbar.R$id;
import ru.ozon.uni.R$attr;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u0010\u001a\u00020\u000f2\n\u0010\u000e\u001a\u00060\fj\u0002`\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00122\n\u0010\u000e\u001a\u00060\fj\u0002`\rH\u0016¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/deeplink/TravelOrderDetailsDeeplinkHandler;", "LIZ/c;", "Lru/ozon/app/android/navigation/interceptors/AuthDestinationInterceptor;", "authDestinationInterceptor", "<init>", "(Lru/ozon/app/android/navigation/interceptors/AuthDestinationInterceptor;)V", "", "deeplink", "Lru/ozon/app/android/composer/universalscreen/view/BackgroundColorAttr;", "getBackgroundColor-CG0atzM", "(Ljava/lang/String;)I", "getBackgroundColor", "LGZ/j;", "Lru/ozon/app/android/navigation/Route;", "route", "", "canHandle", "(LGZ/j;)Z", "Landroid/content/Context;", "context", "LpZ/f;", "getDestination", "(Landroid/content/Context;LGZ/j;)LpZ/f;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TravelOrderDetailsDeeplinkHandler extends c {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TravelOrderDetailsDeeplinkHandler(@NotNull AuthDestinationInterceptor authDestinationInterceptor) {
        super(authDestinationInterceptor, null, 2, null);
        Intrinsics.checkNotNullParameter(authDestinationInterceptor, "authDestinationInterceptor");
    }

    /* renamed from: getBackgroundColor-CG0atzM, reason: not valid java name */
    private final int m1182getBackgroundColorCG0atzM(String deeplink) {
        return BackgroundColorAttr.m673constructorimpl(h.t(deeplink, "hotelOrderDetails", false) ? R$attr.layerFloor0 : R$attr.layerFloor1);
    }

    @Override // IZ.a
    public boolean canHandle(@NotNull j route) {
        Intrinsics.checkNotNullParameter(route, "route");
        Uri b11 = route.b();
        List<String> pathSegments = b11.getPathSegments();
        String[] elements = {"orderDetails", "railwayOrderDetails", "hotelOrderDetails", "tourOrderDetails"};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return Intrinsics.d(b11.getAuthority(), "travel") && pathSegments.size() == 1 && C7705l.j0(elements).contains(C7714v.K(pathSegments));
    }

    @Override // IZ.a
    @NotNull
    public f getDestination(@NotNull Context context, @NotNull j route) {
        String a11 = J.a(context, "context", route, "route", "toString(...)");
        int i11 = R$id.menu_tickets;
        h.c.a aVar = new h.c.a(a11, (String) null, (String) null, 14);
        int m1182getBackgroundColorCG0atzM = m1182getBackgroundColorCG0atzM(a11);
        Set h11 = e0.h(CreateAndPayConfigurator.class);
        Class[] elements = {FirstRequestSetupConfigurator.class, LongPollingPageComposerInterceptor.class};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new g("travel", new e(i11, new ComposerFragmentDestination(new ComposerScreenConfig(aVar, null, false, null, false, false, false, false, null, false, false, false, h11, C7705l.j0(elements), null, BackgroundColorAttr.m672boximpl(m1182getBackgroundColorCG0atzM), false, null, null, null, false, false, null, null, 16732158, null), a11, null, true, false, null, true, false, null, 436, null)));
    }
}
