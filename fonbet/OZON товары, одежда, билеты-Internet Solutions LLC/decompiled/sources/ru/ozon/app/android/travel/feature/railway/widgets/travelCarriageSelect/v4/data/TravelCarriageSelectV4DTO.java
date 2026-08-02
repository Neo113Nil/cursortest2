package ru.ozon.app.android.travel.feature.railway.widgets.travelCarriageSelect.v4.data;

import D3.g;
import D40.d;
import Gl.C3124a;
import Kk.C3532b;
import Kk.c;
import Ns.b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.travel.molecules.dto.priceCard.PriceCardDTO;
import ru.ozon.app.android.travel.molecules.dto.shiftedPreviewIcons.ShiftedPreviewIconsDTO;
import ru.ozon.app.android.travel.molecules.dto.themeImage.v1.ThemeImageV1DTO;
import ru.ozon.app.android.travel.utils.listtracking.TrackingInfoHolder;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.disclaimer.DisclaimerDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001:\u0004\u0019\u001a\u001b\u001cB+\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0017\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0007HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\"\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v4/data/TravelCarriageSelectV4DTO;", "Lru/ozon/app/android/travel/utils/listtracking/TrackingInfoHolder;", "carriages", "", "Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v4/data/TravelCarriageSelectV4DTO$Carriage;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/util/List;Ljava/util/Map;)V", "getCarriages", "()Ljava/util/List;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "Carriage", "Storey", "Details", "PriceBlock", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TravelCarriageSelectV4DTO implements TrackingInfoHolder {
    public static final int $stable = 8;

    @NotNull
    private final List<Carriage> carriages;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001Bo\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0012\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010-\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003J\t\u0010.\u001a\u00020\u000eHÆ\u0003J\t\u0010/\u001a\u00020\u0010HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u00101\u001a\u00020\u0013HÆ\u0003J\u0087\u0001\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u0013HÆ\u0001J\u0013\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00106\u001a\u000207HÖ\u0001J\t\u00108\u001a\u000209HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0017R\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001aR\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&¨\u0006:"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v4/data/TravelCarriageSelectV4DTO$Carriage;", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "type", "typeBadge", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "number", "seatsCount", "seatsDetails", "storeys", "", "Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v4/data/TravelCarriageSelectV4DTO$Storey;", "details", "Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v4/data/TravelCarriageSelectV4DTO$Details;", "priceBlock", "Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v4/data/TravelCarriageSelectV4DTO$PriceBlock;", "bonusBadge", "common", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v4/data/TravelCarriageSelectV4DTO$Details;Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v4/data/TravelCarriageSelectV4DTO$PriceBlock;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;)V", "getName", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getType", "getTypeBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getNumber", "getSeatsCount", "getSeatsDetails", "getStoreys", "()Ljava/util/List;", "getDetails", "()Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v4/data/TravelCarriageSelectV4DTO$Details;", "getPriceBlock", "()Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v4/data/TravelCarriageSelectV4DTO$PriceBlock;", "getBonusBadge", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "", "other", "hashCode", "", "toString", "", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Carriage {
        public static final int $stable = 8;
        private final BadgeDTO bonusBadge;

        @NotNull
        private final CommonControlSettings common;

        @NotNull
        private final Details details;

        @NotNull
        private final TextDTO name;

        @NotNull
        private final TextDTO number;

        @NotNull
        private final PriceBlock priceBlock;

        @NotNull
        private final TextDTO seatsCount;
        private final TextDTO seatsDetails;
        private final List<Storey> storeys;
        private final TextDTO type;
        private final BadgeDTO typeBadge;

        public Carriage(@NotNull TextDTO name, TextDTO textDTO, BadgeDTO badgeDTO, @NotNull TextDTO number, @NotNull TextDTO seatsCount, TextDTO textDTO2, List<Storey> list, @NotNull Details details, @NotNull PriceBlock priceBlock, BadgeDTO badgeDTO2, @NotNull CommonControlSettings common) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(number, "number");
            Intrinsics.checkNotNullParameter(seatsCount, "seatsCount");
            Intrinsics.checkNotNullParameter(details, "details");
            Intrinsics.checkNotNullParameter(priceBlock, "priceBlock");
            Intrinsics.checkNotNullParameter(common, "common");
            this.name = name;
            this.type = textDTO;
            this.typeBadge = badgeDTO;
            this.number = number;
            this.seatsCount = seatsCount;
            this.seatsDetails = textDTO2;
            this.storeys = list;
            this.details = details;
            this.priceBlock = priceBlock;
            this.bonusBadge = badgeDTO2;
            this.common = common;
        }

        public static /* synthetic */ Carriage copy$default(Carriage carriage, TextDTO textDTO, TextDTO textDTO2, BadgeDTO badgeDTO, TextDTO textDTO3, TextDTO textDTO4, TextDTO textDTO5, List list, Details details, PriceBlock priceBlock, BadgeDTO badgeDTO2, CommonControlSettings commonControlSettings, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = carriage.name;
            }
            if ((i11 & 2) != 0) {
                textDTO2 = carriage.type;
            }
            if ((i11 & 4) != 0) {
                badgeDTO = carriage.typeBadge;
            }
            if ((i11 & 8) != 0) {
                textDTO3 = carriage.number;
            }
            if ((i11 & 16) != 0) {
                textDTO4 = carriage.seatsCount;
            }
            if ((i11 & 32) != 0) {
                textDTO5 = carriage.seatsDetails;
            }
            if ((i11 & 64) != 0) {
                list = carriage.storeys;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                details = carriage.details;
            }
            if ((i11 & 256) != 0) {
                priceBlock = carriage.priceBlock;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                badgeDTO2 = carriage.bonusBadge;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                commonControlSettings = carriage.common;
            }
            BadgeDTO badgeDTO3 = badgeDTO2;
            CommonControlSettings commonControlSettings2 = commonControlSettings;
            Details details2 = details;
            PriceBlock priceBlock2 = priceBlock;
            TextDTO textDTO6 = textDTO5;
            List list2 = list;
            TextDTO textDTO7 = textDTO4;
            BadgeDTO badgeDTO4 = badgeDTO;
            return carriage.copy(textDTO, textDTO2, badgeDTO4, textDTO3, textDTO7, textDTO6, list2, details2, priceBlock2, badgeDTO3, commonControlSettings2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextDTO getName() {
            return this.name;
        }

        /* renamed from: component10, reason: from getter */
        public final BadgeDTO getBonusBadge() {
            return this.bonusBadge;
        }

        @NotNull
        /* renamed from: component11, reason: from getter */
        public final CommonControlSettings getCommon() {
            return this.common;
        }

        /* renamed from: component2, reason: from getter */
        public final TextDTO getType() {
            return this.type;
        }

        /* renamed from: component3, reason: from getter */
        public final BadgeDTO getTypeBadge() {
            return this.typeBadge;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final TextDTO getNumber() {
            return this.number;
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

        public final List<Storey> component7() {
            return this.storeys;
        }

        @NotNull
        /* renamed from: component8, reason: from getter */
        public final Details getDetails() {
            return this.details;
        }

        @NotNull
        /* renamed from: component9, reason: from getter */
        public final PriceBlock getPriceBlock() {
            return this.priceBlock;
        }

        @NotNull
        public final Carriage copy(@NotNull TextDTO name, TextDTO type, BadgeDTO typeBadge, @NotNull TextDTO number, @NotNull TextDTO seatsCount, TextDTO seatsDetails, List<Storey> storeys, @NotNull Details details, @NotNull PriceBlock priceBlock, BadgeDTO bonusBadge, @NotNull CommonControlSettings common) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(number, "number");
            Intrinsics.checkNotNullParameter(seatsCount, "seatsCount");
            Intrinsics.checkNotNullParameter(details, "details");
            Intrinsics.checkNotNullParameter(priceBlock, "priceBlock");
            Intrinsics.checkNotNullParameter(common, "common");
            return new Carriage(name, type, typeBadge, number, seatsCount, seatsDetails, storeys, details, priceBlock, bonusBadge, common);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Carriage)) {
                return false;
            }
            Carriage carriage = (Carriage) other;
            return Intrinsics.d(this.name, carriage.name) && Intrinsics.d(this.type, carriage.type) && Intrinsics.d(this.typeBadge, carriage.typeBadge) && Intrinsics.d(this.number, carriage.number) && Intrinsics.d(this.seatsCount, carriage.seatsCount) && Intrinsics.d(this.seatsDetails, carriage.seatsDetails) && Intrinsics.d(this.storeys, carriage.storeys) && Intrinsics.d(this.details, carriage.details) && Intrinsics.d(this.priceBlock, carriage.priceBlock) && Intrinsics.d(this.bonusBadge, carriage.bonusBadge) && Intrinsics.d(this.common, carriage.common);
        }

        public final BadgeDTO getBonusBadge() {
            return this.bonusBadge;
        }

        @NotNull
        public final CommonControlSettings getCommon() {
            return this.common;
        }

        @NotNull
        public final Details getDetails() {
            return this.details;
        }

        @NotNull
        public final TextDTO getName() {
            return this.name;
        }

        @NotNull
        public final TextDTO getNumber() {
            return this.number;
        }

        @NotNull
        public final PriceBlock getPriceBlock() {
            return this.priceBlock;
        }

        @NotNull
        public final TextDTO getSeatsCount() {
            return this.seatsCount;
        }

        public final TextDTO getSeatsDetails() {
            return this.seatsDetails;
        }

        public final List<Storey> getStoreys() {
            return this.storeys;
        }

        public final TextDTO getType() {
            return this.type;
        }

        public final BadgeDTO getTypeBadge() {
            return this.typeBadge;
        }

        public int hashCode() {
            int hashCode = this.name.hashCode() * 31;
            TextDTO textDTO = this.type;
            int hashCode2 = (hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
            BadgeDTO badgeDTO = this.typeBadge;
            int a11 = b.a(this.seatsCount, b.a(this.number, (hashCode2 + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31, 31), 31);
            TextDTO textDTO2 = this.seatsDetails;
            int hashCode3 = (a11 + (textDTO2 == null ? 0 : textDTO2.hashCode())) * 31;
            List<Storey> list = this.storeys;
            int hashCode4 = (this.priceBlock.hashCode() + ((this.details.hashCode() + ((hashCode3 + (list == null ? 0 : list.hashCode())) * 31)) * 31)) * 31;
            BadgeDTO badgeDTO2 = this.bonusBadge;
            return this.common.hashCode() + ((hashCode4 + (badgeDTO2 != null ? badgeDTO2.hashCode() : 0)) * 31);
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.name;
            TextDTO textDTO2 = this.type;
            BadgeDTO badgeDTO = this.typeBadge;
            TextDTO textDTO3 = this.number;
            TextDTO textDTO4 = this.seatsCount;
            TextDTO textDTO5 = this.seatsDetails;
            List<Storey> list = this.storeys;
            Details details = this.details;
            PriceBlock priceBlock = this.priceBlock;
            BadgeDTO badgeDTO2 = this.bonusBadge;
            CommonControlSettings commonControlSettings = this.common;
            StringBuilder g10 = g.g("Carriage(name=", textDTO, ", type=", textDTO2, ", typeBadge=");
            g10.append(badgeDTO);
            g10.append(", number=");
            g10.append(textDTO3);
            g10.append(", seatsCount=");
            d.e(", seatsDetails=", ", storeys=", g10, textDTO4, textDTO5);
            g10.append(list);
            g10.append(", details=");
            g10.append(details);
            g10.append(", priceBlock=");
            g10.append(priceBlock);
            g10.append(", bonusBadge=");
            g10.append(badgeDTO2);
            g10.append(", common=");
            return Ak.b.g(g10, commonControlSettings, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v4/data/TravelCarriageSelectV4DTO$PriceBlock;", "", "discountPriceCard", "Lru/ozon/app/android/travel/molecules/dto/priceCard/PriceCardDTO;", "originalPriceCard", "<init>", "(Lru/ozon/app/android/travel/molecules/dto/priceCard/PriceCardDTO;Lru/ozon/app/android/travel/molecules/dto/priceCard/PriceCardDTO;)V", "getDiscountPriceCard", "()Lru/ozon/app/android/travel/molecules/dto/priceCard/PriceCardDTO;", "getOriginalPriceCard", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PriceBlock {
        public static final int $stable = 8;
        private final PriceCardDTO discountPriceCard;

        @NotNull
        private final PriceCardDTO originalPriceCard;

        public PriceBlock(PriceCardDTO priceCardDTO, @NotNull PriceCardDTO originalPriceCard) {
            Intrinsics.checkNotNullParameter(originalPriceCard, "originalPriceCard");
            this.discountPriceCard = priceCardDTO;
            this.originalPriceCard = originalPriceCard;
        }

        public static /* synthetic */ PriceBlock copy$default(PriceBlock priceBlock, PriceCardDTO priceCardDTO, PriceCardDTO priceCardDTO2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                priceCardDTO = priceBlock.discountPriceCard;
            }
            if ((i11 & 2) != 0) {
                priceCardDTO2 = priceBlock.originalPriceCard;
            }
            return priceBlock.copy(priceCardDTO, priceCardDTO2);
        }

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
        public final PriceBlock copy(PriceCardDTO discountPriceCard, @NotNull PriceCardDTO originalPriceCard) {
            Intrinsics.checkNotNullParameter(originalPriceCard, "originalPriceCard");
            return new PriceBlock(discountPriceCard, originalPriceCard);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PriceBlock)) {
                return false;
            }
            PriceBlock priceBlock = (PriceBlock) other;
            return Intrinsics.d(this.discountPriceCard, priceBlock.discountPriceCard) && Intrinsics.d(this.originalPriceCard, priceBlock.originalPriceCard);
        }

        public final PriceCardDTO getDiscountPriceCard() {
            return this.discountPriceCard;
        }

        @NotNull
        public final PriceCardDTO getOriginalPriceCard() {
            return this.originalPriceCard;
        }

        public int hashCode() {
            PriceCardDTO priceCardDTO = this.discountPriceCard;
            return this.originalPriceCard.hashCode() + ((priceCardDTO == null ? 0 : priceCardDTO.hashCode()) * 31);
        }

        @NotNull
        public String toString() {
            return "PriceBlock(discountPriceCard=" + this.discountPriceCard + ", originalPriceCard=" + this.originalPriceCard + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v4/data/TravelCarriageSelectV4DTO$Storey;", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "image", "Lru/ozon/app/android/travel/molecules/dto/themeImage/v1/ThemeImageV1DTO;", "noStoreysInfo", "Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/travel/molecules/dto/themeImage/v1/ThemeImageV1DTO;Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO;)V", "getName", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getImage", "()Lru/ozon/app/android/travel/molecules/dto/themeImage/v1/ThemeImageV1DTO;", "getNoStoreysInfo", "()Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Storey {
        public static final int $stable = 8;
        private final ThemeImageV1DTO image;
        private final TextDTO name;
        private final DisclaimerDTO noStoreysInfo;

        public Storey(TextDTO textDTO, ThemeImageV1DTO themeImageV1DTO, DisclaimerDTO disclaimerDTO) {
            this.name = textDTO;
            this.image = themeImageV1DTO;
            this.noStoreysInfo = disclaimerDTO;
        }

        public static /* synthetic */ Storey copy$default(Storey storey, TextDTO textDTO, ThemeImageV1DTO themeImageV1DTO, DisclaimerDTO disclaimerDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = storey.name;
            }
            if ((i11 & 2) != 0) {
                themeImageV1DTO = storey.image;
            }
            if ((i11 & 4) != 0) {
                disclaimerDTO = storey.noStoreysInfo;
            }
            return storey.copy(textDTO, themeImageV1DTO, disclaimerDTO);
        }

        /* renamed from: component1, reason: from getter */
        public final TextDTO getName() {
            return this.name;
        }

        /* renamed from: component2, reason: from getter */
        public final ThemeImageV1DTO getImage() {
            return this.image;
        }

        /* renamed from: component3, reason: from getter */
        public final DisclaimerDTO getNoStoreysInfo() {
            return this.noStoreysInfo;
        }

        @NotNull
        public final Storey copy(TextDTO name, ThemeImageV1DTO image, DisclaimerDTO noStoreysInfo) {
            return new Storey(name, image, noStoreysInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Storey)) {
                return false;
            }
            Storey storey = (Storey) other;
            return Intrinsics.d(this.name, storey.name) && Intrinsics.d(this.image, storey.image) && Intrinsics.d(this.noStoreysInfo, storey.noStoreysInfo);
        }

        public final ThemeImageV1DTO getImage() {
            return this.image;
        }

        public final TextDTO getName() {
            return this.name;
        }

        public final DisclaimerDTO getNoStoreysInfo() {
            return this.noStoreysInfo;
        }

        public int hashCode() {
            TextDTO textDTO = this.name;
            int hashCode = (textDTO == null ? 0 : textDTO.hashCode()) * 31;
            ThemeImageV1DTO themeImageV1DTO = this.image;
            int hashCode2 = (hashCode + (themeImageV1DTO == null ? 0 : themeImageV1DTO.hashCode())) * 31;
            DisclaimerDTO disclaimerDTO = this.noStoreysInfo;
            return hashCode2 + (disclaimerDTO != null ? disclaimerDTO.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Storey(name=" + this.name + ", image=" + this.image + ", noStoreysInfo=" + this.noStoreysInfo + ")";
        }
    }

    public TravelCarriageSelectV4DTO(@NotNull List<Carriage> carriages, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(carriages, "carriages");
        this.carriages = carriages;
        this.trackingInfo = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TravelCarriageSelectV4DTO copy$default(TravelCarriageSelectV4DTO travelCarriageSelectV4DTO, List list, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = travelCarriageSelectV4DTO.carriages;
        }
        if ((i11 & 2) != 0) {
            map = travelCarriageSelectV4DTO.trackingInfo;
        }
        return travelCarriageSelectV4DTO.copy(list, map);
    }

    @NotNull
    public final List<Carriage> component1() {
        return this.carriages;
    }

    public final Map<String, TokenizedTrackingInfo> component2() {
        return this.trackingInfo;
    }

    @NotNull
    public final TravelCarriageSelectV4DTO copy(@NotNull List<Carriage> carriages, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(carriages, "carriages");
        return new TravelCarriageSelectV4DTO(carriages, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TravelCarriageSelectV4DTO)) {
            return false;
        }
        TravelCarriageSelectV4DTO travelCarriageSelectV4DTO = (TravelCarriageSelectV4DTO) other;
        return Intrinsics.d(this.carriages, travelCarriageSelectV4DTO.carriages) && Intrinsics.d(this.trackingInfo, travelCarriageSelectV4DTO.trackingInfo);
    }

    @NotNull
    public final List<Carriage> getCarriages() {
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
        return c.d("TravelCarriageSelectV4DTO(carriages=", ", trackingInfo=", ")", this.carriages, this.trackingInfo);
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u0011\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010\u001c\u001a\u00020\nHÆ\u0003J\t\u0010\u001d\u001a\u00020\fHÆ\u0003JE\u0010\u001e\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010\u001f\u001a\u00020\u00062\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020$HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006%"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v4/data/TravelCarriageSelectV4DTO$Details;", "", "servicesIcon", "", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "enableLastIconFade", "", "shiftedPreviewIcons", "Lru/ozon/app/android/travel/molecules/dto/shiftedPreviewIcons/ShiftedPreviewIconsDTO;", "detailsBadge", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "common", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "<init>", "(Ljava/util/List;ZLru/ozon/app/android/travel/molecules/dto/shiftedPreviewIcons/ShiftedPreviewIconsDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;)V", "getServicesIcon", "()Ljava/util/List;", "getEnableLastIconFade", "()Z", "getShiftedPreviewIcons", "()Lru/ozon/app/android/travel/molecules/dto/shiftedPreviewIcons/ShiftedPreviewIconsDTO;", "getDetailsBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Details {
        public static final int $stable = 8;

        @NotNull
        private final CommonControlSettings common;

        @NotNull
        private final BadgeDTO detailsBadge;
        private final boolean enableLastIconFade;
        private final List<IconDTO> servicesIcon;
        private final ShiftedPreviewIconsDTO shiftedPreviewIcons;

        public Details(List<IconDTO> list, boolean z11, ShiftedPreviewIconsDTO shiftedPreviewIconsDTO, @NotNull BadgeDTO detailsBadge, @NotNull CommonControlSettings common) {
            Intrinsics.checkNotNullParameter(detailsBadge, "detailsBadge");
            Intrinsics.checkNotNullParameter(common, "common");
            this.servicesIcon = list;
            this.enableLastIconFade = z11;
            this.shiftedPreviewIcons = shiftedPreviewIconsDTO;
            this.detailsBadge = detailsBadge;
            this.common = common;
        }

        public static /* synthetic */ Details copy$default(Details details, List list, boolean z11, ShiftedPreviewIconsDTO shiftedPreviewIconsDTO, BadgeDTO badgeDTO, CommonControlSettings commonControlSettings, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = details.servicesIcon;
            }
            if ((i11 & 2) != 0) {
                z11 = details.enableLastIconFade;
            }
            if ((i11 & 4) != 0) {
                shiftedPreviewIconsDTO = details.shiftedPreviewIcons;
            }
            if ((i11 & 8) != 0) {
                badgeDTO = details.detailsBadge;
            }
            if ((i11 & 16) != 0) {
                commonControlSettings = details.common;
            }
            CommonControlSettings commonControlSettings2 = commonControlSettings;
            ShiftedPreviewIconsDTO shiftedPreviewIconsDTO2 = shiftedPreviewIconsDTO;
            return details.copy(list, z11, shiftedPreviewIconsDTO2, badgeDTO, commonControlSettings2);
        }

        public final List<IconDTO> component1() {
            return this.servicesIcon;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getEnableLastIconFade() {
            return this.enableLastIconFade;
        }

        /* renamed from: component3, reason: from getter */
        public final ShiftedPreviewIconsDTO getShiftedPreviewIcons() {
            return this.shiftedPreviewIcons;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final BadgeDTO getDetailsBadge() {
            return this.detailsBadge;
        }

        @NotNull
        /* renamed from: component5, reason: from getter */
        public final CommonControlSettings getCommon() {
            return this.common;
        }

        @NotNull
        public final Details copy(List<IconDTO> servicesIcon, boolean enableLastIconFade, ShiftedPreviewIconsDTO shiftedPreviewIcons, @NotNull BadgeDTO detailsBadge, @NotNull CommonControlSettings common) {
            Intrinsics.checkNotNullParameter(detailsBadge, "detailsBadge");
            Intrinsics.checkNotNullParameter(common, "common");
            return new Details(servicesIcon, enableLastIconFade, shiftedPreviewIcons, detailsBadge, common);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Details)) {
                return false;
            }
            Details details = (Details) other;
            return Intrinsics.d(this.servicesIcon, details.servicesIcon) && this.enableLastIconFade == details.enableLastIconFade && Intrinsics.d(this.shiftedPreviewIcons, details.shiftedPreviewIcons) && Intrinsics.d(this.detailsBadge, details.detailsBadge) && Intrinsics.d(this.common, details.common);
        }

        @NotNull
        public final CommonControlSettings getCommon() {
            return this.common;
        }

        @NotNull
        public final BadgeDTO getDetailsBadge() {
            return this.detailsBadge;
        }

        public final boolean getEnableLastIconFade() {
            return this.enableLastIconFade;
        }

        public final List<IconDTO> getServicesIcon() {
            return this.servicesIcon;
        }

        public final ShiftedPreviewIconsDTO getShiftedPreviewIcons() {
            return this.shiftedPreviewIcons;
        }

        public int hashCode() {
            List<IconDTO> list = this.servicesIcon;
            int a11 = C3532b.a((list == null ? 0 : list.hashCode()) * 31, 31, this.enableLastIconFade);
            ShiftedPreviewIconsDTO shiftedPreviewIconsDTO = this.shiftedPreviewIcons;
            return this.common.hashCode() + C3124a.c(this.detailsBadge, (a11 + (shiftedPreviewIconsDTO != null ? shiftedPreviewIconsDTO.hashCode() : 0)) * 31, 31);
        }

        @NotNull
        public String toString() {
            List<IconDTO> list = this.servicesIcon;
            boolean z11 = this.enableLastIconFade;
            ShiftedPreviewIconsDTO shiftedPreviewIconsDTO = this.shiftedPreviewIcons;
            BadgeDTO badgeDTO = this.detailsBadge;
            CommonControlSettings commonControlSettings = this.common;
            StringBuilder sb2 = new StringBuilder("Details(servicesIcon=");
            sb2.append(list);
            sb2.append(", enableLastIconFade=");
            sb2.append(z11);
            sb2.append(", shiftedPreviewIcons=");
            sb2.append(shiftedPreviewIconsDTO);
            sb2.append(", detailsBadge=");
            sb2.append(badgeDTO);
            sb2.append(", common=");
            return Ak.b.g(sb2, commonControlSettings, ")");
        }

        public /* synthetic */ Details(List list, boolean z11, ShiftedPreviewIconsDTO shiftedPreviewIconsDTO, BadgeDTO badgeDTO, CommonControlSettings commonControlSettings, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, (i11 & 2) != 0 ? false : z11, shiftedPreviewIconsDTO, badgeDTO, commonControlSettings);
        }
    }
}
