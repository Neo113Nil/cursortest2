package ru.ozon.app.android.orderdetails.orderTotal.data;

import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.uni.atoms.data.badge.Badge;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B9\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J\u0011\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0003JC\u0010\u0017\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\r¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/orderdetails/orderTotal/data/SummaryDTO;", "", "badges", "", "Lru/ozon/uni/atoms/data/badge/Badge;", CommentV3DTO.FOOTER_FIELD_NAME, "Lru/ozon/app/android/orderdetails/orderTotal/data/PriceBlockDTO;", CommentV3DTO.HEADER_FIELD_NAME, "Lru/ozon/app/android/orderdetails/orderTotal/data/HeaderDTO;", "prices", "<init>", "(Ljava/util/List;Lru/ozon/app/android/orderdetails/orderTotal/data/PriceBlockDTO;Lru/ozon/app/android/orderdetails/orderTotal/data/HeaderDTO;Ljava/util/List;)V", "getBadges", "()Ljava/util/List;", "getFooter", "()Lru/ozon/app/android/orderdetails/orderTotal/data/PriceBlockDTO;", "getHeader", "()Lru/ozon/app/android/orderdetails/orderTotal/data/HeaderDTO;", "getPrices", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class SummaryDTO {
    public static final int $stable = 8;
    private final List<Badge> badges;
    private final PriceBlockDTO footer;

    @NotNull
    private final HeaderDTO header;
    private final List<PriceBlockDTO> prices;

    public SummaryDTO(List<Badge> list, PriceBlockDTO priceBlockDTO, @NotNull HeaderDTO header, List<PriceBlockDTO> list2) {
        Intrinsics.checkNotNullParameter(header, "header");
        this.badges = list;
        this.footer = priceBlockDTO;
        this.header = header;
        this.prices = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SummaryDTO copy$default(SummaryDTO summaryDTO, List list, PriceBlockDTO priceBlockDTO, HeaderDTO headerDTO, List list2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = summaryDTO.badges;
        }
        if ((i11 & 2) != 0) {
            priceBlockDTO = summaryDTO.footer;
        }
        if ((i11 & 4) != 0) {
            headerDTO = summaryDTO.header;
        }
        if ((i11 & 8) != 0) {
            list2 = summaryDTO.prices;
        }
        return summaryDTO.copy(list, priceBlockDTO, headerDTO, list2);
    }

    public final List<Badge> component1() {
        return this.badges;
    }

    /* renamed from: component2, reason: from getter */
    public final PriceBlockDTO getFooter() {
        return this.footer;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final HeaderDTO getHeader() {
        return this.header;
    }

    public final List<PriceBlockDTO> component4() {
        return this.prices;
    }

    @NotNull
    public final SummaryDTO copy(List<Badge> badges, PriceBlockDTO footer, @NotNull HeaderDTO header, List<PriceBlockDTO> prices) {
        Intrinsics.checkNotNullParameter(header, "header");
        return new SummaryDTO(badges, footer, header, prices);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SummaryDTO)) {
            return false;
        }
        SummaryDTO summaryDTO = (SummaryDTO) other;
        return Intrinsics.d(this.badges, summaryDTO.badges) && Intrinsics.d(this.footer, summaryDTO.footer) && Intrinsics.d(this.header, summaryDTO.header) && Intrinsics.d(this.prices, summaryDTO.prices);
    }

    public final List<Badge> getBadges() {
        return this.badges;
    }

    public final PriceBlockDTO getFooter() {
        return this.footer;
    }

    @NotNull
    public final HeaderDTO getHeader() {
        return this.header;
    }

    public final List<PriceBlockDTO> getPrices() {
        return this.prices;
    }

    public int hashCode() {
        List<Badge> list = this.badges;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        PriceBlockDTO priceBlockDTO = this.footer;
        int hashCode2 = (this.header.hashCode() + ((hashCode + (priceBlockDTO == null ? 0 : priceBlockDTO.hashCode())) * 31)) * 31;
        List<PriceBlockDTO> list2 = this.prices;
        return hashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SummaryDTO(badges=" + this.badges + ", footer=" + this.footer + ", header=" + this.header + ", prices=" + this.prices + ")";
    }
}
