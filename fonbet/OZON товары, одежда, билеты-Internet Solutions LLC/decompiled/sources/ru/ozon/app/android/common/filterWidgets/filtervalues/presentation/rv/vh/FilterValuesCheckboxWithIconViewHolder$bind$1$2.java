package ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.rv.vh;

import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.models.CheckBoxWithIcon;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "isSelected", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class FilterValuesCheckboxWithIconViewHolder$bind$1$2 extends AbstractC7737t implements Function1<Boolean, Unit> {
    final /* synthetic */ Function1<AtomAction, Unit> $actionHandler;
    final /* synthetic */ FilterValuesCheckboxWithIconViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    FilterValuesCheckboxWithIconViewHolder$bind$1$2(FilterValuesCheckboxWithIconViewHolder filterValuesCheckboxWithIconViewHolder, Function1<? super AtomAction, Unit> function1) {
        super(1);
        this.this$0 = filterValuesCheckboxWithIconViewHolder;
        this.$actionHandler = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return Unit.f71690a;
    }

    public final void invoke(boolean z11) {
        CheckBoxWithIcon checkBoxWithIcon;
        Map trackingInfoBySelected;
        checkBoxWithIcon = this.this$0.castedModel;
        AtomAction atomAction = null;
        if (checkBoxWithIcon != null) {
            trackingInfoBySelected = this.this$0.getTrackingInfoBySelected(checkBoxWithIcon, z11);
            AtomActionDTO action = checkBoxWithIcon.getCell().getAction();
            if (action != null) {
                atomAction = AtomActionMapperKt.toAtomAction(action, trackingInfoBySelected);
            }
        }
        if (atomAction != null) {
            this.$actionHandler.invoke(atomAction);
        }
    }
}
