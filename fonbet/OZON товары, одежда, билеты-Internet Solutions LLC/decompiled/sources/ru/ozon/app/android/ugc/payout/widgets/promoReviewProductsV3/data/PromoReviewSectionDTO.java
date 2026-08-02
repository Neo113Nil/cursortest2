package ru.ozon.app.android.ugc.payout.widgets.promoReviewProductsV3.data;

import C.o0;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\bHÆ\u0003J/\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/ugc/payout/widgets/promoReviewProductsV3/data/PromoReviewSectionDTO;", "", CommentV3DTO.HEADER_FIELD_NAME, "Lru/ozon/app/android/ugc/payout/widgets/promoReviewProductsV3/data/PromoReviewSectionHeaderDTO;", "items", "", "Lru/ozon/app/android/ugc/payout/widgets/promoReviewProductsV3/data/PromoReviewItemDTO;", "backgroundColor", "", "<init>", "(Lru/ozon/app/android/ugc/payout/widgets/promoReviewProductsV3/data/PromoReviewSectionHeaderDTO;Ljava/util/List;Ljava/lang/String;)V", "getHeader", "()Lru/ozon/app/android/ugc/payout/widgets/promoReviewProductsV3/data/PromoReviewSectionHeaderDTO;", "getItems", "()Ljava/util/List;", "getBackgroundColor", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "payout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class PromoReviewSectionDTO {

    @NotNull
    private final String backgroundColor;

    @NotNull
    private final PromoReviewSectionHeaderDTO header;
    private final List<PromoReviewItemDTO> items;

    public PromoReviewSectionDTO(@NotNull PromoReviewSectionHeaderDTO header, List<PromoReviewItemDTO> list, @NotNull String backgroundColor) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        this.header = header;
        this.items = list;
        this.backgroundColor = backgroundColor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PromoReviewSectionDTO copy$default(PromoReviewSectionDTO promoReviewSectionDTO, PromoReviewSectionHeaderDTO promoReviewSectionHeaderDTO, List list, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            promoReviewSectionHeaderDTO = promoReviewSectionDTO.header;
        }
        if ((i11 & 2) != 0) {
            list = promoReviewSectionDTO.items;
        }
        if ((i11 & 4) != 0) {
            str = promoReviewSectionDTO.backgroundColor;
        }
        return promoReviewSectionDTO.copy(promoReviewSectionHeaderDTO, list, str);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final PromoReviewSectionHeaderDTO getHeader() {
        return this.header;
    }

    public final List<PromoReviewItemDTO> component2() {
        return this.items;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final PromoReviewSectionDTO copy(@NotNull PromoReviewSectionHeaderDTO header, List<PromoReviewItemDTO> items, @NotNull String backgroundColor) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        return new PromoReviewSectionDTO(header, items, backgroundColor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PromoReviewSectionDTO)) {
            return false;
        }
        PromoReviewSectionDTO promoReviewSectionDTO = (PromoReviewSectionDTO) other;
        return Intrinsics.d(this.header, promoReviewSectionDTO.header) && Intrinsics.d(this.items, promoReviewSectionDTO.items) && Intrinsics.d(this.backgroundColor, promoReviewSectionDTO.backgroundColor);
    }

    @NotNull
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final PromoReviewSectionHeaderDTO getHeader() {
        return this.header;
    }

    public final List<PromoReviewItemDTO> getItems() {
        return this.items;
    }

    public int hashCode() {
        int hashCode = this.header.hashCode() * 31;
        List<PromoReviewItemDTO> list = this.items;
        return this.backgroundColor.hashCode() + ((hashCode + (list == null ? 0 : list.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        PromoReviewSectionHeaderDTO promoReviewSectionHeaderDTO = this.header;
        List<PromoReviewItemDTO> list = this.items;
        String str = this.backgroundColor;
        StringBuilder sb2 = new StringBuilder("PromoReviewSectionDTO(header=");
        sb2.append(promoReviewSectionHeaderDTO);
        sb2.append(", items=");
        sb2.append(list);
        sb2.append(", backgroundColor=");
        return o0.c(sb2, str, ")");
    }
}
