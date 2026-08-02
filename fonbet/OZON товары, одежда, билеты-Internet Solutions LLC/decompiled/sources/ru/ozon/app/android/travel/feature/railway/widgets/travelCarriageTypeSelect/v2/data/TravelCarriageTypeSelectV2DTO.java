package ru.ozon.app.android.travel.feature.railway.widgets.travelCarriageTypeSelect.v2.data;

import D3.g;
import Fm.C3051a;
import Kk.C3532b;
import Ns.b;
import T7.P;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.moshi.adapters.serialize.collection.JsonCollectionDecoding;
import ru.ozon.uni.atoms.data.aspect.AspectDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u001dB7\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\u0017\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bHÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\tHÖ\u0001R\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0011R\u001f\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageTypeSelect/v2/data/TravelCarriageTypeSelectV2DTO;", "", "carriageTypes", "", "Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageTypeSelect/v2/data/TravelCarriageTypeSelectV2DTO$CarriageTypeDTO;", "isSeatsNumberOnNewLine", "", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/util/List;ZLjava/util/Map;)V", "getCarriageTypes$annotations", "()V", "getCarriageTypes", "()Ljava/util/List;", "()Z", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "CarriageTypeDTO", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TravelCarriageTypeSelectV2DTO {
    public static final int $stable = 8;

    @NotNull
    private final List<CarriageTypeDTO> carriageTypes;
    private final boolean isSeatsNumberOnNewLine;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageTypeSelect/v2/data/TravelCarriageTypeSelectV2DTO$CarriageTypeDTO;", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "seatsNumber", "price", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "aspect", "Lru/ozon/uni/atoms/data/aspect/AspectDTO;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/price/PriceDTO;Lru/ozon/uni/atoms/data/aspect/AspectDTO;)V", "getName", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSeatsNumber", "getPrice", "()Lru/ozon/uni/atoms/data/price/PriceDTO;", "getAspect", "()Lru/ozon/uni/atoms/data/aspect/AspectDTO;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CarriageTypeDTO {
        public static final int $stable = AspectDTO.$stable | PriceDTO.$stable;

        @NotNull
        private final AspectDTO aspect;

        @NotNull
        private final TextDTO name;

        @NotNull
        private final PriceDTO price;

        @NotNull
        private final TextDTO seatsNumber;

        public CarriageTypeDTO(@NotNull TextDTO name, @NotNull TextDTO seatsNumber, @NotNull PriceDTO price, @NotNull AspectDTO aspect) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(seatsNumber, "seatsNumber");
            Intrinsics.checkNotNullParameter(price, "price");
            Intrinsics.checkNotNullParameter(aspect, "aspect");
            this.name = name;
            this.seatsNumber = seatsNumber;
            this.price = price;
            this.aspect = aspect;
        }

        public static /* synthetic */ CarriageTypeDTO copy$default(CarriageTypeDTO carriageTypeDTO, TextDTO textDTO, TextDTO textDTO2, PriceDTO priceDTO, AspectDTO aspectDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = carriageTypeDTO.name;
            }
            if ((i11 & 2) != 0) {
                textDTO2 = carriageTypeDTO.seatsNumber;
            }
            if ((i11 & 4) != 0) {
                priceDTO = carriageTypeDTO.price;
            }
            if ((i11 & 8) != 0) {
                aspectDTO = carriageTypeDTO.aspect;
            }
            return carriageTypeDTO.copy(textDTO, textDTO2, priceDTO, aspectDTO);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextDTO getName() {
            return this.name;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final TextDTO getSeatsNumber() {
            return this.seatsNumber;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final PriceDTO getPrice() {
            return this.price;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final AspectDTO getAspect() {
            return this.aspect;
        }

        @NotNull
        public final CarriageTypeDTO copy(@NotNull TextDTO name, @NotNull TextDTO seatsNumber, @NotNull PriceDTO price, @NotNull AspectDTO aspect) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(seatsNumber, "seatsNumber");
            Intrinsics.checkNotNullParameter(price, "price");
            Intrinsics.checkNotNullParameter(aspect, "aspect");
            return new CarriageTypeDTO(name, seatsNumber, price, aspect);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CarriageTypeDTO)) {
                return false;
            }
            CarriageTypeDTO carriageTypeDTO = (CarriageTypeDTO) other;
            return Intrinsics.d(this.name, carriageTypeDTO.name) && Intrinsics.d(this.seatsNumber, carriageTypeDTO.seatsNumber) && Intrinsics.d(this.price, carriageTypeDTO.price) && Intrinsics.d(this.aspect, carriageTypeDTO.aspect);
        }

        @NotNull
        public final AspectDTO getAspect() {
            return this.aspect;
        }

        @NotNull
        public final TextDTO getName() {
            return this.name;
        }

        @NotNull
        public final PriceDTO getPrice() {
            return this.price;
        }

        @NotNull
        public final TextDTO getSeatsNumber() {
            return this.seatsNumber;
        }

        public int hashCode() {
            return this.aspect.hashCode() + C3051a.b(this.price, b.a(this.seatsNumber, this.name.hashCode() * 31, 31), 31);
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.name;
            TextDTO textDTO2 = this.seatsNumber;
            PriceDTO priceDTO = this.price;
            AspectDTO aspectDTO = this.aspect;
            StringBuilder g10 = g.g("CarriageTypeDTO(name=", textDTO, ", seatsNumber=", textDTO2, ", price=");
            g10.append(priceDTO);
            g10.append(", aspect=");
            g10.append(aspectDTO);
            g10.append(")");
            return g10.toString();
        }
    }

    public TravelCarriageTypeSelectV2DTO(@NotNull List<CarriageTypeDTO> carriageTypes, boolean z11, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(carriageTypes, "carriageTypes");
        this.carriageTypes = carriageTypes;
        this.isSeatsNumberOnNewLine = z11;
        this.trackingInfo = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TravelCarriageTypeSelectV2DTO copy$default(TravelCarriageTypeSelectV2DTO travelCarriageTypeSelectV2DTO, List list, boolean z11, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = travelCarriageTypeSelectV2DTO.carriageTypes;
        }
        if ((i11 & 2) != 0) {
            z11 = travelCarriageTypeSelectV2DTO.isSeatsNumberOnNewLine;
        }
        if ((i11 & 4) != 0) {
            map = travelCarriageTypeSelectV2DTO.trackingInfo;
        }
        return travelCarriageTypeSelectV2DTO.copy(list, z11, map);
    }

    @JsonCollectionDecoding
    public static /* synthetic */ void getCarriageTypes$annotations() {
    }

    @NotNull
    public final List<CarriageTypeDTO> component1() {
        return this.carriageTypes;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsSeatsNumberOnNewLine() {
        return this.isSeatsNumberOnNewLine;
    }

    public final Map<String, TokenizedTrackingInfo> component3() {
        return this.trackingInfo;
    }

    @NotNull
    public final TravelCarriageTypeSelectV2DTO copy(@NotNull List<CarriageTypeDTO> carriageTypes, boolean isSeatsNumberOnNewLine, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(carriageTypes, "carriageTypes");
        return new TravelCarriageTypeSelectV2DTO(carriageTypes, isSeatsNumberOnNewLine, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TravelCarriageTypeSelectV2DTO)) {
            return false;
        }
        TravelCarriageTypeSelectV2DTO travelCarriageTypeSelectV2DTO = (TravelCarriageTypeSelectV2DTO) other;
        return Intrinsics.d(this.carriageTypes, travelCarriageTypeSelectV2DTO.carriageTypes) && this.isSeatsNumberOnNewLine == travelCarriageTypeSelectV2DTO.isSeatsNumberOnNewLine && Intrinsics.d(this.trackingInfo, travelCarriageTypeSelectV2DTO.trackingInfo);
    }

    @NotNull
    public final List<CarriageTypeDTO> getCarriageTypes() {
        return this.carriageTypes;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int a11 = C3532b.a(this.carriageTypes.hashCode() * 31, 31, this.isSeatsNumberOnNewLine);
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return a11 + (map == null ? 0 : map.hashCode());
    }

    public final boolean isSeatsNumberOnNewLine() {
        return this.isSeatsNumberOnNewLine;
    }

    @NotNull
    public String toString() {
        List<CarriageTypeDTO> list = this.carriageTypes;
        boolean z11 = this.isSeatsNumberOnNewLine;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("TravelCarriageTypeSelectV2DTO(carriageTypes=");
        sb2.append(list);
        sb2.append(", isSeatsNumberOnNewLine=");
        sb2.append(z11);
        sb2.append(", trackingInfo=");
        return P.f(sb2, map, ")");
    }

    public TravelCarriageTypeSelectV2DTO(List list, boolean z11, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? K.f71697a : list, (i11 & 2) != 0 ? false : z11, map);
    }
}
