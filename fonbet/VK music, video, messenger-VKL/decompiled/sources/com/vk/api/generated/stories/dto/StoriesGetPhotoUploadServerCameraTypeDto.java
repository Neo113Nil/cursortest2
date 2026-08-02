package com.vk.api.generated.stories.dto;

import android.os.Parcel;
import android.os.Parcelable;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: StoriesGetPhotoUploadServerCameraTypeDto.kt */
/* loaded from: classes15.dex */
public final class StoriesGetPhotoUploadServerCameraTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ StoriesGetPhotoUploadServerCameraTypeDto[] $VALUES;

    @pmi0("avatar")
    public static final StoriesGetPhotoUploadServerCameraTypeDto AVATAR;

    @pmi0("back")
    public static final StoriesGetPhotoUploadServerCameraTypeDto BACK;

    @pmi0("back_multi_video")
    public static final StoriesGetPhotoUploadServerCameraTypeDto BACK_MULTI_VIDEO;
    public static final Parcelable.Creator<StoriesGetPhotoUploadServerCameraTypeDto> CREATOR;

    @pmi0("front")
    public static final StoriesGetPhotoUploadServerCameraTypeDto FRONT;

    @pmi0("front_multi_video")
    public static final StoriesGetPhotoUploadServerCameraTypeDto FRONT_MULTI_VIDEO;

    @pmi0("gallery")
    public static final StoriesGetPhotoUploadServerCameraTypeDto GALLERY;

    @pmi0("gallery_multi")
    public static final StoriesGetPhotoUploadServerCameraTypeDto GALLERY_MULTI;

    @pmi0("repost")
    public static final StoriesGetPhotoUploadServerCameraTypeDto REPOST;

    @pmi0("storybox")
    public static final StoriesGetPhotoUploadServerCameraTypeDto STORYBOX;

    @pmi0(StringUtils.UNDEFINED)
    public static final StoriesGetPhotoUploadServerCameraTypeDto UNDEFINED;
    private final String value;

    /* compiled from: StoriesGetPhotoUploadServerCameraTypeDto.kt */
    public static final class a implements Parcelable.Creator<StoriesGetPhotoUploadServerCameraTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final StoriesGetPhotoUploadServerCameraTypeDto createFromParcel(Parcel parcel) {
            return StoriesGetPhotoUploadServerCameraTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final StoriesGetPhotoUploadServerCameraTypeDto[] newArray(int i) {
            return new StoriesGetPhotoUploadServerCameraTypeDto[i];
        }
    }

    static {
        StoriesGetPhotoUploadServerCameraTypeDto storiesGetPhotoUploadServerCameraTypeDto = new StoriesGetPhotoUploadServerCameraTypeDto("AVATAR", 0, "avatar");
        AVATAR = storiesGetPhotoUploadServerCameraTypeDto;
        StoriesGetPhotoUploadServerCameraTypeDto storiesGetPhotoUploadServerCameraTypeDto2 = new StoriesGetPhotoUploadServerCameraTypeDto("BACK", 1, "back");
        BACK = storiesGetPhotoUploadServerCameraTypeDto2;
        StoriesGetPhotoUploadServerCameraTypeDto storiesGetPhotoUploadServerCameraTypeDto3 = new StoriesGetPhotoUploadServerCameraTypeDto("BACK_MULTI_VIDEO", 2, "back_multi_video");
        BACK_MULTI_VIDEO = storiesGetPhotoUploadServerCameraTypeDto3;
        StoriesGetPhotoUploadServerCameraTypeDto storiesGetPhotoUploadServerCameraTypeDto4 = new StoriesGetPhotoUploadServerCameraTypeDto("FRONT", 3, "front");
        FRONT = storiesGetPhotoUploadServerCameraTypeDto4;
        StoriesGetPhotoUploadServerCameraTypeDto storiesGetPhotoUploadServerCameraTypeDto5 = new StoriesGetPhotoUploadServerCameraTypeDto("FRONT_MULTI_VIDEO", 4, "front_multi_video");
        FRONT_MULTI_VIDEO = storiesGetPhotoUploadServerCameraTypeDto5;
        StoriesGetPhotoUploadServerCameraTypeDto storiesGetPhotoUploadServerCameraTypeDto6 = new StoriesGetPhotoUploadServerCameraTypeDto("GALLERY", 5, "gallery");
        GALLERY = storiesGetPhotoUploadServerCameraTypeDto6;
        StoriesGetPhotoUploadServerCameraTypeDto storiesGetPhotoUploadServerCameraTypeDto7 = new StoriesGetPhotoUploadServerCameraTypeDto("GALLERY_MULTI", 6, "gallery_multi");
        GALLERY_MULTI = storiesGetPhotoUploadServerCameraTypeDto7;
        StoriesGetPhotoUploadServerCameraTypeDto storiesGetPhotoUploadServerCameraTypeDto8 = new StoriesGetPhotoUploadServerCameraTypeDto("REPOST", 7, "repost");
        REPOST = storiesGetPhotoUploadServerCameraTypeDto8;
        StoriesGetPhotoUploadServerCameraTypeDto storiesGetPhotoUploadServerCameraTypeDto9 = new StoriesGetPhotoUploadServerCameraTypeDto("STORYBOX", 8, "storybox");
        STORYBOX = storiesGetPhotoUploadServerCameraTypeDto9;
        StoriesGetPhotoUploadServerCameraTypeDto storiesGetPhotoUploadServerCameraTypeDto10 = new StoriesGetPhotoUploadServerCameraTypeDto("UNDEFINED", 9, StringUtils.UNDEFINED);
        UNDEFINED = storiesGetPhotoUploadServerCameraTypeDto10;
        StoriesGetPhotoUploadServerCameraTypeDto[] storiesGetPhotoUploadServerCameraTypeDtoArr = {storiesGetPhotoUploadServerCameraTypeDto, storiesGetPhotoUploadServerCameraTypeDto2, storiesGetPhotoUploadServerCameraTypeDto3, storiesGetPhotoUploadServerCameraTypeDto4, storiesGetPhotoUploadServerCameraTypeDto5, storiesGetPhotoUploadServerCameraTypeDto6, storiesGetPhotoUploadServerCameraTypeDto7, storiesGetPhotoUploadServerCameraTypeDto8, storiesGetPhotoUploadServerCameraTypeDto9, storiesGetPhotoUploadServerCameraTypeDto10};
        $VALUES = storiesGetPhotoUploadServerCameraTypeDtoArr;
        $ENTRIES = new asp(storiesGetPhotoUploadServerCameraTypeDtoArr);
        CREATOR = new a();
    }

    private StoriesGetPhotoUploadServerCameraTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static StoriesGetPhotoUploadServerCameraTypeDto valueOf(String str) {
        return (StoriesGetPhotoUploadServerCameraTypeDto) Enum.valueOf(StoriesGetPhotoUploadServerCameraTypeDto.class, str);
    }

    public static StoriesGetPhotoUploadServerCameraTypeDto[] values() {
        return (StoriesGetPhotoUploadServerCameraTypeDto[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String i() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
