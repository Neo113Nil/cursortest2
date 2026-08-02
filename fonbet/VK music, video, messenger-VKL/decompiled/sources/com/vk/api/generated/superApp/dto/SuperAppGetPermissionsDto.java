package com.vk.api.generated.superApp.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SuperAppGetPermissionsDto.kt */
/* loaded from: classes15.dex */
public final class SuperAppGetPermissionsDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ SuperAppGetPermissionsDto[] $VALUES;
    public static final Parcelable.Creator<SuperAppGetPermissionsDto> CREATOR;

    @pmi0("geo")
    public static final SuperAppGetPermissionsDto GEO;

    @pmi0("sport")
    public static final SuperAppGetPermissionsDto SPORT;

    @pmi0("steps")
    public static final SuperAppGetPermissionsDto STEPS;
    private final String value;

    /* compiled from: SuperAppGetPermissionsDto.kt */
    public static final class a implements Parcelable.Creator<SuperAppGetPermissionsDto> {
        @Override // android.os.Parcelable.Creator
        public final SuperAppGetPermissionsDto createFromParcel(Parcel parcel) {
            return SuperAppGetPermissionsDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SuperAppGetPermissionsDto[] newArray(int i) {
            return new SuperAppGetPermissionsDto[i];
        }
    }

    static {
        SuperAppGetPermissionsDto superAppGetPermissionsDto = new SuperAppGetPermissionsDto("GEO", 0, "geo");
        GEO = superAppGetPermissionsDto;
        SuperAppGetPermissionsDto superAppGetPermissionsDto2 = new SuperAppGetPermissionsDto("SPORT", 1, "sport");
        SPORT = superAppGetPermissionsDto2;
        SuperAppGetPermissionsDto superAppGetPermissionsDto3 = new SuperAppGetPermissionsDto("STEPS", 2, "steps");
        STEPS = superAppGetPermissionsDto3;
        SuperAppGetPermissionsDto[] superAppGetPermissionsDtoArr = {superAppGetPermissionsDto, superAppGetPermissionsDto2, superAppGetPermissionsDto3};
        $VALUES = superAppGetPermissionsDtoArr;
        $ENTRIES = new asp(superAppGetPermissionsDtoArr);
        CREATOR = new a();
    }

    private SuperAppGetPermissionsDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static SuperAppGetPermissionsDto valueOf(String str) {
        return (SuperAppGetPermissionsDto) Enum.valueOf(SuperAppGetPermissionsDto.class, str);
    }

    public static SuperAppGetPermissionsDto[] values() {
        return (SuperAppGetPermissionsDto[]) $VALUES.clone();
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
