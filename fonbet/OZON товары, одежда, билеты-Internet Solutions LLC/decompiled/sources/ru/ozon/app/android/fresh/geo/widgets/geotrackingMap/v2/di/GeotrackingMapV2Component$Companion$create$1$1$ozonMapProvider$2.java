package ru.ozon.app.android.fresh.geo.widgets.geotrackingMap.v2.di;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.mapcommon.map.di.OzonMapComponentApi;
import ru.ozon.app.android.mapcommon.map.provider.map.OzonMapProvider;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/mapcommon/map/provider/map/OzonMapProvider;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class GeotrackingMapV2Component$Companion$create$1$1$ozonMapProvider$2 extends AbstractC7737t implements Function0<OzonMapProvider> {
    final /* synthetic */ GeotrackingMapV2Component$Companion$create$1$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GeotrackingMapV2Component$Companion$create$1$1$ozonMapProvider$2(GeotrackingMapV2Component$Companion$create$1$1 geotrackingMapV2Component$Companion$create$1$1) {
        super(0);
        this.this$0 = geotrackingMapV2Component$Companion$create$1$1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final OzonMapProvider invoke() {
        OzonMapComponentApi ozonMapComponentApi;
        ozonMapComponentApi = this.this$0.ozonMapComponentApi;
        return ozonMapComponentApi.getOzonMapProvider();
    }
}
