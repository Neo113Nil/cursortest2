package ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.presentation.map;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.H;
import d20.AbstractC6065b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.map.storage.TravelGeoProvidersStorage;
import xe.B0;
import xe.C10727i;
import xe.J;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000fR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0010R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0011R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/map/HotelsSearchResultsV5OverlayWidgetHolder;", "Ld20/b;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/map/HotelsSearchResultsV5MapOverlayVO;", "Landroid/content/Context;", "context", "Lru/ozon/app/android/travel/map/storage/TravelGeoProvidersStorage;", "geoStorage", "", "isNotTravelMiniapp", "<init>", "(Landroid/content/Context;Lru/ozon/app/android/travel/map/storage/TravelGeoProvidersStorage;Z)V", "item", "", "bind", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/map/HotelsSearchResultsV5MapOverlayVO;)V", "Landroid/content/Context;", "Lru/ozon/app/android/travel/map/storage/TravelGeoProvidersStorage;", "Z", "Landroid/view/View;", "metricView", "Landroid/view/View;", "getMetricView", "()Landroid/view/View;", "Lxe/J;", "exHandler", "Lxe/J;", "Lxe/B0;", "providerJob", "Lxe/B0;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsSearchResultsV5OverlayWidgetHolder extends AbstractC6065b<HotelsSearchResultsV5MapOverlayVO> {

    @NotNull
    private final Context context;

    @NotNull
    private final J exHandler;

    @NotNull
    private final TravelGeoProvidersStorage geoStorage;
    private final boolean isNotTravelMiniapp;
    private final View metricView;
    private B0 providerJob;

    public HotelsSearchResultsV5OverlayWidgetHolder(@NotNull Context context, @NotNull TravelGeoProvidersStorage geoStorage, boolean z11) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(geoStorage, "geoStorage");
        this.context = context;
        this.geoStorage = geoStorage;
        this.isNotTravelMiniapp = z11;
        this.exHandler = new HotelsSearchResultsV5OverlayWidgetHolder$special$$inlined$CoroutineExceptionHandler$1(J.f105405n0);
    }

    @Override // d20.AbstractC6065b
    public View getMetricView() {
        return this.metricView;
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull HotelsSearchResultsV5MapOverlayVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (!this.isNotTravelMiniapp || this.geoStorage.isNewStorage()) {
            B0 b02 = this.providerJob;
            if (b02 != null) {
                b02.j(null);
            }
            this.providerJob = C10727i.c(H.a(getLifecycle()), this.exHandler, null, new HotelsSearchResultsV5OverlayWidgetHolder$bind$1(this, item, null), 2);
        }
    }
}
