package ru.ozon.app.android.travel.feature.railway.widgets.travelCarriageSelect.v3.data;

import B90.C2616s;
import D40.d;
import G.g;
import Kk.c;
import Ns.b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
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
import ru.ozon.app.android.storefront.widgets.feedback.result.data.ResultDTO;
import ru.ozon.app.android.travel.molecules.dto.priceCard.PriceCardDTO;
import ru.ozon.app.android.travel.molecules.dto.themeImage.v1.ThemeImageV1DTO;
import ru.ozon.app.android.travel.utils.listtracking.TrackingInfoHolder;
import ru.ozon.moshi.adapters.serialize.collection.JsonCollectionDecoding;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001:\u0003\u001b\u001c\u001dB-\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0017\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0007HÖ\u0001R\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\"\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v3/data/TravelCarriageSelectV3DTO;", "Lru/ozon/app/android/travel/utils/listtracking/TrackingInfoHolder;", "carriages", "", "Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v3/data/TravelCarriageSelectV3DTO$CarriageDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/util/List;Ljava/util/Map;)V", "getCarriages$annotations", "()V", "getCarriages", "()Ljava/util/List;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "CarriageDTO", "PriceBlockDTO", "StoreyDTO", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TravelCarriageSelectV3DTO implements TrackingInfoHolder {
    public static final int $stable = 8;

    @NotNull
    private final List<CarriageDTO> carriages;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v3/data/TravelCarriageSelectV3DTO$PriceBlockDTO;", "", "discountPriceCard", "Lru/ozon/app/android/travel/molecules/dto/priceCard/PriceCardDTO;", "originalPriceCard", "<init>", "(Lru/ozon/app/android/travel/molecules/dto/priceCard/PriceCardDTO;Lru/ozon/app/android/travel/molecules/dto/priceCard/PriceCardDTO;)V", "getDiscountPriceCard", "()Lru/ozon/app/android/travel/molecules/dto/priceCard/PriceCardDTO;", "getOriginalPriceCard", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PriceBlockDTO {
        public static final int $stable = 8;

        @NotNull
        private final PriceCardDTO discountPriceCard;

        @NotNull
        private final PriceCardDTO originalPriceCard;

        public PriceBlockDTO(@NotNull PriceCardDTO discountPriceCard, @NotNull PriceCardDTO originalPriceCard) {
            Intrinsics.checkNotNullParameter(discountPriceCard, "discountPriceCard");
            Intrinsics.checkNotNullParameter(originalPriceCard, "originalPriceCard");
            this.discountPriceCard = discountPriceCard;
            this.originalPriceCard = originalPriceCard;
        }

        public static /* synthetic */ PriceBlockDTO copy$default(PriceBlockDTO priceBlockDTO, PriceCardDTO priceCardDTO, PriceCardDTO priceCardDTO2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                priceCardDTO = priceBlockDTO.discountPriceCard;
            }
            if ((i11 & 2) != 0) {
                priceCardDTO2 = priceBlockDTO.originalPriceCard;
            }
            return priceBlockDTO.copy(priceCardDTO, priceCardDTO2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final PriceCardDTO getDiscountPriceCard() {
            return this.discountPriceCard;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final PriceCardDTO getOriginalPriceCard() {
            return this.originalPriceCard;
        }

        @NotNull
        public final PriceBlockDTO copy(@NotNull PriceCardDTO discountPriceCard, @NotNull PriceCardDTO originalPriceCard) {
            Intrinsics.checkNotNullParameter(discountPriceCard, "discountPriceCard");
            Intrinsics.checkNotNullParameter(originalPriceCard, "originalPriceCard");
            return new PriceBlockDTO(discountPriceCard, originalPriceCard);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PriceBlockDTO)) {
                return false;
            }
            PriceBlockDTO priceBlockDTO = (PriceBlockDTO) other;
            return Intrinsics.d(this.discountPriceCard, priceBlockDTO.discountPriceCard) && Intrinsics.d(this.originalPriceCard, priceBlockDTO.originalPriceCard);
        }

        @NotNull
        public final PriceCardDTO getDiscountPriceCard() {
            return this.discountPriceCard;
        }

        @NotNull
        public final PriceCardDTO getOriginalPriceCard() {
            return this.originalPriceCard;
        }

        public int hashCode() {
            return this.originalPriceCard.hashCode() + (this.discountPriceCard.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "PriceBlockDTO(discountPriceCard=" + this.discountPriceCard + ", originalPriceCard=" + this.originalPriceCard + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v3/data/TravelCarriageSelectV3DTO$StoreyDTO;", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "image", "Lru/ozon/app/android/travel/molecules/dto/themeImage/v1/ThemeImageV1DTO;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/travel/molecules/dto/themeImage/v1/ThemeImageV1DTO;)V", "getName", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getImage", "()Lru/ozon/app/android/travel/molecules/dto/themeImage/v1/ThemeImageV1DTO;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class StoreyDTO {
        public static final int $stable = 8;

        @NotNull
        private final ThemeImageV1DTO image;
        private final TextDTO name;

        public StoreyDTO(TextDTO textDTO, @NotNull ThemeImageV1DTO image) {
            Intrinsics.checkNotNullParameter(image, "image");
            this.name = textDTO;
            this.image = image;
        }

        public static /* synthetic */ StoreyDTO copy$default(StoreyDTO storeyDTO, TextDTO textDTO, ThemeImageV1DTO themeImageV1DTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = storeyDTO.name;
            }
            if ((i11 & 2) != 0) {
                themeImageV1DTO = storeyDTO.image;
            }
            return storeyDTO.copy(textDTO, themeImageV1DTO);
        }

        /* renamed from: component1, reason: from getter */
        public final TextDTO getName() {
            return this.name;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final ThemeImageV1DTO getImage() {
            return this.image;
        }

        @NotNull
        public final StoreyDTO copy(TextDTO name, @NotNull ThemeImageV1DTO image) {
            Intrinsics.checkNotNullParameter(image, "image");
            return new StoreyDTO(name, image);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StoreyDTO)) {
                return false;
            }
            StoreyDTO storeyDTO = (StoreyDTO) other;
            return Intrinsics.d(this.name, storeyDTO.name) && Intrinsics.d(this.image, storeyDTO.image);
        }

        @NotNull
        public final ThemeImageV1DTO getImage() {
            return this.image;
        }

        public final TextDTO getName() {
            return this.name;
        }

        public int hashCode() {
            TextDTO textDTO = this.name;
            return this.image.hashCode() + ((textDTO == null ? 0 : textDTO.hashCode()) * 31);
        }

        @NotNull
        public String toString() {
            return "StoreyDTO(name=" + this.name + ", image=" + this.image + ")";
        }
    }

    public TravelCarriageSelectV3DTO(@NotNull List<CarriageDTO> carriages, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(carriages, "carriages");
        this.carriages = carriages;
        this.trackingInfo = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TravelCarriageSelectV3DTO copy$default(TravelCarriageSelectV3DTO travelCarriageSelectV3DTO, List list, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = travelCarriageSelectV3DTO.carriages;
        }
        if ((i11 & 2) != 0) {
            map = travelCarriageSelectV3DTO.trackingInfo;
        }
        return travelCarriageSelectV3DTO.copy(list, map);
    }

    @JsonCollectionDecoding
    public static /* synthetic */ void getCarriages$annotations() {
    }

    @NotNull
    public final List<CarriageDTO> component1() {
        return this.carriages;
    }

    public final Map<String, TokenizedTrackingInfo> component2() {
        return this.trackingInfo;
    }

    @NotNull
    public final TravelCarriageSelectV3DTO copy(@NotNull List<CarriageDTO> carriages, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(carriages, "carriages");
        return new TravelCarriageSelectV3DTO(carriages, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TravelCarriageSelectV3DTO)) {
            return false;
        }
        TravelCarriageSelectV3DTO travelCarriageSelectV3DTO = (TravelCarriageSelectV3DTO) other;
        return Intrinsics.d(this.carriages, travelCarriageSelectV3DTO.carriages) && Intrinsics.d(this.trackingInfo, travelCarriageSelectV3DTO.trackingInfo);
    }

    @NotNull
    public final List<CarriageDTO> getCarriages() {
        return this.carriages;
    }

    @Override // ru.ozon.app.android.travel.utils.listtracking.TrackingInfoHolder
    public Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = this.carriages.hashCode() * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode + (map == null ? 0 : map.hashCode());
    }

    @NotNull
    public String toString() {
        return c.d("TravelCarriageSelectV3DTO(carriages=", ", trackingInfo=", ")", this.carriages, this.trackingInfo);
    }

    public TravelCarriageSelectV3DTO(List list, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? K.f71697a : list, map);
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0083\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u00100\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003J\u000f\u00101\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000bHÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u0099\u0001\u00106\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÆ\u0001J\u0013\u00107\u001a\u0002082\b\u00109\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010:\u001a\u00020;HÖ\u0001J\t\u0010<\u001a\u00020=HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0019R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0019R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010!R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0019R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)¨\u0006>"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v3/data/TravelCarriageSelectV3DTO$CarriageDTO;", "", "number", "Lru/ozon/uni/atoms/data/text/TextDTO;", "type", "serviceType", "priceBlock", "Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v3/data/TravelCarriageSelectV3DTO$PriceBlockDTO;", "seatsCount", "seatsDetails", ResultDTO.CONTENT_TYPE_SERVICES, "", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "storeys", "Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v3/data/TravelCarriageSelectV3DTO$StoreyDTO;", "additionalInfo", "premiumBadge", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "common", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "originalPrice", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v3/data/TravelCarriageSelectV3DTO$PriceBlockDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;Ljava/util/List;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;Lru/ozon/uni/atoms/data/price/PriceDTO;)V", "getNumber", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getType", "getServiceType", "getPriceBlock", "()Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v3/data/TravelCarriageSelectV3DTO$PriceBlockDTO;", "getSeatsCount", "getSeatsDetails", "getServices", "()Ljava/util/List;", "getStoreys", "getAdditionalInfo", "getPremiumBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "getOriginalPrice", "()Lru/ozon/uni/atoms/data/price/PriceDTO;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "equals", "", "other", "hashCode", "", "toString", "", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CarriageDTO {
        public static final int $stable = 8;
        private final TextDTO additionalInfo;
        private final CommonControlSettings common;

        @NotNull
        private final TextDTO number;
        private final PriceDTO originalPrice;
        private final BadgeDTO premiumBadge;
        private final PriceBlockDTO priceBlock;

        @NotNull
        private final TextDTO seatsCount;
        private final TextDTO seatsDetails;

        @NotNull
        private final TextDTO serviceType;

        @NotNull
        private final List<IconButtonV3DTO> services;

        @NotNull
        private final List<StoreyDTO> storeys;

        @NotNull
        private final TextDTO type;

        public CarriageDTO(@NotNull TextDTO number, @NotNull TextDTO type, @NotNull TextDTO serviceType, PriceBlockDTO priceBlockDTO, @NotNull TextDTO seatsCount, TextDTO textDTO, @NotNull List<IconButtonV3DTO> services, @NotNull List<StoreyDTO> storeys, TextDTO textDTO2, BadgeDTO badgeDTO, CommonControlSettings commonControlSettings, PriceDTO priceDTO) {
            Intrinsics.checkNotNullParameter(number, "number");
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(serviceType, "serviceType");
            Intrinsics.checkNotNullParameter(seatsCount, "seatsCount");
            Intrinsics.checkNotNullParameter(services, "services");
            Intrinsics.checkNotNullParameter(storeys, "storeys");
            this.number = number;
            this.type = type;
            this.serviceType = serviceType;
            this.priceBlock = priceBlockDTO;
            this.seatsCount = seatsCount;
            this.seatsDetails = textDTO;
            this.services = services;
            this.storeys = storeys;
            this.additionalInfo = textDTO2;
            this.premiumBadge = badgeDTO;
            this.common = commonControlSettings;
            this.originalPrice = priceDTO;
        }

        public static /* synthetic */ CarriageDTO copy$default(CarriageDTO carriageDTO, TextDTO textDTO, TextDTO textDTO2, TextDTO textDTO3, PriceBlockDTO priceBlockDTO, TextDTO textDTO4, TextDTO textDTO5, List list, List list2, TextDTO textDTO6, BadgeDTO badgeDTO, CommonControlSettings commonControlSettings, PriceDTO priceDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = carriageDTO.number;
            }
            if ((i11 & 2) != 0) {
                textDTO2 = carriageDTO.type;
            }
            if ((i11 & 4) != 0) {
                textDTO3 = carriageDTO.serviceType;
            }
            if ((i11 & 8) != 0) {
                priceBlockDTO = carriageDTO.priceBlock;
            }
            if ((i11 & 16) != 0) {
                textDTO4 = carriageDTO.seatsCount;
            }
            if ((i11 & 32) != 0) {
                textDTO5 = carriageDTO.seatsDetails;
            }
            if ((i11 & 64) != 0) {
                list = carriageDTO.services;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                list2 = carriageDTO.storeys;
            }
            if ((i11 & 256) != 0) {
                textDTO6 = carriageDTO.additionalInfo;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                badgeDTO = carriageDTO.premiumBadge;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                commonControlSettings = carriageDTO.common;
            }
            if ((i11 & 2048) != 0) {
                priceDTO = carriageDTO.originalPrice;
            }
            CommonControlSettings commonControlSettings2 = commonControlSettings;
            PriceDTO priceDTO2 = priceDTO;
            TextDTO textDTO7 = textDTO6;
            BadgeDTO badgeDTO2 = badgeDTO;
            List list3 = list;
            List list4 = list2;
            TextDTO textDTO8 = textDTO4;
            TextDTO textDTO9 = textDTO5;
            return carriageDTO.copy(textDTO, textDTO2, textDTO3, priceBlockDTO, textDTO8, textDTO9, list3, list4, textDTO7, badgeDTO2, commonControlSettings2, priceDTO2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextDTO getNumber() {
            return this.number;
        }

        /* renamed from: component10, reason: from getter */
        public final BadgeDTO getPremiumBadge() {
            return this.premiumBadge;
        }

        /* renamed from: component11, reason: from getter */
        public final CommonControlSettings getCommon() {
            return this.common;
        }

        /* renamed from: component12, reason: from getter */
        public final PriceDTO getOriginalPrice() {
            return this.originalPrice;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final TextDTO getType() {
            return this.type;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final TextDTO getServiceType() {
            return this.serviceType;
        }

        /* renamed from: component4, reason: from getter */
        public final PriceBlockDTO getPriceBlock() {
            return this.priceBlock;
        }

        @NotNull
        /* renamed from: component5, reason: from getter */
        public final TextDTO getSeatsCount() {
            return this.seatsCount;
        }

        /* renamed from: component6, reason: from getter */
        public final TextDTO getSeatsDetails() {
            return this.seatsDetails;
        }

        @NotNull
        public final List<IconButtonV3DTO> component7() {
            return this.services;
        }

        @NotNull
        public final List<StoreyDTO> component8() {
            return this.storeys;
        }

        /* renamed from: component9, reason: from getter */
        public final TextDTO getAdditionalInfo() {
            return this.additionalInfo;
        }

        @NotNull
        public final CarriageDTO copy(@NotNull TextDTO number, @NotNull TextDTO type, @NotNull TextDTO serviceType, PriceBlockDTO priceBlock, @NotNull TextDTO seatsCount, TextDTO seatsDetails, @NotNull List<IconButtonV3DTO> services, @NotNull List<StoreyDTO> storeys, TextDTO additionalInfo, BadgeDTO premiumBadge, CommonControlSettings common, PriceDTO originalPrice) {
            Intrinsics.checkNotNullParameter(number, "number");
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(serviceType, "serviceType");
            Intrinsics.checkNotNullParameter(seatsCount, "seatsCount");
            Intrinsics.checkNotNullParameter(services, "services");
            Intrinsics.checkNotNullParameter(storeys, "storeys");
            return new CarriageDTO(number, type, serviceType, priceBlock, seatsCount, seatsDetails, services, storeys, additionalInfo, premiumBadge, common, originalPrice);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CarriageDTO)) {
                return false;
            }
            CarriageDTO carriageDTO = (CarriageDTO) other;
            return Intrinsics.d(this.number, carriageDTO.number) && Intrinsics.d(this.type, carriageDTO.type) && Intrinsics.d(this.serviceType, carriageDTO.serviceType) && Intrinsics.d(this.priceBlock, carriageDTO.priceBlock) && Intrinsics.d(this.seatsCount, carriageDTO.seatsCount) && Intrinsics.d(this.seatsDetails, carriageDTO.seatsDetails) && Intrinsics.d(this.services, carriageDTO.services) && Intrinsics.d(this.storeys, carriageDTO.storeys) && Intrinsics.d(this.additionalInfo, carriageDTO.additionalInfo) && Intrinsics.d(this.premiumBadge, carriageDTO.premiumBadge) && Intrinsics.d(this.common, carriageDTO.common) && Intrinsics.d(this.originalPrice, carriageDTO.originalPrice);
        }

        public final TextDTO getAdditionalInfo() {
            return this.additionalInfo;
        }

        public final CommonControlSettings getCommon() {
            return this.common;
        }

        @NotNull
        public final TextDTO getNumber() {
            return this.number;
        }

        public final PriceDTO getOriginalPrice() {
            return this.originalPrice;
        }

        public final BadgeDTO getPremiumBadge() {
            return this.premiumBadge;
        }

        public final PriceBlockDTO getPriceBlock() {
            return this.priceBlock;
        }

        @NotNull
        public final TextDTO getSeatsCount() {
            return this.seatsCount;
        }

        public final TextDTO getSeatsDetails() {
            return this.seatsDetails;
        }

        @NotNull
        public final TextDTO getServiceType() {
            return this.serviceType;
        }

        @NotNull
        public final List<IconButtonV3DTO> getServices() {
            return this.services;
        }

        @NotNull
        public final List<StoreyDTO> getStoreys() {
            return this.storeys;
        }

        @NotNull
        public final TextDTO getType() {
            return this.type;
        }

        public int hashCode() {
            int a11 = b.a(this.serviceType, b.a(this.type, this.number.hashCode() * 31, 31), 31);
            PriceBlockDTO priceBlockDTO = this.priceBlock;
            int a12 = b.a(this.seatsCount, (a11 + (priceBlockDTO == null ? 0 : priceBlockDTO.hashCode())) * 31, 31);
            TextDTO textDTO = this.seatsDetails;
            int b11 = g.b(g.b((a12 + (textDTO == null ? 0 : textDTO.hashCode())) * 31, 31, this.services), 31, this.storeys);
            TextDTO textDTO2 = this.additionalInfo;
            int hashCode = (b11 + (textDTO2 == null ? 0 : textDTO2.hashCode())) * 31;
            BadgeDTO badgeDTO = this.premiumBadge;
            int hashCode2 = (hashCode + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31;
            CommonControlSettings commonControlSettings = this.common;
            int hashCode3 = (hashCode2 + (commonControlSettings == null ? 0 : commonControlSettings.hashCode())) * 31;
            PriceDTO priceDTO = this.originalPrice;
            return hashCode3 + (priceDTO != null ? priceDTO.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.number;
            TextDTO textDTO2 = this.type;
            TextDTO textDTO3 = this.serviceType;
            PriceBlockDTO priceBlockDTO = this.priceBlock;
            TextDTO textDTO4 = this.seatsCount;
            TextDTO textDTO5 = this.seatsDetails;
            List<IconButtonV3DTO> list = this.services;
            List<StoreyDTO> list2 = this.storeys;
            TextDTO textDTO6 = this.additionalInfo;
            BadgeDTO badgeDTO = this.premiumBadge;
            CommonControlSettings commonControlSettings = this.common;
            PriceDTO priceDTO = this.originalPrice;
            StringBuilder g10 = D3.g.g("CarriageDTO(number=", textDTO, ", type=", textDTO2, ", serviceType=");
            g10.append(textDTO3);
            g10.append(", priceBlock=");
            g10.append(priceBlockDTO);
            g10.append(", seatsCount=");
            d.e(", seatsDetails=", ", services=", g10, textDTO4, textDTO5);
            C2616s.g(", storeys=", ", additionalInfo=", g10, list, list2);
            g10.append(textDTO6);
            g10.append(", premiumBadge=");
            g10.append(badgeDTO);
            g10.append(", common=");
            g10.append(commonControlSettings);
            g10.append(", originalPrice=");
            g10.append(priceDTO);
            g10.append(")");
            return g10.toString();
        }

        public CarriageDTO(TextDTO textDTO, TextDTO textDTO2, TextDTO textDTO3, PriceBlockDTO priceBlockDTO, TextDTO textDTO4, TextDTO textDTO5, List list, List list2, TextDTO textDTO6, BadgeDTO badgeDTO, CommonControlSettings commonControlSettings, PriceDTO priceDTO, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(textDTO, textDTO2, textDTO3, priceBlockDTO, textDTO4, textDTO5, (i11 & 64) != 0 ? K.f71697a : list, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? K.f71697a : list2, textDTO6, badgeDTO, commonControlSettings, priceDTO);
        }
    }
}
