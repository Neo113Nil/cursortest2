package ru.ozon.app.android.account.orders.deeplink;

import GZ.j;
import IZ.a;
import J.d;
import android.content.Context;
import com.google.android.gms.maps.model.LatLng;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pZ.f;
import ru.ozon.app.android.account.orders.view.maps.ui.MapsRouteFragment;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import sZ.c;
import uZ.C9992d;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ#\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/account/orders/deeplink/MapSelectorDeeplinkHandler;", "LIZ/a;", "<init>", "()V", "LGZ/j;", "Lru/ozon/app/android/navigation/Route;", "route", "", "canHandle", "(LGZ/j;)Z", "Landroid/content/Context;", "context", "LpZ/f;", "getDestination", "(Landroid/content/Context;LGZ/j;)LpZ/f;", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MapSelectorDeeplinkHandler implements a {
    @Override // IZ.a
    public boolean canHandle(@NotNull j route) {
        return d.d(route, "route", "mapSelector") && route.b().getPathSegments().isEmpty();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // IZ.a
    @NotNull
    public f getDestination(@NotNull Context context, @NotNull j route) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(route, "route");
        String queryParameter = route.b().getQueryParameter(SelectionItemFormDTO.TITLE_FIELD_NAME);
        if (queryParameter == null) {
            queryParameter = "";
        }
        String queryParameter2 = route.b().getQueryParameter("lat");
        double parseDouble = queryParameter2 != null ? Double.parseDouble(queryParameter2) : 0.0d;
        String queryParameter3 = route.b().getQueryParameter("lng");
        return new C9992d(new c(Kk.c.c(route, "toString(...)"), MapsRouteFragment.INSTANCE.newInstance(queryParameter, new LatLng(parseDouble, queryParameter3 != null ? Double.parseDouble(queryParameter3) : 0.0d)), null, false, false, null, false, false, false, 508, null), null, 2, 0 == true ? 1 : 0);
    }
}
