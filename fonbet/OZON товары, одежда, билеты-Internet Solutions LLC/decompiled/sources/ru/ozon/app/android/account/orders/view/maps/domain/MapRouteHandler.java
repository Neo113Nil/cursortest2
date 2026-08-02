package ru.ozon.app.android.account.orders.view.maps.domain;

import android.content.Intent;
import com.google.android.gms.maps.model.LatLng;
import kotlin.Metadata;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.orders.view.maps.domain.MapRoute;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lru/ozon/app/android/account/orders/view/maps/domain/MapRouteHandler;", "", "handleRoute", "Lkotlin/Pair;", "Landroid/content/Intent;", "Lru/ozon/app/android/account/orders/view/maps/domain/MapRoute$RouteType;", "targetLocation", "Lcom/google/android/gms/maps/model/LatLng;", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface MapRouteHandler {
    @NotNull
    Pair<Intent, MapRoute.RouteType> handleRoute(@NotNull LatLng targetLocation);
}
