package ru.ozon.app.android.ugc.widgets.reviewTiles.presentation.viewholders;

import WZ.l;
import WZ.t;
import android.view.View;
import android.view.ViewGroup;
import jk0.j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.ugc.widgets.reviewTiles.data.ReviewTilesVO;
import ru.ozon.app.android.ugc.widgets.reviewTiles.presentation.ReviewTilesVideoDelegate;
import ru.ozon.app.android.ugc.widgets.reviewTiles.presentation.ReviewTilesView;
import ru.ozon.app.android.ugc.widgets.reviewTiles.presentation.VideoPlaybackManager;
import ru.ozon.app.android.ugc.widgets.reviewTiles.presentation.viewholders.VideoViewHolder;
import ru.ozon.app.android.video.preload.PlayerPreloader;
import ru.ozon.app.android.video.preload.data.PreloadVideoInfo;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0001\u0018\u0000 +2\u00020\u0001:\u0001+B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\u0010\f\u001a\u00060\nj\u0002`\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J)\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00132\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u000f0\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u000f¢\u0006\u0004\b\u001d\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b%\u0010&R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010'R\u0018\u0010\f\u001a\u00060\nj\u0002`\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010(R\u0018\u0010)\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006,"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewTiles/presentation/viewholders/VideoViewHolder;", "Ljk0/j;", "Lru/ozon/app/android/ugc/widgets/reviewTiles/presentation/ReviewTilesView;", "view", "Lru/ozon/app/android/ugc/widgets/reviewTiles/presentation/ReviewTilesVideoDelegate;", "videoDelegate", "Lru/ozon/app/android/video/preload/PlayerPreloader;", "playerPreloader", "Lru/ozon/app/android/ugc/widgets/reviewTiles/presentation/VideoPlaybackManager;", "videoPlaybackManager", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "<init>", "(Lru/ozon/app/android/ugc/widgets/reviewTiles/presentation/ReviewTilesView;Lru/ozon/app/android/ugc/widgets/reviewTiles/presentation/ReviewTilesVideoDelegate;Lru/ozon/app/android/video/preload/PlayerPreloader;Lru/ozon/app/android/ugc/widgets/reviewTiles/presentation/VideoPlaybackManager;LWZ/l;)V", "", "onViewInOverlapBounds", "()V", "onViewOutOfOverlapBounds", "Lru/ozon/app/android/ugc/widgets/reviewTiles/data/ReviewTilesVO$Content$Media$Video;", "item", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "bind", "(Lru/ozon/app/android/ugc/widgets/reviewTiles/data/ReviewTilesVO$Content$Media$Video;Lkotlin/jvm/functions/Function1;)V", "", "startPlayback", "()Z", "stopPlayback", "Lru/ozon/app/android/ugc/widgets/reviewTiles/presentation/ReviewTilesView;", "getView", "()Lru/ozon/app/android/ugc/widgets/reviewTiles/presentation/ReviewTilesView;", "Lru/ozon/app/android/ugc/widgets/reviewTiles/presentation/ReviewTilesVideoDelegate;", "getVideoDelegate", "()Lru/ozon/app/android/ugc/widgets/reviewTiles/presentation/ReviewTilesVideoDelegate;", "Lru/ozon/app/android/video/preload/PlayerPreloader;", "getPlayerPreloader", "()Lru/ozon/app/android/video/preload/PlayerPreloader;", "Lru/ozon/app/android/ugc/widgets/reviewTiles/presentation/VideoPlaybackManager;", "LWZ/l;", "currentItem", "Lru/ozon/app/android/ugc/widgets/reviewTiles/data/ReviewTilesVO$Content$Media$Video;", "Companion", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class VideoViewHolder extends j {
    private ReviewTilesVO.Content.Media.Video currentItem;

    @NotNull
    private final PlayerPreloader playerPreloader;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final ReviewTilesVideoDelegate videoDelegate;

    @NotNull
    private final VideoPlaybackManager videoPlaybackManager;

    @NotNull
    private final ReviewTilesView view;
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoViewHolder(@NotNull ReviewTilesView view, @NotNull ReviewTilesVideoDelegate videoDelegate, @NotNull PlayerPreloader playerPreloader, @NotNull VideoPlaybackManager videoPlaybackManager, @NotNull l tokenizedAnalytics) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(videoDelegate, "videoDelegate");
        Intrinsics.checkNotNullParameter(playerPreloader, "playerPreloader");
        Intrinsics.checkNotNullParameter(videoPlaybackManager, "videoPlaybackManager");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.view = view;
        this.videoDelegate = videoDelegate;
        this.playerPreloader = playerPreloader;
        this.videoPlaybackManager = videoPlaybackManager;
        this.tokenizedAnalytics = tokenizedAnalytics;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$2$lambda$1(ReviewTilesVO.Content.Media.Video video, VideoViewHolder videoViewHolder, Function1 function1, View view) {
        PreloadVideoInfo fullVideoInfo = video.getFullVideoInfo();
        if (fullVideoInfo != null) {
            PlayerPreloader.DefaultImpls.preCreatePlayer$default(videoViewHolder.playerPreloader, fullVideoInfo, null, 2, null);
        }
        AtomAction action = video.getAction();
        if (action != null) {
            function1.invoke(action);
        }
    }

    public final void bind(@NotNull final ReviewTilesVO.Content.Media.Video item, @NotNull final Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.currentItem = item;
        ReviewTilesView reviewTilesView = this.view;
        ViewGroup.LayoutParams layoutParams = reviewTilesView.getLayoutParams();
        int i11 = layoutParams.height;
        int i12 = layoutParams.width;
        layoutParams.width = item.getSize().e().intValue();
        int intValue = item.getSize().f().intValue();
        layoutParams.height = intValue;
        if (i11 != intValue || i12 != layoutParams.width) {
            reviewTilesView.setLayoutParams(layoutParams);
        }
        reviewTilesView.bind(item);
        reviewTilesView.setOnClickListener(new View.OnClickListener() { // from class: BW.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VideoViewHolder.bind$lambda$2$lambda$1(ReviewTilesVO.Content.Media.Video.this, this, actionHandler, view);
            }
        });
    }

    @NotNull
    public final ReviewTilesVideoDelegate getVideoDelegate() {
        return this.videoDelegate;
    }

    @Override // jk0.j, lk0.b
    public void onViewInOverlapBounds() {
        t tokenizedEvent;
        super.onViewInOverlapBounds();
        ReviewTilesVO.Content.Media.Video video = this.currentItem;
        if (video != null && (tokenizedEvent = video.getTokenizedEvent()) != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, tokenizedEvent, null, 2, null);
        }
        this.videoPlaybackManager.onViewInOverlapBounds(this);
    }

    @Override // jk0.j, lk0.b
    public void onViewOutOfOverlapBounds() {
        super.onViewOutOfOverlapBounds();
        this.videoPlaybackManager.onViewOutOfOverlapBounds(this);
    }

    public final boolean startPlayback() {
        PreloadVideoInfo videoInfo;
        ReviewTilesVO.Content.Media.Video video = this.currentItem;
        if (video == null || (videoInfo = video.getVideoInfo()) == null) {
            return false;
        }
        return this.videoDelegate.startPlayback(videoInfo, this.view.getPlayerView(), this.view);
    }

    public final void stopPlayback() {
        this.videoDelegate.stopPlayback();
    }
}
