package ru.ozon.app.android.video.player.performance.metricsManager;

import G.g;
import Kk.c;
import N3.C3660k;
import Xc.a;
import Xc.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.video.player.performance.PlayerNamespace;
import ru.ozon.app.android.video.player.performance.VideoTraceEntity;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u0000 \u00042\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\u000b\f\r\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/video/player/performance/metricsManager/VideoPerfMetricAction;", "", "<init>", "()V", "Companion", "ClearUnusedAnalyticAction", "SendAwaitMetricsManually", "PutServerTimingMetricAction", "PutAppMetricAction", "PutVideoPlaybackMetricAction", "SendMetricsAction", "Lru/ozon/app/android/video/player/performance/metricsManager/VideoPerfMetricAction$ClearUnusedAnalyticAction;", "Lru/ozon/app/android/video/player/performance/metricsManager/VideoPerfMetricAction$PutAppMetricAction;", "Lru/ozon/app/android/video/player/performance/metricsManager/VideoPerfMetricAction$PutServerTimingMetricAction;", "Lru/ozon/app/android/video/player/performance/metricsManager/VideoPerfMetricAction$PutVideoPlaybackMetricAction;", "Lru/ozon/app/android/video/player/performance/metricsManager/VideoPerfMetricAction$SendAwaitMetricsManually;", "Lru/ozon/app/android/video/player/performance/metricsManager/VideoPerfMetricAction$SendMetricsAction;", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class VideoPerfMetricAction {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/video/player/performance/metricsManager/VideoPerfMetricAction$ClearUnusedAnalyticAction;", "Lru/ozon/app/android/video/player/performance/metricsManager/VideoPerfMetricAction;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ClearUnusedAnalyticAction extends VideoPerfMetricAction {

        @NotNull
        public static final ClearUnusedAnalyticAction INSTANCE = new ClearUnusedAnalyticAction();

        private ClearUnusedAnalyticAction() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof ClearUnusedAnalyticAction);
        }

        public int hashCode() {
            return 1498626321;
        }

        @NotNull
        public String toString() {
            return "ClearUnusedAnalyticAction";
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/video/player/performance/metricsManager/VideoPerfMetricAction$Companion;", "", "<init>", "()V", "SERVER_TIMING_DESC_PREFIX", "", "SERVER_TIMING_DUR_PREFIX", "parseServerTimingMetric", "", "Lru/ozon/app/android/video/player/performance/metricsManager/VideoPerfMetricAction$PutServerTimingMetricAction;", "input", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final List<PutServerTimingMetricAction> parseServerTimingMetric(@NotNull String input) {
            Intrinsics.checkNotNullParameter(input, "input");
            ArrayList arrayList = new ArrayList();
            Iterator it = h.m(input, new String[]{","}, 0, 6).iterator();
            while (it.hasNext()) {
                List m11 = h.m((String) it.next(), new String[]{";"}, 0, 6);
                String str = (String) C7714v.Q(0, m11);
                String str2 = "";
                if (str == null) {
                    str = "";
                }
                Number number = 0;
                for (int i11 = 1; i11 < 3; i11++) {
                    String str3 = (String) C7714v.Q(i11, m11);
                    String obj = str3 != null ? h.z0(str3).toString() : null;
                    if (obj != null) {
                        if (h.e0(obj, "desc=", false)) {
                            str2 = h.B0(h.i0(obj, "desc="), '\"');
                        } else if (h.e0(obj, "dur=", false)) {
                            String i02 = h.i0(obj, "dur=");
                            if (h.t(i02, ".", false)) {
                                Double u02 = h.u0(i02);
                                number = Double.valueOf(u02 != null ? u02.doubleValue() : 0.0d);
                            } else {
                                Integer w02 = h.w0(i02);
                                number = Integer.valueOf(w02 != null ? w02.intValue() : 0);
                            }
                        }
                    }
                }
                arrayList.add(new PutServerTimingMetricAction(str, str2, number));
            }
            return arrayList;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0004\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/video/player/performance/metricsManager/VideoPerfMetricAction$PutAppMetricAction;", "Lru/ozon/app/android/video/player/performance/metricsManager/VideoPerfMetricAction;", "", "metricName", "", "metricValue", "<init>", "(Ljava/lang/String;Ljava/lang/Number;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "getMetricName", "Ljava/lang/Number;", "getMetricValue", "()Ljava/lang/Number;", "Companion", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PutAppMetricAction extends VideoPerfMetricAction {
        private static final int fileReadCompleteMetricListCount;

        @NotNull
        private final String metricName;

        @NotNull
        private final Number metricValue;

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);
        public static final int $stable = 8;

        @NotNull
        private static final List<String> fileReadCompleteMetricList = C7714v.b0("totalTime", "encodedSize", "transferSize", "headersSize", "responseTime", "timeToLastByte", "decodedSize");

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0016\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/video/player/performance/metricsManager/VideoPerfMetricAction$PutAppMetricAction$Companion;", "", "<init>", "()V", "KEY_DECODED_SIZE_VIDEO_ANALYTICS", "", "KEY_ENCODED_SIZE_VIDEO_ANALYTICS", "KEY_HEADERS_SIZE_VIDEO_ANALYTICS", "KEY_TRANSFER_SIZE_VIDEO_ANALYTICS", "KEY_DNS_TIME_VIDEO_ANALYTICS", "KEY_RESPONSE_TIME_VIDEO_ANALYTICS", "KEY_SERVER_TIME_VIDEO_ANALYTICS", "KEY_TCP_TIME_VIDEO_ANALYTICS", "KEY_TIME_TO_FIRST_BYTE_VIDEO_ANALYTICS", "KEY_TIME_TO_LAST_BYTE_VIDEO_ANALYTICS", "KEY_TLS_TIME_VIDEO_ANALYTICS", "KEY_TOTAL_TIME_VIDEO_ANALYTICS", "KEY_PROTOCOL_VERSION_VIDEO_ANALYTICS", "fileReadCompleteMetricList", "", "getFileReadCompleteMetricList", "()Ljava/util/List;", "fileReadCompleteMetricListCount", "", "getFileReadCompleteMetricListCount", "()I", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final List<String> getFileReadCompleteMetricList() {
                return PutAppMetricAction.fileReadCompleteMetricList;
            }

            public final int getFileReadCompleteMetricListCount() {
                return PutAppMetricAction.fileReadCompleteMetricListCount;
            }

            private Companion() {
            }
        }

        static {
            fileReadCompleteMetricListCount = r0.size() - 1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PutAppMetricAction(@NotNull String metricName, @NotNull Number metricValue) {
            super(null);
            Intrinsics.checkNotNullParameter(metricName, "metricName");
            Intrinsics.checkNotNullParameter(metricValue, "metricValue");
            this.metricName = metricName;
            this.metricValue = metricValue;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!PutAppMetricAction.class.equals(other != null ? other.getClass() : null)) {
                return false;
            }
            Intrinsics.g(other, "null cannot be cast to non-null type ru.ozon.app.android.video.player.performance.metricsManager.VideoPerfMetricAction.PutAppMetricAction");
            return Intrinsics.d(this.metricName, ((PutAppMetricAction) other).metricName);
        }

        @NotNull
        public final String getMetricName() {
            return this.metricName;
        }

        @NotNull
        public final Number getMetricValue() {
            return this.metricValue;
        }

        public int hashCode() {
            return this.metricName.hashCode();
        }

        @NotNull
        public String toString() {
            return "PutAppMetricAction(metricName=" + this.metricName + ", metricValue=" + this.metricValue + ")";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0004\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0015\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/video/player/performance/metricsManager/VideoPerfMetricAction$PutServerTimingMetricAction;", "Lru/ozon/app/android/video/player/performance/metricsManager/VideoPerfMetricAction;", "", "paramName", "paramDesc", "", "paramDur", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Number;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getParamName", "getParamDesc", "Ljava/lang/Number;", "getParamDur", "()Ljava/lang/Number;", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PutServerTimingMetricAction extends VideoPerfMetricAction {

        @NotNull
        private final String paramDesc;

        @NotNull
        private final Number paramDur;

        @NotNull
        private final String paramName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PutServerTimingMetricAction(@NotNull String paramName, @NotNull String paramDesc, @NotNull Number paramDur) {
            super(null);
            Intrinsics.checkNotNullParameter(paramName, "paramName");
            Intrinsics.checkNotNullParameter(paramDesc, "paramDesc");
            Intrinsics.checkNotNullParameter(paramDur, "paramDur");
            this.paramName = paramName;
            this.paramDesc = paramDesc;
            this.paramDur = paramDur;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PutServerTimingMetricAction)) {
                return false;
            }
            PutServerTimingMetricAction putServerTimingMetricAction = (PutServerTimingMetricAction) other;
            return Intrinsics.d(this.paramName, putServerTimingMetricAction.paramName) && Intrinsics.d(this.paramDesc, putServerTimingMetricAction.paramDesc) && Intrinsics.d(this.paramDur, putServerTimingMetricAction.paramDur);
        }

        @NotNull
        public final String getParamDesc() {
            return this.paramDesc;
        }

        @NotNull
        public final Number getParamDur() {
            return this.paramDur;
        }

        @NotNull
        public final String getParamName() {
            return this.paramName;
        }

        public int hashCode() {
            return this.paramDur.hashCode() + g.a(this.paramName.hashCode() * 31, 31, this.paramDesc);
        }

        @NotNull
        public String toString() {
            String str = this.paramName;
            String str2 = this.paramDesc;
            Number number = this.paramDur;
            StringBuilder d11 = C3660k.d("PutServerTimingMetricAction(paramName=", str, ", paramDesc=", str2, ", paramDur=");
            d11.append(number);
            d11.append(")");
            return d11.toString();
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002*+B]\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b!\u0010 R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b\"\u0010 R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010#\u001a\u0004\b$\u0010\u0012R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001a\u001a\u0004\b%\u0010\u001cR\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u001a\u001a\u0004\b&\u0010\u001cR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010'\u001a\u0004\b(\u0010)¨\u0006,"}, d2 = {"Lru/ozon/app/android/video/player/performance/metricsManager/VideoPerfMetricAction$PutVideoPlaybackMetricAction;", "Lru/ozon/app/android/video/player/performance/metricsManager/VideoPerfMetricAction;", "", "index", "stallCount", "", "stallDuration", "startupTime", "viewTime", "", "productType", "otherErrorCount", "startupFailedCount", "Lru/ozon/app/android/video/player/performance/metricsManager/VideoPerfMetricAction$PutVideoPlaybackMetricAction$ErrorDetails;", "errorDetails", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lru/ozon/app/android/video/player/performance/metricsManager/VideoPerfMetricAction$PutVideoPlaybackMetricAction$ErrorDetails;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "getIndex", "()Ljava/lang/Integer;", "getStallCount", "Ljava/lang/Double;", "getStallDuration", "()Ljava/lang/Double;", "getStartupTime", "getViewTime", "Ljava/lang/String;", "getProductType", "getOtherErrorCount", "getStartupFailedCount", "Lru/ozon/app/android/video/player/performance/metricsManager/VideoPerfMetricAction$PutVideoPlaybackMetricAction$ErrorDetails;", "getErrorDetails", "()Lru/ozon/app/android/video/player/performance/metricsManager/VideoPerfMetricAction$PutVideoPlaybackMetricAction$ErrorDetails;", "Companion", "ErrorDetails", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PutVideoPlaybackMetricAction extends VideoPerfMetricAction {

        @NotNull
        private final ErrorDetails errorDetails;
        private final Integer index;
        private final Integer otherErrorCount;

        @NotNull
        private final String productType;
        private final Integer stallCount;
        private final Double stallDuration;
        private final Integer startupFailedCount;
        private final Double startupTime;
        private final Double viewTime;

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0087\b\u0018\u0000 \u00192\u00020\u0001:\u0002\u0019\u001aB!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u000eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0007\u0010\u0018¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/video/player/performance/metricsManager/VideoPerfMetricAction$PutVideoPlaybackMetricAction$ErrorDetails;", "", "", "count", "Lru/ozon/app/android/video/player/performance/metricsManager/VideoPerfMetricAction$PutVideoPlaybackMetricAction$ErrorDetails$FatalErrorType;", "fatalErrorType", "", "isTimeoutError", "<init>", "(ILru/ozon/app/android/video/player/performance/metricsManager/VideoPerfMetricAction$PutVideoPlaybackMetricAction$ErrorDetails$FatalErrorType;Z)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getCount", "Lru/ozon/app/android/video/player/performance/metricsManager/VideoPerfMetricAction$PutVideoPlaybackMetricAction$ErrorDetails$FatalErrorType;", "getFatalErrorType", "()Lru/ozon/app/android/video/player/performance/metricsManager/VideoPerfMetricAction$PutVideoPlaybackMetricAction$ErrorDetails$FatalErrorType;", "Z", "()Z", "Companion", "FatalErrorType", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        /* loaded from: classes2.dex */
        public static final /* data */ class ErrorDetails {

            /* renamed from: Companion, reason: from kotlin metadata */
            @NotNull
            public static final Companion INSTANCE = new Companion(null);
            private final int count;
            private final FatalErrorType fatalErrorType;
            private final boolean isTimeoutError;

            @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lru/ozon/app/android/video/player/performance/metricsManager/VideoPerfMetricAction$PutVideoPlaybackMetricAction$ErrorDetails$Companion;", "", "<init>", "()V", "TIMEOUT_BARRIER_SECONDS", "", "isTimeoutError", "", "startupDuration", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final boolean isTimeoutError(double startupDuration) {
                    return startupDuration >= 5.0d;
                }

                private Companion() {
                }
            }

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/video/player/performance/metricsManager/VideoPerfMetricAction$PutVideoPlaybackMetricAction$ErrorDetails$FatalErrorType;", "", "<init>", "(Ljava/lang/String;I)V", "NETWORK_ERROR", "DECODING_ERROR", "OTHER_ERROR", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class FatalErrorType {
                private static final /* synthetic */ a $ENTRIES;
                private static final /* synthetic */ FatalErrorType[] $VALUES;
                public static final FatalErrorType NETWORK_ERROR = new FatalErrorType("NETWORK_ERROR", 0);
                public static final FatalErrorType DECODING_ERROR = new FatalErrorType("DECODING_ERROR", 1);
                public static final FatalErrorType OTHER_ERROR = new FatalErrorType("OTHER_ERROR", 2);

                private static final /* synthetic */ FatalErrorType[] $values() {
                    return new FatalErrorType[]{NETWORK_ERROR, DECODING_ERROR, OTHER_ERROR};
                }

                static {
                    FatalErrorType[] $values = $values();
                    $VALUES = $values;
                    $ENTRIES = b.a($values);
                }

                private FatalErrorType(String str, int i11) {
                }

                public static FatalErrorType valueOf(String str) {
                    return (FatalErrorType) Enum.valueOf(FatalErrorType.class, str);
                }

                public static FatalErrorType[] values() {
                    return (FatalErrorType[]) $VALUES.clone();
                }
            }

            public ErrorDetails(int i11, FatalErrorType fatalErrorType, boolean z11) {
                this.count = i11;
                this.fatalErrorType = fatalErrorType;
                this.isTimeoutError = z11;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ErrorDetails)) {
                    return false;
                }
                ErrorDetails errorDetails = (ErrorDetails) other;
                return this.count == errorDetails.count && this.fatalErrorType == errorDetails.fatalErrorType && this.isTimeoutError == errorDetails.isTimeoutError;
            }

            public final int getCount() {
                return this.count;
            }

            public final FatalErrorType getFatalErrorType() {
                return this.fatalErrorType;
            }

            public int hashCode() {
                int hashCode = Integer.hashCode(this.count) * 31;
                FatalErrorType fatalErrorType = this.fatalErrorType;
                return Boolean.hashCode(this.isTimeoutError) + ((hashCode + (fatalErrorType == null ? 0 : fatalErrorType.hashCode())) * 31);
            }

            /* renamed from: isTimeoutError, reason: from getter */
            public final boolean getIsTimeoutError() {
                return this.isTimeoutError;
            }

            @NotNull
            public String toString() {
                int i11 = this.count;
                FatalErrorType fatalErrorType = this.fatalErrorType;
                boolean z11 = this.isTimeoutError;
                StringBuilder sb2 = new StringBuilder("ErrorDetails(count=");
                sb2.append(i11);
                sb2.append(", fatalErrorType=");
                sb2.append(fatalErrorType);
                sb2.append(", isTimeoutError=");
                return Pk0.a.a(")", sb2, z11);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PutVideoPlaybackMetricAction(Integer num, Integer num2, Double d11, Double d12, Double d13, @NotNull String productType, Integer num3, Integer num4, @NotNull ErrorDetails errorDetails) {
            super(null);
            Intrinsics.checkNotNullParameter(productType, "productType");
            Intrinsics.checkNotNullParameter(errorDetails, "errorDetails");
            this.index = num;
            this.stallCount = num2;
            this.stallDuration = d11;
            this.startupTime = d12;
            this.viewTime = d13;
            this.productType = productType;
            this.otherErrorCount = num3;
            this.startupFailedCount = num4;
            this.errorDetails = errorDetails;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PutVideoPlaybackMetricAction)) {
                return false;
            }
            PutVideoPlaybackMetricAction putVideoPlaybackMetricAction = (PutVideoPlaybackMetricAction) other;
            return Intrinsics.d(this.index, putVideoPlaybackMetricAction.index) && Intrinsics.d(this.stallCount, putVideoPlaybackMetricAction.stallCount) && Intrinsics.d(this.stallDuration, putVideoPlaybackMetricAction.stallDuration) && Intrinsics.d(this.startupTime, putVideoPlaybackMetricAction.startupTime) && Intrinsics.d(this.viewTime, putVideoPlaybackMetricAction.viewTime) && Intrinsics.d(this.productType, putVideoPlaybackMetricAction.productType) && Intrinsics.d(this.otherErrorCount, putVideoPlaybackMetricAction.otherErrorCount) && Intrinsics.d(this.startupFailedCount, putVideoPlaybackMetricAction.startupFailedCount) && Intrinsics.d(this.errorDetails, putVideoPlaybackMetricAction.errorDetails);
        }

        @NotNull
        public final ErrorDetails getErrorDetails() {
            return this.errorDetails;
        }

        public final Integer getIndex() {
            return this.index;
        }

        public final Integer getOtherErrorCount() {
            return this.otherErrorCount;
        }

        @NotNull
        public final String getProductType() {
            return this.productType;
        }

        public final Integer getStallCount() {
            return this.stallCount;
        }

        public final Double getStallDuration() {
            return this.stallDuration;
        }

        public final Integer getStartupFailedCount() {
            return this.startupFailedCount;
        }

        public final Double getStartupTime() {
            return this.startupTime;
        }

        public final Double getViewTime() {
            return this.viewTime;
        }

        public int hashCode() {
            Integer num = this.index;
            int hashCode = (num == null ? 0 : num.hashCode()) * 31;
            Integer num2 = this.stallCount;
            int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
            Double d11 = this.stallDuration;
            int hashCode3 = (hashCode2 + (d11 == null ? 0 : d11.hashCode())) * 31;
            Double d12 = this.startupTime;
            int hashCode4 = (hashCode3 + (d12 == null ? 0 : d12.hashCode())) * 31;
            Double d13 = this.viewTime;
            int a11 = g.a((hashCode4 + (d13 == null ? 0 : d13.hashCode())) * 31, 31, this.productType);
            Integer num3 = this.otherErrorCount;
            int hashCode5 = (a11 + (num3 == null ? 0 : num3.hashCode())) * 31;
            Integer num4 = this.startupFailedCount;
            return this.errorDetails.hashCode() + ((hashCode5 + (num4 != null ? num4.hashCode() : 0)) * 31);
        }

        @NotNull
        public String toString() {
            Integer num = this.index;
            Integer num2 = this.stallCount;
            Double d11 = this.stallDuration;
            Double d12 = this.startupTime;
            Double d13 = this.viewTime;
            String str = this.productType;
            Integer num3 = this.otherErrorCount;
            Integer num4 = this.startupFailedCount;
            ErrorDetails errorDetails = this.errorDetails;
            StringBuilder f7 = c.f("PutVideoPlaybackMetricAction(index=", ", stallCount=", num, num2, ", stallDuration=");
            f7.append(d11);
            f7.append(", startupTime=");
            f7.append(d12);
            f7.append(", viewTime=");
            f7.append(d13);
            f7.append(", productType=");
            f7.append(str);
            f7.append(", otherErrorCount=");
            Ef0.c.e(f7, num3, ", startupFailedCount=", num4, ", errorDetails=");
            f7.append(errorDetails);
            f7.append(")");
            return f7.toString();
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/video/player/performance/metricsManager/VideoPerfMetricAction$SendAwaitMetricsManually;", "Lru/ozon/app/android/video/player/performance/metricsManager/VideoPerfMetricAction;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SendAwaitMetricsManually extends VideoPerfMetricAction {

        @NotNull
        public static final SendAwaitMetricsManually INSTANCE = new SendAwaitMetricsManually();

        private SendAwaitMetricsManually() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof SendAwaitMetricsManually);
        }

        public int hashCode() {
            return -12855491;
        }

        @NotNull
        public String toString() {
            return "SendAwaitMetricsManually";
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lru/ozon/app/android/video/player/performance/metricsManager/VideoPerfMetricAction$SendMetricsAction;", "Lru/ozon/app/android/video/player/performance/metricsManager/VideoPerfMetricAction;", "Lru/ozon/app/android/video/player/performance/VideoTraceEntity;", "videoTraceEntity", "Lru/ozon/app/android/video/player/performance/metricsManager/VideoPerfMetricAction$PutVideoPlaybackMetricAction;", "playbackMetrics", "Lru/ozon/app/android/video/player/performance/PlayerNamespace;", "playerNamespace", "<init>", "(Lru/ozon/app/android/video/player/performance/VideoTraceEntity;Lru/ozon/app/android/video/player/performance/metricsManager/VideoPerfMetricAction$PutVideoPlaybackMetricAction;Lru/ozon/app/android/video/player/performance/PlayerNamespace;)V", "", "isStartupFailed", "()Z", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/video/player/performance/VideoTraceEntity;", "getVideoTraceEntity", "()Lru/ozon/app/android/video/player/performance/VideoTraceEntity;", "Lru/ozon/app/android/video/player/performance/metricsManager/VideoPerfMetricAction$PutVideoPlaybackMetricAction;", "getPlaybackMetrics", "()Lru/ozon/app/android/video/player/performance/metricsManager/VideoPerfMetricAction$PutVideoPlaybackMetricAction;", "Lru/ozon/app/android/video/player/performance/PlayerNamespace;", "getPlayerNamespace", "()Lru/ozon/app/android/video/player/performance/PlayerNamespace;", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SendMetricsAction extends VideoPerfMetricAction {

        @NotNull
        private final PutVideoPlaybackMetricAction playbackMetrics;

        @NotNull
        private final PlayerNamespace playerNamespace;

        @NotNull
        private final VideoTraceEntity videoTraceEntity;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SendMetricsAction(@NotNull VideoTraceEntity videoTraceEntity, @NotNull PutVideoPlaybackMetricAction playbackMetrics, @NotNull PlayerNamespace playerNamespace) {
            super(null);
            Intrinsics.checkNotNullParameter(videoTraceEntity, "videoTraceEntity");
            Intrinsics.checkNotNullParameter(playbackMetrics, "playbackMetrics");
            Intrinsics.checkNotNullParameter(playerNamespace, "playerNamespace");
            this.videoTraceEntity = videoTraceEntity;
            this.playbackMetrics = playbackMetrics;
            this.playerNamespace = playerNamespace;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SendMetricsAction)) {
                return false;
            }
            SendMetricsAction sendMetricsAction = (SendMetricsAction) other;
            return Intrinsics.d(this.videoTraceEntity, sendMetricsAction.videoTraceEntity) && Intrinsics.d(this.playbackMetrics, sendMetricsAction.playbackMetrics) && this.playerNamespace == sendMetricsAction.playerNamespace;
        }

        @NotNull
        public final PutVideoPlaybackMetricAction getPlaybackMetrics() {
            return this.playbackMetrics;
        }

        @NotNull
        public final VideoTraceEntity getVideoTraceEntity() {
            return this.videoTraceEntity;
        }

        public int hashCode() {
            return this.playerNamespace.hashCode() + ((this.playbackMetrics.hashCode() + (this.videoTraceEntity.hashCode() * 31)) * 31);
        }

        public final boolean isStartupFailed() {
            Integer startupFailedCount = this.playbackMetrics.getStartupFailedCount();
            return startupFailedCount != null && startupFailedCount.intValue() > 0;
        }

        @NotNull
        public String toString() {
            return "SendMetricsAction(videoTraceEntity=" + this.videoTraceEntity + ", playbackMetrics=" + this.playbackMetrics + ", playerNamespace=" + this.playerNamespace + ")";
        }
    }

    public /* synthetic */ VideoPerfMetricAction(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private VideoPerfMetricAction() {
    }
}
