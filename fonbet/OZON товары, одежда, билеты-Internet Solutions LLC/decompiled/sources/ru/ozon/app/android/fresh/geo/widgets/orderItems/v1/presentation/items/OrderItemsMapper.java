package ru.ozon.app.android.fresh.geo.widgets.orderItems.v1.presentation.items;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMolecule;
import ru.ozon.app.android.fresh.geo.widgets.orderItems.v1.data.OrderItemsDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\u00022\n\u0010\u000b\u001a\u00060\u0003j\u0002`\nH\u0096\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/fresh/geo/widgets/orderItems/v1/presentation/items/OrderItemsMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/fresh/geo/widgets/orderItems/v1/data/OrderItemsDTO;", "Ll20/d;", "", "Lru/ozon/app/android/fresh/geo/widgets/orderItems/v1/presentation/items/OrderItemVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/fresh/geo/widgets/orderItems/v1/data/OrderItemsDTO;Ll20/d;)Ljava/util/List;", "widgets-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class OrderItemsMapper implements Function2<OrderItemsDTO, d, List<? extends OrderItemVO>> {
    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<OrderItemVO> invoke(@NotNull OrderItemsDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        List<OrderItemsDTO.Item> items = state.getItems();
        ArrayList arrayList = new ArrayList(C7714v.z(items, 10));
        int i11 = 0;
        for (Object obj : items) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            OrderItemsDTO.Item item = (OrderItemsDTO.Item) obj;
            long hashCode = toString().hashCode();
            long hashCode2 = widgetInfo.d().hashCode();
            TextAtom name = item.getName();
            TextAtom totalPrice = item.getTotalPrice();
            TextAtom priceDetails = item.getPriceDetails();
            AtomAction atomAction = AtomActionMapperKt.toAtomAction(item.getAction(), item.getTrackingInfo());
            String image = item.getImage();
            Badge badge = item.getBadge();
            FavoriteProductMolecule favoriteProduct = item.getFavoriteProduct();
            Map<String, TokenizedTrackingInfo> trackingInfo = item.getTrackingInfo();
            Map<String, TokenizedTrackingInfo> trackingInfo2 = item.getTrackingInfo();
            arrayList.add(new OrderItemVO(hashCode, name, totalPrice, priceDetails, atomAction, image, favoriteProduct, badge, i11 != C7714v.P(state.getItems()), trackingInfo, trackingInfo2 != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo2, Long.valueOf(hashCode2), null, 2, null) : null));
            i11 = i12;
        }
        return arrayList;
    }
}
