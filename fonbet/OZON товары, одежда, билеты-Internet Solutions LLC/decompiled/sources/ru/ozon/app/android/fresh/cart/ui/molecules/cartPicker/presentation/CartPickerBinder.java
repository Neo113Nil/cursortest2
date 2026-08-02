package ru.ozon.app.android.fresh.cart.ui.molecules.cartPicker.presentation;

import Xc.a;
import Xc.b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.cart.ui.molecules.cartPicker.presentation.CartPickerBinder;
import ru.ozon.app.android.fresh.cart.ui.molecules.cartPicker.presentation.CartPickerVO;
import ru.ozon.app.android.fresh.cart.ui.molecules.cartPicker.presentation.CartPickerView;
import ru.ozon.app.android.fresh.common.widgets.molecules.QuantCountStrategy;
import ru.ozon.uni.android.haptic.HapticToken;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import xe.B0;
import xe.C10727i;
import xe.E0;
import xe.H0;
import xe.J;
import xe.M;
import xe.N;
import xe.X0;

@Metadata(d1 = {"\u0000Y\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\r\b\u0001\u0018\u00002\u00020\u0001:\u0001$B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JE\u0010\u000e\u001a\u00020\r2\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00042\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJU\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\t2\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0007¢\u0006\u0004\b\u0017\u0010\u0003R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u0016\u0010\u001d\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\u001f\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/presentation/CartPickerBinder;", "", "<init>", "()V", "Lkotlin/Function2;", "Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/presentation/CartPickerBinder$CartPickerActionType;", "Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/presentation/CartPickerVO;", "", "actionHandler", "Lkotlin/Function1;", "updateCallback", "Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/presentation/CartPickerVO$QuantityControl;", "quantityControl", "ru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/presentation/CartPickerBinder$createListeners$1$1", "createListeners", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/presentation/CartPickerVO$QuantityControl;)Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/presentation/CartPickerBinder$createListeners$1$1;", "Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/presentation/CartPickerView;", "view", "item", "", "isShrinkable", "bind", "(Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/presentation/CartPickerView;Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/presentation/CartPickerVO;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Z)V", "stopJobs", "Lxe/B0;", "decreaseJob", "Lxe/B0;", "increaseJob", "Lru/ozon/app/android/fresh/common/widgets/molecules/QuantCountStrategy;", "countStrategy", "Lru/ozon/app/android/fresh/common/widgets/molecules/QuantCountStrategy;", "isShrinkableMode", "Z", "Lxe/M;", "actionScope", "Lxe/M;", "CartPickerActionType", "widgets-cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CartPickerBinder {
    private B0 decreaseJob;
    private B0 increaseJob;
    private boolean isShrinkableMode;

    @NotNull
    private QuantCountStrategy countStrategy = QuantCountStrategy.INSTANCE.getEMPTY_INSTANCE();

    @NotNull
    private final M actionScope = N.a(CoroutineContext.Element.a.d(new CartPickerBinder$special$$inlined$CoroutineExceptionHandler$1(J.f105405n0), (H0) X0.b()));

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/presentation/CartPickerBinder$CartPickerActionType;", "", "<init>", "(Ljava/lang/String;I)V", "INCREMENT", "DECREMENT", "REMOVE", "widgets-cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class CartPickerActionType {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ CartPickerActionType[] $VALUES;
        public static final CartPickerActionType INCREMENT = new CartPickerActionType("INCREMENT", 0);
        public static final CartPickerActionType DECREMENT = new CartPickerActionType("DECREMENT", 1);
        public static final CartPickerActionType REMOVE = new CartPickerActionType("REMOVE", 2);

        private static final /* synthetic */ CartPickerActionType[] $values() {
            return new CartPickerActionType[]{INCREMENT, DECREMENT, REMOVE};
        }

        static {
            CartPickerActionType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private CartPickerActionType(String str, int i11) {
        }

        public static CartPickerActionType valueOf(String str) {
            return (CartPickerActionType) Enum.valueOf(CartPickerActionType.class, str);
        }

        public static CartPickerActionType[] values() {
            return (CartPickerActionType[]) $VALUES.clone();
        }
    }

    public static /* synthetic */ void bind$default(CartPickerBinder cartPickerBinder, CartPickerView cartPickerView, CartPickerVO cartPickerVO, Function1 function1, Function2 function2, boolean z11, int i11, Object obj) {
        if ((i11 & 16) != 0) {
            z11 = false;
        }
        cartPickerBinder.bind(cartPickerView, cartPickerVO, function1, function2, z11);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ru.ozon.app.android.fresh.cart.ui.molecules.cartPicker.presentation.CartPickerBinder$createListeners$1$1] */
    private final CartPickerBinder$createListeners$1$1 createListeners(final Function2<? super CartPickerActionType, ? super CartPickerVO, Unit> actionHandler, final Function1<? super CartPickerVO, Unit> updateCallback, final CartPickerVO.QuantityControl quantityControl) {
        final QuantCountStrategy quantCountStrategy = this.countStrategy;
        return new CartPickerView.CartPickerListeners() { // from class: ru.ozon.app.android.fresh.cart.ui.molecules.cartPicker.presentation.CartPickerBinder$createListeners$1$1
            @Override // ru.ozon.app.android.fresh.cart.ui.molecules.cartPicker.presentation.CartPickerView.CartPickerListeners
            public void onMinusClickListener(CartPickerView cartPicker, CartPickerVO currentVO) {
                CartPickerVO.QuantityControl quantityControl2;
                boolean z11;
                M m11;
                Intrinsics.checkNotNullParameter(cartPicker, "cartPicker");
                if (currentVO == null || (quantityControl2 = currentVO.getQuantity()) == null) {
                    quantityControl2 = CartPickerVO.QuantityControl.this;
                }
                int value = quantityControl2.getValue();
                if (currentVO == null) {
                    return;
                }
                if (!quantCountStrategy.isDecreaseEnabled(value)) {
                    actionHandler.invoke(CartPickerBinder.CartPickerActionType.REMOVE, currentVO);
                    return;
                }
                int quantDecrease = quantCountStrategy.quantDecrease(value);
                Integer valueOf = Integer.valueOf(quantDecrease);
                if (quantDecrease < currentVO.getQuantity().getMinValue()) {
                    valueOf = null;
                }
                int intValue = valueOf != null ? valueOf.intValue() : 0;
                CartPickerVO.QuantityControl quantity = currentVO.getQuantity();
                HapticToken hapticToken = HapticToken.SUCCESS;
                CartPickerVO copy$default = CartPickerVO.copy$default(currentVO, TextDTO.copy$default(currentVO.getQuantityTitle(), new OzonSpannableString(String.valueOf(intValue)), null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, 524286, null), null, CartPickerVO.QuantityControl.copy$default(quantity, intValue, 0, 0, 0, 0, null, null, hapticToken, hapticToken, 126, null), null, null, null, null, null, null, 506, null);
                updateCallback.invoke(copy$default);
                z11 = this.isShrinkableMode;
                if (z11) {
                    if (intValue == 0) {
                        actionHandler.invoke(CartPickerBinder.CartPickerActionType.REMOVE, copy$default);
                        return;
                    } else {
                        actionHandler.invoke(CartPickerBinder.CartPickerActionType.DECREMENT, CartPickerVO.copy$default(copy$default, null, null, CartPickerVO.QuantityControl.copy$default(copy$default.getQuantity(), intValue, 0, 0, 0, 0, null, null, null, null, 510, null), null, null, null, null, null, null, 507, null));
                        return;
                    }
                }
                this.stopJobs();
                CartPickerVO.QuantityControl.ChangeQuantity changeQuantityAction = CartPickerVO.QuantityControl.this.getChangeQuantityAction();
                CartPickerBinder cartPickerBinder = this;
                Function2<CartPickerBinder.CartPickerActionType, CartPickerVO, Unit> function2 = actionHandler;
                m11 = cartPickerBinder.actionScope;
                cartPickerBinder.decreaseJob = C10727i.c(m11, null, null, new CartPickerBinder$createListeners$1$1$onMinusClickListener$1$1(changeQuantityAction, copy$default, intValue, function2, cartPickerBinder, null), 3);
            }

            @Override // ru.ozon.app.android.fresh.cart.ui.molecules.cartPicker.presentation.CartPickerView.CartPickerListeners
            public void onPlusClickListener(CartPickerView cartPicker, CartPickerVO currentVO) {
                CartPickerVO.QuantityControl quantityControl2;
                boolean z11;
                M m11;
                Intrinsics.checkNotNullParameter(cartPicker, "cartPicker");
                if (currentVO == null || (quantityControl2 = currentVO.getQuantity()) == null) {
                    quantityControl2 = CartPickerVO.QuantityControl.this;
                }
                int value = quantityControl2.getValue();
                if (quantCountStrategy.isIncreaseEnabled(value) && currentVO != null) {
                    int quantIncrease = quantCountStrategy.quantIncrease(value);
                    int minValue = currentVO.getQuantity().getMinValue();
                    int i11 = quantIncrease < minValue ? minValue : quantIncrease;
                    CartPickerVO copy$default = CartPickerVO.copy$default(currentVO, TextDTO.copy$default(currentVO.getQuantityTitle(), new OzonSpannableString(String.valueOf(i11)), null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, 524286, null), null, CartPickerVO.QuantityControl.copy$default(currentVO.getQuantity(), i11, 0, 0, 0, 0, null, null, quantCountStrategy.isIncreaseEnabled(i11) ? HapticToken.SUCCESS : HapticToken.ERROR, null, 382, null), null, null, null, null, null, null, 506, null);
                    updateCallback.invoke(copy$default);
                    z11 = this.isShrinkableMode;
                    if (z11) {
                        actionHandler.invoke(CartPickerBinder.CartPickerActionType.INCREMENT, CartPickerVO.copy$default(copy$default, null, null, CartPickerVO.QuantityControl.copy$default(copy$default.getQuantity(), i11, 0, 0, 0, 0, null, null, null, null, 510, null), null, null, null, null, null, null, 507, null));
                        return;
                    }
                    this.stopJobs();
                    CartPickerVO.QuantityControl.ChangeQuantity changeQuantityAction = CartPickerVO.QuantityControl.this.getChangeQuantityAction();
                    CartPickerBinder cartPickerBinder = this;
                    Function2<CartPickerBinder.CartPickerActionType, CartPickerVO, Unit> function2 = actionHandler;
                    m11 = cartPickerBinder.actionScope;
                    cartPickerBinder.increaseJob = C10727i.c(m11, null, null, new CartPickerBinder$createListeners$1$1$onPlusClickListener$1$1(changeQuantityAction, copy$default, i11, function2, cartPickerBinder, null), 3);
                }
            }
        };
    }

    public final void bind(@NotNull CartPickerView view, @NotNull CartPickerVO item, @NotNull Function1<? super CartPickerVO, Unit> updateCallback, @NotNull Function2<? super CartPickerActionType, ? super CartPickerVO, Unit> actionHandler, boolean isShrinkable) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(updateCallback, "updateCallback");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        view.setVisibility(0);
        this.isShrinkableMode = isShrinkable;
        this.countStrategy = new QuantCountStrategy(item.getQuantity().getMultiplicity(), isShrinkable ? 0 : item.getQuantity().getMinValue(), item.getQuantity().getMaxValue(), item.getQuantity().getQuantSize());
        view.bind(item, createListeners(actionHandler, updateCallback, item.getQuantity()));
    }

    public final void stopJobs() {
        E0.d(this.actionScope.getCoroutineContext());
    }
}
