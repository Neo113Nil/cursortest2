package ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.data.models;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J5\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/data/models/AlternativePriceBlockDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "milesBadge", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "priceBadge", "price", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/price/PriceDTO;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getMilesBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getPriceBadge", "getPrice", "()Lru/ozon/uni/atoms/data/price/PriceDTO;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class AlternativePriceBlockDTO {
    public static final int $stable = PriceDTO.$stable;
    private final BadgeDTO milesBadge;

    @NotNull
    private final PriceDTO price;
    private final BadgeDTO priceBadge;

    @NotNull
    private final TextDTO title;

    public AlternativePriceBlockDTO(@NotNull TextDTO title, BadgeDTO badgeDTO, BadgeDTO badgeDTO2, @NotNull PriceDTO price) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(price, "price");
        this.title = title;
        this.milesBadge = badgeDTO;
        this.priceBadge = badgeDTO2;
        this.price = price;
    }

    public static /* synthetic */ AlternativePriceBlockDTO copy$default(AlternativePriceBlockDTO alternativePriceBlockDTO, TextDTO textDTO, BadgeDTO badgeDTO, BadgeDTO badgeDTO2, PriceDTO priceDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textDTO = alternativePriceBlockDTO.title;
        }
        if ((i11 & 2) != 0) {
            badgeDTO = alternativePriceBlockDTO.milesBadge;
        }
        if ((i11 & 4) != 0) {
            badgeDTO2 = alternativePriceBlockDTO.priceBadge;
        }
        if ((i11 & 8) != 0) {
            priceDTO = alternativePriceBlockDTO.price;
        }
        return alternativePriceBlockDTO.copy(textDTO, badgeDTO, badgeDTO2, priceDTO);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextDTO getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final BadgeDTO getMilesBadge() {
        return this.milesBadge;
    }

    /* renamed from: component3, reason: from getter */
    public final BadgeDTO getPriceBadge() {
        return this.priceBadge;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final PriceDTO getPrice() {
        return this.price;
    }

    @NotNull
    public final AlternativePriceBlockDTO copy(@NotNull TextDTO title, BadgeDTO milesBadge, BadgeDTO priceBadge, @NotNull PriceDTO price) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(price, "price");
        return new AlternativePriceBlockDTO(title, milesBadge, priceBadge, price);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AlternativePriceBlockDTO)) {
            return false;
        }
        AlternativePriceBlockDTO alternativePriceBlockDTO = (AlternativePriceBlockDTO) other;
        return Intrinsics.d(this.title, alternativePriceBlockDTO.title) && Intrinsics.d(this.milesBadge, alternativePriceBlockDTO.milesBadge) && Intrinsics.d(this.priceBadge, alternativePriceBlockDTO.priceBadge) && Intrinsics.d(this.price, alternativePriceBlockDTO.price);
    }

    public final BadgeDTO getMilesBadge() {
        return this.milesBadge;
    }

    @NotNull
    public final PriceDTO getPrice() {
        return this.price;
    }

    public final BadgeDTO getPriceBadge() {
        return this.priceBadge;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        BadgeDTO badgeDTO = this.milesBadge;
        int hashCode2 = (hashCode + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31;
        BadgeDTO badgeDTO2 = this.priceBadge;
        return this.price.hashCode() + ((hashCode2 + (badgeDTO2 != null ? badgeDTO2.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        return "AlternativePriceBlockDTO(title=" + this.title + ", milesBadge=" + this.milesBadge + ", priceBadge=" + this.priceBadge + ", price=" + this.price + ")";
    }
}
