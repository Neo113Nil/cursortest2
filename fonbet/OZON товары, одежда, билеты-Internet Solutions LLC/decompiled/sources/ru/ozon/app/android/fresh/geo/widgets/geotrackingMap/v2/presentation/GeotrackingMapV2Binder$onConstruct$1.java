package ru.ozon.app.android.fresh.geo.widgets.geotrackingMap.v2.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7719a;
import ru.ozon.app.android.fresh.geo.widgets.geotrackingMap.v2.presentation.GeotrackingMapV2ViewModel;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
/* synthetic */ class GeotrackingMapV2Binder$onConstruct$1 extends C7719a implements Function2<GeotrackingMapV2ViewModel.Action, d<? super Unit>, Object> {
    GeotrackingMapV2Binder$onConstruct$1(Object obj) {
        super(2, obj, GeotrackingMapV2Binder.class, "actionHandler", "actionHandler(Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/presentation/GeotrackingMapV2ViewModel$Action;)V", 4);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(GeotrackingMapV2ViewModel.Action action, d<? super Unit> dVar) {
        Object onConstruct$actionHandler;
        onConstruct$actionHandler = GeotrackingMapV2Binder.onConstruct$actionHandler((GeotrackingMapV2Binder) this.receiver, action, dVar);
        return onConstruct$actionHandler;
    }
}
