package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;

/* compiled from: VideoGetModerationLogResponseDto.kt */
/* loaded from: classes15.dex */
public final class VideoGetModerationLogResponseDto implements Parcelable {
    public static final Parcelable.Creator<VideoGetModerationLogResponseDto> CREATOR = new a();

    @pmi0("category")
    private final VideoModerLogCategoryDto category;

    @pmi0("items")
    private final List<VideoModerLogItemDto> items;

    @pmi0("moder_links")
    private final VideoModerLogLinksDto moderLinks;

    /* compiled from: VideoGetModerationLogResponseDto.kt */
    public static final class a implements Parcelable.Creator<VideoGetModerationLogResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoGetModerationLogResponseDto createFromParcel(Parcel parcel) {
            VideoModerLogLinksDto createFromParcel = VideoModerLogLinksDto.CREATOR.createFromParcel(parcel);
            VideoModerLogCategoryDto createFromParcel2 = VideoModerLogCategoryDto.CREATOR.createFromParcel(parcel);
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(VideoModerLogItemDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new VideoGetModerationLogResponseDto(createFromParcel, createFromParcel2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final VideoGetModerationLogResponseDto[] newArray(int i) {
            return new VideoGetModerationLogResponseDto[i];
        }
    }

    public VideoGetModerationLogResponseDto(VideoModerLogLinksDto videoModerLogLinksDto, VideoModerLogCategoryDto videoModerLogCategoryDto, List<VideoModerLogItemDto> list) {
        this.moderLinks = videoModerLogLinksDto;
        this.category = videoModerLogCategoryDto;
        this.items = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoGetModerationLogResponseDto)) {
            return false;
        }
        VideoGetModerationLogResponseDto videoGetModerationLogResponseDto = (VideoGetModerationLogResponseDto) obj;
        return epx.f(this.moderLinks, videoGetModerationLogResponseDto.moderLinks) && epx.f(this.category, videoGetModerationLogResponseDto.category) && epx.f(this.items, videoGetModerationLogResponseDto.items);
    }

    public final int hashCode() {
        return this.items.hashCode() + ((this.category.hashCode() + (this.moderLinks.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoGetModerationLogResponseDto(moderLinks=");
        sb.append(this.moderLinks);
        sb.append(", category=");
        sb.append(this.category);
        sb.append(", items=");
        return ms9.a(')', sb, this.items);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.moderLinks.writeToParcel(parcel, i);
        this.category.writeToParcel(parcel, i);
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            ((VideoModerLogItemDto) a2.next()).writeToParcel(parcel, i);
        }
    }
}
