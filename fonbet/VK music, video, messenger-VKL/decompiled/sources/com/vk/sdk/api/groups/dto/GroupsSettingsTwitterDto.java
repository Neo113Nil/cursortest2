package com.vk.sdk.api.groups.dto;

import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: GroupsSettingsTwitterDto.kt */
/* loaded from: classes5.dex */
public final class GroupsSettingsTwitterDto {

    @pmi0("name")
    private final String name;

    @pmi0("status")
    private final StatusDto status;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GroupsSettingsTwitterDto.kt */
    public static final class StatusDto {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ StatusDto[] $VALUES;

        @pmi0("loading")
        public static final StatusDto LOADING;

        @pmi0("sync")
        public static final StatusDto SYNC;
        private final String value;

        static {
            StatusDto statusDto = new StatusDto("LOADING", 0, "loading");
            LOADING = statusDto;
            StatusDto statusDto2 = new StatusDto("SYNC", 1, "sync");
            SYNC = statusDto2;
            StatusDto[] statusDtoArr = {statusDto, statusDto2};
            $VALUES = statusDtoArr;
            $ENTRIES = new asp(statusDtoArr);
        }

        private StatusDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static StatusDto valueOf(String str) {
            return (StatusDto) Enum.valueOf(StatusDto.class, str);
        }

        public static StatusDto[] values() {
            return (StatusDto[]) $VALUES.clone();
        }
    }

    public GroupsSettingsTwitterDto(StatusDto statusDto, String str) {
        this.status = statusDto;
        this.name = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsSettingsTwitterDto)) {
            return false;
        }
        GroupsSettingsTwitterDto groupsSettingsTwitterDto = (GroupsSettingsTwitterDto) obj;
        return this.status == groupsSettingsTwitterDto.status && epx.f(this.name, groupsSettingsTwitterDto.name);
    }

    public final int hashCode() {
        int hashCode = this.status.hashCode() * 31;
        String str = this.name;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "GroupsSettingsTwitterDto(status=" + this.status + ", name=" + this.name + ")";
    }

    public /* synthetic */ GroupsSettingsTwitterDto(StatusDto statusDto, String str, int i, zcl zclVar) {
        this(statusDto, (i & 2) != 0 ? null : str);
    }
}
