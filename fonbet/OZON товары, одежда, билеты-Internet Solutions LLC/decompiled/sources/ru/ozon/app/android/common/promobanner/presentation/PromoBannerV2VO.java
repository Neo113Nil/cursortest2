package ru.ozon.app.android.common.promobanner.presentation;

import Ak.C2436a;
import Am.C2438a;
import B0.C2454a;
import B90.C2619v;
import G.g;
import J0.P;
import Kk.C3532b;
import WZ.t;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b&\b\u0086\b\u0018\u0000 K2\u00060\u0001j\u0002`\u0002:\u0002KLB©\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0006\u0010\u0015\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0011\u0012\u000e\u0010\u0019\u001a\n\u0018\u00010\u0017j\u0004\u0018\u0001`\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001e\u0010\u001fJÒ\u0001\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00112\b\b\u0002\u0010\u0015\u001a\u00020\u00052\b\b\u0002\u0010\u0016\u001a\u00020\u00112\u0010\b\u0002\u0010\u0019\u001a\n\u0018\u00010\u0017j\u0004\u0018\u0001`\u00182\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020\u00112\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b)\u0010*R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010.\u001a\u0004\b/\u0010#R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010.\u001a\u0004\b0\u0010#R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b1\u0010#R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010.\u001a\u0004\b2\u0010#R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00103\u001a\u0004\b4\u00105R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u00106\u001a\u0004\b7\u00108R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u00109\u001a\u0004\b:\u0010;R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u00109\u001a\u0004\b<\u0010;R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010=\u001a\u0004\b\u0012\u0010>R\u0017\u0010\u0013\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u0010=\u001a\u0004\b?\u0010>R\u0017\u0010\u0014\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0014\u0010=\u001a\u0004\b@\u0010>R\u0017\u0010\u0015\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010.\u001a\u0004\bA\u0010#R\u0017\u0010\u0016\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0016\u0010=\u001a\u0004\b\u0016\u0010>R\u001f\u0010\u0019\u001a\n\u0018\u00010\u0017j\u0004\u0018\u0001`\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010B\u001a\u0004\bC\u0010DR\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010E\u001a\u0004\bF\u0010GR\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010H\u001a\u0004\bI\u0010J¨\u0006M"}, d2 = {"Lru/ozon/app/android/common/promobanner/presentation/PromoBannerV2VO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "theme", "image", "backgroundColor", "outerBackgroundColor", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "iconButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "actionButton", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "titleAtom", "description", "", "isRounded", "showShadow", "hideParandja", "actionButtonPosition", "isClosed", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "advBadge", "Lru/ozon/app/android/common/promobanner/presentation/PromoBannerV2VO$MarginsVO;", "margins", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;ZZZLjava/lang/String;ZLWZ/t;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/app/android/common/promobanner/presentation/PromoBannerV2VO$MarginsVO;)V", "copy", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;ZZZLjava/lang/String;ZLWZ/t;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/app/android/common/promobanner/presentation/PromoBannerV2VO$MarginsVO;)Lru/ozon/app/android/common/promobanner/presentation/PromoBannerV2VO;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getTheme", "getImage", "getBackgroundColor", "getOuterBackgroundColor", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "getIconButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "getActionButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTitleAtom", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getDescription", "Z", "()Z", "getShowShadow", "getHideParandja", "getActionButtonPosition", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getAdvBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "Lru/ozon/app/android/common/promobanner/presentation/PromoBannerV2VO$MarginsVO;", "getMargins", "()Lru/ozon/app/android/common/promobanner/presentation/PromoBannerV2VO$MarginsVO;", "Companion", "MarginsVO", "promo-banner_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class PromoBannerV2VO implements c {
    private final ButtonV3Atom.SmallButton actionButton;

    @NotNull
    private final String actionButtonPosition;
    private final BadgeDTO advBadge;
    private final String backgroundColor;
    private final TextAtom description;
    private final boolean hideParandja;
    private final ButtonV3Atom.SmallIconButton iconButton;
    private final long id;
    private final String image;
    private final boolean isClosed;
    private final boolean isRounded;
    private final MarginsVO margins;
    private final String outerBackgroundColor;
    private final boolean showShadow;

    @NotNull
    private final String theme;

    @NotNull
    private final TextAtom titleAtom;
    private final t tokenizedEvent;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0014\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0015\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0016\u0010\r¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/common/promobanner/presentation/PromoBannerV2VO$MarginsVO;", "", "", "left", "top", "right", "bottom", "<init>", "(IIII)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getLeft", "getTop", "getRight", "getBottom", "promo-banner_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class MarginsVO {
        private final int bottom;
        private final int left;
        private final int right;
        private final int top;

        public MarginsVO(int i11, int i12, int i13, int i14) {
            this.left = i11;
            this.top = i12;
            this.right = i13;
            this.bottom = i14;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MarginsVO)) {
                return false;
            }
            MarginsVO marginsVO = (MarginsVO) other;
            return this.left == marginsVO.left && this.top == marginsVO.top && this.right == marginsVO.right && this.bottom == marginsVO.bottom;
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
            return P.a(this.right, this.bottom, ", bottom=", ")", C2438a.a("MarginsVO(left=", this.left, ", top=", ", right=", this.top));
        }
    }

    public PromoBannerV2VO(long j11, @NotNull String theme, String str, String str2, String str3, ButtonV3Atom.SmallIconButton smallIconButton, ButtonV3Atom.SmallButton smallButton, @NotNull TextAtom titleAtom, TextAtom textAtom, boolean z11, boolean z12, boolean z13, @NotNull String actionButtonPosition, boolean z14, t tVar, BadgeDTO badgeDTO, MarginsVO marginsVO) {
        Intrinsics.checkNotNullParameter(theme, "theme");
        Intrinsics.checkNotNullParameter(titleAtom, "titleAtom");
        Intrinsics.checkNotNullParameter(actionButtonPosition, "actionButtonPosition");
        this.id = j11;
        this.theme = theme;
        this.image = str;
        this.backgroundColor = str2;
        this.outerBackgroundColor = str3;
        this.iconButton = smallIconButton;
        this.actionButton = smallButton;
        this.titleAtom = titleAtom;
        this.description = textAtom;
        this.isRounded = z11;
        this.showShadow = z12;
        this.hideParandja = z13;
        this.actionButtonPosition = actionButtonPosition;
        this.isClosed = z14;
        this.tokenizedEvent = tVar;
        this.advBadge = badgeDTO;
        this.margins = marginsVO;
    }

    public static /* synthetic */ PromoBannerV2VO copy$default(PromoBannerV2VO promoBannerV2VO, long j11, String str, String str2, String str3, String str4, ButtonV3Atom.SmallIconButton smallIconButton, ButtonV3Atom.SmallButton smallButton, TextAtom textAtom, TextAtom textAtom2, boolean z11, boolean z12, boolean z13, String str5, boolean z14, t tVar, BadgeDTO badgeDTO, MarginsVO marginsVO, int i11, Object obj) {
        MarginsVO marginsVO2;
        BadgeDTO badgeDTO2;
        long j12 = (i11 & 1) != 0 ? promoBannerV2VO.id : j11;
        String str6 = (i11 & 2) != 0 ? promoBannerV2VO.theme : str;
        String str7 = (i11 & 4) != 0 ? promoBannerV2VO.image : str2;
        String str8 = (i11 & 8) != 0 ? promoBannerV2VO.backgroundColor : str3;
        String str9 = (i11 & 16) != 0 ? promoBannerV2VO.outerBackgroundColor : str4;
        ButtonV3Atom.SmallIconButton smallIconButton2 = (i11 & 32) != 0 ? promoBannerV2VO.iconButton : smallIconButton;
        ButtonV3Atom.SmallButton smallButton2 = (i11 & 64) != 0 ? promoBannerV2VO.actionButton : smallButton;
        TextAtom textAtom3 = (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? promoBannerV2VO.titleAtom : textAtom;
        TextAtom textAtom4 = (i11 & 256) != 0 ? promoBannerV2VO.description : textAtom2;
        boolean z15 = (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? promoBannerV2VO.isRounded : z11;
        boolean z16 = (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? promoBannerV2VO.showShadow : z12;
        boolean z17 = (i11 & 2048) != 0 ? promoBannerV2VO.hideParandja : z13;
        String str10 = (i11 & 4096) != 0 ? promoBannerV2VO.actionButtonPosition : str5;
        long j13 = j12;
        boolean z18 = (i11 & 8192) != 0 ? promoBannerV2VO.isClosed : z14;
        t tVar2 = (i11 & 16384) != 0 ? promoBannerV2VO.tokenizedEvent : tVar;
        BadgeDTO badgeDTO3 = (i11 & 32768) != 0 ? promoBannerV2VO.advBadge : badgeDTO;
        if ((i11 & 65536) != 0) {
            badgeDTO2 = badgeDTO3;
            marginsVO2 = promoBannerV2VO.margins;
        } else {
            marginsVO2 = marginsVO;
            badgeDTO2 = badgeDTO3;
        }
        return promoBannerV2VO.copy(j13, str6, str7, str8, str9, smallIconButton2, smallButton2, textAtom3, textAtom4, z15, z16, z17, str10, z18, tVar2, badgeDTO2, marginsVO2);
    }

    @NotNull
    public final PromoBannerV2VO copy(long id2, @NotNull String theme, String image, String backgroundColor, String outerBackgroundColor, ButtonV3Atom.SmallIconButton iconButton, ButtonV3Atom.SmallButton actionButton, @NotNull TextAtom titleAtom, TextAtom description, boolean isRounded, boolean showShadow, boolean hideParandja, @NotNull String actionButtonPosition, boolean isClosed, t tokenizedEvent, BadgeDTO advBadge, MarginsVO margins) {
        Intrinsics.checkNotNullParameter(theme, "theme");
        Intrinsics.checkNotNullParameter(titleAtom, "titleAtom");
        Intrinsics.checkNotNullParameter(actionButtonPosition, "actionButtonPosition");
        return new PromoBannerV2VO(id2, theme, image, backgroundColor, outerBackgroundColor, iconButton, actionButton, titleAtom, description, isRounded, showShadow, hideParandja, actionButtonPosition, isClosed, tokenizedEvent, advBadge, margins);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PromoBannerV2VO)) {
            return false;
        }
        PromoBannerV2VO promoBannerV2VO = (PromoBannerV2VO) other;
        return this.id == promoBannerV2VO.id && Intrinsics.d(this.theme, promoBannerV2VO.theme) && Intrinsics.d(this.image, promoBannerV2VO.image) && Intrinsics.d(this.backgroundColor, promoBannerV2VO.backgroundColor) && Intrinsics.d(this.outerBackgroundColor, promoBannerV2VO.outerBackgroundColor) && Intrinsics.d(this.iconButton, promoBannerV2VO.iconButton) && Intrinsics.d(this.actionButton, promoBannerV2VO.actionButton) && Intrinsics.d(this.titleAtom, promoBannerV2VO.titleAtom) && Intrinsics.d(this.description, promoBannerV2VO.description) && this.isRounded == promoBannerV2VO.isRounded && this.showShadow == promoBannerV2VO.showShadow && this.hideParandja == promoBannerV2VO.hideParandja && Intrinsics.d(this.actionButtonPosition, promoBannerV2VO.actionButtonPosition) && this.isClosed == promoBannerV2VO.isClosed && Intrinsics.d(this.tokenizedEvent, promoBannerV2VO.tokenizedEvent) && Intrinsics.d(this.advBadge, promoBannerV2VO.advBadge) && Intrinsics.d(this.margins, promoBannerV2VO.margins);
    }

    public final ButtonV3Atom.SmallButton getActionButton() {
        return this.actionButton;
    }

    @NotNull
    public final String getActionButtonPosition() {
        return this.actionButtonPosition;
    }

    public final BadgeDTO getAdvBadge() {
        return this.advBadge;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final TextAtom getDescription() {
        return this.description;
    }

    public final boolean getHideParandja() {
        return this.hideParandja;
    }

    public final ButtonV3Atom.SmallIconButton getIconButton() {
        return this.iconButton;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final String getImage() {
        return this.image;
    }

    public final MarginsVO getMargins() {
        return this.margins;
    }

    public final String getOuterBackgroundColor() {
        return this.outerBackgroundColor;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final boolean getShowShadow() {
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

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = g.a(Long.hashCode(this.id) * 31, 31, this.theme);
        String str = this.image;
        int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.backgroundColor;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.outerBackgroundColor;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        ButtonV3Atom.SmallIconButton smallIconButton = this.iconButton;
        int hashCode4 = (hashCode3 + (smallIconButton == null ? 0 : smallIconButton.hashCode())) * 31;
        ButtonV3Atom.SmallButton smallButton = this.actionButton;
        int b11 = C2619v.b((hashCode4 + (smallButton == null ? 0 : smallButton.hashCode())) * 31, 31, this.titleAtom);
        TextAtom textAtom = this.description;
        int a12 = C3532b.a(g.a(C3532b.a(C3532b.a(C3532b.a((b11 + (textAtom == null ? 0 : textAtom.hashCode())) * 31, 31, this.isRounded), 31, this.showShadow), 31, this.hideParandja), 31, this.actionButtonPosition), 31, this.isClosed);
        t tVar = this.tokenizedEvent;
        int hashCode5 = (a12 + (tVar == null ? 0 : tVar.hashCode())) * 31;
        BadgeDTO badgeDTO = this.advBadge;
        int hashCode6 = (hashCode5 + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31;
        MarginsVO marginsVO = this.margins;
        return hashCode6 + (marginsVO != null ? marginsVO.hashCode() : 0);
    }

    /* renamed from: isClosed, reason: from getter */
    public final boolean getIsClosed() {
        return this.isClosed;
    }

    /* renamed from: isRounded, reason: from getter */
    public final boolean getIsRounded() {
        return this.isRounded;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.theme;
        String str2 = this.image;
        String str3 = this.backgroundColor;
        String str4 = this.outerBackgroundColor;
        ButtonV3Atom.SmallIconButton smallIconButton = this.iconButton;
        ButtonV3Atom.SmallButton smallButton = this.actionButton;
        TextAtom textAtom = this.titleAtom;
        TextAtom textAtom2 = this.description;
        boolean z11 = this.isRounded;
        boolean z12 = this.showShadow;
        boolean z13 = this.hideParandja;
        String str5 = this.actionButtonPosition;
        boolean z14 = this.isClosed;
        t tVar = this.tokenizedEvent;
        BadgeDTO badgeDTO = this.advBadge;
        MarginsVO marginsVO = this.margins;
        StringBuilder c11 = C2436a.c(j11, "PromoBannerV2VO(id=", ", theme=", str);
        Nh.a.h(c11, ", image=", str2, ", backgroundColor=", str3);
        c11.append(", outerBackgroundColor=");
        c11.append(str4);
        c11.append(", iconButton=");
        c11.append(smallIconButton);
        c11.append(", actionButton=");
        c11.append(smallButton);
        c11.append(", titleAtom=");
        c11.append(textAtom);
        c11.append(", description=");
        c11.append(textAtom2);
        c11.append(", isRounded=");
        c11.append(z11);
        C2436a.e(", showShadow=", ", hideParandja=", c11, z12, z13);
        D40.a.g(", actionButtonPosition=", str5, ", isClosed=", c11, z14);
        c11.append(", tokenizedEvent=");
        c11.append(tVar);
        c11.append(", advBadge=");
        c11.append(badgeDTO);
        c11.append(", margins=");
        c11.append(marginsVO);
        c11.append(")");
        return c11.toString();
    }

    public /* synthetic */ PromoBannerV2VO(long j11, String str, String str2, String str3, String str4, ButtonV3Atom.SmallIconButton smallIconButton, ButtonV3Atom.SmallButton smallButton, TextAtom textAtom, TextAtom textAtom2, boolean z11, boolean z12, boolean z13, String str5, boolean z14, t tVar, BadgeDTO badgeDTO, MarginsVO marginsVO, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, str, str2, str3, str4, smallIconButton, smallButton, textAtom, textAtom2, z11, z12, z13, str5, (i11 & 8192) != 0 ? false : z14, tVar, badgeDTO, marginsVO);
    }
}
