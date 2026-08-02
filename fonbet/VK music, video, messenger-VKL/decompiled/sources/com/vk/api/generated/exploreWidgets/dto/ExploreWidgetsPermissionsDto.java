package com.vk.api.generated.exploreWidgets.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ExploreWidgetsPermissionsDto.kt */
/* loaded from: classes14.dex */
public final class ExploreWidgetsPermissionsDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ExploreWidgetsPermissionsDto[] $VALUES;
    public static final Parcelable.Creator<ExploreWidgetsPermissionsDto> CREATOR;

    @pmi0("geo")
    public static final ExploreWidgetsPermissionsDto GEO;
    private final String value;

    /* compiled from: ExploreWidgetsPermissionsDto.kt */
    public static final class a implements Parcelable.Creator<ExploreWidgetsPermissionsDto> {
        @Override // android.os.Parcelable.Creator
        public final ExploreWidgetsPermissionsDto createFromParcel(Parcel parcel) {
            return ExploreWidgetsPermissionsDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ExploreWidgetsPermissionsDto[] newArray(int i) {
            return new ExploreWidgetsPermissionsDto[i];
        }
    }

    static {
        ExploreWidgetsPermissionsDto exploreWidgetsPermissionsDto = new ExploreWidgetsPermissionsDto("GEO", 0, "geo");
        GEO = exploreWidgetsPermissionsDto;
        ExploreWidgetsPermissionsDto[] exploreWidgetsPermissionsDtoArr = {exploreWidgetsPermissionsDto};
        $VALUES = exploreWidgetsPermissionsDtoArr;
        $ENTRIES = new asp(exploreWidgetsPermissionsDtoArr);
        CREATOR = new a();
    }

    private ExploreWidgetsPermissionsDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static ExploreWidgetsPermissionsDto valueOf(String str) {
        return (ExploreWidgetsPermissionsDto) Enum.valueOf(ExploreWidgetsPermissionsDto.class, str);
    }

    public static ExploreWidgetsPermissionsDto[] values() {
        return (ExploreWidgetsPermissionsDto[]) $VALUES.clone();
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
