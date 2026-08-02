package ru.ozon.app.android.orders.cml.deeplinks.handlers;

import C.J;
import GZ.j;
import IZ.a;
import OZ.e;
import OZ.h;
import android.content.Context;
import android.net.Uri;
import c8.C5766e;
import i10.h;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pZ.f;
import ru.ozon.app.android.cml.domain.configurators.CmlEventsHandlerConfigurator;
import ru.ozon.app.android.composer.navigations.destinations.ComposerFragmentDestination;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.tabbar.R$id;
import ru.ozon.uni.R$color;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\b\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/orders/cml/deeplinks/handlers/DeliveryListDetailsDeeplinkHandler;", "LIZ/a;", "<init>", "()V", "Landroid/net/Uri;", "", "isDeliveryListDetailsRoute", "(Landroid/net/Uri;)Z", "isDraftListPage", "LGZ/j;", "route", "canHandle", "(LGZ/j;)Z", "Landroid/content/Context;", "context", "LpZ/f;", "getDestination", "(Landroid/content/Context;LGZ/j;)LpZ/f;", "Companion", "orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DeliveryListDetailsDeeplinkHandler implements a {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/orders/cml/deeplinks/handlers/DeliveryListDetailsDeeplinkHandler$Companion;", "", "<init>", "()V", "QUERY_PARAM_TYPE", "", "QUERY_PARAM_TYPE_DRAFT", "orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    private final boolean isDeliveryListDetailsRoute(Uri uri) {
        if (Intrinsics.d(uri.getAuthority(), "my")) {
            List<String> pathSegments = uri.getPathSegments();
            Intrinsics.checkNotNullExpressionValue(pathSegments, "getPathSegments(...)");
            if (pathSegments.size() > 1 && C5766e.c(uri, "getPathSegments(...)", 0, "c2c-deliverylist")) {
                return true;
            }
        }
        return false;
    }

    private final boolean isDraftListPage(Uri uri) {
        return Intrinsics.d(uri.getQueryParameter("type"), "Draft");
    }

    @Override // IZ.a
    public boolean canHandle(@NotNull j route) {
        Intrinsics.checkNotNullParameter(route, "route");
        return isDeliveryListDetailsRoute(route.b());
    }

    @Override // IZ.a
    @NotNull
    public f getDestination(@NotNull Context context, @NotNull j route) {
        String a11 = J.a(context, "context", route, "route", "toString(...)");
        Tc.j builder = new Tc.j();
        if (isDraftListPage(route.b())) {
            builder.add(CmlEventsHandlerConfigurator.class);
        }
        Intrinsics.checkNotNullParameter(builder, "builder");
        Tc.j b11 = builder.b();
        return new h(new e(R$id.menu_delivery_list, new ComposerFragmentDestination(new ComposerScreenConfig(new h.c.a(a11, (String) null, (String) null, 14), null, false, null, false, false, false, false, null, false, false, false, b11, null, Integer.valueOf(R$color.layer_floor_0), null, false, null, null, null, false, false, null, null, 16756734, null), a11, null, false, false, null, false, false, null, 508, null)));
    }
}
