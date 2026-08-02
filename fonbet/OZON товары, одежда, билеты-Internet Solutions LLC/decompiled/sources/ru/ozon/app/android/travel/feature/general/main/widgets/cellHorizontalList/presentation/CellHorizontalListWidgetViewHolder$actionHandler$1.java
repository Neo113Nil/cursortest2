package ru.ozon.app.android.travel.feature.general.main.widgets.cellHorizontalList.presentation;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.feature.general.main.widgets.cellHorizontalList.presentation.CellHorizontalListVI;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "atomAction", "Lru/ozon/uni/atoms/af/AtomAction;", "invoke", "(Lru/ozon/uni/atoms/af/AtomAction;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class CellHorizontalListWidgetViewHolder$actionHandler$1 extends AbstractC7737t implements Function1<AtomAction, Boolean> {
    final /* synthetic */ CellHorizontalListWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CellHorizontalListWidgetViewHolder$actionHandler$1(CellHorizontalListWidgetViewHolder cellHorizontalListWidgetViewHolder) {
        super(1);
        this.this$0 = cellHorizontalListWidgetViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(AtomAction atomAction) {
        Object obj;
        CellHorizontalListViewModel cellHorizontalListViewModel;
        Intrinsics.checkNotNullParameter(atomAction, "atomAction");
        CellHorizontalListVI boundData = this.this$0.getBoundData();
        if (boundData != null) {
            CellHorizontalListWidgetViewHolder cellHorizontalListWidgetViewHolder = this.this$0;
            Iterator<T> it = boundData.getCells().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                CommonControlSettings common = ((CellHorizontalListVI.CellVO) next).getCell().getCommon();
                if (Intrinsics.d(common != null ? common.toAtomAction() : null, atomAction)) {
                    obj = next;
                    break;
                }
            }
            CellHorizontalListVI.CellVO cellVO = (CellHorizontalListVI.CellVO) obj;
            if (cellVO != null) {
                cellHorizontalListViewModel = cellHorizontalListWidgetViewHolder.viewModel;
                cellHorizontalListViewModel.onClick(cellVO.getPosition());
            }
        }
        return Boolean.FALSE;
    }
}
