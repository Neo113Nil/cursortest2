package ru.ozon.app.android.pdp.widgets.galleryFullView.presentation.fullView;

import KD.i;
import KD.j;
import Sc.InterfaceC4008j;
import U7.d;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.core.content.a;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.G;
import androidx.lifecycle.J;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import mc.C8125a;
import nc.InterfaceC8487b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.gallery.common.VolumeContentObserver;
import ru.ozon.app.android.pdp.R$drawable;
import ru.ozon.app.android.pdp.ui.configurators.analitycs.TokenizedAnalyticsExtKt;
import ru.ozon.app.android.pdp.utils.DelegatesKt;
import ru.ozon.app.android.pdp.widgets.galleryFullView.presentation.GalleryFullViewVO;
import ru.ozon.app.android.pdp.widgets.galleryFullView.presentation.GallerySyncViewModelImpl;
import ru.ozon.app.android.pdp.widgets.galleryV4.presentation.GallerySyncModel;
import ru.ozon.app.android.pdpvideomolecule.data.PlayerStateKt;
import ru.ozon.app.android.pdpvideomolecule.data.VideoMolecule;
import ru.ozon.app.android.pdpvideomolecule.presentation.view.VideoMoleculeApi;
import ru.ozon.app.android.pdpvideomolecule.presentation.viewholder.VideoMoleculeViewHolder;
import ru.ozon.app.android.pdpvideomolecule.presentation.viewholder.player.VideoMoleculePlayerDelegate;
import ru.ozon.app.android.pdpvideomolecule.presentation.visibilitydelegate.VideoMoleculeVisibilityDelegateListener;
import ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.pikazon.glide.transformations.ImageTransformation;
import ru.ozon.app.android.video.player.PlayerState;
import ru.ozon.app.android.video.player.soundservice.SoundController;
import ru.ozon.app.android.video.player.soundservice.SoundScope;
import ru.ozon.app.android.video.player.soundservice.SoundService;
import ru.ozon.app.android.video.playerV2.playerController.base.listeners.OnBufferPlayerControllerListener;
import ru.ozon.app.android.video.playerV2.playerController.base.listeners.OnErrorPlayerControllerListener;
import ru.ozon.app.android.video.playerV2.playerController.base.listeners.OnFinishPlayerControllerListener;
import ru.ozon.app.android.video.playerV2.playerController.base.listeners.OnReadyPlayerControllerListener;
import ru.ozon.app.android.video.playerV2.playerController.base.listeners.OnRenderedFirstFramePlayerControllerListener;
import ru.ozon.app.android.video.playerV2.playerController.base.listeners.OnStartPlayerControllerListener;
import ru.ozon.app.android.video.playerV2.playerController.base.listeners.PlayerListenersContainer;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;

