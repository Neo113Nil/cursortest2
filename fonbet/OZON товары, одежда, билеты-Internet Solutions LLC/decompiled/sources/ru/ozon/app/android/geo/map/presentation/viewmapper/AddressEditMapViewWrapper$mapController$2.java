package ru.ozon.app.android.geo.map.presentation.viewmapper;

import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.mapcommon.map.OzonMapController;
import ru.ozon.app.android.mapcommon.map.provider.map.OzonMapProvider;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/mapcommon/map/OzonMapController;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class AddressEditMapViewWrapper$mapController$2 extends AbstractC7737t implements Function0<OzonMapController> {
    final /* synthetic */ AddressEditMapViewWrapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddressEditMapViewWrapper$mapController$2(AddressEditMapViewWrapper addressEditMapViewWrapper) {
        super(0);
        this.this$0 = addressEditMapViewWrapper;
    }

    @Override // kotlin.jvm.functions.Function0
    public final OzonMapController invoke() {
        OzonMapProvider ozonMapProvider = this.this$0.getOzonMapProvider();
        FrameLayout mapContainer = this.this$0.getAddressEditMapView().getBinding().mapContainer;
        Intrinsics.checkNotNullExpressionValue(mapContainer, "mapContainer");
        return ozonMapProvider.provideMapController(mapContainer);
    }
}
