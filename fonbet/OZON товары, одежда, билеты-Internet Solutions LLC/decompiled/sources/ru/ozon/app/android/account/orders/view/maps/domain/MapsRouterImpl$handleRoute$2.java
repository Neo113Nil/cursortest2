package ru.ozon.app.android.account.orders.view.maps.domain;

import android.content.Intent;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import ru.ozon.app.android.account.orders.view.maps.domain.MapRoute;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lkotlin/sequences/Sequence;", "Lru/ozon/app/android/account/orders/view/maps/domain/MapRoute;", "it", "Lkotlin/Pair;", "Landroid/content/Intent;", "Lru/ozon/app/android/account/orders/view/maps/domain/MapRoute$RouteType;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class MapsRouterImpl$handleRoute$2 extends AbstractC7737t implements Function1<Pair<? extends Intent, ? extends MapRoute.RouteType>, Sequence<? extends MapRoute>> {
    final /* synthetic */ MapsRouterImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MapsRouterImpl$handleRoute$2(MapsRouterImpl mapsRouterImpl) {
        super(1);
        this.this$0 = mapsRouterImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Sequence<MapRoute> invoke(Pair<? extends Intent, ? extends MapRoute.RouteType> it) {
        List mapToMapsRoute;
        Intrinsics.checkNotNullParameter(it, "it");
        mapToMapsRoute = this.this$0.mapToMapsRoute(it);
        return C7714v.w(mapToMapsRoute);
    }
}
