package ru.ozon.app.android.common.filterWidgets.filters.presentation.islandSeparator;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.common.filterWidgets.filters.presentation.islandSeparator.FiltersIslandSeparatorView;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/common/filterWidgets/filters/presentation/islandSeparator/FiltersIslandSeparatorViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/common/filterWidgets/filters/presentation/islandSeparator/FiltersIslandSeparatorVO;", "Lru/ozon/app/android/common/filterWidgets/filters/presentation/islandSeparator/FiltersIslandSeparatorView;", "containerView", "<init>", "(Lru/ozon/app/android/common/filterWidgets/filters/presentation/islandSeparator/FiltersIslandSeparatorView;)V", "item", "Ll20/d;", "info", "", "bind", "(Lru/ozon/app/android/common/filterWidgets/filters/presentation/islandSeparator/FiltersIslandSeparatorVO;Ll20/d;)V", "Lru/ozon/app/android/common/filterWidgets/filters/presentation/islandSeparator/FiltersIslandSeparatorView;", "getContainerView", "()Lru/ozon/app/android/common/filterWidgets/filters/presentation/islandSeparator/FiltersIslandSeparatorView;", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class FiltersIslandSeparatorViewHolder extends k<FiltersIslandSeparatorVO> {

    @NotNull
    private final FiltersIslandSeparatorView containerView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FiltersIslandSeparatorViewHolder(@NotNull FiltersIslandSeparatorView containerView) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        this.containerView = containerView;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull FiltersIslandSeparatorVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        FiltersIslandSeparatorView filtersIslandSeparatorView = this.containerView;
        filtersIslandSeparatorView.setVisibility(0);
        int physicalPartHeightDp = item.getPhysicalPartHeightDp();
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = filtersIslandSeparatorView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        filtersIslandSeparatorView.setViewState(new FiltersIslandSeparatorView.ViewState(item.getHasTopCorners(), item.getHasBottomCorners(), physicalPartHeightDp, styleParser.parseColor(context, item.getBackgroundColor(), UniColors.LAYER_FLOOR_0.getResId()), null, 16, null));
    }
}
