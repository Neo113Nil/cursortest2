package ru.ozon.app.android.travel.feature.general.main.widgets.travelPassengersCountSelector.v1.views;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.travel.feature.general.main.widgets.travelPassengersCountSelector.v1.presentation.TravelPassengersCountSelectorVO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.chip.ChipDTO;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class TravelPassengersCountSelectorView$fixChipClicks$1$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ List<ChipDTO> $chips;
    final /* synthetic */ int $index;
    final /* synthetic */ TravelPassengersCountSelectorVO $vo;
    final /* synthetic */ TravelPassengersCountSelectorView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TravelPassengersCountSelectorView$fixChipClicks$1$1(List<ChipDTO> list, int i11, TravelPassengersCountSelectorView travelPassengersCountSelectorView, TravelPassengersCountSelectorVO travelPassengersCountSelectorVO) {
        super(0);
        this.$chips = list;
        this.$index = i11;
        this.this$0 = travelPassengersCountSelectorView;
        this.$vo = travelPassengersCountSelectorVO;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
    
        r2 = r2.actionHandler;
     */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void invoke2() {
        CommonControlSettings common;
        AtomActionDTO action;
        CommonControlSettings common2;
        AtomAction atomAction;
        Function1 function1;
        ChipDTO chipDTO = (ChipDTO) C7714v.Q(this.$index, this.$chips);
        if (chipDTO != null && (common2 = chipDTO.getCommon()) != null) {
            TravelPassengersCountSelectorView travelPassengersCountSelectorView = this.this$0;
            AtomActionDTO action2 = common2.getAction();
            if (action2 != null && (atomAction = AtomActionMapperKt.toAtomAction(action2, common2.getTrackingInfo())) != null && function1 != null) {
                function1.invoke(atomAction);
            }
        }
        this.this$0.bindAdditionalInfo(this.$vo.getAdditionalClassInfo(), (chipDTO == null || (common = chipDTO.getCommon()) == null || (action = common.getAction()) == null) ? null : action.getLink(), this.$vo.getSampleText());
    }
}
