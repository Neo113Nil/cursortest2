package ru.ozon.app.android.cml.delivery.widgets.secureDeal.presentation;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.cml.delivery.common.ext.WidgetExtKt;
import ru.ozon.app.android.cml.delivery.molecules.secureDeal.data.SecureDealMoleculeDTO;
import ru.ozon.app.android.cml.delivery.widgets.secureDeal.data.SecureDealDTO;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/secureDeal/data/SecureDealDTO;", "dto", "Ll20/d;", "widgetInfo", "", "Lru/ozon/app/android/cml/delivery/widgets/secureDeal/presentation/SecureDealVO;", "invoke", "(Lru/ozon/app/android/cml/delivery/widgets/secureDeal/data/SecureDealDTO;Ll20/d;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes6.dex */
final class SecureDealViewMapper$mapper$1 extends AbstractC7737t implements Function2<SecureDealDTO, d, List<? extends SecureDealVO>> {
    public static final SecureDealViewMapper$mapper$1 INSTANCE = new SecureDealViewMapper$mapper$1();

    SecureDealViewMapper$mapper$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final List<SecureDealVO> invoke(SecureDealDTO dto, d widgetInfo) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long widgetId = WidgetExtKt.getWidgetId(widgetInfo);
        SecureDealMoleculeDTO secureDeal = dto.getSecureDeal();
        Map<String, TokenizedTrackingInfo> trackingInfo = dto.getTrackingInfo();
        return C7714v.a0(new SecureDealVO(widgetId, Long.hashCode(WidgetExtKt.getWidgetId(widgetInfo)), secureDeal, trackingInfo != null ? TrackingInfoMapperKt.mapToTokenizedEvent(trackingInfo, Long.valueOf(WidgetExtKt.getWidgetId(widgetInfo)), null) : null));
    }
}
