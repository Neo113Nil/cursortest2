package ru.ozon.app.android.ugc.widgets.reviewsPreview.data;

import Fm.C3051a;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u000bHÆ\u0003JM\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u000bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006%"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewsPreview/data/ReviewsPreviewTileDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "price", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "ratingIcon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "ratingValue", "separator", "backgroundColor", "", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/price/PriceDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getPrice", "()Lru/ozon/uni/atoms/data/price/PriceDTO;", "getRatingIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getRatingValue", "getSeparator", "getBackgroundColor", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ReviewsPreviewTileDTO {
    public static final int $stable = IconDTO.$stable | PriceDTO.$stable;
    private final String backgroundColor;

    @NotNull
    private final PriceDTO price;
    private final IconDTO ratingIcon;
    private final TextDTO ratingValue;
    private final TextDTO separator;

    @NotNull
    private final TextDTO title;

    public ReviewsPreviewTileDTO(@NotNull TextDTO title, @NotNull PriceDTO price, IconDTO iconDTO, TextDTO textDTO, TextDTO textDTO2, String str) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(price, "price");
        this.title = title;
        this.price = price;
        this.ratingIcon = iconDTO;
        this.ratingValue = textDTO;
        this.separator = textDTO2;
        this.backgroundColor = str;
    }

    public static /* synthetic */ ReviewsPreviewTileDTO copy$default(ReviewsPreviewTileDTO reviewsPreviewTileDTO, TextDTO textDTO, PriceDTO priceDTO, IconDTO iconDTO, TextDTO textDTO2, TextDTO textDTO3, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textDTO = reviewsPreviewTileDTO.title;
        }
        if ((i11 & 2) != 0) {
            priceDTO = reviewsPreviewTileDTO.price;
        }
        if ((i11 & 4) != 0) {
            iconDTO = reviewsPreviewTileDTO.ratingIcon;
        }
        if ((i11 & 8) != 0) {
            textDTO2 = reviewsPreviewTileDTO.ratingValue;
        }
        if ((i11 & 16) != 0) {
            textDTO3 = reviewsPreviewTileDTO.separator;
        }
        if ((i11 & 32) != 0) {
            str = reviewsPreviewTileDTO.backgroundColor;
        }
        TextDTO textDTO4 = textDTO3;
        String str2 = str;
        return reviewsPreviewTileDTO.copy(textDTO, priceDTO, iconDTO, textDTO2, textDTO4, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextDTO getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final PriceDTO getPrice() {
        return this.price;
    }

    /* renamed from: component3, reason: from getter */
    public final IconDTO getRatingIcon() {
        return this.ratingIcon;
    }

    /* renamed from: component4, reason: from getter */
    public final TextDTO getRatingValue() {
        return this.ratingValue;
    }

    /* renamed from: component5, reason: from getter */
    public final TextDTO getSeparator() {
        return this.separator;
    }

    /* renamed from: component6, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final ReviewsPreviewTileDTO copy(@NotNull TextDTO title, @NotNull PriceDTO price, IconDTO ratingIcon, TextDTO ratingValue, TextDTO separator, String backgroundColor) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(price, "price");
        return new ReviewsPreviewTileDTO(title, price, ratingIcon, ratingValue, separator, backgroundColor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReviewsPreviewTileDTO)) {
            return false;
        }
        ReviewsPreviewTileDTO reviewsPreviewTileDTO = (ReviewsPreviewTileDTO) other;
        return Intrinsics.d(this.title, reviewsPreviewTileDTO.title) && Intrinsics.d(this.price, reviewsPreviewTileDTO.price) && Intrinsics.d(this.ratingIcon, reviewsPreviewTileDTO.ratingIcon) && Intrinsics.d(this.ratingValue, reviewsPreviewTileDTO.ratingValue) && Intrinsics.d(this.separator, reviewsPreviewTileDTO.separator) && Intrinsics.d(this.backgroundColor, reviewsPreviewTileDTO.backgroundColor);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final PriceDTO getPrice() {
        return this.price;
    }

    public final IconDTO getRatingIcon() {
        return this.ratingIcon;
    }

    public final TextDTO getRatingValue() {
        return this.ratingValue;
    }

    public final TextDTO getSeparator() {
        return this.separator;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public int hashCode() {
        int b11 = C3051a.b(this.price, this.title.hashCode() * 31, 31);
        IconDTO iconDTO = this.ratingIcon;
        int hashCode = (b11 + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31;
        TextDTO textDTO = this.ratingValue;
        int hashCode2 = (hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        TextDTO textDTO2 = this.separator;
        int hashCode3 = (hashCode2 + (textDTO2 == null ? 0 : textDTO2.hashCode())) * 31;
        String str = this.backgroundColor;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ReviewsPreviewTileDTO(title=" + this.title + ", price=" + this.price + ", ratingIcon=" + this.ratingIcon + ", ratingValue=" + this.ratingValue + ", separator=" + this.separator + ", backgroundColor=" + this.backgroundColor + ")";
    }
}
