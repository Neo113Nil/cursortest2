package ru.ozon.app.android.universalwidgets.failedExternalLinkRetry.configurator.home;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.app.android.universalwidgets.R$string;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.common.Rounds;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class FailedExternalPageRetryNotificationConfigurator$notification$2 extends AbstractC7737t implements Function0<NotificationDTO> {
    final /* synthetic */ FailedExternalPageRetryNotificationConfigurator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FailedExternalPageRetryNotificationConfigurator$notification$2(FailedExternalPageRetryNotificationConfigurator failedExternalPageRetryNotificationConfigurator) {
        super(0);
        this.this$0 = failedExternalPageRetryNotificationConfigurator;
    }

    @Override // kotlin.jvm.functions.Function0
    public final NotificationDTO invoke() {
        boolean isSelect;
        String string = StringProvider.getString(R$string.failed_external_link_retry_notification_title);
        IconDTO.IconSize iconSize = IconDTO.IconSize.SIZE_500;
        IconDTO.IconShape iconShape = IconDTO.IconShape.SHAPE_SQUIRCLE_FORCE;
        String token = UniColors.BG_SECONDARY_INVERTED.getToken();
        IconDTO.FitType fitType = IconDTO.FitType.FILL_CENTER;
        isSelect = this.this$0.isSelect();
        NotificationDTO.LeftContent leftContent = new NotificationDTO.LeftContent(new IconDTO(iconSize, null, iconShape, null, null, isSelect ? "https://cdn1.ozone.ru/s3/common-image-storage/bx/chain-blue_m_select.png" : "https://cdn1.ozone.ru/s3/common-image-storage/bx/chain-blue_m.png", token, null, null, null, null, null, null, null, null, null, fitType, 65434, null), null, 2, null);
        ButtonV3DTO.Sizes sizes = ButtonV3DTO.Sizes.SIZE_400;
        return new NotificationDTO(string, null, null, null, leftContent, new NotificationDTO.RightContent(NotificationDTO.RightContent.ButtonType.BUTTON, new ButtonV3DTO(ButtonV3DTO.StyleTypes.CUSTOM, sizes, StringProvider.getString(R$string.failed_external_link_retry_notification_button), null, null, null, null, UniColors.TEXT_ACTION_INVERTED.getToken(), null, null, null, null, UniColors.BG_ACTION_SECONDARY_INVERTED.getToken(), new CommonControlSettings(new AtomActionDTO(AtomActionDTO.Behavior.REDIRECT, null, null, null, 14, null), null, null, 6, null), Boolean.FALSE, null, Rounds.ROUND_ROUNDED, null, 167800, null), null, null, 12, null), null, null, null, null, 974, null);
    }
}
