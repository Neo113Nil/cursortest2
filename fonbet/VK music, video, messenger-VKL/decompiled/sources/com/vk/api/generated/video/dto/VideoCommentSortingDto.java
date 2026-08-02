package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VideoCommentSortingDto.kt */
/* loaded from: classes15.dex */
public final class VideoCommentSortingDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VideoCommentSortingDto[] $VALUES;
    public static final Parcelable.Creator<VideoCommentSortingDto> CREATOR;

    @pmi0("interest")
    public static final VideoCommentSortingDto MOST_INTERESTING_COMMENTS_FIRST;

    @pmi0(CampaignEx.JSON_KEY_DESC)
    public static final VideoCommentSortingDto NEWEST_COMMENT_FIRST;

    @pmi0("asc")
    public static final VideoCommentSortingDto OLDEST_COMMENT_FIRST;
    private final String value;

    /* compiled from: VideoCommentSortingDto.kt */
    public static final class a implements Parcelable.Creator<VideoCommentSortingDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoCommentSortingDto createFromParcel(Parcel parcel) {
            return VideoCommentSortingDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VideoCommentSortingDto[] newArray(int i) {
            return new VideoCommentSortingDto[i];
        }
    }

    static {
        VideoCommentSortingDto videoCommentSortingDto = new VideoCommentSortingDto("OLDEST_COMMENT_FIRST", 0, "asc");
        OLDEST_COMMENT_FIRST = videoCommentSortingDto;
        VideoCommentSortingDto videoCommentSortingDto2 = new VideoCommentSortingDto("NEWEST_COMMENT_FIRST", 1, CampaignEx.JSON_KEY_DESC);
        NEWEST_COMMENT_FIRST = videoCommentSortingDto2;
        VideoCommentSortingDto videoCommentSortingDto3 = new VideoCommentSortingDto("MOST_INTERESTING_COMMENTS_FIRST", 2, "interest");
        MOST_INTERESTING_COMMENTS_FIRST = videoCommentSortingDto3;
        VideoCommentSortingDto[] videoCommentSortingDtoArr = {videoCommentSortingDto, videoCommentSortingDto2, videoCommentSortingDto3};
        $VALUES = videoCommentSortingDtoArr;
        $ENTRIES = new asp(videoCommentSortingDtoArr);
        CREATOR = new a();
    }

    private VideoCommentSortingDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static VideoCommentSortingDto valueOf(String str) {
        return (VideoCommentSortingDto) Enum.valueOf(VideoCommentSortingDto.class, str);
    }

    public static VideoCommentSortingDto[] values() {
        return (VideoCommentSortingDto[]) $VALUES.clone();
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
