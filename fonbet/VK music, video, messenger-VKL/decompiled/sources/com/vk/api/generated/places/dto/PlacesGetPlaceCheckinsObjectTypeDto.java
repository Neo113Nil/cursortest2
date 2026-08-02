package com.vk.api.generated.places.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.MBridgeConstans;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PlacesGetPlaceCheckinsObjectTypeDto.kt */
/* loaded from: classes15.dex */
public final class PlacesGetPlaceCheckinsObjectTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ PlacesGetPlaceCheckinsObjectTypeDto[] $VALUES;

    @pmi0(MBridgeConstans.DYNAMIC_VIEW_WX_APP)
    public static final PlacesGetPlaceCheckinsObjectTypeDto APP;
    public static final Parcelable.Creator<PlacesGetPlaceCheckinsObjectTypeDto> CREATOR;

    @pmi0("post")
    public static final PlacesGetPlaceCheckinsObjectTypeDto POST;

    @pmi0("story")
    public static final PlacesGetPlaceCheckinsObjectTypeDto STORY;
    private final String value;

    /* compiled from: PlacesGetPlaceCheckinsObjectTypeDto.kt */
    public static final class a implements Parcelable.Creator<PlacesGetPlaceCheckinsObjectTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final PlacesGetPlaceCheckinsObjectTypeDto createFromParcel(Parcel parcel) {
            return PlacesGetPlaceCheckinsObjectTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PlacesGetPlaceCheckinsObjectTypeDto[] newArray(int i) {
            return new PlacesGetPlaceCheckinsObjectTypeDto[i];
        }
    }

    static {
        PlacesGetPlaceCheckinsObjectTypeDto placesGetPlaceCheckinsObjectTypeDto = new PlacesGetPlaceCheckinsObjectTypeDto("APP", 0, MBridgeConstans.DYNAMIC_VIEW_WX_APP);
        APP = placesGetPlaceCheckinsObjectTypeDto;
        PlacesGetPlaceCheckinsObjectTypeDto placesGetPlaceCheckinsObjectTypeDto2 = new PlacesGetPlaceCheckinsObjectTypeDto("POST", 1, "post");
        POST = placesGetPlaceCheckinsObjectTypeDto2;
        PlacesGetPlaceCheckinsObjectTypeDto placesGetPlaceCheckinsObjectTypeDto3 = new PlacesGetPlaceCheckinsObjectTypeDto("STORY", 2, "story");
        STORY = placesGetPlaceCheckinsObjectTypeDto3;
        PlacesGetPlaceCheckinsObjectTypeDto[] placesGetPlaceCheckinsObjectTypeDtoArr = {placesGetPlaceCheckinsObjectTypeDto, placesGetPlaceCheckinsObjectTypeDto2, placesGetPlaceCheckinsObjectTypeDto3};
        $VALUES = placesGetPlaceCheckinsObjectTypeDtoArr;
        $ENTRIES = new asp(placesGetPlaceCheckinsObjectTypeDtoArr);
        CREATOR = new a();
    }

    private PlacesGetPlaceCheckinsObjectTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static PlacesGetPlaceCheckinsObjectTypeDto valueOf(String str) {
        return (PlacesGetPlaceCheckinsObjectTypeDto) Enum.valueOf(PlacesGetPlaceCheckinsObjectTypeDto.class, str);
    }

    public static PlacesGetPlaceCheckinsObjectTypeDto[] values() {
        return (PlacesGetPlaceCheckinsObjectTypeDto[]) $VALUES.clone();
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
