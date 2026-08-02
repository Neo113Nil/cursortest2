package ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.rv.vh;

import B3.D;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.models.FilterValuesCell;
import ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.models.TitleCell;
import ru.ozon.app.android.storefront.filterWidgets.databinding.FilterValuesSectionItemBinding;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\nJ/\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\f2\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\b0\rj\u0002`\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/rv/vh/FilterValuesTitleViewHolder;", "Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/rv/vh/FilterValuesCellViewHolder;", "Landroid/view/View;", "containerView", "<init>", "(Landroid/view/View;)V", "Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/models/TitleCell;", "model", "", "setupContainerBackground", "(Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/models/TitleCell;)V", "setupCellBackground", "Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/models/FilterValuesCell;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/app/android/action/BuildedActionHandler;", "actionHandler", "bind", "(Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/models/FilterValuesCell;Lkotlin/jvm/functions/Function1;)V", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "Lru/ozon/app/android/storefront/filterWidgets/databinding/FilterValuesSectionItemBinding;", "binding", "Lru/ozon/app/android/storefront/filterWidgets/databinding/FilterValuesSectionItemBinding;", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class FilterValuesTitleViewHolder extends FilterValuesCellViewHolder {

    @NotNull
    private final FilterValuesSectionItemBinding binding;

    @NotNull
    private final View containerView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FilterValuesTitleViewHolder(@NotNull View containerView) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        this.containerView = containerView;
        FilterValuesSectionItemBinding bind = FilterValuesSectionItemBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
    }

    private final void setupCellBackground(TitleCell model) {
        GradientDrawable b11 = D.b(0);
        int i11 = (model.getIsSelectFilterValues() || model.getIsSelectCurrencyValues()) ? R$attr.layerFloor1 : R$attr.layerFloor0;
        Context context = this.containerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        b11.setColor(ThemeExtKt.themeColor(context, i11));
        b11.setCornerRadii(new float[]{model.getTopCornersRadius(), model.getTopCornersRadius(), model.getTopCornersRadius(), model.getTopCornersRadius(), 0.0f, 0.0f, 0.0f, 0.0f});
        this.binding.letterTv.setBackground(b11);
    }

    private final void setupContainerBackground(TitleCell model) {
        int i11 = model.getIsSelectFilterValues() ? R$attr.layerFloor0 : model.getIsSelectCurrencyValues() ? R$attr.layerFloor1 : R$attr.layerFloor0;
        FrameLayout frameLayout = this.binding.sectionItemContainer;
        Context context = this.containerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        frameLayout.setBackgroundColor(ThemeExtKt.themeColor(context, i11));
    }

    @Override // ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.rv.vh.FilterValuesCellViewHolder
    public void bind(@NotNull FilterValuesCell model, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        TitleCell titleCell = model instanceof TitleCell ? (TitleCell) model : null;
        if (titleCell == null) {
            return;
        }
        this.binding.letterTv.setText(titleCell.getTitle());
        TitleCell titleCell2 = (TitleCell) model;
        setupContainerBackground(titleCell2);
        setupCellBackground(titleCell2);
    }
}
