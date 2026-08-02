package ru.ozon.app.android.account.orders.deeplink;

import C.J;
import GZ.j;
import IZ.c;
import Kk.C3532b;
import android.content.Context;
import android.net.Uri;
import i10.h;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pZ.f;
import ru.ozon.app.android.account.orders.total.TotalConfigurator;
import ru.ozon.app.android.checkoutui.configurators.FirstRequestSetupConfigurator;
import ru.ozon.app.android.composer.navigations.destinations.ComposerFlowDestination;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.navigation.interceptors.AuthDestinationInterceptor;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.payment.ui.configurators.AvailableNativePaymentInterceptor;
import ru.ozon.app.android.payment.ui.configurators.orderDetails.OrderDetailsPayConfigurator;
import ru.ozon.app.android.payment.ui.createorder.CreateAndPayConfigurator;
import ru.ozon.uni.R$color;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\f\u001a\u00020\u000b2\n\u0010\n\u001a\u00060\bj\u0002`\tH\u0016¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e2\n\u0010\n\u001a\u00060\bj\u0002`\tH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/account/orders/deeplink/ChangePaymentMethodDeeplinkHandler;", "LIZ/c;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "Lru/ozon/app/android/navigation/interceptors/AuthDestinationInterceptor;", "authDestinationInterceptor", "<init>", "(Lru/ozon/app/android/network/abtool/FeatureChecker;Lru/ozon/app/android/navigation/interceptors/AuthDestinationInterceptor;)V", "LGZ/j;", "Lru/ozon/app/android/navigation/Route;", "route", "", "canHandle", "(LGZ/j;)Z", "Landroid/content/Context;", "context", "LpZ/f;", "getDestination", "(Landroid/content/Context;LGZ/j;)LpZ/f;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "getFeatureChecker", "()Lru/ozon/app/android/network/abtool/FeatureChecker;", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChangePaymentMethodDeeplinkHandler extends c {

    @NotNull
    private final FeatureChecker featureChecker;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChangePaymentMethodDeeplinkHandler(@NotNull FeatureChecker featureChecker, @NotNull AuthDestinationInterceptor authDestinationInterceptor) {
        super(authDestinationInterceptor, null, 2, null);
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        Intrinsics.checkNotNullParameter(authDestinationInterceptor, "authDestinationInterceptor");
        this.featureChecker = featureChecker;
    }

    @Override // IZ.a
    public boolean canHandle(@NotNull j route) {
        String queryParameter;
        Intrinsics.checkNotNullParameter(route, "route");
        Uri b11 = route.b();
        return Intrinsics.d(b11.getAuthority(), "my") && C3532b.g(b11, "getPathSegments(...)", "changePaymentMethod") && (queryParameter = b11.getQueryParameter("orderNumber")) != null && queryParameter.length() > 0;
    }

    @Override // IZ.a
    @NotNull
    public f getDestination(@NotNull Context context, @NotNull j route) {
        String a11 = J.a(context, "context", route, "route", "toString(...)");
        h.c.a aVar = new h.c.a(a11, (String) null, (String) null, 14);
        int i11 = R$color.layer_floor_0;
        Class[] elements = {FirstRequestSetupConfigurator.class, AvailableNativePaymentInterceptor.class};
        Intrinsics.checkNotNullParameter(elements, "elements");
        Set j02 = C7705l.j0(elements);
        Class[] elements2 = {TotalConfigurator.class, OrderDetailsPayConfigurator.class, CreateAndPayConfigurator.class};
        Intrinsics.checkNotNullParameter(elements2, "elements");
        return new ComposerFlowDestination(new ComposerScreenConfig(aVar, null, false, null, false, false, false, false, null, false, false, false, C7705l.j0(elements2), j02, Integer.valueOf(i11), null, false, null, null, null, false, false, null, null, 16748542, null), a11, 874, null, false, 24, null);
    }
}
