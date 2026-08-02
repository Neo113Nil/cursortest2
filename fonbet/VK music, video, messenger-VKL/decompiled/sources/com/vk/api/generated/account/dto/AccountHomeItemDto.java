package com.vk.api.generated.account.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AccountHomeItemDto.kt */
/* loaded from: classes14.dex */
public final class AccountHomeItemDto implements Parcelable {
    public static final Parcelable.Creator<AccountHomeItemDto> CREATOR = new a();

    @pmi0("id")
    private final int id;

    @pmi0("title")
    private final String title;

    /* compiled from: AccountHomeItemDto.kt */
    public static final class a implements Parcelable.Creator<AccountHomeItemDto> {
        @Override // android.os.Parcelable.Creator
        public final AccountHomeItemDto createFromParcel(Parcel parcel) {
            return new AccountHomeItemDto(parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AccountHomeItemDto[] newArray(int i) {
            return new AccountHomeItemDto[i];
        }
    }

    public AccountHomeItemDto(int i, String str) {
        this.id = i;
        this.title = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountHomeItemDto)) {
            return false;
        }
        AccountHomeItemDto accountHomeItemDto = (AccountHomeItemDto) obj;
        return this.id == accountHomeItemDto.id && epx.f(this.title, accountHomeItemDto.title);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.id) * 31;
        String str = this.title;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccountHomeItemDto(id=");
        sb.append(this.id);
        sb.append(", title=");
        return ho8.a(sb, this.title, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeString(this.title);
    }

    public /* synthetic */ AccountHomeItemDto(int i, String str, int i2, zcl zclVar) {
        this(i, (i2 & 2) != 0 ? null : str);
    }
}
