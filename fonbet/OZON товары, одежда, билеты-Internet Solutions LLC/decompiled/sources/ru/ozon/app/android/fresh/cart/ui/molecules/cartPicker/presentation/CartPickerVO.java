package ru.ozon.app.android.fresh.cart.ui.molecules.cartPicker.presentation;

import Am.C2438a;
import B0.C2454a;
import B3.p;
import Ek.a;
import G.g;
import Pk0.c;
import WZ.t;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.cart.ui.molecules.cartPicker.data.CartPickerDTO;
import ru.ozon.uni.android.haptic.HapticToken;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0081\b\u0018\u00002\u00020\u0001:\u00015BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013Jl\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u0010HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b\"\u0010!R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010&\u001a\u0004\b'\u0010\u0017R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b(\u0010\u0017R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u00102\u001a\u0004\b3\u00104¨\u00066"}, d2 = {"Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/presentation/CartPickerVO;", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", "quantityTitle", "subtitle", "Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/presentation/CartPickerVO$QuantityControl;", "quantity", "", "decrementIcon", "incrementIcon", "Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/data/CartPickerDTO$Sizes;", "size", "Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/data/CartPickerDTO$Sizings;", "sizing", "Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/data/CartPickerDTO$StyleTypes;", "styleType", "Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/data/CartPickerDTO$CustomStyle;", "customStyle", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/presentation/CartPickerVO$QuantityControl;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/data/CartPickerDTO$Sizes;Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/data/CartPickerDTO$Sizings;Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/data/CartPickerDTO$StyleTypes;Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/data/CartPickerDTO$CustomStyle;)V", "copy", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/presentation/CartPickerVO$QuantityControl;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/data/CartPickerDTO$Sizes;Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/data/CartPickerDTO$Sizings;Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/data/CartPickerDTO$StyleTypes;Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/data/CartPickerDTO$CustomStyle;)Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/presentation/CartPickerVO;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getQuantityTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/presentation/CartPickerVO$QuantityControl;", "getQuantity", "()Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/presentation/CartPickerVO$QuantityControl;", "Ljava/lang/String;", "getDecrementIcon", "getIncrementIcon", "Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/data/CartPickerDTO$Sizes;", "getSize", "()Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/data/CartPickerDTO$Sizes;", "Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/data/CartPickerDTO$Sizings;", "getSizing", "()Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/data/CartPickerDTO$Sizings;", "Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/data/CartPickerDTO$StyleTypes;", "getStyleType", "()Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/data/CartPickerDTO$StyleTypes;", "Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/data/CartPickerDTO$CustomStyle;", "getCustomStyle", "()Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/data/CartPickerDTO$CustomStyle;", "QuantityControl", "widgets-cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CartPickerVO {

    @NotNull
    private final CartPickerDTO.CustomStyle customStyle;

    @NotNull
    private final String decrementIcon;

    @NotNull
    private final String incrementIcon;

    @NotNull
    private final QuantityControl quantity;

    @NotNull
    private final TextDTO quantityTitle;

    @NotNull
    private final CartPickerDTO.Sizes size;

    @NotNull
    private final CartPickerDTO.Sizings sizing;

    @NotNull
    private final CartPickerDTO.StyleTypes styleType;
    private final TextDTO subtitle;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001:\u0002,-BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010Jj\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\fHÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001f\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b \u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b!\u0010\u0017R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\u000e\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010(\u001a\u0004\b+\u0010*¨\u0006."}, d2 = {"Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/presentation/CartPickerVO$QuantityControl;", "", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "minValue", "maxValue", "multiplicity", "quantSize", "Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/presentation/CartPickerVO$QuantityControl$ChangeQuantity;", "changeQuantityAction", "Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/presentation/CartPickerVO$QuantityControl$DecrementRemove;", "decrementRemoveAction", "Lru/ozon/uni/android/haptic/HapticToken;", "hapticPlus", "hapticMinus", "<init>", "(IIIIILru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/presentation/CartPickerVO$QuantityControl$ChangeQuantity;Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/presentation/CartPickerVO$QuantityControl$DecrementRemove;Lru/ozon/uni/android/haptic/HapticToken;Lru/ozon/uni/android/haptic/HapticToken;)V", "copy", "(IIIIILru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/presentation/CartPickerVO$QuantityControl$ChangeQuantity;Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/presentation/CartPickerVO$QuantityControl$DecrementRemove;Lru/ozon/uni/android/haptic/HapticToken;Lru/ozon/uni/android/haptic/HapticToken;)Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/presentation/CartPickerVO$QuantityControl;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getValue", "getMinValue", "getMaxValue", "getMultiplicity", "getQuantSize", "Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/presentation/CartPickerVO$QuantityControl$ChangeQuantity;", "getChangeQuantityAction", "()Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/presentation/CartPickerVO$QuantityControl$ChangeQuantity;", "Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/presentation/CartPickerVO$QuantityControl$DecrementRemove;", "getDecrementRemoveAction", "()Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/presentation/CartPickerVO$QuantityControl$DecrementRemove;", "Lru/ozon/uni/android/haptic/HapticToken;", "getHapticPlus", "()Lru/ozon/uni/android/haptic/HapticToken;", "getHapticMinus", "ChangeQuantity", "DecrementRemove", "widgets-cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class QuantityControl {

        @NotNull
        private final ChangeQuantity changeQuantityAction;

        @NotNull
        private final DecrementRemove decrementRemoveAction;

        @NotNull
        private final HapticToken hapticMinus;

        @NotNull
        private final HapticToken hapticPlus;
        private final int maxValue;
        private final int minValue;
        private final int multiplicity;
        private final int quantSize;
        private final int value;

        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007\u0012\u000e\u0010\t\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001f\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001f\u0010\t\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\u001c\u001a\u0004\b\u001f\u0010\u001e¨\u0006 "}, d2 = {"Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/presentation/CartPickerVO$QuantityControl$ChangeQuantity;", "", "Lru/ozon/uni/atoms/af/AtomAction;", "changeValueAction", "", "changeValueDebounceDelay", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "incrementTrackingInfo", "decrementTrackingInfo", "<init>", "(Lru/ozon/uni/atoms/af/AtomAction;JLWZ/t;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/af/AtomAction;", "getChangeValueAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "J", "getChangeValueDebounceDelay", "()J", "LWZ/t;", "getIncrementTrackingInfo", "()LWZ/t;", "getDecrementTrackingInfo", "widgets-cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ChangeQuantity {

            @NotNull
            private final AtomAction changeValueAction;
            private final long changeValueDebounceDelay;
            private final t decrementTrackingInfo;
            private final t incrementTrackingInfo;

            public ChangeQuantity(@NotNull AtomAction changeValueAction, long j11, t tVar, t tVar2) {
                Intrinsics.checkNotNullParameter(changeValueAction, "changeValueAction");
                this.changeValueAction = changeValueAction;
                this.changeValueDebounceDelay = j11;
                this.incrementTrackingInfo = tVar;
                this.decrementTrackingInfo = tVar2;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ChangeQuantity)) {
                    return false;
                }
                ChangeQuantity changeQuantity = (ChangeQuantity) other;
                return Intrinsics.d(this.changeValueAction, changeQuantity.changeValueAction) && this.changeValueDebounceDelay == changeQuantity.changeValueDebounceDelay && Intrinsics.d(this.incrementTrackingInfo, changeQuantity.incrementTrackingInfo) && Intrinsics.d(this.decrementTrackingInfo, changeQuantity.decrementTrackingInfo);
            }

            @NotNull
            public final AtomAction getChangeValueAction() {
                return this.changeValueAction;
            }

            public final long getChangeValueDebounceDelay() {
                return this.changeValueDebounceDelay;
            }

            public final t getDecrementTrackingInfo() {
                return this.decrementTrackingInfo;
            }

            public final t getIncrementTrackingInfo() {
                return this.incrementTrackingInfo;
            }

            public int hashCode() {
                int a11 = c.a(this.changeValueAction.hashCode() * 31, 31, this.changeValueDebounceDelay);
                t tVar = this.incrementTrackingInfo;
                int hashCode = (a11 + (tVar == null ? 0 : tVar.hashCode())) * 31;
                t tVar2 = this.decrementTrackingInfo;
                return hashCode + (tVar2 != null ? tVar2.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                AtomAction atomAction = this.changeValueAction;
                long j11 = this.changeValueDebounceDelay;
                t tVar = this.incrementTrackingInfo;
                t tVar2 = this.decrementTrackingInfo;
                StringBuilder sb2 = new StringBuilder("ChangeQuantity(changeValueAction=");
                sb2.append(atomAction);
                sb2.append(", changeValueDebounceDelay=");
                sb2.append(j11);
                p.d(sb2, ", incrementTrackingInfo=", tVar, ", decrementTrackingInfo=", tVar2);
                sb2.append(")");
                return sb2.toString();
            }
        }

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001f\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/presentation/CartPickerVO$QuantityControl$DecrementRemove;", "", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "trackingInfo", "<init>", "(Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "getTrackingInfo", "()LWZ/t;", "widgets-cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class DecrementRemove {

            @NotNull
            private final AtomAction action;
            private final t trackingInfo;

            public DecrementRemove(@NotNull AtomAction action, t tVar) {
                Intrinsics.checkNotNullParameter(action, "action");
                this.action = action;
                this.trackingInfo = tVar;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof DecrementRemove)) {
                    return false;
                }
                DecrementRemove decrementRemove = (DecrementRemove) other;
                return Intrinsics.d(this.action, decrementRemove.action) && Intrinsics.d(this.trackingInfo, decrementRemove.trackingInfo);
            }

            @NotNull
            public final AtomAction getAction() {
                return this.action;
            }

            public final t getTrackingInfo() {
                return this.trackingInfo;
            }

            public int hashCode() {
                int hashCode = this.action.hashCode() * 31;
                t tVar = this.trackingInfo;
                return hashCode + (tVar == null ? 0 : tVar.hashCode());
            }

            @NotNull
            public String toString() {
                return "DecrementRemove(action=" + this.action + ", trackingInfo=" + this.trackingInfo + ")";
            }
        }

        public QuantityControl(int i11, int i12, int i13, int i14, int i15, @NotNull ChangeQuantity changeQuantityAction, @NotNull DecrementRemove decrementRemoveAction, @NotNull HapticToken hapticPlus, @NotNull HapticToken hapticMinus) {
            Intrinsics.checkNotNullParameter(changeQuantityAction, "changeQuantityAction");
            Intrinsics.checkNotNullParameter(decrementRemoveAction, "decrementRemoveAction");
            Intrinsics.checkNotNullParameter(hapticPlus, "hapticPlus");
            Intrinsics.checkNotNullParameter(hapticMinus, "hapticMinus");
            this.value = i11;
            this.minValue = i12;
            this.maxValue = i13;
            this.multiplicity = i14;
            this.quantSize = i15;
            this.changeQuantityAction = changeQuantityAction;
            this.decrementRemoveAction = decrementRemoveAction;
            this.hapticPlus = hapticPlus;
            this.hapticMinus = hapticMinus;
        }

        public static /* synthetic */ QuantityControl copy$default(QuantityControl quantityControl, int i11, int i12, int i13, int i14, int i15, ChangeQuantity changeQuantity, DecrementRemove decrementRemove, HapticToken hapticToken, HapticToken hapticToken2, int i16, Object obj) {
            if ((i16 & 1) != 0) {
                i11 = quantityControl.value;
            }
            if ((i16 & 2) != 0) {
                i12 = quantityControl.minValue;
            }
            if ((i16 & 4) != 0) {
                i13 = quantityControl.maxValue;
            }
            if ((i16 & 8) != 0) {
                i14 = quantityControl.multiplicity;
            }
            if ((i16 & 16) != 0) {
                i15 = quantityControl.quantSize;
            }
            if ((i16 & 32) != 0) {
                changeQuantity = quantityControl.changeQuantityAction;
            }
            if ((i16 & 64) != 0) {
                decrementRemove = quantityControl.decrementRemoveAction;
            }
            if ((i16 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                hapticToken = quantityControl.hapticPlus;
            }
            if ((i16 & 256) != 0) {
                hapticToken2 = quantityControl.hapticMinus;
            }
            HapticToken hapticToken3 = hapticToken;
            HapticToken hapticToken4 = hapticToken2;
            ChangeQuantity changeQuantity2 = changeQuantity;
            DecrementRemove decrementRemove2 = decrementRemove;
            int i17 = i15;
            int i18 = i13;
            return quantityControl.copy(i11, i12, i18, i14, i17, changeQuantity2, decrementRemove2, hapticToken3, hapticToken4);
        }

        @NotNull
        public final QuantityControl copy(int value, int minValue, int maxValue, int multiplicity, int quantSize, @NotNull ChangeQuantity changeQuantityAction, @NotNull DecrementRemove decrementRemoveAction, @NotNull HapticToken hapticPlus, @NotNull HapticToken hapticMinus) {
            Intrinsics.checkNotNullParameter(changeQuantityAction, "changeQuantityAction");
            Intrinsics.checkNotNullParameter(decrementRemoveAction, "decrementRemoveAction");
            Intrinsics.checkNotNullParameter(hapticPlus, "hapticPlus");
            Intrinsics.checkNotNullParameter(hapticMinus, "hapticMinus");
            return new QuantityControl(value, minValue, maxValue, multiplicity, quantSize, changeQuantityAction, decrementRemoveAction, hapticPlus, hapticMinus);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof QuantityControl)) {
                return false;
            }
            QuantityControl quantityControl = (QuantityControl) other;
            return this.value == quantityControl.value && this.minValue == quantityControl.minValue && this.maxValue == quantityControl.maxValue && this.multiplicity == quantityControl.multiplicity && this.quantSize == quantityControl.quantSize && Intrinsics.d(this.changeQuantityAction, quantityControl.changeQuantityAction) && Intrinsics.d(this.decrementRemoveAction, quantityControl.decrementRemoveAction) && this.hapticPlus == quantityControl.hapticPlus && this.hapticMinus == quantityControl.hapticMinus;
        }

        @NotNull
        public final ChangeQuantity getChangeQuantityAction() {
            return this.changeQuantityAction;
        }

        @NotNull
        public final DecrementRemove getDecrementRemoveAction() {
            return this.decrementRemoveAction;
        }

        @NotNull
        public final HapticToken getHapticMinus() {
            return this.hapticMinus;
        }

        @NotNull
        public final HapticToken getHapticPlus() {
            return this.hapticPlus;
        }

        public final int getMaxValue() {
            return this.maxValue;
        }

        public final int getMinValue() {
            return this.minValue;
        }

        public final int getMultiplicity() {
            return this.multiplicity;
        }

        public final int getQuantSize() {
            return this.quantSize;
        }

        public final int getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.hapticMinus.hashCode() + ((this.hapticPlus.hashCode() + ((this.decrementRemoveAction.hashCode() + ((this.changeQuantityAction.hashCode() + C2454a.a(this.quantSize, C2454a.a(this.multiplicity, C2454a.a(this.maxValue, C2454a.a(this.minValue, Integer.hashCode(this.value) * 31, 31), 31), 31), 31)) * 31)) * 31)) * 31);
        }

        @NotNull
        public String toString() {
            int i11 = this.value;
            int i12 = this.minValue;
            int i13 = this.maxValue;
            int i14 = this.multiplicity;
            int i15 = this.quantSize;
            ChangeQuantity changeQuantity = this.changeQuantityAction;
            DecrementRemove decrementRemove = this.decrementRemoveAction;
            HapticToken hapticToken = this.hapticPlus;
            HapticToken hapticToken2 = this.hapticMinus;
            StringBuilder a11 = C2438a.a("QuantityControl(value=", i11, ", minValue=", ", maxValue=", i12);
            a.f(i13, i14, ", multiplicity=", ", quantSize=", a11);
            a11.append(i15);
            a11.append(", changeQuantityAction=");
            a11.append(changeQuantity);
            a11.append(", decrementRemoveAction=");
            a11.append(decrementRemove);
            a11.append(", hapticPlus=");
            a11.append(hapticToken);
            a11.append(", hapticMinus=");
            a11.append(hapticToken2);
            a11.append(")");
            return a11.toString();
        }
    }

    public CartPickerVO(@NotNull TextDTO quantityTitle, TextDTO textDTO, @NotNull QuantityControl quantity, @NotNull String decrementIcon, @NotNull String incrementIcon, @NotNull CartPickerDTO.Sizes size, @NotNull CartPickerDTO.Sizings sizing, @NotNull CartPickerDTO.StyleTypes styleType, @NotNull CartPickerDTO.CustomStyle customStyle) {
        Intrinsics.checkNotNullParameter(quantityTitle, "quantityTitle");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(decrementIcon, "decrementIcon");
        Intrinsics.checkNotNullParameter(incrementIcon, "incrementIcon");
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(sizing, "sizing");
        Intrinsics.checkNotNullParameter(styleType, "styleType");
        Intrinsics.checkNotNullParameter(customStyle, "customStyle");
        this.quantityTitle = quantityTitle;
        this.subtitle = textDTO;
        this.quantity = quantity;
        this.decrementIcon = decrementIcon;
        this.incrementIcon = incrementIcon;
        this.size = size;
        this.sizing = sizing;
        this.styleType = styleType;
        this.customStyle = customStyle;
    }

    public static /* synthetic */ CartPickerVO copy$default(CartPickerVO cartPickerVO, TextDTO textDTO, TextDTO textDTO2, QuantityControl quantityControl, String str, String str2, CartPickerDTO.Sizes sizes, CartPickerDTO.Sizings sizings, CartPickerDTO.StyleTypes styleTypes, CartPickerDTO.CustomStyle customStyle, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textDTO = cartPickerVO.quantityTitle;
        }
        if ((i11 & 2) != 0) {
            textDTO2 = cartPickerVO.subtitle;
        }
        if ((i11 & 4) != 0) {
            quantityControl = cartPickerVO.quantity;
        }
        if ((i11 & 8) != 0) {
            str = cartPickerVO.decrementIcon;
        }
        if ((i11 & 16) != 0) {
            str2 = cartPickerVO.incrementIcon;
        }
        if ((i11 & 32) != 0) {
            sizes = cartPickerVO.size;
        }
        if ((i11 & 64) != 0) {
            sizings = cartPickerVO.sizing;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            styleTypes = cartPickerVO.styleType;
        }
        if ((i11 & 256) != 0) {
            customStyle = cartPickerVO.customStyle;
        }
        CartPickerDTO.StyleTypes styleTypes2 = styleTypes;
        CartPickerDTO.CustomStyle customStyle2 = customStyle;
        CartPickerDTO.Sizes sizes2 = sizes;
        CartPickerDTO.Sizings sizings2 = sizings;
        String str3 = str2;
        QuantityControl quantityControl2 = quantityControl;
        return cartPickerVO.copy(textDTO, textDTO2, quantityControl2, str, str3, sizes2, sizings2, styleTypes2, customStyle2);
    }

    @NotNull
    public final CartPickerVO copy(@NotNull TextDTO quantityTitle, TextDTO subtitle, @NotNull QuantityControl quantity, @NotNull String decrementIcon, @NotNull String incrementIcon, @NotNull CartPickerDTO.Sizes size, @NotNull CartPickerDTO.Sizings sizing, @NotNull CartPickerDTO.StyleTypes styleType, @NotNull CartPickerDTO.CustomStyle customStyle) {
        Intrinsics.checkNotNullParameter(quantityTitle, "quantityTitle");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(decrementIcon, "decrementIcon");
        Intrinsics.checkNotNullParameter(incrementIcon, "incrementIcon");
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(sizing, "sizing");
        Intrinsics.checkNotNullParameter(styleType, "styleType");
        Intrinsics.checkNotNullParameter(customStyle, "customStyle");
        return new CartPickerVO(quantityTitle, subtitle, quantity, decrementIcon, incrementIcon, size, sizing, styleType, customStyle);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CartPickerVO)) {
            return false;
        }
        CartPickerVO cartPickerVO = (CartPickerVO) other;
        return Intrinsics.d(this.quantityTitle, cartPickerVO.quantityTitle) && Intrinsics.d(this.subtitle, cartPickerVO.subtitle) && Intrinsics.d(this.quantity, cartPickerVO.quantity) && Intrinsics.d(this.decrementIcon, cartPickerVO.decrementIcon) && Intrinsics.d(this.incrementIcon, cartPickerVO.incrementIcon) && this.size == cartPickerVO.size && this.sizing == cartPickerVO.sizing && this.styleType == cartPickerVO.styleType && Intrinsics.d(this.customStyle, cartPickerVO.customStyle);
    }

    @NotNull
    public final CartPickerDTO.CustomStyle getCustomStyle() {
        return this.customStyle;
    }

    @NotNull
    public final String getDecrementIcon() {
        return this.decrementIcon;
    }

    @NotNull
    public final String getIncrementIcon() {
        return this.incrementIcon;
    }

    @NotNull
    public final QuantityControl getQuantity() {
        return this.quantity;
    }

    @NotNull
    public final TextDTO getQuantityTitle() {
        return this.quantityTitle;
    }

    @NotNull
    public final CartPickerDTO.Sizes getSize() {
        return this.size;
    }

    @NotNull
    public final CartPickerDTO.Sizings getSizing() {
        return this.sizing;
    }

    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    public int hashCode() {
        int hashCode = this.quantityTitle.hashCode() * 31;
        TextDTO textDTO = this.subtitle;
        return this.customStyle.hashCode() + ((this.styleType.hashCode() + ((this.sizing.hashCode() + ((this.size.hashCode() + g.a(g.a((this.quantity.hashCode() + ((hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31)) * 31, 31, this.decrementIcon), 31, this.incrementIcon)) * 31)) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        TextDTO textDTO = this.quantityTitle;
        TextDTO textDTO2 = this.subtitle;
        QuantityControl quantityControl = this.quantity;
        String str = this.decrementIcon;
        String str2 = this.incrementIcon;
        CartPickerDTO.Sizes sizes = this.size;
        CartPickerDTO.Sizings sizings = this.sizing;
        CartPickerDTO.StyleTypes styleTypes = this.styleType;
        CartPickerDTO.CustomStyle customStyle = this.customStyle;
        StringBuilder g10 = D3.g.g("CartPickerVO(quantityTitle=", textDTO, ", subtitle=", textDTO2, ", quantity=");
        g10.append(quantityControl);
        g10.append(", decrementIcon=");
        g10.append(str);
        g10.append(", incrementIcon=");
        g10.append(str2);
        g10.append(", size=");
        g10.append(sizes);
        g10.append(", sizing=");
        g10.append(sizings);
        g10.append(", styleType=");
        g10.append(styleTypes);
        g10.append(", customStyle=");
        g10.append(customStyle);
        g10.append(")");
        return g10.toString();
    }
}
