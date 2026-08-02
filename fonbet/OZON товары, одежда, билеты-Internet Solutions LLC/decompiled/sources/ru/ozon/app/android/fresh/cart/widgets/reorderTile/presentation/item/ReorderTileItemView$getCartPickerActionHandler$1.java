package ru.ozon.app.android.fresh.cart.widgets.reorderTile.presentation.item;

import Sc.o;
import WZ.t;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.fresh.cart.ui.molecules.cartPicker.presentation.CartPickerBinder;
import ru.ozon.app.android.fresh.cart.ui.molecules.cartPicker.presentation.CartPickerVO;
import ru.ozon.app.android.fresh.cart.widgets.reorderTile.presentation.ReorderTileVO;
import ru.ozon.tracker.model.TrinityEventEntityKt;
import ru.ozon.tracker.sendEvent.ActionType;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", TrinityEventEntityKt.ACTION_TYPE_JSON_NAME, "Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/presentation/CartPickerBinder$CartPickerActionType;", "cartPickerVO", "Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/presentation/CartPickerVO;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class ReorderTileItemView$getCartPickerActionHandler$1 extends AbstractC7737t implements Function2<CartPickerBinder.CartPickerActionType, CartPickerVO, Unit> {
    final /* synthetic */ Function2<AtomAction, ReorderTileVO.TileItem, Unit> $actionHandler;
    final /* synthetic */ ReorderTileVO.TileItem.TileControl.AvailableControl $controller;
    final /* synthetic */ ReorderTileVO.TileItem $item;
    final /* synthetic */ Function1<t, Unit> $processClickEvent;
    final /* synthetic */ ReorderTileItemView this$0;

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
    ReorderTileItemView$getCartPickerActionHandler$1(ReorderTileVO.TileItem tileItem, ReorderTileItemView reorderTileItemView, ReorderTileVO.TileItem.TileControl.AvailableControl availableControl, Function1<? super t, Unit> function1, Function2<? super AtomAction, ? super ReorderTileVO.TileItem, Unit> function2) {
        super(2);
        this.$item = tileItem;
        this.this$0 = reorderTileItemView;
        this.$controller = availableControl;
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
        CartPickerVO cartPickerVO2;
        int normalizeQuantity;
        int i11;
        int i12;
        CartPickerVO cartPickerVO3;
        ReorderTileVO.TileItem copy;
        AtomAction atomAction;
        t tVar;
        TokenizedTrackingInfo tokenizedTrackingInfo;
        Intrinsics.checkNotNullParameter(actionType, "actionType");
        Intrinsics.checkNotNullParameter(cartPickerVO, "cartPickerVO");
        ReorderTileVO.TileItem.TileControl tileControl = this.$item.getTileControl();
        t tVar2 = null;
        ReorderTileVO.TileItem.TileControl.AvailableControl availableControl = tileControl instanceof ReorderTileVO.TileItem.TileControl.AvailableControl ? (ReorderTileVO.TileItem.TileControl.AvailableControl) tileControl : null;
        if (availableControl == null || (cartPickerVO2 = availableControl.getCartPicker()) == null) {
            cartPickerVO2 = cartPickerVO;
        }
        int value = cartPickerVO2.getQuantity().getValue();
        int minValue = cartPickerVO2.getQuantity().getMinValue();
        int value2 = cartPickerVO.getQuantity().getValue();
        normalizeQuantity = this.this$0.normalizeQuantity(value, value2, minValue);
        if (normalizeQuantity != value2) {
            i11 = normalizeQuantity;
            i12 = value;
            cartPickerVO3 = CartPickerVO.copy$default(cartPickerVO, null, null, CartPickerVO.QuantityControl.copy$default(cartPickerVO.getQuantity(), i11, 0, 0, 0, 0, null, null, null, null, 510, null), null, null, null, null, null, null, 507, null);
        } else {
            i11 = normalizeQuantity;
            i12 = value;
            cartPickerVO3 = cartPickerVO;
        }
        copy = r4.copy((r29 & 1) != 0 ? r4.widgetId : 0L, (r29 & 2) != 0 ? r4.image : null, (r29 & 4) != 0 ? r4.innerAtoms : null, (r29 & 8) != 0 ? r4.tileControl : ReorderTileVO.TileItem.TileControl.AvailableControl.copy$default(this.$controller, cartPickerVO3, null, 2, null), (r29 & 16) != 0 ? r4.action : null, (r29 & 32) != 0 ? r4.radius : 0, (r29 & 64) != 0 ? r4.spacers : null, (r29 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? r4.separator : null, (r29 & 256) != 0 ? r4.backgroundColor : null, (r29 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? r4.tokenizedEvent : null, (r29 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? r4.trackingInfo : null, (r29 & 2048) != 0 ? r4.hasParanja : false, (r29 & 4096) != 0 ? this.$item.shouldShowHint : false);
        int i13 = WhenMappings.$EnumSwitchMapping$0[actionType.ordinal()];
        if (i13 == 1) {
            AtomAction changeValueAction = cartPickerVO3.getQuantity().getChangeQuantityAction().getChangeValueAction();
            if (i12 == 0) {
                Map<String, TokenizedTrackingInfo> trackingInfo = this.$item.getTrackingInfo();
                if (trackingInfo != null && (tokenizedTrackingInfo = trackingInfo.get(ActionType.TO_CART.INSTANCE.getType())) != null) {
                    tVar2 = TrackingInfoMapperKt.mapToTokenizedEvent$default(U.i(new Pair(ActionType.CLICK.INSTANCE.getType(), tokenizedTrackingInfo)), Long.valueOf(this.$item.getWidgetId()), null, 2, null);
                }
            } else {
                tVar2 = cartPickerVO3.getQuantity().getChangeQuantityAction().getIncrementTrackingInfo();
            }
            atomAction = changeValueAction;
            tVar = tVar2;
        } else if (i13 == 2) {
            atomAction = cartPickerVO3.getQuantity().getChangeQuantityAction().getChangeValueAction();
            tVar = cartPickerVO3.getQuantity().getChangeQuantityAction().getDecrementTrackingInfo();
        } else {
            if (i13 != 3) {
                throw new o();
            }
            atomAction = cartPickerVO3.getQuantity().getDecrementRemoveAction().getAction();
            tVar = cartPickerVO3.getQuantity().getDecrementRemoveAction().getTrackingInfo();
            if (atomAction instanceof AtomAction.Click) {
                atomAction = this.this$0.withCustomParam((AtomAction.Click) atomAction, "SHRINK_ACTION", "true");
            }
        }
        if (atomAction instanceof AtomAction.Click) {
            AtomAction.Click click = (AtomAction.Click) atomAction;
            if (Intrinsics.d(click.getId(), "addToCart")) {
                atomAction = this.this$0.withCustomParam(click, "quantity", String.valueOf(i11));
            }
        }
        if (tVar != null) {
            this.$processClickEvent.invoke(tVar);
        }
        this.$actionHandler.invoke(atomAction, copy);
    }
}
