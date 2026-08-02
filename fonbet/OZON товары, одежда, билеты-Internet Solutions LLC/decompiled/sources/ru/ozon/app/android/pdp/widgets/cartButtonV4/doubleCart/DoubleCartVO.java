package ru.ozon.app.android.pdp.widgets.cartButtonV4.doubleCart;

import Kk.C3532b;
import Xc.a;
import Xc.b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.CartButtonV4Dto;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.cart.CartVO;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.relatedProductsBottomSheet.CurtainTrackingInfoVO;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001d\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u00019B[\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015Jr\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\n2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010'\u001a\u0004\b*\u0010)R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010.\u001a\u0004\b/\u00100R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u00101\u001a\u0004\b2\u00103R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u00104\u001a\u0004\b5\u0010\u0019R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u00106\u001a\u0004\b7\u00108¨\u0006:"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonV4/doubleCart/DoubleCartVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/doubleCart/DoubleCartVO$CartMode;", "mode", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/cart/CartVO;", "firstCartData", "secondCartData", "", "hasShadow", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto$CartButtonStyle;", "style", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/cart/CartVO$NotificationBar;", "notificationBar", "", "relatedProductsCurtain", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/relatedProductsBottomSheet/CurtainTrackingInfoVO;", "curtainTrackingInfoVO", "<init>", "(JLru/ozon/app/android/pdp/widgets/cartButtonV4/doubleCart/DoubleCartVO$CartMode;Lru/ozon/app/android/pdp/widgets/cartButtonV4/cart/CartVO;Lru/ozon/app/android/pdp/widgets/cartButtonV4/cart/CartVO;ZLru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto$CartButtonStyle;Lru/ozon/app/android/pdp/widgets/cartButtonV4/cart/CartVO$NotificationBar;Ljava/lang/String;Lru/ozon/app/android/pdp/widgets/cartButtonV4/relatedProductsBottomSheet/CurtainTrackingInfoVO;)V", "copy", "(JLru/ozon/app/android/pdp/widgets/cartButtonV4/doubleCart/DoubleCartVO$CartMode;Lru/ozon/app/android/pdp/widgets/cartButtonV4/cart/CartVO;Lru/ozon/app/android/pdp/widgets/cartButtonV4/cart/CartVO;ZLru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto$CartButtonStyle;Lru/ozon/app/android/pdp/widgets/cartButtonV4/cart/CartVO$NotificationBar;Ljava/lang/String;Lru/ozon/app/android/pdp/widgets/cartButtonV4/relatedProductsBottomSheet/CurtainTrackingInfoVO;)Lru/ozon/app/android/pdp/widgets/cartButtonV4/doubleCart/DoubleCartVO;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/doubleCart/DoubleCartVO$CartMode;", "getMode", "()Lru/ozon/app/android/pdp/widgets/cartButtonV4/doubleCart/DoubleCartVO$CartMode;", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/cart/CartVO;", "getFirstCartData", "()Lru/ozon/app/android/pdp/widgets/cartButtonV4/cart/CartVO;", "getSecondCartData", "Z", "getHasShadow", "()Z", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto$CartButtonStyle;", "getStyle", "()Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto$CartButtonStyle;", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/cart/CartVO$NotificationBar;", "getNotificationBar", "()Lru/ozon/app/android/pdp/widgets/cartButtonV4/cart/CartVO$NotificationBar;", "Ljava/lang/String;", "getRelatedProductsCurtain", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/relatedProductsBottomSheet/CurtainTrackingInfoVO;", "getCurtainTrackingInfoVO", "()Lru/ozon/app/android/pdp/widgets/cartButtonV4/relatedProductsBottomSheet/CurtainTrackingInfoVO;", "CartMode", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class DoubleCartVO implements c {
    private final CurtainTrackingInfoVO curtainTrackingInfoVO;

    @NotNull
    private final CartVO firstCartData;
    private final boolean hasShadow;
    private final long id;

    @NotNull
    private final CartMode mode;
    private final CartVO.NotificationBar notificationBar;
    private final String relatedProductsCurtain;

    @NotNull
    private final CartVO secondCartData;
    private final CartButtonV4Dto.CartButtonStyle style;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonV4/doubleCart/DoubleCartVO$CartMode;", "", "<init>", "(Ljava/lang/String;I)V", "DEFAULT", "FIRST", "SECOND", "IN_CART", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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

    public DoubleCartVO(long j11, @NotNull CartMode mode, @NotNull CartVO firstCartData, @NotNull CartVO secondCartData, boolean z11, CartButtonV4Dto.CartButtonStyle cartButtonStyle, CartVO.NotificationBar notificationBar, String str, CurtainTrackingInfoVO curtainTrackingInfoVO) {
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
        this.relatedProductsCurtain = str;
        this.curtainTrackingInfoVO = curtainTrackingInfoVO;
    }

    public static /* synthetic */ DoubleCartVO copy$default(DoubleCartVO doubleCartVO, long j11, CartMode cartMode, CartVO cartVO, CartVO cartVO2, boolean z11, CartButtonV4Dto.CartButtonStyle cartButtonStyle, CartVO.NotificationBar notificationBar, String str, CurtainTrackingInfoVO curtainTrackingInfoVO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = doubleCartVO.id;
        }
        long j12 = j11;
        if ((i11 & 2) != 0) {
            cartMode = doubleCartVO.mode;
        }
        CartMode cartMode2 = cartMode;
        if ((i11 & 4) != 0) {
            cartVO = doubleCartVO.firstCartData;
        }
        return doubleCartVO.copy(j12, cartMode2, cartVO, (i11 & 8) != 0 ? doubleCartVO.secondCartData : cartVO2, (i11 & 16) != 0 ? doubleCartVO.hasShadow : z11, (i11 & 32) != 0 ? doubleCartVO.style : cartButtonStyle, (i11 & 64) != 0 ? doubleCartVO.notificationBar : notificationBar, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? doubleCartVO.relatedProductsCurtain : str, (i11 & 256) != 0 ? doubleCartVO.curtainTrackingInfoVO : curtainTrackingInfoVO);
    }

    @NotNull
    public final DoubleCartVO copy(long id2, @NotNull CartMode mode, @NotNull CartVO firstCartData, @NotNull CartVO secondCartData, boolean hasShadow, CartButtonV4Dto.CartButtonStyle style, CartVO.NotificationBar notificationBar, String relatedProductsCurtain, CurtainTrackingInfoVO curtainTrackingInfoVO) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(firstCartData, "firstCartData");
        Intrinsics.checkNotNullParameter(secondCartData, "secondCartData");
        return new DoubleCartVO(id2, mode, firstCartData, secondCartData, hasShadow, style, notificationBar, relatedProductsCurtain, curtainTrackingInfoVO);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DoubleCartVO)) {
            return false;
        }
        DoubleCartVO doubleCartVO = (DoubleCartVO) other;
        return this.id == doubleCartVO.id && this.mode == doubleCartVO.mode && Intrinsics.d(this.firstCartData, doubleCartVO.firstCartData) && Intrinsics.d(this.secondCartData, doubleCartVO.secondCartData) && this.hasShadow == doubleCartVO.hasShadow && this.style == doubleCartVO.style && Intrinsics.d(this.notificationBar, doubleCartVO.notificationBar) && Intrinsics.d(this.relatedProductsCurtain, doubleCartVO.relatedProductsCurtain) && Intrinsics.d(this.curtainTrackingInfoVO, doubleCartVO.curtainTrackingInfoVO);
    }

    public final CurtainTrackingInfoVO getCurtainTrackingInfoVO() {
        return this.curtainTrackingInfoVO;
    }

    @NotNull
    public final CartVO getFirstCartData() {
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

    public final CartVO.NotificationBar getNotificationBar() {
        return this.notificationBar;
    }

    public final String getRelatedProductsCurtain() {
        return this.relatedProductsCurtain;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final CartVO getSecondCartData() {
        return this.secondCartData;
    }

    public final CartButtonV4Dto.CartButtonStyle getStyle() {
        return this.style;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = C3532b.a((this.secondCartData.hashCode() + ((this.firstCartData.hashCode() + ((this.mode.hashCode() + (Long.hashCode(this.id) * 31)) * 31)) * 31)) * 31, 31, this.hasShadow);
        CartButtonV4Dto.CartButtonStyle cartButtonStyle = this.style;
        int hashCode = (a11 + (cartButtonStyle == null ? 0 : cartButtonStyle.hashCode())) * 31;
        CartVO.NotificationBar notificationBar = this.notificationBar;
        int hashCode2 = (hashCode + (notificationBar == null ? 0 : notificationBar.hashCode())) * 31;
        String str = this.relatedProductsCurtain;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        CurtainTrackingInfoVO curtainTrackingInfoVO = this.curtainTrackingInfoVO;
        return hashCode3 + (curtainTrackingInfoVO != null ? curtainTrackingInfoVO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "DoubleCartVO(id=" + this.id + ", mode=" + this.mode + ", firstCartData=" + this.firstCartData + ", secondCartData=" + this.secondCartData + ", hasShadow=" + this.hasShadow + ", style=" + this.style + ", notificationBar=" + this.notificationBar + ", relatedProductsCurtain=" + this.relatedProductsCurtain + ", curtainTrackingInfoVO=" + this.curtainTrackingInfoVO + ")";
    }
}
