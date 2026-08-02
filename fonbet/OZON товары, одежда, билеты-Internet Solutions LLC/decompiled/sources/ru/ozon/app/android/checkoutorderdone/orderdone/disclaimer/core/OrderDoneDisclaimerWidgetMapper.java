package ru.ozon.app.android.checkoutorderdone.orderdone.disclaimer.core;

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
import ru.ozon.app.android.checkoutorderdone.orderdone.disclaimer.data.OrderDoneDisclaimerDTO;
import ru.ozon.app.android.checkoutorderdone.orderdone.disclaimer.data.Timer;
import ru.ozon.app.android.checkoutorderdone.orderdone.disclaimer.presentation.IconVO;
import ru.ozon.app.android.checkoutorderdone.orderdone.disclaimer.presentation.OrderDoneDisclaimerVO;
import ru.ozon.app.android.checkoutorderdone.orderdone.disclaimer.presentation.TimerVO;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.uni.atoms.data.controls.button.ButtonDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\t\b\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000b\u001a\u00020\u000e*\u00020\rH\u0002¢\u0006\u0004\b\u000b\u0010\u000fJ&\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/checkoutorderdone/orderdone/disclaimer/core/OrderDoneDisclaimerWidgetMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/checkoutorderdone/orderdone/disclaimer/data/OrderDoneDisclaimerDTO;", "Ll20/d;", "", "Lru/ozon/app/android/checkoutorderdone/orderdone/disclaimer/presentation/OrderDoneDisclaimerVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "", "id", "toVo", "(Lru/ozon/app/android/checkoutorderdone/orderdone/disclaimer/data/OrderDoneDisclaimerDTO;J)Lru/ozon/app/android/checkoutorderdone/orderdone/disclaimer/presentation/OrderDoneDisclaimerVO;", "Lru/ozon/app/android/checkoutorderdone/orderdone/disclaimer/data/Timer;", "Lru/ozon/app/android/checkoutorderdone/orderdone/disclaimer/presentation/TimerVO;", "(Lru/ozon/app/android/checkoutorderdone/orderdone/disclaimer/data/Timer;)Lru/ozon/app/android/checkoutorderdone/orderdone/disclaimer/presentation/TimerVO;", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/checkoutorderdone/orderdone/disclaimer/data/OrderDoneDisclaimerDTO;Ll20/d;)Ljava/util/List;", "orderdone_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class OrderDoneDisclaimerWidgetMapper implements Function2<OrderDoneDisclaimerDTO, d, List<? extends OrderDoneDisclaimerVO>> {
    private final OrderDoneDisclaimerVO toVo(OrderDoneDisclaimerDTO orderDoneDisclaimerDTO, long j11) {
        String icon = orderDoneDisclaimerDTO.getIcon().getIcon();
        String tintColor = orderDoneDisclaimerDTO.getIcon().getTintColor();
        if (tintColor == null) {
            tintColor = UniColors.GRAPHIC_TERTIARY.getToken();
        }
        IconVO iconVO = new IconVO(icon, tintColor);
        TextAtom title = orderDoneDisclaimerDTO.getTitle();
        TextAtom subtitle = orderDoneDisclaimerDTO.getSubtitle();
        String backgroundColor = orderDoneDisclaimerDTO.getBackgroundColor();
        if (backgroundColor == null) {
            backgroundColor = UniColors.BG_SECONDARY.getToken();
        }
        String str = backgroundColor;
        Timer timer = orderDoneDisclaimerDTO.getTimer();
        TimerVO vo = timer != null ? toVo(timer) : null;
        List<ButtonDTO> buttons = orderDoneDisclaimerDTO.getButtons();
        if (buttons == null) {
            buttons = K.f71697a;
        }
        List<ButtonDTO> list = buttons;
        Map<String, TokenizedTrackingInfo> trackingInfo = orderDoneDisclaimerDTO.getTrackingInfo();
        return new OrderDoneDisclaimerVO(j11, iconVO, title, subtitle, str, vo, list, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<OrderDoneDisclaimerVO> invoke(@NotNull OrderDoneDisclaimerDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(toVo(state, widgetInfo.d().hashCode()));
    }

    private final TimerVO toVo(Timer timer) {
        return new TimerVO(System.currentTimeMillis() + (timer.getTimeLeft() * 1000), timer.getTextColor(), timer.getTextStyle(), timer.getPosition());
    }
}
