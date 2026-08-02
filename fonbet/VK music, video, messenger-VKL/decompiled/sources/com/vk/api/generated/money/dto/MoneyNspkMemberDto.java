package com.vk.api.generated.money.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.urd0;

/* compiled from: MoneyNspkMemberDto.kt */
/* loaded from: classes15.dex */
public final class MoneyNspkMemberDto implements Parcelable {
    public static final Parcelable.Creator<MoneyNspkMemberDto> CREATOR = new a();

    @pmi0("bank_id")
    private final String bankId;

    @pmi0("bank_name")
    private final String bankName;

    @pmi0("package_name")
    private final String packageName;

    @pmi0("schema")
    private final String schema;

    /* compiled from: MoneyNspkMemberDto.kt */
    public static final class a implements Parcelable.Creator<MoneyNspkMemberDto> {
        @Override // android.os.Parcelable.Creator
        public final MoneyNspkMemberDto createFromParcel(Parcel parcel) {
            return new MoneyNspkMemberDto(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MoneyNspkMemberDto[] newArray(int i) {
            return new MoneyNspkMemberDto[i];
        }
    }

    public MoneyNspkMemberDto(String str, String str2, String str3, String str4) {
        this.bankName = str;
        this.schema = str2;
        this.packageName = str3;
        this.bankId = str4;
    }

    public final String d() {
        return this.bankId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.schema;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MoneyNspkMemberDto)) {
            return false;
        }
        MoneyNspkMemberDto moneyNspkMemberDto = (MoneyNspkMemberDto) obj;
        return epx.f(this.bankName, moneyNspkMemberDto.bankName) && epx.f(this.schema, moneyNspkMemberDto.schema) && epx.f(this.packageName, moneyNspkMemberDto.packageName) && epx.f(this.bankId, moneyNspkMemberDto.bankId);
    }

    public final int hashCode() {
        return this.bankId.hashCode() + urd0.a(urd0.a(this.bankName.hashCode() * 31, 31, this.schema), 31, this.packageName);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MoneyNspkMemberDto(bankName=");
        sb.append(this.bankName);
        sb.append(", schema=");
        sb.append(this.schema);
        sb.append(", packageName=");
        sb.append(this.packageName);
        sb.append(", bankId=");
        return ho8.a(sb, this.bankId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.bankName);
        parcel.writeString(this.schema);
        parcel.writeString(this.packageName);
        parcel.writeString(this.bankId);
    }
}
