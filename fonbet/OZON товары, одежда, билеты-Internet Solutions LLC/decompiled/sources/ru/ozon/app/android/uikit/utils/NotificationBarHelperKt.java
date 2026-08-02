package ru.ozon.app.android.uikit.utils;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.uikit.R$string;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"", "isSelect", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "createNetworkErrorNotificationDTO", "(Z)Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "ui-kit_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NotificationBarHelperKt {
    @NotNull
    public static final NotificationDTO createNetworkErrorNotificationDTO(boolean z11) {
        return new NotificationDTO(StringProvider.getString(R$string.error_common_no_network_notification_title), StringProvider.getString(R$string.error_common_no_network_notification_subtitle), null, null, new NotificationDTO.LeftContent(new IconDTO(null, null, null, null, null, z11 ? "ic_wifi_off_m_select" : "ic_wifi_off", UniColors.BG_SECONDARY_INVERTED.getToken(), null, null, null, null, null, null, null, null, null, 65439, null), null, 2, null), new NotificationDTO.RightContent(NotificationDTO.RightContent.ButtonType.CLOSE, null, null, null, 14, null), null, null, null, NotificationDTO.Preset.CUSTOM, 460, null);
    }

    public static /* synthetic */ NotificationDTO createNetworkErrorNotificationDTO$default(boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        return createNetworkErrorNotificationDTO(z11);
    }
}
