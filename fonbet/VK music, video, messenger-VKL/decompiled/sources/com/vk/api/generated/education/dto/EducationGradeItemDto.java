package com.vk.api.generated.education.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.qoy;
import xsna.shy;
import xsna.urd0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: EducationGradeItemDto.kt */
/* loaded from: classes14.dex */
public final class EducationGradeItemDto implements Parcelable {
    public static final Parcelable.Creator<EducationGradeItemDto> CREATOR = new a();

    @pmi0("class_teacher")
    private final EducationGradeMemberItemDto classTeacher;

    @pmi0("color")
    private final int color;

    @pmi0("end_year")
    private final int endYear;

    @pmi0("id")
    private final int id;

    @pmi0("is_graduated")
    private final boolean isGraduated;

    @pmi0("liter")
    private final String liter;

    @pmi0("name")
    private final String name;

    @pmi0("number")
    private final int number;

    @pmi0("source")
    private final SourceDto source;

    @pmi0("start_year")
    private final Integer startYear;

    @pmi0("title")
    private final String title;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: EducationGradeItemDto.kt */
    public static final class SourceDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ SourceDto[] $VALUES;
        public static final Parcelable.Creator<SourceDto> CREATOR;

        @pmi0("ejd")
        public static final SourceDto EJD;

        @pmi0("sferum")
        public static final SourceDto SFERUM;
        private final String value;

        /* compiled from: EducationGradeItemDto.kt */
        public static final class a implements Parcelable.Creator<SourceDto> {
            @Override // android.os.Parcelable.Creator
            public final SourceDto createFromParcel(Parcel parcel) {
                return SourceDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final SourceDto[] newArray(int i) {
                return new SourceDto[i];
            }
        }

        static {
            SourceDto sourceDto = new SourceDto("SFERUM", 0, "sferum");
            SFERUM = sourceDto;
            SourceDto sourceDto2 = new SourceDto("EJD", 1, "ejd");
            EJD = sourceDto2;
            SourceDto[] sourceDtoArr = {sourceDto, sourceDto2};
            $VALUES = sourceDtoArr;
            $ENTRIES = new asp(sourceDtoArr);
            CREATOR = new a();
        }

        private SourceDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static SourceDto valueOf(String str) {
            return (SourceDto) Enum.valueOf(SourceDto.class, str);
        }

        public static SourceDto[] values() {
            return (SourceDto[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* compiled from: EducationGradeItemDto.kt */
    public static final class a implements Parcelable.Creator<EducationGradeItemDto> {
        @Override // android.os.Parcelable.Creator
        public final EducationGradeItemDto createFromParcel(Parcel parcel) {
            return new EducationGradeItemDto(parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : SourceDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? EducationGradeMemberItemDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final EducationGradeItemDto[] newArray(int i) {
            return new EducationGradeItemDto[i];
        }
    }

    public EducationGradeItemDto(int i, int i2, String str, int i3, int i4, boolean z, String str2, String str3, Integer num, SourceDto sourceDto, EducationGradeMemberItemDto educationGradeMemberItemDto) {
        this.id = i;
        this.number = i2;
        this.title = str;
        this.color = i3;
        this.endYear = i4;
        this.isGraduated = z;
        this.liter = str2;
        this.name = str3;
        this.startYear = num;
        this.source = sourceDto;
        this.classTeacher = educationGradeMemberItemDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EducationGradeItemDto)) {
            return false;
        }
        EducationGradeItemDto educationGradeItemDto = (EducationGradeItemDto) obj;
        return this.id == educationGradeItemDto.id && this.number == educationGradeItemDto.number && epx.f(this.title, educationGradeItemDto.title) && this.color == educationGradeItemDto.color && this.endYear == educationGradeItemDto.endYear && this.isGraduated == educationGradeItemDto.isGraduated && epx.f(this.liter, educationGradeItemDto.liter) && epx.f(this.name, educationGradeItemDto.name) && epx.f(this.startYear, educationGradeItemDto.startYear) && this.source == educationGradeItemDto.source && epx.f(this.classTeacher, educationGradeItemDto.classTeacher);
    }

    public final int hashCode() {
        int b = qoy.b(shy.a(this.endYear, shy.a(this.color, urd0.a(shy.a(this.number, Integer.hashCode(this.id) * 31, 31), 31, this.title), 31), 31), 31, this.isGraduated);
        String str = this.liter;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.name;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.startYear;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        SourceDto sourceDto = this.source;
        int hashCode4 = (hashCode3 + (sourceDto == null ? 0 : sourceDto.hashCode())) * 31;
        EducationGradeMemberItemDto educationGradeMemberItemDto = this.classTeacher;
        return hashCode4 + (educationGradeMemberItemDto != null ? educationGradeMemberItemDto.hashCode() : 0);
    }

    public final String toString() {
        return "EducationGradeItemDto(id=" + this.id + ", number=" + this.number + ", title=" + this.title + ", color=" + this.color + ", endYear=" + this.endYear + ", isGraduated=" + this.isGraduated + ", liter=" + this.liter + ", name=" + this.name + ", startYear=" + this.startYear + ", source=" + this.source + ", classTeacher=" + this.classTeacher + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeInt(this.number);
        parcel.writeString(this.title);
        parcel.writeInt(this.color);
        parcel.writeInt(this.endYear);
        parcel.writeInt(this.isGraduated ? 1 : 0);
        parcel.writeString(this.liter);
        parcel.writeString(this.name);
        Integer num = this.startYear;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        SourceDto sourceDto = this.source;
        if (sourceDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            sourceDto.writeToParcel(parcel, i);
        }
        EducationGradeMemberItemDto educationGradeMemberItemDto = this.classTeacher;
        if (educationGradeMemberItemDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            educationGradeMemberItemDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ EducationGradeItemDto(int i, int i2, String str, int i3, int i4, boolean z, String str2, String str3, Integer num, SourceDto sourceDto, EducationGradeMemberItemDto educationGradeMemberItemDto, int i5, zcl zclVar) {
        this(i, i2, str, i3, i4, z, (i5 & 64) != 0 ? null : str2, (i5 & 128) != 0 ? null : str3, (i5 & 256) != 0 ? null : num, (i5 & 512) != 0 ? null : sourceDto, (i5 & 1024) != 0 ? null : educationGradeMemberItemDto);
    }
}
