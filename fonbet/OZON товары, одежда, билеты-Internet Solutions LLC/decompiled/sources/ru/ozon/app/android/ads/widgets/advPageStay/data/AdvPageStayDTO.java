package ru.ozon.app.android.ads.widgets.advPageStay.data;

import H3.c;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0012B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/ads/widgets/advPageStay/data/AdvPageStayDTO;", "", "events", "", "Lru/ozon/app/android/ads/widgets/advPageStay/data/AdvPageStayDTO$AdvPageStayEventDTO;", "<init>", "(Ljava/util/List;)V", "getEvents", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "AdvPageStayEventDTO", "ads_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class AdvPageStayDTO {

    @NotNull
    private final List<AdvPageStayEventDTO> events;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/ads/widgets/advPageStay/data/AdvPageStayDTO$AdvPageStayEventDTO;", "", "delayMS", "", "trackingInfo", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(JLru/ozon/android/tokenized/model/TokenizedTrackingInfo;)V", "getDelayMS", "()J", "getTrackingInfo", "()Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ads_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AdvPageStayEventDTO {
        private final long delayMS;

        @NotNull
        private final TokenizedTrackingInfo trackingInfo;

        public AdvPageStayEventDTO(long j11, @NotNull TokenizedTrackingInfo trackingInfo) {
            Intrinsics.checkNotNullParameter(trackingInfo, "trackingInfo");
            this.delayMS = j11;
            this.trackingInfo = trackingInfo;
        }

        public static /* synthetic */ AdvPageStayEventDTO copy$default(AdvPageStayEventDTO advPageStayEventDTO, long j11, TokenizedTrackingInfo tokenizedTrackingInfo, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                j11 = advPageStayEventDTO.delayMS;
            }
            if ((i11 & 2) != 0) {
                tokenizedTrackingInfo = advPageStayEventDTO.trackingInfo;
            }
            return advPageStayEventDTO.copy(j11, tokenizedTrackingInfo);
        }

        /* renamed from: component1, reason: from getter */
        public final long getDelayMS() {
            return this.delayMS;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final TokenizedTrackingInfo getTrackingInfo() {
            return this.trackingInfo;
        }

        @NotNull
        public final AdvPageStayEventDTO copy(long delayMS, @NotNull TokenizedTrackingInfo trackingInfo) {
            Intrinsics.checkNotNullParameter(trackingInfo, "trackingInfo");
            return new AdvPageStayEventDTO(delayMS, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AdvPageStayEventDTO)) {
                return false;
            }
            AdvPageStayEventDTO advPageStayEventDTO = (AdvPageStayEventDTO) other;
            return this.delayMS == advPageStayEventDTO.delayMS && Intrinsics.d(this.trackingInfo, advPageStayEventDTO.trackingInfo);
        }

        public final long getDelayMS() {
            return this.delayMS;
        }

        @NotNull
        public final TokenizedTrackingInfo getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            return this.trackingInfo.hashCode() + (Long.hashCode(this.delayMS) * 31);
        }

        @NotNull
        public String toString() {
            return "AdvPageStayEventDTO(delayMS=" + this.delayMS + ", trackingInfo=" + this.trackingInfo + ")";
        }
    }

    public AdvPageStayDTO(@NotNull List<AdvPageStayEventDTO> events) {
        Intrinsics.checkNotNullParameter(events, "events");
        this.events = events;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AdvPageStayDTO copy$default(AdvPageStayDTO advPageStayDTO, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = advPageStayDTO.events;
        }
        return advPageStayDTO.copy(list);
    }

    @NotNull
    public final List<AdvPageStayEventDTO> component1() {
        return this.events;
    }

    @NotNull
    public final AdvPageStayDTO copy(@NotNull List<AdvPageStayEventDTO> events) {
        Intrinsics.checkNotNullParameter(events, "events");
        return new AdvPageStayDTO(events);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof AdvPageStayDTO) && Intrinsics.d(this.events, ((AdvPageStayDTO) other).events);
    }

    @NotNull
    public final List<AdvPageStayEventDTO> getEvents() {
        return this.events;
    }

    public int hashCode() {
        return this.events.hashCode();
    }

    @NotNull
    public String toString() {
        return c.a("AdvPageStayDTO(events=", ")", this.events);
    }
}
