package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFull.v1.presentation.pager;

import Ae.C2399j;
import Ae.C2408n0;
import Ey.ViewOnClickListenerC2975b;
import Sc.o;
import WZ.l;
import Xc.a;
import Xc.b;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5433u;
import androidx.lifecycle.G;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import androidx.media3.ui.PlayerView;
import j3.Q;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.app.android.pdp.ui.configurators.analitycs.TokenizedAnalyticsExtKt;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.travel.feature.hotels.databinding.ItemHotelsGalleryFullVideoBinding;
import ru.ozon.app.android.travel.feature.hotels.shared.player.HotelsGalleryVideoPlayer;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFull.v1.presentation.HotelsGalleryFullVI;
import ru.ozon.app.android.video.player.soundservice.SoundController;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import ru.ozon.uni.core.R$drawable;
import xe.B0;
import xe.C10727i;

@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001:\u0001OB-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u000fJ\u000f\u0010\u0012\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0012\u0010\u000fJ\u0015\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001b\u0010\u000fJ\u000f\u0010\u001c\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001c\u0010\u000fJ\u000f\u0010\u001d\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001d\u0010\u000fJ\u0017\u0010 \u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\r2\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\rH\u0002¢\u0006\u0004\b&\u0010\u000fJ\u0011\u0010'\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b'\u0010(J\u0011\u0010)\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b)\u0010(J\u000f\u0010*\u001a\u00020\rH\u0002¢\u0006\u0004\b*\u0010\u000fJ\u000f\u0010+\u001a\u00020\u0005H\u0002¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\rH\u0002¢\u0006\u0004\b-\u0010\u000fJ\u0017\u0010/\u001a\u00020\r2\u0006\u0010.\u001a\u00020\u001eH\u0002¢\u0006\u0004\b/\u0010!J\u001b\u00102\u001a\u00020\r2\n\b\u0002\u00101\u001a\u0004\u0018\u000100H\u0002¢\u0006\u0004\b2\u00103J+\u00108\u001a\u000e\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u000207062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u00105\u001a\u000204H\u0002¢\u0006\u0004\b8\u00109R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010:R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010;R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010<R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010=R\u0018\u0010>\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0018\u0010@\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010C\u001a\u00020B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0018\u0010F\u001a\u0004\u0018\u00010E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0016\u0010H\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010K\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0018\u0010M\u001a\u0004\u0018\u00010E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010GR\u0016\u0010N\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010I¨\u0006P"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v1/presentation/pager/HotelsGalleryFullPagerVideoViewHolder;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v1/presentation/pager/HotelsGalleryFullPagerItemViewHolder;", "Lru/ozon/app/android/travel/feature/hotels/databinding/ItemHotelsGalleryFullVideoBinding;", "binding", "Lkotlin/Function0;", "Lru/ozon/app/android/travel/feature/hotels/shared/player/HotelsGalleryVideoPlayer;", "galleryVideoPlayerProvider", "Lru/ozon/app/android/video/player/soundservice/SoundController;", "soundController", "LWZ/l;", "tokenizedAnalytics", "<init>", "(Lru/ozon/app/android/travel/feature/hotels/databinding/ItemHotelsGalleryFullVideoBinding;Lkotlin/jvm/functions/Function0;Lru/ozon/app/android/video/player/soundservice/SoundController;LWZ/l;)V", "", "onAttach", "()V", "onDetach", "onViewInVisibleBounds", "onRecycle", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v1/presentation/HotelsGalleryFullVI$Video;", "item", "bind", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v1/presentation/HotelsGalleryFullVI$Video;)V", "Landroidx/lifecycle/v$a;", "event", "handleLifecycleEvent", "(Landroidx/lifecycle/v$a;)V", "onStart", "onPause", "onStop", "", "show", "showProgress", "(Z)V", "", "imageUrl", "loadPreview", "(Ljava/lang/String;)V", "hidePreview", "playVideo", "()Lkotlin/Unit;", "pauseVideo", "repeatVideo", "initPlayer", "()Lru/ozon/app/android/travel/feature/hotels/shared/player/HotelsGalleryVideoPlayer;", "releasePlayer", "isMuted", "updateSoundIcon", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v1/presentation/pager/HotelsGalleryFullPagerVideoViewHolder$IconType;", "icon", "showControlIcon", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v1/presentation/pager/HotelsGalleryFullPagerVideoViewHolder$IconType;)V", "Lj3/Q;", "videoSize", "Lkotlin/Pair;", "", "calculateOptimalVideoSize", "(Lru/ozon/app/android/travel/feature/hotels/databinding/ItemHotelsGalleryFullVideoBinding;Lj3/Q;)Lkotlin/Pair;", "Lru/ozon/app/android/travel/feature/hotels/databinding/ItemHotelsGalleryFullVideoBinding;", "Lkotlin/jvm/functions/Function0;", "Lru/ozon/app/android/video/player/soundservice/SoundController;", "LWZ/l;", "vo", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v1/presentation/HotelsGalleryFullVI$Video;", "videoPlayer", "Lru/ozon/app/android/travel/feature/hotels/shared/player/HotelsGalleryVideoPlayer;", "", "savedPlayerPosition", "J", "Lxe/B0;", "soundJob", "Lxe/B0;", "isSecondFrame", "Z", "Landroidx/lifecycle/G;", "lifecycleObserver", "Landroidx/lifecycle/G;", "hidePauseJob", "isFinished", "IconType", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsGalleryFullPagerVideoViewHolder extends HotelsGalleryFullPagerItemViewHolder {

    @NotNull
    private final ItemHotelsGalleryFullVideoBinding binding;

    @NotNull
    private final Function0<HotelsGalleryVideoPlayer> galleryVideoPlayerProvider;
    private B0 hidePauseJob;
    private boolean isFinished;
    private boolean isSecondFrame;

    @NotNull
    private final G lifecycleObserver;
    private long savedPlayerPosition;

    @NotNull
    private final SoundController soundController;
    private B0 soundJob;

    @NotNull
    private final l tokenizedAnalytics;
    private HotelsGalleryVideoPlayer videoPlayer;
    private HotelsGalleryFullVI.Video vo;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v1/presentation/pager/HotelsGalleryFullPagerVideoViewHolder$IconType;", "", "<init>", "(Ljava/lang/String;I)V", "PLAY", "PAUSE", "REPEAT", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class IconType {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ IconType[] $VALUES;
        public static final IconType PLAY = new IconType("PLAY", 0);
        public static final IconType PAUSE = new IconType("PAUSE", 1);
        public static final IconType REPEAT = new IconType("REPEAT", 2);

        private static final /* synthetic */ IconType[] $values() {
            return new IconType[]{PLAY, PAUSE, REPEAT};
        }

        static {
            IconType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private IconType(String str, int i11) {
        }

        public static IconType valueOf(String str) {
            return (IconType) Enum.valueOf(IconType.class, str);
        }

        public static IconType[] values() {
            return (IconType[]) $VALUES.clone();
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

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
            int[] iArr2 = new int[IconType.values().length];
            try {
                iArr2[IconType.PLAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[IconType.PAUSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[IconType.REPEAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public HotelsGalleryFullPagerVideoViewHolder(@NotNull ItemHotelsGalleryFullVideoBinding binding, @NotNull Function0<HotelsGalleryVideoPlayer> galleryVideoPlayerProvider, @NotNull SoundController soundController, @NotNull l tokenizedAnalytics) {
        super(r0, null);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(galleryVideoPlayerProvider, "galleryVideoPlayerProvider");
        Intrinsics.checkNotNullParameter(soundController, "soundController");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        ConstraintLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        this.galleryVideoPlayerProvider = galleryVideoPlayerProvider;
        this.soundController = soundController;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.lifecycleObserver = new C5433u(this, 1);
        binding.exoPlayerV.setTag(R.id.tag_key_widget_name, "travel.hotelsGalleryFull");
        binding.exoPlayerV.setOnClickListener(new ViewOnClickListenerC2975b(this, 10));
        binding.soundControlIv.setOnClickListener(new AU.a(this, 8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Pair<Integer, Integer> calculateOptimalVideoSize(ItemHotelsGalleryFullVideoBinding binding, Q videoSize) {
        int height = binding.getConstraintLayout().getHeight() - binding.playerControlsView.getHeight();
        int width = binding.getConstraintLayout().getWidth();
        int i11 = videoSize.f69044b;
        if (i11 < 1) {
            i11 = 1;
        }
        float f7 = (videoSize.f69043a >= 1 ? r5 : 1) / i11;
        int i12 = (int) (width / f7);
        return height >= i12 ? new Pair<>(Integer.valueOf(width), Integer.valueOf(i12)) : new Pair<>(Integer.valueOf((int) (height * f7)), Integer.valueOf(height));
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
        final ItemHotelsGalleryFullVideoBinding itemHotelsGalleryFullVideoBinding = this.binding;
        itemHotelsGalleryFullVideoBinding.videoPreviewIv.animate().alpha(0.0f).setDuration(125L).setListener(new AnimatorListenerAdapter() { // from class: ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFull.v1.presentation.pager.HotelsGalleryFullPagerVideoViewHolder$hidePreview$1$1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                AppCompatImageView videoPreviewIv = ItemHotelsGalleryFullVideoBinding.this.videoPreviewIv;
                Intrinsics.checkNotNullExpressionValue(videoPreviewIv, "videoPreviewIv");
                ViewExtKt.gone(videoPreviewIv);
            }
        }).start();
        itemHotelsGalleryFullVideoBinding.exoPlayerV.animate().alpha(1.0f).setStartDelay(100L).setDuration(200L).start();
    }

    private final HotelsGalleryVideoPlayer initPlayer() {
        HotelsGalleryVideoPlayer invoke = this.galleryVideoPlayerProvider.invoke();
        invoke.setOnBuffering(new HotelsGalleryFullPagerVideoViewHolder$initPlayer$1$1(this, invoke));
        invoke.setOnRenderedFirstFrame(new HotelsGalleryFullPagerVideoViewHolder$initPlayer$1$2(this));
        invoke.setOnError(new HotelsGalleryFullPagerVideoViewHolder$initPlayer$1$3(this));
        invoke.setOnReady(new HotelsGalleryFullPagerVideoViewHolder$initPlayer$1$4(this));
        invoke.setOnStart(new HotelsGalleryFullPagerVideoViewHolder$initPlayer$1$5(this));
        invoke.setOnPause(new HotelsGalleryFullPagerVideoViewHolder$initPlayer$1$6(this));
        invoke.setOnFinish(new HotelsGalleryFullPagerVideoViewHolder$initPlayer$1$7(this));
        invoke.setOnHasAudio(new HotelsGalleryFullPagerVideoViewHolder$initPlayer$1$8(this));
        invoke.setOnVideoSizeChanged(new HotelsGalleryFullPagerVideoViewHolder$initPlayer$1$9(this));
        return invoke;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$5$lambda$3(HotelsGalleryFullPagerVideoViewHolder hotelsGalleryFullPagerVideoViewHolder, View view) {
        HotelsGalleryVideoPlayer hotelsGalleryVideoPlayer = hotelsGalleryFullPagerVideoViewHolder.videoPlayer;
        if (hotelsGalleryVideoPlayer != null) {
            if (hotelsGalleryVideoPlayer.isPlaying()) {
                hotelsGalleryFullPagerVideoViewHolder.pauseVideo();
            } else if (hotelsGalleryVideoPlayer.isPaused()) {
                hotelsGalleryFullPagerVideoViewHolder.playVideo();
            } else {
                hotelsGalleryFullPagerVideoViewHolder.repeatVideo();
                Unit unit = Unit.f71690a;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$5$lambda$4(HotelsGalleryFullPagerVideoViewHolder hotelsGalleryFullPagerVideoViewHolder, View view) {
        hotelsGalleryFullPagerVideoViewHolder.soundController.setSoundMutedState(!r0.isMuted());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lifecycleObserver$lambda$0(HotelsGalleryFullPagerVideoViewHolder hotelsGalleryFullPagerVideoViewHolder, J j11, AbstractC5434v.a event) {
        Intrinsics.checkNotNullParameter(j11, "<unused var>");
        Intrinsics.checkNotNullParameter(event, "event");
        hotelsGalleryFullPagerVideoViewHolder.handleLifecycleEvent(event);
    }

    private final void loadPreview(String imageUrl) {
        ItemHotelsGalleryFullVideoBinding itemHotelsGalleryFullVideoBinding = this.binding;
        itemHotelsGalleryFullVideoBinding.exoPlayerV.setAlpha(0.0f);
        AppCompatImageView videoPreviewIv = itemHotelsGalleryFullVideoBinding.videoPreviewIv;
        Intrinsics.checkNotNullExpressionValue(videoPreviewIv, "videoPreviewIv");
        ViewExtKt.show(videoPreviewIv);
        AppCompatImageView videoPreviewIv2 = itemHotelsGalleryFullVideoBinding.videoPreviewIv;
        Intrinsics.checkNotNullExpressionValue(videoPreviewIv2, "videoPreviewIv");
        ImageViewExtKt.loadWithCrossFade$default(videoPreviewIv2, imageUrl, null, null, 6, null);
    }

    private final void onPause() {
        HotelsGalleryVideoPlayer hotelsGalleryVideoPlayer = this.videoPlayer;
        if (hotelsGalleryVideoPlayer != null) {
            hotelsGalleryVideoPlayer.pause();
            this.savedPlayerPosition = hotelsGalleryVideoPlayer.getPosition();
        }
    }

    private final void onStart() {
        HotelsGalleryFullVI.Video video = this.vo;
        if (video == null || !video.getIsAutoplay()) {
            return;
        }
        playVideo();
    }

    private final void onStop() {
        this.binding.exoPlayerV.setKeepScreenOn(false);
    }

    private final Unit pauseVideo() {
        HotelsGalleryVideoPlayer hotelsGalleryVideoPlayer = this.videoPlayer;
        if (hotelsGalleryVideoPlayer == null) {
            return null;
        }
        hotelsGalleryVideoPlayer.pause();
        return Unit.f71690a;
    }

    private final Unit playVideo() {
        this.binding.exoPlayerV.setKeepScreenOn(true);
        if (this.isFinished) {
            repeatVideo();
        } else {
            HotelsGalleryVideoPlayer hotelsGalleryVideoPlayer = this.videoPlayer;
            if (hotelsGalleryVideoPlayer == null) {
                return null;
            }
            hotelsGalleryVideoPlayer.resume();
        }
        return Unit.f71690a;
    }

    private final void releasePlayer() {
        HotelsGalleryVideoPlayer hotelsGalleryVideoPlayer = this.videoPlayer;
        if (hotelsGalleryVideoPlayer != null) {
            hotelsGalleryVideoPlayer.clearAllCallbacks$hotels_prodGoogleAllVendorsRelease(hotelsGalleryVideoPlayer);
            hotelsGalleryVideoPlayer.release();
        }
        this.videoPlayer = null;
    }

    private final void repeatVideo() {
        HotelsGalleryVideoPlayer hotelsGalleryVideoPlayer = this.videoPlayer;
        if (hotelsGalleryVideoPlayer != null) {
            hotelsGalleryVideoPlayer.setPosition(0L);
        }
        this.isFinished = false;
        playVideo();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showControlIcon(IconType icon) {
        ItemHotelsGalleryFullVideoBinding itemHotelsGalleryFullVideoBinding = this.binding;
        B0 b02 = this.hidePauseJob;
        if (b02 != null) {
            b02.j(null);
        }
        int i11 = icon == null ? -1 : WhenMappings.$EnumSwitchMapping$1[icon.ordinal()];
        if (i11 == -1) {
            AppCompatImageView playerControlsButtonIv = itemHotelsGalleryFullVideoBinding.playerControlsButtonIv;
            Intrinsics.checkNotNullExpressionValue(playerControlsButtonIv, "playerControlsButtonIv");
            ViewExtKt.gone(playerControlsButtonIv);
            return;
        }
        if (i11 == 1) {
            itemHotelsGalleryFullVideoBinding.playerControlsButtonIv.setImageResource(R$drawable.ic_m_play_sign_filled);
            AppCompatImageView playerControlsButtonIv2 = itemHotelsGalleryFullVideoBinding.playerControlsButtonIv;
            Intrinsics.checkNotNullExpressionValue(playerControlsButtonIv2, "playerControlsButtonIv");
            ViewExtKt.show(playerControlsButtonIv2);
            return;
        }
        if (i11 == 2) {
            itemHotelsGalleryFullVideoBinding.playerControlsButtonIv.setImageResource(R$drawable.ic_m_pause_sign_filled);
            AppCompatImageView playerControlsButtonIv3 = itemHotelsGalleryFullVideoBinding.playerControlsButtonIv;
            Intrinsics.checkNotNullExpressionValue(playerControlsButtonIv3, "playerControlsButtonIv");
            ViewExtKt.show(playerControlsButtonIv3);
            this.hidePauseJob = C10727i.c(K.a(this), null, null, new HotelsGalleryFullPagerVideoViewHolder$showControlIcon$1$1(itemHotelsGalleryFullVideoBinding, null), 3);
            return;
        }
        if (i11 != 3) {
            throw new o();
        }
        itemHotelsGalleryFullVideoBinding.playerControlsButtonIv.setImageResource(R$drawable.ic_m_rotate_left_filled);
        AppCompatImageView playerControlsButtonIv4 = itemHotelsGalleryFullVideoBinding.playerControlsButtonIv;
        Intrinsics.checkNotNullExpressionValue(playerControlsButtonIv4, "playerControlsButtonIv");
        ViewExtKt.show(playerControlsButtonIv4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showProgress(boolean show) {
        ItemHotelsGalleryFullVideoBinding itemHotelsGalleryFullVideoBinding = this.binding;
        if (show) {
            itemHotelsGalleryFullVideoBinding.playerPb.d();
        } else {
            itemHotelsGalleryFullVideoBinding.playerPb.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateSoundIcon(boolean isMuted) {
        this.binding.soundControlIv.setImageResource(isMuted ? R$drawable.ic_l_volume_no_filled : R$drawable.ic_l_volume_filled);
    }

    public final void bind(@NotNull HotelsGalleryFullVI.Video item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.vo = item;
        showProgress(true);
        String image = item.getPreviewImage().getImage();
        if (image != null) {
            loadPreview(image);
        }
        if (this.videoPlayer == null) {
            this.videoPlayer = initPlayer();
        }
        HotelsGalleryVideoPlayer hotelsGalleryVideoPlayer = this.videoPlayer;
        if (hotelsGalleryVideoPlayer != null) {
            String link = item.getVideo().getLink();
            PlayerView exoPlayerV = this.binding.exoPlayerV;
            Intrinsics.checkNotNullExpressionValue(exoPlayerV, "exoPlayerV");
            hotelsGalleryVideoPlayer.bind(link, exoPlayerV, this.soundController.isMuted(), this.savedPlayerPosition, false);
        }
        ItemHotelsGalleryFullVideoBinding itemHotelsGalleryFullVideoBinding = this.binding;
        itemHotelsGalleryFullVideoBinding.playerControlsView.A(itemHotelsGalleryFullVideoBinding.exoPlayerV.s());
    }

    @Override // jk0.j
    public void onAttach() {
        super.onAttach();
        getLifecycle().a(this.lifecycleObserver);
        this.soundJob = C2399j.C(new C2408n0(this.soundController.getSoundMutedStateFlow(), new HotelsGalleryFullPagerVideoViewHolder$onAttach$1(this, null)), K.a(this));
    }

    @Override // jk0.j
    public void onDetach() {
        super.onDetach();
        getLifecycle().e(this.lifecycleObserver);
        B0 b02 = this.soundJob;
        if (b02 != null) {
            b02.j(null);
        }
        B0 b03 = this.hidePauseJob;
        if (b03 != null) {
            b03.j(null);
        }
    }

    @Override // jk0.j
    public void onRecycle() {
        super.onRecycle();
        releasePlayer();
        this.isSecondFrame = false;
    }

    @Override // jk0.j, lk0.b
    public void onViewInVisibleBounds() {
        super.onViewInVisibleBounds();
        l lVar = this.tokenizedAnalytics;
        HotelsGalleryFullVI.Video video = this.vo;
        TokenizedAnalyticsExtKt.processViewEvents(lVar, video != null ? video.getTrackingInfo() : null);
    }
}
