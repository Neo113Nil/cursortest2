package ru.ozon.app.android.checkoutorderdone.orderdone.orderdonetotal.core;

import Lh.b;
import java.util.ArrayList;
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
import ru.ozon.app.android.checkoutorderdone.orderdone.orderdonetotal.data.BlockDTO;
import ru.ozon.app.android.checkoutorderdone.orderdone.orderdonetotal.data.OrderDoneTotalDTO;
import ru.ozon.app.android.checkoutorderdone.orderdone.orderdonetotal.data.PricesDTO;
import ru.ozon.app.android.checkoutorderdone.orderdone.orderdonetotal.data.Tooltip;
import ru.ozon.app.android.checkoutorderdone.orderdone.orderdonetotal.presentation.OrderDoneTotalElement;
import ru.ozon.app.android.checkoutorderdone.orderdone.orderdonetotal.presentation.TooltipVO;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\t\b\u0007¢\u0006\u0004\b\u0007\u0010\bJ[\u0010\u0017\u001a\u00020\u0005*\u00020\t2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J&\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonetotal/core/OrderDoneTotalWidgetMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonetotal/data/OrderDoneTotalDTO;", "Ll20/d;", "", "Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonetotal/presentation/OrderDoneTotalElement;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonetotal/data/BlockDTO;", "", "id", "", "separatorColor", "", "paddingLeft", "", "hasTitleTopPadding", "subtitleTopPadding", "background", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "topCornerRadius", "bottomCornerRadius", "toVo", "(Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonetotal/data/BlockDTO;JLjava/lang/String;Ljava/lang/Integer;ZILjava/lang/String;Lru/ozon/uni/atoms/data/common/CornerRadius;Lru/ozon/uni/atoms/data/common/CornerRadius;)Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonetotal/presentation/OrderDoneTotalElement;", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonetotal/data/OrderDoneTotalDTO;Ll20/d;)Ljava/util/List;", "orderdone_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class OrderDoneTotalWidgetMapper implements Function2<OrderDoneTotalDTO, d, List<? extends OrderDoneTotalElement>> {
    private final OrderDoneTotalElement toVo(BlockDTO blockDTO, long j11, String str, Integer num, boolean z11, int i11, String str2, CornerRadius cornerRadius, CornerRadius cornerRadius2) {
        TooltipVO tooltipVO;
        TextDTO title = blockDTO.getLeft().getTitle();
        Tooltip tooltipV2 = blockDTO.getLeft().getTooltipV2();
        if (tooltipV2 != null) {
            IconDTO icon = tooltipV2.getIcon();
            CommonControlSettings common = tooltipV2.getCommon();
            Map<String, TokenizedTrackingInfo> trackingInfo = tooltipV2.getCommon().getTrackingInfo();
            tooltipVO = new TooltipVO(icon, common, trackingInfo != null ? TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null);
        } else {
            tooltipVO = null;
        }
        return new OrderDoneTotalElement(j11, title, tooltipVO, blockDTO.getRight().getPrice(), blockDTO.getRight().getAtomPrice(), blockDTO.getLeft().getSubtitle(), blockDTO.getLeft().getButton(), str, num != null ? Integer.valueOf(UiExtKt.toPx(num.intValue())) : null, z11 ? UiExtKt.toPx(12) : 0, i11, cornerRadius, cornerRadius2, str2);
    }

    static /* synthetic */ OrderDoneTotalElement toVo$default(OrderDoneTotalWidgetMapper orderDoneTotalWidgetMapper, BlockDTO blockDTO, long j11, String str, Integer num, boolean z11, int i11, String str2, CornerRadius cornerRadius, CornerRadius cornerRadius2, int i12, Object obj) {
        return orderDoneTotalWidgetMapper.toVo(blockDTO, j11, str, num, z11, (i12 & 16) != 0 ? UiExtKt.toPx(4) : i11, str2, cornerRadius, cornerRadius2);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<OrderDoneTotalElement> invoke(@NotNull OrderDoneTotalDTO state, @NotNull d widgetInfo) {
        List<BlockDTO> elements;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        ArrayList arrayList = new ArrayList();
        CornerRadius cornerRadius = state.getCornerRadius();
        if (cornerRadius == null) {
            cornerRadius = CornerRadius.NO_RADIUS;
        }
        int i11 = 0;
        for (Object obj : state.getPrices().getElements()) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            arrayList.add(toVo$default(this, (BlockDTO) obj, b.a(i11, widgetInfo.d(), "_"), null, state.getPaddingLeft(), i11 != 0, 0, state.getBackgroundColor(), i11 == 0 ? cornerRadius : CornerRadius.NO_RADIUS, CornerRadius.NO_RADIUS, 16, null));
            i11 = i12;
        }
        PricesDTO totalPrices = state.getTotalPrices();
        List<BlockDTO> elements2 = totalPrices != null ? totalPrices.getElements() : null;
        boolean z11 = elements2 == null || elements2.isEmpty();
        PricesDTO totalPrices2 = state.getTotalPrices();
        Integer valueOf = (totalPrices2 == null || (elements = totalPrices2.getElements()) == null) ? null : Integer.valueOf(C7714v.P(elements));
        BlockDTO total = state.getTotal();
        long a11 = b.a(arrayList.size(), widgetInfo.d(), "_");
        String separatorColor = state.getPrices().getSeparatorColor();
        if (separatorColor == null) {
            separatorColor = UniColors.GRAPHIC_NEUTRAL.getToken();
        }
        arrayList.add(toVo$default(this, total, a11, separatorColor, state.getPaddingLeft(), true, 0, state.getBackgroundColor(), state.getPrices().getElements().isEmpty() ? cornerRadius : CornerRadius.NO_RADIUS, !z11 ? CornerRadius.NO_RADIUS : cornerRadius, 16, null));
        PricesDTO totalPrices3 = state.getTotalPrices();
        List<BlockDTO> elements3 = totalPrices3 != null ? totalPrices3.getElements() : null;
        if (elements3 == null) {
            elements3 = K.f71697a;
        }
        int i13 = 0;
        for (Object obj2 : elements3) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                C7714v.O0();
                throw null;
            }
            BlockDTO blockDTO = (BlockDTO) obj2;
            long a12 = b.a(i13, widgetInfo.d(), "_");
            Integer paddingLeft = state.getPaddingLeft();
            boolean z12 = i13 != 0;
            CornerRadius cornerRadius2 = CornerRadius.NO_RADIUS;
            arrayList.add(toVo(blockDTO, a12, null, paddingLeft, z12, 0, state.getBackgroundColor(), cornerRadius2, (valueOf != null && i13 == valueOf.intValue()) ? cornerRadius : cornerRadius2));
            i13 = i14;
        }
        return arrayList;
    }
}
