package ru.ozon.app.android.checkoutcomposer.stickyBadgeInfoV2.data;

import K1.G;
import V.e;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutgeo.checkout.data.Paddings;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001(BI\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\rHÆ\u0003JW\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\tHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006)"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/stickyBadgeInfoV2/data/StickyBadgeInfoV2DTO;", "", "startText", "Lru/ozon/uni/atoms/data/text/TextDTO;", "images", "", "Lru/ozon/app/android/checkoutcomposer/stickyBadgeInfoV2/data/StickyBadgeInfoV2DTO$BankImage;", "endText", "backgroundColor", "", "cornerRadius", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "paddings", "Lru/ozon/app/android/checkoutgeo/checkout/data/Paddings;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;Lru/ozon/uni/atoms/data/common/CornerRadius;Lru/ozon/app/android/checkoutgeo/checkout/data/Paddings;)V", "getStartText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getImages", "()Ljava/util/List;", "getEndText", "getBackgroundColor", "()Ljava/lang/String;", "getCornerRadius", "()Lru/ozon/uni/atoms/data/common/CornerRadius;", "getPaddings", "()Lru/ozon/app/android/checkoutgeo/checkout/data/Paddings;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "BankImage", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class StickyBadgeInfoV2DTO {
    public static final int $stable = 8;
    private final String backgroundColor;
    private final CornerRadius cornerRadius;
    private final TextDTO endText;
    private final List<BankImage> images;
    private final Paddings paddings;
    private final TextDTO startText;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/stickyBadgeInfoV2/data/StickyBadgeInfoV2DTO$BankImage;", "", "imageUrl", "", "tintColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getImageUrl", "()Ljava/lang/String;", "getTintColor", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BankImage {
        public static final int $stable = 0;

        @NotNull
        private final String imageUrl;
        private final String tintColor;

        public BankImage(@NotNull String imageUrl, String str) {
            Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
            this.imageUrl = imageUrl;
            this.tintColor = str;
        }

        public static /* synthetic */ BankImage copy$default(BankImage bankImage, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = bankImage.imageUrl;
            }
            if ((i11 & 2) != 0) {
                str2 = bankImage.tintColor;
            }
            return bankImage.copy(str, str2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getImageUrl() {
            return this.imageUrl;
        }

        /* renamed from: component2, reason: from getter */
        public final String getTintColor() {
            return this.tintColor;
        }

        @NotNull
        public final BankImage copy(@NotNull String imageUrl, String tintColor) {
            Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
            return new BankImage(imageUrl, tintColor);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BankImage)) {
                return false;
            }
            BankImage bankImage = (BankImage) other;
            return Intrinsics.d(this.imageUrl, bankImage.imageUrl) && Intrinsics.d(this.tintColor, bankImage.tintColor);
        }

        @NotNull
        public final String getImageUrl() {
            return this.imageUrl;
        }

        public final String getTintColor() {
            return this.tintColor;
        }

        public int hashCode() {
            int hashCode = this.imageUrl.hashCode() * 31;
            String str = this.tintColor;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public String toString() {
            return e.a("BankImage(imageUrl=", this.imageUrl, ", tintColor=", this.tintColor, ")");
        }
    }

    public StickyBadgeInfoV2DTO(TextDTO textDTO, List<BankImage> list, TextDTO textDTO2, String str, CornerRadius cornerRadius, Paddings paddings) {
        this.startText = textDTO;
        this.images = list;
        this.endText = textDTO2;
        this.backgroundColor = str;
        this.cornerRadius = cornerRadius;
        this.paddings = paddings;
    }

    public static /* synthetic */ StickyBadgeInfoV2DTO copy$default(StickyBadgeInfoV2DTO stickyBadgeInfoV2DTO, TextDTO textDTO, List list, TextDTO textDTO2, String str, CornerRadius cornerRadius, Paddings paddings, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textDTO = stickyBadgeInfoV2DTO.startText;
        }
        if ((i11 & 2) != 0) {
            list = stickyBadgeInfoV2DTO.images;
        }
        if ((i11 & 4) != 0) {
            textDTO2 = stickyBadgeInfoV2DTO.endText;
        }
        if ((i11 & 8) != 0) {
            str = stickyBadgeInfoV2DTO.backgroundColor;
        }
        if ((i11 & 16) != 0) {
            cornerRadius = stickyBadgeInfoV2DTO.cornerRadius;
        }
        if ((i11 & 32) != 0) {
            paddings = stickyBadgeInfoV2DTO.paddings;
        }
        CornerRadius cornerRadius2 = cornerRadius;
        Paddings paddings2 = paddings;
        return stickyBadgeInfoV2DTO.copy(textDTO, list, textDTO2, str, cornerRadius2, paddings2);
    }

    /* renamed from: component1, reason: from getter */
    public final TextDTO getStartText() {
        return this.startText;
    }

    public final List<BankImage> component2() {
        return this.images;
    }

    /* renamed from: component3, reason: from getter */
    public final TextDTO getEndText() {
        return this.endText;
    }

    /* renamed from: component4, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component5, reason: from getter */
    public final CornerRadius getCornerRadius() {
        return this.cornerRadius;
    }

    /* renamed from: component6, reason: from getter */
    public final Paddings getPaddings() {
        return this.paddings;
    }

    @NotNull
    public final StickyBadgeInfoV2DTO copy(TextDTO startText, List<BankImage> images, TextDTO endText, String backgroundColor, CornerRadius cornerRadius, Paddings paddings) {
        return new StickyBadgeInfoV2DTO(startText, images, endText, backgroundColor, cornerRadius, paddings);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StickyBadgeInfoV2DTO)) {
            return false;
        }
        StickyBadgeInfoV2DTO stickyBadgeInfoV2DTO = (StickyBadgeInfoV2DTO) other;
        return Intrinsics.d(this.startText, stickyBadgeInfoV2DTO.startText) && Intrinsics.d(this.images, stickyBadgeInfoV2DTO.images) && Intrinsics.d(this.endText, stickyBadgeInfoV2DTO.endText) && Intrinsics.d(this.backgroundColor, stickyBadgeInfoV2DTO.backgroundColor) && this.cornerRadius == stickyBadgeInfoV2DTO.cornerRadius && Intrinsics.d(this.paddings, stickyBadgeInfoV2DTO.paddings);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final CornerRadius getCornerRadius() {
        return this.cornerRadius;
    }

    public final TextDTO getEndText() {
        return this.endText;
    }

    public final List<BankImage> getImages() {
        return this.images;
    }

    public final Paddings getPaddings() {
        return this.paddings;
    }

    public final TextDTO getStartText() {
        return this.startText;
    }

    public int hashCode() {
        TextDTO textDTO = this.startText;
        int hashCode = (textDTO == null ? 0 : textDTO.hashCode()) * 31;
        List<BankImage> list = this.images;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        TextDTO textDTO2 = this.endText;
        int hashCode3 = (hashCode2 + (textDTO2 == null ? 0 : textDTO2.hashCode())) * 31;
        String str = this.backgroundColor;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        CornerRadius cornerRadius = this.cornerRadius;
        int hashCode5 = (hashCode4 + (cornerRadius == null ? 0 : cornerRadius.hashCode())) * 31;
        Paddings paddings = this.paddings;
        return hashCode5 + (paddings != null ? paddings.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        TextDTO textDTO = this.startText;
        List<BankImage> list = this.images;
        TextDTO textDTO2 = this.endText;
        String str = this.backgroundColor;
        CornerRadius cornerRadius = this.cornerRadius;
        Paddings paddings = this.paddings;
        StringBuilder e11 = G.e("StickyBadgeInfoV2DTO(startText=", textDTO, ", images=", list, ", endText=");
        e11.append(textDTO2);
        e11.append(", backgroundColor=");
        e11.append(str);
        e11.append(", cornerRadius=");
        e11.append(cornerRadius);
        e11.append(", paddings=");
        e11.append(paddings);
        e11.append(")");
        return e11.toString();
    }
}
