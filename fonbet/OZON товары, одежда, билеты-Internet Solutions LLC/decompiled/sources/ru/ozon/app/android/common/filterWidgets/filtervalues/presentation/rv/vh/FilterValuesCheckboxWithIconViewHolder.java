package ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.rv.vh;

import android.view.View;
import android.view.ViewGroup;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.atoms.v3.holders.cells.subtitled.CellWithSubtitle24IconCheckboxRadioCounterHolderKt;
import ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.models.CheckBoxWithIcon;
import ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.models.FilterValuesCell;
import ru.ozon.app.android.storefront.filterWidgets.databinding.FilterValuesItemCheckboxWithIconBinding;
import ru.ozon.app.android.uikit.view.atoms.cells.subtitled.CellWithSubtitle24IconCheckboxRadioCounterView;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J(\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0016\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u000b0\u000fj\u0002`\u0011H\u0016J\"\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0013*\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0017H\u0002R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/rv/vh/FilterValuesCheckboxWithIconViewHolder;", "Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/rv/vh/FilterValuesCellViewHolder;", "containerView", "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "castedModel", "Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/models/CheckBoxWithIcon;", "binding", "Lru/ozon/app/android/storefront/filterWidgets/databinding/FilterValuesItemCheckboxWithIconBinding;", "bind", "", "model", "Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/models/FilterValuesCell;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/app/android/action/BuildedActionHandler;", "getTrackingInfoBySelected", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "isSelected", "", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class FilterValuesCheckboxWithIconViewHolder extends FilterValuesCellViewHolder {

    @NotNull
    private final FilterValuesItemCheckboxWithIconBinding binding;
    private CheckBoxWithIcon castedModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FilterValuesCheckboxWithIconViewHolder(@NotNull View containerView) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        FilterValuesItemCheckboxWithIconBinding bind = FilterValuesItemCheckboxWithIconBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<String, TokenizedTrackingInfo> getTrackingInfoBySelected(CheckBoxWithIcon checkBoxWithIcon, boolean z11) {
        return !z11 ? checkBoxWithIcon.getCell().getSelectedTrackingInfo() : checkBoxWithIcon.getCell().getTrackingInfo();
    }

    @Override // ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.rv.vh.FilterValuesCellViewHolder
    public void bind(@NotNull FilterValuesCell model, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        CheckBoxWithIcon checkBoxWithIcon = model instanceof CheckBoxWithIcon ? (CheckBoxWithIcon) model : null;
        if (checkBoxWithIcon == null) {
            return;
        }
        this.castedModel = checkBoxWithIcon;
        CellWithSubtitle24IconCheckboxRadioCounterView cellWithSubtitle24IconCheckboxRadioCounterView = this.binding.filterValueItemCheckbox24;
        Intrinsics.f(cellWithSubtitle24IconCheckboxRadioCounterView);
        CheckBoxWithIcon checkBoxWithIcon2 = this.castedModel;
        CellWithSubtitle24IconCheckboxRadioCounterHolderKt.bindOrGone(cellWithSubtitle24IconCheckboxRadioCounterView, checkBoxWithIcon2 != null ? checkBoxWithIcon2.getCell() : null, actionHandler);
        BadgeView counterBadgeView = cellWithSubtitle24IconCheckboxRadioCounterView.getCounterBadgeView();
        ViewGroup.LayoutParams layoutParams = counterBadgeView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.width = -2;
        counterBadgeView.setLayoutParams(layoutParams);
        cellWithSubtitle24IconCheckboxRadioCounterView.setOnCheckedChangeListener(new FilterValuesCheckboxWithIconViewHolder$bind$1$2(this, actionHandler));
    }
}
