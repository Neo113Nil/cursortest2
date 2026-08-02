package com.vk.sdk.api.ads.dto;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AdsAccessRolePublicDto.kt */
/* loaded from: classes5.dex */
public final class AdsAccessRolePublicDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AdsAccessRolePublicDto[] $VALUES;

    @pmi0("manager")
    public static final AdsAccessRolePublicDto MANAGER;

    @pmi0("reports")
    public static final AdsAccessRolePublicDto REPORTS;
    private final String value;

    static {
        AdsAccessRolePublicDto adsAccessRolePublicDto = new AdsAccessRolePublicDto("MANAGER", 0, "manager");
        MANAGER = adsAccessRolePublicDto;
        AdsAccessRolePublicDto adsAccessRolePublicDto2 = new AdsAccessRolePublicDto("REPORTS", 1, "reports");
        REPORTS = adsAccessRolePublicDto2;
        AdsAccessRolePublicDto[] adsAccessRolePublicDtoArr = {adsAccessRolePublicDto, adsAccessRolePublicDto2};
        $VALUES = adsAccessRolePublicDtoArr;
        $ENTRIES = new asp(adsAccessRolePublicDtoArr);
    }

    private AdsAccessRolePublicDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AdsAccessRolePublicDto valueOf(String str) {
        return (AdsAccessRolePublicDto) Enum.valueOf(AdsAccessRolePublicDto.class, str);
    }

    public static AdsAccessRolePublicDto[] values() {
        return (AdsAccessRolePublicDto[]) $VALUES.clone();
    }
}
