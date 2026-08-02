package ru.ozon.app.android.fresh.geo.widgets.geotrackingMap.v2.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.fresh.geo.widgets.geotrackingMap.v2.presentation.GeotrackingMapV2VO;
import we0.u;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lwe0/u;", "placemark", "", "invoke", "(Lwe0/u;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes12.dex */
final class GeotrackingMapIconProviderV2$drawPinsOnMapView$1$2 extends AbstractC7737t implements Function1<u, Unit> {
    final /* synthetic */ GeotrackingMapV2VO.Pin $initPin;
    final /* synthetic */ GeotrackingMapIconProviderV2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GeotrackingMapIconProviderV2$drawPinsOnMapView$1$2(GeotrackingMapIconProviderV2 geotrackingMapIconProviderV2, GeotrackingMapV2VO.Pin pin) {
        super(1);
        this.this$0 = geotrackingMapIconProviderV2;
        this.$initPin = pin;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(u uVar) {
        invoke2(uVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(u placemark) {
        Intrinsics.checkNotNullParameter(placemark, "placemark");
        GeotrackingMapIconProviderV2.setupTooltip$default(this.this$0, placemark, this.$initPin, null, 4, null);
    }
}
