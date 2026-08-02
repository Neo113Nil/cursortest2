package ru.ozon.app.android.storefront.feature.notifications.utils;

import gi.C6740b;
import gi.InterfaceC6741c;
import hi.InterfaceC6958a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.core.notifications.di.NotificationStatusComponentApi;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lgi/c;", "", "initNotificationStatusObserver", "(Lgi/c;)V", "notifications_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class HasComponentStorageExtKt {
    public static final void initNotificationStatusObserver(@NotNull InterfaceC6741c interfaceC6741c) {
        Intrinsics.checkNotNullParameter(interfaceC6741c, "<this>");
        C6740b dependencyStorage = interfaceC6741c.getDependencyStorage();
        if (NotificationStatusComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NotificationStatusComponentApi is not DiComponent");
        }
        ((NotificationStatusComponentApi) dependencyStorage.b(NotificationStatusComponentApi.class)).getNotificationStatusObserver().init();
    }
}
