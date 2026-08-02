package ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v2.domain;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.models.CartItemInfo;
import ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v2.presentation.DeliveryWidgetV2VO;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001Jx\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\t\u001a\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\u0006\u0010\r\u001a\u00020\f2\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000fH¦@¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v2/domain/DeliveryWidgetV2Repository;", "", "", "", "Lru/ozon/app/android/cart/common/models/CartItemInfo;", "addedItems", "updatedItems", "removedItems", "", "asyncData", "", "allowedDeliverySchemas", "", "isExpressContext", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v2/presentation/DeliveryWidgetV2VO;", "requestUpdateByCartChanges", "(Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Ljava/util/List;ZLl20/d;Lkotlin/coroutines/d;)Ljava/lang/Object;", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface DeliveryWidgetV2Repository {
    Object requestUpdateByCartChanges(@NotNull Map<Long, CartItemInfo> map, @NotNull Map<Long, CartItemInfo> map2, @NotNull Map<Long, CartItemInfo> map3, @NotNull String str, @NotNull List<Long> list, boolean z11, @NotNull d dVar, @NotNull kotlin.coroutines.d<? super DeliveryWidgetV2VO> dVar2);
}
