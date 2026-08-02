package com.vk.api.generated.education.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: EducationGetGradesSourceDto.kt */
/* loaded from: classes14.dex */
public final class EducationGetGradesSourceDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ EducationGetGradesSourceDto[] $VALUES;
    public static final Parcelable.Creator<EducationGetGradesSourceDto> CREATOR;

    @pmi0("ejd")
    public static final EducationGetGradesSourceDto EJD;

    @pmi0("sferum")
    public static final EducationGetGradesSourceDto SFERUM;
    private final String value;

    /* compiled from: EducationGetGradesSourceDto.kt */
    public static final class a implements Parcelable.Creator<EducationGetGradesSourceDto> {
        @Override // android.os.Parcelable.Creator
        public final EducationGetGradesSourceDto createFromParcel(Parcel parcel) {
            return EducationGetGradesSourceDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final EducationGetGradesSourceDto[] newArray(int i) {
            return new EducationGetGradesSourceDto[i];
        }
    }

    static {
        EducationGetGradesSourceDto educationGetGradesSourceDto = new EducationGetGradesSourceDto("EJD", 0, "ejd");
        EJD = educationGetGradesSourceDto;
        EducationGetGradesSourceDto educationGetGradesSourceDto2 = new EducationGetGradesSourceDto("SFERUM", 1, "sferum");
        SFERUM = educationGetGradesSourceDto2;
        EducationGetGradesSourceDto[] educationGetGradesSourceDtoArr = {educationGetGradesSourceDto, educationGetGradesSourceDto2};
        $VALUES = educationGetGradesSourceDtoArr;
        $ENTRIES = new asp(educationGetGradesSourceDtoArr);
        CREATOR = new a();
    }

    private EducationGetGradesSourceDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static EducationGetGradesSourceDto valueOf(String str) {
        return (EducationGetGradesSourceDto) Enum.valueOf(EducationGetGradesSourceDto.class, str);
    }

    public static EducationGetGradesSourceDto[] values() {
        return (EducationGetGradesSourceDto[]) $VALUES.clone();
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
