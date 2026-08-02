package com.vk.api.generated.auth.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.vk.api.generated.base.dto.BaseErrorDto;
import com.vk.api.generated.users.dto.UsersExchangeUserDto;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AuthExchangeTokenInfoDto.kt */
/* loaded from: classes14.dex */
public final class AuthExchangeTokenInfoDto implements Parcelable {
    public static final Parcelable.Creator<AuthExchangeTokenInfoDto> CREATOR = new a();

    @pmi0("error")
    private final BaseErrorDto error;

    @pmi0("notification_counter")
    private final int notificationCounter;

    @pmi0(CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE)
    private final UsersExchangeUserDto profile;

    @pmi0("tier")
    private final Integer tier;

    /* compiled from: AuthExchangeTokenInfoDto.kt */
    public static final class a implements Parcelable.Creator<AuthExchangeTokenInfoDto> {
        @Override // android.os.Parcelable.Creator
        public final AuthExchangeTokenInfoDto createFromParcel(Parcel parcel) {
            return new AuthExchangeTokenInfoDto(parcel.readInt(), parcel.readInt() == 0 ? null : UsersExchangeUserDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? BaseErrorDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final AuthExchangeTokenInfoDto[] newArray(int i) {
            return new AuthExchangeTokenInfoDto[i];
        }
    }

    public AuthExchangeTokenInfoDto(int i, UsersExchangeUserDto usersExchangeUserDto, Integer num, BaseErrorDto baseErrorDto) {
        this.notificationCounter = i;
        this.profile = usersExchangeUserDto;
        this.tier = num;
        this.error = baseErrorDto;
    }

    public final int d() {
        return this.notificationCounter;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final UsersExchangeUserDto e() {
        return this.profile;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthExchangeTokenInfoDto)) {
            return false;
        }
        AuthExchangeTokenInfoDto authExchangeTokenInfoDto = (AuthExchangeTokenInfoDto) obj;
        return this.notificationCounter == authExchangeTokenInfoDto.notificationCounter && epx.f(this.profile, authExchangeTokenInfoDto.profile) && epx.f(this.tier, authExchangeTokenInfoDto.tier) && epx.f(this.error, authExchangeTokenInfoDto.error);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.notificationCounter) * 31;
        UsersExchangeUserDto usersExchangeUserDto = this.profile;
        int hashCode2 = (hashCode + (usersExchangeUserDto == null ? 0 : usersExchangeUserDto.hashCode())) * 31;
        Integer num = this.tier;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        BaseErrorDto baseErrorDto = this.error;
        return hashCode3 + (baseErrorDto != null ? baseErrorDto.hashCode() : 0);
    }

    public final String toString() {
        return "AuthExchangeTokenInfoDto(notificationCounter=" + this.notificationCounter + ", profile=" + this.profile + ", tier=" + this.tier + ", error=" + this.error + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.notificationCounter);
        UsersExchangeUserDto usersExchangeUserDto = this.profile;
        if (usersExchangeUserDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            usersExchangeUserDto.writeToParcel(parcel, i);
        }
        Integer num = this.tier;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        BaseErrorDto baseErrorDto = this.error;
        if (baseErrorDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseErrorDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ AuthExchangeTokenInfoDto(int i, UsersExchangeUserDto usersExchangeUserDto, Integer num, BaseErrorDto baseErrorDto, int i2, zcl zclVar) {
        this(i, (i2 & 2) != 0 ? null : usersExchangeUserDto, (i2 & 4) != 0 ? null : num, (i2 & 8) != 0 ? null : baseErrorDto);
    }
}
