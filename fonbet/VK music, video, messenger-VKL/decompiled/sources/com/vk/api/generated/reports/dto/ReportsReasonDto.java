package com.vk.api.generated.reports.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.urd0;
import xsna.zcl;

/* compiled from: ReportsReasonDto.kt */
/* loaded from: classes15.dex */
public final class ReportsReasonDto implements Parcelable {
    public static final Parcelable.Creator<ReportsReasonDto> CREATOR = new a();

    @pmi0("description")
    private final String description;

    @pmi0("id")
    private final int id;

    @pmi0("label")
    private final String label;

    @pmi0("redirect_url")
    private final String redirectUrl;

    @pmi0("show_profile_report_advice")
    private final Boolean showProfileReportAdvice;

    @pmi0("show_silent_mode")
    private final Boolean showSilentMode;

    /* compiled from: ReportsReasonDto.kt */
    public static final class a implements Parcelable.Creator<ReportsReasonDto> {
        @Override // android.os.Parcelable.Creator
        public final ReportsReasonDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            int readInt = parcel.readInt();
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            Boolean bool = null;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new ReportsReasonDto(readInt, readString, readString2, readString3, valueOf, bool);
        }

        @Override // android.os.Parcelable.Creator
        public final ReportsReasonDto[] newArray(int i) {
            return new ReportsReasonDto[i];
        }
    }

    public ReportsReasonDto(int i, String str, String str2, String str3, Boolean bool, Boolean bool2) {
        this.id = i;
        this.label = str;
        this.description = str2;
        this.redirectUrl = str3;
        this.showSilentMode = bool;
        this.showProfileReportAdvice = bool2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReportsReasonDto)) {
            return false;
        }
        ReportsReasonDto reportsReasonDto = (ReportsReasonDto) obj;
        return this.id == reportsReasonDto.id && epx.f(this.label, reportsReasonDto.label) && epx.f(this.description, reportsReasonDto.description) && epx.f(this.redirectUrl, reportsReasonDto.redirectUrl) && epx.f(this.showSilentMode, reportsReasonDto.showSilentMode) && epx.f(this.showProfileReportAdvice, reportsReasonDto.showProfileReportAdvice);
    }

    public final int hashCode() {
        int a2 = urd0.a(Integer.hashCode(this.id) * 31, 31, this.label);
        String str = this.description;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.redirectUrl;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.showSilentMode;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.showProfileReportAdvice;
        return hashCode3 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReportsReasonDto(id=");
        sb.append(this.id);
        sb.append(", label=");
        sb.append(this.label);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(", redirectUrl=");
        sb.append(this.redirectUrl);
        sb.append(", showSilentMode=");
        sb.append(this.showSilentMode);
        sb.append(", showProfileReportAdvice=");
        return tn.a(sb, this.showProfileReportAdvice, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeString(this.label);
        parcel.writeString(this.description);
        parcel.writeString(this.redirectUrl);
        Boolean bool = this.showSilentMode;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Boolean bool2 = this.showProfileReportAdvice;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
    }

    public /* synthetic */ ReportsReasonDto(int i, String str, String str2, String str3, Boolean bool, Boolean bool2, int i2, zcl zclVar) {
        this(i, str, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : str3, (i2 & 16) != 0 ? null : bool, (i2 & 32) != 0 ? null : bool2);
    }
}
