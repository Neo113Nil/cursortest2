package ru.ozon.app.android.travel.feature.general.booking.widgets.quickFilters.presentation.adapter;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.chip.ChipDTO;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class QuickFiltersAtomViewHolder$bind$listener$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ AtomDTO $item;
    final /* synthetic */ QuickFiltersAtomViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    QuickFiltersAtomViewHolder$bind$listener$1(AtomDTO atomDTO, QuickFiltersAtomViewHolder quickFiltersAtomViewHolder) {
        super(0);
        this.$item = atomDTO;
        this.this$0 = quickFiltersAtomViewHolder;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        CommonControlSettings common;
        AtomActionDTO action;
        AtomAction atomAction;
        Function1 function1;
        AtomDTO atomDTO = this.$item;
        ChipDTO chipDTO = atomDTO instanceof ChipDTO ? (ChipDTO) atomDTO : null;
        if (chipDTO == null || (common = chipDTO.getCommon()) == null || (action = common.getAction()) == null || (atomAction = AtomActionMapperKt.toAtomAction(action, chipDTO.getTrackingInfo())) == null) {
            return;
        }
        function1 = this.this$0.onItemClickListener;
        function1.invoke(atomAction);
    }
}
