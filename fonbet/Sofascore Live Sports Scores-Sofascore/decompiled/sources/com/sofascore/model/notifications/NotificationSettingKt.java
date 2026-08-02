package com.sofascore.model.notifications;

import defpackage.wv8;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"backendChannelName", "", "Lcom/sofascore/model/notifications/NotificationSetting;", "getBackendChannelName", "(Lcom/sofascore/model/notifications/NotificationSetting;)Ljava/lang/String;", "model_release"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class NotificationSettingKt {
    @NotNull
    public static final String getBackendChannelName(@NotNull NotificationSetting notificationSetting) {
        notificationSetting.getClass();
        return wv8.i(notificationSetting.getGroup(), "_", notificationSetting.getName());
    }
}
