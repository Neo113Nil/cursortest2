package ru.ozon.app.android.fresh.main.widgets.notificationCarousel.v2.data;

import Sc.o;
import WZ.x;
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
import ru.ozon.app.android.fresh.common.widgets.molecules.imageSkuClick.presentation.ImageSkuClickMapperKt;
import ru.ozon.app.android.fresh.common.widgets.molecules.imageSkuClick.presentation.ImageSkuClickVO;
import ru.ozon.app.android.fresh.main.utils.ExtentionsKt;
import ru.ozon.app.android.fresh.main.widgets.notificationCarousel.v2.data.NotificationCarouselV2DTO;
import ru.ozon.app.android.fresh.main.widgets.notificationCarousel.v2.domain.NotificationCarouselV2VO;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000b\u001a\u00020\u000e*\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\u000fJ\u0013\u0010\u000b\u001a\u00020\u0011*\u00020\u0010H\u0002¢\u0006\u0004\b\u000b\u0010\u0012J\u0013\u0010\u000b\u001a\u00020\u0014*\u00020\u0013H\u0002¢\u0006\u0004\b\u000b\u0010\u0015J*\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0016\u001a\u00020\u00022\n\u0010\u0018\u001a\u00060\u0003j\u0002`\u0017H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/data/NotificationCarouselV2Mapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/data/NotificationCarouselV2DTO;", "Ll20/d;", "", "Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/domain/NotificationCarouselV2VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "", "widgetId", "toVO", "(Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/data/NotificationCarouselV2DTO;J)Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/domain/NotificationCarouselV2VO;", "Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/data/NotificationCarouselV2DTO$NotificationCarouselItemDTO;", "Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/domain/NotificationCarouselV2VO$NotificationCarouselItemVO;", "(Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/data/NotificationCarouselV2DTO$NotificationCarouselItemDTO;J)Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/domain/NotificationCarouselV2VO$NotificationCarouselItemVO;", "Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/data/NotificationCarouselV2DTO$OrderProgressDTO;", "Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/domain/NotificationCarouselV2VO$OrderProgressVO;", "(Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/data/NotificationCarouselV2DTO$OrderProgressDTO;)Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/domain/NotificationCarouselV2VO$OrderProgressVO;", "Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/data/NotificationCarouselV2DTO$PaddingsDTO;", "Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/domain/NotificationCarouselV2VO$PaddingsVO;", "(Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/data/NotificationCarouselV2DTO$PaddingsDTO;)Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/domain/NotificationCarouselV2VO$PaddingsVO;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/data/NotificationCarouselV2DTO;Ll20/d;)Ljava/util/List;", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class NotificationCarouselV2Mapper implements Function2<NotificationCarouselV2DTO, d, List<? extends NotificationCarouselV2VO>> {
    private final NotificationCarouselV2VO toVO(NotificationCarouselV2DTO notificationCarouselV2DTO, long j11) {
        long updatePeriodSeconds = notificationCarouselV2DTO.getUpdatePeriodSeconds();
        List<NotificationCarouselV2DTO.NotificationCarouselItemDTO> items = notificationCarouselV2DTO.getItems();
        ArrayList arrayList = new ArrayList(C7714v.z(items, 10));
        Iterator<T> it = items.iterator();
        while (it.hasNext()) {
            arrayList.add(toVO((NotificationCarouselV2DTO.NotificationCarouselItemDTO) it.next(), j11));
        }
        NotificationCarouselV2VO.PaddingsVO vo = toVO(notificationCarouselV2DTO.getPaddings());
        Map<String, TokenizedTrackingInfo> trackingInfo = notificationCarouselV2DTO.getTrackingInfo();
        return new NotificationCarouselV2VO(j11, arrayList, updatePeriodSeconds, vo, trackingInfo != null ? x.b(trackingInfo, Long.valueOf(j11), null) : null, null, 32, null);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<NotificationCarouselV2VO> invoke(@NotNull NotificationCarouselV2DTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(toVO(state, ExtentionsKt.getId(widgetInfo)));
    }

    private final NotificationCarouselV2VO.NotificationCarouselItemVO toVO(NotificationCarouselV2DTO.NotificationCarouselItemDTO notificationCarouselItemDTO, long j11) {
        if (notificationCarouselItemDTO instanceof NotificationCarouselV2DTO.OrderTrackingNotificationDTO) {
            NotificationCarouselV2DTO.OrderTrackingNotificationDTO orderTrackingNotificationDTO = (NotificationCarouselV2DTO.OrderTrackingNotificationDTO) notificationCarouselItemDTO;
            TextDTO title = orderTrackingNotificationDTO.getTitle();
            TextDTO subtitle = orderTrackingNotificationDTO.getSubtitle();
            IconDTO titleIcon = orderTrackingNotificationDTO.getTitleIcon();
            IconDTO starIcon = orderTrackingNotificationDTO.getStarIcon();
            NotificationCarouselV2VO.OrderProgressVO vo = toVO(orderTrackingNotificationDTO.getProgress());
            String backgroundColor = orderTrackingNotificationDTO.getBackgroundColor();
            AtomActionDTO clickAction = orderTrackingNotificationDTO.getClickAction();
            AtomAction atomAction = clickAction != null ? AtomActionMapperKt.toAtomAction(clickAction, null) : null;
            Map<String, TokenizedTrackingInfo> trackingInfo = orderTrackingNotificationDTO.getTrackingInfo();
            return new NotificationCarouselV2VO.NotificationCarouselItemVO.OrderTrackingNotification(title, subtitle, titleIcon, vo, starIcon, backgroundColor, atomAction, trackingInfo != null ? x.b(trackingInfo, Long.valueOf(j11), null) : null);
        }
        if (notificationCarouselItemDTO instanceof NotificationCarouselV2DTO.InformationNotificationDTO) {
            NotificationCarouselV2DTO.InformationNotificationDTO informationNotificationDTO = (NotificationCarouselV2DTO.InformationNotificationDTO) notificationCarouselItemDTO;
            TextDTO title2 = informationNotificationDTO.getTitle();
            TextDTO subtitle2 = informationNotificationDTO.getSubtitle();
            IconDTO leftIcon = informationNotificationDTO.getLeftIcon();
            IconDTO rightIcon = informationNotificationDTO.getRightIcon();
            String backgroundColor2 = informationNotificationDTO.getBackgroundColor();
            AtomActionDTO clickAction2 = informationNotificationDTO.getClickAction();
            AtomAction atomAction2 = clickAction2 != null ? AtomActionMapperKt.toAtomAction(clickAction2, null) : null;
            Map<String, TokenizedTrackingInfo> trackingInfo2 = informationNotificationDTO.getTrackingInfo();
            return new NotificationCarouselV2VO.NotificationCarouselItemVO.InformationNotification(leftIcon, title2, subtitle2, rightIcon, backgroundColor2, atomAction2, trackingInfo2 != null ? x.b(trackingInfo2, Long.valueOf(j11), null) : null);
        }
        if (notificationCarouselItemDTO instanceof NotificationCarouselV2DTO.ClickDeliveryNotificationDTO) {
            NotificationCarouselV2DTO.ClickDeliveryNotificationDTO clickDeliveryNotificationDTO = (NotificationCarouselV2DTO.ClickDeliveryNotificationDTO) notificationCarouselItemDTO;
            ImageSkuClickVO vo2 = ImageSkuClickMapperKt.toVO(clickDeliveryNotificationDTO.getSkuImage(), j11);
            CellDTO cell = clickDeliveryNotificationDTO.getCell();
            String backgroundColor3 = clickDeliveryNotificationDTO.getBackgroundColor();
            AtomActionDTO clickAction3 = clickDeliveryNotificationDTO.getClickAction();
            AtomAction atomAction3 = clickAction3 != null ? AtomActionMapperKt.toAtomAction(clickAction3, null) : null;
            Map<String, TokenizedTrackingInfo> trackingInfo3 = clickDeliveryNotificationDTO.getTrackingInfo();
            return new NotificationCarouselV2VO.NotificationCarouselItemVO.ClickDeliveryNotification(vo2, cell, backgroundColor3, atomAction3, trackingInfo3 != null ? x.b(trackingInfo3, Long.valueOf(j11), null) : null);
        }
        if (notificationCarouselItemDTO instanceof NotificationCarouselV2DTO.ActionButtonNotificationDTO) {
            NotificationCarouselV2DTO.ActionButtonNotificationDTO actionButtonNotificationDTO = (NotificationCarouselV2DTO.ActionButtonNotificationDTO) notificationCarouselItemDTO;
            TextDTO title3 = actionButtonNotificationDTO.getTitle();
            TextDTO subtitle3 = actionButtonNotificationDTO.getSubtitle();
            ButtonV3DTO button = actionButtonNotificationDTO.getButton();
            IconDTO titleIcon2 = actionButtonNotificationDTO.getTitleIcon();
            String backgroundColor4 = actionButtonNotificationDTO.getBackgroundColor();
            AtomActionDTO clickAction4 = actionButtonNotificationDTO.getClickAction();
            AtomAction atomAction4 = clickAction4 != null ? AtomActionMapperKt.toAtomAction(clickAction4, null) : null;
            Map<String, TokenizedTrackingInfo> trackingInfo4 = actionButtonNotificationDTO.getTrackingInfo();
            return new NotificationCarouselV2VO.NotificationCarouselItemVO.ActionButtonNotification(title3, titleIcon2, subtitle3, button, backgroundColor4, atomAction4, trackingInfo4 != null ? x.b(trackingInfo4, Long.valueOf(j11), null) : null);
        }
        throw new o();
    }

    private final NotificationCarouselV2VO.OrderProgressVO toVO(NotificationCarouselV2DTO.OrderProgressDTO orderProgressDTO) {
        NotificationCarouselV2VO.OrderProgressVO.OrderProgressType text;
        float progress = orderProgressDTO.getProgress();
        String ringProgressColor = orderProgressDTO.getRingProgressColor();
        NotificationCarouselV2DTO.OrderProgressDTO.OrderProgressType type = orderProgressDTO.getType();
        if (type instanceof NotificationCarouselV2DTO.OrderProgressDTO.OrderProgressType.Icon) {
            text = new NotificationCarouselV2VO.OrderProgressVO.OrderProgressType.Icon(((NotificationCarouselV2DTO.OrderProgressDTO.OrderProgressType.Icon) orderProgressDTO.getType()).getIcon());
        } else if (type instanceof NotificationCarouselV2DTO.OrderProgressDTO.OrderProgressType.Text) {
            text = new NotificationCarouselV2VO.OrderProgressVO.OrderProgressType.Text(((NotificationCarouselV2DTO.OrderProgressDTO.OrderProgressType.Text) orderProgressDTO.getType()).getTitle(), ((NotificationCarouselV2DTO.OrderProgressDTO.OrderProgressType.Text) orderProgressDTO.getType()).getSubtitle());
        } else {
            throw new o();
        }
        return new NotificationCarouselV2VO.OrderProgressVO(progress, ringProgressColor, text);
    }

    private final NotificationCarouselV2VO.PaddingsVO toVO(NotificationCarouselV2DTO.PaddingsDTO paddingsDTO) {
        return new NotificationCarouselV2VO.PaddingsVO(UiExtKt.toPx(paddingsDTO.getTopPadding().getPx()), UiExtKt.toPx(paddingsDTO.getBottomPadding().getPx()), UiExtKt.toPx(paddingsDTO.getHorizontalPadding().getPx()), UiExtKt.toPx(paddingsDTO.getBetweenPadding().getPx()));
    }
}
