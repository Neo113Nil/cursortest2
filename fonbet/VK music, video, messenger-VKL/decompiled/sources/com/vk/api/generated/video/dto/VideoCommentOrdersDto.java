package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.pmi0;

/* compiled from: VideoCommentOrdersDto.kt */
/* loaded from: classes15.dex */
public final class VideoCommentOrdersDto implements Parcelable {
    public static final Parcelable.Creator<VideoCommentOrdersDto> CREATOR = new a();

    @pmi0("current_order")
    private final VideoCommentSortingDto currentOrder;

    @pmi0("items")
    private final List<VideoCommentOrderDto> items;

    /* compiled from: VideoCommentOrdersDto.kt */
    public static final class a implements Parcelable.Creator<VideoCommentOrdersDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoCommentOrdersDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(VideoCommentOrderDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new VideoCommentOrdersDto(arrayList, VideoCommentSortingDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final VideoCommentOrdersDto[] newArray(int i) {
            return new VideoCommentOrdersDto[i];
        }
    }

    public VideoCommentOrdersDto(List<VideoCommentOrderDto> list, VideoCommentSortingDto videoCommentSortingDto) {
        this.items = list;
        this.currentOrder = videoCommentSortingDto;
    }

    public final VideoCommentSortingDto d() {
        return this.currentOrder;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<VideoCommentOrderDto> e() {
        return this.items;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoCommentOrdersDto)) {
            return false;
        }
        VideoCommentOrdersDto videoCommentOrdersDto = (VideoCommentOrdersDto) obj;
        return epx.f(this.items, videoCommentOrdersDto.items) && this.currentOrder == videoCommentOrdersDto.currentOrder;
    }

    public final int hashCode() {
        return this.currentOrder.hashCode() + (this.items.hashCode() * 31);
    }

    public final String toString() {
        return "VideoCommentOrdersDto(items=" + this.items + ", currentOrder=" + this.currentOrder + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            ((VideoCommentOrderDto) a2.next()).writeToParcel(parcel, i);
        }
        this.currentOrder.writeToParcel(parcel, i);
    }
}
