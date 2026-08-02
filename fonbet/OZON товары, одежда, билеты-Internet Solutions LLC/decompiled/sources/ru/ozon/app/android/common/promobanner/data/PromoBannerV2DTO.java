package ru.ozon.app.android.common.promobanner.data;

import Am.C2438a;
import B0.C2454a;
import B90.C2619v;
import D3.h;
import HY.b;
import J0.P;
import N3.C3660k;
import Nh.a;
import Ve.C4636t5;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b-\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u0000 I2\u00020\u0001:\u0002IJB¥\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\t\u00103\u001a\u00020\u0003HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u00109\u001a\u00020\fHÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\fHÆ\u0003J\u0010\u0010;\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010(J\u0010\u0010<\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010(J\u0010\u0010=\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010(J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010?\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0019HÆ\u0003JÊ\u0001\u0010B\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÆ\u0001¢\u0006\u0002\u0010CJ\u0013\u0010D\u001a\u00020\u000f2\b\u0010E\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010F\u001a\u00020GHÖ\u0001J\t\u0010H\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001dR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001dR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b'\u0010&R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010)\u001a\u0004\b\u000e\u0010(R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010)\u001a\u0004\b*\u0010(R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010)\u001a\u0004\b+\u0010(R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001dR\u001f\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\b1\u00102¨\u0006K"}, d2 = {"Lru/ozon/app/android/common/promobanner/data/PromoBannerV2DTO;", "", "theme", "", "image", "backgroundColor", "outerBackgroundColor", "iconButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "actionButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "titleAtom", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "description", "isRounded", "", "showShadow", "hideParandja", "actionButtonPosition", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "adBadge", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "margins", "Lru/ozon/app/android/common/promobanner/data/PromoBannerV2DTO$MarginsDTO;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/Map;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/app/android/common/promobanner/data/PromoBannerV2DTO$MarginsDTO;)V", "getTheme", "()Ljava/lang/String;", "getImage", "getBackgroundColor", "getOuterBackgroundColor", "getIconButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "getActionButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "getTitleAtom", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getDescription", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getShowShadow", "getHideParandja", "getActionButtonPosition", "getTrackingInfo", "()Ljava/util/Map;", "getAdBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getMargins", "()Lru/ozon/app/android/common/promobanner/data/PromoBannerV2DTO$MarginsDTO;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/Map;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/app/android/common/promobanner/data/PromoBannerV2DTO$MarginsDTO;)Lru/ozon/app/android/common/promobanner/data/PromoBannerV2DTO;", "equals", "other", "hashCode", "", "toString", "Companion", "MarginsDTO", "promo-banner_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class PromoBannerV2DTO {
    private static final int DEFAULT_MARGIN_PX = 16;
    private final ButtonV3Atom.SmallButton actionButton;
    private final String actionButtonPosition;
    private final BadgeDTO adBadge;
    private final String backgroundColor;
    private final TextAtom description;
    private final Boolean hideParandja;
    private final ButtonV3Atom.SmallIconButton iconButton;
    private final String image;
    private final Boolean isRounded;
    private final MarginsDTO margins;
    private final String outerBackgroundColor;
    private final Boolean showShadow;

    @NotNull
    private final String theme;

    @NotNull
    private final TextAtom titleAtom;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/common/promobanner/data/PromoBannerV2DTO$MarginsDTO;", "", "left", "", "top", "right", "bottom", "<init>", "(IIII)V", "getLeft", "()I", "getTop", "getRight", "getBottom", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "promo-banner_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class MarginsDTO {
        private final int bottom;
        private final int left;
        private final int right;
        private final int top;

        public MarginsDTO() {
            this(0, 0, 0, 0, 15, null);
        }

        public static /* synthetic */ MarginsDTO copy$default(MarginsDTO marginsDTO, int i11, int i12, int i13, int i14, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                i11 = marginsDTO.left;
            }
            if ((i15 & 2) != 0) {
                i12 = marginsDTO.top;
            }
            if ((i15 & 4) != 0) {
                i13 = marginsDTO.right;
            }
            if ((i15 & 8) != 0) {
                i14 = marginsDTO.bottom;
            }
            return marginsDTO.copy(i11, i12, i13, i14);
        }

        /* renamed from: component1, reason: from getter */
        public final int getLeft() {
            return this.left;
        }

        /* renamed from: component2, reason: from getter */
        public final int getTop() {
            return this.top;
        }

        /* renamed from: component3, reason: from getter */
        public final int getRight() {
            return this.right;
        }

        /* renamed from: component4, reason: from getter */
        public final int getBottom() {
            return this.bottom;
        }

        @NotNull
        public final MarginsDTO copy(int left, int top, int right, int bottom) {
            return new MarginsDTO(left, top, right, bottom);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MarginsDTO)) {
                return false;
            }
            MarginsDTO marginsDTO = (MarginsDTO) other;
            return this.left == marginsDTO.left && this.top == marginsDTO.top && this.right == marginsDTO.right && this.bottom == marginsDTO.bottom;
        }

        public final int getBottom() {
            return this.bottom;
        }

        public final int getLeft() {
            return this.left;
        }

        public final int getRight() {
            return this.right;
        }

        public final int getTop() {
            return this.top;
        }

        public int hashCode() {
            return Integer.hashCode(this.bottom) + C2454a.a(this.right, C2454a.a(this.top, Integer.hashCode(this.left) * 31, 31), 31);
        }

        @NotNull
        public String toString() {
            return P.a(this.right, this.bottom, ", bottom=", ")", C2438a.a("MarginsDTO(left=", this.left, ", top=", ", right=", this.top));
        }

        public MarginsDTO(int i11, int i12, int i13, int i14) {
            this.left = i11;
            this.top = i12;
            this.right = i13;
            this.bottom = i14;
        }

        public /* synthetic */ MarginsDTO(int i11, int i12, int i13, int i14, int i15, DefaultConstructorMarker defaultConstructorMarker) {
            this((i15 & 1) != 0 ? 16 : i11, (i15 & 2) != 0 ? 16 : i12, (i15 & 4) != 0 ? 16 : i13, (i15 & 8) != 0 ? 16 : i14);
        }
    }

    public PromoBannerV2DTO(@NotNull String theme, String str, String str2, String str3, ButtonV3Atom.SmallIconButton smallIconButton, ButtonV3Atom.SmallButton smallButton, @NotNull TextAtom titleAtom, TextAtom textAtom, Boolean bool, Boolean bool2, Boolean bool3, String str4, Map<String, TokenizedTrackingInfo> map, BadgeDTO badgeDTO, MarginsDTO marginsDTO) {
        Intrinsics.checkNotNullParameter(theme, "theme");
        Intrinsics.checkNotNullParameter(titleAtom, "titleAtom");
        this.theme = theme;
        this.image = str;
        this.backgroundColor = str2;
        this.outerBackgroundColor = str3;
        this.iconButton = smallIconButton;
        this.actionButton = smallButton;
        this.titleAtom = titleAtom;
        this.description = textAtom;
        this.isRounded = bool;
        this.showShadow = bool2;
        this.hideParandja = bool3;
        this.actionButtonPosition = str4;
        this.trackingInfo = map;
        this.adBadge = badgeDTO;
        this.margins = marginsDTO;
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getTheme() {
        return this.theme;
    }

    /* renamed from: component10, reason: from getter */
    public final Boolean getShowShadow() {
        return this.showShadow;
    }

    /* renamed from: component11, reason: from getter */
    public final Boolean getHideParandja() {
        return this.hideParandja;
    }

    /* renamed from: component12, reason: from getter */
    public final String getActionButtonPosition() {
        return this.actionButtonPosition;
    }

    public final Map<String, TokenizedTrackingInfo> component13() {
        return this.trackingInfo;
    }

    /* renamed from: component14, reason: from getter */
    public final BadgeDTO getAdBadge() {
        return this.adBadge;
    }

    /* renamed from: component15, reason: from getter */
    public final MarginsDTO getMargins() {
        return this.margins;
    }

    /* renamed from: component2, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    /* renamed from: component3, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component4, reason: from getter */
    public final String getOuterBackgroundColor() {
        return this.outerBackgroundColor;
    }

    /* renamed from: component5, reason: from getter */
    public final ButtonV3Atom.SmallIconButton getIconButton() {
        return this.iconButton;
    }

    /* renamed from: component6, reason: from getter */
    public final ButtonV3Atom.SmallButton getActionButton() {
        return this.actionButton;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final TextAtom getTitleAtom() {
        return this.titleAtom;
    }

    /* renamed from: component8, reason: from getter */
    public final TextAtom getDescription() {
        return this.description;
    }

    /* renamed from: component9, reason: from getter */
    public final Boolean getIsRounded() {
        return this.isRounded;
    }

    @NotNull
    public final PromoBannerV2DTO copy(@NotNull String theme, String image, String backgroundColor, String outerBackgroundColor, ButtonV3Atom.SmallIconButton iconButton, ButtonV3Atom.SmallButton actionButton, @NotNull TextAtom titleAtom, TextAtom description, Boolean isRounded, Boolean showShadow, Boolean hideParandja, String actionButtonPosition, Map<String, TokenizedTrackingInfo> trackingInfo, BadgeDTO adBadge, MarginsDTO margins) {
        Intrinsics.checkNotNullParameter(theme, "theme");
        Intrinsics.checkNotNullParameter(titleAtom, "titleAtom");
        return new PromoBannerV2DTO(theme, image, backgroundColor, outerBackgroundColor, iconButton, actionButton, titleAtom, description, isRounded, showShadow, hideParandja, actionButtonPosition, trackingInfo, adBadge, margins);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PromoBannerV2DTO)) {
            return false;
        }
        PromoBannerV2DTO promoBannerV2DTO = (PromoBannerV2DTO) other;
        return Intrinsics.d(this.theme, promoBannerV2DTO.theme) && Intrinsics.d(this.image, promoBannerV2DTO.image) && Intrinsics.d(this.backgroundColor, promoBannerV2DTO.backgroundColor) && Intrinsics.d(this.outerBackgroundColor, promoBannerV2DTO.outerBackgroundColor) && Intrinsics.d(this.iconButton, promoBannerV2DTO.iconButton) && Intrinsics.d(this.actionButton, promoBannerV2DTO.actionButton) && Intrinsics.d(this.titleAtom, promoBannerV2DTO.titleAtom) && Intrinsics.d(this.description, promoBannerV2DTO.description) && Intrinsics.d(this.isRounded, promoBannerV2DTO.isRounded) && Intrinsics.d(this.showShadow, promoBannerV2DTO.showShadow) && Intrinsics.d(this.hideParandja, promoBannerV2DTO.hideParandja) && Intrinsics.d(this.actionButtonPosition, promoBannerV2DTO.actionButtonPosition) && Intrinsics.d(this.trackingInfo, promoBannerV2DTO.trackingInfo) && Intrinsics.d(this.adBadge, promoBannerV2DTO.adBadge) && Intrinsics.d(this.margins, promoBannerV2DTO.margins);
    }

    public final ButtonV3Atom.SmallButton getActionButton() {
        return this.actionButton;
    }

    public final String getActionButtonPosition() {
        return this.actionButtonPosition;
    }

    public final BadgeDTO getAdBadge() {
        return this.adBadge;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final TextAtom getDescription() {
        return this.description;
    }

    public final Boolean getHideParandja() {
        return this.hideParandja;
    }

    public final ButtonV3Atom.SmallIconButton getIconButton() {
        return this.iconButton;
    }

    public final String getImage() {
        return this.image;
    }

    public final MarginsDTO getMargins() {
        return this.margins;
    }

    public final String getOuterBackgroundColor() {
        return this.outerBackgroundColor;
    }

    public final Boolean getShowShadow() {
        return this.showShadow;
    }

    @NotNull
    public final String getTheme() {
        return this.theme;
    }

    @NotNull
    public final TextAtom getTitleAtom() {
        return this.titleAtom;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = this.theme.hashCode() * 31;
        String str = this.image;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.backgroundColor;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.outerBackgroundColor;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        ButtonV3Atom.SmallIconButton smallIconButton = this.iconButton;
        int hashCode5 = (hashCode4 + (smallIconButton == null ? 0 : smallIconButton.hashCode())) * 31;
        ButtonV3Atom.SmallButton smallButton = this.actionButton;
        int b11 = C2619v.b((hashCode5 + (smallButton == null ? 0 : smallButton.hashCode())) * 31, 31, this.titleAtom);
        TextAtom textAtom = this.description;
        int hashCode6 = (b11 + (textAtom == null ? 0 : textAtom.hashCode())) * 31;
        Boolean bool = this.isRounded;
        int hashCode7 = (hashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.showShadow;
        int hashCode8 = (hashCode7 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.hideParandja;
        int hashCode9 = (hashCode8 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str4 = this.actionButtonPosition;
        int hashCode10 = (hashCode9 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode11 = (hashCode10 + (map == null ? 0 : map.hashCode())) * 31;
        BadgeDTO badgeDTO = this.adBadge;
        int hashCode12 = (hashCode11 + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31;
        MarginsDTO marginsDTO = this.margins;
        return hashCode12 + (marginsDTO != null ? marginsDTO.hashCode() : 0);
    }

    public final Boolean isRounded() {
        return this.isRounded;
    }

    @NotNull
    public String toString() {
        String str = this.theme;
        String str2 = this.image;
        String str3 = this.backgroundColor;
        String str4 = this.outerBackgroundColor;
        ButtonV3Atom.SmallIconButton smallIconButton = this.iconButton;
        ButtonV3Atom.SmallButton smallButton = this.actionButton;
        TextAtom textAtom = this.titleAtom;
        TextAtom textAtom2 = this.description;
        Boolean bool = this.isRounded;
        Boolean bool2 = this.showShadow;
        Boolean bool3 = this.hideParandja;
        String str5 = this.actionButtonPosition;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        BadgeDTO badgeDTO = this.adBadge;
        MarginsDTO marginsDTO = this.margins;
        StringBuilder d11 = C3660k.d("PromoBannerV2DTO(theme=", str, ", image=", str2, ", backgroundColor=");
        a.h(d11, str3, ", outerBackgroundColor=", str4, ", iconButton=");
        d11.append(smallIconButton);
        d11.append(", actionButton=");
        d11.append(smallButton);
        d11.append(", titleAtom=");
        C4636t5.c(", description=", ", isRounded=", d11, textAtom, textAtom2);
        h.h(d11, bool, ", showShadow=", bool2, ", hideParandja=");
        b.c(bool3, ", actionButtonPosition=", str5, ", trackingInfo=", d11);
        d11.append(map);
        d11.append(", adBadge=");
        d11.append(badgeDTO);
        d11.append(", margins=");
        d11.append(marginsDTO);
        d11.append(")");
        return d11.toString();
    }
}
