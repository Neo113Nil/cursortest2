package ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.rv.vh;

import B0.C2454a;
import CG.b;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.common.filterWidgets.filters.presentation.islandSeparator.FiltersIslandSeparatorView;
import ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.models.FilterValuesCell;
import ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.models.HeaderCell;
import ru.ozon.app.android.storefront.filterWidgets.databinding.FilterValuesHeaderItemBinding;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J(\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00132\u0016\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rj\u0002`\u0010H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010\u0016\u001a\u00020\u0015H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\rj\u0004\u0018\u0001`\u0010X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/rv/vh/FilterValuesHeaderViewHolder;", "Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/rv/vh/FilterValuesCellViewHolder;", "isSelect", "", "containerView", "Landroid/view/View;", "<init>", "(ZLandroid/view/View;)V", "binding", "Lru/ozon/app/android/storefront/filterWidgets/databinding/FilterValuesHeaderItemBinding;", "headerId", "", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "Lru/ozon/app/android/action/BuildedActionHandler;", "bind", "model", "Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/models/FilterValuesCell;", "getHeaderBackground", "", "getHeaderTextColor", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class FilterValuesHeaderViewHolder extends FilterValuesCellViewHolder {
    private Function1<? super AtomAction, Unit> actionHandler;

    @NotNull
    private final FilterValuesHeaderItemBinding binding;

    @NotNull
    private final View containerView;
    private String headerId;
    private final boolean isSelect;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FilterValuesHeaderViewHolder(boolean z11, @NotNull View containerView) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        this.isSelect = z11;
        this.containerView = containerView;
        FilterValuesHeaderItemBinding bind = FilterValuesHeaderItemBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        containerView.setOnClickListener(new b(this, 12));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(FilterValuesHeaderViewHolder filterValuesHeaderViewHolder, View view) {
        String str = filterValuesHeaderViewHolder.headerId;
        if (str != null) {
            AtomAction.Click click = new AtomAction.Click("headerExpand", null, null, C2454a.b("id", str), null, 4, null);
            Function1<? super AtomAction, Unit> function1 = filterValuesHeaderViewHolder.actionHandler;
            if (function1 != null) {
                function1.invoke(click);
            }
        }
    }

    private final int getHeaderBackground() {
        return this.isSelect ? R$attr.layerFloor0 : R$attr.layerFloor1;
    }

    private final int getHeaderTextColor() {
        return this.isSelect ? R$attr.textLightKey : R$attr.textPrimary;
    }

    @Override // ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.rv.vh.FilterValuesCellViewHolder
    public void bind(@NotNull FilterValuesCell model, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.headerId = model.getId();
        this.actionHandler = actionHandler;
        HeaderCell headerCell = model instanceof HeaderCell ? (HeaderCell) model : null;
        if (headerCell == null) {
            return;
        }
        this.binding.getConstraintLayout().setBackgroundColor(0);
        ConstraintLayout constraintLayout = this.binding.constraintLayoutContainer;
        Context context = this.containerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        constraintLayout.setBackgroundColor(ThemeExtKt.themeColor(context, getHeaderBackground()));
        TextView textView = this.binding.headerTv;
        Context context2 = this.containerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        textView.setTextColor(ThemeExtKt.themeColor(context2, getHeaderTextColor()));
        this.binding.headerTv.setText(headerCell.getTitle());
        this.binding.foldIv.setRotation(headerCell.getIsExpanded() ? 0.0f : 180.0f);
        this.binding.foldIv.setContentDescription(headerCell.getTitle());
        View separator = this.binding.separator;
        Intrinsics.checkNotNullExpressionValue(separator, "separator");
        separator.setVisibility(headerCell.getShowSeparator() ? 0 : 8);
        FiltersIslandSeparatorView filtersIslandSeparatorView = this.binding.islandSeparator;
        Intrinsics.f(filtersIslandSeparatorView);
        filtersIslandSeparatorView.setVisibility(headerCell.getIsSelect() ? 0 : 8);
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context3 = filtersIslandSeparatorView.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        UniColors uniColors = UniColors.LAYER_FLOOR_0;
        filtersIslandSeparatorView.setViewState(new FiltersIslandSeparatorView.ViewState(false, true, 0, styleParser.parseColor(context3, uniColors.getToken(), uniColors.getResId()), 0));
    }
}
