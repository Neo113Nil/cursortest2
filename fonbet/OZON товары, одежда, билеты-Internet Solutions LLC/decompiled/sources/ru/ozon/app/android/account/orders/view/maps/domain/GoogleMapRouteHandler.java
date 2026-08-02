package ru.ozon.app.android.account.orders.view.maps.domain;

import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.maps.model.LatLng;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.orders.view.maps.domain.MapRoute;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \n2\u00020\u0001:\u0001\nB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/account/orders/view/maps/domain/GoogleMapRouteHandler;", "Lru/ozon/app/android/account/orders/view/maps/domain/MapRouteHandler;", "<init>", "()V", "handleRoute", "Lkotlin/Pair;", "Landroid/content/Intent;", "Lru/ozon/app/android/account/orders/view/maps/domain/MapRoute$RouteType;", "targetLocation", "Lcom/google/android/gms/maps/model/LatLng;", "Companion", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class GoogleMapRouteHandler implements MapRouteHandler {
    @Override // ru.ozon.app.android.account.orders.view.maps.domain.MapRouteHandler
    @NotNull
    public Pair<Intent, MapRoute.RouteType> handleRoute(@NotNull LatLng targetLocation) {
        Intrinsics.checkNotNullParameter(targetLocation, "targetLocation");
        String format = String.format("google.navigation:q=%s,%s", Arrays.copyOf(new Object[]{Double.valueOf(targetLocation.latitude), Double.valueOf(targetLocation.longitude)}, 2));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(format));
        intent.setPackage("com.google.android.apps.maps");
        return new Pair<>(intent, MapRoute.RouteType.GOOGLE.INSTANCE);
    }
}
