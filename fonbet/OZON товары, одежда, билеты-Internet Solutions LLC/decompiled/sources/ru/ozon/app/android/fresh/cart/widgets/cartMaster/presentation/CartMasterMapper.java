package ru.ozon.app.android.fresh.cart.widgets.cartMaster.presentation;

import WZ.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.fresh.cart.widgets.cartMaster.data.CartMasterDTO;
import ru.ozon.app.android.fresh.cart.widgets.cartMaster.data.CartSummaryItemDTO;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u000b\u001a\u00020\n*\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\r\u001a\u00020\u00022\n\u0010\u000f\u001a\u00060\u0003j\u0002`\u000eH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/fresh/cart/widgets/cartMaster/presentation/CartMasterMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/fresh/cart/widgets/cartMaster/data/CartMasterDTO;", "Ll20/d;", "", "Lru/ozon/app/android/fresh/cart/widgets/cartMaster/presentation/CartMasterVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "Lru/ozon/app/android/fresh/cart/widgets/cartMaster/data/CartSummaryItemDTO;", "Lru/ozon/app/android/fresh/cart/widgets/cartMaster/presentation/CartSummaryItemVO;", "toVO", "(Lru/ozon/app/android/fresh/cart/widgets/cartMaster/data/CartSummaryItemDTO;)Lru/ozon/app/android/fresh/cart/widgets/cartMaster/presentation/CartSummaryItemVO;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/fresh/cart/widgets/cartMaster/data/CartMasterDTO;Ll20/d;)Ljava/util/List;", "widgets-cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CartMasterMapper implements Function2<CartMasterDTO, d, List<? extends CartMasterVO>> {
    private final CartSummaryItemVO toVO(CartSummaryItemDTO cartSummaryItemDTO) {
        return new CartSummaryItemVO(cartSummaryItemDTO.getId(), cartSummaryItemDTO.getQuantity(), cartSummaryItemDTO.getSelectedDeliverySchema());
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<CartMasterVO> invoke(@NotNull CartMasterDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        ArrayList arrayList = null;
        t mapToTokenizedEvent$default = TrackingInfoMapperKt.mapToTokenizedEvent$default(state.getTrackingInfo(), Long.valueOf(hashCode), null, 2, null);
        List<CartSummaryItemDTO> summary = state.getSummary();
        if (summary != null) {
            List<CartSummaryItemDTO> list = summary;
            arrayList = new ArrayList(C7714v.z(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(toVO((CartSummaryItemDTO) it.next()));
            }
        }
        return C7714v.a0(new CartMasterVO(hashCode, mapToTokenizedEvent$default, arrayList));
    }
}
