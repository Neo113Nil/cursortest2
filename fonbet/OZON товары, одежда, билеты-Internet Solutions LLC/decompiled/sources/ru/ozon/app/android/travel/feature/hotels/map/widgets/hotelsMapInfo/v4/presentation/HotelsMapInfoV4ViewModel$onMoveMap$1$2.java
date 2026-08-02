package ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation;

import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.HotelsMapInfoV4VO;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.MapAction;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.MapEvent;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "clusteredPins", "", "", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$Pin;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class HotelsMapInfoV4ViewModel$onMoveMap$1$2 extends AbstractC7737t implements Function1<Map<String, ? extends HotelsMapInfoV4VO.Pin>, Unit> {
    final /* synthetic */ MapEvent.OnMoveMap $event;
    final /* synthetic */ HotelsMapInfoV4ViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HotelsMapInfoV4ViewModel$onMoveMap$1$2(HotelsMapInfoV4ViewModel hotelsMapInfoV4ViewModel, MapEvent.OnMoveMap onMoveMap) {
        super(1);
        this.this$0 = hotelsMapInfoV4ViewModel;
        this.$event = onMoveMap;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Map<String, ? extends HotelsMapInfoV4VO.Pin> map) {
        invoke2((Map<String, HotelsMapInfoV4VO.Pin>) map);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Map<String, HotelsMapInfoV4VO.Pin> clusteredPins) {
        boolean z11;
        Intrinsics.checkNotNullParameter(clusteredPins, "clusteredPins");
        this.this$0.send(new MapAction.DrawPins(clusteredPins));
        z11 = this.this$0.isPolling;
        if (z11) {
            return;
        }
        this.this$0.fetchHotels(this.$event.getVisibleArea(), this.$event.getZoom(), this.$event.getPinsOnMap(), this.$event.getPolygonsOnMap());
    }
}
