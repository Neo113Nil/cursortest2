package ru.ozon.app.android.fresh.cart.ui.molecules.cartPicker.presentation;

import WZ.t;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.fresh.cart.ui.molecules.cartPicker.data.CartPickerDTO;
import ru.ozon.app.android.fresh.cart.ui.molecules.cartPicker.presentation.CartPickerVO;
import ru.ozon.app.android.fresh.common.widgets.molecules.QuantCountStrategy;
import ru.ozon.uni.android.haptic.HapticToken;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\u0004\u001a\u00020\u0007*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\b\u001a\u001b\u0010\u0004\u001a\u00020\n*\u00020\t2\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u000b\u001a\u001b\u0010\u0004\u001a\u00020\r*\u00020\f2\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/data/CartPickerDTO;", "", "widgetId", "Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/presentation/CartPickerVO;", "toVO", "(Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/data/CartPickerDTO;J)Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/presentation/CartPickerVO;", "Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/data/CartPickerDTO$QuantityControl;", "Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/presentation/CartPickerVO$QuantityControl;", "(Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/data/CartPickerDTO$QuantityControl;J)Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/presentation/CartPickerVO$QuantityControl;", "Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/data/CartPickerDTO$QuantityControl$ChangeQuantity;", "Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/presentation/CartPickerVO$QuantityControl$ChangeQuantity;", "(Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/data/CartPickerDTO$QuantityControl$ChangeQuantity;J)Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/presentation/CartPickerVO$QuantityControl$ChangeQuantity;", "Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/data/CartPickerDTO$QuantityControl$DecrementRemove;", "Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/presentation/CartPickerVO$QuantityControl$DecrementRemove;", "(Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/data/CartPickerDTO$QuantityControl$DecrementRemove;J)Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/presentation/CartPickerVO$QuantityControl$DecrementRemove;", "widgets-cart_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CartPickerMapperKt {
    @NotNull
    public static final CartPickerVO toVO(@NotNull CartPickerDTO cartPickerDTO, long j11) {
        Intrinsics.checkNotNullParameter(cartPickerDTO, "<this>");
        return new CartPickerVO(cartPickerDTO.getQuantityTitle(), cartPickerDTO.getSubtitle(), toVO(cartPickerDTO.getQuantity(), j11), cartPickerDTO.getDecrementIcon(), cartPickerDTO.getIncrementIcon(), cartPickerDTO.getSize(), cartPickerDTO.getSizingPriority(), cartPickerDTO.getStyleType(), cartPickerDTO.getCustomStyle());
    }

    private static final CartPickerVO.QuantityControl toVO(CartPickerDTO.QuantityControl quantityControl, long j11) {
        return new CartPickerVO.QuantityControl(quantityControl.getValue(), quantityControl.getMinValue(), quantityControl.getMaxValue(), quantityControl.getMultiplicity(), quantityControl.getQuantSize(), toVO(quantityControl.getChangeQuantityAction(), j11), toVO(quantityControl.getDecrementRemoveAction(), j11), QuantCountStrategy.INSTANCE.isIncreaseEnabled(quantityControl.getValue(), quantityControl.getMultiplicity(), quantityControl.getMaxValue()) ? HapticToken.SUCCESS : HapticToken.ERROR, HapticToken.SUCCESS);
    }

    private static final CartPickerVO.QuantityControl.ChangeQuantity toVO(CartPickerDTO.QuantityControl.ChangeQuantity changeQuantity, long j11) {
        long changeValueDebounceDelay = (long) (changeQuantity.getChangeValueDebounceDelay() * 1000);
        AtomAction atomAction = AtomActionMapperKt.toAtomAction(changeQuantity.getChangeValueAction(), null);
        Map<String, TokenizedTrackingInfo> incrementTrackingInfo = changeQuantity.getIncrementTrackingInfo();
        t mapToTokenizedEvent$default = incrementTrackingInfo != null ? TrackingInfoMapperKt.mapToTokenizedEvent$default(incrementTrackingInfo, Long.valueOf(j11), null, 2, null) : null;
        Map<String, TokenizedTrackingInfo> decrementTrackingInfo = changeQuantity.getDecrementTrackingInfo();
        return new CartPickerVO.QuantityControl.ChangeQuantity(atomAction, changeValueDebounceDelay, mapToTokenizedEvent$default, decrementTrackingInfo != null ? TrackingInfoMapperKt.mapToTokenizedEvent$default(decrementTrackingInfo, Long.valueOf(j11), null, 2, null) : null);
    }

    private static final CartPickerVO.QuantityControl.DecrementRemove toVO(CartPickerDTO.QuantityControl.DecrementRemove decrementRemove, long j11) {
        AtomAction atomAction = AtomActionMapperKt.toAtomAction(decrementRemove.getAction(), null);
        Map<String, TokenizedTrackingInfo> trackingInfo = decrementRemove.getTrackingInfo();
        return new CartPickerVO.QuantityControl.DecrementRemove(atomAction, trackingInfo != null ? TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null);
    }
}
