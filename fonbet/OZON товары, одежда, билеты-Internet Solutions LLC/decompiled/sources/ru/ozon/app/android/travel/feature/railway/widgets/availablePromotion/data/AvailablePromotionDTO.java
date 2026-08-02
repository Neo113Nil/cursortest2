package ru.ozon.app.android.travel.feature.railway.widgets.availablePromotion.data;

import Ns.b;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B=\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001d\u001a\u00020\nHÆ\u0003J\t\u0010\u001e\u001a\u00020\fHÆ\u0003JI\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010 \u001a\u00020\f2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0018¨\u0006%"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/availablePromotion/data/AvailablePromotionDTO;", "", "promoBlockBgColor", "", "promoBlockCornerRadius", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "promo", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "details", "description", "Lru/ozon/uni/atoms/data/text/TextDTO;", "isOpened", "", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/common/CornerRadius;Lru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Z)V", "getPromoBlockBgColor", "()Ljava/lang/String;", "getPromoBlockCornerRadius", "()Lru/ozon/uni/atoms/data/common/CornerRadius;", "getPromo", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getDetails", "getDescription", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class AvailablePromotionDTO {
    public static final int $stable = CellDTO.$stable;

    @NotNull
    private final TextDTO description;

    @NotNull
    private final CellDTO details;
    private final boolean isOpened;

    @NotNull
    private final CellDTO promo;
    private final String promoBlockBgColor;
    private final CornerRadius promoBlockCornerRadius;

    public AvailablePromotionDTO(String str, CornerRadius cornerRadius, @NotNull CellDTO promo, @NotNull CellDTO details, @NotNull TextDTO description, boolean z11) {
        Intrinsics.checkNotNullParameter(promo, "promo");
        Intrinsics.checkNotNullParameter(details, "details");
        Intrinsics.checkNotNullParameter(description, "description");
        this.promoBlockBgColor = str;
        this.promoBlockCornerRadius = cornerRadius;
        this.promo = promo;
        this.details = details;
        this.description = description;
        this.isOpened = z11;
    }

    public static /* synthetic */ AvailablePromotionDTO copy$default(AvailablePromotionDTO availablePromotionDTO, String str, CornerRadius cornerRadius, CellDTO cellDTO, CellDTO cellDTO2, TextDTO textDTO, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = availablePromotionDTO.promoBlockBgColor;
        }
        if ((i11 & 2) != 0) {
            cornerRadius = availablePromotionDTO.promoBlockCornerRadius;
        }
        if ((i11 & 4) != 0) {
            cellDTO = availablePromotionDTO.promo;
        }
        if ((i11 & 8) != 0) {
            cellDTO2 = availablePromotionDTO.details;
        }
        if ((i11 & 16) != 0) {
            textDTO = availablePromotionDTO.description;
        }
        if ((i11 & 32) != 0) {
            z11 = availablePromotionDTO.isOpened;
        }
        TextDTO textDTO2 = textDTO;
        boolean z12 = z11;
        return availablePromotionDTO.copy(str, cornerRadius, cellDTO, cellDTO2, textDTO2, z12);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPromoBlockBgColor() {
        return this.promoBlockBgColor;
    }

    /* renamed from: component2, reason: from getter */
    public final CornerRadius getPromoBlockCornerRadius() {
        return this.promoBlockCornerRadius;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final CellDTO getPromo() {
        return this.promo;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final CellDTO getDetails() {
        return this.details;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final TextDTO getDescription() {
        return this.description;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsOpened() {
        return this.isOpened;
    }

    @NotNull
    public final AvailablePromotionDTO copy(String promoBlockBgColor, CornerRadius promoBlockCornerRadius, @NotNull CellDTO promo, @NotNull CellDTO details, @NotNull TextDTO description, boolean isOpened) {
        Intrinsics.checkNotNullParameter(promo, "promo");
        Intrinsics.checkNotNullParameter(details, "details");
        Intrinsics.checkNotNullParameter(description, "description");
        return new AvailablePromotionDTO(promoBlockBgColor, promoBlockCornerRadius, promo, details, description, isOpened);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AvailablePromotionDTO)) {
            return false;
        }
        AvailablePromotionDTO availablePromotionDTO = (AvailablePromotionDTO) other;
        return Intrinsics.d(this.promoBlockBgColor, availablePromotionDTO.promoBlockBgColor) && this.promoBlockCornerRadius == availablePromotionDTO.promoBlockCornerRadius && Intrinsics.d(this.promo, availablePromotionDTO.promo) && Intrinsics.d(this.details, availablePromotionDTO.details) && Intrinsics.d(this.description, availablePromotionDTO.description) && this.isOpened == availablePromotionDTO.isOpened;
    }

    @NotNull
    public final TextDTO getDescription() {
        return this.description;
    }

    @NotNull
    public final CellDTO getDetails() {
        return this.details;
    }

    @NotNull
    public final CellDTO getPromo() {
        return this.promo;
    }

    public final String getPromoBlockBgColor() {
        return this.promoBlockBgColor;
    }

    public final CornerRadius getPromoBlockCornerRadius() {
        return this.promoBlockCornerRadius;
    }

    public int hashCode() {
        String str = this.promoBlockBgColor;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        CornerRadius cornerRadius = this.promoBlockCornerRadius;
        return Boolean.hashCode(this.isOpened) + b.a(this.description, Bi.b.c(this.details, Bi.b.c(this.promo, (hashCode + (cornerRadius != null ? cornerRadius.hashCode() : 0)) * 31, 31), 31), 31);
    }

    public final boolean isOpened() {
        return this.isOpened;
    }

    @NotNull
    public String toString() {
        return "AvailablePromotionDTO(promoBlockBgColor=" + this.promoBlockBgColor + ", promoBlockCornerRadius=" + this.promoBlockCornerRadius + ", promo=" + this.promo + ", details=" + this.details + ", description=" + this.description + ", isOpened=" + this.isOpened + ")";
    }

    public /* synthetic */ AvailablePromotionDTO(String str, CornerRadius cornerRadius, CellDTO cellDTO, CellDTO cellDTO2, TextDTO textDTO, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, cornerRadius, cellDTO, cellDTO2, textDTO, (i11 & 32) != 0 ? false : z11);
    }
}
