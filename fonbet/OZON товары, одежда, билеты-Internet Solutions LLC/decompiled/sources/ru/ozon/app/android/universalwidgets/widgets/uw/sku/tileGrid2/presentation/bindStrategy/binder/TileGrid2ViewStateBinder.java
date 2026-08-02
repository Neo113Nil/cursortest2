package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.bindStrategy.binder;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.product.tileContentItems.TileContentItemsAdapter;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.TileGrid2BaseViewBinding;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.bindStrategy.ViewHolderLifecycle;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.overlay.TileOverlayBinder;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.toprightbuttons.adapter.TopRightButtonAdapter;
import ru.ozon.app.android.videocover.HorizontalScrollDelegate;
import ru.ozon.app.android.videocover.VideoTileWidgetHolder;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b`\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003JM\u0010\u0012\u001a\u00020\u00112\u0012\u0010\u0006\u001a\u000e\u0012\u0002\b\u00030\u0004j\u0006\u0012\u0002\b\u0003`\u00052\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H&¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/bindStrategy/binder/TileGrid2ViewStateBinder;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/bindStrategy/binder/TileGrid2ViewBindSteps;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/bindStrategy/ViewHolderLifecycle;", "Lru/ozon/app/android/videocover/VideoTileWidgetHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "viewHolder", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/TileGrid2BaseViewBinding;", "viewBinding", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/toprightbuttons/adapter/TopRightButtonAdapter;", "topRightButtonsAdapter", "Lru/ozon/app/android/product/tileContentItems/TileContentItemsAdapter;", "contentAdapter", "Landroidx/recyclerview/widget/RecyclerView$u;", "pool", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/overlay/TileOverlayBinder;", "overlayBinder", "", "init", "(Lru/ozon/composer/ui/widget/k;Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/TileGrid2BaseViewBinding;Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/toprightbuttons/adapter/TopRightButtonAdapter;Lru/ozon/app/android/product/tileContentItems/TileContentItemsAdapter;Landroidx/recyclerview/widget/RecyclerView$u;Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/overlay/TileOverlayBinder;)V", "trackView", "()V", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface TileGrid2ViewStateBinder extends TileGrid2ViewBindSteps, ViewHolderLifecycle, VideoTileWidgetHolder {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static HorizontalScrollDelegate getHorizontalDelegate(@NotNull TileGrid2ViewStateBinder tileGrid2ViewStateBinder) {
            return VideoTileWidgetHolder.DefaultImpls.getHorizontalDelegate(tileGrid2ViewStateBinder);
        }

        public static void onRecycle(@NotNull TileGrid2ViewStateBinder tileGrid2ViewStateBinder) {
            ViewHolderLifecycle.DefaultImpls.onRecycle(tileGrid2ViewStateBinder);
        }

        public static void onViewInVisibleBounds(@NotNull TileGrid2ViewStateBinder tileGrid2ViewStateBinder) {
            ViewHolderLifecycle.DefaultImpls.onViewInVisibleBounds(tileGrid2ViewStateBinder);
        }

        public static void onViewOutOfVisibleBounds(@NotNull TileGrid2ViewStateBinder tileGrid2ViewStateBinder) {
            ViewHolderLifecycle.DefaultImpls.onViewOutOfVisibleBounds(tileGrid2ViewStateBinder);
        }
    }

    void init(@NotNull k<?> viewHolder, @NotNull TileGrid2BaseViewBinding viewBinding, TopRightButtonAdapter topRightButtonsAdapter, @NotNull TileContentItemsAdapter contentAdapter, @NotNull RecyclerView.u pool, @NotNull TileOverlayBinder overlayBinder);

    void trackView();
}
