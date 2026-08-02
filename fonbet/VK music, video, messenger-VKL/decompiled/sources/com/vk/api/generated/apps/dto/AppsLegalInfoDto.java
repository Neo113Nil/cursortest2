package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AppsLegalInfoDto.kt */
/* loaded from: classes14.dex */
public final class AppsLegalInfoDto implements Parcelable {
    public static final Parcelable.Creator<AppsLegalInfoDto> CREATOR = new a();

    @pmi0("company_name")
    private final String companyName;

    @pmi0("inn")
    private final String inn;

    @pmi0("legal_address")
    private final String legalAddress;

    @pmi0("policies")
    private final AppsGetAboutScreenPoliciesDto policies;

    @pmi0("support_text")
    private final String supportText;

    /* compiled from: AppsLegalInfoDto.kt */
    public static final class a implements Parcelable.Creator<AppsLegalInfoDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsLegalInfoDto createFromParcel(Parcel parcel) {
            return new AppsLegalInfoDto(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : AppsGetAboutScreenPoliciesDto.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AppsLegalInfoDto[] newArray(int i) {
            return new AppsLegalInfoDto[i];
        }
    }

    public AppsLegalInfoDto() {
        this(null, null, null, null, null, 31, null);
    }

    public final String d() {
        return this.companyName;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.inn;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsLegalInfoDto)) {
            return false;
        }
        AppsLegalInfoDto appsLegalInfoDto = (AppsLegalInfoDto) obj;
        return epx.f(this.companyName, appsLegalInfoDto.companyName) && epx.f(this.legalAddress, appsLegalInfoDto.legalAddress) && epx.f(this.policies, appsLegalInfoDto.policies) && epx.f(this.inn, appsLegalInfoDto.inn) && epx.f(this.supportText, appsLegalInfoDto.supportText);
    }

    public final String f() {
        return this.legalAddress;
    }

    public final AppsGetAboutScreenPoliciesDto g() {
        return this.policies;
    }

    public final int hashCode() {
        String str = this.companyName;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.legalAddress;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        AppsGetAboutScreenPoliciesDto appsGetAboutScreenPoliciesDto = this.policies;
        int hashCode3 = (hashCode2 + (appsGetAboutScreenPoliciesDto == null ? 0 : appsGetAboutScreenPoliciesDto.hashCode())) * 31;
        String str3 = this.inn;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.supportText;
        return hashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String i() {
        return this.supportText;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppsLegalInfoDto(companyName=");
        sb.append(this.companyName);
        sb.append(", legalAddress=");
        sb.append(this.legalAddress);
        sb.append(", policies=");
        sb.append(this.policies);
        sb.append(", inn=");
        sb.append(this.inn);
        sb.append(", supportText=");
        return ho8.a(sb, this.supportText, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.companyName);
        parcel.writeString(this.legalAddress);
        AppsGetAboutScreenPoliciesDto appsGetAboutScreenPoliciesDto = this.policies;
        if (appsGetAboutScreenPoliciesDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            appsGetAboutScreenPoliciesDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.inn);
        parcel.writeString(this.supportText);
    }

    public AppsLegalInfoDto(String str, String str2, AppsGetAboutScreenPoliciesDto appsGetAboutScreenPoliciesDto, String str3, String str4) {
        this.companyName = str;
        this.legalAddress = str2;
        this.policies = appsGetAboutScreenPoliciesDto;
        this.inn = str3;
        this.supportText = str4;
    }

    public /* synthetic */ AppsLegalInfoDto(String str, String str2, AppsGetAboutScreenPoliciesDto appsGetAboutScreenPoliciesDto, String str3, String str4, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : appsGetAboutScreenPoliciesDto, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4);
    }
}
