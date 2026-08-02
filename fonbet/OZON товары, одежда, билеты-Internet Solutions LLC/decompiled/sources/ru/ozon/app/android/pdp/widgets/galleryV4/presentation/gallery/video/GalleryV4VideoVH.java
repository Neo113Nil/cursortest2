package ru.ozon.app.android.pdp.widgets.galleryV4.presentation.gallery.video;

import Hs.d;
import Mc.a;
import WZ.l;
import WZ.t;
import android.view.View;
import androidx.media3.ui.PlayerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import mc.C8125a;
import nc.InterfaceC8487b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.pdp.ui.configurators.analitycs.TokenizedAnalyticsExtKt;
import ru.ozon.app.android.pdp.utils.BoundedLinkedHashMap;
import ru.ozon.app.android.pdp.widgets.galleryV3.presentation.player.GalleryVideoPlayer;
import ru.ozon.app.android.pdp.widgets.galleryV3.presentation.player.GalleryVideoPlayerKt;
import ru.ozon.app.android.pdp.widgets.galleryV4.presentation.GallerySyncModel;
import ru.ozon.app.android.pdp.widgets.galleryV4.presentation.GalleryV4VO;
import ru.ozon.app.android.pdp.widgets.galleryV4.presentation.gallery.GallerySyncVideoItem;
import ru.ozon.app.android.pdp.widgets.galleryV4.presentation.gallery.GalleryV4ViewHolder;
import ru.ozon.app.android.pdp.widgets.galleryV4.presentation.gallery.GalleryVideoItemsVisibilityHandler;
import ru.ozon.app.android.pdpvideomolecule.data.PlayerStateKt;
import ru.ozon.app.android.video.player.soundservice.SoundController;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001Bq\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0018\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00130\u000b¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0013H\u0002¢\u0006\u0004\b \u0010\u001fJ\u0017\u0010\"\u001a\u00020\u00132\u0006\u0010!\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\"\u0010#J\u001f\u0010\"\u001a\u00020\u00132\u0006\u0010!\u001a\u00020\u00022\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b\"\u0010&J\u000f\u0010'\u001a\u00020\u0013H\u0016¢\u0006\u0004\b'\u0010\u001fJ\u000f\u0010(\u001a\u00020\u0013H\u0016¢\u0006\u0004\b(\u0010\u001fJ\u000f\u0010)\u001a\u00020\u0013H\u0016¢\u0006\u0004\b)\u0010\u001fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010*R \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010+R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010,R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010-R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010.R&\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010/R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u00100R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00130\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010-R\u0018\u00101\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u00103\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u00106\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u00109\u001a\u0002088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:¨\u0006;"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/gallery/video/GalleryV4VideoVH;", "Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/gallery/GalleryV4ViewHolder;", "Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GalleryV4VO$Item$Video;", "Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/gallery/video/GalleryV4VideoView;", "videoView", "Lru/ozon/app/android/pdp/utils/BoundedLinkedHashMap;", "", "", "videoPositionCache", "Lru/ozon/app/android/video/player/soundservice/SoundController;", "soundController", "Lkotlin/Function0;", "Lru/ozon/app/android/pdp/widgets/galleryV3/presentation/player/GalleryVideoPlayer;", "videoPlayerProvider", "Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/gallery/GalleryVideoItemsVisibilityHandler;", "itemsVisibilityHandler", "Lkotlin/Function2;", "Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GallerySyncModel;", "", "onItemClick", "LWZ/l;", "tokenizedAnalytics", "onRenderFirstFrame", "<init>", "(Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/gallery/video/GalleryV4VideoView;Lru/ozon/app/android/pdp/utils/BoundedLinkedHashMap;Lru/ozon/app/android/video/player/soundservice/SoundController;Lkotlin/jvm/functions/Function0;Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/gallery/GalleryVideoItemsVisibilityHandler;Lkotlin/jvm/functions/Function2;LWZ/l;Lkotlin/jvm/functions/Function0;)V", "Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GalleryV4VO$VideoEvents;", "videoEvents", "initPlayer", "(Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GalleryV4VO$VideoEvents;)V", "playVideo", "()V", "pauseVideo", "item", "bind", "(Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GalleryV4VO$Item$Video;)V", "Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/gallery/GalleryV4ViewHolder$ResetVideoPositionPayload;", "payload", "(Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GalleryV4VO$Item$Video;Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/gallery/GalleryV4ViewHolder$ResetVideoPositionPayload;)V", "onAttach", "onDetach", "onRecycle", "Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/gallery/video/GalleryV4VideoView;", "Lru/ozon/app/android/pdp/utils/BoundedLinkedHashMap;", "Lru/ozon/app/android/video/player/soundservice/SoundController;", "Lkotlin/jvm/functions/Function0;", "Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/gallery/GalleryVideoItemsVisibilityHandler;", "Lkotlin/jvm/functions/Function2;", "LWZ/l;", "videoPlayer", "Lru/ozon/app/android/pdp/widgets/galleryV3/presentation/player/GalleryVideoPlayer;", "vo", "Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GalleryV4VO$Item$Video;", "Lnc/b;", "soundDisposable", "Lnc/b;", "", "isSecondFrame", "Z", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GalleryV4VideoVH extends GalleryV4ViewHolder<GalleryV4VO.Item.Video> {
    private boolean isSecondFrame;

    @NotNull
    private final GalleryVideoItemsVisibilityHandler itemsVisibilityHandler;

    @NotNull
    private final Function2<AtomAction, GallerySyncModel, Unit> onItemClick;

    @NotNull
    private final Function0<Unit> onRenderFirstFrame;

    @NotNull
    private final SoundController soundController;
    private InterfaceC8487b soundDisposable;

    @NotNull
    private final l tokenizedAnalytics;
    private GalleryVideoPlayer videoPlayer;

    @NotNull
    private final Function0<GalleryVideoPlayer> videoPlayerProvider;

    @NotNull
    private final BoundedLinkedHashMap<String, Long> videoPositionCache;

    @NotNull
    private final GalleryV4VideoView videoView;
    private GalleryV4VO.Item.Video vo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public GalleryV4VideoVH(@NotNull GalleryV4VideoView videoView, @NotNull BoundedLinkedHashMap<String, Long> videoPositionCache, @NotNull SoundController soundController, @NotNull Function0<GalleryVideoPlayer> videoPlayerProvider, @NotNull GalleryVideoItemsVisibilityHandler itemsVisibilityHandler, @NotNull Function2<? super AtomAction, ? super GallerySyncModel, Unit> onItemClick, @NotNull l tokenizedAnalytics, @NotNull Function0<Unit> onRenderFirstFrame) {
        super(videoView);
        Intrinsics.checkNotNullParameter(videoView, "videoView");
        Intrinsics.checkNotNullParameter(videoPositionCache, "videoPositionCache");
        Intrinsics.checkNotNullParameter(soundController, "soundController");
        Intrinsics.checkNotNullParameter(videoPlayerProvider, "videoPlayerProvider");
        Intrinsics.checkNotNullParameter(itemsVisibilityHandler, "itemsVisibilityHandler");
        Intrinsics.checkNotNullParameter(onItemClick, "onItemClick");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(onRenderFirstFrame, "onRenderFirstFrame");
        this.videoView = videoView;
        this.videoPositionCache = videoPositionCache;
        this.soundController = soundController;
        this.videoPlayerProvider = videoPlayerProvider;
        this.itemsVisibilityHandler = itemsVisibilityHandler;
        this.onItemClick = onItemClick;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.onRenderFirstFrame = onRenderFirstFrame;
        videoView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: ru.ozon.app.android.pdp.widgets.galleryV4.presentation.gallery.video.GalleryV4VideoVH.1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
                Intrinsics.checkNotNullParameter(view, "view");
                GalleryV4VO.Item.Video video = GalleryV4VideoVH.this.vo;
                if (video != null) {
                    int id2 = video.getId();
                    GalleryV4VideoVH galleryV4VideoVH = GalleryV4VideoVH.this;
                    galleryV4VideoVH.itemsVisibilityHandler.bind(id2, new GallerySyncVideoItem(galleryV4VideoVH.videoView, new GalleryV4VideoVH$1$onViewAttachedToWindow$1$1(galleryV4VideoVH), new GalleryV4VideoVH$1$onViewAttachedToWindow$1$2(galleryV4VideoVH)));
                }
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
                Intrinsics.checkNotNullParameter(view, "view");
                GalleryV4VO.Item.Video video = GalleryV4VideoVH.this.vo;
                if (video != null) {
                    GalleryV4VideoVH.this.itemsVisibilityHandler.unBind(video.getId());
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$3(GalleryV4VO.Item.Video video, GalleryV4VideoVH galleryV4VideoVH, View view) {
        AtomAction action = video.getAction();
        if (action != null) {
            Function2<AtomAction, GallerySyncModel, Unit> function2 = galleryV4VideoVH.onItemClick;
            int adapterPosition = galleryV4VideoVH.getAdapterPosition();
            GalleryVideoPlayer galleryVideoPlayer = galleryV4VideoVH.videoPlayer;
            function2.invoke(action, new GallerySyncModel(adapterPosition, Long.valueOf(galleryVideoPlayer != null ? galleryVideoPlayer.getPosition() : 0L)));
        }
        t event = video.getEvent();
        if (event != null) {
            TokenizedAnalyticsExtensionsKt.processClickEvents$default(galleryV4VideoVH.tokenizedAnalytics, event, null, 2, null);
        }
    }

    private final void initPlayer(GalleryV4VO.VideoEvents videoEvents) {
        GalleryVideoPlayer invoke = this.videoPlayerProvider.invoke();
        this.videoPlayer = invoke;
        if (invoke != null) {
            invoke.setOnBuffering(new GalleryV4VideoVH$initPlayer$1$1(this));
            invoke.setOnRenderedFirstFrame(new GalleryV4VideoVH$initPlayer$1$2(this, videoEvents));
            invoke.setOnStart(new GalleryV4VideoVH$initPlayer$1$3(videoEvents, this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void pauseVideo() {
        GalleryVideoPlayer galleryVideoPlayer = this.videoPlayer;
        if (galleryVideoPlayer != null) {
            galleryVideoPlayer.pause();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void playVideo() {
        GalleryVideoPlayer galleryVideoPlayer = this.videoPlayer;
        if (galleryVideoPlayer != null) {
            galleryVideoPlayer.resume();
        }
    }

    @Override // jk0.j
    public void onAttach() {
        super.onAttach();
        this.soundDisposable = this.soundController.getSoundMutedState().subscribeOn(a.b()).observeOn(C8125a.a()).subscribe(new d(new GalleryV4VideoVH$onAttach$1(this), 3));
    }

    @Override // jk0.j
    public void onDetach() {
        super.onDetach();
        this.videoView.getPlayerView().setKeepScreenOn(false);
        InterfaceC8487b interfaceC8487b = this.soundDisposable;
        if (interfaceC8487b != null) {
            interfaceC8487b.dispose();
        }
    }

    @Override // jk0.j
    public void onRecycle() {
        super.onRecycle();
        GalleryVideoPlayer galleryVideoPlayer = this.videoPlayer;
        if (galleryVideoPlayer != null) {
            GalleryV4VO.Item.Video video = this.vo;
            if (video != null) {
                this.videoPositionCache.put(video.getVideo().getLink(), Long.valueOf(galleryVideoPlayer.getPosition()));
            }
            GalleryVideoPlayerKt.clearAllCallbacks(galleryVideoPlayer);
            galleryVideoPlayer.release(this.videoView.getPlayerView());
        }
        this.videoPlayer = null;
        this.isSecondFrame = false;
        this.vo = null;
    }

    @Override // ru.ozon.app.android.pdp.widgets.galleryV4.presentation.gallery.GalleryV4ViewHolder
    public void bind(@NotNull GalleryV4VO.Item.Video item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.vo = item;
        Integer containerWidth = item.getContainerConfig().getContainerWidth();
        if (containerWidth != null) {
            this.videoView.updateParams(containerWidth.intValue());
        }
        this.videoView.showProgress();
        this.videoView.loadPreview(item.getPreviewUrl());
        if (this.videoPlayer == null) {
            initPlayer(item.getVideoEvents());
        }
        GalleryVideoPlayer galleryVideoPlayer = this.videoPlayer;
        if (galleryVideoPlayer != null) {
            String link = item.getVideo().getLink();
            PlayerView playerView = this.videoView.getPlayerView();
            boolean shouldRepeat = PlayerStateKt.shouldRepeat(item.getVideo());
            boolean z11 = getAdapterPosition() == 0;
            Long l11 = this.videoPositionCache.get(item.getVideo().getLink());
            galleryVideoPlayer.bind(link, playerView, true, shouldRepeat, z11, l11 != null ? l11.longValue() : item.getVideo().getPlayerState().getCurrentPlayerTime());
        }
        TokenizedAnalyticsExtKt.processViewEvents(this.tokenizedAnalytics, item.getEvent());
        this.videoView.setOnClickListener(new Sk.a(2, item, this));
    }

    @Override // ru.ozon.app.android.pdp.widgets.galleryV4.presentation.gallery.GalleryV4ViewHolder
    public void bind(@NotNull GalleryV4VO.Item.Video item, @NotNull GalleryV4ViewHolder.ResetVideoPositionPayload payload) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(payload, "payload");
        GalleryVideoPlayer galleryVideoPlayer = this.videoPlayer;
        if (galleryVideoPlayer != null) {
            galleryVideoPlayer.setPosition(item.getVideo().getPlayerState().getCurrentPlayerTime());
        }
    }
}
