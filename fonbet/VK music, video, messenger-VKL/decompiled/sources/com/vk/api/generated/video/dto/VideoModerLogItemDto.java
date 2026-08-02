package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.hints.HintCategories;
import java.util.List;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.shy;
import xsna.urd0;
import xsna.zcl;

/* compiled from: VideoModerLogItemDto.kt */
/* loaded from: classes15.dex */
public final class VideoModerLogItemDto implements Parcelable {
    public static final Parcelable.Creator<VideoModerLogItemDto> CREATOR = new a();

    @pmi0(HintCategories.PARAM_NAME)
    private final List<String> categories;

    @pmi0("key")
    private final int key;

    @pmi0("marks")
    private final List<String> marks;

    @pmi0("moder")
    private final VideoModerLogItemModerDto moder;

    @pmi0("timestamp")
    private final int timestamp;

    @pmi0("title")
    private final String title;

    /* compiled from: VideoModerLogItemDto.kt */
    public static final class a implements Parcelable.Creator<VideoModerLogItemDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoModerLogItemDto createFromParcel(Parcel parcel) {
            return new VideoModerLogItemDto(parcel.readInt(), parcel.readInt(), VideoModerLogItemModerDto.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.createStringArrayList(), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final VideoModerLogItemDto[] newArray(int i) {
            return new VideoModerLogItemDto[i];
        }
    }

    public VideoModerLogItemDto(int i, int i2, VideoModerLogItemModerDto videoModerLogItemModerDto, String str, List<String> list, List<String> list2) {
        this.key = i;
        this.timestamp = i2;
        this.moder = videoModerLogItemModerDto;
        this.title = str;
        this.categories = list;
        this.marks = list2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoModerLogItemDto)) {
            return false;
        }
        VideoModerLogItemDto videoModerLogItemDto = (VideoModerLogItemDto) obj;
        return this.key == videoModerLogItemDto.key && this.timestamp == videoModerLogItemDto.timestamp && epx.f(this.moder, videoModerLogItemDto.moder) && epx.f(this.title, videoModerLogItemDto.title) && epx.f(this.categories, videoModerLogItemDto.categories) && epx.f(this.marks, videoModerLogItemDto.marks);
    }

    public final int hashCode() {
        int a2 = urd0.a((this.moder.hashCode() + shy.a(this.timestamp, Integer.hashCode(this.key) * 31, 31)) * 31, 31, this.title);
        List<String> list = this.categories;
        int hashCode = (a2 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.marks;
        return hashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoModerLogItemDto(key=");
        sb.append(this.key);
        sb.append(", timestamp=");
        sb.append(this.timestamp);
        sb.append(", moder=");
        sb.append(this.moder);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", categories=");
        sb.append(this.categories);
        sb.append(", marks=");
        return ms9.a(')', sb, this.marks);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.key);
        parcel.writeInt(this.timestamp);
        this.moder.writeToParcel(parcel, i);
        parcel.writeString(this.title);
        parcel.writeStringList(this.categories);
        parcel.writeStringList(this.marks);
    }

    public /* synthetic */ VideoModerLogItemDto(int i, int i2, VideoModerLogItemModerDto videoModerLogItemModerDto, String str, List list, List list2, int i3, zcl zclVar) {
        this(i, i2, videoModerLogItemModerDto, str, (i3 & 16) != 0 ? null : list, (i3 & 32) != 0 ? null : list2);
    }
}
