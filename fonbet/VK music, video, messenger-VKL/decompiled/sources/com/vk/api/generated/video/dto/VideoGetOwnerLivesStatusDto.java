package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.X3;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VideoGetOwnerLivesStatusDto.kt */
/* loaded from: classes15.dex */
public final class VideoGetOwnerLivesStatusDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VideoGetOwnerLivesStatusDto[] $VALUES;

    @pmi0(SignalingProtocol.KEY_ACTIVE)
    public static final VideoGetOwnerLivesStatusDto ACTIVE;
    public static final Parcelable.Creator<VideoGetOwnerLivesStatusDto> CREATOR;

    @pmi0(X3.i.g0)
    public static final VideoGetOwnerLivesStatusDto ENDED;
    private final String value;

    /* compiled from: VideoGetOwnerLivesStatusDto.kt */
    public static final class a implements Parcelable.Creator<VideoGetOwnerLivesStatusDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoGetOwnerLivesStatusDto createFromParcel(Parcel parcel) {
            return VideoGetOwnerLivesStatusDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VideoGetOwnerLivesStatusDto[] newArray(int i) {
            return new VideoGetOwnerLivesStatusDto[i];
        }
    }

    static {
        VideoGetOwnerLivesStatusDto videoGetOwnerLivesStatusDto = new VideoGetOwnerLivesStatusDto(SignalingProtocol.STATE_ACTIVE, 0, SignalingProtocol.KEY_ACTIVE);
        ACTIVE = videoGetOwnerLivesStatusDto;
        VideoGetOwnerLivesStatusDto videoGetOwnerLivesStatusDto2 = new VideoGetOwnerLivesStatusDto(SignalingProtocol.STATE_ENDED, 1, X3.i.g0);
        ENDED = videoGetOwnerLivesStatusDto2;
        VideoGetOwnerLivesStatusDto[] videoGetOwnerLivesStatusDtoArr = {videoGetOwnerLivesStatusDto, videoGetOwnerLivesStatusDto2};
        $VALUES = videoGetOwnerLivesStatusDtoArr;
        $ENTRIES = new asp(videoGetOwnerLivesStatusDtoArr);
        CREATOR = new a();
    }

    private VideoGetOwnerLivesStatusDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static VideoGetOwnerLivesStatusDto valueOf(String str) {
        return (VideoGetOwnerLivesStatusDto) Enum.valueOf(VideoGetOwnerLivesStatusDto.class, str);
    }

    public static VideoGetOwnerLivesStatusDto[] values() {
        return (VideoGetOwnerLivesStatusDto[]) $VALUES.clone();
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
