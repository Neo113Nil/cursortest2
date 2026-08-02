package ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.searchresultsgrid.bindstrategy.viewbinders;

import androidx.recyclerview.widget.RecyclerView;
import hk0.C6969b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.sheet.DisposableActionHandler;
import ru.ozon.app.android.atoms.rv.atom.AtomItemViewHolderDelegate;
import ru.ozon.app.android.search.databinding.WidgetSearchResultsGridBinding;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.pinchtozoom.PinchToZoomOnboardingHolder;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.presentation.topRightButtons.rv.adapters.TopRightButtonAdapter;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.strategy.ViewHolderLifecycle;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.searchresultsgrid.SearchResultsGridVO;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.searchresultsgrid.bindstrategy.Srv2GridViewBindSteps;
import ru.ozon.app.android.videocover.HorizontalScrollDelegate;
import ru.ozon.app.android.videocover.VideoTileWidgetHolder;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004JQ\u0010\u0014\u001a\u00020\u00132\u0012\u0010\u0007\u001a\u000e\u0012\u0002\b\u00030\u0005j\u0006\u0012\u0002\b\u0003`\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\n\u0010\u000e\u001a\u00060\fj\u0002`\r2\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H&¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001b\u001a\u00020\u001aH&¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/searchresultsgrid/bindstrategy/viewbinders/Srv2GridViewStateBinder;", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/searchresultsgrid/bindstrategy/Srv2GridViewBindSteps;", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/strategy/ViewHolderLifecycle;", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/pinchtozoom/PinchToZoomOnboardingHolder;", "Lru/ozon/app/android/videocover/VideoTileWidgetHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "viewHolder", "Lru/ozon/app/android/search/databinding/WidgetSearchResultsGridBinding;", "viewBinding", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/presentation/topRightButtons/rv/adapters/TopRightButtonAdapter;", "topRightButtonsAdapter", "Lhk0/b;", "Lru/ozon/app/android/uikit/recycler/ItemListAdapter;", "contentAdapter", "", "defaultBackgroundColor", "Lru/ozon/app/android/atoms/rv/atom/AtomItemViewHolderDelegate;", "atomItemViewHolderDelegate", "", "init", "(Lru/ozon/composer/ui/widget/k;Lru/ozon/app/android/search/databinding/WidgetSearchResultsGridBinding;Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/presentation/topRightButtons/rv/adapters/TopRightButtonAdapter;Lhk0/b;ILru/ozon/app/android/atoms/rv/atom/AtomItemViewHolderDelegate;)V", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/searchresultsgrid/SearchResultsGridVO;", "vo", "Lru/ozon/app/android/action/sheet/DisposableActionHandler;", "actionHandler", "Landroidx/recyclerview/widget/RecyclerView$u;", "pool", "prepare", "(Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/searchresultsgrid/SearchResultsGridVO;Lru/ozon/app/android/action/sheet/DisposableActionHandler;Landroidx/recyclerview/widget/RecyclerView$u;)V", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface Srv2GridViewStateBinder extends Srv2GridViewBindSteps, ViewHolderLifecycle, PinchToZoomOnboardingHolder, VideoTileWidgetHolder {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static HorizontalScrollDelegate getHorizontalDelegate(@NotNull Srv2GridViewStateBinder srv2GridViewStateBinder) {
            return VideoTileWidgetHolder.DefaultImpls.getHorizontalDelegate(srv2GridViewStateBinder);
        }

        public static void onRecycle(@NotNull Srv2GridViewStateBinder srv2GridViewStateBinder) {
            ViewHolderLifecycle.DefaultImpls.onRecycle(srv2GridViewStateBinder);
        }

        public static void onViewInVisibleBounds(@NotNull Srv2GridViewStateBinder srv2GridViewStateBinder) {
            ViewHolderLifecycle.DefaultImpls.onViewInVisibleBounds(srv2GridViewStateBinder);
        }

        public static void onViewOutOfVisibleBounds(@NotNull Srv2GridViewStateBinder srv2GridViewStateBinder) {
            ViewHolderLifecycle.DefaultImpls.onViewOutOfVisibleBounds(srv2GridViewStateBinder);
        }
    }

    void init(@NotNull k<?> viewHolder, @NotNull WidgetSearchResultsGridBinding viewBinding, @NotNull TopRightButtonAdapter topRightButtonsAdapter, @NotNull C6969b contentAdapter, int defaultBackgroundColor, @NotNull AtomItemViewHolderDelegate atomItemViewHolderDelegate);

    void prepare(@NotNull SearchResultsGridVO vo, DisposableActionHandler actionHandler, @NotNull RecyclerView.u pool);
}
