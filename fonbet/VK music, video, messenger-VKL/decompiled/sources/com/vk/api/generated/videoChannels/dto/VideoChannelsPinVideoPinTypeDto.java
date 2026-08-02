package com.vk.api.generated.videoChannels.dto;

import android.os.Parcel;
import android.os.Parcelable;
import io.jsonwebtoken.Claims;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VideoChannelsPinVideoPinTypeDto.kt */
/* loaded from: classes15.dex */
public final class VideoChannelsPinVideoPinTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VideoChannelsPinVideoPinTypeDto[] $VALUES;

    @pmi0("all")
    public static final VideoChannelsPinVideoPinTypeDto ALL;
    public static final Parcelable.Creator<VideoChannelsPinVideoPinTypeDto> CREATOR;

    @pmi0("non_sub")
    public static final VideoChannelsPinVideoPinTypeDto NON_SUB;

    @pmi0(Claims.SUBJECT)
    public static final VideoChannelsPinVideoPinTypeDto SUB;
    private final String value;

    /* compiled from: VideoChannelsPinVideoPinTypeDto.kt */
    public static final class a implements Parcelable.Creator<VideoChannelsPinVideoPinTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoChannelsPinVideoPinTypeDto createFromParcel(Parcel parcel) {
            return VideoChannelsPinVideoPinTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VideoChannelsPinVideoPinTypeDto[] newArray(int i) {
            return new VideoChannelsPinVideoPinTypeDto[i];
        }
    }

    static {
        VideoChannelsPinVideoPinTypeDto videoChannelsPinVideoPinTypeDto = new VideoChannelsPinVideoPinTypeDto("ALL", 0, "all");
        ALL = videoChannelsPinVideoPinTypeDto;
        VideoChannelsPinVideoPinTypeDto videoChannelsPinVideoPinTypeDto2 = new VideoChannelsPinVideoPinTypeDto("NON_SUB", 1, "non_sub");
        NON_SUB = videoChannelsPinVideoPinTypeDto2;
        VideoChannelsPinVideoPinTypeDto videoChannelsPinVideoPinTypeDto3 = new VideoChannelsPinVideoPinTypeDto("SUB", 2, Claims.SUBJECT);
        SUB = videoChannelsPinVideoPinTypeDto3;
        VideoChannelsPinVideoPinTypeDto[] videoChannelsPinVideoPinTypeDtoArr = {videoChannelsPinVideoPinTypeDto, videoChannelsPinVideoPinTypeDto2, videoChannelsPinVideoPinTypeDto3};
        $VALUES = videoChannelsPinVideoPinTypeDtoArr;
        $ENTRIES = new asp(videoChannelsPinVideoPinTypeDtoArr);
        CREATOR = new a();
    }

    private VideoChannelsPinVideoPinTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static VideoChannelsPinVideoPinTypeDto valueOf(String str) {
        return (VideoChannelsPinVideoPinTypeDto) Enum.valueOf(VideoChannelsPinVideoPinTypeDto.class, str);
    }

    public static VideoChannelsPinVideoPinTypeDto[] values() {
        return (VideoChannelsPinVideoPinTypeDto[]) $VALUES.clone();
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
