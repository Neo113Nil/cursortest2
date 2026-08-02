package ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation;

import Am.C2438a;
import B0.C2454a;
import Ve.C4598rp;
import WZ.t;
import Xc.a;
import Xc.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.ui.rightIconButtonView.RightIconButtonDTO;
import ru.ozon.app.android.cart.ui.tooltip.molecule.TooltipWithOnboardingActionVO;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMolecule;
import ru.ozon.uni.R$style;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001:\u0002./BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u001e\u001a\u0004\b*\u0010 R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010+\u001a\u0004\b,\u0010-¨\u00060"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/ControlsVO;", "", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;", "favoriteProduct", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "removeButton", "Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/ControlsVO$QuantityControl;", "quantity", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "buyInOneClick", "Lru/ozon/app/android/cart/ui/rightIconButtonView/RightIconButtonDTO;", "buyForStars", "moveButton", "Lru/ozon/app/android/cart/ui/tooltip/molecule/TooltipWithOnboardingActionVO;", "moveButtonTooltipWithAction", "<init>", "(Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/ControlsVO$QuantityControl;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/app/android/cart/ui/rightIconButtonView/RightIconButtonDTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/app/android/cart/ui/tooltip/molecule/TooltipWithOnboardingActionVO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;", "getFavoriteProduct", "()Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getRemoveButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/ControlsVO$QuantityControl;", "getQuantity", "()Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/ControlsVO$QuantityControl;", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getBuyInOneClick", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "Lru/ozon/app/android/cart/ui/rightIconButtonView/RightIconButtonDTO;", "getBuyForStars", "()Lru/ozon/app/android/cart/ui/rightIconButtonView/RightIconButtonDTO;", "getMoveButton", "Lru/ozon/app/android/cart/ui/tooltip/molecule/TooltipWithOnboardingActionVO;", "getMoveButtonTooltipWithAction", "()Lru/ozon/app/android/cart/ui/tooltip/molecule/TooltipWithOnboardingActionVO;", "QuantityControl", "DecrementRemove", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ControlsVO {
    private final RightIconButtonDTO buyForStars;
    private final ButtonV3DTO buyInOneClick;

    @NotNull
    private final FavoriteProductMolecule favoriteProduct;
    private final IconButtonV3DTO moveButton;
    private final TooltipWithOnboardingActionVO moveButtonTooltipWithAction;
    private final QuantityControl quantity;

    @NotNull
    private final IconButtonV3DTO removeButton;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/ControlsVO$DecrementRemove;", "", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "<init>", "(LWZ/t;Lru/ozon/uni/atoms/af/AtomAction;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DecrementRemove {

        @NotNull
        private final AtomAction action;

        @NotNull
        private final t tokenizedEvent;

        public DecrementRemove(@NotNull t tokenizedEvent, @NotNull AtomAction action) {
            Intrinsics.checkNotNullParameter(tokenizedEvent, "tokenizedEvent");
            Intrinsics.checkNotNullParameter(action, "action");
            this.tokenizedEvent = tokenizedEvent;
            this.action = action;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DecrementRemove)) {
                return false;
            }
            DecrementRemove decrementRemove = (DecrementRemove) other;
            return Intrinsics.d(this.tokenizedEvent, decrementRemove.tokenizedEvent) && Intrinsics.d(this.action, decrementRemove.action);
        }

        @NotNull
        public final AtomAction getAction() {
            return this.action;
        }

        @NotNull
        public final t getTokenizedEvent() {
            return this.tokenizedEvent;
        }

        public int hashCode() {
            return this.action.hashCode() + (this.tokenizedEvent.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "DecrementRemove(tokenizedEvent=" + this.tokenizedEvent + ", action=" + this.action + ")";
        }
    }

    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u001f\b\u0087\b\u0018\u00002\u00020\u0001:\u0001<B}\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f\u0012\u000e\u0010\u000e\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b#\u0010\u001cR\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010!\u001a\u0004\b$\u0010\u001c\"\u0004\b%\u0010&R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b*\u0010\u001cR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010+\u001a\u0004\b,\u0010-R\u001f\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f8\u0006¢\u0006\f\n\u0004\b\r\u0010.\u001a\u0004\b/\u00100R\u001f\u0010\u000e\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010.\u001a\u0004\b1\u00100R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u00102\u001a\u0004\b3\u00104R\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010!\u001a\u0004\b5\u0010\u001cR\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u00106\u001a\u0004\b7\u00108R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u00109\u001a\u0004\b:\u0010;¨\u0006="}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/ControlsVO$QuantityControl;", "", "", "minimum", "maximum", "current", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "multiplicity", "", "debounceDelay", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "incrementTrackingInfo", "decrementTrackingInfo", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "controlsLockNotification", "quantSize", "Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/ControlsVO$QuantityControl$QuantityStyle;", "style", "Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/ControlsVO$DecrementRemove;", "decrementRemove", "<init>", "(IIILru/ozon/uni/atoms/af/AtomAction;ILjava/lang/Long;LWZ/t;LWZ/t;Lru/ozon/uni/atoms/data/notification/NotificationDTO;ILru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/ControlsVO$QuantityControl$QuantityStyle;Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/ControlsVO$DecrementRemove;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getMinimum", "getMaximum", "getCurrent", "setCurrent", "(I)V", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "getMultiplicity", "Ljava/lang/Long;", "getDebounceDelay", "()Ljava/lang/Long;", "LWZ/t;", "getIncrementTrackingInfo", "()LWZ/t;", "getDecrementTrackingInfo", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "getControlsLockNotification", "()Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "getQuantSize", "Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/ControlsVO$QuantityControl$QuantityStyle;", "getStyle", "()Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/ControlsVO$QuantityControl$QuantityStyle;", "Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/ControlsVO$DecrementRemove;", "getDecrementRemove", "()Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/ControlsVO$DecrementRemove;", "QuantityStyle", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class QuantityControl {

        @NotNull
        private final AtomAction action;
        private final NotificationDTO controlsLockNotification;
        private int current;
        private final Long debounceDelay;
        private final DecrementRemove decrementRemove;
        private final t decrementTrackingInfo;
        private final t incrementTrackingInfo;
        private final int maximum;
        private final int minimum;
        private final int multiplicity;
        private final int quantSize;

        @NotNull
        private final QuantityStyle style;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B!\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/ControlsVO$QuantityControl$QuantityStyle;", "", "increaseBtn", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "decreaseBtn", "styleRes", "", "<init>", "(Ljava/lang/String;ILru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;I)V", "getIncreaseBtn", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getDecreaseBtn", "getStyleRes", "()I", "CART_COUNT_PICKER", "CUSTOM_DS_COUNT_PICKER", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class QuantityStyle {
            private static final /* synthetic */ a $ENTRIES;
            private static final /* synthetic */ QuantityStyle[] $VALUES;
            public static final QuantityStyle CART_COUNT_PICKER;
            public static final QuantityStyle CUSTOM_DS_COUNT_PICKER;

            @NotNull
            private final IconButtonV3DTO decreaseBtn;

            @NotNull
            private final IconButtonV3DTO increaseBtn;
            private final int styleRes;

            private static final /* synthetic */ QuantityStyle[] $values() {
                return new QuantityStyle[]{CART_COUNT_PICKER, CUSTOM_DS_COUNT_PICKER};
            }

            static {
                IconButtonV3DTO.Sizes sizes = IconButtonV3DTO.Sizes.SIZE_400;
                IconButtonV3DTO.IconButtonShape iconButtonShape = IconButtonV3DTO.IconButtonShape.SHAPE_SQUARE;
                ButtonV3DTO.StyleTypes styleTypes = ButtonV3DTO.StyleTypes.ACTION_SECONDARY;
                AtomActionDTO.Behavior behavior = AtomActionDTO.Behavior.CUSTOM;
                CART_COUNT_PICKER = new QuantityStyle("CART_COUNT_PICKER", 0, new IconButtonV3DTO(sizes, styleTypes, iconButtonShape, "ic_s_plus", null, null, null, new CommonControlSettings(new AtomActionDTO(behavior, null, null, null, 14, null), null, null, 6, null), null, null, null, null, null, null, 16240, null), new IconButtonV3DTO(sizes, styleTypes, iconButtonShape, "ic_s_minus", null, null, null, new CommonControlSettings(new AtomActionDTO(behavior, null, null, null, 14, null), null, null, 6, null), null, null, null, null, null, null, 16240, null), R$style.ButtonV3View_ActionSecondary);
                ButtonV3DTO.StyleTypes styleTypes2 = ButtonV3DTO.StyleTypes.CUSTOM;
                CUSTOM_DS_COUNT_PICKER = new QuantityStyle("CUSTOM_DS_COUNT_PICKER", 1, new IconButtonV3DTO(sizes, styleTypes2, iconButtonShape, "ic_s_plus_sign_filled", null, null, null, new CommonControlSettings(new AtomActionDTO(behavior, null, null, null, 14, null), null, null, 6, null), null, null, null, null, null, null, 16240, null), new IconButtonV3DTO(sizes, styleTypes2, iconButtonShape, "ic_s_minus_filled", null, null, null, new CommonControlSettings(new AtomActionDTO(behavior, null, null, null, 14, null), null, null, 6, null), null, null, null, null, null, null, 16240, null), ru.ozon.app.android.cart.feature.R$style.ButtonV3DsCountPicker);
                QuantityStyle[] $values = $values();
                $VALUES = $values;
                $ENTRIES = b.a($values);
            }

            private QuantityStyle(String str, int i11, IconButtonV3DTO iconButtonV3DTO, IconButtonV3DTO iconButtonV3DTO2, int i12) {
                this.increaseBtn = iconButtonV3DTO;
                this.decreaseBtn = iconButtonV3DTO2;
                this.styleRes = i12;
            }

            public static QuantityStyle valueOf(String str) {
                return (QuantityStyle) Enum.valueOf(QuantityStyle.class, str);
            }

            public static QuantityStyle[] values() {
                return (QuantityStyle[]) $VALUES.clone();
            }

            @NotNull
            public final IconButtonV3DTO getDecreaseBtn() {
                return this.decreaseBtn;
            }

            @NotNull
            public final IconButtonV3DTO getIncreaseBtn() {
                return this.increaseBtn;
            }

            public final int getStyleRes() {
                return this.styleRes;
            }
        }

        public QuantityControl(int i11, int i12, int i13, @NotNull AtomAction action, int i14, Long l11, t tVar, t tVar2, NotificationDTO notificationDTO, int i15, @NotNull QuantityStyle style, DecrementRemove decrementRemove) {
            Intrinsics.checkNotNullParameter(action, "action");
            Intrinsics.checkNotNullParameter(style, "style");
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
            this.style = style;
            this.decrementRemove = decrementRemove;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof QuantityControl)) {
                return false;
            }
            QuantityControl quantityControl = (QuantityControl) other;
            return this.minimum == quantityControl.minimum && this.maximum == quantityControl.maximum && this.current == quantityControl.current && Intrinsics.d(this.action, quantityControl.action) && this.multiplicity == quantityControl.multiplicity && Intrinsics.d(this.debounceDelay, quantityControl.debounceDelay) && Intrinsics.d(this.incrementTrackingInfo, quantityControl.incrementTrackingInfo) && Intrinsics.d(this.decrementTrackingInfo, quantityControl.decrementTrackingInfo) && Intrinsics.d(this.controlsLockNotification, quantityControl.controlsLockNotification) && this.quantSize == quantityControl.quantSize && this.style == quantityControl.style && Intrinsics.d(this.decrementRemove, quantityControl.decrementRemove);
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

        public final DecrementRemove getDecrementRemove() {
            return this.decrementRemove;
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

        @NotNull
        public final QuantityStyle getStyle() {
            return this.style;
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
            int hashCode4 = (this.style.hashCode() + C2454a.a(this.quantSize, (hashCode3 + (notificationDTO == null ? 0 : notificationDTO.hashCode())) * 31, 31)) * 31;
            DecrementRemove decrementRemove = this.decrementRemove;
            return hashCode4 + (decrementRemove != null ? decrementRemove.hashCode() : 0);
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
            QuantityStyle quantityStyle = this.style;
            DecrementRemove decrementRemove = this.decrementRemove;
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
            a11.append(", style=");
            a11.append(quantityStyle);
            a11.append(", decrementRemove=");
            a11.append(decrementRemove);
            a11.append(")");
            return a11.toString();
        }
    }

    public ControlsVO(@NotNull FavoriteProductMolecule favoriteProduct, @NotNull IconButtonV3DTO removeButton, QuantityControl quantityControl, ButtonV3DTO buttonV3DTO, RightIconButtonDTO rightIconButtonDTO, IconButtonV3DTO iconButtonV3DTO, TooltipWithOnboardingActionVO tooltipWithOnboardingActionVO) {
        Intrinsics.checkNotNullParameter(favoriteProduct, "favoriteProduct");
        Intrinsics.checkNotNullParameter(removeButton, "removeButton");
        this.favoriteProduct = favoriteProduct;
        this.removeButton = removeButton;
        this.quantity = quantityControl;
        this.buyInOneClick = buttonV3DTO;
        this.buyForStars = rightIconButtonDTO;
        this.moveButton = iconButtonV3DTO;
        this.moveButtonTooltipWithAction = tooltipWithOnboardingActionVO;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ControlsVO)) {
            return false;
        }
        ControlsVO controlsVO = (ControlsVO) other;
        return Intrinsics.d(this.favoriteProduct, controlsVO.favoriteProduct) && Intrinsics.d(this.removeButton, controlsVO.removeButton) && Intrinsics.d(this.quantity, controlsVO.quantity) && Intrinsics.d(this.buyInOneClick, controlsVO.buyInOneClick) && Intrinsics.d(this.buyForStars, controlsVO.buyForStars) && Intrinsics.d(this.moveButton, controlsVO.moveButton) && Intrinsics.d(this.moveButtonTooltipWithAction, controlsVO.moveButtonTooltipWithAction);
    }

    public final RightIconButtonDTO getBuyForStars() {
        return this.buyForStars;
    }

    public final ButtonV3DTO getBuyInOneClick() {
        return this.buyInOneClick;
    }

    @NotNull
    public final FavoriteProductMolecule getFavoriteProduct() {
        return this.favoriteProduct;
    }

    public final IconButtonV3DTO getMoveButton() {
        return this.moveButton;
    }

    public final TooltipWithOnboardingActionVO getMoveButtonTooltipWithAction() {
        return this.moveButtonTooltipWithAction;
    }

    public final QuantityControl getQuantity() {
        return this.quantity;
    }

    @NotNull
    public final IconButtonV3DTO getRemoveButton() {
        return this.removeButton;
    }

    public int hashCode() {
        int c11 = GR.b.c(this.removeButton, this.favoriteProduct.hashCode() * 31, 31);
        QuantityControl quantityControl = this.quantity;
        int hashCode = (c11 + (quantityControl == null ? 0 : quantityControl.hashCode())) * 31;
        ButtonV3DTO buttonV3DTO = this.buyInOneClick;
        int hashCode2 = (hashCode + (buttonV3DTO == null ? 0 : buttonV3DTO.hashCode())) * 31;
        RightIconButtonDTO rightIconButtonDTO = this.buyForStars;
        int hashCode3 = (hashCode2 + (rightIconButtonDTO == null ? 0 : rightIconButtonDTO.hashCode())) * 31;
        IconButtonV3DTO iconButtonV3DTO = this.moveButton;
        int hashCode4 = (hashCode3 + (iconButtonV3DTO == null ? 0 : iconButtonV3DTO.hashCode())) * 31;
        TooltipWithOnboardingActionVO tooltipWithOnboardingActionVO = this.moveButtonTooltipWithAction;
        return hashCode4 + (tooltipWithOnboardingActionVO != null ? tooltipWithOnboardingActionVO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ControlsVO(favoriteProduct=" + this.favoriteProduct + ", removeButton=" + this.removeButton + ", quantity=" + this.quantity + ", buyInOneClick=" + this.buyInOneClick + ", buyForStars=" + this.buyForStars + ", moveButton=" + this.moveButton + ", moveButtonTooltipWithAction=" + this.moveButtonTooltipWithAction + ")";
    }
}
