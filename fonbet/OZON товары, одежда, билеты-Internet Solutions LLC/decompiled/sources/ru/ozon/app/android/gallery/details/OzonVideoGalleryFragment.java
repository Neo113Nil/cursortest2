package ru.ozon.app.android.gallery.details;

import Hs.e;
import Pc.a;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.r;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import gi.C6739a;
import gi.C6740b;
import hi.InterfaceC6958a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import mc.C8125a;
import nc.InterfaceC8487b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.gallery.GalleryActivity;
import ru.ozon.app.android.gallery.GalleryCloseListener;
import ru.ozon.app.android.gallery.ItemVO;
import ru.ozon.app.android.gallery.R$drawable;
import ru.ozon.app.android.gallery.VideoPlayerListener;
import ru.ozon.app.android.gallery.common.VolumeContentObserver;
import ru.ozon.app.android.gallery.details.OzonVideoGalleryFragment;
import ru.ozon.app.android.gallery.details.OzonVideoGalleryFragmentComponent;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.pdpvideomolecule.data.PlayerStateKt;
import ru.ozon.app.android.pdpvideomolecule.data.VideoMolecule;
import ru.ozon.app.android.pdpvideomolecule.presentation.view.VideoMoleculeApi;
import ru.ozon.app.android.pdpvideomolecule.presentation.viewholder.FullScreenModel;
import ru.ozon.app.android.pdpvideomolecule.presentation.viewholder.VideoMoleculeViewHolder;
import ru.ozon.app.android.pdpvideomolecule.presentation.viewholder.player.VideoMoleculePlayerDelegate;
import ru.ozon.app.android.pdpvideomolecule.presentation.viewholder.player.VideoMoleculePlayerDelegateProvider;
import ru.ozon.app.android.pdpvideomolecule.presentation.visibilitydelegate.VideoMoleculeVisibilityDelegateListener;
import ru.ozon.app.android.video.VideoPosition;
import ru.ozon.app.android.video.di.VideoComponentApi;
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

