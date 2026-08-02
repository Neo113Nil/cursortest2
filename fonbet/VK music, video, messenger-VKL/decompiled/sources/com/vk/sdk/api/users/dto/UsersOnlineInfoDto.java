package com.vk.sdk.api.users.dto;

import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: UsersOnlineInfoDto.kt */
/* loaded from: classes5.dex */
public final class UsersOnlineInfoDto {

    @pmi0("app_id")
    private final Integer appId;

    @pmi0("is_mobile")
    private final Boolean isMobile;

    @pmi0("is_online")
    private final Boolean isOnline;

    @pmi0("last_seen")
    private final Integer lastSeen;

    @pmi0("status")
    private final StatusDto status;

    @pmi0("visible")
    private final boolean visible;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: UsersOnlineInfoDto.kt */
    public static final class StatusDto {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ StatusDto[] $VALUES;

        @pmi0("last_month")
        public static final StatusDto LAST_MONTH;

        @pmi0("last_week")
        public static final StatusDto LAST_WEEK;

        @pmi0("long_ago")
        public static final StatusDto LONG_AGO;

        @pmi0("not_show")
        public static final StatusDto NOT_SHOW;

        @pmi0("recently")
        public static final StatusDto RECENTLY;
        private final String value;

        static {
            StatusDto statusDto = new StatusDto("RECENTLY", 0, "recently");
            RECENTLY = statusDto;
            StatusDto statusDto2 = new StatusDto("LAST_WEEK", 1, "last_week");
            LAST_WEEK = statusDto2;
            StatusDto statusDto3 = new StatusDto("LAST_MONTH", 2, "last_month");
            LAST_MONTH = statusDto3;
            StatusDto statusDto4 = new StatusDto("LONG_AGO", 3, "long_ago");
            LONG_AGO = statusDto4;
            StatusDto statusDto5 = new StatusDto("NOT_SHOW", 4, "not_show");
            NOT_SHOW = statusDto5;
            StatusDto[] statusDtoArr = {statusDto, statusDto2, statusDto3, statusDto4, statusDto5};
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

    public UsersOnlineInfoDto(boolean z, Integer num, Boolean bool, Integer num2, Boolean bool2, StatusDto statusDto) {
        this.visible = z;
        this.lastSeen = num;
        this.isOnline = bool;
        this.appId = num2;
        this.isMobile = bool2;
        this.status = statusDto;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UsersOnlineInfoDto)) {
            return false;
        }
        UsersOnlineInfoDto usersOnlineInfoDto = (UsersOnlineInfoDto) obj;
        return this.visible == usersOnlineInfoDto.visible && epx.f(this.lastSeen, usersOnlineInfoDto.lastSeen) && epx.f(this.isOnline, usersOnlineInfoDto.isOnline) && epx.f(this.appId, usersOnlineInfoDto.appId) && epx.f(this.isMobile, usersOnlineInfoDto.isMobile) && this.status == usersOnlineInfoDto.status;
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.visible) * 31;
        Integer num = this.lastSeen;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.isOnline;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num2 = this.appId;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool2 = this.isMobile;
        int hashCode5 = (hashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        StatusDto statusDto = this.status;
        return hashCode5 + (statusDto != null ? statusDto.hashCode() : 0);
    }

    public final String toString() {
        return "UsersOnlineInfoDto(visible=" + this.visible + ", lastSeen=" + this.lastSeen + ", isOnline=" + this.isOnline + ", appId=" + this.appId + ", isMobile=" + this.isMobile + ", status=" + this.status + ")";
    }

    public /* synthetic */ UsersOnlineInfoDto(boolean z, Integer num, Boolean bool, Integer num2, Boolean bool2, StatusDto statusDto, int i, zcl zclVar) {
        this(z, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : num2, (i & 16) != 0 ? null : bool2, (i & 32) != 0 ? null : statusDto);
    }
}
