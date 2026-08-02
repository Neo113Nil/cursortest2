package ru.ozon.app.android.checkoutorderdone.deeplink;

import C.J;
import De.C2860c;
import GZ.j;
import IZ.a;
import J.d;
import android.content.Context;
import i10.h;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.collections.e0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pZ.f;
import ru.ozon.app.android.checkoutorderdone.orderdone.configurators.OrderDoneRefreshCartConfigurator;
import ru.ozon.app.android.checkoutorderdone.orderdone.configurators.RefreshOnStartPageConfigurator;
import ru.ozon.app.android.checkoutorderdone.orderdone.configurators.deliveryc2c.DeliveryOrderDoneConfigurator;
import ru.ozon.app.android.composer.navigations.destinations.ComposerFlowDestination;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.payment.ui.configurators.AvailableNativePaymentInterceptor;
import ru.ozon.app.android.payment.ui.createorder.CreateAndPayConfigurator;
import ru.ozon.app.android.payment.ui.createservice.ClickOrderConfigurator;
import ru.ozon.uni.R$color;
import tZ.C9788c;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ#\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/checkoutorderdone/deeplink/OrderDoneV2DeeplinkHandler;", "LIZ/a;", "<init>", "()V", "LGZ/j;", "Lru/ozon/app/android/navigation/Route;", "route", "", "canHandle", "(LGZ/j;)Z", "Landroid/content/Context;", "context", "LpZ/f;", "getDestination", "(Landroid/content/Context;LGZ/j;)LpZ/f;", "Companion", "orderdone_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OrderDoneV2DeeplinkHandler implements a {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/ozon/app/android/checkoutorderdone/deeplink/OrderDoneV2DeeplinkHandler$Companion;", "", "<init>", "()V", "ORDER_DONE_PATH", "", "DELIVERY_ORDER_DONE_PATH", "PARAM_SHOW_TAB_BAR", "orderdone_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Override // IZ.a
    public boolean canHandle(@NotNull j route) {
        return d.d(route, "route", "my") && C2860c.c(route, "getPathSegments(...)").size() == 1 && (Co.a.e(route, 0, "order-done") || Co.a.e(route, 0, "delivery-order-done"));
    }

    @Override // IZ.a
    @NotNull
    public f getDestination(@NotNull Context context, @NotNull j route) {
        String a11 = J.a(context, "context", route, "route", "toString(...)");
        boolean booleanQueryParameter = route.b().getBooleanQueryParameter("showTabBar", false);
        String str = null;
        h.c.a aVar = new h.c.a(a11, str, str, 14);
        int i11 = R$color.layer_floor_0;
        boolean z11 = !booleanQueryParameter;
        Class[] elements = {CreateAndPayConfigurator.class, OrderDoneRefreshCartConfigurator.class, RefreshOnStartPageConfigurator.class, DeliveryOrderDoneConfigurator.class, ClickOrderConfigurator.class};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new C9788c(new ComposerFlowDestination(new ComposerScreenConfig(aVar, null, false, null, false, false, false, false, null, false, false, z11, C7705l.j0(elements), e0.h(AvailableNativePaymentInterceptor.class), Integer.valueOf(i11), null, false, null, null, null, false, false, null, null, 16746492, null), a11, null, null, false, 28, null));
    }
}
