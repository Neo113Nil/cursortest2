package ru.ozon.app.android.videomolecule.presentation.viewholder;

import AI.a;
import AI.b;
import B90.C2606h;
import B90.C2607i;
import B90.C2608j;
import B90.C2609k;
import B90.C2617t;
import B90.r;
import FY.d;
import FY.e;
import Fj.c;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.G;
import androidx.lifecycle.J;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.app.android.storefront.ui.videomolecule.R$id;
import ru.ozon.app.android.storefront.ui.videomolecule.R$string;
import ru.ozon.app.android.storefront.ui.videomolecule.databinding.VideoMoleculeBinding;
import ru.ozon.app.android.storefrontcommonwidgets.core.views.SwitchingImageModel;
import ru.ozon.app.android.storefrontcommonwidgets.core.views.SwitchingImageView;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.app.android.video.player.PlayerState;
import ru.ozon.app.android.video.playerV2.playerController.base.listeners.OnPausePlayerControllerListener;
import ru.ozon.app.android.video.playerV2.playerController.base.listeners.PlayerListenersContainer;
import ru.ozon.app.android.videomolecule.data.PlayerStateKt;
import ru.ozon.app.android.videomolecule.data.VideoMolecule;
import ru.ozon.app.android.videomolecule.presentation.replay.VideoMoleculeReplayDelegate;
import ru.ozon.app.android.videomolecule.presentation.replay.VideoMoleculeReplayView;
import ru.ozon.app.android.videomolecule.presentation.rewind.VideoMoleculeRewindDelegate;
import ru.ozon.app.android.videomolecule.presentation.view.VideoMoleculeView;
import ru.ozon.app.android.videomolecule.presentation.view.controlpanel.VideoMoleculeTextMeasurer;
import ru.ozon.app.android.videomolecule.presentation.viewholder.VideoMoleculeViewHolder;
import ru.ozon.app.android.videomolecule.presentation.viewholder.orientation.auto.OnVideoMoleculeOrientationChanged;
import ru.ozon.app.android.videomolecule.presentation.viewholder.orientation.manual.ManualMoleculeOrientationDelegate;
import ru.ozon.app.android.videomolecule.presentation.viewholder.player.VideoMoleculePlayerDelegate;
import ru.ozon.app.android.videomolecule.presentation.visibilitydelegate.VideoMoleculeVisibilityDelegate;
import ru.ozon.app.android.videomolecule.presentation.visibilitydelegate.VideoMoleculeVisibilityDelegateListener;
import ru.ozon.uni.core.R$drawable;

