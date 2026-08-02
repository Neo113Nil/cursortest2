package ru.ozon.app.android.travel.feature.oldwidgets.widgets.travelModalPriceDetailInformation.v1.data;

import An.C2439a;
import C.o0;
import G.g;
import N3.C3660k;
import Tl.b;
import V.e;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0016B\u001f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelModalPriceDetailInformation/v1/data/TravelModalPriceDetailInformationDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "priceSections", "", "Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelModalPriceDetailInformation/v1/data/TravelModalPriceDetailInformationDTO$PriceSectionDTO;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getTitle", "()Ljava/lang/String;", "getPriceSections", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "PriceSectionDTO", "old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TravelModalPriceDetailInformationDTO {

    @NotNull
    private final List<PriceSectionDTO> priceSections;
    private final String title;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001cB1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J;\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\f¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelModalPriceDetailInformation/v1/data/TravelModalPriceDetailInformationDTO$PriceSectionDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "totalPrice", "priceDetails", "", "Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelModalPriceDetailInformation/v1/data/TravelModalPriceDetailInformationDTO$PriceSectionDTO$PriceDetailsDTO;", "subtitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getTotalPrice", "getPriceDetails", "()Ljava/util/List;", "getSubtitle", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "PriceDetailsDTO", "old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class PriceSectionDTO {
        private final List<PriceDetailsDTO> priceDetails;
        private final String subtitle;

        @NotNull
        private final String title;

        @NotNull
        private final String totalPrice;

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0019B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelModalPriceDetailInformation/v1/data/TravelModalPriceDetailInformationDTO$PriceSectionDTO$PriceDetailsDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "prices", "", "Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelModalPriceDetailInformation/v1/data/TravelModalPriceDetailInformationDTO$PriceSectionDTO$PriceDetailsDTO$PriceDTO;", "price", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getPrices", "()Ljava/util/List;", "getPrice", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "PriceDTO", "old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @j(generateAdapter = true)
        public static final /* data */ class PriceDetailsDTO {
            private final String price;
            private final List<PriceDTO> prices;

            @NotNull
            private final String title;

            @j(generateAdapter = true)
            @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelModalPriceDetailInformation/v1/data/TravelModalPriceDetailInformationDTO$PriceSectionDTO$PriceDetailsDTO$PriceDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "price", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getPrice", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class PriceDTO {

                @NotNull
                private final String price;

                @NotNull
                private final String title;

                public PriceDTO(@NotNull String title, @NotNull String price) {
                    Intrinsics.checkNotNullParameter(title, "title");
                    Intrinsics.checkNotNullParameter(price, "price");
                    this.title = title;
                    this.price = price;
                }

                public static /* synthetic */ PriceDTO copy$default(PriceDTO priceDTO, String str, String str2, int i11, Object obj) {
                    if ((i11 & 1) != 0) {
                        str = priceDTO.title;
                    }
                    if ((i11 & 2) != 0) {
                        str2 = priceDTO.price;
                    }
                    return priceDTO.copy(str, str2);
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

                @NotNull
                public final PriceDTO copy(@NotNull String title, @NotNull String price) {
                    Intrinsics.checkNotNullParameter(title, "title");
                    Intrinsics.checkNotNullParameter(price, "price");
                    return new PriceDTO(title, price);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof PriceDTO)) {
                        return false;
                    }
                    PriceDTO priceDTO = (PriceDTO) other;
                    return Intrinsics.d(this.title, priceDTO.title) && Intrinsics.d(this.price, priceDTO.price);
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
                    return this.price.hashCode() + (this.title.hashCode() * 31);
                }

                @NotNull
                public String toString() {
                    return e.a("PriceDTO(title=", this.title, ", price=", this.price, ")");
                }
            }

            public PriceDetailsDTO(@NotNull String title, List<PriceDTO> list, String str) {
                Intrinsics.checkNotNullParameter(title, "title");
                this.title = title;
                this.prices = list;
                this.price = str;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ PriceDetailsDTO copy$default(PriceDetailsDTO priceDetailsDTO, String str, List list, String str2, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = priceDetailsDTO.title;
                }
                if ((i11 & 2) != 0) {
                    list = priceDetailsDTO.prices;
                }
                if ((i11 & 4) != 0) {
                    str2 = priceDetailsDTO.price;
                }
                return priceDetailsDTO.copy(str, list, str2);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            public final List<PriceDTO> component2() {
                return this.prices;
            }

            /* renamed from: component3, reason: from getter */
            public final String getPrice() {
                return this.price;
            }

            @NotNull
            public final PriceDetailsDTO copy(@NotNull String title, List<PriceDTO> prices, String price) {
                Intrinsics.checkNotNullParameter(title, "title");
                return new PriceDetailsDTO(title, prices, price);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof PriceDetailsDTO)) {
                    return false;
                }
                PriceDetailsDTO priceDetailsDTO = (PriceDetailsDTO) other;
                return Intrinsics.d(this.title, priceDetailsDTO.title) && Intrinsics.d(this.prices, priceDetailsDTO.prices) && Intrinsics.d(this.price, priceDetailsDTO.price);
            }

            public final String getPrice() {
                return this.price;
            }

            public final List<PriceDTO> getPrices() {
                return this.prices;
            }

            @NotNull
            public final String getTitle() {
                return this.title;
            }

            public int hashCode() {
                int hashCode = this.title.hashCode() * 31;
                List<PriceDTO> list = this.prices;
                int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
                String str = this.price;
                return hashCode2 + (str != null ? str.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                String str = this.title;
                List<PriceDTO> list = this.prices;
                return o0.c(b.f("PriceDetailsDTO(title=", str, ", prices=", ", price=", list), this.price, ")");
            }
        }

        public PriceSectionDTO(@NotNull String title, @NotNull String totalPrice, List<PriceDetailsDTO> list, String str) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(totalPrice, "totalPrice");
            this.title = title;
            this.totalPrice = totalPrice;
            this.priceDetails = list;
            this.subtitle = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PriceSectionDTO copy$default(PriceSectionDTO priceSectionDTO, String str, String str2, List list, String str3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = priceSectionDTO.title;
            }
            if ((i11 & 2) != 0) {
                str2 = priceSectionDTO.totalPrice;
            }
            if ((i11 & 4) != 0) {
                list = priceSectionDTO.priceDetails;
            }
            if ((i11 & 8) != 0) {
                str3 = priceSectionDTO.subtitle;
            }
            return priceSectionDTO.copy(str, str2, list, str3);
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

        public final List<PriceDetailsDTO> component3() {
            return this.priceDetails;
        }

        /* renamed from: component4, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        public final PriceSectionDTO copy(@NotNull String title, @NotNull String totalPrice, List<PriceDetailsDTO> priceDetails, String subtitle) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(totalPrice, "totalPrice");
            return new PriceSectionDTO(title, totalPrice, priceDetails, subtitle);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PriceSectionDTO)) {
                return false;
            }
            PriceSectionDTO priceSectionDTO = (PriceSectionDTO) other;
            return Intrinsics.d(this.title, priceSectionDTO.title) && Intrinsics.d(this.totalPrice, priceSectionDTO.totalPrice) && Intrinsics.d(this.priceDetails, priceSectionDTO.priceDetails) && Intrinsics.d(this.subtitle, priceSectionDTO.subtitle);
        }

        public final List<PriceDetailsDTO> getPriceDetails() {
            return this.priceDetails;
        }

        public final String getSubtitle() {
            return this.subtitle;
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
            List<PriceDetailsDTO> list = this.priceDetails;
            int hashCode = (a11 + (list == null ? 0 : list.hashCode())) * 31;
            String str = this.subtitle;
            return hashCode + (str != null ? str.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.title;
            String str2 = this.totalPrice;
            List<PriceDetailsDTO> list = this.priceDetails;
            String str3 = this.subtitle;
            StringBuilder d11 = C3660k.d("PriceSectionDTO(title=", str, ", totalPrice=", str2, ", priceDetails=");
            d11.append(list);
            d11.append(", subtitle=");
            d11.append(str3);
            d11.append(")");
            return d11.toString();
        }
    }

    public TravelModalPriceDetailInformationDTO(String str, @NotNull List<PriceSectionDTO> priceSections) {
        Intrinsics.checkNotNullParameter(priceSections, "priceSections");
        this.title = str;
        this.priceSections = priceSections;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TravelModalPriceDetailInformationDTO copy$default(TravelModalPriceDetailInformationDTO travelModalPriceDetailInformationDTO, String str, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = travelModalPriceDetailInformationDTO.title;
        }
        if ((i11 & 2) != 0) {
            list = travelModalPriceDetailInformationDTO.priceSections;
        }
        return travelModalPriceDetailInformationDTO.copy(str, list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final List<PriceSectionDTO> component2() {
        return this.priceSections;
    }

    @NotNull
    public final TravelModalPriceDetailInformationDTO copy(String title, @NotNull List<PriceSectionDTO> priceSections) {
        Intrinsics.checkNotNullParameter(priceSections, "priceSections");
        return new TravelModalPriceDetailInformationDTO(title, priceSections);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TravelModalPriceDetailInformationDTO)) {
            return false;
        }
        TravelModalPriceDetailInformationDTO travelModalPriceDetailInformationDTO = (TravelModalPriceDetailInformationDTO) other;
        return Intrinsics.d(this.title, travelModalPriceDetailInformationDTO.title) && Intrinsics.d(this.priceSections, travelModalPriceDetailInformationDTO.priceSections);
    }

    @NotNull
    public final List<PriceSectionDTO> getPriceSections() {
        return this.priceSections;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.title;
        return this.priceSections.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    @NotNull
    public String toString() {
        return C2439a.a("TravelModalPriceDetailInformationDTO(title=", this.title, ", priceSections=", ")", this.priceSections);
    }
}
