package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: VideoCommentOrderDto.kt */
/* loaded from: classes15.dex */
public final class VideoCommentOrderDto implements Parcelable {
    public static final Parcelable.Creator<VideoCommentOrderDto> CREATOR = new a();

    @pmi0("id")
    private final VideoCommentSortingDto id;

    @pmi0("name")
    private final String name;

    /* compiled from: VideoCommentOrderDto.kt */
    public static final class a implements Parcelable.Creator<VideoCommentOrderDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoCommentOrderDto createFromParcel(Parcel parcel) {
            return new VideoCommentOrderDto(VideoCommentSortingDto.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VideoCommentOrderDto[] newArray(int i) {
            return new VideoCommentOrderDto[i];
        }
    }

    public VideoCommentOrderDto(VideoCommentSortingDto videoCommentSortingDto, String str) {
        this.id = videoCommentSortingDto;
        this.name = str;
    }

    public final VideoCommentSortingDto d() {
        return this.id;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.name;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoCommentOrderDto)) {
            return false;
        }
        VideoCommentOrderDto videoCommentOrderDto = (VideoCommentOrderDto) obj;
        return this.id == videoCommentOrderDto.id && epx.f(this.name, videoCommentOrderDto.name);
    }

    public final int hashCode() {
        return this.name.hashCode() + (this.id.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoCommentOrderDto(id=");
        sb.append(this.id);
        sb.append(", name=");
        return ho8.a(sb, this.name, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.id.writeToParcel(parcel, i);
        parcel.writeString(this.name);
    }
}
