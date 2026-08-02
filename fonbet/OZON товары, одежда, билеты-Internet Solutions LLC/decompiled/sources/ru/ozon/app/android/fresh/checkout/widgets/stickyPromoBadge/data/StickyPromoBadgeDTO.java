package ru.ozon.app.android.fresh.checkout.widgets.stickyPromoBadge.data;

import B3.p;
import GR.b;
import Tl.a;
import V.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001:\u000234Bi\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010'\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u0017\u0010+\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011HÆ\u0003J{\u0010,\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011HÆ\u0001J\u0013\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00100\u001a\u000201HÖ\u0001J\t\u00102\u001a\u00020\rHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u001f\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#¨\u00065"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/stickyPromoBadge/data/StickyPromoBadgeDTO;", "", "badge", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "startText", "Lru/ozon/uni/atoms/data/text/TextDTO;", "endText", "images", "", "Lru/ozon/app/android/fresh/checkout/widgets/stickyPromoBadge/data/StickyPromoBadgeDTO$Image;", "spacers", "Lru/ozon/app/android/fresh/checkout/widgets/stickyPromoBadge/data/StickyPromoBadgeDTO$SpacersDTO;", "backgroundColor", "", "cornerRadius", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;Lru/ozon/app/android/fresh/checkout/widgets/stickyPromoBadge/data/StickyPromoBadgeDTO$SpacersDTO;Ljava/lang/String;Lru/ozon/uni/atoms/data/common/CornerRadius;Ljava/util/Map;)V", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getStartText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getEndText", "getImages", "()Ljava/util/List;", "getSpacers", "()Lru/ozon/app/android/fresh/checkout/widgets/stickyPromoBadge/data/StickyPromoBadgeDTO$SpacersDTO;", "getBackgroundColor", "()Ljava/lang/String;", "getCornerRadius", "()Lru/ozon/uni/atoms/data/common/CornerRadius;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "Image", "SpacersDTO", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class StickyPromoBadgeDTO {
    public static final int $stable = 8;
    private final String backgroundColor;
    private final BadgeDTO badge;
    private final CornerRadius cornerRadius;
    private final TextDTO endText;
    private final List<Image> images;
    private final SpacersDTO spacers;
    private final TextDTO startText;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/stickyPromoBadge/data/StickyPromoBadgeDTO$Image;", "", "imageUrl", "", "tintColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getImageUrl", "()Ljava/lang/String;", "getTintColor", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Image {
        public static final int $stable = 0;

        @NotNull
        private final String imageUrl;
        private final String tintColor;

        public Image(@NotNull String imageUrl, String str) {
            Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
            this.imageUrl = imageUrl;
            this.tintColor = str;
        }

        public static /* synthetic */ Image copy$default(Image image, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = image.imageUrl;
            }
            if ((i11 & 2) != 0) {
                str2 = image.tintColor;
            }
            return image.copy(str, str2);
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
        public final Image copy(@NotNull String imageUrl, String tintColor) {
            Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
            return new Image(imageUrl, tintColor);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Image)) {
                return false;
            }
            Image image = (Image) other;
            return Intrinsics.d(this.imageUrl, image.imageUrl) && Intrinsics.d(this.tintColor, image.tintColor);
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
            return e.a("Image(imageUrl=", this.imageUrl, ", tintColor=", this.tintColor, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/stickyPromoBadge/data/StickyPromoBadgeDTO$SpacersDTO;", "", "top", "Lru/ozon/uni/atoms/data/common/Paddings;", "bottom", "left", "right", "<init>", "(Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;)V", "getTop", "()Lru/ozon/uni/atoms/data/common/Paddings;", "getBottom", "getLeft", "getRight", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SpacersDTO {
        public static final int $stable = 0;
        private final Paddings bottom;
        private final Paddings left;
        private final Paddings right;
        private final Paddings top;

        public SpacersDTO(Paddings paddings, Paddings paddings2, Paddings paddings3, Paddings paddings4) {
            this.top = paddings;
            this.bottom = paddings2;
            this.left = paddings3;
            this.right = paddings4;
        }

        public static /* synthetic */ SpacersDTO copy$default(SpacersDTO spacersDTO, Paddings paddings, Paddings paddings2, Paddings paddings3, Paddings paddings4, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                paddings = spacersDTO.top;
            }
            if ((i11 & 2) != 0) {
                paddings2 = spacersDTO.bottom;
            }
            if ((i11 & 4) != 0) {
                paddings3 = spacersDTO.left;
            }
            if ((i11 & 8) != 0) {
                paddings4 = spacersDTO.right;
            }
            return spacersDTO.copy(paddings, paddings2, paddings3, paddings4);
        }

        /* renamed from: component1, reason: from getter */
        public final Paddings getTop() {
            return this.top;
        }

        /* renamed from: component2, reason: from getter */
        public final Paddings getBottom() {
            return this.bottom;
        }

        /* renamed from: component3, reason: from getter */
        public final Paddings getLeft() {
            return this.left;
        }

        /* renamed from: component4, reason: from getter */
        public final Paddings getRight() {
            return this.right;
        }

        @NotNull
        public final SpacersDTO copy(Paddings top, Paddings bottom, Paddings left, Paddings right) {
            return new SpacersDTO(top, bottom, left, right);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SpacersDTO)) {
                return false;
            }
            SpacersDTO spacersDTO = (SpacersDTO) other;
            return this.top == spacersDTO.top && this.bottom == spacersDTO.bottom && this.left == spacersDTO.left && this.right == spacersDTO.right;
        }

        public final Paddings getBottom() {
            return this.bottom;
        }

        public final Paddings getLeft() {
            return this.left;
        }

        public final Paddings getRight() {
            return this.right;
        }

        public final Paddings getTop() {
            return this.top;
        }

        public int hashCode() {
            Paddings paddings = this.top;
            int hashCode = (paddings == null ? 0 : paddings.hashCode()) * 31;
            Paddings paddings2 = this.bottom;
            int hashCode2 = (hashCode + (paddings2 == null ? 0 : paddings2.hashCode())) * 31;
            Paddings paddings3 = this.left;
            int hashCode3 = (hashCode2 + (paddings3 == null ? 0 : paddings3.hashCode())) * 31;
            Paddings paddings4 = this.right;
            return hashCode3 + (paddings4 != null ? paddings4.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            Paddings paddings = this.top;
            Paddings paddings2 = this.bottom;
            return b.e(p.b("SpacersDTO(top=", paddings, ", bottom=", paddings2, ", left="), this.left, ", right=", this.right, ")");
        }
    }

    public StickyPromoBadgeDTO(BadgeDTO badgeDTO, TextDTO textDTO, TextDTO textDTO2, List<Image> list, SpacersDTO spacersDTO, String str, CornerRadius cornerRadius, Map<String, TokenizedTrackingInfo> map) {
        this.badge = badgeDTO;
        this.startText = textDTO;
        this.endText = textDTO2;
        this.images = list;
        this.spacers = spacersDTO;
        this.backgroundColor = str;
        this.cornerRadius = cornerRadius;
        this.trackingInfo = map;
    }

    public static /* synthetic */ StickyPromoBadgeDTO copy$default(StickyPromoBadgeDTO stickyPromoBadgeDTO, BadgeDTO badgeDTO, TextDTO textDTO, TextDTO textDTO2, List list, SpacersDTO spacersDTO, String str, CornerRadius cornerRadius, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            badgeDTO = stickyPromoBadgeDTO.badge;
        }
        if ((i11 & 2) != 0) {
            textDTO = stickyPromoBadgeDTO.startText;
        }
        if ((i11 & 4) != 0) {
            textDTO2 = stickyPromoBadgeDTO.endText;
        }
        if ((i11 & 8) != 0) {
            list = stickyPromoBadgeDTO.images;
        }
        if ((i11 & 16) != 0) {
            spacersDTO = stickyPromoBadgeDTO.spacers;
        }
        if ((i11 & 32) != 0) {
            str = stickyPromoBadgeDTO.backgroundColor;
        }
        if ((i11 & 64) != 0) {
            cornerRadius = stickyPromoBadgeDTO.cornerRadius;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            map = stickyPromoBadgeDTO.trackingInfo;
        }
        CornerRadius cornerRadius2 = cornerRadius;
        Map map2 = map;
        SpacersDTO spacersDTO2 = spacersDTO;
        String str2 = str;
        return stickyPromoBadgeDTO.copy(badgeDTO, textDTO, textDTO2, list, spacersDTO2, str2, cornerRadius2, map2);
    }

    /* renamed from: component1, reason: from getter */
    public final BadgeDTO getBadge() {
        return this.badge;
    }

    /* renamed from: component2, reason: from getter */
    public final TextDTO getStartText() {
        return this.startText;
    }

    /* renamed from: component3, reason: from getter */
    public final TextDTO getEndText() {
        return this.endText;
    }

    public final List<Image> component4() {
        return this.images;
    }

    /* renamed from: component5, reason: from getter */
    public final SpacersDTO getSpacers() {
        return this.spacers;
    }

    /* renamed from: component6, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component7, reason: from getter */
    public final CornerRadius getCornerRadius() {
        return this.cornerRadius;
    }

    public final Map<String, TokenizedTrackingInfo> component8() {
        return this.trackingInfo;
    }

    @NotNull
    public final StickyPromoBadgeDTO copy(BadgeDTO badge, TextDTO startText, TextDTO endText, List<Image> images, SpacersDTO spacers, String backgroundColor, CornerRadius cornerRadius, Map<String, TokenizedTrackingInfo> trackingInfo) {
        return new StickyPromoBadgeDTO(badge, startText, endText, images, spacers, backgroundColor, cornerRadius, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StickyPromoBadgeDTO)) {
            return false;
        }
        StickyPromoBadgeDTO stickyPromoBadgeDTO = (StickyPromoBadgeDTO) other;
        return Intrinsics.d(this.badge, stickyPromoBadgeDTO.badge) && Intrinsics.d(this.startText, stickyPromoBadgeDTO.startText) && Intrinsics.d(this.endText, stickyPromoBadgeDTO.endText) && Intrinsics.d(this.images, stickyPromoBadgeDTO.images) && Intrinsics.d(this.spacers, stickyPromoBadgeDTO.spacers) && Intrinsics.d(this.backgroundColor, stickyPromoBadgeDTO.backgroundColor) && this.cornerRadius == stickyPromoBadgeDTO.cornerRadius && Intrinsics.d(this.trackingInfo, stickyPromoBadgeDTO.trackingInfo);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final BadgeDTO getBadge() {
        return this.badge;
    }

    public final CornerRadius getCornerRadius() {
        return this.cornerRadius;
    }

    public final TextDTO getEndText() {
        return this.endText;
    }

    public final List<Image> getImages() {
        return this.images;
    }

    public final SpacersDTO getSpacers() {
        return this.spacers;
    }

    public final TextDTO getStartText() {
        return this.startText;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        BadgeDTO badgeDTO = this.badge;
        int hashCode = (badgeDTO == null ? 0 : badgeDTO.hashCode()) * 31;
        TextDTO textDTO = this.startText;
        int hashCode2 = (hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        TextDTO textDTO2 = this.endText;
        int hashCode3 = (hashCode2 + (textDTO2 == null ? 0 : textDTO2.hashCode())) * 31;
        List<Image> list = this.images;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        SpacersDTO spacersDTO = this.spacers;
        int hashCode5 = (hashCode4 + (spacersDTO == null ? 0 : spacersDTO.hashCode())) * 31;
        String str = this.backgroundColor;
        int hashCode6 = (hashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        CornerRadius cornerRadius = this.cornerRadius;
        int hashCode7 = (hashCode6 + (cornerRadius == null ? 0 : cornerRadius.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode7 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        BadgeDTO badgeDTO = this.badge;
        TextDTO textDTO = this.startText;
        TextDTO textDTO2 = this.endText;
        List<Image> list = this.images;
        SpacersDTO spacersDTO = this.spacers;
        String str = this.backgroundColor;
        CornerRadius cornerRadius = this.cornerRadius;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("StickyPromoBadgeDTO(badge=");
        sb2.append(badgeDTO);
        sb2.append(", startText=");
        sb2.append(textDTO);
        sb2.append(", endText=");
        a.e(sb2, textDTO2, ", images=", list, ", spacers=");
        sb2.append(spacersDTO);
        sb2.append(", backgroundColor=");
        sb2.append(str);
        sb2.append(", cornerRadius=");
        sb2.append(cornerRadius);
        sb2.append(", trackingInfo=");
        sb2.append(map);
        sb2.append(")");
        return sb2.toString();
    }
}
