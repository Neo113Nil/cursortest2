package ru.ozon.app.android.video.playerV2.performance.playback.events;

import B0.A0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import u3.InterfaceC9928b;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/video/playerV2/performance/playback/events/PlaybackEvent;", "", "<init>", "()V", "OnPlayerReleased", "PlayingEvent", "ResumePauseEvent", "OnStateChangedEvent", "MediaItemTransitionEvent", "LoadStatusEvent", "Lru/ozon/app/android/video/playerV2/performance/playback/events/PlaybackEvent$LoadStatusEvent;", "Lru/ozon/app/android/video/playerV2/performance/playback/events/PlaybackEvent$MediaItemTransitionEvent;", "Lru/ozon/app/android/video/playerV2/performance/playback/events/PlaybackEvent$OnPlayerReleased;", "Lru/ozon/app/android/video/playerV2/performance/playback/events/PlaybackEvent$OnStateChangedEvent;", "Lru/ozon/app/android/video/playerV2/performance/playback/events/PlaybackEvent$PlayingEvent;", "Lru/ozon/app/android/video/playerV2/performance/playback/events/PlaybackEvent$ResumePauseEvent;", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class PlaybackEvent {

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\b\tB\u0019\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0001\u0002\n\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/video/playerV2/performance/playback/events/PlaybackEvent$LoadStatusEvent;", "Lru/ozon/app/android/video/playerV2/performance/playback/events/PlaybackEvent;", "", "loadUrl", "Lu3/b$a;", "eventTime", "<init>", "(Ljava/lang/String;Lu3/b$a;)V", "OnLoadStarted", "OnLoadCanceled", "Lru/ozon/app/android/video/playerV2/performance/playback/events/PlaybackEvent$LoadStatusEvent$OnLoadCanceled;", "Lru/ozon/app/android/video/playerV2/performance/playback/events/PlaybackEvent$LoadStatusEvent$OnLoadStarted;", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class LoadStatusEvent extends PlaybackEvent {

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/video/playerV2/performance/playback/events/PlaybackEvent$LoadStatusEvent$OnLoadCanceled;", "Lru/ozon/app/android/video/playerV2/performance/playback/events/PlaybackEvent$LoadStatusEvent;", "", "loadUrl", "Lu3/b$a;", "eventTime", "<init>", "(Ljava/lang/String;Lu3/b$a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getLoadUrl", "Lu3/b$a;", "getEventTime", "()Lu3/b$a;", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class OnLoadCanceled extends LoadStatusEvent {

            @NotNull
            private final InterfaceC9928b.a eventTime;

            @NotNull
            private final String loadUrl;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnLoadCanceled(@NotNull String loadUrl, @NotNull InterfaceC9928b.a eventTime) {
                super(loadUrl, eventTime, null);
                Intrinsics.checkNotNullParameter(loadUrl, "loadUrl");
                Intrinsics.checkNotNullParameter(eventTime, "eventTime");
                this.loadUrl = loadUrl;
                this.eventTime = eventTime;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof OnLoadCanceled)) {
                    return false;
                }
                OnLoadCanceled onLoadCanceled = (OnLoadCanceled) other;
                return Intrinsics.d(this.loadUrl, onLoadCanceled.loadUrl) && Intrinsics.d(this.eventTime, onLoadCanceled.eventTime);
            }

            @NotNull
            public final InterfaceC9928b.a getEventTime() {
                return this.eventTime;
            }

            @NotNull
            public final String getLoadUrl() {
                return this.loadUrl;
            }

            public int hashCode() {
                return this.eventTime.hashCode() + (this.loadUrl.hashCode() * 31);
            }

            @NotNull
            public String toString() {
                return "OnLoadCanceled(loadUrl=" + this.loadUrl + ", eventTime=" + this.eventTime + ")";
            }
        }

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/video/playerV2/performance/playback/events/PlaybackEvent$LoadStatusEvent$OnLoadStarted;", "Lru/ozon/app/android/video/playerV2/performance/playback/events/PlaybackEvent$LoadStatusEvent;", "", "loadUrl", "Lu3/b$a;", "eventTime", "<init>", "(Ljava/lang/String;Lu3/b$a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getLoadUrl", "Lu3/b$a;", "getEventTime", "()Lu3/b$a;", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class OnLoadStarted extends LoadStatusEvent {

            @NotNull
            private final InterfaceC9928b.a eventTime;

            @NotNull
            private final String loadUrl;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnLoadStarted(@NotNull String loadUrl, @NotNull InterfaceC9928b.a eventTime) {
                super(loadUrl, eventTime, null);
                Intrinsics.checkNotNullParameter(loadUrl, "loadUrl");
                Intrinsics.checkNotNullParameter(eventTime, "eventTime");
                this.loadUrl = loadUrl;
                this.eventTime = eventTime;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof OnLoadStarted)) {
                    return false;
                }
                OnLoadStarted onLoadStarted = (OnLoadStarted) other;
                return Intrinsics.d(this.loadUrl, onLoadStarted.loadUrl) && Intrinsics.d(this.eventTime, onLoadStarted.eventTime);
            }

            @NotNull
            public final InterfaceC9928b.a getEventTime() {
                return this.eventTime;
            }

            @NotNull
            public final String getLoadUrl() {
                return this.loadUrl;
            }

            public int hashCode() {
                return this.eventTime.hashCode() + (this.loadUrl.hashCode() * 31);
            }

            @NotNull
            public String toString() {
                return "OnLoadStarted(loadUrl=" + this.loadUrl + ", eventTime=" + this.eventTime + ")";
            }
        }

        public /* synthetic */ LoadStatusEvent(String str, InterfaceC9928b.a aVar, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, aVar);
        }

        private LoadStatusEvent(String str, InterfaceC9928b.a aVar) {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0007\bB\u0015\b\u0004\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\t\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/video/playerV2/performance/playback/events/PlaybackEvent$MediaItemTransitionEvent;", "Lru/ozon/app/android/video/playerV2/performance/playback/events/PlaybackEvent;", "newVideoUrl", "", "Lru/ozon/app/android/video/player/performance/metricsManager/VideoUrl;", "<init>", "(Ljava/lang/String;)V", "OnPlaylistChanged", "Other", "Lru/ozon/app/android/video/playerV2/performance/playback/events/PlaybackEvent$MediaItemTransitionEvent$OnPlaylistChanged;", "Lru/ozon/app/android/video/playerV2/performance/playback/events/PlaybackEvent$MediaItemTransitionEvent$Other;", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class MediaItemTransitionEvent extends PlaybackEvent {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0012\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/video/playerV2/performance/playback/events/PlaybackEvent$MediaItemTransitionEvent$OnPlaylistChanged;", "Lru/ozon/app/android/video/playerV2/performance/playback/events/PlaybackEvent$MediaItemTransitionEvent;", "", "Lru/ozon/app/android/video/player/performance/metricsManager/VideoUrl;", "newVideoUrl", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getNewVideoUrl", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class OnPlaylistChanged extends MediaItemTransitionEvent {

            @NotNull
            private final String newVideoUrl;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnPlaylistChanged(@NotNull String newVideoUrl) {
                super(newVideoUrl, null);
                Intrinsics.checkNotNullParameter(newVideoUrl, "newVideoUrl");
                this.newVideoUrl = newVideoUrl;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof OnPlaylistChanged) && Intrinsics.d(this.newVideoUrl, ((OnPlaylistChanged) other).newVideoUrl);
            }

            @NotNull
            public final String getNewVideoUrl() {
                return this.newVideoUrl;
            }

            public int hashCode() {
                return this.newVideoUrl.hashCode();
            }

            @NotNull
            public String toString() {
                return A0.b("OnPlaylistChanged(newVideoUrl=", this.newVideoUrl, ")");
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0012\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/video/playerV2/performance/playback/events/PlaybackEvent$MediaItemTransitionEvent$Other;", "Lru/ozon/app/android/video/playerV2/performance/playback/events/PlaybackEvent$MediaItemTransitionEvent;", "", "Lru/ozon/app/android/video/player/performance/metricsManager/VideoUrl;", "newVideoUrl", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getNewVideoUrl", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Other extends MediaItemTransitionEvent {

            @NotNull
            private final String newVideoUrl;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Other(@NotNull String newVideoUrl) {
                super(newVideoUrl, null);
                Intrinsics.checkNotNullParameter(newVideoUrl, "newVideoUrl");
                this.newVideoUrl = newVideoUrl;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Other) && Intrinsics.d(this.newVideoUrl, ((Other) other).newVideoUrl);
            }

            public int hashCode() {
                return this.newVideoUrl.hashCode();
            }

            @NotNull
            public String toString() {
                return A0.b("Other(newVideoUrl=", this.newVideoUrl, ")");
            }
        }

        public /* synthetic */ MediaItemTransitionEvent(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        private MediaItemTransitionEvent(String str) {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/video/playerV2/performance/playback/events/PlaybackEvent$OnPlayerReleased;", "Lru/ozon/app/android/video/playerV2/performance/playback/events/PlaybackEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnPlayerReleased extends PlaybackEvent {

        @NotNull
        public static final OnPlayerReleased INSTANCE = new OnPlayerReleased();

        private OnPlayerReleased() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof OnPlayerReleased);
        }

        public int hashCode() {
            return 1173544997;
        }

        @NotNull
        public String toString() {
            return "OnPlayerReleased";
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0006\u0007\bB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0003\t\n\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/video/playerV2/performance/playback/events/PlaybackEvent$OnStateChangedEvent;", "Lru/ozon/app/android/video/playerV2/performance/playback/events/PlaybackEvent;", "Lu3/b$a;", "eventTime", "<init>", "(Lu3/b$a;)V", "IdleState", "BufferingState", "ReadyState", "Lru/ozon/app/android/video/playerV2/performance/playback/events/PlaybackEvent$OnStateChangedEvent$BufferingState;", "Lru/ozon/app/android/video/playerV2/performance/playback/events/PlaybackEvent$OnStateChangedEvent$IdleState;", "Lru/ozon/app/android/video/playerV2/performance/playback/events/PlaybackEvent$OnStateChangedEvent$ReadyState;", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class OnStateChangedEvent extends PlaybackEvent {

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/video/playerV2/performance/playback/events/PlaybackEvent$OnStateChangedEvent$BufferingState;", "Lru/ozon/app/android/video/playerV2/performance/playback/events/PlaybackEvent$OnStateChangedEvent;", "Lu3/b$a;", "eventTime", "<init>", "(Lu3/b$a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lu3/b$a;", "getEventTime", "()Lu3/b$a;", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class BufferingState extends OnStateChangedEvent {

            @NotNull
            private final InterfaceC9928b.a eventTime;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public BufferingState(@NotNull InterfaceC9928b.a eventTime) {
                super(eventTime, null);
                Intrinsics.checkNotNullParameter(eventTime, "eventTime");
                this.eventTime = eventTime;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof BufferingState) && Intrinsics.d(this.eventTime, ((BufferingState) other).eventTime);
            }

            public int hashCode() {
                return this.eventTime.hashCode();
            }

            @NotNull
            public String toString() {
                return "BufferingState(eventTime=" + this.eventTime + ")";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/video/playerV2/performance/playback/events/PlaybackEvent$OnStateChangedEvent$IdleState;", "Lru/ozon/app/android/video/playerV2/performance/playback/events/PlaybackEvent$OnStateChangedEvent;", "Lu3/b$a;", "eventTime", "<init>", "(Lu3/b$a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lu3/b$a;", "getEventTime", "()Lu3/b$a;", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class IdleState extends OnStateChangedEvent {

            @NotNull
            private final InterfaceC9928b.a eventTime;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public IdleState(@NotNull InterfaceC9928b.a eventTime) {
                super(eventTime, null);
                Intrinsics.checkNotNullParameter(eventTime, "eventTime");
                this.eventTime = eventTime;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof IdleState) && Intrinsics.d(this.eventTime, ((IdleState) other).eventTime);
            }

            public int hashCode() {
                return this.eventTime.hashCode();
            }

            @NotNull
            public String toString() {
                return "IdleState(eventTime=" + this.eventTime + ")";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/video/playerV2/performance/playback/events/PlaybackEvent$OnStateChangedEvent$ReadyState;", "Lru/ozon/app/android/video/playerV2/performance/playback/events/PlaybackEvent$OnStateChangedEvent;", "Lu3/b$a;", "eventTime", "<init>", "(Lu3/b$a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lu3/b$a;", "getEventTime", "()Lu3/b$a;", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ReadyState extends OnStateChangedEvent {

            @NotNull
            private final InterfaceC9928b.a eventTime;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ReadyState(@NotNull InterfaceC9928b.a eventTime) {
                super(eventTime, null);
                Intrinsics.checkNotNullParameter(eventTime, "eventTime");
                this.eventTime = eventTime;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ReadyState) && Intrinsics.d(this.eventTime, ((ReadyState) other).eventTime);
            }

            public int hashCode() {
                return this.eventTime.hashCode();
            }

            @NotNull
            public String toString() {
                return "ReadyState(eventTime=" + this.eventTime + ")";
            }
        }

        public /* synthetic */ OnStateChangedEvent(InterfaceC9928b.a aVar, DefaultConstructorMarker defaultConstructorMarker) {
            this(aVar);
        }

        private OnStateChangedEvent(InterfaceC9928b.a aVar) {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0006\u0007B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\b\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/video/playerV2/performance/playback/events/PlaybackEvent$PlayingEvent;", "Lru/ozon/app/android/video/playerV2/performance/playback/events/PlaybackEvent;", "Lu3/b$a;", "eventTime", "<init>", "(Lu3/b$a;)V", "OnStartPlaying", "OnStopPlaying", "Lru/ozon/app/android/video/playerV2/performance/playback/events/PlaybackEvent$PlayingEvent$OnStartPlaying;", "Lru/ozon/app/android/video/playerV2/performance/playback/events/PlaybackEvent$PlayingEvent$OnStopPlaying;", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class PlayingEvent extends PlaybackEvent {

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/video/playerV2/performance/playback/events/PlaybackEvent$PlayingEvent$OnStartPlaying;", "Lru/ozon/app/android/video/playerV2/performance/playback/events/PlaybackEvent$PlayingEvent;", "Lu3/b$a;", "eventTime", "<init>", "(Lu3/b$a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lu3/b$a;", "getEventTime", "()Lu3/b$a;", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class OnStartPlaying extends PlayingEvent {

            @NotNull
            private final InterfaceC9928b.a eventTime;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnStartPlaying(@NotNull InterfaceC9928b.a eventTime) {
                super(eventTime, null);
                Intrinsics.checkNotNullParameter(eventTime, "eventTime");
                this.eventTime = eventTime;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof OnStartPlaying) && Intrinsics.d(this.eventTime, ((OnStartPlaying) other).eventTime);
            }

            @NotNull
            public final InterfaceC9928b.a getEventTime() {
                return this.eventTime;
            }

            public int hashCode() {
                return this.eventTime.hashCode();
            }

            @NotNull
            public String toString() {
                return "OnStartPlaying(eventTime=" + this.eventTime + ")";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/video/playerV2/performance/playback/events/PlaybackEvent$PlayingEvent$OnStopPlaying;", "Lru/ozon/app/android/video/playerV2/performance/playback/events/PlaybackEvent$PlayingEvent;", "Lu3/b$a;", "eventTime", "<init>", "(Lu3/b$a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lu3/b$a;", "getEventTime", "()Lu3/b$a;", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class OnStopPlaying extends PlayingEvent {

            @NotNull
            private final InterfaceC9928b.a eventTime;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnStopPlaying(@NotNull InterfaceC9928b.a eventTime) {
                super(eventTime, null);
                Intrinsics.checkNotNullParameter(eventTime, "eventTime");
                this.eventTime = eventTime;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof OnStopPlaying) && Intrinsics.d(this.eventTime, ((OnStopPlaying) other).eventTime);
            }

            public int hashCode() {
                return this.eventTime.hashCode();
            }

            @NotNull
            public String toString() {
                return "OnStopPlaying(eventTime=" + this.eventTime + ")";
            }
        }

        public /* synthetic */ PlayingEvent(InterfaceC9928b.a aVar, DefaultConstructorMarker defaultConstructorMarker) {
            this(aVar);
        }

        private PlayingEvent(InterfaceC9928b.a aVar) {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/video/playerV2/performance/playback/events/PlaybackEvent$ResumePauseEvent;", "Lru/ozon/app/android/video/playerV2/performance/playback/events/PlaybackEvent;", "<init>", "()V", "OnPause", "OnResume", "Lru/ozon/app/android/video/playerV2/performance/playback/events/PlaybackEvent$ResumePauseEvent$OnPause;", "Lru/ozon/app/android/video/playerV2/performance/playback/events/PlaybackEvent$ResumePauseEvent$OnResume;", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class ResumePauseEvent extends PlaybackEvent {

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/video/playerV2/performance/playback/events/PlaybackEvent$ResumePauseEvent$OnPause;", "Lru/ozon/app/android/video/playerV2/performance/playback/events/PlaybackEvent$ResumePauseEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class OnPause extends ResumePauseEvent {

            @NotNull
            public static final OnPause INSTANCE = new OnPause();

            private OnPause() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof OnPause);
            }

            public int hashCode() {
                return -651779646;
            }

            @NotNull
            public String toString() {
                return "OnPause";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/video/playerV2/performance/playback/events/PlaybackEvent$ResumePauseEvent$OnResume;", "Lru/ozon/app/android/video/playerV2/performance/playback/events/PlaybackEvent$ResumePauseEvent;", "Lu3/b$a;", "eventTime", "<init>", "(Lu3/b$a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lu3/b$a;", "getEventTime", "()Lu3/b$a;", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class OnResume extends ResumePauseEvent {

            @NotNull
            private final InterfaceC9928b.a eventTime;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnResume(@NotNull InterfaceC9928b.a eventTime) {
                super(null);
                Intrinsics.checkNotNullParameter(eventTime, "eventTime");
                this.eventTime = eventTime;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof OnResume) && Intrinsics.d(this.eventTime, ((OnResume) other).eventTime);
            }

            @NotNull
            public final InterfaceC9928b.a getEventTime() {
                return this.eventTime;
            }

            public int hashCode() {
                return this.eventTime.hashCode();
            }

            @NotNull
            public String toString() {
                return "OnResume(eventTime=" + this.eventTime + ")";
            }
        }

        public /* synthetic */ ResumePauseEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ResumePauseEvent() {
            super(null);
        }
    }

    public /* synthetic */ PlaybackEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private PlaybackEvent() {
    }
}
