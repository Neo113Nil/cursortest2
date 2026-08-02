package ru.ozon.app.android.travel.feature.hotels.map.shared.presentation.polygons;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.travel.feature.hotels.map.shared.presentation.DistrictsVO;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class PolygonPlacemarkProvider$provide$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ DistrictsVO.Polygon.PolygonPin $pin;
    final /* synthetic */ PolygonPlacemarkProvider this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PolygonPlacemarkProvider$provide$1(PolygonPlacemarkProvider polygonPlacemarkProvider, DistrictsVO.Polygon.PolygonPin polygonPin) {
        super(0);
        this.this$0 = polygonPlacemarkProvider;
        this.$pin = polygonPin;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        Function2 function2;
        function2 = this.this$0.onAction;
        if (function2 != null) {
            function2.invoke(this.$pin.getAction(), this.$pin.getBadgeTokenizedEvent());
        }
    }
}
