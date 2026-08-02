package ru.ozon.app.android.cart.cartSplitV2.v2.data;

import Am.C2438a;
import B0.C2454a;
import Xc.a;
import Xc.b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.cart.ui.rightIconButtonView.RightIconButtonDTO;
import ru.ozon.app.android.cart.ui.tooltip.molecule.TooltipWithOnboardingActionDTO;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMolecule;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002-.BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u000eHÆ\u0003JY\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020*HÖ\u0001J\t\u0010+\u001a\u00020,HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006/"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v2/data/ControlsDTO;", "", "favoriteProduct", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;", "removeButton", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "quantity", "Lru/ozon/app/android/cart/cartSplitV2/v2/data/ControlsDTO$QuantityControl;", "buyInOneClick", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "buyForStars", "Lru/ozon/app/android/cart/ui/rightIconButtonView/RightIconButtonDTO;", "moveButton", "moveButtonTooltipWithAction", "Lru/ozon/app/android/cart/ui/tooltip/molecule/TooltipWithOnboardingActionDTO;", "<init>", "(Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/app/android/cart/cartSplitV2/v2/data/ControlsDTO$QuantityControl;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/app/android/cart/ui/rightIconButtonView/RightIconButtonDTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/app/android/cart/ui/tooltip/molecule/TooltipWithOnboardingActionDTO;)V", "getFavoriteProduct", "()Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;", "getRemoveButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getQuantity", "()Lru/ozon/app/android/cart/cartSplitV2/v2/data/ControlsDTO$QuantityControl;", "getBuyInOneClick", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getBuyForStars", "()Lru/ozon/app/android/cart/ui/rightIconButtonView/RightIconButtonDTO;", "getMoveButton", "getMoveButtonTooltipWithAction", "()Lru/ozon/app/android/cart/ui/tooltip/molecule/TooltipWithOnboardingActionDTO;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "", "QuantityControl", "DecrementRemove", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class ControlsDTO {
    public static final int $stable = 8;
    private final RightIconButtonDTO buyForStars;
    private final ButtonV3DTO buyInOneClick;

    @NotNull
    private final FavoriteProductMolecule favoriteProduct;
    private final IconButtonV3DTO moveButton;
    private final TooltipWithOnboardingActionDTO moveButtonTooltipWithAction;
    private final QuantityControl quantity;

    @NotNull
    private final IconButtonV3DTO removeButton;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0007HÆ\u0003J)\u0010\u0010\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0004HÖ\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v2/data/ControlsDTO$DecrementRemove;", "", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "<init>", "(Ljava/util/Map;Lru/ozon/uni/atoms/data/AtomActionDTO;)V", "getTrackingInfo", "()Ljava/util/Map;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DecrementRemove {
        public static final int $stable = 8;

        @NotNull
        private final AtomActionDTO action;

        @NotNull
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public DecrementRemove(@NotNull Map<String, TokenizedTrackingInfo> trackingInfo, @NotNull AtomActionDTO action) {
            Intrinsics.checkNotNullParameter(trackingInfo, "trackingInfo");
            Intrinsics.checkNotNullParameter(action, "action");
            this.trackingInfo = trackingInfo;
            this.action = action;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ DecrementRemove copy$default(DecrementRemove decrementRemove, Map map, AtomActionDTO atomActionDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                map = decrementRemove.trackingInfo;
            }
            if ((i11 & 2) != 0) {
                atomActionDTO = decrementRemove.action;
            }
            return decrementRemove.copy(map, atomActionDTO);
        }

        @NotNull
        public final Map<String, TokenizedTrackingInfo> component1() {
            return this.trackingInfo;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        @NotNull
        public final DecrementRemove copy(@NotNull Map<String, TokenizedTrackingInfo> trackingInfo, @NotNull AtomActionDTO action) {
            Intrinsics.checkNotNullParameter(trackingInfo, "trackingInfo");
            Intrinsics.checkNotNullParameter(action, "action");
            return new DecrementRemove(trackingInfo, action);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DecrementRemove)) {
                return false;
            }
            DecrementRemove decrementRemove = (DecrementRemove) other;
            return Intrinsics.d(this.trackingInfo, decrementRemove.trackingInfo) && Intrinsics.d(this.action, decrementRemove.action);
        }

        @NotNull
        public final AtomActionDTO getAction() {
            return this.action;
        }

        @NotNull
        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            return this.action.hashCode() + (this.trackingInfo.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "DecrementRemove(trackingInfo=" + this.trackingInfo + ", action=" + this.action + ")";
        }
    }

    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0001BB\u008f\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f\u0012\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\t\u00102\u001a\u00020\u0007HÆ\u0003J\u0010\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010 J\u0010\u00104\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010#J\u0017\u00105\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fHÆ\u0003J\u0017\u00106\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fHÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u0010\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010 J\u000b\u00109\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0016HÆ\u0003J®\u0001\u0010;\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÆ\u0001¢\u0006\u0002\u0010<J\u0013\u0010=\u001a\u00020>2\b\u0010?\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010@\u001a\u00020\u0003HÖ\u0001J\t\u0010A\u001a\u00020\rHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0015\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010!\u001a\u0004\b\u001f\u0010 R\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010$\u001a\u0004\b\"\u0010#R\u001f\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u001f\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b'\u0010&R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010!\u001a\u0004\b*\u0010 R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.¨\u0006C"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v2/data/ControlsDTO$QuantityControl;", "", "minimum", "", "maximum", "current", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "multiplicity", "debounceDelay", "", "incrementTrackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "decrementTrackingInfo", "quantityChangeDisabledNotificationBar", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "quantSize", "style", "Lru/ozon/app/android/cart/cartSplitV2/v2/data/ControlsDTO$QuantityControl$QuantityStyle;", "decrementRemove", "Lru/ozon/app/android/cart/cartSplitV2/v2/data/ControlsDTO$DecrementRemove;", "<init>", "(IIILru/ozon/uni/atoms/data/AtomActionDTO;Ljava/lang/Integer;Ljava/lang/Long;Ljava/util/Map;Ljava/util/Map;Lru/ozon/uni/atoms/data/notification/NotificationDTO;Ljava/lang/Integer;Lru/ozon/app/android/cart/cartSplitV2/v2/data/ControlsDTO$QuantityControl$QuantityStyle;Lru/ozon/app/android/cart/cartSplitV2/v2/data/ControlsDTO$DecrementRemove;)V", "getMinimum", "()I", "getMaximum", "getCurrent", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getMultiplicity", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getDebounceDelay", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getIncrementTrackingInfo", "()Ljava/util/Map;", "getDecrementTrackingInfo", "getQuantityChangeDisabledNotificationBar", "()Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "getQuantSize", "getStyle", "()Lru/ozon/app/android/cart/cartSplitV2/v2/data/ControlsDTO$QuantityControl$QuantityStyle;", "getDecrementRemove", "()Lru/ozon/app/android/cart/cartSplitV2/v2/data/ControlsDTO$DecrementRemove;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "(IIILru/ozon/uni/atoms/data/AtomActionDTO;Ljava/lang/Integer;Ljava/lang/Long;Ljava/util/Map;Ljava/util/Map;Lru/ozon/uni/atoms/data/notification/NotificationDTO;Ljava/lang/Integer;Lru/ozon/app/android/cart/cartSplitV2/v2/data/ControlsDTO$QuantityControl$QuantityStyle;Lru/ozon/app/android/cart/cartSplitV2/v2/data/ControlsDTO$DecrementRemove;)Lru/ozon/app/android/cart/cartSplitV2/v2/data/ControlsDTO$QuantityControl;", "equals", "", "other", "hashCode", "toString", "QuantityStyle", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class QuantityControl {
        public static final int $stable = 8;

        @NotNull
        private final AtomActionDTO action;
        private final int current;
        private final Long debounceDelay;
        private final DecrementRemove decrementRemove;
        private final Map<String, TokenizedTrackingInfo> decrementTrackingInfo;
        private final Map<String, TokenizedTrackingInfo> incrementTrackingInfo;
        private final int maximum;
        private final int minimum;
        private final Integer multiplicity;
        private final Integer quantSize;
        private final NotificationDTO quantityChangeDisabledNotificationBar;
        private final QuantityStyle style;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v2/data/ControlsDTO$QuantityControl$QuantityStyle;", "", "<init>", "(Ljava/lang/String;I)V", "CART_COUNT_PICKER", "CUSTOM_DS_COUNT_PICKER", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class QuantityStyle {
            private static final /* synthetic */ a $ENTRIES;
            private static final /* synthetic */ QuantityStyle[] $VALUES;
            public static final QuantityStyle CART_COUNT_PICKER = new QuantityStyle("CART_COUNT_PICKER", 0);
            public static final QuantityStyle CUSTOM_DS_COUNT_PICKER = new QuantityStyle("CUSTOM_DS_COUNT_PICKER", 1);

            private static final /* synthetic */ QuantityStyle[] $values() {
                return new QuantityStyle[]{CART_COUNT_PICKER, CUSTOM_DS_COUNT_PICKER};
            }

            static {
                QuantityStyle[] $values = $values();
                $VALUES = $values;
                $ENTRIES = b.a($values);
            }

            private QuantityStyle(String str, int i11) {
            }

            public static QuantityStyle valueOf(String str) {
                return (QuantityStyle) Enum.valueOf(QuantityStyle.class, str);
            }

            public static QuantityStyle[] values() {
                return (QuantityStyle[]) $VALUES.clone();
            }
        }

        public QuantityControl(int i11, int i12, int i13, @NotNull AtomActionDTO action, Integer num, Long l11, Map<String, TokenizedTrackingInfo> map, Map<String, TokenizedTrackingInfo> map2, NotificationDTO notificationDTO, Integer num2, QuantityStyle quantityStyle, DecrementRemove decrementRemove) {
            Intrinsics.checkNotNullParameter(action, "action");
            this.minimum = i11;
            this.maximum = i12;
            this.current = i13;
            this.action = action;
            this.multiplicity = num;
            this.debounceDelay = l11;
            this.incrementTrackingInfo = map;
            this.decrementTrackingInfo = map2;
            this.quantityChangeDisabledNotificationBar = notificationDTO;
            this.quantSize = num2;
            this.style = quantityStyle;
            this.decrementRemove = decrementRemove;
        }

        public static /* synthetic */ QuantityControl copy$default(QuantityControl quantityControl, int i11, int i12, int i13, AtomActionDTO atomActionDTO, Integer num, Long l11, Map map, Map map2, NotificationDTO notificationDTO, Integer num2, QuantityStyle quantityStyle, DecrementRemove decrementRemove, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                i11 = quantityControl.minimum;
            }
            if ((i14 & 2) != 0) {
                i12 = quantityControl.maximum;
            }
            if ((i14 & 4) != 0) {
                i13 = quantityControl.current;
            }
            if ((i14 & 8) != 0) {
                atomActionDTO = quantityControl.action;
            }
            if ((i14 & 16) != 0) {
                num = quantityControl.multiplicity;
            }
            if ((i14 & 32) != 0) {
                l11 = quantityControl.debounceDelay;
            }
            if ((i14 & 64) != 0) {
                map = quantityControl.incrementTrackingInfo;
            }
            if ((i14 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                map2 = quantityControl.decrementTrackingInfo;
            }
            if ((i14 & 256) != 0) {
                notificationDTO = quantityControl.quantityChangeDisabledNotificationBar;
            }
            if ((i14 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                num2 = quantityControl.quantSize;
            }
            if ((i14 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                quantityStyle = quantityControl.style;
            }
            if ((i14 & 2048) != 0) {
                decrementRemove = quantityControl.decrementRemove;
            }
            QuantityStyle quantityStyle2 = quantityStyle;
            DecrementRemove decrementRemove2 = decrementRemove;
            NotificationDTO notificationDTO2 = notificationDTO;
            Integer num3 = num2;
            Map map3 = map;
            Map map4 = map2;
            Integer num4 = num;
            Long l12 = l11;
            return quantityControl.copy(i11, i12, i13, atomActionDTO, num4, l12, map3, map4, notificationDTO2, num3, quantityStyle2, decrementRemove2);
        }

        /* renamed from: component1, reason: from getter */
        public final int getMinimum() {
            return this.minimum;
        }

        /* renamed from: component10, reason: from getter */
        public final Integer getQuantSize() {
            return this.quantSize;
        }

        /* renamed from: component11, reason: from getter */
        public final QuantityStyle getStyle() {
            return this.style;
        }

        /* renamed from: component12, reason: from getter */
        public final DecrementRemove getDecrementRemove() {
            return this.decrementRemove;
        }

        /* renamed from: component2, reason: from getter */
        public final int getMaximum() {
            return this.maximum;
        }

        /* renamed from: component3, reason: from getter */
        public final int getCurrent() {
            return this.current;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        /* renamed from: component5, reason: from getter */
        public final Integer getMultiplicity() {
            return this.multiplicity;
        }

        /* renamed from: component6, reason: from getter */
        public final Long getDebounceDelay() {
            return this.debounceDelay;
        }

        public final Map<String, TokenizedTrackingInfo> component7() {
            return this.incrementTrackingInfo;
        }

        public final Map<String, TokenizedTrackingInfo> component8() {
            return this.decrementTrackingInfo;
        }

        /* renamed from: component9, reason: from getter */
        public final NotificationDTO getQuantityChangeDisabledNotificationBar() {
            return this.quantityChangeDisabledNotificationBar;
        }

        @NotNull
        public final QuantityControl copy(int minimum, int maximum, int current, @NotNull AtomActionDTO action, Integer multiplicity, Long debounceDelay, Map<String, TokenizedTrackingInfo> incrementTrackingInfo, Map<String, TokenizedTrackingInfo> decrementTrackingInfo, NotificationDTO quantityChangeDisabledNotificationBar, Integer quantSize, QuantityStyle style, DecrementRemove decrementRemove) {
            Intrinsics.checkNotNullParameter(action, "action");
            return new QuantityControl(minimum, maximum, current, action, multiplicity, debounceDelay, incrementTrackingInfo, decrementTrackingInfo, quantityChangeDisabledNotificationBar, quantSize, style, decrementRemove);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof QuantityControl)) {
                return false;
            }
            QuantityControl quantityControl = (QuantityControl) other;
            return this.minimum == quantityControl.minimum && this.maximum == quantityControl.maximum && this.current == quantityControl.current && Intrinsics.d(this.action, quantityControl.action) && Intrinsics.d(this.multiplicity, quantityControl.multiplicity) && Intrinsics.d(this.debounceDelay, quantityControl.debounceDelay) && Intrinsics.d(this.incrementTrackingInfo, quantityControl.incrementTrackingInfo) && Intrinsics.d(this.decrementTrackingInfo, quantityControl.decrementTrackingInfo) && Intrinsics.d(this.quantityChangeDisabledNotificationBar, quantityControl.quantityChangeDisabledNotificationBar) && Intrinsics.d(this.quantSize, quantityControl.quantSize) && this.style == quantityControl.style && Intrinsics.d(this.decrementRemove, quantityControl.decrementRemove);
        }

        @NotNull
        public final AtomActionDTO getAction() {
            return this.action;
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

        public final Map<String, TokenizedTrackingInfo> getDecrementTrackingInfo() {
            return this.decrementTrackingInfo;
        }

        public final Map<String, TokenizedTrackingInfo> getIncrementTrackingInfo() {
            return this.incrementTrackingInfo;
        }

        public final int getMaximum() {
            return this.maximum;
        }

        public final int getMinimum() {
            return this.minimum;
        }

        public final Integer getMultiplicity() {
            return this.multiplicity;
        }

        public final Integer getQuantSize() {
            return this.quantSize;
        }

        public final NotificationDTO getQuantityChangeDisabledNotificationBar() {
            return this.quantityChangeDisabledNotificationBar;
        }

        public final QuantityStyle getStyle() {
            return this.style;
        }

        public int hashCode() {
            int b11 = Ih.a.b(this.action, C2454a.a(this.current, C2454a.a(this.maximum, Integer.hashCode(this.minimum) * 31, 31), 31), 31);
            Integer num = this.multiplicity;
            int hashCode = (b11 + (num == null ? 0 : num.hashCode())) * 31;
            Long l11 = this.debounceDelay;
            int hashCode2 = (hashCode + (l11 == null ? 0 : l11.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.incrementTrackingInfo;
            int hashCode3 = (hashCode2 + (map == null ? 0 : map.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map2 = this.decrementTrackingInfo;
            int hashCode4 = (hashCode3 + (map2 == null ? 0 : map2.hashCode())) * 31;
            NotificationDTO notificationDTO = this.quantityChangeDisabledNotificationBar;
            int hashCode5 = (hashCode4 + (notificationDTO == null ? 0 : notificationDTO.hashCode())) * 31;
            Integer num2 = this.quantSize;
            int hashCode6 = (hashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
            QuantityStyle quantityStyle = this.style;
            int hashCode7 = (hashCode6 + (quantityStyle == null ? 0 : quantityStyle.hashCode())) * 31;
            DecrementRemove decrementRemove = this.decrementRemove;
            return hashCode7 + (decrementRemove != null ? decrementRemove.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            int i11 = this.minimum;
            int i12 = this.maximum;
            int i13 = this.current;
            AtomActionDTO atomActionDTO = this.action;
            Integer num = this.multiplicity;
            Long l11 = this.debounceDelay;
            Map<String, TokenizedTrackingInfo> map = this.incrementTrackingInfo;
            Map<String, TokenizedTrackingInfo> map2 = this.decrementTrackingInfo;
            NotificationDTO notificationDTO = this.quantityChangeDisabledNotificationBar;
            Integer num2 = this.quantSize;
            QuantityStyle quantityStyle = this.style;
            DecrementRemove decrementRemove = this.decrementRemove;
            StringBuilder a11 = C2438a.a("QuantityControl(minimum=", i11, ", maximum=", ", current=", i12);
            a11.append(i13);
            a11.append(", action=");
            a11.append(atomActionDTO);
            a11.append(", multiplicity=");
            a11.append(num);
            a11.append(", debounceDelay=");
            a11.append(l11);
            a11.append(", incrementTrackingInfo=");
            Tl.b.g(a11, map, ", decrementTrackingInfo=", map2, ", quantityChangeDisabledNotificationBar=");
            a11.append(notificationDTO);
            a11.append(", quantSize=");
            a11.append(num2);
            a11.append(", style=");
            a11.append(quantityStyle);
            a11.append(", decrementRemove=");
            a11.append(decrementRemove);
            a11.append(")");
            return a11.toString();
        }
    }

    public ControlsDTO(@NotNull FavoriteProductMolecule favoriteProduct, @NotNull IconButtonV3DTO removeButton, QuantityControl quantityControl, ButtonV3DTO buttonV3DTO, RightIconButtonDTO rightIconButtonDTO, IconButtonV3DTO iconButtonV3DTO, TooltipWithOnboardingActionDTO tooltipWithOnboardingActionDTO) {
        Intrinsics.checkNotNullParameter(favoriteProduct, "favoriteProduct");
        Intrinsics.checkNotNullParameter(removeButton, "removeButton");
        this.favoriteProduct = favoriteProduct;
        this.removeButton = removeButton;
        this.quantity = quantityControl;
        this.buyInOneClick = buttonV3DTO;
        this.buyForStars = rightIconButtonDTO;
        this.moveButton = iconButtonV3DTO;
        this.moveButtonTooltipWithAction = tooltipWithOnboardingActionDTO;
    }

    public static /* synthetic */ ControlsDTO copy$default(ControlsDTO controlsDTO, FavoriteProductMolecule favoriteProductMolecule, IconButtonV3DTO iconButtonV3DTO, QuantityControl quantityControl, ButtonV3DTO buttonV3DTO, RightIconButtonDTO rightIconButtonDTO, IconButtonV3DTO iconButtonV3DTO2, TooltipWithOnboardingActionDTO tooltipWithOnboardingActionDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            favoriteProductMolecule = controlsDTO.favoriteProduct;
        }
        if ((i11 & 2) != 0) {
            iconButtonV3DTO = controlsDTO.removeButton;
        }
        if ((i11 & 4) != 0) {
            quantityControl = controlsDTO.quantity;
        }
        if ((i11 & 8) != 0) {
            buttonV3DTO = controlsDTO.buyInOneClick;
        }
        if ((i11 & 16) != 0) {
            rightIconButtonDTO = controlsDTO.buyForStars;
        }
        if ((i11 & 32) != 0) {
            iconButtonV3DTO2 = controlsDTO.moveButton;
        }
        if ((i11 & 64) != 0) {
            tooltipWithOnboardingActionDTO = controlsDTO.moveButtonTooltipWithAction;
        }
        IconButtonV3DTO iconButtonV3DTO3 = iconButtonV3DTO2;
        TooltipWithOnboardingActionDTO tooltipWithOnboardingActionDTO2 = tooltipWithOnboardingActionDTO;
        RightIconButtonDTO rightIconButtonDTO2 = rightIconButtonDTO;
        QuantityControl quantityControl2 = quantityControl;
        return controlsDTO.copy(favoriteProductMolecule, iconButtonV3DTO, quantityControl2, buttonV3DTO, rightIconButtonDTO2, iconButtonV3DTO3, tooltipWithOnboardingActionDTO2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final FavoriteProductMolecule getFavoriteProduct() {
        return this.favoriteProduct;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final IconButtonV3DTO getRemoveButton() {
        return this.removeButton;
    }

    /* renamed from: component3, reason: from getter */
    public final QuantityControl getQuantity() {
        return this.quantity;
    }

    /* renamed from: component4, reason: from getter */
    public final ButtonV3DTO getBuyInOneClick() {
        return this.buyInOneClick;
    }

    /* renamed from: component5, reason: from getter */
    public final RightIconButtonDTO getBuyForStars() {
        return this.buyForStars;
    }

    /* renamed from: component6, reason: from getter */
    public final IconButtonV3DTO getMoveButton() {
        return this.moveButton;
    }

    /* renamed from: component7, reason: from getter */
    public final TooltipWithOnboardingActionDTO getMoveButtonTooltipWithAction() {
        return this.moveButtonTooltipWithAction;
    }

    @NotNull
    public final ControlsDTO copy(@NotNull FavoriteProductMolecule favoriteProduct, @NotNull IconButtonV3DTO removeButton, QuantityControl quantity, ButtonV3DTO buyInOneClick, RightIconButtonDTO buyForStars, IconButtonV3DTO moveButton, TooltipWithOnboardingActionDTO moveButtonTooltipWithAction) {
        Intrinsics.checkNotNullParameter(favoriteProduct, "favoriteProduct");
        Intrinsics.checkNotNullParameter(removeButton, "removeButton");
        return new ControlsDTO(favoriteProduct, removeButton, quantity, buyInOneClick, buyForStars, moveButton, moveButtonTooltipWithAction);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ControlsDTO)) {
            return false;
        }
        ControlsDTO controlsDTO = (ControlsDTO) other;
        return Intrinsics.d(this.favoriteProduct, controlsDTO.favoriteProduct) && Intrinsics.d(this.removeButton, controlsDTO.removeButton) && Intrinsics.d(this.quantity, controlsDTO.quantity) && Intrinsics.d(this.buyInOneClick, controlsDTO.buyInOneClick) && Intrinsics.d(this.buyForStars, controlsDTO.buyForStars) && Intrinsics.d(this.moveButton, controlsDTO.moveButton) && Intrinsics.d(this.moveButtonTooltipWithAction, controlsDTO.moveButtonTooltipWithAction);
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

    public final TooltipWithOnboardingActionDTO getMoveButtonTooltipWithAction() {
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
        TooltipWithOnboardingActionDTO tooltipWithOnboardingActionDTO = this.moveButtonTooltipWithAction;
        return hashCode4 + (tooltipWithOnboardingActionDTO != null ? tooltipWithOnboardingActionDTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ControlsDTO(favoriteProduct=" + this.favoriteProduct + ", removeButton=" + this.removeButton + ", quantity=" + this.quantity + ", buyInOneClick=" + this.buyInOneClick + ", buyForStars=" + this.buyForStars + ", moveButton=" + this.moveButton + ", moveButtonTooltipWithAction=" + this.moveButtonTooltipWithAction + ")";
    }
}
