package ru.ozon.app.android.pdp.widgets.cartButtonQuant.doubleCart;

import Kk.C3532b;
import Xc.a;
import Xc.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.widgets.cartButtonQuant.CartButtonQuantDto;
import ru.ozon.app.android.pdp.widgets.cartButtonQuant.cart.CartQuantVO;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0017\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u00012BG\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\u0013JZ\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\n2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b)\u0010(R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010*\u001a\u0004\b+\u0010\u0013R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010,\u001a\u0004\b-\u0010.R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010/\u001a\u0004\b0\u00101¨\u00063"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonQuant/doubleCart/DoubleCartQuantVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/doubleCart/DoubleCartQuantVO$CartMode;", "mode", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/cart/CartQuantVO;", "firstCartData", "secondCartData", "", "hasShadow", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/CartButtonQuantDto$CartButtonStyle;", "style", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/cart/CartQuantVO$NotificationBar;", "notificationBar", "<init>", "(JLru/ozon/app/android/pdp/widgets/cartButtonQuant/doubleCart/DoubleCartQuantVO$CartMode;Lru/ozon/app/android/pdp/widgets/cartButtonQuant/cart/CartQuantVO;Lru/ozon/app/android/pdp/widgets/cartButtonQuant/cart/CartQuantVO;ZLru/ozon/app/android/pdp/widgets/cartButtonQuant/CartButtonQuantDto$CartButtonStyle;Lru/ozon/app/android/pdp/widgets/cartButtonQuant/cart/CartQuantVO$NotificationBar;)V", "hasBadge", "()Z", "copy", "(JLru/ozon/app/android/pdp/widgets/cartButtonQuant/doubleCart/DoubleCartQuantVO$CartMode;Lru/ozon/app/android/pdp/widgets/cartButtonQuant/cart/CartQuantVO;Lru/ozon/app/android/pdp/widgets/cartButtonQuant/cart/CartQuantVO;ZLru/ozon/app/android/pdp/widgets/cartButtonQuant/CartButtonQuantDto$CartButtonStyle;Lru/ozon/app/android/pdp/widgets/cartButtonQuant/cart/CartQuantVO$NotificationBar;)Lru/ozon/app/android/pdp/widgets/cartButtonQuant/doubleCart/DoubleCartQuantVO;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/doubleCart/DoubleCartQuantVO$CartMode;", "getMode", "()Lru/ozon/app/android/pdp/widgets/cartButtonQuant/doubleCart/DoubleCartQuantVO$CartMode;", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/cart/CartQuantVO;", "getFirstCartData", "()Lru/ozon/app/android/pdp/widgets/cartButtonQuant/cart/CartQuantVO;", "getSecondCartData", "Z", "getHasShadow", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/CartButtonQuantDto$CartButtonStyle;", "getStyle", "()Lru/ozon/app/android/pdp/widgets/cartButtonQuant/CartButtonQuantDto$CartButtonStyle;", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/cart/CartQuantVO$NotificationBar;", "getNotificationBar", "()Lru/ozon/app/android/pdp/widgets/cartButtonQuant/cart/CartQuantVO$NotificationBar;", "CartMode", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class DoubleCartQuantVO implements c {

    @NotNull
    private final CartQuantVO firstCartData;
    private final boolean hasShadow;
    private final long id;

    @NotNull
    private final CartMode mode;
    private final CartQuantVO.NotificationBar notificationBar;

    @NotNull
    private final CartQuantVO secondCartData;
    private final CartButtonQuantDto.CartButtonStyle style;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonQuant/doubleCart/DoubleCartQuantVO$CartMode;", "", "<init>", "(Ljava/lang/String;I)V", "DEFAULT", "FIRST", "SECOND", "IN_CART", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class CartMode {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ CartMode[] $VALUES;
        public static final CartMode DEFAULT = new CartMode("DEFAULT", 0);
        public static final CartMode FIRST = new CartMode("FIRST", 1);
        public static final CartMode SECOND = new CartMode("SECOND", 2);
        public static final CartMode IN_CART = new CartMode("IN_CART", 3);

        private static final /* synthetic */ CartMode[] $values() {
            return new CartMode[]{DEFAULT, FIRST, SECOND, IN_CART};
        }

        static {
            CartMode[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private CartMode(String str, int i11) {
        }

        public static CartMode valueOf(String str) {
            return (CartMode) Enum.valueOf(CartMode.class, str);
        }

        public static CartMode[] values() {
            return (CartMode[]) $VALUES.clone();
        }
    }

    public DoubleCartQuantVO(long j11, @NotNull CartMode mode, @NotNull CartQuantVO firstCartData, @NotNull CartQuantVO secondCartData, boolean z11, CartButtonQuantDto.CartButtonStyle cartButtonStyle, CartQuantVO.NotificationBar notificationBar) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(firstCartData, "firstCartData");
        Intrinsics.checkNotNullParameter(secondCartData, "secondCartData");
        this.id = j11;
        this.mode = mode;
        this.firstCartData = firstCartData;
        this.secondCartData = secondCartData;
        this.hasShadow = z11;
        this.style = cartButtonStyle;
        this.notificationBar = notificationBar;
    }

    public static /* synthetic */ DoubleCartQuantVO copy$default(DoubleCartQuantVO doubleCartQuantVO, long j11, CartMode cartMode, CartQuantVO cartQuantVO, CartQuantVO cartQuantVO2, boolean z11, CartButtonQuantDto.CartButtonStyle cartButtonStyle, CartQuantVO.NotificationBar notificationBar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = doubleCartQuantVO.id;
        }
        long j12 = j11;
        if ((i11 & 2) != 0) {
            cartMode = doubleCartQuantVO.mode;
        }
        CartMode cartMode2 = cartMode;
        if ((i11 & 4) != 0) {
            cartQuantVO = doubleCartQuantVO.firstCartData;
        }
        CartQuantVO cartQuantVO3 = cartQuantVO;
        if ((i11 & 8) != 0) {
            cartQuantVO2 = doubleCartQuantVO.secondCartData;
        }
        CartQuantVO cartQuantVO4 = cartQuantVO2;
        if ((i11 & 16) != 0) {
            z11 = doubleCartQuantVO.hasShadow;
        }
        return doubleCartQuantVO.copy(j12, cartMode2, cartQuantVO3, cartQuantVO4, z11, (i11 & 32) != 0 ? doubleCartQuantVO.style : cartButtonStyle, (i11 & 64) != 0 ? doubleCartQuantVO.notificationBar : notificationBar);
    }

    @NotNull
    public final DoubleCartQuantVO copy(long id2, @NotNull CartMode mode, @NotNull CartQuantVO firstCartData, @NotNull CartQuantVO secondCartData, boolean hasShadow, CartButtonQuantDto.CartButtonStyle style, CartQuantVO.NotificationBar notificationBar) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(firstCartData, "firstCartData");
        Intrinsics.checkNotNullParameter(secondCartData, "secondCartData");
        return new DoubleCartQuantVO(id2, mode, firstCartData, secondCartData, hasShadow, style, notificationBar);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DoubleCartQuantVO)) {
            return false;
        }
        DoubleCartQuantVO doubleCartQuantVO = (DoubleCartQuantVO) other;
        return this.id == doubleCartQuantVO.id && this.mode == doubleCartQuantVO.mode && Intrinsics.d(this.firstCartData, doubleCartQuantVO.firstCartData) && Intrinsics.d(this.secondCartData, doubleCartQuantVO.secondCartData) && this.hasShadow == doubleCartQuantVO.hasShadow && this.style == doubleCartQuantVO.style && Intrinsics.d(this.notificationBar, doubleCartQuantVO.notificationBar);
    }

    @NotNull
    public final CartQuantVO getFirstCartData() {
        return this.firstCartData;
    }

    public final boolean getHasShadow() {
        return this.hasShadow;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final CartMode getMode() {
        return this.mode;
    }

    public final CartQuantVO.NotificationBar getNotificationBar() {
        return this.notificationBar;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final CartQuantVO getSecondCartData() {
        return this.secondCartData;
    }

    public final CartButtonQuantDto.CartButtonStyle getStyle() {
        return this.style;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public final boolean hasBadge() {
        return this.firstCartData.getToCart().getButtonWithIcon().getBadge() != null;
    }

    public int hashCode() {
        int a11 = C3532b.a((this.secondCartData.hashCode() + ((this.firstCartData.hashCode() + ((this.mode.hashCode() + (Long.hashCode(this.id) * 31)) * 31)) * 31)) * 31, 31, this.hasShadow);
        CartButtonQuantDto.CartButtonStyle cartButtonStyle = this.style;
        int hashCode = (a11 + (cartButtonStyle == null ? 0 : cartButtonStyle.hashCode())) * 31;
        CartQuantVO.NotificationBar notificationBar = this.notificationBar;
        return hashCode + (notificationBar != null ? notificationBar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "DoubleCartQuantVO(id=" + this.id + ", mode=" + this.mode + ", firstCartData=" + this.firstCartData + ", secondCartData=" + this.secondCartData + ", hasShadow=" + this.hasShadow + ", style=" + this.style + ", notificationBar=" + this.notificationBar + ")";
    }
}
