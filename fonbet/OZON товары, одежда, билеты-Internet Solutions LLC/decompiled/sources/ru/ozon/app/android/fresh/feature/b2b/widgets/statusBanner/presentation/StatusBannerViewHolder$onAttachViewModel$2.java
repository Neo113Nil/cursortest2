package ru.ozon.app.android.fresh.feature.b2b.widgets.statusBanner.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7719a;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
/* synthetic */ class StatusBannerViewHolder$onAttachViewModel$2 extends C7719a implements Function2<NotificationDTO, d<? super Unit>, Object> {
    StatusBannerViewHolder$onAttachViewModel$2(Object obj) {
        super(2, obj, StatusBannerViewHolder.class, "showNotificationBar", "showNotificationBar(Lru/ozon/uni/atoms/data/notification/NotificationDTO;)V", 4);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(NotificationDTO notificationDTO, d<? super Unit> dVar) {
        Object onAttachViewModel$showNotificationBar;
        onAttachViewModel$showNotificationBar = StatusBannerViewHolder.onAttachViewModel$showNotificationBar((StatusBannerViewHolder) this.receiver, notificationDTO, dVar);
        return onAttachViewModel$showNotificationBar;
    }
}
