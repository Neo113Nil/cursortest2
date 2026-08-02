package ru.ozon.app.android.fresh.common.widgets.molecules.freshFavoriteButton.delegate;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7719a;
import ru.ozon.uni.atoms.data.notification.NotificationModelWrapper;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
/* synthetic */ class FreshFavoriteDelegate$initNotificationsObservers$1 extends C7719a implements Function2<NotificationModelWrapper, d<? super Unit>, Object> {
    FreshFavoriteDelegate$initNotificationsObservers$1(Object obj) {
        super(2, obj, FreshFavoriteDelegate.class, "handleNotifications", "handleNotifications(Lru/ozon/uni/atoms/data/notification/NotificationModelWrapper;)V", 4);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(NotificationModelWrapper notificationModelWrapper, d<? super Unit> dVar) {
        Object initNotificationsObservers$handleNotifications;
        initNotificationsObservers$handleNotifications = FreshFavoriteDelegate.initNotificationsObservers$handleNotifications((FreshFavoriteDelegate) this.receiver, notificationModelWrapper, dVar);
        return initNotificationsObservers$handleNotifications;
    }
}
