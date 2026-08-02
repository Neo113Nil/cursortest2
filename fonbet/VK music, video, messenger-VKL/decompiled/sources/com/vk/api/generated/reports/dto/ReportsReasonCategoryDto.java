package com.vk.api.generated.reports.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.ho8;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: ReportsReasonCategoryDto.kt */
/* loaded from: classes15.dex */
public final class ReportsReasonCategoryDto implements Parcelable {
    public static final Parcelable.Creator<ReportsReasonCategoryDto> CREATOR = new a();

    @pmi0("breadcrumb_label")
    private final String breadcrumbLabel;

    @pmi0("comment_field")
    private final ReportsFormReasonCategoryCommentFieldDto commentField;

    @pmi0("description")
    private final String description;

    @pmi0("explanation")
    private final String explanation;

    @pmi0("id")
    private final String id;

    @pmi0("label")
    private final String label;

    @pmi0("more")
    private final String more;

    @pmi0("reasons")
    private final List<ReportsReasonDto> reasons;

    /* compiled from: ReportsReasonCategoryDto.kt */
    public static final class a implements Parcelable.Creator<ReportsReasonCategoryDto> {
        @Override // android.os.Parcelable.Creator
        public final ReportsReasonCategoryDto createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(ReportsReasonDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new ReportsReasonCategoryDto(readString, readString2, readString3, arrayList, parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : ReportsFormReasonCategoryCommentFieldDto.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ReportsReasonCategoryDto[] newArray(int i) {
            return new ReportsReasonCategoryDto[i];
        }
    }

    public ReportsReasonCategoryDto(String str, String str2, String str3, List<ReportsReasonDto> list, String str4, String str5, ReportsFormReasonCategoryCommentFieldDto reportsFormReasonCategoryCommentFieldDto, String str6) {
        this.label = str;
        this.explanation = str2;
        this.breadcrumbLabel = str3;
        this.reasons = list;
        this.description = str4;
        this.more = str5;
        this.commentField = reportsFormReasonCategoryCommentFieldDto;
        this.id = str6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReportsReasonCategoryDto)) {
            return false;
        }
        ReportsReasonCategoryDto reportsReasonCategoryDto = (ReportsReasonCategoryDto) obj;
        return epx.f(this.label, reportsReasonCategoryDto.label) && epx.f(this.explanation, reportsReasonCategoryDto.explanation) && epx.f(this.breadcrumbLabel, reportsReasonCategoryDto.breadcrumbLabel) && epx.f(this.reasons, reportsReasonCategoryDto.reasons) && epx.f(this.description, reportsReasonCategoryDto.description) && epx.f(this.more, reportsReasonCategoryDto.more) && epx.f(this.commentField, reportsReasonCategoryDto.commentField) && epx.f(this.id, reportsReasonCategoryDto.id);
    }

    public final int hashCode() {
        int a2 = fw3.a(urd0.a(urd0.a(this.label.hashCode() * 31, 31, this.explanation), 31, this.breadcrumbLabel), 31, this.reasons);
        String str = this.description;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.more;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        ReportsFormReasonCategoryCommentFieldDto reportsFormReasonCategoryCommentFieldDto = this.commentField;
        int hashCode3 = (hashCode2 + (reportsFormReasonCategoryCommentFieldDto == null ? 0 : reportsFormReasonCategoryCommentFieldDto.hashCode())) * 31;
        String str3 = this.id;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReportsReasonCategoryDto(label=");
        sb.append(this.label);
        sb.append(", explanation=");
        sb.append(this.explanation);
        sb.append(", breadcrumbLabel=");
        sb.append(this.breadcrumbLabel);
        sb.append(", reasons=");
        sb.append(this.reasons);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(", more=");
        sb.append(this.more);
        sb.append(", commentField=");
        sb.append(this.commentField);
        sb.append(", id=");
        return ho8.a(sb, this.id, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.label);
        parcel.writeString(this.explanation);
        parcel.writeString(this.breadcrumbLabel);
        Iterator a2 = ao.a(parcel, this.reasons);
        while (a2.hasNext()) {
            ((ReportsReasonDto) a2.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.description);
        parcel.writeString(this.more);
        ReportsFormReasonCategoryCommentFieldDto reportsFormReasonCategoryCommentFieldDto = this.commentField;
        if (reportsFormReasonCategoryCommentFieldDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            reportsFormReasonCategoryCommentFieldDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.id);
    }

    public /* synthetic */ ReportsReasonCategoryDto(String str, String str2, String str3, List list, String str4, String str5, ReportsFormReasonCategoryCommentFieldDto reportsFormReasonCategoryCommentFieldDto, String str6, int i, zcl zclVar) {
        this(str, str2, str3, list, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : reportsFormReasonCategoryCommentFieldDto, (i & 128) != 0 ? null : str6);
    }
}
