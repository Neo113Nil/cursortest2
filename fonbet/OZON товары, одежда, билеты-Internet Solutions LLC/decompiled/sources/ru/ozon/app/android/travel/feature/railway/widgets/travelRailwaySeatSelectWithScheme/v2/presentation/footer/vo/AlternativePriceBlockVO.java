package ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.presentation.footer.vo;

import Ns.b;
import Tz.C4055a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.presentation.footer.vo.TravelRailwaySeatSelectFooterVO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0081\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\u001f\u0010\u001eR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/footer/vo/AlternativePriceBlockVO;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/footer/vo/TravelRailwaySeatSelectFooterVO$FooterItem;", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "milesBadge", "priceBadge", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "price", "<init>", "(ILru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/price/PriceDTO;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getMilesBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getPriceBadge", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "getPrice", "()Lru/ozon/uni/atoms/data/price/PriceDTO;", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class AlternativePriceBlockVO implements TravelRailwaySeatSelectFooterVO.FooterItem {
    public static final int $stable = PriceDTO.$stable;
    private final int id;
    private final BadgeDTO milesBadge;

    @NotNull
    private final PriceDTO price;
    private final BadgeDTO priceBadge;

    @NotNull
    private final TextDTO title;

    public AlternativePriceBlockVO(int i11, @NotNull TextDTO title, BadgeDTO badgeDTO, BadgeDTO badgeDTO2, @NotNull PriceDTO price) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(price, "price");
        this.id = i11;
        this.title = title;
        this.milesBadge = badgeDTO;
        this.priceBadge = badgeDTO2;
        this.price = price;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AlternativePriceBlockVO)) {
            return false;
        }
        AlternativePriceBlockVO alternativePriceBlockVO = (AlternativePriceBlockVO) other;
        return this.id == alternativePriceBlockVO.id && Intrinsics.d(this.title, alternativePriceBlockVO.title) && Intrinsics.d(this.milesBadge, alternativePriceBlockVO.milesBadge) && Intrinsics.d(this.priceBadge, alternativePriceBlockVO.priceBadge) && Intrinsics.d(this.price, alternativePriceBlockVO.price);
    }

    @Override // ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.presentation.footer.vo.TravelRailwaySeatSelectFooterVO.FooterItem
    public int getId() {
        return this.id;
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
        int a11 = b.a(this.title, Integer.hashCode(this.id) * 31, 31);
        BadgeDTO badgeDTO = this.milesBadge;
        int hashCode = (a11 + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31;
        BadgeDTO badgeDTO2 = this.priceBadge;
        return this.price.hashCode() + ((hashCode + (badgeDTO2 != null ? badgeDTO2.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        int i11 = this.id;
        TextDTO textDTO = this.title;
        BadgeDTO badgeDTO = this.milesBadge;
        BadgeDTO badgeDTO2 = this.priceBadge;
        PriceDTO priceDTO = this.price;
        StringBuilder b11 = C4055a.b(textDTO, "AlternativePriceBlockVO(id=", ", title=", ", milesBadge=", i11);
        b11.append(badgeDTO);
        b11.append(", priceBadge=");
        b11.append(badgeDTO2);
        b11.append(", price=");
        b11.append(priceDTO);
        b11.append(")");
        return b11.toString();
    }
}
