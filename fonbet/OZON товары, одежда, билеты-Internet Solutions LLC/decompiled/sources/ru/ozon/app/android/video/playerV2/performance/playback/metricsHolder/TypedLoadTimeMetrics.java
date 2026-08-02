package ru.ozon.app.android.video.playerV2.performance.playback.metricsHolder;

import Sh.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u0000 \u00042\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/video/playerV2/performance/playback/metricsHolder/TypedLoadTimeMetrics;", "", "<init>", "()V", "Companion", "SuccessStartMetrics", "FailedStartMetrics", "Lru/ozon/app/android/video/playerV2/performance/playback/metricsHolder/TypedLoadTimeMetrics$FailedStartMetrics;", "Lru/ozon/app/android/video/playerV2/performance/playback/metricsHolder/TypedLoadTimeMetrics$SuccessStartMetrics;", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class TypedLoadTimeMetrics {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0006\u0010\b\u001a\u00020\u0005¨\u0006\t"}, d2 = {"Lru/ozon/app/android/video/playerV2/performance/playback/metricsHolder/TypedLoadTimeMetrics$Companion;", "", "<init>", "()V", "createSuccessPendingStateFromTime", "Lru/ozon/app/android/video/playerV2/performance/playback/metricsHolder/TypedLoadTimeMetrics$SuccessStartMetrics$PendingState;", "time", "", "discardSuccessPendingState", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final SuccessStartMetrics.PendingState createSuccessPendingStateFromTime(long time) {
            return new SuccessStartMetrics.PendingState(Long.valueOf(time));
        }

        @NotNull
        public final SuccessStartMetrics.PendingState discardSuccessPendingState() {
            return new SuccessStartMetrics.PendingState(null);
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/video/playerV2/performance/playback/metricsHolder/TypedLoadTimeMetrics$FailedStartMetrics;", "Lru/ozon/app/android/video/playerV2/performance/playback/metricsHolder/TypedLoadTimeMetrics;", "<init>", "()V", "PendingState", "StartupFailedMetrics", "Lru/ozon/app/android/video/playerV2/performance/playback/metricsHolder/TypedLoadTimeMetrics$FailedStartMetrics$PendingState;", "Lru/ozon/app/android/video/playerV2/performance/playback/metricsHolder/TypedLoadTimeMetrics$FailedStartMetrics$StartupFailedMetrics;", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class FailedStartMetrics extends TypedLoadTimeMetrics {

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/video/playerV2/performance/playback/metricsHolder/TypedLoadTimeMetrics$FailedStartMetrics$PendingState;", "Lru/ozon/app/android/video/playerV2/performance/playback/metricsHolder/TypedLoadTimeMetrics$FailedStartMetrics;", "", "loadStartTimeMs", "<init>", "(Ljava/lang/Long;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Long;", "getLoadStartTimeMs", "()Ljava/lang/Long;", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class PendingState extends FailedStartMetrics {
            private final Long loadStartTimeMs;

            public PendingState(Long l11) {
                super(null);
                this.loadStartTimeMs = l11;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof PendingState) && Intrinsics.d(this.loadStartTimeMs, ((PendingState) other).loadStartTimeMs);
            }

            public final Long getLoadStartTimeMs() {
                return this.loadStartTimeMs;
            }

            public int hashCode() {
                Long l11 = this.loadStartTimeMs;
                if (l11 == null) {
                    return 0;
                }
                return l11.hashCode();
            }

            @NotNull
            public String toString() {
                return "PendingState(loadStartTimeMs=" + this.loadStartTimeMs + ")";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u001a\u0010\t¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/video/playerV2/performance/playback/metricsHolder/TypedLoadTimeMetrics$FailedStartMetrics$StartupFailedMetrics;", "Lru/ozon/app/android/video/playerV2/performance/playback/metricsHolder/TypedLoadTimeMetrics$FailedStartMetrics;", "", "loadStartTimeMs", "failedLoadingDuration", "fatalErrorLoadingDurationMs", "<init>", "(JLjava/lang/Long;Ljava/lang/Long;)V", "getFailedOrFatalLoadingDuration", "()Ljava/lang/Long;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getLoadStartTimeMs", "()J", "Ljava/lang/Long;", "getFailedLoadingDuration", "getFatalErrorLoadingDurationMs", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        /* loaded from: classes2.dex */
        public static final /* data */ class StartupFailedMetrics extends FailedStartMetrics {
            private final Long failedLoadingDuration;
            private final Long fatalErrorLoadingDurationMs;
            private final long loadStartTimeMs;

            public StartupFailedMetrics(long j11, Long l11, Long l12) {
                super(null);
                this.loadStartTimeMs = j11;
                this.failedLoadingDuration = l11;
                this.fatalErrorLoadingDurationMs = l12;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof StartupFailedMetrics)) {
                    return false;
                }
                StartupFailedMetrics startupFailedMetrics = (StartupFailedMetrics) other;
                return this.loadStartTimeMs == startupFailedMetrics.loadStartTimeMs && Intrinsics.d(this.failedLoadingDuration, startupFailedMetrics.failedLoadingDuration) && Intrinsics.d(this.fatalErrorLoadingDurationMs, startupFailedMetrics.fatalErrorLoadingDurationMs);
            }

            public final Long getFailedOrFatalLoadingDuration() {
                Long l11 = this.failedLoadingDuration;
                return l11 == null ? this.fatalErrorLoadingDurationMs : l11;
            }

            public final long getLoadStartTimeMs() {
                return this.loadStartTimeMs;
            }

            public int hashCode() {
                int hashCode = Long.hashCode(this.loadStartTimeMs) * 31;
                Long l11 = this.failedLoadingDuration;
                int hashCode2 = (hashCode + (l11 == null ? 0 : l11.hashCode())) * 31;
                Long l12 = this.fatalErrorLoadingDurationMs;
                return hashCode2 + (l12 != null ? l12.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                return "StartupFailedMetrics(loadStartTimeMs=" + this.loadStartTimeMs + ", failedLoadingDuration=" + this.failedLoadingDuration + ", fatalErrorLoadingDurationMs=" + this.fatalErrorLoadingDurationMs + ")";
            }
        }

        public /* synthetic */ FailedStartMetrics(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private FailedStartMetrics() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/video/playerV2/performance/playback/metricsHolder/TypedLoadTimeMetrics$SuccessStartMetrics;", "Lru/ozon/app/android/video/playerV2/performance/playback/metricsHolder/TypedLoadTimeMetrics;", "<init>", "()V", "PendingState", "StartupSucceedMetrics", "Lru/ozon/app/android/video/playerV2/performance/playback/metricsHolder/TypedLoadTimeMetrics$SuccessStartMetrics$PendingState;", "Lru/ozon/app/android/video/playerV2/performance/playback/metricsHolder/TypedLoadTimeMetrics$SuccessStartMetrics$StartupSucceedMetrics;", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class SuccessStartMetrics extends TypedLoadTimeMetrics {

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/video/playerV2/performance/playback/metricsHolder/TypedLoadTimeMetrics$SuccessStartMetrics$PendingState;", "Lru/ozon/app/android/video/playerV2/performance/playback/metricsHolder/TypedLoadTimeMetrics$SuccessStartMetrics;", "", "lastResumedTimeMs", "<init>", "(Ljava/lang/Long;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Long;", "getLastResumedTimeMs", "()Ljava/lang/Long;", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class PendingState extends SuccessStartMetrics {
            private final Long lastResumedTimeMs;

            public PendingState(Long l11) {
                super(null);
                this.lastResumedTimeMs = l11;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof PendingState) && Intrinsics.d(this.lastResumedTimeMs, ((PendingState) other).lastResumedTimeMs);
            }

            public final Long getLastResumedTimeMs() {
                return this.lastResumedTimeMs;
            }

            public int hashCode() {
                Long l11 = this.lastResumedTimeMs;
                if (l11 == null) {
                    return 0;
                }
                return l11.hashCode();
            }

            @NotNull
            public String toString() {
                return "PendingState(lastResumedTimeMs=" + this.lastResumedTimeMs + ")";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/video/playerV2/performance/playback/metricsHolder/TypedLoadTimeMetrics$SuccessStartMetrics$StartupSucceedMetrics;", "Lru/ozon/app/android/video/playerV2/performance/playback/metricsHolder/TypedLoadTimeMetrics$SuccessStartMetrics;", "", "successStartupTime", "<init>", "(J)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getSuccessStartupTime", "()J", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class StartupSucceedMetrics extends SuccessStartMetrics {
            private final long successStartupTime;

            public StartupSucceedMetrics(long j11) {
                super(null);
                this.successStartupTime = j11;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof StartupSucceedMetrics) && this.successStartupTime == ((StartupSucceedMetrics) other).successStartupTime;
            }

            public final long getSuccessStartupTime() {
                return this.successStartupTime;
            }

            public int hashCode() {
                return Long.hashCode(this.successStartupTime);
            }

            @NotNull
            public String toString() {
                return b.b(this.successStartupTime, "StartupSucceedMetrics(successStartupTime=", ")");
            }
        }

        public /* synthetic */ SuccessStartMetrics(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private SuccessStartMetrics() {
            super(null);
        }
    }

    public /* synthetic */ TypedLoadTimeMetrics(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private TypedLoadTimeMetrics() {
    }
}
