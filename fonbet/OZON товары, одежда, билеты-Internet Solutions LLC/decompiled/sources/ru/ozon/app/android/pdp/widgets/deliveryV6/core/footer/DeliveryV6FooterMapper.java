package ru.ozon.app.android.pdp.widgets.deliveryV6.core.footer;

import Kk.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.widgets.delivery.data.DeliveryDTO;
import ru.ozon.app.android.pdp.widgets.delivery.data.DeliveryDTOHolder;
import ru.ozon.app.android.pdp.widgets.deliveryV6.presentation.DeliveryV6VO;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\u00022\n\u0010\u000b\u001a\u00060\u0003j\u0002`\nH\u0096\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/pdp/widgets/deliveryV6/core/footer/DeliveryV6FooterMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/pdp/widgets/delivery/data/DeliveryDTOHolder;", "Ll20/d;", "", "Lru/ozon/app/android/pdp/widgets/deliveryV6/presentation/DeliveryV6VO$Footer;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/pdp/widgets/delivery/data/DeliveryDTOHolder;Ll20/d;)Ljava/util/List;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DeliveryV6FooterMapper implements Function2<DeliveryDTOHolder, d, List<? extends DeliveryV6VO.Footer>> {
    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<DeliveryV6VO.Footer> invoke(@NotNull DeliveryDTOHolder state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        DeliveryDTO value = state.getValue();
        if (value != null ? Intrinsics.d(value.isHidden(), Boolean.TRUE) : false) {
            return K.f71697a;
        }
        long a11 = c.a(widgetInfo.d(), "_DeliveryV6VO.Footer");
        DeliveryDTO value2 = state.getValue();
        String tabGroupId = value2 != null ? value2.getTabGroupId() : null;
        DeliveryDTO value3 = state.getValue();
        return C7714v.a0(new DeliveryV6VO.Footer(a11, tabGroupId, value3 != null ? value3.getMoreInfoButton() : null));
    }
}
