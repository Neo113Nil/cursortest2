package ru.ozon.app.android.cart.master.mapper;

import WZ.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.cart.master.data.CartSummaryItemDTO;
import ru.ozon.app.android.cart.master.data.MasterDTO;
import ru.ozon.app.android.cart.master.presentation.CartSummaryItemVO;
import ru.ozon.app.android.cart.master.presentation.MasterVO;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u000b\u001a\u00020\n*\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\r\u001a\u00020\u00022\n\u0010\u000f\u001a\u00060\u0003j\u0002`\u000eH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/cart/master/mapper/MasterMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/cart/master/data/MasterDTO;", "Ll20/d;", "", "Lru/ozon/app/android/cart/master/presentation/MasterVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "Lru/ozon/app/android/cart/master/data/CartSummaryItemDTO;", "Lru/ozon/app/android/cart/master/presentation/CartSummaryItemVO;", "toVO", "(Lru/ozon/app/android/cart/master/data/CartSummaryItemDTO;)Lru/ozon/app/android/cart/master/presentation/CartSummaryItemVO;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/cart/master/data/MasterDTO;Ll20/d;)Ljava/util/List;", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class MasterMapper implements Function2<MasterDTO, d, List<? extends MasterVO>> {
    private final CartSummaryItemVO toVO(CartSummaryItemDTO cartSummaryItemDTO) {
        return new CartSummaryItemVO(cartSummaryItemDTO.getId(), cartSummaryItemDTO.getQuantity(), cartSummaryItemDTO.getSelectedDeliverySchema());
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<MasterVO> invoke(@NotNull MasterDTO state, @NotNull d widgetInfo) {
        ArrayList arrayList;
        CartSummaryItemVO vOFamily;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        Map<String, TokenizedTrackingInfo> trackingInfo = state.getTrackingInfo();
        ArrayList arrayList2 = null;
        t tokenizedEvent$default = trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null) : null;
        List<CartSummaryItemDTO> summary = state.getSummary();
        if (summary != null) {
            List<CartSummaryItemDTO> list = summary;
            arrayList = new ArrayList(C7714v.z(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(toVO((CartSummaryItemDTO) it.next()));
            }
        } else {
            arrayList = null;
        }
        List<CartSummaryItemDTO> summaryFamily = state.getSummaryFamily();
        if (summaryFamily != null) {
            List<CartSummaryItemDTO> list2 = summaryFamily;
            arrayList2 = new ArrayList(C7714v.z(list2, 10));
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                vOFamily = MasterMapperKt.toVOFamily((CartSummaryItemDTO) it2.next());
                arrayList2.add(vOFamily);
            }
        }
        return C7714v.a0(new MasterVO(hashCode, tokenizedEvent$default, arrayList, arrayList2, state.getNextTabDeeplink()));
    }
}
