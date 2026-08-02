package ru.ozon.app.android.actionHandlers.pdp.sellerSubscribe;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C7735q;
import ru.ozon.uni.atoms.data.notification.NotificationAtom;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
/* synthetic */ class BaseSellerSubscribeActionHandler$errorNotificationDTO$2 extends C7735q implements Function0<NotificationAtom.NotificationWithIcon> {
    BaseSellerSubscribeActionHandler$errorNotificationDTO$2(Object obj) {
        super(0, obj, BaseSellerSubscribeActionHandler.class, "getErrorDefaultNotificationDTO", "getErrorDefaultNotificationDTO()Lru/ozon/uni/atoms/data/notification/NotificationAtom$NotificationWithIcon;", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final NotificationAtom.NotificationWithIcon invoke() {
        NotificationAtom.NotificationWithIcon errorDefaultNotificationDTO;
        errorDefaultNotificationDTO = ((BaseSellerSubscribeActionHandler) this.receiver).getErrorDefaultNotificationDTO();
        return errorDefaultNotificationDTO;
    }
}
