package com.vk.api.generated.stories.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: StoriesGetVideoUploadServerEffectDto.kt */
/* loaded from: classes15.dex */
public final class StoriesGetVideoUploadServerEffectDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ StoriesGetVideoUploadServerEffectDto[] $VALUES;
    public static final Parcelable.Creator<StoriesGetVideoUploadServerEffectDto> CREATOR;

    @pmi0("live")
    public static final StoriesGetVideoUploadServerEffectDto LIVE;

    @pmi0("normal")
    public static final StoriesGetVideoUploadServerEffectDto NORMAL;

    @pmi0("photo")
    public static final StoriesGetVideoUploadServerEffectDto PHOTO;

    @pmi0("ping_pong")
    public static final StoriesGetVideoUploadServerEffectDto PING_PONG;

    @pmi0("reverse")
    public static final StoriesGetVideoUploadServerEffectDto REVERSE;

    @pmi0("story_video")
    public static final StoriesGetVideoUploadServerEffectDto STORY_VIDEO;

    @pmi0("usual")
    public static final StoriesGetVideoUploadServerEffectDto USUAL;

    @pmi0("video")
    public static final StoriesGetVideoUploadServerEffectDto VIDEO;
    private final String value;

    /* compiled from: StoriesGetVideoUploadServerEffectDto.kt */
    public static final class a implements Parcelable.Creator<StoriesGetVideoUploadServerEffectDto> {
        @Override // android.os.Parcelable.Creator
        public final StoriesGetVideoUploadServerEffectDto createFromParcel(Parcel parcel) {
            return StoriesGetVideoUploadServerEffectDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final StoriesGetVideoUploadServerEffectDto[] newArray(int i) {
            return new StoriesGetVideoUploadServerEffectDto[i];
        }
    }

    static {
        StoriesGetVideoUploadServerEffectDto storiesGetVideoUploadServerEffectDto = new StoriesGetVideoUploadServerEffectDto("LIVE", 0, "live");
        LIVE = storiesGetVideoUploadServerEffectDto;
        StoriesGetVideoUploadServerEffectDto storiesGetVideoUploadServerEffectDto2 = new StoriesGetVideoUploadServerEffectDto("NORMAL", 1, "normal");
        NORMAL = storiesGetVideoUploadServerEffectDto2;
        StoriesGetVideoUploadServerEffectDto storiesGetVideoUploadServerEffectDto3 = new StoriesGetVideoUploadServerEffectDto("PHOTO", 2, "photo");
        PHOTO = storiesGetVideoUploadServerEffectDto3;
        StoriesGetVideoUploadServerEffectDto storiesGetVideoUploadServerEffectDto4 = new StoriesGetVideoUploadServerEffectDto("PING_PONG", 3, "ping_pong");
        PING_PONG = storiesGetVideoUploadServerEffectDto4;
        StoriesGetVideoUploadServerEffectDto storiesGetVideoUploadServerEffectDto5 = new StoriesGetVideoUploadServerEffectDto("REVERSE", 4, "reverse");
        REVERSE = storiesGetVideoUploadServerEffectDto5;
        StoriesGetVideoUploadServerEffectDto storiesGetVideoUploadServerEffectDto6 = new StoriesGetVideoUploadServerEffectDto("STORY_VIDEO", 5, "story_video");
        STORY_VIDEO = storiesGetVideoUploadServerEffectDto6;
        StoriesGetVideoUploadServerEffectDto storiesGetVideoUploadServerEffectDto7 = new StoriesGetVideoUploadServerEffectDto("USUAL", 6, "usual");
        USUAL = storiesGetVideoUploadServerEffectDto7;
        StoriesGetVideoUploadServerEffectDto storiesGetVideoUploadServerEffectDto8 = new StoriesGetVideoUploadServerEffectDto(SignalingProtocol.MEDIA_OPTION_VIDEO, 7, "video");
        VIDEO = storiesGetVideoUploadServerEffectDto8;
        StoriesGetVideoUploadServerEffectDto[] storiesGetVideoUploadServerEffectDtoArr = {storiesGetVideoUploadServerEffectDto, storiesGetVideoUploadServerEffectDto2, storiesGetVideoUploadServerEffectDto3, storiesGetVideoUploadServerEffectDto4, storiesGetVideoUploadServerEffectDto5, storiesGetVideoUploadServerEffectDto6, storiesGetVideoUploadServerEffectDto7, storiesGetVideoUploadServerEffectDto8};
        $VALUES = storiesGetVideoUploadServerEffectDtoArr;
        $ENTRIES = new asp(storiesGetVideoUploadServerEffectDtoArr);
        CREATOR = new a();
    }

    private StoriesGetVideoUploadServerEffectDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static zrp<StoriesGetVideoUploadServerEffectDto> i() {
        return $ENTRIES;
    }

    public static StoriesGetVideoUploadServerEffectDto valueOf(String str) {
        return (StoriesGetVideoUploadServerEffectDto) Enum.valueOf(StoriesGetVideoUploadServerEffectDto.class, str);
    }

    public static StoriesGetVideoUploadServerEffectDto[] values() {
        return (StoriesGetVideoUploadServerEffectDto[]) $VALUES.clone();
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
