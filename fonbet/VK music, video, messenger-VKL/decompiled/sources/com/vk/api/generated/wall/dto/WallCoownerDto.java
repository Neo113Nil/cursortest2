package com.vk.api.generated.wall.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import xsna.asp;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.qoy;
import xsna.sn;
import xsna.tn;
import xsna.zcl;
import xsna.zrp;

/* compiled from: WallCoownerDto.kt */
/* loaded from: classes15.dex */
public final class WallCoownerDto implements Parcelable {
    public static final Parcelable.Creator<WallCoownerDto> CREATOR = new a();

    @pmi0("can_subscribe")
    private final Boolean canSubscribe;

    @pmi0("is_current_user")
    private final boolean isCurrentUser;

    @pmi0("is_subscribed")
    private final Boolean isSubscribed;

    @pmi0("owner_id")
    private final UserId ownerId;

    @pmi0("post_id")
    private final Integer postId;

    @pmi0("status")
    private final StatusDto status;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: WallCoownerDto.kt */
    public static final class StatusDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ StatusDto[] $VALUES;

        @pmi0("approved")
        public static final StatusDto APPROVED;
        public static final Parcelable.Creator<StatusDto> CREATOR;

        @pmi0("pending")
        public static final StatusDto PENDING;

        @pmi0("rejected")
        public static final StatusDto REJECTED;
        private final String value;

        /* compiled from: WallCoownerDto.kt */
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
            StatusDto statusDto = new StatusDto("PENDING", 0, "pending");
            PENDING = statusDto;
            StatusDto statusDto2 = new StatusDto("REJECTED", 1, "rejected");
            REJECTED = statusDto2;
            StatusDto statusDto3 = new StatusDto("APPROVED", 2, "approved");
            APPROVED = statusDto3;
            StatusDto[] statusDtoArr = {statusDto, statusDto2, statusDto3};
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

    /* compiled from: WallCoownerDto.kt */
    public static final class a implements Parcelable.Creator<WallCoownerDto> {
        @Override // android.os.Parcelable.Creator
        public final WallCoownerDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            UserId userId = (UserId) parcel.readParcelable(WallCoownerDto.class.getClassLoader());
            boolean z = parcel.readInt() != 0;
            Boolean bool = null;
            StatusDto createFromParcel = parcel.readInt() == 0 ? null : StatusDto.CREATOR.createFromParcel(parcel);
            Integer valueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new WallCoownerDto(userId, z, createFromParcel, valueOf2, valueOf, bool);
        }

        @Override // android.os.Parcelable.Creator
        public final WallCoownerDto[] newArray(int i) {
            return new WallCoownerDto[i];
        }
    }

    public WallCoownerDto(UserId userId, boolean z, StatusDto statusDto, Integer num, Boolean bool, Boolean bool2) {
        this.ownerId = userId;
        this.isCurrentUser = z;
        this.status = statusDto;
        this.postId = num;
        this.canSubscribe = bool;
        this.isSubscribed = bool2;
    }

    public final Boolean d() {
        return this.canSubscribe;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final StatusDto e() {
        return this.status;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WallCoownerDto)) {
            return false;
        }
        WallCoownerDto wallCoownerDto = (WallCoownerDto) obj;
        return epx.f(this.ownerId, wallCoownerDto.ownerId) && this.isCurrentUser == wallCoownerDto.isCurrentUser && this.status == wallCoownerDto.status && epx.f(this.postId, wallCoownerDto.postId) && epx.f(this.canSubscribe, wallCoownerDto.canSubscribe) && epx.f(this.isSubscribed, wallCoownerDto.isSubscribed);
    }

    public final Boolean f() {
        return this.isSubscribed;
    }

    public final int hashCode() {
        int b = qoy.b(Long.hashCode(this.ownerId.b) * 31, 31, this.isCurrentUser);
        StatusDto statusDto = this.status;
        int hashCode = (b + (statusDto == null ? 0 : statusDto.hashCode())) * 31;
        Integer num = this.postId;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.canSubscribe;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isSubscribed;
        return hashCode3 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final UserId q() {
        return this.ownerId;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WallCoownerDto(ownerId=");
        sb.append(this.ownerId);
        sb.append(", isCurrentUser=");
        sb.append(this.isCurrentUser);
        sb.append(", status=");
        sb.append(this.status);
        sb.append(", postId=");
        sb.append(this.postId);
        sb.append(", canSubscribe=");
        sb.append(this.canSubscribe);
        sb.append(", isSubscribed=");
        return tn.a(sb, this.isSubscribed, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.ownerId, i);
        parcel.writeInt(this.isCurrentUser ? 1 : 0);
        StatusDto statusDto = this.status;
        if (statusDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            statusDto.writeToParcel(parcel, i);
        }
        Integer num = this.postId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Boolean bool = this.canSubscribe;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Boolean bool2 = this.isSubscribed;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
    }

    public /* synthetic */ WallCoownerDto(UserId userId, boolean z, StatusDto statusDto, Integer num, Boolean bool, Boolean bool2, int i, zcl zclVar) {
        this(userId, z, (i & 4) != 0 ? null : statusDto, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : bool, (i & 32) != 0 ? null : bool2);
    }
}
