package ru.ozon.app.android.fresh.geo.widgets.geotrackingMap.v2.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "state", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class GeotrackingMapV2ViewMapper$initOzonMapAsync$1 extends AbstractC7737t implements Function1<Integer, Unit> {
    final /* synthetic */ GeotrackingMapV2ViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GeotrackingMapV2ViewMapper$initOzonMapAsync$1(GeotrackingMapV2ViewMapper geotrackingMapV2ViewMapper) {
        super(1);
        this.this$0 = geotrackingMapV2ViewMapper;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
        invoke(num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(int i11) {
        GeotrackingMapV2Binder geotrackingMapV2Binder;
        geotrackingMapV2Binder = this.this$0.binder;
        if (geotrackingMapV2Binder != null) {
            geotrackingMapV2Binder.handleBottomSheetState(i11);
        }
    }
}
