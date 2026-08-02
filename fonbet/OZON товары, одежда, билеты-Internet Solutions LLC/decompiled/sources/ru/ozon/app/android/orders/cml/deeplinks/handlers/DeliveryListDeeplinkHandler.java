package ru.ozon.app.android.orders.cml.deeplinks.handlers;

import C.J;
import GZ.j;
import IZ.a;
import OZ.e;
import android.content.Context;
import android.net.Uri;
import c8.C5766e;
import i10.h;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pZ.f;
import ru.ozon.app.android.composer.navigations.destinations.ComposerFragmentDestination;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.tabbar.R$id;
import ru.ozon.uni.R$color;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\f\u001a\u00020\u00062\n\u0010\u000b\u001a\u00060\tj\u0002`\nH\u0016¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e2\n\u0010\u000b\u001a\u00060\tj\u0002`\nH\u0016¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/orders/cml/deeplinks/handlers/DeliveryListDeeplinkHandler;", "LIZ/a;", "<init>", "()V", "Landroid/net/Uri;", "deeplink", "", "isDeliveryListRoute", "(Landroid/net/Uri;)Z", "LGZ/j;", "Lru/ozon/app/android/navigation/Route;", "route", "canHandle", "(LGZ/j;)Z", "Landroid/content/Context;", "context", "LpZ/f;", "getDestination", "(Landroid/content/Context;LGZ/j;)LpZ/f;", "orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DeliveryListDeeplinkHandler implements a {
    private final boolean isDeliveryListRoute(Uri deeplink) {
        if (Intrinsics.d(deeplink.getAuthority(), "my")) {
            List<String> pathSegments = deeplink.getPathSegments();
            Intrinsics.checkNotNullExpressionValue(pathSegments, "getPathSegments(...)");
            if (pathSegments.size() == 1 && C5766e.c(deeplink, "getPathSegments(...)", 0, "c2c-deliverylist")) {
                return true;
            }
        }
        return false;
    }

    @Override // IZ.a
    public boolean canHandle(@NotNull j route) {
        Intrinsics.checkNotNullParameter(route, "route");
        return isDeliveryListRoute(route.b());
    }

    @Override // IZ.a
    @NotNull
    public f getDestination(@NotNull Context context, @NotNull j route) {
        String a11 = J.a(context, "context", route, "route", "toString(...)");
        int i11 = R$id.menu_delivery_list;
        h.c.a aVar = new h.c.a(a11, (String) null, (String) null, 14);
        int i12 = 0;
        ComposerScreenConfig.ToolbarConfig.DefaultState defaultState = new ComposerScreenConfig.ToolbarConfig.DefaultState(i12, false, null, null, null, null, 61, null);
        return new OZ.h(new e(i11, new ComposerFragmentDestination(new ComposerScreenConfig(aVar, new ComposerScreenConfig.ToolbarConfig(defaultState, i12, 2, null), false, null, false, false, false, false, null, false, false, false, null, null, Integer.valueOf(R$color.layer_floor_0), null, false, null, null, null, false, false, null, null, 16760828, null), a11, null, false, false, null, true, true, null, 316, null)));
    }
}
