package ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.presentation.loading;

import Vg.d;
import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import jk0.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.presentation.loading.adapter.HotelsSearchResultsV5LoadingAdapter;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.presentation.loading.adapter.HotelsSearchResultsV5LoadingSkeletonDecoration;
import ru.ozon.app.android.travel.molecules.view.emptyState.v1.EmptyStateVO;
import ru.ozon.app.android.travel.molecules.view.emptyState.v1.EmptyStateView;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B#\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\u0010\n\u001a\u00060\bj\u0002`\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0012\u0010\u0010J+\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u00022\n\u0010\u0015\u001a\u00060\u0013j\u0002`\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u00022\n\u0010\u0015\u001a\u00060\u0013j\u0002`\u0014H\u0014¢\u0006\u0004\b\u0018\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR \u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u000e0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010#\u001a\u0004\u0018\u00010\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010)\u001a\u0004\u0018\u00010(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010,\u001a\u0004\u0018\u00010+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100¨\u00061"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/loading/HotelsSearchResultsV5SkeletonWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/loading/HotelsSearchResultsV5SkeletonVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;LVg/d;)V", "item", "", "showErrorState", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/loading/HotelsSearchResultsV5SkeletonVO;)V", "state", "handleSkeletonState", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "payload", "bind", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/loading/HotelsSearchResultsV5SkeletonVO;Ll20/d;Ljava/lang/Object;)V", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/loading/HotelsSearchResultsV5SkeletonVO;Ll20/d;)V", "Ljk0/q;", "onVisibleAreaChanged", "(Ljk0/q;)V", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Landroid/widget/FrameLayout;", "container", "Landroid/widget/FrameLayout;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/loading/adapter/HotelsSearchResultsV5LoadingAdapter;", "loadAdapter", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/loading/adapter/HotelsSearchResultsV5LoadingAdapter;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "Lru/ozon/app/android/travel/molecules/view/emptyState/v1/EmptyStateView;", "emptyStateView", "Lru/ozon/app/android/travel/molecules/view/emptyState/v1/EmptyStateView;", "", "dp8", "I", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsSearchResultsV5SkeletonWidgetViewHolder extends k<HotelsSearchResultsV5SkeletonVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;
    private final FrameLayout container;
    private final int dp8;
    private final EmptyStateView emptyStateView;

    @NotNull
    private final HotelsSearchResultsV5LoadingAdapter loadAdapter;
    private final RecyclerView recyclerView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HotelsSearchResultsV5SkeletonWidgetViewHolder(@NotNull View containerView, @NotNull ComposerReferences refs, @NotNull d customActionHandlersStoreFactory) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        this.actionHandler = new ActionHandler.Builder(refs, this).customActionHandlers(new HotelsSearchResultsV5SkeletonWidgetViewHolder$actionHandler$1(customActionHandlersStoreFactory)).buildHandler();
        FrameLayout frameLayout = containerView instanceof FrameLayout ? (FrameLayout) containerView : null;
        this.container = frameLayout;
        HotelsSearchResultsV5LoadingAdapter hotelsSearchResultsV5LoadingAdapter = new HotelsSearchResultsV5LoadingAdapter();
        this.loadAdapter = hotelsSearchResultsV5LoadingAdapter;
        View childAt = frameLayout != null ? frameLayout.getChildAt(0) : null;
        RecyclerView recyclerView = childAt instanceof RecyclerView ? (RecyclerView) childAt : null;
        if (recyclerView != null) {
            recyclerView.setAdapter(hotelsSearchResultsV5LoadingAdapter);
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
            Context context = recyclerView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            recyclerView.addItemDecoration(new HotelsSearchResultsV5LoadingSkeletonDecoration(context));
        } else {
            recyclerView = null;
        }
        this.recyclerView = recyclerView;
        KeyEvent.Callback childAt2 = frameLayout != null ? frameLayout.getChildAt(1) : null;
        this.emptyStateView = childAt2 instanceof EmptyStateView ? (EmptyStateView) childAt2 : null;
        this.dp8 = ResourceExtKt.toPx(8, getContext());
    }

    private final void handleSkeletonState(HotelsSearchResultsV5SkeletonVO state) {
        this.loadAdapter.setItems(state.getHotelsSkeletons());
        EmptyStateView emptyStateView = this.emptyStateView;
        if (emptyStateView != null) {
            ViewExtKt.gone(emptyStateView);
        }
        RecyclerView recyclerView = this.recyclerView;
        if (recyclerView != null) {
            ViewExtKt.show(recyclerView);
        }
    }

    private final void showErrorState(HotelsSearchResultsV5SkeletonVO item) {
        EmptyStateVO asyncErrorMessage = item.getAsyncErrorMessage();
        if (asyncErrorMessage != null) {
            FrameLayout frameLayout = this.container;
            if (frameLayout != null) {
                int i11 = this.dp8;
                frameLayout.setPadding(0, i11, 0, i11);
            }
            EmptyStateView emptyStateView = this.emptyStateView;
            if (emptyStateView != null) {
                emptyStateView.bind(asyncErrorMessage, this.actionHandler);
            }
            EmptyStateView emptyStateView2 = this.emptyStateView;
            if (emptyStateView2 != null) {
                ViewExtKt.show(emptyStateView2);
            }
            RecyclerView recyclerView = this.recyclerView;
            if (recyclerView != null) {
                ViewExtKt.gone(recyclerView);
            }
        }
    }

    @Override // jk0.j, jk0.n
    public void onVisibleAreaChanged(@NotNull q info) {
        FrameLayout frameLayout;
        EmptyStateView emptyStateView;
        Intrinsics.checkNotNullParameter(info, "info");
        super.onVisibleAreaChanged(info);
        int height = getViewHolderPositionInfo().a().e().height();
        int height2 = (getViewHolderPositionInfo().a().d().height() + height) - (info.b().top - info.a().e().top);
        FrameLayout frameLayout2 = this.container;
        if ((frameLayout2 == null || frameLayout2.getHeight() != height2) && height > 0 && (frameLayout = this.container) != null) {
            ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.height = height2;
            frameLayout.setLayoutParams(layoutParams);
        }
        EmptyStateView emptyStateView2 = this.emptyStateView;
        if ((emptyStateView2 == null || emptyStateView2.getHeight() != height2) && height > 0 && (emptyStateView = this.emptyStateView) != null) {
            ViewGroup.LayoutParams layoutParams2 = emptyStateView.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams2.height = height2;
            emptyStateView.setLayoutParams(layoutParams2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull HotelsSearchResultsV5SkeletonVO item, @NotNull l20.d info, @NotNull Object payload) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(payload, "payload");
        if (payload == HotelsSearchResultsV5SkeletonPayloads.SHOW_ERROR) {
            showErrorState(item);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull HotelsSearchResultsV5SkeletonVO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        handleSkeletonState(item);
    }
}
