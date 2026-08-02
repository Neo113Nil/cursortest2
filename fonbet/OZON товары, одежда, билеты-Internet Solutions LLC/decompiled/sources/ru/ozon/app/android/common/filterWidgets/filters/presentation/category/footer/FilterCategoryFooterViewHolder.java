package ru.ozon.app.android.common.filterWidgets.filters.presentation.category.footer;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.storefront.filterWidgets.databinding.FilterCategoryFooterItemBinding;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.view.atoms.buttons.borderless.LargeBorderlessButtonView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.buttons.LargeBorderlessButtonHolderKt;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u00022\n\u0010\r\u001a\u00060\u000bj\u0002`\fH\u0014¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0012R#\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000e0\u00138\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/common/filterWidgets/filters/presentation/category/footer/FilterCategoryFooterViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/common/filterWidgets/filters/presentation/category/footer/CategoryFooterVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/storefront/filterWidgets/databinding/FilterCategoryFooterItemBinding;", "binding", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "<init>", "(Lru/ozon/app/android/storefront/filterWidgets/databinding/FilterCategoryFooterItemBinding;Lru/ozon/app/android/composer/ComposerReferences;)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "bind", "(Lru/ozon/app/android/common/filterWidgets/filters/presentation/category/footer/CategoryFooterVO;Ll20/d;)V", "Lru/ozon/app/android/storefront/filterWidgets/databinding/FilterCategoryFooterItemBinding;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "getActionHandler", "()Lkotlin/jvm/functions/Function1;", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class FilterCategoryFooterViewHolder extends k<CategoryFooterVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final FilterCategoryFooterItemBinding binding;

    @NotNull
    private final ComposerReferences refs;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public FilterCategoryFooterViewHolder(@NotNull FilterCategoryFooterItemBinding binding, @NotNull ComposerReferences refs) {
        super(r0);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(refs, "refs");
        LargeBorderlessButtonView constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        this.refs = refs;
        this.actionHandler = new ActionHandler.Builder(refs, this).onPreProcess(new FilterCategoryFooterViewHolder$actionHandler$1(this)).buildHandler();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull CategoryFooterVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        FilterCategoryFooterItemBinding filterCategoryFooterItemBinding = this.binding;
        LargeBorderlessButtonView filterCategoryButton = filterCategoryFooterItemBinding.filterCategoryButton;
        Intrinsics.checkNotNullExpressionValue(filterCategoryButton, "filterCategoryButton");
        LargeBorderlessButtonHolderKt.bindOrGone(filterCategoryButton, item.getFooterButton(), this.actionHandler);
        filterCategoryFooterItemBinding.filterCategoryButton.setGravity(16);
    }
}
