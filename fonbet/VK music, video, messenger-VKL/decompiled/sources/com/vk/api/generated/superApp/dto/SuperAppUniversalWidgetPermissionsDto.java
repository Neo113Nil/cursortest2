package com.vk.api.generated.superApp.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SuperAppUniversalWidgetPermissionsDto.kt */
/* loaded from: classes15.dex */
public final class SuperAppUniversalWidgetPermissionsDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ SuperAppUniversalWidgetPermissionsDto[] $VALUES;

    @pmi0("contacts")
    public static final SuperAppUniversalWidgetPermissionsDto CONTACTS;
    public static final Parcelable.Creator<SuperAppUniversalWidgetPermissionsDto> CREATOR;

    @pmi0("geo")
    public static final SuperAppUniversalWidgetPermissionsDto GEO;
    private final String value;

    /* compiled from: SuperAppUniversalWidgetPermissionsDto.kt */
    public static final class a implements Parcelable.Creator<SuperAppUniversalWidgetPermissionsDto> {
        @Override // android.os.Parcelable.Creator
        public final SuperAppUniversalWidgetPermissionsDto createFromParcel(Parcel parcel) {
            return SuperAppUniversalWidgetPermissionsDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SuperAppUniversalWidgetPermissionsDto[] newArray(int i) {
            return new SuperAppUniversalWidgetPermissionsDto[i];
        }
    }

    static {
        SuperAppUniversalWidgetPermissionsDto superAppUniversalWidgetPermissionsDto = new SuperAppUniversalWidgetPermissionsDto("GEO", 0, "geo");
        GEO = superAppUniversalWidgetPermissionsDto;
        SuperAppUniversalWidgetPermissionsDto superAppUniversalWidgetPermissionsDto2 = new SuperAppUniversalWidgetPermissionsDto("CONTACTS", 1, "contacts");
        CONTACTS = superAppUniversalWidgetPermissionsDto2;
        SuperAppUniversalWidgetPermissionsDto[] superAppUniversalWidgetPermissionsDtoArr = {superAppUniversalWidgetPermissionsDto, superAppUniversalWidgetPermissionsDto2};
        $VALUES = superAppUniversalWidgetPermissionsDtoArr;
        $ENTRIES = new asp(superAppUniversalWidgetPermissionsDtoArr);
        CREATOR = new a();
    }

    private SuperAppUniversalWidgetPermissionsDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static SuperAppUniversalWidgetPermissionsDto valueOf(String str) {
        return (SuperAppUniversalWidgetPermissionsDto) Enum.valueOf(SuperAppUniversalWidgetPermissionsDto.class, str);
    }

    public static SuperAppUniversalWidgetPermissionsDto[] values() {
        return (SuperAppUniversalWidgetPermissionsDto[]) $VALUES.clone();
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
