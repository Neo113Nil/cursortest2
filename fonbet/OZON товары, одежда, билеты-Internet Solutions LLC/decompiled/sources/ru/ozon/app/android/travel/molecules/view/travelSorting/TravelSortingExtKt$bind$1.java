package ru.ozon.app.android.travel.molecules.view.travelSorting;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.atoms.data.list.Select;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "index", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class TravelSortingExtKt$bind$1 extends AbstractC7737t implements Function1<Integer, Unit> {
    final /* synthetic */ Function1<AtomAction, Unit> $onAction;
    final /* synthetic */ TravelSortingVO $vo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    TravelSortingExtKt$bind$1(TravelSortingVO travelSortingVO, Function1<? super AtomAction, Unit> function1) {
        super(1);
        this.$vo = travelSortingVO;
        this.$onAction = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
        invoke(num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(int i11) {
        AtomActionDTO action;
        AtomAction atomAction;
        Function1<AtomAction, Unit> function1;
        Select.Option option = this.$vo.getSortingTypes().getOptions().get(i11);
        if (Intrinsics.d(option.isSelected(), Boolean.TRUE) || (action = option.getAction()) == null || (atomAction = AtomActionMapperKt.toAtomAction(action, option.getTrackingInfo())) == null || (function1 = this.$onAction) == null) {
            return;
        }
        function1.invoke(atomAction);
    }
}
