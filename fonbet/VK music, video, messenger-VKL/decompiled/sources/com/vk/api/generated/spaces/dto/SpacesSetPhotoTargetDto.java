package com.vk.api.generated.spaces.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.external.NativeAdContent;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SpacesSetPhotoTargetDto.kt */
/* loaded from: classes15.dex */
public final class SpacesSetPhotoTargetDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ SpacesSetPhotoTargetDto[] $VALUES;

    @pmi0("cover")
    public static final SpacesSetPhotoTargetDto COVER;
    public static final Parcelable.Creator<SpacesSetPhotoTargetDto> CREATOR;

    @pmi0("icon")
    public static final SpacesSetPhotoTargetDto ICON;
    private final String value;

    /* compiled from: SpacesSetPhotoTargetDto.kt */
    public static final class a implements Parcelable.Creator<SpacesSetPhotoTargetDto> {
        @Override // android.os.Parcelable.Creator
        public final SpacesSetPhotoTargetDto createFromParcel(Parcel parcel) {
            return SpacesSetPhotoTargetDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SpacesSetPhotoTargetDto[] newArray(int i) {
            return new SpacesSetPhotoTargetDto[i];
        }
    }

    static {
        SpacesSetPhotoTargetDto spacesSetPhotoTargetDto = new SpacesSetPhotoTargetDto("COVER", 0, "cover");
        COVER = spacesSetPhotoTargetDto;
        SpacesSetPhotoTargetDto spacesSetPhotoTargetDto2 = new SpacesSetPhotoTargetDto(NativeAdContent.ViewTag.AD_ICON, 1, "icon");
        ICON = spacesSetPhotoTargetDto2;
        SpacesSetPhotoTargetDto[] spacesSetPhotoTargetDtoArr = {spacesSetPhotoTargetDto, spacesSetPhotoTargetDto2};
        $VALUES = spacesSetPhotoTargetDtoArr;
        $ENTRIES = new asp(spacesSetPhotoTargetDtoArr);
        CREATOR = new a();
    }

    private SpacesSetPhotoTargetDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static SpacesSetPhotoTargetDto valueOf(String str) {
        return (SpacesSetPhotoTargetDto) Enum.valueOf(SpacesSetPhotoTargetDto.class, str);
    }

    public static SpacesSetPhotoTargetDto[] values() {
        return (SpacesSetPhotoTargetDto[]) $VALUES.clone();
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
