package ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation;

import B0.C2454a;
import Kk.C3532b;
import Pk0.f;
import WZ.d;
import WZ.g;
import WZ.l;
import WZ.t;
import Xc.b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import dV.c;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.U;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.tracker.model.TrinityEventEntityKt;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 72\u00020\u0001:\u0003789BY\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u001a\u0010\b\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00050\u0004\u0012\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0004\u0012\u000e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J-\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00062\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u0015\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J5\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u0006\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ7\u0010\u001f\u001a\u00020\u000f*\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0013\u001a\u00020\u00062\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\u0005H\u0002¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010#\u001a\u00020\u000f2\b\u0010\u0019\u001a\u0004\u0018\u00010\t2\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020\u000f¢\u0006\u0004\b%\u0010\u0011J\u0015\u0010&\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\t¢\u0006\u0004\b&\u0010'J\r\u0010(\u001a\u00020\u000f¢\u0006\u0004\b(\u0010\u0011J\r\u0010)\u001a\u00020\u000f¢\u0006\u0004\b)\u0010\u0011J\r\u0010*\u001a\u00020\u000f¢\u0006\u0004\b*\u0010\u0011J\r\u0010+\u001a\u00020\u000f¢\u0006\u0004\b+\u0010\u0011J\r\u0010,\u001a\u00020\u000f¢\u0006\u0004\b,\u0010\u0011J\r\u0010-\u001a\u00020\u000f¢\u0006\u0004\b-\u0010\u0011J\r\u0010.\u001a\u00020\u000f¢\u0006\u0004\b.\u0010\u0011J\r\u0010/\u001a\u00020\u000f¢\u0006\u0004\b/\u0010\u0011J\r\u00100\u001a\u00020\u000f¢\u0006\u0004\b0\u0010\u0011J\r\u00101\u001a\u00020\u000f¢\u0006\u0004\b1\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00102R(\u0010\b\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00103R\u001c\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00103R\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00103R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u00103R\u0016\u00105\u001a\u0002048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106¨\u0006:"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/VideoEventDelegate;", "", "LWZ/l;", "tokenizedAnalytics", "Lkotlin/Function0;", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "getTrackingInfo", "", "getVideoId", "getVideoDuration", "getViewTimeMs", "<init>", "(LWZ/l;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "", "ensureSessionStarted", "()V", "finishSession", TrinityEventEntityKt.ACTION_TYPE_JSON_NAME, "duration", "viewTimeMs", "sendEvent", "(Ljava/lang/String;Ljava/lang/Long;J)V", "trackingInfo", "videoId", "LWZ/t;", "createEvent", "(Ljava/util/Map;JLjava/lang/String;)LWZ/t;", "event", "params", "processVideoEvent", "(LWZ/l;LWZ/t;Ljava/lang/String;Ljava/util/Map;)V", "", "position", "bind", "(Ljava/lang/Long;I)V", "reset", "onPlayerReady", "(J)V", "onPlayerStart", "onPlayerPause", "onPlayerStop", "markPendingReturnFromScreen", "onBottomSheetShown", "onBottomSheetDismissed", "onItemChanged", "onDetach", "logAutoscroll", "logNextIfManualSwipe", "LWZ/l;", "Lkotlin/jvm/functions/Function0;", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/VideoEventDelegate$VideoSessionState;", "videoSessionState", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/VideoEventDelegate$VideoSessionState;", "Companion", "PlaybackState", "VideoSessionState", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class VideoEventDelegate {
    private static Long lastNavigatedFromVideoId;

    @NotNull
    private final Function0<Map<String, TokenizedTrackingInfo>> getTrackingInfo;

    @NotNull
    private final Function0<Long> getVideoDuration;

    @NotNull
    private final Function0<Long> getVideoId;

    @NotNull
    private final Function0<Long> getViewTimeMs;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private VideoSessionState videoSessionState;
    public static final int $stable = 8;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/VideoEventDelegate$PlaybackState;", "", "<init>", "(Ljava/lang/String;I)V", "IDLE", "PLAYING", "PAUSED", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class PlaybackState {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ PlaybackState[] $VALUES;
        public static final PlaybackState IDLE = new PlaybackState("IDLE", 0);
        public static final PlaybackState PLAYING = new PlaybackState("PLAYING", 1);
        public static final PlaybackState PAUSED = new PlaybackState("PAUSED", 2);

        private static final /* synthetic */ PlaybackState[] $values() {
            return new PlaybackState[]{IDLE, PLAYING, PAUSED};
        }

        static {
            PlaybackState[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private PlaybackState(String str, int i11) {
        }

        public static PlaybackState valueOf(String str) {
            return (PlaybackState) Enum.valueOf(PlaybackState.class, str);
        }

        public static PlaybackState[] values() {
            return (PlaybackState[]) $VALUES.clone();
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0017\b\u0082\b\u0018\u00002\u00020\u0001BY\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fJb\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\"\u001a\u0004\b%\u0010$R\u0017\u0010\u000b\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\"\u001a\u0004\b&\u0010$R\u0017\u0010\f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\f\u0010\"\u001a\u0004\b'\u0010$R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\r\u0010\"\u001a\u0004\b(\u0010$¨\u0006)"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/VideoEventDelegate$VideoSessionState;", "", "", "currentVideoId", "", "currentPosition", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/VideoEventDelegate$PlaybackState;", "playbackState", "", "sessionActive", "videoViewSent", "pendingAutoscroll", "pendingContinueFromScreen", "pendingContinueFromSheet", "<init>", "(Ljava/lang/Long;ILru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/VideoEventDelegate$PlaybackState;ZZZZZ)V", "copy", "(Ljava/lang/Long;ILru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/VideoEventDelegate$PlaybackState;ZZZZZ)Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/VideoEventDelegate$VideoSessionState;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Long;", "getCurrentVideoId", "()Ljava/lang/Long;", "I", "getCurrentPosition", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/VideoEventDelegate$PlaybackState;", "getPlaybackState", "()Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/VideoEventDelegate$PlaybackState;", "Z", "getSessionActive", "()Z", "getVideoViewSent", "getPendingAutoscroll", "getPendingContinueFromScreen", "getPendingContinueFromSheet", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final /* data */ class VideoSessionState {
        private final int currentPosition;
        private final Long currentVideoId;
        private final boolean pendingAutoscroll;
        private final boolean pendingContinueFromScreen;
        private final boolean pendingContinueFromSheet;

        @NotNull
        private final PlaybackState playbackState;
        private final boolean sessionActive;
        private final boolean videoViewSent;

        public VideoSessionState() {
            this(null, 0, null, false, false, false, false, false, 255, null);
        }

        public static /* synthetic */ VideoSessionState copy$default(VideoSessionState videoSessionState, Long l11, int i11, PlaybackState playbackState, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                l11 = videoSessionState.currentVideoId;
            }
            if ((i12 & 2) != 0) {
                i11 = videoSessionState.currentPosition;
            }
            if ((i12 & 4) != 0) {
                playbackState = videoSessionState.playbackState;
            }
            if ((i12 & 8) != 0) {
                z11 = videoSessionState.sessionActive;
            }
            if ((i12 & 16) != 0) {
                z12 = videoSessionState.videoViewSent;
            }
            if ((i12 & 32) != 0) {
                z13 = videoSessionState.pendingAutoscroll;
            }
            if ((i12 & 64) != 0) {
                z14 = videoSessionState.pendingContinueFromScreen;
            }
            if ((i12 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                z15 = videoSessionState.pendingContinueFromSheet;
            }
            boolean z16 = z14;
            boolean z17 = z15;
            boolean z18 = z12;
            boolean z19 = z13;
            return videoSessionState.copy(l11, i11, playbackState, z11, z18, z19, z16, z17);
        }

        @NotNull
        public final VideoSessionState copy(Long currentVideoId, int currentPosition, @NotNull PlaybackState playbackState, boolean sessionActive, boolean videoViewSent, boolean pendingAutoscroll, boolean pendingContinueFromScreen, boolean pendingContinueFromSheet) {
            Intrinsics.checkNotNullParameter(playbackState, "playbackState");
            return new VideoSessionState(currentVideoId, currentPosition, playbackState, sessionActive, videoViewSent, pendingAutoscroll, pendingContinueFromScreen, pendingContinueFromSheet);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof VideoSessionState)) {
                return false;
            }
            VideoSessionState videoSessionState = (VideoSessionState) other;
            return Intrinsics.d(this.currentVideoId, videoSessionState.currentVideoId) && this.currentPosition == videoSessionState.currentPosition && this.playbackState == videoSessionState.playbackState && this.sessionActive == videoSessionState.sessionActive && this.videoViewSent == videoSessionState.videoViewSent && this.pendingAutoscroll == videoSessionState.pendingAutoscroll && this.pendingContinueFromScreen == videoSessionState.pendingContinueFromScreen && this.pendingContinueFromSheet == videoSessionState.pendingContinueFromSheet;
        }

        public final Long getCurrentVideoId() {
            return this.currentVideoId;
        }

        public final boolean getPendingAutoscroll() {
            return this.pendingAutoscroll;
        }

        public final boolean getPendingContinueFromScreen() {
            return this.pendingContinueFromScreen;
        }

        public final boolean getPendingContinueFromSheet() {
            return this.pendingContinueFromSheet;
        }

        @NotNull
        public final PlaybackState getPlaybackState() {
            return this.playbackState;
        }

        public final boolean getSessionActive() {
            return this.sessionActive;
        }

        public final boolean getVideoViewSent() {
            return this.videoViewSent;
        }

        public int hashCode() {
            Long l11 = this.currentVideoId;
            return Boolean.hashCode(this.pendingContinueFromSheet) + C3532b.a(C3532b.a(C3532b.a(C3532b.a((this.playbackState.hashCode() + C2454a.a(this.currentPosition, (l11 == null ? 0 : l11.hashCode()) * 31, 31)) * 31, 31, this.sessionActive), 31, this.videoViewSent), 31, this.pendingAutoscroll), 31, this.pendingContinueFromScreen);
        }

        @NotNull
        public String toString() {
            Long l11 = this.currentVideoId;
            int i11 = this.currentPosition;
            PlaybackState playbackState = this.playbackState;
            boolean z11 = this.sessionActive;
            boolean z12 = this.videoViewSent;
            boolean z13 = this.pendingAutoscroll;
            boolean z14 = this.pendingContinueFromScreen;
            boolean z15 = this.pendingContinueFromSheet;
            StringBuilder sb2 = new StringBuilder("VideoSessionState(currentVideoId=");
            sb2.append(l11);
            sb2.append(", currentPosition=");
            sb2.append(i11);
            sb2.append(", playbackState=");
            sb2.append(playbackState);
            sb2.append(", sessionActive=");
            sb2.append(z11);
            sb2.append(", videoViewSent=");
            f.c(", pendingAutoscroll=", ", pendingContinueFromScreen=", sb2, z12, z13);
            sb2.append(z14);
            sb2.append(", pendingContinueFromSheet=");
            sb2.append(z15);
            sb2.append(")");
            return sb2.toString();
        }

        public VideoSessionState(Long l11, int i11, @NotNull PlaybackState playbackState, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
            Intrinsics.checkNotNullParameter(playbackState, "playbackState");
            this.currentVideoId = l11;
            this.currentPosition = i11;
            this.playbackState = playbackState;
            this.sessionActive = z11;
            this.videoViewSent = z12;
            this.pendingAutoscroll = z13;
            this.pendingContinueFromScreen = z14;
            this.pendingContinueFromSheet = z15;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ VideoSessionState(java.lang.Long r2, int r3, ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.VideoEventDelegate.PlaybackState r4, boolean r5, boolean r6, boolean r7, boolean r8, boolean r9, int r10, kotlin.jvm.internal.DefaultConstructorMarker r11) {
            /*
                r1 = this;
                r11 = r10 & 1
                if (r11 == 0) goto L5
                r2 = 0
            L5:
                r11 = r10 & 2
                if (r11 == 0) goto La
                r3 = -1
            La:
                r11 = r10 & 4
                if (r11 == 0) goto L10
                ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.VideoEventDelegate$PlaybackState r4 = ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.VideoEventDelegate.PlaybackState.IDLE
            L10:
                r11 = r10 & 8
                r0 = 0
                if (r11 == 0) goto L16
                r5 = r0
            L16:
                r11 = r10 & 16
                if (r11 == 0) goto L1b
                r6 = r0
            L1b:
                r11 = r10 & 32
                if (r11 == 0) goto L20
                r7 = r0
            L20:
                r11 = r10 & 64
                if (r11 == 0) goto L25
                r8 = r0
            L25:
                r10 = r10 & 128(0x80, float:1.8E-43)
                if (r10 == 0) goto L33
                r11 = r0
                r9 = r7
                r10 = r8
                r7 = r5
                r8 = r6
                r5 = r3
                r6 = r4
                r3 = r1
                r4 = r2
                goto L3c
            L33:
                r11 = r9
                r10 = r8
                r8 = r6
                r9 = r7
                r6 = r4
                r7 = r5
                r4 = r2
                r5 = r3
                r3 = r1
            L3c:
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.VideoEventDelegate.VideoSessionState.<init>(java.lang.Long, int, ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.VideoEventDelegate$PlaybackState, boolean, boolean, boolean, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VideoEventDelegate(@NotNull l tokenizedAnalytics, @NotNull Function0<? extends Map<String, TokenizedTrackingInfo>> getTrackingInfo, @NotNull Function0<Long> getVideoId, @NotNull Function0<Long> getVideoDuration, @NotNull Function0<Long> getViewTimeMs) {
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(getTrackingInfo, "getTrackingInfo");
        Intrinsics.checkNotNullParameter(getVideoId, "getVideoId");
        Intrinsics.checkNotNullParameter(getVideoDuration, "getVideoDuration");
        Intrinsics.checkNotNullParameter(getViewTimeMs, "getViewTimeMs");
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.getTrackingInfo = getTrackingInfo;
        this.getVideoId = getVideoId;
        this.getVideoDuration = getVideoDuration;
        this.getViewTimeMs = getViewTimeMs;
        this.videoSessionState = new VideoSessionState(null, 0, null, false, false, false, false, false, 255, null);
    }

    private final t createEvent(Map<String, TokenizedTrackingInfo> trackingInfo, long videoId, String actionType) {
        TokenizedTrackingInfo tokenizedTrackingInfo = trackingInfo.get("video_view");
        if (tokenizedTrackingInfo == null) {
            return null;
        }
        if (Intrinsics.d(actionType, "video_view")) {
            return TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(videoId), null, 2, null);
        }
        TokenizedTrackingInfo.a aVar = new TokenizedTrackingInfo.a(tokenizedTrackingInfo);
        aVar.b(actionType);
        return TrackingInfoMapperKt.toTokenizedEvent$default(U.n(trackingInfo, new Pair(actionType, aVar.a())), Long.valueOf(videoId), null, 2, null);
    }

    private final void ensureSessionStarted() {
        if (this.videoSessionState.getSessionActive()) {
            return;
        }
        this.videoSessionState = VideoSessionState.copy$default(this.videoSessionState, null, 0, null, true, false, false, false, false, 231, null);
    }

    private final void finishSession() {
        if (this.videoSessionState.getSessionActive()) {
            sendEvent$default(this, "video_view_finish", null, this.getViewTimeMs.invoke().longValue(), 2, null);
            this.videoSessionState = VideoSessionState.copy$default(this.videoSessionState, null, 0, null, false, false, false, false, false, 231, null);
        }
    }

    private final void processVideoEvent(l lVar, t tVar, String str, Map<String, Long> map) {
        lVar.f(tVar, new d(new VideoEventDelegate$processVideoEvent$1(str)), new c(map, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g processVideoEvent$lambda$1(Map map, UZ.a aVar, g customParams) {
        Intrinsics.checkNotNullParameter(aVar, "<unused var>");
        Intrinsics.checkNotNullParameter(customParams, "customParams");
        return g.a(customParams, map, null, 2);
    }

    private final void sendEvent(String actionType, Long duration, long viewTimeMs) {
        Long invoke;
        t createEvent;
        if (duration == null && (duration = this.getVideoDuration.invoke()) == null) {
            return;
        }
        long longValue = duration.longValue();
        Map<String, TokenizedTrackingInfo> invoke2 = this.getTrackingInfo.invoke();
        if (invoke2 == null || (invoke = this.getVideoId.invoke()) == null || (createEvent = createEvent(invoke2, invoke.longValue(), actionType)) == null) {
            return;
        }
        processVideoEvent(this.tokenizedAnalytics, createEvent, actionType, U.j(new Pair("videoDuration", Long.valueOf(longValue)), new Pair("videoFinishAt", Long.valueOf(viewTimeMs))));
    }

    static /* synthetic */ void sendEvent$default(VideoEventDelegate videoEventDelegate, String str, Long l11, long j11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            l11 = null;
        }
        if ((i11 & 4) != 0) {
            j11 = 0;
        }
        videoEventDelegate.sendEvent(str, l11, j11);
    }

    public final void bind(Long videoId, int position) {
        VideoSessionState copy$default = VideoSessionState.copy$default(this.videoSessionState, videoId, position, null, false, false, false, videoId != null && Intrinsics.d(lastNavigatedFromVideoId, videoId), false, 188, null);
        this.videoSessionState = copy$default;
        if (copy$default.getPendingContinueFromScreen()) {
            lastNavigatedFromVideoId = null;
        }
    }

    public final void logAutoscroll() {
        this.videoSessionState = VideoSessionState.copy$default(this.videoSessionState, null, 0, null, false, false, true, false, false, 223, null);
        sendEvent$default(this, "autoscroll", null, 0L, 6, null);
    }

    public final void logNextIfManualSwipe() {
        if (this.videoSessionState.getPendingAutoscroll()) {
            this.videoSessionState = VideoSessionState.copy$default(this.videoSessionState, null, 0, null, false, false, false, false, false, 223, null);
        } else {
            sendEvent$default(this, "next", null, 0L, 6, null);
        }
    }

    public final void markPendingReturnFromScreen() {
        lastNavigatedFromVideoId = this.videoSessionState.getCurrentVideoId();
    }

    public final void onBottomSheetDismissed() {
        this.videoSessionState = VideoSessionState.copy$default(this.videoSessionState, null, 0, null, false, false, false, false, true, 127, null);
    }

    public final void onBottomSheetShown() {
        finishSession();
        this.videoSessionState = VideoSessionState.copy$default(this.videoSessionState, null, 0, null, false, false, false, false, true, 127, null);
    }

    public final void onDetach() {
        finishSession();
    }

    public final void onItemChanged() {
        finishSession();
        this.videoSessionState = VideoSessionState.copy$default(this.videoSessionState, null, 0, PlaybackState.IDLE, false, false, false, false, false, 251, null);
    }

    public final void onPlayerPause() {
        boolean z11 = this.videoSessionState.getPlaybackState() == PlaybackState.PLAYING;
        this.videoSessionState = VideoSessionState.copy$default(this.videoSessionState, null, 0, PlaybackState.PAUSED, false, false, false, false, false, 251, null);
        ensureSessionStarted();
        if (z11) {
            sendEvent$default(this, "pause", null, this.getViewTimeMs.invoke().longValue(), 2, null);
        }
    }

    public final void onPlayerReady(long duration) {
        ensureSessionStarted();
        if (this.videoSessionState.getPendingContinueFromScreen()) {
            this.videoSessionState = VideoSessionState.copy$default(this.videoSessionState, null, 0, null, false, false, false, false, false, 191, null);
            sendEvent$default(this, "continue", Long.valueOf(duration), 0L, 4, null);
        } else {
            if (this.videoSessionState.getVideoViewSent()) {
                return;
            }
            this.videoSessionState = VideoSessionState.copy$default(this.videoSessionState, null, 0, null, false, true, false, false, false, 239, null);
            sendEvent$default(this, "video_view", Long.valueOf(duration), 0L, 4, null);
        }
    }

    public final void onPlayerStart() {
        Long invoke;
        boolean z11 = this.videoSessionState.getPlaybackState() == PlaybackState.PAUSED;
        this.videoSessionState = VideoSessionState.copy$default(this.videoSessionState, null, 0, PlaybackState.PLAYING, false, false, false, false, false, 251, null);
        ensureSessionStarted();
        if (this.videoSessionState.getPendingContinueFromSheet()) {
            this.videoSessionState = VideoSessionState.copy$default(this.videoSessionState, null, 0, null, false, false, false, false, false, 127, null);
            sendEvent$default(this, "continue", null, 0L, 6, null);
        } else if (z11) {
            sendEvent$default(this, "continue", null, 0L, 6, null);
        } else {
            if (this.videoSessionState.getVideoViewSent() || (invoke = this.getVideoDuration.invoke()) == null) {
                return;
            }
            this.videoSessionState = VideoSessionState.copy$default(this.videoSessionState, null, 0, null, false, true, false, false, false, 239, null);
            sendEvent$default(this, "video_view", invoke, 0L, 4, null);
        }
    }

    public final void onPlayerStop() {
        this.videoSessionState = VideoSessionState.copy$default(this.videoSessionState, null, 0, PlaybackState.IDLE, false, false, false, false, false, 251, null);
    }

    public final void reset() {
        this.videoSessionState = new VideoSessionState(null, 0, null, false, false, false, false, false, 255, null);
    }
}
