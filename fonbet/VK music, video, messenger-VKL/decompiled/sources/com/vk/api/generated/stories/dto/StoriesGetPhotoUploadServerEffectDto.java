package com.vk.api.generated.stories.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: StoriesGetPhotoUploadServerEffectDto.kt */
/* loaded from: classes15.dex */
public final class StoriesGetPhotoUploadServerEffectDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ StoriesGetPhotoUploadServerEffectDto[] $VALUES;
    public static final Parcelable.Creator<StoriesGetPhotoUploadServerEffectDto> CREATOR;

    @pmi0("live")
    public static final StoriesGetPhotoUploadServerEffectDto LIVE;

    @pmi0("normal")
    public static final StoriesGetPhotoUploadServerEffectDto NORMAL;

    @pmi0("photo")
    public static final StoriesGetPhotoUploadServerEffectDto PHOTO;

    @pmi0("ping_pong")
    public static final StoriesGetPhotoUploadServerEffectDto PING_PONG;

    @pmi0("reverse")
    public static final StoriesGetPhotoUploadServerEffectDto REVERSE;

    @pmi0("story_video")
    public static final StoriesGetPhotoUploadServerEffectDto STORY_VIDEO;

    @pmi0("usual")
    public static final StoriesGetPhotoUploadServerEffectDto USUAL;

    @pmi0("video")
    public static final StoriesGetPhotoUploadServerEffectDto VIDEO;
    private final String value;

    /* compiled from: StoriesGetPhotoUploadServerEffectDto.kt */
    public static final class a implements Parcelable.Creator<StoriesGetPhotoUploadServerEffectDto> {
        @Override // android.os.Parcelable.Creator
        public final StoriesGetPhotoUploadServerEffectDto createFromParcel(Parcel parcel) {
            return StoriesGetPhotoUploadServerEffectDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final StoriesGetPhotoUploadServerEffectDto[] newArray(int i) {
            return new StoriesGetPhotoUploadServerEffectDto[i];
        }
    }

    static {
        StoriesGetPhotoUploadServerEffectDto storiesGetPhotoUploadServerEffectDto = new StoriesGetPhotoUploadServerEffectDto("LIVE", 0, "live");
        LIVE = storiesGetPhotoUploadServerEffectDto;
        StoriesGetPhotoUploadServerEffectDto storiesGetPhotoUploadServerEffectDto2 = new StoriesGetPhotoUploadServerEffectDto("NORMAL", 1, "normal");
        NORMAL = storiesGetPhotoUploadServerEffectDto2;
        StoriesGetPhotoUploadServerEffectDto storiesGetPhotoUploadServerEffectDto3 = new StoriesGetPhotoUploadServerEffectDto("PHOTO", 2, "photo");
        PHOTO = storiesGetPhotoUploadServerEffectDto3;
        StoriesGetPhotoUploadServerEffectDto storiesGetPhotoUploadServerEffectDto4 = new StoriesGetPhotoUploadServerEffectDto("PING_PONG", 3, "ping_pong");
        PING_PONG = storiesGetPhotoUploadServerEffectDto4;
        StoriesGetPhotoUploadServerEffectDto storiesGetPhotoUploadServerEffectDto5 = new StoriesGetPhotoUploadServerEffectDto("REVERSE", 4, "reverse");
        REVERSE = storiesGetPhotoUploadServerEffectDto5;
        StoriesGetPhotoUploadServerEffectDto storiesGetPhotoUploadServerEffectDto6 = new StoriesGetPhotoUploadServerEffectDto("STORY_VIDEO", 5, "story_video");
        STORY_VIDEO = storiesGetPhotoUploadServerEffectDto6;
        StoriesGetPhotoUploadServerEffectDto storiesGetPhotoUploadServerEffectDto7 = new StoriesGetPhotoUploadServerEffectDto("USUAL", 6, "usual");
        USUAL = storiesGetPhotoUploadServerEffectDto7;
        StoriesGetPhotoUploadServerEffectDto storiesGetPhotoUploadServerEffectDto8 = new StoriesGetPhotoUploadServerEffectDto(SignalingProtocol.MEDIA_OPTION_VIDEO, 7, "video");
        VIDEO = storiesGetPhotoUploadServerEffectDto8;
        StoriesGetPhotoUploadServerEffectDto[] storiesGetPhotoUploadServerEffectDtoArr = {storiesGetPhotoUploadServerEffectDto, storiesGetPhotoUploadServerEffectDto2, storiesGetPhotoUploadServerEffectDto3, storiesGetPhotoUploadServerEffectDto4, storiesGetPhotoUploadServerEffectDto5, storiesGetPhotoUploadServerEffectDto6, storiesGetPhotoUploadServerEffectDto7, storiesGetPhotoUploadServerEffectDto8};
        $VALUES = storiesGetPhotoUploadServerEffectDtoArr;
        $ENTRIES = new asp(storiesGetPhotoUploadServerEffectDtoArr);
        CREATOR = new a();
    }

    private StoriesGetPhotoUploadServerEffectDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static zrp<StoriesGetPhotoUploadServerEffectDto> i() {
        return $ENTRIES;
    }

    public static StoriesGetPhotoUploadServerEffectDto valueOf(String str) {
        return (StoriesGetPhotoUploadServerEffectDto) Enum.valueOf(StoriesGetPhotoUploadServerEffectDto.class, str);
    }

    public static StoriesGetPhotoUploadServerEffectDto[] values() {
        return (StoriesGetPhotoUploadServerEffectDto[]) $VALUES.clone();
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
