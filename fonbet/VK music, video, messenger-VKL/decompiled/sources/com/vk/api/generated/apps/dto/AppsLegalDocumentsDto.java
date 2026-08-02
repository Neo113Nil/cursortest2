package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AppsLegalDocumentsDto.kt */
/* loaded from: classes14.dex */
public final class AppsLegalDocumentsDto implements Parcelable {
    public static final Parcelable.Creator<AppsLegalDocumentsDto> CREATOR = new a();

    @pmi0("policy_link")
    private final String policyLink;

    @pmi0("policy_link_text")
    private final String policyLinkText;

    @pmi0("terms_link")
    private final String termsLink;

    @pmi0("terms_link_text")
    private final String termsLinkText;

    /* compiled from: AppsLegalDocumentsDto.kt */
    public static final class a implements Parcelable.Creator<AppsLegalDocumentsDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsLegalDocumentsDto createFromParcel(Parcel parcel) {
            return new AppsLegalDocumentsDto(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AppsLegalDocumentsDto[] newArray(int i) {
            return new AppsLegalDocumentsDto[i];
        }
    }

    public AppsLegalDocumentsDto() {
        this(null, null, null, null, 15, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsLegalDocumentsDto)) {
            return false;
        }
        AppsLegalDocumentsDto appsLegalDocumentsDto = (AppsLegalDocumentsDto) obj;
        return epx.f(this.policyLink, appsLegalDocumentsDto.policyLink) && epx.f(this.policyLinkText, appsLegalDocumentsDto.policyLinkText) && epx.f(this.termsLink, appsLegalDocumentsDto.termsLink) && epx.f(this.termsLinkText, appsLegalDocumentsDto.termsLinkText);
    }

    public final int hashCode() {
        String str = this.policyLink;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.policyLinkText;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.termsLink;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.termsLinkText;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppsLegalDocumentsDto(policyLink=");
        sb.append(this.policyLink);
        sb.append(", policyLinkText=");
        sb.append(this.policyLinkText);
        sb.append(", termsLink=");
        sb.append(this.termsLink);
        sb.append(", termsLinkText=");
        return ho8.a(sb, this.termsLinkText, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.policyLink);
        parcel.writeString(this.policyLinkText);
        parcel.writeString(this.termsLink);
        parcel.writeString(this.termsLinkText);
    }

    public AppsLegalDocumentsDto(String str, String str2, String str3, String str4) {
        this.policyLink = str;
        this.policyLinkText = str2;
        this.termsLink = str3;
        this.termsLinkText = str4;
    }

    public /* synthetic */ AppsLegalDocumentsDto(String str, String str2, String str3, String str4, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }
}