@Metadata(d1 = {"\u0000Ö\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\u0018\u0000 \u0085\u00012\u00020\u00012\u00020\u0002:\u0002\u0085\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\f\u0010\rJ+\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00122\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0018\u0010\u0004J\u000f\u0010\u0019\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0019\u0010\u0004J\u000f\u0010\u001a\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001a\u0010\u0004J\u000f\u0010\u001b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001b\u0010\u0004J\u000f\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001f\u0010\u0004J\u0013\u0010!\u001a\u00020 *\u00020 H\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0007H\u0002¢\u0006\u0004\b#\u0010\u0004J\u000f\u0010$\u001a\u00020\u0007H\u0002¢\u0006\u0004\b$\u0010\u0004J\u0017\u0010'\u001a\u00020\u00072\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020\u00072\u0006\u0010)\u001a\u00020%H\u0002¢\u0006\u0004\b*\u0010(J\u0017\u0010+\u001a\u00020\u00072\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b+\u0010(J\u0017\u0010-\u001a\u00020%2\u0006\u0010,\u001a\u00020%H\u0002¢\u0006\u0004\b-\u0010.J\u0017\u00100\u001a\u00020\u00072\u0006\u0010/\u001a\u00020%H\u0002¢\u0006\u0004\b0\u0010(J\u0017\u00103\u001a\u00020\u00072\u0006\u00102\u001a\u000201H\u0002¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\u0007H\u0002¢\u0006\u0004\b5\u0010\u0004J\u000f\u00106\u001a\u00020\u0007H\u0002¢\u0006\u0004\b6\u0010\u0004J\u000f\u00107\u001a\u00020\u0007H\u0002¢\u0006\u0004\b7\u0010\u0004J\u000f\u00108\u001a\u00020\u0007H\u0002¢\u0006\u0004\b8\u0010\u0004R(\u0010;\u001a\b\u0012\u0004\u0012\u00020:098\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\"\u0010B\u001a\u00020A8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\"\u0010I\u001a\u00020H8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\"\u0010P\u001a\u00020O8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\u0018\u0010V\u001a\u0004\u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010WR\u0018\u0010Y\u001a\u0004\u0018\u00010X8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010ZR\u0018\u0010[\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010\\R\u0018\u0010^\u001a\u0004\u0018\u00010]8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010_R\u0018\u0010a\u001a\u0004\u0018\u00010`8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010bR\u0016\u0010d\u001a\u00020c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010eR\u0018\u0010f\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010gR\u0016\u0010i\u001a\u00020h8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bi\u0010jR\u0016\u0010k\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010lR\u0016\u0010n\u001a\u00020m8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bn\u0010oR\u0018\u0010q\u001a\u0004\u0018\u00010p8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bq\u0010rR\u0018\u0010t\u001a\u0004\u0018\u00010s8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bt\u0010uR\u0014\u0010w\u001a\u00020v8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bw\u0010xR\u0018\u0010z\u001a\u0004\u0018\u00010y8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bz\u0010{R\u0014\u0010\u007f\u001a\u00020|8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b}\u0010~R\u0017\u0010\u0080\u0001\u001a\u00020%8BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001R\u0017\u0010\u0084\u0001\u001a\u00020y8BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001¨\u0006\u0086\u0001"}, d2 = {"Lru/ozon/app/android/gallery/details/OzonVideoGalleryFragment;", "Landroidx/fragment/app/m;", "Lru/ozon/app/android/gallery/GalleryCloseListener;", "<init>", "()V", "Landroid/content/Context;", "context", "", "onAttach", "(Landroid/content/Context;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onResume", "onPause", "onDestroyView", "onClose", "Lru/ozon/app/android/pdpvideomolecule/presentation/viewholder/VideoMoleculeViewHolder;", "requireViewHolder", "()Lru/ozon/app/android/pdpvideomolecule/presentation/viewholder/VideoMoleculeViewHolder;", "getArgumentsData", "Lru/ozon/app/android/video/VideoPosition;", "setVideoPosition", "(Lru/ozon/app/android/video/VideoPosition;)Lru/ozon/app/android/video/VideoPosition;", "setupUi", "onFinishVideo", "", "isMuted", "setMute", "(Z)V", "show", "showProgress", "updateVolumeButtonIcon", "isShow", "updateVolumeButtonVisibility", "(Z)Z", "isRewinding", "onRewindStateChanged", "Lru/ozon/app/android/pdpvideomolecule/presentation/viewholder/FullScreenModel;", "fullScreenModel", "adjustUiForOrientation", "(Lru/ozon/app/android/pdpvideomolecule/presentation/viewholder/FullScreenModel;)V", "startListeningForVolumeChangeEvents", "stopListeningVolumeChangeEvents", "subscribeToSoundController", "unsubscribeFromSoundController", "LPc/a;", "Lru/ozon/app/android/gallery/details/OzonVideoGalleryViewModel;", "viewModelProvider", "LPc/a;", "getViewModelProvider", "()LPc/a;", "setViewModelProvider", "(LPc/a;)V", "Lru/ozon/app/android/pdpvideomolecule/presentation/viewholder/player/VideoMoleculePlayerDelegateProvider;", "playerDelegateProvider", "Lru/ozon/app/android/pdpvideomolecule/presentation/viewholder/player/VideoMoleculePlayerDelegateProvider;", "getPlayerDelegateProvider", "()Lru/ozon/app/android/pdpvideomolecule/presentation/viewholder/player/VideoMoleculePlayerDelegateProvider;", "setPlayerDelegateProvider", "(Lru/ozon/app/android/pdpvideomolecule/presentation/viewholder/player/VideoMoleculePlayerDelegateProvider;)V", "Lru/ozon/app/android/gallery/common/VolumeContentObserver;", "volumeContentObserver", "Lru/ozon/app/android/gallery/common/VolumeContentObserver;", "getVolumeContentObserver", "()Lru/ozon/app/android/gallery/common/VolumeContentObserver;", "setVolumeContentObserver", "(Lru/ozon/app/android/gallery/common/VolumeContentObserver;)V", "Lru/ozon/app/android/video/player/soundservice/SoundService;", "soundService", "Lru/ozon/app/android/video/player/soundservice/SoundService;", "getSoundService", "()Lru/ozon/app/android/video/player/soundservice/SoundService;", "setSoundService", "(Lru/ozon/app/android/video/player/soundservice/SoundService;)V", "viewModel", "Lru/ozon/app/android/gallery/details/OzonVideoGalleryViewModel;", "Lru/ozon/app/android/pdpvideomolecule/data/VideoMolecule;", "videoMolecule", "Lru/ozon/app/android/pdpvideomolecule/data/VideoMolecule;", "viewHolder", "Lru/ozon/app/android/pdpvideomolecule/presentation/viewholder/VideoMoleculeViewHolder;", "Lru/ozon/app/android/gallery/ItemVO$OzonVideo;", "videoItem", "Lru/ozon/app/android/gallery/ItemVO$OzonVideo;", "", "widgetName", "Ljava/lang/String;", "", "videoPosition", "J", "videoRequestPosition", "Lru/ozon/app/android/video/VideoPosition;", "Lru/ozon/app/android/pdpvideomolecule/presentation/viewholder/player/VideoMoleculePlayerDelegate;", "playerDelegate", "Lru/ozon/app/android/pdpvideomolecule/presentation/viewholder/player/VideoMoleculePlayerDelegate;", "isForcedFullScreen", "Z", "Lru/ozon/app/android/gallery/VideoPlayerListener;", "videoPlayerListener", "Lru/ozon/app/android/gallery/VideoPlayerListener;", "Lru/ozon/app/android/video/player/soundservice/SoundController;", "soundController", "Lru/ozon/app/android/video/player/soundservice/SoundController;", "Lnc/b;", "soundDisposable", "Lnc/b;", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "Lru/ozon/app/android/gallery/details/OzonVideoGalleryFragmentBinding;", "_binding", "Lru/ozon/app/android/gallery/details/OzonVideoGalleryFragmentBinding;", "", "getOrientation", "()I", "orientation", "isPortrait", "()Z", "getBinding", "()Lru/ozon/app/android/gallery/details/OzonVideoGalleryFragmentBinding;", "binding", "Companion", "gallery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class OzonVideoGalleryFragment extends ComponentCallbacksC5392m implements GalleryCloseListener {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private OzonVideoGalleryFragmentBinding _binding;

    @NotNull
    private final Handler handler = new Handler(Looper.getMainLooper());
    private boolean isForcedFullScreen;
    private VideoMoleculePlayerDelegate playerDelegate;
    public VideoMoleculePlayerDelegateProvider playerDelegateProvider;
    private SoundController soundController;
    private InterfaceC8487b soundDisposable;
    public SoundService soundService;
    private ItemVO.OzonVideo videoItem;
    private VideoMolecule videoMolecule;
    private VideoPlayerListener videoPlayerListener;
    private long videoPosition;
    private VideoPosition videoRequestPosition;
    private VideoMoleculeViewHolder viewHolder;
    private OzonVideoGalleryViewModel viewModel;
    public a<OzonVideoGalleryViewModel> viewModelProvider;
    public VolumeContentObserver volumeContentObserver;
    private String widgetName;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u00052\b\u0010\r\u001a\u0004\u0018\u00010\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/gallery/details/OzonVideoGalleryFragment$Companion;", "", "<init>", "()V", "VIDEO", "", "WIDGET_NAME", "VIDEO_POSITION", "newInstance", "Lru/ozon/app/android/gallery/details/OzonVideoGalleryFragment;", "galleryItem", "Lru/ozon/app/android/gallery/ItemVO$OzonVideo;", "widgetName", "videoPosition", "Lru/ozon/app/android/video/VideoPosition;", "gallery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final OzonVideoGalleryFragment newInstance(@NotNull ItemVO.OzonVideo galleryItem, String widgetName, VideoPosition videoPosition) {
            Intrinsics.checkNotNullParameter(galleryItem, "galleryItem");
            OzonVideoGalleryFragment ozonVideoGalleryFragment = new OzonVideoGalleryFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("ozonVideo", galleryItem);
            bundle.putString("WIDGET_NAME", widgetName);
            if (videoPosition != null) {
                bundle.putParcelable("VIDEO_POSITION_KEY", videoPosition);
            }
            ozonVideoGalleryFragment.setArguments(bundle);
            return ozonVideoGalleryFragment;
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void adjustUiForOrientation(FullScreenModel fullScreenModel) {
        OzonVideoGalleryFragmentBinding binding = getBinding();
        VideoPlayerListener videoPlayerListener = this.videoPlayerListener;
        if (videoPlayerListener == null) {
            Intrinsics.n("videoPlayerListener");
            throw null;
        }
        videoPlayerListener.onFullScreenChange(fullScreenModel);
        Object ozonVideoMoleculeV = binding.getOzonVideoMoleculeV();
        Intrinsics.g(ozonVideoMoleculeV, "null cannot be cast to non-null type android.view.View");
        View view = (View) ozonVideoMoleculeV;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.bottomMargin = !fullScreenModel.getIsFullScreen() ? OzonVideoGalleryFragmentKt.VIDEO_MOLECULE_MARGIN_BOTTOM_PORTRAIT : 0;
        view.setLayoutParams(marginLayoutParams);
        ViewExtKt.showOrGone(binding.getOzonVideoVolumeIv(), Boolean.valueOf(!fullScreenModel.getIsFullScreen()));
        boolean z11 = fullScreenModel.getScreenOrientation() == 0;
        if (fullScreenModel.getIsFullScreen() && z11) {
            Object ozonVideoMoleculeV2 = binding.getOzonVideoMoleculeV();
            Intrinsics.g(ozonVideoMoleculeV2, "null cannot be cast to non-null type android.view.View");
            ((View) ozonVideoMoleculeV2).setBackground(null);
        } else if (!fullScreenModel.getIsFullScreen() || z11) {
            Object ozonVideoMoleculeV3 = binding.getOzonVideoMoleculeV();
            Intrinsics.g(ozonVideoMoleculeV3, "null cannot be cast to non-null type android.view.View");
            ((View) ozonVideoMoleculeV3).setBackgroundResource(R$drawable.shape_video_molecule_background);
        } else {
            Object ozonVideoMoleculeV4 = binding.getOzonVideoMoleculeV();
            Intrinsics.g(ozonVideoMoleculeV4, "null cannot be cast to non-null type android.view.View");
            ((View) ozonVideoMoleculeV4).setBackgroundResource(R$drawable.shape_video_molecule_background);
        }
    }

    private final void getArgumentsData() {
        ItemVO.OzonVideo ozonVideo;
        Parcelable parcelable;
        Object parcelable2;
        Parcelable parcelable3;
        Object parcelable4;
        ItemVO.OzonVideo ozonVideo2;
        Object parcelable5;
        Object parcelable6;
        Bundle arguments = getArguments();
        VideoPosition videoPosition = null;
        this.widgetName = arguments != null ? arguments.getString("WIDGET_NAME") : null;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 33) {
            Bundle arguments2 = getArguments();
            if (arguments2 != null) {
                parcelable6 = arguments2.getParcelable("ozonVideo", ItemVO.OzonVideo.class);
                ozonVideo2 = (ItemVO.OzonVideo) parcelable6;
            } else {
                ozonVideo2 = null;
            }
            this.videoItem = ozonVideo2;
            Bundle arguments3 = getArguments();
            if (arguments3 != null) {
                parcelable5 = arguments3.getParcelable("VIDEO_POSITION_KEY", VideoPosition.class);
                VideoPosition videoPosition2 = (VideoPosition) parcelable5;
                if (videoPosition2 != null) {
                    videoPosition = setVideoPosition(videoPosition2);
                }
            }
            this.videoRequestPosition = videoPosition;
            return;
        }
        Bundle arguments4 = getArguments();
        if (arguments4 != null) {
            if (i11 >= 33) {
                parcelable4 = arguments4.getParcelable("ozonVideo", ItemVO.OzonVideo.class);
                parcelable3 = (Parcelable) parcelable4;
            } else {
                parcelable3 = arguments4.getParcelable("ozonVideo");
            }
            ozonVideo = (ItemVO.OzonVideo) parcelable3;
        } else {
            ozonVideo = null;
        }
        this.videoItem = ozonVideo;
        Bundle arguments5 = getArguments();
        if (arguments5 != null) {
            if (i11 >= 33) {
                parcelable2 = arguments5.getParcelable("VIDEO_POSITION_KEY", VideoPosition.class);
                parcelable = (Parcelable) parcelable2;
            } else {
                parcelable = arguments5.getParcelable("VIDEO_POSITION_KEY");
            }
            VideoPosition videoPosition3 = (VideoPosition) parcelable;
            if (videoPosition3 != null) {
                videoPosition = setVideoPosition(videoPosition3);
            }
        }
        this.videoRequestPosition = videoPosition;
    }

    private final OzonVideoGalleryFragmentBinding getBinding() {
        OzonVideoGalleryFragmentBinding ozonVideoGalleryFragmentBinding = this._binding;
        Intrinsics.f(ozonVideoGalleryFragmentBinding);
        return ozonVideoGalleryFragmentBinding;
    }

    private final int getOrientation() {
        return getResources().getConfiguration().orientation;
    }

    private final boolean isPortrait() {
        return getOrientation() == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onFinishVideo() {
        if (isPortrait()) {
            ViewExtKt.show(getBinding().getOzonVideoVolumeIv());
        }
        OzonVideoGalleryViewModel ozonVideoGalleryViewModel = this.viewModel;
        if (ozonVideoGalleryViewModel != null) {
            ItemVO.OzonVideo ozonVideo = this.videoItem;
            ozonVideoGalleryViewModel.processFinishVideoEvent(ozonVideo != null ? ozonVideo.getGalleryTokenizedVideoEvents() : null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onRewindStateChanged(boolean isRewinding) {
        VideoPlayerListener videoPlayerListener = this.videoPlayerListener;
        if (videoPlayerListener == null) {
            Intrinsics.n("videoPlayerListener");
            throw null;
        }
        videoPlayerListener.onVideoRewindStateChanged(isRewinding);
        ViewExtKt.showOrGone(getBinding().getOzonVideoVolumeIv(), Boolean.valueOf(!isRewinding));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final VideoMoleculeViewHolder requireViewHolder() {
        VideoMoleculeViewHolder videoMoleculeViewHolder = this.viewHolder;
        if (videoMoleculeViewHolder != null) {
            return videoMoleculeViewHolder;
        }
        throw new IllegalArgumentException("viewHolder must not be null");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setMute(boolean isMuted) {
        requireViewHolder().setMute(isMuted);
        updateVolumeButtonIcon(isMuted);
    }

    private final VideoPosition setVideoPosition(VideoPosition videoPosition) {
        String link = videoPosition.getLink();
        ItemVO.OzonVideo ozonVideo = this.videoItem;
        if (Intrinsics.d(link, ozonVideo != null ? ozonVideo.getVideoUrl() : null)) {
            this.videoPosition = videoPosition.getVideoPosition();
        }
        return videoPosition;
    }

    private final void setupUi() {
        OzonVideoGalleryFragmentBinding binding = getBinding();
        Object ozonVideoMoleculeV = binding.getOzonVideoMoleculeV();
        Intrinsics.g(ozonVideoMoleculeV, "null cannot be cast to non-null type android.view.View");
        ((View) ozonVideoMoleculeV).setClipToOutline(true);
        this.playerDelegate = getPlayerDelegateProvider().get();
        binding.getOzonVideoMoleculeV().getPlayerView().setTag(R.id.tag_key_widget_name, this.widgetName);
        VideoMoleculeApi ozonVideoMoleculeV2 = binding.getOzonVideoMoleculeV();
        VideoMoleculePlayerDelegate videoMoleculePlayerDelegate = this.playerDelegate;
        if (videoMoleculePlayerDelegate == null) {
            Intrinsics.n("playerDelegate");
            throw null;
        }
        final VideoMoleculeViewHolder videoMoleculeViewHolder = new VideoMoleculeViewHolder(ozonVideoMoleculeV2, videoMoleculePlayerDelegate, new VideoMoleculeRefsProvider(this), getViewLifecycleOwner().getLifecycle(), null, 16, null);
        if (this.isForcedFullScreen) {
            videoMoleculeViewHolder.switchFullScreenButton(true);
            this.isForcedFullScreen = false;
        }
        videoMoleculeViewHolder.setOnFullScreenChangeListener(new OzonVideoGalleryFragment$setupUi$1$1$1(this));
        PlayerListenersContainer.Builder builder = new PlayerListenersContainer.Builder();
        builder.onBuffer(new OnBufferPlayerControllerListener() { // from class: ru.ozon.app.android.gallery.details.OzonVideoGalleryFragment$setupUi$lambda$16$lambda$13$$inlined$setPlayerListener$default$1
            @Override // ru.ozon.app.android.video.playerV2.playerController.base.listeners.OnBufferPlayerControllerListener
            public final void onBuffer() {
                OzonVideoGalleryFragment.this.showProgress(true);
            }
        });
        builder.onReady(new OnReadyPlayerControllerListener() { // from class: ru.ozon.app.android.gallery.details.OzonVideoGalleryFragment$setupUi$lambda$16$lambda$13$$inlined$setPlayerListener$default$2
            @Override // ru.ozon.app.android.video.playerV2.playerController.base.listeners.OnReadyPlayerControllerListener
            public final void onReady(PlayerState state) {
                Intrinsics.checkNotNullParameter(state, "state");
                Float volume = VideoMoleculeViewHolder.this.getVolume();
                this.updateVolumeButtonIcon((volume != null ? volume.floatValue() : 0.0f) == 0.0f);
                this.showProgress(false);
            }
        });
        builder.onError(new OnErrorPlayerControllerListener() { // from class: ru.ozon.app.android.gallery.details.OzonVideoGalleryFragment$setupUi$lambda$16$lambda$13$$inlined$setPlayerListener$default$3
            @Override // ru.ozon.app.android.video.playerV2.playerController.base.listeners.OnErrorPlayerControllerListener
            public final void onError(String message, Exception exc, Boolean bool) {
                Intrinsics.checkNotNullParameter(message, "message");
                OzonVideoGalleryFragment.this.showProgress(false);
            }
        });
        builder.onStart(new OnStartPlayerControllerListener() { // from class: ru.ozon.app.android.gallery.details.OzonVideoGalleryFragment$setupUi$lambda$16$lambda$13$$inlined$setPlayerListener$default$4
            @Override // ru.ozon.app.android.video.playerV2.playerController.base.listeners.OnStartPlayerControllerListener
            public final void onStart(PlayerState state) {
                OzonVideoGalleryViewModel ozonVideoGalleryViewModel;
                ItemVO.OzonVideo ozonVideo;
                Intrinsics.checkNotNullParameter(state, "state");
                ozonVideoGalleryViewModel = OzonVideoGalleryFragment.this.viewModel;
                if (ozonVideoGalleryViewModel != null) {
                    ozonVideo = OzonVideoGalleryFragment.this.videoItem;
                    ozonVideoGalleryViewModel.processStartVideoEvent(ozonVideo != null ? ozonVideo.getGalleryTokenizedVideoEvents() : null);
                }
            }
        });
        builder.onFinish(new OnFinishPlayerControllerListener() { // from class: ru.ozon.app.android.gallery.details.OzonVideoGalleryFragment$setupUi$lambda$16$lambda$13$$inlined$setPlayerListener$default$5
            @Override // ru.ozon.app.android.video.playerV2.playerController.base.listeners.OnFinishPlayerControllerListener
            public final void onFinish() {
                OzonVideoGalleryFragment.this.onFinishVideo();
            }
        });
        builder.onRenderedFirstFrame(new OnRenderedFirstFramePlayerControllerListener() { // from class: ru.ozon.app.android.gallery.details.OzonVideoGalleryFragment$setupUi$lambda$16$lambda$13$$inlined$setPlayerListener$default$6
            @Override // ru.ozon.app.android.video.playerV2.playerController.base.listeners.OnRenderedFirstFramePlayerControllerListener
            public final void onRenderedFirstFrame() {
            }
        });
        videoMoleculeViewHolder.setPlayerListener(builder.build());
        videoMoleculeViewHolder.setVisibilityListener(new VideoMoleculeVisibilityDelegateListener() { // from class: ru.ozon.app.android.gallery.details.OzonVideoGalleryFragment$setupUi$lambda$16$lambda$13$$inlined$setVisibilityListener$1
            @Override // ru.ozon.app.android.pdpvideomolecule.presentation.visibilitydelegate.VideoMoleculeVisibilityDelegateListener
            public void hide(boolean isForce) {
                if (isForce) {
                    this.onRewindStateChanged(true);
                }
            }

            @Override // ru.ozon.app.android.pdpvideomolecule.presentation.visibilitydelegate.VideoMoleculeVisibilityDelegateListener
            public void hideWithAnimation() {
                OzonVideoGalleryFragment.this.updateVolumeButtonVisibility(false);
            }

            @Override // ru.ozon.app.android.pdpvideomolecule.presentation.visibilitydelegate.VideoMoleculeVisibilityDelegateListener
            public void show(boolean isForce) {
                if (isForce) {
                    this.onRewindStateChanged(false);
                }
            }

            @Override // ru.ozon.app.android.pdpvideomolecule.presentation.visibilitydelegate.VideoMoleculeVisibilityDelegateListener
            public void showWithAnimation() {
                OzonVideoGalleryFragment.this.updateVolumeButtonVisibility(true);
            }
        });
        this.viewHolder = videoMoleculeViewHolder;
        binding.getOzonVideoVolumeIv().setOnClickListener(new Ck.a(this, 8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupUi$lambda$16$lambda$15(OzonVideoGalleryFragment ozonVideoGalleryFragment, View view) {
        SoundController soundController = ozonVideoGalleryFragment.soundController;
        if (soundController != null) {
            boolean isMuted = soundController.isMuted();
            SoundController soundController2 = ozonVideoGalleryFragment.soundController;
            if (soundController2 != null) {
                soundController2.setSoundMutedState(!isMuted);
            }
            ozonVideoGalleryFragment.setMute(!isMuted);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showProgress(boolean show) {
        ContentLoadingProgressBar ozonVideoPb = getBinding().getOzonVideoPb();
        if (show) {
            ozonVideoPb.d();
        } else {
            ozonVideoPb.c();
        }
    }

    private final void startListeningForVolumeChangeEvents() {
        getVolumeContentObserver().setListener(new VolumeContentObserver.Listener() { // from class: ru.ozon.app.android.gallery.details.OzonVideoGalleryFragment$startListeningForVolumeChangeEvents$1
            @Override // ru.ozon.app.android.gallery.common.VolumeContentObserver.Listener
            public void onVolumeDown(int volume) {
                if (volume == 0) {
                    OzonVideoGalleryFragment.this.updateVolumeButtonIcon(true);
                }
            }

            @Override // ru.ozon.app.android.gallery.common.VolumeContentObserver.Listener
            public void onVolumeUp(int volume) {
                VideoMoleculeViewHolder requireViewHolder;
                requireViewHolder = OzonVideoGalleryFragment.this.requireViewHolder();
                Float volume2 = requireViewHolder.getVolume();
                if ((volume2 != null ? volume2.floatValue() : 0.0f) == 0.0f) {
                    OzonVideoGalleryFragment.this.setMute(true);
                }
            }
        });
    }

    private final void stopListeningVolumeChangeEvents() {
        getVolumeContentObserver().setListener(null);
    }

    private final void subscribeToSoundController() {
        SoundController soundController = getSoundService().getSoundController(SoundScope.COMMON);
        setMute(soundController.isMuted());
        this.soundDisposable = soundController.getSoundMutedState().subscribeOn(Mc.a.b()).observeOn(C8125a.a()).subscribe(new e(new OzonVideoGalleryFragment$subscribeToSoundController$1$1(this), 5));
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
        int i11 = isMuted ? ru.ozon.uni.core.R$drawable.ic_l_volume_no_filled : ru.ozon.uni.core.R$drawable.ic_l_volume_filled;
        ImageView ozonVideoVolumeIv = getBinding().getOzonVideoVolumeIv();
        ozonVideoVolumeIv.setImageResource(i11);
        ozonVideoVolumeIv.setContentDescription(ozonVideoVolumeIv.getResources().getResourceEntryName(i11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean updateVolumeButtonVisibility(final boolean isShow) {
        return this.handler.post(new Runnable() { // from class: ey.b
            @Override // java.lang.Runnable
            public final void run() {
                OzonVideoGalleryFragment.updateVolumeButtonVisibility$lambda$19(OzonVideoGalleryFragment.this, isShow);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateVolumeButtonVisibility$lambda$19(OzonVideoGalleryFragment ozonVideoGalleryFragment, boolean z11) {
        if (ozonVideoGalleryFragment.isPortrait()) {
            ViewExtKt.showOrGone(ozonVideoGalleryFragment.getBinding().getOzonVideoVolumeIv(), Boolean.valueOf(z11));
        }
    }

    @NotNull
    public final VideoMoleculePlayerDelegateProvider getPlayerDelegateProvider() {
        VideoMoleculePlayerDelegateProvider videoMoleculePlayerDelegateProvider = this.playerDelegateProvider;
        if (videoMoleculePlayerDelegateProvider != null) {
            return videoMoleculePlayerDelegateProvider;
        }
        Intrinsics.n("playerDelegateProvider");
        throw null;
    }

    @NotNull
    public final SoundService getSoundService() {
        SoundService soundService = this.soundService;
        if (soundService != null) {
            return soundService;
        }
        Intrinsics.n("soundService");
        throw null;
    }

    @NotNull
    public final a<OzonVideoGalleryViewModel> getViewModelProvider() {
        a<OzonVideoGalleryViewModel> aVar = this.viewModelProvider;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.n("viewModelProvider");
        throw null;
    }

    @NotNull
    public final VolumeContentObserver getVolumeContentObserver() {
        VolumeContentObserver volumeContentObserver = this.volumeContentObserver;
        if (volumeContentObserver != null) {
            return volumeContentObserver;
        }
        Intrinsics.n("volumeContentObserver");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        OzonVideoGalleryFragmentComponent.Factory factory = DaggerOzonVideoGalleryFragmentComponent.factory();
        C6740b dependencyStorage = C6739a.b(this, ContextComponentDependencies.class).getDependencyStorage();
        if (ContextComponentDependencies.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component ContextComponentDependencies is not DiComponent");
        }
        ContextComponentDependencies contextComponentDependencies = (ContextComponentDependencies) dependencyStorage.b(ContextComponentDependencies.class);
        C6740b dependencyStorage2 = C6739a.b(this, VideoComponentApi.class).getDependencyStorage();
        if (VideoComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component VideoComponentApi is not DiComponent");
        }
        VideoComponentApi videoComponentApi = (VideoComponentApi) dependencyStorage2.b(VideoComponentApi.class);
        C6740b dependencyStorage3 = C6739a.b(this, NetworkComponentApi.class).getDependencyStorage();
        if (NetworkComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NetworkComponentApi is not DiComponent");
        }
        factory.create(contextComponentDependencies, videoComponentApi, (NetworkComponentApi) dependencyStorage3.b(NetworkComponentApi.class)).inject(this);
        super.onAttach(context);
        this.videoPlayerListener = (VideoPlayerListener) context;
    }

    @Override // ru.ozon.app.android.gallery.GalleryCloseListener
    public void onClose() {
        r activity;
        VideoPosition videoPosition = this.videoRequestPosition;
        if (videoPosition != null) {
            String link = videoPosition.getLink();
            ItemVO.OzonVideo ozonVideo = this.videoItem;
            if (!Intrinsics.d(link, ozonVideo != null ? ozonVideo.getVideoUrl() : null) || (activity = getActivity()) == null) {
                return;
            }
            Intent intent = new Intent();
            String link2 = videoPosition.getLink();
            VideoMoleculePlayerDelegate videoMoleculePlayerDelegate = this.playerDelegate;
            if (videoMoleculePlayerDelegate == null) {
                Intrinsics.n("playerDelegate");
                throw null;
            }
            intent.putExtra("VIDEO_POSITION_KEY", new VideoPosition(link2, videoMoleculePlayerDelegate.getPlayerPosition()));
            Unit unit = Unit.f71690a;
            activity.setResult(-1, intent);
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.viewModel = (OzonVideoGalleryViewModel) new z0(this, new z0.c() { // from class: ru.ozon.app.android.gallery.details.OzonVideoGalleryFragment$onCreate$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                OzonVideoGalleryViewModel ozonVideoGalleryViewModel = OzonVideoGalleryFragment.this.getViewModelProvider().get();
                Intrinsics.g(ozonVideoGalleryViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return ozonVideoGalleryViewModel;
            }
        }).a(OzonVideoGalleryViewModel.class);
        getArgumentsData();
        ItemVO.OzonVideo ozonVideo = this.videoItem;
        this.videoMolecule = ozonVideo != null ? OzonVideoGalleryFragmentKt.toMolecule(ozonVideo) : null;
        ItemVO.OzonVideo ozonVideo2 = this.videoItem;
        this.isForcedFullScreen = ozonVideo2 != null ? ozonVideo2.getFullScreen() : false;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this._binding = OzonVideoGalleryFragmentBinding.INSTANCE.inflate(inflater, container, false);
        return getBinding().getRoot();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onDestroyView() {
        super.onDestroyView();
        this.handler.removeCallbacksAndMessages(null);
        VideoMoleculeViewHolder videoMoleculeViewHolder = this.viewHolder;
        if (videoMoleculeViewHolder != null) {
            videoMoleculeViewHolder.clearPlayerListener();
        }
        VideoMoleculeViewHolder videoMoleculeViewHolder2 = this.viewHolder;
        if (videoMoleculeViewHolder2 != null) {
            videoMoleculeViewHolder2.clearVisibilityListener();
        }
        this.viewHolder = null;
        this._binding = null;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onPause() {
        super.onPause();
        Context context = getContext();
        Intrinsics.g(context, "null cannot be cast to non-null type ru.ozon.app.android.gallery.GalleryActivity");
        ((GalleryActivity) context).setCloseListener(null);
        if (requireActivity().isFinishing()) {
            VideoMoleculeViewHolder.onRemove$default(requireViewHolder(), false, 1, null);
        } else {
            requireViewHolder().pauseVideo();
            VideoMoleculePlayerDelegate videoMoleculePlayerDelegate = this.playerDelegate;
            if (videoMoleculePlayerDelegate == null) {
                Intrinsics.n("playerDelegate");
                throw null;
            }
            this.videoPosition = videoMoleculePlayerDelegate.getPlayerPosition();
        }
        stopListeningVolumeChangeEvents();
        unsubscribeFromSoundController();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onResume() {
        super.onResume();
        Context context = getContext();
        Intrinsics.g(context, "null cannot be cast to non-null type ru.ozon.app.android.gallery.GalleryActivity");
        ((GalleryActivity) context).setCloseListener(this);
        OzonVideoGalleryViewModel ozonVideoGalleryViewModel = this.viewModel;
        if (ozonVideoGalleryViewModel != null) {
            ItemVO.OzonVideo ozonVideo = this.videoItem;
            ozonVideoGalleryViewModel.processOpenViewEvent(ozonVideo != null ? ozonVideo.getGalleryTokenizedVideoEvents() : null);
        }
        requireViewHolder().playVideo();
        startListeningForVolumeChangeEvents();
        subscribeToSoundController();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onViewCreated(@NotNull View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        adjustUiForOrientation(new FullScreenModel(1, this.isForcedFullScreen));
        setupUi();
        showProgress(true);
        VideoMoleculeViewHolder requireViewHolder = requireViewHolder();
        VideoMolecule videoMolecule = this.videoMolecule;
        if (videoMolecule != null) {
            PlayerStateKt.updateIsPlaying(videoMolecule, false);
            PlayerStateKt.updateShouldRepeat(videoMolecule, true);
            VideoMoleculeViewHolder.bind$default(requireViewHolder, videoMolecule, true, false, 4, null);
        }
        requireViewHolder.seekTo(this.videoPosition);
        requireViewHolder.showContent(false);
    }
}
