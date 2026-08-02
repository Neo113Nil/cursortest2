package ru.ozon.app.android.pdp.widgets.cartButtonQuant.doubleCart;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.pdp.widgets.cartButtonQuant.CartQuantViewModel;
import ru.ozon.app.android.pdp.widgets.cartButtonQuant.doubleCart.DoubleCartQuantVO;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "mode", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/doubleCart/DoubleCartQuantVO$CartMode;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class DoubleCartQuantViewBinder$onContainerInitialized$1$3 extends AbstractC7737t implements Function1<DoubleCartQuantVO.CartMode, Unit> {
    final /* synthetic */ CartQuantViewModel $cartViewModel;
    final /* synthetic */ Function0<DoubleCartQuantVO> $voProvider;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DoubleCartQuantVO.CartMode.values().length];
            try {
                iArr[DoubleCartQuantVO.CartMode.FIRST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DoubleCartQuantVO.CartMode.SECOND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DoubleCartQuantViewBinder$onContainerInitialized$1$3(Function0<DoubleCartQuantVO> function0, CartQuantViewModel cartQuantViewModel) {
        super(1);
        this.$voProvider = function0;
        this.$cartViewModel = cartQuantViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(DoubleCartQuantVO.CartMode cartMode) {
        invoke2(cartMode);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(DoubleCartQuantVO.CartMode cartMode) {
        DoubleCartQuantVO invoke = this.$voProvider.invoke();
        if (invoke != null) {
            CartQuantViewModel cartQuantViewModel = this.$cartViewModel;
            int i11 = cartMode == null ? -1 : WhenMappings.$EnumSwitchMapping$0[cartMode.ordinal()];
            if (i11 == 1) {
                cartQuantViewModel.decrementCount(invoke.getFirstCartData(), cartMode);
            } else {
                if (i11 != 2) {
                    return;
                }
                cartQuantViewModel.decrementCount(invoke.getSecondCartData(), cartMode);
            }
        }
    }
}
