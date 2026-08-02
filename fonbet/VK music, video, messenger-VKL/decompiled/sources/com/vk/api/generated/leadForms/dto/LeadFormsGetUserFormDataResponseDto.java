package com.vk.api.generated.leadForms.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: LeadFormsGetUserFormDataResponseDto.kt */
/* loaded from: classes14.dex */
public final class LeadFormsGetUserFormDataResponseDto implements Parcelable {
    public static final Parcelable.Creator<LeadFormsGetUserFormDataResponseDto> CREATOR = new a();

    @pmi0("bdate")
    private final String bdate;

    @pmi0("city")
    private final String city;

    @pmi0("country")
    private final String country;

    @pmi0("email_hash")
    private final String emailHash;

    @pmi0("email_masked")
    private final String emailMasked;

    @pmi0("first_name")
    private final String firstName;

    @pmi0("last_name")
    private final String lastName;

    @pmi0("phone_hash")
    private final String phoneHash;

    @pmi0("phone_masked")
    private final String phoneMasked;

    /* compiled from: LeadFormsGetUserFormDataResponseDto.kt */
    public static final class a implements Parcelable.Creator<LeadFormsGetUserFormDataResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final LeadFormsGetUserFormDataResponseDto createFromParcel(Parcel parcel) {
            return new LeadFormsGetUserFormDataResponseDto(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final LeadFormsGetUserFormDataResponseDto[] newArray(int i) {
            return new LeadFormsGetUserFormDataResponseDto[i];
        }
    }

    public LeadFormsGetUserFormDataResponseDto() {
        this(null, null, null, null, null, null, null, null, null, ApiInvocationException.ErrorCodes.IDS_BLOCKED, null);
    }

    public final String d() {
        return this.emailHash;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.emailMasked;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LeadFormsGetUserFormDataResponseDto)) {
            return false;
        }
        LeadFormsGetUserFormDataResponseDto leadFormsGetUserFormDataResponseDto = (LeadFormsGetUserFormDataResponseDto) obj;
        return epx.f(this.phoneMasked, leadFormsGetUserFormDataResponseDto.phoneMasked) && epx.f(this.emailMasked, leadFormsGetUserFormDataResponseDto.emailMasked) && epx.f(this.phoneHash, leadFormsGetUserFormDataResponseDto.phoneHash) && epx.f(this.emailHash, leadFormsGetUserFormDataResponseDto.emailHash) && epx.f(this.firstName, leadFormsGetUserFormDataResponseDto.firstName) && epx.f(this.lastName, leadFormsGetUserFormDataResponseDto.lastName) && epx.f(this.city, leadFormsGetUserFormDataResponseDto.city) && epx.f(this.country, leadFormsGetUserFormDataResponseDto.country) && epx.f(this.bdate, leadFormsGetUserFormDataResponseDto.bdate);
    }

    public final String f() {
        return this.phoneHash;
    }

    public final String g() {
        return this.phoneMasked;
    }

    public final int hashCode() {
        String str = this.phoneMasked;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.emailMasked;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.phoneHash;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.emailHash;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.firstName;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.lastName;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.city;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.country;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.bdate;
        return hashCode8 + (str9 != null ? str9.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LeadFormsGetUserFormDataResponseDto(phoneMasked=");
        sb.append(this.phoneMasked);
        sb.append(", emailMasked=");
        sb.append(this.emailMasked);
        sb.append(", phoneHash=");
        sb.append(this.phoneHash);
        sb.append(", emailHash=");
        sb.append(this.emailHash);
        sb.append(", firstName=");
        sb.append(this.firstName);
        sb.append(", lastName=");
        sb.append(this.lastName);
        sb.append(", city=");
        sb.append(this.city);
        sb.append(", country=");
        sb.append(this.country);
        sb.append(", bdate=");
        return ho8.a(sb, this.bdate, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.phoneMasked);
        parcel.writeString(this.emailMasked);
        parcel.writeString(this.phoneHash);
        parcel.writeString(this.emailHash);
        parcel.writeString(this.firstName);
        parcel.writeString(this.lastName);
        parcel.writeString(this.city);
        parcel.writeString(this.country);
        parcel.writeString(this.bdate);
    }

    public LeadFormsGetUserFormDataResponseDto(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.phoneMasked = str;
        this.emailMasked = str2;
        this.phoneHash = str3;
        this.emailHash = str4;
        this.firstName = str5;
        this.lastName = str6;
        this.city = str7;
        this.country = str8;
        this.bdate = str9;
    }

    public /* synthetic */ LeadFormsGetUserFormDataResponseDto(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9);
    }
}
