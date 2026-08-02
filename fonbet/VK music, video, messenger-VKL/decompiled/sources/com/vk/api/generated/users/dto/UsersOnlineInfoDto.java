package com.vk.api.generated.users.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.sn;
import xsna.zcl;
import xsna.zrp;

/* compiled from: UsersOnlineInfoDto.kt */
/* loaded from: classes15.dex */
public final class UsersOnlineInfoDto implements Parcelable {
    public static final Parcelable.Creator<UsersOnlineInfoDto> CREATOR = new a();

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
    public static final class StatusDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ StatusDto[] $VALUES;
        public static final Parcelable.Creator<StatusDto> CREATOR;

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

        /* compiled from: UsersOnlineInfoDto.kt */
        public static final class a implements Parcelable.Creator<StatusDto> {
            @Override // android.os.Parcelable.Creator
            public final StatusDto createFromParcel(Parcel parcel) {
                return StatusDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final StatusDto[] newArray(int i) {
                return new StatusDto[i];
            }
        }

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
            CREATOR = new a();
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

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String i() {
            return this.value;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* compiled from: UsersOnlineInfoDto.kt */
    public static final class a implements Parcelable.Creator<UsersOnlineInfoDto> {
        @Override // android.os.Parcelable.Creator
        public final UsersOnlineInfoDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Boolean valueOf2;
            boolean z = parcel.readInt() != 0;
            Integer valueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            Integer valueOf4 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new UsersOnlineInfoDto(z, valueOf3, valueOf, valueOf4, valueOf2, parcel.readInt() != 0 ? StatusDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final UsersOnlineInfoDto[] newArray(int i) {
            return new UsersOnlineInfoDto[i];
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

    public final Integer d() {
        return this.appId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Integer e() {
        return this.lastSeen;
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

    public final StatusDto f() {
        return this.status;
    }

    public final boolean g() {
        return this.visible;
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

    public final Boolean i() {
        return this.isMobile;
    }

    public final Boolean j() {
        return this.isOnline;
    }

    public final String toString() {
        return "UsersOnlineInfoDto(visible=" + this.visible + ", lastSeen=" + this.lastSeen + ", isOnline=" + this.isOnline + ", appId=" + this.appId + ", isMobile=" + this.isMobile + ", status=" + this.status + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.visible ? 1 : 0);
        Integer num = this.lastSeen;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Boolean bool = this.isOnline;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Integer num2 = this.appId;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        Boolean bool2 = this.isMobile;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        StatusDto statusDto = this.status;
        if (statusDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            statusDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ UsersOnlineInfoDto(boolean z, Integer num, Boolean bool, Integer num2, Boolean bool2, StatusDto statusDto, int i, zcl zclVar) {
        this(z, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : num2, (i & 16) != 0 ? null : bool2, (i & 32) != 0 ? null : statusDto);
    }
}
