package ru.ozon.app.android.account.orders.view.maps.domain;

import android.content.Intent;
import com.google.android.gms.maps.model.LatLng;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.orders.view.maps.domain.MapRoute;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lru/ozon/app/android/account/orders/view/maps/domain/YandexMapRouteHandler;", "Lru/ozon/app/android/account/orders/view/maps/domain/MapRouteHandler;", "navigationLinkGenerator", "Lru/ozon/app/android/account/orders/view/maps/domain/YandexNavigationLinkGenerator;", "<init>", "(Lru/ozon/app/android/account/orders/view/maps/domain/YandexNavigationLinkGenerator;)V", "handleRoute", "Lkotlin/Pair;", "Landroid/content/Intent;", "Lru/ozon/app/android/account/orders/view/maps/domain/MapRoute$RouteType;", "targetLocation", "Lcom/google/android/gms/maps/model/LatLng;", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class YandexMapRouteHandler implements MapRouteHandler {

    @NotNull
    private final YandexNavigationLinkGenerator navigationLinkGenerator;

    public YandexMapRouteHandler(@NotNull YandexNavigationLinkGenerator navigationLinkGenerator) {
        Intrinsics.checkNotNullParameter(navigationLinkGenerator, "navigationLinkGenerator");
        this.navigationLinkGenerator = navigationLinkGenerator;
    }

    @Override // ru.ozon.app.android.account.orders.view.maps.domain.MapRouteHandler
    @NotNull
    public Pair<Intent, MapRoute.RouteType> handleRoute(@NotNull LatLng targetLocation) {
        Intrinsics.checkNotNullParameter(targetLocation, "targetLocation");
        return new Pair<>(new Intent("android.intent.action.VIEW", this.navigationLinkGenerator.buildRoute(targetLocation)), MapRoute.RouteType.YANDEX.INSTANCE);
    }
}
