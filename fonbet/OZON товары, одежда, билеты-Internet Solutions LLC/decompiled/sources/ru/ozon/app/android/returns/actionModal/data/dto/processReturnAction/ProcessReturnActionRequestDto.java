package ru.ozon.app.android.returns.actionModal.data.dto.processReturnAction;

import C.o0;
import G.g;
import N3.C3660k;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.returns.ui.data.components.RmsImageLocation;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001&B[\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0016\b\u0001\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0017\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\tHÆ\u0003J\u0011\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003J_\u0010\u001f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0016\b\u0003\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t2\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001f\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006'"}, d2 = {"Lru/ozon/app/android/returns/actionModal/data/dto/processReturnAction/ProcessReturnActionRequestDto;", "", "returnNumber", "", "action", "comment", "trackingInfo", "Lru/ozon/app/android/returns/actionModal/data/dto/processReturnAction/ProcessReturnActionRequestDto$TrackingInfo;", "extraValues", "", "imageLocations", "", "Lru/ozon/app/android/returns/ui/data/components/RmsImageLocation;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/returns/actionModal/data/dto/processReturnAction/ProcessReturnActionRequestDto$TrackingInfo;Ljava/util/Map;Ljava/util/List;)V", "getReturnNumber", "()Ljava/lang/String;", "getAction", "getComment", "getTrackingInfo", "()Lru/ozon/app/android/returns/actionModal/data/dto/processReturnAction/ProcessReturnActionRequestDto$TrackingInfo;", "getExtraValues", "()Ljava/util/Map;", "getImageLocations", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "TrackingInfo", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ProcessReturnActionRequestDto {
    public static final int $stable = 8;

    @NotNull
    private final String action;
    private final String comment;
    private final Map<String, String> extraValues;
    private final List<RmsImageLocation> imageLocations;

    @NotNull
    private final String returnNumber;
    private final TrackingInfo trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J+\u0010\u000f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/returns/actionModal/data/dto/processReturnAction/ProcessReturnActionRequestDto$TrackingInfo;", "", "clientReturnDeliveryPrice", "", "trackingNumber", "deliveryService", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getClientReturnDeliveryPrice", "()Ljava/lang/String;", "getTrackingNumber", "getDeliveryService", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TrackingInfo {
        public static final int $stable = 0;

        @NotNull
        private final String clientReturnDeliveryPrice;
        private final String deliveryService;
        private final String trackingNumber;

        public TrackingInfo(@i(name = "clientReturnDeliveryPrice") @NotNull String clientReturnDeliveryPrice, @i(name = "trackingNumber") String str, @i(name = "deliveryService") String str2) {
            Intrinsics.checkNotNullParameter(clientReturnDeliveryPrice, "clientReturnDeliveryPrice");
            this.clientReturnDeliveryPrice = clientReturnDeliveryPrice;
            this.trackingNumber = str;
            this.deliveryService = str2;
        }

        public static /* synthetic */ TrackingInfo copy$default(TrackingInfo trackingInfo, String str, String str2, String str3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = trackingInfo.clientReturnDeliveryPrice;
            }
            if ((i11 & 2) != 0) {
                str2 = trackingInfo.trackingNumber;
            }
            if ((i11 & 4) != 0) {
                str3 = trackingInfo.deliveryService;
            }
            return trackingInfo.copy(str, str2, str3);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getClientReturnDeliveryPrice() {
            return this.clientReturnDeliveryPrice;
        }

        /* renamed from: component2, reason: from getter */
        public final String getTrackingNumber() {
            return this.trackingNumber;
        }

        /* renamed from: component3, reason: from getter */
        public final String getDeliveryService() {
            return this.deliveryService;
        }

        @NotNull
        public final TrackingInfo copy(@i(name = "clientReturnDeliveryPrice") @NotNull String clientReturnDeliveryPrice, @i(name = "trackingNumber") String trackingNumber, @i(name = "deliveryService") String deliveryService) {
            Intrinsics.checkNotNullParameter(clientReturnDeliveryPrice, "clientReturnDeliveryPrice");
            return new TrackingInfo(clientReturnDeliveryPrice, trackingNumber, deliveryService);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TrackingInfo)) {
                return false;
            }
            TrackingInfo trackingInfo = (TrackingInfo) other;
            return Intrinsics.d(this.clientReturnDeliveryPrice, trackingInfo.clientReturnDeliveryPrice) && Intrinsics.d(this.trackingNumber, trackingInfo.trackingNumber) && Intrinsics.d(this.deliveryService, trackingInfo.deliveryService);
        }

        @NotNull
        public final String getClientReturnDeliveryPrice() {
            return this.clientReturnDeliveryPrice;
        }

        public final String getDeliveryService() {
            return this.deliveryService;
        }

        public final String getTrackingNumber() {
            return this.trackingNumber;
        }

        public int hashCode() {
            int hashCode = this.clientReturnDeliveryPrice.hashCode() * 31;
            String str = this.trackingNumber;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.deliveryService;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.clientReturnDeliveryPrice;
            String str2 = this.trackingNumber;
            return o0.c(C3660k.d("TrackingInfo(clientReturnDeliveryPrice=", str, ", trackingNumber=", str2, ", deliveryService="), this.deliveryService, ")");
        }
    }

    public ProcessReturnActionRequestDto(@i(name = "returnNumber") @NotNull String returnNumber, @i(name = "action") @NotNull String action, @i(name = "comment") String str, @i(name = "trackingInfo") TrackingInfo trackingInfo, @i(name = "extraValues") Map<String, String> map, List<RmsImageLocation> list) {
        Intrinsics.checkNotNullParameter(returnNumber, "returnNumber");
        Intrinsics.checkNotNullParameter(action, "action");
        this.returnNumber = returnNumber;
        this.action = action;
        this.comment = str;
        this.trackingInfo = trackingInfo;
        this.extraValues = map;
        this.imageLocations = list;
    }

    public static /* synthetic */ ProcessReturnActionRequestDto copy$default(ProcessReturnActionRequestDto processReturnActionRequestDto, String str, String str2, String str3, TrackingInfo trackingInfo, Map map, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = processReturnActionRequestDto.returnNumber;
        }
        if ((i11 & 2) != 0) {
            str2 = processReturnActionRequestDto.action;
        }
        if ((i11 & 4) != 0) {
            str3 = processReturnActionRequestDto.comment;
        }
        if ((i11 & 8) != 0) {
            trackingInfo = processReturnActionRequestDto.trackingInfo;
        }
        if ((i11 & 16) != 0) {
            map = processReturnActionRequestDto.extraValues;
        }
        if ((i11 & 32) != 0) {
            list = processReturnActionRequestDto.imageLocations;
        }
        Map map2 = map;
        List list2 = list;
        return processReturnActionRequestDto.copy(str, str2, str3, trackingInfo, map2, list2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getReturnNumber() {
        return this.returnNumber;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    /* renamed from: component3, reason: from getter */
    public final String getComment() {
        return this.comment;
    }

    /* renamed from: component4, reason: from getter */
    public final TrackingInfo getTrackingInfo() {
        return this.trackingInfo;
    }

    public final Map<String, String> component5() {
        return this.extraValues;
    }

    public final List<RmsImageLocation> component6() {
        return this.imageLocations;
    }

    @NotNull
    public final ProcessReturnActionRequestDto copy(@i(name = "returnNumber") @NotNull String returnNumber, @i(name = "action") @NotNull String action, @i(name = "comment") String comment, @i(name = "trackingInfo") TrackingInfo trackingInfo, @i(name = "extraValues") Map<String, String> extraValues, List<RmsImageLocation> imageLocations) {
        Intrinsics.checkNotNullParameter(returnNumber, "returnNumber");
        Intrinsics.checkNotNullParameter(action, "action");
        return new ProcessReturnActionRequestDto(returnNumber, action, comment, trackingInfo, extraValues, imageLocations);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProcessReturnActionRequestDto)) {
            return false;
        }
        ProcessReturnActionRequestDto processReturnActionRequestDto = (ProcessReturnActionRequestDto) other;
        return Intrinsics.d(this.returnNumber, processReturnActionRequestDto.returnNumber) && Intrinsics.d(this.action, processReturnActionRequestDto.action) && Intrinsics.d(this.comment, processReturnActionRequestDto.comment) && Intrinsics.d(this.trackingInfo, processReturnActionRequestDto.trackingInfo) && Intrinsics.d(this.extraValues, processReturnActionRequestDto.extraValues) && Intrinsics.d(this.imageLocations, processReturnActionRequestDto.imageLocations);
    }

    @NotNull
    public final String getAction() {
        return this.action;
    }

    public final String getComment() {
        return this.comment;
    }

    public final Map<String, String> getExtraValues() {
        return this.extraValues;
    }

    public final List<RmsImageLocation> getImageLocations() {
        return this.imageLocations;
    }

    @NotNull
    public final String getReturnNumber() {
        return this.returnNumber;
    }

    public final TrackingInfo getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int a11 = g.a(this.returnNumber.hashCode() * 31, 31, this.action);
        String str = this.comment;
        int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
        TrackingInfo trackingInfo = this.trackingInfo;
        int hashCode2 = (hashCode + (trackingInfo == null ? 0 : trackingInfo.hashCode())) * 31;
        Map<String, String> map = this.extraValues;
        int hashCode3 = (hashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        List<RmsImageLocation> list = this.imageLocations;
        return hashCode3 + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.returnNumber;
        String str2 = this.action;
        String str3 = this.comment;
        TrackingInfo trackingInfo = this.trackingInfo;
        Map<String, String> map = this.extraValues;
        List<RmsImageLocation> list = this.imageLocations;
        StringBuilder d11 = C3660k.d("ProcessReturnActionRequestDto(returnNumber=", str, ", action=", str2, ", comment=");
        d11.append(str3);
        d11.append(", trackingInfo=");
        d11.append(trackingInfo);
        d11.append(", extraValues=");
        d11.append(map);
        d11.append(", imageLocations=");
        d11.append(list);
        d11.append(")");
        return d11.toString();
    }
}
