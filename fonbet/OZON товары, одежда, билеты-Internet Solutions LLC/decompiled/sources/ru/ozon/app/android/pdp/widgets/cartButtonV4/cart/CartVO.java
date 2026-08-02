package ru.ozon.app.android.pdp.widgets.cartButtonV4.cart;

import Ak.C2436a;
import B0.A0;
import B0.C2454a;
import C.C2702w;
import Kk.C3532b;
import Pk0.a;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.texts.TextAtomWithIcon;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.CartButtonV4Dto;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.relatedProductsBottomSheet.CurtainTrackingInfoVO;
import ru.ozon.uni.atoms.data.notification.NotificationModelWrapper;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b%\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001IB£\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0006\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001d\u0010\u001eJÈ\u0001\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00062\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00062\b\b\u0002\u0010\u0018\u001a\u00020\u00062\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020\u00062\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b'\u0010(R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b,\u0010+R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b\u0007\u0010.R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\n\u0010/\u001a\u0004\b2\u00101R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00103\u001a\u0004\b4\u0010$R\u0017\u0010\r\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\r\u00103\u001a\u0004\b5\u0010$R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u000e\u00106\u001a\u0004\b7\u00108R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u000f\u00106\u001a\u0004\b9\u00108R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010:\u001a\u0004\b;\u0010<R\u0017\u0010\u0012\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0012\u0010-\u001a\u0004\b=\u0010.R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010>\u001a\u0004\b?\u0010@R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010A\u001a\u0004\bB\u0010CR\u0017\u0010\u0017\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010-\u001a\u0004\b\u0017\u0010.R\u0017\u0010\u0018\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010-\u001a\u0004\b\u0018\u0010.R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010D\u001a\u0004\bE\u0010\"R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010F\u001a\u0004\bG\u0010H¨\u0006J"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonV4/cart/CartVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "sku", "", "isInCart", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto$Configuration$CartData$Buttons;", "inCart", "toCart", "", "quantity", "freeRest", "minAddToCartQuantity", "multiplicityValue", "Lru/ozon/app/android/atoms/data/texts/TextAtomWithIcon;", "subtext", "hasShadow", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto$CartButtonStyle;", "style", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/cart/CartVO$NotificationBar;", "notificationBar", "isUpdateData", "isShowingLoader", "", "relatedProductsCurtain", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/relatedProductsBottomSheet/CurtainTrackingInfoVO;", "curtainTrackingInfoVO", "<init>", "(JJZLru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto$Configuration$CartData$Buttons;Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto$Configuration$CartData$Buttons;IILjava/lang/Integer;Ljava/lang/Integer;Lru/ozon/app/android/atoms/data/texts/TextAtomWithIcon;ZLru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto$CartButtonStyle;Lru/ozon/app/android/pdp/widgets/cartButtonV4/cart/CartVO$NotificationBar;ZZLjava/lang/String;Lru/ozon/app/android/pdp/widgets/cartButtonV4/relatedProductsBottomSheet/CurtainTrackingInfoVO;)V", "copy", "(JJZLru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto$Configuration$CartData$Buttons;Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto$Configuration$CartData$Buttons;IILjava/lang/Integer;Ljava/lang/Integer;Lru/ozon/app/android/atoms/data/texts/TextAtomWithIcon;ZLru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto$CartButtonStyle;Lru/ozon/app/android/pdp/widgets/cartButtonV4/cart/CartVO$NotificationBar;ZZLjava/lang/String;Lru/ozon/app/android/pdp/widgets/cartButtonV4/relatedProductsBottomSheet/CurtainTrackingInfoVO;)Lru/ozon/app/android/pdp/widgets/cartButtonV4/cart/CartVO;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "getSku", "Z", "()Z", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto$Configuration$CartData$Buttons;", "getInCart", "()Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto$Configuration$CartData$Buttons;", "getToCart", "I", "getQuantity", "getFreeRest", "Ljava/lang/Integer;", "getMinAddToCartQuantity", "()Ljava/lang/Integer;", "getMultiplicityValue", "Lru/ozon/app/android/atoms/data/texts/TextAtomWithIcon;", "getSubtext", "()Lru/ozon/app/android/atoms/data/texts/TextAtomWithIcon;", "getHasShadow", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto$CartButtonStyle;", "getStyle", "()Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto$CartButtonStyle;", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/cart/CartVO$NotificationBar;", "getNotificationBar", "()Lru/ozon/app/android/pdp/widgets/cartButtonV4/cart/CartVO$NotificationBar;", "Ljava/lang/String;", "getRelatedProductsCurtain", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/relatedProductsBottomSheet/CurtainTrackingInfoVO;", "getCurtainTrackingInfoVO", "()Lru/ozon/app/android/pdp/widgets/cartButtonV4/relatedProductsBottomSheet/CurtainTrackingInfoVO;", "NotificationBar", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class CartVO implements c {
    private final CurtainTrackingInfoVO curtainTrackingInfoVO;
    private final int freeRest;
    private final boolean hasShadow;
    private final long id;

    @NotNull
    private final CartButtonV4Dto.Configuration.CartData.Buttons inCart;
    private final boolean isInCart;
    private final boolean isShowingLoader;
    private final boolean isUpdateData;
    private final Integer minAddToCartQuantity;
    private final Integer multiplicityValue;
    private final NotificationBar notificationBar;
    private final int quantity;
    private final String relatedProductsCurtain;
    private final long sku;
    private final CartButtonV4Dto.CartButtonStyle style;
    private final TextAtomWithIcon subtext;

    @NotNull
    private final CartButtonV4Dto.Configuration.CartData.Buttons toCart;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonV4/cart/CartVO$NotificationBar;", "", "Lru/ozon/uni/atoms/data/notification/NotificationModelWrapper;", "notificationWrapper", "", "preDelay", "", "canShowFromBottomSheetOnPreviewPage", "<init>", "(Lru/ozon/uni/atoms/data/notification/NotificationModelWrapper;Ljava/lang/Long;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/notification/NotificationModelWrapper;", "getNotificationWrapper", "()Lru/ozon/uni/atoms/data/notification/NotificationModelWrapper;", "Ljava/lang/Long;", "getPreDelay", "()Ljava/lang/Long;", "Z", "getCanShowFromBottomSheetOnPreviewPage", "()Z", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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

    public CartVO(long j11, long j12, boolean z11, @NotNull CartButtonV4Dto.Configuration.CartData.Buttons inCart, @NotNull CartButtonV4Dto.Configuration.CartData.Buttons toCart, int i11, int i12, Integer num, Integer num2, TextAtomWithIcon textAtomWithIcon, boolean z12, CartButtonV4Dto.CartButtonStyle cartButtonStyle, NotificationBar notificationBar, boolean z13, boolean z14, String str, CurtainTrackingInfoVO curtainTrackingInfoVO) {
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
        this.subtext = textAtomWithIcon;
        this.hasShadow = z12;
        this.style = cartButtonStyle;
        this.notificationBar = notificationBar;
        this.isUpdateData = z13;
        this.isShowingLoader = z14;
        this.relatedProductsCurtain = str;
        this.curtainTrackingInfoVO = curtainTrackingInfoVO;
    }

    public static /* synthetic */ CartVO copy$default(CartVO cartVO, long j11, long j12, boolean z11, CartButtonV4Dto.Configuration.CartData.Buttons buttons, CartButtonV4Dto.Configuration.CartData.Buttons buttons2, int i11, int i12, Integer num, Integer num2, TextAtomWithIcon textAtomWithIcon, boolean z12, CartButtonV4Dto.CartButtonStyle cartButtonStyle, NotificationBar notificationBar, boolean z13, boolean z14, String str, CurtainTrackingInfoVO curtainTrackingInfoVO, int i13, Object obj) {
        CurtainTrackingInfoVO curtainTrackingInfoVO2;
        String str2;
        long j13 = (i13 & 1) != 0 ? cartVO.id : j11;
        long j14 = (i13 & 2) != 0 ? cartVO.sku : j12;
        boolean z15 = (i13 & 4) != 0 ? cartVO.isInCart : z11;
        CartButtonV4Dto.Configuration.CartData.Buttons buttons3 = (i13 & 8) != 0 ? cartVO.inCart : buttons;
        CartButtonV4Dto.Configuration.CartData.Buttons buttons4 = (i13 & 16) != 0 ? cartVO.toCart : buttons2;
        int i14 = (i13 & 32) != 0 ? cartVO.quantity : i11;
        int i15 = (i13 & 64) != 0 ? cartVO.freeRest : i12;
        Integer num3 = (i13 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? cartVO.minAddToCartQuantity : num;
        Integer num4 = (i13 & 256) != 0 ? cartVO.multiplicityValue : num2;
        TextAtomWithIcon textAtomWithIcon2 = (i13 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? cartVO.subtext : textAtomWithIcon;
        boolean z16 = (i13 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? cartVO.hasShadow : z12;
        CartButtonV4Dto.CartButtonStyle cartButtonStyle2 = (i13 & 2048) != 0 ? cartVO.style : cartButtonStyle;
        long j15 = j13;
        NotificationBar notificationBar2 = (i13 & 4096) != 0 ? cartVO.notificationBar : notificationBar;
        boolean z17 = (i13 & 8192) != 0 ? cartVO.isUpdateData : z13;
        NotificationBar notificationBar3 = notificationBar2;
        boolean z18 = (i13 & 16384) != 0 ? cartVO.isShowingLoader : z14;
        String str3 = (i13 & 32768) != 0 ? cartVO.relatedProductsCurtain : str;
        if ((i13 & 65536) != 0) {
            str2 = str3;
            curtainTrackingInfoVO2 = cartVO.curtainTrackingInfoVO;
        } else {
            curtainTrackingInfoVO2 = curtainTrackingInfoVO;
            str2 = str3;
        }
        return cartVO.copy(j15, j14, z15, buttons3, buttons4, i14, i15, num3, num4, textAtomWithIcon2, z16, cartButtonStyle2, notificationBar3, z17, z18, str2, curtainTrackingInfoVO2);
    }

    @NotNull
    public final CartVO copy(long id2, long sku, boolean isInCart, @NotNull CartButtonV4Dto.Configuration.CartData.Buttons inCart, @NotNull CartButtonV4Dto.Configuration.CartData.Buttons toCart, int quantity, int freeRest, Integer minAddToCartQuantity, Integer multiplicityValue, TextAtomWithIcon subtext, boolean hasShadow, CartButtonV4Dto.CartButtonStyle style, NotificationBar notificationBar, boolean isUpdateData, boolean isShowingLoader, String relatedProductsCurtain, CurtainTrackingInfoVO curtainTrackingInfoVO) {
        Intrinsics.checkNotNullParameter(inCart, "inCart");
        Intrinsics.checkNotNullParameter(toCart, "toCart");
        return new CartVO(id2, sku, isInCart, inCart, toCart, quantity, freeRest, minAddToCartQuantity, multiplicityValue, subtext, hasShadow, style, notificationBar, isUpdateData, isShowingLoader, relatedProductsCurtain, curtainTrackingInfoVO);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CartVO)) {
            return false;
        }
        CartVO cartVO = (CartVO) other;
        return this.id == cartVO.id && this.sku == cartVO.sku && this.isInCart == cartVO.isInCart && Intrinsics.d(this.inCart, cartVO.inCart) && Intrinsics.d(this.toCart, cartVO.toCart) && this.quantity == cartVO.quantity && this.freeRest == cartVO.freeRest && Intrinsics.d(this.minAddToCartQuantity, cartVO.minAddToCartQuantity) && Intrinsics.d(this.multiplicityValue, cartVO.multiplicityValue) && Intrinsics.d(this.subtext, cartVO.subtext) && this.hasShadow == cartVO.hasShadow && this.style == cartVO.style && Intrinsics.d(this.notificationBar, cartVO.notificationBar) && this.isUpdateData == cartVO.isUpdateData && this.isShowingLoader == cartVO.isShowingLoader && Intrinsics.d(this.relatedProductsCurtain, cartVO.relatedProductsCurtain) && Intrinsics.d(this.curtainTrackingInfoVO, cartVO.curtainTrackingInfoVO);
    }

    public final CurtainTrackingInfoVO getCurtainTrackingInfoVO() {
        return this.curtainTrackingInfoVO;
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
    public final CartButtonV4Dto.Configuration.CartData.Buttons getInCart() {
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

    public final int getQuantity() {
        return this.quantity;
    }

    public final String getRelatedProductsCurtain() {
        return this.relatedProductsCurtain;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final long getSku() {
        return this.sku;
    }

    public final CartButtonV4Dto.CartButtonStyle getStyle() {
        return this.style;
    }

    @NotNull
    public final CartButtonV4Dto.Configuration.CartData.Buttons getToCart() {
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
        TextAtomWithIcon textAtomWithIcon = this.subtext;
        int a12 = C3532b.a((hashCode2 + (textAtomWithIcon == null ? 0 : textAtomWithIcon.hashCode())) * 31, 31, this.hasShadow);
        CartButtonV4Dto.CartButtonStyle cartButtonStyle = this.style;
        int hashCode3 = (a12 + (cartButtonStyle == null ? 0 : cartButtonStyle.hashCode())) * 31;
        NotificationBar notificationBar = this.notificationBar;
        int a13 = C3532b.a(C3532b.a((hashCode3 + (notificationBar == null ? 0 : notificationBar.hashCode())) * 31, 31, this.isUpdateData), 31, this.isShowingLoader);
        String str = this.relatedProductsCurtain;
        int hashCode4 = (a13 + (str == null ? 0 : str.hashCode())) * 31;
        CurtainTrackingInfoVO curtainTrackingInfoVO = this.curtainTrackingInfoVO;
        return hashCode4 + (curtainTrackingInfoVO != null ? curtainTrackingInfoVO.hashCode() : 0);
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
        CartButtonV4Dto.Configuration.CartData.Buttons buttons = this.inCart;
        CartButtonV4Dto.Configuration.CartData.Buttons buttons2 = this.toCart;
        int i11 = this.quantity;
        int i12 = this.freeRest;
        Integer num = this.minAddToCartQuantity;
        Integer num2 = this.multiplicityValue;
        TextAtomWithIcon textAtomWithIcon = this.subtext;
        boolean z12 = this.hasShadow;
        CartButtonV4Dto.CartButtonStyle cartButtonStyle = this.style;
        NotificationBar notificationBar = this.notificationBar;
        boolean z13 = this.isUpdateData;
        boolean z14 = this.isShowingLoader;
        String str = this.relatedProductsCurtain;
        CurtainTrackingInfoVO curtainTrackingInfoVO = this.curtainTrackingInfoVO;
        StringBuilder d11 = C2702w.d(j11, "CartVO(id=", ", sku=");
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
        d11.append(", subtext=");
        d11.append(textAtomWithIcon);
        d11.append(", hasShadow=");
        d11.append(z12);
        d11.append(", style=");
        d11.append(cartButtonStyle);
        d11.append(", notificationBar=");
        d11.append(notificationBar);
        C2436a.e(", isUpdateData=", ", isShowingLoader=", d11, z13, z14);
        d11.append(", relatedProductsCurtain=");
        d11.append(str);
        d11.append(", curtainTrackingInfoVO=");
        d11.append(curtainTrackingInfoVO);
        d11.append(")");
        return d11.toString();
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ CartVO(long r23, long r25, boolean r27, ru.ozon.app.android.pdp.widgets.cartButtonV4.CartButtonV4Dto.Configuration.CartData.Buttons r28, ru.ozon.app.android.pdp.widgets.cartButtonV4.CartButtonV4Dto.Configuration.CartData.Buttons r29, int r30, int r31, java.lang.Integer r32, java.lang.Integer r33, ru.ozon.app.android.atoms.data.texts.TextAtomWithIcon r34, boolean r35, ru.ozon.app.android.pdp.widgets.cartButtonV4.CartButtonV4Dto.CartButtonStyle r36, ru.ozon.app.android.pdp.widgets.cartButtonV4.cart.CartVO.NotificationBar r37, boolean r38, boolean r39, java.lang.String r40, ru.ozon.app.android.pdp.widgets.cartButtonV4.relatedProductsBottomSheet.CurtainTrackingInfoVO r41, int r42, kotlin.jvm.internal.DefaultConstructorMarker r43) {
        /*
            r22 = this;
            r0 = r42
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto La
            r1 = 0
            r16 = r1
            goto Lc
        La:
            r16 = r36
        Lc:
            r1 = r0 & 8192(0x2000, float:1.148E-41)
            r2 = 0
            if (r1 == 0) goto L14
            r18 = r2
            goto L16
        L14:
            r18 = r38
        L16:
            r0 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L3b
            r19 = r2
            r3 = r23
            r5 = r25
            r7 = r27
            r8 = r28
            r9 = r29
            r10 = r30
            r11 = r31
            r12 = r32
            r13 = r33
            r14 = r34
            r15 = r35
            r17 = r37
            r20 = r40
            r21 = r41
            r2 = r22
            goto L5b
        L3b:
            r19 = r39
            r2 = r22
            r3 = r23
            r5 = r25
            r7 = r27
            r8 = r28
            r9 = r29
            r10 = r30
            r11 = r31
            r12 = r32
            r13 = r33
            r14 = r34
            r15 = r35
            r17 = r37
            r20 = r40
            r21 = r41
        L5b:
            r2.<init>(r3, r5, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ozon.app.android.pdp.widgets.cartButtonV4.cart.CartVO.<init>(long, long, boolean, ru.ozon.app.android.pdp.widgets.cartButtonV4.CartButtonV4Dto$Configuration$CartData$Buttons, ru.ozon.app.android.pdp.widgets.cartButtonV4.CartButtonV4Dto$Configuration$CartData$Buttons, int, int, java.lang.Integer, java.lang.Integer, ru.ozon.app.android.atoms.data.texts.TextAtomWithIcon, boolean, ru.ozon.app.android.pdp.widgets.cartButtonV4.CartButtonV4Dto$CartButtonStyle, ru.ozon.app.android.pdp.widgets.cartButtonV4.cart.CartVO$NotificationBar, boolean, boolean, java.lang.String, ru.ozon.app.android.pdp.widgets.cartButtonV4.relatedProductsBottomSheet.CurtainTrackingInfoVO, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
