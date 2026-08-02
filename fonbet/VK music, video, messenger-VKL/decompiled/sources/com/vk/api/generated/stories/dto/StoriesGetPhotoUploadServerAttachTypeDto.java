package com.vk.api.generated.stories.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: StoriesGetPhotoUploadServerAttachTypeDto.kt */
/* loaded from: classes15.dex */
public final class StoriesGetPhotoUploadServerAttachTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ StoriesGetPhotoUploadServerAttachTypeDto[] $VALUES;

    @pmi0("audio")
    public static final StoriesGetPhotoUploadServerAttachTypeDto AUDIO;
    public static final Parcelable.Creator<StoriesGetPhotoUploadServerAttachTypeDto> CREATOR;

    @pmi0("photo")
    public static final StoriesGetPhotoUploadServerAttachTypeDto PHOTO;

    @pmi0("video")
    public static final StoriesGetPhotoUploadServerAttachTypeDto VIDEO;
    private final String value;

    /* compiled from: StoriesGetPhotoUploadServerAttachTypeDto.kt */
    public static final class a implements Parcelable.Creator<StoriesGetPhotoUploadServerAttachTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final StoriesGetPhotoUploadServerAttachTypeDto createFromParcel(Parcel parcel) {
            return StoriesGetPhotoUploadServerAttachTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final StoriesGetPhotoUploadServerAttachTypeDto[] newArray(int i) {
            return new StoriesGetPhotoUploadServerAttachTypeDto[i];
        }
    }

    static {
        StoriesGetPhotoUploadServerAttachTypeDto storiesGetPhotoUploadServerAttachTypeDto = new StoriesGetPhotoUploadServerAttachTypeDto(SignalingProtocol.MEDIA_OPTION_AUDIO, 0, "audio");
        AUDIO = storiesGetPhotoUploadServerAttachTypeDto;
        StoriesGetPhotoUploadServerAttachTypeDto storiesGetPhotoUploadServerAttachTypeDto2 = new StoriesGetPhotoUploadServerAttachTypeDto("PHOTO", 1, "photo");
        PHOTO = storiesGetPhotoUploadServerAttachTypeDto2;
        StoriesGetPhotoUploadServerAttachTypeDto storiesGetPhotoUploadServerAttachTypeDto3 = new StoriesGetPhotoUploadServerAttachTypeDto(SignalingProtocol.MEDIA_OPTION_VIDEO, 2, "video");
        VIDEO = storiesGetPhotoUploadServerAttachTypeDto3;
        StoriesGetPhotoUploadServerAttachTypeDto[] storiesGetPhotoUploadServerAttachTypeDtoArr = {storiesGetPhotoUploadServerAttachTypeDto, storiesGetPhotoUploadServerAttachTypeDto2, storiesGetPhotoUploadServerAttachTypeDto3};
        $VALUES = storiesGetPhotoUploadServerAttachTypeDtoArr;
        $ENTRIES = new asp(storiesGetPhotoUploadServerAttachTypeDtoArr);
        CREATOR = new a();
    }

    private StoriesGetPhotoUploadServerAttachTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static StoriesGetPhotoUploadServerAttachTypeDto valueOf(String str) {
        return (StoriesGetPhotoUploadServerAttachTypeDto) Enum.valueOf(StoriesGetPhotoUploadServerAttachTypeDto.class, str);
    }

    public static StoriesGetPhotoUploadServerAttachTypeDto[] values() {
        return (StoriesGetPhotoUploadServerAttachTypeDto[]) $VALUES.clone();
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
