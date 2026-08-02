package ru.ozon.app.android.fresh.feature.b2b.widgets.faq.presentation;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.chip.ChipDTO;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class FaqViewHolder$setupTabsActions$1$1$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ int $index;
    final /* synthetic */ List<ChipDTO> $tabs;
    final /* synthetic */ FaqViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FaqViewHolder$setupTabsActions$1$1$1(List<ChipDTO> list, int i11, FaqViewHolder faqViewHolder) {
        super(0);
        this.$tabs = list;
        this.$index = i11;
        this.this$0 = faqViewHolder;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        AtomActionDTO action;
        Function1 function1;
        CommonControlSettings common = this.$tabs.get(this.$index).getCommon();
        if (common == null || (action = common.getAction()) == null) {
            return;
        }
        CommonControlSettings common2 = this.$tabs.get(this.$index).getCommon();
        AtomAction atomAction = AtomActionMapperKt.toAtomAction(action, common2 != null ? common2.getTrackingInfo() : null);
        if (atomAction != null) {
            function1 = this.this$0.actionHandlerTabs;
            function1.invoke(atomAction);
        }
    }
}
