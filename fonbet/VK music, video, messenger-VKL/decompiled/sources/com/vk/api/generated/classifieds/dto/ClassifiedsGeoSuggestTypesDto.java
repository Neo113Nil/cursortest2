package com.vk.api.generated.classifieds.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ClassifiedsGeoSuggestTypesDto.kt */
/* loaded from: classes14.dex */
public final class ClassifiedsGeoSuggestTypesDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ClassifiedsGeoSuggestTypesDto[] $VALUES;

    @pmi0("city")
    public static final ClassifiedsGeoSuggestTypesDto CITY;
    public static final Parcelable.Creator<ClassifiedsGeoSuggestTypesDto> CREATOR;

    @pmi0("hamlet")
    public static final ClassifiedsGeoSuggestTypesDto HAMLET;

    @pmi0("town")
    public static final ClassifiedsGeoSuggestTypesDto TOWN;
    private final String value;

    /* compiled from: ClassifiedsGeoSuggestTypesDto.kt */
    public static final class a implements Parcelable.Creator<ClassifiedsGeoSuggestTypesDto> {
        @Override // android.os.Parcelable.Creator
        public final ClassifiedsGeoSuggestTypesDto createFromParcel(Parcel parcel) {
            return ClassifiedsGeoSuggestTypesDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ClassifiedsGeoSuggestTypesDto[] newArray(int i) {
            return new ClassifiedsGeoSuggestTypesDto[i];
        }
    }

    static {
        ClassifiedsGeoSuggestTypesDto classifiedsGeoSuggestTypesDto = new ClassifiedsGeoSuggestTypesDto("CITY", 0, "city");
        CITY = classifiedsGeoSuggestTypesDto;
        ClassifiedsGeoSuggestTypesDto classifiedsGeoSuggestTypesDto2 = new ClassifiedsGeoSuggestTypesDto("TOWN", 1, "town");
        TOWN = classifiedsGeoSuggestTypesDto2;
        ClassifiedsGeoSuggestTypesDto classifiedsGeoSuggestTypesDto3 = new ClassifiedsGeoSuggestTypesDto("HAMLET", 2, "hamlet");
        HAMLET = classifiedsGeoSuggestTypesDto3;
        ClassifiedsGeoSuggestTypesDto[] classifiedsGeoSuggestTypesDtoArr = {classifiedsGeoSuggestTypesDto, classifiedsGeoSuggestTypesDto2, classifiedsGeoSuggestTypesDto3};
        $VALUES = classifiedsGeoSuggestTypesDtoArr;
        $ENTRIES = new asp(classifiedsGeoSuggestTypesDtoArr);
        CREATOR = new a();
    }

    private ClassifiedsGeoSuggestTypesDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static ClassifiedsGeoSuggestTypesDto valueOf(String str) {
        return (ClassifiedsGeoSuggestTypesDto) Enum.valueOf(ClassifiedsGeoSuggestTypesDto.class, str);
    }

    public static ClassifiedsGeoSuggestTypesDto[] values() {
        return (ClassifiedsGeoSuggestTypesDto[]) $VALUES.clone();
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
