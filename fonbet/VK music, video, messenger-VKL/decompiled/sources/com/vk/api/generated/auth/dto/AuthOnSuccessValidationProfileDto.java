package com.vk.api.generated.auth.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.shy;
import xsna.urd0;
import xsna.zcl;

/* compiled from: AuthOnSuccessValidationProfileDto.kt */
/* loaded from: classes14.dex */
public final class AuthOnSuccessValidationProfileDto implements Parcelable {
    public static final Parcelable.Creator<AuthOnSuccessValidationProfileDto> CREATOR = new a();

    @pmi0("created_at")
    private final int createdAt;

    @pmi0("created_date")
    private final String createdDate;

    @pmi0("first_name")
    private final String firstName;

    @pmi0("last_name")
    private final String lastName;

    @pmi0("phone")
    private final String phone;

    @pmi0("photo_href")
    private final String photoHref;

    @pmi0("status")
    private final String status;

    /* compiled from: AuthOnSuccessValidationProfileDto.kt */
    public static final class a implements Parcelable.Creator<AuthOnSuccessValidationProfileDto> {
        @Override // android.os.Parcelable.Creator
        public final AuthOnSuccessValidationProfileDto createFromParcel(Parcel parcel) {
            return new AuthOnSuccessValidationProfileDto(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AuthOnSuccessValidationProfileDto[] newArray(int i) {
            return new AuthOnSuccessValidationProfileDto[i];
        }
    }

    public AuthOnSuccessValidationProfileDto(String str, String str2, String str3, String str4, int i, String str5, String str6) {
        this.firstName = str;
        this.lastName = str2;
        this.photoHref = str3;
        this.createdDate = str4;
        this.createdAt = i;
        this.phone = str5;
        this.status = str6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthOnSuccessValidationProfileDto)) {
            return false;
        }
        AuthOnSuccessValidationProfileDto authOnSuccessValidationProfileDto = (AuthOnSuccessValidationProfileDto) obj;
        return epx.f(this.firstName, authOnSuccessValidationProfileDto.firstName) && epx.f(this.lastName, authOnSuccessValidationProfileDto.lastName) && epx.f(this.photoHref, authOnSuccessValidationProfileDto.photoHref) && epx.f(this.createdDate, authOnSuccessValidationProfileDto.createdDate) && this.createdAt == authOnSuccessValidationProfileDto.createdAt && epx.f(this.phone, authOnSuccessValidationProfileDto.phone) && epx.f(this.status, authOnSuccessValidationProfileDto.status);
    }

    public final int hashCode() {
        int a2 = urd0.a(shy.a(this.createdAt, urd0.a(urd0.a(urd0.a(this.firstName.hashCode() * 31, 31, this.lastName), 31, this.photoHref), 31, this.createdDate), 31), 31, this.phone);
        String str = this.status;
        return a2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthOnSuccessValidationProfileDto(firstName=");
        sb.append(this.firstName);
        sb.append(", lastName=");
        sb.append(this.lastName);
        sb.append(", photoHref=");
        sb.append(this.photoHref);
        sb.append(", createdDate=");
        sb.append(this.createdDate);
        sb.append(", createdAt=");
        sb.append(this.createdAt);
        sb.append(", phone=");
        sb.append(this.phone);
        sb.append(", status=");
        return ho8.a(sb, this.status, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.firstName);
        parcel.writeString(this.lastName);
        parcel.writeString(this.photoHref);
        parcel.writeString(this.createdDate);
        parcel.writeInt(this.createdAt);
        parcel.writeString(this.phone);
        parcel.writeString(this.status);
    }

    public /* synthetic */ AuthOnSuccessValidationProfileDto(String str, String str2, String str3, String str4, int i, String str5, String str6, int i2, zcl zclVar) {
        this(str, str2, str3, str4, i, str5, (i2 & 64) != 0 ? null : str6);
    }
}
