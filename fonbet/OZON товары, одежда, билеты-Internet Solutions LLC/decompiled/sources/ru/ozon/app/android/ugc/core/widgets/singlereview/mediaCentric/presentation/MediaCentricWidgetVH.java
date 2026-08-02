package ru.ozon.app.android.ugc.core.widgets.singlereview.mediaCentric.presentation;

import Ae.C2399j;
import Ae.C2408n0;
import Ae.M0;
import U7.d;
import WZ.l;
import WZ.t;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import java.util.List;
import jk0.o;
import jk0.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.ReviewGalleryV2ProductButtonBinder;
import ru.ozon.app.android.ugc.core.widgets.singlereview.mediaCentric.presentation.MediaCentricVO;
import ru.ozon.app.android.ugc.core.widgets.singlereview.mediaCentric.views.MediaCentricItemsAdapter;
import ru.ozon.app.android.ugc.core.widgets.singlereview.mediaCentric.views.MediaCentricView;
import ru.ozon.app.android.ugc.core.widgets.singlereview.mediaCentric.views.ReviewProductTileAdapter;
import ru.ozon.app.android.video.playerV2.videoController.VideoController;
import ru.ozon.app.android.video.preload.PlayerPreloader;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 ;2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001;B7\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001aH\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0011H\u0016¢\u0006\u0004\b!\u0010\u0013J)\u0010&\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\"2\b\u0010%\u001a\u0004\u0018\u00010$H\u0016¢\u0006\u0004\b&\u0010'R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010(R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010)R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010*R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010+R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010,R \u0010/\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u00110-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u0010:\u001a\u0004\u0018\u0001078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b8\u00109¨\u0006<"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/singlereview/mediaCentric/presentation/MediaCentricWidgetVH;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/ugc/core/widgets/singlereview/mediaCentric/presentation/MediaCentricVO;", "Lru/ozon/app/android/ugc/core/widgets/singlereview/mediaCentric/views/MediaCentricView;", "view", "LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/ReviewGalleryV2ProductButtonBinder;", "cartButtonBinder", "Lru/ozon/app/android/video/preload/PlayerPreloader;", "playerPreloader", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/video/playerV2/videoController/VideoController;", "videoController", "<init>", "(Lru/ozon/app/android/ugc/core/widgets/singlereview/mediaCentric/views/MediaCentricView;LWZ/l;Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/ReviewGalleryV2ProductButtonBinder;Lru/ozon/app/android/video/preload/PlayerPreloader;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/video/playerV2/videoController/VideoController;)V", "", "initLifecycleObserver", "()V", "observeSwipeRefresh", "Landroidx/lifecycle/J;", "lifecycle", "onAttachViewModel", "(Landroidx/lifecycle/J;)V", "item", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/ugc/core/widgets/singlereview/mediaCentric/presentation/MediaCentricVO;Ll20/d;)V", "Ljk0/q;", "onVisibleAreaChanged", "(Ljk0/q;)V", "onRecycle", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/ugc/core/widgets/singlereview/mediaCentric/presentation/MediaCentricVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Lru/ozon/app/android/ugc/core/widgets/singlereview/mediaCentric/views/MediaCentricView;", "LWZ/l;", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/ReviewGalleryV2ProductButtonBinder;", "Lru/ozon/app/android/video/preload/PlayerPreloader;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/ugc/core/widgets/singlereview/mediaCentric/views/MediaCentricItemsAdapter;", "itemsAdapter", "Lru/ozon/app/android/ugc/core/widgets/singlereview/mediaCentric/views/MediaCentricItemsAdapter;", "Lru/ozon/app/android/ugc/core/widgets/singlereview/mediaCentric/views/ReviewProductTileAdapter;", "productsAdapter", "Lru/ozon/app/android/ugc/core/widgets/singlereview/mediaCentric/views/ReviewProductTileAdapter;", "Lru/ozon/app/android/ugc/core/widgets/singlereview/mediaCentric/presentation/MediaCentricViewModel;", "getViewModel", "()Lru/ozon/app/android/ugc/core/widgets/singlereview/mediaCentric/presentation/MediaCentricViewModel;", "viewModel", "Companion", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MediaCentricWidgetVH extends k<MediaCentricVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final ReviewGalleryV2ProductButtonBinder cartButtonBinder;

    @NotNull
    private final MediaCentricItemsAdapter itemsAdapter;

    @NotNull
    private final PlayerPreloader playerPreloader;

    @NotNull
    private final ReviewProductTileAdapter productsAdapter;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final MediaCentricView view;
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "position", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.ugc.core.widgets.singlereview.mediaCentric.presentation.MediaCentricWidgetVH$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<Integer, Unit> {
        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
            invoke(num.intValue());
            return Unit.f71690a;
        }

        public final void invoke(int i11) {
            MediaCentricViewModel viewModel = MediaCentricWidgetVH.this.getViewModel();
            if (viewModel != null) {
                viewModel.setCurrentItemPosition(i11);
            }
            MediaCentricVO boundData = MediaCentricWidgetVH.this.getBoundData();
            if (boundData != null) {
                boundData.setSelectedPosition(i11);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaCentricWidgetVH(@NotNull MediaCentricView view, @NotNull l tokenizedAnalytics, @NotNull ReviewGalleryV2ProductButtonBinder cartButtonBinder, @NotNull PlayerPreloader playerPreloader, @NotNull ComposerReferences refs, @NotNull VideoController videoController) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(cartButtonBinder, "cartButtonBinder");
        Intrinsics.checkNotNullParameter(playerPreloader, "playerPreloader");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(videoController, "videoController");
        this.view = view;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.cartButtonBinder = cartButtonBinder;
        this.playerPreloader = playerPreloader;
        this.refs = refs;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(refs, this).onComposerAction(new MediaCentricWidgetVH$actionHandler$1(this)).buildHandler();
        this.actionHandler = buildHandler;
        MediaCentricItemsAdapter mediaCentricItemsAdapter = new MediaCentricItemsAdapter(this, view.getProgressBar(), videoController, buildHandler, tokenizedAnalytics, new MediaCentricWidgetVH$itemsAdapter$1(playerPreloader));
        this.itemsAdapter = mediaCentricItemsAdapter;
        ReviewProductTileAdapter reviewProductTileAdapter = new ReviewProductTileAdapter(cartButtonBinder, buildHandler, tokenizedAnalytics);
        this.productsAdapter = reviewProductTileAdapter;
        initLifecycleObserver();
        view.setupView(mediaCentricItemsAdapter, reviewProductTileAdapter, new AnonymousClass1());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MediaCentricViewModel getViewModel() {
        return (MediaCentricViewModel) getWidgetViewModel();
    }

    private final void initLifecycleObserver() {
        d.c(this.refs).a(new DefaultLifecycleObserver() { // from class: ru.ozon.app.android.ugc.core.widgets.singlereview.mediaCentric.presentation.MediaCentricWidgetVH$initLifecycleObserver$1
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onDestroy(J owner) {
                MediaCentricView mediaCentricView;
                Intrinsics.checkNotNullParameter(owner, "owner");
                mediaCentricView = MediaCentricWidgetVH.this.view;
                mediaCentricView.clear();
                owner.getLifecycle().e(this);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onPause(J owner) {
                MediaCentricView mediaCentricView;
                Intrinsics.checkNotNullParameter(owner, "owner");
                mediaCentricView = MediaCentricWidgetVH.this.view;
                mediaCentricView.pauseVideoIfNeeded();
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onResume(J owner) {
                MediaCentricView mediaCentricView;
                Intrinsics.checkNotNullParameter(owner, "owner");
                mediaCentricView = MediaCentricWidgetVH.this.view;
                mediaCentricView.resumeVideoIfNeeded(true);
            }
        });
    }

    private final void observeSwipeRefresh() {
        this.refs.getController().getEvents().observe(this.refs.getContainer().g(), new MediaCentricWidgetVH$sam$androidx_lifecycle_Observer$0(new MediaCentricWidgetVH$observeSwipeRefresh$1(this)));
    }

    @Override // ru.ozon.composer.ui.widget.k
    protected void onAttachViewModel(@NotNull J lifecycle) {
        M0<List<MediaCentricVO.MediaItemVO>> items;
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        observeSwipeRefresh();
        this.itemsAdapter.setMediaCentricViewModel(getViewModel());
        MediaCentricViewModel viewModel = getViewModel();
        if (viewModel == null || (items = viewModel.getItems()) == null) {
            return;
        }
        C2399j.C(new C2408n0(items, new MediaCentricWidgetVH$onAttachViewModel$1(this, null)), K.a(lifecycle));
    }

    @Override // jk0.j
    public void onRecycle() {
        super.onRecycle();
        this.cartButtonBinder.unbind();
    }

    @Override // jk0.j, jk0.n
    public void onVisibleAreaChanged(@NotNull q info) {
        AtomAction reviewViewAction;
        Intrinsics.checkNotNullParameter(info, "info");
        super.onVisibleAreaChanged(info);
        View itemView = this.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        if (o.a(itemView, info, true) < 0.5d) {
            MediaCentricViewModel viewModel = getViewModel();
            if (viewModel != null) {
                viewModel.pauseVideo();
                return;
            }
            return;
        }
        MediaCentricVO boundData = getBoundData();
        if (boundData != null && (reviewViewAction = boundData.getReviewViewAction()) != null) {
            this.actionHandler.invoke(reviewViewAction);
        }
        MediaCentricViewModel viewModel2 = getViewModel();
        if (viewModel2 != null) {
            viewModel2.resumeVideo();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008c, code lost:
    
        if (r6 != (r4 != null ? r4.bottomMargin : 0)) goto L34;
     */
    @Override // ru.ozon.composer.ui.widget.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void bind(@NotNull MediaCentricVO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        double doubleValue = ResourceExtKt.getDisplaySizePx(getContext()).e().doubleValue() * (item.getAspectRatio().getHeightRatio() / item.getAspectRatio().getWidthRatio());
        MediaCentricViewModel viewModel = getViewModel();
        if (viewModel != null) {
            viewModel.setupViewModel(item);
        }
        MediaCentricView mediaCentricView = this.view;
        ViewGroup.LayoutParams layoutParams = mediaCentricView.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            int i11 = marginLayoutParams.topMargin;
            int i12 = marginLayoutParams.rightMargin;
            int i13 = marginLayoutParams.bottomMargin;
            marginLayoutParams.height = (int) doubleValue;
            ViewGroup.LayoutParams layoutParams2 = mediaCentricView.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
            if (i11 == (marginLayoutParams2 != null ? marginLayoutParams2.topMargin : 0)) {
                ViewGroup.LayoutParams layoutParams3 = mediaCentricView.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
                if (i12 == (marginLayoutParams3 != null ? marginLayoutParams3.rightMargin : 0)) {
                    ViewGroup.LayoutParams layoutParams4 = mediaCentricView.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
                }
            }
            mediaCentricView.setLayoutParams(marginLayoutParams);
        }
        this.view.bind(item, this.cartButtonBinder, this.actionHandler, this.tokenizedAnalytics);
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull MediaCentricVO item, @NotNull W10.c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((MediaCentricWidgetVH) item, trackingData, viewedPond);
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, tokenizedEvent, null, 2, null);
        }
    }
}
