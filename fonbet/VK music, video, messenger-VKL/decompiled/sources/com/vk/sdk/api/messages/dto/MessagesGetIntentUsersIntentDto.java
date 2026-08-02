package com.vk.sdk.api.messages.dto;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MessagesGetIntentUsersIntentDto.kt */
/* loaded from: classes5.dex */
public final class MessagesGetIntentUsersIntentDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MessagesGetIntentUsersIntentDto[] $VALUES;

    @pmi0("confirmed_notification")
    public static final MessagesGetIntentUsersIntentDto CONFIRMED_NOTIFICATION;

    @pmi0("non_promo_newsletter")
    public static final MessagesGetIntentUsersIntentDto NON_PROMO_NEWSLETTER;

    @pmi0("promo_newsletter")
    public static final MessagesGetIntentUsersIntentDto PROMO_NEWSLETTER;
    private final String value;

    static {
        MessagesGetIntentUsersIntentDto messagesGetIntentUsersIntentDto = new MessagesGetIntentUsersIntentDto("CONFIRMED_NOTIFICATION", 0, "confirmed_notification");
        CONFIRMED_NOTIFICATION = messagesGetIntentUsersIntentDto;
        MessagesGetIntentUsersIntentDto messagesGetIntentUsersIntentDto2 = new MessagesGetIntentUsersIntentDto("NON_PROMO_NEWSLETTER", 1, "non_promo_newsletter");
        NON_PROMO_NEWSLETTER = messagesGetIntentUsersIntentDto2;
        MessagesGetIntentUsersIntentDto messagesGetIntentUsersIntentDto3 = new MessagesGetIntentUsersIntentDto("PROMO_NEWSLETTER", 2, "promo_newsletter");
        PROMO_NEWSLETTER = messagesGetIntentUsersIntentDto3;
        MessagesGetIntentUsersIntentDto[] messagesGetIntentUsersIntentDtoArr = {messagesGetIntentUsersIntentDto, messagesGetIntentUsersIntentDto2, messagesGetIntentUsersIntentDto3};
        $VALUES = messagesGetIntentUsersIntentDtoArr;
        $ENTRIES = new asp(messagesGetIntentUsersIntentDtoArr);
    }

    private MessagesGetIntentUsersIntentDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static MessagesGetIntentUsersIntentDto valueOf(String str) {
        return (MessagesGetIntentUsersIntentDto) Enum.valueOf(MessagesGetIntentUsersIntentDto.class, str);
    }

    public static MessagesGetIntentUsersIntentDto[] values() {
        return (MessagesGetIntentUsersIntentDto[]) $VALUES.clone();
    }
}
