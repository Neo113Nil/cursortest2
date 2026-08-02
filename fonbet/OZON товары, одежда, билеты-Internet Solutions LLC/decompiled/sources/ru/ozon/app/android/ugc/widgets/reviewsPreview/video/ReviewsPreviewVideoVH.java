package ru.ozon.app.android.ugc.widgets.reviewsPreview.video;

import Sc.o;
import W10.c;
import WZ.l;
import WZ.m;
import WZ.t;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.ugc.widgets.reviewsPreview.common.ReviewsPreviewViewModel;
import ru.ozon.app.android.ugc.widgets.reviewsPreview.data.ReviewsPreviewDTO;
import ru.ozon.app.android.ugc.widgets.reviewsPreview.data.ReviewsPreviewVO;
import ru.ozon.app.android.ugc.widgets.reviewsPreview.video.ReviewsPreviewVideoVH;
import ru.ozon.app.android.video.preload.PlayerPreloader;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 =2\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003:\u0002=>B7\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u00022\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010#\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020!H\u0014¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0016H\u0016¢\u0006\u0004\b%\u0010 J\u000f\u0010&\u001a\u00020\u0016H\u0016¢\u0006\u0004\b&\u0010 J)\u0010+\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010(\u001a\u00020'2\b\u0010*\u001a\u0004\u0018\u00010)H\u0016¢\u0006\u0004\b+\u0010,R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010-R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010.R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010/R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00100R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00101R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u00102R \u00105\u001a\u000e\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\u0016038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u001c\u0010;\u001a\b\u0018\u00010:R\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<¨\u0006?"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewsPreview/video/ReviewsPreviewVideoVH;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/ugc/widgets/reviewsPreview/data/ReviewsPreviewVO$ReviewsPreviewVideoVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/ugc/widgets/reviewsPreview/video/ReviewsPreviewVideoView;", "view", "LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/video/preload/PlayerPreloader;", "playerPreloader", "Lru/ozon/app/android/ugc/widgets/reviewsPreview/video/ReviewsPreviewVideoDelegate;", "videoDelegate", "Lru/ozon/app/android/ugc/widgets/reviewsPreview/common/ReviewsPreviewViewModel;", "viewModel", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "<init>", "(Lru/ozon/app/android/ugc/widgets/reviewsPreview/video/ReviewsPreviewVideoView;LWZ/l;Lru/ozon/app/android/video/preload/PlayerPreloader;Lru/ozon/app/android/ugc/widgets/reviewsPreview/video/ReviewsPreviewVideoDelegate;Lru/ozon/app/android/ugc/widgets/reviewsPreview/common/ReviewsPreviewViewModel;Lru/ozon/app/android/composer/ComposerReferences;)V", "item", "Lkotlin/Function0;", "", "blockOnEntry", "", "setupCoordinatedBlock", "(Lru/ozon/app/android/ugc/widgets/reviewsPreview/data/ReviewsPreviewVO$ReviewsPreviewVideoVO;Lkotlin/jvm/functions/Function0;)V", "resetScore", "(Lru/ozon/app/android/ugc/widgets/reviewsPreview/data/ReviewsPreviewVO$ReviewsPreviewVideoVO;)V", "", "pairId", "attachScrollListener", "(J)V", "detachScrollListener", "()V", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/ugc/widgets/reviewsPreview/data/ReviewsPreviewVO$ReviewsPreviewVideoVO;Ll20/d;)V", "onViewInOverlapBounds", "onViewOutOfVisibleBounds", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/ugc/widgets/reviewsPreview/data/ReviewsPreviewVO$ReviewsPreviewVideoVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Lru/ozon/app/android/ugc/widgets/reviewsPreview/video/ReviewsPreviewVideoView;", "LWZ/l;", "Lru/ozon/app/android/video/preload/PlayerPreloader;", "Lru/ozon/app/android/ugc/widgets/reviewsPreview/video/ReviewsPreviewVideoDelegate;", "Lru/ozon/app/android/ugc/widgets/reviewsPreview/common/ReviewsPreviewViewModel;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "Lru/ozon/app/android/ugc/widgets/reviewsPreview/video/ReviewsPreviewVideoVH$CenterScoreScrollListener;", "scrollListener", "Lru/ozon/app/android/ugc/widgets/reviewsPreview/video/ReviewsPreviewVideoVH$CenterScoreScrollListener;", "Companion", "CenterScoreScrollListener", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ReviewsPreviewVideoVH extends k<ReviewsPreviewVO.ReviewsPreviewVideoVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final Handler handler;

    @NotNull
    private final PlayerPreloader playerPreloader;

    @NotNull
    private final ComposerReferences refs;
    private CenterScoreScrollListener scrollListener;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final ReviewsPreviewVideoDelegate videoDelegate;

    @NotNull
    private final ReviewsPreviewVideoView view;

    @NotNull
    private final ReviewsPreviewViewModel viewModel;
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u0015\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewsPreview/video/ReviewsPreviewVideoVH$CenterScoreScrollListener;", "Landroidx/recyclerview/widget/RecyclerView$t;", "", "pairId", "<init>", "(Lru/ozon/app/android/ugc/widgets/reviewsPreview/video/ReviewsPreviewVideoVH;J)V", "", "calculateCenterScore", "()F", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "dx", "dy", "", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", "updateScore", "()V", "J", "screenHeight", "I", "centerZoneTop", "F", "centerZoneBottom", "", "location", "[I", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    final class CenterScoreScrollListener extends RecyclerView.t {
        private final float centerZoneBottom;
        private final float centerZoneTop;

        @NotNull
        private final int[] location;
        private final long pairId;
        private final int screenHeight;

        public CenterScoreScrollListener(long j11) {
            this.pairId = j11;
            int i11 = ReviewsPreviewVideoVH.this.view.getResources().getDisplayMetrics().heightPixels;
            this.screenHeight = i11;
            this.centerZoneTop = i11 * 0.25f;
            this.centerZoneBottom = i11 * 0.75f;
            this.location = new int[2];
        }

        private final float calculateCenterScore() {
            if (ReviewsPreviewVideoVH.this.view.getHeight() == 0) {
                return 0.0f;
            }
            ReviewsPreviewVideoVH.this.view.getLocationOnScreen(this.location);
            float f7 = this.location[1];
            return Math.max(0.0f, Math.min(ReviewsPreviewVideoVH.this.view.getHeight() + f7, this.centerZoneBottom) - Math.max(f7, this.centerZoneTop)) / ReviewsPreviewVideoVH.this.view.getHeight();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void onScrolled(@NotNull RecyclerView recyclerView, int dx, int dy) {
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            updateScore();
        }

        public final void updateScore() {
            ReviewsPreviewVideoVH.this.viewModel.updateScore(this.pairId, calculateCenterScore());
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ReviewsPreviewDTO.PlaybackType.values().length];
            try {
                iArr[ReviewsPreviewDTO.PlaybackType.PLAYBACK_TYPE_SIMULTANEOUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ReviewsPreviewDTO.PlaybackType.PLAYBACK_TYPE_SEQUENTIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ReviewsPreviewDTO.PlaybackType.PLAYBACK_TYPE_RANDOM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewsPreviewVideoVH(@NotNull ReviewsPreviewVideoView view, @NotNull l tokenizedAnalytics, @NotNull PlayerPreloader playerPreloader, @NotNull ReviewsPreviewVideoDelegate videoDelegate, @NotNull ReviewsPreviewViewModel viewModel, @NotNull ComposerReferences refs) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(playerPreloader, "playerPreloader");
        Intrinsics.checkNotNullParameter(videoDelegate, "videoDelegate");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(refs, "refs");
        this.view = view;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.playerPreloader = playerPreloader;
        this.videoDelegate = videoDelegate;
        this.viewModel = viewModel;
        this.refs = refs;
        this.actionHandler = new ActionHandler.Builder(refs, this).onComposerAction(new ReviewsPreviewVideoVH$actionHandler$1(viewModel)).buildHandler();
        this.handler = new Handler(Looper.getMainLooper());
        view.setOnClickListener(new DS.a(this, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(ReviewsPreviewVideoVH reviewsPreviewVideoVH, View view) {
        ReviewsPreviewVO.ReviewsPreviewVideoVO boundData = reviewsPreviewVideoVH.getBoundData();
        if (boundData != null) {
            if ((boundData.getClickAction() instanceof AtomAction.Move) && boundData.getFullVideoInfo() != null) {
                PlayerPreloader.DefaultImpls.preCreatePlayer$default(reviewsPreviewVideoVH.playerPreloader, boundData.getFullVideoInfo(), null, 2, null);
            }
            AtomAction clickAction = boundData.getClickAction();
            if (clickAction != null) {
                reviewsPreviewVideoVH.actionHandler.invoke(clickAction);
            }
        }
    }

    private final void attachScrollListener(long pairId) {
        View view;
        RecyclerView composerRecyclerView;
        final CenterScoreScrollListener centerScoreScrollListener = new CenterScoreScrollListener(pairId);
        this.scrollListener = centerScoreScrollListener;
        ComponentCallbacksC5392m c11 = this.refs.getContainer().c();
        if (c11 != null && (view = c11.getView()) != null && (composerRecyclerView = ComposerViewExtensionKt.composerRecyclerView(view)) != null) {
            composerRecyclerView.addOnScrollListener(centerScoreScrollListener);
        }
        this.handler.post(new Runnable() { // from class: ru.ozon.app.android.ugc.widgets.reviewsPreview.video.a
            @Override // java.lang.Runnable
            public final void run() {
                ReviewsPreviewVideoVH.CenterScoreScrollListener.this.updateScore();
            }
        });
    }

    private final void detachScrollListener() {
        View view;
        RecyclerView composerRecyclerView;
        ComponentCallbacksC5392m c11 = this.refs.getContainer().c();
        if (c11 == null || (view = c11.getView()) == null || (composerRecyclerView = ComposerViewExtensionKt.composerRecyclerView(view)) == null) {
            return;
        }
        CenterScoreScrollListener centerScoreScrollListener = this.scrollListener;
        if (centerScoreScrollListener != null) {
            composerRecyclerView.removeOnScrollListener(centerScoreScrollListener);
        }
        this.scrollListener = null;
    }

    private final void resetScore(ReviewsPreviewVO.ReviewsPreviewVideoVO item) {
        this.handler.removeCallbacksAndMessages(null);
        this.videoDelegate.setOnVideoLooped(null);
        this.viewModel.updateScore(item.getPairId(), 0.0f);
    }

    private final void setupCoordinatedBlock(ReviewsPreviewVO.ReviewsPreviewVideoVO item, Function0<Integer> blockOnEntry) {
        this.viewModel.onBlockEnterBounds(item.getPairId(), item.getBlockIndex(), blockOnEntry, new ReviewsPreviewVideoVH$setupCoordinatedBlock$2(this, item), new ReviewsPreviewVideoVH$setupCoordinatedBlock$3(this));
        detachScrollListener();
        attachScrollListener(item.getPairId());
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void setupCoordinatedBlock$default(ReviewsPreviewVideoVH reviewsPreviewVideoVH, ReviewsPreviewVO.ReviewsPreviewVideoVO reviewsPreviewVideoVO, Function0 function0, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            function0 = ReviewsPreviewVideoVH$setupCoordinatedBlock$1.INSTANCE;
        }
        reviewsPreviewVideoVH.setupCoordinatedBlock(reviewsPreviewVideoVO, function0);
    }

    @Override // jk0.j, lk0.b
    public void onViewInOverlapBounds() {
        super.onViewInOverlapBounds();
        ReviewsPreviewVO.ReviewsPreviewVideoVO boundData = getBoundData();
        if (boundData != null) {
            AtomAction viewedItemAction = boundData.getViewedItemAction();
            if (viewedItemAction != null) {
                this.actionHandler.invoke(viewedItemAction);
            }
            int i11 = WhenMappings.$EnumSwitchMapping$0[boundData.getPlaybackType().ordinal()];
            if (i11 == 1) {
                this.videoDelegate.onViewInOverlapBounds(boundData.getVideoInfo(), this.view.getPlayerView(), this.view);
            } else if (i11 == 2) {
                setupCoordinatedBlock$default(this, boundData, null, 2, null);
            } else {
                if (i11 != 3) {
                    throw new o();
                }
                setupCoordinatedBlock(boundData, ReviewsPreviewVideoVH$onViewInOverlapBounds$1$2.INSTANCE);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001e, code lost:
    
        if ((r0 != null ? r0.getPlaybackType() : null) == ru.ozon.app.android.ugc.widgets.reviewsPreview.data.ReviewsPreviewDTO.PlaybackType.PLAYBACK_TYPE_RANDOM) goto L12;
     */
    @Override // jk0.j, lk0.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onViewOutOfVisibleBounds() {
        super.onViewOutOfVisibleBounds();
        ReviewsPreviewVO.ReviewsPreviewVideoVO boundData = getBoundData();
        if ((boundData != null ? boundData.getPlaybackType() : null) != ReviewsPreviewDTO.PlaybackType.PLAYBACK_TYPE_SEQUENTIAL) {
        }
        resetScore(boundData);
        this.videoDelegate.onVideoTileOutOfVisibleBounds(this.view.getPlayerView());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull ReviewsPreviewVO.ReviewsPreviewVideoVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.view.bind(item);
        this.videoDelegate.bindAnalytics(item.getVideoStartEvent(), item.getVideoEndEvent());
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull ReviewsPreviewVO.ReviewsPreviewVideoVO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            m.c(this.tokenizedAnalytics, tokenizedEvent, null);
        }
        t itemTokenizedEvent = item.getItemTokenizedEvent();
        if (itemTokenizedEvent != null) {
            m.c(this.tokenizedAnalytics, itemTokenizedEvent, null);
        }
    }
}
