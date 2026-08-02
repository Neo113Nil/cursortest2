package com.vk.api.generated.account.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.shy;
import xsna.zcl;

/* compiled from: AccountSearchContactsOtherObjectDto.kt */
/* loaded from: classes14.dex */
public final class AccountSearchContactsOtherObjectDto implements Parcelable {
    public static final Parcelable.Creator<AccountSearchContactsOtherObjectDto> CREATOR = new a();

    @pmi0("common_count")
    private final int commonCount;

    @pmi0("contact")
    private final String contact;

    @pmi0("invite_text")
    private final String inviteText;

    @pmi0("service")
    private final AccountSearchContactsServiceDto service;

    /* compiled from: AccountSearchContactsOtherObjectDto.kt */
    public static final class a implements Parcelable.Creator<AccountSearchContactsOtherObjectDto> {
        @Override // android.os.Parcelable.Creator
        public final AccountSearchContactsOtherObjectDto createFromParcel(Parcel parcel) {
            return new AccountSearchContactsOtherObjectDto(parcel.readString(), parcel.readInt(), parcel.readInt() == 0 ? null : AccountSearchContactsServiceDto.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AccountSearchContactsOtherObjectDto[] newArray(int i) {
            return new AccountSearchContactsOtherObjectDto[i];
        }
    }

    public AccountSearchContactsOtherObjectDto(String str, int i, AccountSearchContactsServiceDto accountSearchContactsServiceDto, String str2) {
        this.contact = str;
        this.commonCount = i;
        this.service = accountSearchContactsServiceDto;
        this.inviteText = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountSearchContactsOtherObjectDto)) {
            return false;
        }
        AccountSearchContactsOtherObjectDto accountSearchContactsOtherObjectDto = (AccountSearchContactsOtherObjectDto) obj;
        return epx.f(this.contact, accountSearchContactsOtherObjectDto.contact) && this.commonCount == accountSearchContactsOtherObjectDto.commonCount && this.service == accountSearchContactsOtherObjectDto.service && epx.f(this.inviteText, accountSearchContactsOtherObjectDto.inviteText);
    }

    public final int hashCode() {
        int a2 = shy.a(this.commonCount, this.contact.hashCode() * 31, 31);
        AccountSearchContactsServiceDto accountSearchContactsServiceDto = this.service;
        int hashCode = (a2 + (accountSearchContactsServiceDto == null ? 0 : accountSearchContactsServiceDto.hashCode())) * 31;
        String str = this.inviteText;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccountSearchContactsOtherObjectDto(contact=");
        sb.append(this.contact);
        sb.append(", commonCount=");
        sb.append(this.commonCount);
        sb.append(", service=");
        sb.append(this.service);
        sb.append(", inviteText=");
        return ho8.a(sb, this.inviteText, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.contact);
        parcel.writeInt(this.commonCount);
        AccountSearchContactsServiceDto accountSearchContactsServiceDto = this.service;
        if (accountSearchContactsServiceDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            accountSearchContactsServiceDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.inviteText);
    }

    public /* synthetic */ AccountSearchContactsOtherObjectDto(String str, int i, AccountSearchContactsServiceDto accountSearchContactsServiceDto, String str2, int i2, zcl zclVar) {
        this(str, i, (i2 & 4) != 0 ? null : accountSearchContactsServiceDto, (i2 & 8) != 0 ? null : str2);
    }
}