@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0001\u0018\u0000 c2\u00020\u0001:\u0001cB7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0012J\u000f\u0010\u0015\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0015\u0010\u0012J\u000f\u0010\u0016\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0016\u0010\u0012J\u0017\u0010\u0019\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001e\u0010\u0012J\u000f\u0010\u001f\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001f\u0010\u0012J\u0017\u0010\"\u001a\u00020\u00102\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\u00102\u0006\u0010$\u001a\u00020 H\u0002¢\u0006\u0004\b%\u0010#J\u000f\u0010&\u001a\u00020\u0010H\u0002¢\u0006\u0004\b&\u0010\u0012J\u0017\u0010'\u001a\u00020\u00102\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b'\u0010#J\u000f\u0010(\u001a\u00020\u0010H\u0002¢\u0006\u0004\b(\u0010\u0012J\u0017\u0010*\u001a\u00020 2\u0006\u0010)\u001a\u00020 H\u0002¢\u0006\u0004\b*\u0010+J\u0017\u0010-\u001a\u00020\u00102\u0006\u0010,\u001a\u00020 H\u0002¢\u0006\u0004\b-\u0010#J\u000f\u0010.\u001a\u00020\u0010H\u0002¢\u0006\u0004\b.\u0010\u0012J\u000f\u0010/\u001a\u00020\u0010H\u0002¢\u0006\u0004\b/\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00100R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00101R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00102R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00103R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00104R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00105R\u001a\u00108\u001a\b\u0012\u0004\u0012\u000207068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0018\u0010:\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0018\u0010<\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0018\u0010?\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0018\u0010B\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0016\u0010E\u001a\u00020D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0016\u0010G\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0016\u0010I\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010HR\u0014\u0010K\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0016\u0010N\u001a\u00020M8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010Q\u001a\u00020P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0016\u0010T\u001a\u0004\u0018\u00010S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u001d\u0010Z\u001a\u0004\u0018\u00010S8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\bX\u0010YR\u001d\u0010]\u001a\u0004\u0018\u00010S8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b[\u0010W\u001a\u0004\b\\\u0010YR\u0014\u0010`\u001a\u00020D8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b^\u0010_R\u0014\u0010a\u001a\u00020 8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\ba\u0010b¨\u0006d"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/fullView/VideoGalleryFullViewHolder;", "Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/fullView/BaseGalleryFullViewHolder;", "Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/fullView/GalleryFullViewVideoScreenBinding;", "binding", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/pdpvideomolecule/presentation/viewholder/player/VideoMoleculePlayerDelegate;", "playerDelegate", "Lru/ozon/app/android/gallery/common/VolumeContentObserver;", "volumeContentObserver", "Lru/ozon/app/android/video/player/soundservice/SoundService;", "soundService", "Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/GallerySyncViewModelImpl;", "widgetViewModel", "<init>", "(Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/fullView/GalleryFullViewVideoScreenBinding;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/pdpvideomolecule/presentation/viewholder/player/VideoMoleculePlayerDelegate;Lru/ozon/app/android/gallery/common/VolumeContentObserver;Lru/ozon/app/android/video/player/soundservice/SoundService;Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/GallerySyncViewModelImpl;)V", "", "onAttach", "()V", "onDetach", "onViewOutOfVisibleBounds", "onViewInVisibleBounds", "onRecycle", "Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/GalleryFullViewVO$GalleryItemVO$Video;", "item", "bind", "(Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/GalleryFullViewVO$GalleryItemVO$Video;)Lkotlin/Unit;", "Lru/ozon/app/android/pdpvideomolecule/presentation/viewholder/VideoMoleculeViewHolder;", "createVideoViewHolder", "()Lru/ozon/app/android/pdpvideomolecule/presentation/viewholder/VideoMoleculeViewHolder;", "unsubscribeFromSoundController", "stopListeningVolumeChangeEvents", "", "isMuted", "setMute", "(Z)V", "show", "showProgress", "showVideoMolecule", "updateVolumeButtonIcon", "onFinishVideo", "isShow", "updateVolumeButtonVisibility", "(Z)Z", "isRewinding", "onRewindStateChanged", "startListeningForVolumeChangeEvents", "subscribeToSoundController", "Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/fullView/GalleryFullViewVideoScreenBinding;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/pdpvideomolecule/presentation/viewholder/player/VideoMoleculePlayerDelegate;", "Lru/ozon/app/android/gallery/common/VolumeContentObserver;", "Lru/ozon/app/android/video/player/soundservice/SoundService;", "Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/GallerySyncViewModelImpl;", "", "Lru/ozon/app/android/pikazon/glide/transformations/ImageTransformation$Blur;", "transformation", "Ljava/util/List;", "videoItem", "Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/GalleryFullViewVO$GalleryItemVO$Video;", "viewHolder", "Lru/ozon/app/android/pdpvideomolecule/presentation/viewholder/VideoMoleculeViewHolder;", "Lru/ozon/app/android/video/player/soundservice/SoundController;", "soundController", "Lru/ozon/app/android/video/player/soundservice/SoundController;", "Lnc/b;", "soundDisposable", "Lnc/b;", "", "currentPosition", "I", "isPlayerReady", "Z", "isBlurReady", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "Landroid/widget/ImageView;", "blurView", "Landroid/widget/ImageView;", "Landroidx/lifecycle/G;", "lifecycleObserver", "Landroidx/lifecycle/G;", "Landroid/graphics/drawable/Drawable;", "portraitBackground", "Landroid/graphics/drawable/Drawable;", "soundOffIcon$delegate", "LSc/j;", "getSoundOffIcon", "()Landroid/graphics/drawable/Drawable;", "soundOffIcon", "soundOnIcon$delegate", "getSoundOnIcon", "soundOnIcon", "getOrientation", "()I", "orientation", "isPortrait", "()Z", "Companion", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class VideoGalleryFullViewHolder extends BaseGalleryFullViewHolder {

    @NotNull
    private final GalleryFullViewVideoScreenBinding binding;

    @NotNull
    private ImageView blurView;
    private int currentPosition;

    @NotNull
    private final Handler handler;
    private boolean isBlurReady;
    private boolean isPlayerReady;

    @NotNull
    private final G lifecycleObserver;

    @NotNull
    private final VideoMoleculePlayerDelegate playerDelegate;
    private final Drawable portraitBackground;

    @NotNull
    private final ComposerReferences refs;
    private SoundController soundController;
    private InterfaceC8487b soundDisposable;

    /* renamed from: soundOffIcon$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j soundOffIcon;

    /* renamed from: soundOnIcon$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j soundOnIcon;

    @NotNull
    private final SoundService soundService;

    @NotNull
    private final List<ImageTransformation.Blur> transformation;
    private GalleryFullViewVO.GalleryItemVO.Video videoItem;
    private VideoMoleculeViewHolder viewHolder;

    @NotNull
    private final VolumeContentObserver volumeContentObserver;

    @NotNull
    private final GallerySyncViewModelImpl widgetViewModel;
    public static final int $stable = 8;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AbstractC5434v.a.values().length];
            try {
                iArr[AbstractC5434v.a.ON_RESUME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AbstractC5434v.a.ON_PAUSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AbstractC5434v.a.ON_DESTROY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoGalleryFullViewHolder(@NotNull GalleryFullViewVideoScreenBinding binding, @NotNull ComposerReferences refs, @NotNull VideoMoleculePlayerDelegate playerDelegate, @NotNull VolumeContentObserver volumeContentObserver, @NotNull SoundService soundService, @NotNull GallerySyncViewModelImpl widgetViewModel) {
        super(binding.getRoot());
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(playerDelegate, "playerDelegate");
        Intrinsics.checkNotNullParameter(volumeContentObserver, "volumeContentObserver");
        Intrinsics.checkNotNullParameter(soundService, "soundService");
        Intrinsics.checkNotNullParameter(widgetViewModel, "widgetViewModel");
        this.binding = binding;
        this.refs = refs;
        this.playerDelegate = playerDelegate;
        this.volumeContentObserver = volumeContentObserver;
        this.soundService = soundService;
        this.widgetViewModel = widgetViewModel;
        this.transformation = C7714v.a0(new ImageTransformation.Blur(40, 0, 2, null));
        this.handler = new Handler(Looper.getMainLooper());
        ImageView imageView = new ImageView(binding.getRoot().getContext());
        imageView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.blurView = imageView;
        this.lifecycleObserver = new i(this, 0);
        Drawable drawable = a.getDrawable(binding.getRoot().getContext(), R$drawable.bg_gallery_full_view_video_item_portrait);
        this.portraitBackground = drawable;
        this.soundOffIcon = DelegatesKt.lazyUnsafe(new VideoGalleryFullViewHolder$soundOffIcon$2(this));
        this.soundOnIcon = DelegatesKt.lazyUnsafe(new VideoGalleryFullViewHolder$soundOnIcon$2(this));
        binding.getOzonVideoMoleculeV().getPlayerView().setBackgroundColor(0);
        Object ozonVideoMoleculeV = binding.getOzonVideoMoleculeV();
        Intrinsics.g(ozonVideoMoleculeV, "null cannot be cast to non-null type android.view.View");
        ((View) ozonVideoMoleculeV).setBackground(null);
        binding.getOzonVideoMoleculeV().getPlayerView().addView(this.blurView, 0);
        binding.getRoot().setClipToOutline(true);
        binding.getRoot().setBackground(drawable);
        this.viewHolder = createVideoViewHolder();
        binding.getOzonVideoVolumeIv().setOnClickListener(new DS.a(this, 3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$4(VideoGalleryFullViewHolder videoGalleryFullViewHolder, View view) {
        SoundController soundController = videoGalleryFullViewHolder.soundController;
        if (soundController != null) {
            boolean isMuted = soundController.isMuted();
            SoundController soundController2 = videoGalleryFullViewHolder.soundController;
            if (soundController2 != null) {
                soundController2.setSoundMutedState(!isMuted);
            }
            videoGalleryFullViewHolder.setMute(!isMuted);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final VideoMoleculeViewHolder createVideoViewHolder() {
        VideoMoleculeApi ozonVideoMoleculeV = this.binding.getOzonVideoMoleculeV();
        Intrinsics.g(ozonVideoMoleculeV, "null cannot be cast to non-null type android.view.View");
        ((View) ozonVideoMoleculeV).setTag(R.id.tag_key_widget_name, "pdp.galleryFullView");
        final VideoMoleculeViewHolder videoMoleculeViewHolder = new VideoMoleculeViewHolder(ozonVideoMoleculeV, this.playerDelegate, new VideoMoleculeRefsProvider(this.refs), d.c(this.refs), null, 16, null);
        PlayerListenersContainer.Builder builder = new PlayerListenersContainer.Builder();
        builder.onBuffer(new OnBufferPlayerControllerListener() { // from class: ru.ozon.app.android.pdp.widgets.galleryFullView.presentation.fullView.VideoGalleryFullViewHolder$createVideoViewHolder$lambda$14$$inlined$setPlayerListener$default$1
            @Override // ru.ozon.app.android.video.playerV2.playerController.base.listeners.OnBufferPlayerControllerListener
            public final void onBuffer() {
                VideoGalleryFullViewHolder.this.showProgress(true);
            }
        });
        builder.onReady(new OnReadyPlayerControllerListener() { // from class: ru.ozon.app.android.pdp.widgets.galleryFullView.presentation.fullView.VideoGalleryFullViewHolder$createVideoViewHolder$lambda$14$$inlined$setPlayerListener$default$2
            @Override // ru.ozon.app.android.video.playerV2.playerController.base.listeners.OnReadyPlayerControllerListener
            public final void onReady(PlayerState state) {
                Intrinsics.checkNotNullParameter(state, "state");
                Float volume = VideoMoleculeViewHolder.this.getVolume();
                this.updateVolumeButtonIcon((volume != null ? volume.floatValue() : 0.0f) == 0.0f);
                this.showProgress(false);
                this.isPlayerReady = true;
                this.showVideoMolecule();
            }
        });
        builder.onError(new OnErrorPlayerControllerListener() { // from class: ru.ozon.app.android.pdp.widgets.galleryFullView.presentation.fullView.VideoGalleryFullViewHolder$createVideoViewHolder$lambda$14$$inlined$setPlayerListener$default$3
            @Override // ru.ozon.app.android.video.playerV2.playerController.base.listeners.OnErrorPlayerControllerListener
            public final void onError(String message, Exception exc, Boolean bool) {
                Intrinsics.checkNotNullParameter(message, "message");
                VideoGalleryFullViewHolder.this.showProgress(false);
            }
        });
        builder.onStart(new OnStartPlayerControllerListener() { // from class: ru.ozon.app.android.pdp.widgets.galleryFullView.presentation.fullView.VideoGalleryFullViewHolder$createVideoViewHolder$lambda$14$$inlined$setPlayerListener$default$4
            @Override // ru.ozon.app.android.video.playerV2.playerController.base.listeners.OnStartPlayerControllerListener
            public final void onStart(PlayerState state) {
                Intrinsics.checkNotNullParameter(state, "state");
            }
        });
        builder.onFinish(new OnFinishPlayerControllerListener() { // from class: ru.ozon.app.android.pdp.widgets.galleryFullView.presentation.fullView.VideoGalleryFullViewHolder$createVideoViewHolder$lambda$14$$inlined$setPlayerListener$default$5
            @Override // ru.ozon.app.android.video.playerV2.playerController.base.listeners.OnFinishPlayerControllerListener
            public final void onFinish() {
                VideoGalleryFullViewHolder.this.onFinishVideo();
            }
        });
        builder.onRenderedFirstFrame(new OnRenderedFirstFramePlayerControllerListener() { // from class: ru.ozon.app.android.pdp.widgets.galleryFullView.presentation.fullView.VideoGalleryFullViewHolder$createVideoViewHolder$lambda$14$$inlined$setPlayerListener$default$6
            @Override // ru.ozon.app.android.video.playerV2.playerController.base.listeners.OnRenderedFirstFramePlayerControllerListener
            public final void onRenderedFirstFrame() {
            }
        });
        videoMoleculeViewHolder.setPlayerListener(builder.build());
        videoMoleculeViewHolder.setVisibilityListener(new VideoMoleculeVisibilityDelegateListener() { // from class: ru.ozon.app.android.pdp.widgets.galleryFullView.presentation.fullView.VideoGalleryFullViewHolder$createVideoViewHolder$lambda$14$$inlined$setVisibilityListener$1
            @Override // ru.ozon.app.android.pdpvideomolecule.presentation.visibilitydelegate.VideoMoleculeVisibilityDelegateListener
            public void hide(boolean isForce) {
                if (isForce) {
                    this.onRewindStateChanged(true);
                }
            }

            @Override // ru.ozon.app.android.pdpvideomolecule.presentation.visibilitydelegate.VideoMoleculeVisibilityDelegateListener
            public void hideWithAnimation() {
                VideoGalleryFullViewHolder.this.updateVolumeButtonVisibility(false);
            }

            @Override // ru.ozon.app.android.pdpvideomolecule.presentation.visibilitydelegate.VideoMoleculeVisibilityDelegateListener
            public void show(boolean isForce) {
                if (isForce) {
                    this.onRewindStateChanged(false);
                }
            }

            @Override // ru.ozon.app.android.pdpvideomolecule.presentation.visibilitydelegate.VideoMoleculeVisibilityDelegateListener
            public void showWithAnimation() {
                VideoGalleryFullViewHolder.this.updateVolumeButtonVisibility(true);
            }
        });
        return videoMoleculeViewHolder;
    }

    private final int getOrientation() {
        return this.binding.getRoot().getResources().getConfiguration().orientation;
    }

    private final Drawable getSoundOffIcon() {
        return (Drawable) this.soundOffIcon.getValue();
    }

    private final Drawable getSoundOnIcon() {
        return (Drawable) this.soundOnIcon.getValue();
    }

    private final boolean isPortrait() {
        return getOrientation() == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lifecycleObserver$lambda$2(VideoGalleryFullViewHolder videoGalleryFullViewHolder, J j11, AbstractC5434v.a event) {
        GalleryFullViewVO.GalleryItemVO.Video video;
        String galleryId;
        Intrinsics.checkNotNullParameter(j11, "<unused var>");
        Intrinsics.checkNotNullParameter(event, "event");
        int i11 = WhenMappings.$EnumSwitchMapping$0[event.ordinal()];
        if (i11 == 1) {
            VideoMoleculeViewHolder videoMoleculeViewHolder = videoGalleryFullViewHolder.viewHolder;
            if (videoMoleculeViewHolder != null) {
                videoMoleculeViewHolder.playVideo();
                return;
            }
            return;
        }
        if (i11 == 2) {
            VideoMoleculeViewHolder videoMoleculeViewHolder2 = videoGalleryFullViewHolder.viewHolder;
            if (videoMoleculeViewHolder2 != null) {
                videoMoleculeViewHolder2.pauseVideo();
                return;
            }
            return;
        }
        if (i11 != 3 || (video = videoGalleryFullViewHolder.videoItem) == null || (galleryId = video.getGalleryId()) == null) {
            return;
        }
        GallerySyncViewModelImpl gallerySyncViewModelImpl = videoGalleryFullViewHolder.widgetViewModel;
        int i12 = videoGalleryFullViewHolder.currentPosition;
        VideoMoleculeViewHolder videoMoleculeViewHolder3 = videoGalleryFullViewHolder.viewHolder;
        gallerySyncViewModelImpl.updateCurrentSyncItem(galleryId, new GallerySyncModel(i12, videoMoleculeViewHolder3 != null ? Long.valueOf(videoMoleculeViewHolder3.getCurrentVideoDuration()) : null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onFinishVideo() {
        if (isPortrait()) {
            ViewExtKt.show(this.binding.getOzonVideoVolumeIv());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onRewindStateChanged(boolean isRewinding) {
        ViewExtKt.showOrGone(this.binding.getOzonVideoVolumeIv(), Boolean.valueOf(!isRewinding));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setMute(boolean isMuted) {
        VideoMoleculeViewHolder videoMoleculeViewHolder = this.viewHolder;
        if (videoMoleculeViewHolder != null) {
            videoMoleculeViewHolder.setMute(isMuted);
        }
        updateVolumeButtonIcon(isMuted);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showProgress(boolean show) {
        ContentLoadingProgressBar ozonVideoPb = this.binding.getOzonVideoPb();
        if (show) {
            ozonVideoPb.d();
        } else {
            ozonVideoPb.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showVideoMolecule() {
        ViewExtKt.showOrInvisible(this.binding.getOzonVideoMoleculeV().getPlayerView(), this.isBlurReady && this.isPlayerReady);
    }

    private final void startListeningForVolumeChangeEvents() {
        this.volumeContentObserver.setListener(new VolumeContentObserver.Listener() { // from class: ru.ozon.app.android.pdp.widgets.galleryFullView.presentation.fullView.VideoGalleryFullViewHolder$startListeningForVolumeChangeEvents$1
            @Override // ru.ozon.app.android.gallery.common.VolumeContentObserver.Listener
            public void onVolumeDown(int volume) {
                if (volume == 0) {
                    VideoGalleryFullViewHolder.this.updateVolumeButtonIcon(true);
                }
            }

            @Override // ru.ozon.app.android.gallery.common.VolumeContentObserver.Listener
            public void onVolumeUp(int volume) {
                VideoMoleculeViewHolder videoMoleculeViewHolder;
                Float volume2;
                videoMoleculeViewHolder = VideoGalleryFullViewHolder.this.viewHolder;
                if (((videoMoleculeViewHolder == null || (volume2 = videoMoleculeViewHolder.getVolume()) == null) ? 0.0f : volume2.floatValue()) == 0.0f) {
                    VideoGalleryFullViewHolder.this.setMute(true);
                }
            }
        });
    }

    private final void stopListeningVolumeChangeEvents() {
        this.volumeContentObserver.setListener(null);
    }

    private final void subscribeToSoundController() {
        SoundController soundController = this.soundService.getSoundController(SoundScope.COMMON);
        setMute(soundController.isMuted());
        this.soundDisposable = soundController.getSoundMutedState().subscribeOn(Mc.a.b()).observeOn(C8125a.a()).subscribe(new HX.a(new VideoGalleryFullViewHolder$subscribeToSoundController$1$1(this), 2));
        this.soundController = soundController;
    }

    private final void unsubscribeFromSoundController() {
        InterfaceC8487b interfaceC8487b = this.soundDisposable;
        if (interfaceC8487b != null) {
            interfaceC8487b.dispose();
        }
        this.soundDisposable = null;
        this.soundController = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateVolumeButtonIcon(boolean isMuted) {
        Drawable soundOffIcon = isMuted ? getSoundOffIcon() : getSoundOnIcon();
        ImageView ozonVideoVolumeIv = this.binding.getOzonVideoVolumeIv();
        ozonVideoVolumeIv.setForeground(soundOffIcon);
        ozonVideoVolumeIv.setContentDescription(isMuted ? "ic_m_volume_no_filled" : "ic_m_volume_filled");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean updateVolumeButtonVisibility(boolean isShow) {
        return this.handler.post(new j(isShow, 0, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateVolumeButtonVisibility$lambda$17(VideoGalleryFullViewHolder videoGalleryFullViewHolder, boolean z11) {
        ImageView ozonVideoVolumeIv;
        if (videoGalleryFullViewHolder.isPortrait() && (ozonVideoVolumeIv = videoGalleryFullViewHolder.binding.getOzonVideoVolumeIv()) != null) {
            ViewExtKt.showOrGone(ozonVideoVolumeIv, Boolean.valueOf(z11));
        }
    }

    public final Unit bind(@NotNull GalleryFullViewVO.GalleryItemVO.Video item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.videoItem = item;
        this.currentPosition = getAdapterPosition();
        ImageViewExtKt.load$default(this.blurView, item.getPreviewUrl(), this.transformation, new PikazonLoaderCallback<Drawable>() { // from class: ru.ozon.app.android.pdp.widgets.galleryFullView.presentation.fullView.VideoGalleryFullViewHolder$bind$1$1
            @Override // ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback
            public void onLoadFailed(Exception e11) {
                VideoGalleryFullViewHolder.this.isBlurReady = true;
                VideoGalleryFullViewHolder.this.showVideoMolecule();
            }

            @Override // ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback
            public void onLoadSuccessful(Drawable resource) {
                VideoGalleryFullViewHolder.this.isBlurReady = true;
                VideoGalleryFullViewHolder.this.showVideoMolecule();
            }
        }, null, null, false, null, 120, null);
        showProgress(true);
        if (this.viewHolder == null) {
            this.viewHolder = createVideoViewHolder();
        }
        VideoMoleculeViewHolder videoMoleculeViewHolder = this.viewHolder;
        if (videoMoleculeViewHolder != null) {
            VideoMolecule video = item.getVideo();
            PlayerStateKt.updateIsPlaying(video, false);
            PlayerStateKt.updateShouldRepeat(video, true);
            VideoMoleculeViewHolder.bind$default(videoMoleculeViewHolder, video, true, false, 4, null);
            videoMoleculeViewHolder.showContent(false);
        }
        return TokenizedAnalyticsExtKt.processViewEvents(this.refs.getTokenizedAnalytics(), item.getEvent());
    }

    @Override // jk0.j
    public void onAttach() {
        super.onAttach();
        getLifecycle().a(this.lifecycleObserver);
        VideoMoleculeViewHolder videoMoleculeViewHolder = this.viewHolder;
        if (videoMoleculeViewHolder != null) {
            videoMoleculeViewHolder.setOnFullScreenChangeListener(new VideoGalleryFullViewHolder$onAttach$1(this));
        }
        VideoMoleculeViewHolder videoMoleculeViewHolder2 = this.viewHolder;
        if (videoMoleculeViewHolder2 != null) {
            videoMoleculeViewHolder2.playVideo();
        }
        startListeningForVolumeChangeEvents();
        subscribeToSoundController();
    }

    @Override // jk0.j
    public void onDetach() {
        super.onDetach();
        getLifecycle().e(this.lifecycleObserver);
        VideoMoleculeViewHolder videoMoleculeViewHolder = this.viewHolder;
        if (videoMoleculeViewHolder != null) {
            videoMoleculeViewHolder.pauseVideo();
        }
        VideoMoleculeViewHolder videoMoleculeViewHolder2 = this.viewHolder;
        if (videoMoleculeViewHolder2 != null) {
            videoMoleculeViewHolder2.removeFullScreenListener();
        }
        stopListeningVolumeChangeEvents();
        unsubscribeFromSoundController();
    }

    @Override // jk0.j
    public void onRecycle() {
        super.onRecycle();
        if (this.binding.getRoot().getResources().getConfiguration().orientation == 2) {
            this.binding.getOzonVideoMoleculeV().setCurrentOrientation(1);
        }
        this.handler.removeCallbacksAndMessages(null);
        VideoMoleculeViewHolder videoMoleculeViewHolder = this.viewHolder;
        if (videoMoleculeViewHolder != null) {
            videoMoleculeViewHolder.clearPlayerListener();
        }
        VideoMoleculeViewHolder videoMoleculeViewHolder2 = this.viewHolder;
        if (videoMoleculeViewHolder2 != null) {
            videoMoleculeViewHolder2.clearVisibilityListener();
        }
        VideoMoleculeViewHolder videoMoleculeViewHolder3 = this.viewHolder;
        if (videoMoleculeViewHolder3 != null) {
            VideoMoleculeViewHolder.onRemove$default(videoMoleculeViewHolder3, false, 1, null);
        }
        this.viewHolder = null;
    }

    @Override // jk0.j, lk0.b
    public void onViewInVisibleBounds() {
        super.onViewInVisibleBounds();
        VideoMoleculeViewHolder videoMoleculeViewHolder = this.viewHolder;
        if (videoMoleculeViewHolder != null) {
            videoMoleculeViewHolder.playVideo();
        }
    }

    @Override // jk0.j, lk0.b
    public void onViewOutOfVisibleBounds() {
        super.onViewOutOfVisibleBounds();
        VideoMoleculeViewHolder videoMoleculeViewHolder = this.viewHolder;
        if (videoMoleculeViewHolder != null) {
            videoMoleculeViewHolder.pauseVideo();
        }
    }
}
