package ru.ozon.app.android.fresh.geo.widgets.geotrackingMap.v2.presentation;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.fresh.geo.R$string;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class GeotrackingMapV2Binder$errorNotificationDTO$2 extends AbstractC7737t implements Function0<NotificationDTO> {
    public static final GeotrackingMapV2Binder$errorNotificationDTO$2 INSTANCE = new GeotrackingMapV2Binder$errorNotificationDTO$2();

    GeotrackingMapV2Binder$errorNotificationDTO$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final NotificationDTO invoke() {
        return new NotificationDTO(StringProvider.getString(R$string.geotracking_map_socket_error), null, null, null, null, null, null, null, null, NotificationDTO.Preset.NEGATIVE, 510, null);
    }
}
