package com.vk.api.generated.education.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: EducationGetGradesRelationTypeDto.kt */
/* loaded from: classes14.dex */
public final class EducationGetGradesRelationTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ EducationGetGradesRelationTypeDto[] $VALUES;

    @pmi0("class_teacher")
    public static final EducationGetGradesRelationTypeDto CLASS_TEACHER;
    public static final Parcelable.Creator<EducationGetGradesRelationTypeDto> CREATOR;
    private final String value;

    /* compiled from: EducationGetGradesRelationTypeDto.kt */
    public static final class a implements Parcelable.Creator<EducationGetGradesRelationTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final EducationGetGradesRelationTypeDto createFromParcel(Parcel parcel) {
            return EducationGetGradesRelationTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final EducationGetGradesRelationTypeDto[] newArray(int i) {
            return new EducationGetGradesRelationTypeDto[i];
        }
    }

    static {
        EducationGetGradesRelationTypeDto educationGetGradesRelationTypeDto = new EducationGetGradesRelationTypeDto("CLASS_TEACHER", 0, "class_teacher");
        CLASS_TEACHER = educationGetGradesRelationTypeDto;
        EducationGetGradesRelationTypeDto[] educationGetGradesRelationTypeDtoArr = {educationGetGradesRelationTypeDto};
        $VALUES = educationGetGradesRelationTypeDtoArr;
        $ENTRIES = new asp(educationGetGradesRelationTypeDtoArr);
        CREATOR = new a();
    }

    private EducationGetGradesRelationTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static EducationGetGradesRelationTypeDto valueOf(String str) {
        return (EducationGetGradesRelationTypeDto) Enum.valueOf(EducationGetGradesRelationTypeDto.class, str);
    }

    public static EducationGetGradesRelationTypeDto[] values() {
        return (EducationGetGradesRelationTypeDto[]) $VALUES.clone();
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
