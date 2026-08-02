package com.vk.api.generated.auth.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.vk.api.generated.users.dto.UsersExchangeUserDto;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.shy;
import xsna.uqi;
import xsna.zcl;

/* compiled from: AuthGetExchangeTokenInfoResponseDto.kt */
/* loaded from: classes14.dex */
public final class AuthGetExchangeTokenInfoResponseDto implements Parcelable {
    public static final Parcelable.Creator<AuthGetExchangeTokenInfoResponseDto> CREATOR = new a();

    @pmi0("notification_counter")
    private final int notificationCounter;

    @pmi0(CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE)
    private final UsersExchangeUserDto profile;

    @pmi0("tier")
    private final Integer tier;

    /* compiled from: AuthGetExchangeTokenInfoResponseDto.kt */
    public static final class a implements Parcelable.Creator<AuthGetExchangeTokenInfoResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final AuthGetExchangeTokenInfoResponseDto createFromParcel(Parcel parcel) {
            return new AuthGetExchangeTokenInfoResponseDto(UsersExchangeUserDto.CREATOR.createFromParcel(parcel), parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final AuthGetExchangeTokenInfoResponseDto[] newArray(int i) {
            return new AuthGetExchangeTokenInfoResponseDto[i];
        }
    }

    public AuthGetExchangeTokenInfoResponseDto(UsersExchangeUserDto usersExchangeUserDto, int i, Integer num) {
        this.profile = usersExchangeUserDto;
        this.notificationCounter = i;
        this.tier = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthGetExchangeTokenInfoResponseDto)) {
            return false;
        }
        AuthGetExchangeTokenInfoResponseDto authGetExchangeTokenInfoResponseDto = (AuthGetExchangeTokenInfoResponseDto) obj;
        return epx.f(this.profile, authGetExchangeTokenInfoResponseDto.profile) && this.notificationCounter == authGetExchangeTokenInfoResponseDto.notificationCounter && epx.f(this.tier, authGetExchangeTokenInfoResponseDto.tier);
    }

    public final int hashCode() {
        int a2 = shy.a(this.notificationCounter, this.profile.hashCode() * 31, 31);
        Integer num = this.tier;
        return a2 + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthGetExchangeTokenInfoResponseDto(profile=");
        sb.append(this.profile);
        sb.append(", notificationCounter=");
        sb.append(this.notificationCounter);
        sb.append(", tier=");
        return uqi.b(sb, this.tier, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.profile.writeToParcel(parcel, i);
        parcel.writeInt(this.notificationCounter);
        Integer num = this.tier;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public /* synthetic */ AuthGetExchangeTokenInfoResponseDto(UsersExchangeUserDto usersExchangeUserDto, int i, Integer num, int i2, zcl zclVar) {
        this(usersExchangeUserDto, i, (i2 & 4) != 0 ? null : num);
    }
}
