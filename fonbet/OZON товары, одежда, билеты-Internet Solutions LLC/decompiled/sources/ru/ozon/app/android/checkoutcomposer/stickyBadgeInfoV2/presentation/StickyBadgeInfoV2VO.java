package ru.ozon.app.android.checkoutcomposer.stickyBadgeInfoV2.presentation;

import TY.a;
import Tl.b;
import V.e;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutgeo.checkout.data.Paddings;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0081\b\u0018\u00002\u00020\u0001:\u0001.BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010!R\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b%\u0010!R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010&\u001a\u0004\b'\u0010\u0013R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010+\u001a\u0004\b,\u0010-¨\u0006/"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/stickyBadgeInfoV2/presentation/StickyBadgeInfoV2VO;", "Ll20/c;", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", "startText", "", "Lru/ozon/app/android/checkoutcomposer/stickyBadgeInfoV2/presentation/StickyBadgeInfoV2VO$BankImage;", "images", "endText", "", "backgroundColor", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "cornerRadius", "Lru/ozon/app/android/checkoutgeo/checkout/data/Paddings;", "paddings", "<init>", "(JLru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;Lru/ozon/uni/atoms/data/common/CornerRadius;Lru/ozon/app/android/checkoutgeo/checkout/data/Paddings;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getStartText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Ljava/util/List;", "getImages", "()Ljava/util/List;", "getEndText", "Ljava/lang/String;", "getBackgroundColor", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "getCornerRadius", "()Lru/ozon/uni/atoms/data/common/CornerRadius;", "Lru/ozon/app/android/checkoutgeo/checkout/data/Paddings;", "getPaddings", "()Lru/ozon/app/android/checkoutgeo/checkout/data/Paddings;", "BankImage", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class StickyBadgeInfoV2VO implements c {
    private final String backgroundColor;

    @NotNull
    private final CornerRadius cornerRadius;
    private final TextDTO endText;
    private final long id;
    private final List<BankImage> images;

    @NotNull
    private final Paddings paddings;
    private final TextDTO startText;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0012\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/stickyBadgeInfoV2/presentation/StickyBadgeInfoV2VO$BankImage;", "", "", "imageUrl", "tintColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getImageUrl", "getTintColor", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BankImage {

        @NotNull
        private final String imageUrl;
        private final String tintColor;

        public BankImage(@NotNull String imageUrl, String str) {
            Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
            this.imageUrl = imageUrl;
            this.tintColor = str;
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

    public StickyBadgeInfoV2VO(long j11, TextDTO textDTO, List<BankImage> list, TextDTO textDTO2, String str, @NotNull CornerRadius cornerRadius, @NotNull Paddings paddings) {
        Intrinsics.checkNotNullParameter(cornerRadius, "cornerRadius");
        Intrinsics.checkNotNullParameter(paddings, "paddings");
        this.id = j11;
        this.startText = textDTO;
        this.images = list;
        this.endText = textDTO2;
        this.backgroundColor = str;
        this.cornerRadius = cornerRadius;
        this.paddings = paddings;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StickyBadgeInfoV2VO)) {
            return false;
        }
        StickyBadgeInfoV2VO stickyBadgeInfoV2VO = (StickyBadgeInfoV2VO) other;
        return this.id == stickyBadgeInfoV2VO.id && Intrinsics.d(this.startText, stickyBadgeInfoV2VO.startText) && Intrinsics.d(this.images, stickyBadgeInfoV2VO.images) && Intrinsics.d(this.endText, stickyBadgeInfoV2VO.endText) && Intrinsics.d(this.backgroundColor, stickyBadgeInfoV2VO.backgroundColor) && this.cornerRadius == stickyBadgeInfoV2VO.cornerRadius && Intrinsics.d(this.paddings, stickyBadgeInfoV2VO.paddings);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final CornerRadius getCornerRadius() {
        return this.cornerRadius;
    }

    public final TextDTO getEndText() {
        return this.endText;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final List<BankImage> getImages() {
        return this.images;
    }

    @NotNull
    public final Paddings getPaddings() {
        return this.paddings;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final TextDTO getStartText() {
        return this.startText;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        TextDTO textDTO = this.startText;
        int hashCode2 = (hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        List<BankImage> list = this.images;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        TextDTO textDTO2 = this.endText;
        int hashCode4 = (hashCode3 + (textDTO2 == null ? 0 : textDTO2.hashCode())) * 31;
        String str = this.backgroundColor;
        return this.paddings.hashCode() + b.b(this.cornerRadius, (hashCode4 + (str != null ? str.hashCode() : 0)) * 31, 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextDTO textDTO = this.startText;
        List<BankImage> list = this.images;
        TextDTO textDTO2 = this.endText;
        String str = this.backgroundColor;
        CornerRadius cornerRadius = this.cornerRadius;
        Paddings paddings = this.paddings;
        StringBuilder b11 = a.b("StickyBadgeInfoV2VO(id=", j11, ", startText=", textDTO);
        b11.append(", images=");
        b11.append(list);
        b11.append(", endText=");
        b11.append(textDTO2);
        b11.append(", backgroundColor=");
        b11.append(str);
        b11.append(", cornerRadius=");
        b11.append(cornerRadius);
        b11.append(", paddings=");
        b11.append(paddings);
        b11.append(")");
        return b11.toString();
    }
}
