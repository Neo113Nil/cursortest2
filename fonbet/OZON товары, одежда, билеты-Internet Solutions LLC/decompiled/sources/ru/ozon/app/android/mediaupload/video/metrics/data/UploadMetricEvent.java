package ru.ozon.app.android.mediaupload.video.metrics.data;

import B0.A0;
import B0.C2454a;
import E0.C2942q;
import G.g;
import H3.c;
import Kk.C3532b;
import Lh.b;
import Sc.o;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000 \u00042\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\t\n\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/mediaupload/video/metrics/data/UploadMetricEvent;", "", "<init>", "()V", "Companion", "UploadStep", "InitStep", "FinishStep", "EventType", "Lru/ozon/app/android/mediaupload/video/metrics/data/UploadMetricEvent$FinishStep;", "Lru/ozon/app/android/mediaupload/video/metrics/data/UploadMetricEvent$InitStep;", "Lru/ozon/app/android/mediaupload/video/metrics/data/UploadMetricEvent$UploadStep;", "mediaupload_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class UploadMetricEvent {

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005\u0082\u0001\u0004\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/mediaupload/video/metrics/data/UploadMetricEvent$EventType;", "", "<init>", "()V", "getEventTypeName", "", "CreateUploadId", "Validate", "UploadV2", "CheckUpload", "Lru/ozon/app/android/mediaupload/video/metrics/data/UploadMetricEvent$EventType$CheckUpload;", "Lru/ozon/app/android/mediaupload/video/metrics/data/UploadMetricEvent$EventType$CreateUploadId;", "Lru/ozon/app/android/mediaupload/video/metrics/data/UploadMetricEvent$EventType$UploadV2;", "Lru/ozon/app/android/mediaupload/video/metrics/data/UploadMetricEvent$EventType$Validate;", "mediaupload_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class EventType {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/mediaupload/video/metrics/data/UploadMetricEvent$EventType$CheckUpload;", "Lru/ozon/app/android/mediaupload/video/metrics/data/UploadMetricEvent$EventType;", "", "", "rawServerTimings", "<init>", "(Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getRawServerTimings", "()Ljava/util/List;", "mediaupload_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class CheckUpload extends EventType {

            @NotNull
            private final List<String> rawServerTimings;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CheckUpload(@NotNull List<String> rawServerTimings) {
                super(null);
                Intrinsics.checkNotNullParameter(rawServerTimings, "rawServerTimings");
                this.rawServerTimings = rawServerTimings;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof CheckUpload) && Intrinsics.d(this.rawServerTimings, ((CheckUpload) other).rawServerTimings);
            }

            @NotNull
            public final List<String> getRawServerTimings() {
                return this.rawServerTimings;
            }

            public int hashCode() {
                return this.rawServerTimings.hashCode();
            }

            @NotNull
            public String toString() {
                return c.a("CheckUpload(rawServerTimings=", ")", this.rawServerTimings);
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0007¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/mediaupload/video/metrics/data/UploadMetricEvent$EventType$CreateUploadId;", "Lru/ozon/app/android/mediaupload/video/metrics/data/UploadMetricEvent$EventType;", "", "uploadId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUploadId", "mediaupload_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class CreateUploadId extends EventType {
            private final String uploadId;

            public CreateUploadId(String str) {
                super(null);
                this.uploadId = str;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof CreateUploadId) && Intrinsics.d(this.uploadId, ((CreateUploadId) other).uploadId);
            }

            public final String getUploadId() {
                return this.uploadId;
            }

            public int hashCode() {
                String str = this.uploadId;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            @NotNull
            public String toString() {
                return A0.b("CreateUploadId(uploadId=", this.uploadId, ")");
            }
        }

        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/mediaupload/video/metrics/data/UploadMetricEvent$EventType$UploadV2;", "Lru/ozon/app/android/mediaupload/video/metrics/data/UploadMetricEvent$EventType;", "", "requestContentLength", "", "", "rawServerTimings", "<init>", "(JLjava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getRequestContentLength", "()J", "Ljava/util/List;", "getRawServerTimings", "()Ljava/util/List;", "mediaupload_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class UploadV2 extends EventType {

            @NotNull
            private final List<String> rawServerTimings;
            private final long requestContentLength;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public UploadV2(long j11, @NotNull List<String> rawServerTimings) {
                super(null);
                Intrinsics.checkNotNullParameter(rawServerTimings, "rawServerTimings");
                this.requestContentLength = j11;
                this.rawServerTimings = rawServerTimings;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof UploadV2)) {
                    return false;
                }
                UploadV2 uploadV2 = (UploadV2) other;
                return this.requestContentLength == uploadV2.requestContentLength && Intrinsics.d(this.rawServerTimings, uploadV2.rawServerTimings);
            }

            @NotNull
            public final List<String> getRawServerTimings() {
                return this.rawServerTimings;
            }

            public final long getRequestContentLength() {
                return this.requestContentLength;
            }

            public int hashCode() {
                return this.rawServerTimings.hashCode() + (Long.hashCode(this.requestContentLength) * 31);
            }

            @NotNull
            public String toString() {
                StringBuilder b11 = b.b(this.requestContentLength, "UploadV2(requestContentLength=", ", rawServerTimings=", this.rawServerTimings);
                b11.append(")");
                return b11.toString();
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/mediaupload/video/metrics/data/UploadMetricEvent$EventType$Validate;", "Lru/ozon/app/android/mediaupload/video/metrics/data/UploadMetricEvent$EventType;", "", "requestContentLength", "<init>", "(J)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getRequestContentLength", "()J", "mediaupload_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Validate extends EventType {
            private final long requestContentLength;

            public Validate(long j11) {
                super(null);
                this.requestContentLength = j11;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Validate) && this.requestContentLength == ((Validate) other).requestContentLength;
            }

            public final long getRequestContentLength() {
                return this.requestContentLength;
            }

            public int hashCode() {
                return Long.hashCode(this.requestContentLength);
            }

            @NotNull
            public String toString() {
                return Sh.b.b(this.requestContentLength, "Validate(requestContentLength=", ")");
            }
        }

        public /* synthetic */ EventType(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String getEventTypeName() {
            if (this instanceof CreateUploadId) {
                return "Create";
            }
            if (this instanceof CheckUpload) {
                return "CheckUploaded";
            }
            if (this instanceof UploadV2) {
                return "UploadV2";
            }
            if (this instanceof Validate) {
                return "Validate";
            }
            throw new o();
        }

        private EventType() {
        }
    }

    public /* synthetic */ UploadMetricEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0005\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0006\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/mediaupload/video/metrics/data/UploadMetricEvent$FinishStep;", "Lru/ozon/app/android/mediaupload/video/metrics/data/UploadMetricEvent;", "", "endMs", "", "isFinished", "isCanceled", "<init>", "(JZZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getEndMs", "()J", "Z", "()Z", "mediaupload_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FinishStep extends UploadMetricEvent {
        private final long endMs;
        private final boolean isCanceled;
        private final boolean isFinished;

        public /* synthetic */ FinishStep(long j11, boolean z11, boolean z12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? System.currentTimeMillis() : j11, z11, z12);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FinishStep)) {
                return false;
            }
            FinishStep finishStep = (FinishStep) other;
            return this.endMs == finishStep.endMs && this.isFinished == finishStep.isFinished && this.isCanceled == finishStep.isCanceled;
        }

        public final long getEndMs() {
            return this.endMs;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isCanceled) + C3532b.a(Long.hashCode(this.endMs) * 31, 31, this.isFinished);
        }

        /* renamed from: isCanceled, reason: from getter */
        public final boolean getIsCanceled() {
            return this.isCanceled;
        }

        /* renamed from: isFinished, reason: from getter */
        public final boolean getIsFinished() {
            return this.isFinished;
        }

        @NotNull
        public String toString() {
            long j11 = this.endMs;
            boolean z11 = this.isFinished;
            return Bi.b.f(Bl.b.c(j11, "FinishStep(endMs=", ", isFinished=", z11), ", isCanceled=", this.isCanceled, ")");
        }

        public FinishStep(long j11, boolean z11, boolean z12) {
            super(null);
            this.endMs = j11;
            this.isFinished = z11;
            this.isCanceled = z12;
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/mediaupload/video/metrics/data/UploadMetricEvent$InitStep;", "Lru/ozon/app/android/mediaupload/video/metrics/data/UploadMetricEvent;", "", "videoType", "", "startMs", "<init>", "(Ljava/lang/String;J)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getVideoType", "J", "getStartMs", "()J", "mediaupload_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InitStep extends UploadMetricEvent {
        private final long startMs;

        @NotNull
        private final String videoType;

        public /* synthetic */ InitStep(String str, long j11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i11 & 2) != 0 ? System.currentTimeMillis() : j11);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InitStep)) {
                return false;
            }
            InitStep initStep = (InitStep) other;
            return Intrinsics.d(this.videoType, initStep.videoType) && this.startMs == initStep.startMs;
        }

        public final long getStartMs() {
            return this.startMs;
        }

        @NotNull
        public final String getVideoType() {
            return this.videoType;
        }

        public int hashCode() {
            return Long.hashCode(this.startMs) + (this.videoType.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            StringBuilder d11 = C2942q.d(this.startMs, "InitStep(videoType=", this.videoType, ", startMs=");
            d11.append(")");
            return d11.toString();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InitStep(@NotNull String videoType, long j11) {
            super(null);
            Intrinsics.checkNotNullParameter(videoType, "videoType");
            this.videoType = videoType;
            this.startMs = j11;
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\u0013R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b$\u0010\u0015R\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\n\u0010 \u001a\u0004\b%\u0010\"¨\u0006&"}, d2 = {"Lru/ozon/app/android/mediaupload/video/metrics/data/UploadMetricEvent$UploadStep;", "Lru/ozon/app/android/mediaupload/video/metrics/data/UploadMetricEvent;", "Lru/ozon/app/android/mediaupload/video/metrics/data/UploadMetricEvent$EventType;", "eventType", "", "uploadRequestId", "", "startMs", "", "responseCode", "endMs", "<init>", "(Lru/ozon/app/android/mediaupload/video/metrics/data/UploadMetricEvent$EventType;Ljava/lang/String;JIJ)V", "getRequestContentLength", "()Ljava/lang/Long;", "", "getRawServerTimings", "()Ljava/util/List;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/mediaupload/video/metrics/data/UploadMetricEvent$EventType;", "getEventType", "()Lru/ozon/app/android/mediaupload/video/metrics/data/UploadMetricEvent$EventType;", "Ljava/lang/String;", "getUploadRequestId", "J", "getStartMs", "()J", "I", "getResponseCode", "getEndMs", "mediaupload_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class UploadStep extends UploadMetricEvent {
        private final long endMs;

        @NotNull
        private final EventType eventType;
        private final int responseCode;
        private final long startMs;

        @NotNull
        private final String uploadRequestId;

        public /* synthetic */ UploadStep(EventType eventType, String str, long j11, int i11, long j12, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(eventType, str, j11, i11, (i12 & 16) != 0 ? System.currentTimeMillis() : j12);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UploadStep)) {
                return false;
            }
            UploadStep uploadStep = (UploadStep) other;
            return Intrinsics.d(this.eventType, uploadStep.eventType) && Intrinsics.d(this.uploadRequestId, uploadStep.uploadRequestId) && this.startMs == uploadStep.startMs && this.responseCode == uploadStep.responseCode && this.endMs == uploadStep.endMs;
        }

        public final long getEndMs() {
            return this.endMs;
        }

        @NotNull
        public final EventType getEventType() {
            return this.eventType;
        }

        public final List<String> getRawServerTimings() {
            EventType eventType = this.eventType;
            if (eventType instanceof EventType.CheckUpload) {
                return ((EventType.CheckUpload) eventType).getRawServerTimings();
            }
            if (eventType instanceof EventType.UploadV2) {
                return ((EventType.UploadV2) eventType).getRawServerTimings();
            }
            return null;
        }

        public final Long getRequestContentLength() {
            EventType eventType = this.eventType;
            if (eventType instanceof EventType.UploadV2) {
                return Long.valueOf(((EventType.UploadV2) eventType).getRequestContentLength());
            }
            if (eventType instanceof EventType.Validate) {
                return Long.valueOf(((EventType.Validate) eventType).getRequestContentLength());
            }
            return null;
        }

        public final int getResponseCode() {
            return this.responseCode;
        }

        public final long getStartMs() {
            return this.startMs;
        }

        @NotNull
        public final String getUploadRequestId() {
            return this.uploadRequestId;
        }

        public int hashCode() {
            return Long.hashCode(this.endMs) + C2454a.a(this.responseCode, Pk0.c.a(g.a(this.eventType.hashCode() * 31, 31, this.uploadRequestId), 31, this.startMs), 31);
        }

        @NotNull
        public String toString() {
            return "UploadStep(eventType=" + this.eventType + ", uploadRequestId=" + this.uploadRequestId + ", startMs=" + this.startMs + ", responseCode=" + this.responseCode + ", endMs=" + this.endMs + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UploadStep(@NotNull EventType eventType, @NotNull String uploadRequestId, long j11, int i11, long j12) {
            super(null);
            Intrinsics.checkNotNullParameter(eventType, "eventType");
            Intrinsics.checkNotNullParameter(uploadRequestId, "uploadRequestId");
            this.eventType = eventType;
            this.uploadRequestId = uploadRequestId;
            this.startMs = j11;
            this.responseCode = i11;
            this.endMs = j12;
        }
    }

    private UploadMetricEvent() {
    }
}
