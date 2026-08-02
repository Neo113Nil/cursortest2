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
import ru.ozon.app.android.atoms.v3.holders.cells.subtitled.CellWithSubtitleCheckboxRadioCounterHolderKt;
import ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.models.CheckBox;
import ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.models.FilterValuesCell;
import ru.ozon.app.android.storefront.filterWidgets.databinding.FilterValuesItemCheckboxBinding;
import ru.ozon.app.android.uikit.view.atoms.cells.subtitled.CellWithSubtitleCheckboxRadioCounterView;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J(\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0016\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u000b0\u000fj\u0002`\u0011H\u0016J\"\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0013*\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0017H\u0002R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/rv/vh/FilterValuesCheckboxViewHolder;", "Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/rv/vh/FilterValuesCellViewHolder;", "containerView", "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "checkBox", "Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/models/CheckBox;", "binding", "Lru/ozon/app/android/storefront/filterWidgets/databinding/FilterValuesItemCheckboxBinding;", "bind", "", "model", "Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/models/FilterValuesCell;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/app/android/action/BuildedActionHandler;", "getTrackingInfoBySelected", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "isSelected", "", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class FilterValuesCheckboxViewHolder extends FilterValuesCellViewHolder {

    @NotNull
    private final FilterValuesItemCheckboxBinding binding;
    private CheckBox checkBox;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FilterValuesCheckboxViewHolder(@NotNull View containerView) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        FilterValuesItemCheckboxBinding bind = FilterValuesItemCheckboxBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<String, TokenizedTrackingInfo> getTrackingInfoBySelected(CheckBox checkBox, boolean z11) {
        return !z11 ? checkBox.getCell().getSelectedTrackingInfo() : checkBox.getCell().getTrackingInfo();
    }

    @Override // ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.rv.vh.FilterValuesCellViewHolder
    public void bind(@NotNull FilterValuesCell model, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        CheckBox checkBox = model instanceof CheckBox ? (CheckBox) model : null;
        if (checkBox == null) {
            return;
        }
        this.checkBox = checkBox;
        CellWithSubtitleCheckboxRadioCounterView cellWithSubtitleCheckboxRadioCounterView = this.binding.filterValueItemCheckbox;
        Intrinsics.f(cellWithSubtitleCheckboxRadioCounterView);
        CellWithSubtitleCheckboxRadioCounterHolderKt.bindOrGone(cellWithSubtitleCheckboxRadioCounterView, ((CheckBox) model).getCell(), actionHandler);
        BadgeView counterBadgeView = cellWithSubtitleCheckboxRadioCounterView.getCounterBadgeView();
        ViewGroup.LayoutParams layoutParams = counterBadgeView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.width = -2;
        counterBadgeView.setLayoutParams(layoutParams);
        cellWithSubtitleCheckboxRadioCounterView.setOnCheckedChangeListener(new FilterValuesCheckboxViewHolder$bind$1$2(this, actionHandler));
    }
}
