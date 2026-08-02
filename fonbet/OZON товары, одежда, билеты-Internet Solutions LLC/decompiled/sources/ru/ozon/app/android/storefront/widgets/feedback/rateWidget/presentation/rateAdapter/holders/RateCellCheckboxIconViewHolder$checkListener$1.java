package ru.ozon.app.android.storefront.widgets.feedback.rateWidget.presentation.rateAdapter.holders;

import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.storefront.widgets.feedback.rateWidget.presentation.model.RateSection;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "isChecked", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class RateCellCheckboxIconViewHolder$checkListener$1 extends AbstractC7737t implements Function1<Boolean, Unit> {
    final /* synthetic */ RateCellCheckboxIconViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RateCellCheckboxIconViewHolder$checkListener$1(RateCellCheckboxIconViewHolder rateCellCheckboxIconViewHolder) {
        super(1);
        this.this$0 = rateCellCheckboxIconViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return Unit.f71690a;
    }

    public final void invoke(boolean z11) {
        RateSection.RequiredSection.SectionCheckboxIcon sectionCheckboxIcon;
        CellAtom.CellAtomWithSubtitle.CellWithSubtitle40IconCheckboxRadio cell;
        RateSection.RequiredSection.SectionCheckboxIcon sectionCheckboxIcon2;
        RateSection.RequiredSection.SectionCheckboxIcon sectionCheckboxIcon3;
        CellAtom.CellAtomWithSubtitle.CellWithSubtitle40IconCheckboxRadio cell2;
        AtomActionDTO action;
        AtomAction atomAction;
        Function1 function1;
        CellAtom.CellAtomWithSubtitle.CellWithSubtitle40IconCheckboxRadio cell3;
        RateSection.RequiredSection.SectionCheckboxIcon sectionCheckboxIcon4;
        RateSection.RequiredSection.SectionCheckboxIcon sectionCheckboxIcon5;
        CellAtom.CellAtomWithSubtitle.CellWithSubtitle40IconCheckboxRadio cell4;
        CellAtom.CellAtomWithSubtitle.CellWithSubtitle40IconCheckboxRadio cell5;
        Map<String, TokenizedTrackingInfo> map = null;
        if (!z11) {
            sectionCheckboxIcon4 = this.this$0.currentItem;
            if (((sectionCheckboxIcon4 == null || (cell5 = sectionCheckboxIcon4.getCell()) == null) ? null : cell5.getSelectedTrackingInfo()) != null) {
                sectionCheckboxIcon5 = this.this$0.currentItem;
                if (sectionCheckboxIcon5 != null && (cell4 = sectionCheckboxIcon5.getCell()) != null) {
                    map = cell4.getSelectedTrackingInfo();
                }
                sectionCheckboxIcon2 = this.this$0.currentItem;
                if (sectionCheckboxIcon2 != null && (cell3 = sectionCheckboxIcon2.getCell()) != null && cell3.isRadio() && !z11) {
                    this.this$0.getContainerView().setSelected(true);
                }
                sectionCheckboxIcon3 = this.this$0.currentItem;
                if (sectionCheckboxIcon3 != null || (cell2 = sectionCheckboxIcon3.getCell()) == null || (action = cell2.getAction()) == null || (atomAction = AtomActionMapperKt.toAtomAction(action, map)) == null) {
                    return;
                }
                function1 = this.this$0.onAction;
                function1.invoke(atomAction);
                return;
            }
        }
        sectionCheckboxIcon = this.this$0.currentItem;
        if (sectionCheckboxIcon != null && (cell = sectionCheckboxIcon.getCell()) != null) {
            map = cell.getTrackingInfo();
        }
        sectionCheckboxIcon2 = this.this$0.currentItem;
        if (sectionCheckboxIcon2 != null) {
            this.this$0.getContainerView().setSelected(true);
        }
        sectionCheckboxIcon3 = this.this$0.currentItem;
        if (sectionCheckboxIcon3 != null) {
        }
    }
}
