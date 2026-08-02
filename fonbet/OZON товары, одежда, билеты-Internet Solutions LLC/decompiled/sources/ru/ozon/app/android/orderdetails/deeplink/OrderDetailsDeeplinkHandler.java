package ru.ozon.app.android.orderdetails.deeplink;

import BZ.e;
import BZ.f;
import C.J;
import De.C2860c;
import GZ.j;
import IZ.c;
import J.d;
import android.content.Context;
import i10.h;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qZ.InterfaceC9014f;
import rZ.C9236a;
import ru.ozon.app.android.composer.navigations.destinations.ComposerTabRequiredFragmentDestination;
import ru.ozon.app.android.composer.universalscreen.view.BackgroundColorAttr;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.cscore.core.configurators.OrderCacheStateInterceptor;
import ru.ozon.app.android.cscore.core.configurators.RefreshOnStartConfigurator;
import ru.ozon.app.android.cscore.orderdetails.configurators.orderdetailchangehandler.OrderDetailsChangeHandlerConfigurator;
import ru.ozon.app.android.cscore.orderlist.configurators.RefreshAfterTimeChangeConfigurator;
import ru.ozon.app.android.cscore.orderlist.configurators.RefreshByOrderChangeConfigurator;
import ru.ozon.app.android.navigation.interceptors.AuthDestinationInterceptor;
import ru.ozon.app.android.orderdetails.ordershipment.orderShipment.configurator.ScrollToShipmentConfigurator;
import ru.ozon.app.android.orderdetails.ordershipment.orderShipment.data.repository.OrderDetailsScrollToShipmentRepository;
import ru.ozon.app.android.payment.ui.changepayment.configurator.ChangePaymentMethodConfigurator;
import ru.ozon.app.android.payment.ui.configurators.AvailableNativePaymentInterceptor;
import ru.ozon.app.android.payment.ui.configurators.orderDetails.OrderDetailsPayConfigurator;
import ru.ozon.app.android.payment.ui.createorder.CreateAndPayConfigurator;
import ru.ozon.app.android.tabbar.R$id;
import ru.ozon.app.android.utils.AppType;
import ru.ozon.uni.R$attr;
import tZ.C9788c;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \"2\u00020\u0001:\u0001\"B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0018\u001a\u00020\u00172\n\u0010\u0016\u001a\u00060\u0014j\u0002`\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001b\u001a\u00020\u001a2\n\u0010\u0016\u001a\u00060\u0014j\u0002`\u0015H\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010 R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010!¨\u0006#"}, d2 = {"Lru/ozon/app/android/orderdetails/deeplink/OrderDetailsDeeplinkHandler;", "LIZ/c;", "Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/data/repository/OrderDetailsScrollToShipmentRepository;", "orderDetailsScrollToShipmentKeyRepository", "Lru/ozon/app/android/utils/AppType;", "appType", "LBZ/e;", "miniAppConfigHolder", "Lru/ozon/app/android/navigation/interceptors/AuthDestinationInterceptor;", "authDestinationInterceptor", "<init>", "(Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/data/repository/OrderDetailsScrollToShipmentRepository;Lru/ozon/app/android/utils/AppType;LBZ/e;Lru/ozon/app/android/navigation/interceptors/AuthDestinationInterceptor;)V", "", "deeplink", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig;", "buildComposerScreenConfig", "(Ljava/lang/String;)Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig;", "", "getMenuId", "()I", "LGZ/j;", "Lru/ozon/app/android/navigation/Route;", "route", "", "canHandle", "(LGZ/j;)Z", "Landroid/content/Context;", "context", "LpZ/f;", "getDestination", "(Landroid/content/Context;LGZ/j;)LpZ/f;", "Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/data/repository/OrderDetailsScrollToShipmentRepository;", "Lru/ozon/app/android/utils/AppType;", "LBZ/e;", "Companion", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OrderDetailsDeeplinkHandler extends c {

    @NotNull
    private final AppType appType;

    @NotNull
    private final e miniAppConfigHolder;

    @NotNull
    private final OrderDetailsScrollToShipmentRepository orderDetailsScrollToShipmentKeyRepository;
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderDetailsDeeplinkHandler(@NotNull OrderDetailsScrollToShipmentRepository orderDetailsScrollToShipmentKeyRepository, @NotNull AppType appType, @NotNull e miniAppConfigHolder, @NotNull AuthDestinationInterceptor authDestinationInterceptor) {
        super(authDestinationInterceptor, null, 2, null);
        Intrinsics.checkNotNullParameter(orderDetailsScrollToShipmentKeyRepository, "orderDetailsScrollToShipmentKeyRepository");
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(miniAppConfigHolder, "miniAppConfigHolder");
        Intrinsics.checkNotNullParameter(authDestinationInterceptor, "authDestinationInterceptor");
        this.orderDetailsScrollToShipmentKeyRepository = orderDetailsScrollToShipmentKeyRepository;
        this.appType = appType;
        this.miniAppConfigHolder = miniAppConfigHolder;
    }

    private final ComposerScreenConfig buildComposerScreenConfig(String deeplink) {
        int i11 = this.appType == AppType.SELECT ? R$attr.layerFloor0 : R$attr.layerFloor1;
        h.c.a aVar = new h.c.a(deeplink, (String) null, (String) null, 14);
        Class[] elements = {RefreshAfterTimeChangeConfigurator.class, CreateAndPayConfigurator.class, OrderDetailsPayConfigurator.class, OrderDetailsChangeHandlerConfigurator.class, RefreshByOrderChangeConfigurator.class, ChangePaymentMethodConfigurator.class, RefreshOnStartConfigurator.class, ScrollToShipmentConfigurator.class};
        Intrinsics.checkNotNullParameter(elements, "elements");
        Set j02 = C7705l.j0(elements);
        Class[] elements2 = {OrderCacheStateInterceptor.class, AvailableNativePaymentInterceptor.class};
        Intrinsics.checkNotNullParameter(elements2, "elements");
        return new ComposerScreenConfig(aVar, null, false, null, false, false, false, false, null, false, false, false, j02, C7705l.j0(elements2), null, BackgroundColorAttr.m672boximpl(BackgroundColorAttr.m673constructorimpl(i11)), false, null, null, null, false, false, null, null, 16732158, null);
    }

    private final int getMenuId() {
        String a11 = f.a(this.miniAppConfigHolder);
        int hashCode = a11.hashCode();
        if (hashCode != -1339606153) {
            if (hashCode != -865698022) {
                if (hashCode == 98626 && a11.equals("cml")) {
                    return R$id.menu_delivery;
                }
            } else if (a11.equals("travel")) {
                return R$id.menu_travel;
            }
        } else if (a11.equals("supermarket")) {
            return R$id.menu_fresh_main;
        }
        return R$id.menu_main;
    }

    @Override // IZ.a
    public boolean canHandle(@NotNull j route) {
        if (!d.d(route, "route", "my") || C2860c.c(route, "getPathSegments(...)").isEmpty()) {
            return false;
        }
        List<String> pathSegments = route.b().getPathSegments();
        Intrinsics.checkNotNullExpressionValue(pathSegments, "getPathSegments(...)");
        return kotlin.text.h.D((String) C7714v.K(pathSegments), "orderDetails", true);
    }

    @Override // IZ.a
    public pZ.f getDestination(@NotNull Context context, @NotNull j route) {
        String a11 = J.a(context, "context", route, "route", "toString(...)");
        String queryParameter = route.b().getQueryParameter("shipment_id");
        if (queryParameter != null) {
            this.orderDetailsScrollToShipmentKeyRepository.putScrollWidgetKey(queryParameter);
        }
        boolean d11 = Intrinsics.d(route.b().getQueryParameter("notification"), "payment_failed");
        ComposerTabRequiredFragmentDestination composerTabRequiredFragmentDestination = new ComposerTabRequiredFragmentDestination(buildComposerScreenConfig(a11), a11, null, false, null, false, 60, null);
        if (!d11) {
            return composerTabRequiredFragmentDestination;
        }
        InterfaceC9014f.f81797k0.getClass();
        return new C9236a(InterfaceC9014f.a.a(), new OZ.h(new OZ.e(getMenuId(), new C9788c(composerTabRequiredFragmentDestination))));
    }
}
