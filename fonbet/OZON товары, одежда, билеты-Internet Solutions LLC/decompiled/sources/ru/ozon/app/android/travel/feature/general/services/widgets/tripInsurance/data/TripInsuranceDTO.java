package ru.ozon.app.android.travel.feature.general.services.widgets.tripInsurance.data;

import G.g;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001!B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\u0017\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tHÆ\u0003JE\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\nHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001f\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\""}, d2 = {"Lru/ozon/app/android/travel/feature/general/services/widgets/tripInsurance/data/TripInsuranceDTO;", "", "mobileHeader", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "benefits", "", "additionalInfo", "Lru/ozon/app/android/travel/feature/general/services/widgets/tripInsurance/data/TripInsuranceDTO$AdditionalInfo;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/dsCell/CellDTO;Ljava/util/List;Lru/ozon/app/android/travel/feature/general/services/widgets/tripInsurance/data/TripInsuranceDTO$AdditionalInfo;Ljava/util/Map;)V", "getMobileHeader", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getBenefits", "()Ljava/util/List;", "getAdditionalInfo", "()Lru/ozon/app/android/travel/feature/general/services/widgets/tripInsurance/data/TripInsuranceDTO$AdditionalInfo;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "AdditionalInfo", "services_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TripInsuranceDTO {
    public static final int $stable = 8;

    @NotNull
    private final AdditionalInfo additionalInfo;

    @NotNull
    private final List<CellDTO> benefits;

    @NotNull
    private final CellDTO mobileHeader;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J5\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/travel/feature/general/services/widgets/tripInsurance/data/TripInsuranceDTO$AdditionalInfo;", "", "compensationLimit", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "image", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "bgColor", "", "common", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "<init>", "(Lru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/uni/atoms/data/image/ImageDTO;Ljava/lang/String;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;)V", "getCompensationLimit", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "getBgColor", "()Ljava/lang/String;", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "services_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AdditionalInfo {
        public static final int $stable = CellDTO.$stable;
        private final String bgColor;

        @NotNull
        private final CommonControlSettings common;

        @NotNull
        private final CellDTO compensationLimit;
        private final ImageDTO image;

        public AdditionalInfo(@NotNull CellDTO compensationLimit, ImageDTO imageDTO, String str, @NotNull CommonControlSettings common) {
            Intrinsics.checkNotNullParameter(compensationLimit, "compensationLimit");
            Intrinsics.checkNotNullParameter(common, "common");
            this.compensationLimit = compensationLimit;
            this.image = imageDTO;
            this.bgColor = str;
            this.common = common;
        }

        public static /* synthetic */ AdditionalInfo copy$default(AdditionalInfo additionalInfo, CellDTO cellDTO, ImageDTO imageDTO, String str, CommonControlSettings commonControlSettings, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                cellDTO = additionalInfo.compensationLimit;
            }
            if ((i11 & 2) != 0) {
                imageDTO = additionalInfo.image;
            }
            if ((i11 & 4) != 0) {
                str = additionalInfo.bgColor;
            }
            if ((i11 & 8) != 0) {
                commonControlSettings = additionalInfo.common;
            }
            return additionalInfo.copy(cellDTO, imageDTO, str, commonControlSettings);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final CellDTO getCompensationLimit() {
            return this.compensationLimit;
        }

        /* renamed from: component2, reason: from getter */
        public final ImageDTO getImage() {
            return this.image;
        }

        /* renamed from: component3, reason: from getter */
        public final String getBgColor() {
            return this.bgColor;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final CommonControlSettings getCommon() {
            return this.common;
        }

        @NotNull
        public final AdditionalInfo copy(@NotNull CellDTO compensationLimit, ImageDTO image, String bgColor, @NotNull CommonControlSettings common) {
            Intrinsics.checkNotNullParameter(compensationLimit, "compensationLimit");
            Intrinsics.checkNotNullParameter(common, "common");
            return new AdditionalInfo(compensationLimit, image, bgColor, common);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AdditionalInfo)) {
                return false;
            }
            AdditionalInfo additionalInfo = (AdditionalInfo) other;
            return Intrinsics.d(this.compensationLimit, additionalInfo.compensationLimit) && Intrinsics.d(this.image, additionalInfo.image) && Intrinsics.d(this.bgColor, additionalInfo.bgColor) && Intrinsics.d(this.common, additionalInfo.common);
        }

        public final String getBgColor() {
            return this.bgColor;
        }

        @NotNull
        public final CommonControlSettings getCommon() {
            return this.common;
        }

        @NotNull
        public final CellDTO getCompensationLimit() {
            return this.compensationLimit;
        }

        public final ImageDTO getImage() {
            return this.image;
        }

        public int hashCode() {
            int hashCode = this.compensationLimit.hashCode() * 31;
            ImageDTO imageDTO = this.image;
            int hashCode2 = (hashCode + (imageDTO == null ? 0 : imageDTO.hashCode())) * 31;
            String str = this.bgColor;
            return this.common.hashCode() + ((hashCode2 + (str != null ? str.hashCode() : 0)) * 31);
        }

        @NotNull
        public String toString() {
            return "AdditionalInfo(compensationLimit=" + this.compensationLimit + ", image=" + this.image + ", bgColor=" + this.bgColor + ", common=" + this.common + ")";
        }
    }

    public TripInsuranceDTO(@NotNull CellDTO mobileHeader, @NotNull List<CellDTO> benefits, @NotNull AdditionalInfo additionalInfo, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(mobileHeader, "mobileHeader");
        Intrinsics.checkNotNullParameter(benefits, "benefits");
        Intrinsics.checkNotNullParameter(additionalInfo, "additionalInfo");
        this.mobileHeader = mobileHeader;
        this.benefits = benefits;
        this.additionalInfo = additionalInfo;
        this.trackingInfo = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TripInsuranceDTO copy$default(TripInsuranceDTO tripInsuranceDTO, CellDTO cellDTO, List list, AdditionalInfo additionalInfo, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            cellDTO = tripInsuranceDTO.mobileHeader;
        }
        if ((i11 & 2) != 0) {
            list = tripInsuranceDTO.benefits;
        }
        if ((i11 & 4) != 0) {
            additionalInfo = tripInsuranceDTO.additionalInfo;
        }
        if ((i11 & 8) != 0) {
            map = tripInsuranceDTO.trackingInfo;
        }
        return tripInsuranceDTO.copy(cellDTO, list, additionalInfo, map);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final CellDTO getMobileHeader() {
        return this.mobileHeader;
    }

    @NotNull
    public final List<CellDTO> component2() {
        return this.benefits;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final AdditionalInfo getAdditionalInfo() {
        return this.additionalInfo;
    }

    public final Map<String, TokenizedTrackingInfo> component4() {
        return this.trackingInfo;
    }

    @NotNull
    public final TripInsuranceDTO copy(@NotNull CellDTO mobileHeader, @NotNull List<CellDTO> benefits, @NotNull AdditionalInfo additionalInfo, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(mobileHeader, "mobileHeader");
        Intrinsics.checkNotNullParameter(benefits, "benefits");
        Intrinsics.checkNotNullParameter(additionalInfo, "additionalInfo");
        return new TripInsuranceDTO(mobileHeader, benefits, additionalInfo, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TripInsuranceDTO)) {
            return false;
        }
        TripInsuranceDTO tripInsuranceDTO = (TripInsuranceDTO) other;
        return Intrinsics.d(this.mobileHeader, tripInsuranceDTO.mobileHeader) && Intrinsics.d(this.benefits, tripInsuranceDTO.benefits) && Intrinsics.d(this.additionalInfo, tripInsuranceDTO.additionalInfo) && Intrinsics.d(this.trackingInfo, tripInsuranceDTO.trackingInfo);
    }

    @NotNull
    public final AdditionalInfo getAdditionalInfo() {
        return this.additionalInfo;
    }

    @NotNull
    public final List<CellDTO> getBenefits() {
        return this.benefits;
    }

    @NotNull
    public final CellDTO getMobileHeader() {
        return this.mobileHeader;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = (this.additionalInfo.hashCode() + g.b(this.mobileHeader.hashCode() * 31, 31, this.benefits)) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode + (map == null ? 0 : map.hashCode());
    }

    @NotNull
    public String toString() {
        return "TripInsuranceDTO(mobileHeader=" + this.mobileHeader + ", benefits=" + this.benefits + ", additionalInfo=" + this.additionalInfo + ", trackingInfo=" + this.trackingInfo + ")";
    }
}
