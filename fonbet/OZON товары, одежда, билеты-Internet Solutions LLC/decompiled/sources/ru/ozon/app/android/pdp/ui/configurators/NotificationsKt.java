package ru.ozon.app.android.pdp.ui.configurators;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0006\u0010\u0000\u001a\u00020\u0001\u001a\u0006\u0010\u0002\u001a\u00020\u0001¨\u0006\u0003"}, d2 = {"createFailedToSendNotification", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "createUnknownErrorNotification", "configurators_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class NotificationsKt {
    @NotNull
    public static final NotificationDTO createFailedToSendNotification() {
        return new NotificationDTO(StringProvider.getString(R$string.reviews_failed_to_send_reaction_notification_title), StringProvider.getString(ru.ozon.app.android.common.actionHandlers.R$string.common_try_again_android), null, null, null, null, null, null, null, NotificationDTO.Preset.NEGATIVE, 476, null);
    }

    @NotNull
    public static final NotificationDTO createUnknownErrorNotification() {
        return new NotificationDTO(StringProvider.getString(ru.ozon.app.android.common.actionHandlers.R$string.common_something_went_wrong_android), StringProvider.getString(ru.ozon.app.android.common.actionHandlers.R$string.common_try_again_android), null, null, null, null, null, null, null, NotificationDTO.Preset.WARNING, 508, null);
    }
}
