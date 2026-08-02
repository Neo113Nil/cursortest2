package ru.ozon.app.android.cscore.orderdetails.molecule.imagesCompose.data;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMolecule;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.productMedia.ProductMediaDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u00018Bk\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0014\u0010\u0015J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010*\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u001cJ\u0010\u0010+\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u001cJ\u000b\u0010,\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\t\u00100\u001a\u00020\u000eHÆ\u0003J\u0084\u0001\u00101\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u000eHÆ\u0001¢\u0006\u0002\u00102J\u0013\u00103\u001a\u00020\t2\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00105\u001a\u000206HÖ\u0001J\t\u00107\u001a\u00020\u000eHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\b\u0010\u001cR\u0015\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\n\u0010\u001cR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\u0013\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b&\u0010!¨\u00069"}, d2 = {"Lru/ozon/app/android/cscore/orderdetails/molecule/imagesCompose/data/ComposableImageDTO;", "", "image", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "productMedia", "Lru/ozon/uni/atoms/data/productMedia/ProductMediaDTO;", "counter", "Lru/ozon/uni/atoms/data/text/TextDTO;", FavoriteProductMolecule.IS_ADULT_PARAMS_NAME, "", "isTranslucent", "badge", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "blurImageUrl", "", "border", "Lru/ozon/app/android/cscore/orderdetails/molecule/imagesCompose/data/ComposableImageDTO$Border;", "common", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "key", "<init>", "(Lru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/uni/atoms/data/productMedia/ProductMediaDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/Boolean;Ljava/lang/Boolean;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Ljava/lang/String;Lru/ozon/app/android/cscore/orderdetails/molecule/imagesCompose/data/ComposableImageDTO$Border;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;Ljava/lang/String;)V", "getImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "getProductMedia", "()Lru/ozon/uni/atoms/data/productMedia/ProductMediaDTO;", "getCounter", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getBlurImageUrl", "()Ljava/lang/String;", "getBorder", "()Lru/ozon/app/android/cscore/orderdetails/molecule/imagesCompose/data/ComposableImageDTO$Border;", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "getKey", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(Lru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/uni/atoms/data/productMedia/ProductMediaDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/Boolean;Ljava/lang/Boolean;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Ljava/lang/String;Lru/ozon/app/android/cscore/orderdetails/molecule/imagesCompose/data/ComposableImageDTO$Border;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;Ljava/lang/String;)Lru/ozon/app/android/cscore/orderdetails/molecule/imagesCompose/data/ComposableImageDTO;", "equals", "other", "hashCode", "", "toString", "Border", "csma_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ComposableImageDTO {
    public static final int $stable = ProductMediaDTO.$stable;
    private final BadgeDTO badge;
    private final String blurImageUrl;
    private final Border border;
    private final CommonControlSettings common;
    private final TextDTO counter;
    private final ImageDTO image;
    private final Boolean isAdult;
    private final Boolean isTranslucent;

    @NotNull
    private final transient String key;
    private final ProductMediaDTO productMedia;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/cscore/orderdetails/molecule/imagesCompose/data/ComposableImageDTO$Border;", "", "color", "", "width", "", "<init>", "(Ljava/lang/String;F)V", "getColor", "()Ljava/lang/String;", "getWidth", "()F", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "csma_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Border {
        public static final int $stable = 0;

        @NotNull
        private final String color;
        private final float width;

        public Border(@NotNull String color, float f7) {
            Intrinsics.checkNotNullParameter(color, "color");
            this.color = color;
            this.width = f7;
        }

        public static /* synthetic */ Border copy$default(Border border, String str, float f7, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = border.color;
            }
            if ((i11 & 2) != 0) {
                f7 = border.width;
            }
            return border.copy(str, f7);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getColor() {
            return this.color;
        }

        /* renamed from: component2, reason: from getter */
        public final float getWidth() {
            return this.width;
        }

        @NotNull
        public final Border copy(@NotNull String color, float width) {
            Intrinsics.checkNotNullParameter(color, "color");
            return new Border(color, width);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Border)) {
                return false;
            }
            Border border = (Border) other;
            return Intrinsics.d(this.color, border.color) && Float.compare(this.width, border.width) == 0;
        }

        @NotNull
        public final String getColor() {
            return this.color;
        }

        public final float getWidth() {
            return this.width;
        }

        public int hashCode() {
            return Float.hashCode(this.width) + (this.color.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "Border(color=" + this.color + ", width=" + this.width + ")";
        }
    }

    public ComposableImageDTO(ImageDTO imageDTO, ProductMediaDTO productMediaDTO, TextDTO textDTO, Boolean bool, Boolean bool2, BadgeDTO badgeDTO, String str, Border border, CommonControlSettings commonControlSettings, @NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.image = imageDTO;
        this.productMedia = productMediaDTO;
        this.counter = textDTO;
        this.isAdult = bool;
        this.isTranslucent = bool2;
        this.badge = badgeDTO;
        this.blurImageUrl = str;
        this.border = border;
        this.common = commonControlSettings;
        this.key = key;
    }

    public static /* synthetic */ ComposableImageDTO copy$default(ComposableImageDTO composableImageDTO, ImageDTO imageDTO, ProductMediaDTO productMediaDTO, TextDTO textDTO, Boolean bool, Boolean bool2, BadgeDTO badgeDTO, String str, Border border, CommonControlSettings commonControlSettings, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            imageDTO = composableImageDTO.image;
        }
        if ((i11 & 2) != 0) {
            productMediaDTO = composableImageDTO.productMedia;
        }
        if ((i11 & 4) != 0) {
            textDTO = composableImageDTO.counter;
        }
        if ((i11 & 8) != 0) {
            bool = composableImageDTO.isAdult;
        }
        if ((i11 & 16) != 0) {
            bool2 = composableImageDTO.isTranslucent;
        }
        if ((i11 & 32) != 0) {
            badgeDTO = composableImageDTO.badge;
        }
        if ((i11 & 64) != 0) {
            str = composableImageDTO.blurImageUrl;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            border = composableImageDTO.border;
        }
        if ((i11 & 256) != 0) {
            commonControlSettings = composableImageDTO.common;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            str2 = composableImageDTO.key;
        }
        CommonControlSettings commonControlSettings2 = commonControlSettings;
        String str3 = str2;
        String str4 = str;
        Border border2 = border;
        Boolean bool3 = bool2;
        BadgeDTO badgeDTO2 = badgeDTO;
        return composableImageDTO.copy(imageDTO, productMediaDTO, textDTO, bool, bool3, badgeDTO2, str4, border2, commonControlSettings2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final ImageDTO getImage() {
        return this.image;
    }

    @NotNull
    /* renamed from: component10, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    /* renamed from: component2, reason: from getter */
    public final ProductMediaDTO getProductMedia() {
        return this.productMedia;
    }

    /* renamed from: component3, reason: from getter */
    public final TextDTO getCounter() {
        return this.counter;
    }

    /* renamed from: component4, reason: from getter */
    public final Boolean getIsAdult() {
        return this.isAdult;
    }

    /* renamed from: component5, reason: from getter */
    public final Boolean getIsTranslucent() {
        return this.isTranslucent;
    }

    /* renamed from: component6, reason: from getter */
    public final BadgeDTO getBadge() {
        return this.badge;
    }

    /* renamed from: component7, reason: from getter */
    public final String getBlurImageUrl() {
        return this.blurImageUrl;
    }

    /* renamed from: component8, reason: from getter */
    public final Border getBorder() {
        return this.border;
    }

    /* renamed from: component9, reason: from getter */
    public final CommonControlSettings getCommon() {
        return this.common;
    }

    @NotNull
    public final ComposableImageDTO copy(ImageDTO image, ProductMediaDTO productMedia, TextDTO counter, Boolean isAdult, Boolean isTranslucent, BadgeDTO badge, String blurImageUrl, Border border, CommonControlSettings common, @NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return new ComposableImageDTO(image, productMedia, counter, isAdult, isTranslucent, badge, blurImageUrl, border, common, key);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ComposableImageDTO)) {
            return false;
        }
        ComposableImageDTO composableImageDTO = (ComposableImageDTO) other;
        return Intrinsics.d(this.image, composableImageDTO.image) && Intrinsics.d(this.productMedia, composableImageDTO.productMedia) && Intrinsics.d(this.counter, composableImageDTO.counter) && Intrinsics.d(this.isAdult, composableImageDTO.isAdult) && Intrinsics.d(this.isTranslucent, composableImageDTO.isTranslucent) && Intrinsics.d(this.badge, composableImageDTO.badge) && Intrinsics.d(this.blurImageUrl, composableImageDTO.blurImageUrl) && Intrinsics.d(this.border, composableImageDTO.border) && Intrinsics.d(this.common, composableImageDTO.common) && Intrinsics.d(this.key, composableImageDTO.key);
    }

    public final BadgeDTO getBadge() {
        return this.badge;
    }

    public final String getBlurImageUrl() {
        return this.blurImageUrl;
    }

    public final Border getBorder() {
        return this.border;
    }

    public final CommonControlSettings getCommon() {
        return this.common;
    }

    public final TextDTO getCounter() {
        return this.counter;
    }

    public final ImageDTO getImage() {
        return this.image;
    }

    @NotNull
    public final String getKey() {
        return this.key;
    }

    public final ProductMediaDTO getProductMedia() {
        return this.productMedia;
    }

    public int hashCode() {
        ImageDTO imageDTO = this.image;
        int hashCode = (imageDTO == null ? 0 : imageDTO.hashCode()) * 31;
        ProductMediaDTO productMediaDTO = this.productMedia;
        int hashCode2 = (hashCode + (productMediaDTO == null ? 0 : productMediaDTO.hashCode())) * 31;
        TextDTO textDTO = this.counter;
        int hashCode3 = (hashCode2 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        Boolean bool = this.isAdult;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isTranslucent;
        int hashCode5 = (hashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        BadgeDTO badgeDTO = this.badge;
        int hashCode6 = (hashCode5 + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31;
        String str = this.blurImageUrl;
        int hashCode7 = (hashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        Border border = this.border;
        int hashCode8 = (hashCode7 + (border == null ? 0 : border.hashCode())) * 31;
        CommonControlSettings commonControlSettings = this.common;
        return this.key.hashCode() + ((hashCode8 + (commonControlSettings != null ? commonControlSettings.hashCode() : 0)) * 31);
    }

    public final Boolean isAdult() {
        return this.isAdult;
    }

    public final Boolean isTranslucent() {
        return this.isTranslucent;
    }

    @NotNull
    public String toString() {
        return "ComposableImageDTO(image=" + this.image + ", productMedia=" + this.productMedia + ", counter=" + this.counter + ", isAdult=" + this.isAdult + ", isTranslucent=" + this.isTranslucent + ", badge=" + this.badge + ", blurImageUrl=" + this.blurImageUrl + ", border=" + this.border + ", common=" + this.common + ", key=" + this.key + ")";
    }

    public /* synthetic */ ComposableImageDTO(ImageDTO imageDTO, ProductMediaDTO productMediaDTO, TextDTO textDTO, Boolean bool, Boolean bool2, BadgeDTO badgeDTO, String str, Border border, CommonControlSettings commonControlSettings, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(imageDTO, productMediaDTO, textDTO, bool, bool2, badgeDTO, str, border, commonControlSettings, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? "" : str2);
    }
}
