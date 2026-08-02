package ru.ozon.app.android.pdp.widgets.cartButtonV5.presentation;

import Kk.C3532b;
import Lh.a;
import Pk0.f;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0081\b\u0018\u00002\u00020\u0001B\u009d\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J¦\u0001\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001d\u001a\u00020\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b\u0003\u0010 R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b!\u0010 R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b\"\u0010 R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b\u0006\u0010 R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b\u0007\u0010 R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b\b\u0010 R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b\t\u0010 R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u001f\u001a\u0004\b\n\u0010 R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001f\u001a\u0004\b\u000b\u0010 R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u001f\u001a\u0004\b\f\u0010 R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u001f\u001a\u0004\b\r\u0010 R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001f\u001a\u0004\b\u000e\u0010 R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001f\u001a\u0004\b\u000f\u0010 R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001f\u001a\u0004\b\u0010\u0010 R\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001f\u001a\u0004\b\u0011\u0010 ¨\u0006#"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonV5Configuration;", "", "", "isSingleButton", "hasFirstBadge", "hasSecondBadge", "isIcon", "isSecondIcon", "isSubTitle", "isAsync", "isFirstInCart", "isSecondInCart", "isStickyTransparent", "isRelatedBottomSheet", "isSubscribeButton", "isTeenMode", "isMatrixGradient", "isInModal", "<init>", "(ZZZZZZZZZZZZZZZ)V", "copy", "(ZZZZZZZZZZZZZZZ)Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonV5Configuration;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "()Z", "getHasFirstBadge", "getHasSecondBadge", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class CartButtonV5Configuration {
    private final boolean hasFirstBadge;
    private final boolean hasSecondBadge;
    private final boolean isAsync;
    private final boolean isFirstInCart;
    private final boolean isIcon;
    private final boolean isInModal;
    private final boolean isMatrixGradient;
    private final boolean isRelatedBottomSheet;
    private final boolean isSecondIcon;
    private final boolean isSecondInCart;
    private final boolean isSingleButton;
    private final boolean isStickyTransparent;
    private final boolean isSubTitle;
    private final boolean isSubscribeButton;
    private final boolean isTeenMode;

    public CartButtonV5Configuration() {
        this(false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, 32767, null);
    }

    @NotNull
    public final CartButtonV5Configuration copy(boolean isSingleButton, boolean hasFirstBadge, boolean hasSecondBadge, boolean isIcon, boolean isSecondIcon, boolean isSubTitle, boolean isAsync, boolean isFirstInCart, boolean isSecondInCart, boolean isStickyTransparent, boolean isRelatedBottomSheet, boolean isSubscribeButton, boolean isTeenMode, boolean isMatrixGradient, boolean isInModal) {
        return new CartButtonV5Configuration(isSingleButton, hasFirstBadge, hasSecondBadge, isIcon, isSecondIcon, isSubTitle, isAsync, isFirstInCart, isSecondInCart, isStickyTransparent, isRelatedBottomSheet, isSubscribeButton, isTeenMode, isMatrixGradient, isInModal);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CartButtonV5Configuration)) {
            return false;
        }
        CartButtonV5Configuration cartButtonV5Configuration = (CartButtonV5Configuration) other;
        return this.isSingleButton == cartButtonV5Configuration.isSingleButton && this.hasFirstBadge == cartButtonV5Configuration.hasFirstBadge && this.hasSecondBadge == cartButtonV5Configuration.hasSecondBadge && this.isIcon == cartButtonV5Configuration.isIcon && this.isSecondIcon == cartButtonV5Configuration.isSecondIcon && this.isSubTitle == cartButtonV5Configuration.isSubTitle && this.isAsync == cartButtonV5Configuration.isAsync && this.isFirstInCart == cartButtonV5Configuration.isFirstInCart && this.isSecondInCart == cartButtonV5Configuration.isSecondInCart && this.isStickyTransparent == cartButtonV5Configuration.isStickyTransparent && this.isRelatedBottomSheet == cartButtonV5Configuration.isRelatedBottomSheet && this.isSubscribeButton == cartButtonV5Configuration.isSubscribeButton && this.isTeenMode == cartButtonV5Configuration.isTeenMode && this.isMatrixGradient == cartButtonV5Configuration.isMatrixGradient && this.isInModal == cartButtonV5Configuration.isInModal;
    }

    public final boolean getHasFirstBadge() {
        return this.hasFirstBadge;
    }

    public final boolean getHasSecondBadge() {
        return this.hasSecondBadge;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isInModal) + C3532b.a(C3532b.a(C3532b.a(C3532b.a(C3532b.a(C3532b.a(C3532b.a(C3532b.a(C3532b.a(C3532b.a(C3532b.a(C3532b.a(C3532b.a(Boolean.hashCode(this.isSingleButton) * 31, 31, this.hasFirstBadge), 31, this.hasSecondBadge), 31, this.isIcon), 31, this.isSecondIcon), 31, this.isSubTitle), 31, this.isAsync), 31, this.isFirstInCart), 31, this.isSecondInCart), 31, this.isStickyTransparent), 31, this.isRelatedBottomSheet), 31, this.isSubscribeButton), 31, this.isTeenMode), 31, this.isMatrixGradient);
    }

    /* renamed from: isFirstInCart, reason: from getter */
    public final boolean getIsFirstInCart() {
        return this.isFirstInCart;
    }

    /* renamed from: isIcon, reason: from getter */
    public final boolean getIsIcon() {
        return this.isIcon;
    }

    /* renamed from: isInModal, reason: from getter */
    public final boolean getIsInModal() {
        return this.isInModal;
    }

    /* renamed from: isMatrixGradient, reason: from getter */
    public final boolean getIsMatrixGradient() {
        return this.isMatrixGradient;
    }

    /* renamed from: isRelatedBottomSheet, reason: from getter */
    public final boolean getIsRelatedBottomSheet() {
        return this.isRelatedBottomSheet;
    }

    /* renamed from: isSecondIcon, reason: from getter */
    public final boolean getIsSecondIcon() {
        return this.isSecondIcon;
    }

    /* renamed from: isSecondInCart, reason: from getter */
    public final boolean getIsSecondInCart() {
        return this.isSecondInCart;
    }

    /* renamed from: isSingleButton, reason: from getter */
    public final boolean getIsSingleButton() {
        return this.isSingleButton;
    }

    /* renamed from: isStickyTransparent, reason: from getter */
    public final boolean getIsStickyTransparent() {
        return this.isStickyTransparent;
    }

    /* renamed from: isSubTitle, reason: from getter */
    public final boolean getIsSubTitle() {
        return this.isSubTitle;
    }

    /* renamed from: isSubscribeButton, reason: from getter */
    public final boolean getIsSubscribeButton() {
        return this.isSubscribeButton;
    }

    /* renamed from: isTeenMode, reason: from getter */
    public final boolean getIsTeenMode() {
        return this.isTeenMode;
    }

    @NotNull
    public String toString() {
        boolean z11 = this.isSingleButton;
        boolean z12 = this.hasFirstBadge;
        boolean z13 = this.hasSecondBadge;
        boolean z14 = this.isIcon;
        boolean z15 = this.isSecondIcon;
        boolean z16 = this.isSubTitle;
        boolean z17 = this.isAsync;
        boolean z18 = this.isFirstInCart;
        boolean z19 = this.isSecondInCart;
        boolean z21 = this.isStickyTransparent;
        boolean z22 = this.isRelatedBottomSheet;
        boolean z23 = this.isSubscribeButton;
        boolean z24 = this.isTeenMode;
        boolean z25 = this.isMatrixGradient;
        boolean z26 = this.isInModal;
        StringBuilder d11 = a.d("CartButtonV5Configuration(isSingleButton=", ", hasFirstBadge=", ", hasSecondBadge=", z11, z12);
        f.c(", isIcon=", ", isSecondIcon=", d11, z13, z14);
        f.c(", isSubTitle=", ", isAsync=", d11, z15, z16);
        f.c(", isFirstInCart=", ", isSecondInCart=", d11, z17, z18);
        f.c(", isStickyTransparent=", ", isRelatedBottomSheet=", d11, z19, z21);
        f.c(", isSubscribeButton=", ", isTeenMode=", d11, z22, z23);
        f.c(", isMatrixGradient=", ", isInModal=", d11, z24, z25);
        return Pk0.a.a(")", d11, z26);
    }

    public CartButtonV5Configuration(boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z21, boolean z22, boolean z23, boolean z24, boolean z25, boolean z26) {
        this.isSingleButton = z11;
        this.hasFirstBadge = z12;
        this.hasSecondBadge = z13;
        this.isIcon = z14;
        this.isSecondIcon = z15;
        this.isSubTitle = z16;
        this.isAsync = z17;
        this.isFirstInCart = z18;
        this.isSecondInCart = z19;
        this.isStickyTransparent = z21;
        this.isRelatedBottomSheet = z22;
        this.isSubscribeButton = z23;
        this.isTeenMode = z24;
        this.isMatrixGradient = z25;
        this.isInModal = z26;
    }

    public /* synthetic */ CartButtonV5Configuration(boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z21, boolean z22, boolean z23, boolean z24, boolean z25, boolean z26, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? true : z11, (i11 & 2) != 0 ? false : z12, (i11 & 4) != 0 ? false : z13, (i11 & 8) != 0 ? false : z14, (i11 & 16) != 0 ? false : z15, (i11 & 32) != 0 ? false : z16, (i11 & 64) != 0 ? false : z17, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? false : z18, (i11 & 256) != 0 ? false : z19, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? false : z21, (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? false : z22, (i11 & 2048) != 0 ? false : z23, (i11 & 4096) != 0 ? false : z24, (i11 & 8192) != 0 ? false : z25, (i11 & 16384) != 0 ? false : z26);
    }
}
