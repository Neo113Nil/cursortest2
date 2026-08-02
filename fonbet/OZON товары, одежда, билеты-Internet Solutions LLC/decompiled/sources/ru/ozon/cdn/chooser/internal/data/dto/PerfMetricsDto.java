package ru.ozon.cdn.chooser.internal.data.dto;

import D40.c;
import G.g;
import N3.C3660k;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.networkinfo.models.NetworkConnectionType;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0012B\u0017\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/cdn/chooser/internal/data/dto/PerfMetricsDto;", "", "events", "", "Lru/ozon/cdn/chooser/internal/data/dto/PerfMetricsDto$EventDto;", "<init>", "(Ljava/util/List;)V", "getEvents", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "EventDto", "cdn-chooser_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class PerfMetricsDto {

    @NotNull
    private final List<EventDto> events;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0001\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\t\u0010\u0016\u001a\u00020\tHÆ\u0003J=\u0010\u0017\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\u0014\b\u0003\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0003\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Lru/ozon/cdn/chooser/internal/data/dto/PerfMetricsDto$EventDto;", "", "popId", "", "imageId", "timeMetrics", "", "", "connectionType", "Lru/ozon/android/networkinfo/models/NetworkConnectionType;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lru/ozon/android/networkinfo/models/NetworkConnectionType;)V", "getPopId", "()Ljava/lang/String;", "getImageId", "getTimeMetrics", "()Ljava/util/Map;", "getConnectionType", "()Lru/ozon/android/networkinfo/models/NetworkConnectionType;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "cdn-chooser_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class EventDto {

        @NotNull
        private final NetworkConnectionType connectionType;

        @NotNull
        private final String imageId;

        @NotNull
        private final String popId;

        @NotNull
        private final Map<String, Double> timeMetrics;

        public EventDto(@i(name = "popId") @NotNull String popId, @i(name = "imageId") @NotNull String imageId, @i(name = "timeMetrics") @NotNull Map<String, Double> timeMetrics, @i(name = "connectionType") @NotNull NetworkConnectionType connectionType) {
            Intrinsics.checkNotNullParameter(popId, "popId");
            Intrinsics.checkNotNullParameter(imageId, "imageId");
            Intrinsics.checkNotNullParameter(timeMetrics, "timeMetrics");
            Intrinsics.checkNotNullParameter(connectionType, "connectionType");
            this.popId = popId;
            this.imageId = imageId;
            this.timeMetrics = timeMetrics;
            this.connectionType = connectionType;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ EventDto copy$default(EventDto eventDto, String str, String str2, Map map, NetworkConnectionType networkConnectionType, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = eventDto.popId;
            }
            if ((i11 & 2) != 0) {
                str2 = eventDto.imageId;
            }
            if ((i11 & 4) != 0) {
                map = eventDto.timeMetrics;
            }
            if ((i11 & 8) != 0) {
                networkConnectionType = eventDto.connectionType;
            }
            return eventDto.copy(str, str2, map, networkConnectionType);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getPopId() {
            return this.popId;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getImageId() {
            return this.imageId;
        }

        @NotNull
        public final Map<String, Double> component3() {
            return this.timeMetrics;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final NetworkConnectionType getConnectionType() {
            return this.connectionType;
        }

        @NotNull
        public final EventDto copy(@i(name = "popId") @NotNull String popId, @i(name = "imageId") @NotNull String imageId, @i(name = "timeMetrics") @NotNull Map<String, Double> timeMetrics, @i(name = "connectionType") @NotNull NetworkConnectionType connectionType) {
            Intrinsics.checkNotNullParameter(popId, "popId");
            Intrinsics.checkNotNullParameter(imageId, "imageId");
            Intrinsics.checkNotNullParameter(timeMetrics, "timeMetrics");
            Intrinsics.checkNotNullParameter(connectionType, "connectionType");
            return new EventDto(popId, imageId, timeMetrics, connectionType);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof EventDto)) {
                return false;
            }
            EventDto eventDto = (EventDto) other;
            return Intrinsics.d(this.popId, eventDto.popId) && Intrinsics.d(this.imageId, eventDto.imageId) && Intrinsics.d(this.timeMetrics, eventDto.timeMetrics) && this.connectionType == eventDto.connectionType;
        }

        @NotNull
        public final NetworkConnectionType getConnectionType() {
            return this.connectionType;
        }

        @NotNull
        public final String getImageId() {
            return this.imageId;
        }

        @NotNull
        public final String getPopId() {
            return this.popId;
        }

        @NotNull
        public final Map<String, Double> getTimeMetrics() {
            return this.timeMetrics;
        }

        public int hashCode() {
            return this.connectionType.hashCode() + c.a(this.timeMetrics, g.a(this.popId.hashCode() * 31, 31, this.imageId), 31);
        }

        @NotNull
        public String toString() {
            String str = this.popId;
            String str2 = this.imageId;
            Map<String, Double> map = this.timeMetrics;
            NetworkConnectionType networkConnectionType = this.connectionType;
            StringBuilder d11 = C3660k.d("EventDto(popId=", str, ", imageId=", str2, ", timeMetrics=");
            d11.append(map);
            d11.append(", connectionType=");
            d11.append(networkConnectionType);
            d11.append(")");
            return d11.toString();
        }
    }

    public PerfMetricsDto(@i(name = "events") @NotNull List<EventDto> events) {
        Intrinsics.checkNotNullParameter(events, "events");
        this.events = events;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PerfMetricsDto copy$default(PerfMetricsDto perfMetricsDto, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = perfMetricsDto.events;
        }
        return perfMetricsDto.copy(list);
    }

    @NotNull
    public final List<EventDto> component1() {
        return this.events;
    }

    @NotNull
    public final PerfMetricsDto copy(@i(name = "events") @NotNull List<EventDto> events) {
        Intrinsics.checkNotNullParameter(events, "events");
        return new PerfMetricsDto(events);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof PerfMetricsDto) && Intrinsics.d(this.events, ((PerfMetricsDto) other).events);
    }

    @NotNull
    public final List<EventDto> getEvents() {
        return this.events;
    }

    public int hashCode() {
        return this.events.hashCode();
    }

    @NotNull
    public String toString() {
        return H3.c.a("PerfMetricsDto(events=", ")", this.events);
    }
}
