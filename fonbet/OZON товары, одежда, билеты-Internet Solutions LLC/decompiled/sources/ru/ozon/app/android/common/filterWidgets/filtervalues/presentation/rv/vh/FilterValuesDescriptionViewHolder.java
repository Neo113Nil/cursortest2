package ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.rv.vh;

import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.models.DescriptionCell;
import ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.models.FilterValuesCell;
import ru.ozon.app.android.storefront.filterWidgets.databinding.FilterValuesDescriptionItemBinding;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J(\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0016\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\t0\rj\u0002`\u000fH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/rv/vh/FilterValuesDescriptionViewHolder;", "Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/rv/vh/FilterValuesCellViewHolder;", "containerView", "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "binding", "Lru/ozon/app/android/storefront/filterWidgets/databinding/FilterValuesDescriptionItemBinding;", "bind", "", "model", "Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/models/FilterValuesCell;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/app/android/action/BuildedActionHandler;", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class FilterValuesDescriptionViewHolder extends FilterValuesCellViewHolder {

    @NotNull
    private final FilterValuesDescriptionItemBinding binding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FilterValuesDescriptionViewHolder(@NotNull View containerView) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        FilterValuesDescriptionItemBinding bind = FilterValuesDescriptionItemBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
    }

    @Override // ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.rv.vh.FilterValuesCellViewHolder
    public void bind(@NotNull FilterValuesCell model, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        DescriptionCell descriptionCell = model instanceof DescriptionCell ? (DescriptionCell) model : null;
        if (descriptionCell == null) {
            return;
        }
        TextAtomView filterValuesDescription = this.binding.filterValuesDescription;
        Intrinsics.checkNotNullExpressionValue(filterValuesDescription, "filterValuesDescription");
        TextAtomHolderKt.bind(filterValuesDescription, descriptionCell.getDescription(), actionHandler);
    }
}
