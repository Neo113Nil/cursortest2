package ru.ozon.app.android.fresh.geo.widgets.geotrackingMap.v2.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.fresh.geo.widgets.geotrackingMap.v2.presentation.GeotrackingMapV2VO;
import we0.u;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class GeotrackingMapIconProviderV2$drawPinsOnMapView$1$1$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ Function0<Unit> $additionalAnimation;
    final /* synthetic */ u $oldPlacemark;
    final /* synthetic */ GeotrackingMapV2VO.Pin $pin;
    final /* synthetic */ GeotrackingMapIconProviderV2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GeotrackingMapIconProviderV2$drawPinsOnMapView$1$1$1(GeotrackingMapIconProviderV2 geotrackingMapIconProviderV2, u uVar, GeotrackingMapV2VO.Pin pin, Function0<Unit> function0) {
        super(0);
        this.this$0 = geotrackingMapIconProviderV2;
        this.$oldPlacemark = uVar;
        this.$pin = pin;
        this.$additionalAnimation = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.this$0.animateCourierPinMove(this.$oldPlacemark.c(), this.$pin.getDirection(), this.$pin.getCoordinates(), this.$additionalAnimation);
    }
}
