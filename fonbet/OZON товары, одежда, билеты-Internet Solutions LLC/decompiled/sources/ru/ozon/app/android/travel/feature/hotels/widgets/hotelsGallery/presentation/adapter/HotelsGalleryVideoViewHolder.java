package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGallery.presentation.adapter;

import A00.a;
import Ae.C;
import Ae.C2399j;
import Ae.C2408n0;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Am.b;
import Gw.ViewOnClickListenerC3131a;
import Hs.e;
import Sc.s;
import WZ.l;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5427n;
import androidx.lifecycle.G;
import androidx.lifecycle.H;
import androidx.lifecycle.J;
import androidx.lifecycle.W;
import androidx.media3.ui.PlayerView;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import mc.C8125a;
import nc.InterfaceC8487b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.pdp.ui.configurators.analitycs.TokenizedAnalyticsExtKt;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.travel.feature.hotels.databinding.ItemHotelsGalleryVideoItemBinding;
import ru.ozon.app.android.travel.feature.hotels.shared.player.HotelsGalleryVideoPlayer;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGallery.presentation.GalleryAction;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGallery.presentation.HotelsGalleryVO;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGallery.presentation.HotelsGalleryViewModel;
import ru.ozon.app.android.video.player.soundservice.SoundController;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0013H\u0002¢\u0006\u0004\b \u0010\u001bJ\u000f\u0010!\u001a\u00020\u0013H\u0002¢\u0006\u0004\b!\u0010\u001bJ\u000f\u0010\"\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\"\u0010\u001bJ\u0011\u0010#\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0007H\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0013H\u0002¢\u0006\u0004\b'\u0010\u001bJ\u000f\u0010(\u001a\u00020\u0013H\u0016¢\u0006\u0004\b(\u0010\u001bJ\u000f\u0010)\u001a\u00020\u0013H\u0016¢\u0006\u0004\b)\u0010\u001bJ\u000f\u0010*\u001a\u00020\u0013H\u0016¢\u0006\u0004\b*\u0010\u001bJ\u000f\u0010+\u001a\u00020\u0013H\u0016¢\u0006\u0004\b+\u0010\u001bJ\u0015\u0010.\u001a\u00020\u00132\u0006\u0010-\u001a\u00020,¢\u0006\u0004\b.\u0010/R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00100R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00101R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00102R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00103R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u00104R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u00105R\u0018\u00106\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u00108\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010;\u001a\u00020:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0018\u0010>\u001a\u0004\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010@\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010B\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010AR\u0014\u0010D\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u001a\u0010H\u001a\b\u0012\u0004\u0012\u00020G0F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010I¨\u0006J"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/presentation/adapter/HotelsGalleryVideoViewHolder;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/presentation/adapter/HotelsGalleryItemViewHolder;", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/travel/feature/hotels/databinding/ItemHotelsGalleryVideoItemBinding;", "binding", "Lkotlin/Function0;", "Lru/ozon/app/android/travel/feature/hotels/shared/player/HotelsGalleryVideoPlayer;", "galleryVideoPlayerProvider", "Lru/ozon/app/android/video/player/soundservice/SoundController;", "soundController", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/presentation/HotelsGalleryViewModel;", "galleryViewModel", "LWZ/l;", "tokenizedAnalytics", "<init>", "(Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/travel/feature/hotels/databinding/ItemHotelsGalleryVideoItemBinding;Lkotlin/jvm/functions/Function0;Lru/ozon/app/android/video/player/soundservice/SoundController;Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/presentation/HotelsGalleryViewModel;LWZ/l;)V", "", "show", "", "showProgress", "(Z)V", "", "imageUrl", "loadPreview", "(Ljava/lang/String;)V", "hidePreview", "()V", "Landroidx/lifecycle/v$a;", "event", "handleLifecycleEvent", "(Landroidx/lifecycle/v$a;)V", "onStart", "onPause", "onStop", "playVideo", "()Lkotlin/Unit;", "initPlayer", "()Lru/ozon/app/android/travel/feature/hotels/shared/player/HotelsGalleryVideoPlayer;", "releasePlayer", "onAttach", "onViewInVisibleBounds", "onDetach", "onRecycle", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/presentation/HotelsGalleryVO$Video;", "item", "bind", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/presentation/HotelsGalleryVO$Video;)V", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/travel/feature/hotels/databinding/ItemHotelsGalleryVideoItemBinding;", "Lkotlin/jvm/functions/Function0;", "Lru/ozon/app/android/video/player/soundservice/SoundController;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/presentation/HotelsGalleryViewModel;", "LWZ/l;", "vo", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/presentation/HotelsGalleryVO$Video;", "videoPlayer", "Lru/ozon/app/android/travel/feature/hotels/shared/player/HotelsGalleryVideoPlayer;", "", "savedPlayerPosition", "J", "Lnc/b;", "soundDisposable", "Lnc/b;", "isSwipeRefresh", "Z", "isSecondFrame", "Landroidx/lifecycle/G;", "lifecycleObserver", "Landroidx/lifecycle/G;", "Landroidx/lifecycle/W;", "LA00/a;", "swipeRefreshBusEventObserver", "Landroidx/lifecycle/W;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsGalleryVideoViewHolder extends HotelsGalleryItemViewHolder {

    @NotNull
    private final ItemHotelsGalleryVideoItemBinding binding;

    @NotNull
    private final Function0<HotelsGalleryVideoPlayer> galleryVideoPlayerProvider;

    @NotNull
    private final HotelsGalleryViewModel galleryViewModel;
    private boolean isSecondFrame;
    private boolean isSwipeRefresh;

    @NotNull
    private final G lifecycleObserver;

    @NotNull
    private final ComposerReferences refs;
    private long savedPlayerPosition;

    @NotNull
    private final SoundController soundController;
    private InterfaceC8487b soundDisposable;

    @NotNull
    private final W<a> swipeRefreshBusEventObserver;

    @NotNull
    private final l tokenizedAnalytics;
    private HotelsGalleryVideoPlayer videoPlayer;
    private HotelsGalleryVO.Video vo;

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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public HotelsGalleryVideoViewHolder(@NotNull ComposerReferences refs, @NotNull ItemHotelsGalleryVideoItemBinding binding, @NotNull Function0<HotelsGalleryVideoPlayer> galleryVideoPlayerProvider, @NotNull SoundController soundController, @NotNull HotelsGalleryViewModel galleryViewModel, @NotNull l tokenizedAnalytics) {
        super(r0, null);
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(galleryVideoPlayerProvider, "galleryVideoPlayerProvider");
        Intrinsics.checkNotNullParameter(soundController, "soundController");
        Intrinsics.checkNotNullParameter(galleryViewModel, "galleryViewModel");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        FrameLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.refs = refs;
        this.binding = binding;
        this.galleryVideoPlayerProvider = galleryVideoPlayerProvider;
        this.soundController = soundController;
        this.galleryViewModel = galleryViewModel;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.lifecycleObserver = new SD.a(this, 1);
        this.swipeRefreshBusEventObserver = new ZR.a(this, 0);
        binding.exoPlayerV.setTag(R.id.tag_key_widget_name, "travel.hotelsGallery");
        binding.getConstraintLayout().setOnClickListener(new ViewOnClickListenerC3131a(this, 6));
        binding.videoPlayButtonIv.setOnClickListener(new b(this, 10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$4(HotelsGalleryVideoViewHolder hotelsGalleryVideoViewHolder, View view) {
        AtomAction action;
        HotelsGalleryVO.Video video = hotelsGalleryVideoViewHolder.vo;
        if (video == null || (action = video.getAction()) == null) {
            return;
        }
        hotelsGalleryVideoViewHolder.galleryViewModel.galleryVideoItemClicked(action, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$5(HotelsGalleryVideoViewHolder hotelsGalleryVideoViewHolder, View view) {
        AppCompatImageView videoPlayButtonIv = hotelsGalleryVideoViewHolder.binding.videoPlayButtonIv;
        Intrinsics.checkNotNullExpressionValue(videoPlayButtonIv, "videoPlayButtonIv");
        videoPlayButtonIv.setVisibility(8);
        hotelsGalleryVideoViewHolder.playVideo();
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
        final ItemHotelsGalleryVideoItemBinding itemHotelsGalleryVideoItemBinding = this.binding;
        itemHotelsGalleryVideoItemBinding.videoPreviewIv.animate().alpha(0.0f).setDuration(125L).setListener(new AnimatorListenerAdapter() { // from class: ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGallery.presentation.adapter.HotelsGalleryVideoViewHolder$hidePreview$1$1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                AppCompatImageView videoPreviewIv = ItemHotelsGalleryVideoItemBinding.this.videoPreviewIv;
                Intrinsics.checkNotNullExpressionValue(videoPreviewIv, "videoPreviewIv");
                ViewExtKt.gone(videoPreviewIv);
            }
        }).start();
        itemHotelsGalleryVideoItemBinding.exoPlayerV.animate().alpha(1.0f).setStartDelay(100L).setDuration(200L).start();
    }

    private final HotelsGalleryVideoPlayer initPlayer() {
        HotelsGalleryVideoPlayer invoke = this.galleryVideoPlayerProvider.invoke();
        invoke.setOnBuffering(new HotelsGalleryVideoViewHolder$initPlayer$1$1(this, invoke));
        invoke.setOnRenderedFirstFrame(new HotelsGalleryVideoViewHolder$initPlayer$1$2(this));
        invoke.setOnError(new HotelsGalleryVideoViewHolder$initPlayer$1$3(this));
        invoke.setOnStart(new HotelsGalleryVideoViewHolder$initPlayer$1$4(this));
        return invoke;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lifecycleObserver$lambda$0(HotelsGalleryVideoViewHolder hotelsGalleryVideoViewHolder, J j11, AbstractC5434v.a event) {
        Intrinsics.checkNotNullParameter(j11, "<unused var>");
        Intrinsics.checkNotNullParameter(event, "event");
        hotelsGalleryVideoViewHolder.handleLifecycleEvent(event);
    }

    private final void loadPreview(String imageUrl) {
        ItemHotelsGalleryVideoItemBinding itemHotelsGalleryVideoItemBinding = this.binding;
        itemHotelsGalleryVideoItemBinding.exoPlayerV.setAlpha(0.0f);
        AppCompatImageView videoPreviewIv = itemHotelsGalleryVideoItemBinding.videoPreviewIv;
        Intrinsics.checkNotNullExpressionValue(videoPreviewIv, "videoPreviewIv");
        ViewExtKt.show(videoPreviewIv);
        AppCompatImageView videoPreviewIv2 = itemHotelsGalleryVideoItemBinding.videoPreviewIv;
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
        HotelsGalleryVO.Video video = this.vo;
        if (video == null || !video.getIsAutoPlay()) {
            return;
        }
        playVideo();
    }

    private final void onStop() {
        this.binding.exoPlayerV.setKeepScreenOn(false);
    }

    private final Unit playVideo() {
        this.binding.exoPlayerV.setKeepScreenOn(true);
        HotelsGalleryVideoPlayer hotelsGalleryVideoPlayer = this.videoPlayer;
        if (hotelsGalleryVideoPlayer == null) {
            return null;
        }
        hotelsGalleryVideoPlayer.resume();
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

    /* JADX INFO: Access modifiers changed from: private */
    public final void showProgress(boolean show) {
        ItemHotelsGalleryVideoItemBinding itemHotelsGalleryVideoItemBinding = this.binding;
        if (show) {
            itemHotelsGalleryVideoItemBinding.playerPb.d();
        } else {
            itemHotelsGalleryVideoItemBinding.playerPb.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void swipeRefreshBusEventObserver$lambda$1(HotelsGalleryVideoViewHolder hotelsGalleryVideoViewHolder, a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof a.u.c) {
            hotelsGalleryVideoViewHolder.isSwipeRefresh = true;
            return;
        }
        if ((event instanceof a.C2370k) && hotelsGalleryVideoViewHolder.isSwipeRefresh) {
            hotelsGalleryVideoViewHolder.isSwipeRefresh = false;
            HotelsGalleryVideoPlayer hotelsGalleryVideoPlayer = hotelsGalleryVideoViewHolder.videoPlayer;
            if (hotelsGalleryVideoPlayer != null) {
                hotelsGalleryVideoPlayer.setPosition(0L);
            }
        }
    }

    public final void bind(@NotNull HotelsGalleryVO.Video item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.vo = item;
        showProgress(true);
        loadPreview(item.getPreviewImageUrl());
        AppCompatImageView videoPlayButtonIv = this.binding.videoPlayButtonIv;
        Intrinsics.checkNotNullExpressionValue(videoPlayButtonIv, "videoPlayButtonIv");
        videoPlayButtonIv.setVisibility(!item.getIsAutoPlay() ? 0 : 8);
        if (this.videoPlayer == null) {
            this.videoPlayer = initPlayer();
        }
        HotelsGalleryVideoPlayer hotelsGalleryVideoPlayer = this.videoPlayer;
        if (hotelsGalleryVideoPlayer != null) {
            String link = item.getVideo().getLink();
            PlayerView exoPlayerV = this.binding.exoPlayerV;
            Intrinsics.checkNotNullExpressionValue(exoPlayerV, "exoPlayerV");
            HotelsGalleryVideoPlayer.bind$default(hotelsGalleryVideoPlayer, link, exoPlayerV, this.soundController.isMuted(), this.savedPlayerPosition, false, 16, null);
        }
    }

    @Override // jk0.j
    public void onAttach() {
        super.onAttach();
        this.refs.getController().getEvents().observe(this, this.swipeRefreshBusEventObserver);
        getLifecycle().a(this.lifecycleObserver);
        this.soundDisposable = this.soundController.getSoundMutedState().subscribeOn(Mc.a.b()).observeOn(C8125a.a()).subscribe(new e(new HotelsGalleryVideoViewHolder$onAttach$1(this), 3));
        final InterfaceC2395h a11 = C5427n.a(this.galleryViewModel.getAction(), getLifecycle(), AbstractC5434v.b.STARTED);
        C2399j.C(new C(new C2408n0(new InterfaceC2395h<Object>() { // from class: ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGallery.presentation.adapter.HotelsGalleryVideoViewHolder$onAttach$$inlined$filterIsInstance$1

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGallery.presentation.adapter.HotelsGalleryVideoViewHolder$onAttach$$inlined$filterIsInstance$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC2397i {
                final /* synthetic */ InterfaceC2397i $this_unsafeFlow;

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGallery.presentation.adapter.HotelsGalleryVideoViewHolder$onAttach$$inlined$filterIsInstance$1$2", f = "HotelsGalleryVideoViewHolder.kt", l = {50}, m = "emit")
                /* renamed from: ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGallery.presentation.adapter.HotelsGalleryVideoViewHolder$onAttach$$inlined$filterIsInstance$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends c {
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= LinearLayoutManager.INVALID_OFFSET;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(InterfaceC2397i interfaceC2397i) {
                    this.$this_unsafeFlow = interfaceC2397i;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                @Override // Ae.InterfaceC2397i
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, d dVar) {
                    AnonymousClass1 anonymousClass1;
                    int i11;
                    if (dVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) dVar;
                        int i12 = anonymousClass1.label;
                        if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                            anonymousClass1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                            Object obj2 = anonymousClass1.result;
                            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                            i11 = anonymousClass1.label;
                            if (i11 != 0) {
                                s.b(obj2);
                                InterfaceC2397i interfaceC2397i = this.$this_unsafeFlow;
                                if (obj instanceof GalleryAction.VideoItemClicked) {
                                    anonymousClass1.label = 1;
                                    if (interfaceC2397i.emit(obj, anonymousClass1) == aVar) {
                                        return aVar;
                                    }
                                }
                            } else {
                                if (i11 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                s.b(obj2);
                            }
                            return Unit.f71690a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(dVar);
                    Object obj22 = anonymousClass1.result;
                    Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                    i11 = anonymousClass1.label;
                    if (i11 != 0) {
                    }
                    return Unit.f71690a;
                }
            }

            @Override // Ae.InterfaceC2395h
            public Object collect(InterfaceC2397i<? super Object> interfaceC2397i, d dVar) {
                Object collect = InterfaceC2395h.this.collect(new AnonymousClass2(interfaceC2397i), dVar);
                return collect == Wc.a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
            }
        }, new HotelsGalleryVideoViewHolder$onAttach$2(this, null)), new HotelsGalleryVideoViewHolder$onAttach$3(null)), H.a(getLifecycle()));
    }

    @Override // jk0.j
    public void onDetach() {
        super.onDetach();
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
        this.isSecondFrame = false;
    }

    @Override // jk0.j, lk0.b
    public void onViewInVisibleBounds() {
        super.onViewInVisibleBounds();
        AppCompatImageView videoPlayButtonIv = this.binding.videoPlayButtonIv;
        Intrinsics.checkNotNullExpressionValue(videoPlayButtonIv, "videoPlayButtonIv");
        HotelsGalleryVO.Video video = this.vo;
        videoPlayButtonIv.setVisibility(video != null && !video.getIsAutoPlay() ? 0 : 8);
        l lVar = this.tokenizedAnalytics;
        HotelsGalleryVO.Video video2 = this.vo;
        TokenizedAnalyticsExtKt.processViewEvents(lVar, video2 != null ? video2.getTrackingInfo() : null);
    }
}
