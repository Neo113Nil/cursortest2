package ru.ozon.app.android.ugc.widgets.reviewTiles.presentation;

import W10.c;
import WZ.l;
import WZ.t;
import android.os.Parcelable;
import android.view.ViewGroup;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.H;
import androidx.lifecycle.J;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.ugc.widgets.reviewTiles.common.ReviewTilesDecorator;
import ru.ozon.app.android.ugc.widgets.reviewTiles.data.ReviewTilesVO;
import ru.ozon.app.android.video.playerV2.videoController.VideoController;
import ru.ozon.app.android.video.preload.PlayerPreloader;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.common.Paddings;

@Metadata(d1 = {"\u0000\u0089\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004*\u00015\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\u0010\t\u001a\u00060\u0007j\u0002`\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001aH\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001e\u0010\u0012J\u000f\u0010\u001f\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001f\u0010\u0012J\u0017\u0010\"\u001a\u00020\u00102\u0006\u0010!\u001a\u00020 H\u0014¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0010H\u0016¢\u0006\u0004\b$\u0010\u0012J)\u0010)\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010&\u001a\u00020%2\b\u0010(\u001a\u0004\u0018\u00010'H\u0016¢\u0006\u0004\b)\u0010*R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010+R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010,R\u0018\u0010\t\u001a\u00060\u0007j\u0002`\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010-R \u00100\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\u00100.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00106\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u00109\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0018\u0010;\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010@\u001a\u0004\u0018\u00010=8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?¨\u0006A"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewTiles/presentation/ReviewTilesVH;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/ugc/widgets/reviewTiles/data/ReviewTilesVO;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Lru/ozon/app/android/video/preload/PlayerPreloader;", "playerPreloader", "Lru/ozon/app/android/video/playerV2/videoController/VideoController;", "videoController", "<init>", "(Landroidx/recyclerview/widget/RecyclerView;Lru/ozon/app/android/composer/ComposerReferences;LWZ/l;Lru/ozon/app/android/video/preload/PlayerPreloader;Lru/ozon/app/android/video/playerV2/videoController/VideoController;)V", "", "saveScrollState", "()V", "item", "updateItemDecorationIfNeeded", "(Lru/ozon/app/android/ugc/widgets/reviewTiles/data/ReviewTilesVO;)V", "", "itemBackground", "setBackgroundIfNeeded", "(Ljava/lang/String;)V", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/ugc/widgets/reviewTiles/data/ReviewTilesVO;Ll20/d;)V", "onViewInOverlapBounds", "onViewOutOfOverlapBounds", "Landroidx/lifecycle/J;", "lifecycle", "onAttachViewModel", "(Landroidx/lifecycle/J;)V", "onDetach", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/ugc/widgets/reviewTiles/data/ReviewTilesVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Landroidx/recyclerview/widget/RecyclerView;", "Lru/ozon/app/android/composer/ComposerReferences;", "LWZ/l;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/ugc/widgets/reviewTiles/presentation/VideoPlaybackManager;", "videoPlaybackManager", "Lru/ozon/app/android/ugc/widgets/reviewTiles/presentation/VideoPlaybackManager;", "ru/ozon/app/android/ugc/widgets/reviewTiles/presentation/ReviewTilesVH$lifecycleObserver$1", "lifecycleObserver", "Lru/ozon/app/android/ugc/widgets/reviewTiles/presentation/ReviewTilesVH$lifecycleObserver$1;", "Lru/ozon/app/android/ugc/widgets/reviewTiles/presentation/ReviewTilesAdapter;", "adapter", "Lru/ozon/app/android/ugc/widgets/reviewTiles/presentation/ReviewTilesAdapter;", "lastBackgroundColor", "Ljava/lang/String;", "Lru/ozon/app/android/ugc/widgets/reviewTiles/presentation/ReviewTilesViewModel;", "getViewModel", "()Lru/ozon/app/android/ugc/widgets/reviewTiles/presentation/ReviewTilesViewModel;", "viewModel", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ReviewTilesVH extends k<ReviewTilesVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final ReviewTilesAdapter adapter;
    private String lastBackgroundColor;

    @NotNull
    private final ReviewTilesVH$lifecycleObserver$1 lifecycleObserver;

    @NotNull
    private final RecyclerView recyclerView;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final VideoPlaybackManager videoPlaybackManager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [androidx.lifecycle.I, ru.ozon.app.android.ugc.widgets.reviewTiles.presentation.ReviewTilesVH$lifecycleObserver$1] */
    public ReviewTilesVH(@NotNull RecyclerView recyclerView, @NotNull ComposerReferences refs, @NotNull l tokenizedAnalytics, @NotNull PlayerPreloader playerPreloader, @NotNull VideoController videoController) {
        super(recyclerView);
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(playerPreloader, "playerPreloader");
        Intrinsics.checkNotNullParameter(videoController, "videoController");
        this.recyclerView = recyclerView;
        this.refs = refs;
        this.tokenizedAnalytics = tokenizedAnalytics;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(refs, this).buildHandler();
        this.actionHandler = buildHandler;
        VideoPlaybackManager videoPlaybackManager = new VideoPlaybackManager(H.a(refs.getContainer().g().getLifecycle()));
        this.videoPlaybackManager = videoPlaybackManager;
        ?? r02 = new DefaultLifecycleObserver() { // from class: ru.ozon.app.android.ugc.widgets.reviewTiles.presentation.ReviewTilesVH$lifecycleObserver$1
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onDestroy(J owner) {
                ComposerReferences composerReferences;
                VideoPlaybackManager videoPlaybackManager2;
                Intrinsics.checkNotNullParameter(owner, "owner");
                composerReferences = ReviewTilesVH.this.refs;
                composerReferences.getContainer().g().getLifecycle().e(this);
                videoPlaybackManager2 = ReviewTilesVH.this.videoPlaybackManager;
                videoPlaybackManager2.clear();
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onStop(J owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                ReviewTilesVH.this.saveScrollState();
            }
        };
        this.lifecycleObserver = r02;
        ReviewTilesAdapter reviewTilesAdapter = new ReviewTilesAdapter(refs.getContainer().g(), buildHandler, playerPreloader, videoController, videoPlaybackManager, tokenizedAnalytics);
        this.adapter = reviewTilesAdapter;
        refs.getContainer().g().getLifecycle().a(r02);
        recyclerView.setRecycledViewPool(refs.getComposerViewPoolProvider().getViewPool());
        recyclerView.setAdapter(reviewTilesAdapter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ReviewTilesViewModel getViewModel() {
        return (ReviewTilesViewModel) getWidgetViewModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void saveScrollState() {
        Parcelable onSaveInstanceState;
        ReviewTilesViewModel viewModel;
        RecyclerView.o layoutManager = this.recyclerView.getLayoutManager();
        if (layoutManager == null || (onSaveInstanceState = layoutManager.onSaveInstanceState()) == null || (viewModel = getViewModel()) == null) {
            return;
        }
        viewModel.setScrollState(onSaveInstanceState);
    }

    private final void setBackgroundIfNeeded(String itemBackground) {
        if (Intrinsics.d(this.lastBackgroundColor, itemBackground)) {
            return;
        }
        Integer parseColor = StyleParser.INSTANCE.parseColor(getContext(), itemBackground);
        this.recyclerView.setBackgroundColor(parseColor != null ? parseColor.intValue() : ThemeExtKt.themeColor(getContext(), R$attr.layerFloor1));
        this.lastBackgroundColor = itemBackground;
    }

    private final void updateItemDecorationIfNeeded(ReviewTilesVO item) {
        Paddings horizontalPadding = item.getHorizontalPadding();
        if (horizontalPadding != null) {
            int px = ResourceExtKt.toPx(horizontalPadding.getPx());
            RecyclerView.n itemDecorationAt = this.recyclerView.getItemDecorationAt(0);
            ReviewTilesDecorator reviewTilesDecorator = itemDecorationAt instanceof ReviewTilesDecorator ? (ReviewTilesDecorator) itemDecorationAt : null;
            if (reviewTilesDecorator == null || reviewTilesDecorator.getEdgesMargin() != px) {
                if (reviewTilesDecorator != null) {
                    this.recyclerView.removeItemDecoration(reviewTilesDecorator);
                }
                this.recyclerView.addItemDecoration(new ReviewTilesDecorator(Dimens.INSTANCE.getDP_4(), px));
            }
        }
    }

    @Override // ru.ozon.composer.ui.widget.k
    protected void onAttachViewModel(@NotNull J lifecycle) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        this.refs.getController().getEvents().observe(lifecycle, new ReviewTilesVH$sam$androidx_lifecycle_Observer$0(new ReviewTilesVH$onAttachViewModel$1(this)));
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onDetach() {
        super.onDetach();
        saveScrollState();
    }

    @Override // jk0.j, lk0.b
    public void onViewInOverlapBounds() {
        super.onViewInOverlapBounds();
        this.videoPlaybackManager.playAll();
    }

    @Override // jk0.j, lk0.b
    public void onViewOutOfOverlapBounds() {
        super.onViewOutOfOverlapBounds();
        this.videoPlaybackManager.stopAll();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull ReviewTilesVO item, @NotNull d info) {
        Parcelable scrollState;
        RecyclerView.o layoutManager;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        updateItemDecorationIfNeeded(item);
        this.recyclerView.setLayoutParams(new ViewGroup.LayoutParams(-1, item.getHeight()));
        String backgroundColor = item.getBackgroundColor();
        if (backgroundColor != null) {
            setBackgroundIfNeeded(backgroundColor);
        }
        this.adapter.submitList(item.getItems());
        ReviewTilesViewModel viewModel = getViewModel();
        if (viewModel == null || (scrollState = viewModel.getScrollState()) == null || (layoutManager = this.recyclerView.getLayoutManager()) == null) {
            return;
        }
        layoutManager.onRestoreInstanceState(scrollState);
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull ReviewTilesVO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, tokenizedEvent, null, 2, null);
        }
    }
}
