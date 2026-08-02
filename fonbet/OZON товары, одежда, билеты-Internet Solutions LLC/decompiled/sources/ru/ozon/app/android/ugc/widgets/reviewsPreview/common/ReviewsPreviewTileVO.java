package ru.ozon.app.android.ugc.widgets.reviewsPreview.common;

import Fm.C3051a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0081\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0017\u001a\u0004\b \u0010\u0019R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0017\u001a\u0004\b!\u0010\u0019R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\"\u001a\u0004\b#\u0010\u000f¨\u0006$"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewsPreview/common/ReviewsPreviewTileVO;", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/price/PriceDTO;", "price", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "ratingIcon", "ratingValue", "separator", "", "backgroundColor", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/price/PriceDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "getPrice", "()Lru/ozon/uni/atoms/data/price/PriceDTO;", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getRatingIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getRatingValue", "getSeparator", "Ljava/lang/String;", "getBackgroundColor", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ReviewsPreviewTileVO {
    public static final int $stable = IconDTO.$stable | PriceDTO.$stable;

    @NotNull
    private final String backgroundColor;

    @NotNull
    private final PriceDTO price;
    private final IconDTO ratingIcon;
    private final TextDTO ratingValue;
    private final TextDTO separator;

    @NotNull
    private final TextDTO title;

    public ReviewsPreviewTileVO(@NotNull TextDTO title, @NotNull PriceDTO price, IconDTO iconDTO, TextDTO textDTO, TextDTO textDTO2, @NotNull String backgroundColor) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        this.title = title;
        this.price = price;
        this.ratingIcon = iconDTO;
        this.ratingValue = textDTO;
        this.separator = textDTO2;
        this.backgroundColor = backgroundColor;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReviewsPreviewTileVO)) {
            return false;
        }
        ReviewsPreviewTileVO reviewsPreviewTileVO = (ReviewsPreviewTileVO) other;
        return Intrinsics.d(this.title, reviewsPreviewTileVO.title) && Intrinsics.d(this.price, reviewsPreviewTileVO.price) && Intrinsics.d(this.ratingIcon, reviewsPreviewTileVO.ratingIcon) && Intrinsics.d(this.ratingValue, reviewsPreviewTileVO.ratingValue) && Intrinsics.d(this.separator, reviewsPreviewTileVO.separator) && Intrinsics.d(this.backgroundColor, reviewsPreviewTileVO.backgroundColor);
    }

    @NotNull
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
        return this.backgroundColor.hashCode() + ((hashCode2 + (textDTO2 != null ? textDTO2.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        return "ReviewsPreviewTileVO(title=" + this.title + ", price=" + this.price + ", ratingIcon=" + this.ratingIcon + ", ratingValue=" + this.ratingValue + ", separator=" + this.separator + ", backgroundColor=" + this.backgroundColor + ")";
    }
}
