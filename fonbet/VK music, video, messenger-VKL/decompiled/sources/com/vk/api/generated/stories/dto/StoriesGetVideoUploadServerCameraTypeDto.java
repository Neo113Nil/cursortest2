package com.vk.api.generated.stories.dto;

import android.os.Parcel;
import android.os.Parcelable;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: StoriesGetVideoUploadServerCameraTypeDto.kt */
/* loaded from: classes15.dex */
public final class StoriesGetVideoUploadServerCameraTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ StoriesGetVideoUploadServerCameraTypeDto[] $VALUES;

    @pmi0("avatar")
    public static final StoriesGetVideoUploadServerCameraTypeDto AVATAR;

    @pmi0("back")
    public static final StoriesGetVideoUploadServerCameraTypeDto BACK;

    @pmi0("back_multi_video")
    public static final StoriesGetVideoUploadServerCameraTypeDto BACK_MULTI_VIDEO;
    public static final Parcelable.Creator<StoriesGetVideoUploadServerCameraTypeDto> CREATOR;

    @pmi0("front")
    public static final StoriesGetVideoUploadServerCameraTypeDto FRONT;

    @pmi0("front_multi_video")
    public static final StoriesGetVideoUploadServerCameraTypeDto FRONT_MULTI_VIDEO;

    @pmi0("gallery")
    public static final StoriesGetVideoUploadServerCameraTypeDto GALLERY;

    @pmi0("gallery_multi")
    public static final StoriesGetVideoUploadServerCameraTypeDto GALLERY_MULTI;

    @pmi0("repost")
    public static final StoriesGetVideoUploadServerCameraTypeDto REPOST;

    @pmi0("storybox")
    public static final StoriesGetVideoUploadServerCameraTypeDto STORYBOX;

    @pmi0(StringUtils.UNDEFINED)
    public static final StoriesGetVideoUploadServerCameraTypeDto UNDEFINED;
    private final String value;

    /* compiled from: StoriesGetVideoUploadServerCameraTypeDto.kt */
    public static final class a implements Parcelable.Creator<StoriesGetVideoUploadServerCameraTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final StoriesGetVideoUploadServerCameraTypeDto createFromParcel(Parcel parcel) {
            return StoriesGetVideoUploadServerCameraTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final StoriesGetVideoUploadServerCameraTypeDto[] newArray(int i) {
            return new StoriesGetVideoUploadServerCameraTypeDto[i];
        }
    }

    static {
        StoriesGetVideoUploadServerCameraTypeDto storiesGetVideoUploadServerCameraTypeDto = new StoriesGetVideoUploadServerCameraTypeDto("AVATAR", 0, "avatar");
        AVATAR = storiesGetVideoUploadServerCameraTypeDto;
        StoriesGetVideoUploadServerCameraTypeDto storiesGetVideoUploadServerCameraTypeDto2 = new StoriesGetVideoUploadServerCameraTypeDto("BACK", 1, "back");
        BACK = storiesGetVideoUploadServerCameraTypeDto2;
        StoriesGetVideoUploadServerCameraTypeDto storiesGetVideoUploadServerCameraTypeDto3 = new StoriesGetVideoUploadServerCameraTypeDto("BACK_MULTI_VIDEO", 2, "back_multi_video");
        BACK_MULTI_VIDEO = storiesGetVideoUploadServerCameraTypeDto3;
        StoriesGetVideoUploadServerCameraTypeDto storiesGetVideoUploadServerCameraTypeDto4 = new StoriesGetVideoUploadServerCameraTypeDto("FRONT", 3, "front");
        FRONT = storiesGetVideoUploadServerCameraTypeDto4;
        StoriesGetVideoUploadServerCameraTypeDto storiesGetVideoUploadServerCameraTypeDto5 = new StoriesGetVideoUploadServerCameraTypeDto("FRONT_MULTI_VIDEO", 4, "front_multi_video");
        FRONT_MULTI_VIDEO = storiesGetVideoUploadServerCameraTypeDto5;
        StoriesGetVideoUploadServerCameraTypeDto storiesGetVideoUploadServerCameraTypeDto6 = new StoriesGetVideoUploadServerCameraTypeDto("GALLERY", 5, "gallery");
        GALLERY = storiesGetVideoUploadServerCameraTypeDto6;
        StoriesGetVideoUploadServerCameraTypeDto storiesGetVideoUploadServerCameraTypeDto7 = new StoriesGetVideoUploadServerCameraTypeDto("GALLERY_MULTI", 6, "gallery_multi");
        GALLERY_MULTI = storiesGetVideoUploadServerCameraTypeDto7;
        StoriesGetVideoUploadServerCameraTypeDto storiesGetVideoUploadServerCameraTypeDto8 = new StoriesGetVideoUploadServerCameraTypeDto("REPOST", 7, "repost");
        REPOST = storiesGetVideoUploadServerCameraTypeDto8;
        StoriesGetVideoUploadServerCameraTypeDto storiesGetVideoUploadServerCameraTypeDto9 = new StoriesGetVideoUploadServerCameraTypeDto("STORYBOX", 8, "storybox");
        STORYBOX = storiesGetVideoUploadServerCameraTypeDto9;
        StoriesGetVideoUploadServerCameraTypeDto storiesGetVideoUploadServerCameraTypeDto10 = new StoriesGetVideoUploadServerCameraTypeDto("UNDEFINED", 9, StringUtils.UNDEFINED);
        UNDEFINED = storiesGetVideoUploadServerCameraTypeDto10;
        StoriesGetVideoUploadServerCameraTypeDto[] storiesGetVideoUploadServerCameraTypeDtoArr = {storiesGetVideoUploadServerCameraTypeDto, storiesGetVideoUploadServerCameraTypeDto2, storiesGetVideoUploadServerCameraTypeDto3, storiesGetVideoUploadServerCameraTypeDto4, storiesGetVideoUploadServerCameraTypeDto5, storiesGetVideoUploadServerCameraTypeDto6, storiesGetVideoUploadServerCameraTypeDto7, storiesGetVideoUploadServerCameraTypeDto8, storiesGetVideoUploadServerCameraTypeDto9, storiesGetVideoUploadServerCameraTypeDto10};
        $VALUES = storiesGetVideoUploadServerCameraTypeDtoArr;
        $ENTRIES = new asp(storiesGetVideoUploadServerCameraTypeDtoArr);
        CREATOR = new a();
    }

    private StoriesGetVideoUploadServerCameraTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static zrp<StoriesGetVideoUploadServerCameraTypeDto> i() {
        return $ENTRIES;
    }

    public static StoriesGetVideoUploadServerCameraTypeDto valueOf(String str) {
        return (StoriesGetVideoUploadServerCameraTypeDto) Enum.valueOf(StoriesGetVideoUploadServerCameraTypeDto.class, str);
    }

    public static StoriesGetVideoUploadServerCameraTypeDto[] values() {
        return (StoriesGetVideoUploadServerCameraTypeDto[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String j() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
