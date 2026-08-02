package com.vk.sdk.api.ads.dto;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AdsAccessRoleDto.kt */
/* loaded from: classes5.dex */
public final class AdsAccessRoleDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AdsAccessRoleDto[] $VALUES;

    @pmi0("admin")
    public static final AdsAccessRoleDto ADMIN;

    @pmi0("manager")
    public static final AdsAccessRoleDto MANAGER;

    @pmi0("reports")
    public static final AdsAccessRoleDto REPORTS;
    private final String value;

    static {
        AdsAccessRoleDto adsAccessRoleDto = new AdsAccessRoleDto("ADMIN", 0, "admin");
        ADMIN = adsAccessRoleDto;
        AdsAccessRoleDto adsAccessRoleDto2 = new AdsAccessRoleDto("MANAGER", 1, "manager");
        MANAGER = adsAccessRoleDto2;
        AdsAccessRoleDto adsAccessRoleDto3 = new AdsAccessRoleDto("REPORTS", 2, "reports");
        REPORTS = adsAccessRoleDto3;
        AdsAccessRoleDto[] adsAccessRoleDtoArr = {adsAccessRoleDto, adsAccessRoleDto2, adsAccessRoleDto3};
        $VALUES = adsAccessRoleDtoArr;
        $ENTRIES = new asp(adsAccessRoleDtoArr);
    }

    private AdsAccessRoleDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AdsAccessRoleDto valueOf(String str) {
        return (AdsAccessRoleDto) Enum.valueOf(AdsAccessRoleDto.class, str);
    }

    public static AdsAccessRoleDto[] values() {
        return (AdsAccessRoleDto[]) $VALUES.clone();
    }
}
