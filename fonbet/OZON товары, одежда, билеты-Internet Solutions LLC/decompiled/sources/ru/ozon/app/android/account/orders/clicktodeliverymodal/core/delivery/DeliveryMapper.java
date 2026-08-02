package ru.ozon.app.android.account.orders.clicktodeliverymodal.core.delivery;

import Lh.b;
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
import ru.ozon.app.android.account.orders.clicktodeliverymodal.data.DeliveryDTO;
import ru.ozon.app.android.account.orders.clicktodeliverymodal.presentation.delivery.DeliveryVI;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.cscore.orderdetails.molecule.images.data.ImageDTO;
import ru.ozon.app.android.cscore.orderdetails.molecule.images.presentation.ImageVOKt;
import ru.ozon.app.android.cscore.orderdetails.molecule.images.presentation.ImagesVOKt;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/account/orders/clicktodeliverymodal/core/delivery/DeliveryMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/account/orders/clicktodeliverymodal/data/DeliveryDTO;", "Ll20/d;", "", "Lru/ozon/app/android/account/orders/clicktodeliverymodal/presentation/delivery/DeliveryVI;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/account/orders/clicktodeliverymodal/data/DeliveryDTO;Ll20/d;)Ljava/util/List;", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DeliveryMapper implements Function2<DeliveryDTO, d, List<? extends DeliveryVI>> {
    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<DeliveryVI> invoke(@NotNull DeliveryDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long a11 = b.a(state.getIndex(), widgetInfo.d(), "_delivery_");
        String backgroundColor = state.getBackgroundColor();
        int px = state.getCornerRadius().getPx();
        CellDTO cell = state.getCell();
        List<ImageDTO> images = state.getImages();
        ArrayList arrayList = new ArrayList(C7714v.z(images, 10));
        Iterator<T> it = images.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            arrayList.add(ImageVOKt.toVo((ImageDTO) it.next(), null, null, ImagesVOKt.toGalleryItems(state.getImages())));
        }
        Map<String, TokenizedTrackingInfo> trackingInfo = state.getTrackingInfo();
        return C7714v.a0(new DeliveryVI(a11, backgroundColor, px, cell, arrayList, trackingInfo != null ? TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(a11), null, 2, null) : null, state.getTestInfo()));
    }
}
