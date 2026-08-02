package ru.ozon.app.android.account.orders.deeplink;

import C.J;
import De.C2860c;
import GZ.j;
import IZ.c;
import android.content.Context;
import android.net.Uri;
import i10.h;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pZ.f;
import ru.ozon.app.android.composer.navigations.destinations.ComposerTabRequiredFragmentDestination;
import ru.ozon.app.android.composer.universalscreen.view.BackgroundColorAttr;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.cscore.actionButton.configurators.OrderChangeActionButtonsConfigurator;
import ru.ozon.app.android.cscore.buttonv2.configurators.SingleActionButtonConfigurator;
import ru.ozon.app.android.cscore.core.configurators.OrderCacheStateInterceptor;
import ru.ozon.app.android.cscore.orderlist.configurators.OrderFiltersConfigurator;
import ru.ozon.app.android.cscore.orderlist.configurators.RefreshAfterTimeChangeConfigurator;
import ru.ozon.app.android.cscore.orderlist.configurators.RefreshByOrderChangeConfigurator;
import ru.ozon.app.android.navigation.interceptors.AuthDestinationInterceptor;
import ru.ozon.app.android.payment.ui.configurators.AvailableNativePaymentInterceptor;
import ru.ozon.app.android.payment.ui.configurators.orderDetails.OrderDetailsPayConfigurator;
import ru.ozon.app.android.payment.ui.createorder.CreateAndPayConfigurator;
import ru.ozon.app.android.utils.AppType;
import ru.ozon.uni.R$attr;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\f\u001a\u00020\u000b2\n\u0010\n\u001a\u00060\bj\u0002`\tH\u0016¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e2\n\u0010\n\u001a\u00060\bj\u0002`\tH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/account/orders/deeplink/OrderListDeeplinkHandler;", "LIZ/c;", "Lru/ozon/app/android/utils/AppType;", "appType", "Lru/ozon/app/android/navigation/interceptors/AuthDestinationInterceptor;", "authDestinationInterceptor", "<init>", "(Lru/ozon/app/android/utils/AppType;Lru/ozon/app/android/navigation/interceptors/AuthDestinationInterceptor;)V", "LGZ/j;", "Lru/ozon/app/android/navigation/Route;", "route", "", "canHandle", "(LGZ/j;)Z", "Landroid/content/Context;", "context", "LpZ/f;", "getDestination", "(Landroid/content/Context;LGZ/j;)LpZ/f;", "Lru/ozon/app/android/utils/AppType;", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OrderListDeeplinkHandler extends c {

    @NotNull
    private final AppType appType;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderListDeeplinkHandler(@NotNull AppType appType, @NotNull AuthDestinationInterceptor authDestinationInterceptor) {
        super(authDestinationInterceptor, null, 2, null);
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(authDestinationInterceptor, "authDestinationInterceptor");
        this.appType = appType;
    }

    @Override // IZ.a
    public boolean canHandle(@NotNull j route) {
        Intrinsics.checkNotNullParameter(route, "route");
        Uri b11 = route.b();
        List<String> pathSegments = b11.getPathSegments();
        if (!Intrinsics.d(b11.getAuthority(), "my")) {
            return false;
        }
        Intrinsics.f(pathSegments);
        return pathSegments.size() == 1 && Intrinsics.d(C7714v.K(pathSegments), "orderlist");
    }

    @Override // IZ.a
    @NotNull
    public f getDestination(@NotNull Context context, @NotNull j route) {
        String a11 = J.a(context, "context", route, "route", "toString(...)");
        boolean z11 = C2860c.c(route, "getPathSegments(...)").size() == 1;
        LinkedHashSet e11 = e0.e(AvailableNativePaymentInterceptor.class);
        if (z11) {
            e11.add(OrderCacheStateInterceptor.class);
        }
        int i11 = this.appType == AppType.SELECT ? R$attr.layerFloor0 : R$attr.layerFloor1;
        h.c.a aVar = new h.c.a(a11, (String) null, (String) null, 14);
        Class[] elements = {OrderFiltersConfigurator.class, RefreshByOrderChangeConfigurator.class, SingleActionButtonConfigurator.class, OrderChangeActionButtonsConfigurator.class, RefreshAfterTimeChangeConfigurator.class, OrderDetailsPayConfigurator.class, CreateAndPayConfigurator.class};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new ComposerTabRequiredFragmentDestination(new ComposerScreenConfig(aVar, new ComposerScreenConfig.ToolbarConfig(null, 0, 3, null), false, null, true, false, false, false, null, false, false, false, C7705l.j0(elements), e11, null, BackgroundColorAttr.m672boximpl(BackgroundColorAttr.m673constructorimpl(i11)), false, null, null, null, false, false, null, null, 16732108, null), a11, null, false, null, false, 60, null);
    }
}
