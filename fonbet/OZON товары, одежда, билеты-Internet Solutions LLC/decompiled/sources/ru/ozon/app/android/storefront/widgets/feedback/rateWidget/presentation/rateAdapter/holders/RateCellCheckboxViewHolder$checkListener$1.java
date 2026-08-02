package ru.ozon.app.android.storefront.widgets.feedback.rateWidget.presentation.rateAdapter.holders;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.storefront.widgets.feedback.rateWidget.presentation.model.RateSection;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "isChecked", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class RateCellCheckboxViewHolder$checkListener$1 extends AbstractC7737t implements Function1<Boolean, Unit> {
    final /* synthetic */ RateCellCheckboxViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RateCellCheckboxViewHolder$checkListener$1(RateCellCheckboxViewHolder rateCellCheckboxViewHolder) {
        super(1);
        this.this$0 = rateCellCheckboxViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return Unit.f71690a;
    }

    public final void invoke(boolean z11) {
        RateSection.RequiredSection.SectionCheckbox sectionCheckbox;
        RateSection.RequiredSection.SectionCheckbox sectionCheckbox2;
        CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadio cell;
        AtomActionDTO action;
        RateSection.RequiredSection.SectionCheckbox sectionCheckbox3;
        Function1 function1;
        CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadio cell2;
        CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadio cell3;
        sectionCheckbox = this.this$0.currentItem;
        if (sectionCheckbox != null && (cell3 = sectionCheckbox.getCell()) != null && cell3.isRadio() && !z11) {
            this.this$0.itemView.setSelected(true);
        }
        sectionCheckbox2 = this.this$0.currentItem;
        if (sectionCheckbox2 == null || (cell = sectionCheckbox2.getCell()) == null || (action = cell.getAction()) == null) {
            return;
        }
        sectionCheckbox3 = this.this$0.currentItem;
        AtomAction atomAction = AtomActionMapperKt.toAtomAction(action, (sectionCheckbox3 == null || (cell2 = sectionCheckbox3.getCell()) == null) ? null : cell2.getTrackingInfo());
        if (atomAction != null) {
            function1 = this.this$0.onAction;
            function1.invoke(atomAction);
        }
    }
}
