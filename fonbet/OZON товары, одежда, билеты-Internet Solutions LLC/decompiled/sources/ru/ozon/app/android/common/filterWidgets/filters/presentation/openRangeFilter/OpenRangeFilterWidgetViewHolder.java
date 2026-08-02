package ru.ozon.app.android.common.filterWidgets.filters.presentation.openRangeFilter;

import android.view.View;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.common.filterWidgets.filters.presentation.OpenRangeFilterCustomActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.storefront.core.atoms.holders.openRangeFilter.OpenRangeFilterHolderKt;
import ru.ozon.app.android.storefront.core.atoms.views.openRangeFilter.OpenRangeFilterView;
import ru.ozon.app.android.storefront.filterWidgets.databinding.WidgetFiltersOpenRangeFilterBinding;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u00022\n\u0010\r\u001a\u00060\u000bj\u0002`\fH\u0014¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/common/filterWidgets/filters/presentation/openRangeFilter/OpenRangeFilterWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/common/filterWidgets/filters/presentation/openRangeFilter/OpenRangeFilterVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/storefront/filterWidgets/databinding/WidgetFiltersOpenRangeFilterBinding;", "binding", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "<init>", "(Lru/ozon/app/android/storefront/filterWidgets/databinding/WidgetFiltersOpenRangeFilterBinding;Lru/ozon/app/android/composer/ComposerReferences;)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "bind", "(Lru/ozon/app/android/common/filterWidgets/filters/presentation/openRangeFilter/OpenRangeFilterVO;Ll20/d;)V", "Lru/ozon/app/android/storefront/filterWidgets/databinding/WidgetFiltersOpenRangeFilterBinding;", "Lru/ozon/app/android/common/filterWidgets/filters/presentation/OpenRangeFilterCustomActionHandler;", "customActionHandler", "Lru/ozon/app/android/common/filterWidgets/filters/presentation/OpenRangeFilterCustomActionHandler;", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class OpenRangeFilterWidgetViewHolder extends k<OpenRangeFilterVO> {

    @NotNull
    private final WidgetFiltersOpenRangeFilterBinding binding;

    @NotNull
    private final OpenRangeFilterCustomActionHandler customActionHandler;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public OpenRangeFilterWidgetViewHolder(@NotNull WidgetFiltersOpenRangeFilterBinding binding, @NotNull ComposerReferences references) {
        super(r0);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(references, "references");
        LinearLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        this.customActionHandler = new OpenRangeFilterCustomActionHandler(references, new ActionHandler.Builder(references, this).buildHandler());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull OpenRangeFilterVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        WidgetFiltersOpenRangeFilterBinding widgetFiltersOpenRangeFilterBinding = this.binding;
        OpenRangeFilterView openRangeFilter = widgetFiltersOpenRangeFilterBinding.openRangeFilter;
        Intrinsics.checkNotNullExpressionValue(openRangeFilter, "openRangeFilter");
        OpenRangeFilterHolderKt.bind(openRangeFilter, item.getOpenRangeFilter(), new OpenRangeFilterWidgetViewHolder$bind$1$1(this, item));
        View openRangeFilterSeparator = widgetFiltersOpenRangeFilterBinding.openRangeFilterSeparator;
        Intrinsics.checkNotNullExpressionValue(openRangeFilterSeparator, "openRangeFilterSeparator");
        ViewExtKt.showOrGone(openRangeFilterSeparator, Boolean.valueOf(item.getOpenRangeFilter().getHideSeparator()));
    }
}
