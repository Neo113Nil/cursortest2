package com.vk.api.generated.stories.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: StoriesGetPhotoUploadServerMemoryTypeDto.kt */
/* loaded from: classes15.dex */
public final class StoriesGetPhotoUploadServerMemoryTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ StoriesGetPhotoUploadServerMemoryTypeDto[] $VALUES;

    @pmi0("album")
    public static final StoriesGetPhotoUploadServerMemoryTypeDto ALBUM;

    @pmi0("avatar")
    public static final StoriesGetPhotoUploadServerMemoryTypeDto AVATAR;

    @pmi0("birthday")
    public static final StoriesGetPhotoUploadServerMemoryTypeDto BIRTHDAY;
    public static final Parcelable.Creator<StoriesGetPhotoUploadServerMemoryTypeDto> CREATOR;

    @pmi0("first_audio")
    public static final StoriesGetPhotoUploadServerMemoryTypeDto FIRST_AUDIO;

    @pmi0("first_avatar")
    public static final StoriesGetPhotoUploadServerMemoryTypeDto FIRST_AVATAR;

    @pmi0("first_post")
    public static final StoriesGetPhotoUploadServerMemoryTypeDto FIRST_POST;

    @pmi0("first_story")
    public static final StoriesGetPhotoUploadServerMemoryTypeDto FIRST_STORY;

    @pmi0("friendship")
    public static final StoriesGetPhotoUploadServerMemoryTypeDto FRIENDSHIP;

    @pmi0("gallery")
    public static final StoriesGetPhotoUploadServerMemoryTypeDto GALLERY;

    @pmi0("my_top_track")
    public static final StoriesGetPhotoUploadServerMemoryTypeDto MY_TOP_TRACK;

    @pmi0("photo")
    public static final StoriesGetPhotoUploadServerMemoryTypeDto PHOTO;

    @pmi0("post")
    public static final StoriesGetPhotoUploadServerMemoryTypeDto POST;

    @pmi0("story")
    public static final StoriesGetPhotoUploadServerMemoryTypeDto STORY;

    @pmi0("year_summary")
    public static final StoriesGetPhotoUploadServerMemoryTypeDto YEAR_SUMMARY;
    private final String value;

    /* compiled from: StoriesGetPhotoUploadServerMemoryTypeDto.kt */
    public static final class a implements Parcelable.Creator<StoriesGetPhotoUploadServerMemoryTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final StoriesGetPhotoUploadServerMemoryTypeDto createFromParcel(Parcel parcel) {
            return StoriesGetPhotoUploadServerMemoryTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final StoriesGetPhotoUploadServerMemoryTypeDto[] newArray(int i) {
            return new StoriesGetPhotoUploadServerMemoryTypeDto[i];
        }
    }

    static {
        StoriesGetPhotoUploadServerMemoryTypeDto storiesGetPhotoUploadServerMemoryTypeDto = new StoriesGetPhotoUploadServerMemoryTypeDto("ALBUM", 0, "album");
        ALBUM = storiesGetPhotoUploadServerMemoryTypeDto;
        StoriesGetPhotoUploadServerMemoryTypeDto storiesGetPhotoUploadServerMemoryTypeDto2 = new StoriesGetPhotoUploadServerMemoryTypeDto("AVATAR", 1, "avatar");
        AVATAR = storiesGetPhotoUploadServerMemoryTypeDto2;
        StoriesGetPhotoUploadServerMemoryTypeDto storiesGetPhotoUploadServerMemoryTypeDto3 = new StoriesGetPhotoUploadServerMemoryTypeDto("FIRST_AUDIO", 2, "first_audio");
        FIRST_AUDIO = storiesGetPhotoUploadServerMemoryTypeDto3;
        StoriesGetPhotoUploadServerMemoryTypeDto storiesGetPhotoUploadServerMemoryTypeDto4 = new StoriesGetPhotoUploadServerMemoryTypeDto("FIRST_AVATAR", 3, "first_avatar");
        FIRST_AVATAR = storiesGetPhotoUploadServerMemoryTypeDto4;
        StoriesGetPhotoUploadServerMemoryTypeDto storiesGetPhotoUploadServerMemoryTypeDto5 = new StoriesGetPhotoUploadServerMemoryTypeDto("FIRST_POST", 4, "first_post");
        FIRST_POST = storiesGetPhotoUploadServerMemoryTypeDto5;
        StoriesGetPhotoUploadServerMemoryTypeDto storiesGetPhotoUploadServerMemoryTypeDto6 = new StoriesGetPhotoUploadServerMemoryTypeDto("FIRST_STORY", 5, "first_story");
        FIRST_STORY = storiesGetPhotoUploadServerMemoryTypeDto6;
        StoriesGetPhotoUploadServerMemoryTypeDto storiesGetPhotoUploadServerMemoryTypeDto7 = new StoriesGetPhotoUploadServerMemoryTypeDto("FRIENDSHIP", 6, "friendship");
        FRIENDSHIP = storiesGetPhotoUploadServerMemoryTypeDto7;
        StoriesGetPhotoUploadServerMemoryTypeDto storiesGetPhotoUploadServerMemoryTypeDto8 = new StoriesGetPhotoUploadServerMemoryTypeDto("PHOTO", 7, "photo");
        PHOTO = storiesGetPhotoUploadServerMemoryTypeDto8;
        StoriesGetPhotoUploadServerMemoryTypeDto storiesGetPhotoUploadServerMemoryTypeDto9 = new StoriesGetPhotoUploadServerMemoryTypeDto("POST", 8, "post");
        POST = storiesGetPhotoUploadServerMemoryTypeDto9;
        StoriesGetPhotoUploadServerMemoryTypeDto storiesGetPhotoUploadServerMemoryTypeDto10 = new StoriesGetPhotoUploadServerMemoryTypeDto("STORY", 9, "story");
        STORY = storiesGetPhotoUploadServerMemoryTypeDto10;
        StoriesGetPhotoUploadServerMemoryTypeDto storiesGetPhotoUploadServerMemoryTypeDto11 = new StoriesGetPhotoUploadServerMemoryTypeDto("YEAR_SUMMARY", 10, "year_summary");
        YEAR_SUMMARY = storiesGetPhotoUploadServerMemoryTypeDto11;
        StoriesGetPhotoUploadServerMemoryTypeDto storiesGetPhotoUploadServerMemoryTypeDto12 = new StoriesGetPhotoUploadServerMemoryTypeDto("MY_TOP_TRACK", 11, "my_top_track");
        MY_TOP_TRACK = storiesGetPhotoUploadServerMemoryTypeDto12;
        StoriesGetPhotoUploadServerMemoryTypeDto storiesGetPhotoUploadServerMemoryTypeDto13 = new StoriesGetPhotoUploadServerMemoryTypeDto("BIRTHDAY", 12, "birthday");
        BIRTHDAY = storiesGetPhotoUploadServerMemoryTypeDto13;
        StoriesGetPhotoUploadServerMemoryTypeDto storiesGetPhotoUploadServerMemoryTypeDto14 = new StoriesGetPhotoUploadServerMemoryTypeDto("GALLERY", 13, "gallery");
        GALLERY = storiesGetPhotoUploadServerMemoryTypeDto14;
        StoriesGetPhotoUploadServerMemoryTypeDto[] storiesGetPhotoUploadServerMemoryTypeDtoArr = {storiesGetPhotoUploadServerMemoryTypeDto, storiesGetPhotoUploadServerMemoryTypeDto2, storiesGetPhotoUploadServerMemoryTypeDto3, storiesGetPhotoUploadServerMemoryTypeDto4, storiesGetPhotoUploadServerMemoryTypeDto5, storiesGetPhotoUploadServerMemoryTypeDto6, storiesGetPhotoUploadServerMemoryTypeDto7, storiesGetPhotoUploadServerMemoryTypeDto8, storiesGetPhotoUploadServerMemoryTypeDto9, storiesGetPhotoUploadServerMemoryTypeDto10, storiesGetPhotoUploadServerMemoryTypeDto11, storiesGetPhotoUploadServerMemoryTypeDto12, storiesGetPhotoUploadServerMemoryTypeDto13, storiesGetPhotoUploadServerMemoryTypeDto14};
        $VALUES = storiesGetPhotoUploadServerMemoryTypeDtoArr;
        $ENTRIES = new asp(storiesGetPhotoUploadServerMemoryTypeDtoArr);
        CREATOR = new a();
    }

    private StoriesGetPhotoUploadServerMemoryTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static zrp<StoriesGetPhotoUploadServerMemoryTypeDto> i() {
        return $ENTRIES;
    }

    public static StoriesGetPhotoUploadServerMemoryTypeDto valueOf(String str) {
        return (StoriesGetPhotoUploadServerMemoryTypeDto) Enum.valueOf(StoriesGetPhotoUploadServerMemoryTypeDto.class, str);
    }

    public static StoriesGetPhotoUploadServerMemoryTypeDto[] values() {
        return (StoriesGetPhotoUploadServerMemoryTypeDto[]) $VALUES.clone();
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
