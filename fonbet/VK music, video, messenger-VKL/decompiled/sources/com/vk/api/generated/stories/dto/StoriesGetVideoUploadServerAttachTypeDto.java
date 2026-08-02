package com.vk.api.generated.stories.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: StoriesGetVideoUploadServerAttachTypeDto.kt */
/* loaded from: classes15.dex */
public final class StoriesGetVideoUploadServerAttachTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ StoriesGetVideoUploadServerAttachTypeDto[] $VALUES;

    @pmi0("audio")
    public static final StoriesGetVideoUploadServerAttachTypeDto AUDIO;
    public static final Parcelable.Creator<StoriesGetVideoUploadServerAttachTypeDto> CREATOR;

    @pmi0("photo")
    public static final StoriesGetVideoUploadServerAttachTypeDto PHOTO;

    @pmi0("video")
    public static final StoriesGetVideoUploadServerAttachTypeDto VIDEO;
    private final String value;

    /* compiled from: StoriesGetVideoUploadServerAttachTypeDto.kt */
    public static final class a implements Parcelable.Creator<StoriesGetVideoUploadServerAttachTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final StoriesGetVideoUploadServerAttachTypeDto createFromParcel(Parcel parcel) {
            return StoriesGetVideoUploadServerAttachTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final StoriesGetVideoUploadServerAttachTypeDto[] newArray(int i) {
            return new StoriesGetVideoUploadServerAttachTypeDto[i];
        }
    }

    static {
        StoriesGetVideoUploadServerAttachTypeDto storiesGetVideoUploadServerAttachTypeDto = new StoriesGetVideoUploadServerAttachTypeDto(SignalingProtocol.MEDIA_OPTION_AUDIO, 0, "audio");
        AUDIO = storiesGetVideoUploadServerAttachTypeDto;
        StoriesGetVideoUploadServerAttachTypeDto storiesGetVideoUploadServerAttachTypeDto2 = new StoriesGetVideoUploadServerAttachTypeDto("PHOTO", 1, "photo");
        PHOTO = storiesGetVideoUploadServerAttachTypeDto2;
        StoriesGetVideoUploadServerAttachTypeDto storiesGetVideoUploadServerAttachTypeDto3 = new StoriesGetVideoUploadServerAttachTypeDto(SignalingProtocol.MEDIA_OPTION_VIDEO, 2, "video");
        VIDEO = storiesGetVideoUploadServerAttachTypeDto3;
        StoriesGetVideoUploadServerAttachTypeDto[] storiesGetVideoUploadServerAttachTypeDtoArr = {storiesGetVideoUploadServerAttachTypeDto, storiesGetVideoUploadServerAttachTypeDto2, storiesGetVideoUploadServerAttachTypeDto3};
        $VALUES = storiesGetVideoUploadServerAttachTypeDtoArr;
        $ENTRIES = new asp(storiesGetVideoUploadServerAttachTypeDtoArr);
        CREATOR = new a();
    }

    private StoriesGetVideoUploadServerAttachTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static StoriesGetVideoUploadServerAttachTypeDto valueOf(String str) {
        return (StoriesGetVideoUploadServerAttachTypeDto) Enum.valueOf(StoriesGetVideoUploadServerAttachTypeDto.class, str);
    }

    public static StoriesGetVideoUploadServerAttachTypeDto[] values() {
        return (StoriesGetVideoUploadServerAttachTypeDto[]) $VALUES.clone();
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
