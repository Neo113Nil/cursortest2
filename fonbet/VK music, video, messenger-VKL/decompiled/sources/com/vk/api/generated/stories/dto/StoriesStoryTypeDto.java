package com.vk.api.generated.stories.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: StoriesStoryTypeDto.kt */
/* loaded from: classes15.dex */
public final class StoriesStoryTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ StoriesStoryTypeDto[] $VALUES;
    public static final Parcelable.Creator<StoriesStoryTypeDto> CREATOR;

    @pmi0("live_active")
    public static final StoriesStoryTypeDto LIVE_ACTIVE;

    @pmi0("live_finished")
    public static final StoriesStoryTypeDto LIVE_FINISHED;

    @pmi0("photo")
    public static final StoriesStoryTypeDto PHOTO;

    @pmi0("video")
    public static final StoriesStoryTypeDto VIDEO;
    private final String value;

    /* compiled from: StoriesStoryTypeDto.kt */
    public static final class a implements Parcelable.Creator<StoriesStoryTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final StoriesStoryTypeDto createFromParcel(Parcel parcel) {
            return StoriesStoryTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final StoriesStoryTypeDto[] newArray(int i) {
            return new StoriesStoryTypeDto[i];
        }
    }

    static {
        StoriesStoryTypeDto storiesStoryTypeDto = new StoriesStoryTypeDto("PHOTO", 0, "photo");
        PHOTO = storiesStoryTypeDto;
        StoriesStoryTypeDto storiesStoryTypeDto2 = new StoriesStoryTypeDto(SignalingProtocol.MEDIA_OPTION_VIDEO, 1, "video");
        VIDEO = storiesStoryTypeDto2;
        StoriesStoryTypeDto storiesStoryTypeDto3 = new StoriesStoryTypeDto("LIVE_ACTIVE", 2, "live_active");
        LIVE_ACTIVE = storiesStoryTypeDto3;
        StoriesStoryTypeDto storiesStoryTypeDto4 = new StoriesStoryTypeDto("LIVE_FINISHED", 3, "live_finished");
        LIVE_FINISHED = storiesStoryTypeDto4;
        StoriesStoryTypeDto[] storiesStoryTypeDtoArr = {storiesStoryTypeDto, storiesStoryTypeDto2, storiesStoryTypeDto3, storiesStoryTypeDto4};
        $VALUES = storiesStoryTypeDtoArr;
        $ENTRIES = new asp(storiesStoryTypeDtoArr);
        CREATOR = new a();
    }

    private StoriesStoryTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static StoriesStoryTypeDto valueOf(String str) {
        return (StoriesStoryTypeDto) Enum.valueOf(StoriesStoryTypeDto.class, str);
    }

    public static StoriesStoryTypeDto[] values() {
        return (StoriesStoryTypeDto[]) $VALUES.clone();
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
