package ru.ozon.app.android.pdp.widgets.galleryV3.presentation.viewpager;

import A00.a;
import Fy.C3065c;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.G;
import androidx.lifecycle.J;
import androidx.lifecycle.W;
import androidx.media3.ui.PlayerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mc.C8125a;
import nc.InterfaceC8487b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.pdp.databinding.PdpWidgetProductGalleryV3VideoItemBinding;
import ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.v3.GalleryV3VO;
import ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.v3.GalleryV3ViewModel;
import ru.ozon.app.android.pdp.widgets.galleryV3.presentation.GalleryV3VideoState;
import ru.ozon.app.android.pdp.widgets.galleryV3.presentation.player.GalleryVideoPlayer;
import ru.ozon.app.android.pdp.widgets.galleryV3.presentation.player.GalleryVideoPlayerKt;
import ru.ozon.app.android.pdp.widgets.galleryV3.presentation.viewpager.GalleryRecyclerAdapter;
import ru.ozon.app.android.pdpvideomolecule.data.PlayerStateKt;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.video.player.soundservice.SoundController;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;

@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002BI\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0017\u0010\u0015J\u0015\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u000e¢\u0006\u0004\b\u001c\u0010\u0015J\u0018\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u0018H\u0096\u0001¢\u0006\u0004\b\u001d\u0010\u001bJ\u0018\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u0018H\u0096\u0001¢\u0006\u0004\b\u001f\u0010\u001bJ\u0018\u0010 \u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u0018H\u0096\u0001¢\u0006\u0004\b \u0010\u001bJ\u0018\u0010!\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u0018H\u0096\u0001¢\u0006\u0004\b!\u0010\u001bJ\u0017\u0010$\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020\u000e2\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u000eH\u0002¢\u0006\u0004\b*\u0010\u0015J\u0017\u0010-\u001a\u00020\u000e2\u0006\u0010,\u001a\u00020+H\u0002¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u000eH\u0002¢\u0006\u0004\b/\u0010\u0015J\u000f\u00100\u001a\u00020\u000eH\u0002¢\u0006\u0004\b0\u0010\u0015J\u000f\u00101\u001a\u00020\u000eH\u0002¢\u0006\u0004\b1\u0010\u0015J\u000f\u00102\u001a\u00020\u000eH\u0002¢\u0006\u0004\b2\u0010\u0015J\u0017\u00103\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b3\u0010\u001bJ\u000f\u00104\u001a\u00020\u000eH\u0002¢\u0006\u0004\b4\u0010\u0015R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u00105R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00106R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00107R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00108R \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u00109R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010:R\u0018\u0010;\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0018\u0010=\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010@\u001a\u00020?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0018\u0010C\u001a\u0004\u0018\u00010B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0016\u0010E\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0017\u0010H\u001a\u00020G8\u0006¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR\u0014\u0010M\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u001a\u0010Q\u001a\b\u0012\u0004\u0012\u00020P0O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010R¨\u0006S"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryV3/presentation/viewpager/VideoItemViewHolder;", "Lru/ozon/app/android/pdp/widgets/galleryV3/presentation/viewpager/GalleryItemViewHolder;", "", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/pdp/databinding/PdpWidgetProductGalleryV3VideoItemBinding;", "binding", "Lkotlin/Function0;", "Lru/ozon/app/android/pdp/widgets/galleryV3/presentation/player/GalleryVideoPlayer;", "galleryVideoPlayerProvider", "Lru/ozon/app/android/video/player/soundservice/SoundController;", "soundController", "Lkotlin/Function1;", "Lru/ozon/app/android/pdp/widgets/galleryV3/presentation/GalleryV3VideoState;", "", "onVideoStateChanged", "Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/v3/GalleryV3ViewModel;", "galleryViewModel", "<init>", "(Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/pdp/databinding/PdpWidgetProductGalleryV3VideoItemBinding;Lkotlin/jvm/functions/Function0;Lru/ozon/app/android/video/player/soundservice/SoundController;Lkotlin/jvm/functions/Function1;Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/v3/GalleryV3ViewModel;)V", "onAttach", "()V", "onDetach", "onRecycle", "Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/v3/GalleryV3VO$Item$OzonVideo;", "item", "bind", "(Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/v3/GalleryV3VO$Item$OzonVideo;)V", "releaseListeners", "processBindViewEvent", "bindItem", "processOpenViewEvent", "processEndIfRepeatEvent", "processStartEvent", "", "show", "showProgress", "(Z)V", "", "imageUrl", "loadPreview", "(Ljava/lang/String;)V", "hidePreview", "Landroidx/lifecycle/v$a;", "event", "handleLifecycleEvent", "(Landroidx/lifecycle/v$a;)V", "onStart", "onPause", "onStop", "playVideo", "initPlayer", "releasePlayer", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/pdp/databinding/PdpWidgetProductGalleryV3VideoItemBinding;", "Lkotlin/jvm/functions/Function0;", "Lru/ozon/app/android/video/player/soundservice/SoundController;", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/v3/GalleryV3ViewModel;", "vo", "Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/v3/GalleryV3VO$Item$OzonVideo;", "videoPlayer", "Lru/ozon/app/android/pdp/widgets/galleryV3/presentation/player/GalleryVideoPlayer;", "", "savedPlayerPosition", "J", "Lnc/b;", "soundDisposable", "Lnc/b;", "isSwipeRefresh", "Z", "Lru/ozon/app/android/pdp/widgets/galleryV3/presentation/viewpager/GalleryRecyclerAdapter$ListenersClearble;", "clearble", "Lru/ozon/app/android/pdp/widgets/galleryV3/presentation/viewpager/GalleryRecyclerAdapter$ListenersClearble;", "getClearble", "()Lru/ozon/app/android/pdp/widgets/galleryV3/presentation/viewpager/GalleryRecyclerAdapter$ListenersClearble;", "Landroidx/lifecycle/G;", "lifecycleObserver", "Landroidx/lifecycle/G;", "Landroidx/lifecycle/W;", "LA00/a;", "swipeRefreshBusEventObserver", "Landroidx/lifecycle/W;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class VideoItemViewHolder extends GalleryItemViewHolder {
    private final /* synthetic */ VideoItemViewHolderAnalyticsDelegateImpl $$delegate_0;

    @NotNull
    private final PdpWidgetProductGalleryV3VideoItemBinding binding;

    @NotNull
    private final GalleryRecyclerAdapter.ListenersClearble clearble;

    @NotNull
    private final Function0<GalleryVideoPlayer> galleryVideoPlayerProvider;

    @NotNull
    private final GalleryV3ViewModel galleryViewModel;
    private boolean isSwipeRefresh;

    @NotNull
    private final G lifecycleObserver;

    @NotNull
    private final Function1<GalleryV3VideoState, Unit> onVideoStateChanged;

    @NotNull
    private final ComposerReferences refs;
    private long savedPlayerPosition;

    @NotNull
    private final SoundController soundController;
    private InterfaceC8487b soundDisposable;

    @NotNull
    private final W<a> swipeRefreshBusEventObserver;
    private GalleryVideoPlayer videoPlayer;
    private GalleryV3VO.Item.OzonVideo vo;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AbstractC5434v.a.values().length];
            try {
                iArr[AbstractC5434v.a.ON_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AbstractC5434v.a.ON_PAUSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AbstractC5434v.a.ON_STOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public VideoItemViewHolder(@NotNull ComposerReferences refs, @NotNull PdpWidgetProductGalleryV3VideoItemBinding binding, @NotNull Function0<GalleryVideoPlayer> galleryVideoPlayerProvider, @NotNull SoundController soundController, @NotNull Function1<? super GalleryV3VideoState, Unit> onVideoStateChanged, @NotNull GalleryV3ViewModel galleryViewModel) {
        super(r0, null);
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(galleryVideoPlayerProvider, "galleryVideoPlayerProvider");
        Intrinsics.checkNotNullParameter(soundController, "soundController");
        Intrinsics.checkNotNullParameter(onVideoStateChanged, "onVideoStateChanged");
        Intrinsics.checkNotNullParameter(galleryViewModel, "galleryViewModel");
        FrameLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.$$delegate_0 = new VideoItemViewHolderAnalyticsDelegateImpl(onVideoStateChanged);
        this.refs = refs;
        this.binding = binding;
        this.galleryVideoPlayerProvider = galleryVideoPlayerProvider;
        this.soundController = soundController;
        this.onVideoStateChanged = onVideoStateChanged;
        this.galleryViewModel = galleryViewModel;
        this.clearble = new GalleryRecyclerAdapter.ListenersClearble() { // from class: ru.ozon.app.android.pdp.widgets.galleryV3.presentation.viewpager.VideoItemViewHolder$clearble$1
            @Override // ru.ozon.app.android.pdp.widgets.galleryV3.presentation.viewpager.GalleryRecyclerAdapter.ListenersClearble
            public void clear() {
                VideoItemViewHolder.this.releaseListeners();
            }
        };
        this.lifecycleObserver = new QD.a(this, 0);
        this.swipeRefreshBusEventObserver = new BM.a(this, 1);
        binding.exoPlayerV.setTag(R.id.tag_key_widget_name, "pdp.gallery");
    }

    private final void handleLifecycleEvent(AbstractC5434v.a event) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[event.ordinal()];
        if (i11 == 1) {
            onStart();
        } else if (i11 == 2) {
            onPause();
        } else {
            if (i11 != 3) {
                return;
            }
            onStop();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void hidePreview() {
        final PdpWidgetProductGalleryV3VideoItemBinding pdpWidgetProductGalleryV3VideoItemBinding = this.binding;
        pdpWidgetProductGalleryV3VideoItemBinding.videoPreviewIv.animate().alpha(0.0f).setDuration(125L).setListener(new AnimatorListenerAdapter() { // from class: ru.ozon.app.android.pdp.widgets.galleryV3.presentation.viewpager.VideoItemViewHolder$hidePreview$1$1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                ImageView videoPreviewIv = PdpWidgetProductGalleryV3VideoItemBinding.this.videoPreviewIv;
                Intrinsics.checkNotNullExpressionValue(videoPreviewIv, "videoPreviewIv");
                ViewExtKt.gone(videoPreviewIv);
            }
        }).start();
        pdpWidgetProductGalleryV3VideoItemBinding.exoPlayerV.animate().alpha(1.0f).setStartDelay(100L).setDuration(200L).start();
    }

    private final void initPlayer(GalleryV3VO.Item.OzonVideo item) {
        GalleryVideoPlayer invoke = this.galleryVideoPlayerProvider.invoke();
        this.videoPlayer = invoke;
        if (invoke != null) {
            invoke.setOnBuffering(new VideoItemViewHolder$initPlayer$1$1(this, invoke));
            invoke.setOnRenderedFirstFrame(new VideoItemViewHolder$initPlayer$1$2(this, item));
            invoke.setOnReady(new VideoItemViewHolder$initPlayer$1$3(this));
            invoke.setOnError(new VideoItemViewHolder$initPlayer$1$4(this));
            invoke.setOnStart(new VideoItemViewHolder$initPlayer$1$5(this, item));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lifecycleObserver$lambda$0(VideoItemViewHolder videoItemViewHolder, J j11, AbstractC5434v.a event) {
        Intrinsics.checkNotNullParameter(j11, "<unused var>");
        Intrinsics.checkNotNullParameter(event, "event");
        videoItemViewHolder.handleLifecycleEvent(event);
    }

    private final void loadPreview(String imageUrl) {
        PdpWidgetProductGalleryV3VideoItemBinding pdpWidgetProductGalleryV3VideoItemBinding = this.binding;
        pdpWidgetProductGalleryV3VideoItemBinding.exoPlayerV.setAlpha(0.0f);
        ImageView videoPreviewIv = pdpWidgetProductGalleryV3VideoItemBinding.videoPreviewIv;
        Intrinsics.checkNotNullExpressionValue(videoPreviewIv, "videoPreviewIv");
        ViewExtKt.show(videoPreviewIv);
        ImageView videoPreviewIv2 = pdpWidgetProductGalleryV3VideoItemBinding.videoPreviewIv;
        Intrinsics.checkNotNullExpressionValue(videoPreviewIv2, "videoPreviewIv");
        ImageViewExtKt.loadWithCrossFade$default(videoPreviewIv2, imageUrl, null, null, 6, null);
    }

    private final void onPause() {
        GalleryVideoPlayer galleryVideoPlayer = this.videoPlayer;
        if (galleryVideoPlayer != null) {
            galleryVideoPlayer.pause();
            this.savedPlayerPosition = galleryVideoPlayer.getPosition();
        }
    }

    private final void onStart() {
        GalleryV3VO.Item.OzonVideo ozonVideo = this.vo;
        if (ozonVideo != null) {
            processOpenViewEvent(ozonVideo);
        }
        playVideo();
    }

    private final void onStop() {
        this.binding.exoPlayerV.setKeepScreenOn(false);
    }

    private final void playVideo() {
        this.binding.exoPlayerV.setKeepScreenOn(true);
        GalleryVideoPlayer galleryVideoPlayer = this.videoPlayer;
        if (galleryVideoPlayer != null) {
            galleryVideoPlayer.resume();
        }
    }

    private final void releasePlayer() {
        GalleryVideoPlayer galleryVideoPlayer = this.videoPlayer;
        if (galleryVideoPlayer != null) {
            GalleryVideoPlayerKt.clearAllCallbacks(galleryVideoPlayer);
            galleryVideoPlayer.release(this.binding.exoPlayerV);
        }
        this.videoPlayer = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showProgress(boolean show) {
        PdpWidgetProductGalleryV3VideoItemBinding pdpWidgetProductGalleryV3VideoItemBinding = this.binding;
        if (show) {
            pdpWidgetProductGalleryV3VideoItemBinding.playerPb.d();
        } else {
            pdpWidgetProductGalleryV3VideoItemBinding.playerPb.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void swipeRefreshBusEventObserver$lambda$1(VideoItemViewHolder videoItemViewHolder, a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof a.u.c) {
            videoItemViewHolder.isSwipeRefresh = true;
            return;
        }
        if ((event instanceof a.C2370k) && videoItemViewHolder.isSwipeRefresh) {
            videoItemViewHolder.isSwipeRefresh = false;
            GalleryVideoPlayer galleryVideoPlayer = videoItemViewHolder.videoPlayer;
            if (galleryVideoPlayer != null) {
                galleryVideoPlayer.setPosition(0L);
            }
        }
    }

    public final void bind(@NotNull GalleryV3VO.Item.OzonVideo item) {
        Intrinsics.checkNotNullParameter(item, "item");
        PlayerStateKt.updateShouldRepeat(item.getVideo(), true);
        this.vo = item;
        showProgress(true);
        loadPreview(item.getPreviewImageUrl());
        if (this.videoPlayer == null) {
            initPlayer(item);
        }
        GalleryVideoPlayer galleryVideoPlayer = this.videoPlayer;
        if (galleryVideoPlayer != null) {
            String link = item.getVideo().getLink();
            PlayerView exoPlayerV = this.binding.exoPlayerV;
            Intrinsics.checkNotNullExpressionValue(exoPlayerV, "exoPlayerV");
            galleryVideoPlayer.bind(link, exoPlayerV, this.soundController.isMuted(), PlayerStateKt.shouldRepeat(item.getVideo()), getAdapterPosition() == 0, this.savedPlayerPosition);
        }
        processBindViewEvent(item);
    }

    @NotNull
    public final GalleryRecyclerAdapter.ListenersClearble getClearble() {
        return this.clearble;
    }

    @Override // jk0.j
    public void onAttach() {
        super.onAttach();
        this.refs.getController().getEvents().observe(this, this.swipeRefreshBusEventObserver);
        getLifecycle().a(this.lifecycleObserver);
        this.soundDisposable = this.soundController.getSoundMutedState().subscribeOn(Mc.a.b()).observeOn(C8125a.a()).subscribe(new C3065c(new VideoItemViewHolder$onAttach$1(this), 3));
        this.galleryViewModel.getAction().observe(this, new VideoItemViewHolderKt$sam$androidx_lifecycle_Observer$0(new VideoItemViewHolder$onAttach$2(this)));
    }

    @Override // jk0.j
    public void onDetach() {
        super.onDetach();
        this.galleryViewModel.getAction().removeObservers(this);
        getLifecycle().e(this.lifecycleObserver);
        InterfaceC8487b interfaceC8487b = this.soundDisposable;
        if (interfaceC8487b != null) {
            interfaceC8487b.dispose();
        }
    }

    @Override // jk0.j
    public void onRecycle() {
        super.onRecycle();
        releasePlayer();
    }

    public void processBindViewEvent(@NotNull GalleryV3VO.Item.OzonVideo item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.$$delegate_0.processBindViewEvent(item);
    }

    public void processEndIfRepeatEvent(@NotNull GalleryV3VO.Item.OzonVideo item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.$$delegate_0.processEndIfRepeatEvent(item);
    }

    public void processOpenViewEvent(@NotNull GalleryV3VO.Item.OzonVideo bindItem) {
        Intrinsics.checkNotNullParameter(bindItem, "bindItem");
        this.$$delegate_0.processOpenViewEvent(bindItem);
    }

    public void processStartEvent(@NotNull GalleryV3VO.Item.OzonVideo item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.$$delegate_0.processStartEvent(item);
    }

    public final void releaseListeners() {
        this.galleryViewModel.getAction().removeObservers(this);
        GalleryVideoPlayer galleryVideoPlayer = this.videoPlayer;
        if (galleryVideoPlayer != null) {
            galleryVideoPlayer.release(this.binding.exoPlayerV);
        }
        InterfaceC8487b interfaceC8487b = this.soundDisposable;
        if (interfaceC8487b != null) {
            interfaceC8487b.dispose();
        }
    }
}
