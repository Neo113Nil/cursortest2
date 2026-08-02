package ru.ozon.app.android.video.playerV2.performance.placeholder;

import B0.A0;
import Cg0.b;
import D40.a;
import Gg0.d;
import Gg0.f;
import Sc.o;
import V.e;
import android.webkit.URLUtil;
import j3.w;
import j3.y;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.Pikazon;
import ru.ozon.app.android.pikazon.placeholdertracker.PlaceholderInfo;
import ru.ozon.app.android.pikazon.placeholdertracker.PlaceholderTime;
import ru.ozon.app.android.pikazon.placeholdertracker.PlaceholderTrackingInfo;
import ru.ozon.app.android.video.manager.Cacheable;
import ru.ozon.app.android.video.manager.ExoManager;
import ru.ozon.app.android.video.player.CacheObserver;
import ru.ozon.app.android.video.playerV2.performance.placeholder.VideoComposablePlaceholderTimeTracker;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001:\u0003,-.B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u000e*\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J%\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00112\u000e\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0018¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\n¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010!\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010#R\u0016\u0010%\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010(\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010*\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006/"}, d2 = {"Lru/ozon/app/android/video/playerV2/performance/placeholder/VideoComposablePlaceholderTimeTracker;", "", "LGg0/f;", "placeholderTimeHandler", "Lj3/y;", "player", "<init>", "(LGg0/f;Lj3/y;)V", "Lru/ozon/app/android/video/playerV2/performance/placeholder/VideoComposablePlaceholderTimeTracker$FinishTrackingReason;", "reason", "", "finishTracking", "(Lru/ozon/app/android/video/playerV2/performance/placeholder/VideoComposablePlaceholderTimeTracker$FinishTrackingReason;)V", "Lru/ozon/app/android/video/player/CacheObserver;", "", "wasLastPlaybackChunkLoadedFromNetwork", "(Lru/ozon/app/android/video/player/CacheObserver;)Z", "", "videoUrl", "Lru/ozon/app/android/video/manager/ExoManager;", "exoManager", "onVideoLoadingStarted", "(Ljava/lang/String;Lru/ozon/app/android/video/manager/ExoManager;)V", "placeholderTrackingName", "Lkotlin/Function0;", "Lru/ozon/app/android/pikazon/placeholdertracker/PlaceholderInfo;", "placeholderInfoCallback", "bindPlaceholderData", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "unbindPlaceholderData", "()V", "", "throwable", "onPlayerError", "(Ljava/lang/Throwable;)V", "LGg0/f;", "Lru/ozon/app/android/video/playerV2/performance/placeholder/VideoComposablePlaceholderTimeTracker$State;", "state", "Lru/ozon/app/android/video/playerV2/performance/placeholder/VideoComposablePlaceholderTimeTracker$State;", "Lru/ozon/app/android/video/playerV2/performance/placeholder/VideoComposablePlaceholderTimeTracker$PlaceholderData;", "placeholderData", "Lru/ozon/app/android/video/playerV2/performance/placeholder/VideoComposablePlaceholderTimeTracker$PlaceholderData;", "cacheObserver", "Lru/ozon/app/android/video/player/CacheObserver;", "State", "FinishTrackingReason", "PlaceholderData", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class VideoComposablePlaceholderTimeTracker {
    private CacheObserver cacheObserver;
    private PlaceholderData placeholderData;

    @NotNull
    private final f placeholderTimeHandler;

    @NotNull
    private State state;

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\br\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/video/playerV2/performance/placeholder/VideoComposablePlaceholderTimeTracker$FinishTrackingReason;", "", "FirstFrame", "Error", "Lru/ozon/app/android/video/playerV2/performance/placeholder/VideoComposablePlaceholderTimeTracker$FinishTrackingReason$Error;", "Lru/ozon/app/android/video/playerV2/performance/placeholder/VideoComposablePlaceholderTimeTracker$FinishTrackingReason$FirstFrame;", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    interface FinishTrackingReason {

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/video/playerV2/performance/placeholder/VideoComposablePlaceholderTimeTracker$FinishTrackingReason$Error;", "Lru/ozon/app/android/video/playerV2/performance/placeholder/VideoComposablePlaceholderTimeTracker$FinishTrackingReason;", "", "throwable", "<init>", "(Ljava/lang/Throwable;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Throwable;", "getThrowable", "()Ljava/lang/Throwable;", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        /* loaded from: classes2.dex */
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

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/video/playerV2/performance/placeholder/VideoComposablePlaceholderTimeTracker$FinishTrackingReason$FirstFrame;", "Lru/ozon/app/android/video/playerV2/performance/placeholder/VideoComposablePlaceholderTimeTracker$FinishTrackingReason;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class FirstFrame implements FinishTrackingReason {

            @NotNull
            public static final FirstFrame INSTANCE = new FirstFrame();

            private FirstFrame() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof FirstFrame);
            }

            public int hashCode() {
                return 793321885;
            }

            @NotNull
            public String toString() {
                return "FirstFrame";
            }
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000f0\u000eJ\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u000f*\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/video/playerV2/performance/placeholder/VideoComposablePlaceholderTimeTracker$PlaceholderData;", "", "placeholderTrackingName", "", "placeholderInfoCallback", "Lkotlin/Function0;", "Lru/ozon/app/android/pikazon/placeholdertracker/PlaceholderInfo;", "<init>", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "lastPlaceholderTimeValue", "", "wasPlaceholderDataRead", "", "getTrackingNameAndTime", "Lkotlin/Pair;", "Lru/ozon/app/android/pikazon/placeholdertracker/PlaceholderTime;", "storeLastPlaceholderTimeValue", "", "timeOrDefault", "timeOrDefault-ZAKvG8I", "(Lru/ozon/app/android/pikazon/placeholdertracker/PlaceholderInfo;)J", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes2.dex */
    private static final class PlaceholderData {
        private long lastPlaceholderTimeValue;

        @NotNull
        private final Function0<PlaceholderInfo> placeholderInfoCallback;

        @NotNull
        private final String placeholderTrackingName;
        private boolean wasPlaceholderDataRead;

        public PlaceholderData(@NotNull String placeholderTrackingName, @NotNull Function0<PlaceholderInfo> placeholderInfoCallback) {
            Intrinsics.checkNotNullParameter(placeholderTrackingName, "placeholderTrackingName");
            Intrinsics.checkNotNullParameter(placeholderInfoCallback, "placeholderInfoCallback");
            this.placeholderTrackingName = placeholderTrackingName;
            this.placeholderInfoCallback = placeholderInfoCallback;
            this.lastPlaceholderTimeValue = -1L;
        }

        @NotNull
        public final Pair<String, PlaceholderTime> getTrackingNameAndTime() {
            Pair<String, PlaceholderTime> pair = this.lastPlaceholderTimeValue < 0 ? new Pair<>(this.placeholderTrackingName, PlaceholderTime.m901boximpl(m1541timeOrDefaultZAKvG8I(this.placeholderInfoCallback.invoke()))) : new Pair<>(this.placeholderTrackingName, PlaceholderTime.m901boximpl(PlaceholderTime.m902constructorimpl(Math.max(m1541timeOrDefaultZAKvG8I(this.placeholderInfoCallback.invoke()) - this.lastPlaceholderTimeValue, 0L))));
            this.wasPlaceholderDataRead = true;
            return pair;
        }

        public final void storeLastPlaceholderTimeValue() {
            if (this.wasPlaceholderDataRead) {
                this.lastPlaceholderTimeValue = m1541timeOrDefaultZAKvG8I(this.placeholderInfoCallback.invoke());
            }
        }

        /* renamed from: timeOrDefault-ZAKvG8I, reason: not valid java name */
        public final long m1541timeOrDefaultZAKvG8I(PlaceholderInfo placeholderInfo) {
            return placeholderInfo != null ? b.a(placeholderInfo) : PlaceholderTime.m902constructorimpl(0L);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\br\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/video/playerV2/performance/placeholder/VideoComposablePlaceholderTimeTracker$State;", "", "WaitingForStart", "WaitingForFinish", "Lru/ozon/app/android/video/playerV2/performance/placeholder/VideoComposablePlaceholderTimeTracker$State$WaitingForFinish;", "Lru/ozon/app/android/video/playerV2/performance/placeholder/VideoComposablePlaceholderTimeTracker$State$WaitingForStart;", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private interface State {

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0013\u0010\b¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/video/playerV2/performance/placeholder/VideoComposablePlaceholderTimeTracker$State$WaitingForFinish;", "Lru/ozon/app/android/video/playerV2/performance/placeholder/VideoComposablePlaceholderTimeTracker$State;", "", "videoUrl", "requestId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getVideoUrl", "getRequestId", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0014B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/video/playerV2/performance/placeholder/VideoComposablePlaceholderTimeTracker$State$WaitingForStart;", "Lru/ozon/app/android/video/playerV2/performance/placeholder/VideoComposablePlaceholderTimeTracker$State;", "Lru/ozon/app/android/video/playerV2/performance/placeholder/VideoComposablePlaceholderTimeTracker$State$WaitingForStart$LoadInfo;", "loadInfo", "<init>", "(Lru/ozon/app/android/video/playerV2/performance/placeholder/VideoComposablePlaceholderTimeTracker$State$WaitingForStart$LoadInfo;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/video/playerV2/performance/placeholder/VideoComposablePlaceholderTimeTracker$State$WaitingForStart$LoadInfo;", "getLoadInfo", "()Lru/ozon/app/android/video/playerV2/performance/placeholder/VideoComposablePlaceholderTimeTracker$State$WaitingForStart$LoadInfo;", "LoadInfo", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class WaitingForStart implements State {

            @NotNull
            private final LoadInfo loadInfo;

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/video/playerV2/performance/placeholder/VideoComposablePlaceholderTimeTracker$State$WaitingForStart$LoadInfo;", "", "Empty", "Loading", "Lru/ozon/app/android/video/playerV2/performance/placeholder/VideoComposablePlaceholderTimeTracker$State$WaitingForStart$LoadInfo$Empty;", "Lru/ozon/app/android/video/playerV2/performance/placeholder/VideoComposablePlaceholderTimeTracker$State$WaitingForStart$LoadInfo$Loading;", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public interface LoadInfo {

                @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/video/playerV2/performance/placeholder/VideoComposablePlaceholderTimeTracker$State$WaitingForStart$LoadInfo$Empty;", "Lru/ozon/app/android/video/playerV2/performance/placeholder/VideoComposablePlaceholderTimeTracker$State$WaitingForStart$LoadInfo;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
                public static final /* data */ class Empty implements LoadInfo {

                    @NotNull
                    public static final Empty INSTANCE = new Empty();

                    private Empty() {
                    }

                    public boolean equals(Object other) {
                        return this == other || (other instanceof Empty);
                    }

                    public int hashCode() {
                        return -1462474536;
                    }

                    @NotNull
                    public String toString() {
                        return "Empty";
                    }
                }

                @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/video/playerV2/performance/placeholder/VideoComposablePlaceholderTimeTracker$State$WaitingForStart$LoadInfo$Loading;", "Lru/ozon/app/android/video/playerV2/performance/placeholder/VideoComposablePlaceholderTimeTracker$State$WaitingForStart$LoadInfo;", "", "videoUrl", "Lru/ozon/app/android/video/manager/ExoManager;", "exoManager", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/video/manager/ExoManager;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getVideoUrl", "Lru/ozon/app/android/video/manager/ExoManager;", "getExoManager", "()Lru/ozon/app/android/video/manager/ExoManager;", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
                public static final /* data */ class Loading implements LoadInfo {

                    @NotNull
                    private final ExoManager exoManager;

                    @NotNull
                    private final String videoUrl;

                    public Loading(@NotNull String videoUrl, @NotNull ExoManager exoManager) {
                        Intrinsics.checkNotNullParameter(videoUrl, "videoUrl");
                        Intrinsics.checkNotNullParameter(exoManager, "exoManager");
                        this.videoUrl = videoUrl;
                        this.exoManager = exoManager;
                    }

                    public boolean equals(Object other) {
                        if (this == other) {
                            return true;
                        }
                        if (!(other instanceof Loading)) {
                            return false;
                        }
                        Loading loading = (Loading) other;
                        return Intrinsics.d(this.videoUrl, loading.videoUrl) && Intrinsics.d(this.exoManager, loading.exoManager);
                    }

                    @NotNull
                    public final ExoManager getExoManager() {
                        return this.exoManager;
                    }

                    @NotNull
                    public final String getVideoUrl() {
                        return this.videoUrl;
                    }

                    public int hashCode() {
                        return this.exoManager.hashCode() + (this.videoUrl.hashCode() * 31);
                    }

                    @NotNull
                    public String toString() {
                        return "Loading(videoUrl=" + this.videoUrl + ", exoManager=" + this.exoManager + ")";
                    }
                }
            }

            public WaitingForStart(@NotNull LoadInfo loadInfo) {
                Intrinsics.checkNotNullParameter(loadInfo, "loadInfo");
                this.loadInfo = loadInfo;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof WaitingForStart) && Intrinsics.d(this.loadInfo, ((WaitingForStart) other).loadInfo);
            }

            @NotNull
            public final LoadInfo getLoadInfo() {
                return this.loadInfo;
            }

            public int hashCode() {
                return this.loadInfo.hashCode();
            }

            @NotNull
            public String toString() {
                return "WaitingForStart(loadInfo=" + this.loadInfo + ")";
            }
        }
    }

    public VideoComposablePlaceholderTimeTracker(@NotNull f placeholderTimeHandler, @NotNull y player) {
        Intrinsics.checkNotNullParameter(placeholderTimeHandler, "placeholderTimeHandler");
        Intrinsics.checkNotNullParameter(player, "player");
        this.placeholderTimeHandler = placeholderTimeHandler;
        this.state = new State.WaitingForStart(State.WaitingForStart.LoadInfo.Empty.INSTANCE);
        player.t(new y.c() { // from class: ru.ozon.app.android.video.playerV2.performance.placeholder.VideoComposablePlaceholderTimeTracker$playerListener$1
            @Override // j3.y.c
            public void onPlayerError(w error) {
                Intrinsics.checkNotNullParameter(error, "error");
                VideoComposablePlaceholderTimeTracker.this.onPlayerError(error);
            }

            @Override // j3.y.c
            public void onRenderedFirstFrame() {
                VideoComposablePlaceholderTimeTracker.this.finishTracking(VideoComposablePlaceholderTimeTracker.FinishTrackingReason.FirstFrame.INSTANCE);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void finishTracking(FinishTrackingReason reason) {
        State state = this.state;
        if (state instanceof State.WaitingForFinish) {
            PlaceholderData placeholderData = this.placeholderData;
            if (placeholderData == null) {
                Lm0.a.f17149a.w(A0.b("Video placeholder time won't be tracked because placeholderData has been unbound before first frame was rendered (url: ", ((State.WaitingForFinish) state).getVideoUrl(), ")."), new Object[0]);
                return;
            }
            CacheObserver cacheObserver = this.cacheObserver;
            if (cacheObserver != null) {
                cacheObserver.onVideoLoadingFinished();
            }
            Pair<String, PlaceholderTime> trackingNameAndTime = placeholderData.getTrackingNameAndTime();
            State.WaitingForFinish waitingForFinish = (State.WaitingForFinish) state;
            Pikazon.INSTANCE.getInstance().getPlaceholderTracker().storePlaceholderTrackingInfo(waitingForFinish.getRequestId(), new PlaceholderTrackingInfo(trackingNameAndTime.a(), trackingNameAndTime.b().getValue(), null));
            if (reason instanceof FinishTrackingReason.Error) {
                f fVar = this.placeholderTimeHandler;
                d dVar = new d(Boolean.valueOf(wasLastPlaybackChunkLoadedFromNetwork(this.cacheObserver)), waitingForFinish.getVideoUrl());
                String requestId = waitingForFinish.getRequestId();
                ((FinishTrackingReason.Error) reason).getThrowable();
                fVar.d(null, dVar, requestId);
            } else {
                if (!Intrinsics.d(reason, FinishTrackingReason.FirstFrame.INSTANCE)) {
                    throw new o();
                }
                this.placeholderTimeHandler.b(null, new d(Boolean.valueOf(wasLastPlaybackChunkLoadedFromNetwork(this.cacheObserver)), waitingForFinish.getVideoUrl()), waitingForFinish.getRequestId());
            }
            this.state = new State.WaitingForStart(State.WaitingForStart.LoadInfo.Empty.INSTANCE);
        }
    }

    private final boolean wasLastPlaybackChunkLoadedFromNetwork(CacheObserver cacheObserver) {
        if (cacheObserver == null) {
            return true;
        }
        return Intrinsics.d(cacheObserver.wasLastPlaybackChunkLoadedFromCache(), Boolean.FALSE);
    }

    public final void bindPlaceholderData(@NotNull String placeholderTrackingName, @NotNull Function0<PlaceholderInfo> placeholderInfoCallback) {
        Intrinsics.checkNotNullParameter(placeholderTrackingName, "placeholderTrackingName");
        Intrinsics.checkNotNullParameter(placeholderInfoCallback, "placeholderInfoCallback");
        this.placeholderData = new PlaceholderData(placeholderTrackingName, placeholderInfoCallback);
        State state = this.state;
        State.WaitingForStart waitingForStart = state instanceof State.WaitingForStart ? (State.WaitingForStart) state : null;
        if (waitingForStart != null && (waitingForStart.getLoadInfo() instanceof State.WaitingForStart.LoadInfo.Loading)) {
            onVideoLoadingStarted(((State.WaitingForStart.LoadInfo.Loading) waitingForStart.getLoadInfo()).getVideoUrl(), ((State.WaitingForStart.LoadInfo.Loading) waitingForStart.getLoadInfo()).getExoManager());
        }
    }

    public final void onPlayerError(@NotNull Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        finishTracking(new FinishTrackingReason.Error(throwable));
    }

    public final void onVideoLoadingStarted(@NotNull String videoUrl, @NotNull ExoManager exoManager) {
        CacheObserver cacheObserver;
        Intrinsics.checkNotNullParameter(videoUrl, "videoUrl");
        Intrinsics.checkNotNullParameter(exoManager, "exoManager");
        if (this.state instanceof State.WaitingForStart) {
            if (this.placeholderData == null) {
                Lm0.a.f17149a.w(A0.b("Video placeholder time won't be tracked because placeholderData hasn't been bound (url: ", videoUrl, ")."), new Object[0]);
                this.state = new State.WaitingForStart(new State.WaitingForStart.LoadInfo.Loading(videoUrl, exoManager));
                return;
            }
            if (URLUtil.isNetworkUrl(videoUrl)) {
                State.WaitingForFinish waitingForFinish = new State.WaitingForFinish(videoUrl, P4.f.b("toString(...)"));
                if (exoManager instanceof Cacheable) {
                    cacheObserver = ((Cacheable) exoManager).getCacheObserver();
                    cacheObserver.onVideoLoadingStarted();
                } else {
                    cacheObserver = null;
                }
                this.cacheObserver = cacheObserver;
                PlaceholderData placeholderData = this.placeholderData;
                if (placeholderData != null) {
                    placeholderData.storeLastPlaceholderTimeValue();
                }
                this.state = waitingForFinish;
            }
        }
    }

    public final void unbindPlaceholderData() {
        this.placeholderData = null;
    }
}
