package ru.ozon.app.android.videomoleculecompose.intent;

import S0.A1;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.n1;
import Sc.o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.video.playerV2.playerController.base.BasePlayerController;
import ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers.BaseMediaPlayController;
import ru.ozon.app.android.videomoleculecompose.intent.VideoMoleculeIntent;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a;\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\b\u0010\t\u001a;\u0010\r\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00062\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000e*\"\u0010\u000f\"\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00022\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002¨\u0006\u0011²\u0006\u0018\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\nX\u008a\u0084\u0002"}, d2 = {"Lru/ozon/app/android/video/playerV2/playerController/base/BasePlayerController;", "playerController", "Lkotlin/Function1;", "", "", "onFullscreenChange", "Lru/ozon/app/android/videomoleculecompose/intent/VideoMoleculeIntent;", "Lru/ozon/app/android/videomoleculecompose/intent/VideoMoleculeIntentHandler;", "rememberDefaultVideoMoleculeIntentHandler", "(Lru/ozon/app/android/video/playerV2/playerController/base/BasePlayerController;Lkotlin/jvm/functions/Function1;LS0/k;I)Lkotlin/jvm/functions/Function1;", "intent", "Lru/ozon/app/android/videomoleculecompose/intent/DefaultVideoMoleculeScrubSession;", "scrubSession", "handleDefaultVideoMoleculeIntent", "(Lru/ozon/app/android/video/playerV2/playerController/base/BasePlayerController;Lru/ozon/app/android/videomoleculecompose/intent/VideoMoleculeIntent;Lkotlin/jvm/functions/Function1;Lru/ozon/app/android/videomoleculecompose/intent/DefaultVideoMoleculeScrubSession;)V", "VideoMoleculeIntentHandler", "currentOnFullscreenChange", "videomoleculecompose_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class VideoMoleculeIntentHandlerKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleDefaultVideoMoleculeIntent(BasePlayerController basePlayerController, VideoMoleculeIntent videoMoleculeIntent, Function1<? super Boolean, Unit> function1, DefaultVideoMoleculeScrubSession defaultVideoMoleculeScrubSession) {
        if (Intrinsics.d(videoMoleculeIntent, VideoMoleculeIntent.ContainerTap.INSTANCE) || Intrinsics.d(videoMoleculeIntent, VideoMoleculeIntent.TogglePlayback.INSTANCE)) {
            BaseMediaPlayController mediaPlayController = basePlayerController.mediaPlayController();
            if (mediaPlayController.isPlaying()) {
                mediaPlayController.pause();
                return;
            } else if (mediaPlayController.isPlayerActive()) {
                mediaPlayController.resume();
                return;
            } else {
                mediaPlayController.retryLoadMedia();
                return;
            }
        }
        if (Intrinsics.d(videoMoleculeIntent, VideoMoleculeIntent.Replay.INSTANCE)) {
            basePlayerController.positionController().seekToStartAndReplay();
            return;
        }
        if (videoMoleculeIntent instanceof VideoMoleculeIntent.SwitchFullscreen) {
            function1.invoke(Boolean.valueOf(((VideoMoleculeIntent.SwitchFullscreen) videoMoleculeIntent).getTargetFullscreen()));
            return;
        }
        if (videoMoleculeIntent instanceof VideoMoleculeIntent.ScrubStart) {
            BaseMediaPlayController mediaPlayController2 = basePlayerController.mediaPlayController();
            defaultVideoMoleculeScrubSession.setWasPlayingBeforeScrub(mediaPlayController2.isPlaying());
            if (defaultVideoMoleculeScrubSession.getWasPlayingBeforeScrub()) {
                mediaPlayController2.pause();
                return;
            }
            return;
        }
        if (videoMoleculeIntent instanceof VideoMoleculeIntent.ScrubMove) {
            return;
        }
        if (!(videoMoleculeIntent instanceof VideoMoleculeIntent.ScrubEnd)) {
            throw new o();
        }
        VideoMoleculeIntent.ScrubEnd scrubEnd = (VideoMoleculeIntent.ScrubEnd) videoMoleculeIntent;
        if (!scrubEnd.getCanceled()) {
            basePlayerController.positionController().seekTo(scrubEnd.getPositionMs());
            basePlayerController.mediaPlayController().resume();
        } else if (defaultVideoMoleculeScrubSession.getWasPlayingBeforeScrub()) {
            basePlayerController.mediaPlayController().resume();
        }
        defaultVideoMoleculeScrubSession.setWasPlayingBeforeScrub(false);
    }

    @NotNull
    public static final Function1<VideoMoleculeIntent, Unit> rememberDefaultVideoMoleculeIntentHandler(@NotNull BasePlayerController playerController, @NotNull Function1<? super Boolean, Unit> onFullscreenChange, InterfaceC3967k interfaceC3967k, int i11) {
        Intrinsics.checkNotNullParameter(playerController, "playerController");
        Intrinsics.checkNotNullParameter(onFullscreenChange, "onFullscreenChange");
        interfaceC3967k.o(36022852);
        InterfaceC3978p0 l11 = n1.l(onFullscreenChange, interfaceC3967k);
        interfaceC3967k.o(1190807636);
        boolean n11 = interfaceC3967k.n(playerController);
        Object C11 = interfaceC3967k.C();
        if (n11 || C11 == InterfaceC3967k.a.a()) {
            C11 = new DefaultVideoMoleculeScrubSession();
            interfaceC3967k.x(C11);
        }
        DefaultVideoMoleculeScrubSession defaultVideoMoleculeScrubSession = (DefaultVideoMoleculeScrubSession) C11;
        interfaceC3967k.k();
        interfaceC3967k.o(1190810779);
        boolean n12 = interfaceC3967k.n(playerController);
        Object C12 = interfaceC3967k.C();
        if (n12 || C12 == InterfaceC3967k.a.a()) {
            C12 = new VideoMoleculeIntentHandlerKt$rememberDefaultVideoMoleculeIntentHandler$1$1(playerController, defaultVideoMoleculeScrubSession, l11);
            interfaceC3967k.x(C12);
        }
        Function1<VideoMoleculeIntent, Unit> function1 = (Function1) C12;
        interfaceC3967k.k();
        interfaceC3967k.k();
        return function1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function1<Boolean, Unit> rememberDefaultVideoMoleculeIntentHandler$lambda$0(A1<? extends Function1<? super Boolean, Unit>> a12) {
        return (Function1) a12.getValue();
    }
}
