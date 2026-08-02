package ru.ozon.app.android.pdpvideomolecule.presentation.viewholder;

import AW.d;
import An.b;
import B90.C;
import B90.D;
import B90.E;
import B90.F;
import B90.H;
import Fj.c;
import QD.a;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.G;
import androidx.lifecycle.J;
import androidx.lifecycle.P;
import androidx.lifecycle.V;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import j3.Q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdpvideomolecule.R$id;
import ru.ozon.app.android.pdpvideomolecule.R$string;
import ru.ozon.app.android.pdpvideomolecule.data.PlayerState;
import ru.ozon.app.android.pdpvideomolecule.data.PlayerStateKt;
import ru.ozon.app.android.pdpvideomolecule.data.VideoMolecule;
import ru.ozon.app.android.pdpvideomolecule.presentation.replay.VideoMoleculeReplayDelegate;
import ru.ozon.app.android.pdpvideomolecule.presentation.rewind.VideoMoleculeRewindDelegate;
import ru.ozon.app.android.pdpvideomolecule.presentation.switchingimage.SwitchingImageModel;
import ru.ozon.app.android.pdpvideomolecule.presentation.switchingimage.SwitchingImageView;
import ru.ozon.app.android.pdpvideomolecule.presentation.view.VideoMoleculeApi;
import ru.ozon.app.android.pdpvideomolecule.presentation.view.controlpanel.VideoMoleculeTextMeasurer;
import ru.ozon.app.android.pdpvideomolecule.presentation.view.utils.PdpVideoMoleculeBinding;
import ru.ozon.app.android.pdpvideomolecule.presentation.viewholder.VideoMoleculeNamespace;
import ru.ozon.app.android.pdpvideomolecule.presentation.viewholder.VideoMoleculeViewHolder;
import ru.ozon.app.android.pdpvideomolecule.presentation.viewholder.orientation.auto.OnVideoMoleculeOrientationChanged;
import ru.ozon.app.android.pdpvideomolecule.presentation.viewholder.orientation.manual.ManualMoleculeOrientationDelegate;
import ru.ozon.app.android.pdpvideomolecule.presentation.viewholder.player.VideoMoleculePlayerDelegate;
import ru.ozon.app.android.pdpvideomolecule.presentation.visibilitydelegate.VideoMoleculeVisibilityDelegate;
import ru.ozon.app.android.pdpvideomolecule.presentation.visibilitydelegate.VideoMoleculeVisibilityDelegateListener;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.app.android.video.playerV2.playerController.base.listeners.OnPausePlayerControllerListener;
import ru.ozon.app.android.video.playerV2.playerController.base.listeners.OnStopPlayerControllerListener;
import ru.ozon.app.android.video.playerV2.playerController.base.listeners.PlayerListenersContainer;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.core.R$drawable;

