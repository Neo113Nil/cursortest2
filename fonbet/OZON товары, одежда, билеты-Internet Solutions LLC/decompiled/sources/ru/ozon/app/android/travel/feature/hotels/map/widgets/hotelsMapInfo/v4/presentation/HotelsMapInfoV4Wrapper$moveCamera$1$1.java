package ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.travel.feature.hotels.map.shared.data.MapExtKt;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.MapEvent;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class HotelsMapInfoV4Wrapper$moveCamera$1$1 extends AbstractC7737t implements Function1<Boolean, Unit> {
    final /* synthetic */ ve0.b $this_run;
    final /* synthetic */ HotelsMapInfoV4Wrapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HotelsMapInfoV4Wrapper$moveCamera$1$1(HotelsMapInfoV4Wrapper hotelsMapInfoV4Wrapper, ve0.b bVar) {
        super(1);
        this.this$0 = hotelsMapInfoV4Wrapper;
        this.$this_run = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return Unit.f71690a;
    }

    public final void invoke(boolean z11) {
        this.this$0.viewModel.onEvent(new MapEvent.OnMoveMap(MapExtKt.getZoom(this.$this_run), MapExtKt.getVisibleArea(this.$this_run), MapExtKt.getPosition(this.$this_run).c(), this.this$0.getCurrentPinIdsOnMapExceptDistrictLabels(), this.this$0.getCurrentPolygonsIdsOnMap()));
    }
}
