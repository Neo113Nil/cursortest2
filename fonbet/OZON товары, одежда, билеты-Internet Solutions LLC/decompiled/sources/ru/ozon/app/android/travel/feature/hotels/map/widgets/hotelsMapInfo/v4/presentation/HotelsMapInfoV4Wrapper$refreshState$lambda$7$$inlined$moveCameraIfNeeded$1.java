package ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.travel.feature.hotels.map.shared.data.MapExtKt;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.MapEvent;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "isFinished", "", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
public final class HotelsMapInfoV4Wrapper$refreshState$lambda$7$$inlined$moveCameraIfNeeded$1 extends AbstractC7737t implements Function1<Boolean, Unit> {
    final /* synthetic */ HotelsMapInfoV4Wrapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HotelsMapInfoV4Wrapper$refreshState$lambda$7$$inlined$moveCameraIfNeeded$1(HotelsMapInfoV4Wrapper hotelsMapInfoV4Wrapper) {
        super(1);
        this.this$0 = hotelsMapInfoV4Wrapper;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return Unit.f71690a;
    }

    public final void invoke(boolean z11) {
        if (z11) {
            this.this$0.viewModel.onEvent(new MapEvent.OnMapReady(MapExtKt.getZoom(this.this$0.hotelsMapInfoView.getController()), MapExtKt.getVisibleArea(this.this$0.hotelsMapInfoView.getController()), MapExtKt.getPosition(this.this$0.hotelsMapInfoView.getController()).c(), this.this$0.getCurrentPinIdsOnMapExceptDistrictLabels(), this.this$0.getCurrentPolygonsIdsOnMap()));
        }
    }
}