@Metadata(d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u000e¢\u0006\u0004\b\u0016\u0010\u0012J\r\u0010\u0017\u001a\u00020\u000e¢\u0006\u0004\b\u0017\u0010\u0012J\u000f\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010!\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\u0015\u0010$\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020#¢\u0006\u0004\b$\u0010%J\u0015\u0010(\u001a\u00020\u000e2\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)J\u0015\u0010+\u001a\u00020\u000e2\u0006\u0010*\u001a\u00020\u0018¢\u0006\u0004\b+\u0010,J\u0015\u0010/\u001a\u00020\u000e2\u0006\u0010.\u001a\u00020-¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u000eH\u0002¢\u0006\u0004\b1\u0010\u0012J\u000f\u00102\u001a\u00020\u000eH\u0002¢\u0006\u0004\b2\u0010\u0012J\u0017\u00104\u001a\u00020\u000e2\u0006\u00103\u001a\u00020\u0013H\u0002¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\u000eH\u0002¢\u0006\u0004\b6\u0010\u0012J\u000f\u00108\u001a\u000207H\u0002¢\u0006\u0004\b8\u00109J\u000f\u0010;\u001a\u00020:H\u0002¢\u0006\u0004\b;\u0010<R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010=R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010>R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010?R\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010@R\u0014\u0010B\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0018\u0010D\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010G\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010J\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010M\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010P\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010S\u001a\u00020R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010U\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010ER\u0014\u0010W\u001a\u00020V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0014\u0010Z\u001a\u00020Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0014\u0010]\u001a\u00020\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R\u0017\u0010_\u001a\u0002078\u0006¢\u0006\f\n\u0004\b_\u0010`\u001a\u0004\ba\u00109¨\u0006b"}, d2 = {"Lru/ozon/app/android/videomolecule/presentation/viewholder/VideoMoleculeViewHolder;", "", "Lru/ozon/app/android/videomolecule/presentation/view/VideoMoleculeView;", "containerView", "Lru/ozon/app/android/videomolecule/presentation/viewholder/player/VideoMoleculePlayerDelegate;", "playerDelegate", "Lru/ozon/app/android/videomolecule/presentation/viewholder/VideoMoleculeUiReferences;", "refs", "Landroidx/lifecycle/v;", "lifecycle", "<init>", "(Lru/ozon/app/android/videomolecule/presentation/view/VideoMoleculeView;Lru/ozon/app/android/videomolecule/presentation/viewholder/player/VideoMoleculePlayerDelegate;Lru/ozon/app/android/videomolecule/presentation/viewholder/VideoMoleculeUiReferences;Landroidx/lifecycle/v;)V", "Lru/ozon/app/android/videomolecule/data/VideoMolecule;", "molecule", "", "bind", "(Lru/ozon/app/android/videomolecule/data/VideoMolecule;)V", "onRemove", "()V", "", "getCurrentVideoDuration", "()J", "playVideo", "pauseVideo", "", "switchMute", "()Ljava/lang/Boolean;", "Lru/ozon/app/android/videomolecule/presentation/viewholder/orientation/auto/OnVideoMoleculeOrientationChanged;", "orientationListener", "addOrientationListener", "(Lru/ozon/app/android/videomolecule/presentation/viewholder/orientation/auto/OnVideoMoleculeOrientationChanged;)V", "Lru/ozon/app/android/video/playerV2/playerController/base/listeners/PlayerListenersContainer;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setPlayerListener", "(Lru/ozon/app/android/video/playerV2/playerController/base/listeners/PlayerListenersContainer;)V", "Lru/ozon/app/android/videomolecule/presentation/visibilitydelegate/VideoMoleculeVisibilityDelegateListener;", "setVisibilityListener", "(Lru/ozon/app/android/videomolecule/presentation/visibilitydelegate/VideoMoleculeVisibilityDelegateListener;)V", "", "orientation", "setOrientation", "(I)V", "withAnimation", "showContent", "(Z)V", "", "widgetInfo", "setPlayerViewTag", "(Ljava/lang/String;)V", "pauseOnHide", "onVideoEnd", "videoDuration", "setLandScapeTimeGroupWidth", "(J)V", "saveVideoPosition", "Landroid/view/View;", "createInactivityArea", "()Landroid/view/View;", "Landroidx/constraintlayout/widget/ConstraintLayout$b;", "generateInactivityAreaLp", "()Landroidx/constraintlayout/widget/ConstraintLayout$b;", "Lru/ozon/app/android/videomolecule/presentation/view/VideoMoleculeView;", "Lru/ozon/app/android/videomolecule/presentation/viewholder/player/VideoMoleculePlayerDelegate;", "Landroidx/lifecycle/v;", "Lru/ozon/app/android/videomolecule/data/VideoMolecule;", "Lru/ozon/app/android/storefront/ui/videomolecule/databinding/VideoMoleculeBinding;", "binding", "Lru/ozon/app/android/storefront/ui/videomolecule/databinding/VideoMoleculeBinding;", "videoMoleculePlayerListener", "Lru/ozon/app/android/video/playerV2/playerController/base/listeners/PlayerListenersContainer;", "Lru/ozon/app/android/videomolecule/presentation/view/controlpanel/VideoMoleculeTextMeasurer;", "videoMoleculeTextMeasurer", "Lru/ozon/app/android/videomolecule/presentation/view/controlpanel/VideoMoleculeTextMeasurer;", "Lru/ozon/app/android/videomolecule/presentation/viewholder/VideoMoleculeErrorHandler;", "errorHandler", "Lru/ozon/app/android/videomolecule/presentation/viewholder/VideoMoleculeErrorHandler;", "Lru/ozon/app/android/videomolecule/presentation/visibilitydelegate/VideoMoleculeVisibilityDelegate;", "visibilityDelegate", "Lru/ozon/app/android/videomolecule/presentation/visibilitydelegate/VideoMoleculeVisibilityDelegate;", "Lru/ozon/app/android/videomolecule/presentation/replay/VideoMoleculeReplayDelegate;", "replayDelegate", "Lru/ozon/app/android/videomolecule/presentation/replay/VideoMoleculeReplayDelegate;", "Lru/ozon/app/android/videomolecule/presentation/rewind/VideoMoleculeRewindDelegate;", "rewindDelegate", "Lru/ozon/app/android/videomolecule/presentation/rewind/VideoMoleculeRewindDelegate;", "playerListener", "Lru/ozon/app/android/videomolecule/presentation/viewholder/orientation/manual/ManualMoleculeOrientationDelegate;", "orientationDelegate", "Lru/ozon/app/android/videomolecule/presentation/viewholder/orientation/manual/ManualMoleculeOrientationDelegate;", "Lru/ozon/app/android/storefrontcommonwidgets/core/views/SwitchingImageView;", "modeButton", "Lru/ozon/app/android/storefrontcommonwidgets/core/views/SwitchingImageView;", "Landroidx/lifecycle/G;", "lfObserver", "Landroidx/lifecycle/G;", "inactivityArea", "Landroid/view/View;", "getInactivityArea", "videomolecule_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class VideoMoleculeViewHolder {

    @NotNull
    private final VideoMoleculeBinding binding;

    @NotNull
    private final VideoMoleculeView containerView;

    @NotNull
    private final VideoMoleculeErrorHandler errorHandler;

    @NotNull
    private final View inactivityArea;

    @NotNull
    private final G lfObserver;

    @NotNull
    private final AbstractC5434v lifecycle;

    @NotNull
    private final SwitchingImageView modeButton;
    private VideoMolecule molecule;

    @NotNull
    private final ManualMoleculeOrientationDelegate orientationDelegate;

    @NotNull
    private final VideoMoleculePlayerDelegate playerDelegate;

    @NotNull
    private final PlayerListenersContainer playerListener;

    @NotNull
    private final VideoMoleculeReplayDelegate replayDelegate;

    @NotNull
    private final VideoMoleculeRewindDelegate rewindDelegate;
    private PlayerListenersContainer videoMoleculePlayerListener;

    @NotNull
    private final VideoMoleculeTextMeasurer videoMoleculeTextMeasurer;

    @NotNull
    private final VideoMoleculeVisibilityDelegate visibilityDelegate;

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

    public VideoMoleculeViewHolder(@NotNull VideoMoleculeView containerView, @NotNull VideoMoleculePlayerDelegate playerDelegate, @NotNull VideoMoleculeUiReferences refs, @NotNull AbstractC5434v lifecycle) {
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(playerDelegate, "playerDelegate");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        this.containerView = containerView;
        this.playerDelegate = playerDelegate;
        this.lifecycle = lifecycle;
        VideoMoleculeBinding bind = VideoMoleculeBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        Context context = containerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.videoMoleculeTextMeasurer = new VideoMoleculeTextMeasurer(context);
        this.errorHandler = new VideoMoleculeErrorHandler(refs, playerDelegate);
        VideoMoleculeVisibilityDelegate videoMoleculeVisibilityDelegate = new VideoMoleculeVisibilityDelegate(containerView);
        this.visibilityDelegate = videoMoleculeVisibilityDelegate;
        VideoMoleculeReplayView replayContainer = bind.replayContainer;
        Intrinsics.checkNotNullExpressionValue(replayContainer, "replayContainer");
        VideoMoleculeReplayDelegate videoMoleculeReplayDelegate = new VideoMoleculeReplayDelegate(replayContainer, videoMoleculeVisibilityDelegate);
        this.replayDelegate = videoMoleculeReplayDelegate;
        PlayerListenersContainer.Builder builder = new PlayerListenersContainer.Builder();
        builder.onMuteAudio(new c());
        builder.onUnMuteAudio(new K1.G());
        builder.hasAudio(new r(this));
        builder.onStart(new d(this));
        builder.onBuffer(new C2617t(this));
        builder.onReady(new e(this));
        int i11 = 1;
        builder.onError(new C2607i(this, i11));
        builder.onFinish(new C2608j(this));
        builder.onStop(new C2609k(this));
        builder.onPause(new OnPausePlayerControllerListener() { // from class: FY.a
            @Override // ru.ozon.app.android.video.playerV2.playerController.base.listeners.OnPausePlayerControllerListener
            public final void onPause() {
                VideoMoleculeViewHolder.playerListener$lambda$11$lambda$9(VideoMoleculeViewHolder.this);
            }
        });
        builder.onRenderedFirstFrame(new C2606h(this, i11));
        this.playerListener = builder.build();
        ManualMoleculeOrientationDelegate manualMoleculeOrientationDelegate = new ManualMoleculeOrientationDelegate(refs.getActivity());
        this.orientationDelegate = manualMoleculeOrientationDelegate;
        G g10 = new G() { // from class: FY.b
            @Override // androidx.lifecycle.G
            public final void onStateChanged(J j11, AbstractC5434v.a aVar) {
                VideoMoleculeViewHolder.lfObserver$lambda$12(VideoMoleculeViewHolder.this, j11, aVar);
            }
        };
        this.lfObserver = g10;
        View createInactivityArea = createInactivityArea();
        this.inactivityArea = createInactivityArea;
        SwitchingImageView switchingImageView = bind.videoMoleculePlayPauseButton;
        VideoMolecule videoMolecule = this.molecule;
        switchingImageView.bindOrGone(new SwitchingImageModel(videoMolecule != null ? PlayerStateKt.isPlaying(videoMolecule) : false, R$drawable.ic_m_pause_sign_filled, R$drawable.ic_m_play_sign_filled, null, 8, null));
        bind.videoMoleculePlayPauseButtonContainer.setOnClickListener(new a(bind, 2));
        bind.videoMoleculePlayPauseButton.setListener(new VideoMoleculeViewHolder$1$2(this));
        containerView.addView(createInactivityArea, generateInactivityAreaLp());
        bind.touchArea.setOnClickListener(new b(this, 3));
        createInactivityArea.setOnTouchListener(new FY.c(this, 0));
        bind.replayContainer.setOnClickListener(new CC.a(this, 1));
        this.rewindDelegate = new VideoMoleculeRewindDelegate(bind, containerView, videoMoleculeVisibilityDelegate, playerDelegate, videoMoleculeReplayDelegate);
        lifecycle.a(g10);
        SwitchingImageView switchingImageView2 = (SwitchingImageView) containerView.findViewById(R$id.modeButton);
        this.modeButton = switchingImageView2;
        switchingImageView2.setListener(new VideoMoleculeViewHolder$1$6(this));
        manualMoleculeOrientationDelegate.addOrientationListener(new OnVideoMoleculeOrientationChanged() { // from class: ru.ozon.app.android.videomolecule.presentation.viewholder.VideoMoleculeViewHolder$1$7
            @Override // ru.ozon.app.android.videomolecule.presentation.viewholder.orientation.auto.OnVideoMoleculeOrientationChanged
            public void onAnyOrientationChanged(int orientation) {
                VideoMoleculeView videoMoleculeView;
                VideoMoleculeRewindDelegate videoMoleculeRewindDelegate;
                videoMoleculeView = VideoMoleculeViewHolder.this.containerView;
                videoMoleculeView.setCurrentOrientation(orientation);
                videoMoleculeRewindDelegate = VideoMoleculeViewHolder.this.rewindDelegate;
                videoMoleculeRewindDelegate.onOrientationChange(orientation);
            }
        });
        manualMoleculeOrientationDelegate.enable();
    }

    private final View createInactivityArea() {
        View view = new View(this.containerView.getContext());
        view.setId(R$id.inactivityArea);
        view.setTag(StringProvider.getString(R$string.video_molecule_view_tag));
        return view;
    }

    private final ConstraintLayout.b generateInactivityAreaLp() {
        ConstraintLayout.b bVar = new ConstraintLayout.b(0, 0);
        bVar.f41636i = 0;
        bVar.f41642l = 0;
        bVar.f41656t = 0;
        bVar.f41658v = 0;
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$17$lambda$13(VideoMoleculeBinding videoMoleculeBinding, View view) {
        videoMoleculeBinding.videoMoleculePlayPauseButton.callOnClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$17$lambda$14(VideoMoleculeViewHolder videoMoleculeViewHolder, View view) {
        videoMoleculeViewHolder.visibilityDelegate.switchVisibilityChildren();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean lambda$17$lambda$15(VideoMoleculeViewHolder videoMoleculeViewHolder, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return false;
        }
        videoMoleculeViewHolder.visibilityDelegate.refreshInactivityTimer();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$17$lambda$16(VideoMoleculeViewHolder videoMoleculeViewHolder, View view) {
        videoMoleculeViewHolder.playerDelegate.replay();
        videoMoleculeViewHolder.replayDelegate.hide();
        videoMoleculeViewHolder.visibilityDelegate.showSpecificView(R$id.videoMoleculePlayPauseButtonContainer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lfObserver$lambda$12(VideoMoleculeViewHolder videoMoleculeViewHolder, J source, AbstractC5434v.a event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        int i11 = WhenMappings.$EnumSwitchMapping$0[event.ordinal()];
        if (i11 == 1) {
            VideoMolecule videoMolecule = videoMoleculeViewHolder.molecule;
            if (videoMolecule == null || !PlayerStateKt.isPlaying(videoMolecule)) {
                return;
            }
            videoMoleculeViewHolder.playVideo();
            return;
        }
        if (i11 == 2) {
            videoMoleculeViewHolder.saveVideoPosition();
        } else {
            if (i11 != 3) {
                return;
            }
            videoMoleculeViewHolder.containerView.setKeepScreenOn(false);
            videoMoleculeViewHolder.pauseOnHide();
        }
    }

    private final void onVideoEnd() {
        if (this.rewindDelegate.isInRewind()) {
            this.replayDelegate.hide();
        } else {
            this.replayDelegate.show();
            this.visibilityDelegate.hideSpecificView(R$id.videoMoleculePlayPauseButtonContainer);
        }
    }

    private final void pauseOnHide() {
        saveVideoPosition();
        this.containerView.setKeepScreenOn(false);
        VideoMolecule videoMolecule = this.molecule;
        if (videoMolecule != null) {
            PlayerStateKt.ignoreNextPlayingEmmit(videoMolecule);
        }
        this.playerDelegate.pause();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void playerListener$lambda$11$lambda$10(VideoMoleculeViewHolder videoMoleculeViewHolder) {
        PlayerListenersContainer playerListenersContainer = videoMoleculeViewHolder.videoMoleculePlayerListener;
        if (playerListenersContainer != null) {
            playerListenersContainer.onRenderedFirstFrame();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void playerListener$lambda$11$lambda$2(VideoMoleculeViewHolder videoMoleculeViewHolder, boolean z11) {
        PlayerListenersContainer playerListenersContainer = videoMoleculeViewHolder.videoMoleculePlayerListener;
        if (playerListenersContainer != null) {
            playerListenersContainer.hasAudio(z11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void playerListener$lambda$11$lambda$3(VideoMoleculeViewHolder videoMoleculeViewHolder, PlayerState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        videoMoleculeViewHolder.binding.videoMoleculePlayPauseButton.switchButton(true);
        VideoMolecule videoMolecule = videoMoleculeViewHolder.molecule;
        if (videoMolecule != null) {
            PlayerStateKt.updateIsPlaying(videoMolecule, true);
        }
        PlayerListenersContainer playerListenersContainer = videoMoleculeViewHolder.videoMoleculePlayerListener;
        if (playerListenersContainer != null) {
            playerListenersContainer.onStart(state);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void playerListener$lambda$11$lambda$4(VideoMoleculeViewHolder videoMoleculeViewHolder) {
        PlayerListenersContainer playerListenersContainer = videoMoleculeViewHolder.videoMoleculePlayerListener;
        if (playerListenersContainer != null) {
            playerListenersContainer.onBuffer();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void playerListener$lambda$11$lambda$5(VideoMoleculeViewHolder videoMoleculeViewHolder, PlayerState playerState) {
        Intrinsics.checkNotNullParameter(playerState, "playerState");
        videoMoleculeViewHolder.replayDelegate.hide();
        videoMoleculeViewHolder.setLandScapeTimeGroupWidth(playerState.getDuration());
        PlayerListenersContainer playerListenersContainer = videoMoleculeViewHolder.videoMoleculePlayerListener;
        if (playerListenersContainer != null) {
            playerListenersContainer.onReady(playerState);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void playerListener$lambda$11$lambda$6(VideoMoleculeViewHolder videoMoleculeViewHolder, String message, Exception exc, Boolean bool) {
        Intrinsics.checkNotNullParameter(message, "message");
        videoMoleculeViewHolder.errorHandler.showVideoLoadingError();
        PlayerListenersContainer playerListenersContainer = videoMoleculeViewHolder.videoMoleculePlayerListener;
        if (playerListenersContainer != null) {
            playerListenersContainer.onError(message, exc, bool);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void playerListener$lambda$11$lambda$7(VideoMoleculeViewHolder videoMoleculeViewHolder) {
        videoMoleculeViewHolder.onVideoEnd();
        PlayerListenersContainer playerListenersContainer = videoMoleculeViewHolder.videoMoleculePlayerListener;
        if (playerListenersContainer != null) {
            playerListenersContainer.onFinish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void playerListener$lambda$11$lambda$8(VideoMoleculeViewHolder videoMoleculeViewHolder) {
        videoMoleculeViewHolder.binding.videoMoleculePlayPauseButton.switchButton(false);
        PlayerListenersContainer playerListenersContainer = videoMoleculeViewHolder.videoMoleculePlayerListener;
        if (playerListenersContainer != null) {
            playerListenersContainer.onStop();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void playerListener$lambda$11$lambda$9(VideoMoleculeViewHolder videoMoleculeViewHolder) {
        videoMoleculeViewHolder.binding.videoMoleculePlayPauseButton.switchButton(false);
        VideoMolecule videoMolecule = videoMoleculeViewHolder.molecule;
        if (videoMolecule != null) {
            PlayerStateKt.updateIsPlaying(videoMolecule, false);
        }
        PlayerListenersContainer playerListenersContainer = videoMoleculeViewHolder.videoMoleculePlayerListener;
        if (playerListenersContainer != null) {
            playerListenersContainer.onPause();
        }
    }

    private final void saveVideoPosition() {
        ru.ozon.app.android.videomolecule.data.PlayerState playerState;
        VideoMolecule videoMolecule = this.molecule;
        if (videoMolecule == null || (playerState = videoMolecule.getPlayerState()) == null) {
            return;
        }
        playerState.setCurrentPlayerTime(this.playerDelegate.getPlayerPosition());
    }

    private final void setLandScapeTimeGroupWidth(long videoDuration) {
        this.containerView.setLandscapeTimeGroupWidth(this.videoMoleculeTextMeasurer.getLandscapeMaxTimeWidth(videoDuration));
    }

    public final void addOrientationListener(@NotNull OnVideoMoleculeOrientationChanged orientationListener) {
        Intrinsics.checkNotNullParameter(orientationListener, "orientationListener");
        this.orientationDelegate.addOrientationListener(orientationListener);
    }

    public final void bind(@NotNull VideoMolecule molecule) {
        Intrinsics.checkNotNullParameter(molecule, "molecule");
        this.molecule = molecule;
        this.modeButton.bindOrGone(new SwitchingImageModel(this.orientationDelegate.getCurrentOrientation() != 1, R$drawable.ic_m_full_screen_exit, R$drawable.ic_s_full_screen, null, 8, null));
        this.playerDelegate.bind(molecule, this.containerView, this.playerListener, PlayerStateKt.isPlaying(molecule));
        this.playerDelegate.seekTo(molecule.getPlayerState().getCurrentPlayerTime());
    }

    public final long getCurrentVideoDuration() {
        return this.playerDelegate.getPlayerPosition();
    }

    public final void onRemove() {
        this.playerDelegate.onRemove();
        this.errorHandler.onRemove();
        this.visibilityDelegate.clearPendingActions();
        this.lifecycle.e(this.lfObserver);
        this.orientationDelegate.disable();
    }

    public final void pauseVideo() {
        saveVideoPosition();
        this.playerDelegate.pause();
    }

    public final void playVideo() {
        this.binding.getConstraintLayout().setKeepScreenOn(true);
        this.playerDelegate.play();
    }

    public final void setOrientation(int orientation) {
        this.orientationDelegate.forceChangeOrientation(orientation);
    }

    public final void setPlayerListener(@NotNull PlayerListenersContainer listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.videoMoleculePlayerListener = listener;
    }

    public final void setPlayerViewTag(@NotNull String widgetInfo) {
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        this.containerView.getPlayerView().setTag(R.id.tag_key_widget_name, widgetInfo);
    }

    public final void setVisibilityListener(@NotNull VideoMoleculeVisibilityDelegateListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.visibilityDelegate.setListener(listener);
    }

    public final void showContent(boolean withAnimation) {
        if (withAnimation) {
            this.visibilityDelegate.showChildrenWithAnimation();
        } else {
            this.visibilityDelegate.showImediatly();
        }
    }

    public final Boolean switchMute() {
        return this.playerDelegate.switchMute();
    }
}
