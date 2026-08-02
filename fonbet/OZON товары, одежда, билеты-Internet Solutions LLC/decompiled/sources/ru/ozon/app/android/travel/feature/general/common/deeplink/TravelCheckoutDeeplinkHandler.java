package ru.ozon.app.android.travel.feature.general.common.deeplink;

import Ak.C2436a;
import CZ.g;
import GZ.j;
import IZ.c;
import android.content.Context;
import android.net.Uri;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import i10.h;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pZ.f;
import ru.ozon.app.android.checkoutui.configurators.FirstRequestSetupConfigurator;
import ru.ozon.app.android.composer.navigations.destinations.ComposerFragmentDestination;
import ru.ozon.app.android.composer.network.longPolling.LongPollingPageComposerInterceptor;
import ru.ozon.app.android.composer.universalscreen.view.BackgroundColorAttr;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.navigation.interceptors.AuthDestinationInterceptor;
import ru.ozon.app.android.payment.ui.createorder.CreateAndPayConfigurator;
import ru.ozon.app.android.travel.feature.general.common.shared.checkout.CheckoutRefreshPageConfigurator;
import ru.ozon.uni.R$attr;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\f\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u001b\u0010\u0010\u001a\u00020\t2\n\u0010\u000f\u001a\u00060\rj\u0002`\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00122\n\u0010\u000f\u001a\u00060\rj\u0002`\u000eH\u0016¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/deeplink/TravelCheckoutDeeplinkHandler;", "LIZ/c;", "Lru/ozon/app/android/navigation/interceptors/AuthDestinationInterceptor;", "authDestinationInterceptor", "<init>", "(Lru/ozon/app/android/navigation/interceptors/AuthDestinationInterceptor;)V", "", "", "pathSegments", "", "isCommonCheckoutPath", "(Ljava/util/List;)Z", "isSpecificCheckoutPath", "LGZ/j;", "Lru/ozon/app/android/navigation/Route;", "route", "canHandle", "(LGZ/j;)Z", "Landroid/content/Context;", "context", "LpZ/f;", "getDestination", "(Landroid/content/Context;LGZ/j;)LpZ/f;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TravelCheckoutDeeplinkHandler extends c {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TravelCheckoutDeeplinkHandler(@NotNull AuthDestinationInterceptor authDestinationInterceptor) {
        super(authDestinationInterceptor, null, 2, null);
        Intrinsics.checkNotNullParameter(authDestinationInterceptor, "authDestinationInterceptor");
    }

    private final boolean isCommonCheckoutPath(List<String> pathSegments) {
        String[] elements = {ProductAction.ACTION_CHECKOUT, "lite-checkout"};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return pathSegments.size() == 1 && C7705l.j0(elements).contains(pathSegments.get(0));
    }

    private final boolean isSpecificCheckoutPath(List<String> pathSegments) {
        String[] elements = {"avia", "railway", "hotels", "tours"};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return pathSegments.size() == 2 && C7705l.j0(elements).contains(pathSegments.get(0)) && Intrinsics.d(pathSegments.get(1), ProductAction.ACTION_CHECKOUT);
    }

    @Override // IZ.a
    public boolean canHandle(@NotNull j route) {
        Intrinsics.checkNotNullParameter(route, "route");
        Uri b11 = route.b();
        if (!Intrinsics.d(b11.getAuthority(), "travel")) {
            return false;
        }
        List<String> pathSegments = b11.getPathSegments();
        Intrinsics.f(pathSegments);
        return isCommonCheckoutPath(pathSegments) || isSpecificCheckoutPath(pathSegments);
    }

    @Override // IZ.a
    @NotNull
    public f getDestination(@NotNull Context context, @NotNull j route) {
        String a11 = C2436a.a(context, "context", route, "route");
        Intrinsics.f(a11);
        h.c.a aVar = new h.c.a(a11, (String) null, (String) null, 14);
        int m673constructorimpl = BackgroundColorAttr.m673constructorimpl(R$attr.layerFloor0);
        Class[] elements = {FirstRequestSetupConfigurator.class, LongPollingPageComposerInterceptor.class};
        Intrinsics.checkNotNullParameter(elements, "elements");
        Set j02 = C7705l.j0(elements);
        Class[] elements2 = {CreateAndPayConfigurator.class, CheckoutRefreshPageConfigurator.class};
        Intrinsics.checkNotNullParameter(elements2, "elements");
        return new g("travel", new ComposerFragmentDestination(new ComposerScreenConfig(aVar, null, false, null, false, false, false, false, null, false, false, true, C7705l.j0(elements2), j02, null, BackgroundColorAttr.m672boximpl(m673constructorimpl), false, null, null, null, false, false, null, null, 16730110, null), a11, null, false, false, null, false, false, null, 508, null));
    }
}
