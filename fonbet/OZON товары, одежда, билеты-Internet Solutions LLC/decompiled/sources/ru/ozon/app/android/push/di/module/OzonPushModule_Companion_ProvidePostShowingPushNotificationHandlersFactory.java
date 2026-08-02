package ru.ozon.app.android.push.di.module;

import Jb.e;
import Jb.j;
import eh0.b;
import java.util.Set;
import ru.ozon.app.android.push.handlers.PartPaymentPushHandler;

/* loaded from: classes7.dex */
public final class OzonPushModule_Companion_ProvidePostShowingPushNotificationHandlersFactory implements e<Set<b>> {
    public static Set<b> providePostShowingPushNotificationHandlers(PartPaymentPushHandler partPaymentPushHandler) {
        Set<b> providePostShowingPushNotificationHandlers = OzonPushModule.INSTANCE.providePostShowingPushNotificationHandlers(partPaymentPushHandler);
        j.d(providePostShowingPushNotificationHandlers);
        return providePostShowingPushNotificationHandlers;
    }
}
