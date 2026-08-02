package ru.ozon.app.android.common.filterWidgets.filters.presentation.category.item;

import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.common.filterWidgets.filters.presentation.CustomRefreshHandler;
import ru.ozon.app.android.storefront.filterWidgets.databinding.FilterCategoryItemBinding;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "newIsSelected", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class CategoryItemViewHolder$bind$1$2 extends AbstractC7737t implements Function1<Boolean, Unit> {
    final /* synthetic */ FilterCategoryItemBinding $this_with;
    final /* synthetic */ CategoryItemViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CategoryItemViewHolder$bind$1$2(CategoryItemViewHolder categoryItemViewHolder, FilterCategoryItemBinding filterCategoryItemBinding) {
        super(1);
        this.this$0 = categoryItemViewHolder;
        this.$this_with = filterCategoryItemBinding;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return Unit.f71690a;
    }

    public final void invoke(boolean z11) {
        CustomRefreshHandler customRefreshHandler;
        if (!z11) {
            this.$this_with.categoryItem.setSelected(true);
            return;
        }
        CategoryItemVO boundedData = this.this$0.getBoundedData();
        if (boundedData != null) {
            CategoryItemViewHolder categoryItemViewHolder = this.this$0;
            CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadioCounter cell = boundedData.getCell();
            AtomActionDTO action = cell.getAction();
            if (action != null) {
                Map<String, TokenizedTrackingInfo> selectedTrackingInfo = cell.getSelectedTrackingInfo();
                if (selectedTrackingInfo == null) {
                    selectedTrackingInfo = cell.getTrackingInfo();
                }
                AtomAction atomAction = AtomActionMapperKt.toAtomAction(action, selectedTrackingInfo);
                if (atomAction != null) {
                    customRefreshHandler = categoryItemViewHolder.customRefreshHandler;
                    customRefreshHandler.invoke2(atomAction);
                }
            }
        }
    }
}
