package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.bindStrategy.strategy;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.sheet.DisposableActionHandler;
import ru.ozon.app.android.product.molecules.countbutton.presentation.CountButtonViewModel;
import ru.ozon.app.android.product.tileContentItems.TileContentItemsAdapter;
import ru.ozon.app.android.product.tiles.tilegrid2.presentation.data.TileGrid2VO;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.TileGrid2BaseViewBinding;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.bindStrategy.ViewHolderLifecycle;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.bindStrategy.binder.TileGrid2ViewBindSteps;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.overlay.TileOverlayBinder;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.toprightbuttons.adapter.TopRightButtonAdapter;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b`\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003JE\u0010\u0010\u001a\u00020\u000f2\u0012\u0010\u0006\u001a\u000e\u0012\u0002\b\u00030\u0004j\u0006\u0012\u0002\b\u0003`\u00052\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H&¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u000fH&¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/bindStrategy/strategy/TileGrid2BindStrategy;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/bindStrategy/strategy/BindStrategy;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/bindStrategy/binder/TileGrid2ViewBindSteps;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/bindStrategy/ViewHolderLifecycle;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "viewHolder", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/TileGrid2BaseViewBinding;", "viewBinding", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/toprightbuttons/adapter/TopRightButtonAdapter;", "topRightButtonsAdapter", "Lru/ozon/app/android/product/tileContentItems/TileContentItemsAdapter;", "contentAdapter", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/overlay/TileOverlayBinder;", "overlayBinder", "", "init", "(Lru/ozon/composer/ui/widget/k;Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/TileGrid2BaseViewBinding;Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/toprightbuttons/adapter/TopRightButtonAdapter;Lru/ozon/app/android/product/tileContentItems/TileContentItemsAdapter;Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/overlay/TileOverlayBinder;)V", "Lru/ozon/app/android/product/tiles/tilegrid2/presentation/data/TileGrid2VO;", "vo", "Lru/ozon/app/android/product/molecules/countbutton/presentation/CountButtonViewModel;", "countButtonViewModel", "Lru/ozon/app/android/action/sheet/DisposableActionHandler;", "actionHandler", "bind", "(Lru/ozon/app/android/product/tiles/tilegrid2/presentation/data/TileGrid2VO;Lru/ozon/app/android/product/molecules/countbutton/presentation/CountButtonViewModel;Lru/ozon/app/android/action/sheet/DisposableActionHandler;)V", "trackView", "()V", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface TileGrid2BindStrategy extends BindStrategy, TileGrid2ViewBindSteps, ViewHolderLifecycle {
    void bind(@NotNull TileGrid2VO vo, CountButtonViewModel countButtonViewModel, DisposableActionHandler actionHandler);

    void init(@NotNull k<?> viewHolder, @NotNull TileGrid2BaseViewBinding viewBinding, TopRightButtonAdapter topRightButtonsAdapter, @NotNull TileContentItemsAdapter contentAdapter, @NotNull TileOverlayBinder overlayBinder);

    void trackView();
}
