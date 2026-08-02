package ru.ozon.app.android.travel.feature.general.common.widgets.notificationSubscriptionBanner.v3.data;

import WZ.t;
import WZ.x;
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
import ru.ozon.app.android.composer.imageprefetch.PrefetchUtilsKt;
import ru.ozon.app.android.pikazon.preload.ImagePrefetcher;
import ru.ozon.app.android.travel.feature.general.common.widgets.notificationSubscriptionBanner.v3.data.NotificationSubscriptionBannerV3DTO;
import ru.ozon.app.android.travel.feature.general.common.widgets.notificationSubscriptionBanner.v3.presentation.NotificationSubscriptionBannerV3VI;
import ru.ozon.app.android.travel.molecules.dto.themeImage.v1.ThemeImageV1DTO;
import ru.ozon.app.android.travel.molecules.extensions.ThemeImageExtKt;
import ru.ozon.app.android.travel.molecules.mapper.MapperExtKt;
import ru.ozon.app.android.travel.molecules.view.themeImage.v1.ThemeImageV1VO;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B+\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0012\u001a\u00020\u0011*\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0016\u001a\u00020\u0015*\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0019\u001a\u00020\f2\b\u0010\u0018\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001d\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u001f2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010%\u001a\u00020$2\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b%\u0010&J&\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010'\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b)\u0010*R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010+R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010,R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010,¨\u0006-"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/data/NotificationSubscriptionBannerV3Mapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/data/NotificationSubscriptionBannerV3DTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/presentation/NotificationSubscriptionBannerV3VI;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Landroid/content/Context;", "context", "Lru/ozon/app/android/pikazon/preload/ImagePrefetcher;", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "bannerRightImagePrefetcher", "", "backgroundImagePrefetcher", "<init>", "(Landroid/content/Context;Lru/ozon/app/android/pikazon/preload/ImagePrefetcher;Lru/ozon/app/android/pikazon/preload/ImagePrefetcher;)V", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/data/NotificationSubscriptionBannerV3DTO$ContentDTO;", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/presentation/NotificationSubscriptionBannerV3VI$WidgetContent;", "toVI", "(Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/data/NotificationSubscriptionBannerV3DTO$ContentDTO;)Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/presentation/NotificationSubscriptionBannerV3VI$WidgetContent;", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/data/NotificationSubscriptionBannerV3DTO$ContentDTO$DecorationDTO;", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/presentation/NotificationSubscriptionBannerV3VI$WidgetContent$Decoration;", "toVO", "(Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/data/NotificationSubscriptionBannerV3DTO$ContentDTO$DecorationDTO;)Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/presentation/NotificationSubscriptionBannerV3VI$WidgetContent$Decoration;", "background", "getOrDefaultBackground", "(Ljava/lang/String;)Ljava/lang/String;", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/data/NotificationSubscriptionBannerV3DTO$ContentDTO$MarginsDTO;", "layoutMarginsDTO", "getOrDefaultMargins", "(Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/data/NotificationSubscriptionBannerV3DTO$ContentDTO$MarginsDTO;)Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/data/NotificationSubscriptionBannerV3DTO$ContentDTO$MarginsDTO;", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/presentation/NotificationSubscriptionBannerV3VI$WidgetContent$Margins;", "mapMargins", "(Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/data/NotificationSubscriptionBannerV3DTO$ContentDTO$MarginsDTO;)Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/presentation/NotificationSubscriptionBannerV3VI$WidgetContent$Margins;", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/data/NotificationSubscriptionBannerV3DTO$RationaleDialogDTO;", "dialog", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/presentation/NotificationSubscriptionBannerV3VI$RationaleDialog;", "mapDialog", "(Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/data/NotificationSubscriptionBannerV3DTO$RationaleDialogDTO;)Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/presentation/NotificationSubscriptionBannerV3VI$RationaleDialog;", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/data/NotificationSubscriptionBannerV3DTO;Ll20/d;)Ljava/util/List;", "Landroid/content/Context;", "Lru/ozon/app/android/pikazon/preload/ImagePrefetcher;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class NotificationSubscriptionBannerV3Mapper implements Function2<NotificationSubscriptionBannerV3DTO, d, List<? extends NotificationSubscriptionBannerV3VI>> {

    @NotNull
    private final ImagePrefetcher<String> backgroundImagePrefetcher;

    @NotNull
    private final ImagePrefetcher<ImageDTO> bannerRightImagePrefetcher;

    @NotNull
    private final Context context;

    public NotificationSubscriptionBannerV3Mapper(@NotNull Context context, @NotNull ImagePrefetcher<ImageDTO> bannerRightImagePrefetcher, @NotNull ImagePrefetcher<String> backgroundImagePrefetcher) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(bannerRightImagePrefetcher, "bannerRightImagePrefetcher");
        Intrinsics.checkNotNullParameter(backgroundImagePrefetcher, "backgroundImagePrefetcher");
        this.context = context;
        this.bannerRightImagePrefetcher = bannerRightImagePrefetcher;
        this.backgroundImagePrefetcher = backgroundImagePrefetcher;
    }

    private final String getOrDefaultBackground(String background) {
        return background == null ? UniColors.LAYER_FLOOR_1.getToken() : background;
    }

    private final NotificationSubscriptionBannerV3DTO.ContentDTO.MarginsDTO getOrDefaultMargins(NotificationSubscriptionBannerV3DTO.ContentDTO.MarginsDTO layoutMarginsDTO) {
        return layoutMarginsDTO == null ? new NotificationSubscriptionBannerV3DTO.ContentDTO.MarginsDTO(null, null, null, 7, null) : layoutMarginsDTO;
    }

    private final NotificationSubscriptionBannerV3VI.RationaleDialog mapDialog(NotificationSubscriptionBannerV3DTO.RationaleDialogDTO dialog) {
        return new NotificationSubscriptionBannerV3VI.RationaleDialog(dialog.getTitle(), dialog.getMessage(), dialog.getPositiveButton(), dialog.getNegativeButton());
    }

    private final NotificationSubscriptionBannerV3VI.WidgetContent.Margins mapMargins(NotificationSubscriptionBannerV3DTO.ContentDTO.MarginsDTO layoutMarginsDTO) {
        return new NotificationSubscriptionBannerV3VI.WidgetContent.Margins(ResourceExtKt.toPx(layoutMarginsDTO.getTop().getPx(), this.context), ResourceExtKt.toPx(layoutMarginsDTO.getBottom().getPx(), this.context), ResourceExtKt.toPx(layoutMarginsDTO.getHorizontal().getPx(), this.context));
    }

    private final NotificationSubscriptionBannerV3VI.WidgetContent toVI(NotificationSubscriptionBannerV3DTO.ContentDTO contentDTO) {
        boolean z11 = contentDTO.getTitle() == null && contentDTO.getSubtitle() == null && contentDTO.getRightImage() == null && contentDTO.getCloseButton() == null && contentDTO.getDecoration().getBackgroundImage() == null;
        PrefetchUtilsKt.prefetchImage(this.context, contentDTO.getRightImage(), this.bannerRightImagePrefetcher);
        return new NotificationSubscriptionBannerV3VI.WidgetContent(contentDTO.getTitle(), contentDTO.getSubtitle(), contentDTO.getSubscribeButton(), contentDTO.getSubscriptionCompletedButton(), contentDTO.getRightImage(), contentDTO.getCloseButton(), toVO(contentDTO.getDecoration()), z11);
    }

    private final NotificationSubscriptionBannerV3VI.WidgetContent.Decoration toVO(NotificationSubscriptionBannerV3DTO.ContentDTO.DecorationDTO decorationDTO) {
        String orDefaultBackground = getOrDefaultBackground(decorationDTO.getBackgroundColor());
        ThemeImageV1DTO backgroundImage = decorationDTO.getBackgroundImage();
        ThemeImageV1VO vo = backgroundImage != null ? MapperExtKt.toVO(backgroundImage) : null;
        Context context = this.context;
        PrefetchUtilsKt.prefetchImage(context, vo != null ? ThemeImageExtKt.getUrlForTheme(vo, context) : null, this.backgroundImagePrefetcher);
        String borderColor = decorationDTO.getBorderColor();
        String str = borderColor == null ? orDefaultBackground : borderColor;
        NotificationSubscriptionBannerV3VI.WidgetContent.Margins mapMargins = mapMargins(getOrDefaultMargins(decorationDTO.getLayoutMargins()));
        Boolean isFullWidthButton = decorationDTO.isFullWidthButton();
        return new NotificationSubscriptionBannerV3VI.WidgetContent.Decoration(orDefaultBackground, str, vo, mapMargins, isFullWidthButton != null ? isFullWidthButton.booleanValue() : false, decorationDTO.getCornerRadius());
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<NotificationSubscriptionBannerV3VI> invoke(@NotNull NotificationSubscriptionBannerV3DTO state, @NotNull d widgetInfo) {
        AtomActionDTO action;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        boolean z11 = state.getSubscriptionState() == NotificationSubscriptionBannerV3DTO.SubscriptionState.STATE_SUBSCRIBED;
        NotificationSubscriptionBannerV3VI.WidgetContent vi2 = toVI(state.getContent());
        NotificationDTO subscriptionCompletedNotification = state.getSubscriptionCompletedNotification();
        NotificationSubscriptionBannerV3VI.RationaleDialog mapDialog = mapDialog(state.getRationaleDialog());
        CommonControlSettings alreadySubscribedAction = state.getAlreadySubscribedAction();
        AtomAction atomAction = (alreadySubscribedAction == null || (action = alreadySubscribedAction.getAction()) == null) ? null : AtomActionMapperKt.toAtomAction(action, state.getAlreadySubscribedAction().getTrackingInfo());
        Map<String, TokenizedTrackingInfo> trackingInfo = state.getTrackingInfo();
        t b11 = trackingInfo != null ? x.b(trackingInfo, Long.valueOf(hashCode), null) : null;
        Boolean forceShowWidget = state.getForceShowWidget();
        return C7714v.a0(new NotificationSubscriptionBannerV3VI(hashCode, z11, vi2, atomAction, subscriptionCompletedNotification, mapDialog, forceShowWidget != null ? forceShowWidget.booleanValue() : false, b11));
    }
}
