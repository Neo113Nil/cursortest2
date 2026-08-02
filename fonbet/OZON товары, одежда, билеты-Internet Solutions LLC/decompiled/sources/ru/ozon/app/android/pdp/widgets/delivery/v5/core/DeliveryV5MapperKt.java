package ru.ozon.app.android.pdp.widgets.delivery.v5.core;

import Kk.c;
import T00.a;
import T00.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.widgets.delivery.data.DeliveryDTO;
import ru.ozon.app.android.pdp.widgets.delivery.presentation.DeliveryFooter;
import ru.ozon.app.android.pdp.widgets.delivery.presentation.DeliveryHeader;
import ru.ozon.app.android.pdp.widgets.delivery.presentation.DeliverySection;
import ru.ozon.app.android.pdp.widgets.delivery.presentation.VoKt;
import ru.ozon.app.android.pdp.widgets.delivery.v5.presentation.DeliveryV5Vo;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/pdp/widgets/delivery/data/DeliveryDTO;", "Ll20/d;", "widgetInfo", "Lru/ozon/app/android/pdp/widgets/delivery/v5/presentation/DeliveryV5Vo;", "extractVo", "(Lru/ozon/app/android/pdp/widgets/delivery/data/DeliveryDTO;Ll20/d;)Lru/ozon/app/android/pdp/widgets/delivery/v5/presentation/DeliveryV5Vo;", "pdp_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DeliveryV5MapperKt {
    @NotNull
    public static final DeliveryV5Vo extractVo(DeliveryDTO deliveryDTO, @NotNull d widgetInfo) {
        e h11;
        e h12;
        Boolean isHidden;
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long a11 = c.a(widgetInfo.d(), "-DeliveryV5Vo");
        String str = null;
        DeliveryHeader extractHeader = deliveryDTO != null ? VoKt.extractHeader(deliveryDTO) : null;
        DeliveryFooter extractFooter = deliveryDTO != null ? VoKt.extractFooter(deliveryDTO) : null;
        List<Object> sections = deliveryDTO != null ? deliveryDTO.getSections() : null;
        if (sections == null) {
            sections = K.f71697a;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = sections.iterator();
        while (it.hasNext()) {
            DeliverySection sectionToVo = VoKt.sectionToVo(it.next(), a11);
            if (sectionToVo != null) {
                arrayList.add(sectionToVo);
            }
        }
        DeliveryHeader extractHeader2 = deliveryDTO != null ? VoKt.extractHeader(deliveryDTO) : null;
        boolean booleanValue = (deliveryDTO == null || (isHidden = deliveryDTO.isHidden()) == null) ? false : isHidden.booleanValue();
        a b11 = widgetInfo.b();
        String e11 = (b11 == null || (h12 = b11.h()) == null) ? null : h12.e();
        a b12 = widgetInfo.b();
        if (b12 != null && (h11 = b12.h()) != null) {
            str = h11.j();
        }
        return new DeliveryV5Vo(a11, extractHeader2, extractFooter, arrayList, booleanValue, VoKt.toAdapterItems(arrayList, extractFooter, extractHeader, e11, str, widgetInfo.c().a()));
    }
}
