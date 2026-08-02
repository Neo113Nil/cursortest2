package ru.ozon.app.android.video.playerV2.playerController.base.listeners;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import j3.Q;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.video.player.PlayerState;

@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001:\u0001DB\u0081\u0001\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\u001e¢\u0006\u0004\b!\u0010\"J/\u0010*\u001a\u00020\u001e2\u0006\u0010$\u001a\u00020#2\u000e\u0010'\u001a\n\u0018\u00010%j\u0004\u0018\u0001`&2\b\u0010)\u001a\u0004\u0018\u00010(¢\u0006\u0004\b*\u0010+J\r\u0010,\u001a\u00020\u001e¢\u0006\u0004\b,\u0010\"J\u0015\u0010.\u001a\u00020\u001e2\u0006\u0010-\u001a\u00020\u001c¢\u0006\u0004\b.\u0010 J\u0015\u0010/\u001a\u00020\u001e2\u0006\u0010/\u001a\u00020(¢\u0006\u0004\b/\u00100J\r\u00101\u001a\u00020\u001e¢\u0006\u0004\b1\u0010\"J\r\u00102\u001a\u00020\u001e¢\u0006\u0004\b2\u0010\"J\r\u00103\u001a\u00020\u001e¢\u0006\u0004\b3\u0010\"J\u0015\u00106\u001a\u00020\u001e2\u0006\u00105\u001a\u000204¢\u0006\u0004\b6\u00107R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00108R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00109R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010:R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010;R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010<R\u0016\u0010\r\u001a\u0004\u0018\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010=R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010>R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010?R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010@R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010AR\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010BR\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010C¨\u0006E"}, d2 = {"Lru/ozon/app/android/video/playerV2/playerController/base/listeners/PlayerListenersContainer;", "", "Lru/ozon/app/android/video/playerV2/playerController/base/listeners/OnStartPlayerControllerListener;", "onStartPlayerControllerListener", "Lru/ozon/app/android/video/playerV2/playerController/base/listeners/OnBufferPlayerControllerListener;", "onBufferPlayerControllerListener", "Lru/ozon/app/android/video/playerV2/playerController/base/listeners/OnErrorPlayerControllerListener;", "onErrorPlayerControllerListener", "Lru/ozon/app/android/video/playerV2/playerController/base/listeners/OnFinishPlayerControllerListener;", "onFinishPlayerControllerListener", "Lru/ozon/app/android/video/playerV2/playerController/base/listeners/OnReadyPlayerControllerListener;", "onReadyPlayerControllerListener", "Lru/ozon/app/android/video/playerV2/playerController/base/listeners/OnMuteAudioPlayerControllerListener;", "onMuteAudioPlayerControllerListener", "Lru/ozon/app/android/video/playerV2/playerController/base/listeners/OnUnMuteAudioPlayerControllerListener;", "onUnMuteAudioPlayerControllerListener", "Lru/ozon/app/android/video/playerV2/playerController/base/listeners/HasAudioPlayerControllerListener;", "hasAudioPlayerControllerListener", "Lru/ozon/app/android/video/playerV2/playerController/base/listeners/OnStopPlayerControllerListener;", "onStopPlayerControllerListener", "Lru/ozon/app/android/video/playerV2/playerController/base/listeners/OnPausePlayerControllerListener;", "onPausePlayerControllerListener", "Lru/ozon/app/android/video/playerV2/playerController/base/listeners/OnRenderedFirstFramePlayerControllerListener;", "onRenderedFirstFramePlayerControllerListener", "Lru/ozon/app/android/video/playerV2/playerController/base/listeners/OnVideoSizeChangedPlayerControllerListener;", "onVideoSizeChangedPlayerControllerListener", "<init>", "(Lru/ozon/app/android/video/playerV2/playerController/base/listeners/OnStartPlayerControllerListener;Lru/ozon/app/android/video/playerV2/playerController/base/listeners/OnBufferPlayerControllerListener;Lru/ozon/app/android/video/playerV2/playerController/base/listeners/OnErrorPlayerControllerListener;Lru/ozon/app/android/video/playerV2/playerController/base/listeners/OnFinishPlayerControllerListener;Lru/ozon/app/android/video/playerV2/playerController/base/listeners/OnReadyPlayerControllerListener;Lru/ozon/app/android/video/playerV2/playerController/base/listeners/OnMuteAudioPlayerControllerListener;Lru/ozon/app/android/video/playerV2/playerController/base/listeners/OnUnMuteAudioPlayerControllerListener;Lru/ozon/app/android/video/playerV2/playerController/base/listeners/HasAudioPlayerControllerListener;Lru/ozon/app/android/video/playerV2/playerController/base/listeners/OnStopPlayerControllerListener;Lru/ozon/app/android/video/playerV2/playerController/base/listeners/OnPausePlayerControllerListener;Lru/ozon/app/android/video/playerV2/playerController/base/listeners/OnRenderedFirstFramePlayerControllerListener;Lru/ozon/app/android/video/playerV2/playerController/base/listeners/OnVideoSizeChangedPlayerControllerListener;)V", "Lru/ozon/app/android/video/player/PlayerState;", "state", "", "onStart", "(Lru/ozon/app/android/video/player/PlayerState;)V", "onBuffer", "()V", "", "message", "Ljava/lang/Exception;", "Lkotlin/Exception;", "error", "", "isPlaybackStateReady", "onError", "(Ljava/lang/String;Ljava/lang/Exception;Ljava/lang/Boolean;)V", "onFinish", "playerState", "onReady", "hasAudio", "(Z)V", "onStop", "onPause", "onRenderedFirstFrame", "Lj3/Q;", "videoSize", "onVideoSizeChanged", "(Lj3/Q;)V", "Lru/ozon/app/android/video/playerV2/playerController/base/listeners/OnStartPlayerControllerListener;", "Lru/ozon/app/android/video/playerV2/playerController/base/listeners/OnBufferPlayerControllerListener;", "Lru/ozon/app/android/video/playerV2/playerController/base/listeners/OnErrorPlayerControllerListener;", "Lru/ozon/app/android/video/playerV2/playerController/base/listeners/OnFinishPlayerControllerListener;", "Lru/ozon/app/android/video/playerV2/playerController/base/listeners/OnReadyPlayerControllerListener;", "Lru/ozon/app/android/video/playerV2/playerController/base/listeners/OnMuteAudioPlayerControllerListener;", "Lru/ozon/app/android/video/playerV2/playerController/base/listeners/OnUnMuteAudioPlayerControllerListener;", "Lru/ozon/app/android/video/playerV2/playerController/base/listeners/HasAudioPlayerControllerListener;", "Lru/ozon/app/android/video/playerV2/playerController/base/listeners/OnStopPlayerControllerListener;", "Lru/ozon/app/android/video/playerV2/playerController/base/listeners/OnPausePlayerControllerListener;", "Lru/ozon/app/android/video/playerV2/playerController/base/listeners/OnRenderedFirstFramePlayerControllerListener;", "Lru/ozon/app/android/video/playerV2/playerController/base/listeners/OnVideoSizeChangedPlayerControllerListener;", "Builder", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PlayerListenersContainer {
    private final HasAudioPlayerControllerListener hasAudioPlayerControllerListener;
    private final OnBufferPlayerControllerListener onBufferPlayerControllerListener;
    private final OnErrorPlayerControllerListener onErrorPlayerControllerListener;
    private final OnFinishPlayerControllerListener onFinishPlayerControllerListener;
    private final OnMuteAudioPlayerControllerListener onMuteAudioPlayerControllerListener;
    private final OnPausePlayerControllerListener onPausePlayerControllerListener;
    private final OnReadyPlayerControllerListener onReadyPlayerControllerListener;
    private final OnRenderedFirstFramePlayerControllerListener onRenderedFirstFramePlayerControllerListener;
    private final OnStartPlayerControllerListener onStartPlayerControllerListener;
    private final OnStopPlayerControllerListener onStopPlayerControllerListener;
    private final OnUnMuteAudioPlayerControllerListener onUnMuteAudioPlayerControllerListener;
    private final OnVideoSizeChangedPlayerControllerListener onVideoSizeChangedPlayerControllerListener;

    @Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u0005J\u000e\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u0007J\u000e\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\tJ\u000e\u0010 \u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u000bJ\u000e\u0010!\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\rJ\u000e\u0010\"\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u000fJ\u000e\u0010#\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u0011J\u000e\u0010$\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u0013J\u000e\u0010%\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u0015J\u000e\u0010&\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u0017J\u000e\u0010'\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u0019J\u000e\u0010(\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001bJ\u0006\u0010)\u001a\u00020*R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lru/ozon/app/android/video/playerV2/playerController/base/listeners/PlayerListenersContainer$Builder;", "", "<init>", "()V", "onStartPlayerControllerListener", "Lru/ozon/app/android/video/playerV2/playerController/base/listeners/OnStartPlayerControllerListener;", "onBufferPlayerControllerListener", "Lru/ozon/app/android/video/playerV2/playerController/base/listeners/OnBufferPlayerControllerListener;", "onErrorPlayerControllerListener", "Lru/ozon/app/android/video/playerV2/playerController/base/listeners/OnErrorPlayerControllerListener;", "onFinishPlayerControllerListener", "Lru/ozon/app/android/video/playerV2/playerController/base/listeners/OnFinishPlayerControllerListener;", "onReadyPlayerControllerListener", "Lru/ozon/app/android/video/playerV2/playerController/base/listeners/OnReadyPlayerControllerListener;", "onMuteAudioPlayerControllerListener", "Lru/ozon/app/android/video/playerV2/playerController/base/listeners/OnMuteAudioPlayerControllerListener;", "onUnMuteAudioPlayerControllerListener", "Lru/ozon/app/android/video/playerV2/playerController/base/listeners/OnUnMuteAudioPlayerControllerListener;", "hasAudioPlayerControllerListener", "Lru/ozon/app/android/video/playerV2/playerController/base/listeners/HasAudioPlayerControllerListener;", "onStopPlayerControllerListener", "Lru/ozon/app/android/video/playerV2/playerController/base/listeners/OnStopPlayerControllerListener;", "onPausePlayerControllerListener", "Lru/ozon/app/android/video/playerV2/playerController/base/listeners/OnPausePlayerControllerListener;", "onRenderedFirstFramePlayerControllerListener", "Lru/ozon/app/android/video/playerV2/playerController/base/listeners/OnRenderedFirstFramePlayerControllerListener;", "onVideoSizeChangedPlayerControllerListener", "Lru/ozon/app/android/video/playerV2/playerController/base/listeners/OnVideoSizeChangedPlayerControllerListener;", "onStart", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "onBuffer", "onError", "onFinish", "onReady", "onMuteAudio", "onUnMuteAudio", "hasAudio", "onStop", "onPause", "onRenderedFirstFrame", "onVideoSizeChanged", "build", "Lru/ozon/app/android/video/playerV2/playerController/base/listeners/PlayerListenersContainer;", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Builder {
        private HasAudioPlayerControllerListener hasAudioPlayerControllerListener;
        private OnBufferPlayerControllerListener onBufferPlayerControllerListener;
        private OnErrorPlayerControllerListener onErrorPlayerControllerListener;
        private OnFinishPlayerControllerListener onFinishPlayerControllerListener;
        private OnMuteAudioPlayerControllerListener onMuteAudioPlayerControllerListener;
        private OnPausePlayerControllerListener onPausePlayerControllerListener;
        private OnReadyPlayerControllerListener onReadyPlayerControllerListener;
        private OnRenderedFirstFramePlayerControllerListener onRenderedFirstFramePlayerControllerListener;
        private OnStartPlayerControllerListener onStartPlayerControllerListener;
        private OnStopPlayerControllerListener onStopPlayerControllerListener;
        private OnUnMuteAudioPlayerControllerListener onUnMuteAudioPlayerControllerListener;
        private OnVideoSizeChangedPlayerControllerListener onVideoSizeChangedPlayerControllerListener;

        @NotNull
        public final PlayerListenersContainer build() {
            return new PlayerListenersContainer(this.onStartPlayerControllerListener, this.onBufferPlayerControllerListener, this.onErrorPlayerControllerListener, this.onFinishPlayerControllerListener, this.onReadyPlayerControllerListener, this.onMuteAudioPlayerControllerListener, this.onUnMuteAudioPlayerControllerListener, this.hasAudioPlayerControllerListener, this.onStopPlayerControllerListener, this.onPausePlayerControllerListener, this.onRenderedFirstFramePlayerControllerListener, this.onVideoSizeChangedPlayerControllerListener, null);
        }

        @NotNull
        public final Builder hasAudio(@NotNull HasAudioPlayerControllerListener listener) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            this.hasAudioPlayerControllerListener = listener;
            return this;
        }

        @NotNull
        public final Builder onBuffer(@NotNull OnBufferPlayerControllerListener listener) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            this.onBufferPlayerControllerListener = listener;
            return this;
        }

        @NotNull
        public final Builder onError(@NotNull OnErrorPlayerControllerListener listener) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            this.onErrorPlayerControllerListener = listener;
            return this;
        }

        @NotNull
        public final Builder onFinish(@NotNull OnFinishPlayerControllerListener listener) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            this.onFinishPlayerControllerListener = listener;
            return this;
        }

        @NotNull
        public final Builder onMuteAudio(@NotNull OnMuteAudioPlayerControllerListener listener) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            this.onMuteAudioPlayerControllerListener = listener;
            return this;
        }

        @NotNull
        public final Builder onPause(@NotNull OnPausePlayerControllerListener listener) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            this.onPausePlayerControllerListener = listener;
            return this;
        }

        @NotNull
        public final Builder onReady(@NotNull OnReadyPlayerControllerListener listener) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            this.onReadyPlayerControllerListener = listener;
            return this;
        }

        @NotNull
        public final Builder onRenderedFirstFrame(@NotNull OnRenderedFirstFramePlayerControllerListener listener) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            this.onRenderedFirstFramePlayerControllerListener = listener;
            return this;
        }

        @NotNull
        public final Builder onStart(@NotNull OnStartPlayerControllerListener listener) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            this.onStartPlayerControllerListener = listener;
            return this;
        }

        @NotNull
        public final Builder onStop(@NotNull OnStopPlayerControllerListener listener) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            this.onStopPlayerControllerListener = listener;
            return this;
        }

        @NotNull
        public final Builder onUnMuteAudio(@NotNull OnUnMuteAudioPlayerControllerListener listener) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            this.onUnMuteAudioPlayerControllerListener = listener;
            return this;
        }

        @NotNull
        public final Builder onVideoSizeChanged(@NotNull OnVideoSizeChangedPlayerControllerListener listener) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            this.onVideoSizeChangedPlayerControllerListener = listener;
            return this;
        }
    }

    public /* synthetic */ PlayerListenersContainer(OnStartPlayerControllerListener onStartPlayerControllerListener, OnBufferPlayerControllerListener onBufferPlayerControllerListener, OnErrorPlayerControllerListener onErrorPlayerControllerListener, OnFinishPlayerControllerListener onFinishPlayerControllerListener, OnReadyPlayerControllerListener onReadyPlayerControllerListener, OnMuteAudioPlayerControllerListener onMuteAudioPlayerControllerListener, OnUnMuteAudioPlayerControllerListener onUnMuteAudioPlayerControllerListener, HasAudioPlayerControllerListener hasAudioPlayerControllerListener, OnStopPlayerControllerListener onStopPlayerControllerListener, OnPausePlayerControllerListener onPausePlayerControllerListener, OnRenderedFirstFramePlayerControllerListener onRenderedFirstFramePlayerControllerListener, OnVideoSizeChangedPlayerControllerListener onVideoSizeChangedPlayerControllerListener, DefaultConstructorMarker defaultConstructorMarker) {
        this(onStartPlayerControllerListener, onBufferPlayerControllerListener, onErrorPlayerControllerListener, onFinishPlayerControllerListener, onReadyPlayerControllerListener, onMuteAudioPlayerControllerListener, onUnMuteAudioPlayerControllerListener, hasAudioPlayerControllerListener, onStopPlayerControllerListener, onPausePlayerControllerListener, onRenderedFirstFramePlayerControllerListener, onVideoSizeChangedPlayerControllerListener);
    }

    public final void hasAudio(boolean hasAudio) {
        HasAudioPlayerControllerListener hasAudioPlayerControllerListener = this.hasAudioPlayerControllerListener;
        if (hasAudioPlayerControllerListener != null) {
            hasAudioPlayerControllerListener.hasAudio(hasAudio);
        }
    }

    public final void onBuffer() {
        OnBufferPlayerControllerListener onBufferPlayerControllerListener = this.onBufferPlayerControllerListener;
        if (onBufferPlayerControllerListener != null) {
            onBufferPlayerControllerListener.onBuffer();
        }
    }

    public final void onError(@NotNull String message, Exception error, Boolean isPlaybackStateReady) {
        Intrinsics.checkNotNullParameter(message, "message");
        OnErrorPlayerControllerListener onErrorPlayerControllerListener = this.onErrorPlayerControllerListener;
        if (onErrorPlayerControllerListener != null) {
            onErrorPlayerControllerListener.onError(message, error, isPlaybackStateReady);
        }
    }

    public final void onFinish() {
        OnFinishPlayerControllerListener onFinishPlayerControllerListener = this.onFinishPlayerControllerListener;
        if (onFinishPlayerControllerListener != null) {
            onFinishPlayerControllerListener.onFinish();
        }
    }

    public final void onPause() {
        OnPausePlayerControllerListener onPausePlayerControllerListener = this.onPausePlayerControllerListener;
        if (onPausePlayerControllerListener != null) {
            onPausePlayerControllerListener.onPause();
        }
    }

    public final void onReady(@NotNull PlayerState playerState) {
        Intrinsics.checkNotNullParameter(playerState, "playerState");
        OnReadyPlayerControllerListener onReadyPlayerControllerListener = this.onReadyPlayerControllerListener;
        if (onReadyPlayerControllerListener != null) {
            onReadyPlayerControllerListener.onReady(playerState);
        }
    }

    public final void onRenderedFirstFrame() {
        OnRenderedFirstFramePlayerControllerListener onRenderedFirstFramePlayerControllerListener = this.onRenderedFirstFramePlayerControllerListener;
        if (onRenderedFirstFramePlayerControllerListener != null) {
            onRenderedFirstFramePlayerControllerListener.onRenderedFirstFrame();
        }
    }

    public final void onStart(@NotNull PlayerState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        OnStartPlayerControllerListener onStartPlayerControllerListener = this.onStartPlayerControllerListener;
        if (onStartPlayerControllerListener != null) {
            onStartPlayerControllerListener.onStart(state);
        }
    }

    public final void onStop() {
        OnStopPlayerControllerListener onStopPlayerControllerListener = this.onStopPlayerControllerListener;
        if (onStopPlayerControllerListener != null) {
            onStopPlayerControllerListener.onStop();
        }
    }

    public final void onVideoSizeChanged(@NotNull Q videoSize) {
        Intrinsics.checkNotNullParameter(videoSize, "videoSize");
        OnVideoSizeChangedPlayerControllerListener onVideoSizeChangedPlayerControllerListener = this.onVideoSizeChangedPlayerControllerListener;
        if (onVideoSizeChangedPlayerControllerListener != null) {
            onVideoSizeChangedPlayerControllerListener.onVideoSizeChanged(videoSize);
        }
    }

    private PlayerListenersContainer(OnStartPlayerControllerListener onStartPlayerControllerListener, OnBufferPlayerControllerListener onBufferPlayerControllerListener, OnErrorPlayerControllerListener onErrorPlayerControllerListener, OnFinishPlayerControllerListener onFinishPlayerControllerListener, OnReadyPlayerControllerListener onReadyPlayerControllerListener, OnMuteAudioPlayerControllerListener onMuteAudioPlayerControllerListener, OnUnMuteAudioPlayerControllerListener onUnMuteAudioPlayerControllerListener, HasAudioPlayerControllerListener hasAudioPlayerControllerListener, OnStopPlayerControllerListener onStopPlayerControllerListener, OnPausePlayerControllerListener onPausePlayerControllerListener, OnRenderedFirstFramePlayerControllerListener onRenderedFirstFramePlayerControllerListener, OnVideoSizeChangedPlayerControllerListener onVideoSizeChangedPlayerControllerListener) {
        this.onStartPlayerControllerListener = onStartPlayerControllerListener;
        this.onBufferPlayerControllerListener = onBufferPlayerControllerListener;
        this.onErrorPlayerControllerListener = onErrorPlayerControllerListener;
        this.onFinishPlayerControllerListener = onFinishPlayerControllerListener;
        this.onReadyPlayerControllerListener = onReadyPlayerControllerListener;
        this.onMuteAudioPlayerControllerListener = onMuteAudioPlayerControllerListener;
        this.onUnMuteAudioPlayerControllerListener = onUnMuteAudioPlayerControllerListener;
        this.hasAudioPlayerControllerListener = hasAudioPlayerControllerListener;
        this.onStopPlayerControllerListener = onStopPlayerControllerListener;
        this.onPausePlayerControllerListener = onPausePlayerControllerListener;
        this.onRenderedFirstFramePlayerControllerListener = onRenderedFirstFramePlayerControllerListener;
        this.onVideoSizeChangedPlayerControllerListener = onVideoSizeChangedPlayerControllerListener;
    }
}
