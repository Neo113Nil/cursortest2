package ru.ozon.app.android.fresh.cart.widgets.cartTile.presentation.item;

import Sc.o;
import WZ.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.fresh.cart.ui.molecules.cartPicker.presentation.CartPickerBinder;
import ru.ozon.app.android.fresh.cart.ui.molecules.cartPicker.presentation.CartPickerVO;
import ru.ozon.app.android.fresh.cart.widgets.cartTile.presentation.CartTileVO;
import ru.ozon.tracker.model.TrinityEventEntityKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", TrinityEventEntityKt.ACTION_TYPE_JSON_NAME, "Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/presentation/CartPickerBinder$CartPickerActionType;", "cartPickerVO", "Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/presentation/CartPickerVO;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class CartTileItemView$bindController$1 extends AbstractC7737t implements Function2<CartPickerBinder.CartPickerActionType, CartPickerVO, Unit> {
    final /* synthetic */ Function2<AtomAction, CartTileVO.TileItem, Unit> $actionHandler;
    final /* synthetic */ CartTileVO.TileItem $item;
    final /* synthetic */ Function1<t, Unit> $processClickEvent;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CartPickerBinder.CartPickerActionType.values().length];
            try {
                iArr[CartPickerBinder.CartPickerActionType.INCREMENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CartPickerBinder.CartPickerActionType.DECREMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CartPickerBinder.CartPickerActionType.REMOVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    CartTileItemView$bindController$1(CartTileVO.TileItem tileItem, Function1<? super t, Unit> function1, Function2<? super AtomAction, ? super CartTileVO.TileItem, Unit> function2) {
        super(2);
        this.$item = tileItem;
        this.$processClickEvent = function1;
        this.$actionHandler = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(CartPickerBinder.CartPickerActionType cartPickerActionType, CartPickerVO cartPickerVO) {
        invoke2(cartPickerActionType, cartPickerVO);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(CartPickerBinder.CartPickerActionType actionType, CartPickerVO cartPickerVO) {
        AtomAction changeValueAction;
        t incrementTrackingInfo;
        Intrinsics.checkNotNullParameter(actionType, "actionType");
        Intrinsics.checkNotNullParameter(cartPickerVO, "cartPickerVO");
        CartTileVO.TileItem.TileControl tileControl = this.$item.getTileControl();
        CartTileVO.TileItem.TileControl.AvailableControl availableControl = tileControl instanceof CartTileVO.TileItem.TileControl.AvailableControl ? (CartTileVO.TileItem.TileControl.AvailableControl) tileControl : null;
        if (availableControl == null) {
            return;
        }
        CartTileVO.TileItem copy$default = CartTileVO.TileItem.copy$default(this.$item, 0L, null, null, availableControl.copy(cartPickerVO), null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, false, 16777207, null);
        int i11 = WhenMappings.$EnumSwitchMapping$0[actionType.ordinal()];
        if (i11 == 1) {
            changeValueAction = cartPickerVO.getQuantity().getChangeQuantityAction().getChangeValueAction();
            incrementTrackingInfo = cartPickerVO.getQuantity().getChangeQuantityAction().getIncrementTrackingInfo();
        } else if (i11 == 2) {
            changeValueAction = cartPickerVO.getQuantity().getChangeQuantityAction().getChangeValueAction();
            incrementTrackingInfo = cartPickerVO.getQuantity().getChangeQuantityAction().getDecrementTrackingInfo();
        } else {
            if (i11 != 3) {
                throw new o();
            }
            changeValueAction = cartPickerVO.getQuantity().getDecrementRemoveAction().getAction();
            incrementTrackingInfo = cartPickerVO.getQuantity().getDecrementRemoveAction().getTrackingInfo();
        }
        if (incrementTrackingInfo != null) {
            this.$processClickEvent.invoke(incrementTrackingInfo);
        }
        this.$actionHandler.invoke(changeValueAction, copy$default);
    }
}
