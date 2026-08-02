package com.vk.sdk.api.notifications.dto;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: NotificationsSendMessageSendingModeDto.kt */
/* loaded from: classes5.dex */
public final class NotificationsSendMessageSendingModeDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ NotificationsSendMessageSendingModeDto[] $VALUES;

    @pmi0("delayed")
    public static final NotificationsSendMessageSendingModeDto DELAYED;

    @pmi0("delayed_push")
    public static final NotificationsSendMessageSendingModeDto DELAYED_PUSH;

    @pmi0("immediately")
    public static final NotificationsSendMessageSendingModeDto IMMEDIATELY;

    @pmi0("without_push")
    public static final NotificationsSendMessageSendingModeDto WITHOUT_PUSH;
    private final String value;

    static {
        NotificationsSendMessageSendingModeDto notificationsSendMessageSendingModeDto = new NotificationsSendMessageSendingModeDto("DELAYED", 0, "delayed");
        DELAYED = notificationsSendMessageSendingModeDto;
        NotificationsSendMessageSendingModeDto notificationsSendMessageSendingModeDto2 = new NotificationsSendMessageSendingModeDto("DELAYED_PUSH", 1, "delayed_push");
        DELAYED_PUSH = notificationsSendMessageSendingModeDto2;
        NotificationsSendMessageSendingModeDto notificationsSendMessageSendingModeDto3 = new NotificationsSendMessageSendingModeDto("IMMEDIATELY", 2, "immediately");
        IMMEDIATELY = notificationsSendMessageSendingModeDto3;
        NotificationsSendMessageSendingModeDto notificationsSendMessageSendingModeDto4 = new NotificationsSendMessageSendingModeDto("WITHOUT_PUSH", 3, "without_push");
        WITHOUT_PUSH = notificationsSendMessageSendingModeDto4;
        NotificationsSendMessageSendingModeDto[] notificationsSendMessageSendingModeDtoArr = {notificationsSendMessageSendingModeDto, notificationsSendMessageSendingModeDto2, notificationsSendMessageSendingModeDto3, notificationsSendMessageSendingModeDto4};
        $VALUES = notificationsSendMessageSendingModeDtoArr;
        $ENTRIES = new asp(notificationsSendMessageSendingModeDtoArr);
    }

    private NotificationsSendMessageSendingModeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static NotificationsSendMessageSendingModeDto valueOf(String str) {
        return (NotificationsSendMessageSendingModeDto) Enum.valueOf(NotificationsSendMessageSendingModeDto.class, str);
    }

    public static NotificationsSendMessageSendingModeDto[] values() {
        return (NotificationsSendMessageSendingModeDto[]) $VALUES.clone();
    }
}
