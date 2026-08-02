package ru.ozon.app.android.account.orders.view.maps.domain;

import Lm0.a;
import android.content.Intent;
import com.google.android.gms.maps.model.LatLng;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.account.orders.view.maps.domain.MapRoute;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/ozon/app/android/account/orders/view/maps/domain/MapRouteHandler;", "it", "Lkotlin/Pair;", "Landroid/content/Intent;", "Lru/ozon/app/android/account/orders/view/maps/domain/MapRoute$RouteType;", "invoke", "(Lru/ozon/app/android/account/orders/view/maps/domain/MapRouteHandler;)Lkotlin/Pair;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes11.dex */
final class MapsRouterImpl$handleRoute$1 extends AbstractC7737t implements Function1<MapRouteHandler, Pair<? extends Intent, ? extends MapRoute.RouteType>> {
    final /* synthetic */ LatLng $targetLocation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MapsRouterImpl$handleRoute$1(LatLng latLng) {
        super(1);
        this.$targetLocation = latLng;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Pair<Intent, MapRoute.RouteType> invoke(MapRouteHandler it) {
        Intrinsics.checkNotNullParameter(it, "it");
        try {
            return it.handleRoute(this.$targetLocation);
        } catch (Exception e11) {
            a.f17149a.e(e11);
            return null;
        }
    }
}
