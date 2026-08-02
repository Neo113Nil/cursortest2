package ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.view.scheme;

import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.presentation.scheme.SeatItemVO;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class TravelRailwaySchemeController$enableShowTooltip$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ SeatItemVO $itemWithTooltip;
    final /* synthetic */ TravelRailwaySchemeController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TravelRailwaySchemeController$enableShowTooltip$1(TravelRailwaySchemeController travelRailwaySchemeController, SeatItemVO seatItemVO) {
        super(0);
        this.this$0 = travelRailwaySchemeController;
        this.$itemWithTooltip = seatItemVO;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        TravelRailwaySchemeActions travelRailwaySchemeActions;
        WeakReference weakReference = this.this$0.viewCallbacks;
        if (weakReference != null && (travelRailwaySchemeActions = (TravelRailwaySchemeActions) weakReference.get()) != null) {
            travelRailwaySchemeActions.showTooltip(this.$itemWithTooltip);
        }
        this.this$0.doShowTooltip = null;
    }
}
