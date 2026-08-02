package ru.ozon.app.android.fresh.geo.widgets.geotrackingMap.v2.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7719a;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
/* synthetic */ class GeotrackingMapV2Binder$onConstruct$2 extends C7719a implements Function2<GeotrackingMapV2VO, d<? super Unit>, Object> {
    GeotrackingMapV2Binder$onConstruct$2(Object obj) {
        super(2, obj, GeotrackingMapV2Binder.class, "mapStateHandler", "mapStateHandler(Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/presentation/GeotrackingMapV2VO;)V", 4);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(GeotrackingMapV2VO geotrackingMapV2VO, d<? super Unit> dVar) {
        Object onConstruct$mapStateHandler;
        onConstruct$mapStateHandler = GeotrackingMapV2Binder.onConstruct$mapStateHandler((GeotrackingMapV2Binder) this.receiver, geotrackingMapV2VO, dVar);
        return onConstruct$mapStateHandler;
    }
}
