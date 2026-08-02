package ru.ozon.app.android.travel.feature.general.services.widgets.additionalServicesTotal.data;

import B90.C2619v;
import G.g;
import J.d;
import Ve.C4636t5;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.dto.linkButton.LinkButtonDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\"B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\nHÆ\u0003JC\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006#"}, d2 = {"Lru/ozon/app/android/travel/feature/general/services/widgets/additionalServicesTotal/data/AdditionalServicesTotalDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "serviceItems", "", "Lru/ozon/app/android/travel/feature/general/services/widgets/additionalServicesTotal/data/AdditionalServicesTotalDTO$ServiceItem;", "totalPrice", "priceDescription", "detailsLinkButton", "Lru/ozon/app/android/travel/molecules/dto/linkButton/LinkButtonDTO;", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/util/List;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/app/android/travel/molecules/dto/linkButton/LinkButtonDTO;)V", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getServiceItems", "()Ljava/util/List;", "getTotalPrice", "getPriceDescription", "getDetailsLinkButton", "()Lru/ozon/app/android/travel/molecules/dto/linkButton/LinkButtonDTO;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ServiceItem", "services_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class AdditionalServicesTotalDTO {
    public static final int $stable = 8;
    private final LinkButtonDTO detailsLinkButton;

    @NotNull
    private final TextAtom priceDescription;

    @NotNull
    private final List<ServiceItem> serviceItems;

    @NotNull
    private final TextAtom title;

    @NotNull
    private final TextAtom totalPrice;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/travel/feature/general/services/widgets/additionalServicesTotal/data/AdditionalServicesTotalDTO$ServiceItem;", "", "serviceKey", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "serviceValues", "", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/util/List;)V", "getServiceKey", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getServiceValues", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "services_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ServiceItem {
        public static final int $stable = 8;

        @NotNull
        private final TextAtom serviceKey;

        @NotNull
        private final List<TextAtom> serviceValues;

        public ServiceItem(@NotNull TextAtom serviceKey, @NotNull List<TextAtom> serviceValues) {
            Intrinsics.checkNotNullParameter(serviceKey, "serviceKey");
            Intrinsics.checkNotNullParameter(serviceValues, "serviceValues");
            this.serviceKey = serviceKey;
            this.serviceValues = serviceValues;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ServiceItem copy$default(ServiceItem serviceItem, TextAtom textAtom, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textAtom = serviceItem.serviceKey;
            }
            if ((i11 & 2) != 0) {
                list = serviceItem.serviceValues;
            }
            return serviceItem.copy(textAtom, list);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextAtom getServiceKey() {
            return this.serviceKey;
        }

        @NotNull
        public final List<TextAtom> component2() {
            return this.serviceValues;
        }

        @NotNull
        public final ServiceItem copy(@NotNull TextAtom serviceKey, @NotNull List<TextAtom> serviceValues) {
            Intrinsics.checkNotNullParameter(serviceKey, "serviceKey");
            Intrinsics.checkNotNullParameter(serviceValues, "serviceValues");
            return new ServiceItem(serviceKey, serviceValues);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ServiceItem)) {
                return false;
            }
            ServiceItem serviceItem = (ServiceItem) other;
            return Intrinsics.d(this.serviceKey, serviceItem.serviceKey) && Intrinsics.d(this.serviceValues, serviceItem.serviceValues);
        }

        @NotNull
        public final TextAtom getServiceKey() {
            return this.serviceKey;
        }

        @NotNull
        public final List<TextAtom> getServiceValues() {
            return this.serviceValues;
        }

        public int hashCode() {
            return this.serviceValues.hashCode() + (this.serviceKey.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return d.c("ServiceItem(serviceKey=", this.serviceKey, ", serviceValues=", this.serviceValues, ")");
        }
    }

    public AdditionalServicesTotalDTO(@NotNull TextAtom title, @NotNull List<ServiceItem> serviceItems, @NotNull TextAtom totalPrice, @NotNull TextAtom priceDescription, LinkButtonDTO linkButtonDTO) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(serviceItems, "serviceItems");
        Intrinsics.checkNotNullParameter(totalPrice, "totalPrice");
        Intrinsics.checkNotNullParameter(priceDescription, "priceDescription");
        this.title = title;
        this.serviceItems = serviceItems;
        this.totalPrice = totalPrice;
        this.priceDescription = priceDescription;
        this.detailsLinkButton = linkButtonDTO;
    }

    public static /* synthetic */ AdditionalServicesTotalDTO copy$default(AdditionalServicesTotalDTO additionalServicesTotalDTO, TextAtom textAtom, List list, TextAtom textAtom2, TextAtom textAtom3, LinkButtonDTO linkButtonDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textAtom = additionalServicesTotalDTO.title;
        }
        if ((i11 & 2) != 0) {
            list = additionalServicesTotalDTO.serviceItems;
        }
        if ((i11 & 4) != 0) {
            textAtom2 = additionalServicesTotalDTO.totalPrice;
        }
        if ((i11 & 8) != 0) {
            textAtom3 = additionalServicesTotalDTO.priceDescription;
        }
        if ((i11 & 16) != 0) {
            linkButtonDTO = additionalServicesTotalDTO.detailsLinkButton;
        }
        LinkButtonDTO linkButtonDTO2 = linkButtonDTO;
        TextAtom textAtom4 = textAtom2;
        return additionalServicesTotalDTO.copy(textAtom, list, textAtom4, textAtom3, linkButtonDTO2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextAtom getTitle() {
        return this.title;
    }

    @NotNull
    public final List<ServiceItem> component2() {
        return this.serviceItems;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final TextAtom getTotalPrice() {
        return this.totalPrice;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final TextAtom getPriceDescription() {
        return this.priceDescription;
    }

    /* renamed from: component5, reason: from getter */
    public final LinkButtonDTO getDetailsLinkButton() {
        return this.detailsLinkButton;
    }

    @NotNull
    public final AdditionalServicesTotalDTO copy(@NotNull TextAtom title, @NotNull List<ServiceItem> serviceItems, @NotNull TextAtom totalPrice, @NotNull TextAtom priceDescription, LinkButtonDTO detailsLinkButton) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(serviceItems, "serviceItems");
        Intrinsics.checkNotNullParameter(totalPrice, "totalPrice");
        Intrinsics.checkNotNullParameter(priceDescription, "priceDescription");
        return new AdditionalServicesTotalDTO(title, serviceItems, totalPrice, priceDescription, detailsLinkButton);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdditionalServicesTotalDTO)) {
            return false;
        }
        AdditionalServicesTotalDTO additionalServicesTotalDTO = (AdditionalServicesTotalDTO) other;
        return Intrinsics.d(this.title, additionalServicesTotalDTO.title) && Intrinsics.d(this.serviceItems, additionalServicesTotalDTO.serviceItems) && Intrinsics.d(this.totalPrice, additionalServicesTotalDTO.totalPrice) && Intrinsics.d(this.priceDescription, additionalServicesTotalDTO.priceDescription) && Intrinsics.d(this.detailsLinkButton, additionalServicesTotalDTO.detailsLinkButton);
    }

    public final LinkButtonDTO getDetailsLinkButton() {
        return this.detailsLinkButton;
    }

    @NotNull
    public final TextAtom getPriceDescription() {
        return this.priceDescription;
    }

    @NotNull
    public final List<ServiceItem> getServiceItems() {
        return this.serviceItems;
    }

    @NotNull
    public final TextAtom getTitle() {
        return this.title;
    }

    @NotNull
    public final TextAtom getTotalPrice() {
        return this.totalPrice;
    }

    public int hashCode() {
        int b11 = C2619v.b(C2619v.b(g.b(this.title.hashCode() * 31, 31, this.serviceItems), 31, this.totalPrice), 31, this.priceDescription);
        LinkButtonDTO linkButtonDTO = this.detailsLinkButton;
        return b11 + (linkButtonDTO == null ? 0 : linkButtonDTO.hashCode());
    }

    @NotNull
    public String toString() {
        TextAtom textAtom = this.title;
        List<ServiceItem> list = this.serviceItems;
        TextAtom textAtom2 = this.totalPrice;
        TextAtom textAtom3 = this.priceDescription;
        LinkButtonDTO linkButtonDTO = this.detailsLinkButton;
        StringBuilder sb2 = new StringBuilder("AdditionalServicesTotalDTO(title=");
        sb2.append(textAtom);
        sb2.append(", serviceItems=");
        sb2.append(list);
        sb2.append(", totalPrice=");
        C4636t5.c(", priceDescription=", ", detailsLinkButton=", sb2, textAtom2, textAtom3);
        sb2.append(linkButtonDTO);
        sb2.append(")");
        return sb2.toString();
    }
}
