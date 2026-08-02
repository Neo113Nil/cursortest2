package ru.ozon.app.android.travel.feature.avia.widgets.travelFlightCheckTariff.v2.data;

import Fm.C3051a;
import Ih.a;
import Kk.C3532b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.texts.TextAtomWithIcon;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.price.Price;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0017B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/travelFlightCheckTariff/v2/data/TravelFlightCheckTariffV2DTO;", "", "refreshAction", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "tariffs", "", "Lru/ozon/app/android/travel/feature/avia/widgets/travelFlightCheckTariff/v2/data/TravelFlightCheckTariffV2DTO$Tariff;", "<init>", "(Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/List;)V", "getRefreshAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTariffs", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Tariff", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class TravelFlightCheckTariffV2DTO {
    public static final int $stable = 8;
    private final AtomActionDTO refreshAction;

    @NotNull
    private final List<Tariff> tariffs;

    public TravelFlightCheckTariffV2DTO(AtomActionDTO atomActionDTO, @NotNull List<Tariff> tariffs) {
        Intrinsics.checkNotNullParameter(tariffs, "tariffs");
        this.refreshAction = atomActionDTO;
        this.tariffs = tariffs;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TravelFlightCheckTariffV2DTO copy$default(TravelFlightCheckTariffV2DTO travelFlightCheckTariffV2DTO, AtomActionDTO atomActionDTO, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            atomActionDTO = travelFlightCheckTariffV2DTO.refreshAction;
        }
        if ((i11 & 2) != 0) {
            list = travelFlightCheckTariffV2DTO.tariffs;
        }
        return travelFlightCheckTariffV2DTO.copy(atomActionDTO, list);
    }

    /* renamed from: component1, reason: from getter */
    public final AtomActionDTO getRefreshAction() {
        return this.refreshAction;
    }

    @NotNull
    public final List<Tariff> component2() {
        return this.tariffs;
    }

    @NotNull
    public final TravelFlightCheckTariffV2DTO copy(AtomActionDTO refreshAction, @NotNull List<Tariff> tariffs) {
        Intrinsics.checkNotNullParameter(tariffs, "tariffs");
        return new TravelFlightCheckTariffV2DTO(refreshAction, tariffs);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TravelFlightCheckTariffV2DTO)) {
            return false;
        }
        TravelFlightCheckTariffV2DTO travelFlightCheckTariffV2DTO = (TravelFlightCheckTariffV2DTO) other;
        return Intrinsics.d(this.refreshAction, travelFlightCheckTariffV2DTO.refreshAction) && Intrinsics.d(this.tariffs, travelFlightCheckTariffV2DTO.tariffs);
    }

    public final AtomActionDTO getRefreshAction() {
        return this.refreshAction;
    }

    @NotNull
    public final List<Tariff> getTariffs() {
        return this.tariffs;
    }

    public int hashCode() {
        AtomActionDTO atomActionDTO = this.refreshAction;
        return this.tariffs.hashCode() + ((atomActionDTO == null ? 0 : atomActionDTO.hashCode()) * 31);
    }

    @NotNull
    public String toString() {
        return "TravelFlightCheckTariffV2DTO(refreshAction=" + this.refreshAction + ", tariffs=" + this.tariffs + ")";
    }

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u00016Bk\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010*\u001a\u00020\nHÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\t\u0010.\u001a\u00020\u0010HÆ\u0003J\u000f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012HÆ\u0003J}\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012HÆ\u0001J\u0013\u00101\u001a\u00020\u00102\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00103\u001a\u000204HÖ\u0001J\t\u00105\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001cR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0017R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010#R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%¨\u00067"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/travelFlightCheckTariff/v2/data/TravelFlightCheckTariffV2DTO$Tariff;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "price", "Lru/ozon/uni/atoms/data/price/Price;", "discount", "premiumBadge", "Lru/ozon/uni/atoms/data/badge/Badge;", "selectAction", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "badge", "priceLabel", "borderColor", "", "isSelected", "", "directions", "", "Lru/ozon/app/android/travel/feature/avia/widgets/travelFlightCheckTariff/v2/data/TravelFlightCheckTariffV2DTO$Tariff$Direction;", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/price/Price;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/badge/Badge;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/data/badge/Badge;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/String;ZLjava/util/List;)V", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getPrice", "()Lru/ozon/uni/atoms/data/price/Price;", "getDiscount", "getPremiumBadge", "()Lru/ozon/uni/atoms/data/badge/Badge;", "getSelectAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getBadge", "getPriceLabel", "getBorderColor", "()Ljava/lang/String;", "()Z", "getDirections", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "other", "hashCode", "", "toString", "Direction", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class Tariff {
        public static final int $stable = 8;
        private final Badge badge;
        private final String borderColor;

        @NotNull
        private final List<Direction> directions;
        private final TextAtom discount;
        private final boolean isSelected;
        private final Badge premiumBadge;

        @NotNull
        private final Price price;
        private final TextAtom priceLabel;

        @NotNull
        private final AtomActionDTO selectAction;

        @NotNull
        private final TextAtom title;

        public Tariff(@NotNull TextAtom title, @NotNull Price price, TextAtom textAtom, Badge badge, @NotNull AtomActionDTO selectAction, Badge badge2, TextAtom textAtom2, String str, boolean z11, @NotNull List<Direction> directions) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(price, "price");
            Intrinsics.checkNotNullParameter(selectAction, "selectAction");
            Intrinsics.checkNotNullParameter(directions, "directions");
            this.title = title;
            this.price = price;
            this.discount = textAtom;
            this.premiumBadge = badge;
            this.selectAction = selectAction;
            this.badge = badge2;
            this.priceLabel = textAtom2;
            this.borderColor = str;
            this.isSelected = z11;
            this.directions = directions;
        }

        public static /* synthetic */ Tariff copy$default(Tariff tariff, TextAtom textAtom, Price price, TextAtom textAtom2, Badge badge, AtomActionDTO atomActionDTO, Badge badge2, TextAtom textAtom3, String str, boolean z11, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textAtom = tariff.title;
            }
            if ((i11 & 2) != 0) {
                price = tariff.price;
            }
            if ((i11 & 4) != 0) {
                textAtom2 = tariff.discount;
            }
            if ((i11 & 8) != 0) {
                badge = tariff.premiumBadge;
            }
            if ((i11 & 16) != 0) {
                atomActionDTO = tariff.selectAction;
            }
            if ((i11 & 32) != 0) {
                badge2 = tariff.badge;
            }
            if ((i11 & 64) != 0) {
                textAtom3 = tariff.priceLabel;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                str = tariff.borderColor;
            }
            if ((i11 & 256) != 0) {
                z11 = tariff.isSelected;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                list = tariff.directions;
            }
            boolean z12 = z11;
            List list2 = list;
            TextAtom textAtom4 = textAtom3;
            String str2 = str;
            AtomActionDTO atomActionDTO2 = atomActionDTO;
            Badge badge3 = badge2;
            return tariff.copy(textAtom, price, textAtom2, badge, atomActionDTO2, badge3, textAtom4, str2, z12, list2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextAtom getTitle() {
            return this.title;
        }

        @NotNull
        public final List<Direction> component10() {
            return this.directions;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final Price getPrice() {
            return this.price;
        }

        /* renamed from: component3, reason: from getter */
        public final TextAtom getDiscount() {
            return this.discount;
        }

        /* renamed from: component4, reason: from getter */
        public final Badge getPremiumBadge() {
            return this.premiumBadge;
        }

        @NotNull
        /* renamed from: component5, reason: from getter */
        public final AtomActionDTO getSelectAction() {
            return this.selectAction;
        }

        /* renamed from: component6, reason: from getter */
        public final Badge getBadge() {
            return this.badge;
        }

        /* renamed from: component7, reason: from getter */
        public final TextAtom getPriceLabel() {
            return this.priceLabel;
        }

        /* renamed from: component8, reason: from getter */
        public final String getBorderColor() {
            return this.borderColor;
        }

        /* renamed from: component9, reason: from getter */
        public final boolean getIsSelected() {
            return this.isSelected;
        }

        @NotNull
        public final Tariff copy(@NotNull TextAtom title, @NotNull Price price, TextAtom discount, Badge premiumBadge, @NotNull AtomActionDTO selectAction, Badge badge, TextAtom priceLabel, String borderColor, boolean isSelected, @NotNull List<Direction> directions) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(price, "price");
            Intrinsics.checkNotNullParameter(selectAction, "selectAction");
            Intrinsics.checkNotNullParameter(directions, "directions");
            return new Tariff(title, price, discount, premiumBadge, selectAction, badge, priceLabel, borderColor, isSelected, directions);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Tariff)) {
                return false;
            }
            Tariff tariff = (Tariff) other;
            return Intrinsics.d(this.title, tariff.title) && Intrinsics.d(this.price, tariff.price) && Intrinsics.d(this.discount, tariff.discount) && Intrinsics.d(this.premiumBadge, tariff.premiumBadge) && Intrinsics.d(this.selectAction, tariff.selectAction) && Intrinsics.d(this.badge, tariff.badge) && Intrinsics.d(this.priceLabel, tariff.priceLabel) && Intrinsics.d(this.borderColor, tariff.borderColor) && this.isSelected == tariff.isSelected && Intrinsics.d(this.directions, tariff.directions);
        }

        public final Badge getBadge() {
            return this.badge;
        }

        public final String getBorderColor() {
            return this.borderColor;
        }

        @NotNull
        public final List<Direction> getDirections() {
            return this.directions;
        }

        public final TextAtom getDiscount() {
            return this.discount;
        }

        public final Badge getPremiumBadge() {
            return this.premiumBadge;
        }

        @NotNull
        public final Price getPrice() {
            return this.price;
        }

        public final TextAtom getPriceLabel() {
            return this.priceLabel;
        }

        @NotNull
        public final AtomActionDTO getSelectAction() {
            return this.selectAction;
        }

        @NotNull
        public final TextAtom getTitle() {
            return this.title;
        }

        public int hashCode() {
            int a11 = C3051a.a(this.price, this.title.hashCode() * 31, 31);
            TextAtom textAtom = this.discount;
            int hashCode = (a11 + (textAtom == null ? 0 : textAtom.hashCode())) * 31;
            Badge badge = this.premiumBadge;
            int b11 = a.b(this.selectAction, (hashCode + (badge == null ? 0 : badge.hashCode())) * 31, 31);
            Badge badge2 = this.badge;
            int hashCode2 = (b11 + (badge2 == null ? 0 : badge2.hashCode())) * 31;
            TextAtom textAtom2 = this.priceLabel;
            int hashCode3 = (hashCode2 + (textAtom2 == null ? 0 : textAtom2.hashCode())) * 31;
            String str = this.borderColor;
            return this.directions.hashCode() + C3532b.a((hashCode3 + (str != null ? str.hashCode() : 0)) * 31, 31, this.isSelected);
        }

        public final boolean isSelected() {
            return this.isSelected;
        }

        @NotNull
        public String toString() {
            return "Tariff(title=" + this.title + ", price=" + this.price + ", discount=" + this.discount + ", premiumBadge=" + this.premiumBadge + ", selectAction=" + this.selectAction + ", badge=" + this.badge + ", priceLabel=" + this.priceLabel + ", borderColor=" + this.borderColor + ", isSelected=" + this.isSelected + ", directions=" + this.directions + ")";
        }

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/travelFlightCheckTariff/v2/data/TravelFlightCheckTariffV2DTO$Tariff$Direction;", "", "route", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "directionName", "airlineIcon", "", "features", "", "Lru/ozon/app/android/atoms/data/texts/TextAtomWithIcon;", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/String;Ljava/util/List;)V", "getRoute", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getDirectionName", "getAirlineIcon", "()Ljava/lang/String;", "getFeatures", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Direction {
            public static final int $stable = 8;
            private final String airlineIcon;
            private final TextAtom directionName;

            @NotNull
            private final List<TextAtomWithIcon> features;

            @NotNull
            private final TextAtom route;

            public Direction(@NotNull TextAtom route, TextAtom textAtom, String str, @NotNull List<TextAtomWithIcon> features) {
                Intrinsics.checkNotNullParameter(route, "route");
                Intrinsics.checkNotNullParameter(features, "features");
                this.route = route;
                this.directionName = textAtom;
                this.airlineIcon = str;
                this.features = features;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Direction copy$default(Direction direction, TextAtom textAtom, TextAtom textAtom2, String str, List list, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    textAtom = direction.route;
                }
                if ((i11 & 2) != 0) {
                    textAtom2 = direction.directionName;
                }
                if ((i11 & 4) != 0) {
                    str = direction.airlineIcon;
                }
                if ((i11 & 8) != 0) {
                    list = direction.features;
                }
                return direction.copy(textAtom, textAtom2, str, list);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final TextAtom getRoute() {
                return this.route;
            }

            /* renamed from: component2, reason: from getter */
            public final TextAtom getDirectionName() {
                return this.directionName;
            }

            /* renamed from: component3, reason: from getter */
            public final String getAirlineIcon() {
                return this.airlineIcon;
            }

            @NotNull
            public final List<TextAtomWithIcon> component4() {
                return this.features;
            }

            @NotNull
            public final Direction copy(@NotNull TextAtom route, TextAtom directionName, String airlineIcon, @NotNull List<TextAtomWithIcon> features) {
                Intrinsics.checkNotNullParameter(route, "route");
                Intrinsics.checkNotNullParameter(features, "features");
                return new Direction(route, directionName, airlineIcon, features);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Direction)) {
                    return false;
                }
                Direction direction = (Direction) other;
                return Intrinsics.d(this.route, direction.route) && Intrinsics.d(this.directionName, direction.directionName) && Intrinsics.d(this.airlineIcon, direction.airlineIcon) && Intrinsics.d(this.features, direction.features);
            }

            public final String getAirlineIcon() {
                return this.airlineIcon;
            }

            public final TextAtom getDirectionName() {
                return this.directionName;
            }

            @NotNull
            public final List<TextAtomWithIcon> getFeatures() {
                return this.features;
            }

            @NotNull
            public final TextAtom getRoute() {
                return this.route;
            }

            public int hashCode() {
                int hashCode = this.route.hashCode() * 31;
                TextAtom textAtom = this.directionName;
                int hashCode2 = (hashCode + (textAtom == null ? 0 : textAtom.hashCode())) * 31;
                String str = this.airlineIcon;
                return this.features.hashCode() + ((hashCode2 + (str != null ? str.hashCode() : 0)) * 31);
            }

            @NotNull
            public String toString() {
                TextAtom textAtom = this.route;
                TextAtom textAtom2 = this.directionName;
                String str = this.airlineIcon;
                List<TextAtomWithIcon> list = this.features;
                StringBuilder a11 = HY.a.a("Direction(route=", textAtom, ", directionName=", textAtom2, ", airlineIcon=");
                a11.append(str);
                a11.append(", features=");
                a11.append(list);
                a11.append(")");
                return a11.toString();
            }

            public Direction(TextAtom textAtom, TextAtom textAtom2, String str, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this(textAtom, textAtom2, str, (i11 & 8) != 0 ? K.f71697a : list);
            }
        }

        public Tariff(TextAtom textAtom, Price price, TextAtom textAtom2, Badge badge, AtomActionDTO atomActionDTO, Badge badge2, TextAtom textAtom3, String str, boolean z11, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(textAtom, price, textAtom2, badge, atomActionDTO, badge2, textAtom3, str, (i11 & 256) != 0 ? false : z11, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? K.f71697a : list);
        }
    }

    public TravelFlightCheckTariffV2DTO(AtomActionDTO atomActionDTO, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(atomActionDTO, (i11 & 2) != 0 ? K.f71697a : list);
    }
}
