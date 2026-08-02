package com.vk.api.generated.users.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.account.dto.AccountNavigationStateDto;
import com.vk.api.generated.account.dto.AccountNavigationVariantDto;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: UsersNavigationDto.kt */
/* loaded from: classes15.dex */
public final class UsersNavigationDto implements Parcelable {
    public static final Parcelable.Creator<UsersNavigationDto> CREATOR = new a();

    @pmi0("state")
    private final AccountNavigationStateDto state;

    @pmi0("variant")
    private final AccountNavigationVariantDto variant;

    /* compiled from: UsersNavigationDto.kt */
    public static final class a implements Parcelable.Creator<UsersNavigationDto> {
        @Override // android.os.Parcelable.Creator
        public final UsersNavigationDto createFromParcel(Parcel parcel) {
            return new UsersNavigationDto(parcel.readInt() == 0 ? null : AccountNavigationStateDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? AccountNavigationVariantDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final UsersNavigationDto[] newArray(int i) {
            return new UsersNavigationDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UsersNavigationDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UsersNavigationDto)) {
            return false;
        }
        UsersNavigationDto usersNavigationDto = (UsersNavigationDto) obj;
        return epx.f(this.state, usersNavigationDto.state) && epx.f(this.variant, usersNavigationDto.variant);
    }

    public final int hashCode() {
        AccountNavigationStateDto accountNavigationStateDto = this.state;
        int hashCode = (accountNavigationStateDto == null ? 0 : accountNavigationStateDto.hashCode()) * 31;
        AccountNavigationVariantDto accountNavigationVariantDto = this.variant;
        return hashCode + (accountNavigationVariantDto != null ? accountNavigationVariantDto.hashCode() : 0);
    }

    public final String toString() {
        return "UsersNavigationDto(state=" + this.state + ", variant=" + this.variant + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AccountNavigationStateDto accountNavigationStateDto = this.state;
        if (accountNavigationStateDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            accountNavigationStateDto.writeToParcel(parcel, i);
        }
        AccountNavigationVariantDto accountNavigationVariantDto = this.variant;
        if (accountNavigationVariantDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            accountNavigationVariantDto.writeToParcel(parcel, i);
        }
    }

    public UsersNavigationDto(AccountNavigationStateDto accountNavigationStateDto, AccountNavigationVariantDto accountNavigationVariantDto) {
        this.state = accountNavigationStateDto;
        this.variant = accountNavigationVariantDto;
    }

    public /* synthetic */ UsersNavigationDto(AccountNavigationStateDto accountNavigationStateDto, AccountNavigationVariantDto accountNavigationVariantDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : accountNavigationStateDto, (i & 2) != 0 ? null : accountNavigationVariantDto);
    }
}
