package ru.ozon.app.android.mediaupload.video.metrics.data;

import B0.C2454a;
import B90.C2618u;
import E0.C2942q;
import G.g;
import Kk.C3532b;
import N3.C3660k;
import Nh.a;
import Pk0.c;
import Pk0.f;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u00010Be\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\fHÆ\u0003J\t\u0010(\u001a\u00020\fHÆ\u0003J\u000f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fHÆ\u0003J}\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fHÆ\u0001J\u0013\u0010+\u001a\u00020\f2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020.HÖ\u0001J\t\u0010/\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u001cR\u0011\u0010\r\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u001cR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u00061"}, d2 = {"Lru/ozon/app/android/mediaupload/video/metrics/data/UploadMetricsRequestBody;", "", "uploadID", "", "uploadProcessId", "clientName", "clientVersion", "clientTeam", "videoType", "domain", "path", "isFinished", "", "isCanceled", "events", "", "Lru/ozon/app/android/mediaupload/video/metrics/data/UploadMetricsRequestBody$Event;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/util/List;)V", "getUploadID", "()Ljava/lang/String;", "getUploadProcessId", "getClientName", "getClientVersion", "getClientTeam", "getVideoType", "getDomain", "getPath", "()Z", "getEvents", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "other", "hashCode", "", "toString", "Event", "mediaupload_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class UploadMetricsRequestBody {

    @NotNull
    private final String clientName;

    @NotNull
    private final String clientTeam;

    @NotNull
    private final String clientVersion;

    @NotNull
    private final String domain;

    @NotNull
    private final List<Event> events;
    private final boolean isCanceled;
    private final boolean isFinished;

    @NotNull
    private final String path;

    @NotNull
    private final String uploadID;

    @NotNull
    private final String uploadProcessId;

    @NotNull
    private final String videoType;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0001+BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0006HÆ\u0003J\t\u0010 \u001a\u00020\u0006HÆ\u0003J\u0010\u0010!\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0017J\t\u0010\"\u001a\u00020\nHÆ\u0003J\u0011\u0010#\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003J^\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\n2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0001¢\u0006\u0002\u0010%J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020\nHÖ\u0001J\t\u0010*\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006,"}, d2 = {"Lru/ozon/app/android/mediaupload/video/metrics/data/UploadMetricsRequestBody$Event;", "", "eventType", "", "uploadRequestId", "start", "", "end", "size", "responseCode", "", "serverTimings", "", "Lru/ozon/app/android/mediaupload/video/metrics/data/UploadMetricsRequestBody$Event$ServerTiming;", "<init>", "(Ljava/lang/String;Ljava/lang/String;JJLjava/lang/Long;ILjava/util/List;)V", "getEventType", "()Ljava/lang/String;", "getUploadRequestId", "getStart", "()J", "getEnd", "getSize", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getResponseCode", "()I", "getServerTimings", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;JJLjava/lang/Long;ILjava/util/List;)Lru/ozon/app/android/mediaupload/video/metrics/data/UploadMetricsRequestBody$Event;", "equals", "", "other", "hashCode", "toString", "ServerTiming", "mediaupload_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class Event {
        private final long end;

        @NotNull
        private final String eventType;
        private final int responseCode;
        private final List<ServerTiming> serverTimings;
        private final Long size;
        private final long start;

        @NotNull
        private final String uploadRequestId;

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\rJ>\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u000f\u0010\rR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0010\u0010\r¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/mediaupload/video/metrics/data/UploadMetricsRequestBody$Event$ServerTiming;", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "start", "", "timestamp", "transferred", "<init>", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)V", "getName", "()Ljava/lang/String;", "getStart", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getTimestamp", "getTransferred", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)Lru/ozon/app/android/mediaupload/video/metrics/data/UploadMetricsRequestBody$Event$ServerTiming;", "equals", "", "other", "hashCode", "", "toString", "mediaupload_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ServerTiming {
            private final String name;
            private final Long start;
            private final Long timestamp;
            private final Long transferred;

            public ServerTiming(String str, Long l11, Long l12, Long l13) {
                this.name = str;
                this.start = l11;
                this.timestamp = l12;
                this.transferred = l13;
            }

            public static /* synthetic */ ServerTiming copy$default(ServerTiming serverTiming, String str, Long l11, Long l12, Long l13, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = serverTiming.name;
                }
                if ((i11 & 2) != 0) {
                    l11 = serverTiming.start;
                }
                if ((i11 & 4) != 0) {
                    l12 = serverTiming.timestamp;
                }
                if ((i11 & 8) != 0) {
                    l13 = serverTiming.transferred;
                }
                return serverTiming.copy(str, l11, l12, l13);
            }

            /* renamed from: component1, reason: from getter */
            public final String getName() {
                return this.name;
            }

            /* renamed from: component2, reason: from getter */
            public final Long getStart() {
                return this.start;
            }

            /* renamed from: component3, reason: from getter */
            public final Long getTimestamp() {
                return this.timestamp;
            }

            /* renamed from: component4, reason: from getter */
            public final Long getTransferred() {
                return this.transferred;
            }

            @NotNull
            public final ServerTiming copy(String name, Long start, Long timestamp, Long transferred) {
                return new ServerTiming(name, start, timestamp, transferred);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ServerTiming)) {
                    return false;
                }
                ServerTiming serverTiming = (ServerTiming) other;
                return Intrinsics.d(this.name, serverTiming.name) && Intrinsics.d(this.start, serverTiming.start) && Intrinsics.d(this.timestamp, serverTiming.timestamp) && Intrinsics.d(this.transferred, serverTiming.transferred);
            }

            public final String getName() {
                return this.name;
            }

            public final Long getStart() {
                return this.start;
            }

            public final Long getTimestamp() {
                return this.timestamp;
            }

            public final Long getTransferred() {
                return this.transferred;
            }

            public int hashCode() {
                String str = this.name;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                Long l11 = this.start;
                int hashCode2 = (hashCode + (l11 == null ? 0 : l11.hashCode())) * 31;
                Long l12 = this.timestamp;
                int hashCode3 = (hashCode2 + (l12 == null ? 0 : l12.hashCode())) * 31;
                Long l13 = this.transferred;
                return hashCode3 + (l13 != null ? l13.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                return "ServerTiming(name=" + this.name + ", start=" + this.start + ", timestamp=" + this.timestamp + ", transferred=" + this.transferred + ")";
            }
        }

        public Event(@NotNull String eventType, @NotNull String uploadRequestId, long j11, long j12, Long l11, int i11, List<ServerTiming> list) {
            Intrinsics.checkNotNullParameter(eventType, "eventType");
            Intrinsics.checkNotNullParameter(uploadRequestId, "uploadRequestId");
            this.eventType = eventType;
            this.uploadRequestId = uploadRequestId;
            this.start = j11;
            this.end = j12;
            this.size = l11;
            this.responseCode = i11;
            this.serverTimings = list;
        }

        public static /* synthetic */ Event copy$default(Event event, String str, String str2, long j11, long j12, Long l11, int i11, List list, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = event.eventType;
            }
            if ((i12 & 2) != 0) {
                str2 = event.uploadRequestId;
            }
            if ((i12 & 4) != 0) {
                j11 = event.start;
            }
            if ((i12 & 8) != 0) {
                j12 = event.end;
            }
            if ((i12 & 16) != 0) {
                l11 = event.size;
            }
            if ((i12 & 32) != 0) {
                i11 = event.responseCode;
            }
            if ((i12 & 64) != 0) {
                list = event.serverTimings;
            }
            List list2 = list;
            Long l12 = l11;
            long j13 = j12;
            long j14 = j11;
            return event.copy(str, str2, j14, j13, l12, i11, list2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getEventType() {
            return this.eventType;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getUploadRequestId() {
            return this.uploadRequestId;
        }

        /* renamed from: component3, reason: from getter */
        public final long getStart() {
            return this.start;
        }

        /* renamed from: component4, reason: from getter */
        public final long getEnd() {
            return this.end;
        }

        /* renamed from: component5, reason: from getter */
        public final Long getSize() {
            return this.size;
        }

        /* renamed from: component6, reason: from getter */
        public final int getResponseCode() {
            return this.responseCode;
        }

        public final List<ServerTiming> component7() {
            return this.serverTimings;
        }

        @NotNull
        public final Event copy(@NotNull String eventType, @NotNull String uploadRequestId, long start, long end, Long size, int responseCode, List<ServerTiming> serverTimings) {
            Intrinsics.checkNotNullParameter(eventType, "eventType");
            Intrinsics.checkNotNullParameter(uploadRequestId, "uploadRequestId");
            return new Event(eventType, uploadRequestId, start, end, size, responseCode, serverTimings);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Event)) {
                return false;
            }
            Event event = (Event) other;
            return Intrinsics.d(this.eventType, event.eventType) && Intrinsics.d(this.uploadRequestId, event.uploadRequestId) && this.start == event.start && this.end == event.end && Intrinsics.d(this.size, event.size) && this.responseCode == event.responseCode && Intrinsics.d(this.serverTimings, event.serverTimings);
        }

        public final long getEnd() {
            return this.end;
        }

        @NotNull
        public final String getEventType() {
            return this.eventType;
        }

        public final int getResponseCode() {
            return this.responseCode;
        }

        public final List<ServerTiming> getServerTimings() {
            return this.serverTimings;
        }

        public final Long getSize() {
            return this.size;
        }

        public final long getStart() {
            return this.start;
        }

        @NotNull
        public final String getUploadRequestId() {
            return this.uploadRequestId;
        }

        public int hashCode() {
            int a11 = c.a(c.a(g.a(this.eventType.hashCode() * 31, 31, this.uploadRequestId), 31, this.start), 31, this.end);
            Long l11 = this.size;
            int a12 = C2454a.a(this.responseCode, (a11 + (l11 == null ? 0 : l11.hashCode())) * 31, 31);
            List<ServerTiming> list = this.serverTimings;
            return a12 + (list != null ? list.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.eventType;
            String str2 = this.uploadRequestId;
            long j11 = this.start;
            long j12 = this.end;
            Long l11 = this.size;
            int i11 = this.responseCode;
            List<ServerTiming> list = this.serverTimings;
            StringBuilder d11 = C3660k.d("Event(eventType=", str, ", uploadRequestId=", str2, ", start=");
            d11.append(j11);
            C2942q.f(d11, ", end=", j12, ", size=");
            d11.append(l11);
            d11.append(", responseCode=");
            d11.append(i11);
            d11.append(", serverTimings=");
            return C2618u.h(d11, list, ")");
        }
    }

    public UploadMetricsRequestBody(@NotNull String uploadID, @NotNull String uploadProcessId, @NotNull String clientName, @NotNull String clientVersion, @NotNull String clientTeam, @NotNull String videoType, @NotNull String domain, @NotNull String path, boolean z11, boolean z12, @NotNull List<Event> events) {
        Intrinsics.checkNotNullParameter(uploadID, "uploadID");
        Intrinsics.checkNotNullParameter(uploadProcessId, "uploadProcessId");
        Intrinsics.checkNotNullParameter(clientName, "clientName");
        Intrinsics.checkNotNullParameter(clientVersion, "clientVersion");
        Intrinsics.checkNotNullParameter(clientTeam, "clientTeam");
        Intrinsics.checkNotNullParameter(videoType, "videoType");
        Intrinsics.checkNotNullParameter(domain, "domain");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(events, "events");
        this.uploadID = uploadID;
        this.uploadProcessId = uploadProcessId;
        this.clientName = clientName;
        this.clientVersion = clientVersion;
        this.clientTeam = clientTeam;
        this.videoType = videoType;
        this.domain = domain;
        this.path = path;
        this.isFinished = z11;
        this.isCanceled = z12;
        this.events = events;
    }

    public static /* synthetic */ UploadMetricsRequestBody copy$default(UploadMetricsRequestBody uploadMetricsRequestBody, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z11, boolean z12, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = uploadMetricsRequestBody.uploadID;
        }
        if ((i11 & 2) != 0) {
            str2 = uploadMetricsRequestBody.uploadProcessId;
        }
        if ((i11 & 4) != 0) {
            str3 = uploadMetricsRequestBody.clientName;
        }
        if ((i11 & 8) != 0) {
            str4 = uploadMetricsRequestBody.clientVersion;
        }
        if ((i11 & 16) != 0) {
            str5 = uploadMetricsRequestBody.clientTeam;
        }
        if ((i11 & 32) != 0) {
            str6 = uploadMetricsRequestBody.videoType;
        }
        if ((i11 & 64) != 0) {
            str7 = uploadMetricsRequestBody.domain;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            str8 = uploadMetricsRequestBody.path;
        }
        if ((i11 & 256) != 0) {
            z11 = uploadMetricsRequestBody.isFinished;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            z12 = uploadMetricsRequestBody.isCanceled;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
            list = uploadMetricsRequestBody.events;
        }
        boolean z13 = z12;
        List list2 = list;
        String str9 = str8;
        boolean z14 = z11;
        String str10 = str6;
        String str11 = str7;
        String str12 = str5;
        String str13 = str3;
        return uploadMetricsRequestBody.copy(str, str2, str13, str4, str12, str10, str11, str9, z14, z13, list2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getUploadID() {
        return this.uploadID;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getIsCanceled() {
        return this.isCanceled;
    }

    @NotNull
    public final List<Event> component11() {
        return this.events;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getUploadProcessId() {
        return this.uploadProcessId;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getClientName() {
        return this.clientName;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getClientVersion() {
        return this.clientVersion;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getClientTeam() {
        return this.clientTeam;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getVideoType() {
        return this.videoType;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final String getDomain() {
        return this.domain;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getIsFinished() {
        return this.isFinished;
    }

    @NotNull
    public final UploadMetricsRequestBody copy(@NotNull String uploadID, @NotNull String uploadProcessId, @NotNull String clientName, @NotNull String clientVersion, @NotNull String clientTeam, @NotNull String videoType, @NotNull String domain, @NotNull String path, boolean isFinished, boolean isCanceled, @NotNull List<Event> events) {
        Intrinsics.checkNotNullParameter(uploadID, "uploadID");
        Intrinsics.checkNotNullParameter(uploadProcessId, "uploadProcessId");
        Intrinsics.checkNotNullParameter(clientName, "clientName");
        Intrinsics.checkNotNullParameter(clientVersion, "clientVersion");
        Intrinsics.checkNotNullParameter(clientTeam, "clientTeam");
        Intrinsics.checkNotNullParameter(videoType, "videoType");
        Intrinsics.checkNotNullParameter(domain, "domain");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(events, "events");
        return new UploadMetricsRequestBody(uploadID, uploadProcessId, clientName, clientVersion, clientTeam, videoType, domain, path, isFinished, isCanceled, events);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UploadMetricsRequestBody)) {
            return false;
        }
        UploadMetricsRequestBody uploadMetricsRequestBody = (UploadMetricsRequestBody) other;
        return Intrinsics.d(this.uploadID, uploadMetricsRequestBody.uploadID) && Intrinsics.d(this.uploadProcessId, uploadMetricsRequestBody.uploadProcessId) && Intrinsics.d(this.clientName, uploadMetricsRequestBody.clientName) && Intrinsics.d(this.clientVersion, uploadMetricsRequestBody.clientVersion) && Intrinsics.d(this.clientTeam, uploadMetricsRequestBody.clientTeam) && Intrinsics.d(this.videoType, uploadMetricsRequestBody.videoType) && Intrinsics.d(this.domain, uploadMetricsRequestBody.domain) && Intrinsics.d(this.path, uploadMetricsRequestBody.path) && this.isFinished == uploadMetricsRequestBody.isFinished && this.isCanceled == uploadMetricsRequestBody.isCanceled && Intrinsics.d(this.events, uploadMetricsRequestBody.events);
    }

    @NotNull
    public final String getClientName() {
        return this.clientName;
    }

    @NotNull
    public final String getClientTeam() {
        return this.clientTeam;
    }

    @NotNull
    public final String getClientVersion() {
        return this.clientVersion;
    }

    @NotNull
    public final String getDomain() {
        return this.domain;
    }

    @NotNull
    public final List<Event> getEvents() {
        return this.events;
    }

    @NotNull
    public final String getPath() {
        return this.path;
    }

    @NotNull
    public final String getUploadID() {
        return this.uploadID;
    }

    @NotNull
    public final String getUploadProcessId() {
        return this.uploadProcessId;
    }

    @NotNull
    public final String getVideoType() {
        return this.videoType;
    }

    public int hashCode() {
        return this.events.hashCode() + C3532b.a(C3532b.a(g.a(g.a(g.a(g.a(g.a(g.a(g.a(this.uploadID.hashCode() * 31, 31, this.uploadProcessId), 31, this.clientName), 31, this.clientVersion), 31, this.clientTeam), 31, this.videoType), 31, this.domain), 31, this.path), 31, this.isFinished), 31, this.isCanceled);
    }

    public final boolean isCanceled() {
        return this.isCanceled;
    }

    public final boolean isFinished() {
        return this.isFinished;
    }

    @NotNull
    public String toString() {
        String str = this.uploadID;
        String str2 = this.uploadProcessId;
        String str3 = this.clientName;
        String str4 = this.clientVersion;
        String str5 = this.clientTeam;
        String str6 = this.videoType;
        String str7 = this.domain;
        String str8 = this.path;
        boolean z11 = this.isFinished;
        boolean z12 = this.isCanceled;
        List<Event> list = this.events;
        StringBuilder d11 = C3660k.d("UploadMetricsRequestBody(uploadID=", str, ", uploadProcessId=", str2, ", clientName=");
        a.h(d11, str3, ", clientVersion=", str4, ", clientTeam=");
        a.h(d11, str5, ", videoType=", str6, ", domain=");
        a.h(d11, str7, ", path=", str8, ", isFinished=");
        f.c(", isCanceled=", ", events=", d11, z11, z12);
        return C2618u.h(d11, list, ")");
    }
}
