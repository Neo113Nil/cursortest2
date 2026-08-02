package ru.ozon.app.android.account.orders.view.maps;

import androidx.lifecycle.w0;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.orders.view.maps.domain.MapRoute;
import ru.ozon.app.android.account.orders.view.maps.domain.MapsRouter;
import ru.ozon.app.android.account.orders.view.maps.ui.MapItem;
import ru.ozon.app.android.cs_orders.R$string;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.app.android.uikit.text.StringProvider;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B-\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0011R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0012R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0013R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/account/orders/view/maps/MapsRouteViewModelImpl;", "Landroidx/lifecycle/w0;", "", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lcom/google/android/gms/maps/model/LatLng;", "pvzLocation", "Lru/ozon/app/android/account/orders/view/maps/RouteMapper;", "mapper", "Lru/ozon/app/android/account/orders/view/maps/domain/MapsRouter;", "mapsRouter", "<init>", "(Ljava/lang/String;Lcom/google/android/gms/maps/model/LatLng;Lru/ozon/app/android/account/orders/view/maps/RouteMapper;Lru/ozon/app/android/account/orders/view/maps/domain/MapsRouter;)V", "", "Lru/ozon/app/android/account/orders/view/maps/ui/MapItem;", "getRoutes", "()Ljava/util/List;", "Ljava/lang/String;", "Lcom/google/android/gms/maps/model/LatLng;", "Lru/ozon/app/android/account/orders/view/maps/RouteMapper;", "Lru/ozon/app/android/account/orders/view/maps/domain/MapsRouter;", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class MapsRouteViewModelImpl extends w0 {

    @NotNull
    private final RouteMapper mapper;

    @NotNull
    private final MapsRouter mapsRouter;

    @NotNull
    private final LatLng pvzLocation;

    @NotNull
    private final String title;

    public MapsRouteViewModelImpl(@NotNull String title, @NotNull LatLng pvzLocation, @NotNull RouteMapper mapper, @NotNull MapsRouter mapsRouter) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(pvzLocation, "pvzLocation");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(mapsRouter, "mapsRouter");
        this.title = title;
        this.pvzLocation = pvzLocation;
        this.mapper = mapper;
        this.mapsRouter = mapsRouter;
    }

    @NotNull
    public List<MapItem> getRoutes() {
        ArrayList arrayList = new ArrayList();
        List<MapRoute> handleRoute = this.mapsRouter.handleRoute(this.pvzLocation);
        RouteMapper routeMapper = this.mapper;
        ArrayList arrayList2 = new ArrayList(C7714v.z(handleRoute, 10));
        Iterator<T> it = handleRoute.iterator();
        while (it.hasNext()) {
            arrayList2.add(routeMapper.mapToVO((MapRoute) it.next()));
        }
        arrayList.add(this.mapper.createTitle(arrayList2.isEmpty() ? StringProvider.getString(R$string.cs_orders_no_map_restriction) : this.title));
        arrayList.addAll(arrayList2);
        arrayList.add(this.mapper.createCancel());
        return arrayList;
    }
}
