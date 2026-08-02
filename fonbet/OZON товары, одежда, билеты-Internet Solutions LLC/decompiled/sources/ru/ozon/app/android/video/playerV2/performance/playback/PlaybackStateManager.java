package ru.ozon.app.android.video.playerV2.performance.playback;

import B90.C2618u;
import Sc.InterfaceC4008j;
import Sc.o;
import Sg.a;
import com.google.android.gms.common.internal.ImagesContract;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.video.player.logs.PlayerLogger;
import ru.ozon.app.android.video.player.performance.metricsManager.VideoAsset;
import ru.ozon.app.android.video.player.performance.metricsManager.VideoPerfMetricAction;
import ru.ozon.app.android.video.player.performance.metricsManager.VideoPerfMetricsManager;
import ru.ozon.app.android.video.player.performance.metricsManager.VideoPerfMetricsManagerHelper;
import ru.ozon.app.android.video.playerV2.performance.playback.events.ErrorEvent;
import ru.ozon.app.android.video.playerV2.performance.playback.events.ErrorEventKt;
import ru.ozon.app.android.video.playerV2.performance.playback.events.PlaybackEvent;
import ru.ozon.app.android.video.playerV2.performance.playback.events.VideoInfoUpdateEvent;
import ru.ozon.app.android.video.playerV2.performance.playback.metricsHolder.PlaybackMetricsHolder;
import ru.ozon.app.android.video.playerV2.performance.playback.metricsHolder.TypedLoadTimeMetrics;
import ru.ozon.app.android.video.playerV2.performance.playback.playbackData.PlaybackData;
import ru.ozon.app.android.video.playerV2.performance.playback.playbackData.PlaybackStatsData;
import ru.ozon.app.android.video.playerV2.performance.playback.playbackData.PlaybackStatsDataKt;
import ru.ozon.app.android.video.playerV2.utils.VideoModuleExtKt;

@Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001KB\u0091\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u000e\u0012\u000e\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u000e\u0012\u000e\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u000e\u0012\u000e\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u000e¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJM\u0010(\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u00142\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u00172\b\u0010$\u001a\u0004\u0018\u00010#2\b\u0010%\u001a\u0004\u0018\u00010\u00142\b\u0010'\u001a\u0004\u0018\u00010&2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b(\u0010)JM\u0010+\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u00142\u0006\u0010!\u001a\u00020*2\u0006\u0010\"\u001a\u00020\u00172\b\u0010$\u001a\u0004\u0018\u00010#2\b\u0010%\u001a\u0004\u0018\u00010\u00142\b\u0010'\u001a\u0004\u0018\u00010&2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b+\u0010,J1\u0010/\u001a\u00020\u00122\u000e\u0010.\u001a\n\u0018\u00010\u0014j\u0004\u0018\u0001`-2\b\u0010%\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b/\u00100J\u0011\u00102\u001a\u0004\u0018\u000101H\u0002¢\u0006\u0004\b2\u00103J\u0015\u00106\u001a\u00020\u00122\u0006\u00105\u001a\u000204¢\u0006\u0004\b6\u00107J\u0015\u00106\u001a\u00020\u00122\u0006\u00105\u001a\u000208¢\u0006\u0004\b6\u00109J\u0015\u00106\u001a\u00020\u00122\u0006\u00105\u001a\u00020:¢\u0006\u0004\b6\u0010;R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010<R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010=R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010>R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010?R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010@R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010AR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010BR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010BR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010BR\u001c\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010BR\u001c\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010BR\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010BR\u001b\u0010G\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u0018\u0010I\u001a\u0004\u0018\u00010H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010J¨\u0006L"}, d2 = {"Lru/ozon/app/android/video/playerV2/performance/playback/PlaybackStateManager;", "", "Lru/ozon/app/android/video/playerV2/performance/playback/PlaybackAnalyticsSender;", "playbackAnalyticsSender", "Lru/ozon/app/android/video/player/performance/metricsManager/VideoPerfMetricsManager;", "videoPerfMetricsManager", "LSg/a;", "analyticsScreenStorage", "Lru/ozon/app/android/video/player/performance/metricsManager/VideoPerfMetricsManagerHelper;", "videoPerfMetricsManagerHelper", "Lru/ozon/app/android/video/player/logs/PlayerLogger;", "playerLogger", "Lru/ozon/app/android/network/abtool/FeatureService;", "featureService", "Lkotlin/Function0;", "", "getIsPlayerAllowedToPlay", "canCheckLoadError", "", "onResetPlaybackStats", "", "getCurrentMediaUrl", "getCurrentWidgetName", "Lru/ozon/app/android/video/playerV2/performance/playback/playbackData/PlaybackStatsData;", "getPlaybackStats", "<init>", "(Lru/ozon/app/android/video/playerV2/performance/playback/PlaybackAnalyticsSender;Lru/ozon/app/android/video/player/performance/metricsManager/VideoPerfMetricsManager;LSg/a;Lru/ozon/app/android/video/player/performance/metricsManager/VideoPerfMetricsManagerHelper;Lru/ozon/app/android/video/player/logs/PlayerLogger;Lru/ozon/app/android/network/abtool/FeatureService;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "Lru/ozon/app/android/video/playerV2/performance/playback/PlaybackStateManager$SendAnalyticReason;", "reason", "tryToSendAnalytic", "(Lru/ozon/app/android/video/playerV2/performance/playback/PlaybackStateManager$SendAnalyticReason;)V", ImagesContract.URL, "Lru/ozon/app/android/video/playerV2/performance/playback/metricsHolder/TypedLoadTimeMetrics$SuccessStartMetrics$StartupSucceedMetrics;", "typedPlaybackResult", "playbackStats", "", "videoIndex", "widgetName", "Lru/ozon/app/android/video/player/performance/metricsManager/VideoPerfMetricAction$PutVideoPlaybackMetricAction$ErrorDetails$FatalErrorType;", "typedFatalError", "handleSuccessStartMetrics", "(Ljava/lang/String;Lru/ozon/app/android/video/playerV2/performance/playback/metricsHolder/TypedLoadTimeMetrics$SuccessStartMetrics$StartupSucceedMetrics;Lru/ozon/app/android/video/playerV2/performance/playback/playbackData/PlaybackStatsData;Ljava/lang/Integer;Ljava/lang/String;Lru/ozon/app/android/video/player/performance/metricsManager/VideoPerfMetricAction$PutVideoPlaybackMetricAction$ErrorDetails$FatalErrorType;Lru/ozon/app/android/video/playerV2/performance/playback/PlaybackStateManager$SendAnalyticReason;)V", "Lru/ozon/app/android/video/playerV2/performance/playback/metricsHolder/TypedLoadTimeMetrics$FailedStartMetrics$StartupFailedMetrics;", "handleStartupFailedMetrics", "(Ljava/lang/String;Lru/ozon/app/android/video/playerV2/performance/playback/metricsHolder/TypedLoadTimeMetrics$FailedStartMetrics$StartupFailedMetrics;Lru/ozon/app/android/video/playerV2/performance/playback/playbackData/PlaybackStatsData;Ljava/lang/Integer;Ljava/lang/String;Lru/ozon/app/android/video/player/performance/metricsManager/VideoPerfMetricAction$PutVideoPlaybackMetricAction$ErrorDetails$FatalErrorType;Lru/ozon/app/android/video/playerV2/performance/playback/PlaybackStateManager$SendAnalyticReason;)V", "Lru/ozon/app/android/video/player/performance/metricsManager/VideoUrl;", "videoUrl", "handleNoDataSent", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/video/playerV2/performance/playback/PlaybackStateManager$SendAnalyticReason;)V", "LRg/a;", "getScreenAnalytic", "()LRg/a;", "Lru/ozon/app/android/video/playerV2/performance/playback/events/PlaybackEvent;", "event", "handleEvent", "(Lru/ozon/app/android/video/playerV2/performance/playback/events/PlaybackEvent;)V", "Lru/ozon/app/android/video/playerV2/performance/playback/events/VideoInfoUpdateEvent;", "(Lru/ozon/app/android/video/playerV2/performance/playback/events/VideoInfoUpdateEvent;)V", "Lru/ozon/app/android/video/playerV2/performance/playback/events/ErrorEvent;", "(Lru/ozon/app/android/video/playerV2/performance/playback/events/ErrorEvent;)V", "Lru/ozon/app/android/video/playerV2/performance/playback/PlaybackAnalyticsSender;", "Lru/ozon/app/android/video/player/performance/metricsManager/VideoPerfMetricsManager;", "LSg/a;", "Lru/ozon/app/android/video/player/performance/metricsManager/VideoPerfMetricsManagerHelper;", "Lru/ozon/app/android/video/player/logs/PlayerLogger;", "Lru/ozon/app/android/network/abtool/FeatureService;", "Lkotlin/jvm/functions/Function0;", "logPlayerErrors$delegate", "LSc/j;", "getLogPlayerErrors", "()Z", "logPlayerErrors", "Lru/ozon/app/android/video/playerV2/performance/playback/metricsHolder/PlaybackMetricsHolder;", "metricsHolder", "Lru/ozon/app/android/video/playerV2/performance/playback/metricsHolder/PlaybackMetricsHolder;", "SendAnalyticReason", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PlaybackStateManager {

    @NotNull
    private final a analyticsScreenStorage;

    @NotNull
    private final Function0<Boolean> canCheckLoadError;

    @NotNull
    private final FeatureService featureService;

    @NotNull
    private final Function0<String> getCurrentMediaUrl;

    @NotNull
    private final Function0<String> getCurrentWidgetName;

    @NotNull
    private final Function0<Boolean> getIsPlayerAllowedToPlay;

    @NotNull
    private final Function0<PlaybackStatsData> getPlaybackStats;

    /* renamed from: logPlayerErrors$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j logPlayerErrors;
    private PlaybackMetricsHolder metricsHolder;

    @NotNull
    private final Function0<Unit> onResetPlaybackStats;

    @NotNull
    private final PlaybackAnalyticsSender playbackAnalyticsSender;

    @NotNull
    private final PlayerLogger playerLogger;

    @NotNull
    private final VideoPerfMetricsManager videoPerfMetricsManager;

    @NotNull
    private final VideoPerfMetricsManagerHelper videoPerfMetricsManagerHelper;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/video/playerV2/performance/playback/PlaybackStateManager$SendAnalyticReason;", "", "<init>", "()V", "ReasonIdleState", "ReasonPlayerReleased", "ReasonPlaylistChanged", "Lru/ozon/app/android/video/playerV2/performance/playback/PlaybackStateManager$SendAnalyticReason$ReasonIdleState;", "Lru/ozon/app/android/video/playerV2/performance/playback/PlaybackStateManager$SendAnalyticReason$ReasonPlayerReleased;", "Lru/ozon/app/android/video/playerV2/performance/playback/PlaybackStateManager$SendAnalyticReason$ReasonPlaylistChanged;", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class SendAnalyticReason {

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/video/playerV2/performance/playback/PlaybackStateManager$SendAnalyticReason$ReasonIdleState;", "Lru/ozon/app/android/video/playerV2/performance/playback/PlaybackStateManager$SendAnalyticReason;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ReasonIdleState extends SendAnalyticReason {

            @NotNull
            public static final ReasonIdleState INSTANCE = new ReasonIdleState();

            private ReasonIdleState() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof ReasonIdleState);
            }

            public int hashCode() {
                return 834117983;
            }

            @NotNull
            public String toString() {
                return "ReasonIdleState";
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/video/playerV2/performance/playback/PlaybackStateManager$SendAnalyticReason$ReasonPlayerReleased;", "Lru/ozon/app/android/video/playerV2/performance/playback/PlaybackStateManager$SendAnalyticReason;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        /* loaded from: classes2.dex */
        public static final /* data */ class ReasonPlayerReleased extends SendAnalyticReason {

            @NotNull
            public static final ReasonPlayerReleased INSTANCE = new ReasonPlayerReleased();

            private ReasonPlayerReleased() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof ReasonPlayerReleased);
            }

            public int hashCode() {
                return 2080831548;
            }

            @NotNull
            public String toString() {
                return "ReasonPlayerReleased";
            }
        }

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0003\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/video/playerV2/performance/playback/PlaybackStateManager$SendAnalyticReason$ReasonPlaylistChanged;", "Lru/ozon/app/android/video/playerV2/performance/playback/PlaybackStateManager$SendAnalyticReason;", "", "isSamePlaylistUrl", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "()Z", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ReasonPlaylistChanged extends SendAnalyticReason {
            private final boolean isSamePlaylistUrl;

            public ReasonPlaylistChanged(boolean z11) {
                super(null);
                this.isSamePlaylistUrl = z11;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ReasonPlaylistChanged) && this.isSamePlaylistUrl == ((ReasonPlaylistChanged) other).isSamePlaylistUrl;
            }

            public int hashCode() {
                return Boolean.hashCode(this.isSamePlaylistUrl);
            }

            /* renamed from: isSamePlaylistUrl, reason: from getter */
            public final boolean getIsSamePlaylistUrl() {
                return this.isSamePlaylistUrl;
            }

            @NotNull
            public String toString() {
                return C2618u.g("ReasonPlaylistChanged(isSamePlaylistUrl=", ")", this.isSamePlaylistUrl);
            }
        }

        public /* synthetic */ SendAnalyticReason(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private SendAnalyticReason() {
        }
    }

    public PlaybackStateManager(@NotNull PlaybackAnalyticsSender playbackAnalyticsSender, @NotNull VideoPerfMetricsManager videoPerfMetricsManager, @NotNull a analyticsScreenStorage, @NotNull VideoPerfMetricsManagerHelper videoPerfMetricsManagerHelper, @NotNull PlayerLogger playerLogger, @NotNull FeatureService featureService, @NotNull Function0<Boolean> getIsPlayerAllowedToPlay, @NotNull Function0<Boolean> canCheckLoadError, @NotNull Function0<Unit> onResetPlaybackStats, @NotNull Function0<String> getCurrentMediaUrl, @NotNull Function0<String> getCurrentWidgetName, @NotNull Function0<PlaybackStatsData> getPlaybackStats) {
        Intrinsics.checkNotNullParameter(playbackAnalyticsSender, "playbackAnalyticsSender");
        Intrinsics.checkNotNullParameter(videoPerfMetricsManager, "videoPerfMetricsManager");
        Intrinsics.checkNotNullParameter(analyticsScreenStorage, "analyticsScreenStorage");
        Intrinsics.checkNotNullParameter(videoPerfMetricsManagerHelper, "videoPerfMetricsManagerHelper");
        Intrinsics.checkNotNullParameter(playerLogger, "playerLogger");
        Intrinsics.checkNotNullParameter(featureService, "featureService");
        Intrinsics.checkNotNullParameter(getIsPlayerAllowedToPlay, "getIsPlayerAllowedToPlay");
        Intrinsics.checkNotNullParameter(canCheckLoadError, "canCheckLoadError");
        Intrinsics.checkNotNullParameter(onResetPlaybackStats, "onResetPlaybackStats");
        Intrinsics.checkNotNullParameter(getCurrentMediaUrl, "getCurrentMediaUrl");
        Intrinsics.checkNotNullParameter(getCurrentWidgetName, "getCurrentWidgetName");
        Intrinsics.checkNotNullParameter(getPlaybackStats, "getPlaybackStats");
        this.playbackAnalyticsSender = playbackAnalyticsSender;
        this.videoPerfMetricsManager = videoPerfMetricsManager;
        this.analyticsScreenStorage = analyticsScreenStorage;
        this.videoPerfMetricsManagerHelper = videoPerfMetricsManagerHelper;
        this.playerLogger = playerLogger;
        this.featureService = featureService;
        this.getIsPlayerAllowedToPlay = getIsPlayerAllowedToPlay;
        this.canCheckLoadError = canCheckLoadError;
        this.onResetPlaybackStats = onResetPlaybackStats;
        this.getCurrentMediaUrl = getCurrentMediaUrl;
        this.getCurrentWidgetName = getCurrentWidgetName;
        this.getPlaybackStats = getPlaybackStats;
        this.logPlayerErrors = VideoModuleExtKt.unsafeLazy(new PlaybackStateManager$logPlayerErrors$2(this));
    }

    private final boolean getLogPlayerErrors() {
        return ((Boolean) this.logPlayerErrors.getValue()).booleanValue();
    }

    private final Rg.a getScreenAnalytic() {
        a d11 = this.analyticsScreenStorage.d();
        if (d11 != null) {
            return d11.a();
        }
        return null;
    }

    private final void handleNoDataSent(String videoUrl, String widgetName, SendAnalyticReason reason) {
        if (videoUrl == null) {
            return;
        }
        if (!(reason instanceof SendAnalyticReason.ReasonPlaylistChanged) || !((SendAnalyticReason.ReasonPlaylistChanged) reason).getIsSamePlaylistUrl()) {
            VideoPerfMetricsManagerHelper videoPerfMetricsManagerHelper = this.videoPerfMetricsManagerHelper;
            if (widgetName == null) {
                widgetName = "UNSPECIFIED";
            }
            videoPerfMetricsManagerHelper.removeVideoUrlFromActive(videoUrl, widgetName, new PlaybackStateManager$handleNoDataSent$1(this, videoUrl));
        }
        this.videoPerfMetricsManager.handleMetricActionByUrl(VideoAsset.INSTANCE.emptyVideoAsset$video_prodGoogleAllVendorsRelease(videoUrl), VideoPerfMetricAction.ClearUnusedAnalyticAction.INSTANCE);
    }

    private final void handleStartupFailedMetrics(String url, TypedLoadTimeMetrics.FailedStartMetrics.StartupFailedMetrics typedPlaybackResult, PlaybackStatsData playbackStats, Integer videoIndex, String widgetName, VideoPerfMetricAction.PutVideoPlaybackMetricAction.ErrorDetails.FatalErrorType typedFatalError, SendAnalyticReason reason) {
        PlaybackData createInstanceFromStats = PlaybackData.INSTANCE.createInstanceFromStats(url, typedPlaybackResult, PlaybackStatsDataKt.mapToStartupFailedCase(playbackStats), videoIndex, getScreenAnalytic(), widgetName, typedFatalError);
        if (createInstanceFromStats == null || this.playbackAnalyticsSender.sendPlaybackData(createInstanceFromStats, this.videoPerfMetricsManager)) {
            return;
        }
        handleNoDataSent(url, widgetName, reason);
    }

    private final void handleSuccessStartMetrics(String url, TypedLoadTimeMetrics.SuccessStartMetrics.StartupSucceedMetrics typedPlaybackResult, PlaybackStatsData playbackStats, Integer videoIndex, String widgetName, VideoPerfMetricAction.PutVideoPlaybackMetricAction.ErrorDetails.FatalErrorType typedFatalError, SendAnalyticReason reason) {
        boolean sendPlaybackData = this.playbackAnalyticsSender.sendPlaybackData(PlaybackData.INSTANCE.createInstanceFromStats(url, typedPlaybackResult, playbackStats, videoIndex, getScreenAnalytic(), widgetName, typedFatalError), this.videoPerfMetricsManager);
        this.metricsHolder = null;
        if (sendPlaybackData) {
            return;
        }
        handleNoDataSent(url, widgetName, reason);
    }

    private final void tryToSendAnalytic(SendAnalyticReason reason) {
        PlaybackMetricsHolder playbackMetricsHolder = this.metricsHolder;
        Integer videoIndex = playbackMetricsHolder != null ? playbackMetricsHolder.getVideoIndex() : null;
        String invoke = this.getCurrentWidgetName.invoke();
        PlaybackMetricsHolder playbackMetricsHolder2 = this.metricsHolder;
        String videoUrl = playbackMetricsHolder2 != null ? playbackMetricsHolder2.getVideoUrl() : null;
        PlaybackMetricsHolder playbackMetricsHolder3 = this.metricsHolder;
        Object typedPlaybackResult = playbackMetricsHolder3 != null ? playbackMetricsHolder3.getTypedPlaybackResult() : null;
        PlaybackMetricsHolder playbackMetricsHolder4 = this.metricsHolder;
        VideoPerfMetricAction.PutVideoPlaybackMetricAction.ErrorDetails.FatalErrorType typedFatalError = playbackMetricsHolder4 != null ? playbackMetricsHolder4.getTypedFatalError() : null;
        PlaybackStatsData invoke2 = this.getPlaybackStats.invoke();
        if (videoUrl == null || typedPlaybackResult == null || invoke2 == null) {
            handleNoDataSent(videoUrl, invoke, reason);
            return;
        }
        if (typedPlaybackResult instanceof TypedLoadTimeMetrics.SuccessStartMetrics.StartupSucceedMetrics) {
            handleSuccessStartMetrics(videoUrl, (TypedLoadTimeMetrics.SuccessStartMetrics.StartupSucceedMetrics) typedPlaybackResult, invoke2, videoIndex, invoke, typedFatalError, reason);
            return;
        }
        if (!(typedPlaybackResult instanceof TypedLoadTimeMetrics.FailedStartMetrics.StartupFailedMetrics)) {
            handleNoDataSent(videoUrl, invoke, reason);
        } else if (Intrinsics.d(reason, SendAnalyticReason.ReasonIdleState.INSTANCE)) {
            handleStartupFailedMetrics(videoUrl, (TypedLoadTimeMetrics.FailedStartMetrics.StartupFailedMetrics) typedPlaybackResult, invoke2, videoIndex, invoke, typedFatalError, reason);
        } else {
            handleNoDataSent(videoUrl, invoke, reason);
        }
    }

    public final void handleEvent(@NotNull PlaybackEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof PlaybackEvent.ResumePauseEvent.OnResume) {
            PlaybackMetricsHolder playbackMetricsHolder = this.metricsHolder;
            if (playbackMetricsHolder != null) {
                playbackMetricsHolder.updateSuccessPendingWithTime(((PlaybackEvent.ResumePauseEvent.OnResume) event).getEventTime().f99804a);
                return;
            }
            return;
        }
        if (Intrinsics.d(event, PlaybackEvent.ResumePauseEvent.OnPause.INSTANCE)) {
            PlaybackMetricsHolder playbackMetricsHolder2 = this.metricsHolder;
            if (playbackMetricsHolder2 != null) {
                playbackMetricsHolder2.discardSuccessPending();
                return;
            }
            return;
        }
        if (event instanceof PlaybackEvent.PlayingEvent.OnStartPlaying) {
            PlaybackMetricsHolder playbackMetricsHolder3 = this.metricsHolder;
            if (playbackMetricsHolder3 != null) {
                playbackMetricsHolder3.onStartPlayingWithTime(((PlaybackEvent.PlayingEvent.OnStartPlaying) event).getEventTime().f99804a);
                return;
            }
            return;
        }
        if (event instanceof PlaybackEvent.PlayingEvent.OnStopPlaying) {
            return;
        }
        if (Intrinsics.d(event, PlaybackEvent.OnPlayerReleased.INSTANCE)) {
            tryToSendAnalytic(SendAnalyticReason.ReasonPlayerReleased.INSTANCE);
            return;
        }
        if (event instanceof PlaybackEvent.MediaItemTransitionEvent.OnPlaylistChanged) {
            PlaybackMetricsHolder playbackMetricsHolder4 = this.metricsHolder;
            if (playbackMetricsHolder4 != null) {
                PlaybackEvent.MediaItemTransitionEvent.OnPlaylistChanged onPlaylistChanged = (PlaybackEvent.MediaItemTransitionEvent.OnPlaylistChanged) event;
                tryToSendAnalytic(new SendAnalyticReason.ReasonPlaylistChanged(onPlaylistChanged.getNewVideoUrl().length() > 0 && Intrinsics.d(onPlaylistChanged.getNewVideoUrl(), playbackMetricsHolder4.getVideoUrl())));
            }
            this.metricsHolder = PlaybackMetricsHolder.INSTANCE.getNewInstance(((PlaybackEvent.MediaItemTransitionEvent.OnPlaylistChanged) event).getNewVideoUrl());
            return;
        }
        if (event instanceof PlaybackEvent.MediaItemTransitionEvent.Other) {
            return;
        }
        if (event instanceof PlaybackEvent.LoadStatusEvent.OnLoadStarted) {
            PlaybackMetricsHolder playbackMetricsHolder5 = this.metricsHolder;
            if (playbackMetricsHolder5 != null) {
                PlaybackEvent.LoadStatusEvent.OnLoadStarted onLoadStarted = (PlaybackEvent.LoadStatusEvent.OnLoadStarted) event;
                playbackMetricsHolder5.updateFailedPendingWithTime(onLoadStarted.getEventTime().f99804a, onLoadStarted.getLoadUrl());
                return;
            }
            return;
        }
        if (event instanceof PlaybackEvent.LoadStatusEvent.OnLoadCanceled) {
            PlaybackMetricsHolder playbackMetricsHolder6 = this.metricsHolder;
            if (playbackMetricsHolder6 != null) {
                PlaybackEvent.LoadStatusEvent.OnLoadCanceled onLoadCanceled = (PlaybackEvent.LoadStatusEvent.OnLoadCanceled) event;
                playbackMetricsHolder6.onStartStartupFailedWithTime(onLoadCanceled.getEventTime().f99804a, onLoadCanceled.getLoadUrl());
                return;
            }
            return;
        }
        if (event instanceof PlaybackEvent.OnStateChangedEvent.IdleState) {
            tryToSendAnalytic(SendAnalyticReason.ReasonIdleState.INSTANCE);
            this.onResetPlaybackStats.invoke();
        } else {
            if (event instanceof PlaybackEvent.OnStateChangedEvent.BufferingState) {
                return;
            }
            if (!(event instanceof PlaybackEvent.OnStateChangedEvent.ReadyState)) {
                throw new o();
            }
            PlaybackMetricsHolder playbackMetricsHolder7 = this.metricsHolder;
            if (playbackMetricsHolder7 == null || !playbackMetricsHolder7.isStartupComputed()) {
                this.onResetPlaybackStats.invoke();
            }
        }
    }

    public final void handleEvent(@NotNull VideoInfoUpdateEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof VideoInfoUpdateEvent.OnVideoIndexUpdate) {
            PlaybackMetricsHolder playbackMetricsHolder = this.metricsHolder;
            if (playbackMetricsHolder != null) {
                playbackMetricsHolder.updateVideoIndex(((VideoInfoUpdateEvent.OnVideoIndexUpdate) event).getIndex());
                return;
            }
            return;
        }
        throw new o();
    }

    public final void handleEvent(@NotNull ErrorEvent event) {
        String videoUrl;
        Intrinsics.checkNotNullParameter(event, "event");
        PlaybackMetricsHolder playbackMetricsHolder = this.metricsHolder;
        String str = (playbackMetricsHolder == null || (videoUrl = playbackMetricsHolder.getVideoUrl()) == null) ? "" : videoUrl;
        String invoke = this.getCurrentWidgetName.invoke();
        if (event instanceof ErrorEvent.FatalErrorEvent) {
            PlaybackMetricsHolder playbackMetricsHolder2 = this.metricsHolder;
            Long loadingStartTime = playbackMetricsHolder2 != null ? playbackMetricsHolder2.getLoadingStartTime() : null;
            boolean booleanValue = this.canCheckLoadError.invoke().booleanValue();
            String invoke2 = this.getCurrentMediaUrl.invoke();
            String str2 = invoke2 == null ? "" : invoke2;
            ErrorEvent.FatalErrorEvent fatalErrorEvent = (ErrorEvent.FatalErrorEvent) event;
            String str3 = str;
            VideoPerfMetricAction.PutVideoPlaybackMetricAction.ErrorDetails.FatalErrorType typedError = ErrorEventKt.getTypedError(fatalErrorEvent, loadingStartTime, this.getIsPlayerAllowedToPlay.invoke().booleanValue(), str3, str2, booleanValue, new PlaybackStateManager$handleEvent$typedError$1(this));
            PlaybackMetricsHolder playbackMetricsHolder3 = this.metricsHolder;
            if (playbackMetricsHolder3 != null) {
                playbackMetricsHolder3.onTypedFatalErrorRegistered(typedError);
            }
            if (getLogPlayerErrors()) {
                this.playerLogger.logFatalPlayerError(fatalErrorEvent.getError(), str3, invoke);
                return;
            }
            return;
        }
        if (event instanceof ErrorEvent.NonFatalErrorEvent) {
            if (getLogPlayerErrors()) {
                PlayerLogger playerLogger = this.playerLogger;
                ErrorEvent.NonFatalErrorEvent nonFatalErrorEvent = (ErrorEvent.NonFatalErrorEvent) event;
                String nonFatalReason = nonFatalErrorEvent.getNonFatalReason();
                String errorMessage = nonFatalErrorEvent.getErrorMessage();
                if (errorMessage == null) {
                    errorMessage = "";
                }
                playerLogger.logNonFatalPlayerError(nonFatalReason, str, errorMessage, nonFatalErrorEvent.getErrorCause(), invoke);
                return;
            }
            return;
        }
        throw new o();
    }
}
