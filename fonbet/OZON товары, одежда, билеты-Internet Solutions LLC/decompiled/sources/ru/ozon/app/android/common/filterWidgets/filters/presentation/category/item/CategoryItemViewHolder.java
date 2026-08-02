package ru.ozon.app.android.common.filterWidgets.filters.presentation.category.item;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.atoms.v3.holders.cells.subtitled.CellWithSubtitleCheckboxRadioCounterHolderKt;
import ru.ozon.app.android.common.filterWidgets.filters.presentation.CustomRefreshHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.storefront.filterWidgets.databinding.FilterCategoryItemBinding;
import ru.ozon.app.android.uikit.view.atoms.cells.subtitled.CellWithSubtitleCheckboxRadioCounterView;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u00022\n\u0010\u000f\u001a\u00060\rj\u0002`\u000eH\u0014¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014R \u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00100\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/common/filterWidgets/filters/presentation/category/item/CategoryItemViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/common/filterWidgets/filters/presentation/category/item/CategoryItemVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/storefront/filterWidgets/databinding/FilterCategoryItemBinding;", "binding", "Lru/ozon/app/android/common/filterWidgets/filters/presentation/CustomRefreshHandler;", "customRefreshHandler", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "<init>", "(Lru/ozon/app/android/storefront/filterWidgets/databinding/FilterCategoryItemBinding;Lru/ozon/app/android/common/filterWidgets/filters/presentation/CustomRefreshHandler;Lru/ozon/app/android/composer/ComposerReferences;)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "bind", "(Lru/ozon/app/android/common/filterWidgets/filters/presentation/category/item/CategoryItemVO;Ll20/d;)V", "Lru/ozon/app/android/storefront/filterWidgets/databinding/FilterCategoryItemBinding;", "Lru/ozon/app/android/common/filterWidgets/filters/presentation/CustomRefreshHandler;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CategoryItemViewHolder extends k<CategoryItemVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final FilterCategoryItemBinding binding;

    @NotNull
    private final CustomRefreshHandler customRefreshHandler;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CategoryItemViewHolder(@NotNull FilterCategoryItemBinding binding, @NotNull CustomRefreshHandler customRefreshHandler, @NotNull ComposerReferences refs) {
        super(r0);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(customRefreshHandler, "customRefreshHandler");
        Intrinsics.checkNotNullParameter(refs, "refs");
        CellWithSubtitleCheckboxRadioCounterView constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        this.customRefreshHandler = customRefreshHandler;
        this.actionHandler = new ActionHandler.Builder(refs, this).buildHandler();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull CategoryItemVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        FilterCategoryItemBinding filterCategoryItemBinding = this.binding;
        this.customRefreshHandler.bind(item.getOriginalUrl(), Long.valueOf(item.getId()), this.actionHandler, item.getScrollWidgetKey(), new CategoryItemViewHolder$bind$1$1(this));
        CellWithSubtitleCheckboxRadioCounterView categoryItem = filterCategoryItemBinding.categoryItem;
        Intrinsics.checkNotNullExpressionValue(categoryItem, "categoryItem");
        CellWithSubtitleCheckboxRadioCounterHolderKt.bind(categoryItem, item.getCell(), this.customRefreshHandler);
        filterCategoryItemBinding.categoryItem.setOnCheckedChangeListener(new CategoryItemViewHolder$bind$1$2(this, filterCategoryItemBinding));
    }
}
