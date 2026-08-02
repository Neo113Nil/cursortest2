package ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v3.data;

import Bl.C2639a;
import D3.g;
import De.C2859b;
import F3.G;
import Lc.a;
import Ns.b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.dto.starsBadge.v1.StarsBadgeDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001:\u00059:;<=B]\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010+\u001a\u00020\tHÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0013HÆ\u0003Jq\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÆ\u0001J\u0013\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00105\u001a\u000206HÖ\u0001J\t\u00107\u001a\u000208HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'¨\u0006>"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/data/HotelsBookTotalV3DTO;", "", "finalPrice", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/data/HotelsBookTotalV3DTO$FinalPriceDTO;", "basePrice", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/data/HotelsBookTotalV3DTO$BasePriceDTO;", "bonuses", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/data/HotelsBookTotalV3DTO$BonusesDTO;", "nextButton", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "agreement", "Lru/ozon/uni/atoms/data/text/TextDTO;", "notification", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "common", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "stickyContainer", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/data/HotelsBookTotalV3DTO$StickyContainer;", "starsBonuses", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/data/HotelsBookTotalV3DTO$StarsBonuses;", "<init>", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/data/HotelsBookTotalV3DTO$FinalPriceDTO;Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/data/HotelsBookTotalV3DTO$BasePriceDTO;Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/data/HotelsBookTotalV3DTO$BonusesDTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/notification/NotificationDTO;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/data/HotelsBookTotalV3DTO$StickyContainer;Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/data/HotelsBookTotalV3DTO$StarsBonuses;)V", "getFinalPrice", "()Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/data/HotelsBookTotalV3DTO$FinalPriceDTO;", "getBasePrice", "()Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/data/HotelsBookTotalV3DTO$BasePriceDTO;", "getBonuses", "()Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/data/HotelsBookTotalV3DTO$BonusesDTO;", "getNextButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getAgreement", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getNotification", "()Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "getStickyContainer", "()Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/data/HotelsBookTotalV3DTO$StickyContainer;", "getStarsBonuses", "()Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/data/HotelsBookTotalV3DTO$StarsBonuses;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "", "FinalPriceDTO", "BasePriceDTO", "BonusesDTO", "StickyContainer", "StarsBonuses", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class HotelsBookTotalV3DTO {
    private final TextDTO agreement;
    private final BasePriceDTO basePrice;
    private final BonusesDTO bonuses;
    private final CommonControlSettings common;

    @NotNull
    private final FinalPriceDTO finalPrice;

    @NotNull
    private final ButtonV3DTO nextButton;
    private final NotificationDTO notification;
    private final StarsBonuses starsBonuses;
    private final StickyContainer stickyContainer;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/data/HotelsBookTotalV3DTO$BasePriceDTO;", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "price", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "getName", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getPrice", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BasePriceDTO {

        @NotNull
        private final TextDTO name;

        @NotNull
        private final TextDTO price;

        public BasePriceDTO(@NotNull TextDTO name, @NotNull TextDTO price) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(price, "price");
            this.name = name;
            this.price = price;
        }

        public static /* synthetic */ BasePriceDTO copy$default(BasePriceDTO basePriceDTO, TextDTO textDTO, TextDTO textDTO2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = basePriceDTO.name;
            }
            if ((i11 & 2) != 0) {
                textDTO2 = basePriceDTO.price;
            }
            return basePriceDTO.copy(textDTO, textDTO2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextDTO getName() {
            return this.name;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final TextDTO getPrice() {
            return this.price;
        }

        @NotNull
        public final BasePriceDTO copy(@NotNull TextDTO name, @NotNull TextDTO price) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(price, "price");
            return new BasePriceDTO(name, price);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BasePriceDTO)) {
                return false;
            }
            BasePriceDTO basePriceDTO = (BasePriceDTO) other;
            return Intrinsics.d(this.name, basePriceDTO.name) && Intrinsics.d(this.price, basePriceDTO.price);
        }

        @NotNull
        public final TextDTO getName() {
            return this.name;
        }

        @NotNull
        public final TextDTO getPrice() {
            return this.price;
        }

        public int hashCode() {
            return this.price.hashCode() + (this.name.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return a.b("BasePriceDTO(name=", this.name, ", price=", this.price, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/data/HotelsBookTotalV3DTO$BonusesDTO;", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "amount", "icon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;)V", "getName", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getAmount", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BonusesDTO {

        @NotNull
        private final TextDTO amount;
        private final IconDTO icon;

        @NotNull
        private final TextDTO name;

        public BonusesDTO(@NotNull TextDTO name, @NotNull TextDTO amount, IconDTO iconDTO) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(amount, "amount");
            this.name = name;
            this.amount = amount;
            this.icon = iconDTO;
        }

        public static /* synthetic */ BonusesDTO copy$default(BonusesDTO bonusesDTO, TextDTO textDTO, TextDTO textDTO2, IconDTO iconDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = bonusesDTO.name;
            }
            if ((i11 & 2) != 0) {
                textDTO2 = bonusesDTO.amount;
            }
            if ((i11 & 4) != 0) {
                iconDTO = bonusesDTO.icon;
            }
            return bonusesDTO.copy(textDTO, textDTO2, iconDTO);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextDTO getName() {
            return this.name;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final TextDTO getAmount() {
            return this.amount;
        }

        /* renamed from: component3, reason: from getter */
        public final IconDTO getIcon() {
            return this.icon;
        }

        @NotNull
        public final BonusesDTO copy(@NotNull TextDTO name, @NotNull TextDTO amount, IconDTO icon) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(amount, "amount");
            return new BonusesDTO(name, amount, icon);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BonusesDTO)) {
                return false;
            }
            BonusesDTO bonusesDTO = (BonusesDTO) other;
            return Intrinsics.d(this.name, bonusesDTO.name) && Intrinsics.d(this.amount, bonusesDTO.amount) && Intrinsics.d(this.icon, bonusesDTO.icon);
        }

        @NotNull
        public final TextDTO getAmount() {
            return this.amount;
        }

        public final IconDTO getIcon() {
            return this.icon;
        }

        @NotNull
        public final TextDTO getName() {
            return this.name;
        }

        public int hashCode() {
            int a11 = b.a(this.amount, this.name.hashCode() * 31, 31);
            IconDTO iconDTO = this.icon;
            return a11 + (iconDTO == null ? 0 : iconDTO.hashCode());
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.name;
            TextDTO textDTO2 = this.amount;
            IconDTO iconDTO = this.icon;
            StringBuilder g10 = g.g("BonusesDTO(name=", textDTO, ", amount=", textDTO2, ", icon=");
            g10.append(iconDTO);
            g10.append(")");
            return g10.toString();
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/data/HotelsBookTotalV3DTO$FinalPriceDTO;", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "infoIcon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "price", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/price/PriceDTO;)V", "getName", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getInfoIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getPrice", "()Lru/ozon/uni/atoms/data/price/PriceDTO;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FinalPriceDTO {
        private final IconDTO infoIcon;

        @NotNull
        private final TextDTO name;

        @NotNull
        private final PriceDTO price;

        public FinalPriceDTO(@NotNull TextDTO name, IconDTO iconDTO, @NotNull PriceDTO price) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(price, "price");
            this.name = name;
            this.infoIcon = iconDTO;
            this.price = price;
        }

        public static /* synthetic */ FinalPriceDTO copy$default(FinalPriceDTO finalPriceDTO, TextDTO textDTO, IconDTO iconDTO, PriceDTO priceDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = finalPriceDTO.name;
            }
            if ((i11 & 2) != 0) {
                iconDTO = finalPriceDTO.infoIcon;
            }
            if ((i11 & 4) != 0) {
                priceDTO = finalPriceDTO.price;
            }
            return finalPriceDTO.copy(textDTO, iconDTO, priceDTO);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextDTO getName() {
            return this.name;
        }

        /* renamed from: component2, reason: from getter */
        public final IconDTO getInfoIcon() {
            return this.infoIcon;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final PriceDTO getPrice() {
            return this.price;
        }

        @NotNull
        public final FinalPriceDTO copy(@NotNull TextDTO name, IconDTO infoIcon, @NotNull PriceDTO price) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(price, "price");
            return new FinalPriceDTO(name, infoIcon, price);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FinalPriceDTO)) {
                return false;
            }
            FinalPriceDTO finalPriceDTO = (FinalPriceDTO) other;
            return Intrinsics.d(this.name, finalPriceDTO.name) && Intrinsics.d(this.infoIcon, finalPriceDTO.infoIcon) && Intrinsics.d(this.price, finalPriceDTO.price);
        }

        public final IconDTO getInfoIcon() {
            return this.infoIcon;
        }

        @NotNull
        public final TextDTO getName() {
            return this.name;
        }

        @NotNull
        public final PriceDTO getPrice() {
            return this.price;
        }

        public int hashCode() {
            int hashCode = this.name.hashCode() * 31;
            IconDTO iconDTO = this.infoIcon;
            return this.price.hashCode() + ((hashCode + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31);
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.name;
            IconDTO iconDTO = this.infoIcon;
            PriceDTO priceDTO = this.price;
            StringBuilder d11 = C2639a.d("FinalPriceDTO(name=", ", infoIcon=", ", price=", iconDTO, textDTO);
            d11.append(priceDTO);
            d11.append(")");
            return d11.toString();
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/data/HotelsBookTotalV3DTO$StarsBonuses;", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "starsBadge", "Lru/ozon/app/android/travel/molecules/dto/starsBadge/v1/StarsBadgeDTO;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/travel/molecules/dto/starsBadge/v1/StarsBadgeDTO;)V", "getName", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getStarsBadge", "()Lru/ozon/app/android/travel/molecules/dto/starsBadge/v1/StarsBadgeDTO;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class StarsBonuses {

        @NotNull
        private final TextDTO name;

        @NotNull
        private final StarsBadgeDTO starsBadge;

        public StarsBonuses(@NotNull TextDTO name, @NotNull StarsBadgeDTO starsBadge) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(starsBadge, "starsBadge");
            this.name = name;
            this.starsBadge = starsBadge;
        }

        public static /* synthetic */ StarsBonuses copy$default(StarsBonuses starsBonuses, TextDTO textDTO, StarsBadgeDTO starsBadgeDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = starsBonuses.name;
            }
            if ((i11 & 2) != 0) {
                starsBadgeDTO = starsBonuses.starsBadge;
            }
            return starsBonuses.copy(textDTO, starsBadgeDTO);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextDTO getName() {
            return this.name;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final StarsBadgeDTO getStarsBadge() {
            return this.starsBadge;
        }

        @NotNull
        public final StarsBonuses copy(@NotNull TextDTO name, @NotNull StarsBadgeDTO starsBadge) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(starsBadge, "starsBadge");
            return new StarsBonuses(name, starsBadge);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StarsBonuses)) {
                return false;
            }
            StarsBonuses starsBonuses = (StarsBonuses) other;
            return Intrinsics.d(this.name, starsBonuses.name) && Intrinsics.d(this.starsBadge, starsBonuses.starsBadge);
        }

        @NotNull
        public final TextDTO getName() {
            return this.name;
        }

        @NotNull
        public final StarsBadgeDTO getStarsBadge() {
            return this.starsBadge;
        }

        public int hashCode() {
            return this.starsBadge.hashCode() + (this.name.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "StarsBonuses(name=" + this.name + ", starsBadge=" + this.starsBadge + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/data/HotelsBookTotalV3DTO$StickyContainer;", "", "button", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "<init>", "(Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;)V", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class StickyContainer {

        @NotNull
        private final ButtonV3DTO button;

        public StickyContainer(@NotNull ButtonV3DTO button) {
            Intrinsics.checkNotNullParameter(button, "button");
            this.button = button;
        }

        public static /* synthetic */ StickyContainer copy$default(StickyContainer stickyContainer, ButtonV3DTO buttonV3DTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                buttonV3DTO = stickyContainer.button;
            }
            return stickyContainer.copy(buttonV3DTO);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final ButtonV3DTO getButton() {
            return this.button;
        }

        @NotNull
        public final StickyContainer copy(@NotNull ButtonV3DTO button) {
            Intrinsics.checkNotNullParameter(button, "button");
            return new StickyContainer(button);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof StickyContainer) && Intrinsics.d(this.button, ((StickyContainer) other).button);
        }

        @NotNull
        public final ButtonV3DTO getButton() {
            return this.button;
        }

        public int hashCode() {
            return this.button.hashCode();
        }

        @NotNull
        public String toString() {
            return G.b(this.button, "StickyContainer(button=", ")");
        }
    }

    public HotelsBookTotalV3DTO(@NotNull FinalPriceDTO finalPrice, BasePriceDTO basePriceDTO, BonusesDTO bonusesDTO, @NotNull ButtonV3DTO nextButton, TextDTO textDTO, NotificationDTO notificationDTO, CommonControlSettings commonControlSettings, StickyContainer stickyContainer, StarsBonuses starsBonuses) {
        Intrinsics.checkNotNullParameter(finalPrice, "finalPrice");
        Intrinsics.checkNotNullParameter(nextButton, "nextButton");
        this.finalPrice = finalPrice;
        this.basePrice = basePriceDTO;
        this.bonuses = bonusesDTO;
        this.nextButton = nextButton;
        this.agreement = textDTO;
        this.notification = notificationDTO;
        this.common = commonControlSettings;
        this.stickyContainer = stickyContainer;
        this.starsBonuses = starsBonuses;
    }

    public static /* synthetic */ HotelsBookTotalV3DTO copy$default(HotelsBookTotalV3DTO hotelsBookTotalV3DTO, FinalPriceDTO finalPriceDTO, BasePriceDTO basePriceDTO, BonusesDTO bonusesDTO, ButtonV3DTO buttonV3DTO, TextDTO textDTO, NotificationDTO notificationDTO, CommonControlSettings commonControlSettings, StickyContainer stickyContainer, StarsBonuses starsBonuses, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            finalPriceDTO = hotelsBookTotalV3DTO.finalPrice;
        }
        if ((i11 & 2) != 0) {
            basePriceDTO = hotelsBookTotalV3DTO.basePrice;
        }
        if ((i11 & 4) != 0) {
            bonusesDTO = hotelsBookTotalV3DTO.bonuses;
        }
        if ((i11 & 8) != 0) {
            buttonV3DTO = hotelsBookTotalV3DTO.nextButton;
        }
        if ((i11 & 16) != 0) {
            textDTO = hotelsBookTotalV3DTO.agreement;
        }
        if ((i11 & 32) != 0) {
            notificationDTO = hotelsBookTotalV3DTO.notification;
        }
        if ((i11 & 64) != 0) {
            commonControlSettings = hotelsBookTotalV3DTO.common;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            stickyContainer = hotelsBookTotalV3DTO.stickyContainer;
        }
        if ((i11 & 256) != 0) {
            starsBonuses = hotelsBookTotalV3DTO.starsBonuses;
        }
        StickyContainer stickyContainer2 = stickyContainer;
        StarsBonuses starsBonuses2 = starsBonuses;
        NotificationDTO notificationDTO2 = notificationDTO;
        CommonControlSettings commonControlSettings2 = commonControlSettings;
        TextDTO textDTO2 = textDTO;
        BonusesDTO bonusesDTO2 = bonusesDTO;
        return hotelsBookTotalV3DTO.copy(finalPriceDTO, basePriceDTO, bonusesDTO2, buttonV3DTO, textDTO2, notificationDTO2, commonControlSettings2, stickyContainer2, starsBonuses2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final FinalPriceDTO getFinalPrice() {
        return this.finalPrice;
    }

    /* renamed from: component2, reason: from getter */
    public final BasePriceDTO getBasePrice() {
        return this.basePrice;
    }

    /* renamed from: component3, reason: from getter */
    public final BonusesDTO getBonuses() {
        return this.bonuses;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final ButtonV3DTO getNextButton() {
        return this.nextButton;
    }

    /* renamed from: component5, reason: from getter */
    public final TextDTO getAgreement() {
        return this.agreement;
    }

    /* renamed from: component6, reason: from getter */
    public final NotificationDTO getNotification() {
        return this.notification;
    }

    /* renamed from: component7, reason: from getter */
    public final CommonControlSettings getCommon() {
        return this.common;
    }

    /* renamed from: component8, reason: from getter */
    public final StickyContainer getStickyContainer() {
        return this.stickyContainer;
    }

    /* renamed from: component9, reason: from getter */
    public final StarsBonuses getStarsBonuses() {
        return this.starsBonuses;
    }

    @NotNull
    public final HotelsBookTotalV3DTO copy(@NotNull FinalPriceDTO finalPrice, BasePriceDTO basePrice, BonusesDTO bonuses, @NotNull ButtonV3DTO nextButton, TextDTO agreement, NotificationDTO notification, CommonControlSettings common, StickyContainer stickyContainer, StarsBonuses starsBonuses) {
        Intrinsics.checkNotNullParameter(finalPrice, "finalPrice");
        Intrinsics.checkNotNullParameter(nextButton, "nextButton");
        return new HotelsBookTotalV3DTO(finalPrice, basePrice, bonuses, nextButton, agreement, notification, common, stickyContainer, starsBonuses);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HotelsBookTotalV3DTO)) {
            return false;
        }
        HotelsBookTotalV3DTO hotelsBookTotalV3DTO = (HotelsBookTotalV3DTO) other;
        return Intrinsics.d(this.finalPrice, hotelsBookTotalV3DTO.finalPrice) && Intrinsics.d(this.basePrice, hotelsBookTotalV3DTO.basePrice) && Intrinsics.d(this.bonuses, hotelsBookTotalV3DTO.bonuses) && Intrinsics.d(this.nextButton, hotelsBookTotalV3DTO.nextButton) && Intrinsics.d(this.agreement, hotelsBookTotalV3DTO.agreement) && Intrinsics.d(this.notification, hotelsBookTotalV3DTO.notification) && Intrinsics.d(this.common, hotelsBookTotalV3DTO.common) && Intrinsics.d(this.stickyContainer, hotelsBookTotalV3DTO.stickyContainer) && Intrinsics.d(this.starsBonuses, hotelsBookTotalV3DTO.starsBonuses);
    }

    public final TextDTO getAgreement() {
        return this.agreement;
    }

    public final BasePriceDTO getBasePrice() {
        return this.basePrice;
    }

    public final BonusesDTO getBonuses() {
        return this.bonuses;
    }

    public final CommonControlSettings getCommon() {
        return this.common;
    }

    @NotNull
    public final FinalPriceDTO getFinalPrice() {
        return this.finalPrice;
    }

    @NotNull
    public final ButtonV3DTO getNextButton() {
        return this.nextButton;
    }

    public final NotificationDTO getNotification() {
        return this.notification;
    }

    public final StarsBonuses getStarsBonuses() {
        return this.starsBonuses;
    }

    public final StickyContainer getStickyContainer() {
        return this.stickyContainer;
    }

    public int hashCode() {
        int hashCode = this.finalPrice.hashCode() * 31;
        BasePriceDTO basePriceDTO = this.basePrice;
        int hashCode2 = (hashCode + (basePriceDTO == null ? 0 : basePriceDTO.hashCode())) * 31;
        BonusesDTO bonusesDTO = this.bonuses;
        int c11 = C2859b.c(this.nextButton, (hashCode2 + (bonusesDTO == null ? 0 : bonusesDTO.hashCode())) * 31, 31);
        TextDTO textDTO = this.agreement;
        int hashCode3 = (c11 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        NotificationDTO notificationDTO = this.notification;
        int hashCode4 = (hashCode3 + (notificationDTO == null ? 0 : notificationDTO.hashCode())) * 31;
        CommonControlSettings commonControlSettings = this.common;
        int hashCode5 = (hashCode4 + (commonControlSettings == null ? 0 : commonControlSettings.hashCode())) * 31;
        StickyContainer stickyContainer = this.stickyContainer;
        int hashCode6 = (hashCode5 + (stickyContainer == null ? 0 : stickyContainer.hashCode())) * 31;
        StarsBonuses starsBonuses = this.starsBonuses;
        return hashCode6 + (starsBonuses != null ? starsBonuses.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "HotelsBookTotalV3DTO(finalPrice=" + this.finalPrice + ", basePrice=" + this.basePrice + ", bonuses=" + this.bonuses + ", nextButton=" + this.nextButton + ", agreement=" + this.agreement + ", notification=" + this.notification + ", common=" + this.common + ", stickyContainer=" + this.stickyContainer + ", starsBonuses=" + this.starsBonuses + ")";
    }
}
