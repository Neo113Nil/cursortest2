package com.vk.api.generated.education.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.pmi0;
import xsna.shy;
import xsna.vu5;

/* compiled from: EducationClassInfoDto.kt */
/* loaded from: classes14.dex */
public final class EducationClassInfoDto implements Parcelable {
    public static final Parcelable.Creator<EducationClassInfoDto> CREATOR = new a();

    @pmi0("grade_id")
    private final int gradeId;

    @pmi0("school_id")
    private final int schoolId;

    @pmi0("teacher_id")
    private final int teacherId;

    /* compiled from: EducationClassInfoDto.kt */
    public static final class a implements Parcelable.Creator<EducationClassInfoDto> {
        @Override // android.os.Parcelable.Creator
        public final EducationClassInfoDto createFromParcel(Parcel parcel) {
            return new EducationClassInfoDto(parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final EducationClassInfoDto[] newArray(int i) {
            return new EducationClassInfoDto[i];
        }
    }

    public EducationClassInfoDto(int i, int i2, int i3) {
        this.schoolId = i;
        this.gradeId = i2;
        this.teacherId = i3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EducationClassInfoDto)) {
            return false;
        }
        EducationClassInfoDto educationClassInfoDto = (EducationClassInfoDto) obj;
        return this.schoolId == educationClassInfoDto.schoolId && this.gradeId == educationClassInfoDto.gradeId && this.teacherId == educationClassInfoDto.teacherId;
    }

    public final int hashCode() {
        return Integer.hashCode(this.teacherId) + shy.a(this.gradeId, Integer.hashCode(this.schoolId) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EducationClassInfoDto(schoolId=");
        sb.append(this.schoolId);
        sb.append(", gradeId=");
        sb.append(this.gradeId);
        sb.append(", teacherId=");
        return vu5.b(sb, this.teacherId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.schoolId);
        parcel.writeInt(this.gradeId);
        parcel.writeInt(this.teacherId);
    }
}
