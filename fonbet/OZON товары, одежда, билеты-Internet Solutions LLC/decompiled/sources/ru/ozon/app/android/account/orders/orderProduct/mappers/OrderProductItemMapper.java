package ru.ozon.app.android.account.orders.orderProduct.mappers;

import WZ.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.account.orders.orderProduct.data.dto.OrderProductItemDTO;
import ru.ozon.app.android.account.orders.orderProduct.viewObject.OrderProductItemVO;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.cscore.orderdetails.molecule.images.data.ImageDTO;
import ru.ozon.app.android.cscore.orderdetails.molecule.images.presentation.ImageVOKt;
import ru.ozon.app.android.cscore.padding.Padding;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/account/orders/orderProduct/mappers/OrderProductItemMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/account/orders/orderProduct/data/dto/OrderProductItemDTO;", "Ll20/d;", "", "Lru/ozon/app/android/account/orders/orderProduct/viewObject/OrderProductItemVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "dto", "widgetInfo", "invoke", "(Lru/ozon/app/android/account/orders/orderProduct/data/dto/OrderProductItemDTO;Ll20/d;)Ljava/util/List;", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class OrderProductItemMapper implements Function2<OrderProductItemDTO, d, List<? extends OrderProductItemVO>> {
    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<OrderProductItemVO> invoke(@NotNull OrderProductItemDTO dto, @NotNull d widgetInfo) {
        t tVar;
        Map<String, TokenizedTrackingInfo> trackingInfo;
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        CellDTO cell = dto.getCell();
        List<ImageDTO> images = dto.getProducts().getImages().getImages();
        if (images == null) {
            images = K.f71697a;
        }
        List<ImageDTO> list = images;
        ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
        Iterator<T> it = list.iterator();
        while (true) {
            tVar = null;
            if (!it.hasNext()) {
                break;
            }
            arrayList.add(ImageVOKt.toVo((ImageDTO) it.next(), null, null, K.f71697a));
        }
        CommonCellSettings.LayoutPadding spaceBetween = dto.getProducts().getImages().getSpaceBetween();
        if (spaceBetween == null) {
            spaceBetween = CommonCellSettings.LayoutPadding.PADDING_500;
        }
        Padding paddings = dto.getProducts().getPaddings();
        String backgroundColor = dto.getBackgroundColor();
        if (backgroundColor == null) {
            backgroundColor = UniColors.LAYER_FLOOR_1.getToken();
        }
        String str = backgroundColor;
        CommonControlSettings common = dto.getProducts().getImages().getCommon();
        CommonControlSettings common2 = dto.getCommon();
        CommonControlSettings common3 = dto.getCommon();
        if (common3 != null && (trackingInfo = common3.getTrackingInfo()) != null) {
            tVar = TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null);
        }
        return C7714v.a0(new OrderProductItemVO(hashCode, cell, arrayList, spaceBetween, str, paddings, common, common2, tVar));
    }
}
