package com.vk.api.generated.stories.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: StoriesGetVideoUploadServerMemoryTypeDto.kt */
/* loaded from: classes15.dex */
public final class StoriesGetVideoUploadServerMemoryTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ StoriesGetVideoUploadServerMemoryTypeDto[] $VALUES;

    @pmi0("album")
    public static final StoriesGetVideoUploadServerMemoryTypeDto ALBUM;

    @pmi0("avatar")
    public static final StoriesGetVideoUploadServerMemoryTypeDto AVATAR;

    @pmi0("birthday")
    public static final StoriesGetVideoUploadServerMemoryTypeDto BIRTHDAY;
    public static final Parcelable.Creator<StoriesGetVideoUploadServerMemoryTypeDto> CREATOR;

    @pmi0("first_audio")
    public static final StoriesGetVideoUploadServerMemoryTypeDto FIRST_AUDIO;

    @pmi0("first_avatar")
    public static final StoriesGetVideoUploadServerMemoryTypeDto FIRST_AVATAR;

    @pmi0("first_post")
    public static final StoriesGetVideoUploadServerMemoryTypeDto FIRST_POST;

    @pmi0("first_story")
    public static final StoriesGetVideoUploadServerMemoryTypeDto FIRST_STORY;

    @pmi0("friendship")
    public static final StoriesGetVideoUploadServerMemoryTypeDto FRIENDSHIP;

    @pmi0("gallery")
    public static final StoriesGetVideoUploadServerMemoryTypeDto GALLERY;

    @pmi0("my_top_track")
    public static final StoriesGetVideoUploadServerMemoryTypeDto MY_TOP_TRACK;

    @pmi0("photo")
    public static final StoriesGetVideoUploadServerMemoryTypeDto PHOTO;

    @pmi0("post")
    public static final StoriesGetVideoUploadServerMemoryTypeDto POST;

    @pmi0("story")
    public static final StoriesGetVideoUploadServerMemoryTypeDto STORY;

    @pmi0("year_summary")
    public static final StoriesGetVideoUploadServerMemoryTypeDto YEAR_SUMMARY;
    private final String value;

    /* compiled from: StoriesGetVideoUploadServerMemoryTypeDto.kt */
    public static final class a implements Parcelable.Creator<StoriesGetVideoUploadServerMemoryTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final StoriesGetVideoUploadServerMemoryTypeDto createFromParcel(Parcel parcel) {
            return StoriesGetVideoUploadServerMemoryTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final StoriesGetVideoUploadServerMemoryTypeDto[] newArray(int i) {
            return new StoriesGetVideoUploadServerMemoryTypeDto[i];
        }
    }

    static {
        StoriesGetVideoUploadServerMemoryTypeDto storiesGetVideoUploadServerMemoryTypeDto = new StoriesGetVideoUploadServerMemoryTypeDto("ALBUM", 0, "album");
        ALBUM = storiesGetVideoUploadServerMemoryTypeDto;
        StoriesGetVideoUploadServerMemoryTypeDto storiesGetVideoUploadServerMemoryTypeDto2 = new StoriesGetVideoUploadServerMemoryTypeDto("AVATAR", 1, "avatar");
        AVATAR = storiesGetVideoUploadServerMemoryTypeDto2;
        StoriesGetVideoUploadServerMemoryTypeDto storiesGetVideoUploadServerMemoryTypeDto3 = new StoriesGetVideoUploadServerMemoryTypeDto("FIRST_AUDIO", 2, "first_audio");
        FIRST_AUDIO = storiesGetVideoUploadServerMemoryTypeDto3;
        StoriesGetVideoUploadServerMemoryTypeDto storiesGetVideoUploadServerMemoryTypeDto4 = new StoriesGetVideoUploadServerMemoryTypeDto("FIRST_AVATAR", 3, "first_avatar");
        FIRST_AVATAR = storiesGetVideoUploadServerMemoryTypeDto4;
        StoriesGetVideoUploadServerMemoryTypeDto storiesGetVideoUploadServerMemoryTypeDto5 = new StoriesGetVideoUploadServerMemoryTypeDto("FIRST_POST", 4, "first_post");
        FIRST_POST = storiesGetVideoUploadServerMemoryTypeDto5;
        StoriesGetVideoUploadServerMemoryTypeDto storiesGetVideoUploadServerMemoryTypeDto6 = new StoriesGetVideoUploadServerMemoryTypeDto("FIRST_STORY", 5, "first_story");
        FIRST_STORY = storiesGetVideoUploadServerMemoryTypeDto6;
        StoriesGetVideoUploadServerMemoryTypeDto storiesGetVideoUploadServerMemoryTypeDto7 = new StoriesGetVideoUploadServerMemoryTypeDto("FRIENDSHIP", 6, "friendship");
        FRIENDSHIP = storiesGetVideoUploadServerMemoryTypeDto7;
        StoriesGetVideoUploadServerMemoryTypeDto storiesGetVideoUploadServerMemoryTypeDto8 = new StoriesGetVideoUploadServerMemoryTypeDto("PHOTO", 7, "photo");
        PHOTO = storiesGetVideoUploadServerMemoryTypeDto8;
        StoriesGetVideoUploadServerMemoryTypeDto storiesGetVideoUploadServerMemoryTypeDto9 = new StoriesGetVideoUploadServerMemoryTypeDto("POST", 8, "post");
        POST = storiesGetVideoUploadServerMemoryTypeDto9;
        StoriesGetVideoUploadServerMemoryTypeDto storiesGetVideoUploadServerMemoryTypeDto10 = new StoriesGetVideoUploadServerMemoryTypeDto("STORY", 9, "story");
        STORY = storiesGetVideoUploadServerMemoryTypeDto10;
        StoriesGetVideoUploadServerMemoryTypeDto storiesGetVideoUploadServerMemoryTypeDto11 = new StoriesGetVideoUploadServerMemoryTypeDto("YEAR_SUMMARY", 10, "year_summary");
        YEAR_SUMMARY = storiesGetVideoUploadServerMemoryTypeDto11;
        StoriesGetVideoUploadServerMemoryTypeDto storiesGetVideoUploadServerMemoryTypeDto12 = new StoriesGetVideoUploadServerMemoryTypeDto("MY_TOP_TRACK", 11, "my_top_track");
        MY_TOP_TRACK = storiesGetVideoUploadServerMemoryTypeDto12;
        StoriesGetVideoUploadServerMemoryTypeDto storiesGetVideoUploadServerMemoryTypeDto13 = new StoriesGetVideoUploadServerMemoryTypeDto("BIRTHDAY", 12, "birthday");
        BIRTHDAY = storiesGetVideoUploadServerMemoryTypeDto13;
        StoriesGetVideoUploadServerMemoryTypeDto storiesGetVideoUploadServerMemoryTypeDto14 = new StoriesGetVideoUploadServerMemoryTypeDto("GALLERY", 13, "gallery");
        GALLERY = storiesGetVideoUploadServerMemoryTypeDto14;
        StoriesGetVideoUploadServerMemoryTypeDto[] storiesGetVideoUploadServerMemoryTypeDtoArr = {storiesGetVideoUploadServerMemoryTypeDto, storiesGetVideoUploadServerMemoryTypeDto2, storiesGetVideoUploadServerMemoryTypeDto3, storiesGetVideoUploadServerMemoryTypeDto4, storiesGetVideoUploadServerMemoryTypeDto5, storiesGetVideoUploadServerMemoryTypeDto6, storiesGetVideoUploadServerMemoryTypeDto7, storiesGetVideoUploadServerMemoryTypeDto8, storiesGetVideoUploadServerMemoryTypeDto9, storiesGetVideoUploadServerMemoryTypeDto10, storiesGetVideoUploadServerMemoryTypeDto11, storiesGetVideoUploadServerMemoryTypeDto12, storiesGetVideoUploadServerMemoryTypeDto13, storiesGetVideoUploadServerMemoryTypeDto14};
        $VALUES = storiesGetVideoUploadServerMemoryTypeDtoArr;
        $ENTRIES = new asp(storiesGetVideoUploadServerMemoryTypeDtoArr);
        CREATOR = new a();
    }

    private StoriesGetVideoUploadServerMemoryTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static zrp<StoriesGetVideoUploadServerMemoryTypeDto> i() {
        return $ENTRIES;
    }

    public static StoriesGetVideoUploadServerMemoryTypeDto valueOf(String str) {
        return (StoriesGetVideoUploadServerMemoryTypeDto) Enum.valueOf(StoriesGetVideoUploadServerMemoryTypeDto.class, str);
    }

    public static StoriesGetVideoUploadServerMemoryTypeDto[] values() {
        return (StoriesGetVideoUploadServerMemoryTypeDto[]) $VALUES.clone();
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
