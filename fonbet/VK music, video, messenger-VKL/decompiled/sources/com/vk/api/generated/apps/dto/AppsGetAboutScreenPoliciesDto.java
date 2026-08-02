package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AppsGetAboutScreenPoliciesDto.kt */
/* loaded from: classes14.dex */
public final class AppsGetAboutScreenPoliciesDto implements Parcelable {
    public static final Parcelable.Creator<AppsGetAboutScreenPoliciesDto> CREATOR = new a();

    @pmi0("privacy_policy")
    private final String privacyPolicy;

    @pmi0("terms")
    private final String terms;

    /* compiled from: AppsGetAboutScreenPoliciesDto.kt */
    public static final class a implements Parcelable.Creator<AppsGetAboutScreenPoliciesDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsGetAboutScreenPoliciesDto createFromParcel(Parcel parcel) {
            return new AppsGetAboutScreenPoliciesDto(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AppsGetAboutScreenPoliciesDto[] newArray(int i) {
            return new AppsGetAboutScreenPoliciesDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AppsGetAboutScreenPoliciesDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final String d() {
        return this.privacyPolicy;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.terms;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsGetAboutScreenPoliciesDto)) {
            return false;
        }
        AppsGetAboutScreenPoliciesDto appsGetAboutScreenPoliciesDto = (AppsGetAboutScreenPoliciesDto) obj;
        return epx.f(this.privacyPolicy, appsGetAboutScreenPoliciesDto.privacyPolicy) && epx.f(this.terms, appsGetAboutScreenPoliciesDto.terms);
    }

    public final int hashCode() {
        String str = this.privacyPolicy;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.terms;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppsGetAboutScreenPoliciesDto(privacyPolicy=");
        sb.append(this.privacyPolicy);
        sb.append(", terms=");
        return ho8.a(sb, this.terms, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.privacyPolicy);
        parcel.writeString(this.terms);
    }

    public AppsGetAboutScreenPoliciesDto(String str, String str2) {
        this.privacyPolicy = str;
        this.terms = str2;
    }

    public /* synthetic */ AppsGetAboutScreenPoliciesDto(String str, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
