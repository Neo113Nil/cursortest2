package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VideoStartStreamingSendToDto.kt */
/* loaded from: classes15.dex */
public final class VideoStartStreamingSendToDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VideoStartStreamingSendToDto[] $VALUES;

    @pmi0("chat")
    public static final VideoStartStreamingSendToDto CHAT;
    public static final Parcelable.Creator<VideoStartStreamingSendToDto> CREATOR;

    @pmi0("playlist")
    public static final VideoStartStreamingSendToDto PLAYLIST;

    @pmi0("self")
    public static final VideoStartStreamingSendToDto SELF;
    private final String value;

    /* compiled from: VideoStartStreamingSendToDto.kt */
    public static final class a implements Parcelable.Creator<VideoStartStreamingSendToDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoStartStreamingSendToDto createFromParcel(Parcel parcel) {
            return VideoStartStreamingSendToDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VideoStartStreamingSendToDto[] newArray(int i) {
            return new VideoStartStreamingSendToDto[i];
        }
    }

    static {
        VideoStartStreamingSendToDto videoStartStreamingSendToDto = new VideoStartStreamingSendToDto("CHAT", 0, "chat");
        CHAT = videoStartStreamingSendToDto;
        VideoStartStreamingSendToDto videoStartStreamingSendToDto2 = new VideoStartStreamingSendToDto("PLAYLIST", 1, "playlist");
        PLAYLIST = videoStartStreamingSendToDto2;
        VideoStartStreamingSendToDto videoStartStreamingSendToDto3 = new VideoStartStreamingSendToDto("SELF", 2, "self");
        SELF = videoStartStreamingSendToDto3;
        VideoStartStreamingSendToDto[] videoStartStreamingSendToDtoArr = {videoStartStreamingSendToDto, videoStartStreamingSendToDto2, videoStartStreamingSendToDto3};
        $VALUES = videoStartStreamingSendToDtoArr;
        $ENTRIES = new asp(videoStartStreamingSendToDtoArr);
        CREATOR = new a();
    }

    private VideoStartStreamingSendToDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static VideoStartStreamingSendToDto valueOf(String str) {
        return (VideoStartStreamingSendToDto) Enum.valueOf(VideoStartStreamingSendToDto.class, str);
    }

    public static VideoStartStreamingSendToDto[] values() {
        return (VideoStartStreamingSendToDto[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
