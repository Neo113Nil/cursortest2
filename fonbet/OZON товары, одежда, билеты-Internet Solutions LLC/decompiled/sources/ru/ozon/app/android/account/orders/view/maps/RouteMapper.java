package ru.ozon.app.android.account.orders.view.maps;

import Sc.o;
import android.content.Intent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.orders.view.maps.domain.MapRoute;
import ru.ozon.app.android.account.orders.view.maps.ui.MapCancel;
import ru.ozon.app.android.account.orders.view.maps.ui.MapRouteVO;
import ru.ozon.app.android.account.orders.view.maps.ui.MapTitle;
import ru.ozon.app.android.cs_orders.R$string;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.uni.R$attr;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011R\u0010\u0010\u0004\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/account/orders/view/maps/RouteMapper;", "", "<init>", "()V", "blackColor", "", "redColor", "blueColor", "createTitle", "Lru/ozon/app/android/account/orders/view/maps/ui/MapTitle;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "createCancel", "Lru/ozon/app/android/account/orders/view/maps/ui/MapCancel;", "mapToVO", "Lru/ozon/app/android/account/orders/view/maps/ui/MapRouteVO;", "mapRoute", "Lru/ozon/app/android/account/orders/view/maps/domain/MapRoute;", "Companion", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class RouteMapper {
    private final int blackColor = R$attr.textPrimary;
    private final int redColor = R$attr.textAccent;
    private final int blueColor = R$attr.textAction;

    @NotNull
    public final MapCancel createCancel() {
        return new MapCancel(StringProvider.getString(R$string.cs_orders_cancel), this.redColor, true);
    }

    @NotNull
    public final MapTitle createTitle(@NotNull String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new MapTitle(title, this.blackColor, false);
    }

    @NotNull
    public final MapRouteVO mapToVO(@NotNull MapRoute mapRoute) {
        String str;
        Intrinsics.checkNotNullParameter(mapRoute, "mapRoute");
        String title = mapRoute.getTitle();
        int i11 = this.blueColor;
        Intent intent = mapRoute.getIntent();
        MapRoute.RouteType routeType = mapRoute.getRouteType();
        if (Intrinsics.d(routeType, MapRoute.RouteType.GOOGLE.INSTANCE)) {
            str = "google_maps";
        } else {
            if (!Intrinsics.d(routeType, MapRoute.RouteType.YANDEX.INSTANCE)) {
                throw new o();
            }
            str = "yandex_maps";
        }
        return new MapRouteVO(title, i11, true, intent, str);
    }
}
