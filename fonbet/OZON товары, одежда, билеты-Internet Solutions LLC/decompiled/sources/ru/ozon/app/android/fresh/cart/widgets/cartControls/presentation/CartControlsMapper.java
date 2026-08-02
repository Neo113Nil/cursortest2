package ru.ozon.app.android.fresh.cart.widgets.cartControls.presentation;

import WZ.t;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.cart.ui.tooltip.CartTooltipVO;
import ru.ozon.app.android.cart.ui.tooltip.CartTooltipVOKt;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.fresh.cart.widgets.cartControls.data.CartControlsDTO;
import ru.ozon.app.android.fresh.cart.widgets.cartControls.data.TooltipData;
import ru.ozon.app.android.fresh.cart.widgets.cartControls.presentation.CartControlsVO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\t\b\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000b\u001a\u00020\u000e*\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\u000fJ*\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0010\u001a\u00020\u00022\n\u0010\u0012\u001a\u00060\u0003j\u0002`\u0011H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/fresh/cart/widgets/cartControls/presentation/CartControlsMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/fresh/cart/widgets/cartControls/data/CartControlsDTO;", "Ll20/d;", "", "Lru/ozon/app/android/fresh/cart/widgets/cartControls/presentation/CartControlsVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "", "widgetId", "toVO", "(Lru/ozon/app/android/fresh/cart/widgets/cartControls/data/CartControlsDTO;J)Lru/ozon/app/android/fresh/cart/widgets/cartControls/presentation/CartControlsVO;", "Lru/ozon/app/android/fresh/cart/widgets/cartControls/data/TooltipData;", "Lru/ozon/app/android/fresh/cart/widgets/cartControls/presentation/CartControlsVO$TooltipData;", "(Lru/ozon/app/android/fresh/cart/widgets/cartControls/data/TooltipData;J)Lru/ozon/app/android/fresh/cart/widgets/cartControls/presentation/CartControlsVO$TooltipData;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/fresh/cart/widgets/cartControls/data/CartControlsDTO;Ll20/d;)Ljava/util/List;", "widgets-cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CartControlsMapper implements Function2<CartControlsDTO, d, List<? extends CartControlsVO>> {
    private final CartControlsVO toVO(CartControlsDTO cartControlsDTO, long j11) {
        CellDTO selectionControls = cartControlsDTO.getSelectionControls();
        IconButtonV3DTO binButton = cartControlsDTO.getBinButton();
        CartControlsVO.Spacers spacers = new CartControlsVO.Spacers(cartControlsDTO.getSpacers().getTopPadding(), cartControlsDTO.getSpacers().getBottomPadding(), cartControlsDTO.getSpacers().getLeftPadding(), cartControlsDTO.getSpacers().getRightPadding());
        boolean isTopCornersRounded = cartControlsDTO.isTopCornersRounded();
        Map<String, TokenizedTrackingInfo> trackingInfo = cartControlsDTO.getTrackingInfo();
        t mapToTokenizedEvent$default = trackingInfo != null ? TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null;
        IconButtonV3DTO moveItemsButton = cartControlsDTO.getMoveItemsButton();
        boolean isAnimationEnabled = cartControlsDTO.isAnimationEnabled();
        TooltipData tooltipData = cartControlsDTO.getTooltipData();
        return new CartControlsVO(j11, selectionControls, binButton, spacers, isTopCornersRounded, mapToTokenizedEvent$default, moveItemsButton, tooltipData != null ? toVO(tooltipData, j11) : null, isAnimationEnabled, false, UserVerificationMethods.USER_VERIFY_NONE, null);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<CartControlsVO> invoke(@NotNull CartControlsDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(toVO(state, widgetInfo.d().hashCode()));
    }

    private final CartControlsVO.TooltipData toVO(TooltipData tooltipData, long j11) {
        String key = tooltipData.getKey();
        CartTooltipVO cartTooltipVO = CartTooltipVOKt.toCartTooltipVO(tooltipData.getTooltip());
        DateTime serverTimestamp = tooltipData.getServerTimestamp();
        Map<String, TokenizedTrackingInfo> trackingInfo = tooltipData.getTrackingInfo();
        return new CartControlsVO.TooltipData(key, cartTooltipVO, serverTimestamp, trackingInfo != null ? TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null);
    }
}
