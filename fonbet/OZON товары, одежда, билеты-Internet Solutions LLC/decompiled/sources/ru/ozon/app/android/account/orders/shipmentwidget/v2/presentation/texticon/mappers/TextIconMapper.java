package ru.ozon.app.android.account.orders.shipmentwidget.v2.presentation.texticon.mappers;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.account.orders.shipmentwidget.v2.data.TextIconDTO;
import ru.ozon.app.android.account.orders.shipmentwidget.v2.presentation.texticon.viewItem.TextIconVO;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.uni.atoms.data.common.CommonAtomIconDTO;
import ru.ozon.uni.atoms.data.common.CommonAtomLabelDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\b\u0007\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ&\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/account/orders/shipmentwidget/v2/presentation/texticon/mappers/TextIconMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/account/orders/shipmentwidget/v2/data/TextIconDTO;", "Ll20/d;", "", "Lru/ozon/app/android/account/orders/shipmentwidget/v2/presentation/texticon/viewItem/TextIconVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "", "id", "toVo", "(Lru/ozon/app/android/account/orders/shipmentwidget/v2/data/TextIconDTO;J)Lru/ozon/app/android/account/orders/shipmentwidget/v2/presentation/texticon/viewItem/TextIconVO;", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/account/orders/shipmentwidget/v2/data/TextIconDTO;Ll20/d;)Ljava/util/List;", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TextIconMapper implements Function2<TextIconDTO, d, List<? extends TextIconVO>> {
    private final TextIconVO toVo(TextIconDTO textIconDTO, long j11) {
        Map<String, TokenizedTrackingInfo> trackingInfo;
        CommonAtomIconDTO icon;
        TextDTO text = textIconDTO.getText();
        IconDTO icon2 = textIconDTO.getIcon();
        TextDTO copy$default = TextDTO.copy$default(text, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, (icon2 == null || (icon = icon2.getIcon()) == null) ? null : icon.getIcon(), textIconDTO.getText().getTextColor(), CommonAtomLabelDTO.IconPosition.END, null, 294911, null);
        BadgeDTO badge = textIconDTO.getBadge();
        Integer timeLeft = textIconDTO.getTimeLeft();
        DateTime m11 = timeLeft != null ? new DateTime().m(timeLeft.intValue()) : null;
        CommonControlSettings common = textIconDTO.getCommon();
        CommonControlSettings commonAction = textIconDTO.getCommonAction();
        Integer scrollWidgetId = textIconDTO.getScrollWidgetId();
        CommonControlSettings common2 = textIconDTO.getCommon();
        return new TextIconVO(j11, copy$default, badge, m11, common, commonAction, scrollWidgetId, (common2 == null || (trackingInfo = common2.getTrackingInfo()) == null) ? null : TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null), textIconDTO.getShipmentHorizontalPadding(), textIconDTO.getHorizontalPadding());
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<TextIconVO> invoke(@NotNull TextIconDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        String d11 = widgetInfo.d();
        int hashCode = state.hashCode();
        Integer scrollWidgetId = state.getScrollWidgetId();
        return C7714v.a0(toVo(state, (d11 + "+" + hashCode + "+" + scrollWidgetId).hashCode()));
    }
}
