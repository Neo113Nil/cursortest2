package ru.ozon.app.android.fresh.cart.widgets.stickyTotal;

import Xc.a;
import Xc.b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.cart.ui.molecules.cartPicker.presentation.CartPickerVO;
import ru.ozon.app.android.fresh.cart.ui.molecules.cartPicker.presentation.CartPickerView;
import ru.ozon.app.android.fresh.cart.widgets.stickyTotal.StickyTotalPDPCountPickerBinder;
import ru.ozon.app.android.fresh.common.widgets.molecules.QuantCountStrategy;
import ru.ozon.uni.android.haptic.HapticToken;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u0000C\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0016\b\u0001\u0018\u00002\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J0\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00070\rJ\u0016\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000eJ0\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u000f2\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00070\rJ/\u0010\u0015\u001a\u00020\u00162\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00070\r2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002¢\u0006\u0002\u0010\u0019R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/fresh/cart/widgets/stickyTotal/StickyTotalPDPCountPickerBinder;", "", "<init>", "()V", "countStrategy", "Lru/ozon/app/android/fresh/common/widgets/molecules/QuantCountStrategy;", "bind", "", "view", "Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/presentation/CartPickerView;", "item", "Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/presentation/CartPickerVO;", "updateCallback", "Lkotlin/Function2;", "", "Lru/ozon/app/android/fresh/cart/widgets/stickyTotal/StickyTotalPDPCountPickerBinder$PickerActionType;", "createNewVO", "currentVO", "newQuantity", "onIncrement", "pickerActionType", "createListeners", "ru/ozon/app/android/fresh/cart/widgets/stickyTotal/StickyTotalPDPCountPickerBinder$createListeners$1$1", "quantityControl", "Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/presentation/CartPickerVO$QuantityControl;", "(Lkotlin/jvm/functions/Function2;Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/presentation/CartPickerVO$QuantityControl;)Lru/ozon/app/android/fresh/cart/widgets/stickyTotal/StickyTotalPDPCountPickerBinder$createListeners$1$1;", "PickerActionType", "widgets-cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class StickyTotalPDPCountPickerBinder {

    @NotNull
    private QuantCountStrategy countStrategy = QuantCountStrategy.INSTANCE.getEMPTY_INSTANCE();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/fresh/cart/widgets/stickyTotal/StickyTotalPDPCountPickerBinder$PickerActionType;", "", "<init>", "(Ljava/lang/String;I)V", "ADD", "INCREMENT", "DECREMENT", "REMOVE", "widgets-cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class PickerActionType {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ PickerActionType[] $VALUES;
        public static final PickerActionType ADD = new PickerActionType("ADD", 0);
        public static final PickerActionType INCREMENT = new PickerActionType("INCREMENT", 1);
        public static final PickerActionType DECREMENT = new PickerActionType("DECREMENT", 2);
        public static final PickerActionType REMOVE = new PickerActionType("REMOVE", 3);

        private static final /* synthetic */ PickerActionType[] $values() {
            return new PickerActionType[]{ADD, INCREMENT, DECREMENT, REMOVE};
        }

        static {
            PickerActionType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private PickerActionType(String str, int i11) {
        }

        public static PickerActionType valueOf(String str) {
            return (PickerActionType) Enum.valueOf(PickerActionType.class, str);
        }

        public static PickerActionType[] values() {
            return (PickerActionType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [ru.ozon.app.android.fresh.cart.widgets.stickyTotal.StickyTotalPDPCountPickerBinder$createListeners$1$1] */
    private final StickyTotalPDPCountPickerBinder$createListeners$1$1 createListeners(final Function2<? super Integer, ? super PickerActionType, Unit> updateCallback, final CartPickerVO.QuantityControl quantityControl) {
        final QuantCountStrategy quantCountStrategy = this.countStrategy;
        return new CartPickerView.CartPickerListeners() { // from class: ru.ozon.app.android.fresh.cart.widgets.stickyTotal.StickyTotalPDPCountPickerBinder$createListeners$1$1
            @Override // ru.ozon.app.android.fresh.cart.ui.molecules.cartPicker.presentation.CartPickerView.CartPickerListeners
            public void onMinusClickListener(CartPickerView cartPicker, CartPickerVO currentVO) {
                CartPickerVO.QuantityControl quantityControl2;
                Intrinsics.checkNotNullParameter(cartPicker, "cartPicker");
                if (currentVO == null || (quantityControl2 = currentVO.getQuantity()) == null) {
                    quantityControl2 = quantityControl;
                }
                int value = quantityControl2.getValue();
                if (currentVO == null) {
                    return;
                }
                int i11 = 0;
                if (quantCountStrategy.isDecreaseEnabled(value)) {
                    Integer valueOf = Integer.valueOf(quantCountStrategy.quantDecrease(value));
                    if (valueOf.intValue() < currentVO.getQuantity().getMinValue()) {
                        valueOf = null;
                    }
                    if (valueOf != null) {
                        i11 = valueOf.intValue();
                    }
                }
                updateCallback.invoke(Integer.valueOf(i11), i11 == 0 ? StickyTotalPDPCountPickerBinder.PickerActionType.REMOVE : StickyTotalPDPCountPickerBinder.PickerActionType.DECREMENT);
            }

            @Override // ru.ozon.app.android.fresh.cart.ui.molecules.cartPicker.presentation.CartPickerView.CartPickerListeners
            public void onPlusClickListener(CartPickerView cartPicker, CartPickerVO currentVO) {
                Intrinsics.checkNotNullParameter(cartPicker, "cartPicker");
                if (currentVO == null) {
                    return;
                }
                StickyTotalPDPCountPickerBinder.this.onIncrement(currentVO, StickyTotalPDPCountPickerBinder.PickerActionType.INCREMENT, updateCallback);
            }
        };
    }

    public final void bind(@NotNull CartPickerView view, @NotNull CartPickerVO item, @NotNull Function2<? super Integer, ? super PickerActionType, Unit> updateCallback) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(updateCallback, "updateCallback");
        view.setVisibility(0);
        this.countStrategy = new QuantCountStrategy(item.getQuantity().getMultiplicity(), item.getQuantity().getMinValue(), item.getQuantity().getMaxValue(), item.getQuantity().getQuantSize());
        view.bind(item, createListeners(updateCallback, item.getQuantity()));
    }

    @NotNull
    public final CartPickerVO createNewVO(@NotNull CartPickerVO currentVO, int newQuantity) {
        Intrinsics.checkNotNullParameter(currentVO, "currentVO");
        QuantCountStrategy quantCountStrategy = this.countStrategy;
        int minValue = currentVO.getQuantity().getMinValue();
        if (newQuantity >= minValue) {
            minValue = newQuantity;
        }
        return CartPickerVO.copy$default(currentVO, TextDTO.copy$default(currentVO.getQuantityTitle(), new OzonSpannableString(String.valueOf(newQuantity)), null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, 524286, null), null, CartPickerVO.QuantityControl.copy$default(currentVO.getQuantity(), newQuantity, 0, 0, 0, 0, null, null, quantCountStrategy.isIncreaseEnabled(minValue) ? HapticToken.SUCCESS : HapticToken.ERROR, HapticToken.SUCCESS, 126, null), null, null, null, null, null, null, 506, null);
    }

    public final void onIncrement(@NotNull CartPickerVO currentVO, @NotNull PickerActionType pickerActionType, @NotNull Function2<? super Integer, ? super PickerActionType, Unit> updateCallback) {
        Intrinsics.checkNotNullParameter(currentVO, "currentVO");
        Intrinsics.checkNotNullParameter(pickerActionType, "pickerActionType");
        Intrinsics.checkNotNullParameter(updateCallback, "updateCallback");
        QuantCountStrategy quantCountStrategy = this.countStrategy;
        int value = currentVO.getQuantity().getValue();
        if (quantCountStrategy.isIncreaseEnabled(value)) {
            int quantIncrease = quantCountStrategy.quantIncrease(value);
            int minValue = currentVO.getQuantity().getMinValue();
            if (quantIncrease < minValue) {
                quantIncrease = minValue;
            }
            updateCallback.invoke(Integer.valueOf(quantIncrease), pickerActionType);
        }
    }
}
