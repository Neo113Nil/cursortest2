package com.vk.api.generated.account.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: AccountPrivacySectionDto.kt */
/* loaded from: classes14.dex */
public final class AccountPrivacySectionDto implements Parcelable {
    public static final Parcelable.Creator<AccountPrivacySectionDto> CREATOR = new a();

    @pmi0("description")
    private final String description;

    @pmi0("name")
    private final String name;

    @pmi0("title")
    private final String title;

    /* compiled from: AccountPrivacySectionDto.kt */
    public static final class a implements Parcelable.Creator<AccountPrivacySectionDto> {
        @Override // android.os.Parcelable.Creator
        public final AccountPrivacySectionDto createFromParcel(Parcel parcel) {
            return new AccountPrivacySectionDto(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AccountPrivacySectionDto[] newArray(int i) {
            return new AccountPrivacySectionDto[i];
        }
    }

    public AccountPrivacySectionDto(String str, String str2, String str3) {
        this.name = str;
        this.title = str2;
        this.description = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountPrivacySectionDto)) {
            return false;
        }
        AccountPrivacySectionDto accountPrivacySectionDto = (AccountPrivacySectionDto) obj;
        return epx.f(this.name, accountPrivacySectionDto.name) && epx.f(this.title, accountPrivacySectionDto.title) && epx.f(this.description, accountPrivacySectionDto.description);
    }

    public final int hashCode() {
        int a2 = urd0.a(this.name.hashCode() * 31, 31, this.title);
        String str = this.description;
        return a2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccountPrivacySectionDto(name=");
        sb.append(this.name);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", description=");
        return ho8.a(sb, this.description, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.name);
        parcel.writeString(this.title);
        parcel.writeString(this.description);
    }

    public /* synthetic */ AccountPrivacySectionDto(String str, String str2, String str3, int i, zcl zclVar) {
        this(str, str2, (i & 4) != 0 ? null : str3);
    }
}
