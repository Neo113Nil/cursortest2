package ru.ozon.app.android.travel.feature.railway.widgets.passengerList.data;

import Kk.c;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0018B+\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0017\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0007HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001f\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/passengerList/data/PassengerListDTO;", "", "passengers", "", "Lru/ozon/app/android/travel/feature/railway/widgets/passengerList/data/PassengerListDTO$PassengerDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/util/List;Ljava/util/Map;)V", "getPassengers", "()Ljava/util/List;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "PassengerDTO", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class PassengerListDTO {
    public static final int $stable = 8;

    @NotNull
    private final List<PassengerDTO> passengers;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J7\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/passengerList/data/PassengerListDTO$PassengerDTO;", "", "passengerInfo", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "ticketNumber", "Lru/ozon/uni/atoms/data/text/TextDTO;", "copyIcon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "common", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "<init>", "(Lru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;)V", "getPassengerInfo", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getTicketNumber", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getCopyIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PassengerDTO {
        public static final int $stable = IconDTO.$stable | CellDTO.$stable;
        private final CommonControlSettings common;
        private final IconDTO copyIcon;

        @NotNull
        private final CellDTO passengerInfo;
        private final TextDTO ticketNumber;

        public PassengerDTO(@NotNull CellDTO passengerInfo, TextDTO textDTO, IconDTO iconDTO, CommonControlSettings commonControlSettings) {
            Intrinsics.checkNotNullParameter(passengerInfo, "passengerInfo");
            this.passengerInfo = passengerInfo;
            this.ticketNumber = textDTO;
            this.copyIcon = iconDTO;
            this.common = commonControlSettings;
        }

        public static /* synthetic */ PassengerDTO copy$default(PassengerDTO passengerDTO, CellDTO cellDTO, TextDTO textDTO, IconDTO iconDTO, CommonControlSettings commonControlSettings, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                cellDTO = passengerDTO.passengerInfo;
            }
            if ((i11 & 2) != 0) {
                textDTO = passengerDTO.ticketNumber;
            }
            if ((i11 & 4) != 0) {
                iconDTO = passengerDTO.copyIcon;
            }
            if ((i11 & 8) != 0) {
                commonControlSettings = passengerDTO.common;
            }
            return passengerDTO.copy(cellDTO, textDTO, iconDTO, commonControlSettings);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final CellDTO getPassengerInfo() {
            return this.passengerInfo;
        }

        /* renamed from: component2, reason: from getter */
        public final TextDTO getTicketNumber() {
            return this.ticketNumber;
        }

        /* renamed from: component3, reason: from getter */
        public final IconDTO getCopyIcon() {
            return this.copyIcon;
        }

        /* renamed from: component4, reason: from getter */
        public final CommonControlSettings getCommon() {
            return this.common;
        }

        @NotNull
        public final PassengerDTO copy(@NotNull CellDTO passengerInfo, TextDTO ticketNumber, IconDTO copyIcon, CommonControlSettings common) {
            Intrinsics.checkNotNullParameter(passengerInfo, "passengerInfo");
            return new PassengerDTO(passengerInfo, ticketNumber, copyIcon, common);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PassengerDTO)) {
                return false;
            }
            PassengerDTO passengerDTO = (PassengerDTO) other;
            return Intrinsics.d(this.passengerInfo, passengerDTO.passengerInfo) && Intrinsics.d(this.ticketNumber, passengerDTO.ticketNumber) && Intrinsics.d(this.copyIcon, passengerDTO.copyIcon) && Intrinsics.d(this.common, passengerDTO.common);
        }

        public final CommonControlSettings getCommon() {
            return this.common;
        }

        public final IconDTO getCopyIcon() {
            return this.copyIcon;
        }

        @NotNull
        public final CellDTO getPassengerInfo() {
            return this.passengerInfo;
        }

        public final TextDTO getTicketNumber() {
            return this.ticketNumber;
        }

        public int hashCode() {
            int hashCode = this.passengerInfo.hashCode() * 31;
            TextDTO textDTO = this.ticketNumber;
            int hashCode2 = (hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
            IconDTO iconDTO = this.copyIcon;
            int hashCode3 = (hashCode2 + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31;
            CommonControlSettings commonControlSettings = this.common;
            return hashCode3 + (commonControlSettings != null ? commonControlSettings.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "PassengerDTO(passengerInfo=" + this.passengerInfo + ", ticketNumber=" + this.ticketNumber + ", copyIcon=" + this.copyIcon + ", common=" + this.common + ")";
        }
    }

    public PassengerListDTO(@NotNull List<PassengerDTO> passengers, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(passengers, "passengers");
        this.passengers = passengers;
        this.trackingInfo = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PassengerListDTO copy$default(PassengerListDTO passengerListDTO, List list, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = passengerListDTO.passengers;
        }
        if ((i11 & 2) != 0) {
            map = passengerListDTO.trackingInfo;
        }
        return passengerListDTO.copy(list, map);
    }

    @NotNull
    public final List<PassengerDTO> component1() {
        return this.passengers;
    }

    public final Map<String, TokenizedTrackingInfo> component2() {
        return this.trackingInfo;
    }

    @NotNull
    public final PassengerListDTO copy(@NotNull List<PassengerDTO> passengers, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(passengers, "passengers");
        return new PassengerListDTO(passengers, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PassengerListDTO)) {
            return false;
        }
        PassengerListDTO passengerListDTO = (PassengerListDTO) other;
        return Intrinsics.d(this.passengers, passengerListDTO.passengers) && Intrinsics.d(this.trackingInfo, passengerListDTO.trackingInfo);
    }

    @NotNull
    public final List<PassengerDTO> getPassengers() {
        return this.passengers;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = this.passengers.hashCode() * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode + (map == null ? 0 : map.hashCode());
    }

    @NotNull
    public String toString() {
        return c.d("PassengerListDTO(passengers=", ", trackingInfo=", ")", this.passengers, this.trackingInfo);
    }
}
