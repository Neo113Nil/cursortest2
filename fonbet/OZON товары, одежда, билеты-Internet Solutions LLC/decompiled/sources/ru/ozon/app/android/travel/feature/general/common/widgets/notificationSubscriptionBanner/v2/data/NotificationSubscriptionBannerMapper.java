package ru.ozon.app.android.travel.feature.general.common.widgets.notificationSubscriptionBanner.v2.data;

import WZ.t;
import android.content.Context;
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
import ru.ozon.app.android.travel.feature.general.common.widgets.notificationSubscriptionBanner.v2.data.NotificationSubscriptionBannerDTO;
import ru.ozon.app.android.travel.feature.general.common.widgets.notificationSubscriptionBanner.v2.presentation.NotificationSubscriptionBannerVO;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ&\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001f¨\u0006 "}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v2/data/NotificationSubscriptionBannerMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v2/data/NotificationSubscriptionBannerDTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v2/presentation/NotificationSubscriptionBannerVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "background", "getOrDefaultBackgorund", "(Ljava/lang/String;)Ljava/lang/String;", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v2/data/NotificationSubscriptionBannerDTO$MarginsDTO;", "layoutMarginsDTO", "getOrDefaultMargins", "(Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v2/data/NotificationSubscriptionBannerDTO$MarginsDTO;)Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v2/data/NotificationSubscriptionBannerDTO$MarginsDTO;", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v2/presentation/NotificationSubscriptionBannerVO$Margins;", "mapMargins", "(Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v2/data/NotificationSubscriptionBannerDTO$MarginsDTO;)Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v2/presentation/NotificationSubscriptionBannerVO$Margins;", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v2/data/NotificationSubscriptionBannerDTO$RationaleDialogDTO;", "dialog", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v2/presentation/NotificationSubscriptionBannerVO$RationaleDialog;", "mapDialog", "(Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v2/data/NotificationSubscriptionBannerDTO$RationaleDialogDTO;)Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v2/presentation/NotificationSubscriptionBannerVO$RationaleDialog;", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v2/data/NotificationSubscriptionBannerDTO;Ll20/d;)Ljava/util/List;", "Landroid/content/Context;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class NotificationSubscriptionBannerMapper implements Function2<NotificationSubscriptionBannerDTO, d, List<? extends NotificationSubscriptionBannerVO>> {

    @NotNull
    private final Context context;

    public NotificationSubscriptionBannerMapper(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    private final String getOrDefaultBackgorund(String background) {
        return background == null ? UniColors.LAYER_FLOOR_1.getToken() : background;
    }

    private final NotificationSubscriptionBannerDTO.MarginsDTO getOrDefaultMargins(NotificationSubscriptionBannerDTO.MarginsDTO layoutMarginsDTO) {
        return layoutMarginsDTO == null ? new NotificationSubscriptionBannerDTO.MarginsDTO(null, null, null, 7, null) : layoutMarginsDTO;
    }

    private final NotificationSubscriptionBannerVO.RationaleDialog mapDialog(NotificationSubscriptionBannerDTO.RationaleDialogDTO dialog) {
        return new NotificationSubscriptionBannerVO.RationaleDialog(dialog.getTitle(), dialog.getMessage(), dialog.getPositiveButton(), dialog.getNegativeButton());
    }

    private final NotificationSubscriptionBannerVO.Margins mapMargins(NotificationSubscriptionBannerDTO.MarginsDTO layoutMarginsDTO) {
        return new NotificationSubscriptionBannerVO.Margins(ResourceExtKt.toPx(layoutMarginsDTO.getTop().getPx(), this.context), ResourceExtKt.toPx(layoutMarginsDTO.getBottom().getPx(), this.context), ResourceExtKt.toPx(layoutMarginsDTO.getHorizontal().getPx(), this.context));
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<NotificationSubscriptionBannerVO> invoke(@NotNull NotificationSubscriptionBannerDTO state, @NotNull d widgetInfo) {
        long j11;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        String orDefaultBackgorund = getOrDefaultBackgorund(state.getBackgroundColor());
        TextDTO title = state.getTitle();
        TextDTO subtitle = state.getSubtitle();
        ButtonV3DTO subscribeButton = state.getSubscribeButton();
        ButtonV3DTO subscriptionCompletedButton = state.getSubscriptionCompletedButton();
        CommonControlSettings emailSubscriptionControlSettings = state.getEmailSubscriptionControlSettings();
        CommonControlSettings notificationSubscriptionControlSettings = state.getNotificationSubscriptionControlSettings();
        ImageDTO image = state.getImage();
        IconButtonV3DTO closeButton = state.getCloseButton();
        NotificationDTO subscriptionCompletedNotification = state.getSubscriptionCompletedNotification();
        String borderColor = state.getBorderColor();
        String str = borderColor == null ? orDefaultBackgorund : borderColor;
        NotificationSubscriptionBannerVO.Margins mapMargins = mapMargins(getOrDefaultMargins(state.getLayoutMargins()));
        NotificationSubscriptionBannerVO.RationaleDialog mapDialog = mapDialog(state.getDialog());
        Map<String, TokenizedTrackingInfo> trackingInfo = state.getTrackingInfo();
        t tVar = null;
        if (trackingInfo != null) {
            j11 = hashCode;
            tVar = TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null);
        } else {
            j11 = hashCode;
        }
        return C7714v.a0(new NotificationSubscriptionBannerVO(j11, title, subtitle, subscribeButton, subscriptionCompletedButton, emailSubscriptionControlSettings, notificationSubscriptionControlSettings, image, closeButton, subscriptionCompletedNotification, orDefaultBackgorund, str, mapMargins, mapDialog, tVar));
    }
}
