package com.vk.api.generated.account.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import java.util.List;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.shy;
import xsna.zcl;

/* compiled from: AccountSearchContactsFoundObjectDto.kt */
/* loaded from: classes14.dex */
public final class AccountSearchContactsFoundObjectDto implements Parcelable {
    public static final Parcelable.Creator<AccountSearchContactsFoundObjectDto> CREATOR = new a();

    @pmi0("common_count")
    private final int commonCount;

    @pmi0("descriptions")
    private final List<String> descriptions;

    @pmi0("service")
    private final AccountSearchContactsServiceDto service;

    @pmi0("user")
    private final UsersUserFullDto user;

    /* compiled from: AccountSearchContactsFoundObjectDto.kt */
    public static final class a implements Parcelable.Creator<AccountSearchContactsFoundObjectDto> {
        @Override // android.os.Parcelable.Creator
        public final AccountSearchContactsFoundObjectDto createFromParcel(Parcel parcel) {
            return new AccountSearchContactsFoundObjectDto((UsersUserFullDto) parcel.readParcelable(AccountSearchContactsFoundObjectDto.class.getClassLoader()), parcel.readInt(), parcel.readInt() == 0 ? null : AccountSearchContactsServiceDto.CREATOR.createFromParcel(parcel), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final AccountSearchContactsFoundObjectDto[] newArray(int i) {
            return new AccountSearchContactsFoundObjectDto[i];
        }
    }

    public AccountSearchContactsFoundObjectDto(UsersUserFullDto usersUserFullDto, int i, AccountSearchContactsServiceDto accountSearchContactsServiceDto, List<String> list) {
        this.user = usersUserFullDto;
        this.commonCount = i;
        this.service = accountSearchContactsServiceDto;
        this.descriptions = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountSearchContactsFoundObjectDto)) {
            return false;
        }
        AccountSearchContactsFoundObjectDto accountSearchContactsFoundObjectDto = (AccountSearchContactsFoundObjectDto) obj;
        return epx.f(this.user, accountSearchContactsFoundObjectDto.user) && this.commonCount == accountSearchContactsFoundObjectDto.commonCount && this.service == accountSearchContactsFoundObjectDto.service && epx.f(this.descriptions, accountSearchContactsFoundObjectDto.descriptions);
    }

    public final int hashCode() {
        int a2 = shy.a(this.commonCount, this.user.hashCode() * 31, 31);
        AccountSearchContactsServiceDto accountSearchContactsServiceDto = this.service;
        int hashCode = (a2 + (accountSearchContactsServiceDto == null ? 0 : accountSearchContactsServiceDto.hashCode())) * 31;
        List<String> list = this.descriptions;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccountSearchContactsFoundObjectDto(user=");
        sb.append(this.user);
        sb.append(", commonCount=");
        sb.append(this.commonCount);
        sb.append(", service=");
        sb.append(this.service);
        sb.append(", descriptions=");
        return ms9.a(')', sb, this.descriptions);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.user, i);
        parcel.writeInt(this.commonCount);
        AccountSearchContactsServiceDto accountSearchContactsServiceDto = this.service;
        if (accountSearchContactsServiceDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            accountSearchContactsServiceDto.writeToParcel(parcel, i);
        }
        parcel.writeStringList(this.descriptions);
    }

    public /* synthetic */ AccountSearchContactsFoundObjectDto(UsersUserFullDto usersUserFullDto, int i, AccountSearchContactsServiceDto accountSearchContactsServiceDto, List list, int i2, zcl zclVar) {
        this(usersUserFullDto, i, (i2 & 4) != 0 ? null : accountSearchContactsServiceDto, (i2 & 8) != 0 ? null : list);
    }
}
