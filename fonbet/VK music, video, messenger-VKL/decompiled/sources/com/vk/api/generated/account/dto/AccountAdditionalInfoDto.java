package com.vk.api.generated.account.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AccountAdditionalInfoDto.kt */
/* loaded from: classes14.dex */
public final class AccountAdditionalInfoDto implements Parcelable {
    public static final Parcelable.Creator<AccountAdditionalInfoDto> CREATOR = new a();

    @pmi0("text")
    private final String text;

    /* compiled from: AccountAdditionalInfoDto.kt */
    public static final class a implements Parcelable.Creator<AccountAdditionalInfoDto> {
        @Override // android.os.Parcelable.Creator
        public final AccountAdditionalInfoDto createFromParcel(Parcel parcel) {
            return new AccountAdditionalInfoDto(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AccountAdditionalInfoDto[] newArray(int i) {
            return new AccountAdditionalInfoDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AccountAdditionalInfoDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AccountAdditionalInfoDto) && epx.f(this.text, ((AccountAdditionalInfoDto) obj).text);
    }

    public final int hashCode() {
        String str = this.text;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("AccountAdditionalInfoDto(text="), this.text, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.text);
    }

    public AccountAdditionalInfoDto(String str) {
        this.text = str;
    }

    public /* synthetic */ AccountAdditionalInfoDto(String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str);
    }
}
