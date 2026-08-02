package ru.ozon.app.android.cart.cartSplitV2.v1.presentation.item;

import Am.C2438a;
import B0.C2454a;
import De.C2859b;
import G.g;
import N3.C3660k;
import Ve.C4598rp;
import WZ.t;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.dynamicElement.DynamicElementVO;
import ru.ozon.app.android.cart.common.product.ProductVO;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMolecule;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.data.ReviewGalleryV2DTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001b\b\u0087\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u000212BC\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u000e2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b#\u0010$R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010+\u001a\u0004\b,\u0010-R\u0014\u00100\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/¨\u00063"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v1/presentation/item/CartSplitV2ItemVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/app/android/cart/cartSplitV2/v1/presentation/item/CartSplitV2ItemVO$Checkbox;", "checkbox", "Lru/ozon/app/android/cart/common/product/ProductVO;", ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.PRODUCT_FIELD_NAME, "", "Lru/ozon/app/android/cart/common/dynamicElement/DynamicElementVO;", "dynamicElements", "Lru/ozon/app/android/cart/cartSplitV2/v1/presentation/item/CartSplitV2ItemVO$Controls;", "controls", "", "roundBottom", "<init>", "(JLru/ozon/app/android/cart/cartSplitV2/v1/presentation/item/CartSplitV2ItemVO$Checkbox;Lru/ozon/app/android/cart/common/product/ProductVO;Ljava/util/List;Lru/ozon/app/android/cart/cartSplitV2/v1/presentation/item/CartSplitV2ItemVO$Controls;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/cart/cartSplitV2/v1/presentation/item/CartSplitV2ItemVO$Checkbox;", "getCheckbox", "()Lru/ozon/app/android/cart/cartSplitV2/v1/presentation/item/CartSplitV2ItemVO$Checkbox;", "Lru/ozon/app/android/cart/common/product/ProductVO;", "getProduct", "()Lru/ozon/app/android/cart/common/product/ProductVO;", "Ljava/util/List;", "getDynamicElements", "()Ljava/util/List;", "Lru/ozon/app/android/cart/cartSplitV2/v1/presentation/item/CartSplitV2ItemVO$Controls;", "getControls", "()Lru/ozon/app/android/cart/cartSplitV2/v1/presentation/item/CartSplitV2ItemVO$Controls;", "Z", "getRoundBottom", "()Z", "getScrollWidgetKey", "()Ljava/lang/Integer;", "scrollWidgetKey", "Checkbox", "Controls", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class CartSplitV2ItemVO implements c {
    private final Checkbox checkbox;
    private final Controls controls;

    @NotNull
    private final List<DynamicElementVO> dynamicElements;
    private final long id;
    private final ProductVO product;
    private final boolean roundBottom;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0003\u0010\u0012R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v1/presentation/item/CartSplitV2ItemVO$Checkbox;", "", "", "isSelected", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "<init>", "(ZLru/ozon/uni/atoms/af/AtomAction;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "()Z", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Checkbox {
        public static final int $stable = AtomAction.$stable;
        private final AtomAction action;
        private final boolean isSelected;

        public Checkbox(boolean z11, AtomAction atomAction) {
            this.isSelected = z11;
            this.action = atomAction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Checkbox)) {
                return false;
            }
            Checkbox checkbox = (Checkbox) other;
            return this.isSelected == checkbox.isSelected && Intrinsics.d(this.action, checkbox.action);
        }

        public final AtomAction getAction() {
            return this.action;
        }

        public int hashCode() {
            int hashCode = Boolean.hashCode(this.isSelected) * 31;
            AtomAction atomAction = this.action;
            return hashCode + (atomAction == null ? 0 : atomAction.hashCode());
        }

        /* renamed from: isSelected, reason: from getter */
        public final boolean getIsSelected() {
            return this.isSelected;
        }

        @NotNull
        public String toString() {
            return "Checkbox(isSelected=" + this.isSelected + ", action=" + this.action + ")";
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\"#B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b \u0010!¨\u0006$"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v1/presentation/item/CartSplitV2ItemVO$Controls;", "", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;", "favoriteProduct", "Lru/ozon/app/android/cart/cartSplitV2/v1/presentation/item/CartSplitV2ItemVO$Controls$RemoveControl;", ProductAction.ACTION_REMOVE, "Lru/ozon/app/android/cart/cartSplitV2/v1/presentation/item/CartSplitV2ItemVO$Controls$QuantityControl;", "quantity", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "buyInOneClick", "<init>", "(Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;Lru/ozon/app/android/cart/cartSplitV2/v1/presentation/item/CartSplitV2ItemVO$Controls$RemoveControl;Lru/ozon/app/android/cart/cartSplitV2/v1/presentation/item/CartSplitV2ItemVO$Controls$QuantityControl;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;", "getFavoriteProduct", "()Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;", "Lru/ozon/app/android/cart/cartSplitV2/v1/presentation/item/CartSplitV2ItemVO$Controls$RemoveControl;", "getRemove", "()Lru/ozon/app/android/cart/cartSplitV2/v1/presentation/item/CartSplitV2ItemVO$Controls$RemoveControl;", "Lru/ozon/app/android/cart/cartSplitV2/v1/presentation/item/CartSplitV2ItemVO$Controls$QuantityControl;", "getQuantity", "()Lru/ozon/app/android/cart/cartSplitV2/v1/presentation/item/CartSplitV2ItemVO$Controls$QuantityControl;", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getBuyInOneClick", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "RemoveControl", "QuantityControl", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Controls {
        private final ButtonV3DTO buyInOneClick;

        @NotNull
        private final FavoriteProductMolecule favoriteProduct;
        private final QuantityControl quantity;

        @NotNull
        private final RemoveControl remove;

        @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f\u0012\u000e\u0010\u000e\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001f\u0010\u0018R\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b \u0010\u0018\"\u0004\b!\u0010\"R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b&\u0010\u0018R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010'\u001a\u0004\b(\u0010)R\u001f\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f8\u0006¢\u0006\f\n\u0004\b\r\u0010*\u001a\u0004\b+\u0010,R\u001f\u0010\u000e\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010*\u001a\u0004\b-\u0010,R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001d\u001a\u0004\b1\u0010\u0018¨\u00062"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v1/presentation/item/CartSplitV2ItemVO$Controls$QuantityControl;", "", "", "minimum", "maximum", "current", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "multiplicity", "", "debounceDelay", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "incrementTrackingInfo", "decrementTrackingInfo", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "controlsLockNotification", "quantSize", "<init>", "(IIILru/ozon/uni/atoms/af/AtomAction;ILjava/lang/Long;LWZ/t;LWZ/t;Lru/ozon/uni/atoms/data/notification/NotificationDTO;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getMinimum", "getMaximum", "getCurrent", "setCurrent", "(I)V", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "getMultiplicity", "Ljava/lang/Long;", "getDebounceDelay", "()Ljava/lang/Long;", "LWZ/t;", "getIncrementTrackingInfo", "()LWZ/t;", "getDecrementTrackingInfo", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "getControlsLockNotification", "()Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "getQuantSize", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class QuantityControl {

            @NotNull
            private final AtomAction action;
            private final NotificationDTO controlsLockNotification;
            private int current;
            private final Long debounceDelay;
            private final t decrementTrackingInfo;
            private final t incrementTrackingInfo;
            private final int maximum;
            private final int minimum;
            private final int multiplicity;
            private final int quantSize;

            public QuantityControl(int i11, int i12, int i13, @NotNull AtomAction action, int i14, Long l11, t tVar, t tVar2, NotificationDTO notificationDTO, int i15) {
                Intrinsics.checkNotNullParameter(action, "action");
                this.minimum = i11;
                this.maximum = i12;
                this.current = i13;
                this.action = action;
                this.multiplicity = i14;
                this.debounceDelay = l11;
                this.incrementTrackingInfo = tVar;
                this.decrementTrackingInfo = tVar2;
                this.controlsLockNotification = notificationDTO;
                this.quantSize = i15;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof QuantityControl)) {
                    return false;
                }
                QuantityControl quantityControl = (QuantityControl) other;
                return this.minimum == quantityControl.minimum && this.maximum == quantityControl.maximum && this.current == quantityControl.current && Intrinsics.d(this.action, quantityControl.action) && this.multiplicity == quantityControl.multiplicity && Intrinsics.d(this.debounceDelay, quantityControl.debounceDelay) && Intrinsics.d(this.incrementTrackingInfo, quantityControl.incrementTrackingInfo) && Intrinsics.d(this.decrementTrackingInfo, quantityControl.decrementTrackingInfo) && Intrinsics.d(this.controlsLockNotification, quantityControl.controlsLockNotification) && this.quantSize == quantityControl.quantSize;
            }

            @NotNull
            public final AtomAction getAction() {
                return this.action;
            }

            public final NotificationDTO getControlsLockNotification() {
                return this.controlsLockNotification;
            }

            public final int getCurrent() {
                return this.current;
            }

            public final Long getDebounceDelay() {
                return this.debounceDelay;
            }

            public final t getDecrementTrackingInfo() {
                return this.decrementTrackingInfo;
            }

            public final t getIncrementTrackingInfo() {
                return this.incrementTrackingInfo;
            }

            public final int getMaximum() {
                return this.maximum;
            }

            public final int getMinimum() {
                return this.minimum;
            }

            public final int getMultiplicity() {
                return this.multiplicity;
            }

            public final int getQuantSize() {
                return this.quantSize;
            }

            public int hashCode() {
                int a11 = C2454a.a(this.multiplicity, C4598rp.a(this.action, C2454a.a(this.current, C2454a.a(this.maximum, Integer.hashCode(this.minimum) * 31, 31), 31), 31), 31);
                Long l11 = this.debounceDelay;
                int hashCode = (a11 + (l11 == null ? 0 : l11.hashCode())) * 31;
                t tVar = this.incrementTrackingInfo;
                int hashCode2 = (hashCode + (tVar == null ? 0 : tVar.hashCode())) * 31;
                t tVar2 = this.decrementTrackingInfo;
                int hashCode3 = (hashCode2 + (tVar2 == null ? 0 : tVar2.hashCode())) * 31;
                NotificationDTO notificationDTO = this.controlsLockNotification;
                return Integer.hashCode(this.quantSize) + ((hashCode3 + (notificationDTO != null ? notificationDTO.hashCode() : 0)) * 31);
            }

            public final void setCurrent(int i11) {
                this.current = i11;
            }

            @NotNull
            public String toString() {
                int i11 = this.minimum;
                int i12 = this.maximum;
                int i13 = this.current;
                AtomAction atomAction = this.action;
                int i14 = this.multiplicity;
                Long l11 = this.debounceDelay;
                t tVar = this.incrementTrackingInfo;
                t tVar2 = this.decrementTrackingInfo;
                NotificationDTO notificationDTO = this.controlsLockNotification;
                int i15 = this.quantSize;
                StringBuilder a11 = C2438a.a("QuantityControl(minimum=", i11, ", maximum=", ", current=", i12);
                a11.append(i13);
                a11.append(", action=");
                a11.append(atomAction);
                a11.append(", multiplicity=");
                a11.append(i14);
                a11.append(", debounceDelay=");
                a11.append(l11);
                a11.append(", incrementTrackingInfo=");
                a11.append(tVar);
                a11.append(", decrementTrackingInfo=");
                a11.append(tVar2);
                a11.append(", controlsLockNotification=");
                a11.append(notificationDTO);
                a11.append(", quantSize=");
                a11.append(i15);
                a11.append(")");
                return a11.toString();
            }
        }

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\t\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\rR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001f\u0010\t\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v1/presentation/item/CartSplitV2ItemVO$Controls$RemoveControl;", "", "", "icon", "tintColor", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "trackingInfo", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getIcon", "getTintColor", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "getTrackingInfo", "()LWZ/t;", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class RemoveControl {
            private final AtomAction action;

            @NotNull
            private final String icon;

            @NotNull
            private final String tintColor;
            private final t trackingInfo;

            public RemoveControl(@NotNull String icon, @NotNull String tintColor, AtomAction atomAction, t tVar) {
                Intrinsics.checkNotNullParameter(icon, "icon");
                Intrinsics.checkNotNullParameter(tintColor, "tintColor");
                this.icon = icon;
                this.tintColor = tintColor;
                this.action = atomAction;
                this.trackingInfo = tVar;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof RemoveControl)) {
                    return false;
                }
                RemoveControl removeControl = (RemoveControl) other;
                return Intrinsics.d(this.icon, removeControl.icon) && Intrinsics.d(this.tintColor, removeControl.tintColor) && Intrinsics.d(this.action, removeControl.action) && Intrinsics.d(this.trackingInfo, removeControl.trackingInfo);
            }

            public final AtomAction getAction() {
                return this.action;
            }

            @NotNull
            public final String getIcon() {
                return this.icon;
            }

            @NotNull
            public final String getTintColor() {
                return this.tintColor;
            }

            public int hashCode() {
                int a11 = g.a(this.icon.hashCode() * 31, 31, this.tintColor);
                AtomAction atomAction = this.action;
                int hashCode = (a11 + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
                t tVar = this.trackingInfo;
                return hashCode + (tVar != null ? tVar.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                String str = this.icon;
                String str2 = this.tintColor;
                return C2859b.e(this.trackingInfo, ", trackingInfo=", ")", C3660k.d("RemoveControl(icon=", str, ", tintColor=", str2, ", action="), this.action);
            }
        }

        public Controls(@NotNull FavoriteProductMolecule favoriteProduct, @NotNull RemoveControl remove, QuantityControl quantityControl, ButtonV3DTO buttonV3DTO) {
            Intrinsics.checkNotNullParameter(favoriteProduct, "favoriteProduct");
            Intrinsics.checkNotNullParameter(remove, "remove");
            this.favoriteProduct = favoriteProduct;
            this.remove = remove;
            this.quantity = quantityControl;
            this.buyInOneClick = buttonV3DTO;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Controls)) {
                return false;
            }
            Controls controls = (Controls) other;
            return Intrinsics.d(this.favoriteProduct, controls.favoriteProduct) && Intrinsics.d(this.remove, controls.remove) && Intrinsics.d(this.quantity, controls.quantity) && Intrinsics.d(this.buyInOneClick, controls.buyInOneClick);
        }

        public final ButtonV3DTO getBuyInOneClick() {
            return this.buyInOneClick;
        }

        @NotNull
        public final FavoriteProductMolecule getFavoriteProduct() {
            return this.favoriteProduct;
        }

        public final QuantityControl getQuantity() {
            return this.quantity;
        }

        @NotNull
        public final RemoveControl getRemove() {
            return this.remove;
        }

        public int hashCode() {
            int hashCode = (this.remove.hashCode() + (this.favoriteProduct.hashCode() * 31)) * 31;
            QuantityControl quantityControl = this.quantity;
            int hashCode2 = (hashCode + (quantityControl == null ? 0 : quantityControl.hashCode())) * 31;
            ButtonV3DTO buttonV3DTO = this.buyInOneClick;
            return hashCode2 + (buttonV3DTO != null ? buttonV3DTO.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Controls(favoriteProduct=" + this.favoriteProduct + ", remove=" + this.remove + ", quantity=" + this.quantity + ", buyInOneClick=" + this.buyInOneClick + ")";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CartSplitV2ItemVO(long j11, Checkbox checkbox, ProductVO productVO, @NotNull List<? extends DynamicElementVO> dynamicElements, Controls controls, boolean z11) {
        Intrinsics.checkNotNullParameter(dynamicElements, "dynamicElements");
        this.id = j11;
        this.checkbox = checkbox;
        this.product = productVO;
        this.dynamicElements = dynamicElements;
        this.controls = controls;
        this.roundBottom = z11;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CartSplitV2ItemVO)) {
            return false;
        }
        CartSplitV2ItemVO cartSplitV2ItemVO = (CartSplitV2ItemVO) other;
        return this.id == cartSplitV2ItemVO.id && Intrinsics.d(this.checkbox, cartSplitV2ItemVO.checkbox) && Intrinsics.d(this.product, cartSplitV2ItemVO.product) && Intrinsics.d(this.dynamicElements, cartSplitV2ItemVO.dynamicElements) && Intrinsics.d(this.controls, cartSplitV2ItemVO.controls) && this.roundBottom == cartSplitV2ItemVO.roundBottom;
    }

    public final Checkbox getCheckbox() {
        return this.checkbox;
    }

    public final Controls getControls() {
        return this.controls;
    }

    @NotNull
    public final List<DynamicElementVO> getDynamicElements() {
        return this.dynamicElements;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final ProductVO getProduct() {
        return this.product;
    }

    public final boolean getRoundBottom() {
        return this.roundBottom;
    }

    @Override // l20.c
    @NotNull
    public Integer getScrollWidgetKey() {
        String id2;
        ProductVO productVO = this.product;
        return Integer.valueOf((productVO == null || (id2 = productVO.getId()) == null) ? Long.hashCode(getId()) : id2.hashCode());
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        Checkbox checkbox = this.checkbox;
        int hashCode2 = (hashCode + (checkbox == null ? 0 : checkbox.hashCode())) * 31;
        ProductVO productVO = this.product;
        int b11 = g.b((hashCode2 + (productVO == null ? 0 : productVO.hashCode())) * 31, 31, this.dynamicElements);
        Controls controls = this.controls;
        return Boolean.hashCode(this.roundBottom) + ((b11 + (controls != null ? controls.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        return "CartSplitV2ItemVO(id=" + this.id + ", checkbox=" + this.checkbox + ", product=" + this.product + ", dynamicElements=" + this.dynamicElements + ", controls=" + this.controls + ", roundBottom=" + this.roundBottom + ")";
    }
}
