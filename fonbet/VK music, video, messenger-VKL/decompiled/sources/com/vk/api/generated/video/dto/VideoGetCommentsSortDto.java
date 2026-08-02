package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VideoGetCommentsSortDto.kt */
/* loaded from: classes15.dex */
public final class VideoGetCommentsSortDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VideoGetCommentsSortDto[] $VALUES;
    public static final Parcelable.Creator<VideoGetCommentsSortDto> CREATOR;

    @pmi0("interest")
    public static final VideoGetCommentsSortDto MOST_INTERESTING_COMMENTS_FIRST;

    @pmi0(CampaignEx.JSON_KEY_DESC)
    public static final VideoGetCommentsSortDto NEWEST_COMMENT_FIRST;

    @pmi0("asc")
    public static final VideoGetCommentsSortDto OLDEST_COMMENT_FIRST;
    private final String value;

    /* compiled from: VideoGetCommentsSortDto.kt */
    public static final class a implements Parcelable.Creator<VideoGetCommentsSortDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoGetCommentsSortDto createFromParcel(Parcel parcel) {
            return VideoGetCommentsSortDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VideoGetCommentsSortDto[] newArray(int i) {
            return new VideoGetCommentsSortDto[i];
        }
    }

    static {
        VideoGetCommentsSortDto videoGetCommentsSortDto = new VideoGetCommentsSortDto("OLDEST_COMMENT_FIRST", 0, "asc");
        OLDEST_COMMENT_FIRST = videoGetCommentsSortDto;
        VideoGetCommentsSortDto videoGetCommentsSortDto2 = new VideoGetCommentsSortDto("NEWEST_COMMENT_FIRST", 1, CampaignEx.JSON_KEY_DESC);
        NEWEST_COMMENT_FIRST = videoGetCommentsSortDto2;
        VideoGetCommentsSortDto videoGetCommentsSortDto3 = new VideoGetCommentsSortDto("MOST_INTERESTING_COMMENTS_FIRST", 2, "interest");
        MOST_INTERESTING_COMMENTS_FIRST = videoGetCommentsSortDto3;
        VideoGetCommentsSortDto[] videoGetCommentsSortDtoArr = {videoGetCommentsSortDto, videoGetCommentsSortDto2, videoGetCommentsSortDto3};
        $VALUES = videoGetCommentsSortDtoArr;
        $ENTRIES = new asp(videoGetCommentsSortDtoArr);
        CREATOR = new a();
    }

    private VideoGetCommentsSortDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static VideoGetCommentsSortDto valueOf(String str) {
        return (VideoGetCommentsSortDto) Enum.valueOf(VideoGetCommentsSortDto.class, str);
    }

    public static VideoGetCommentsSortDto[] values() {
        return (VideoGetCommentsSortDto[]) $VALUES.clone();
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
