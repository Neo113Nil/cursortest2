package com.vk.sdk.api.messages.dto;

import com.huawei.hms.support.api.entity.common.CommonConstant;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MessagesUserTypeForXtrInvitedByDto.kt */
/* loaded from: classes5.dex */
public final class MessagesUserTypeForXtrInvitedByDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MessagesUserTypeForXtrInvitedByDto[] $VALUES;

    @pmi0("group")
    public static final MessagesUserTypeForXtrInvitedByDto GROUP;

    @pmi0(CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE)
    public static final MessagesUserTypeForXtrInvitedByDto PROFILE;
    private final String value;

    static {
        MessagesUserTypeForXtrInvitedByDto messagesUserTypeForXtrInvitedByDto = new MessagesUserTypeForXtrInvitedByDto("PROFILE", 0, CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE);
        PROFILE = messagesUserTypeForXtrInvitedByDto;
        MessagesUserTypeForXtrInvitedByDto messagesUserTypeForXtrInvitedByDto2 = new MessagesUserTypeForXtrInvitedByDto("GROUP", 1, "group");
        GROUP = messagesUserTypeForXtrInvitedByDto2;
        MessagesUserTypeForXtrInvitedByDto[] messagesUserTypeForXtrInvitedByDtoArr = {messagesUserTypeForXtrInvitedByDto, messagesUserTypeForXtrInvitedByDto2};
        $VALUES = messagesUserTypeForXtrInvitedByDtoArr;
        $ENTRIES = new asp(messagesUserTypeForXtrInvitedByDtoArr);
    }

    private MessagesUserTypeForXtrInvitedByDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static MessagesUserTypeForXtrInvitedByDto valueOf(String str) {
        return (MessagesUserTypeForXtrInvitedByDto) Enum.valueOf(MessagesUserTypeForXtrInvitedByDto.class, str);
    }

    public static MessagesUserTypeForXtrInvitedByDto[] values() {
        return (MessagesUserTypeForXtrInvitedByDto[]) $VALUES.clone();
    }
}
