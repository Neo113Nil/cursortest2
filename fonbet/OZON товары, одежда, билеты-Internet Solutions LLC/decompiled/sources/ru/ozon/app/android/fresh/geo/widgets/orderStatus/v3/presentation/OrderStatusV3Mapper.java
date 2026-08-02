package ru.ozon.app.android.fresh.geo.widgets.orderStatus.v3.presentation;

import Sc.o;
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
import ru.ozon.app.android.fresh.geo.utils.ExtensionsKt;
import ru.ozon.app.android.fresh.geo.widgets.orderStatus.v3.data.OrderStatusV3DTO;
import ru.ozon.app.android.fresh.geo.widgets.orderStatus.v3.presentation.OrderStatusV3VO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u000b\u001a\u00020\n*\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ&\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/fresh/geo/widgets/orderStatus/v3/presentation/OrderStatusV3Mapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/fresh/geo/widgets/orderStatus/v3/data/OrderStatusV3DTO;", "Ll20/d;", "", "Lru/ozon/app/android/fresh/geo/widgets/orderStatus/v3/presentation/OrderStatusV3VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "Lru/ozon/app/android/fresh/geo/widgets/orderStatus/v3/data/OrderStatusV3DTO$Progress$ProgressType;", "Lru/ozon/app/android/fresh/geo/widgets/orderStatus/v3/presentation/OrderStatusV3VO$ProgressType;", "toVO", "(Lru/ozon/app/android/fresh/geo/widgets/orderStatus/v3/data/OrderStatusV3DTO$Progress$ProgressType;)Lru/ozon/app/android/fresh/geo/widgets/orderStatus/v3/presentation/OrderStatusV3VO$ProgressType;", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/fresh/geo/widgets/orderStatus/v3/data/OrderStatusV3DTO;Ll20/d;)Ljava/util/List;", "widgets-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class OrderStatusV3Mapper implements Function2<OrderStatusV3DTO, d, List<? extends OrderStatusV3VO>> {
    private final OrderStatusV3VO.ProgressType toVO(OrderStatusV3DTO.Progress.ProgressType progressType) {
        if (progressType instanceof OrderStatusV3DTO.Progress.ProgressType.ProgressIcon) {
            return new OrderStatusV3VO.ProgressType.ProgressIcon(((OrderStatusV3DTO.Progress.ProgressType.ProgressIcon) progressType).getIcon());
        }
        if (!(progressType instanceof OrderStatusV3DTO.Progress.ProgressType.ProgressText)) {
            throw new o();
        }
        OrderStatusV3DTO.Progress.ProgressType.ProgressText progressText = (OrderStatusV3DTO.Progress.ProgressType.ProgressText) progressType;
        return new OrderStatusV3VO.ProgressType.ProgressText(progressText.getTitle(), progressText.getSubtitle());
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<OrderStatusV3VO> invoke(@NotNull OrderStatusV3DTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long id2 = ExtensionsKt.getId(widgetInfo);
        TextDTO title = state.getTitle();
        TextDTO subtitle = state.getSubtitle();
        float progress = state.getProgress().getProgress();
        String ringProgressColor = state.getProgress().getRingProgressColor();
        OrderStatusV3VO.ProgressType vo = toVO(state.getProgress().getType());
        Map<String, TokenizedTrackingInfo> trackingInfo = state.getTrackingInfo();
        return C7714v.a0(new OrderStatusV3VO(id2, title, subtitle, ringProgressColor, progress, vo, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(ExtensionsKt.getId(widgetInfo)), null, 2, null) : null));
    }
}
