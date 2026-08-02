package ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.rv.vh;

import Sk.a;
import android.view.View;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.models.FilterValuesCell;
import ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.models.MegaCellCheckboxFilter;
import ru.ozon.app.android.storefront.filterWidgets.databinding.FilterValuesMegaCellBinding;
import ru.ozon.uni.android.cell.CellView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.v3.holders.cell.CellHolderKt;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0016\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\u0002`\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ(\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\u0002`\u0006H\u0016R\u001e\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\u0002`\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/rv/vh/FilterValuesMegaCellCheckboxViewHolder;", "Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/rv/vh/FilterValuesCellViewHolder;", "selectionActionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "Lru/ozon/app/android/action/BuildedActionHandler;", "containerView", "Landroid/view/View;", "<init>", "(Lkotlin/jvm/functions/Function1;Landroid/view/View;)V", "binding", "Lru/ozon/app/android/storefront/filterWidgets/databinding/FilterValuesMegaCellBinding;", "bind", "model", "Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/models/FilterValuesCell;", "actionHandler", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class FilterValuesMegaCellCheckboxViewHolder extends FilterValuesCellViewHolder {

    @NotNull
    private final FilterValuesMegaCellBinding binding;

    @NotNull
    private final Function1<AtomAction, Unit> selectionActionHandler;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FilterValuesMegaCellCheckboxViewHolder(@NotNull Function1<? super AtomAction, Unit> selectionActionHandler, @NotNull View containerView) {
        super(containerView);
        Intrinsics.checkNotNullParameter(selectionActionHandler, "selectionActionHandler");
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        this.selectionActionHandler = selectionActionHandler;
        FilterValuesMegaCellBinding bind = FilterValuesMegaCellBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$1$lambda$0(MegaCellCheckboxFilter megaCellCheckboxFilter, FilterValuesMegaCellCheckboxViewHolder filterValuesMegaCellCheckboxViewHolder, View view) {
        AtomActionDTO action;
        AtomAction atomAction;
        Map<String, TokenizedTrackingInfo> selectedTrackingInfo = megaCellCheckboxFilter.isSelected() ? megaCellCheckboxFilter.getSelectedTrackingInfo() : megaCellCheckboxFilter.getDeselectedTrackingInfo();
        CommonControlSettings common = megaCellCheckboxFilter.getCell().getCommon();
        if (common == null || (action = common.getAction()) == null || (atomAction = AtomActionMapperKt.toAtomAction(action, selectedTrackingInfo)) == null) {
            return;
        }
        filterValuesMegaCellCheckboxViewHolder.selectionActionHandler.invoke(atomAction);
    }

    @Override // ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.rv.vh.FilterValuesCellViewHolder
    public void bind(@NotNull FilterValuesCell model, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        MegaCellCheckboxFilter megaCellCheckboxFilter = model instanceof MegaCellCheckboxFilter ? (MegaCellCheckboxFilter) model : null;
        if (megaCellCheckboxFilter == null) {
            return;
        }
        CellView cellView = this.binding.filterValueItemCheckbox;
        Intrinsics.f(cellView);
        CellHolderKt.bind$default(cellView, megaCellCheckboxFilter.getCell(), null, 2, null);
        cellView.getRightBlock().getIconView().setVisibility(megaCellCheckboxFilter.isSelected() ? 0 : 8);
        FilterValuesMegaCellCheckboxViewHolderKt.allowInteractions(cellView.getLeftBlock(), false);
        FilterValuesMegaCellCheckboxViewHolderKt.allowInteractions(cellView.getCenterBlock(), false);
        FilterValuesMegaCellCheckboxViewHolderKt.allowInteractions(cellView.getRightBlock(), false);
        cellView.setOnClickListener(new a(1, megaCellCheckboxFilter, this));
    }
}
