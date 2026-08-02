package ru.ozon.app.android.video.player;

import B0.A0;
import D40.a;
import Gg0.d;
import Gg0.f;
import Sc.o;
import V.e;
import android.webkit.URLUtil;
import androidx.media3.ui.PlayerView;
import j3.w;
import j3.y;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.extensions.ViewExtKt;
import ru.ozon.app.android.video.manager.Cacheable;
import ru.ozon.app.android.video.manager.ExoManager;
import ru.ozon.app.android.video.player.VideoPlaceholderTimeTracker;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001:\u0002()B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u000e*\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\n¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010!R\u0016\u0010#\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010%R\u0018\u0010&\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006*"}, d2 = {"Lru/ozon/app/android/video/player/VideoPlaceholderTimeTracker;", "", "LGg0/f;", "placeholderTimeHandler", "Lj3/y;", "player", "<init>", "(LGg0/f;Lj3/y;)V", "Lru/ozon/app/android/video/player/VideoPlaceholderTimeTracker$FinishTrackingReason;", "reason", "", "finishTracking", "(Lru/ozon/app/android/video/player/VideoPlaceholderTimeTracker$FinishTrackingReason;)V", "Lru/ozon/app/android/video/player/CacheObserver;", "", "wasLastPlaybackChunkLoadedFromNetwork", "(Lru/ozon/app/android/video/player/CacheObserver;)Z", "", "videoUrl", "Lru/ozon/app/android/video/manager/ExoManager;", "exoManager", "onVideoLoadingStarted", "(Ljava/lang/String;Lru/ozon/app/android/video/manager/ExoManager;)V", "Landroidx/media3/ui/PlayerView;", "playerView", "onPlayerViewBound", "(Landroidx/media3/ui/PlayerView;)V", "onPlayerViewUnbound", "()V", "", "throwable", "onPlayerError", "(Ljava/lang/Throwable;)V", "LGg0/f;", "Lru/ozon/app/android/video/player/VideoPlaceholderTimeTracker$State;", "state", "Lru/ozon/app/android/video/player/VideoPlaceholderTimeTracker$State;", "Landroidx/media3/ui/PlayerView;", "cacheObserver", "Lru/ozon/app/android/video/player/CacheObserver;", "State", "FinishTrackingReason", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class VideoPlaceholderTimeTracker {
    private CacheObserver cacheObserver;

    @NotNull
    private final f placeholderTimeHandler;
    private PlayerView playerView;

    @NotNull
    private State state;

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\br\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/video/player/VideoPlaceholderTimeTracker$FinishTrackingReason;", "", "FirstFrame", "Error", "Lru/ozon/app/android/video/player/VideoPlaceholderTimeTracker$FinishTrackingReason$Error;", "Lru/ozon/app/android/video/player/VideoPlaceholderTimeTracker$FinishTrackingReason$FirstFrame;", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    interface FinishTrackingReason {

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/video/player/VideoPlaceholderTimeTracker$FinishTrackingReason$Error;", "Lru/ozon/app/android/video/player/VideoPlaceholderTimeTracker$FinishTrackingReason;", "", "throwable", "<init>", "(Ljava/lang/Throwable;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Throwable;", "getThrowable", "()Ljava/lang/Throwable;", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Error implements FinishTrackingReason {

            @NotNull
            private final Throwable throwable;

            public Error(@NotNull Throwable throwable) {
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                this.throwable = throwable;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Error) && Intrinsics.d(this.throwable, ((Error) other).throwable);
            }

            @NotNull
            public final Throwable getThrowable() {
                return this.throwable;
            }

            public int hashCode() {
                return this.throwable.hashCode();
            }

            @NotNull
            public String toString() {
                return a.c("Error(throwable=", ")", this.throwable);
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/video/player/VideoPlaceholderTimeTracker$FinishTrackingReason$FirstFrame;", "Lru/ozon/app/android/video/player/VideoPlaceholderTimeTracker$FinishTrackingReason;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class FirstFrame implements FinishTrackingReason {

            @NotNull
            public static final FirstFrame INSTANCE = new FirstFrame();

            private FirstFrame() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof FirstFrame);
            }

            public int hashCode() {
                return -1137249331;
            }

            @NotNull
            public String toString() {
                return "FirstFrame";
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\br\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/video/player/VideoPlaceholderTimeTracker$State;", "", "WaitingForStart", "WaitingForFinish", "Lru/ozon/app/android/video/player/VideoPlaceholderTimeTracker$State$WaitingForFinish;", "Lru/ozon/app/android/video/player/VideoPlaceholderTimeTracker$State$WaitingForStart;", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private interface State {

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0013\u0010\b¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/video/player/VideoPlaceholderTimeTracker$State$WaitingForFinish;", "Lru/ozon/app/android/video/player/VideoPlaceholderTimeTracker$State;", "", "videoUrl", "requestId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getVideoUrl", "getRequestId", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class WaitingForFinish implements State {

            @NotNull
            private final String requestId;

            @NotNull
            private final String videoUrl;

            public WaitingForFinish(@NotNull String videoUrl, @NotNull String requestId) {
                Intrinsics.checkNotNullParameter(videoUrl, "videoUrl");
                Intrinsics.checkNotNullParameter(requestId, "requestId");
                this.videoUrl = videoUrl;
                this.requestId = requestId;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof WaitingForFinish)) {
                    return false;
                }
                WaitingForFinish waitingForFinish = (WaitingForFinish) other;
                return Intrinsics.d(this.videoUrl, waitingForFinish.videoUrl) && Intrinsics.d(this.requestId, waitingForFinish.requestId);
            }

            @NotNull
            public final String getRequestId() {
                return this.requestId;
            }

            @NotNull
            public final String getVideoUrl() {
                return this.videoUrl;
            }

            public int hashCode() {
                return this.requestId.hashCode() + (this.videoUrl.hashCode() * 31);
            }

            @NotNull
            public String toString() {
                return e.a("WaitingForFinish(videoUrl=", this.videoUrl, ", requestId=", this.requestId, ")");
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/video/player/VideoPlaceholderTimeTracker$State$WaitingForStart;", "Lru/ozon/app/android/video/player/VideoPlaceholderTimeTracker$State;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class WaitingForStart implements State {

            @NotNull
            public static final WaitingForStart INSTANCE = new WaitingForStart();

            private WaitingForStart() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof WaitingForStart);
            }

            public int hashCode() {
                return -1747168391;
            }

            @NotNull
            public String toString() {
                return "WaitingForStart";
            }
        }
    }

    public VideoPlaceholderTimeTracker(@NotNull f placeholderTimeHandler, @NotNull y player) {
        Intrinsics.checkNotNullParameter(placeholderTimeHandler, "placeholderTimeHandler");
        Intrinsics.checkNotNullParameter(player, "player");
        this.placeholderTimeHandler = placeholderTimeHandler;
        this.state = State.WaitingForStart.INSTANCE;
        player.t(new y.c() { // from class: ru.ozon.app.android.video.player.VideoPlaceholderTimeTracker$playerListener$1
            @Override // j3.y.c
            public void onPlayerError(w error) {
                Intrinsics.checkNotNullParameter(error, "error");
                VideoPlaceholderTimeTracker.this.onPlayerError(error);
            }

            @Override // j3.y.c
            public void onRenderedFirstFrame() {
                VideoPlaceholderTimeTracker.this.finishTracking(VideoPlaceholderTimeTracker.FinishTrackingReason.FirstFrame.INSTANCE);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void finishTracking(FinishTrackingReason reason) {
        State state = this.state;
        if (state instanceof State.WaitingForFinish) {
            PlayerView playerView = this.playerView;
            if (playerView == null) {
                Lm0.a.f17149a.w(A0.b("Video placeholder time won't be tracked because PlayerView has been unbound before first frame was rendered (url: ", ((State.WaitingForFinish) state).getVideoUrl(), ")."), new Object[0]);
                return;
            }
            CacheObserver cacheObserver = this.cacheObserver;
            if (cacheObserver != null) {
                cacheObserver.onVideoLoadingFinished();
            }
            if (reason instanceof FinishTrackingReason.Error) {
                f fVar = this.placeholderTimeHandler;
                State.WaitingForFinish waitingForFinish = (State.WaitingForFinish) state;
                d dVar = new d(Boolean.valueOf(wasLastPlaybackChunkLoadedFromNetwork(this.cacheObserver)), waitingForFinish.getVideoUrl());
                String requestId = waitingForFinish.getRequestId();
                ((FinishTrackingReason.Error) reason).getThrowable();
                fVar.d(playerView, dVar, requestId);
            } else {
                if (!Intrinsics.d(reason, FinishTrackingReason.FirstFrame.INSTANCE)) {
                    throw new o();
                }
                State.WaitingForFinish waitingForFinish2 = (State.WaitingForFinish) state;
                this.placeholderTimeHandler.b(playerView, new d(Boolean.valueOf(wasLastPlaybackChunkLoadedFromNetwork(this.cacheObserver)), waitingForFinish2.getVideoUrl()), waitingForFinish2.getRequestId());
            }
            this.state = State.WaitingForStart.INSTANCE;
        }
    }

    private final boolean wasLastPlaybackChunkLoadedFromNetwork(CacheObserver cacheObserver) {
        if (cacheObserver == null) {
            return true;
        }
        return Intrinsics.d(cacheObserver.wasLastPlaybackChunkLoadedFromCache(), Boolean.FALSE);
    }

    public final void onPlayerError(@NotNull Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        finishTracking(new FinishTrackingReason.Error(throwable));
    }

    public final void onPlayerViewBound(@NotNull PlayerView playerView) {
        Intrinsics.checkNotNullParameter(playerView, "playerView");
        this.playerView = playerView;
    }

    public final void onPlayerViewUnbound() {
        this.playerView = null;
    }

    public final void onVideoLoadingStarted(@NotNull String videoUrl, @NotNull ExoManager exoManager) {
        CacheObserver cacheObserver;
        Intrinsics.checkNotNullParameter(videoUrl, "videoUrl");
        Intrinsics.checkNotNullParameter(exoManager, "exoManager");
        if (this.state instanceof State.WaitingForStart) {
            PlayerView playerView = this.playerView;
            if (playerView == null) {
                Lm0.a.f17149a.w(A0.b("Video placeholder time won't be tracked because PlayerView hasn't been bound (url: ", videoUrl, ")."), new Object[0]);
                return;
            }
            if (URLUtil.isNetworkUrl(videoUrl)) {
                ViewExtKt.trackPlaceholderVisibility(playerView);
                String uuid = UUID.randomUUID().toString();
                Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
                State.WaitingForFinish waitingForFinish = new State.WaitingForFinish(videoUrl, uuid);
                if (exoManager instanceof Cacheable) {
                    cacheObserver = ((Cacheable) exoManager).getCacheObserver();
                    cacheObserver.onVideoLoadingStarted();
                } else {
                    cacheObserver = null;
                }
                this.cacheObserver = cacheObserver;
                this.placeholderTimeHandler.a(playerView, uuid);
                this.state = waitingForFinish;
            }
        }
    }
}
