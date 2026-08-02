package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VideoGetCommentsExtendedSortDto.kt */
/* loaded from: classes15.dex */
public final class VideoGetCommentsExtendedSortDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VideoGetCommentsExtendedSortDto[] $VALUES;
    public static final Parcelable.Creator<VideoGetCommentsExtendedSortDto> CREATOR;

    @pmi0("interest")
    public static final VideoGetCommentsExtendedSortDto MOST_INTERESTING_COMMENTS_FIRST;

    @pmi0(CampaignEx.JSON_KEY_DESC)
    public static final VideoGetCommentsExtendedSortDto NEWEST_COMMENT_FIRST;

    @pmi0("asc")
    public static final VideoGetCommentsExtendedSortDto OLDEST_COMMENT_FIRST;
    private final String value;

    /* compiled from: VideoGetCommentsExtendedSortDto.kt */
    public static final class a implements Parcelable.Creator<VideoGetCommentsExtendedSortDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoGetCommentsExtendedSortDto createFromParcel(Parcel parcel) {
            return VideoGetCommentsExtendedSortDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VideoGetCommentsExtendedSortDto[] newArray(int i) {
            return new VideoGetCommentsExtendedSortDto[i];
        }
    }

    static {
        VideoGetCommentsExtendedSortDto videoGetCommentsExtendedSortDto = new VideoGetCommentsExtendedSortDto("OLDEST_COMMENT_FIRST", 0, "asc");
        OLDEST_COMMENT_FIRST = videoGetCommentsExtendedSortDto;
        VideoGetCommentsExtendedSortDto videoGetCommentsExtendedSortDto2 = new VideoGetCommentsExtendedSortDto("NEWEST_COMMENT_FIRST", 1, CampaignEx.JSON_KEY_DESC);
        NEWEST_COMMENT_FIRST = videoGetCommentsExtendedSortDto2;
        VideoGetCommentsExtendedSortDto videoGetCommentsExtendedSortDto3 = new VideoGetCommentsExtendedSortDto("MOST_INTERESTING_COMMENTS_FIRST", 2, "interest");
        MOST_INTERESTING_COMMENTS_FIRST = videoGetCommentsExtendedSortDto3;
        VideoGetCommentsExtendedSortDto[] videoGetCommentsExtendedSortDtoArr = {videoGetCommentsExtendedSortDto, videoGetCommentsExtendedSortDto2, videoGetCommentsExtendedSortDto3};
        $VALUES = videoGetCommentsExtendedSortDtoArr;
        $ENTRIES = new asp(videoGetCommentsExtendedSortDtoArr);
        CREATOR = new a();
    }

    private VideoGetCommentsExtendedSortDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static VideoGetCommentsExtendedSortDto valueOf(String str) {
        return (VideoGetCommentsExtendedSortDto) Enum.valueOf(VideoGetCommentsExtendedSortDto.class, str);
    }

    public static VideoGetCommentsExtendedSortDto[] values() {
        return (VideoGetCommentsExtendedSortDto[]) $VALUES.clone();
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
