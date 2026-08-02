package com.vk.sdk.api.apps.dto;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AppsSendRequestTypeDto.kt */
/* loaded from: classes5.dex */
public final class AppsSendRequestTypeDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AppsSendRequestTypeDto[] $VALUES;

    @pmi0("invite")
    public static final AppsSendRequestTypeDto INVITE;

    @pmi0("request")
    public static final AppsSendRequestTypeDto REQUEST;
    private final String value;

    static {
        AppsSendRequestTypeDto appsSendRequestTypeDto = new AppsSendRequestTypeDto("INVITE", 0, "invite");
        INVITE = appsSendRequestTypeDto;
        AppsSendRequestTypeDto appsSendRequestTypeDto2 = new AppsSendRequestTypeDto("REQUEST", 1, "request");
        REQUEST = appsSendRequestTypeDto2;
        AppsSendRequestTypeDto[] appsSendRequestTypeDtoArr = {appsSendRequestTypeDto, appsSendRequestTypeDto2};
        $VALUES = appsSendRequestTypeDtoArr;
        $ENTRIES = new asp(appsSendRequestTypeDtoArr);
    }

    private AppsSendRequestTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AppsSendRequestTypeDto valueOf(String str) {
        return (AppsSendRequestTypeDto) Enum.valueOf(AppsSendRequestTypeDto.class, str);
    }

    public static AppsSendRequestTypeDto[] values() {
        return (AppsSendRequestTypeDto[]) $VALUES.clone();
    }
}