@Metadata(d1 = {"\u0000Ò\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 |2\u00020\u0001:\u0001|B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ)\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0010¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0013¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u0013¢\u0006\u0004\b\u001e\u0010\u001aJ\r\u0010\u001f\u001a\u00020\u0013¢\u0006\u0004\b\u001f\u0010\u001aJ\u0015\u0010!\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u001b¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b$\u0010%J\u0015\u0010'\u001a\u00020\u00132\u0006\u0010&\u001a\u00020\u0010¢\u0006\u0004\b'\u0010\u0018J\r\u0010(\u001a\u00020\u0013¢\u0006\u0004\b(\u0010\u001aJ\u0015\u0010+\u001a\u00020\u00132\u0006\u0010*\u001a\u00020)¢\u0006\u0004\b+\u0010,J\r\u0010-\u001a\u00020\u0013¢\u0006\u0004\b-\u0010\u001aJ\u0015\u0010/\u001a\u00020\u00132\u0006\u0010*\u001a\u00020.¢\u0006\u0004\b/\u00100J\r\u00101\u001a\u00020\u0013¢\u0006\u0004\b1\u0010\u001aJ\u0015\u00104\u001a\u00020\u00132\u0006\u00103\u001a\u000202¢\u0006\u0004\b4\u00105J\u0015\u00106\u001a\u00020\u00132\u0006\u00103\u001a\u000202¢\u0006\u0004\b6\u00105J\u0017\u00108\u001a\u00020\u00132\b\b\u0002\u00107\u001a\u00020\u0010¢\u0006\u0004\b8\u0010\u0018J\u0015\u00109\u001a\u00020\u00132\u0006\u00107\u001a\u00020\u0010¢\u0006\u0004\b9\u0010\u0018J!\u0010=\u001a\u00020\u00132\u0012\u0010<\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020\u00130:¢\u0006\u0004\b=\u0010>J\u0015\u0010@\u001a\u00020\u00132\u0006\u0010?\u001a\u00020\u0010¢\u0006\u0004\b@\u0010\u0018J\u000f\u0010A\u001a\u00020\u0013H\u0002¢\u0006\u0004\bA\u0010\u001aJ\u0017\u0010C\u001a\u00020\u00132\u0006\u0010B\u001a\u00020\u001bH\u0002¢\u0006\u0004\bC\u0010\"J\u000f\u0010D\u001a\u00020\u0013H\u0002¢\u0006\u0004\bD\u0010\u001aJ\u000f\u0010F\u001a\u00020EH\u0002¢\u0006\u0004\bF\u0010GJ\u000f\u0010I\u001a\u00020HH\u0002¢\u0006\u0004\bI\u0010JJ\u0015\u0010K\u001a\u00020\u0010*\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\bK\u0010LJ\u0017\u0010N\u001a\u00020\u00132\u0006\u0010M\u001a\u00020\u0010H\u0002¢\u0006\u0004\bN\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010OR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010PR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010QR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010RR\u001a\u0010T\u001a\b\u0012\u0004\u0012\u00020\u001b0S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u001d\u0010B\u001a\b\u0012\u0004\u0012\u00020\u001b0V8\u0006¢\u0006\f\n\u0004\bB\u0010W\u001a\u0004\bX\u0010YR\u0014\u0010[\u001a\u00020Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010]R\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010^R\u0016\u0010_\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010^R\u0018\u0010`\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010aR\u0014\u0010c\u001a\u00020b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010dR\u0014\u0010f\u001a\u00020e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010gR\u0014\u0010i\u001a\u00020h8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010jR\u0014\u0010l\u001a\u00020k8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010mR\u0014\u0010n\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010aR\u0014\u0010p\u001a\u00020o8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bp\u0010qR\u0014\u0010r\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\br\u0010^R$\u0010<\u001a\u0010\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020\u0013\u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010sR\u0016\u0010u\u001a\u0004\u0018\u00010t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bu\u0010vR\u0014\u0010x\u001a\u00020w8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bx\u0010yR\u0014\u0010z\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bz\u0010{¨\u0006}"}, d2 = {"Lru/ozon/app/android/pdpvideomolecule/presentation/viewholder/VideoMoleculeViewHolder;", "", "Lru/ozon/app/android/pdpvideomolecule/presentation/view/VideoMoleculeApi;", "containerWrapper", "Lru/ozon/app/android/pdpvideomolecule/presentation/viewholder/player/VideoMoleculePlayerDelegate;", "playerDelegate", "Lru/ozon/app/android/pdpvideomolecule/presentation/viewholder/VideoMoleculeUiReferences;", "refs", "Landroidx/lifecycle/v;", "lifecycle", "Lru/ozon/app/android/pdpvideomolecule/presentation/viewholder/VideoMoleculeNamespace;", "videoMoleculeUsageNamespace", "<init>", "(Lru/ozon/app/android/pdpvideomolecule/presentation/view/VideoMoleculeApi;Lru/ozon/app/android/pdpvideomolecule/presentation/viewholder/player/VideoMoleculePlayerDelegate;Lru/ozon/app/android/pdpvideomolecule/presentation/viewholder/VideoMoleculeUiReferences;Landroidx/lifecycle/v;Lru/ozon/app/android/pdpvideomolecule/presentation/viewholder/VideoMoleculeNamespace;)V", "Lru/ozon/app/android/pdpvideomolecule/data/VideoMolecule;", "molecule", "", "orientationWithRatio", "applyResize", "", "bind", "(Lru/ozon/app/android/pdpvideomolecule/data/VideoMolecule;ZZ)V", "discardPlayerView", "onRemove", "(Z)V", "stop", "()V", "", "getCurrentVideoDuration", "()J", "playVideo", "pauseVideo", "position", "seekTo", "(J)V", "", "getVolume", "()Ljava/lang/Float;", "isMuted", "setMute", "removeFullScreenListener", "Lru/ozon/app/android/video/playerV2/playerController/base/listeners/PlayerListenersContainer;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setPlayerListener", "(Lru/ozon/app/android/video/playerV2/playerController/base/listeners/PlayerListenersContainer;)V", "clearPlayerListener", "Lru/ozon/app/android/pdpvideomolecule/presentation/visibilitydelegate/VideoMoleculeVisibilityDelegateListener;", "setVisibilityListener", "(Lru/ozon/app/android/pdpvideomolecule/presentation/visibilitydelegate/VideoMoleculeVisibilityDelegateListener;)V", "clearVisibilityListener", "", "orientation", "setOrientation", "(I)V", "notifyOrientationListeners", "withAnimation", "hideContent", "showContent", "Lkotlin/Function1;", "Lru/ozon/app/android/pdpvideomolecule/presentation/viewholder/FullScreenModel;", "onFullScreenChange", "setOnFullScreenChangeListener", "(Lkotlin/jvm/functions/Function1;)V", "isActive", "switchFullScreenButton", "onVideoEnd", "videoDuration", "setLandScapeTimeGroupWidth", "saveVideoPosition", "Landroid/view/View;", "createInactivityArea", "()Landroid/view/View;", "Landroidx/constraintlayout/widget/ConstraintLayout$b;", "generateInactivityAreaLp", "()Landroidx/constraintlayout/widget/ConstraintLayout$b;", "isNullOrTrue", "(Ljava/lang/Boolean;)Z", "playWhenReady", "optionalSwitchPlayWhenReadyTo", "Lru/ozon/app/android/pdpvideomolecule/presentation/view/VideoMoleculeApi;", "Lru/ozon/app/android/pdpvideomolecule/presentation/viewholder/player/VideoMoleculePlayerDelegate;", "Landroidx/lifecycle/v;", "Lru/ozon/app/android/pdpvideomolecule/presentation/viewholder/VideoMoleculeNamespace;", "Landroidx/lifecycle/V;", "_videoDuration", "Landroidx/lifecycle/V;", "Landroidx/lifecycle/P;", "Landroidx/lifecycle/P;", "getVideoDuration", "()Landroidx/lifecycle/P;", "Lru/ozon/app/android/pdpvideomolecule/presentation/view/utils/PdpVideoMoleculeBinding;", "binding", "Lru/ozon/app/android/pdpvideomolecule/presentation/view/utils/PdpVideoMoleculeBinding;", "Lru/ozon/app/android/pdpvideomolecule/data/VideoMolecule;", "Z", "isManualForcedFullScreen", "videoMoleculePlayerListener", "Lru/ozon/app/android/video/playerV2/playerController/base/listeners/PlayerListenersContainer;", "Lru/ozon/app/android/pdpvideomolecule/presentation/view/controlpanel/VideoMoleculeTextMeasurer;", "videoMoleculeTextMeasurer", "Lru/ozon/app/android/pdpvideomolecule/presentation/view/controlpanel/VideoMoleculeTextMeasurer;", "Lru/ozon/app/android/pdpvideomolecule/presentation/visibilitydelegate/VideoMoleculeVisibilityDelegate;", "visibilityDelegate", "Lru/ozon/app/android/pdpvideomolecule/presentation/visibilitydelegate/VideoMoleculeVisibilityDelegate;", "Lru/ozon/app/android/pdpvideomolecule/presentation/replay/VideoMoleculeReplayDelegate;", "replayDelegate", "Lru/ozon/app/android/pdpvideomolecule/presentation/replay/VideoMoleculeReplayDelegate;", "Lru/ozon/app/android/pdpvideomolecule/presentation/rewind/VideoMoleculeRewindDelegate;", "rewindDelegate", "Lru/ozon/app/android/pdpvideomolecule/presentation/rewind/VideoMoleculeRewindDelegate;", "playerListener", "Lru/ozon/app/android/pdpvideomolecule/presentation/viewholder/orientation/manual/ManualMoleculeOrientationDelegate;", "orientationDelegate", "Lru/ozon/app/android/pdpvideomolecule/presentation/viewholder/orientation/manual/ManualMoleculeOrientationDelegate;", "observeOrientationByViewLifecycle", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/pdpvideomolecule/presentation/switchingimage/SwitchingImageView;", "modeButton", "Lru/ozon/app/android/pdpvideomolecule/presentation/switchingimage/SwitchingImageView;", "Landroidx/lifecycle/G;", "lfObserver", "Landroidx/lifecycle/G;", "inactivityArea", "Landroid/view/View;", "Companion", "pdpvideomolecule_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class VideoMoleculeViewHolder {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final int dp16 = ResourceExtKt.toPx(16);
    private static final int dp56 = ResourceExtKt.toPx(56);

    @NotNull
    private final V<Long> _videoDuration;

    @NotNull
    private final PdpVideoMoleculeBinding binding;

    @NotNull
    private final VideoMoleculeApi containerWrapper;

    @NotNull
    private final View inactivityArea;
    private boolean isManualForcedFullScreen;

    @NotNull
    private final G lfObserver;

    @NotNull
    private final AbstractC5434v lifecycle;
    private final SwitchingImageView modeButton;
    private VideoMolecule molecule;
    private final boolean observeOrientationByViewLifecycle;
    private Function1<? super FullScreenModel, Unit> onFullScreenChange;

    @NotNull
    private final ManualMoleculeOrientationDelegate orientationDelegate;
    private boolean orientationWithRatio;

    @NotNull
    private final VideoMoleculePlayerDelegate playerDelegate;

    @NotNull
    private final PlayerListenersContainer playerListener;

    @NotNull
    private final VideoMoleculeReplayDelegate replayDelegate;

    @NotNull
    private final VideoMoleculeRewindDelegate rewindDelegate;

    @NotNull
    private final P<Long> videoDuration;
    private PlayerListenersContainer videoMoleculePlayerListener;

    @NotNull
    private final VideoMoleculeTextMeasurer videoMoleculeTextMeasurer;

    @NotNull
    private final VideoMoleculeNamespace videoMoleculeUsageNamespace;

    @NotNull
    private final VideoMoleculeVisibilityDelegate visibilityDelegate;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "isActive", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.pdpvideomolecule.presentation.viewholder.VideoMoleculeViewHolder$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<Boolean, Unit> {
        AnonymousClass2() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.f71690a;
        }

        public final void invoke(boolean z11) {
            if (z11) {
                VideoMoleculeViewHolder.this.playVideo();
            } else {
                VideoMoleculeViewHolder.this.pauseVideo();
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "isActive", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.pdpvideomolecule.presentation.viewholder.VideoMoleculeViewHolder$6, reason: invalid class name */
    static final class AnonymousClass6 extends AbstractC7737t implements Function1<Boolean, Unit> {
        AnonymousClass6() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.f71690a;
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x004e, code lost:
        
            r2 = ru.ozon.app.android.pdpvideomolecule.presentation.viewholder.VideoMoleculeViewHolderKt.isPortrait(r2);
         */
        /* JADX WARN: Multi-variable type inference failed */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void invoke(boolean z11) {
            Boolean isPortrait;
            int i11 = 1;
            i11 = 1;
            if (!z11) {
                Function1 function1 = VideoMoleculeViewHolder.this.onFullScreenChange;
                if (function1 != null) {
                    function1.invoke(new FullScreenModel(1, z11));
                }
                VideoMoleculeViewHolder.this.orientationDelegate.forceChangeOrientation(1);
                ViewExtKt.updatePadding$default(VideoMoleculeViewHolder.this.binding.getPlayerControlsView(), 0, 0, 0, VideoMoleculeViewHolder.Companion.getDp16(), 7, null);
                return;
            }
            if (!z11 || !VideoMoleculeViewHolder.this.orientationWithRatio) {
                Function1 function12 = VideoMoleculeViewHolder.this.onFullScreenChange;
                if (function12 != null) {
                    function12.invoke(new FullScreenModel(0, z11));
                }
                VideoMoleculeViewHolder.this.orientationDelegate.forceChangeOrientation(0);
                return;
            }
            Q videoSize = VideoMoleculeViewHolder.this.playerDelegate.videoSize();
            if (videoSize != null && isPortrait != null) {
                i11 = isPortrait.booleanValue();
            }
            Function1 function13 = VideoMoleculeViewHolder.this.onFullScreenChange;
            if (function13 != null) {
                function13.invoke(new FullScreenModel(i11, z11));
            }
            if (i11 == 0) {
                VideoMoleculeViewHolder.this.orientationDelegate.forceChangeOrientation(0);
            } else {
                ViewExtKt.updatePadding$default(VideoMoleculeViewHolder.this.binding.getPlayerControlsView(), 0, 0, 0, VideoMoleculeViewHolder.Companion.getDp56(), 7, null);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"Lru/ozon/app/android/pdpvideomolecule/presentation/viewholder/VideoMoleculeViewHolder$Companion;", "", "<init>", "()V", "dp16", "", "getDp16", "()I", "dp56", "getDp56", "pdpvideomolecule_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getDp16() {
            return VideoMoleculeViewHolder.dp16;
        }

        public final int getDp56() {
            return VideoMoleculeViewHolder.dp56;
        }

        private Companion() {
        }
    }

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

    /* JADX WARN: Multi-variable type inference failed */
    public VideoMoleculeViewHolder(@NotNull VideoMoleculeApi containerWrapper, @NotNull VideoMoleculePlayerDelegate playerDelegate, @NotNull VideoMoleculeUiReferences refs, @NotNull AbstractC5434v lifecycle, @NotNull VideoMoleculeNamespace videoMoleculeUsageNamespace) {
        Intrinsics.checkNotNullParameter(containerWrapper, "containerWrapper");
        Intrinsics.checkNotNullParameter(playerDelegate, "playerDelegate");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNullParameter(videoMoleculeUsageNamespace, "videoMoleculeUsageNamespace");
        this.containerWrapper = containerWrapper;
        this.playerDelegate = playerDelegate;
        this.lifecycle = lifecycle;
        this.videoMoleculeUsageNamespace = videoMoleculeUsageNamespace;
        V<Long> v11 = new V<>();
        this._videoDuration = v11;
        this.videoDuration = v11;
        PdpVideoMoleculeBinding binding = containerWrapper.getBinding();
        this.binding = binding;
        Context context = binding.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.videoMoleculeTextMeasurer = new VideoMoleculeTextMeasurer(context);
        VideoMoleculeVisibilityDelegate videoMoleculeVisibilityDelegate = new VideoMoleculeVisibilityDelegate(containerWrapper);
        this.visibilityDelegate = videoMoleculeVisibilityDelegate;
        VideoMoleculeReplayDelegate videoMoleculeReplayDelegate = new VideoMoleculeReplayDelegate(binding.getReplayContainer(), videoMoleculeVisibilityDelegate);
        this.replayDelegate = videoMoleculeReplayDelegate;
        PlayerListenersContainer.Builder builder = new PlayerListenersContainer.Builder();
        builder.onVideoSizeChanged(new C(this));
        builder.onMuteAudio(new c());
        builder.onUnMuteAudio(new K1.G());
        builder.hasAudio(new D(this));
        builder.onStart(new b(this));
        builder.onBuffer(new E(this, 7));
        builder.onReady(new F(this, 4));
        builder.onError(new B90.G(this));
        builder.onFinish(new H(this));
        builder.onStop(new OnStopPlayerControllerListener() { // from class: rF.a
            @Override // ru.ozon.app.android.video.playerV2.playerController.base.listeners.OnStopPlayerControllerListener
            public final void onStop() {
                VideoMoleculeViewHolder.playerListener$lambda$12$lambda$9(VideoMoleculeViewHolder.this);
            }
        });
        builder.onPause(new OnPausePlayerControllerListener() { // from class: rF.b
            @Override // ru.ozon.app.android.video.playerV2.playerController.base.listeners.OnPausePlayerControllerListener
            public final void onPause() {
                VideoMoleculeViewHolder.playerListener$lambda$12$lambda$10(VideoMoleculeViewHolder.this);
            }
        });
        builder.onRenderedFirstFrame(new d(this));
        this.playerListener = builder.build();
        ManualMoleculeOrientationDelegate manualMoleculeOrientationDelegate = new ManualMoleculeOrientationDelegate(refs.getActivity(), 0 == true ? 1 : 0, 2, null);
        this.orientationDelegate = manualMoleculeOrientationDelegate;
        boolean z11 = videoMoleculeUsageNamespace instanceof VideoMoleculeNamespace.Review;
        this.observeOrientationByViewLifecycle = z11;
        a aVar = new a(this, 1);
        this.lfObserver = aVar;
        View createInactivityArea = createInactivityArea();
        this.inactivityArea = createInactivityArea;
        SwitchingImageView videoMoleculePlayPauseButton = binding.getVideoMoleculePlayPauseButton();
        VideoMolecule videoMolecule = this.molecule;
        videoMoleculePlayPauseButton.bindOrGone(new SwitchingImageModel(videoMolecule != null ? PlayerStateKt.isPlaying(videoMolecule) : false, R$drawable.ic_m_pause_sign_filled, R$drawable.ic_m_play_sign_filled, null, 8, null));
        ViewExtKt.gone(binding.getVideoMoleculePlayPauseButtonContainer());
        binding.getVideoMoleculePlayPauseButtonContainer().setOnClickListener(new Ar.d(this, 12));
        binding.getVideoMoleculePlayPauseButton().setListener(new AnonymousClass2());
        binding.getRoot().addView(createInactivityArea, generateInactivityAreaLp());
        binding.getTouchArea().setOnClickListener(new DN.a(this, 9));
        createInactivityArea.setOnTouchListener(new View.OnTouchListener() { // from class: rF.c
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean _init_$lambda$17;
                _init_$lambda$17 = VideoMoleculeViewHolder._init_$lambda$17(VideoMoleculeViewHolder.this, view, motionEvent);
                return _init_$lambda$17;
            }
        });
        binding.getReplayContainer().setOnClickListener(new GI.c(this, 9));
        this.rewindDelegate = new VideoMoleculeRewindDelegate(containerWrapper, videoMoleculeVisibilityDelegate, playerDelegate, videoMoleculeReplayDelegate);
        lifecycle.a(aVar);
        SwitchingImageView switchingImageView = (SwitchingImageView) binding.getRoot().findViewById(R$id.modeButton);
        this.modeButton = switchingImageView;
        if (switchingImageView != null) {
            switchingImageView.setListener(new AnonymousClass6());
        }
        manualMoleculeOrientationDelegate.addOrientationListener(new OnVideoMoleculeOrientationChanged() { // from class: ru.ozon.app.android.pdpvideomolecule.presentation.viewholder.VideoMoleculeViewHolder.7
            @Override // ru.ozon.app.android.pdpvideomolecule.presentation.viewholder.orientation.auto.OnVideoMoleculeOrientationChanged
            public void onAnyOrientationChanged(int orientation) {
                PlayerState playerState;
                VideoMoleculeViewHolder.this.containerWrapper.setCurrentOrientation(orientation);
                VideoMoleculeVisibilityDelegate videoMoleculeVisibilityDelegate2 = VideoMoleculeViewHolder.this.visibilityDelegate;
                VideoMolecule videoMolecule2 = VideoMoleculeViewHolder.this.molecule;
                videoMoleculeVisibilityDelegate2.onOrientationChange(orientation, (videoMolecule2 == null || (playerState = videoMolecule2.getPlayerState()) == null) ? false : playerState.getIsPlaying());
                VideoMoleculeViewHolder.this.rewindDelegate.onOrientationChange(orientation);
            }
        });
        manualMoleculeOrientationDelegate.enable();
        (z11 ? refs.getViewLifecycleOwner() : refs.getLifecycleOwner()).getLifecycle().a(new DefaultLifecycleObserver() { // from class: ru.ozon.app.android.pdpvideomolecule.presentation.viewholder.VideoMoleculeViewHolder.8
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onDestroy(J owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                owner.getLifecycle().e(this);
                VideoMoleculeViewHolder.this.orientationDelegate.disable();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$14(VideoMoleculeViewHolder videoMoleculeViewHolder, View view) {
        videoMoleculeViewHolder.binding.getVideoMoleculePlayPauseButton().callOnClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$16(VideoMoleculeViewHolder videoMoleculeViewHolder, View view) {
        if (videoMoleculeViewHolder.orientationDelegate.getCurrentOrientation() != 1) {
            videoMoleculeViewHolder.visibilityDelegate.switchVisibilityChildren();
            return;
        }
        VideoMolecule videoMolecule = videoMoleculeViewHolder.molecule;
        if (videoMolecule != null) {
            if (PlayerStateKt.isPlaying(videoMolecule)) {
                videoMoleculeViewHolder.pauseVideo();
            } else {
                videoMoleculeViewHolder.playVideo();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$17(VideoMoleculeViewHolder videoMoleculeViewHolder, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return false;
        }
        videoMoleculeViewHolder.visibilityDelegate.refreshInactivityTimer();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$18(VideoMoleculeViewHolder videoMoleculeViewHolder, View view) {
        if (videoMoleculeViewHolder.orientationDelegate.getCurrentOrientation() != 1) {
            videoMoleculeViewHolder.visibilityDelegate.showSpecificView(R$id.videoMoleculePlayPauseButtonContainer);
        }
        videoMoleculeViewHolder.playerDelegate.replay();
        VideoMolecule videoMolecule = videoMoleculeViewHolder.molecule;
        if (videoMolecule != null) {
            PlayerStateKt.updateIsPlaying(videoMolecule, true);
        }
        videoMoleculeViewHolder.replayDelegate.hide();
    }

    public static /* synthetic */ void bind$default(VideoMoleculeViewHolder videoMoleculeViewHolder, VideoMolecule videoMolecule, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        if ((i11 & 4) != 0) {
            z12 = false;
        }
        videoMoleculeViewHolder.bind(videoMolecule, z11, z12);
    }

    private final View createInactivityArea() {
        View view = new View(this.binding.getRoot().getContext());
        view.setId(R$id.inactivityArea);
        view.setTag(StringProvider.getString(R$string.pdp_video_molecule_view_tag));
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

    private final boolean isNullOrTrue(Boolean bool) {
        return bool == null || bool.equals(Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lfObserver$lambda$13(VideoMoleculeViewHolder videoMoleculeViewHolder, J j11, AbstractC5434v.a event) {
        Intrinsics.checkNotNullParameter(j11, "<unused var>");
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
            videoMoleculeViewHolder.binding.getRoot().setKeepScreenOn(false);
        }
    }

    public static /* synthetic */ void onRemove$default(VideoMoleculeViewHolder videoMoleculeViewHolder, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        videoMoleculeViewHolder.onRemove(z11);
    }

    private final void onVideoEnd() {
        if (this.rewindDelegate.isInRewind()) {
            this.replayDelegate.hide();
            return;
        }
        VideoMolecule videoMolecule = this.molecule;
        if (videoMolecule != null) {
            PlayerStateKt.updateIsPlaying(videoMolecule, false);
        }
        optionalSwitchPlayWhenReadyTo(false);
        this.replayDelegate.show();
        this.visibilityDelegate.hideSpecificView(R$id.videoMoleculePlayPauseButtonContainer);
    }

    private final void optionalSwitchPlayWhenReadyTo(boolean playWhenReady) {
        if (this.videoMoleculeUsageNamespace instanceof VideoMoleculeNamespace.Review) {
            this.playerDelegate.switchPlayWhenReadyTo(playWhenReady);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0017, code lost:
    
        r5 = ru.ozon.app.android.pdpvideomolecule.presentation.viewholder.VideoMoleculeViewHolderKt.isPortrait(r5);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void playerListener$lambda$12$lambda$0(VideoMoleculeViewHolder videoMoleculeViewHolder, Q it) {
        int i11;
        Function1<? super FullScreenModel, Unit> function1;
        Boolean isPortrait;
        Intrinsics.checkNotNullParameter(it, "it");
        if (videoMoleculeViewHolder.isManualForcedFullScreen) {
            if (videoMoleculeViewHolder.orientationWithRatio) {
                Q videoSize = videoMoleculeViewHolder.playerDelegate.videoSize();
                boolean booleanValue = (videoSize == null || isPortrait == null) ? false : isPortrait.booleanValue();
                if (booleanValue) {
                    i11 = 1;
                    function1 = videoMoleculeViewHolder.onFullScreenChange;
                    if (function1 != null) {
                        function1.invoke(new FullScreenModel(i11, true));
                    }
                    if (i11 == 0) {
                        videoMoleculeViewHolder.setOrientation(i11);
                    }
                    videoMoleculeViewHolder.switchFullScreenButton(true);
                    videoMoleculeViewHolder.isManualForcedFullScreen = false;
                }
            }
            i11 = 0;
            function1 = videoMoleculeViewHolder.onFullScreenChange;
            if (function1 != null) {
            }
            if (i11 == 0) {
            }
            videoMoleculeViewHolder.switchFullScreenButton(true);
            videoMoleculeViewHolder.isManualForcedFullScreen = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void playerListener$lambda$12$lambda$10(VideoMoleculeViewHolder videoMoleculeViewHolder) {
        videoMoleculeViewHolder.binding.getVideoMoleculePlayPauseButton().switchButton(false);
        if (videoMoleculeViewHolder.orientationDelegate.getCurrentOrientation() == 1) {
            videoMoleculeViewHolder.showContent(false);
        }
        VideoMolecule videoMolecule = videoMoleculeViewHolder.molecule;
        if (videoMolecule != null) {
            PlayerStateKt.updateIsPlaying(videoMolecule, false);
        }
        PlayerListenersContainer playerListenersContainer = videoMoleculeViewHolder.videoMoleculePlayerListener;
        if (playerListenersContainer != null) {
            playerListenersContainer.onPause();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void playerListener$lambda$12$lambda$11(VideoMoleculeViewHolder videoMoleculeViewHolder) {
        PlayerListenersContainer playerListenersContainer = videoMoleculeViewHolder.videoMoleculePlayerListener;
        if (playerListenersContainer != null) {
            playerListenersContainer.onRenderedFirstFrame();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void playerListener$lambda$12$lambda$3(VideoMoleculeViewHolder videoMoleculeViewHolder, boolean z11) {
        PlayerListenersContainer playerListenersContainer = videoMoleculeViewHolder.videoMoleculePlayerListener;
        if (playerListenersContainer != null) {
            playerListenersContainer.hasAudio(z11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void playerListener$lambda$12$lambda$4(VideoMoleculeViewHolder videoMoleculeViewHolder, ru.ozon.app.android.video.player.PlayerState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (videoMoleculeViewHolder.orientationDelegate.getCurrentOrientation() == 1) {
            videoMoleculeViewHolder.hideContent(false);
        }
        videoMoleculeViewHolder.binding.getVideoMoleculePlayPauseButton().switchButton(true);
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
    public static final void playerListener$lambda$12$lambda$5(VideoMoleculeViewHolder videoMoleculeViewHolder) {
        PlayerListenersContainer playerListenersContainer = videoMoleculeViewHolder.videoMoleculePlayerListener;
        if (playerListenersContainer != null) {
            playerListenersContainer.onBuffer();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void playerListener$lambda$12$lambda$6(VideoMoleculeViewHolder videoMoleculeViewHolder, ru.ozon.app.android.video.player.PlayerState playerState) {
        Q videoSize;
        Intrinsics.checkNotNullParameter(playerState, "playerState");
        videoMoleculeViewHolder.replayDelegate.hide();
        videoMoleculeViewHolder._videoDuration.setValue(Long.valueOf(playerState.getDuration()));
        videoMoleculeViewHolder.setLandScapeTimeGroupWidth(playerState.getDuration());
        PlayerListenersContainer playerListenersContainer = videoMoleculeViewHolder.videoMoleculePlayerListener;
        if (playerListenersContainer != null) {
            Boolean bool = null;
            if (videoMoleculeViewHolder.orientationWithRatio && (videoSize = videoMoleculeViewHolder.playerDelegate.videoSize()) != null) {
                bool = VideoMoleculeViewHolderKt.isPortrait(videoSize);
            }
            playerListenersContainer.onReady(ru.ozon.app.android.video.player.PlayerState.copy$default(playerState, 0L, bool, 1, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void playerListener$lambda$12$lambda$7(VideoMoleculeViewHolder videoMoleculeViewHolder, String message, Exception exc, Boolean bool) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (videoMoleculeViewHolder.isNullOrTrue(bool)) {
            videoMoleculeViewHolder.optionalSwitchPlayWhenReadyTo(false);
        }
        PlayerListenersContainer playerListenersContainer = videoMoleculeViewHolder.videoMoleculePlayerListener;
        if (playerListenersContainer != null) {
            playerListenersContainer.onError(message, exc, bool);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void playerListener$lambda$12$lambda$8(VideoMoleculeViewHolder videoMoleculeViewHolder) {
        videoMoleculeViewHolder.onVideoEnd();
        PlayerListenersContainer playerListenersContainer = videoMoleculeViewHolder.videoMoleculePlayerListener;
        if (playerListenersContainer != null) {
            playerListenersContainer.onFinish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void playerListener$lambda$12$lambda$9(VideoMoleculeViewHolder videoMoleculeViewHolder) {
        videoMoleculeViewHolder.binding.getVideoMoleculePlayPauseButton().switchButton(false);
        if (videoMoleculeViewHolder.orientationDelegate.getCurrentOrientation() == 1) {
            videoMoleculeViewHolder.showContent(false);
        }
        PlayerListenersContainer playerListenersContainer = videoMoleculeViewHolder.videoMoleculePlayerListener;
        if (playerListenersContainer != null) {
            playerListenersContainer.onStop();
        }
    }

    private final void saveVideoPosition() {
        PlayerState playerState;
        VideoMolecule videoMolecule = this.molecule;
        if (videoMolecule == null || (playerState = videoMolecule.getPlayerState()) == null) {
            return;
        }
        playerState.setCurrentPlayerTime(this.playerDelegate.getPlayerPosition());
    }

    private final void setLandScapeTimeGroupWidth(long videoDuration) {
        this.containerWrapper.setLandscapeTimeGroupWidth(this.videoMoleculeTextMeasurer.getLandscapeMaxTimeWidth(videoDuration));
    }

    public final void bind(@NotNull VideoMolecule molecule, boolean orientationWithRatio, boolean applyResize) {
        Intrinsics.checkNotNullParameter(molecule, "molecule");
        this.orientationWithRatio = orientationWithRatio;
        this.molecule = molecule;
        if (applyResize) {
            this.containerWrapper.setConfig(false, molecule.getPortraitRatio());
        }
        SwitchingImageView switchingImageView = this.modeButton;
        if (switchingImageView != null) {
            switchingImageView.bindOrGone(new SwitchingImageModel(this.orientationDelegate.getCurrentOrientation() != 1, R$drawable.ic_s_full_screen_exit, R$drawable.ic_s_full_screen, null, 8, null));
        }
        this.playerDelegate.bind(molecule, this.containerWrapper, this.playerListener, PlayerStateKt.isPlaying(molecule), null, this.videoMoleculeUsageNamespace);
        this.playerDelegate.seekTo(molecule.getPlayerState().getCurrentPlayerTime());
    }

    public final void clearPlayerListener() {
        this.videoMoleculePlayerListener = null;
    }

    public final void clearVisibilityListener() {
        this.visibilityDelegate.clearListener();
    }

    public final long getCurrentVideoDuration() {
        return this.playerDelegate.getPlayerPosition();
    }

    @NotNull
    public final P<Long> getVideoDuration() {
        return this.videoDuration;
    }

    public final Float getVolume() {
        return this.playerDelegate.getVolume();
    }

    public final void hideContent(boolean withAnimation) {
        if (withAnimation) {
            this.visibilityDelegate.hideChildrenWithAnimation();
        } else {
            VideoMoleculeVisibilityDelegate.hideImmediately$default(this.visibilityDelegate, false, 1, null);
        }
    }

    public final void notifyOrientationListeners(int orientation) {
        this.orientationDelegate.notifyListeners(orientation);
    }

    public final void onRemove(boolean discardPlayerView) {
        this.playerDelegate.onRemove(this.playerListener);
        this.visibilityDelegate.clearPendingActions();
        this.lifecycle.e(this.lfObserver);
        if (discardPlayerView) {
            this.containerWrapper.getPlayerView().B(null);
        }
    }

    public final void pauseVideo() {
        saveVideoPosition();
        this.playerDelegate.pause();
    }

    public final void playVideo() {
        this.binding.getRoot().setKeepScreenOn(true);
        this.playerDelegate.play();
    }

    public final void removeFullScreenListener() {
        this.onFullScreenChange = null;
    }

    public final void seekTo(long position) {
        PlayerState playerState;
        VideoMolecule videoMolecule = this.molecule;
        if (videoMolecule != null && (playerState = videoMolecule.getPlayerState()) != null) {
            playerState.setCurrentPlayerTime(position);
        }
        this.playerDelegate.seekTo(position);
    }

    public final void setMute(boolean isMuted) {
        this.playerDelegate.setMute(isMuted);
    }

    public final void setOnFullScreenChangeListener(@NotNull Function1<? super FullScreenModel, Unit> onFullScreenChange) {
        Intrinsics.checkNotNullParameter(onFullScreenChange, "onFullScreenChange");
        this.onFullScreenChange = onFullScreenChange;
    }

    public final void setOrientation(int orientation) {
        this.orientationDelegate.forceChangeOrientation(orientation);
        notifyOrientationListeners(orientation);
    }

    public final void setPlayerListener(@NotNull PlayerListenersContainer listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.videoMoleculePlayerListener = listener;
    }

    public final void setVisibilityListener(@NotNull VideoMoleculeVisibilityDelegateListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.visibilityDelegate.setListener(listener);
    }

    public final void showContent(boolean withAnimation) {
        if (withAnimation) {
            this.visibilityDelegate.showChildrenWithAnimation();
        } else {
            VideoMoleculeVisibilityDelegate.showImmediately$default(this.visibilityDelegate, this.orientationDelegate.getCurrentOrientation() != 1, false, 2, null);
        }
    }

    public final void stop() {
        this.playerDelegate.stop(this.playerListener);
    }

    public final void switchFullScreenButton(boolean isActive) {
        SwitchingImageView switchingImageView = this.modeButton;
        if (switchingImageView != null) {
            switchingImageView.switchButton(isActive);
        }
        this.isManualForcedFullScreen = true;
    }

    public /* synthetic */ VideoMoleculeViewHolder(VideoMoleculeApi videoMoleculeApi, VideoMoleculePlayerDelegate videoMoleculePlayerDelegate, VideoMoleculeUiReferences videoMoleculeUiReferences, AbstractC5434v abstractC5434v, VideoMoleculeNamespace videoMoleculeNamespace, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(videoMoleculeApi, videoMoleculePlayerDelegate, videoMoleculeUiReferences, abstractC5434v, (i11 & 16) != 0 ? VideoMoleculeNamespace.Other.INSTANCE : videoMoleculeNamespace);
    }
}
