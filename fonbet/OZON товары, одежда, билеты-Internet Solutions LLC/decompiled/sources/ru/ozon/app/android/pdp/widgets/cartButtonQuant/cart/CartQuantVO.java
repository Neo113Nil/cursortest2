package ru.ozon.app.android.pdp.widgets.cartButtonQuant.cart;

import B0.A0;
import B0.C2454a;
import Bi.b;
import C.C2702w;
import Kk.C3532b;
import Pk0.a;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.texts.TextAtomWithIcon;
import ru.ozon.app.android.pdp.widgets.cartButtonQuant.CartButtonQuantDto;
import ru.ozon.uni.atoms.data.notification.NotificationModelWrapper;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b!\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001CB\u0099\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0006¢\u0006\u0004\b\u001a\u0010\u001bJ¼\u0001\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00062\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u00062\b\b\u0002\u0010\u0019\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020\u00062\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b%\u0010&R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b*\u0010)R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b\u0007\u0010,R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\n\u0010-\u001a\u0004\b0\u0010/R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00101\u001a\u0004\b2\u0010\"R\u0017\u0010\r\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\r\u00101\u001a\u0004\b3\u0010\"R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u000e\u00104\u001a\u0004\b5\u00106R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u000f\u00104\u001a\u0004\b7\u00106R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u0010\u00104\u001a\u0004\b8\u00106R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u00109\u001a\u0004\b:\u0010;R\u0017\u0010\u0013\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0013\u0010+\u001a\u0004\b<\u0010,R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010=\u001a\u0004\b>\u0010?R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010@\u001a\u0004\bA\u0010BR\u0017\u0010\u0018\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010+\u001a\u0004\b\u0018\u0010,R\u0017\u0010\u0019\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010+\u001a\u0004\b\u0019\u0010,¨\u0006D"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonQuant/cart/CartQuantVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "sku", "", "isInCart", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/CartButtonQuantDto$Configuration$CartData$Buttons;", "inCart", "toCart", "", "quantity", "freeRest", "minAddToCartQuantity", "multiplicityValue", "quantMultiplicityValue", "Lru/ozon/app/android/atoms/data/texts/TextAtomWithIcon;", "subtext", "hasShadow", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/CartButtonQuantDto$CartButtonStyle;", "style", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/cart/CartQuantVO$NotificationBar;", "notificationBar", "isUpdateData", "isShowingLoader", "<init>", "(JJZLru/ozon/app/android/pdp/widgets/cartButtonQuant/CartButtonQuantDto$Configuration$CartData$Buttons;Lru/ozon/app/android/pdp/widgets/cartButtonQuant/CartButtonQuantDto$Configuration$CartData$Buttons;IILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lru/ozon/app/android/atoms/data/texts/TextAtomWithIcon;ZLru/ozon/app/android/pdp/widgets/cartButtonQuant/CartButtonQuantDto$CartButtonStyle;Lru/ozon/app/android/pdp/widgets/cartButtonQuant/cart/CartQuantVO$NotificationBar;ZZ)V", "copy", "(JJZLru/ozon/app/android/pdp/widgets/cartButtonQuant/CartButtonQuantDto$Configuration$CartData$Buttons;Lru/ozon/app/android/pdp/widgets/cartButtonQuant/CartButtonQuantDto$Configuration$CartData$Buttons;IILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lru/ozon/app/android/atoms/data/texts/TextAtomWithIcon;ZLru/ozon/app/android/pdp/widgets/cartButtonQuant/CartButtonQuantDto$CartButtonStyle;Lru/ozon/app/android/pdp/widgets/cartButtonQuant/cart/CartQuantVO$NotificationBar;ZZ)Lru/ozon/app/android/pdp/widgets/cartButtonQuant/cart/CartQuantVO;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "getSku", "Z", "()Z", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/CartButtonQuantDto$Configuration$CartData$Buttons;", "getInCart", "()Lru/ozon/app/android/pdp/widgets/cartButtonQuant/CartButtonQuantDto$Configuration$CartData$Buttons;", "getToCart", "I", "getQuantity", "getFreeRest", "Ljava/lang/Integer;", "getMinAddToCartQuantity", "()Ljava/lang/Integer;", "getMultiplicityValue", "getQuantMultiplicityValue", "Lru/ozon/app/android/atoms/data/texts/TextAtomWithIcon;", "getSubtext", "()Lru/ozon/app/android/atoms/data/texts/TextAtomWithIcon;", "getHasShadow", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/CartButtonQuantDto$CartButtonStyle;", "getStyle", "()Lru/ozon/app/android/pdp/widgets/cartButtonQuant/CartButtonQuantDto$CartButtonStyle;", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/cart/CartQuantVO$NotificationBar;", "getNotificationBar", "()Lru/ozon/app/android/pdp/widgets/cartButtonQuant/cart/CartQuantVO$NotificationBar;", "NotificationBar", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class CartQuantVO implements c {
    private final int freeRest;
    private final boolean hasShadow;
    private final long id;

    @NotNull
    private final CartButtonQuantDto.Configuration.CartData.Buttons inCart;
    private final boolean isInCart;
    private final boolean isShowingLoader;
    private final boolean isUpdateData;
    private final Integer minAddToCartQuantity;
    private final Integer multiplicityValue;
    private final NotificationBar notificationBar;
    private final Integer quantMultiplicityValue;
    private final int quantity;
    private final long sku;
    private final CartButtonQuantDto.CartButtonStyle style;
    private final TextAtomWithIcon subtext;

    @NotNull
    private final CartButtonQuantDto.Configuration.CartData.Buttons toCart;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonQuant/cart/CartQuantVO$NotificationBar;", "", "Lru/ozon/uni/atoms/data/notification/NotificationModelWrapper;", "notificationWrapper", "", "preDelay", "", "canShowFromBottomSheetOnPreviewPage", "<init>", "(Lru/ozon/uni/atoms/data/notification/NotificationModelWrapper;Ljava/lang/Long;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/notification/NotificationModelWrapper;", "getNotificationWrapper", "()Lru/ozon/uni/atoms/data/notification/NotificationModelWrapper;", "Ljava/lang/Long;", "getPreDelay", "()Ljava/lang/Long;", "Z", "getCanShowFromBottomSheetOnPreviewPage", "()Z", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NotificationBar {
        private final boolean canShowFromBottomSheetOnPreviewPage;

        @NotNull
        private final NotificationModelWrapper notificationWrapper;
        private final Long preDelay;

        public NotificationBar(@NotNull NotificationModelWrapper notificationWrapper, Long l11, boolean z11) {
            Intrinsics.checkNotNullParameter(notificationWrapper, "notificationWrapper");
            this.notificationWrapper = notificationWrapper;
            this.preDelay = l11;
            this.canShowFromBottomSheetOnPreviewPage = z11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NotificationBar)) {
                return false;
            }
            NotificationBar notificationBar = (NotificationBar) other;
            return Intrinsics.d(this.notificationWrapper, notificationBar.notificationWrapper) && Intrinsics.d(this.preDelay, notificationBar.preDelay) && this.canShowFromBottomSheetOnPreviewPage == notificationBar.canShowFromBottomSheetOnPreviewPage;
        }

        public final boolean getCanShowFromBottomSheetOnPreviewPage() {
            return this.canShowFromBottomSheetOnPreviewPage;
        }

        @NotNull
        public final NotificationModelWrapper getNotificationWrapper() {
            return this.notificationWrapper;
        }

        public final Long getPreDelay() {
            return this.preDelay;
        }

        public int hashCode() {
            int hashCode = this.notificationWrapper.hashCode() * 31;
            Long l11 = this.preDelay;
            return Boolean.hashCode(this.canShowFromBottomSheetOnPreviewPage) + ((hashCode + (l11 == null ? 0 : l11.hashCode())) * 31);
        }

        @NotNull
        public String toString() {
            NotificationModelWrapper notificationModelWrapper = this.notificationWrapper;
            Long l11 = this.preDelay;
            boolean z11 = this.canShowFromBottomSheetOnPreviewPage;
            StringBuilder sb2 = new StringBuilder("NotificationBar(notificationWrapper=");
            sb2.append(notificationModelWrapper);
            sb2.append(", preDelay=");
            sb2.append(l11);
            sb2.append(", canShowFromBottomSheetOnPreviewPage=");
            return a.a(")", sb2, z11);
        }
    }

    public CartQuantVO(long j11, long j12, boolean z11, @NotNull CartButtonQuantDto.Configuration.CartData.Buttons inCart, @NotNull CartButtonQuantDto.Configuration.CartData.Buttons toCart, int i11, int i12, Integer num, Integer num2, Integer num3, TextAtomWithIcon textAtomWithIcon, boolean z12, CartButtonQuantDto.CartButtonStyle cartButtonStyle, NotificationBar notificationBar, boolean z13, boolean z14) {
        Intrinsics.checkNotNullParameter(inCart, "inCart");
        Intrinsics.checkNotNullParameter(toCart, "toCart");
        this.id = j11;
        this.sku = j12;
        this.isInCart = z11;
        this.inCart = inCart;
        this.toCart = toCart;
        this.quantity = i11;
        this.freeRest = i12;
        this.minAddToCartQuantity = num;
        this.multiplicityValue = num2;
        this.quantMultiplicityValue = num3;
        this.subtext = textAtomWithIcon;
        this.hasShadow = z12;
        this.style = cartButtonStyle;
        this.notificationBar = notificationBar;
        this.isUpdateData = z13;
        this.isShowingLoader = z14;
    }

    public static /* synthetic */ CartQuantVO copy$default(CartQuantVO cartQuantVO, long j11, long j12, boolean z11, CartButtonQuantDto.Configuration.CartData.Buttons buttons, CartButtonQuantDto.Configuration.CartData.Buttons buttons2, int i11, int i12, Integer num, Integer num2, Integer num3, TextAtomWithIcon textAtomWithIcon, boolean z12, CartButtonQuantDto.CartButtonStyle cartButtonStyle, NotificationBar notificationBar, boolean z13, boolean z14, int i13, Object obj) {
        long j13 = (i13 & 1) != 0 ? cartQuantVO.id : j11;
        return cartQuantVO.copy(j13, (i13 & 2) != 0 ? cartQuantVO.sku : j12, (i13 & 4) != 0 ? cartQuantVO.isInCart : z11, (i13 & 8) != 0 ? cartQuantVO.inCart : buttons, (i13 & 16) != 0 ? cartQuantVO.toCart : buttons2, (i13 & 32) != 0 ? cartQuantVO.quantity : i11, (i13 & 64) != 0 ? cartQuantVO.freeRest : i12, (i13 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? cartQuantVO.minAddToCartQuantity : num, (i13 & 256) != 0 ? cartQuantVO.multiplicityValue : num2, (i13 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? cartQuantVO.quantMultiplicityValue : num3, (i13 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? cartQuantVO.subtext : textAtomWithIcon, (i13 & 2048) != 0 ? cartQuantVO.hasShadow : z12, (i13 & 4096) != 0 ? cartQuantVO.style : cartButtonStyle, (i13 & 8192) != 0 ? cartQuantVO.notificationBar : notificationBar, (i13 & 16384) != 0 ? cartQuantVO.isUpdateData : z13, (i13 & 32768) != 0 ? cartQuantVO.isShowingLoader : z14);
    }

    @NotNull
    public final CartQuantVO copy(long id2, long sku, boolean isInCart, @NotNull CartButtonQuantDto.Configuration.CartData.Buttons inCart, @NotNull CartButtonQuantDto.Configuration.CartData.Buttons toCart, int quantity, int freeRest, Integer minAddToCartQuantity, Integer multiplicityValue, Integer quantMultiplicityValue, TextAtomWithIcon subtext, boolean hasShadow, CartButtonQuantDto.CartButtonStyle style, NotificationBar notificationBar, boolean isUpdateData, boolean isShowingLoader) {
        Intrinsics.checkNotNullParameter(inCart, "inCart");
        Intrinsics.checkNotNullParameter(toCart, "toCart");
        return new CartQuantVO(id2, sku, isInCart, inCart, toCart, quantity, freeRest, minAddToCartQuantity, multiplicityValue, quantMultiplicityValue, subtext, hasShadow, style, notificationBar, isUpdateData, isShowingLoader);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CartQuantVO)) {
            return false;
        }
        CartQuantVO cartQuantVO = (CartQuantVO) other;
        return this.id == cartQuantVO.id && this.sku == cartQuantVO.sku && this.isInCart == cartQuantVO.isInCart && Intrinsics.d(this.inCart, cartQuantVO.inCart) && Intrinsics.d(this.toCart, cartQuantVO.toCart) && this.quantity == cartQuantVO.quantity && this.freeRest == cartQuantVO.freeRest && Intrinsics.d(this.minAddToCartQuantity, cartQuantVO.minAddToCartQuantity) && Intrinsics.d(this.multiplicityValue, cartQuantVO.multiplicityValue) && Intrinsics.d(this.quantMultiplicityValue, cartQuantVO.quantMultiplicityValue) && Intrinsics.d(this.subtext, cartQuantVO.subtext) && this.hasShadow == cartQuantVO.hasShadow && this.style == cartQuantVO.style && Intrinsics.d(this.notificationBar, cartQuantVO.notificationBar) && this.isUpdateData == cartQuantVO.isUpdateData && this.isShowingLoader == cartQuantVO.isShowingLoader;
    }

    public final int getFreeRest() {
        return this.freeRest;
    }

    public final boolean getHasShadow() {
        return this.hasShadow;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final CartButtonQuantDto.Configuration.CartData.Buttons getInCart() {
        return this.inCart;
    }

    public final Integer getMinAddToCartQuantity() {
        return this.minAddToCartQuantity;
    }

    public final Integer getMultiplicityValue() {
        return this.multiplicityValue;
    }

    public final NotificationBar getNotificationBar() {
        return this.notificationBar;
    }

    public final Integer getQuantMultiplicityValue() {
        return this.quantMultiplicityValue;
    }

    public final int getQuantity() {
        return this.quantity;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final long getSku() {
        return this.sku;
    }

    public final CartButtonQuantDto.CartButtonStyle getStyle() {
        return this.style;
    }

    @NotNull
    public final CartButtonQuantDto.Configuration.CartData.Buttons getToCart() {
        return this.toCart;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = C2454a.a(this.freeRest, C2454a.a(this.quantity, (this.toCart.hashCode() + ((this.inCart.hashCode() + C3532b.a(Pk0.c.a(Long.hashCode(this.id) * 31, 31, this.sku), 31, this.isInCart)) * 31)) * 31, 31), 31);
        Integer num = this.minAddToCartQuantity;
        int hashCode = (a11 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.multiplicityValue;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.quantMultiplicityValue;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        TextAtomWithIcon textAtomWithIcon = this.subtext;
        int a12 = C3532b.a((hashCode3 + (textAtomWithIcon == null ? 0 : textAtomWithIcon.hashCode())) * 31, 31, this.hasShadow);
        CartButtonQuantDto.CartButtonStyle cartButtonStyle = this.style;
        int hashCode4 = (a12 + (cartButtonStyle == null ? 0 : cartButtonStyle.hashCode())) * 31;
        NotificationBar notificationBar = this.notificationBar;
        return Boolean.hashCode(this.isShowingLoader) + C3532b.a((hashCode4 + (notificationBar != null ? notificationBar.hashCode() : 0)) * 31, 31, this.isUpdateData);
    }

    /* renamed from: isInCart, reason: from getter */
    public final boolean getIsInCart() {
        return this.isInCart;
    }

    /* renamed from: isUpdateData, reason: from getter */
    public final boolean getIsUpdateData() {
        return this.isUpdateData;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        long j12 = this.sku;
        boolean z11 = this.isInCart;
        CartButtonQuantDto.Configuration.CartData.Buttons buttons = this.inCart;
        CartButtonQuantDto.Configuration.CartData.Buttons buttons2 = this.toCart;
        int i11 = this.quantity;
        int i12 = this.freeRest;
        Integer num = this.minAddToCartQuantity;
        Integer num2 = this.multiplicityValue;
        Integer num3 = this.quantMultiplicityValue;
        TextAtomWithIcon textAtomWithIcon = this.subtext;
        boolean z12 = this.hasShadow;
        CartButtonQuantDto.CartButtonStyle cartButtonStyle = this.style;
        NotificationBar notificationBar = this.notificationBar;
        boolean z13 = this.isUpdateData;
        boolean z14 = this.isShowingLoader;
        StringBuilder d11 = C2702w.d(j11, "CartQuantVO(id=", ", sku=");
        d11.append(j12);
        d11.append(", isInCart=");
        d11.append(z11);
        d11.append(", inCart=");
        d11.append(buttons);
        d11.append(", toCart=");
        d11.append(buttons2);
        A0.c(i11, i12, ", quantity=", ", freeRest=", d11);
        d11.append(", minAddToCartQuantity=");
        d11.append(num);
        d11.append(", multiplicityValue=");
        d11.append(num2);
        d11.append(", quantMultiplicityValue=");
        d11.append(num3);
        d11.append(", subtext=");
        d11.append(textAtomWithIcon);
        d11.append(", hasShadow=");
        d11.append(z12);
        d11.append(", style=");
        d11.append(cartButtonStyle);
        d11.append(", notificationBar=");
        d11.append(notificationBar);
        d11.append(", isUpdateData=");
        d11.append(z13);
        return b.f(d11, ", isShowingLoader=", z14, ")");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ CartQuantVO(long r22, long r24, boolean r26, ru.ozon.app.android.pdp.widgets.cartButtonQuant.CartButtonQuantDto.Configuration.CartData.Buttons r27, ru.ozon.app.android.pdp.widgets.cartButtonQuant.CartButtonQuantDto.Configuration.CartData.Buttons r28, int r29, int r30, java.lang.Integer r31, java.lang.Integer r32, java.lang.Integer r33, ru.ozon.app.android.atoms.data.texts.TextAtomWithIcon r34, boolean r35, ru.ozon.app.android.pdp.widgets.cartButtonQuant.CartButtonQuantDto.CartButtonStyle r36, ru.ozon.app.android.pdp.widgets.cartButtonQuant.cart.CartQuantVO.NotificationBar r37, boolean r38, boolean r39, int r40, kotlin.jvm.internal.DefaultConstructorMarker r41) {
        /*
            r21 = this;
            r0 = r40
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto La
            r1 = 0
            r17 = r1
            goto Lc
        La:
            r17 = r36
        Lc:
            r1 = r0 & 16384(0x4000, float:2.2959E-41)
            r2 = 0
            if (r1 == 0) goto L14
            r19 = r2
            goto L16
        L14:
            r19 = r38
        L16:
            r1 = 32768(0x8000, float:4.5918E-41)
            r0 = r0 & r1
            if (r0 == 0) goto L3b
            r20 = r2
            r3 = r22
            r5 = r24
            r7 = r26
            r8 = r27
            r9 = r28
            r10 = r29
            r11 = r30
            r12 = r31
            r13 = r32
            r14 = r33
            r15 = r34
            r16 = r35
            r18 = r37
            r2 = r21
            goto L59
        L3b:
            r20 = r39
            r2 = r21
            r3 = r22
            r5 = r24
            r7 = r26
            r8 = r27
            r9 = r28
            r10 = r29
            r11 = r30
            r12 = r31
            r13 = r32
            r14 = r33
            r15 = r34
            r16 = r35
            r18 = r37
        L59:
            r2.<init>(r3, r5, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ozon.app.android.pdp.widgets.cartButtonQuant.cart.CartQuantVO.<init>(long, long, boolean, ru.ozon.app.android.pdp.widgets.cartButtonQuant.CartButtonQuantDto$Configuration$CartData$Buttons, ru.ozon.app.android.pdp.widgets.cartButtonQuant.CartButtonQuantDto$Configuration$CartData$Buttons, int, int, java.lang.Integer, java.lang.Integer, java.lang.Integer, ru.ozon.app.android.atoms.data.texts.TextAtomWithIcon, boolean, ru.ozon.app.android.pdp.widgets.cartButtonQuant.CartButtonQuantDto$CartButtonStyle, ru.ozon.app.android.pdp.widgets.cartButtonQuant.cart.CartQuantVO$NotificationBar, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
