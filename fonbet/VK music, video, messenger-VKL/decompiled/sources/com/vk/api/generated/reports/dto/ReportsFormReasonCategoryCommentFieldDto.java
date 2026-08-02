package com.vk.api.generated.reports.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.sn;
import xsna.zcl;

/* compiled from: ReportsFormReasonCategoryCommentFieldDto.kt */
/* loaded from: classes15.dex */
public final class ReportsFormReasonCategoryCommentFieldDto implements Parcelable {
    public static final Parcelable.Creator<ReportsFormReasonCategoryCommentFieldDto> CREATOR = new a();

    @pmi0("description")
    private final String description;

    @pmi0("is_multiline")
    private final Boolean isMultiline;

    @pmi0("is_required")
    private final Boolean isRequired;

    @pmi0("label")
    private final String label;

    @pmi0("placeholder")
    private final String placeholder;

    /* compiled from: ReportsFormReasonCategoryCommentFieldDto.kt */
    public static final class a implements Parcelable.Creator<ReportsFormReasonCategoryCommentFieldDto> {
        @Override // android.os.Parcelable.Creator
        public final ReportsFormReasonCategoryCommentFieldDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            String readString = parcel.readString();
            Boolean bool = null;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new ReportsFormReasonCategoryCommentFieldDto(readString, valueOf, bool, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ReportsFormReasonCategoryCommentFieldDto[] newArray(int i) {
            return new ReportsFormReasonCategoryCommentFieldDto[i];
        }
    }

    public ReportsFormReasonCategoryCommentFieldDto(String str, Boolean bool, Boolean bool2, String str2, String str3) {
        this.placeholder = str;
        this.isMultiline = bool;
        this.isRequired = bool2;
        this.label = str2;
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
        if (!(obj instanceof ReportsFormReasonCategoryCommentFieldDto)) {
            return false;
        }
        ReportsFormReasonCategoryCommentFieldDto reportsFormReasonCategoryCommentFieldDto = (ReportsFormReasonCategoryCommentFieldDto) obj;
        return epx.f(this.placeholder, reportsFormReasonCategoryCommentFieldDto.placeholder) && epx.f(this.isMultiline, reportsFormReasonCategoryCommentFieldDto.isMultiline) && epx.f(this.isRequired, reportsFormReasonCategoryCommentFieldDto.isRequired) && epx.f(this.label, reportsFormReasonCategoryCommentFieldDto.label) && epx.f(this.description, reportsFormReasonCategoryCommentFieldDto.description);
    }

    public final int hashCode() {
        int hashCode = this.placeholder.hashCode() * 31;
        Boolean bool = this.isMultiline;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isRequired;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str = this.label;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.description;
        return hashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReportsFormReasonCategoryCommentFieldDto(placeholder=");
        sb.append(this.placeholder);
        sb.append(", isMultiline=");
        sb.append(this.isMultiline);
        sb.append(", isRequired=");
        sb.append(this.isRequired);
        sb.append(", label=");
        sb.append(this.label);
        sb.append(", description=");
        return ho8.a(sb, this.description, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.placeholder);
        Boolean bool = this.isMultiline;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Boolean bool2 = this.isRequired;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        parcel.writeString(this.label);
        parcel.writeString(this.description);
    }

    public /* synthetic */ ReportsFormReasonCategoryCommentFieldDto(String str, Boolean bool, Boolean bool2, String str2, String str3, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : bool2, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3);
    }
}
