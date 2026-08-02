package ru.ozon.app.android.travel.feature.oldwidgets.widgets.travelPriceDetailInformation.v1.data;

import B90.C2618u;
import G.g;
import N3.C3660k;
import Tl.b;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.DynamicElementDTO;
import ru.ozon.app.android.travel.molecules.dto.linkButton.LinkButtonDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0002*+B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\rHÆ\u0003JK\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020)HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006,"}, d2 = {"Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelPriceDetailInformation/v1/data/TravelPriceDetailInformationDTO;", "", "prices", "Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelPriceDetailInformation/v1/data/TravelPriceDetailInformationDTO$PriceBlockDTO;", "totalPrice", "Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelPriceDetailInformation/v1/data/TravelPriceDetailInformationDTO$TotalPriceBlockDTO;", DynamicElementDTO.LARGE_BUTTON, "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "smallStickyButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "agreementText", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "bonusButton", "Lru/ozon/uni/atoms/data/badge/Badge;", "<init>", "(Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelPriceDetailInformation/v1/data/TravelPriceDetailInformationDTO$PriceBlockDTO;Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelPriceDetailInformation/v1/data/TravelPriceDetailInformationDTO$TotalPriceBlockDTO;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/badge/Badge;)V", "getPrices", "()Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelPriceDetailInformation/v1/data/TravelPriceDetailInformationDTO$PriceBlockDTO;", "getTotalPrice", "()Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelPriceDetailInformation/v1/data/TravelPriceDetailInformationDTO$TotalPriceBlockDTO;", "getLargeButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "getSmallStickyButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "getAgreementText", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getBonusButton", "()Lru/ozon/uni/atoms/data/badge/Badge;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "", "PriceBlockDTO", "TotalPriceBlockDTO", "old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TravelPriceDetailInformationDTO {
    private final TextAtom agreementText;
    private final Badge bonusButton;

    @NotNull
    private final ButtonV3Atom.LargeButton largeButton;

    @NotNull
    private final PriceBlockDTO prices;
    private final ButtonV3Atom.SmallButton smallStickyButton;

    @NotNull
    private final TotalPriceBlockDTO totalPrice;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0019B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J/\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelPriceDetailInformation/v1/data/TravelPriceDetailInformationDTO$PriceBlockDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "subtitle", "orderPrice", "", "Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelPriceDetailInformation/v1/data/TravelPriceDetailInformationDTO$PriceBlockDTO$PriceDTO;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getOrderPrice", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "PriceDTO", "old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class PriceBlockDTO {

        @NotNull
        private final List<PriceDTO> orderPrice;
        private final String subtitle;

        @NotNull
        private final String title;

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelPriceDetailInformation/v1/data/TravelPriceDetailInformationDTO$PriceBlockDTO$PriceDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "price", "detailsButton", "Lru/ozon/app/android/travel/molecules/dto/linkButton/LinkButtonDTO;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/travel/molecules/dto/linkButton/LinkButtonDTO;)V", "getTitle", "()Ljava/lang/String;", "getPrice", "getDetailsButton", "()Lru/ozon/app/android/travel/molecules/dto/linkButton/LinkButtonDTO;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class PriceDTO {
            private final LinkButtonDTO detailsButton;

            @NotNull
            private final String price;

            @NotNull
            private final String title;

            public PriceDTO(@NotNull String title, @NotNull String price, LinkButtonDTO linkButtonDTO) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(price, "price");
                this.title = title;
                this.price = price;
                this.detailsButton = linkButtonDTO;
            }

            public static /* synthetic */ PriceDTO copy$default(PriceDTO priceDTO, String str, String str2, LinkButtonDTO linkButtonDTO, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = priceDTO.title;
                }
                if ((i11 & 2) != 0) {
                    str2 = priceDTO.price;
                }
                if ((i11 & 4) != 0) {
                    linkButtonDTO = priceDTO.detailsButton;
                }
                return priceDTO.copy(str, str2, linkButtonDTO);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final String getPrice() {
                return this.price;
            }

            /* renamed from: component3, reason: from getter */
            public final LinkButtonDTO getDetailsButton() {
                return this.detailsButton;
            }

            @NotNull
            public final PriceDTO copy(@NotNull String title, @NotNull String price, LinkButtonDTO detailsButton) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(price, "price");
                return new PriceDTO(title, price, detailsButton);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof PriceDTO)) {
                    return false;
                }
                PriceDTO priceDTO = (PriceDTO) other;
                return Intrinsics.d(this.title, priceDTO.title) && Intrinsics.d(this.price, priceDTO.price) && Intrinsics.d(this.detailsButton, priceDTO.detailsButton);
            }

            public final LinkButtonDTO getDetailsButton() {
                return this.detailsButton;
            }

            @NotNull
            public final String getPrice() {
                return this.price;
            }

            @NotNull
            public final String getTitle() {
                return this.title;
            }

            public int hashCode() {
                int a11 = g.a(this.title.hashCode() * 31, 31, this.price);
                LinkButtonDTO linkButtonDTO = this.detailsButton;
                return a11 + (linkButtonDTO == null ? 0 : linkButtonDTO.hashCode());
            }

            @NotNull
            public String toString() {
                String str = this.title;
                String str2 = this.price;
                LinkButtonDTO linkButtonDTO = this.detailsButton;
                StringBuilder d11 = C3660k.d("PriceDTO(title=", str, ", price=", str2, ", detailsButton=");
                d11.append(linkButtonDTO);
                d11.append(")");
                return d11.toString();
            }
        }

        public PriceBlockDTO(@NotNull String title, String str, @NotNull List<PriceDTO> orderPrice) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(orderPrice, "orderPrice");
            this.title = title;
            this.subtitle = str;
            this.orderPrice = orderPrice;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PriceBlockDTO copy$default(PriceBlockDTO priceBlockDTO, String str, String str2, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = priceBlockDTO.title;
            }
            if ((i11 & 2) != 0) {
                str2 = priceBlockDTO.subtitle;
            }
            if ((i11 & 4) != 0) {
                list = priceBlockDTO.orderPrice;
            }
            return priceBlockDTO.copy(str, str2, list);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        public final List<PriceDTO> component3() {
            return this.orderPrice;
        }

        @NotNull
        public final PriceBlockDTO copy(@NotNull String title, String subtitle, @NotNull List<PriceDTO> orderPrice) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(orderPrice, "orderPrice");
            return new PriceBlockDTO(title, subtitle, orderPrice);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PriceBlockDTO)) {
                return false;
            }
            PriceBlockDTO priceBlockDTO = (PriceBlockDTO) other;
            return Intrinsics.d(this.title, priceBlockDTO.title) && Intrinsics.d(this.subtitle, priceBlockDTO.subtitle) && Intrinsics.d(this.orderPrice, priceBlockDTO.orderPrice);
        }

        @NotNull
        public final List<PriceDTO> getOrderPrice() {
            return this.orderPrice;
        }

        public final String getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            int hashCode = this.title.hashCode() * 31;
            String str = this.subtitle;
            return this.orderPrice.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        @NotNull
        public String toString() {
            String str = this.title;
            String str2 = this.subtitle;
            return C2618u.h(C3660k.d("PriceBlockDTO(title=", str, ", subtitle=", str2, ", orderPrice="), this.orderPrice, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelPriceDetailInformation/v1/data/TravelPriceDetailInformationDTO$TotalPriceBlockDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "totalPrice", "smallIconButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;)V", "getTitle", "()Ljava/lang/String;", "getTotalPrice", "getSmallIconButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TotalPriceBlockDTO {
        private final ButtonV3Atom.SmallIconButton smallIconButton;

        @NotNull
        private final String title;

        @NotNull
        private final String totalPrice;

        public TotalPriceBlockDTO(@NotNull String title, @NotNull String totalPrice, ButtonV3Atom.SmallIconButton smallIconButton) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(totalPrice, "totalPrice");
            this.title = title;
            this.totalPrice = totalPrice;
            this.smallIconButton = smallIconButton;
        }

        public static /* synthetic */ TotalPriceBlockDTO copy$default(TotalPriceBlockDTO totalPriceBlockDTO, String str, String str2, ButtonV3Atom.SmallIconButton smallIconButton, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = totalPriceBlockDTO.title;
            }
            if ((i11 & 2) != 0) {
                str2 = totalPriceBlockDTO.totalPrice;
            }
            if ((i11 & 4) != 0) {
                smallIconButton = totalPriceBlockDTO.smallIconButton;
            }
            return totalPriceBlockDTO.copy(str, str2, smallIconButton);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getTotalPrice() {
            return this.totalPrice;
        }

        /* renamed from: component3, reason: from getter */
        public final ButtonV3Atom.SmallIconButton getSmallIconButton() {
            return this.smallIconButton;
        }

        @NotNull
        public final TotalPriceBlockDTO copy(@NotNull String title, @NotNull String totalPrice, ButtonV3Atom.SmallIconButton smallIconButton) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(totalPrice, "totalPrice");
            return new TotalPriceBlockDTO(title, totalPrice, smallIconButton);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TotalPriceBlockDTO)) {
                return false;
            }
            TotalPriceBlockDTO totalPriceBlockDTO = (TotalPriceBlockDTO) other;
            return Intrinsics.d(this.title, totalPriceBlockDTO.title) && Intrinsics.d(this.totalPrice, totalPriceBlockDTO.totalPrice) && Intrinsics.d(this.smallIconButton, totalPriceBlockDTO.smallIconButton);
        }

        public final ButtonV3Atom.SmallIconButton getSmallIconButton() {
            return this.smallIconButton;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        @NotNull
        public final String getTotalPrice() {
            return this.totalPrice;
        }

        public int hashCode() {
            int a11 = g.a(this.title.hashCode() * 31, 31, this.totalPrice);
            ButtonV3Atom.SmallIconButton smallIconButton = this.smallIconButton;
            return a11 + (smallIconButton == null ? 0 : smallIconButton.hashCode());
        }

        @NotNull
        public String toString() {
            String str = this.title;
            String str2 = this.totalPrice;
            ButtonV3Atom.SmallIconButton smallIconButton = this.smallIconButton;
            StringBuilder d11 = C3660k.d("TotalPriceBlockDTO(title=", str, ", totalPrice=", str2, ", smallIconButton=");
            d11.append(smallIconButton);
            d11.append(")");
            return d11.toString();
        }
    }

    public TravelPriceDetailInformationDTO(@NotNull PriceBlockDTO prices, @NotNull TotalPriceBlockDTO totalPrice, @NotNull ButtonV3Atom.LargeButton largeButton, ButtonV3Atom.SmallButton smallButton, TextAtom textAtom, Badge badge) {
        Intrinsics.checkNotNullParameter(prices, "prices");
        Intrinsics.checkNotNullParameter(totalPrice, "totalPrice");
        Intrinsics.checkNotNullParameter(largeButton, "largeButton");
        this.prices = prices;
        this.totalPrice = totalPrice;
        this.largeButton = largeButton;
        this.smallStickyButton = smallButton;
        this.agreementText = textAtom;
        this.bonusButton = badge;
    }

    public static /* synthetic */ TravelPriceDetailInformationDTO copy$default(TravelPriceDetailInformationDTO travelPriceDetailInformationDTO, PriceBlockDTO priceBlockDTO, TotalPriceBlockDTO totalPriceBlockDTO, ButtonV3Atom.LargeButton largeButton, ButtonV3Atom.SmallButton smallButton, TextAtom textAtom, Badge badge, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            priceBlockDTO = travelPriceDetailInformationDTO.prices;
        }
        if ((i11 & 2) != 0) {
            totalPriceBlockDTO = travelPriceDetailInformationDTO.totalPrice;
        }
        if ((i11 & 4) != 0) {
            largeButton = travelPriceDetailInformationDTO.largeButton;
        }
        if ((i11 & 8) != 0) {
            smallButton = travelPriceDetailInformationDTO.smallStickyButton;
        }
        if ((i11 & 16) != 0) {
            textAtom = travelPriceDetailInformationDTO.agreementText;
        }
        if ((i11 & 32) != 0) {
            badge = travelPriceDetailInformationDTO.bonusButton;
        }
        TextAtom textAtom2 = textAtom;
        Badge badge2 = badge;
        return travelPriceDetailInformationDTO.copy(priceBlockDTO, totalPriceBlockDTO, largeButton, smallButton, textAtom2, badge2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final PriceBlockDTO getPrices() {
        return this.prices;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final TotalPriceBlockDTO getTotalPrice() {
        return this.totalPrice;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final ButtonV3Atom.LargeButton getLargeButton() {
        return this.largeButton;
    }

    /* renamed from: component4, reason: from getter */
    public final ButtonV3Atom.SmallButton getSmallStickyButton() {
        return this.smallStickyButton;
    }

    /* renamed from: component5, reason: from getter */
    public final TextAtom getAgreementText() {
        return this.agreementText;
    }

    /* renamed from: component6, reason: from getter */
    public final Badge getBonusButton() {
        return this.bonusButton;
    }

    @NotNull
    public final TravelPriceDetailInformationDTO copy(@NotNull PriceBlockDTO prices, @NotNull TotalPriceBlockDTO totalPrice, @NotNull ButtonV3Atom.LargeButton largeButton, ButtonV3Atom.SmallButton smallStickyButton, TextAtom agreementText, Badge bonusButton) {
        Intrinsics.checkNotNullParameter(prices, "prices");
        Intrinsics.checkNotNullParameter(totalPrice, "totalPrice");
        Intrinsics.checkNotNullParameter(largeButton, "largeButton");
        return new TravelPriceDetailInformationDTO(prices, totalPrice, largeButton, smallStickyButton, agreementText, bonusButton);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TravelPriceDetailInformationDTO)) {
            return false;
        }
        TravelPriceDetailInformationDTO travelPriceDetailInformationDTO = (TravelPriceDetailInformationDTO) other;
        return Intrinsics.d(this.prices, travelPriceDetailInformationDTO.prices) && Intrinsics.d(this.totalPrice, travelPriceDetailInformationDTO.totalPrice) && Intrinsics.d(this.largeButton, travelPriceDetailInformationDTO.largeButton) && Intrinsics.d(this.smallStickyButton, travelPriceDetailInformationDTO.smallStickyButton) && Intrinsics.d(this.agreementText, travelPriceDetailInformationDTO.agreementText) && Intrinsics.d(this.bonusButton, travelPriceDetailInformationDTO.bonusButton);
    }

    public final TextAtom getAgreementText() {
        return this.agreementText;
    }

    public final Badge getBonusButton() {
        return this.bonusButton;
    }

    @NotNull
    public final ButtonV3Atom.LargeButton getLargeButton() {
        return this.largeButton;
    }

    @NotNull
    public final PriceBlockDTO getPrices() {
        return this.prices;
    }

    public final ButtonV3Atom.SmallButton getSmallStickyButton() {
        return this.smallStickyButton;
    }

    @NotNull
    public final TotalPriceBlockDTO getTotalPrice() {
        return this.totalPrice;
    }

    public int hashCode() {
        int a11 = b.a(this.largeButton, (this.totalPrice.hashCode() + (this.prices.hashCode() * 31)) * 31, 31);
        ButtonV3Atom.SmallButton smallButton = this.smallStickyButton;
        int hashCode = (a11 + (smallButton == null ? 0 : smallButton.hashCode())) * 31;
        TextAtom textAtom = this.agreementText;
        int hashCode2 = (hashCode + (textAtom == null ? 0 : textAtom.hashCode())) * 31;
        Badge badge = this.bonusButton;
        return hashCode2 + (badge != null ? badge.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "TravelPriceDetailInformationDTO(prices=" + this.prices + ", totalPrice=" + this.totalPrice + ", largeButton=" + this.largeButton + ", smallStickyButton=" + this.smallStickyButton + ", agreementText=" + this.agreementText + ", bonusButton=" + this.bonusButton + ")";
    }
}
