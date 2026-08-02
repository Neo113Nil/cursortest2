package ru.ozon.app.android.travel.feature.avia.widgets.travelFlightCheckTariff.v2.presentation;

import B0.C2454a;
import B90.C2618u;
import Bl.b;
import Fm.C3051a;
import G.g;
import Ih.a;
import Kk.C3532b;
import Pk0.f;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.texts.TextAtomWithIcon;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.price.Price;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0016\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001+BA\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\n\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\n\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010&\u001a\u0004\b'\u0010\u0015R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010(\u001a\u0004\b)\u0010*¨\u0006,"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/travelFlightCheckTariff/v2/presentation/TravelFlightCheckTariffV2VO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "shouldExecuteRefreshAction", "", "Lru/ozon/app/android/travel/feature/avia/widgets/travelFlightCheckTariff/v2/presentation/TravelFlightCheckTariffV2VO$Tariff;", "tariffs", "tallestTariff", "", "selectedTariffPosition", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "refreshAction", "<init>", "(JZLjava/util/List;Lru/ozon/app/android/travel/feature/avia/widgets/travelFlightCheckTariff/v2/presentation/TravelFlightCheckTariffV2VO$Tariff;ILru/ozon/uni/atoms/data/AtomActionDTO;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Z", "getShouldExecuteRefreshAction", "()Z", "Ljava/util/List;", "getTariffs", "()Ljava/util/List;", "Lru/ozon/app/android/travel/feature/avia/widgets/travelFlightCheckTariff/v2/presentation/TravelFlightCheckTariffV2VO$Tariff;", "getTallestTariff", "()Lru/ozon/app/android/travel/feature/avia/widgets/travelFlightCheckTariff/v2/presentation/TravelFlightCheckTariffV2VO$Tariff;", "I", "getSelectedTariffPosition", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "getRefreshAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "Tariff", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class TravelFlightCheckTariffV2VO implements c {
    private final long id;
    private final AtomActionDTO refreshAction;
    private final int selectedTariffPosition;
    private final boolean shouldExecuteRefreshAction;
    private final Tariff tallestTariff;

    @NotNull
    private final List<Tariff> tariffs;

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b!\b\u0087\b\u0018\u00002\u00020\u0001:\u00018By\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001e\u001a\u00020\u000f2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b&\u0010\"R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u000b\u0010'\u001a\u0004\b-\u0010)R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010 \u001a\u0004\b.\u0010\"R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u00102\u001a\u0004\b\u0010\u00103R\u0017\u0010\u0011\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0011\u00102\u001a\u0004\b\u0011\u00103R\u0017\u0010\u0012\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0012\u00102\u001a\u0004\b4\u00103R\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0006¢\u0006\f\n\u0004\b\u0015\u00105\u001a\u0004\b6\u00107¨\u00069"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/travelFlightCheckTariff/v2/presentation/TravelFlightCheckTariffV2VO$Tariff;", "", "Lru/ozon/uni/atoms/data/texts/TextAtom;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/price/Price;", "price", "discount", "Lru/ozon/uni/atoms/data/badge/Badge;", "premiumBadge", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "selectAction", "badge", "priceLabel", "", "borderColor", "", "isSelected", "isSelectable", "shouldMatchParent", "", "Lru/ozon/app/android/travel/feature/avia/widgets/travelFlightCheckTariff/v2/presentation/TravelFlightCheckTariffV2VO$Tariff$Direction;", "directions", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/price/Price;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/badge/Badge;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/data/badge/Badge;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/Integer;ZZZLjava/util/List;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "Lru/ozon/uni/atoms/data/price/Price;", "getPrice", "()Lru/ozon/uni/atoms/data/price/Price;", "getDiscount", "Lru/ozon/uni/atoms/data/badge/Badge;", "getPremiumBadge", "()Lru/ozon/uni/atoms/data/badge/Badge;", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "getSelectAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getBadge", "getPriceLabel", "Ljava/lang/Integer;", "getBorderColor", "()Ljava/lang/Integer;", "Z", "()Z", "getShouldMatchParent", "Ljava/util/List;", "getDirections", "()Ljava/util/List;", "Direction", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Tariff {
        private final Badge badge;
        private final Integer borderColor;

        @NotNull
        private final List<Direction> directions;
        private final TextAtom discount;
        private final boolean isSelectable;
        private final boolean isSelected;
        private final Badge premiumBadge;

        @NotNull
        private final Price price;
        private final TextAtom priceLabel;

        @NotNull
        private final AtomActionDTO selectAction;
        private final boolean shouldMatchParent;

        @NotNull
        private final TextAtom title;

        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\fR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/travelFlightCheckTariff/v2/presentation/TravelFlightCheckTariffV2VO$Tariff$Direction;", "", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "compoundRoute", "", "airlineIcon", "", "Lru/ozon/app/android/atoms/data/texts/TextAtomWithIcon;", "features", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getCompoundRoute", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "Ljava/lang/String;", "getAirlineIcon", "Ljava/util/List;", "getFeatures", "()Ljava/util/List;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Direction {
            private final String airlineIcon;
            private final TextAtom compoundRoute;

            @NotNull
            private final List<TextAtomWithIcon> features;

            public Direction(TextAtom textAtom, String str, @NotNull List<TextAtomWithIcon> features) {
                Intrinsics.checkNotNullParameter(features, "features");
                this.compoundRoute = textAtom;
                this.airlineIcon = str;
                this.features = features;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Direction)) {
                    return false;
                }
                Direction direction = (Direction) other;
                return Intrinsics.d(this.compoundRoute, direction.compoundRoute) && Intrinsics.d(this.airlineIcon, direction.airlineIcon) && Intrinsics.d(this.features, direction.features);
            }

            public final String getAirlineIcon() {
                return this.airlineIcon;
            }

            public final TextAtom getCompoundRoute() {
                return this.compoundRoute;
            }

            @NotNull
            public final List<TextAtomWithIcon> getFeatures() {
                return this.features;
            }

            public int hashCode() {
                TextAtom textAtom = this.compoundRoute;
                int hashCode = (textAtom == null ? 0 : textAtom.hashCode()) * 31;
                String str = this.airlineIcon;
                return this.features.hashCode() + ((hashCode + (str != null ? str.hashCode() : 0)) * 31);
            }

            @NotNull
            public String toString() {
                TextAtom textAtom = this.compoundRoute;
                String str = this.airlineIcon;
                return C2618u.h(b.d("Direction(compoundRoute=", ", airlineIcon=", str, ", features=", textAtom), this.features, ")");
            }
        }

        public Tariff(@NotNull TextAtom title, @NotNull Price price, TextAtom textAtom, Badge badge, @NotNull AtomActionDTO selectAction, Badge badge2, TextAtom textAtom2, Integer num, boolean z11, boolean z12, boolean z13, @NotNull List<Direction> directions) {
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
            this.borderColor = num;
            this.isSelected = z11;
            this.isSelectable = z12;
            this.shouldMatchParent = z13;
            this.directions = directions;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Tariff)) {
                return false;
            }
            Tariff tariff = (Tariff) other;
            return Intrinsics.d(this.title, tariff.title) && Intrinsics.d(this.price, tariff.price) && Intrinsics.d(this.discount, tariff.discount) && Intrinsics.d(this.premiumBadge, tariff.premiumBadge) && Intrinsics.d(this.selectAction, tariff.selectAction) && Intrinsics.d(this.badge, tariff.badge) && Intrinsics.d(this.priceLabel, tariff.priceLabel) && Intrinsics.d(this.borderColor, tariff.borderColor) && this.isSelected == tariff.isSelected && this.isSelectable == tariff.isSelectable && this.shouldMatchParent == tariff.shouldMatchParent && Intrinsics.d(this.directions, tariff.directions);
        }

        public final Badge getBadge() {
            return this.badge;
        }

        public final Integer getBorderColor() {
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

        public final boolean getShouldMatchParent() {
            return this.shouldMatchParent;
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
            Integer num = this.borderColor;
            return this.directions.hashCode() + C3532b.a(C3532b.a(C3532b.a((hashCode3 + (num != null ? num.hashCode() : 0)) * 31, 31, this.isSelected), 31, this.isSelectable), 31, this.shouldMatchParent);
        }

        /* renamed from: isSelectable, reason: from getter */
        public final boolean getIsSelectable() {
            return this.isSelectable;
        }

        /* renamed from: isSelected, reason: from getter */
        public final boolean getIsSelected() {
            return this.isSelected;
        }

        @NotNull
        public String toString() {
            TextAtom textAtom = this.title;
            Price price = this.price;
            TextAtom textAtom2 = this.discount;
            Badge badge = this.premiumBadge;
            AtomActionDTO atomActionDTO = this.selectAction;
            Badge badge2 = this.badge;
            TextAtom textAtom3 = this.priceLabel;
            Integer num = this.borderColor;
            boolean z11 = this.isSelected;
            boolean z12 = this.isSelectable;
            boolean z13 = this.shouldMatchParent;
            List<Direction> list = this.directions;
            StringBuilder sb2 = new StringBuilder("Tariff(title=");
            sb2.append(textAtom);
            sb2.append(", price=");
            sb2.append(price);
            sb2.append(", discount=");
            sb2.append(textAtom2);
            sb2.append(", premiumBadge=");
            sb2.append(badge);
            sb2.append(", selectAction=");
            sb2.append(atomActionDTO);
            sb2.append(", badge=");
            sb2.append(badge2);
            sb2.append(", priceLabel=");
            sb2.append(textAtom3);
            sb2.append(", borderColor=");
            sb2.append(num);
            sb2.append(", isSelected=");
            f.c(", isSelectable=", ", shouldMatchParent=", sb2, z11, z12);
            sb2.append(z13);
            sb2.append(", directions=");
            sb2.append(list);
            sb2.append(")");
            return sb2.toString();
        }
    }

    public TravelFlightCheckTariffV2VO(long j11, boolean z11, @NotNull List<Tariff> tariffs, Tariff tariff, int i11, AtomActionDTO atomActionDTO) {
        Intrinsics.checkNotNullParameter(tariffs, "tariffs");
        this.id = j11;
        this.shouldExecuteRefreshAction = z11;
        this.tariffs = tariffs;
        this.tallestTariff = tariff;
        this.selectedTariffPosition = i11;
        this.refreshAction = atomActionDTO;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TravelFlightCheckTariffV2VO)) {
            return false;
        }
        TravelFlightCheckTariffV2VO travelFlightCheckTariffV2VO = (TravelFlightCheckTariffV2VO) other;
        return this.id == travelFlightCheckTariffV2VO.id && this.shouldExecuteRefreshAction == travelFlightCheckTariffV2VO.shouldExecuteRefreshAction && Intrinsics.d(this.tariffs, travelFlightCheckTariffV2VO.tariffs) && Intrinsics.d(this.tallestTariff, travelFlightCheckTariffV2VO.tallestTariff) && this.selectedTariffPosition == travelFlightCheckTariffV2VO.selectedTariffPosition && Intrinsics.d(this.refreshAction, travelFlightCheckTariffV2VO.refreshAction);
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final AtomActionDTO getRefreshAction() {
        return this.refreshAction;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final int getSelectedTariffPosition() {
        return this.selectedTariffPosition;
    }

    public final boolean getShouldExecuteRefreshAction() {
        return this.shouldExecuteRefreshAction;
    }

    public final Tariff getTallestTariff() {
        return this.tallestTariff;
    }

    @NotNull
    public final List<Tariff> getTariffs() {
        return this.tariffs;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int b11 = g.b(C3532b.a(Long.hashCode(this.id) * 31, 31, this.shouldExecuteRefreshAction), 31, this.tariffs);
        Tariff tariff = this.tallestTariff;
        int a11 = C2454a.a(this.selectedTariffPosition, (b11 + (tariff == null ? 0 : tariff.hashCode())) * 31, 31);
        AtomActionDTO atomActionDTO = this.refreshAction;
        return a11 + (atomActionDTO != null ? atomActionDTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        boolean z11 = this.shouldExecuteRefreshAction;
        List<Tariff> list = this.tariffs;
        Tariff tariff = this.tallestTariff;
        int i11 = this.selectedTariffPosition;
        AtomActionDTO atomActionDTO = this.refreshAction;
        StringBuilder c11 = b.c(j11, "TravelFlightCheckTariffV2VO(id=", ", shouldExecuteRefreshAction=", z11);
        c11.append(", tariffs=");
        c11.append(list);
        c11.append(", tallestTariff=");
        c11.append(tariff);
        c11.append(", selectedTariffPosition=");
        c11.append(i11);
        c11.append(", refreshAction=");
        c11.append(atomActionDTO);
        c11.append(")");
        return c11.toString();
    }
}
