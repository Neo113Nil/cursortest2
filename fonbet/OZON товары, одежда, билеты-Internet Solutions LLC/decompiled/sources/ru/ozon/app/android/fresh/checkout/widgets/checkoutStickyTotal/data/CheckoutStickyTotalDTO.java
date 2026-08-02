package ru.ozon.app.android.fresh.checkout.widgets.checkoutStickyTotal.data;

import B3.p;
import GR.b;
import Nh.a;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.fresh.checkout.widgets.checkoutProgressBar.data.FreshProgressBarDTO;
import ru.ozon.app.android.fresh.common.widgets.molecules.checkoutButton.data.CheckoutButtonDTO;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u00012Ba\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0017\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003J\u0010\u0010)\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010\u001fJ\u000b\u0010*\u001a\u0004\u0018\u00010\u0011HÆ\u0003Jx\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÆ\u0001¢\u0006\u0002\u0010,J\u0013\u0010-\u001a\u00020\u000f2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u000200HÖ\u0001J\t\u00101\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u001f\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\u000e\u0010\u001fR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"¨\u00063"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/checkoutStickyTotal/data/CheckoutStickyTotalDTO;", "", "button", "Lru/ozon/app/android/fresh/common/widgets/molecules/checkoutButton/data/CheckoutButtonDTO;", "badgeInfo", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "borderColor", "", "backgroundColor", "spacers", "Lru/ozon/app/android/fresh/checkout/widgets/checkoutStickyTotal/data/CheckoutStickyTotalDTO$Spacers;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "isRoundedCorners", "", "progressBar", "Lru/ozon/app/android/fresh/checkout/widgets/checkoutProgressBar/data/FreshProgressBarDTO;", "<init>", "(Lru/ozon/app/android/fresh/common/widgets/molecules/checkoutButton/data/CheckoutButtonDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/fresh/checkout/widgets/checkoutStickyTotal/data/CheckoutStickyTotalDTO$Spacers;Ljava/util/Map;Ljava/lang/Boolean;Lru/ozon/app/android/fresh/checkout/widgets/checkoutProgressBar/data/FreshProgressBarDTO;)V", "getButton", "()Lru/ozon/app/android/fresh/common/widgets/molecules/checkoutButton/data/CheckoutButtonDTO;", "getBadgeInfo", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getBorderColor", "()Ljava/lang/String;", "getBackgroundColor", "getSpacers", "()Lru/ozon/app/android/fresh/checkout/widgets/checkoutStickyTotal/data/CheckoutStickyTotalDTO$Spacers;", "getTrackingInfo", "()Ljava/util/Map;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getProgressBar", "()Lru/ozon/app/android/fresh/checkout/widgets/checkoutProgressBar/data/FreshProgressBarDTO;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Lru/ozon/app/android/fresh/common/widgets/molecules/checkoutButton/data/CheckoutButtonDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/fresh/checkout/widgets/checkoutStickyTotal/data/CheckoutStickyTotalDTO$Spacers;Ljava/util/Map;Ljava/lang/Boolean;Lru/ozon/app/android/fresh/checkout/widgets/checkoutProgressBar/data/FreshProgressBarDTO;)Lru/ozon/app/android/fresh/checkout/widgets/checkoutStickyTotal/data/CheckoutStickyTotalDTO;", "equals", "other", "hashCode", "", "toString", "Spacers", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CheckoutStickyTotalDTO {
    public static final int $stable = 8;
    private final String backgroundColor;
    private final BadgeDTO badgeInfo;
    private final String borderColor;

    @NotNull
    private final CheckoutButtonDTO button;
    private final Boolean isRoundedCorners;
    private final FreshProgressBarDTO progressBar;
    private final Spacers spacers;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/checkoutStickyTotal/data/CheckoutStickyTotalDTO$Spacers;", "", "top", "Lru/ozon/uni/atoms/data/common/Paddings;", "bottom", "left", "right", "<init>", "(Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;)V", "getTop", "()Lru/ozon/uni/atoms/data/common/Paddings;", "getBottom", "getLeft", "getRight", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Spacers {
        public static final int $stable = 0;

        @NotNull
        private final Paddings bottom;

        @NotNull
        private final Paddings left;

        @NotNull
        private final Paddings right;

        @NotNull
        private final Paddings top;

        public Spacers() {
            this(null, null, null, null, 15, null);
        }

        public static /* synthetic */ Spacers copy$default(Spacers spacers, Paddings paddings, Paddings paddings2, Paddings paddings3, Paddings paddings4, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                paddings = spacers.top;
            }
            if ((i11 & 2) != 0) {
                paddings2 = spacers.bottom;
            }
            if ((i11 & 4) != 0) {
                paddings3 = spacers.left;
            }
            if ((i11 & 8) != 0) {
                paddings4 = spacers.right;
            }
            return spacers.copy(paddings, paddings2, paddings3, paddings4);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final Paddings getTop() {
            return this.top;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final Paddings getBottom() {
            return this.bottom;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final Paddings getLeft() {
            return this.left;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final Paddings getRight() {
            return this.right;
        }

        @NotNull
        public final Spacers copy(@NotNull Paddings top, @NotNull Paddings bottom, @NotNull Paddings left, @NotNull Paddings right) {
            Intrinsics.checkNotNullParameter(top, "top");
            Intrinsics.checkNotNullParameter(bottom, "bottom");
            Intrinsics.checkNotNullParameter(left, "left");
            Intrinsics.checkNotNullParameter(right, "right");
            return new Spacers(top, bottom, left, right);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Spacers)) {
                return false;
            }
            Spacers spacers = (Spacers) other;
            return this.top == spacers.top && this.bottom == spacers.bottom && this.left == spacers.left && this.right == spacers.right;
        }

        @NotNull
        public final Paddings getBottom() {
            return this.bottom;
        }

        @NotNull
        public final Paddings getLeft() {
            return this.left;
        }

        @NotNull
        public final Paddings getRight() {
            return this.right;
        }

        @NotNull
        public final Paddings getTop() {
            return this.top;
        }

        public int hashCode() {
            return this.right.hashCode() + b.b(this.left, b.b(this.bottom, this.top.hashCode() * 31, 31), 31);
        }

        @NotNull
        public String toString() {
            Paddings paddings = this.top;
            Paddings paddings2 = this.bottom;
            return b.e(p.b("Spacers(top=", paddings, ", bottom=", paddings2, ", left="), this.left, ", right=", this.right, ")");
        }

        public Spacers(@NotNull Paddings top, @NotNull Paddings bottom, @NotNull Paddings left, @NotNull Paddings right) {
            Intrinsics.checkNotNullParameter(top, "top");
            Intrinsics.checkNotNullParameter(bottom, "bottom");
            Intrinsics.checkNotNullParameter(left, "left");
            Intrinsics.checkNotNullParameter(right, "right");
            this.top = top;
            this.bottom = bottom;
            this.left = left;
            this.right = right;
        }

        public /* synthetic */ Spacers(Paddings paddings, Paddings paddings2, Paddings paddings3, Paddings paddings4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? Paddings.PADDING_200 : paddings, (i11 & 2) != 0 ? Paddings.PADDING_350 : paddings2, (i11 & 4) != 0 ? Paddings.PADDING_300 : paddings3, (i11 & 8) != 0 ? Paddings.PADDING_300 : paddings4);
        }
    }

    public CheckoutStickyTotalDTO(@NotNull CheckoutButtonDTO button, BadgeDTO badgeDTO, String str, String str2, Spacers spacers, Map<String, TokenizedTrackingInfo> map, Boolean bool, FreshProgressBarDTO freshProgressBarDTO) {
        Intrinsics.checkNotNullParameter(button, "button");
        this.button = button;
        this.badgeInfo = badgeDTO;
        this.borderColor = str;
        this.backgroundColor = str2;
        this.spacers = spacers;
        this.trackingInfo = map;
        this.isRoundedCorners = bool;
        this.progressBar = freshProgressBarDTO;
    }

    public static /* synthetic */ CheckoutStickyTotalDTO copy$default(CheckoutStickyTotalDTO checkoutStickyTotalDTO, CheckoutButtonDTO checkoutButtonDTO, BadgeDTO badgeDTO, String str, String str2, Spacers spacers, Map map, Boolean bool, FreshProgressBarDTO freshProgressBarDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            checkoutButtonDTO = checkoutStickyTotalDTO.button;
        }
        if ((i11 & 2) != 0) {
            badgeDTO = checkoutStickyTotalDTO.badgeInfo;
        }
        if ((i11 & 4) != 0) {
            str = checkoutStickyTotalDTO.borderColor;
        }
        if ((i11 & 8) != 0) {
            str2 = checkoutStickyTotalDTO.backgroundColor;
        }
        if ((i11 & 16) != 0) {
            spacers = checkoutStickyTotalDTO.spacers;
        }
        if ((i11 & 32) != 0) {
            map = checkoutStickyTotalDTO.trackingInfo;
        }
        if ((i11 & 64) != 0) {
            bool = checkoutStickyTotalDTO.isRoundedCorners;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            freshProgressBarDTO = checkoutStickyTotalDTO.progressBar;
        }
        Boolean bool2 = bool;
        FreshProgressBarDTO freshProgressBarDTO2 = freshProgressBarDTO;
        Spacers spacers2 = spacers;
        Map map2 = map;
        return checkoutStickyTotalDTO.copy(checkoutButtonDTO, badgeDTO, str, str2, spacers2, map2, bool2, freshProgressBarDTO2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final CheckoutButtonDTO getButton() {
        return this.button;
    }

    /* renamed from: component2, reason: from getter */
    public final BadgeDTO getBadgeInfo() {
        return this.badgeInfo;
    }

    /* renamed from: component3, reason: from getter */
    public final String getBorderColor() {
        return this.borderColor;
    }

    /* renamed from: component4, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component5, reason: from getter */
    public final Spacers getSpacers() {
        return this.spacers;
    }

    public final Map<String, TokenizedTrackingInfo> component6() {
        return this.trackingInfo;
    }

    /* renamed from: component7, reason: from getter */
    public final Boolean getIsRoundedCorners() {
        return this.isRoundedCorners;
    }

    /* renamed from: component8, reason: from getter */
    public final FreshProgressBarDTO getProgressBar() {
        return this.progressBar;
    }

    @NotNull
    public final CheckoutStickyTotalDTO copy(@NotNull CheckoutButtonDTO button, BadgeDTO badgeInfo, String borderColor, String backgroundColor, Spacers spacers, Map<String, TokenizedTrackingInfo> trackingInfo, Boolean isRoundedCorners, FreshProgressBarDTO progressBar) {
        Intrinsics.checkNotNullParameter(button, "button");
        return new CheckoutStickyTotalDTO(button, badgeInfo, borderColor, backgroundColor, spacers, trackingInfo, isRoundedCorners, progressBar);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CheckoutStickyTotalDTO)) {
            return false;
        }
        CheckoutStickyTotalDTO checkoutStickyTotalDTO = (CheckoutStickyTotalDTO) other;
        return Intrinsics.d(this.button, checkoutStickyTotalDTO.button) && Intrinsics.d(this.badgeInfo, checkoutStickyTotalDTO.badgeInfo) && Intrinsics.d(this.borderColor, checkoutStickyTotalDTO.borderColor) && Intrinsics.d(this.backgroundColor, checkoutStickyTotalDTO.backgroundColor) && Intrinsics.d(this.spacers, checkoutStickyTotalDTO.spacers) && Intrinsics.d(this.trackingInfo, checkoutStickyTotalDTO.trackingInfo) && Intrinsics.d(this.isRoundedCorners, checkoutStickyTotalDTO.isRoundedCorners) && Intrinsics.d(this.progressBar, checkoutStickyTotalDTO.progressBar);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final BadgeDTO getBadgeInfo() {
        return this.badgeInfo;
    }

    public final String getBorderColor() {
        return this.borderColor;
    }

    @NotNull
    public final CheckoutButtonDTO getButton() {
        return this.button;
    }

    public final FreshProgressBarDTO getProgressBar() {
        return this.progressBar;
    }

    public final Spacers getSpacers() {
        return this.spacers;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = this.button.hashCode() * 31;
        BadgeDTO badgeDTO = this.badgeInfo;
        int hashCode2 = (hashCode + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31;
        String str = this.borderColor;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.backgroundColor;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Spacers spacers = this.spacers;
        int hashCode5 = (hashCode4 + (spacers == null ? 0 : spacers.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode6 = (hashCode5 + (map == null ? 0 : map.hashCode())) * 31;
        Boolean bool = this.isRoundedCorners;
        int hashCode7 = (hashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        FreshProgressBarDTO freshProgressBarDTO = this.progressBar;
        return hashCode7 + (freshProgressBarDTO != null ? freshProgressBarDTO.hashCode() : 0);
    }

    public final Boolean isRoundedCorners() {
        return this.isRoundedCorners;
    }

    @NotNull
    public String toString() {
        CheckoutButtonDTO checkoutButtonDTO = this.button;
        BadgeDTO badgeDTO = this.badgeInfo;
        String str = this.borderColor;
        String str2 = this.backgroundColor;
        Spacers spacers = this.spacers;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        Boolean bool = this.isRoundedCorners;
        FreshProgressBarDTO freshProgressBarDTO = this.progressBar;
        StringBuilder sb2 = new StringBuilder("CheckoutStickyTotalDTO(button=");
        sb2.append(checkoutButtonDTO);
        sb2.append(", badgeInfo=");
        sb2.append(badgeDTO);
        sb2.append(", borderColor=");
        a.h(sb2, str, ", backgroundColor=", str2, ", spacers=");
        sb2.append(spacers);
        sb2.append(", trackingInfo=");
        sb2.append(map);
        sb2.append(", isRoundedCorners=");
        sb2.append(bool);
        sb2.append(", progressBar=");
        sb2.append(freshProgressBarDTO);
        sb2.append(")");
        return sb2.toString();
    }
}
